package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class productosalternativos_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1RR29( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A680PrdAltNum = httpContext.GetPar( "PrdAltNum") ;
         A678PrdAltFac = CommonUtil.decimalVal( httpContext.GetPar( "PrdAltFac"), ".") ;
         A11718PrdAltCam = (byte)(GXutil.lval( httpContext.GetPar( "PrdAltCam"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1RR78( A396EmprCod, A719PrdNum, A680PrdAltNum, A678PrdAltFac, A11718PrdAltCam) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A680PrdAltNum = httpContext.GetPar( "PrdAltNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_18_1RR78( A396EmprCod, A719PrdNum, A680PrdAltNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Gx_msg = httpContext.GetPar( "Gx_msg") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         A11718PrdAltCam = (byte)(GXutil.lval( httpContext.GetPar( "PrdAltCam"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_1RR78( A396EmprCod, A719PrdNum, Gx_msg, A11718PrdAltCam) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"PRVALTNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A778PrvAltNum = (int)(GXutil.lval( httpContext.GetPar( "PrvAltNum"))) ;
         n778PrvAltNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asaprvaltnom1RR78( A396EmprCod, A778PrvAltNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A680PrdAltNum = httpContext.GetPar( "PrdAltNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A680PrdAltNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_productos") == 0 )
      {
         gxnrgridlevel_productos_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV13EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
            AV14PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14PrdNum", AV14PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14PrdNum, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos Alternativos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_productos_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_productos_newrow( ) ;
      /* End function gxnrGridlevel_productos_newrow_invoke */
   }

   public productosalternativos_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public productosalternativos_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_trn_impl.class ));
   }

   public productosalternativos_trn_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrdAltCam = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_productos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_productos( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV19Pgmname), GXutil.rtrim( localUtil.format( AV19Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProductosAlternativos_TRN.htm");
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
      ucCombo_prdaltnum.setProperty("Caption", Combo_prdaltnum_Caption);
      ucCombo_prdaltnum.setProperty("Cls", Combo_prdaltnum_Cls);
      ucCombo_prdaltnum.setProperty("IsGridItem", Combo_prdaltnum_Isgriditem);
      ucCombo_prdaltnum.setProperty("EmptyItem", Combo_prdaltnum_Emptyitem);
      ucCombo_prdaltnum.setProperty("DropDownOptionsData", AV15PrdAltNum_Data);
      ucCombo_prdaltnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdaltnum_Internalname, "COMBO_PRDALTNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_productos( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount78 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_78 = (short)(1) ;
            scanStart1RR78( ) ;
            while ( RcdFound78 != 0 )
            {
               init_level_properties78( ) ;
               getByPrimaryKey1RR78( ) ;
               addRow1RR78( ) ;
               scanNext1RR78( ) ;
            }
            scanEnd1RR78( ) ;
            nBlankRcdCount78 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RR78( ) ;
         standaloneModal1RR78( ) ;
         sMode78 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1RR78( ) ;
            edtPrdAltNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrvAltNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVALTNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrvAltNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVALTNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrdAltFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTFAC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdAltFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltFac_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            chkPrdAltCam.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTCAM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkPrdAltCam.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdAltCam.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtFindPrdAlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDPRDALT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFindPrdAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindPrdAlt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_78 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RR78( ) ;
            }
            sendRow1RR78( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode78 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount78 = (short)(5) ;
         nRcdExists_78 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RR78( ) ;
            while ( RcdFound78 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3278( ) ;
               init_level_properties78( ) ;
               standaloneNotModal1RR78( ) ;
               getByPrimaryKey1RR78( ) ;
               standaloneModal1RR78( ) ;
               addRow1RR78( ) ;
               scanNext1RR78( ) ;
            }
            scanEnd1RR78( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode78 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3278( ) ;
         initAll1RR78( ) ;
         init_level_properties78( ) ;
         nRcdExists_78 = (short)(0) ;
         nIsMod_78 = (short)(0) ;
         nRcdDeleted_78 = (short)(0) ;
         nBlankRcdCount78 = (short)(nBlankRcdUsr78+nBlankRcdCount78) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount78 > 0 )
         {
            standaloneNotModal1RR78( ) ;
            standaloneModal1RR78( ) ;
            addRow1RR78( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdAltNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount78 = (short)(nBlankRcdCount78-1) ;
         }
         Gx_mode = sMode78 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_productosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_productos", Gridlevel_productosContainer, subGridlevel_productos_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productosContainerData", Gridlevel_productosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productosContainerData"+"V", Gridlevel_productosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_productosContainerData"+"V"+"\" value='"+Gridlevel_productosContainer.GridValuesHidden()+"'/>") ;
      }
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
      e111RR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDALTNUM_DATA"), AV15PrdAltNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV14PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A679PrdAltNom = httpContext.cgiGet( "PRDALTNOM") ;
            n679PrdAltNom = false ;
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
            Combo_prdaltnum_Objectcall = httpContext.cgiGet( "COMBO_PRDALTNUM_Objectcall") ;
            Combo_prdaltnum_Class = httpContext.cgiGet( "COMBO_PRDALTNUM_Class") ;
            Combo_prdaltnum_Icontype = httpContext.cgiGet( "COMBO_PRDALTNUM_Icontype") ;
            Combo_prdaltnum_Icon = httpContext.cgiGet( "COMBO_PRDALTNUM_Icon") ;
            Combo_prdaltnum_Caption = httpContext.cgiGet( "COMBO_PRDALTNUM_Caption") ;
            Combo_prdaltnum_Tooltip = httpContext.cgiGet( "COMBO_PRDALTNUM_Tooltip") ;
            Combo_prdaltnum_Cls = httpContext.cgiGet( "COMBO_PRDALTNUM_Cls") ;
            Combo_prdaltnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDALTNUM_Selectedvalue_set") ;
            Combo_prdaltnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDALTNUM_Selectedvalue_get") ;
            Combo_prdaltnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDALTNUM_Selectedtext_set") ;
            Combo_prdaltnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDALTNUM_Selectedtext_get") ;
            Combo_prdaltnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDALTNUM_Gamoauthtoken") ;
            Combo_prdaltnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDALTNUM_Ddointernalname") ;
            Combo_prdaltnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDALTNUM_Titlecontrolalign") ;
            Combo_prdaltnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDALTNUM_Dropdownoptionstype") ;
            Combo_prdaltnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Enabled")) ;
            Combo_prdaltnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Visible")) ;
            Combo_prdaltnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDALTNUM_Titlecontrolidtoreplace") ;
            Combo_prdaltnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDALTNUM_Datalisttype") ;
            Combo_prdaltnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Allowmultipleselection")) ;
            Combo_prdaltnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDALTNUM_Datalistfixedvalues") ;
            Combo_prdaltnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Isgriditem")) ;
            Combo_prdaltnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Hasdescription")) ;
            Combo_prdaltnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDALTNUM_Datalistproc") ;
            Combo_prdaltnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDALTNUM_Datalistprocparametersprefix") ;
            Combo_prdaltnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDALTNUM_Remoteservicesparameters") ;
            Combo_prdaltnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDALTNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdaltnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Includeonlyselectedoption")) ;
            Combo_prdaltnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Includeselectalloption")) ;
            Combo_prdaltnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Emptyitem")) ;
            Combo_prdaltnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDALTNUM_Includeaddnewoption")) ;
            Combo_prdaltnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDALTNUM_Htmltemplate") ;
            Combo_prdaltnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDALTNUM_Multiplevaluestype") ;
            Combo_prdaltnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDALTNUM_Loadingdata") ;
            Combo_prdaltnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDALTNUM_Noresultsfound") ;
            Combo_prdaltnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDALTNUM_Emptyitemtext") ;
            Combo_prdaltnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDALTNUM_Onlyselectedvalues") ;
            Combo_prdaltnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDALTNUM_Selectalltext") ;
            Combo_prdaltnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDALTNUM_Multiplevaluesseparator") ;
            Combo_prdaltnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDALTNUM_Addnewoptiontext") ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            AV19Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ProductosAlternativos_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            forbiddenHiddens.add("PrdNom", GXutil.rtrim( localUtil.format( A718PrdNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\productosalternativos_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                  sMode29 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode29 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound29 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RR0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
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
                        e111RR2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RR2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         e121RR2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RR29( ) ;
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
         disableAttributes1RR29( ) ;
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

   public void confirm_1RR0( )
   {
      beforeValidate1RR29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RR29( ) ;
         }
         else
         {
            checkExtendedTable1RR29( ) ;
            closeExtendedTableCursors1RR29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1RR78( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode29 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1RR78( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1RR78( ) ;
         if ( ( nRcdExists_78 != 0 ) || ( nIsMod_78 != 0 ) )
         {
            getKey1RR78( ) ;
            if ( ( nRcdExists_78 == 0 ) && ( nRcdDeleted_78 == 0 ) )
            {
               if ( RcdFound78 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RR78( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RR78( ) ;
                     closeExtendedTableCursors1RR78( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdAltNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound78 != 0 )
               {
                  if ( nRcdDeleted_78 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RR78( ) ;
                     load1RR78( ) ;
                     beforeValidate1RR78( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RR78( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_78 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RR78( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RR78( ) ;
                           closeExtendedTableCursors1RR78( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_78 == 0 )
                  {
                     GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdAltNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdAltNum_Internalname, GXutil.rtrim( A680PrdAltNum)) ;
         httpContext.changePostValue( edtPrvAltNum_Internalname, GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvAltNom_Internalname, GXutil.rtrim( A777PrvAltNom)) ;
         httpContext.changePostValue( edtPrdAltFac_Internalname, GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkPrdAltCam.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11718PrdAltCam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindPrdAlt_Internalname, GXutil.rtrim( A476FindPrdAlt)) ;
         httpContext.changePostValue( "ZT_"+"Z680PrdAltNum_"+sGXsfl_32_idx, GXutil.rtrim( Z680PrdAltNum)) ;
         httpContext.changePostValue( "ZT_"+"Z678PrdAltFac_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11718PrdAltCam_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z11718PrdAltCam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_78 != 0 )
         {
            httpContext.changePostValue( "PRDALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVALTNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDALTFAC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDALTCAM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdAltCam.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDPRDALT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindPrdAlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RR0( )
   {
   }

   public void e111RR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      productosalternativos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV21Emprnom ;
      GXv_char4[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      productosalternativos_trn_impl.this.AV13EmprCod = GXv_char2[0] ;
      productosalternativos_trn_impl.this.AV21Emprnom = GXv_char3[0] ;
      productosalternativos_trn_impl.this.AV22Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21Emprnom", AV21Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Usurcod", AV22Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_prdaltnum_Titlecontrolidtoreplace = edtPrdAltNum_Internalname ;
      ucCombo_prdaltnum.sendProperty(context, "", false, Combo_prdaltnum_Internalname, "TitleControlIdToReplace", Combo_prdaltnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDALTNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      GX_FocusControl = edtPrdAltNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
   }

   public void e121RR2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV11TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.productosalternativos_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDALTNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV15PrdAltNum_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.formulaciontinte.productosalternativos_trnloaddvcombo(remoteHandle, context).execute( "PrdAltNum", Gx_mode, AV13EmprCod, AV14PrdNum, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      productosalternativos_trn_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV15PrdAltNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1RR29( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01RR6_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      AV19Pgmname = "FormulacionTinte.ProductosAlternativos_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Pgmname", AV19Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         A396EmprCod = AV13EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01RR7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01RR7_A407EmprNom[0] ;
      n407EmprNom = T01RR7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV14PrdNum)==0) )
      {
         A719PrdNum = AV14PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se puede eliminar el Producto", ""), 1, "");
         AnyError = (short)(1) ;
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
      }
   }

   public void load1RR29( )
   {
      /* Using cursor T01RR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T01RR8_A407EmprNom[0] ;
         n407EmprNom = T01RR8_n407EmprNom[0] ;
         A718PrdNom = T01RR8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm1RR29( -21) ;
      }
      pr_default.close(6);
      onLoadActions1RR29( ) ;
   }

   public void onLoadActions1RR29( )
   {
   }

   public void checkExtendedTable1RR29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = Gx_msg ;
         new app.pinfcamprd(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_char4) ;
         productosalternativos_trn_impl.this.Gx_msg = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
   }

   public void closeExtendedTableCursors1RR29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1RR29( )
   {
      /* Using cursor T01RR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1RR29( 21) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01RR6_A719PrdNum[0] ;
         n719PrdNum = T01RR6_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T01RR6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A396EmprCod = T01RR6_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RR29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1RR29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1RR29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1RR29( ) ;
      if ( RcdFound29 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01RR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RR10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RR10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RR10_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RR10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RR10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RR10_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T01RR10_A396EmprCod[0] ;
            A719PrdNum = T01RR10_A719PrdNum[0] ;
            n719PrdNum = T01RR10_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01RR11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RR11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RR11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RR11_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RR11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RR11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RR11_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T01RR11_A396EmprCod[0] ;
            A719PrdNum = T01RR11_A719PrdNum[0] ;
            n719PrdNum = T01RR11_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RR29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1RR29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               update1RR29( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               insert1RR29( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert1RR29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RR29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z718PrdNom, T01RR5_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01RR5_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.productosalternativos_trn:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01RR5_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RR29( )
   {
      beforeValidate1RR29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RR29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RR29( 0) ;
         checkOptimisticConcurrency1RR29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RR29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RR29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RR12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1RR29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RR0( ) ;
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
         else
         {
            load1RR29( ) ;
         }
         endLevel1RR29( ) ;
      }
      closeExtendedTableCursors1RR29( ) ;
   }

   public void update1RR29( )
   {
      beforeValidate1RR29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RR29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RR29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RR29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RR29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RR13 */
                  pr_default.execute(11, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RR29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RR29( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1RR29( ) ;
      }
      closeExtendedTableCursors1RR29( ) ;
   }

   public void deferredUpdate1RR29( )
   {
   }

   public void delete( )
   {
      beforeValidate1RR29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RR29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RR29( ) ;
         afterConfirm1RR29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RR29( ) ;
            if ( AnyError == 0 )
            {
               scanStart1RR78( ) ;
               while ( RcdFound78 != 0 )
               {
                  getByPrimaryKey1RR78( ) ;
                  delete1RR78( ) ;
                  scanNext1RR78( ) ;
               }
               scanEnd1RR78( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RR14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
      }
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RR29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RR29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RR15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01RR16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01RR17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01RR18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01RR19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01RR20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01RR21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01RR22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01RR23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01RR24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01RR25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01RR26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01RR27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01RR28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RR29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RR30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RR31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RR32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RR33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RR34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RR35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RR36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RR37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RR38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RR39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RR40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RR41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RR42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01RR43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01RR44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01RR45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01RR46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01RR47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01RR48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01RR49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01RR50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01RR51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01RR52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01RR53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01RR54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01RR55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01RR56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01RR57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01RR58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01RR59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01RR60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01RR61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01RR62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01RR63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01RR64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01RR65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01RR66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01RR67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01RR68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01RR69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01RR70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01RR71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01RR72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01RR73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01RR74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01RR75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01RR76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01RR77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01RR78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01RR79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01RR80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01RR81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01RR82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01RR83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01RR84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01RR85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01RR86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
      }
   }

   public void processNestedLevel1RR78( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1RR78( ) ;
         if ( ( nRcdExists_78 != 0 ) || ( nIsMod_78 != 0 ) )
         {
            standaloneNotModal1RR78( ) ;
            getKey1RR78( ) ;
            if ( ( nRcdExists_78 == 0 ) && ( nRcdDeleted_78 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RR78( ) ;
            }
            else
            {
               if ( RcdFound78 != 0 )
               {
                  if ( ( nRcdDeleted_78 != 0 ) && ( nRcdExists_78 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RR78( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_78 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RR78( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_78 == 0 )
                  {
                     GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdAltNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdAltNum_Internalname, GXutil.rtrim( A680PrdAltNum)) ;
         httpContext.changePostValue( edtPrvAltNum_Internalname, GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrvAltNom_Internalname, GXutil.rtrim( A777PrvAltNom)) ;
         httpContext.changePostValue( edtPrdAltFac_Internalname, GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkPrdAltCam.getInternalname(), GXutil.ltrim( localUtil.ntoc( A11718PrdAltCam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindPrdAlt_Internalname, GXutil.rtrim( A476FindPrdAlt)) ;
         httpContext.changePostValue( "ZT_"+"Z680PrdAltNum_"+sGXsfl_32_idx, GXutil.rtrim( Z680PrdAltNum)) ;
         httpContext.changePostValue( "ZT_"+"Z678PrdAltFac_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11718PrdAltCam_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z11718PrdAltCam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_78_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_78 != 0 )
         {
            httpContext.changePostValue( "PRDALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRVALTNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDALTFAC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDALTCAM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdAltCam.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDPRDALT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindPrdAlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RR78( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_78 = (short)(0) ;
      nIsMod_78 = (short)(0) ;
      nRcdDeleted_78 = (short)(0) ;
   }

   public void processLevel1RR29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1RR78( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1RR29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RR29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.productosalternativos_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.productosalternativos_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RR29( )
   {
      /* Scan By routine */
      /* Using cursor T01RR87 */
      pr_default.execute(85);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T01RR87_A396EmprCod[0] ;
         A719PrdNum = T01RR87_A719PrdNum[0] ;
         n719PrdNum = T01RR87_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RR29( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T01RR87_A396EmprCod[0] ;
         A719PrdNum = T01RR87_A719PrdNum[0] ;
         n719PrdNum = T01RR87_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1RR29( )
   {
      pr_default.close(85);
   }

   public void afterConfirm1RR29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RR29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RR29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RR29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RR29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RR29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RR29( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1RR78( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z678PrdAltFac = T01RR3_A678PrdAltFac[0] ;
            Z11718PrdAltCam = T01RR3_A11718PrdAltCam[0] ;
         }
         else
         {
            Z678PrdAltFac = A678PrdAltFac ;
            Z11718PrdAltCam = A11718PrdAltCam ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z719PrdNum = A719PrdNum ;
         Z680PrdAltNum = A680PrdAltNum ;
         Z678PrdAltFac = A678PrdAltFac ;
         Z11718PrdAltCam = A11718PrdAltCam ;
         Z396EmprCod = A396EmprCod ;
         Z476FindPrdAlt = A476FindPrdAlt ;
         Z679PrdAltNom = A679PrdAltNom ;
         Z778PrvAltNum = A778PrvAltNum ;
      }
   }

   public void standaloneNotModal1RR78( )
   {
      edtFindPrdAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindPrdAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindPrdAlt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal1RR78( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A678PrdAltFac)==0) && ( Gx_BScreen == 0 ) )
      {
         A678PrdAltFac = DecimalUtil.doubleToDec(1) ;
      }
      if ( isIns( )  && (0==A11718PrdAltCam) && ( Gx_BScreen == 0 ) )
      {
         A11718PrdAltCam = (byte)(0) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdAltNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtPrdAltNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void load1RR78( )
   {
      /* Using cursor T01RR88 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound78 = (short)(1) ;
         A678PrdAltFac = T01RR88_A678PrdAltFac[0] ;
         A11718PrdAltCam = T01RR88_A11718PrdAltCam[0] ;
         A476FindPrdAlt = T01RR88_A476FindPrdAlt[0] ;
         n476FindPrdAlt = T01RR88_n476FindPrdAlt[0] ;
         A679PrdAltNom = T01RR88_A679PrdAltNom[0] ;
         n679PrdAltNom = T01RR88_n679PrdAltNom[0] ;
         A778PrvAltNum = T01RR88_A778PrvAltNum[0] ;
         n778PrvAltNum = T01RR88_n778PrvAltNum[0] ;
         zm1RR78( -23) ;
      }
      pr_default.close(86);
      onLoadActions1RR78( ) ;
   }

   public void onLoadActions1RR78( )
   {
      GXt_char1 = A777PrvAltNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A778PrvAltNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      productosalternativos_trn_impl.this.A778PrvAltNum = GXv_int8[0] ;
      productosalternativos_trn_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A777PrvAltNom = GXt_char1 ;
   }

   public void checkExtendedTable1RR78( )
   {
      nIsDirty_78 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1RR78( ) ;
      /* Using cursor T01RR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A680PrdAltNum});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A476FindPrdAlt = T01RR4_A476FindPrdAlt[0] ;
         n476FindPrdAlt = T01RR4_n476FindPrdAlt[0] ;
         A679PrdAltNom = T01RR4_A679PrdAltNom[0] ;
         n679PrdAltNom = T01RR4_n679PrdAltNom[0] ;
         A778PrvAltNum = T01RR4_A778PrvAltNum[0] ;
         n778PrvAltNum = T01RR4_n778PrvAltNum[0] ;
      }
      else
      {
         nIsDirty_78 = (short)(1) ;
         A778PrvAltNum = 0 ;
         n778PrvAltNum = false ;
         nIsDirty_78 = (short)(1) ;
         A679PrdAltNom = " " ;
         n679PrdAltNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A679PrdAltNom", A679PrdAltNom);
         nIsDirty_78 = (short)(1) ;
         A476FindPrdAlt = "" ;
         n476FindPrdAlt = false ;
      }
      pr_default.close(2);
      if ( (GXutil.strcmp("", A476FindPrdAlt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_78 = (short)(1) ;
      GXt_char1 = A777PrvAltNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A778PrvAltNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      productosalternativos_trn_impl.this.A778PrvAltNum = GXv_int8[0] ;
      productosalternativos_trn_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A777PrvAltNom = GXt_char1 ;
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 3), GXutil.substring( A680PrdAltNum, 1, 3)) != 0 )
      {
         GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No coincide la subfamilia", ""), 0, GXCCtl);
      }
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 2), GXutil.substring( A680PrdAltNum, 1, 2)) != 0 )
      {
         GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No coincide la familia", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1RR78( )
   {
      pr_default.close(2);
   }

   public void enableDisable1RR78( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          String A680PrdAltNum )
   {
      /* Using cursor T01RR89 */
      pr_default.execute(87, new Object[] {A396EmprCod, A680PrdAltNum});
      if ( (pr_default.getStatus(87) != 101) )
      {
         A476FindPrdAlt = T01RR89_A476FindPrdAlt[0] ;
         n476FindPrdAlt = T01RR89_n476FindPrdAlt[0] ;
         A679PrdAltNom = T01RR89_A679PrdAltNom[0] ;
         n679PrdAltNom = T01RR89_n679PrdAltNom[0] ;
         A778PrvAltNum = T01RR89_A778PrvAltNum[0] ;
         n778PrvAltNum = T01RR89_n778PrvAltNum[0] ;
      }
      else
      {
         A778PrvAltNum = 0 ;
         n778PrvAltNum = false ;
         A679PrdAltNom = " " ;
         n679PrdAltNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A679PrdAltNom", A679PrdAltNom);
         A476FindPrdAlt = "" ;
         n476FindPrdAlt = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A476FindPrdAlt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A679PrdAltNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(87) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(87);
   }

   public void getKey1RR78( )
   {
      /* Using cursor T01RR90 */
      pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound78 = (short)(1) ;
      }
      else
      {
         RcdFound78 = (short)(0) ;
      }
      pr_default.close(88);
   }

   public void getByPrimaryKey1RR78( )
   {
      /* Using cursor T01RR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RR78( 23) ;
         RcdFound78 = (short)(1) ;
         initializeNonKey1RR78( ) ;
         A680PrdAltNum = T01RR3_A680PrdAltNum[0] ;
         A678PrdAltFac = T01RR3_A678PrdAltFac[0] ;
         A11718PrdAltCam = T01RR3_A11718PrdAltCam[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z680PrdAltNum = A680PrdAltNum ;
         sMode78 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RR78( ) ;
         Gx_mode = sMode78 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound78 = (short)(0) ;
         initializeNonKey1RR78( ) ;
         sMode78 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RR78( ) ;
         Gx_mode = sMode78 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RR78( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RR78( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDALT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z678PrdAltFac, T01RR2_A678PrdAltFac[0]) != 0 ) || ( Z11718PrdAltCam != T01RR2_A11718PrdAltCam[0] ) )
         {
            if ( DecimalUtil.compareTo(Z678PrdAltFac, T01RR2_A678PrdAltFac[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.productosalternativos_trn:[seudo value changed for attri]"+"PrdAltFac");
               GXutil.writeLogRaw("Old: ",Z678PrdAltFac);
               GXutil.writeLogRaw("Current: ",T01RR2_A678PrdAltFac[0]);
            }
            if ( Z11718PrdAltCam != T01RR2_A11718PrdAltCam[0] )
            {
               GXutil.writeLogln("formulaciontinte.productosalternativos_trn:[seudo value changed for attri]"+"PrdAltCam");
               GXutil.writeLogRaw("Old: ",Z11718PrdAltCam);
               GXutil.writeLogRaw("Current: ",T01RR2_A11718PrdAltCam[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRDALT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RR78( )
   {
      beforeValidate1RR78( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RR78( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RR78( 0) ;
         checkOptimisticConcurrency1RR78( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RR78( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RR78( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RR91 */
                  pr_default.execute(89, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum, A678PrdAltFac, Byte.valueOf(A11718PrdAltCam), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
                  if ( (pr_default.getStatus(89) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_char2[0] = A680PrdAltNum ;
                        GXv_decimal9[0] = A678PrdAltFac ;
                        GXv_int10[0] = A11718PrdAltCam ;
                        new app.pprdalt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal9, GXv_int10) ;
                        productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        productosalternativos_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                        productosalternativos_trn_impl.this.A680PrdAltNum = GXv_char2[0] ;
                        productosalternativos_trn_impl.this.A678PrdAltFac = GXv_decimal9[0] ;
                        productosalternativos_trn_impl.this.A11718PrdAltCam = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
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
            load1RR78( ) ;
         }
         endLevel1RR78( ) ;
      }
      closeExtendedTableCursors1RR78( ) ;
   }

   public void update1RR78( )
   {
      beforeValidate1RR78( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RR78( ) ;
      }
      if ( ( nIsMod_78 != 0 ) || ( nIsDirty_78 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RR78( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RR78( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RR78( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RR92 */
                     pr_default.execute(90, new Object[] {A678PrdAltFac, Byte.valueOf(A11718PrdAltCam), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
                     if ( (pr_default.getStatus(90) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDALT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RR78( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_char3[0] = A719PrdNum ;
                           GXv_char2[0] = A680PrdAltNum ;
                           GXv_decimal9[0] = A678PrdAltFac ;
                           GXv_int10[0] = A11718PrdAltCam ;
                           new app.pprdalt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal9, GXv_int10) ;
                           productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                           productosalternativos_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                           productosalternativos_trn_impl.this.A680PrdAltNum = GXv_char2[0] ;
                           productosalternativos_trn_impl.this.A678PrdAltFac = GXv_decimal9[0] ;
                           productosalternativos_trn_impl.this.A11718PrdAltCam = GXv_int10[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RR78( ) ;
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
            endLevel1RR78( ) ;
         }
      }
      closeExtendedTableCursors1RR78( ) ;
   }

   public void deferredUpdate1RR78( )
   {
   }

   public void delete1RR78( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RR78( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RR78( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RR78( ) ;
         afterConfirm1RR78( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RR78( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RR93 */
               pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A680PrdAltNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A719PrdNum ;
                     GXv_char2[0] = A680PrdAltNum ;
                     new app.pdelprd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
                     productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                     productosalternativos_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                     productosalternativos_trn_impl.this.A680PrdAltNum = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                  }
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode78 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RR78( ) ;
      Gx_mode = sMode78 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RR78( )
   {
      standaloneModal1RR78( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RR94 */
         pr_default.execute(92, new Object[] {A396EmprCod, A680PrdAltNum});
         if ( (pr_default.getStatus(92) != 101) )
         {
            A476FindPrdAlt = T01RR94_A476FindPrdAlt[0] ;
            n476FindPrdAlt = T01RR94_n476FindPrdAlt[0] ;
            A679PrdAltNom = T01RR94_A679PrdAltNom[0] ;
            n679PrdAltNom = T01RR94_n679PrdAltNom[0] ;
            A778PrvAltNum = T01RR94_A778PrvAltNum[0] ;
            n778PrvAltNum = T01RR94_n778PrvAltNum[0] ;
         }
         else
         {
            A778PrvAltNum = 0 ;
            n778PrvAltNum = false ;
            A679PrdAltNom = " " ;
            n679PrdAltNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A679PrdAltNom", A679PrdAltNom);
            A476FindPrdAlt = "" ;
            n476FindPrdAlt = false ;
         }
         pr_default.close(92);
         GXt_char1 = A777PrvAltNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         productosalternativos_trn_impl.this.A778PrvAltNum = GXv_int8[0] ;
         productosalternativos_trn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A777PrvAltNom = GXt_char1 ;
      }
   }

   public void endLevel1RR78( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RR78( )
   {
      /* Scan By routine */
      /* Using cursor T01RR95 */
      pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound78 = (short)(0) ;
      if ( (pr_default.getStatus(93) != 101) )
      {
         RcdFound78 = (short)(1) ;
         A680PrdAltNum = T01RR95_A680PrdAltNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RR78( )
   {
      /* Scan next routine */
      pr_default.readNext(93);
      RcdFound78 = (short)(0) ;
      if ( (pr_default.getStatus(93) != 101) )
      {
         RcdFound78 = (short)(1) ;
         A680PrdAltNum = T01RR95_A680PrdAltNum[0] ;
      }
   }

   public void scanEnd1RR78( )
   {
      pr_default.close(93);
   }

   public void afterConfirm1RR78( )
   {
      /* After Confirm Rules */
      if ( ( A11718PrdAltCam == 1 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = Gx_msg ;
         new app.pctrlcamprd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         productosalternativos_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         productosalternativos_trn_impl.this.Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      if ( ( A11718PrdAltCam == 1 ) && ( GXutil.strcmp(Gx_msg, " ") != 0 ) && true /* After */ )
      {
         GXCCtl = "PRDALTCAM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(Gx_msg, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkPrdAltCam.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1RR78( )
   {
      /* Before Insert Rules */
      if ( GXutil.strcmp(A719PrdNum, A680PrdAltNum) == 0 )
      {
         GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Un producto no puede ser alternativo de si mismo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdAltNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate1RR78( )
   {
      /* Before Update Rules */
      if ( GXutil.strcmp(A719PrdNum, A680PrdAltNum) == 0 )
      {
         GXCCtl = "PRDALTNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Un producto no puede ser alternativo de si mismo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdAltNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDelete1RR78( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RR78( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RR78( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RR78( )
   {
      edtPrdAltNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrvAltNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrvAltNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvAltNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvAltNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrdAltFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltFac_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      chkPrdAltCam.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdAltCam.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdAltCam.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtFindPrdAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindPrdAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindPrdAlt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1RR78( )
   {
   }

   public void send_integrity_lvl_hashes1RR29( )
   {
   }

   public void subsflControlProps_3278( )
   {
      edtPrdAltNum_Internalname = "PRDALTNUM_"+sGXsfl_32_idx ;
      edtPrvAltNum_Internalname = "PRVALTNUM_"+sGXsfl_32_idx ;
      edtPrvAltNom_Internalname = "PRVALTNOM_"+sGXsfl_32_idx ;
      edtPrdAltFac_Internalname = "PRDALTFAC_"+sGXsfl_32_idx ;
      chkPrdAltCam.setInternalname( "PRDALTCAM_"+sGXsfl_32_idx );
      edtFindPrdAlt_Internalname = "FINDPRDALT_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_3278( )
   {
      edtPrdAltNum_Internalname = "PRDALTNUM_"+sGXsfl_32_fel_idx ;
      edtPrvAltNum_Internalname = "PRVALTNUM_"+sGXsfl_32_fel_idx ;
      edtPrvAltNom_Internalname = "PRVALTNOM_"+sGXsfl_32_fel_idx ;
      edtPrdAltFac_Internalname = "PRDALTFAC_"+sGXsfl_32_fel_idx ;
      chkPrdAltCam.setInternalname( "PRDALTCAM_"+sGXsfl_32_fel_idx );
      edtFindPrdAlt_Internalname = "FINDPRDALT_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1RR78( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3278( ) ;
      sendRow1RR78( ) ;
   }

   public void sendRow1RR78( )
   {
      Gridlevel_productosRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_productos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_productos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_productos_Class, "") != 0 )
         {
            subGridlevel_productos_Linesclass = subGridlevel_productos_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_productos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_productos_Backstyle = (byte)(0) ;
         subGridlevel_productos_Backcolor = subGridlevel_productos_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_productos_Class, "") != 0 )
         {
            subGridlevel_productos_Linesclass = subGridlevel_productos_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_productos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_productos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_productos_Class, "") != 0 )
         {
            subGridlevel_productos_Linesclass = subGridlevel_productos_Class+"Odd" ;
         }
         subGridlevel_productos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_productos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_productos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_productos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_productos_Class, "") != 0 )
            {
               subGridlevel_productos_Linesclass = subGridlevel_productos_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_productos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_productos_Class, "") != 0 )
            {
               subGridlevel_productos_Linesclass = subGridlevel_productos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_78_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAltNum_Internalname,GXutil.rtrim( A680PrdAltNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAltNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdAltNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvAltNum_Internalname,GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrvAltNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A778PrvAltNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A778PrvAltNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvAltNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrvAltNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvAltNom_Internalname,GXutil.rtrim( A777PrvAltNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvAltNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrvAltNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_78_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdAltFac_Internalname,GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdAltFac_Enabled!=0) ? localUtil.format( A678PrdAltFac, "Z9.9999") : localUtil.format( A678PrdAltFac, "Z9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdAltFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdAltFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_78_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "PRDALTCAM_" + sGXsfl_32_idx ;
      chkPrdAltCam.setName( GXCCtl );
      chkPrdAltCam.setWebtags( "" );
      chkPrdAltCam.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdAltCam.getInternalname(), "TitleCaption", chkPrdAltCam.getCaption(), !bGXsfl_32_Refreshing);
      chkPrdAltCam.setCheckedValue( "0" );
      if ( isIns( ) && (0==A11718PrdAltCam) )
      {
         A11718PrdAltCam = (byte)(0) ;
      }
      Gridlevel_productosRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPrdAltCam.getInternalname(),GXutil.str( A11718PrdAltCam, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkPrdAltCam.getEnabled()),"1","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindPrdAlt_Internalname,GXutil.rtrim( A476FindPrdAlt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindPrdAlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFindPrdAlt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_productosRow);
      send_integrity_lvl_hashes1RR78( ) ;
      GXCCtl = "Z680PrdAltNum_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z680PrdAltNum));
      GXCCtl = "Z678PrdAltFac_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z678PrdAltFac, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11718PrdAltCam_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11718PrdAltCam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_78_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_78_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_78_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_78, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV11TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV11TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV13EmprCod));
      GXCCtl = "vPRDNUM_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV14PrdNum));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVALTNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVALTNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDALTFAC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDALTCAM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdAltCam.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDPRDALT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindPrdAlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_productosContainer.AddRow(Gridlevel_productosRow);
   }

   public void readRow1RR78( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3278( ) ;
      edtPrdAltNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrvAltNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVALTNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrvAltNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRVALTNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdAltFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTFAC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkPrdAltCam.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PRDALTCAM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtFindPrdAlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDPRDALT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A680PrdAltNum = httpContext.cgiGet( edtPrdAltNum_Internalname) ;
      A778PrvAltNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvAltNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n778PrvAltNum = false ;
      A777PrvAltNom = httpContext.cgiGet( edtPrvAltNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdAltFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdAltFac_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
      {
         GXCCtl = "PRDALTFAC_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdAltFac_Internalname ;
         wbErr = true ;
         A678PrdAltFac = DecimalUtil.ZERO ;
      }
      else
      {
         A678PrdAltFac = localUtil.ctond( httpContext.cgiGet( edtPrdAltFac_Internalname)) ;
      }
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdAltCam.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdAltCam.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "PRDALTCAM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkPrdAltCam.getInternalname() ;
         wbErr = true ;
         A11718PrdAltCam = (byte)(0) ;
      }
      else
      {
         A11718PrdAltCam = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdAltCam.getInternalname()), "1")==0) ? 1 : 0)) ;
      }
      A476FindPrdAlt = httpContext.cgiGet( edtFindPrdAlt_Internalname) ;
      n476FindPrdAlt = false ;
      GXCCtl = "Z680PrdAltNum_" + sGXsfl_32_idx ;
      Z680PrdAltNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z678PrdAltFac_" + sGXsfl_32_idx ;
      Z678PrdAltFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11718PrdAltCam_" + sGXsfl_32_idx ;
      Z11718PrdAltCam = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_78_" + sGXsfl_32_idx ;
      nRcdDeleted_78 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_78_" + sGXsfl_32_idx ;
      nRcdExists_78 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_78_" + sGXsfl_32_idx ;
      nIsMod_78 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFindPrdAlt_Enabled = edtFindPrdAlt_Enabled ;
      defedtPrdAltNum_Enabled = edtPrdAltNum_Enabled ;
   }

   public void confirmValues1RR0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3278( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3278( ) ;
         httpContext.changePostValue( "Z680PrdAltNum_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z680PrdAltNum_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z680PrdAltNum_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z678PrdAltFac_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z678PrdAltFac_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z678PrdAltFac_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11718PrdAltCam_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11718PrdAltCam_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11718PrdAltCam_"+sGXsfl_32_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.productosalternativos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV14PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProductosAlternativos_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PrdNom", GXutil.rtrim( localUtil.format( A718PrdNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\productosalternativos_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDALTNUM_DATA", AV15PrdAltNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDALTNUM_DATA", AV15PrdAltNum_Data);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV14PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDALTNOM", GXutil.rtrim( A679PrdAltNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Objectcall", GXutil.rtrim( Combo_prdaltnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Cls", GXutil.rtrim( Combo_prdaltnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Enabled", GXutil.booltostr( Combo_prdaltnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdaltnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Isgriditem", GXutil.booltostr( Combo_prdaltnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDALTNUM_Emptyitem", GXutil.booltostr( Combo_prdaltnum_Emptyitem));
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
      return formatLink("app.formulaciontinte.productosalternativos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV14PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProductosAlternativos_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos Alternativos", "") ;
   }

   public void initializeNonKey1RR29( )
   {
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      Z718PrdNom = "" ;
   }

   public void initAll1RR29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1RR29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RR78( )
   {
      A777PrvAltNom = "" ;
      A476FindPrdAlt = "" ;
      n476FindPrdAlt = false ;
      A679PrdAltNom = "" ;
      n679PrdAltNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A679PrdAltNom", A679PrdAltNom);
      A778PrvAltNum = 0 ;
      n778PrvAltNum = false ;
      A678PrdAltFac = DecimalUtil.doubleToDec(1) ;
      A11718PrdAltCam = (byte)(0) ;
      Z678PrdAltFac = DecimalUtil.ZERO ;
      Z11718PrdAltCam = (byte)(0) ;
   }

   public void initAll1RR78( )
   {
      A680PrdAltNum = "" ;
      initializeNonKey1RR78( ) ;
   }

   public void standaloneModalInsert1RR78( )
   {
      A678PrdAltFac = i678PrdAltFac ;
      A11718PrdAltCam = i11718PrdAltCam ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169368", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/productosalternativos_trn.js", "?2026821169368", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties78( )
   {
      edtFindPrdAlt_Enabled = defedtFindPrdAlt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindPrdAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindPrdAlt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrdAltNum_Enabled = defedtPrdAltNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAltNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAltNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_productosContainer.AddObjectProperty("GridName", "Gridlevel_productos");
      Gridlevel_productosContainer.AddObjectProperty("Header", subGridlevel_productos_Header);
      Gridlevel_productosContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_productosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_productosContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.rtrim( A680PrdAltNum));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.rtrim( A777PrvAltNom));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrvAltNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), ".", "")));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdAltFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11718PrdAltCam, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdAltCam.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productosColumn.AddObjectProperty("Value", GXutil.rtrim( A476FindPrdAlt));
      Gridlevel_productosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFindPrdAlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddColumnProperties(Gridlevel_productosColumn);
      Gridlevel_productosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_productos_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdAltNum_Internalname = "PRDALTNUM" ;
      edtPrvAltNum_Internalname = "PRVALTNUM" ;
      edtPrvAltNom_Internalname = "PRVALTNOM" ;
      edtPrdAltFac_Internalname = "PRDALTFAC" ;
      chkPrdAltCam.setInternalname( "PRDALTCAM" );
      edtFindPrdAlt_Internalname = "FINDPRDALT" ;
      divTableleaflevel_productos_Internalname = "TABLELEAFLEVEL_PRODUCTOS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdaltnum_Internalname = "COMBO_PRDALTNUM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_productos_Internalname = "GRIDLEVEL_PRODUCTOS" ;
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
      subGridlevel_productos_Allowcollapsing = (byte)(0) ;
      subGridlevel_productos_Allowselection = (byte)(0) ;
      subGridlevel_productos_Header = "" ;
      Combo_prdaltnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Productos Alternativos", "") );
      edtFindPrdAlt_Jsonclick = "" ;
      chkPrdAltCam.setCaption( "" );
      edtPrdAltFac_Jsonclick = "" ;
      edtPrvAltNom_Jsonclick = "" ;
      edtPrvAltNum_Jsonclick = "" ;
      edtPrdAltNum_Jsonclick = "" ;
      subGridlevel_productos_Class = "GridNoBorder WorkWith" ;
      subGridlevel_productos_Backcolorstyle = (byte)(0) ;
      Combo_prdaltnum_Titlecontrolidtoreplace = "" ;
      edtFindPrdAlt_Enabled = 0 ;
      chkPrdAltCam.setEnabled( 1 );
      edtPrdAltFac_Enabled = 1 ;
      edtPrvAltNom_Enabled = 0 ;
      edtPrvAltNum_Enabled = 0 ;
      edtPrdAltNum_Enabled = 1 ;
      Combo_prdaltnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdaltnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdaltnum_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
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

   public void gx9asaprvaltnom1RR78( String A396EmprCod ,
                                     int A778PrvAltNum )
   {
      GXt_char1 = A777PrvAltNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A778PrvAltNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      productosalternativos_trn_impl.this.A778PrvAltNum = GXv_int8[0] ;
      productosalternativos_trn_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A777PrvAltNom = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A777PrvAltNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_8_1RR29( String A396EmprCod ,
                           String A719PrdNum )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = Gx_msg ;
         new app.pinfcamprd(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_char4) ;
         Gx_msg = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_17_1RR78( String A396EmprCod ,
                            String A719PrdNum ,
                            String A680PrdAltNum ,
                            java.math.BigDecimal A678PrdAltFac ,
                            byte A11718PrdAltCam )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A680PrdAltNum ;
         GXv_decimal9[0] = A678PrdAltFac ;
         GXv_int10[0] = A11718PrdAltCam ;
         new app.pprdalt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal9, GXv_int10) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A680PrdAltNum = GXv_char2[0] ;
         A678PrdAltFac = GXv_decimal9[0] ;
         A11718PrdAltCam = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A680PrdAltNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A678PrdAltFac, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11718PrdAltCam, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_18_1RR78( String A396EmprCod ,
                            String A719PrdNum ,
                            String A680PrdAltNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A680PrdAltNum ;
         new app.pdelprd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A680PrdAltNum = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A680PrdAltNum))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_19_1RR78( String A396EmprCod ,
                            String A719PrdNum ,
                            String Gx_msg ,
                            byte A11718PrdAltCam )
   {
      if ( ( A11718PrdAltCam == 1 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = Gx_msg ;
         new app.pctrlcamprd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         Gx_msg = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_msg))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_productos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_3278( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RR78( ) ;
         standaloneModal1RR78( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RR78( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3278( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_productosContainer)) ;
      /* End function gxnrGridlevel_productos_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PRDALTCAM_" + sGXsfl_32_idx ;
      chkPrdAltCam.setName( GXCCtl );
      chkPrdAltCam.setWebtags( "" );
      chkPrdAltCam.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdAltCam.getInternalname(), "TitleCaption", chkPrdAltCam.getCaption(), !bGXsfl_32_Refreshing);
      chkPrdAltCam.setCheckedValue( "0" );
      if ( isIns( ) && (0==A11718PrdAltCam) )
      {
         A11718PrdAltCam = (byte)(0) ;
      }
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

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      if ( isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = Gx_msg ;
         new app.pinfcamprd(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_char4) ;
         productosalternativos_trn_impl.this.Gx_msg = GXv_char4[0] ;
         Gx_msg = this.Gx_msg ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
   }

   public void valid_Prdaltnum( )
   {
      n476FindPrdAlt = false ;
      n778PrvAltNum = false ;
      n719PrdNum = false ;
      n679PrdAltNom = false ;
      /* Using cursor T01RR94 */
      pr_default.execute(92, new Object[] {A396EmprCod, A680PrdAltNum});
      if ( (pr_default.getStatus(92) != 101) )
      {
         A476FindPrdAlt = T01RR94_A476FindPrdAlt[0] ;
         n476FindPrdAlt = T01RR94_n476FindPrdAlt[0] ;
         A679PrdAltNom = T01RR94_A679PrdAltNom[0] ;
         n679PrdAltNom = T01RR94_n679PrdAltNom[0] ;
         A778PrvAltNum = T01RR94_A778PrvAltNum[0] ;
         n778PrvAltNum = T01RR94_n778PrvAltNum[0] ;
      }
      else
      {
         A778PrvAltNum = 0 ;
         n778PrvAltNum = false ;
         A679PrdAltNom = " " ;
         n679PrdAltNom = false ;
         A476FindPrdAlt = "" ;
         n476FindPrdAlt = false ;
      }
      pr_default.close(92);
      if ( (GXutil.strcmp("", A476FindPrdAlt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "PRDALTNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdAltNum_Internalname ;
      }
      GXt_char1 = A777PrvAltNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A778PrvAltNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      productosalternativos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      productosalternativos_trn_impl.this.A778PrvAltNum = GXv_int8[0] ;
      A778PrvAltNum = this.A778PrvAltNum ;
      productosalternativos_trn_impl.this.GXt_char1 = GXv_char3[0] ;
      A777PrvAltNom = GXt_char1 ;
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 3), GXutil.substring( A680PrdAltNum, 1, 3)) != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No coincide la subfamilia", ""), 0, "PRDALTNUM");
      }
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 2), GXutil.substring( A680PrdAltNum, 1, 2)) != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No coincide la familia", ""), 0, "PRDALTNUM");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A476FindPrdAlt", GXutil.rtrim( A476FindPrdAlt));
      httpContext.ajax_rsp_assign_attri("", false, "A679PrdAltNom", GXutil.rtrim( A679PrdAltNom));
      httpContext.ajax_rsp_assign_attri("", false, "A778PrvAltNum", GXutil.ltrim( localUtil.ntoc( A778PrvAltNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A777PrvAltNom", GXutil.rtrim( A777PrvAltNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RR2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV11TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("VALID_PRDALTNUM","{handler:'valid_Prdaltnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A680PrdAltNum',fld:'PRDALTNUM',pic:''},{av:'A476FindPrdAlt',fld:'FINDPRDALT',pic:''},{av:'A778PrvAltNum',fld:'PRVALTNUM',pic:'ZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A679PrdAltNom',fld:'PRDALTNOM',pic:''},{av:'A777PrvAltNom',fld:'PRVALTNOM',pic:''}]");
      setEventMetadata("VALID_PRDALTNUM",",oparms:[{av:'A476FindPrdAlt',fld:'FINDPRDALT',pic:''},{av:'A679PrdAltNom',fld:'PRDALTNOM',pic:''},{av:'A778PrvAltNum',fld:'PRVALTNUM',pic:'ZZZZZ9'},{av:'A777PrvAltNom',fld:'PRVALTNOM',pic:''}]}");
      setEventMetadata("VALID_PRVALTNUM","{handler:'valid_Prvaltnum',iparms:[]");
      setEventMetadata("VALID_PRVALTNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDALTFAC","{handler:'valid_Prdaltfac',iparms:[]");
      setEventMetadata("VALID_PRDALTFAC",",oparms:[]}");
      setEventMetadata("VALID_PRDALTCAM","{handler:'valid_Prdaltcam',iparms:[]");
      setEventMetadata("VALID_PRDALTCAM",",oparms:[]}");
      setEventMetadata("VALID_FINDPRDALT","{handler:'valid_Findprdalt',iparms:[]");
      setEventMetadata("VALID_FINDPRDALT",",oparms:[]}");
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
      pr_default.close(92);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV13EmprCod = "" ;
      wcpOAV14PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z680PrdAltNum = "" ;
      Z678PrdAltFac = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      Gx_mode = "" ;
      AV13EmprCod = "" ;
      AV14PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A718PrdNom = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV19Pgmname = "" ;
      ucCombo_prdaltnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdaltnum_Caption = "" ;
      AV15PrdAltNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_productosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode78 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A679PrdAltNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdaltnum_Objectcall = "" ;
      Combo_prdaltnum_Class = "" ;
      Combo_prdaltnum_Icontype = "" ;
      Combo_prdaltnum_Icon = "" ;
      Combo_prdaltnum_Tooltip = "" ;
      Combo_prdaltnum_Selectedvalue_set = "" ;
      Combo_prdaltnum_Selectedvalue_get = "" ;
      Combo_prdaltnum_Selectedtext_set = "" ;
      Combo_prdaltnum_Selectedtext_get = "" ;
      Combo_prdaltnum_Gamoauthtoken = "" ;
      Combo_prdaltnum_Ddointernalname = "" ;
      Combo_prdaltnum_Titlecontrolalign = "" ;
      Combo_prdaltnum_Dropdownoptionstype = "" ;
      Combo_prdaltnum_Datalisttype = "" ;
      Combo_prdaltnum_Datalistfixedvalues = "" ;
      Combo_prdaltnum_Datalistproc = "" ;
      Combo_prdaltnum_Datalistprocparametersprefix = "" ;
      Combo_prdaltnum_Remoteservicesparameters = "" ;
      Combo_prdaltnum_Htmltemplate = "" ;
      Combo_prdaltnum_Multiplevaluestype = "" ;
      Combo_prdaltnum_Loadingdata = "" ;
      Combo_prdaltnum_Noresultsfound = "" ;
      Combo_prdaltnum_Emptyitemtext = "" ;
      Combo_prdaltnum_Onlyselectedvalues = "" ;
      Combo_prdaltnum_Selectalltext = "" ;
      Combo_prdaltnum_Multiplevaluesseparator = "" ;
      Combo_prdaltnum_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode29 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A777PrvAltNom = "" ;
      A476FindPrdAlt = "" ;
      AV20Station = "" ;
      AV21Emprnom = "" ;
      AV22Usurcod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01RR7_A407EmprNom = new String[] {""} ;
      T01RR7_n407EmprNom = new boolean[] {false} ;
      T01RR8_A719PrdNum = new String[] {""} ;
      T01RR8_n719PrdNum = new boolean[] {false} ;
      T01RR8_A407EmprNom = new String[] {""} ;
      T01RR8_n407EmprNom = new boolean[] {false} ;
      T01RR8_A718PrdNom = new String[] {""} ;
      T01RR8_A396EmprCod = new String[] {""} ;
      T01RR9_A396EmprCod = new String[] {""} ;
      T01RR9_A719PrdNum = new String[] {""} ;
      T01RR9_n719PrdNum = new boolean[] {false} ;
      T01RR6_A719PrdNum = new String[] {""} ;
      T01RR6_n719PrdNum = new boolean[] {false} ;
      T01RR6_A718PrdNom = new String[] {""} ;
      T01RR6_A396EmprCod = new String[] {""} ;
      T01RR10_A396EmprCod = new String[] {""} ;
      T01RR10_A719PrdNum = new String[] {""} ;
      T01RR10_n719PrdNum = new boolean[] {false} ;
      T01RR11_A396EmprCod = new String[] {""} ;
      T01RR11_A719PrdNum = new String[] {""} ;
      T01RR11_n719PrdNum = new boolean[] {false} ;
      T01RR5_A719PrdNum = new String[] {""} ;
      T01RR5_n719PrdNum = new boolean[] {false} ;
      T01RR5_A718PrdNom = new String[] {""} ;
      T01RR5_A396EmprCod = new String[] {""} ;
      T01RR15_A396EmprCod = new String[] {""} ;
      T01RR15_A719PrdNum = new String[] {""} ;
      T01RR15_n719PrdNum = new boolean[] {false} ;
      T01RR15_A13217NormaID = new String[] {""} ;
      T01RR16_A396EmprCod = new String[] {""} ;
      T01RR16_A719PrdNum = new String[] {""} ;
      T01RR16_n719PrdNum = new boolean[] {false} ;
      T01RR16_A13586TheList = new String[] {""} ;
      T01RR17_A396EmprCod = new String[] {""} ;
      T01RR17_A5532Lb_numero = new int[1] ;
      T01RR17_A5555Lb_opcion = new String[] {""} ;
      T01RR17_A13460Lb_linCP = new short[1] ;
      T01RR17_A13458Lb_TipCP = new String[] {""} ;
      T01RR18_A396EmprCod = new String[] {""} ;
      T01RR18_A13418AlbProID = new int[1] ;
      T01RR18_A13442AlbProLine = new short[1] ;
      T01RR19_A396EmprCod = new String[] {""} ;
      T01RR19_A13324LDESID = new int[1] ;
      T01RR19_A13333LDESNPeque = new String[] {""} ;
      T01RR19_A13337LDESComb = new String[] {""} ;
      T01RR19_A13339LDESFondo = new String[] {""} ;
      T01RR19_A13342LDESLinea = new short[1] ;
      T01RR20_A396EmprCod = new String[] {""} ;
      T01RR20_A13312Lb_NLab = new int[1] ;
      T01RR20_A13305Lb_IDVeces = new short[1] ;
      T01RR20_A13306Lb_LinID = new short[1] ;
      T01RR21_A396EmprCod = new String[] {""} ;
      T01RR21_A12673LavMqId = new int[1] ;
      T01RR21_A12692LavMqLnPq = new short[1] ;
      T01RR21_A12681LavMqLn = new short[1] ;
      T01RR22_A396EmprCod = new String[] {""} ;
      T01RR22_A719PrdNum = new String[] {""} ;
      T01RR22_n719PrdNum = new boolean[] {false} ;
      T01RR22_A9713Tb1_Cod = new short[1] ;
      T01RR23_A396EmprCod = new String[] {""} ;
      T01RR23_A12236PrdNumD = new String[] {""} ;
      T01RR23_A719PrdNum = new String[] {""} ;
      T01RR23_n719PrdNum = new boolean[] {false} ;
      T01RR24_A396EmprCod = new String[] {""} ;
      T01RR24_A12225DocDisID = new long[1] ;
      T01RR24_A12226LinDisID = new short[1] ;
      T01RR25_A396EmprCod = new String[] {""} ;
      T01RR25_A12225DocDisID = new long[1] ;
      T01RR26_A396EmprCod = new String[] {""} ;
      T01RR26_A12205OrdenCID = new long[1] ;
      T01RR26_A12206OrdenCLnId = new short[1] ;
      T01RR27_A396EmprCod = new String[] {""} ;
      T01RR27_A719PrdNum = new String[] {""} ;
      T01RR27_n719PrdNum = new boolean[] {false} ;
      T01RR27_A11664LoteID = new String[] {""} ;
      T01RR27_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RR28_A396EmprCod = new String[] {""} ;
      T01RR28_A4850DevComCod = new int[1] ;
      T01RR28_A719PrdNum = new String[] {""} ;
      T01RR28_n719PrdNum = new boolean[] {false} ;
      T01RR29_A396EmprCod = new String[] {""} ;
      T01RR29_A252CliCod = new int[1] ;
      T01RR29_A494ForSer = new String[] {""} ;
      T01RR29_A482ForColNom = new String[] {""} ;
      T01RR29_A483ForColNum = new int[1] ;
      T01RR29_A831TipColCod = new byte[1] ;
      T01RR29_A3571EnsCod = new String[] {""} ;
      T01RR29_A3582EnsLin = new short[1] ;
      T01RR30_A396EmprCod = new String[] {""} ;
      T01RR30_A129BarCod = new int[1] ;
      T01RR30_A132BarCodReo = new byte[1] ;
      T01RR30_A130BarCodPar = new String[] {""} ;
      T01RR30_A4075recestncol = new byte[1] ;
      T01RR30_A4076recestnpro = new byte[1] ;
      T01RR30_A4108recestlin = new short[1] ;
      T01RR31_A396EmprCod = new String[] {""} ;
      T01RR31_A4052EstNumFor = new int[1] ;
      T01RR31_A4053EstNumCol = new byte[1] ;
      T01RR31_A4090EstEspLin = new byte[1] ;
      T01RR32_A396EmprCod = new String[] {""} ;
      T01RR32_A4052EstNumFor = new int[1] ;
      T01RR32_A4053EstNumCol = new byte[1] ;
      T01RR32_A4084EstProLin = new byte[1] ;
      T01RR33_A396EmprCod = new String[] {""} ;
      T01RR33_A11644TransferId = new long[1] ;
      T01RR33_A11653TransferLn = new int[1] ;
      T01RR34_A396EmprCod = new String[] {""} ;
      T01RR34_A11634TaesId = new String[] {""} ;
      T01RR34_A11637TaesLn = new short[1] ;
      T01RR34_A11641TaesLnP = new short[1] ;
      T01RR35_A396EmprCod = new String[] {""} ;
      T01RR35_A719PrdNum = new String[] {""} ;
      T01RR35_n719PrdNum = new boolean[] {false} ;
      T01RR35_A11329H_stklin = new long[1] ;
      T01RR36_A396EmprCod = new String[] {""} ;
      T01RR36_A11270Pot_num = new int[1] ;
      T01RR36_A11271Pot_lin = new short[1] ;
      T01RR37_A396EmprCod = new String[] {""} ;
      T01RR37_A719PrdNum = new String[] {""} ;
      T01RR37_n719PrdNum = new boolean[] {false} ;
      T01RR37_A11199PrdNcasC = new String[] {""} ;
      T01RR38_A396EmprCod = new String[] {""} ;
      T01RR38_A719PrdNum = new String[] {""} ;
      T01RR38_n719PrdNum = new boolean[] {false} ;
      T01RR38_A11197CFraseR = new String[] {""} ;
      T01RR39_A396EmprCod = new String[] {""} ;
      T01RR39_A10243Jt_codigo = new short[1] ;
      T01RR39_A10246Jt_ord = new short[1] ;
      T01RR40_A396EmprCod = new String[] {""} ;
      T01RR40_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01RR40_A10238Bny_lin = new short[1] ;
      T01RR41_A396EmprCod = new String[] {""} ;
      T01RR41_A129BarCod = new int[1] ;
      T01RR41_A132BarCodReo = new byte[1] ;
      T01RR41_A130BarCodPar = new String[] {""} ;
      T01RR41_A758ProCod = new String[] {""} ;
      T01RR41_A194BarOrdLin = new short[1] ;
      T01RR41_A719PrdNum = new String[] {""} ;
      T01RR41_n719PrdNum = new boolean[] {false} ;
      T01RR42_A396EmprCod = new String[] {""} ;
      T01RR42_A719PrdNum = new String[] {""} ;
      T01RR42_n719PrdNum = new boolean[] {false} ;
      T01RR42_A9735Cod_Rgo = new String[] {""} ;
      T01RR43_A396EmprCod = new String[] {""} ;
      T01RR43_A719PrdNum = new String[] {""} ;
      T01RR43_n719PrdNum = new boolean[] {false} ;
      T01RR43_A9711Ct_codigo = new short[1] ;
      T01RR44_A396EmprCod = new String[] {""} ;
      T01RR44_A9652OeNum = new long[1] ;
      T01RR44_A9653OeHdr = new int[1] ;
      T01RR44_A9654OeHdrr = new byte[1] ;
      T01RR44_A9655OeHdrp = new String[] {""} ;
      T01RR44_A9656OeLinC = new byte[1] ;
      T01RR44_A9657OeComb = new String[] {""} ;
      T01RR44_A9658Oefondo = new String[] {""} ;
      T01RR44_A9659OeMolCil = new byte[1] ;
      T01RR44_A9686OePasLin = new short[1] ;
      T01RR44_A9694OePasPLi = new short[1] ;
      T01RR45_A396EmprCod = new String[] {""} ;
      T01RR45_A9652OeNum = new long[1] ;
      T01RR45_A9653OeHdr = new int[1] ;
      T01RR45_A9654OeHdrr = new byte[1] ;
      T01RR45_A9655OeHdrp = new String[] {""} ;
      T01RR45_A9656OeLinC = new byte[1] ;
      T01RR45_A9657OeComb = new String[] {""} ;
      T01RR45_A9658Oefondo = new String[] {""} ;
      T01RR45_A9659OeMolCil = new byte[1] ;
      T01RR45_A9677OeMolLin = new byte[1] ;
      T01RR46_A396EmprCod = new String[] {""} ;
      T01RR46_A9578Pas_Num = new int[1] ;
      T01RR46_A719PrdNum = new String[] {""} ;
      T01RR46_n719PrdNum = new boolean[] {false} ;
      T01RR47_A396EmprCod = new String[] {""} ;
      T01RR47_A719PrdNum = new String[] {""} ;
      T01RR47_n719PrdNum = new boolean[] {false} ;
      T01RR47_A8908CC_AlmCod = new byte[1] ;
      T01RR48_A396EmprCod = new String[] {""} ;
      T01RR48_A719PrdNum = new String[] {""} ;
      T01RR48_n719PrdNum = new boolean[] {false} ;
      T01RR48_A8661Almc_Ln = new int[1] ;
      T01RR49_A396EmprCod = new String[] {""} ;
      T01RR49_A719PrdNum = new String[] {""} ;
      T01RR49_n719PrdNum = new boolean[] {false} ;
      T01RR49_A8648Mat_PrdN = new String[] {""} ;
      T01RR50_A396EmprCod = new String[] {""} ;
      T01RR50_A8585Pet_cod = new long[1] ;
      T01RR50_A719PrdNum = new String[] {""} ;
      T01RR50_n719PrdNum = new boolean[] {false} ;
      T01RR51_A396EmprCod = new String[] {""} ;
      T01RR51_A719PrdNum = new String[] {""} ;
      T01RR51_n719PrdNum = new boolean[] {false} ;
      T01RR51_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01RR52_A396EmprCod = new String[] {""} ;
      T01RR52_A719PrdNum = new String[] {""} ;
      T01RR52_n719PrdNum = new boolean[] {false} ;
      T01RR52_A8366PrdAnyo = new short[1] ;
      T01RR52_A8360PrdProv = new int[1] ;
      T01RR53_A396EmprCod = new String[] {""} ;
      T01RR53_A252CliCod = new int[1] ;
      T01RR53_A494ForSer = new String[] {""} ;
      T01RR53_A482ForColNom = new String[] {""} ;
      T01RR53_A483ForColNum = new int[1] ;
      T01RR53_A831TipColCod = new byte[1] ;
      T01RR53_A7797Sim_lin = new short[1] ;
      T01RR54_A396EmprCod = new String[] {""} ;
      T01RR54_A7163Vir_Codigo = new int[1] ;
      T01RR54_A719PrdNum = new String[] {""} ;
      T01RR54_n719PrdNum = new boolean[] {false} ;
      T01RR55_A396EmprCod = new String[] {""} ;
      T01RR55_A6310Lb_TaAuxC = new String[] {""} ;
      T01RR55_A6313lb_TaAuxL = new short[1] ;
      T01RR55_A6378Lb_TauxLP = new short[1] ;
      T01RR56_A396EmprCod = new String[] {""} ;
      T01RR56_A6290PreCoNum = new int[1] ;
      T01RR56_A719PrdNum = new String[] {""} ;
      T01RR56_n719PrdNum = new boolean[] {false} ;
      T01RR57_A396EmprCod = new String[] {""} ;
      T01RR57_A719PrdNum = new String[] {""} ;
      T01RR57_n719PrdNum = new boolean[] {false} ;
      T01RR57_A6158PrdPrv = new int[1] ;
      T01RR58_A396EmprCod = new String[] {""} ;
      T01RR58_A719PrdNum = new String[] {""} ;
      T01RR58_n719PrdNum = new boolean[] {false} ;
      T01RR58_A5973PrdSusNum = new String[] {""} ;
      T01RR59_A396EmprCod = new String[] {""} ;
      T01RR59_A5612Lb_CodGru = new String[] {""} ;
      T01RR59_A5615Lb_LinGru = new short[1] ;
      T01RR60_A396EmprCod = new String[] {""} ;
      T01RR60_A5532Lb_numero = new int[1] ;
      T01RR60_A5555Lb_opcion = new String[] {""} ;
      T01RR60_A5560Lb_LineaPr = new short[1] ;
      T01RR61_A396EmprCod = new String[] {""} ;
      T01RR61_A5532Lb_numero = new int[1] ;
      T01RR61_A5555Lb_opcion = new String[] {""} ;
      T01RR61_A5557Lb_LineaC = new short[1] ;
      T01RR62_A396EmprCod = new String[] {""} ;
      T01RR62_A5145SobCod = new int[1] ;
      T01RR62_A719PrdNum = new String[] {""} ;
      T01RR62_n719PrdNum = new boolean[] {false} ;
      T01RR63_A396EmprCod = new String[] {""} ;
      T01RR63_A4744RecPreCod = new int[1] ;
      T01RR63_A4762RecPreLin = new short[1] ;
      T01RR63_A4763RecPreNli = new short[1] ;
      T01RR64_A396EmprCod = new String[] {""} ;
      T01RR64_A4492HreBarCod = new int[1] ;
      T01RR64_A4493HreBarReo = new byte[1] ;
      T01RR64_A4494HreBarPar = new String[] {""} ;
      T01RR64_A4495HreNumCie = new byte[1] ;
      T01RR64_A4545HreLinMaq = new short[1] ;
      T01RR64_A4550HreLinPro = new byte[1] ;
      T01RR64_A4557HreRecLin = new short[1] ;
      T01RR65_A396EmprCod = new String[] {""} ;
      T01RR65_A4492HreBarCod = new int[1] ;
      T01RR65_A4493HreBarReo = new byte[1] ;
      T01RR65_A4494HreBarPar = new String[] {""} ;
      T01RR65_A4495HreNumCie = new byte[1] ;
      T01RR65_A4508HreLinMAL = new short[1] ;
      T01RR65_A4509HreNumAny = new byte[1] ;
      T01RR65_A719PrdNum = new String[] {""} ;
      T01RR65_n719PrdNum = new boolean[] {false} ;
      T01RR66_A396EmprCod = new String[] {""} ;
      T01RR66_A252CliCod = new int[1] ;
      T01RR66_A4415EstCol = new String[] {""} ;
      T01RR66_A4416EstColLin = new short[1] ;
      T01RR67_A396EmprCod = new String[] {""} ;
      T01RR67_A129BarCod = new int[1] ;
      T01RR67_A132BarCodReo = new byte[1] ;
      T01RR67_A130BarCodPar = new String[] {""} ;
      T01RR67_A2524DisComLin = new byte[1] ;
      T01RR67_A1056DisComCod = new String[] {""} ;
      T01RR67_A1032FonCod = new String[] {""} ;
      T01RR67_A2124RecMolCod = new byte[1] ;
      T01RR67_A2672RecPasLin = new short[1] ;
      T01RR67_A2675RecPasPLi = new short[1] ;
      T01RR68_A396EmprCod = new String[] {""} ;
      T01RR68_A129BarCod = new int[1] ;
      T01RR68_A132BarCodReo = new byte[1] ;
      T01RR68_A130BarCodPar = new String[] {""} ;
      T01RR68_A2524DisComLin = new byte[1] ;
      T01RR68_A1056DisComCod = new String[] {""} ;
      T01RR68_A1032FonCod = new String[] {""} ;
      T01RR68_A2124RecMolCod = new byte[1] ;
      T01RR68_A2126RecMolLin = new byte[1] ;
      T01RR69_A396EmprCod = new String[] {""} ;
      T01RR69_A2107PasCod = new String[] {""} ;
      T01RR69_A719PrdNum = new String[] {""} ;
      T01RR69_n719PrdNum = new boolean[] {false} ;
      T01RR70_A396EmprCod = new String[] {""} ;
      T01RR70_A2637HisEstHRu = new int[1] ;
      T01RR70_A2636HisEstHRe = new byte[1] ;
      T01RR70_A2635HisEstHPa = new String[] {""} ;
      T01RR70_A2638HisEstLCo = new byte[1] ;
      T01RR70_A2630HisEstCom = new String[] {""} ;
      T01RR70_A2634HisEstFon = new String[] {""} ;
      T01RR70_A719PrdNum = new String[] {""} ;
      T01RR70_n719PrdNum = new boolean[] {false} ;
      T01RR71_A396EmprCod = new String[] {""} ;
      T01RR71_A252CliCod = new int[1] ;
      T01RR71_A2141SerEst = new String[] {""} ;
      T01RR71_A1013DibCli = new String[] {""} ;
      T01RR71_A1014DibInt = new int[1] ;
      T01RR71_A2074ColCom = new String[] {""} ;
      T01RR71_A2078ColFon = new String[] {""} ;
      T01RR71_A2098MolCod = new byte[1] ;
      T01RR71_A2535ForPrdLin = new short[1] ;
      T01RR72_A396EmprCod = new String[] {""} ;
      T01RR72_A719PrdNum = new String[] {""} ;
      T01RR72_n719PrdNum = new boolean[] {false} ;
      T01RR72_A3342CCStkLin = new long[1] ;
      T01RR73_A396EmprCod = new String[] {""} ;
      T01RR73_A252CliCod = new int[1] ;
      T01RR73_A2891HMaForSer = new String[] {""} ;
      T01RR73_A2892HMaForCNom = new String[] {""} ;
      T01RR73_A2893HMaForCNum = new int[1] ;
      T01RR73_A2894HMaTipCCod = new byte[1] ;
      T01RR73_A2895HMaForNumC = new int[1] ;
      T01RR73_A2897HMaColLin = new short[1] ;
      T01RR73_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RR73_A2907HmaLin = new short[1] ;
      T01RR74_A396EmprCod = new String[] {""} ;
      T01RR74_A129BarCod = new int[1] ;
      T01RR74_A132BarCodReo = new byte[1] ;
      T01RR74_A130BarCodPar = new String[] {""} ;
      T01RR74_A2808RecLinMAL = new short[1] ;
      T01RR74_A1377RecNumAny = new byte[1] ;
      T01RR74_A719PrdNum = new String[] {""} ;
      T01RR74_n719PrdNum = new boolean[] {false} ;
      T01RR75_A396EmprCod = new String[] {""} ;
      T01RR75_A129BarCod = new int[1] ;
      T01RR75_A132BarCodReo = new byte[1] ;
      T01RR75_A130BarCodPar = new String[] {""} ;
      T01RR75_A2804RecLinMaq = new short[1] ;
      T01RR75_A1273RecLinPro = new byte[1] ;
      T01RR75_A811RecLin = new short[1] ;
      T01RR76_A396EmprCod = new String[] {""} ;
      T01RR76_A129BarCod = new int[1] ;
      T01RR76_A132BarCodReo = new byte[1] ;
      T01RR76_A130BarCodPar = new String[] {""} ;
      T01RR76_A2494BarDosPro = new String[] {""} ;
      T01RR76_A719PrdNum = new String[] {""} ;
      T01RR76_n719PrdNum = new boolean[] {false} ;
      T01RR77_A396EmprCod = new String[] {""} ;
      T01RR77_A1314EnsLabCod = new int[1] ;
      T01RR77_A1317EnsLabLin = new short[1] ;
      T01RR78_A396EmprCod = new String[] {""} ;
      T01RR78_A910Workstat = new String[] {""} ;
      T01RR78_A887EscMLin = new int[1] ;
      T01RR79_A396EmprCod = new String[] {""} ;
      T01RR79_A859CumCodCont = new int[1] ;
      T01RR79_A719PrdNum = new String[] {""} ;
      T01RR79_n719PrdNum = new boolean[] {false} ;
      T01RR80_A396EmprCod = new String[] {""} ;
      T01RR80_A719PrdNum = new String[] {""} ;
      T01RR80_n719PrdNum = new boolean[] {false} ;
      T01RR80_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RR81_A396EmprCod = new String[] {""} ;
      T01RR81_A486ForNumCol = new int[1] ;
      T01RR81_A715PrdLin = new short[1] ;
      T01RR82_A396EmprCod = new String[] {""} ;
      T01RR82_A719PrdNum = new String[] {""} ;
      T01RR82_n719PrdNum = new boolean[] {false} ;
      T01RR82_A681PrdAny = new short[1] ;
      T01RR83_A396EmprCod = new String[] {""} ;
      T01RR83_A719PrdNum = new String[] {""} ;
      T01RR83_n719PrdNum = new boolean[] {false} ;
      T01RR83_A688PrdComCod = new String[] {""} ;
      T01RR84_A396EmprCod = new String[] {""} ;
      T01RR84_A658PedCod = new int[1] ;
      T01RR84_A719PrdNum = new String[] {""} ;
      T01RR84_n719PrdNum = new boolean[] {false} ;
      T01RR85_A396EmprCod = new String[] {""} ;
      T01RR85_A486ForNumCol = new int[1] ;
      T01RR85_A309ColLin = new short[1] ;
      T01RR86_A396EmprCod = new String[] {""} ;
      T01RR86_A719PrdNum = new String[] {""} ;
      T01RR86_n719PrdNum = new boolean[] {false} ;
      T01RR86_A647NumCon = new int[1] ;
      T01RR87_A396EmprCod = new String[] {""} ;
      T01RR87_A719PrdNum = new String[] {""} ;
      T01RR87_n719PrdNum = new boolean[] {false} ;
      Z476FindPrdAlt = "" ;
      Z679PrdAltNom = "" ;
      T01RR88_A719PrdNum = new String[] {""} ;
      T01RR88_n719PrdNum = new boolean[] {false} ;
      T01RR88_A680PrdAltNum = new String[] {""} ;
      T01RR88_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RR88_A11718PrdAltCam = new byte[1] ;
      T01RR88_A396EmprCod = new String[] {""} ;
      T01RR88_A476FindPrdAlt = new String[] {""} ;
      T01RR88_n476FindPrdAlt = new boolean[] {false} ;
      T01RR88_A679PrdAltNom = new String[] {""} ;
      T01RR88_n679PrdAltNom = new boolean[] {false} ;
      T01RR88_A778PrvAltNum = new int[1] ;
      T01RR88_n778PrvAltNum = new boolean[] {false} ;
      T01RR4_A476FindPrdAlt = new String[] {""} ;
      T01RR4_n476FindPrdAlt = new boolean[] {false} ;
      T01RR4_A679PrdAltNom = new String[] {""} ;
      T01RR4_n679PrdAltNom = new boolean[] {false} ;
      T01RR4_A778PrvAltNum = new int[1] ;
      T01RR4_n778PrvAltNum = new boolean[] {false} ;
      T01RR89_A476FindPrdAlt = new String[] {""} ;
      T01RR89_n476FindPrdAlt = new boolean[] {false} ;
      T01RR89_A679PrdAltNom = new String[] {""} ;
      T01RR89_n679PrdAltNom = new boolean[] {false} ;
      T01RR89_A778PrvAltNum = new int[1] ;
      T01RR89_n778PrvAltNum = new boolean[] {false} ;
      T01RR90_A396EmprCod = new String[] {""} ;
      T01RR90_A719PrdNum = new String[] {""} ;
      T01RR90_n719PrdNum = new boolean[] {false} ;
      T01RR90_A680PrdAltNum = new String[] {""} ;
      T01RR3_A719PrdNum = new String[] {""} ;
      T01RR3_n719PrdNum = new boolean[] {false} ;
      T01RR3_A680PrdAltNum = new String[] {""} ;
      T01RR3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RR3_A11718PrdAltCam = new byte[1] ;
      T01RR3_A396EmprCod = new String[] {""} ;
      T01RR2_A719PrdNum = new String[] {""} ;
      T01RR2_n719PrdNum = new boolean[] {false} ;
      T01RR2_A680PrdAltNum = new String[] {""} ;
      T01RR2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RR2_A11718PrdAltCam = new byte[1] ;
      T01RR2_A396EmprCod = new String[] {""} ;
      T01RR94_A476FindPrdAlt = new String[] {""} ;
      T01RR94_n476FindPrdAlt = new boolean[] {false} ;
      T01RR94_A679PrdAltNom = new String[] {""} ;
      T01RR94_n679PrdAltNom = new boolean[] {false} ;
      T01RR94_A778PrvAltNum = new int[1] ;
      T01RR94_n778PrvAltNum = new boolean[] {false} ;
      T01RR95_A396EmprCod = new String[] {""} ;
      T01RR95_A719PrdNum = new String[] {""} ;
      T01RR95_n719PrdNum = new boolean[] {false} ;
      T01RR95_A680PrdAltNum = new String[] {""} ;
      Gridlevel_productosRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_productos_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i678PrdAltFac = DecimalUtil.ZERO ;
      Gridlevel_productosColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      Z777PrvAltNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trn__default(),
         new Object[] {
             new Object[] {
            T01RR2_A719PrdNum, T01RR2_A680PrdAltNum, T01RR2_A678PrdAltFac, T01RR2_A11718PrdAltCam, T01RR2_A396EmprCod
            }
            , new Object[] {
            T01RR3_A719PrdNum, T01RR3_A680PrdAltNum, T01RR3_A678PrdAltFac, T01RR3_A11718PrdAltCam, T01RR3_A396EmprCod
            }
            , new Object[] {
            T01RR4_A476FindPrdAlt, T01RR4_n476FindPrdAlt, T01RR4_A679PrdAltNom, T01RR4_n679PrdAltNom, T01RR4_A778PrvAltNum, T01RR4_n778PrvAltNum
            }
            , new Object[] {
            T01RR5_A719PrdNum, T01RR5_A718PrdNom, T01RR5_A396EmprCod
            }
            , new Object[] {
            T01RR6_A719PrdNum, T01RR6_A718PrdNom, T01RR6_A396EmprCod
            }
            , new Object[] {
            T01RR7_A407EmprNom, T01RR7_n407EmprNom
            }
            , new Object[] {
            T01RR8_A719PrdNum, T01RR8_A407EmprNom, T01RR8_n407EmprNom, T01RR8_A718PrdNom, T01RR8_A396EmprCod
            }
            , new Object[] {
            T01RR9_A396EmprCod, T01RR9_A719PrdNum
            }
            , new Object[] {
            T01RR10_A396EmprCod, T01RR10_A719PrdNum
            }
            , new Object[] {
            T01RR11_A396EmprCod, T01RR11_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RR15_A396EmprCod, T01RR15_A719PrdNum, T01RR15_A13217NormaID
            }
            , new Object[] {
            T01RR16_A396EmprCod, T01RR16_A719PrdNum, T01RR16_A13586TheList
            }
            , new Object[] {
            T01RR17_A396EmprCod, T01RR17_A5532Lb_numero, T01RR17_A5555Lb_opcion, T01RR17_A13460Lb_linCP, T01RR17_A13458Lb_TipCP
            }
            , new Object[] {
            T01RR18_A396EmprCod, T01RR18_A13418AlbProID, T01RR18_A13442AlbProLine
            }
            , new Object[] {
            T01RR19_A396EmprCod, T01RR19_A13324LDESID, T01RR19_A13333LDESNPeque, T01RR19_A13337LDESComb, T01RR19_A13339LDESFondo, T01RR19_A13342LDESLinea
            }
            , new Object[] {
            T01RR20_A396EmprCod, T01RR20_A13312Lb_NLab, T01RR20_A13305Lb_IDVeces, T01RR20_A13306Lb_LinID
            }
            , new Object[] {
            T01RR21_A396EmprCod, T01RR21_A12673LavMqId, T01RR21_A12692LavMqLnPq, T01RR21_A12681LavMqLn
            }
            , new Object[] {
            T01RR22_A396EmprCod, T01RR22_A719PrdNum, T01RR22_A9713Tb1_Cod
            }
            , new Object[] {
            T01RR23_A396EmprCod, T01RR23_A12236PrdNumD, T01RR23_A719PrdNum
            }
            , new Object[] {
            T01RR24_A396EmprCod, T01RR24_A12225DocDisID, T01RR24_A12226LinDisID
            }
            , new Object[] {
            T01RR25_A396EmprCod, T01RR25_A12225DocDisID
            }
            , new Object[] {
            T01RR26_A396EmprCod, T01RR26_A12205OrdenCID, T01RR26_A12206OrdenCLnId
            }
            , new Object[] {
            T01RR27_A396EmprCod, T01RR27_A719PrdNum, T01RR27_A11664LoteID, T01RR27_A11665LoteFec
            }
            , new Object[] {
            T01RR28_A396EmprCod, T01RR28_A4850DevComCod, T01RR28_A719PrdNum
            }
            , new Object[] {
            T01RR29_A396EmprCod, T01RR29_A252CliCod, T01RR29_A494ForSer, T01RR29_A482ForColNom, T01RR29_A483ForColNum, T01RR29_A831TipColCod, T01RR29_A3571EnsCod, T01RR29_A3582EnsLin
            }
            , new Object[] {
            T01RR30_A396EmprCod, T01RR30_A129BarCod, T01RR30_A132BarCodReo, T01RR30_A130BarCodPar, T01RR30_A4075recestncol, T01RR30_A4076recestnpro, T01RR30_A4108recestlin
            }
            , new Object[] {
            T01RR31_A396EmprCod, T01RR31_A4052EstNumFor, T01RR31_A4053EstNumCol, T01RR31_A4090EstEspLin
            }
            , new Object[] {
            T01RR32_A396EmprCod, T01RR32_A4052EstNumFor, T01RR32_A4053EstNumCol, T01RR32_A4084EstProLin
            }
            , new Object[] {
            T01RR33_A396EmprCod, T01RR33_A11644TransferId, T01RR33_A11653TransferLn
            }
            , new Object[] {
            T01RR34_A396EmprCod, T01RR34_A11634TaesId, T01RR34_A11637TaesLn, T01RR34_A11641TaesLnP
            }
            , new Object[] {
            T01RR35_A396EmprCod, T01RR35_A719PrdNum, T01RR35_A11329H_stklin
            }
            , new Object[] {
            T01RR36_A396EmprCod, T01RR36_A11270Pot_num, T01RR36_A11271Pot_lin
            }
            , new Object[] {
            T01RR37_A396EmprCod, T01RR37_A719PrdNum, T01RR37_A11199PrdNcasC
            }
            , new Object[] {
            T01RR38_A396EmprCod, T01RR38_A719PrdNum, T01RR38_A11197CFraseR
            }
            , new Object[] {
            T01RR39_A396EmprCod, T01RR39_A10243Jt_codigo, T01RR39_A10246Jt_ord
            }
            , new Object[] {
            T01RR40_A396EmprCod, T01RR40_A10236Bny_dia, T01RR40_A10238Bny_lin
            }
            , new Object[] {
            T01RR41_A396EmprCod, T01RR41_A129BarCod, T01RR41_A132BarCodReo, T01RR41_A130BarCodPar, T01RR41_A758ProCod, T01RR41_A194BarOrdLin, T01RR41_A719PrdNum
            }
            , new Object[] {
            T01RR42_A396EmprCod, T01RR42_A719PrdNum, T01RR42_A9735Cod_Rgo
            }
            , new Object[] {
            T01RR43_A396EmprCod, T01RR43_A719PrdNum, T01RR43_A9711Ct_codigo
            }
            , new Object[] {
            T01RR44_A396EmprCod, T01RR44_A9652OeNum, T01RR44_A9653OeHdr, T01RR44_A9654OeHdrr, T01RR44_A9655OeHdrp, T01RR44_A9656OeLinC, T01RR44_A9657OeComb, T01RR44_A9658Oefondo, T01RR44_A9659OeMolCil, T01RR44_A9686OePasLin,
            T01RR44_A9694OePasPLi
            }
            , new Object[] {
            T01RR45_A396EmprCod, T01RR45_A9652OeNum, T01RR45_A9653OeHdr, T01RR45_A9654OeHdrr, T01RR45_A9655OeHdrp, T01RR45_A9656OeLinC, T01RR45_A9657OeComb, T01RR45_A9658Oefondo, T01RR45_A9659OeMolCil, T01RR45_A9677OeMolLin
            }
            , new Object[] {
            T01RR46_A396EmprCod, T01RR46_A9578Pas_Num, T01RR46_A719PrdNum
            }
            , new Object[] {
            T01RR47_A396EmprCod, T01RR47_A719PrdNum, T01RR47_A8908CC_AlmCod
            }
            , new Object[] {
            T01RR48_A396EmprCod, T01RR48_A719PrdNum, T01RR48_A8661Almc_Ln
            }
            , new Object[] {
            T01RR49_A396EmprCod, T01RR49_A719PrdNum, T01RR49_A8648Mat_PrdN
            }
            , new Object[] {
            T01RR50_A396EmprCod, T01RR50_A8585Pet_cod, T01RR50_A719PrdNum
            }
            , new Object[] {
            T01RR51_A396EmprCod, T01RR51_A719PrdNum, T01RR51_A8577RecFecHr
            }
            , new Object[] {
            T01RR52_A396EmprCod, T01RR52_A719PrdNum, T01RR52_A8366PrdAnyo, T01RR52_A8360PrdProv
            }
            , new Object[] {
            T01RR53_A396EmprCod, T01RR53_A252CliCod, T01RR53_A494ForSer, T01RR53_A482ForColNom, T01RR53_A483ForColNum, T01RR53_A831TipColCod, T01RR53_A7797Sim_lin
            }
            , new Object[] {
            T01RR54_A396EmprCod, T01RR54_A7163Vir_Codigo, T01RR54_A719PrdNum
            }
            , new Object[] {
            T01RR55_A396EmprCod, T01RR55_A6310Lb_TaAuxC, T01RR55_A6313lb_TaAuxL, T01RR55_A6378Lb_TauxLP
            }
            , new Object[] {
            T01RR56_A396EmprCod, T01RR56_A6290PreCoNum, T01RR56_A719PrdNum
            }
            , new Object[] {
            T01RR57_A396EmprCod, T01RR57_A719PrdNum, T01RR57_A6158PrdPrv
            }
            , new Object[] {
            T01RR58_A396EmprCod, T01RR58_A719PrdNum, T01RR58_A5973PrdSusNum
            }
            , new Object[] {
            T01RR59_A396EmprCod, T01RR59_A5612Lb_CodGru, T01RR59_A5615Lb_LinGru
            }
            , new Object[] {
            T01RR60_A396EmprCod, T01RR60_A5532Lb_numero, T01RR60_A5555Lb_opcion, T01RR60_A5560Lb_LineaPr
            }
            , new Object[] {
            T01RR61_A396EmprCod, T01RR61_A5532Lb_numero, T01RR61_A5555Lb_opcion, T01RR61_A5557Lb_LineaC
            }
            , new Object[] {
            T01RR62_A396EmprCod, T01RR62_A5145SobCod, T01RR62_A719PrdNum
            }
            , new Object[] {
            T01RR63_A396EmprCod, T01RR63_A4744RecPreCod, T01RR63_A4762RecPreLin, T01RR63_A4763RecPreNli
            }
            , new Object[] {
            T01RR64_A396EmprCod, T01RR64_A4492HreBarCod, T01RR64_A4493HreBarReo, T01RR64_A4494HreBarPar, T01RR64_A4495HreNumCie, T01RR64_A4545HreLinMaq, T01RR64_A4550HreLinPro, T01RR64_A4557HreRecLin
            }
            , new Object[] {
            T01RR65_A396EmprCod, T01RR65_A4492HreBarCod, T01RR65_A4493HreBarReo, T01RR65_A4494HreBarPar, T01RR65_A4495HreNumCie, T01RR65_A4508HreLinMAL, T01RR65_A4509HreNumAny, T01RR65_A719PrdNum
            }
            , new Object[] {
            T01RR66_A396EmprCod, T01RR66_A252CliCod, T01RR66_A4415EstCol, T01RR66_A4416EstColLin
            }
            , new Object[] {
            T01RR67_A396EmprCod, T01RR67_A129BarCod, T01RR67_A132BarCodReo, T01RR67_A130BarCodPar, T01RR67_A2524DisComLin, T01RR67_A1056DisComCod, T01RR67_A1032FonCod, T01RR67_A2124RecMolCod, T01RR67_A2672RecPasLin, T01RR67_A2675RecPasPLi
            }
            , new Object[] {
            T01RR68_A396EmprCod, T01RR68_A129BarCod, T01RR68_A132BarCodReo, T01RR68_A130BarCodPar, T01RR68_A2524DisComLin, T01RR68_A1056DisComCod, T01RR68_A1032FonCod, T01RR68_A2124RecMolCod, T01RR68_A2126RecMolLin
            }
            , new Object[] {
            T01RR69_A396EmprCod, T01RR69_A2107PasCod, T01RR69_A719PrdNum
            }
            , new Object[] {
            T01RR70_A396EmprCod, T01RR70_A2637HisEstHRu, T01RR70_A2636HisEstHRe, T01RR70_A2635HisEstHPa, T01RR70_A2638HisEstLCo, T01RR70_A2630HisEstCom, T01RR70_A2634HisEstFon, T01RR70_A719PrdNum
            }
            , new Object[] {
            T01RR71_A396EmprCod, T01RR71_A252CliCod, T01RR71_A2141SerEst, T01RR71_A1013DibCli, T01RR71_A1014DibInt, T01RR71_A2074ColCom, T01RR71_A2078ColFon, T01RR71_A2098MolCod, T01RR71_A2535ForPrdLin
            }
            , new Object[] {
            T01RR72_A396EmprCod, T01RR72_A719PrdNum, T01RR72_A3342CCStkLin
            }
            , new Object[] {
            T01RR73_A396EmprCod, T01RR73_A252CliCod, T01RR73_A2891HMaForSer, T01RR73_A2892HMaForCNom, T01RR73_A2893HMaForCNum, T01RR73_A2894HMaTipCCod, T01RR73_A2895HMaForNumC, T01RR73_A2897HMaColLin, T01RR73_A2896HMaFec, T01RR73_A2907HmaLin
            }
            , new Object[] {
            T01RR74_A396EmprCod, T01RR74_A129BarCod, T01RR74_A132BarCodReo, T01RR74_A130BarCodPar, T01RR74_A2808RecLinMAL, T01RR74_A1377RecNumAny, T01RR74_A719PrdNum
            }
            , new Object[] {
            T01RR75_A396EmprCod, T01RR75_A129BarCod, T01RR75_A132BarCodReo, T01RR75_A130BarCodPar, T01RR75_A2804RecLinMaq, T01RR75_A1273RecLinPro, T01RR75_A811RecLin
            }
            , new Object[] {
            T01RR76_A396EmprCod, T01RR76_A129BarCod, T01RR76_A132BarCodReo, T01RR76_A130BarCodPar, T01RR76_A2494BarDosPro, T01RR76_A719PrdNum
            }
            , new Object[] {
            T01RR77_A396EmprCod, T01RR77_A1314EnsLabCod, T01RR77_A1317EnsLabLin
            }
            , new Object[] {
            T01RR78_A396EmprCod, T01RR78_A910Workstat, T01RR78_A887EscMLin
            }
            , new Object[] {
            T01RR79_A396EmprCod, T01RR79_A859CumCodCont, T01RR79_A719PrdNum
            }
            , new Object[] {
            T01RR80_A396EmprCod, T01RR80_A719PrdNum, T01RR80_A810RecFec
            }
            , new Object[] {
            T01RR81_A396EmprCod, T01RR81_A486ForNumCol, T01RR81_A715PrdLin
            }
            , new Object[] {
            T01RR82_A396EmprCod, T01RR82_A719PrdNum, T01RR82_A681PrdAny
            }
            , new Object[] {
            T01RR83_A396EmprCod, T01RR83_A719PrdNum, T01RR83_A688PrdComCod
            }
            , new Object[] {
            T01RR84_A396EmprCod, T01RR84_A658PedCod, T01RR84_A719PrdNum
            }
            , new Object[] {
            T01RR85_A396EmprCod, T01RR85_A486ForNumCol, T01RR85_A309ColLin
            }
            , new Object[] {
            T01RR86_A396EmprCod, T01RR86_A719PrdNum, T01RR86_A647NumCon
            }
            , new Object[] {
            T01RR87_A396EmprCod, T01RR87_A719PrdNum
            }
            , new Object[] {
            T01RR88_A719PrdNum, T01RR88_A680PrdAltNum, T01RR88_A678PrdAltFac, T01RR88_A11718PrdAltCam, T01RR88_A396EmprCod, T01RR88_A476FindPrdAlt, T01RR88_n476FindPrdAlt, T01RR88_A679PrdAltNom, T01RR88_n679PrdAltNom, T01RR88_A778PrvAltNum,
            T01RR88_n778PrvAltNum
            }
            , new Object[] {
            T01RR89_A476FindPrdAlt, T01RR89_n476FindPrdAlt, T01RR89_A679PrdAltNom, T01RR89_n679PrdAltNom, T01RR89_A778PrvAltNum, T01RR89_n778PrvAltNum
            }
            , new Object[] {
            T01RR90_A396EmprCod, T01RR90_A719PrdNum, T01RR90_A680PrdAltNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RR94_A476FindPrdAlt, T01RR94_n476FindPrdAlt, T01RR94_A679PrdAltNom, T01RR94_n679PrdAltNom, T01RR94_A778PrvAltNum, T01RR94_n778PrvAltNum
            }
            , new Object[] {
            T01RR95_A396EmprCod, T01RR95_A719PrdNum, T01RR95_A680PrdAltNum
            }
         }
      );
      AV19Pgmname = "FormulacionTinte.ProductosAlternativos_TRN" ;
      Z11718PrdAltCam = (byte)(0) ;
      i11718PrdAltCam = (byte)(0) ;
      A11718PrdAltCam = (byte)(0) ;
      Z678PrdAltFac = DecimalUtil.doubleToDec(1) ;
      i678PrdAltFac = DecimalUtil.doubleToDec(1) ;
      A678PrdAltFac = DecimalUtil.doubleToDec(1) ;
   }

   private byte Z11718PrdAltCam ;
   private byte GxWebError ;
   private byte A11718PrdAltCam ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_productos_Backcolorstyle ;
   private byte subGridlevel_productos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11718PrdAltCam ;
   private byte subGridlevel_productos_Allowselection ;
   private byte subGridlevel_productos_Allowhovering ;
   private byte subGridlevel_productos_Allowcollapsing ;
   private byte subGridlevel_productos_Collapsed ;
   private byte GXv_int10[] ;
   private short nRcdDeleted_78 ;
   private short nRcdExists_78 ;
   private short nIsMod_78 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount78 ;
   private short RcdFound78 ;
   private short nBlankRcdUsr78 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_78 ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int A778PrvAltNum ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtPrdAltNum_Enabled ;
   private int edtPrvAltNum_Enabled ;
   private int edtPrvAltNom_Enabled ;
   private int edtPrdAltFac_Enabled ;
   private int edtFindPrdAlt_Enabled ;
   private int fRowAdded ;
   private int Combo_prdaltnum_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int Z778PrvAltNum ;
   private int subGridlevel_productos_Backcolor ;
   private int subGridlevel_productos_Allbackcolor ;
   private int defedtFindPrdAlt_Enabled ;
   private int defedtPrdAltNum_Enabled ;
   private int idxLst ;
   private int subGridlevel_productos_Selectedindex ;
   private int subGridlevel_productos_Selectioncolor ;
   private int subGridlevel_productos_Hoveringcolor ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_PRODUCTOS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z678PrdAltFac ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal i678PrdAltFac ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV14PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z680PrdAltNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A680PrdAltNum ;
   private String Gx_msg ;
   private String Gx_mode ;
   private String AV13EmprCod ;
   private String AV14PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_32_idx="0001" ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String divTableleaflevel_productos_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV19Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdaltnum_Caption ;
   private String Combo_prdaltnum_Cls ;
   private String Combo_prdaltnum_Internalname ;
   private String sMode78 ;
   private String edtPrdAltNum_Internalname ;
   private String edtPrvAltNum_Internalname ;
   private String edtPrvAltNom_Internalname ;
   private String edtPrdAltFac_Internalname ;
   private String edtFindPrdAlt_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_productos_Internalname ;
   private String A407EmprNom ;
   private String A679PrdAltNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdaltnum_Objectcall ;
   private String Combo_prdaltnum_Class ;
   private String Combo_prdaltnum_Icontype ;
   private String Combo_prdaltnum_Icon ;
   private String Combo_prdaltnum_Tooltip ;
   private String Combo_prdaltnum_Selectedvalue_set ;
   private String Combo_prdaltnum_Selectedvalue_get ;
   private String Combo_prdaltnum_Selectedtext_set ;
   private String Combo_prdaltnum_Selectedtext_get ;
   private String Combo_prdaltnum_Gamoauthtoken ;
   private String Combo_prdaltnum_Ddointernalname ;
   private String Combo_prdaltnum_Titlecontrolalign ;
   private String Combo_prdaltnum_Dropdownoptionstype ;
   private String Combo_prdaltnum_Titlecontrolidtoreplace ;
   private String Combo_prdaltnum_Datalisttype ;
   private String Combo_prdaltnum_Datalistfixedvalues ;
   private String Combo_prdaltnum_Datalistproc ;
   private String Combo_prdaltnum_Datalistprocparametersprefix ;
   private String Combo_prdaltnum_Remoteservicesparameters ;
   private String Combo_prdaltnum_Htmltemplate ;
   private String Combo_prdaltnum_Multiplevaluestype ;
   private String Combo_prdaltnum_Loadingdata ;
   private String Combo_prdaltnum_Noresultsfound ;
   private String Combo_prdaltnum_Emptyitemtext ;
   private String Combo_prdaltnum_Onlyselectedvalues ;
   private String Combo_prdaltnum_Selectalltext ;
   private String Combo_prdaltnum_Multiplevaluesseparator ;
   private String Combo_prdaltnum_Addnewoptiontext ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A777PrvAltNom ;
   private String A476FindPrdAlt ;
   private String AV20Station ;
   private String AV21Emprnom ;
   private String AV22Usurcod ;
   private String Z407EmprNom ;
   private String Z476FindPrdAlt ;
   private String Z679PrdAltNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_productos_Class ;
   private String subGridlevel_productos_Linesclass ;
   private String ROClassString ;
   private String edtPrdAltNum_Jsonclick ;
   private String edtPrvAltNum_Jsonclick ;
   private String edtPrvAltNom_Jsonclick ;
   private String edtPrdAltFac_Jsonclick ;
   private String edtFindPrdAlt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_productos_Header ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z777PrvAltNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n778PrvAltNum ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdaltnum_Isgriditem ;
   private boolean Combo_prdaltnum_Emptyitem ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n679PrdAltNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdaltnum_Enabled ;
   private boolean Combo_prdaltnum_Visible ;
   private boolean Combo_prdaltnum_Allowmultipleselection ;
   private boolean Combo_prdaltnum_Hasdescription ;
   private boolean Combo_prdaltnum_Includeonlyselectedoption ;
   private boolean Combo_prdaltnum_Includeselectalloption ;
   private boolean Combo_prdaltnum_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n476FindPrdAlt ;
   private String AV16ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_productosContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_productosRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_productosColumn ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdaltnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPrdAltCam ;
   private IDataStoreProvider pr_default ;
   private String[] T01RR7_A407EmprNom ;
   private boolean[] T01RR7_n407EmprNom ;
   private String[] T01RR8_A719PrdNum ;
   private boolean[] T01RR8_n719PrdNum ;
   private String[] T01RR8_A407EmprNom ;
   private boolean[] T01RR8_n407EmprNom ;
   private String[] T01RR8_A718PrdNom ;
   private String[] T01RR8_A396EmprCod ;
   private String[] T01RR9_A396EmprCod ;
   private String[] T01RR9_A719PrdNum ;
   private boolean[] T01RR9_n719PrdNum ;
   private String[] T01RR6_A719PrdNum ;
   private boolean[] T01RR6_n719PrdNum ;
   private String[] T01RR6_A718PrdNom ;
   private String[] T01RR6_A396EmprCod ;
   private String[] T01RR10_A396EmprCod ;
   private String[] T01RR10_A719PrdNum ;
   private boolean[] T01RR10_n719PrdNum ;
   private String[] T01RR11_A396EmprCod ;
   private String[] T01RR11_A719PrdNum ;
   private boolean[] T01RR11_n719PrdNum ;
   private String[] T01RR5_A719PrdNum ;
   private boolean[] T01RR5_n719PrdNum ;
   private String[] T01RR5_A718PrdNom ;
   private String[] T01RR5_A396EmprCod ;
   private String[] T01RR15_A396EmprCod ;
   private String[] T01RR15_A719PrdNum ;
   private boolean[] T01RR15_n719PrdNum ;
   private String[] T01RR15_A13217NormaID ;
   private String[] T01RR16_A396EmprCod ;
   private String[] T01RR16_A719PrdNum ;
   private boolean[] T01RR16_n719PrdNum ;
   private String[] T01RR16_A13586TheList ;
   private String[] T01RR17_A396EmprCod ;
   private int[] T01RR17_A5532Lb_numero ;
   private String[] T01RR17_A5555Lb_opcion ;
   private short[] T01RR17_A13460Lb_linCP ;
   private String[] T01RR17_A13458Lb_TipCP ;
   private String[] T01RR18_A396EmprCod ;
   private int[] T01RR18_A13418AlbProID ;
   private short[] T01RR18_A13442AlbProLine ;
   private String[] T01RR19_A396EmprCod ;
   private int[] T01RR19_A13324LDESID ;
   private String[] T01RR19_A13333LDESNPeque ;
   private String[] T01RR19_A13337LDESComb ;
   private String[] T01RR19_A13339LDESFondo ;
   private short[] T01RR19_A13342LDESLinea ;
   private String[] T01RR20_A396EmprCod ;
   private int[] T01RR20_A13312Lb_NLab ;
   private short[] T01RR20_A13305Lb_IDVeces ;
   private short[] T01RR20_A13306Lb_LinID ;
   private String[] T01RR21_A396EmprCod ;
   private int[] T01RR21_A12673LavMqId ;
   private short[] T01RR21_A12692LavMqLnPq ;
   private short[] T01RR21_A12681LavMqLn ;
   private String[] T01RR22_A396EmprCod ;
   private String[] T01RR22_A719PrdNum ;
   private boolean[] T01RR22_n719PrdNum ;
   private short[] T01RR22_A9713Tb1_Cod ;
   private String[] T01RR23_A396EmprCod ;
   private String[] T01RR23_A12236PrdNumD ;
   private String[] T01RR23_A719PrdNum ;
   private boolean[] T01RR23_n719PrdNum ;
   private String[] T01RR24_A396EmprCod ;
   private long[] T01RR24_A12225DocDisID ;
   private short[] T01RR24_A12226LinDisID ;
   private String[] T01RR25_A396EmprCod ;
   private long[] T01RR25_A12225DocDisID ;
   private String[] T01RR26_A396EmprCod ;
   private long[] T01RR26_A12205OrdenCID ;
   private short[] T01RR26_A12206OrdenCLnId ;
   private String[] T01RR27_A396EmprCod ;
   private String[] T01RR27_A719PrdNum ;
   private boolean[] T01RR27_n719PrdNum ;
   private String[] T01RR27_A11664LoteID ;
   private java.util.Date[] T01RR27_A11665LoteFec ;
   private String[] T01RR28_A396EmprCod ;
   private int[] T01RR28_A4850DevComCod ;
   private String[] T01RR28_A719PrdNum ;
   private boolean[] T01RR28_n719PrdNum ;
   private String[] T01RR29_A396EmprCod ;
   private int[] T01RR29_A252CliCod ;
   private String[] T01RR29_A494ForSer ;
   private String[] T01RR29_A482ForColNom ;
   private int[] T01RR29_A483ForColNum ;
   private byte[] T01RR29_A831TipColCod ;
   private String[] T01RR29_A3571EnsCod ;
   private short[] T01RR29_A3582EnsLin ;
   private String[] T01RR30_A396EmprCod ;
   private int[] T01RR30_A129BarCod ;
   private byte[] T01RR30_A132BarCodReo ;
   private String[] T01RR30_A130BarCodPar ;
   private byte[] T01RR30_A4075recestncol ;
   private byte[] T01RR30_A4076recestnpro ;
   private short[] T01RR30_A4108recestlin ;
   private String[] T01RR31_A396EmprCod ;
   private int[] T01RR31_A4052EstNumFor ;
   private byte[] T01RR31_A4053EstNumCol ;
   private byte[] T01RR31_A4090EstEspLin ;
   private String[] T01RR32_A396EmprCod ;
   private int[] T01RR32_A4052EstNumFor ;
   private byte[] T01RR32_A4053EstNumCol ;
   private byte[] T01RR32_A4084EstProLin ;
   private String[] T01RR33_A396EmprCod ;
   private long[] T01RR33_A11644TransferId ;
   private int[] T01RR33_A11653TransferLn ;
   private String[] T01RR34_A396EmprCod ;
   private String[] T01RR34_A11634TaesId ;
   private short[] T01RR34_A11637TaesLn ;
   private short[] T01RR34_A11641TaesLnP ;
   private String[] T01RR35_A396EmprCod ;
   private String[] T01RR35_A719PrdNum ;
   private boolean[] T01RR35_n719PrdNum ;
   private long[] T01RR35_A11329H_stklin ;
   private String[] T01RR36_A396EmprCod ;
   private int[] T01RR36_A11270Pot_num ;
   private short[] T01RR36_A11271Pot_lin ;
   private String[] T01RR37_A396EmprCod ;
   private String[] T01RR37_A719PrdNum ;
   private boolean[] T01RR37_n719PrdNum ;
   private String[] T01RR37_A11199PrdNcasC ;
   private String[] T01RR38_A396EmprCod ;
   private String[] T01RR38_A719PrdNum ;
   private boolean[] T01RR38_n719PrdNum ;
   private String[] T01RR38_A11197CFraseR ;
   private String[] T01RR39_A396EmprCod ;
   private short[] T01RR39_A10243Jt_codigo ;
   private short[] T01RR39_A10246Jt_ord ;
   private String[] T01RR40_A396EmprCod ;
   private java.util.Date[] T01RR40_A10236Bny_dia ;
   private short[] T01RR40_A10238Bny_lin ;
   private String[] T01RR41_A396EmprCod ;
   private int[] T01RR41_A129BarCod ;
   private byte[] T01RR41_A132BarCodReo ;
   private String[] T01RR41_A130BarCodPar ;
   private String[] T01RR41_A758ProCod ;
   private short[] T01RR41_A194BarOrdLin ;
   private String[] T01RR41_A719PrdNum ;
   private boolean[] T01RR41_n719PrdNum ;
   private String[] T01RR42_A396EmprCod ;
   private String[] T01RR42_A719PrdNum ;
   private boolean[] T01RR42_n719PrdNum ;
   private String[] T01RR42_A9735Cod_Rgo ;
   private String[] T01RR43_A396EmprCod ;
   private String[] T01RR43_A719PrdNum ;
   private boolean[] T01RR43_n719PrdNum ;
   private short[] T01RR43_A9711Ct_codigo ;
   private String[] T01RR44_A396EmprCod ;
   private long[] T01RR44_A9652OeNum ;
   private int[] T01RR44_A9653OeHdr ;
   private byte[] T01RR44_A9654OeHdrr ;
   private String[] T01RR44_A9655OeHdrp ;
   private byte[] T01RR44_A9656OeLinC ;
   private String[] T01RR44_A9657OeComb ;
   private String[] T01RR44_A9658Oefondo ;
   private byte[] T01RR44_A9659OeMolCil ;
   private short[] T01RR44_A9686OePasLin ;
   private short[] T01RR44_A9694OePasPLi ;
   private String[] T01RR45_A396EmprCod ;
   private long[] T01RR45_A9652OeNum ;
   private int[] T01RR45_A9653OeHdr ;
   private byte[] T01RR45_A9654OeHdrr ;
   private String[] T01RR45_A9655OeHdrp ;
   private byte[] T01RR45_A9656OeLinC ;
   private String[] T01RR45_A9657OeComb ;
   private String[] T01RR45_A9658Oefondo ;
   private byte[] T01RR45_A9659OeMolCil ;
   private byte[] T01RR45_A9677OeMolLin ;
   private String[] T01RR46_A396EmprCod ;
   private int[] T01RR46_A9578Pas_Num ;
   private String[] T01RR46_A719PrdNum ;
   private boolean[] T01RR46_n719PrdNum ;
   private String[] T01RR47_A396EmprCod ;
   private String[] T01RR47_A719PrdNum ;
   private boolean[] T01RR47_n719PrdNum ;
   private byte[] T01RR47_A8908CC_AlmCod ;
   private String[] T01RR48_A396EmprCod ;
   private String[] T01RR48_A719PrdNum ;
   private boolean[] T01RR48_n719PrdNum ;
   private int[] T01RR48_A8661Almc_Ln ;
   private String[] T01RR49_A396EmprCod ;
   private String[] T01RR49_A719PrdNum ;
   private boolean[] T01RR49_n719PrdNum ;
   private String[] T01RR49_A8648Mat_PrdN ;
   private String[] T01RR50_A396EmprCod ;
   private long[] T01RR50_A8585Pet_cod ;
   private String[] T01RR50_A719PrdNum ;
   private boolean[] T01RR50_n719PrdNum ;
   private String[] T01RR51_A396EmprCod ;
   private String[] T01RR51_A719PrdNum ;
   private boolean[] T01RR51_n719PrdNum ;
   private java.util.Date[] T01RR51_A8577RecFecHr ;
   private String[] T01RR52_A396EmprCod ;
   private String[] T01RR52_A719PrdNum ;
   private boolean[] T01RR52_n719PrdNum ;
   private short[] T01RR52_A8366PrdAnyo ;
   private int[] T01RR52_A8360PrdProv ;
   private String[] T01RR53_A396EmprCod ;
   private int[] T01RR53_A252CliCod ;
   private String[] T01RR53_A494ForSer ;
   private String[] T01RR53_A482ForColNom ;
   private int[] T01RR53_A483ForColNum ;
   private byte[] T01RR53_A831TipColCod ;
   private short[] T01RR53_A7797Sim_lin ;
   private String[] T01RR54_A396EmprCod ;
   private int[] T01RR54_A7163Vir_Codigo ;
   private String[] T01RR54_A719PrdNum ;
   private boolean[] T01RR54_n719PrdNum ;
   private String[] T01RR55_A396EmprCod ;
   private String[] T01RR55_A6310Lb_TaAuxC ;
   private short[] T01RR55_A6313lb_TaAuxL ;
   private short[] T01RR55_A6378Lb_TauxLP ;
   private String[] T01RR56_A396EmprCod ;
   private int[] T01RR56_A6290PreCoNum ;
   private String[] T01RR56_A719PrdNum ;
   private boolean[] T01RR56_n719PrdNum ;
   private String[] T01RR57_A396EmprCod ;
   private String[] T01RR57_A719PrdNum ;
   private boolean[] T01RR57_n719PrdNum ;
   private int[] T01RR57_A6158PrdPrv ;
   private String[] T01RR58_A396EmprCod ;
   private String[] T01RR58_A719PrdNum ;
   private boolean[] T01RR58_n719PrdNum ;
   private String[] T01RR58_A5973PrdSusNum ;
   private String[] T01RR59_A396EmprCod ;
   private String[] T01RR59_A5612Lb_CodGru ;
   private short[] T01RR59_A5615Lb_LinGru ;
   private String[] T01RR60_A396EmprCod ;
   private int[] T01RR60_A5532Lb_numero ;
   private String[] T01RR60_A5555Lb_opcion ;
   private short[] T01RR60_A5560Lb_LineaPr ;
   private String[] T01RR61_A396EmprCod ;
   private int[] T01RR61_A5532Lb_numero ;
   private String[] T01RR61_A5555Lb_opcion ;
   private short[] T01RR61_A5557Lb_LineaC ;
   private String[] T01RR62_A396EmprCod ;
   private int[] T01RR62_A5145SobCod ;
   private String[] T01RR62_A719PrdNum ;
   private boolean[] T01RR62_n719PrdNum ;
   private String[] T01RR63_A396EmprCod ;
   private int[] T01RR63_A4744RecPreCod ;
   private short[] T01RR63_A4762RecPreLin ;
   private short[] T01RR63_A4763RecPreNli ;
   private String[] T01RR64_A396EmprCod ;
   private int[] T01RR64_A4492HreBarCod ;
   private byte[] T01RR64_A4493HreBarReo ;
   private String[] T01RR64_A4494HreBarPar ;
   private byte[] T01RR64_A4495HreNumCie ;
   private short[] T01RR64_A4545HreLinMaq ;
   private byte[] T01RR64_A4550HreLinPro ;
   private short[] T01RR64_A4557HreRecLin ;
   private String[] T01RR65_A396EmprCod ;
   private int[] T01RR65_A4492HreBarCod ;
   private byte[] T01RR65_A4493HreBarReo ;
   private String[] T01RR65_A4494HreBarPar ;
   private byte[] T01RR65_A4495HreNumCie ;
   private short[] T01RR65_A4508HreLinMAL ;
   private byte[] T01RR65_A4509HreNumAny ;
   private String[] T01RR65_A719PrdNum ;
   private boolean[] T01RR65_n719PrdNum ;
   private String[] T01RR66_A396EmprCod ;
   private int[] T01RR66_A252CliCod ;
   private String[] T01RR66_A4415EstCol ;
   private short[] T01RR66_A4416EstColLin ;
   private String[] T01RR67_A396EmprCod ;
   private int[] T01RR67_A129BarCod ;
   private byte[] T01RR67_A132BarCodReo ;
   private String[] T01RR67_A130BarCodPar ;
   private byte[] T01RR67_A2524DisComLin ;
   private String[] T01RR67_A1056DisComCod ;
   private String[] T01RR67_A1032FonCod ;
   private byte[] T01RR67_A2124RecMolCod ;
   private short[] T01RR67_A2672RecPasLin ;
   private short[] T01RR67_A2675RecPasPLi ;
   private String[] T01RR68_A396EmprCod ;
   private int[] T01RR68_A129BarCod ;
   private byte[] T01RR68_A132BarCodReo ;
   private String[] T01RR68_A130BarCodPar ;
   private byte[] T01RR68_A2524DisComLin ;
   private String[] T01RR68_A1056DisComCod ;
   private String[] T01RR68_A1032FonCod ;
   private byte[] T01RR68_A2124RecMolCod ;
   private byte[] T01RR68_A2126RecMolLin ;
   private String[] T01RR69_A396EmprCod ;
   private String[] T01RR69_A2107PasCod ;
   private String[] T01RR69_A719PrdNum ;
   private boolean[] T01RR69_n719PrdNum ;
   private String[] T01RR70_A396EmprCod ;
   private int[] T01RR70_A2637HisEstHRu ;
   private byte[] T01RR70_A2636HisEstHRe ;
   private String[] T01RR70_A2635HisEstHPa ;
   private byte[] T01RR70_A2638HisEstLCo ;
   private String[] T01RR70_A2630HisEstCom ;
   private String[] T01RR70_A2634HisEstFon ;
   private String[] T01RR70_A719PrdNum ;
   private boolean[] T01RR70_n719PrdNum ;
   private String[] T01RR71_A396EmprCod ;
   private int[] T01RR71_A252CliCod ;
   private String[] T01RR71_A2141SerEst ;
   private String[] T01RR71_A1013DibCli ;
   private int[] T01RR71_A1014DibInt ;
   private String[] T01RR71_A2074ColCom ;
   private String[] T01RR71_A2078ColFon ;
   private byte[] T01RR71_A2098MolCod ;
   private short[] T01RR71_A2535ForPrdLin ;
   private String[] T01RR72_A396EmprCod ;
   private String[] T01RR72_A719PrdNum ;
   private boolean[] T01RR72_n719PrdNum ;
   private long[] T01RR72_A3342CCStkLin ;
   private String[] T01RR73_A396EmprCod ;
   private int[] T01RR73_A252CliCod ;
   private String[] T01RR73_A2891HMaForSer ;
   private String[] T01RR73_A2892HMaForCNom ;
   private int[] T01RR73_A2893HMaForCNum ;
   private byte[] T01RR73_A2894HMaTipCCod ;
   private int[] T01RR73_A2895HMaForNumC ;
   private short[] T01RR73_A2897HMaColLin ;
   private java.util.Date[] T01RR73_A2896HMaFec ;
   private short[] T01RR73_A2907HmaLin ;
   private String[] T01RR74_A396EmprCod ;
   private int[] T01RR74_A129BarCod ;
   private byte[] T01RR74_A132BarCodReo ;
   private String[] T01RR74_A130BarCodPar ;
   private short[] T01RR74_A2808RecLinMAL ;
   private byte[] T01RR74_A1377RecNumAny ;
   private String[] T01RR74_A719PrdNum ;
   private boolean[] T01RR74_n719PrdNum ;
   private String[] T01RR75_A396EmprCod ;
   private int[] T01RR75_A129BarCod ;
   private byte[] T01RR75_A132BarCodReo ;
   private String[] T01RR75_A130BarCodPar ;
   private short[] T01RR75_A2804RecLinMaq ;
   private byte[] T01RR75_A1273RecLinPro ;
   private short[] T01RR75_A811RecLin ;
   private String[] T01RR76_A396EmprCod ;
   private int[] T01RR76_A129BarCod ;
   private byte[] T01RR76_A132BarCodReo ;
   private String[] T01RR76_A130BarCodPar ;
   private String[] T01RR76_A2494BarDosPro ;
   private String[] T01RR76_A719PrdNum ;
   private boolean[] T01RR76_n719PrdNum ;
   private String[] T01RR77_A396EmprCod ;
   private int[] T01RR77_A1314EnsLabCod ;
   private short[] T01RR77_A1317EnsLabLin ;
   private String[] T01RR78_A396EmprCod ;
   private String[] T01RR78_A910Workstat ;
   private int[] T01RR78_A887EscMLin ;
   private String[] T01RR79_A396EmprCod ;
   private int[] T01RR79_A859CumCodCont ;
   private String[] T01RR79_A719PrdNum ;
   private boolean[] T01RR79_n719PrdNum ;
   private String[] T01RR80_A396EmprCod ;
   private String[] T01RR80_A719PrdNum ;
   private boolean[] T01RR80_n719PrdNum ;
   private java.util.Date[] T01RR80_A810RecFec ;
   private String[] T01RR81_A396EmprCod ;
   private int[] T01RR81_A486ForNumCol ;
   private short[] T01RR81_A715PrdLin ;
   private String[] T01RR82_A396EmprCod ;
   private String[] T01RR82_A719PrdNum ;
   private boolean[] T01RR82_n719PrdNum ;
   private short[] T01RR82_A681PrdAny ;
   private String[] T01RR83_A396EmprCod ;
   private String[] T01RR83_A719PrdNum ;
   private boolean[] T01RR83_n719PrdNum ;
   private String[] T01RR83_A688PrdComCod ;
   private String[] T01RR84_A396EmprCod ;
   private int[] T01RR84_A658PedCod ;
   private String[] T01RR84_A719PrdNum ;
   private boolean[] T01RR84_n719PrdNum ;
   private String[] T01RR85_A396EmprCod ;
   private int[] T01RR85_A486ForNumCol ;
   private short[] T01RR85_A309ColLin ;
   private String[] T01RR86_A396EmprCod ;
   private String[] T01RR86_A719PrdNum ;
   private boolean[] T01RR86_n719PrdNum ;
   private int[] T01RR86_A647NumCon ;
   private String[] T01RR87_A396EmprCod ;
   private String[] T01RR87_A719PrdNum ;
   private boolean[] T01RR87_n719PrdNum ;
   private String[] T01RR88_A719PrdNum ;
   private boolean[] T01RR88_n719PrdNum ;
   private String[] T01RR88_A680PrdAltNum ;
   private java.math.BigDecimal[] T01RR88_A678PrdAltFac ;
   private byte[] T01RR88_A11718PrdAltCam ;
   private String[] T01RR88_A396EmprCod ;
   private String[] T01RR88_A476FindPrdAlt ;
   private boolean[] T01RR88_n476FindPrdAlt ;
   private String[] T01RR88_A679PrdAltNom ;
   private boolean[] T01RR88_n679PrdAltNom ;
   private int[] T01RR88_A778PrvAltNum ;
   private boolean[] T01RR88_n778PrvAltNum ;
   private String[] T01RR4_A476FindPrdAlt ;
   private boolean[] T01RR4_n476FindPrdAlt ;
   private String[] T01RR4_A679PrdAltNom ;
   private boolean[] T01RR4_n679PrdAltNom ;
   private int[] T01RR4_A778PrvAltNum ;
   private boolean[] T01RR4_n778PrvAltNum ;
   private String[] T01RR89_A476FindPrdAlt ;
   private boolean[] T01RR89_n476FindPrdAlt ;
   private String[] T01RR89_A679PrdAltNom ;
   private boolean[] T01RR89_n679PrdAltNom ;
   private int[] T01RR89_A778PrvAltNum ;
   private boolean[] T01RR89_n778PrvAltNum ;
   private String[] T01RR90_A396EmprCod ;
   private String[] T01RR90_A719PrdNum ;
   private boolean[] T01RR90_n719PrdNum ;
   private String[] T01RR90_A680PrdAltNum ;
   private String[] T01RR3_A719PrdNum ;
   private boolean[] T01RR3_n719PrdNum ;
   private String[] T01RR3_A680PrdAltNum ;
   private java.math.BigDecimal[] T01RR3_A678PrdAltFac ;
   private byte[] T01RR3_A11718PrdAltCam ;
   private String[] T01RR3_A396EmprCod ;
   private String[] T01RR2_A719PrdNum ;
   private boolean[] T01RR2_n719PrdNum ;
   private String[] T01RR2_A680PrdAltNum ;
   private java.math.BigDecimal[] T01RR2_A678PrdAltFac ;
   private byte[] T01RR2_A11718PrdAltCam ;
   private String[] T01RR2_A396EmprCod ;
   private String[] T01RR94_A476FindPrdAlt ;
   private boolean[] T01RR94_n476FindPrdAlt ;
   private String[] T01RR94_A679PrdAltNom ;
   private boolean[] T01RR94_n679PrdAltNom ;
   private int[] T01RR94_A778PrvAltNum ;
   private boolean[] T01RR94_n778PrvAltNum ;
   private String[] T01RR95_A396EmprCod ;
   private String[] T01RR95_A719PrdNum ;
   private boolean[] T01RR95_n719PrdNum ;
   private String[] T01RR95_A680PrdAltNum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15PrdAltNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class productosalternativos_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class productosalternativos_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class productosalternativos_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class productosalternativos_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class productosalternativos_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RR2", "SELECT PrdNum, PrdAltNum, PrdAltFac, PrdAltCam, EmprCod FROM TXPPRDALT WHERE EmprCod = ? AND PrdNum = ? AND PrdAltNum = ?  FOR UPDATE OF PrdAltFac, PrdAltCam NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR3", "SELECT PrdNum, PrdAltNum, PrdAltFac, PrdAltCam, EmprCod FROM TXPPRDALT WHERE EmprCod = ? AND PrdNum = ? AND PrdAltNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR4", "SELECT COALESCE( PrdNum, '') AS FindPrdAlt, COALESCE( PrdNom, ' ') AS PrdAltNom, COALESCE( PrvNum, 0) AS PrvAltNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR5", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR6", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RR12", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01RR13", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01RR14", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01RR15", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR16", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR17", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR18", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR19", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR20", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR21", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR22", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR23", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR24", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR25", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR26", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR27", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR28", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR29", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR31", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR32", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR33", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR34", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR35", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR36", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR37", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR38", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR39", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR40", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR42", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR43", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR44", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR45", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR46", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR47", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR48", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR49", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR50", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR51", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR52", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR53", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR54", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR55", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR56", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR57", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR58", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR59", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR60", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR61", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR62", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR63", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR64", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR65", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR66", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR67", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR69", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR70", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR71", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR72", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR73", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR77", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR78", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR79", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR80", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR81", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR82", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR83", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR84", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR85", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR86", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RR87", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR88", "SELECT T1.PrdNum, T1.PrdAltNum, T1.PrdAltFac, T1.PrdAltCam, T1.EmprCod, COALESCE( T2.PrdNum, '') AS FindPrdAlt, COALESCE( T2.PrdNom, ' ') AS PrdAltNom, COALESCE( T2.PrvNum, 0) AS PrvAltNum FROM (TXPPRDALT T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.PrdAltNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAltNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR89", "SELECT COALESCE( PrdNum, '') AS FindPrdAlt, COALESCE( PrdNom, ' ') AS PrdAltNom, COALESCE( PrvNum, 0) AS PrvAltNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR90", "SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdNum = ? AND PrdAltNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RR91", "INSERT INTO TXPPRDALT(PrdNum, PrdAltNum, PrdAltFac, PrdAltCam, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPRDALT")
         ,new UpdateCursor("T01RR92", "UPDATE TXPPRDALT SET PrdAltFac=?, PrdAltCam=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAltNum = ?", GX_NOMASK, "TXPPRDALT")
         ,new UpdateCursor("T01RR93", "DELETE FROM TXPPRDALT  WHERE EmprCod = ? AND PrdNum = ? AND PrdAltNum = ?", GX_NOMASK, "TXPPRDALT")
         ,new ForEachCursor("T01RR94", "SELECT COALESCE( PrdNum, '') AS FindPrdAlt, COALESCE( PrdNom, ' ') AS PrdAltNom, COALESCE( PrvNum, 0) AS PrvAltNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RR95", "SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, PrdAltNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 89 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 3);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

