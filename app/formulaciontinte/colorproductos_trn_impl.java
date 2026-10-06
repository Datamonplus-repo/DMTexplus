package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class colorproductos_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV29Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV7Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
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
         xc_21_1UZ82( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV29Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV7Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
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
         xc_22_1UZ82( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV29Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
         AV8Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
         AV9Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
         AV7Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
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
         xc_23_1UZ82( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
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
         gxload_28( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
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
         gxload_27( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A486ForNumCol) ;
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
            AV12EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            AV18ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForNumCol), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
            AV19PrdLin = (short)(GXutil.lval( httpContext.GetPar( "PrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19PrdLin), 3, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19PrdLin), "ZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Color Productos", ""), (short)(0)) ;
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

   public colorproductos_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public colorproductos_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductos_trn_impl.class ));
   }

   public colorproductos_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno F.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdLin_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV26PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdCan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdCan_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdCan_Internalname, GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdCan_Enabled!=0) ? localUtil.format( A487ForPrdCan, "ZZZZ9.99999") : localUtil.format( A487ForPrdCan, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdCan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdCan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdUMe_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_490_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_490_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_490_Internalname, sImgUrl, imgprompt_490_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_490_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Desc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdNor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdNor_Internalname, httpContext.getMessage( "Orden (#)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdNor_Internalname, GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdNor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdNor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdNor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_396_489_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_396_489_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_396_489_Internalname, sImgUrl, imgprompt_396_489_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_396_489_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprdnum_Internalname, GXutil.rtrim( AV28ComboPrdNum), GXutil.rtrim( localUtil.format( AV28ComboPrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprdnum_Visible, edtavComboprdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUMeFo_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdUMeFo_Visible, edtPrdUMeFo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductos_TRN.htm");
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
      e111UZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV26PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z715PrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z487ForPrdCan = localUtil.ctond( httpContext.cgiGet( "Z487ForPrdCan")) ;
            Z489ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( "Z489ForPrdNor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O487ForPrdCan = localUtil.ctond( httpContext.cgiGet( "O487ForPrdCan")) ;
            O719PrdNum = httpContext.cgiGet( "O719PrdNum") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N719PrdNum = httpContext.cgiGet( "N719PrdNum") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV18ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "vFORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "vPRDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Insert_PrdNum = httpContext.cgiGet( "vINSERT_PRDNUM") ;
            AV24Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            AV7Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV8Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV9Station = httpContext.cgiGet( "vSTATION") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A741PrdUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "PRDULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13758PrdlinMax = (short)(localUtil.ctol( httpContext.cgiGet( "PRDLINMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13758PrdlinMax = false ;
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
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDCAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdCan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A487ForPrdCan = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
            }
            else
            {
               A487ForPrdCan = localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDNOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdNor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A489ForPrdNor = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A489ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A489ForPrdNor), 4, 0));
            }
            else
            {
               A489ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A489ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A489ForPrdNor), 4, 0));
            }
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            AV28ComboPrdNum = httpContext.cgiGet( edtavComboprdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ComboPrdNum", AV28ComboPrdNum);
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductos_TRN");
            A715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
            forbiddenHiddens.add("PrdLin", localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV29Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A715PrdLin != Z715PrdLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\colorproductos_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A715PrdLin = (short)(GXutil.lval( httpContext.GetPar( "PrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
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
                  sMode82 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode82 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound82 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UZ0( ) ;
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
                        e111UZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UZ2 ();
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
         e121UZ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UZ82( ) ;
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
         disableAttributes1UZ82( ) ;
      }
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

   public void confirm_1UZ0( )
   {
      beforeValidate1UZ82( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UZ82( ) ;
         }
         else
         {
            checkExtendedTable1UZ82( ) ;
            closeExtendedTableCursors1UZ82( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UZ0( )
   {
   }

   public void e111UZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      colorproductos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV30Emprnom ;
      GXv_char4[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      colorproductos_trn_impl.this.AV12EmprCod = GXv_char2[0] ;
      colorproductos_trn_impl.this.AV30Emprnom = GXv_char3[0] ;
      colorproductos_trn_impl.this.AV8Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Emprnom", AV30Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Usurcod", AV8Usurcod);
      GXv_SdtWWPContext5[0] = AV20WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV20WWPContext = GXv_SdtWWPContext5[0] ;
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      AV28ComboPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboPrdNum", AV28ComboPrdNum);
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
      AV21TrnContext.fromxml(AV22WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV21TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV29Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV31GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GXV1), 8, 0));
         while ( AV31GXV1 <= AV21TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV25TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV21TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV31GXV1));
            if ( GXutil.strcmp(AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdNum") == 0 )
            {
               AV23Insert_PrdNum = AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Insert_PrdNum", AV23Insert_PrdNum);
               if ( ! (GXutil.strcmp("", AV23Insert_PrdNum)==0) )
               {
                  AV28ComboPrdNum = AV23Insert_PrdNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ComboPrdNum", AV28ComboPrdNum);
                  Combo_prdnum_Selectedvalue_set = AV28ComboPrdNum ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                  Combo_prdnum_Enabled = false ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV24Insert_ForPrdUMe = (byte)(GXutil.lval( AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_ForPrdUMe", GXutil.str( AV24Insert_ForPrdUMe, 1, 0));
            }
            AV31GXV1 = (int)(AV31GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GXV1), 8, 0));
         }
      }
      edtPrdUMeFo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121UZ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV26PrdNum_Data ;
      GXv_char4[0] = AV27ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.formulaciontinte.colorproductos_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV12EmprCod, AV18ForNumCol, AV19PrdLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      colorproductos_trn_impl.this.AV27ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV26PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_prdnum_Selectedvalue_set = AV27ComboSelectedValue ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      AV28ComboPrdNum = AV27ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboPrdNum", AV28ComboPrdNum);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prdnum_Enabled = false ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      }
   }

   public void zm1UZ82( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z487ForPrdCan = T01UZ3_A487ForPrdCan[0] ;
            Z489ForPrdNor = T01UZ3_A489ForPrdNor[0] ;
            Z719PrdNum = T01UZ3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01UZ3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z487ForPrdCan = A487ForPrdCan ;
            Z489ForPrdNor = A489ForPrdNor ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z715PrdLin = A715PrdLin ;
         Z487ForPrdCan = A487ForPrdCan ;
         Z489ForPrdNor = A489ForPrdNor ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z486ForNumCol = A486ForNumCol ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z407EmprNom = A407EmprNom ;
         Z741PrdUltLin = A741PrdUltLin ;
         Z13758PrdlinMax = A13758PrdlinMax ;
         Z718PrdNom = A718PrdNom ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), true);
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      AV29Pgmname = "FormulacionTinte.ColorProductos_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      imgprompt_490_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDUME"+"'), id:'"+"FORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDDSC"+"'), id:'"+"FORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_396_489_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDNOR"+"'), id:'"+"FORPRDNOR"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), true);
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         A396EmprCod = AV12EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV18ForNumCol) )
      {
         A486ForNumCol = AV18ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      if ( ! (0==AV19PrdLin) )
      {
         A715PrdLin = AV19PrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV23Insert_PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV23Insert_PrdNum)==0) )
      {
         A719PrdNum = AV23Insert_PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = AV28ComboPrdNum ;
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
         /* Using cursor T01UZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01UZ4_A407EmprNom[0] ;
         n407EmprNom = T01UZ4_n407EmprNom[0] ;
         pr_default.close(2);
         /* Using cursor T01UZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         A741PrdUltLin = T01UZ6_A741PrdUltLin[0] ;
         pr_default.close(4);
         /* Using cursor T01UZ9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A13758PrdlinMax = T01UZ9_A13758PrdlinMax[0] ;
            n13758PrdlinMax = T01UZ9_n13758PrdlinMax[0] ;
         }
         else
         {
            A13758PrdlinMax = (short)(0) ;
            n13758PrdlinMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
         }
         pr_default.close(6);
         /* Using cursor T01UZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UZ5_A718PrdNom[0] ;
         A4338PrdUMeFo = T01UZ5_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         pr_default.close(3);
      }
   }

   public void load1UZ82( )
   {
      /* Using cursor T01UZ11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A741PrdUltLin = T01UZ11_A741PrdUltLin[0] ;
         A407EmprNom = T01UZ11_A407EmprNom[0] ;
         n407EmprNom = T01UZ11_n407EmprNom[0] ;
         A718PrdNom = T01UZ11_A718PrdNom[0] ;
         A487ForPrdCan = T01UZ11_A487ForPrdCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
         A488ForPrdDsc = T01UZ11_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UZ11_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A489ForPrdNor = T01UZ11_A489ForPrdNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A489ForPrdNor), 4, 0));
         A4338PrdUMeFo = T01UZ11_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A719PrdNum = T01UZ11_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01UZ11_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A13758PrdlinMax = T01UZ11_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UZ11_n13758PrdlinMax[0] ;
         zm1UZ82( -24) ;
      }
      pr_default.close(7);
      onLoadActions1UZ82( ) ;
   }

   public void onLoadActions1UZ82( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV24Insert_ForPrdUMe ;
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

   public void checkExtendedTable1UZ82( )
   {
      nIsDirty_82 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01UZ4_A407EmprNom[0] ;
      n407EmprNom = T01UZ4_n407EmprNom[0] ;
      pr_default.close(2);
      /* Using cursor T01UZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UZ5_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UZ5_A4338PrdUMeFo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      pr_default.close(3);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
      {
         nIsDirty_82 = (short)(1) ;
         A490ForPrdUMe = AV24Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         if ( isIns( )  )
         {
            nIsDirty_82 = (short)(1) ;
            A490ForPrdUMe = A4338PrdUMeFo ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
      }
      /* Using cursor T01UZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UZ7_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UZ7_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(5);
      /* Using cursor T01UZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A741PrdUltLin = T01UZ6_A741PrdUltLin[0] ;
      pr_default.close(4);
      /* Using cursor T01UZ9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13758PrdlinMax = T01UZ9_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UZ9_n13758PrdlinMax[0] ;
      }
      else
      {
         nIsDirty_82 = (short)(1) ;
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      pr_default.close(6);
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A487ForPrdCan)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, "FORPRDCAN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdCan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1UZ82( )
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

   public void gxload_25( String A396EmprCod )
   {
      /* Using cursor T01UZ12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01UZ12_A407EmprNom[0] ;
      n407EmprNom = T01UZ12_n407EmprNom[0] ;
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

   public void gxload_26( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01UZ13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UZ13_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UZ13_A4338PrdUMeFo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
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

   public void gxload_28( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01UZ14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UZ14_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UZ14_n488ForPrdDsc[0] ;
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

   public void gxload_27( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01UZ15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A741PrdUltLin = T01UZ15_A741PrdUltLin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A741PrdUltLin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_29( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01UZ17 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A13758PrdlinMax = T01UZ17_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UZ17_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1UZ82( )
   {
      /* Using cursor T01UZ18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound82 = (short)(1) ;
      }
      else
      {
         RcdFound82 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UZ82( 24) ;
         RcdFound82 = (short)(1) ;
         A715PrdLin = T01UZ3_A715PrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
         A487ForPrdCan = T01UZ3_A487ForPrdCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
         A489ForPrdNor = T01UZ3_A489ForPrdNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A489ForPrdNor), 4, 0));
         A396EmprCod = T01UZ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01UZ3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A486ForNumCol = T01UZ3_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A490ForPrdUMe = T01UZ3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         O487ForPrdCan = A487ForPrdCan ;
         httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
         O719PrdNum = A719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z715PrdLin = A715PrdLin ;
         sMode82 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UZ82( ) ;
         if ( AnyError == 1 )
         {
            RcdFound82 = (short)(0) ;
            initializeNonKey1UZ82( ) ;
         }
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound82 = (short)(0) ;
         initializeNonKey1UZ82( ) ;
         sMode82 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UZ82( ) ;
      if ( RcdFound82 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound82 = (short)(0) ;
      /* Using cursor T01UZ19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol), Integer.valueOf(A486ForNumCol), A396EmprCod, Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ19_A486ForNumCol[0] < A486ForNumCol ) || ( T01UZ19_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ19_A715PrdLin[0] < A715PrdLin ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ19_A486ForNumCol[0] > A486ForNumCol ) || ( T01UZ19_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UZ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ19_A715PrdLin[0] > A715PrdLin ) ) )
         {
            A396EmprCod = T01UZ19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T01UZ19_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A715PrdLin = T01UZ19_A715PrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
            RcdFound82 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound82 = (short)(0) ;
      /* Using cursor T01UZ20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol), Integer.valueOf(A486ForNumCol), A396EmprCod, Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ20_A486ForNumCol[0] > A486ForNumCol ) || ( T01UZ20_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ20_A715PrdLin[0] > A715PrdLin ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ20_A486ForNumCol[0] < A486ForNumCol ) || ( T01UZ20_A486ForNumCol[0] == A486ForNumCol ) && ( GXutil.strcmp(T01UZ20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UZ20_A715PrdLin[0] < A715PrdLin ) ) )
         {
            A396EmprCod = T01UZ20_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A486ForNumCol = T01UZ20_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A715PrdLin = T01UZ20_A715PrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
            RcdFound82 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UZ82( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UZ82( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound82 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A715PrdLin != Z715PrdLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A486ForNumCol = Z486ForNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               A715PrdLin = Z715PrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
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
               update1UZ82( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A715PrdLin != Z715PrdLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UZ82( ) ;
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
                  insert1UZ82( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) || ( A715PrdLin != Z715PrdLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = Z486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A715PrdLin = Z715PrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
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

   public void checkOptimisticConcurrency1UZ82( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRFOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z487ForPrdCan, T01UZ2_A487ForPrdCan[0]) != 0 ) || ( Z489ForPrdNor != T01UZ2_A489ForPrdNor[0] ) || ( GXutil.strcmp(Z719PrdNum, T01UZ2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01UZ2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z487ForPrdCan, T01UZ2_A487ForPrdCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorproductos_trn:[seudo value changed for attri]"+"ForPrdCan");
               GXutil.writeLogRaw("Old: ",Z487ForPrdCan);
               GXutil.writeLogRaw("Current: ",T01UZ2_A487ForPrdCan[0]);
            }
            if ( Z489ForPrdNor != T01UZ2_A489ForPrdNor[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorproductos_trn:[seudo value changed for attri]"+"ForPrdNor");
               GXutil.writeLogRaw("Old: ",Z489ForPrdNor);
               GXutil.writeLogRaw("Current: ",T01UZ2_A489ForPrdNor[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01UZ2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorproductos_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01UZ2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01UZ2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorproductos_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01UZ2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPRFOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UZ82( )
   {
      beforeValidate1UZ82( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UZ82( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UZ82( 0) ;
         checkOptimisticConcurrency1UZ82( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UZ82( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UZ82( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UZ21 */
                  pr_default.execute(16, new Object[] {Short.valueOf(A715PrdLin), A487ForPrdCan, Short.valueOf(A489ForPrdNor), A396EmprCod, A719PrdNum, Integer.valueOf(A486ForNumCol), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        AV7Texto_i = httpContext.getMessage( httpContext.getMessage( "Inserta Producto ", ""), "") + A719PrdNum + " " + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1UZ0( ) ;
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
            load1UZ82( ) ;
         }
         endLevel1UZ82( ) ;
      }
      closeExtendedTableCursors1UZ82( ) ;
   }

   public void update1UZ82( )
   {
      beforeValidate1UZ82( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UZ82( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UZ82( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UZ82( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UZ82( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UZ22 */
                  pr_default.execute(17, new Object[] {A487ForPrdCan, Short.valueOf(A489ForPrdNor), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRFOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UZ82( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( ( GXutil.strcmp(O719PrdNum, A719PrdNum) != 0 ) || ( DecimalUtil.compareTo(O487ForPrdCan, A487ForPrdCan) != 0 ) ) && true /* After */ && true /* Level */ )
                     {
                        AV7Texto_i = httpContext.getMessage( httpContext.getMessage( "Modifica Producto ", ""), "") + O719PrdNum + httpContext.getMessage( httpContext.getMessage( " Old Cantidad= ", ""), "") + GXutil.str( O487ForPrdCan, 11, 5) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
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
         endLevel1UZ82( ) ;
      }
      closeExtendedTableCursors1UZ82( ) ;
   }

   public void deferredUpdate1UZ82( )
   {
   }

   public void delete( )
   {
      beforeValidate1UZ82( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UZ82( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UZ82( ) ;
         afterConfirm1UZ82( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UZ82( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UZ23 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV7Texto_i = httpContext.getMessage( httpContext.getMessage( "Elimina Producto ", ""), "") + A719PrdNum + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
                  }
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
      sMode82 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UZ82( ) ;
      Gx_mode = sMode82 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UZ82( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UZ24 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T01UZ24_A407EmprNom[0] ;
         n407EmprNom = T01UZ24_n407EmprNom[0] ;
         pr_default.close(19);
         /* Using cursor T01UZ25 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         A741PrdUltLin = T01UZ25_A741PrdUltLin[0] ;
         pr_default.close(20);
         /* Using cursor T01UZ27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A13758PrdlinMax = T01UZ27_A13758PrdlinMax[0] ;
            n13758PrdlinMax = T01UZ27_n13758PrdlinMax[0] ;
         }
         else
         {
            A13758PrdlinMax = (short)(0) ;
            n13758PrdlinMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
         }
         pr_default.close(21);
         /* Using cursor T01UZ28 */
         pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UZ28_A718PrdNom[0] ;
         A4338PrdUMeFo = T01UZ28_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         pr_default.close(22);
         /* Using cursor T01UZ29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01UZ29_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UZ29_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(23);
      }
   }

   public void endLevel1UZ82( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UZ82( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorproductos_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorproductos_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UZ82( )
   {
      /* Scan By routine */
      /* Using cursor T01UZ30 */
      pr_default.execute(24);
      RcdFound82 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A396EmprCod = T01UZ30_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T01UZ30_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A715PrdLin = T01UZ30_A715PrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UZ82( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound82 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A396EmprCod = T01UZ30_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = T01UZ30_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A715PrdLin = T01UZ30_A715PrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
      }
   }

   public void scanEnd1UZ82( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1UZ82( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UZ82( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UZ82( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UZ82( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UZ82( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UZ82( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UZ82( )
   {
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtForPrdCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdCan_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtForPrdNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdNor_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
      edtPrdUMeFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UZ82( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.colorproductos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19PrdLin,3,0))}, new String[] {"Gx_mode","EmprCod","ForNumCol","PrdLin"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductos_TRN");
      forbiddenHiddens.add("PrdLin", localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV29Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorproductos_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z715PrdLin", GXutil.ltrim( localUtil.ntoc( Z715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z487ForPrdCan", GXutil.ltrim( localUtil.ntoc( Z487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z489ForPrdNor", GXutil.ltrim( localUtil.ntoc( Z489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O487ForPrdCan", GXutil.ltrim( localUtil.ntoc( O487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O719PrdNum", GXutil.rtrim( O719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N719PrdNum", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV26PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV26PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV18ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDLIN", GXutil.ltrim( localUtil.ntoc( AV19PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19PrdLin), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRDNUM", GXutil.rtrim( AV23Insert_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV24Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV7Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV9Station));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDULTLIN", GXutil.ltrim( localUtil.ntoc( A741PrdUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLINMAX", GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.formulaciontinte.colorproductos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19PrdLin,3,0))}, new String[] {"Gx_mode","EmprCod","ForNumCol","PrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ColorProductos_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Color Productos", "") ;
   }

   public void initializeNonKey1UZ82( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      AV7Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Texto_i", AV7Texto_i);
      A13758PrdlinMax = (short)(0) ;
      n13758PrdlinMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      A741PrdUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A487ForPrdCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A489ForPrdNor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A489ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A489ForPrdNor), 4, 0));
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      O487ForPrdCan = A487ForPrdCan ;
      httpContext.ajax_rsp_assign_attri("", false, "A487ForPrdCan", GXutil.ltrimstr( A487ForPrdCan, 11, 5));
      O719PrdNum = A719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      Z487ForPrdCan = DecimalUtil.ZERO ;
      Z489ForPrdNor = (short)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1UZ82( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      A715PrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A715PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A715PrdLin), 3, 0));
      initializeNonKey1UZ82( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105627", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/colorproductos_trn.js", "?202682116105628", false, true);
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
      edtForNumCol_Internalname = "FORNUMCOL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtPrdLin_Internalname = "PRDLIN" ;
      lblTextblockprdnum_Internalname = "TEXTBLOCKPRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtForPrdCan_Internalname = "FORPRDCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtForPrdNor_Internalname = "FORPRDNOR" ;
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
      edtPrdUMeFo_Internalname = "PRDUMEFO" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_490_Internalname = "PROMPT_490" ;
      imgprompt_396_489_Internalname = "PROMPT_396_489" ;
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
      Form.setCaption( httpContext.getMessage( "Color Productos", "") );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtPrdUMeFo_Enabled = 0 ;
      edtPrdUMeFo_Visible = 1 ;
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
      imgprompt_396_489_Visible = 1 ;
      imgprompt_396_489_Link = "" ;
      edtForPrdNor_Jsonclick = "" ;
      edtForPrdNor_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      imgprompt_490_Visible = 1 ;
      imgprompt_490_Link = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtForPrdCan_Jsonclick = "" ;
      edtForPrdCan_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      edtPrdLin_Jsonclick = "" ;
      edtPrdLin_Enabled = 0 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
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

   public void xc_21_1UZ82( String A396EmprCod ,
                            String AV29Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV7Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_22_1UZ82( String A396EmprCod ,
                            String AV29Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV7Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_23_1UZ82( String A396EmprCod ,
                            String AV29Pgmname ,
                            String AV8Usurcod ,
                            String AV9Station ,
                            String AV7Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV29Pgmname, AV8Usurcod, AV9Station, AV7Texto_i, A486ForNumCol, (byte)(0), "") ;
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
      n13758PrdlinMax = false ;
      /* Using cursor T01UZ24 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01UZ24_A407EmprNom[0] ;
      n407EmprNom = T01UZ24_n407EmprNom[0] ;
      pr_default.close(19);
      /* Using cursor T01UZ25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDFORM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A741PrdUltLin = T01UZ25_A741PrdUltLin[0] ;
      pr_default.close(20);
      /* Using cursor T01UZ27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A13758PrdlinMax = T01UZ27_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UZ27_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrim( localUtil.ntoc( A741PrdUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01UZ28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01UZ28_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UZ28_A4338PrdUMeFo[0] ;
      pr_default.close(22);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV24Insert_ForPrdUMe ;
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
      /* Using cursor T01UZ29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A488ForPrdDsc = T01UZ29_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UZ29_n488ForPrdDsc[0] ;
      pr_default.close(23);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV19PrdLin',fld:'vPRDLIN',pic:'ZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV19PrdLin',fld:'vPRDLIN',pic:'ZZ9',hsh:true},{av:'A715PrdLin',fld:'PRDLIN',pic:'ZZ9'},{av:'AV29Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UZ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALID_PRDLIN","{handler:'valid_Prdlin',iparms:[]");
      setEventMetadata("VALID_PRDLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV24Insert_ForPrdUMe',fld:'vINSERT_FORPRDUME',pic:'9'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_FORPRDCAN","{handler:'valid_Forprdcan',iparms:[]");
      setEventMetadata("VALID_FORPRDCAN",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRDNUM","{handler:'validv_Comboprdnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDUMEFO","{handler:'valid_Prdumefo',iparms:[]");
      setEventMetadata("VALID_PRDUMEFO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A741PrdUltLin',fld:'PRDULTLIN',pic:'ZZ9'},{av:'A13758PrdlinMax',fld:'PRDLINMAX',pic:'ZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A741PrdUltLin',fld:'PRDULTLIN',pic:'ZZ9'},{av:'A13758PrdlinMax',fld:'PRDLINMAX',pic:'ZZ9'}]}");
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
      pr_default.close(22);
      pr_default.close(20);
      pr_default.close(23);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV12EmprCod = "" ;
      Z396EmprCod = "" ;
      Z487ForPrdCan = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O487ForPrdCan = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      N719PrdNum = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV29Pgmname = "" ;
      AV8Usurcod = "" ;
      AV9Station = "" ;
      AV7Texto_i = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV12EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockprdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV26PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      imgprompt_490_gximage = "" ;
      sImgUrl = "" ;
      A488ForPrdDsc = "" ;
      imgprompt_396_489_gximage = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV28ComboPrdNum = "" ;
      AV23Insert_PrdNum = "" ;
      A718PrdNom = "" ;
      A407EmprNom = "" ;
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
      sMode82 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV30Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV20WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV22WebSession = httpContext.getWebSession();
      AV25TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      Z488ForPrdDsc = "" ;
      T01UZ4_A407EmprNom = new String[] {""} ;
      T01UZ4_n407EmprNom = new boolean[] {false} ;
      T01UZ6_A741PrdUltLin = new short[1] ;
      T01UZ9_A13758PrdlinMax = new short[1] ;
      T01UZ9_n13758PrdlinMax = new boolean[] {false} ;
      T01UZ5_A718PrdNom = new String[] {""} ;
      T01UZ5_A4338PrdUMeFo = new byte[1] ;
      T01UZ11_A715PrdLin = new short[1] ;
      T01UZ11_A741PrdUltLin = new short[1] ;
      T01UZ11_A407EmprNom = new String[] {""} ;
      T01UZ11_n407EmprNom = new boolean[] {false} ;
      T01UZ11_A718PrdNom = new String[] {""} ;
      T01UZ11_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UZ11_A488ForPrdDsc = new String[] {""} ;
      T01UZ11_n488ForPrdDsc = new boolean[] {false} ;
      T01UZ11_A489ForPrdNor = new short[1] ;
      T01UZ11_A4338PrdUMeFo = new byte[1] ;
      T01UZ11_A396EmprCod = new String[] {""} ;
      T01UZ11_A719PrdNum = new String[] {""} ;
      T01UZ11_A486ForNumCol = new int[1] ;
      T01UZ11_A490ForPrdUMe = new byte[1] ;
      T01UZ11_A13758PrdlinMax = new short[1] ;
      T01UZ11_n13758PrdlinMax = new boolean[] {false} ;
      T01UZ7_A488ForPrdDsc = new String[] {""} ;
      T01UZ7_n488ForPrdDsc = new boolean[] {false} ;
      T01UZ12_A407EmprNom = new String[] {""} ;
      T01UZ12_n407EmprNom = new boolean[] {false} ;
      T01UZ13_A718PrdNom = new String[] {""} ;
      T01UZ13_A4338PrdUMeFo = new byte[1] ;
      T01UZ14_A488ForPrdDsc = new String[] {""} ;
      T01UZ14_n488ForPrdDsc = new boolean[] {false} ;
      T01UZ15_A741PrdUltLin = new short[1] ;
      T01UZ17_A13758PrdlinMax = new short[1] ;
      T01UZ17_n13758PrdlinMax = new boolean[] {false} ;
      T01UZ18_A396EmprCod = new String[] {""} ;
      T01UZ18_A486ForNumCol = new int[1] ;
      T01UZ18_A715PrdLin = new short[1] ;
      T01UZ3_A715PrdLin = new short[1] ;
      T01UZ3_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UZ3_A489ForPrdNor = new short[1] ;
      T01UZ3_A396EmprCod = new String[] {""} ;
      T01UZ3_A719PrdNum = new String[] {""} ;
      T01UZ3_A486ForNumCol = new int[1] ;
      T01UZ3_A490ForPrdUMe = new byte[1] ;
      T01UZ19_A396EmprCod = new String[] {""} ;
      T01UZ19_A486ForNumCol = new int[1] ;
      T01UZ19_A715PrdLin = new short[1] ;
      T01UZ20_A396EmprCod = new String[] {""} ;
      T01UZ20_A486ForNumCol = new int[1] ;
      T01UZ20_A715PrdLin = new short[1] ;
      T01UZ2_A715PrdLin = new short[1] ;
      T01UZ2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UZ2_A489ForPrdNor = new short[1] ;
      T01UZ2_A396EmprCod = new String[] {""} ;
      T01UZ2_A719PrdNum = new String[] {""} ;
      T01UZ2_A486ForNumCol = new int[1] ;
      T01UZ2_A490ForPrdUMe = new byte[1] ;
      T01UZ24_A407EmprNom = new String[] {""} ;
      T01UZ24_n407EmprNom = new boolean[] {false} ;
      T01UZ25_A741PrdUltLin = new short[1] ;
      T01UZ27_A13758PrdlinMax = new short[1] ;
      T01UZ27_n13758PrdlinMax = new boolean[] {false} ;
      T01UZ28_A718PrdNom = new String[] {""} ;
      T01UZ28_A4338PrdUMeFo = new byte[1] ;
      T01UZ29_A488ForPrdDsc = new String[] {""} ;
      T01UZ29_n488ForPrdDsc = new boolean[] {false} ;
      T01UZ30_A396EmprCod = new String[] {""} ;
      T01UZ30_A486ForNumCol = new int[1] ;
      T01UZ30_A715PrdLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductos_trn__default(),
         new Object[] {
             new Object[] {
            T01UZ2_A715PrdLin, T01UZ2_A487ForPrdCan, T01UZ2_A489ForPrdNor, T01UZ2_A396EmprCod, T01UZ2_A719PrdNum, T01UZ2_A486ForNumCol, T01UZ2_A490ForPrdUMe
            }
            , new Object[] {
            T01UZ3_A715PrdLin, T01UZ3_A487ForPrdCan, T01UZ3_A489ForPrdNor, T01UZ3_A396EmprCod, T01UZ3_A719PrdNum, T01UZ3_A486ForNumCol, T01UZ3_A490ForPrdUMe
            }
            , new Object[] {
            T01UZ4_A407EmprNom, T01UZ4_n407EmprNom
            }
            , new Object[] {
            T01UZ5_A718PrdNom, T01UZ5_A4338PrdUMeFo
            }
            , new Object[] {
            T01UZ6_A741PrdUltLin
            }
            , new Object[] {
            T01UZ7_A488ForPrdDsc, T01UZ7_n488ForPrdDsc
            }
            , new Object[] {
            T01UZ9_A13758PrdlinMax, T01UZ9_n13758PrdlinMax
            }
            , new Object[] {
            T01UZ11_A715PrdLin, T01UZ11_A741PrdUltLin, T01UZ11_A407EmprNom, T01UZ11_n407EmprNom, T01UZ11_A718PrdNom, T01UZ11_A487ForPrdCan, T01UZ11_A488ForPrdDsc, T01UZ11_n488ForPrdDsc, T01UZ11_A489ForPrdNor, T01UZ11_A4338PrdUMeFo,
            T01UZ11_A396EmprCod, T01UZ11_A719PrdNum, T01UZ11_A486ForNumCol, T01UZ11_A490ForPrdUMe, T01UZ11_A13758PrdlinMax, T01UZ11_n13758PrdlinMax
            }
            , new Object[] {
            T01UZ12_A407EmprNom, T01UZ12_n407EmprNom
            }
            , new Object[] {
            T01UZ13_A718PrdNom, T01UZ13_A4338PrdUMeFo
            }
            , new Object[] {
            T01UZ14_A488ForPrdDsc, T01UZ14_n488ForPrdDsc
            }
            , new Object[] {
            T01UZ15_A741PrdUltLin
            }
            , new Object[] {
            T01UZ17_A13758PrdlinMax, T01UZ17_n13758PrdlinMax
            }
            , new Object[] {
            T01UZ18_A396EmprCod, T01UZ18_A486ForNumCol, T01UZ18_A715PrdLin
            }
            , new Object[] {
            T01UZ19_A396EmprCod, T01UZ19_A486ForNumCol, T01UZ19_A715PrdLin
            }
            , new Object[] {
            T01UZ20_A396EmprCod, T01UZ20_A486ForNumCol, T01UZ20_A715PrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UZ24_A407EmprNom, T01UZ24_n407EmprNom
            }
            , new Object[] {
            T01UZ25_A741PrdUltLin
            }
            , new Object[] {
            T01UZ27_A13758PrdlinMax, T01UZ27_n13758PrdlinMax
            }
            , new Object[] {
            T01UZ28_A718PrdNom, T01UZ28_A4338PrdUMeFo
            }
            , new Object[] {
            T01UZ29_A488ForPrdDsc, T01UZ29_n488ForPrdDsc
            }
            , new Object[] {
            T01UZ30_A396EmprCod, T01UZ30_A486ForNumCol, T01UZ30_A715PrdLin
            }
         }
      );
      AV29Pgmname = "FormulacionTinte.ColorProductos_TRN" ;
   }

   private byte Z490ForPrdUMe ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A4338PrdUMeFo ;
   private byte AV24Insert_ForPrdUMe ;
   private byte Z4338PrdUMeFo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV19PrdLin ;
   private short Z715PrdLin ;
   private short Z489ForPrdNor ;
   private short AV19PrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short A741PrdUltLin ;
   private short A13758PrdlinMax ;
   private short RcdFound82 ;
   private short Z741PrdUltLin ;
   private short Z13758PrdlinMax ;
   private short nIsDirty_82 ;
   private int wcpOAV18ForNumCol ;
   private int Z486ForNumCol ;
   private int A486ForNumCol ;
   private int AV18ForNumCol ;
   private int trnEnded ;
   private int edtForNumCol_Enabled ;
   private int edtPrdLin_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtForPrdCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int imgprompt_490_Visible ;
   private int edtForPrdDsc_Enabled ;
   private int edtForPrdNor_Enabled ;
   private int imgprompt_396_489_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprdnum_Visible ;
   private int edtavComboprdnum_Enabled ;
   private int edtPrdUMeFo_Enabled ;
   private int edtPrdUMeFo_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV31GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z487ForPrdCan ;
   private java.math.BigDecimal O487ForPrdCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV12EmprCod ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String N719PrdNum ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV29Pgmname ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV12EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtPrdLin_Internalname ;
   private String edtPrdLin_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdCan_Internalname ;
   private String edtForPrdCan_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String imgprompt_490_gximage ;
   private String sImgUrl ;
   private String imgprompt_490_Internalname ;
   private String imgprompt_490_Link ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtForPrdNor_Internalname ;
   private String edtForPrdNor_Jsonclick ;
   private String imgprompt_396_489_gximage ;
   private String imgprompt_396_489_Internalname ;
   private String imgprompt_396_489_Link ;
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
   private String AV28ComboPrdNum ;
   private String edtavComboprdnum_Jsonclick ;
   private String edtPrdUMeFo_Internalname ;
   private String edtPrdUMeFo_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String AV23Insert_PrdNum ;
   private String A718PrdNom ;
   private String A407EmprNom ;
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
   private String sMode82 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV30Emprnom ;
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
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n13758PrdlinMax ;
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
   private boolean returnInSub ;
   private String AV7Texto_i ;
   private String AV27ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV22WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UZ4_A407EmprNom ;
   private boolean[] T01UZ4_n407EmprNom ;
   private short[] T01UZ6_A741PrdUltLin ;
   private short[] T01UZ9_A13758PrdlinMax ;
   private boolean[] T01UZ9_n13758PrdlinMax ;
   private String[] T01UZ5_A718PrdNom ;
   private byte[] T01UZ5_A4338PrdUMeFo ;
   private short[] T01UZ11_A715PrdLin ;
   private short[] T01UZ11_A741PrdUltLin ;
   private String[] T01UZ11_A407EmprNom ;
   private boolean[] T01UZ11_n407EmprNom ;
   private String[] T01UZ11_A718PrdNom ;
   private java.math.BigDecimal[] T01UZ11_A487ForPrdCan ;
   private String[] T01UZ11_A488ForPrdDsc ;
   private boolean[] T01UZ11_n488ForPrdDsc ;
   private short[] T01UZ11_A489ForPrdNor ;
   private byte[] T01UZ11_A4338PrdUMeFo ;
   private String[] T01UZ11_A396EmprCod ;
   private String[] T01UZ11_A719PrdNum ;
   private int[] T01UZ11_A486ForNumCol ;
   private byte[] T01UZ11_A490ForPrdUMe ;
   private short[] T01UZ11_A13758PrdlinMax ;
   private boolean[] T01UZ11_n13758PrdlinMax ;
   private String[] T01UZ7_A488ForPrdDsc ;
   private boolean[] T01UZ7_n488ForPrdDsc ;
   private String[] T01UZ12_A407EmprNom ;
   private boolean[] T01UZ12_n407EmprNom ;
   private String[] T01UZ13_A718PrdNom ;
   private byte[] T01UZ13_A4338PrdUMeFo ;
   private String[] T01UZ14_A488ForPrdDsc ;
   private boolean[] T01UZ14_n488ForPrdDsc ;
   private short[] T01UZ15_A741PrdUltLin ;
   private short[] T01UZ17_A13758PrdlinMax ;
   private boolean[] T01UZ17_n13758PrdlinMax ;
   private String[] T01UZ18_A396EmprCod ;
   private int[] T01UZ18_A486ForNumCol ;
   private short[] T01UZ18_A715PrdLin ;
   private short[] T01UZ3_A715PrdLin ;
   private java.math.BigDecimal[] T01UZ3_A487ForPrdCan ;
   private short[] T01UZ3_A489ForPrdNor ;
   private String[] T01UZ3_A396EmprCod ;
   private String[] T01UZ3_A719PrdNum ;
   private int[] T01UZ3_A486ForNumCol ;
   private byte[] T01UZ3_A490ForPrdUMe ;
   private String[] T01UZ19_A396EmprCod ;
   private int[] T01UZ19_A486ForNumCol ;
   private short[] T01UZ19_A715PrdLin ;
   private String[] T01UZ20_A396EmprCod ;
   private int[] T01UZ20_A486ForNumCol ;
   private short[] T01UZ20_A715PrdLin ;
   private short[] T01UZ2_A715PrdLin ;
   private java.math.BigDecimal[] T01UZ2_A487ForPrdCan ;
   private short[] T01UZ2_A489ForPrdNor ;
   private String[] T01UZ2_A396EmprCod ;
   private String[] T01UZ2_A719PrdNum ;
   private int[] T01UZ2_A486ForNumCol ;
   private byte[] T01UZ2_A490ForPrdUMe ;
   private String[] T01UZ24_A407EmprNom ;
   private boolean[] T01UZ24_n407EmprNom ;
   private short[] T01UZ25_A741PrdUltLin ;
   private short[] T01UZ27_A13758PrdlinMax ;
   private boolean[] T01UZ27_n13758PrdlinMax ;
   private String[] T01UZ28_A718PrdNom ;
   private byte[] T01UZ28_A4338PrdUMeFo ;
   private String[] T01UZ29_A488ForPrdDsc ;
   private boolean[] T01UZ29_n488ForPrdDsc ;
   private String[] T01UZ30_A396EmprCod ;
   private int[] T01UZ30_A486ForNumCol ;
   private short[] T01UZ30_A715PrdLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV20WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV21TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV25TrnContextAtt ;
}

final  class colorproductos_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductos_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductos_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductos_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductos_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UZ2", "SELECT PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForNumCol, ForPrdUMe FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?  FOR UPDATE OF ForPrdCan, ForPrdNor, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ3", "SELECT PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForNumCol, ForPrdUMe FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ5", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ6", "SELECT PrdUltLin FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ7", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ9", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ11", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdLin, T3.PrdUltLin, T2.EmprNom, T5.PrdNom, TM1.ForPrdCan, T6.ForPrdDsc, TM1.ForPrdNor, T5.PrdUMeFo, TM1.EmprCod, TM1.PrdNum, TM1.ForNumCol, TM1.ForPrdUMe, COALESCE( T4.PrdlinMax, 0) AS PrdlinMax FROM (((((TXPLPRFOR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCDFORM T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForNumCol = TM1.ForNumCol) LEFT JOIN (SELECT MAX(TM1.PrdLin) AS PrdlinMax, TM1.EmprCod, TM1.ForNumCol FROM TXPLPRFOR TM1 GROUP BY TM1.EmprCod, TM1.ForNumCol ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForNumCol = TM1.ForNumCol) INNER JOIN TXPPRODUC T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T6 ON T6.EmprCod = TM1.EmprCod AND T6.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.ForNumCol = ? and TM1.PrdLin = ? ORDER BY TM1.EmprCod, TM1.ForNumCol, TM1.PrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ13", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ14", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ15", "SELECT PrdUltLin FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ17", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE ( EmprCod > ? or EmprCod = ? and ForNumCol > ? or ForNumCol = ? and EmprCod = ? and PrdLin > ?) ORDER BY EmprCod, ForNumCol, PrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UZ20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE ( EmprCod < ? or EmprCod = ? and ForNumCol < ? or ForNumCol = ? and EmprCod = ? and PrdLin < ?) ORDER BY EmprCod DESC, ForNumCol DESC, PrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UZ21", "INSERT INTO TXPLPRFOR(PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForNumCol, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPRFOR")
         ,new UpdateCursor("T01UZ22", "UPDATE TXPLPRFOR SET ForPrdCan=?, ForPrdNor=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK, "TXPLPRFOR")
         ,new UpdateCursor("T01UZ23", "DELETE FROM TXPLPRFOR  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK, "TXPLPRFOR")
         ,new ForEachCursor("T01UZ24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ25", "SELECT PrdUltLin FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ27", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ28", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ29", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UZ30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR ORDER BY EmprCod, ForNumCol, PrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 17 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

