package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class colorcolorantes_trn_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV23Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
         AV19Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Usurcod", AV19Usurcod);
         AV20Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
         AV22Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Inc_obs", AV22Inc_obs);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_20_1UW33( A396EmprCod, AV23Pgmname, AV19Usurcod, AV20Station, AV22Inc_obs, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A486ForNumCol) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9")));
            AV9ColLin = (short)(GXutil.lval( httpContext.GetPar( "ColLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ColLin), 3, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9ColLin), "ZZ9")));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Color Colorantes ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public colorcolorantes_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public colorcolorantes_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorcolorantes_trn_impl.class ));
   }

   public colorcolorantes_trn_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
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

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornumcol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavFornumcol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavFornumcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV8ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornumcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornumcol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColLin_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtColLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV16PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdUMe_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_490_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_490_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_490_Internalname, sImgUrl, imgprompt_490_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_490_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForCan_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCan_Enabled!=0) ? localUtil.format( A481ForCan, "ZZZZ9.99999") : localUtil.format( A481ForCan, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForCan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV23Pgmname), GXutil.rtrim( localUtil.format( AV23Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prdnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprdnum_Internalname, GXutil.rtrim( AV18ComboPrdNum), GXutil.rtrim( localUtil.format( AV18ComboPrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprdnum_Visible, edtavComboprdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "Attribute", "", "", "", "", edtForNumCol_Visible, edtForNumCol_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosKgmF_Internalname, GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosKgmF_Enabled!=0) ? localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999") : localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosKgmF_Jsonclick, 0, "Attribute", "", "", "", "", edtCosKgmF_Visible, edtCosKgmF_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111UW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV16PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z309ColLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z481ForCan = localUtil.ctond( httpContext.cgiGet( "Z481ForCan")) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O481ForCan = localUtil.ctond( httpContext.cgiGet( "O481ForCan")) ;
            O719PrdNum = httpContext.cgiGet( "O719PrdNum") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N719PrdNum = httpContext.cgiGet( "N719PrdNum") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV9ColLin = (short)(localUtil.ctol( httpContext.cgiGet( "vCOLLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_PrdNum = httpContext.cgiGet( "vINSERT_PRDNUM") ;
            AV14Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV19Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV20Station = httpContext.cgiGet( "vSTATION") ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            AV8ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtavFornumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ForNumCol), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9")));
            A309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A490ForPrdUMe = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            else
            {
               A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForCan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A481ForCan = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
            }
            else
            {
               A481ForCan = localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
            }
            AV23Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
            AV18ComboPrdNum = httpContext.cgiGet( edtavComboprdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ComboPrdNum", AV18ComboPrdNum);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A486ForNumCol = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            }
            else
            {
               A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A5166CosKgmF = localUtil.ctond( httpContext.cgiGet( edtCosKgmF_Internalname)) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ColorColorantes_TRN");
            A309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
            forbiddenHiddens.add("ColLin", localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV23Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV23Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A309ColLin != Z309ColLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\colorcolorantes_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               A309ColLin = (short)(GXutil.lval( httpContext.GetPar( "ColLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode33 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode33 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound33 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UW0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111UW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e121UW2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UW33( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1UW33( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_1UW0( )
   {
      beforeValidate1UW33( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UW33( ) ;
         }
         else
         {
            checkExtendedTable1UW33( ) ;
            closeExtendedTableCursors1UW33( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UW0( )
   {
   }

   public void e111UW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      colorcolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV19Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      colorcolorantes_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      colorcolorantes_trn_impl.this.AV21EmprNom = GXv_char3[0] ;
      colorcolorantes_trn_impl.this.AV19Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19Usurcod", AV19Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      AV18ComboPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ComboPrdNum", AV18ComboPrdNum);
      edtavComboprdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV23Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV24GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GXV1), 8, 0));
         while ( AV24GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV24GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdNum") == 0 )
            {
               AV13Insert_PrdNum = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_PrdNum", AV13Insert_PrdNum);
               if ( ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
               {
                  AV18ComboPrdNum = AV13Insert_PrdNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18ComboPrdNum", AV18ComboPrdNum);
                  Combo_prdnum_Selectedvalue_set = AV18ComboPrdNum ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                  Combo_prdnum_Enabled = false ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV14Insert_ForPrdUMe = (byte)(GXutil.lval( AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_ForPrdUMe", GXutil.str( AV14Insert_ForPrdUMe, 1, 0));
            }
            AV24GXV1 = (int)(AV24GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtForNumCol_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCosKgmF_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosKgmF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosKgmF_Visible), 5, 0), true);
   }

   public void e121UW2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.colorcolorantes_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV16PrdNum_Data ;
      GXv_char4[0] = AV17ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.formulaciontinte.colorcolorantes_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV7EmprCod, AV8ForNumCol, AV9ColLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      colorcolorantes_trn_impl.this.AV17ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV16PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_prdnum_Selectedvalue_set = AV17ComboSelectedValue ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      AV18ComboPrdNum = AV17ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ComboPrdNum", AV18ComboPrdNum);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prdnum_Enabled = false ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      }
   }

   public void zm1UW33( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z481ForCan = T01UW3_A481ForCan[0] ;
            Z719PrdNum = T01UW3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01UW3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z481ForCan = A481ForCan ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z309ColLin = A309ColLin ;
         Z481ForCan = A481ForCan ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z486ForNumCol = A486ForNumCol ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z407EmprNom = A407EmprNom ;
         Z5166CosKgmF = A5166CosKgmF ;
         Z718PrdNom = A718PrdNom ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), true);
      AV23Pgmname = "FormulacionTinte.ColorColorantes_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
      imgprompt_490_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDUME"+"'), id:'"+"FORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDDSC"+"'), id:'"+"FORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8ForNumCol) )
      {
         A486ForNumCol = AV8ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      if ( ! (0==AV8ForNumCol) )
      {
         edtForNumCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      }
      else
      {
         edtForNumCol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8ForNumCol) )
      {
         edtForNumCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9ColLin) )
      {
         A309ColLin = AV9ColLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_ForPrdUMe) )
      {
         edtForPrdUMe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
      else
      {
         edtForPrdUMe_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_PrdNum)==0) )
      {
         A719PrdNum = AV13Insert_PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = AV18ComboPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01UW4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01UW4_A407EmprNom[0] ;
         n407EmprNom = T01UW4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
         /* Using cursor T01UW9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A5166CosKgmF = T01UW9_A5166CosKgmF[0] ;
            n5166CosKgmF = T01UW9_n5166CosKgmF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         pr_default.close(6);
         /* Using cursor T01UW5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UW5_A718PrdNom[0] ;
         A4338PrdUMeFo = T01UW5_A4338PrdUMeFo[0] ;
         pr_default.close(3);
      }
   }

   public void load1UW33( )
   {
      /* Using cursor T01UW11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A407EmprNom = T01UW11_A407EmprNom[0] ;
         n407EmprNom = T01UW11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01UW11_A718PrdNom[0] ;
         A488ForPrdDsc = T01UW11_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UW11_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A481ForCan = T01UW11_A481ForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
         A4338PrdUMeFo = T01UW11_A4338PrdUMeFo[0] ;
         A719PrdNum = T01UW11_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01UW11_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A5166CosKgmF = T01UW11_A5166CosKgmF[0] ;
         n5166CosKgmF = T01UW11_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         zm1UW33( -21) ;
      }
      pr_default.close(7);
      onLoadActions1UW33( ) ;
   }

   public void onLoadActions1UW33( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV14Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         if ( isIns( )  )
         {
            A490ForPrdUMe = A4338PrdUMeFo ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
      }
   }

   public void checkExtendedTable1UW33( )
   {
      nIsDirty_33 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UW4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01UW4_A407EmprNom[0] ;
      n407EmprNom = T01UW4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01UW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UW5_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UW5_A4338PrdUMeFo[0] ;
      pr_default.close(3);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_ForPrdUMe) )
      {
         nIsDirty_33 = (short)(1) ;
         A490ForPrdUMe = AV14Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         if ( isIns( )  )
         {
            nIsDirty_33 = (short)(1) ;
            A490ForPrdUMe = A4338PrdUMeFo ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
      }
      /* Using cursor T01UW7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UW7_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UW7_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(5);
      /* Using cursor T01UW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T01UW9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A5166CosKgmF = T01UW9_A5166CosKgmF[0] ;
         n5166CosKgmF = T01UW9_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         nIsDirty_33 = (short)(1) ;
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      pr_default.close(6);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1UW33( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod )
   {
      /* Using cursor T01UW12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01UW12_A407EmprNom[0] ;
      n407EmprNom = T01UW12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_23( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01UW13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UW13_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UW13_A4338PrdUMeFo[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_25( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01UW14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UW14_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UW14_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_24( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01UW15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_26( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01UW17 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A5166CosKgmF = T01UW17_A5166CosKgmF[0] ;
         n5166CosKgmF = T01UW17_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1UW33( )
   {
      /* Using cursor T01UW18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UW33( 21) ;
         RcdFound33 = (short)(1) ;
         A309ColLin = T01UW3_A309ColLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
         A481ForCan = T01UW3_A481ForCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
         A396EmprCod = T01UW3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01UW3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A486ForNumCol = T01UW3_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A490ForPrdUMe = T01UW3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         O481ForCan = A481ForCan ;
         httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
         O719PrdNum = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z309ColLin = A309ColLin ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UW33( ) ;
         if ( AnyError == 1 )
         {
            RcdFound33 = (short)(0) ;
            initializeNonKey1UW33( ) ;
         }
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey1UW33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UW33( ) ;
      if ( RcdFound33 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound33 = (short)(0) ;
      /* Using cursor T01UW19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol), Integer.valueOf(A486ForNumCol), A396EmprCod, Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW19_A486ForNumCol[0] < A486ForNumCol ) || ( T01UW19_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW19_A309ColLin[0] < A309ColLin ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW19_A486ForNumCol[0] > A486ForNumCol ) || ( T01UW19_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UW19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW19_A309ColLin[0] > A309ColLin ) ) )
         {
            A396EmprCod = T01UW19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T01UW19_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A309ColLin = T01UW19_A309ColLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound33 = (short)(0) ;
      /* Using cursor T01UW20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol), Integer.valueOf(A486ForNumCol), A396EmprCod, Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW20_A486ForNumCol[0] > A486ForNumCol ) || ( T01UW20_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW20_A309ColLin[0] > A309ColLin ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW20_A486ForNumCol[0] < A486ForNumCol ) || ( T01UW20_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UW20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UW20_A309ColLin[0] < A309ColLin ) ) )
         {
            A396EmprCod = T01UW20_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T01UW20_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A309ColLin = T01UW20_A309ColLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UW33( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UW33( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound33 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A309ColLin != Z309ColLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A486ForNumCol = Z486ForNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               A309ColLin = Z309ColLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UW33( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A309ColLin != Z309ColLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UW33( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UW33( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A309ColLin != Z309ColLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = Z486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A309ColLin = Z309ColLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UW33( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z481ForCan, T01UW2_A481ForCan[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01UW2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01UW2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z481ForCan, T01UW2_A481ForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorcolorantes_trn:[seudo value changed for attri]"+"ForCan");
               GXutil.writeLogRaw("Old: ",Z481ForCan);
               GXutil.writeLogRaw("Current: ",T01UW2_A481ForCan[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01UW2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorcolorantes_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01UW2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01UW2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorcolorantes_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01UW2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UW33( )
   {
      beforeValidate1UW33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UW33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UW33( 0) ;
         checkOptimisticConcurrency1UW33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UW33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UW33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UW21 */
                  pr_default.execute(16, new Object[] {Short.valueOf(A309ColLin), A481ForCan, A396EmprCod, A719PrdNum, Integer.valueOf(A486ForNumCol), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1UW0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1UW33( ) ;
         }
         endLevel1UW33( ) ;
      }
      closeExtendedTableCursors1UW33( ) ;
   }

   public void update1UW33( )
   {
      beforeValidate1UW33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UW33( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UW33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UW33( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UW33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UW22 */
                  pr_default.execute(17, new Object[] {A481ForCan, A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UW33( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( ( GXutil.strcmp(O719PrdNum, A719PrdNum) != 0 ) || ( DecimalUtil.compareTo(O481ForCan, A481ForCan) != 0 ) ) && true /* After */ && true /* Level */ )
                     {
                        AV22Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modifica Producto ", ""), "") + O719PrdNum + httpContext.getMessage( httpContext.getMessage( " Old Cantidad= ", ""), "") + GXutil.str( O481ForCan, 11, 5) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A481ForCan, 11, 5) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV22Inc_obs", AV22Inc_obs);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV19Usurcod, AV20Station, AV22Inc_obs, A486ForNumCol, (byte)(0), "") ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1UW33( ) ;
      }
      closeExtendedTableCursors1UW33( ) ;
   }

   public void deferredUpdate1UW33( )
   {
   }

   public void delete( )
   {
      beforeValidate1UW33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UW33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UW33( ) ;
         afterConfirm1UW33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UW33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UW23 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
                     {
                        if ( AnyError == 0 )
                        {
                           httpContext.nUserReturn = (byte)(1) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UW33( ) ;
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UW33( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UW24 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T01UW24_A407EmprNom[0] ;
         n407EmprNom = T01UW24_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(19);
         /* Using cursor T01UW26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            A5166CosKgmF = T01UW26_A5166CosKgmF[0] ;
            n5166CosKgmF = T01UW26_n5166CosKgmF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         pr_default.close(20);
         /* Using cursor T01UW27 */
         pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UW27_A718PrdNom[0] ;
         A4338PrdUMeFo = T01UW27_A4338PrdUMeFo[0] ;
         pr_default.close(21);
         /* Using cursor T01UW28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01UW28_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UW28_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(22);
      }
   }

   public void endLevel1UW33( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UW33( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorcolorantes_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorcolorantes_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UW33( )
   {
      /* Scan By routine */
      /* Using cursor T01UW29 */
      pr_default.execute(23);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A396EmprCod = T01UW29_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T01UW29_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A309ColLin = T01UW29_A309ColLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UW33( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A396EmprCod = T01UW29_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T01UW29_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A309ColLin = T01UW29_A309ColLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
      }
   }

   public void scanEnd1UW33( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1UW33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UW33( )
   {
      /* Before Insert Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A481ForCan)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate1UW33( )
   {
      /* Before Update Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A481ForCan)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDelete1UW33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UW33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UW33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UW33( )
   {
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      edtColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCan_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCosKgmF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosKgmF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosKgmF_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UW33( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9")));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UW0( )
   {
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
      MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.colorcolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9ColLin,3,0))}, new String[] {"Gx_mode","EmprCod","ForNumCol","ColLin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8ForNumCol), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorColorantes_TRN");
      forbiddenHiddens.add("ColLin", localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV23Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorcolorantes_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z309ColLin", GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z481ForCan", GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O481ForCan", GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O719PrdNum", GXutil.rtrim( O719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N719PrdNum", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV16PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV16PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV11TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV11TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLLIN", GXutil.ltrim( localUtil.ntoc( AV9ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9ColLin), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRDNUM", GXutil.rtrim( AV13Insert_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV14Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV22Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV19Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV20Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
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
      return formatLink("app.formulaciontinte.colorcolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9ColLin,3,0))}, new String[] {"Gx_mode","EmprCod","ForNumCol","ColLin"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ColorColorantes_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Color Colorantes ", "") ;
   }

   public void initializeNonKey1UW33( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      AV22Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Inc_obs", AV22Inc_obs);
      A5166CosKgmF = DecimalUtil.ZERO ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A481ForCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      O481ForCan = A481ForCan ;
      httpContext.ajax_rsp_assign_attri("", false, "A481ForCan", GXutil.ltrimstr( A481ForCan, 11, 5));
      O719PrdNum = A719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      Z481ForCan = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1UW33( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      A309ColLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A309ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A309ColLin), 3, 0));
      initializeNonKey1UW33( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610530", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/colorcolorantes_trn.js", "?20268211610530", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFornumcol_Internalname = "vFORNUMCOL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtColLin_Internalname = "COLLIN" ;
      lblTextblockprdnum_Internalname = "TEXTBLOCKPRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtForCan_Internalname = "FORCAN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprdnum_Internalname = "vCOMBOPRDNUM" ;
      divSectionattribute_prdnum_Internalname = "SECTIONATTRIBUTE_PRDNUM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCosKgmF_Internalname = "COSKGMF" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_490_Internalname = "PROMPT_490" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Color Colorantes ", "") );
      edtCosKgmF_Jsonclick = "" ;
      edtCosKgmF_Enabled = 0 ;
      edtCosKgmF_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 1 ;
      edtForNumCol_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavComboprdnum_Jsonclick = "" ;
      edtavComboprdnum_Enabled = 0 ;
      edtavComboprdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtForCan_Jsonclick = "" ;
      edtForCan_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      imgprompt_490_Visible = 1 ;
      imgprompt_490_Link = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      edtColLin_Jsonclick = "" ;
      edtColLin_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = "" ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtavFornumcol_Jsonclick = "" ;
      edtavFornumcol_Enabled = 0 ;
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
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void xc_20_1UW33( String A396EmprCod ,
                            String AV23Pgmname ,
                            String AV19Usurcod ,
                            String AV20Station ,
                            String AV22Inc_obs ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV19Usurcod, AV20Station, AV22Inc_obs, A486ForNumCol, (byte)(0), "") ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01UW24 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01UW24_A407EmprNom[0] ;
      n407EmprNom = T01UW24_n407EmprNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Fornumcol( )
   {
      n5166CosKgmF = false ;
      /* Using cursor T01UW30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(24);
      /* Using cursor T01UW26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A5166CosKgmF = T01UW26_A5166CosKgmF[0] ;
         n5166CosKgmF = T01UW26_n5166CosKgmF[0] ;
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01UW27 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01UW27_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UW27_A4338PrdUMeFo[0] ;
      pr_default.close(21);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV14Insert_ForPrdUMe ;
      }
      else
      {
         if ( isIns( )  )
         {
            A490ForPrdUMe = A4338PrdUMeFo ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01UW28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A488ForPrdDsc = T01UW28_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UW28_n488ForPrdDsc[0] ;
      pr_default.close(22);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV9ColLin',fld:'vCOLLIN',pic:'ZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ColLin',fld:'vCOLLIN',pic:'ZZ9',hsh:true},{av:'AV8ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A309ColLin',fld:'COLLIN',pic:'ZZ9'},{av:'AV23Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UW2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALIDV_FORNUMCOL","{handler:'validv_Fornumcol',iparms:[]");
      setEventMetadata("VALIDV_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALID_COLLIN","{handler:'valid_Collin',iparms:[]");
      setEventMetadata("VALID_COLLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV14Insert_ForPrdUMe',fld:'vINSERT_FORPRDUME',pic:'9'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_FORCAN","{handler:'valid_Forcan',iparms:[]");
      setEventMetadata("VALID_FORCAN",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRDNUM","{handler:'validv_Comboprdnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRDNUM",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A5166CosKgmF',fld:'COSKGMF',pic:'ZZZZZZ9.99999'}]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[{av:'A5166CosKgmF',fld:'COSKGMF',pic:'ZZZZZZ9.99999'}]}");
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
      pr_default.close(19);
      pr_default.close(21);
      pr_default.close(24);
      pr_default.close(22);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z481ForCan = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O481ForCan = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      N719PrdNum = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV23Pgmname = "" ;
      AV19Usurcod = "" ;
      AV20Station = "" ;
      AV22Inc_obs = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockprdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV16PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      imgprompt_490_gximage = "" ;
      sImgUrl = "" ;
      A488ForPrdDsc = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV18ComboPrdNum = "" ;
      A407EmprNom = "" ;
      A5166CosKgmF = DecimalUtil.ZERO ;
      AV13Insert_PrdNum = "" ;
      A718PrdNom = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode33 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV17ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z5166CosKgmF = DecimalUtil.ZERO ;
      Z718PrdNom = "" ;
      Z488ForPrdDsc = "" ;
      T01UW4_A407EmprNom = new String[] {""} ;
      T01UW4_n407EmprNom = new boolean[] {false} ;
      T01UW9_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW9_n5166CosKgmF = new boolean[] {false} ;
      T01UW5_A718PrdNom = new String[] {""} ;
      T01UW5_A4338PrdUMeFo = new byte[1] ;
      T01UW11_A309ColLin = new short[1] ;
      T01UW11_A407EmprNom = new String[] {""} ;
      T01UW11_n407EmprNom = new boolean[] {false} ;
      T01UW11_A718PrdNom = new String[] {""} ;
      T01UW11_A488ForPrdDsc = new String[] {""} ;
      T01UW11_n488ForPrdDsc = new boolean[] {false} ;
      T01UW11_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW11_A4338PrdUMeFo = new byte[1] ;
      T01UW11_A396EmprCod = new String[] {""} ;
      T01UW11_A719PrdNum = new String[] {""} ;
      T01UW11_A486ForNumCol = new int[1] ;
      T01UW11_A490ForPrdUMe = new byte[1] ;
      T01UW11_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW11_n5166CosKgmF = new boolean[] {false} ;
      T01UW7_A488ForPrdDsc = new String[] {""} ;
      T01UW7_n488ForPrdDsc = new boolean[] {false} ;
      T01UW6_A396EmprCod = new String[] {""} ;
      T01UW12_A407EmprNom = new String[] {""} ;
      T01UW12_n407EmprNom = new boolean[] {false} ;
      T01UW13_A718PrdNom = new String[] {""} ;
      T01UW13_A4338PrdUMeFo = new byte[1] ;
      T01UW14_A488ForPrdDsc = new String[] {""} ;
      T01UW14_n488ForPrdDsc = new boolean[] {false} ;
      T01UW15_A396EmprCod = new String[] {""} ;
      T01UW17_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW17_n5166CosKgmF = new boolean[] {false} ;
      T01UW18_A396EmprCod = new String[] {""} ;
      T01UW18_A486ForNumCol = new int[1] ;
      T01UW18_A309ColLin = new short[1] ;
      T01UW3_A309ColLin = new short[1] ;
      T01UW3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW3_A396EmprCod = new String[] {""} ;
      T01UW3_A719PrdNum = new String[] {""} ;
      T01UW3_A486ForNumCol = new int[1] ;
      T01UW3_A490ForPrdUMe = new byte[1] ;
      T01UW19_A396EmprCod = new String[] {""} ;
      T01UW19_A486ForNumCol = new int[1] ;
      T01UW19_A309ColLin = new short[1] ;
      T01UW20_A396EmprCod = new String[] {""} ;
      T01UW20_A486ForNumCol = new int[1] ;
      T01UW20_A309ColLin = new short[1] ;
      T01UW2_A309ColLin = new short[1] ;
      T01UW2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW2_A396EmprCod = new String[] {""} ;
      T01UW2_A719PrdNum = new String[] {""} ;
      T01UW2_A486ForNumCol = new int[1] ;
      T01UW2_A490ForPrdUMe = new byte[1] ;
      T01UW24_A407EmprNom = new String[] {""} ;
      T01UW24_n407EmprNom = new boolean[] {false} ;
      T01UW26_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UW26_n5166CosKgmF = new boolean[] {false} ;
      T01UW27_A718PrdNom = new String[] {""} ;
      T01UW27_A4338PrdUMeFo = new byte[1] ;
      T01UW28_A488ForPrdDsc = new String[] {""} ;
      T01UW28_n488ForPrdDsc = new boolean[] {false} ;
      T01UW29_A396EmprCod = new String[] {""} ;
      T01UW29_A486ForNumCol = new int[1] ;
      T01UW29_A309ColLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01UW30_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trn__default(),
         new Object[] {
             new Object[] {
            T01UW2_A309ColLin, T01UW2_A481ForCan, T01UW2_A396EmprCod, T01UW2_A719PrdNum, T01UW2_A486ForNumCol, T01UW2_A490ForPrdUMe
            }
            , new Object[] {
            T01UW3_A309ColLin, T01UW3_A481ForCan, T01UW3_A396EmprCod, T01UW3_A719PrdNum, T01UW3_A486ForNumCol, T01UW3_A490ForPrdUMe
            }
            , new Object[] {
            T01UW4_A407EmprNom, T01UW4_n407EmprNom
            }
            , new Object[] {
            T01UW5_A718PrdNom, T01UW5_A4338PrdUMeFo
            }
            , new Object[] {
            T01UW6_A396EmprCod
            }
            , new Object[] {
            T01UW7_A488ForPrdDsc, T01UW7_n488ForPrdDsc
            }
            , new Object[] {
            T01UW9_A5166CosKgmF, T01UW9_n5166CosKgmF
            }
            , new Object[] {
            T01UW11_A309ColLin, T01UW11_A407EmprNom, T01UW11_n407EmprNom, T01UW11_A718PrdNom, T01UW11_A488ForPrdDsc, T01UW11_n488ForPrdDsc, T01UW11_A481ForCan, T01UW11_A4338PrdUMeFo, T01UW11_A396EmprCod, T01UW11_A719PrdNum,
            T01UW11_A486ForNumCol, T01UW11_A490ForPrdUMe, T01UW11_A5166CosKgmF, T01UW11_n5166CosKgmF
            }
            , new Object[] {
            T01UW12_A407EmprNom, T01UW12_n407EmprNom
            }
            , new Object[] {
            T01UW13_A718PrdNom, T01UW13_A4338PrdUMeFo
            }
            , new Object[] {
            T01UW14_A488ForPrdDsc, T01UW14_n488ForPrdDsc
            }
            , new Object[] {
            T01UW15_A396EmprCod
            }
            , new Object[] {
            T01UW17_A5166CosKgmF, T01UW17_n5166CosKgmF
            }
            , new Object[] {
            T01UW18_A396EmprCod, T01UW18_A486ForNumCol, T01UW18_A309ColLin
            }
            , new Object[] {
            T01UW19_A396EmprCod, T01UW19_A486ForNumCol, T01UW19_A309ColLin
            }
            , new Object[] {
            T01UW20_A396EmprCod, T01UW20_A486ForNumCol, T01UW20_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UW24_A407EmprNom, T01UW24_n407EmprNom
            }
            , new Object[] {
            T01UW26_A5166CosKgmF, T01UW26_n5166CosKgmF
            }
            , new Object[] {
            T01UW27_A718PrdNom, T01UW27_A4338PrdUMeFo
            }
            , new Object[] {
            T01UW28_A488ForPrdDsc, T01UW28_n488ForPrdDsc
            }
            , new Object[] {
            T01UW29_A396EmprCod, T01UW29_A486ForNumCol, T01UW29_A309ColLin
            }
            , new Object[] {
            T01UW30_A396EmprCod
            }
         }
      );
      AV23Pgmname = "FormulacionTinte.ColorColorantes_TRN" ;
   }

   private byte Z490ForPrdUMe ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte AV14Insert_ForPrdUMe ;
   private byte A4338PrdUMeFo ;
   private byte Z4338PrdUMeFo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9ColLin ;
   private short Z309ColLin ;
   private short AV9ColLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A309ColLin ;
   private short RcdFound33 ;
   private short nIsDirty_33 ;
   private int wcpOAV8ForNumCol ;
   private int Z486ForNumCol ;
   private int A486ForNumCol ;
   private int AV8ForNumCol ;
   private int trnEnded ;
   private int edtavFornumcol_Enabled ;
   private int edtColLin_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int imgprompt_490_Visible ;
   private int edtForPrdDsc_Enabled ;
   private int edtForCan_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprdnum_Visible ;
   private int edtavComboprdnum_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtForNumCol_Visible ;
   private int edtForNumCol_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCosKgmF_Enabled ;
   private int edtCosKgmF_Visible ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV24GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z481ForCan ;
   private java.math.BigDecimal O481ForCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A5166CosKgmF ;
   private java.math.BigDecimal Z5166CosKgmF ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String N719PrdNum ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV23Pgmname ;
   private String AV19Usurcod ;
   private String AV20Station ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavFornumcol_Internalname ;
   private String edtavFornumcol_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtColLin_Internalname ;
   private String edtColLin_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String imgprompt_490_gximage ;
   private String sImgUrl ;
   private String imgprompt_490_Internalname ;
   private String imgprompt_490_Link ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtForCan_Internalname ;
   private String edtForCan_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prdnum_Internalname ;
   private String edtavComboprdnum_Internalname ;
   private String AV18ComboPrdNum ;
   private String edtavComboprdnum_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCosKgmF_Internalname ;
   private String edtCosKgmF_Jsonclick ;
   private String AV13Insert_PrdNum ;
   private String A718PrdNom ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode33 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z488ForPrdDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n488ForPrdDsc ;
   private boolean n407EmprNom ;
   private boolean n5166CosKgmF ;
   private boolean returnInSub ;
   private String AV22Inc_obs ;
   private String AV17ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UW4_A407EmprNom ;
   private boolean[] T01UW4_n407EmprNom ;
   private java.math.BigDecimal[] T01UW9_A5166CosKgmF ;
   private boolean[] T01UW9_n5166CosKgmF ;
   private String[] T01UW5_A718PrdNom ;
   private byte[] T01UW5_A4338PrdUMeFo ;
   private short[] T01UW11_A309ColLin ;
   private String[] T01UW11_A407EmprNom ;
   private boolean[] T01UW11_n407EmprNom ;
   private String[] T01UW11_A718PrdNom ;
   private String[] T01UW11_A488ForPrdDsc ;
   private boolean[] T01UW11_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01UW11_A481ForCan ;
   private byte[] T01UW11_A4338PrdUMeFo ;
   private String[] T01UW11_A396EmprCod ;
   private String[] T01UW11_A719PrdNum ;
   private int[] T01UW11_A486ForNumCol ;
   private byte[] T01UW11_A490ForPrdUMe ;
   private java.math.BigDecimal[] T01UW11_A5166CosKgmF ;
   private boolean[] T01UW11_n5166CosKgmF ;
   private String[] T01UW7_A488ForPrdDsc ;
   private boolean[] T01UW7_n488ForPrdDsc ;
   private String[] T01UW6_A396EmprCod ;
   private String[] T01UW12_A407EmprNom ;
   private boolean[] T01UW12_n407EmprNom ;
   private String[] T01UW13_A718PrdNom ;
   private byte[] T01UW13_A4338PrdUMeFo ;
   private String[] T01UW14_A488ForPrdDsc ;
   private boolean[] T01UW14_n488ForPrdDsc ;
   private String[] T01UW15_A396EmprCod ;
   private java.math.BigDecimal[] T01UW17_A5166CosKgmF ;
   private boolean[] T01UW17_n5166CosKgmF ;
   private String[] T01UW18_A396EmprCod ;
   private int[] T01UW18_A486ForNumCol ;
   private short[] T01UW18_A309ColLin ;
   private short[] T01UW3_A309ColLin ;
   private java.math.BigDecimal[] T01UW3_A481ForCan ;
   private String[] T01UW3_A396EmprCod ;
   private String[] T01UW3_A719PrdNum ;
   private int[] T01UW3_A486ForNumCol ;
   private byte[] T01UW3_A490ForPrdUMe ;
   private String[] T01UW19_A396EmprCod ;
   private int[] T01UW19_A486ForNumCol ;
   private short[] T01UW19_A309ColLin ;
   private String[] T01UW20_A396EmprCod ;
   private int[] T01UW20_A486ForNumCol ;
   private short[] T01UW20_A309ColLin ;
   private short[] T01UW2_A309ColLin ;
   private java.math.BigDecimal[] T01UW2_A481ForCan ;
   private String[] T01UW2_A396EmprCod ;
   private String[] T01UW2_A719PrdNum ;
   private int[] T01UW2_A486ForNumCol ;
   private byte[] T01UW2_A490ForPrdUMe ;
   private String[] T01UW24_A407EmprNom ;
   private boolean[] T01UW24_n407EmprNom ;
   private java.math.BigDecimal[] T01UW26_A5166CosKgmF ;
   private boolean[] T01UW26_n5166CosKgmF ;
   private String[] T01UW27_A718PrdNom ;
   private byte[] T01UW27_A4338PrdUMeFo ;
   private String[] T01UW28_A488ForPrdDsc ;
   private boolean[] T01UW28_n488ForPrdDsc ;
   private String[] T01UW29_A396EmprCod ;
   private int[] T01UW29_A486ForNumCol ;
   private short[] T01UW29_A309ColLin ;
   private String[] T01UW30_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
}

final  class colorcolorantes_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class colorcolorantes_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class colorcolorantes_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class colorcolorantes_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class colorcolorantes_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UW2", "SELECT ColLin, ForCan, EmprCod, PrdNum, ForNumCol, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?  FOR UPDATE OF ForCan, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW3", "SELECT ColLin, ForCan, EmprCod, PrdNum, ForNumCol, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW5", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW6", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW7", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW9", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW11", "SELECT /*+ FIRST_ROWS(100) */ TM1.ColLin, T2.EmprNom, T4.PrdNom, T5.ForPrdDsc, TM1.ForCan, T4.PrdUMeFo, TM1.EmprCod, TM1.PrdNum, TM1.ForNumCol, TM1.ForPrdUMe, COALESCE( T3.CosKgmF, 0) AS CosKgmF FROM ((((TXPLDFORM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(( CAST(T8.ContNum * CAST(TM1.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T7.PrdPreAct * CAST(T7.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, TM1.EmprCod, TM1.ForNumCol FROM ((TXPLDFORM TM1 INNER JOIN TXPPRODUC T7 ON T7.EmprCod = TM1.EmprCod AND T7.PrdNum = TM1.PrdNum) INNER JOIN TXPCDFORM T8 ON T8.EmprCod = TM1.EmprCod AND T8.ForNumCol = TM1.ForNumCol) GROUP BY TM1.EmprCod, TM1.ForNumCol ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForNumCol = TM1.ForNumCol) INNER JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.ForNumCol = ? and TM1.ColLin = ? ORDER BY TM1.EmprCod, TM1.ForNumCol, TM1.ColLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW13", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW14", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW15", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW17", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE ( EmprCod > ? or EmprCod = ? and ForNumCol > ? or ForNumCol = ? and EmprCod = ? and ColLin > ?) ORDER BY EmprCod, ForNumCol, ColLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UW20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE ( EmprCod < ? or EmprCod = ? and ForNumCol < ? or ForNumCol = ? and EmprCod = ? and ColLin < ?) ORDER BY EmprCod DESC, ForNumCol DESC, ColLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UW21", "INSERT INTO TXPLDFORM(ColLin, ForCan, EmprCod, PrdNum, ForNumCol, ForPrdUMe, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', ' ')", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T01UW22", "UPDATE TXPLDFORM SET ForCan=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T01UW23", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new ForEachCursor("T01UW24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW26", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW27", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW28", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ForNumCol, ColLin FROM TXPLDFORM ORDER BY EmprCod, ForNumCol, ColLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UW30", "SELECT EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 17 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

