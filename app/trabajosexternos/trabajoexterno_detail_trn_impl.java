package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1US910( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         A2256SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A654OrdLin = (short)(GXutil.lval( httpContext.GetPar( "OrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A6256SalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "SalExKgE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         A6258SalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "SalExMtE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         A6257SalExCoE = (int)(GXutil.lval( httpContext.GetPar( "SalExCoE"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_1US910( Gx_mode, A396EmprCod, A2248ManCod, A2253SalExtAlb, A6248SalExNln, A2256SalExtFec, A129BarCod, A132BarCodReo, A130BarCodPar, A654OrdLin, A6558FasCodn, A6256SalExKgE, A6258SalExMtE, A6257SalExCoE) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6558FasCodn = httpContext.GetPar( "FasCodn") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A6558FasCodn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A2253SalExtAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A2248ManCod) ;
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
            AV8SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8SalExtAlb), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8SalExtAlb), "ZZZZZZZ9")));
            AV9SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9SalExNln), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXNLN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9SalExNln), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajo Externo (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trabajoexterno_detail_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_detail_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail_trn_impl.class ));
   }

   public trabajoexterno_detail_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtAlb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtAlb_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "ManuFacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExNln_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExNln_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExNln_Internalname, GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExNln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExNln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExNln_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCodn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCodn_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCodn_Internalname, GXutil.rtrim( A6558FasCodn), GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCodn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCodn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOrdLin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExCoE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExCoE_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExCoE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExCoE_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExKgE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExKgE_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExKgE_Enabled!=0) ? localUtil.format( A6256SalExKgE, "ZZZZZ9.99") : localUtil.format( A6256SalExKgE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExKgE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExKgE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExMtE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExMtE_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExMtE_Enabled!=0) ? localUtil.format( A6258SalExMtE, "ZZZZZ9.99") : localUtil.format( A6258SalExMtE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExMtE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExMtE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExObs_Internalname, GXutil.rtrim( A6249SalExObs), GXutil.rtrim( localUtil.format( A6249SalExObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExObs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNomCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNomCli_Internalname, httpContext.getMessage( "ColorCliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_TRN.htm");
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
      e111US2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( "Z6248SalExNln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z654OrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( "Z6257SalExCoE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6256SalExKgE = localUtil.ctond( httpContext.cgiGet( "Z6256SalExKgE")) ;
            Z6258SalExMtE = localUtil.ctond( httpContext.cgiGet( "Z6258SalExMtE")) ;
            Z6249SalExObs = httpContext.cgiGet( "Z6249SalExObs") ;
            Z6250SalExFeR = localUtil.ctod( httpContext.cgiGet( "Z6250SalExFeR"), 0) ;
            Z6251SalExKgR = localUtil.ctond( httpContext.cgiGet( "Z6251SalExKgR")) ;
            Z6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( "Z6252SalExCoR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6253SalExEsB = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6253SalExEsB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6254SalExEnt = httpContext.cgiGet( "Z6254SalExEnt") ;
            Z6255SalExMtR = localUtil.ctond( httpContext.cgiGet( "Z6255SalExMtR")) ;
            Z6558FasCodn = httpContext.cgiGet( "Z6558FasCodn") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            A6250SalExFeR = localUtil.ctod( httpContext.cgiGet( "Z6250SalExFeR"), 0) ;
            A6251SalExKgR = localUtil.ctond( httpContext.cgiGet( "Z6251SalExKgR")) ;
            A6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( "Z6252SalExCoR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6253SalExEsB = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6253SalExEsB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6254SalExEnt = httpContext.cgiGet( "Z6254SalExEnt") ;
            A6255SalExMtR = localUtil.ctond( httpContext.cgiGet( "Z6255SalExMtR")) ;
            O6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( "O6257SalExCoE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6258SalExMtE = localUtil.ctond( httpContext.cgiGet( "O6258SalExMtE")) ;
            O6256SalExKgE = localUtil.ctond( httpContext.cgiGet( "O6256SalExKgE")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( "vSALEXNLN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Insert_BarCodPar = httpContext.cgiGet( "vINSERT_BARCODPAR") ;
            AV16Insert_FasCodn = httpContext.cgiGet( "vINSERT_FASCODN") ;
            AV18OldKg = localUtil.ctond( httpContext.cgiGet( "vOLDKG")) ;
            AV19OldMt = localUtil.ctond( httpContext.cgiGet( "vOLDMT")) ;
            AV20OldPz = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "BARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( "SALEXTFEC"), 0) ;
            A6250SalExFeR = localUtil.ctod( httpContext.cgiGet( "SALEXFER"), 0) ;
            A6251SalExKgR = localUtil.ctond( httpContext.cgiGet( "SALEXKGR")) ;
            A6252SalExCoR = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXCOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6253SalExEsB = (byte)(localUtil.ctol( httpContext.cgiGet( "SALEXESB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6254SalExEnt = httpContext.cgiGet( "SALEXENT") ;
            A6255SalExMtR = localUtil.ctond( httpContext.cgiGet( "SALEXMTR")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( "BAREXT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2265BarExt = false ;
            A6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "SALEXULN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2253SalExtAlb = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            else
            {
               A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
            n2249ManNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
            A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
            A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXCOE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExCoE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6257SalExCoE = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
            }
            else
            {
               A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXKGE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExKgE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6256SalExKgE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
            }
            else
            {
               A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXMTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExMtE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6258SalExMtE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
            }
            else
            {
               A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
            }
            A6249SalExObs = httpContext.cgiGet( edtSalExObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Detail_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
            forbiddenHiddens.add("SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
            forbiddenHiddens.add("SalExKgR", localUtil.format( A6251SalExKgR, "ZZZZZ9.99"));
            forbiddenHiddens.add("SalExCoR", localUtil.format( DecimalUtil.doubleToDec(A6252SalExCoR), "ZZZZZ9"));
            forbiddenHiddens.add("SalExEsB", localUtil.format( DecimalUtil.doubleToDec(A6253SalExEsB), "9"));
            forbiddenHiddens.add("SalExEnt", GXutil.rtrim( localUtil.format( A6254SalExEnt, "")));
            forbiddenHiddens.add("SalExMtR", localUtil.format( A6255SalExMtR, "ZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trabajosexternos\\trabajoexterno_detail_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               A6248SalExNln = (short)(GXutil.lval( httpContext.GetPar( "SalExNln"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
                  sMode910 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode910 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound910 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1US0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "SALEXTALB");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSalExtAlb_Internalname ;
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
                        e111US2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121US2 ();
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
         e121US2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1US910( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1US910( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1US0( )
   {
      beforeValidate1US910( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1US910( ) ;
         }
         else
         {
            checkExtendedTable1US910( ) ;
            closeExtendedTableCursors1US910( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1US0( )
   {
   }

   public void e111US2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_detail_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV23Emprnom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_detail_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      trabajoexterno_detail_trn_impl.this.AV23Emprnom = GXv_char3[0] ;
      trabajoexterno_detail_trn_impl.this.AV24Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Emprnom", AV23Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV24Usurcod", AV24Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV25GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GXV1), 8, 0));
         while ( AV25GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV25GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCod") == 0 )
            {
               AV13Insert_BarCod = (int)(GXutil.lval( AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_BarCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodReo") == 0 )
            {
               AV14Insert_BarCodReo = (byte)(GXutil.lval( AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_BarCodReo", GXutil.str( AV14Insert_BarCodReo, 1, 0));
            }
            else if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodPar") == 0 )
            {
               AV15Insert_BarCodPar = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_BarCodPar", AV15Insert_BarCodPar);
            }
            else if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCodn") == 0 )
            {
               AV16Insert_FasCodn = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_FasCodn", AV16Insert_FasCodn);
            }
            AV25GXV1 = (int)(AV25GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GXV1), 8, 0));
         }
      }
   }

   public void e121US2( )
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

   public void zm1US910( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z654OrdLin = T01US3_A654OrdLin[0] ;
            Z6257SalExCoE = T01US3_A6257SalExCoE[0] ;
            Z6256SalExKgE = T01US3_A6256SalExKgE[0] ;
            Z6258SalExMtE = T01US3_A6258SalExMtE[0] ;
            Z6249SalExObs = T01US3_A6249SalExObs[0] ;
            Z6250SalExFeR = T01US3_A6250SalExFeR[0] ;
            Z6251SalExKgR = T01US3_A6251SalExKgR[0] ;
            Z6252SalExCoR = T01US3_A6252SalExCoR[0] ;
            Z6253SalExEsB = T01US3_A6253SalExEsB[0] ;
            Z6254SalExEnt = T01US3_A6254SalExEnt[0] ;
            Z6255SalExMtR = T01US3_A6255SalExMtR[0] ;
            Z6558FasCodn = T01US3_A6558FasCodn[0] ;
            Z129BarCod = T01US3_A129BarCod[0] ;
            Z132BarCodReo = T01US3_A132BarCodReo[0] ;
            Z130BarCodPar = T01US3_A130BarCodPar[0] ;
         }
         else
         {
            Z654OrdLin = A654OrdLin ;
            Z6257SalExCoE = A6257SalExCoE ;
            Z6256SalExKgE = A6256SalExKgE ;
            Z6258SalExMtE = A6258SalExMtE ;
            Z6249SalExObs = A6249SalExObs ;
            Z6250SalExFeR = A6250SalExFeR ;
            Z6251SalExKgR = A6251SalExKgR ;
            Z6252SalExCoR = A6252SalExCoR ;
            Z6253SalExEsB = A6253SalExEsB ;
            Z6254SalExEnt = A6254SalExEnt ;
            Z6255SalExMtR = A6255SalExMtR ;
            Z6558FasCodn = A6558FasCodn ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z6248SalExNln = A6248SalExNln ;
         Z654OrdLin = A654OrdLin ;
         Z6257SalExCoE = A6257SalExCoE ;
         Z6256SalExKgE = A6256SalExKgE ;
         Z6258SalExMtE = A6258SalExMtE ;
         Z6249SalExObs = A6249SalExObs ;
         Z6250SalExFeR = A6250SalExFeR ;
         Z6251SalExKgR = A6251SalExKgR ;
         Z6252SalExCoR = A6252SalExCoR ;
         Z6253SalExEsB = A6253SalExEsB ;
         Z6254SalExEnt = A6254SalExEnt ;
         Z6255SalExMtR = A6255SalExMtR ;
         Z396EmprCod = A396EmprCod ;
         Z6558FasCodn = A6558FasCodn ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z407EmprNom = A407EmprNom ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z2265BarExt = A2265BarExt ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
         Z2256SalExtFec = A2256SalExtFec ;
         Z6247SalExUln = A6247SalExUln ;
         Z2248ManCod = A2248ManCod ;
         Z2249ManNom = A2249ManNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtSalExNln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtFasCodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), true);
      edtOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), true);
      AV21Pgmname = "TrabajosExternos.TrabajoExterno_Detail_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      edtSalExNln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtFasCodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), true);
      edtOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01US4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01US4_A407EmprNom[0] ;
      n407EmprNom = T01US4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8SalExtAlb) )
      {
         A2253SalExtAlb = AV8SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      if ( ! (0==AV8SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      else
      {
         edtSalExtAlb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9SalExNln) )
      {
         A6248SalExNln = AV9SalExNln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_FasCodn)==0) )
      {
         A6558FasCodn = AV16Insert_FasCodn ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_BarCodPar)==0) )
      {
         A130BarCodPar = AV15Insert_BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_BarCodReo) )
      {
         A132BarCodReo = AV14Insert_BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_BarCod) )
      {
         A129BarCod = AV13Insert_BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
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
         /* Using cursor T01US7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         A2256SalExtFec = T01US7_A2256SalExtFec[0] ;
         A6247SalExUln = T01US7_A6247SalExUln[0] ;
         A2248ManCod = T01US7_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         pr_default.close(5);
         /* Using cursor T01US8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01US8_A2249ManNom[0] ;
         n2249ManNom = T01US8_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(6);
         /* Using cursor T01US6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T01US6_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01US6_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A1234BarNomCli = T01US6_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A2265BarExt = T01US6_A2265BarExt[0] ;
         n2265BarExt = T01US6_n2265BarExt[0] ;
         A213BarSit = T01US6_A213BarSit[0] ;
         A252CliCod = T01US6_A252CliCod[0] ;
         n252CliCod = T01US6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(4);
      }
   }

   public void load1US910( )
   {
      /* Using cursor T01US9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A407EmprNom = T01US9_A407EmprNom[0] ;
         n407EmprNom = T01US9_n407EmprNom[0] ;
         A2256SalExtFec = T01US9_A2256SalExtFec[0] ;
         A6247SalExUln = T01US9_A6247SalExUln[0] ;
         A2249ManNom = T01US9_A2249ManNom[0] ;
         n2249ManNom = T01US9_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A212BarSer = T01US9_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01US9_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A1234BarNomCli = T01US9_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A2265BarExt = T01US9_A2265BarExt[0] ;
         n2265BarExt = T01US9_n2265BarExt[0] ;
         A654OrdLin = T01US9_A654OrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         A6257SalExCoE = T01US9_A6257SalExCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         A6256SalExKgE = T01US9_A6256SalExKgE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         A6258SalExMtE = T01US9_A6258SalExMtE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         A6249SalExObs = T01US9_A6249SalExObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
         A6250SalExFeR = T01US9_A6250SalExFeR[0] ;
         A6251SalExKgR = T01US9_A6251SalExKgR[0] ;
         A6252SalExCoR = T01US9_A6252SalExCoR[0] ;
         A6253SalExEsB = T01US9_A6253SalExEsB[0] ;
         A6254SalExEnt = T01US9_A6254SalExEnt[0] ;
         A6255SalExMtR = T01US9_A6255SalExMtR[0] ;
         A213BarSit = T01US9_A213BarSit[0] ;
         A6558FasCodn = T01US9_A6558FasCodn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A129BarCod = T01US9_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01US9_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01US9_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = T01US9_A252CliCod[0] ;
         n252CliCod = T01US9_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2248ManCod = T01US9_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         zm1US910( -26) ;
      }
      pr_default.close(7);
      onLoadActions1US910( ) ;
   }

   public void onLoadActions1US910( )
   {
      AV20OldPz = O6257SalExCoE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
      AV18OldKg = O6256SalExKgE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
      AV19OldMt = O6258SalExMtE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
   }

   public void checkExtendedTable1US910( )
   {
      nIsDirty_910 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV20OldPz = O6257SalExCoE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
      AV18OldKg = O6256SalExKgE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
      AV19OldMt = O6258SalExMtE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
      if ( ( A654OrdLin == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Orden Fase", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01US5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
      /* Using cursor T01US6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01US6_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01US6_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1234BarNomCli = T01US6_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A2265BarExt = T01US6_A2265BarExt[0] ;
      n2265BarExt = T01US6_n2265BarExt[0] ;
      A213BarSit = T01US6_A213BarSit[0] ;
      A252CliCod = T01US6_A252CliCod[0] ;
      n252CliCod = T01US6_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(4);
      if ( A213BarSit >= 9 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta CERRADA", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01US7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2256SalExtFec = T01US7_A2256SalExtFec[0] ;
      A6247SalExUln = T01US7_A6247SalExUln[0] ;
      A2248ManCod = T01US7_A2248ManCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      pr_default.close(5);
      /* Using cursor T01US8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
      }
      A2249ManNom = T01US8_A2249ManNom[0] ;
      n2249ManNom = T01US8_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1US910( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( String A396EmprCod ,
                          String A6558FasCodn )
   {
      /* Using cursor T01US10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_29( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01US11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01US11_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01US11_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1234BarNomCli = T01US11_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A2265BarExt = T01US11_A2265BarExt[0] ;
      n2265BarExt = T01US11_n2265BarExt[0] ;
      A213BarSit = T01US11_A213BarSit[0] ;
      A252CliCod = T01US11_A252CliCod[0] ;
      n252CliCod = T01US11_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_30( String A396EmprCod ,
                          int A2253SalExtAlb )
   {
      /* Using cursor T01US12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2256SalExtFec = T01US12_A2256SalExtFec[0] ;
      A6247SalExUln = T01US12_A6247SalExUln[0] ;
      A2248ManCod = T01US12_A2248ManCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A2256SalExtFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_31( String A396EmprCod ,
                          short A2248ManCod )
   {
      /* Using cursor T01US13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
      }
      A2249ManNom = T01US13_A2249ManNom[0] ;
      n2249ManNom = T01US13_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1US910( )
   {
      /* Using cursor T01US14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound910 = (short)(1) ;
      }
      else
      {
         RcdFound910 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01US3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1US910( 26) ;
         RcdFound910 = (short)(1) ;
         A6248SalExNln = T01US3_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         A654OrdLin = T01US3_A654OrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         A6257SalExCoE = T01US3_A6257SalExCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         A6256SalExKgE = T01US3_A6256SalExKgE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         A6258SalExMtE = T01US3_A6258SalExMtE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         A6249SalExObs = T01US3_A6249SalExObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
         A6250SalExFeR = T01US3_A6250SalExFeR[0] ;
         A6251SalExKgR = T01US3_A6251SalExKgR[0] ;
         A6252SalExCoR = T01US3_A6252SalExCoR[0] ;
         A6253SalExEsB = T01US3_A6253SalExEsB[0] ;
         A6254SalExEnt = T01US3_A6254SalExEnt[0] ;
         A6255SalExMtR = T01US3_A6255SalExMtR[0] ;
         A396EmprCod = T01US3_A396EmprCod[0] ;
         A6558FasCodn = T01US3_A6558FasCodn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         A129BarCod = T01US3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01US3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01US3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2253SalExtAlb = T01US3_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         O6257SalExCoE = A6257SalExCoE ;
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         O6258SalExMtE = A6258SalExMtE ;
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         O6256SalExKgE = A6256SalExKgE ;
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z6248SalExNln = A6248SalExNln ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1US910( ) ;
         if ( AnyError == 1 )
         {
            RcdFound910 = (short)(0) ;
            initializeNonKey1US910( ) ;
         }
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound910 = (short)(0) ;
         initializeNonKey1US910( ) ;
         sMode910 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode910 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1US910( ) ;
      if ( RcdFound910 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound910 = (short)(0) ;
      /* Using cursor T01US15 */
      pr_default.execute(13, new Object[] {Short.valueOf(A6248SalExNln), Short.valueOf(A6248SalExNln), A396EmprCod, A396EmprCod, Short.valueOf(A6248SalExNln), Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01US15_A6248SalExNln[0] < A6248SalExNln ) || ( T01US15_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01US15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01US15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01US15_A6248SalExNln[0] == A6248SalExNln ) && ( T01US15_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01US15_A6248SalExNln[0] > A6248SalExNln ) || ( T01US15_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01US15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01US15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01US15_A6248SalExNln[0] == A6248SalExNln ) && ( T01US15_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            A6248SalExNln = T01US15_A6248SalExNln[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
            A396EmprCod = T01US15_A396EmprCod[0] ;
            A2253SalExtAlb = T01US15_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound910 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound910 = (short)(0) ;
      /* Using cursor T01US16 */
      pr_default.execute(14, new Object[] {Short.valueOf(A6248SalExNln), Short.valueOf(A6248SalExNln), A396EmprCod, A396EmprCod, Short.valueOf(A6248SalExNln), Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01US16_A6248SalExNln[0] > A6248SalExNln ) || ( T01US16_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01US16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01US16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01US16_A6248SalExNln[0] == A6248SalExNln ) && ( T01US16_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01US16_A6248SalExNln[0] < A6248SalExNln ) || ( T01US16_A6248SalExNln[0] == A6248SalExNln ) && ( GXutil.strcmp(T01US16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01US16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01US16_A6248SalExNln[0] == A6248SalExNln ) && ( T01US16_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            A6248SalExNln = T01US16_A6248SalExNln[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
            A396EmprCod = T01US16_A396EmprCod[0] ;
            A2253SalExtAlb = T01US16_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound910 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1US910( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1US910( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound910 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2253SalExtAlb = Z2253SalExtAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               A6248SalExNln = Z6248SalExNln ;
               httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1US910( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
            {
               /* Insert record */
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1US910( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SALEXTALB");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1US910( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) || ( A6248SalExNln != Z6248SalExNln ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = Z2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = Z6248SalExNln ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1US910( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01US2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z654OrdLin != T01US2_A654OrdLin[0] ) || ( Z6257SalExCoE != T01US2_A6257SalExCoE[0] ) || ( DecimalUtil.compareTo(Z6256SalExKgE, T01US2_A6256SalExKgE[0]) != 0 ) || ( DecimalUtil.compareTo(Z6258SalExMtE, T01US2_A6258SalExMtE[0]) != 0 ) || ( GXutil.strcmp(Z6249SalExObs, T01US2_A6249SalExObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z6250SalExFeR), GXutil.resetTime(T01US2_A6250SalExFeR[0])) ) || ( DecimalUtil.compareTo(Z6251SalExKgR, T01US2_A6251SalExKgR[0]) != 0 ) || ( Z6252SalExCoR != T01US2_A6252SalExCoR[0] ) || ( Z6253SalExEsB != T01US2_A6253SalExEsB[0] ) || ( GXutil.strcmp(Z6254SalExEnt, T01US2_A6254SalExEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6255SalExMtR, T01US2_A6255SalExMtR[0]) != 0 ) || ( GXutil.strcmp(Z6558FasCodn, T01US2_A6558FasCodn[0]) != 0 ) || ( Z129BarCod != T01US2_A129BarCod[0] ) || ( Z132BarCodReo != T01US2_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01US2_A130BarCodPar[0]) != 0 ) )
         {
            if ( Z654OrdLin != T01US2_A654OrdLin[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"OrdLin");
               GXutil.writeLogRaw("Old: ",Z654OrdLin);
               GXutil.writeLogRaw("Current: ",T01US2_A654OrdLin[0]);
            }
            if ( Z6257SalExCoE != T01US2_A6257SalExCoE[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExCoE");
               GXutil.writeLogRaw("Old: ",Z6257SalExCoE);
               GXutil.writeLogRaw("Current: ",T01US2_A6257SalExCoE[0]);
            }
            if ( DecimalUtil.compareTo(Z6256SalExKgE, T01US2_A6256SalExKgE[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExKgE");
               GXutil.writeLogRaw("Old: ",Z6256SalExKgE);
               GXutil.writeLogRaw("Current: ",T01US2_A6256SalExKgE[0]);
            }
            if ( DecimalUtil.compareTo(Z6258SalExMtE, T01US2_A6258SalExMtE[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExMtE");
               GXutil.writeLogRaw("Old: ",Z6258SalExMtE);
               GXutil.writeLogRaw("Current: ",T01US2_A6258SalExMtE[0]);
            }
            if ( GXutil.strcmp(Z6249SalExObs, T01US2_A6249SalExObs[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExObs");
               GXutil.writeLogRaw("Old: ",Z6249SalExObs);
               GXutil.writeLogRaw("Current: ",T01US2_A6249SalExObs[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6250SalExFeR), GXutil.resetTime(T01US2_A6250SalExFeR[0])) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExFeR");
               GXutil.writeLogRaw("Old: ",Z6250SalExFeR);
               GXutil.writeLogRaw("Current: ",T01US2_A6250SalExFeR[0]);
            }
            if ( DecimalUtil.compareTo(Z6251SalExKgR, T01US2_A6251SalExKgR[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExKgR");
               GXutil.writeLogRaw("Old: ",Z6251SalExKgR);
               GXutil.writeLogRaw("Current: ",T01US2_A6251SalExKgR[0]);
            }
            if ( Z6252SalExCoR != T01US2_A6252SalExCoR[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExCoR");
               GXutil.writeLogRaw("Old: ",Z6252SalExCoR);
               GXutil.writeLogRaw("Current: ",T01US2_A6252SalExCoR[0]);
            }
            if ( Z6253SalExEsB != T01US2_A6253SalExEsB[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExEsB");
               GXutil.writeLogRaw("Old: ",Z6253SalExEsB);
               GXutil.writeLogRaw("Current: ",T01US2_A6253SalExEsB[0]);
            }
            if ( GXutil.strcmp(Z6254SalExEnt, T01US2_A6254SalExEnt[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExEnt");
               GXutil.writeLogRaw("Old: ",Z6254SalExEnt);
               GXutil.writeLogRaw("Current: ",T01US2_A6254SalExEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z6255SalExMtR, T01US2_A6255SalExMtR[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"SalExMtR");
               GXutil.writeLogRaw("Old: ",Z6255SalExMtR);
               GXutil.writeLogRaw("Current: ",T01US2_A6255SalExMtR[0]);
            }
            if ( GXutil.strcmp(Z6558FasCodn, T01US2_A6558FasCodn[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"FasCodn");
               GXutil.writeLogRaw("Old: ",Z6558FasCodn);
               GXutil.writeLogRaw("Current: ",T01US2_A6558FasCodn[0]);
            }
            if ( Z129BarCod != T01US2_A129BarCod[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01US2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01US2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01US2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01US2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_detail_trn:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01US2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEXHDPZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1US910( )
   {
      beforeValidate1US910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1US910( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1US910( 0) ;
         checkOptimisticConcurrency1US910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1US910( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1US910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01US17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A6248SalExNln), Short.valueOf(A654OrdLin), Integer.valueOf(A6257SalExCoE), A6256SalExKgE, A6258SalExMtE, A6249SalExObs, A6250SalExFeR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A6255SalExMtR, A396EmprCod, A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        resetCaption1US0( ) ;
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
            load1US910( ) ;
         }
         endLevel1US910( ) ;
      }
      closeExtendedTableCursors1US910( ) ;
   }

   public void update1US910( )
   {
      beforeValidate1US910( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1US910( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1US910( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1US910( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1US910( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01US18 */
                  pr_default.execute(16, new Object[] {Short.valueOf(A654OrdLin), Integer.valueOf(A6257SalExCoE), A6256SalExKgE, A6258SalExMtE, A6249SalExObs, A6250SalExFeR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A6255SalExMtR, A6558FasCodn, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEXHDPZ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1US910( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A2248ManCod ;
                        GXv_char3[0] = A6558FasCodn ;
                        GXv_char2[0] = httpContext.getMessage( "E", "") ;
                        GXv_int7[0] = A2253SalExtAlb ;
                        GXv_int8[0] = A129BarCod ;
                        GXv_int9[0] = A132BarCodReo ;
                        GXv_char10[0] = A130BarCodPar ;
                        GXv_decimal11[0] = A6256SalExKgE ;
                        GXv_decimal12[0] = AV18OldKg ;
                        GXv_decimal13[0] = A6258SalExMtE ;
                        GXv_decimal14[0] = AV19OldMt ;
                        GXv_int15[0] = (short)(A6257SalExCoE) ;
                        GXv_int16[0] = (short)(AV20OldPz) ;
                        GXv_date17[0] = A2256SalExtFec ;
                        GXv_int18[0] = A6248SalExNln ;
                        new app.pmmvexhd(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_int8, GXv_int9, GXv_char10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_int16, GXv_date17, GXv_int18) ;
                        trabajoexterno_detail_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        trabajoexterno_detail_trn_impl.this.A2248ManCod = GXv_int6[0] ;
                        trabajoexterno_detail_trn_impl.this.A6558FasCodn = GXv_char3[0] ;
                        trabajoexterno_detail_trn_impl.this.A2253SalExtAlb = GXv_int7[0] ;
                        trabajoexterno_detail_trn_impl.this.A129BarCod = GXv_int8[0] ;
                        trabajoexterno_detail_trn_impl.this.A132BarCodReo = GXv_int9[0] ;
                        trabajoexterno_detail_trn_impl.this.A130BarCodPar = GXv_char10[0] ;
                        trabajoexterno_detail_trn_impl.this.A6256SalExKgE = GXv_decimal11[0] ;
                        trabajoexterno_detail_trn_impl.this.AV18OldKg = GXv_decimal12[0] ;
                        trabajoexterno_detail_trn_impl.this.A6258SalExMtE = GXv_decimal13[0] ;
                        trabajoexterno_detail_trn_impl.this.AV19OldMt = GXv_decimal14[0] ;
                        trabajoexterno_detail_trn_impl.this.A6257SalExCoE = GXv_int15[0] ;
                        trabajoexterno_detail_trn_impl.this.AV20OldPz = GXv_int16[0] ;
                        trabajoexterno_detail_trn_impl.this.A2256SalExtFec = GXv_date17[0] ;
                        trabajoexterno_detail_trn_impl.this.A6248SalExNln = GXv_int18[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
                        httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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
         endLevel1US910( ) ;
      }
      closeExtendedTableCursors1US910( ) ;
   }

   public void deferredUpdate1US910( )
   {
   }

   public void delete( )
   {
      beforeValidate1US910( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1US910( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1US910( ) ;
         afterConfirm1US910( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1US910( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01US19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
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
      sMode910 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1US910( ) ;
      Gx_mode = sMode910 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1US910( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV20OldPz = O6257SalExCoE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
         AV18OldKg = O6256SalExKgE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
         AV19OldMt = O6258SalExMtE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
         /* Using cursor T01US20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T01US20_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01US20_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A1234BarNomCli = T01US20_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A2265BarExt = T01US20_A2265BarExt[0] ;
         n2265BarExt = T01US20_n2265BarExt[0] ;
         A213BarSit = T01US20_A213BarSit[0] ;
         A252CliCod = T01US20_A252CliCod[0] ;
         n252CliCod = T01US20_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(18);
         /* Using cursor T01US21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         A2256SalExtFec = T01US21_A2256SalExtFec[0] ;
         A6247SalExUln = T01US21_A6247SalExUln[0] ;
         A2248ManCod = T01US21_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         pr_default.close(19);
         /* Using cursor T01US22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01US22_A2249ManNom[0] ;
         n2249ManNom = T01US22_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(20);
      }
   }

   public void endLevel1US910( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1US910( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_detail_trn");
         if ( AnyError == 0 )
         {
            confirmValues1US0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_detail_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1US910( )
   {
      /* Scan By routine */
      /* Using cursor T01US23 */
      pr_default.execute(21);
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A396EmprCod = T01US23_A396EmprCod[0] ;
         A2253SalExtAlb = T01US23_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = T01US23_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1US910( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound910 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound910 = (short)(1) ;
         A396EmprCod = T01US23_A396EmprCod[0] ;
         A2253SalExtAlb = T01US23_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A6248SalExNln = T01US23_A6248SalExNln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      }
   }

   public void scanEnd1US910( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1US910( )
   {
      /* After Confirm Rules */
      if ( isUpd( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int18[0] = A2248ManCod ;
         GXv_int8[0] = A2253SalExtAlb ;
         GXv_int16[0] = A6248SalExNln ;
         GXv_date17[0] = A2256SalExtFec ;
         GXv_int7[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int15[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal14[0] = A6256SalExKgE ;
         GXv_decimal13[0] = A6258SalExMtE ;
         GXv_int19[0] = A6257SalExCoE ;
         new app.pwork11(remoteHandle, context).execute( GXv_char10, GXv_int18, GXv_int8, GXv_int16, GXv_date17, GXv_int7, GXv_int9, GXv_char4, GXv_int15, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_int19) ;
         trabajoexterno_detail_trn_impl.this.A396EmprCod = GXv_char10[0] ;
         trabajoexterno_detail_trn_impl.this.A2248ManCod = GXv_int18[0] ;
         trabajoexterno_detail_trn_impl.this.A2253SalExtAlb = GXv_int8[0] ;
         trabajoexterno_detail_trn_impl.this.A6248SalExNln = GXv_int16[0] ;
         trabajoexterno_detail_trn_impl.this.A2256SalExtFec = GXv_date17[0] ;
         trabajoexterno_detail_trn_impl.this.A129BarCod = GXv_int7[0] ;
         trabajoexterno_detail_trn_impl.this.A132BarCodReo = GXv_int9[0] ;
         trabajoexterno_detail_trn_impl.this.A130BarCodPar = GXv_char4[0] ;
         trabajoexterno_detail_trn_impl.this.A654OrdLin = GXv_int15[0] ;
         trabajoexterno_detail_trn_impl.this.A6558FasCodn = GXv_char3[0] ;
         trabajoexterno_detail_trn_impl.this.A6256SalExKgE = GXv_decimal14[0] ;
         trabajoexterno_detail_trn_impl.this.A6258SalExMtE = GXv_decimal13[0] ;
         trabajoexterno_detail_trn_impl.this.A6257SalExCoE = GXv_int19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
      }
   }

   public void beforeInsert1US910( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1US910( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1US910( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1US910( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1US910( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1US910( )
   {
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtSalExNln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExNln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExNln_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtFasCodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCodn_Enabled), 5, 0), true);
      edtOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdLin_Enabled), 5, 0), true);
      edtSalExCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExCoE_Enabled), 5, 0), true);
      edtSalExKgE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExKgE_Enabled), 5, 0), true);
      edtSalExMtE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExMtE_Enabled), 5, 0), true);
      edtSalExObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExObs_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1US910( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1US0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_detail_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9SalExNln,4,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb","SalExNln"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Detail_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV21Pgmname, "")));
      forbiddenHiddens.add("SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
      forbiddenHiddens.add("SalExKgR", localUtil.format( A6251SalExKgR, "ZZZZZ9.99"));
      forbiddenHiddens.add("SalExCoR", localUtil.format( DecimalUtil.doubleToDec(A6252SalExCoR), "ZZZZZ9"));
      forbiddenHiddens.add("SalExEsB", localUtil.format( DecimalUtil.doubleToDec(A6253SalExEsB), "9"));
      forbiddenHiddens.add("SalExEnt", GXutil.rtrim( localUtil.format( A6254SalExEnt, "")));
      forbiddenHiddens.add("SalExMtR", localUtil.format( A6255SalExMtR, "ZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_detail_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6248SalExNln", GXutil.ltrim( localUtil.ntoc( Z6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z654OrdLin", GXutil.ltrim( localUtil.ntoc( Z654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6257SalExCoE", GXutil.ltrim( localUtil.ntoc( Z6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6256SalExKgE", GXutil.ltrim( localUtil.ntoc( Z6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6258SalExMtE", GXutil.ltrim( localUtil.ntoc( Z6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6249SalExObs", GXutil.rtrim( Z6249SalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6250SalExFeR", localUtil.dtoc( Z6250SalExFeR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6251SalExKgR", GXutil.ltrim( localUtil.ntoc( Z6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6252SalExCoR", GXutil.ltrim( localUtil.ntoc( Z6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6253SalExEsB", GXutil.ltrim( localUtil.ntoc( Z6253SalExEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6254SalExEnt", GXutil.rtrim( Z6254SalExEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6255SalExMtR", GXutil.ltrim( localUtil.ntoc( Z6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6558FasCodn", GXutil.rtrim( Z6558FasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "O6257SalExCoE", GXutil.ltrim( localUtil.ntoc( O6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6258SalExMtE", GXutil.ltrim( localUtil.ntoc( O6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6256SalExKgE", GXutil.ltrim( localUtil.ntoc( O6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV8SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXNLN", GXutil.ltrim( localUtil.ntoc( AV9SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXNLN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9SalExNln), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV14Insert_BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_BARCODPAR", GXutil.rtrim( AV15Insert_BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCODN", GXutil.rtrim( AV16Insert_FasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDKG", GXutil.ltrim( localUtil.ntoc( AV18OldKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMT", GXutil.ltrim( localUtil.ntoc( AV19OldMt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPZ", GXutil.ltrim( localUtil.ntoc( AV20OldPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFEC", localUtil.dtoc( A2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXFER", localUtil.dtoc( A6250SalExFeR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXKGR", GXutil.ltrim( localUtil.ntoc( A6251SalExKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXCOR", GXutil.ltrim( localUtil.ntoc( A6252SalExCoR, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXESB", GXutil.ltrim( localUtil.ntoc( A6253SalExEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXENT", GXutil.rtrim( A6254SalExEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXMTR", GXutil.ltrim( localUtil.ntoc( A6255SalExMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXULN", GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trabajosexternos.trabajoexterno_detail_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9SalExNln,4,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb","SalExNln"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Detail_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajo Externo (Detail)", "") ;
   }

   public void initializeNonKey1US910( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A6558FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
      AV18OldKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
      AV19OldMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
      AV20OldPz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
      A2256SalExtFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A6247SalExUln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1234BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A2265BarExt = (byte)(0) ;
      n2265BarExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.str( A2265BarExt, 1, 0));
      A654OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
      A6257SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
      A6256SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
      A6258SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
      A6249SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6249SalExObs", A6249SalExObs);
      A6250SalExFeR = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6250SalExFeR", localUtil.format(A6250SalExFeR, "99/99/99"));
      A6251SalExKgR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6251SalExKgR", GXutil.ltrimstr( A6251SalExKgR, 9, 2));
      A6252SalExCoR = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6252SalExCoR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6252SalExCoR), 6, 0));
      A6253SalExEsB = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6253SalExEsB", GXutil.str( A6253SalExEsB, 1, 0));
      A6254SalExEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6254SalExEnt", A6254SalExEnt);
      A6255SalExMtR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6255SalExMtR", GXutil.ltrimstr( A6255SalExMtR, 9, 2));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      O6257SalExCoE = A6257SalExCoE ;
      httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
      O6258SalExMtE = A6258SalExMtE ;
      httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
      O6256SalExKgE = A6256SalExKgE ;
      httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
      Z654OrdLin = (short)(0) ;
      Z6257SalExCoE = 0 ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z6249SalExObs = "" ;
      Z6250SalExFeR = GXutil.nullDate() ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6252SalExCoR = 0 ;
      Z6253SalExEsB = (byte)(0) ;
      Z6254SalExEnt = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6558FasCodn = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1US910( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2253SalExtAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      A6248SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
      initializeNonKey1US910( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116104819", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_detail_trn.js", "?202682116104819", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      edtManCod_Internalname = "MANCOD" ;
      edtManNom_Internalname = "MANNOM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtSalExNln_Internalname = "SALEXNLN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtFasCodn_Internalname = "FASCODN" ;
      edtOrdLin_Internalname = "ORDLIN" ;
      edtSalExCoE_Internalname = "SALEXCOE" ;
      edtSalExKgE_Internalname = "SALEXKGE" ;
      edtSalExMtE_Internalname = "SALEXMTE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtSalExObs_Internalname = "SALEXOBS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( httpContext.getMessage( "Trabajo Externo (Detail)", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtSalExObs_Jsonclick = "" ;
      edtSalExObs_Enabled = 1 ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExMtE_Enabled = 1 ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExKgE_Enabled = 1 ;
      edtSalExCoE_Jsonclick = "" ;
      edtSalExCoE_Enabled = 1 ;
      edtOrdLin_Jsonclick = "" ;
      edtOrdLin_Enabled = 0 ;
      edtFasCodn_Jsonclick = "" ;
      edtFasCodn_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtSalExNln_Jsonclick = "" ;
      edtSalExNln_Enabled = 0 ;
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
      edtManNom_Jsonclick = "" ;
      edtManNom_Enabled = 0 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 0 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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

   public void xc_24_1US910( )
   {
      if ( true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int18[0] = A2248ManCod ;
         GXv_char4[0] = A6558FasCodn ;
         GXv_char3[0] = httpContext.getMessage( "E", "") ;
         GXv_int19[0] = A2253SalExtAlb ;
         GXv_int8[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal14[0] = A6256SalExKgE ;
         GXv_decimal13[0] = AV18OldKg ;
         GXv_decimal12[0] = A6258SalExMtE ;
         GXv_decimal11[0] = AV19OldMt ;
         GXv_int16[0] = (short)(A6257SalExCoE) ;
         GXv_int15[0] = (short)(AV20OldPz) ;
         GXv_date17[0] = A2256SalExtFec ;
         GXv_int6[0] = A6248SalExNln ;
         new app.pmmvexhd(remoteHandle, context).execute( GXv_char10, GXv_int18, GXv_char4, GXv_char3, GXv_int19, GXv_int8, GXv_int9, GXv_char2, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_int16, GXv_int15, GXv_date17, GXv_int6) ;
         A396EmprCod = GXv_char10[0] ;
         A2248ManCod = GXv_int18[0] ;
         A6558FasCodn = GXv_char4[0] ;
         A2253SalExtAlb = GXv_int19[0] ;
         A129BarCod = GXv_int8[0] ;
         A132BarCodReo = GXv_int9[0] ;
         A130BarCodPar = GXv_char2[0] ;
         A6256SalExKgE = GXv_decimal14[0] ;
         AV18OldKg = GXv_decimal13[0] ;
         A6258SalExMtE = GXv_decimal12[0] ;
         AV19OldMt = GXv_decimal11[0] ;
         A6257SalExCoE = GXv_int16[0] ;
         AV20OldPz = GXv_int15[0] ;
         A2256SalExtFec = GXv_date17[0] ;
         A6248SalExNln = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrimstr( AV18OldKg, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrimstr( AV19OldMt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OldPz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
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

   public void xc_25_1US910( String Gx_mode ,
                             String A396EmprCod ,
                             short A2248ManCod ,
                             int A2253SalExtAlb ,
                             short A6248SalExNln ,
                             java.util.Date A2256SalExtFec ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short A654OrdLin ,
                             String A6558FasCodn ,
                             java.math.BigDecimal A6256SalExKgE ,
                             java.math.BigDecimal A6258SalExMtE ,
                             int A6257SalExCoE )
   {
      if ( isUpd( )  && ! (GXutil.strcmp("", A6558FasCodn)==0) && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int18[0] = A2248ManCod ;
         GXv_int19[0] = A2253SalExtAlb ;
         GXv_int16[0] = A6248SalExNln ;
         GXv_date17[0] = A2256SalExtFec ;
         GXv_int8[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int15[0] = A654OrdLin ;
         GXv_char3[0] = A6558FasCodn ;
         GXv_decimal14[0] = A6256SalExKgE ;
         GXv_decimal13[0] = A6258SalExMtE ;
         GXv_int7[0] = A6257SalExCoE ;
         new app.pwork11(remoteHandle, context).execute( GXv_char10, GXv_int18, GXv_int19, GXv_int16, GXv_date17, GXv_int8, GXv_int9, GXv_char4, GXv_int15, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_int7) ;
         A396EmprCod = GXv_char10[0] ;
         A2248ManCod = GXv_int18[0] ;
         A2253SalExtAlb = GXv_int19[0] ;
         A6248SalExNln = GXv_int16[0] ;
         A2256SalExtFec = GXv_date17[0] ;
         A129BarCod = GXv_int8[0] ;
         A132BarCodReo = GXv_int9[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A654OrdLin = GXv_int15[0] ;
         A6558FasCodn = GXv_char3[0] ;
         A6256SalExKgE = GXv_decimal14[0] ;
         A6258SalExMtE = GXv_decimal13[0] ;
         A6257SalExCoE = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6248SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6248SalExNln), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A654OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A654OrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6558FasCodn", A6558FasCodn);
         httpContext.ajax_rsp_assign_attri("", false, "A6256SalExKgE", GXutil.ltrimstr( A6256SalExKgE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6258SalExMtE", GXutil.ltrimstr( A6258SalExMtE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A6257SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6257SalExCoE), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A2256SalExtFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6558FasCodn))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Salextalb( )
   {
      n2249ManNom = false ;
      /* Using cursor T01US21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CEXTSA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
      }
      A2256SalExtFec = T01US21_A2256SalExtFec[0] ;
      A6247SalExUln = T01US21_A6247SalExUln[0] ;
      A2248ManCod = T01US21_A2248ManCod[0] ;
      pr_default.close(19);
      /* Using cursor T01US22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
      }
      A2249ManNom = T01US22_A2249ManNom[0] ;
      n2249ManNom = T01US22_n2249ManNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Barcodpar( )
   {
      n2265BarExt = false ;
      n252CliCod = false ;
      /* Using cursor T01US20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01US20_A212BarSer[0] ;
      A135BarColNom = T01US20_A135BarColNom[0] ;
      A1234BarNomCli = T01US20_A1234BarNomCli[0] ;
      A2265BarExt = T01US20_A2265BarExt[0] ;
      n2265BarExt = T01US20_n2265BarExt[0] ;
      A213BarSit = T01US20_A213BarSit[0] ;
      A252CliCod = T01US20_A252CliCod[0] ;
      n252CliCod = T01US20_n252CliCod[0] ;
      pr_default.close(18);
      if ( A213BarSit >= 9 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta CERRADA", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Fascodn( )
   {
      /* Using cursor T01US24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A6558FasCodn});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCODN");
         AnyError = (short)(1) ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Salexcoe( )
   {
      AV20OldPz = O6257SalExCoE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV20OldPz", GXutil.ltrim( localUtil.ntoc( AV20OldPz, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Salexkge( )
   {
      AV18OldKg = O6256SalExKgE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18OldKg", GXutil.ltrim( localUtil.ntoc( AV18OldKg, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Salexmte( )
   {
      AV19OldMt = O6258SalExMtE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19OldMt", GXutil.ltrim( localUtil.ntoc( AV19OldMt, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV9SalExNln',fld:'vSALEXNLN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV9SalExNln',fld:'vSALEXNLN',pic:'ZZZ9',hsh:true},{av:'AV21Pgmname',fld:'vPGMNAME',pic:''},{av:'A6250SalExFeR',fld:'SALEXFER',pic:''},{av:'A6251SalExKgR',fld:'SALEXKGR',pic:'ZZZZZ9.99'},{av:'A6252SalExCoR',fld:'SALEXCOR',pic:'ZZZZZ9'},{av:'A6253SalExEsB',fld:'SALEXESB',pic:'9'},{av:'A6254SalExEnt',fld:'SALEXENT',pic:''},{av:'A6255SalExMtR',fld:'SALEXMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121US2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A6247SalExUln',fld:'SALEXULN',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A6247SalExUln',fld:'SALEXULN',pic:'ZZZ9'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[]");
      setEventMetadata("VALID_MANCOD",",oparms:[]}");
      setEventMetadata("VALID_SALEXNLN","{handler:'valid_Salexnln',iparms:[]");
      setEventMetadata("VALID_SALEXNLN",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_FASCODN","{handler:'valid_Fascodn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'}]");
      setEventMetadata("VALID_FASCODN",",oparms:[]}");
      setEventMetadata("VALID_ORDLIN","{handler:'valid_Ordlin',iparms:[]");
      setEventMetadata("VALID_ORDLIN",",oparms:[]}");
      setEventMetadata("VALID_SALEXCOE","{handler:'valid_Salexcoe',iparms:[{av:'O6257SalExCoE'},{av:'A6257SalExCoE',fld:'SALEXCOE',pic:'ZZZZZ9'},{av:'AV20OldPz',fld:'vOLDPZ',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_SALEXCOE",",oparms:[{av:'AV20OldPz',fld:'vOLDPZ',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_SALEXKGE","{handler:'valid_Salexkge',iparms:[{av:'O6256SalExKgE'},{av:'A6256SalExKgE',fld:'SALEXKGE',pic:'ZZZZZ9.99'},{av:'AV18OldKg',fld:'vOLDKG',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_SALEXKGE",",oparms:[{av:'AV18OldKg',fld:'vOLDKG',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_SALEXMTE","{handler:'valid_Salexmte',iparms:[{av:'O6258SalExMtE'},{av:'A6258SalExMtE',fld:'SALEXMTE',pic:'ZZZZZ9.99'},{av:'AV19OldMt',fld:'vOLDMT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_SALEXMTE",",oparms:[{av:'AV19OldMt',fld:'vOLDMT',pic:'ZZZZZ9.99'}]}");
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
      pr_default.close(22);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z6256SalExKgE = DecimalUtil.ZERO ;
      Z6258SalExMtE = DecimalUtil.ZERO ;
      Z6249SalExObs = "" ;
      Z6250SalExFeR = GXutil.nullDate() ;
      Z6251SalExKgR = DecimalUtil.ZERO ;
      Z6254SalExEnt = "" ;
      Z6255SalExMtR = DecimalUtil.ZERO ;
      Z6558FasCodn = "" ;
      Z130BarCodPar = "" ;
      O6258SalExMtE = DecimalUtil.ZERO ;
      O6256SalExKgE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A2249ManNom = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A6249SalExObs = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV21Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A6250SalExFeR = GXutil.nullDate() ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6254SalExEnt = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      AV15Insert_BarCodPar = "" ;
      AV16Insert_FasCodn = "" ;
      AV18OldKg = DecimalUtil.ZERO ;
      AV19OldMt = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode910 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV23Emprnom = "" ;
      AV24Usurcod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2249ManNom = "" ;
      T01US4_A407EmprNom = new String[] {""} ;
      T01US4_n407EmprNom = new boolean[] {false} ;
      T01US7_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01US7_A6247SalExUln = new short[1] ;
      T01US7_A2248ManCod = new short[1] ;
      T01US8_A2249ManNom = new String[] {""} ;
      T01US8_n2249ManNom = new boolean[] {false} ;
      T01US6_A212BarSer = new String[] {""} ;
      T01US6_A135BarColNom = new String[] {""} ;
      T01US6_A1234BarNomCli = new String[] {""} ;
      T01US6_A2265BarExt = new byte[1] ;
      T01US6_n2265BarExt = new boolean[] {false} ;
      T01US6_A213BarSit = new byte[1] ;
      T01US6_A252CliCod = new int[1] ;
      T01US6_n252CliCod = new boolean[] {false} ;
      T01US9_A6248SalExNln = new short[1] ;
      T01US9_A407EmprNom = new String[] {""} ;
      T01US9_n407EmprNom = new boolean[] {false} ;
      T01US9_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01US9_A6247SalExUln = new short[1] ;
      T01US9_A2249ManNom = new String[] {""} ;
      T01US9_n2249ManNom = new boolean[] {false} ;
      T01US9_A212BarSer = new String[] {""} ;
      T01US9_A135BarColNom = new String[] {""} ;
      T01US9_A1234BarNomCli = new String[] {""} ;
      T01US9_A2265BarExt = new byte[1] ;
      T01US9_n2265BarExt = new boolean[] {false} ;
      T01US9_A654OrdLin = new short[1] ;
      T01US9_A6257SalExCoE = new int[1] ;
      T01US9_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US9_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US9_A6249SalExObs = new String[] {""} ;
      T01US9_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01US9_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US9_A6252SalExCoR = new int[1] ;
      T01US9_A6253SalExEsB = new byte[1] ;
      T01US9_A6254SalExEnt = new String[] {""} ;
      T01US9_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US9_A213BarSit = new byte[1] ;
      T01US9_A396EmprCod = new String[] {""} ;
      T01US9_A6558FasCodn = new String[] {""} ;
      T01US9_A129BarCod = new int[1] ;
      T01US9_A132BarCodReo = new byte[1] ;
      T01US9_A130BarCodPar = new String[] {""} ;
      T01US9_A2253SalExtAlb = new int[1] ;
      T01US9_A252CliCod = new int[1] ;
      T01US9_n252CliCod = new boolean[] {false} ;
      T01US9_A2248ManCod = new short[1] ;
      T01US5_A457FasCod = new String[] {""} ;
      T01US10_A457FasCod = new String[] {""} ;
      T01US11_A212BarSer = new String[] {""} ;
      T01US11_A135BarColNom = new String[] {""} ;
      T01US11_A1234BarNomCli = new String[] {""} ;
      T01US11_A2265BarExt = new byte[1] ;
      T01US11_n2265BarExt = new boolean[] {false} ;
      T01US11_A213BarSit = new byte[1] ;
      T01US11_A252CliCod = new int[1] ;
      T01US11_n252CliCod = new boolean[] {false} ;
      T01US12_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01US12_A6247SalExUln = new short[1] ;
      T01US12_A2248ManCod = new short[1] ;
      T01US13_A2249ManNom = new String[] {""} ;
      T01US13_n2249ManNom = new boolean[] {false} ;
      T01US14_A396EmprCod = new String[] {""} ;
      T01US14_A2253SalExtAlb = new int[1] ;
      T01US14_A6248SalExNln = new short[1] ;
      T01US3_A6248SalExNln = new short[1] ;
      T01US3_A654OrdLin = new short[1] ;
      T01US3_A6257SalExCoE = new int[1] ;
      T01US3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US3_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US3_A6249SalExObs = new String[] {""} ;
      T01US3_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01US3_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US3_A6252SalExCoR = new int[1] ;
      T01US3_A6253SalExEsB = new byte[1] ;
      T01US3_A6254SalExEnt = new String[] {""} ;
      T01US3_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US3_A396EmprCod = new String[] {""} ;
      T01US3_A6558FasCodn = new String[] {""} ;
      T01US3_A129BarCod = new int[1] ;
      T01US3_A132BarCodReo = new byte[1] ;
      T01US3_A130BarCodPar = new String[] {""} ;
      T01US3_A2253SalExtAlb = new int[1] ;
      T01US15_A6248SalExNln = new short[1] ;
      T01US15_A396EmprCod = new String[] {""} ;
      T01US15_A2253SalExtAlb = new int[1] ;
      T01US16_A6248SalExNln = new short[1] ;
      T01US16_A396EmprCod = new String[] {""} ;
      T01US16_A2253SalExtAlb = new int[1] ;
      T01US2_A6248SalExNln = new short[1] ;
      T01US2_A654OrdLin = new short[1] ;
      T01US2_A6257SalExCoE = new int[1] ;
      T01US2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US2_A6249SalExObs = new String[] {""} ;
      T01US2_A6250SalExFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T01US2_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US2_A6252SalExCoR = new int[1] ;
      T01US2_A6253SalExEsB = new byte[1] ;
      T01US2_A6254SalExEnt = new String[] {""} ;
      T01US2_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01US2_A396EmprCod = new String[] {""} ;
      T01US2_A6558FasCodn = new String[] {""} ;
      T01US2_A129BarCod = new int[1] ;
      T01US2_A132BarCodReo = new byte[1] ;
      T01US2_A130BarCodPar = new String[] {""} ;
      T01US2_A2253SalExtAlb = new int[1] ;
      T01US20_A212BarSer = new String[] {""} ;
      T01US20_A135BarColNom = new String[] {""} ;
      T01US20_A1234BarNomCli = new String[] {""} ;
      T01US20_A2265BarExt = new byte[1] ;
      T01US20_n2265BarExt = new boolean[] {false} ;
      T01US20_A213BarSit = new byte[1] ;
      T01US20_A252CliCod = new int[1] ;
      T01US20_n252CliCod = new boolean[] {false} ;
      T01US21_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01US21_A6247SalExUln = new short[1] ;
      T01US21_A2248ManCod = new short[1] ;
      T01US22_A2249ManNom = new String[] {""} ;
      T01US22_n2249ManNom = new boolean[] {false} ;
      T01US23_A396EmprCod = new String[] {""} ;
      T01US23_A2253SalExtAlb = new int[1] ;
      T01US23_A6248SalExNln = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A457FasCod = "" ;
      GXv_char2 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int6 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new int[1] ;
      GXv_int16 = new short[1] ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      T01US24_A457FasCod = new String[] {""} ;
      ZV18OldKg = DecimalUtil.ZERO ;
      ZV19OldMt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_trn__default(),
         new Object[] {
             new Object[] {
            T01US2_A6248SalExNln, T01US2_A654OrdLin, T01US2_A6257SalExCoE, T01US2_A6256SalExKgE, T01US2_A6258SalExMtE, T01US2_A6249SalExObs, T01US2_A6250SalExFeR, T01US2_A6251SalExKgR, T01US2_A6252SalExCoR, T01US2_A6253SalExEsB,
            T01US2_A6254SalExEnt, T01US2_A6255SalExMtR, T01US2_A396EmprCod, T01US2_A6558FasCodn, T01US2_A129BarCod, T01US2_A132BarCodReo, T01US2_A130BarCodPar, T01US2_A2253SalExtAlb
            }
            , new Object[] {
            T01US3_A6248SalExNln, T01US3_A654OrdLin, T01US3_A6257SalExCoE, T01US3_A6256SalExKgE, T01US3_A6258SalExMtE, T01US3_A6249SalExObs, T01US3_A6250SalExFeR, T01US3_A6251SalExKgR, T01US3_A6252SalExCoR, T01US3_A6253SalExEsB,
            T01US3_A6254SalExEnt, T01US3_A6255SalExMtR, T01US3_A396EmprCod, T01US3_A6558FasCodn, T01US3_A129BarCod, T01US3_A132BarCodReo, T01US3_A130BarCodPar, T01US3_A2253SalExtAlb
            }
            , new Object[] {
            T01US4_A407EmprNom, T01US4_n407EmprNom
            }
            , new Object[] {
            T01US5_A457FasCod
            }
            , new Object[] {
            T01US6_A212BarSer, T01US6_A135BarColNom, T01US6_A1234BarNomCli, T01US6_A2265BarExt, T01US6_n2265BarExt, T01US6_A213BarSit, T01US6_A252CliCod, T01US6_n252CliCod
            }
            , new Object[] {
            T01US7_A2256SalExtFec, T01US7_A6247SalExUln, T01US7_A2248ManCod
            }
            , new Object[] {
            T01US8_A2249ManNom, T01US8_n2249ManNom
            }
            , new Object[] {
            T01US9_A6248SalExNln, T01US9_A407EmprNom, T01US9_n407EmprNom, T01US9_A2256SalExtFec, T01US9_A6247SalExUln, T01US9_A2249ManNom, T01US9_n2249ManNom, T01US9_A212BarSer, T01US9_A135BarColNom, T01US9_A1234BarNomCli,
            T01US9_A2265BarExt, T01US9_n2265BarExt, T01US9_A654OrdLin, T01US9_A6257SalExCoE, T01US9_A6256SalExKgE, T01US9_A6258SalExMtE, T01US9_A6249SalExObs, T01US9_A6250SalExFeR, T01US9_A6251SalExKgR, T01US9_A6252SalExCoR,
            T01US9_A6253SalExEsB, T01US9_A6254SalExEnt, T01US9_A6255SalExMtR, T01US9_A213BarSit, T01US9_A396EmprCod, T01US9_A6558FasCodn, T01US9_A129BarCod, T01US9_A132BarCodReo, T01US9_A130BarCodPar, T01US9_A2253SalExtAlb,
            T01US9_A252CliCod, T01US9_n252CliCod, T01US9_A2248ManCod
            }
            , new Object[] {
            T01US10_A457FasCod
            }
            , new Object[] {
            T01US11_A212BarSer, T01US11_A135BarColNom, T01US11_A1234BarNomCli, T01US11_A2265BarExt, T01US11_n2265BarExt, T01US11_A213BarSit, T01US11_A252CliCod, T01US11_n252CliCod
            }
            , new Object[] {
            T01US12_A2256SalExtFec, T01US12_A6247SalExUln, T01US12_A2248ManCod
            }
            , new Object[] {
            T01US13_A2249ManNom, T01US13_n2249ManNom
            }
            , new Object[] {
            T01US14_A396EmprCod, T01US14_A2253SalExtAlb, T01US14_A6248SalExNln
            }
            , new Object[] {
            T01US15_A6248SalExNln, T01US15_A396EmprCod, T01US15_A2253SalExtAlb
            }
            , new Object[] {
            T01US16_A6248SalExNln, T01US16_A396EmprCod, T01US16_A2253SalExtAlb
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01US20_A212BarSer, T01US20_A135BarColNom, T01US20_A1234BarNomCli, T01US20_A2265BarExt, T01US20_n2265BarExt, T01US20_A213BarSit, T01US20_A252CliCod, T01US20_n252CliCod
            }
            , new Object[] {
            T01US21_A2256SalExtFec, T01US21_A6247SalExUln, T01US21_A2248ManCod
            }
            , new Object[] {
            T01US22_A2249ManNom, T01US22_n2249ManNom
            }
            , new Object[] {
            T01US23_A396EmprCod, T01US23_A2253SalExtAlb, T01US23_A6248SalExNln
            }
            , new Object[] {
            T01US24_A457FasCod
            }
         }
      );
      AV21Pgmname = "TrabajosExternos.TrabajoExterno_Detail_TRN" ;
   }

   private byte Z6253SalExEsB ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A6253SalExEsB ;
   private byte AV14Insert_BarCodReo ;
   private byte A213BarSit ;
   private byte A2265BarExt ;
   private byte Z2265BarExt ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int9[] ;
   private short wcpOAV9SalExNln ;
   private short Z6248SalExNln ;
   private short Z654OrdLin ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short AV9SalExNln ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6247SalExUln ;
   private short RcdFound910 ;
   private short Z6247SalExUln ;
   private short Z2248ManCod ;
   private short nIsDirty_910 ;
   private short GXv_int6[] ;
   private short GXv_int18[] ;
   private short GXv_int16[] ;
   private short GXv_int15[] ;
   private int wcpOAV8SalExtAlb ;
   private int Z2253SalExtAlb ;
   private int Z6257SalExCoE ;
   private int Z6252SalExCoR ;
   private int Z129BarCod ;
   private int O6257SalExCoE ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int A6257SalExCoE ;
   private int AV8SalExtAlb ;
   private int trnEnded ;
   private int edtSalExtAlb_Enabled ;
   private int edtManCod_Enabled ;
   private int edtManNom_Enabled ;
   private int edtSalExNln_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtFasCodn_Enabled ;
   private int edtOrdLin_Enabled ;
   private int edtSalExCoE_Enabled ;
   private int edtSalExKgE_Enabled ;
   private int edtSalExMtE_Enabled ;
   private int edtSalExObs_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int A6252SalExCoR ;
   private int AV13Insert_BarCod ;
   private int AV20OldPz ;
   private int Datamonjs_Gxcontroltype ;
   private int AV25GXV1 ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private int GXv_int19[] ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int ZV20OldPz ;
   private java.math.BigDecimal Z6256SalExKgE ;
   private java.math.BigDecimal Z6258SalExMtE ;
   private java.math.BigDecimal Z6251SalExKgR ;
   private java.math.BigDecimal Z6255SalExMtR ;
   private java.math.BigDecimal O6258SalExMtE ;
   private java.math.BigDecimal O6256SalExKgE ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal AV18OldKg ;
   private java.math.BigDecimal AV19OldMt ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal ZV18OldKg ;
   private java.math.BigDecimal ZV19OldMt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z6249SalExObs ;
   private String Z6254SalExEnt ;
   private String Z6558FasCodn ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6558FasCodn ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSalExtAlb_Internalname ;
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
   private String divUnnamedtable5_Internalname ;
   private String TempTags ;
   private String edtSalExtAlb_Jsonclick ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtSalExNln_Internalname ;
   private String edtSalExNln_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtFasCodn_Internalname ;
   private String edtFasCodn_Jsonclick ;
   private String edtOrdLin_Internalname ;
   private String edtOrdLin_Jsonclick ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExMtE_Internalname ;
   private String edtSalExMtE_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtSalExObs_Internalname ;
   private String A6249SalExObs ;
   private String edtSalExObs_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A6254SalExEnt ;
   private String AV15Insert_BarCodPar ;
   private String AV16Insert_FasCodn ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode910 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV23Emprnom ;
   private String AV24Usurcod ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String Z2249ManNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A457FasCod ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z6250SalExFeR ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A6250SalExFeR ;
   private java.util.Date Z2256SalExtFec ;
   private java.util.Date GXv_date17[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n2265BarExt ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n2249ManNom ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01US4_A407EmprNom ;
   private boolean[] T01US4_n407EmprNom ;
   private java.util.Date[] T01US7_A2256SalExtFec ;
   private short[] T01US7_A6247SalExUln ;
   private short[] T01US7_A2248ManCod ;
   private String[] T01US8_A2249ManNom ;
   private boolean[] T01US8_n2249ManNom ;
   private String[] T01US6_A212BarSer ;
   private String[] T01US6_A135BarColNom ;
   private String[] T01US6_A1234BarNomCli ;
   private byte[] T01US6_A2265BarExt ;
   private boolean[] T01US6_n2265BarExt ;
   private byte[] T01US6_A213BarSit ;
   private int[] T01US6_A252CliCod ;
   private boolean[] T01US6_n252CliCod ;
   private short[] T01US9_A6248SalExNln ;
   private String[] T01US9_A407EmprNom ;
   private boolean[] T01US9_n407EmprNom ;
   private java.util.Date[] T01US9_A2256SalExtFec ;
   private short[] T01US9_A6247SalExUln ;
   private String[] T01US9_A2249ManNom ;
   private boolean[] T01US9_n2249ManNom ;
   private String[] T01US9_A212BarSer ;
   private String[] T01US9_A135BarColNom ;
   private String[] T01US9_A1234BarNomCli ;
   private byte[] T01US9_A2265BarExt ;
   private boolean[] T01US9_n2265BarExt ;
   private short[] T01US9_A654OrdLin ;
   private int[] T01US9_A6257SalExCoE ;
   private java.math.BigDecimal[] T01US9_A6256SalExKgE ;
   private java.math.BigDecimal[] T01US9_A6258SalExMtE ;
   private String[] T01US9_A6249SalExObs ;
   private java.util.Date[] T01US9_A6250SalExFeR ;
   private java.math.BigDecimal[] T01US9_A6251SalExKgR ;
   private int[] T01US9_A6252SalExCoR ;
   private byte[] T01US9_A6253SalExEsB ;
   private String[] T01US9_A6254SalExEnt ;
   private java.math.BigDecimal[] T01US9_A6255SalExMtR ;
   private byte[] T01US9_A213BarSit ;
   private String[] T01US9_A396EmprCod ;
   private String[] T01US9_A6558FasCodn ;
   private int[] T01US9_A129BarCod ;
   private byte[] T01US9_A132BarCodReo ;
   private String[] T01US9_A130BarCodPar ;
   private int[] T01US9_A2253SalExtAlb ;
   private int[] T01US9_A252CliCod ;
   private boolean[] T01US9_n252CliCod ;
   private short[] T01US9_A2248ManCod ;
   private String[] T01US5_A457FasCod ;
   private String[] T01US10_A457FasCod ;
   private String[] T01US11_A212BarSer ;
   private String[] T01US11_A135BarColNom ;
   private String[] T01US11_A1234BarNomCli ;
   private byte[] T01US11_A2265BarExt ;
   private boolean[] T01US11_n2265BarExt ;
   private byte[] T01US11_A213BarSit ;
   private int[] T01US11_A252CliCod ;
   private boolean[] T01US11_n252CliCod ;
   private java.util.Date[] T01US12_A2256SalExtFec ;
   private short[] T01US12_A6247SalExUln ;
   private short[] T01US12_A2248ManCod ;
   private String[] T01US13_A2249ManNom ;
   private boolean[] T01US13_n2249ManNom ;
   private String[] T01US14_A396EmprCod ;
   private int[] T01US14_A2253SalExtAlb ;
   private short[] T01US14_A6248SalExNln ;
   private short[] T01US3_A6248SalExNln ;
   private short[] T01US3_A654OrdLin ;
   private int[] T01US3_A6257SalExCoE ;
   private java.math.BigDecimal[] T01US3_A6256SalExKgE ;
   private java.math.BigDecimal[] T01US3_A6258SalExMtE ;
   private String[] T01US3_A6249SalExObs ;
   private java.util.Date[] T01US3_A6250SalExFeR ;
   private java.math.BigDecimal[] T01US3_A6251SalExKgR ;
   private int[] T01US3_A6252SalExCoR ;
   private byte[] T01US3_A6253SalExEsB ;
   private String[] T01US3_A6254SalExEnt ;
   private java.math.BigDecimal[] T01US3_A6255SalExMtR ;
   private String[] T01US3_A396EmprCod ;
   private String[] T01US3_A6558FasCodn ;
   private int[] T01US3_A129BarCod ;
   private byte[] T01US3_A132BarCodReo ;
   private String[] T01US3_A130BarCodPar ;
   private int[] T01US3_A2253SalExtAlb ;
   private short[] T01US15_A6248SalExNln ;
   private String[] T01US15_A396EmprCod ;
   private int[] T01US15_A2253SalExtAlb ;
   private short[] T01US16_A6248SalExNln ;
   private String[] T01US16_A396EmprCod ;
   private int[] T01US16_A2253SalExtAlb ;
   private short[] T01US2_A6248SalExNln ;
   private short[] T01US2_A654OrdLin ;
   private int[] T01US2_A6257SalExCoE ;
   private java.math.BigDecimal[] T01US2_A6256SalExKgE ;
   private java.math.BigDecimal[] T01US2_A6258SalExMtE ;
   private String[] T01US2_A6249SalExObs ;
   private java.util.Date[] T01US2_A6250SalExFeR ;
   private java.math.BigDecimal[] T01US2_A6251SalExKgR ;
   private int[] T01US2_A6252SalExCoR ;
   private byte[] T01US2_A6253SalExEsB ;
   private String[] T01US2_A6254SalExEnt ;
   private java.math.BigDecimal[] T01US2_A6255SalExMtR ;
   private String[] T01US2_A396EmprCod ;
   private String[] T01US2_A6558FasCodn ;
   private int[] T01US2_A129BarCod ;
   private byte[] T01US2_A132BarCodReo ;
   private String[] T01US2_A130BarCodPar ;
   private int[] T01US2_A2253SalExtAlb ;
   private String[] T01US20_A212BarSer ;
   private String[] T01US20_A135BarColNom ;
   private String[] T01US20_A1234BarNomCli ;
   private byte[] T01US20_A2265BarExt ;
   private boolean[] T01US20_n2265BarExt ;
   private byte[] T01US20_A213BarSit ;
   private int[] T01US20_A252CliCod ;
   private boolean[] T01US20_n252CliCod ;
   private java.util.Date[] T01US21_A2256SalExtFec ;
   private short[] T01US21_A6247SalExUln ;
   private short[] T01US21_A2248ManCod ;
   private String[] T01US22_A2249ManNom ;
   private boolean[] T01US22_n2249ManNom ;
   private String[] T01US23_A396EmprCod ;
   private int[] T01US23_A2253SalExtAlb ;
   private short[] T01US23_A6248SalExNln ;
   private String[] T01US24_A457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV17TrnContextAtt ;
}

final  class trabajoexterno_detail_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_detail_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_detail_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_detail_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_detail_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01US2", "SELECT SalExNln, OrdLin, SalExCoE, SalExKgE, SalExMtE, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?  FOR UPDATE OF OrdLin, SalExCoE, SalExKgE, SalExMtE, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, FasCodn, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US3", "SELECT SalExNln, OrdLin, SalExCoE, SalExKgE, SalExMtE, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US5", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US6", "SELECT BarSer, BarColNom, BarNomCli, BarExt, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US7", "SELECT SalExtFec, SalExUln, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US8", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US9", "SELECT /*+ FIRST_ROWS(100) */ TM1.SalExNln, T2.EmprNom, T4.SalExtFec, T4.SalExUln, T5.ManNom, T3.BarSer, T3.BarColNom, T3.BarNomCli, T3.BarExt, TM1.OrdLin, TM1.SalExCoE, TM1.SalExKgE, TM1.SalExMtE, TM1.SalExObs, TM1.SalExFeR, TM1.SalExKgR, TM1.SalExCoR, TM1.SalExEsB, TM1.SalExEnt, TM1.SalExMtR, T3.BarSit, TM1.EmprCod, TM1.FasCodn, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.SalExtAlb, T3.CliCod, T4.ManCod FROM ((((TXPEXHDPZ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) INNER JOIN TXPCEXTSA T4 ON T4.EmprCod = TM1.EmprCod AND T4.SalExtAlb = TM1.SalExtAlb) LEFT JOIN TXPMANUFA T5 ON T5.EmprCod = TM1.EmprCod AND T5.ManCod = T4.ManCod) WHERE TM1.EmprCod = ? and TM1.SalExtAlb = ? and TM1.SalExNln = ? ORDER BY TM1.EmprCod, TM1.SalExtAlb, TM1.SalExNln ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US10", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US11", "SELECT BarSer, BarColNom, BarNomCli, BarExt, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US12", "SELECT SalExtFec, SalExUln, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US13", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SalExNln, EmprCod, SalExtAlb FROM TXPEXHDPZ WHERE ( SalExNln > ? or SalExNln = ? and EmprCod > ? or EmprCod = ? and SalExNln = ? and SalExtAlb > ?) ORDER BY EmprCod, SalExtAlb, SalExNln) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01US16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ SalExNln, EmprCod, SalExtAlb FROM TXPEXHDPZ WHERE ( SalExNln < ? or SalExNln = ? and EmprCod < ? or EmprCod = ? and SalExNln = ? and SalExtAlb < ?) ORDER BY EmprCod DESC, SalExtAlb DESC, SalExNln DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01US17", "INSERT INTO TXPEXHDPZ(SalExNln, OrdLin, SalExCoE, SalExKgE, SalExMtE, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, EmprCod, FasCodn, BarCod, BarCodReo, BarCodPar, SalExtAlb, ObsM, FasDscMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01US18", "UPDATE TXPEXHDPZ SET OrdLin=?, SalExCoE=?, SalExKgE=?, SalExMtE=?, SalExObs=?, SalExFeR=?, SalExKgR=?, SalExCoR=?, SalExEsB=?, SalExEnt=?, SalExMtR=?, FasCodn=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new UpdateCursor("T01US19", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK, "TXPEXHDPZ")
         ,new ForEachCursor("T01US20", "SELECT BarSer, BarColNom, BarNomCli, BarExt, BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US21", "SELECT SalExtFec, SalExUln, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US22", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ ORDER BY EmprCod, SalExtAlb, SalExNln ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01US24", "SELECT FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[16])[0] = rslt.getString(14, 40);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(15);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 3);
               ((String[]) buf[25])[0] = rslt.getString(23, 8);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 1);
               ((int[]) buf[29])[0] = rslt.getInt(27);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(29);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 40);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 8);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 40);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

