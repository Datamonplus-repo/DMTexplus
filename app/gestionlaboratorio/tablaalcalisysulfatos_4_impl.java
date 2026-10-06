package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tablaalcalisysulfatos_4_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A6310Lb_TaAuxC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A490ForPrdUMe) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_producto") == 0 )
      {
         gxnrgridlevel_producto_newrow_invoke( ) ;
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
            AV23EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
            AV24Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Lb_TaAuxC", AV24Lb_TaAuxC);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Lb_TaAuxC, ""))));
            AV25lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25lb_TaAuxL), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25lb_TaAuxL), "ZZZ9")));
            AV22Lb_TaAuxD = httpContext.GetPar( "Lb_TaAuxD") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Lb_TaAuxD", AV22Lb_TaAuxD);
            AV17Lb_TaAuxCi = CommonUtil.decimalVal( httpContext.GetPar( "Lb_TaAuxCi"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Lb_TaAuxCi", GXutil.ltrimstr( AV17Lb_TaAuxCi, 11, 5));
            AV18Lb_TaAuxCf = CommonUtil.decimalVal( httpContext.GetPar( "Lb_TaAuxCf"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Lb_TaAuxCf", GXutil.ltrimstr( AV18Lb_TaAuxCf, 11, 5));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Alcalisy Sulfatos (productos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_producto_newrow_invoke( )
   {
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
      edtForPrdUMe_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_51_Refreshing);
      A6377Lb_TaAuxUP = (short)(GXutil.lval( httpContext.GetPar( "Lb_TaAuxUP"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_producto_newrow( ) ;
      /* End function gxnrGridlevel_producto_newrow_invoke */
   }

   public tablaalcalisysulfatos_4_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tablaalcalisysulfatos_4_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tablaalcalisysulfatos_4_impl.class ));
   }

   public tablaalcalisysulfatos_4_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxC_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxC_Internalname, GXutil.rtrim( A6310Lb_TaAuxC), GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxC_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxD_Internalname, GXutil.rtrim( A6311Lb_TaAuxD), GXutil.rtrim( localUtil.format( A6311Lb_TaAuxD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxD_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlb_TaAuxL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtlb_TaAuxL_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtlb_TaAuxL_Internalname, GXutil.ltrim( localUtil.ntoc( A6313lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6313lb_TaAuxL), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlb_TaAuxL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtlb_TaAuxL_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxCi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxCi_Internalname, httpContext.getMessage( "Valor Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxCi_Internalname, GXutil.ltrim( localUtil.ntoc( A6314Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxCi_Enabled!=0) ? localUtil.format( A6314Lb_TaAuxCi, "ZZZZ9.99999") : localUtil.format( A6314Lb_TaAuxCi, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxCi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxCi_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxCf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxCf_Internalname, httpContext.getMessage( "Valor Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxCf_Internalname, GXutil.ltrim( localUtil.ntoc( A6315Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxCf_Enabled!=0) ? localUtil.format( A6315Lb_TaAuxCf, "ZZZZ9.99999") : localUtil.format( A6315Lb_TaAuxCf, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxCf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxCf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_producto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_producto( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_4.htm");
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
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV19PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* User Defined Control */
      ucCombo_forprdume.setProperty("Caption", Combo_forprdume_Caption);
      ucCombo_forprdume.setProperty("Cls", Combo_forprdume_Cls);
      ucCombo_forprdume.setProperty("IsGridItem", Combo_forprdume_Isgriditem);
      ucCombo_forprdume.setProperty("EmptyItem", Combo_forprdume_Emptyitem);
      ucCombo_forprdume.setProperty("DropDownOptionsData", AV21ForPrdUMe_Data);
      ucCombo_forprdume.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_forprdume_Internalname, "COMBO_FORPRDUMEContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_producto( )
   {
      /*  Grid Control  */
      startgridcontrol51( ) ;
      nGXsfl_51_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount925 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_925 = (short)(1) ;
            scanStart1SQ925( ) ;
            while ( RcdFound925 != 0 )
            {
               init_level_properties925( ) ;
               getByPrimaryKey1SQ925( ) ;
               addRow1SQ925( ) ;
               scanNext1SQ925( ) ;
            }
            scanEnd1SQ925( ) ;
            nBlankRcdCount925 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         standaloneNotModal1SQ925( ) ;
         standaloneModal1SQ925( ) ;
         sMode925 = Gx_mode ;
         while ( nGXsfl_51_idx < nRC_GXsfl_51 )
         {
            bGXsfl_51_Refreshing = true ;
            readRow1SQ925( ) ;
            edtLb_TauxLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAUXLP_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxLP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtLb_TaAuxCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXCT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_51_Refreshing);
            edtLb_TauxOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAUXORD_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxOrd_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            imgprompt_6317_Link = httpContext.cgiGet( "PROMPT_6317_"+sGXsfl_51_idx+"Link") ;
            if ( ( nRcdExists_925 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SQ925( ) ;
            }
            sendRow1SQ925( ) ;
            bGXsfl_51_Refreshing = false ;
         }
         Gx_mode = sMode925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6377Lb_TaAuxUP = B6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount925 = (short)(5) ;
         nRcdExists_925 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SQ925( ) ;
            while ( RcdFound925 != 0 )
            {
               sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_51925( ) ;
               init_level_properties925( ) ;
               standaloneNotModal1SQ925( ) ;
               getByPrimaryKey1SQ925( ) ;
               standaloneModal1SQ925( ) ;
               addRow1SQ925( ) ;
               scanNext1SQ925( ) ;
            }
            scanEnd1SQ925( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode925 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_51925( ) ;
         initAll1SQ925( ) ;
         init_level_properties925( ) ;
         B6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         nRcdExists_925 = (short)(0) ;
         nIsMod_925 = (short)(0) ;
         nRcdDeleted_925 = (short)(0) ;
         nBlankRcdCount925 = (short)(nBlankRcdUsr925+nBlankRcdCount925) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount925 > 0 )
         {
            standaloneNotModal1SQ925( ) ;
            standaloneModal1SQ925( ) ;
            addRow1SQ925( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLb_TauxLP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount925 = (short)(nBlankRcdCount925-1) ;
         }
         Gx_mode = sMode925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6377Lb_TaAuxUP = B6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_productoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_producto", Gridlevel_productoContainer, subGridlevel_producto_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData", Gridlevel_productoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData"+"V", Gridlevel_productoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_productoContainerData"+"V"+"\" value='"+Gridlevel_productoContainer.GridValuesHidden()+"'/>") ;
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
      e111SQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV19PrdNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFORPRDUME_DATA"), AV21ForPrdUMe_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
            Z6313lb_TaAuxL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6313lb_TaAuxL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6314Lb_TaAuxCi = localUtil.ctond( httpContext.cgiGet( "Z6314Lb_TaAuxCi")) ;
            Z6315Lb_TaAuxCf = localUtil.ctond( httpContext.cgiGet( "Z6315Lb_TaAuxCf")) ;
            Z6377Lb_TaAuxUP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6377Lb_TaAuxUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6377Lb_TaAuxUP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6377Lb_TaAuxUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6377Lb_TaAuxUP = (short)(localUtil.ctol( httpContext.cgiGet( "O6377Lb_TaAuxUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV24Lb_TaAuxC = httpContext.cgiGet( "vLB_TAAUXC") ;
            AV25lb_TaAuxL = (short)(localUtil.ctol( httpContext.cgiGet( "vLB_TAAUXL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6377Lb_TaAuxUP = (short)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7Modif = httpContext.cgiGet( "vMODIF") ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
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
            Combo_forprdume_Objectcall = httpContext.cgiGet( "COMBO_FORPRDUME_Objectcall") ;
            Combo_forprdume_Class = httpContext.cgiGet( "COMBO_FORPRDUME_Class") ;
            Combo_forprdume_Icontype = httpContext.cgiGet( "COMBO_FORPRDUME_Icontype") ;
            Combo_forprdume_Icon = httpContext.cgiGet( "COMBO_FORPRDUME_Icon") ;
            Combo_forprdume_Caption = httpContext.cgiGet( "COMBO_FORPRDUME_Caption") ;
            Combo_forprdume_Tooltip = httpContext.cgiGet( "COMBO_FORPRDUME_Tooltip") ;
            Combo_forprdume_Cls = httpContext.cgiGet( "COMBO_FORPRDUME_Cls") ;
            Combo_forprdume_Selectedvalue_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_set") ;
            Combo_forprdume_Selectedvalue_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_get") ;
            Combo_forprdume_Selectedtext_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_set") ;
            Combo_forprdume_Selectedtext_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_get") ;
            Combo_forprdume_Gamoauthtoken = httpContext.cgiGet( "COMBO_FORPRDUME_Gamoauthtoken") ;
            Combo_forprdume_Ddointernalname = httpContext.cgiGet( "COMBO_FORPRDUME_Ddointernalname") ;
            Combo_forprdume_Titlecontrolalign = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolalign") ;
            Combo_forprdume_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FORPRDUME_Dropdownoptionstype") ;
            Combo_forprdume_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Enabled")) ;
            Combo_forprdume_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Visible")) ;
            Combo_forprdume_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolidtoreplace") ;
            Combo_forprdume_Datalisttype = httpContext.cgiGet( "COMBO_FORPRDUME_Datalisttype") ;
            Combo_forprdume_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Allowmultipleselection")) ;
            Combo_forprdume_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistfixedvalues") ;
            Combo_forprdume_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Isgriditem")) ;
            Combo_forprdume_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Hasdescription")) ;
            Combo_forprdume_Datalistproc = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistproc") ;
            Combo_forprdume_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistprocparametersprefix") ;
            Combo_forprdume_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FORPRDUME_Remoteservicesparameters") ;
            Combo_forprdume_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FORPRDUME_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_forprdume_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeonlyselectedoption")) ;
            Combo_forprdume_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeselectalloption")) ;
            Combo_forprdume_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitem")) ;
            Combo_forprdume_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeaddnewoption")) ;
            Combo_forprdume_Htmltemplate = httpContext.cgiGet( "COMBO_FORPRDUME_Htmltemplate") ;
            Combo_forprdume_Multiplevaluestype = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluestype") ;
            Combo_forprdume_Loadingdata = httpContext.cgiGet( "COMBO_FORPRDUME_Loadingdata") ;
            Combo_forprdume_Noresultsfound = httpContext.cgiGet( "COMBO_FORPRDUME_Noresultsfound") ;
            Combo_forprdume_Emptyitemtext = httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitemtext") ;
            Combo_forprdume_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Onlyselectedvalues") ;
            Combo_forprdume_Selectalltext = httpContext.cgiGet( "COMBO_FORPRDUME_Selectalltext") ;
            Combo_forprdume_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluesseparator") ;
            Combo_forprdume_Addnewoptiontext = httpContext.cgiGet( "COMBO_FORPRDUME_Addnewoptiontext") ;
            /* Read variables values. */
            A6310Lb_TaAuxC = httpContext.cgiGet( edtLb_TaAuxC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            A6311Lb_TaAuxD = httpContext.cgiGet( edtLb_TaAuxD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtlb_TaAuxL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtlb_TaAuxL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtlb_TaAuxL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6313lb_TaAuxL = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            }
            else
            {
               A6313lb_TaAuxL = (short)(localUtil.ctol( httpContext.cgiGet( edtlb_TaAuxL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXCI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxCi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
            }
            else
            {
               A6314Lb_TaAuxCi = localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCi_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCf_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_TAAUXCF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxCf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
            }
            else
            {
               A6315Lb_TaAuxCf = localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCf_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
            }
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_4");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) || ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\tablaalcalisysulfatos_4:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
               A6313lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
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
                  sMode919 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode919 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound919 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SQ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_TAAUXC");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_TaAuxC_Internalname ;
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
                        e111SQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SQ2 ();
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
         e121SQ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SQ919( ) ;
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
         disableAttributes1SQ919( ) ;
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

   public void confirm_1SQ0( )
   {
      beforeValidate1SQ919( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SQ919( ) ;
         }
         else
         {
            checkExtendedTable1SQ919( ) ;
            closeExtendedTableCursors1SQ919( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode919 = Gx_mode ;
         confirm_1SQ925( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode919 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1SQ925( )
   {
      s6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      sV7Modif = OV7Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1SQ925( ) ;
         if ( ( nRcdExists_925 != 0 ) || ( nIsMod_925 != 0 ) )
         {
            getKey1SQ925( ) ;
            if ( ( nRcdExists_925 == 0 ) && ( nRcdDeleted_925 == 0 ) )
            {
               if ( RcdFound925 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SQ925( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SQ925( ) ;
                     closeExtendedTableCursors1SQ925( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
                     OV7Modif = AV7Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
                  }
               }
               else
               {
                  GXCCtl = "LB_TAUXLP_" + sGXsfl_51_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_TauxLP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound925 != 0 )
               {
                  if ( nRcdDeleted_925 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SQ925( ) ;
                     load1SQ925( ) ;
                     beforeValidate1SQ925( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SQ925( ) ;
                        O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
                        OV7Modif = AV7Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_925 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SQ925( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SQ925( ) ;
                           closeExtendedTableCursors1SQ925( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
                           OV7Modif = AV7Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_925 == 0 )
                  {
                     GXCCtl = "LB_TAUXLP_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_TauxLP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_TauxLP_Internalname, GXutil.ltrim( localUtil.ntoc( A6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLb_TaAuxCt_Internalname, GXutil.ltrim( localUtil.ntoc( A6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_TauxOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6378Lb_TauxLP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6316Lb_TaAuxCt_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6317Lb_TauxOrd_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6316Lb_TaAuxCt_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_925 != 0 )
         {
            httpContext.changePostValue( "LB_TAUXLP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_TAAUXCT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TaAuxCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "LB_TAUXORD_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6377Lb_TaAuxUP = s6377Lb_TaAuxUP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      OV7Modif = sV7Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SQ0( )
   {
   }

   public void e111SQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tablaalcalisysulfatos_4_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      tablaalcalisysulfatos_4_impl.this.A396EmprCod = GXv_char2[0] ;
      tablaalcalisysulfatos_4_impl.this.AV9EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_4_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      AV7Modif = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      GXt_char1 = AV8Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tablaalcalisysulfatos_4_impl.this.GXt_char1 = GXv_char4[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char4[0] = AV23EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char4, GXv_char3, GXv_char2) ;
      tablaalcalisysulfatos_4_impl.this.AV23EmprCod = GXv_char4[0] ;
      tablaalcalisysulfatos_4_impl.this.AV9EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_4_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext5[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV14WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_forprdume_Titlecontrolidtoreplace = edtForPrdUMe_Internalname ;
      ucCombo_forprdume.sendProperty(context, "", false, Combo_forprdume_Internalname, "TitleControlIdToReplace", Combo_forprdume_Titlecontrolidtoreplace);
      edtForPrdUMe_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_51_Refreshing);
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOFORPRDUME' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV15TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
   }

   public void e121SQ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV22Lb_TaAuxD,AV17Lb_TaAuxCi,AV18Lb_TaAuxCf});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV22Lb_TaAuxD","AV17Lb_TaAuxCi","AV18Lb_TaAuxCf"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADCOMBOFORPRDUME' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV21ForPrdUMe_Data ;
      GXv_char4[0] = AV20ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tablaalcalisysulfatos_4loaddvcombo(remoteHandle, context).execute( "ForPrdUMe", Gx_mode, AV23EmprCod, AV24Lb_TaAuxC, AV25lb_TaAuxL, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tablaalcalisysulfatos_4_impl.this.AV20ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV21ForPrdUMe_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV19PrdNum_Data ;
      GXv_char4[0] = AV20ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tablaalcalisysulfatos_4loaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV23EmprCod, AV24Lb_TaAuxC, AV25lb_TaAuxL, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tablaalcalisysulfatos_4_impl.this.AV20ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV19PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1SQ919( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6314Lb_TaAuxCi = T01SQ7_A6314Lb_TaAuxCi[0] ;
            Z6315Lb_TaAuxCf = T01SQ7_A6315Lb_TaAuxCf[0] ;
            Z6377Lb_TaAuxUP = T01SQ7_A6377Lb_TaAuxUP[0] ;
         }
         else
         {
            Z6314Lb_TaAuxCi = A6314Lb_TaAuxCi ;
            Z6315Lb_TaAuxCf = A6315Lb_TaAuxCf ;
            Z6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         Z6314Lb_TaAuxCi = A6314Lb_TaAuxCi ;
         Z6315Lb_TaAuxCf = A6315Lb_TaAuxCf ;
         Z6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z407EmprNom = A407EmprNom ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
      }
   }

   public void standaloneNotModal( )
   {
      AV27Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_4" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV23EmprCod)==0) )
      {
         A396EmprCod = AV23EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SQ8_A407EmprNom[0] ;
      n407EmprNom = T01SQ8_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (GXutil.strcmp("", AV24Lb_TaAuxC)==0) )
      {
         A6310Lb_TaAuxC = AV24Lb_TaAuxC ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      if ( ! (GXutil.strcmp("", AV24Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_TaAuxC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV24Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      if ( ! (0==AV25lb_TaAuxL) )
      {
         A6313lb_TaAuxL = AV25lb_TaAuxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
      if ( ! (0==AV25lb_TaAuxL) )
      {
         edtlb_TaAuxL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
      else
      {
         edtlb_TaAuxL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
      if ( ! (0==AV25lb_TaAuxL) )
      {
         edtlb_TaAuxL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
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
         /* Using cursor T01SQ9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T01SQ9_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         pr_default.close(7);
      }
   }

   public void load1SQ919( )
   {
      /* Using cursor T01SQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A407EmprNom = T01SQ10_A407EmprNom[0] ;
         n407EmprNom = T01SQ10_n407EmprNom[0] ;
         A6311Lb_TaAuxD = T01SQ10_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         A6314Lb_TaAuxCi = T01SQ10_A6314Lb_TaAuxCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
         A6315Lb_TaAuxCf = T01SQ10_A6315Lb_TaAuxCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
         A6377Lb_TaAuxUP = T01SQ10_A6377Lb_TaAuxUP[0] ;
         zm1SQ919( -14) ;
      }
      pr_default.close(8);
      onLoadActions1SQ919( ) ;
   }

   public void onLoadActions1SQ919( )
   {
   }

   public void checkExtendedTable1SQ919( )
   {
      nIsDirty_919 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01SQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6311Lb_TaAuxD = T01SQ9_A6311Lb_TaAuxD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1SQ919( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          String A6310Lb_TaAuxC )
   {
      /* Using cursor T01SQ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6311Lb_TaAuxD = T01SQ11_A6311Lb_TaAuxD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6311Lb_TaAuxD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1SQ919( )
   {
      /* Using cursor T01SQ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound919 = (short)(1) ;
      }
      else
      {
         RcdFound919 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01SQ7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SQ919( 14) ;
         RcdFound919 = (short)(1) ;
         A6313lb_TaAuxL = T01SQ7_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
         A6314Lb_TaAuxCi = T01SQ7_A6314Lb_TaAuxCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
         A6315Lb_TaAuxCf = T01SQ7_A6315Lb_TaAuxCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
         A6377Lb_TaAuxUP = T01SQ7_A6377Lb_TaAuxUP[0] ;
         A6310Lb_TaAuxC = T01SQ7_A6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         sMode919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SQ919( ) ;
         if ( AnyError == 1 )
         {
            RcdFound919 = (short)(0) ;
            initializeNonKey1SQ919( ) ;
         }
         Gx_mode = sMode919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound919 = (short)(0) ;
         initializeNonKey1SQ919( ) ;
         sMode919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1SQ919( ) ;
      if ( RcdFound919 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound919 = (short)(0) ;
      /* Using cursor T01SQ13 */
      pr_default.execute(11, new Object[] {A6310Lb_TaAuxC, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01SQ13_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) || ( GXutil.strcmp(T01SQ13_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SQ13_A6313lb_TaAuxL[0] < A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SQ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01SQ13_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) || ( GXutil.strcmp(T01SQ13_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SQ13_A6313lb_TaAuxL[0] > A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SQ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SQ13_A6310Lb_TaAuxC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            A6313lb_TaAuxL = T01SQ13_A6313lb_TaAuxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            RcdFound919 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound919 = (short)(0) ;
      /* Using cursor T01SQ14 */
      pr_default.execute(12, new Object[] {A6310Lb_TaAuxC, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SQ14_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) || ( GXutil.strcmp(T01SQ14_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SQ14_A6313lb_TaAuxL[0] > A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SQ14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SQ14_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) || ( GXutil.strcmp(T01SQ14_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SQ14_A6313lb_TaAuxL[0] < A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SQ14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SQ14_A6310Lb_TaAuxC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            A6313lb_TaAuxL = T01SQ14_A6313lb_TaAuxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            RcdFound919 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SQ919( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         AV7Modif = OV7Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SQ919( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound919 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) || ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) )
            {
               A6310Lb_TaAuxC = Z6310Lb_TaAuxC ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
               A6313lb_TaAuxL = Z6313lb_TaAuxL ;
               httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_TAAUXC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
               AV7Modif = OV7Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
               AV7Modif = OV7Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
               update1SQ919( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) || ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) )
            {
               /* Insert record */
               A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
               AV7Modif = OV7Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SQ919( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_TAAUXC");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_TaAuxC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
                  AV7Modif = OV7Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
                  GX_FocusControl = edtLb_TaAuxC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SQ919( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) || ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) )
      {
         A6310Lb_TaAuxC = Z6310Lb_TaAuxC ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6313lb_TaAuxL = Z6313lb_TaAuxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         AV7Modif = OV7Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SQ919( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SQ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS008"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z6314Lb_TaAuxCi, T01SQ6_A6314Lb_TaAuxCi[0]) != 0 ) || ( DecimalUtil.compareTo(Z6315Lb_TaAuxCf, T01SQ6_A6315Lb_TaAuxCf[0]) != 0 ) || ( Z6377Lb_TaAuxUP != T01SQ6_A6377Lb_TaAuxUP[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6314Lb_TaAuxCi, T01SQ6_A6314Lb_TaAuxCi[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"Lb_TaAuxCi");
               GXutil.writeLogRaw("Old: ",Z6314Lb_TaAuxCi);
               GXutil.writeLogRaw("Current: ",T01SQ6_A6314Lb_TaAuxCi[0]);
            }
            if ( DecimalUtil.compareTo(Z6315Lb_TaAuxCf, T01SQ6_A6315Lb_TaAuxCf[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"Lb_TaAuxCf");
               GXutil.writeLogRaw("Old: ",Z6315Lb_TaAuxCf);
               GXutil.writeLogRaw("Current: ",T01SQ6_A6315Lb_TaAuxCf[0]);
            }
            if ( Z6377Lb_TaAuxUP != T01SQ6_A6377Lb_TaAuxUP[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"Lb_TaAuxUP");
               GXutil.writeLogRaw("Old: ",Z6377Lb_TaAuxUP);
               GXutil.writeLogRaw("Current: ",T01SQ6_A6377Lb_TaAuxUP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS008"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SQ919( )
   {
      beforeValidate1SQ919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SQ919( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SQ919( 0) ;
         checkOptimisticConcurrency1SQ919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SQ919( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SQ919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SQ15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A6313lb_TaAuxL), A6314Lb_TaAuxCi, A6315Lb_TaAuxCf, Short.valueOf(A6377Lb_TaAuxUP), A396EmprCod, A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1SQ919( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SQ0( ) ;
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
            load1SQ919( ) ;
         }
         endLevel1SQ919( ) ;
      }
      closeExtendedTableCursors1SQ919( ) ;
   }

   public void update1SQ919( )
   {
      beforeValidate1SQ919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SQ919( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SQ919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SQ919( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SQ919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SQ16 */
                  pr_default.execute(14, new Object[] {A6314Lb_TaAuxCi, A6315Lb_TaAuxCf, Short.valueOf(A6377Lb_TaAuxUP), A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS008"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SQ919( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SQ919( ) ;
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
         endLevel1SQ919( ) ;
      }
      closeExtendedTableCursors1SQ919( ) ;
   }

   public void deferredUpdate1SQ919( )
   {
   }

   public void delete( )
   {
      beforeValidate1SQ919( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SQ919( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SQ919( ) ;
         afterConfirm1SQ919( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SQ919( ) ;
            if ( AnyError == 0 )
            {
               A6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
               AV7Modif = OV7Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
               scanStart1SQ925( ) ;
               while ( RcdFound925 != 0 )
               {
                  getByPrimaryKey1SQ925( ) ;
                  delete1SQ925( ) ;
                  scanNext1SQ925( ) ;
                  O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
                  OV7Modif = AV7Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
               }
               scanEnd1SQ925( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SQ17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
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
      sMode919 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SQ919( ) ;
      Gx_mode = sMode919 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SQ919( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SQ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T01SQ18_A6311Lb_TaAuxD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
         pr_default.close(16);
      }
   }

   public void processNestedLevel1SQ925( )
   {
      s6377Lb_TaAuxUP = O6377Lb_TaAuxUP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      sV7Modif = OV7Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1SQ925( ) ;
         if ( ( nRcdExists_925 != 0 ) || ( nIsMod_925 != 0 ) )
         {
            standaloneNotModal1SQ925( ) ;
            getKey1SQ925( ) ;
            if ( ( nRcdExists_925 == 0 ) && ( nRcdDeleted_925 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SQ925( ) ;
            }
            else
            {
               if ( RcdFound925 != 0 )
               {
                  if ( ( nRcdDeleted_925 != 0 ) && ( nRcdExists_925 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SQ925( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_925 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SQ925( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_925 == 0 )
                  {
                     GXCCtl = "LB_TAUXLP_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_TauxLP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
            httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
            OV7Modif = AV7Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
         }
         httpContext.changePostValue( edtLb_TauxLP_Internalname, GXutil.ltrim( localUtil.ntoc( A6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLb_TaAuxCt_Internalname, GXutil.ltrim( localUtil.ntoc( A6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_TauxOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6378Lb_TauxLP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6316Lb_TaAuxCt_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6317Lb_TauxOrd_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6316Lb_TaAuxCt_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_925_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_925 != 0 )
         {
            httpContext.changePostValue( "LB_TAUXLP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_TAAUXCT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TaAuxCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "LB_TAUXORD_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SQ925( ) ;
      if ( AnyError != 0 )
      {
         O6377Lb_TaAuxUP = s6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         OV7Modif = sV7Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      }
      nRcdExists_925 = (short)(0) ;
      nIsMod_925 = (short)(0) ;
      nRcdDeleted_925 = (short)(0) ;
   }

   public void processLevel1SQ919( )
   {
      /* Save parent mode. */
      sMode919 = Gx_mode ;
      processNestedLevel1SQ925( ) ;
      if ( AnyError != 0 )
      {
         O6377Lb_TaAuxUP = s6377Lb_TaAuxUP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
         OV7Modif = sV7Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode919 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01SQ19 */
      pr_default.execute(17, new Object[] {Short.valueOf(A6377Lb_TaAuxUP), A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
   }

   public void endLevel1SQ919( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1SQ919( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_4");
         if ( AnyError == 0 )
         {
            confirmValues1SQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_4");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SQ919( )
   {
      /* Scan By routine */
      /* Using cursor T01SQ20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound919 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A6310Lb_TaAuxC = T01SQ20_A6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6313lb_TaAuxL = T01SQ20_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SQ919( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound919 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A6310Lb_TaAuxC = T01SQ20_A6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6313lb_TaAuxL = T01SQ20_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
   }

   public void scanEnd1SQ919( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1SQ919( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SQ919( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SQ919( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SQ919( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SQ919( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SQ919( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SQ919( )
   {
      edtLb_TaAuxC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      edtLb_TaAuxD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxD_Enabled), 5, 0), true);
      edtlb_TaAuxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      edtLb_TaAuxCi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCi_Enabled), 5, 0), true);
      edtLb_TaAuxCf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1SQ925( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6316Lb_TaAuxCt = T01SQ3_A6316Lb_TaAuxCt[0] ;
            Z6317Lb_TauxOrd = T01SQ3_A6317Lb_TauxOrd[0] ;
            Z719PrdNum = T01SQ3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01SQ3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z6316Lb_TaAuxCt = A6316Lb_TaAuxCt ;
            Z6317Lb_TauxOrd = A6317Lb_TauxOrd ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         Z6378Lb_TauxLP = A6378Lb_TauxLP ;
         Z6316Lb_TaAuxCt = A6316Lb_TaAuxCt ;
         Z6317Lb_TauxOrd = A6317Lb_TauxOrd ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1SQ925( )
   {
   }

   public void standaloneModal1SQ925( )
   {
      if ( isIns( )  )
      {
         A6377Lb_TaAuxUP = (short)(O6377Lb_TaAuxUP+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6378Lb_TauxLP = A6377Lb_TaAuxUP ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_TauxLP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxLP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         edtLb_TauxLP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxLP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
   }

   public void load1SQ925( )
   {
      /* Using cursor T01SQ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound925 = (short)(1) ;
         A718PrdNom = T01SQ21_A718PrdNom[0] ;
         A6316Lb_TaAuxCt = T01SQ21_A6316Lb_TaAuxCt[0] ;
         A488ForPrdDsc = T01SQ21_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SQ21_n488ForPrdDsc[0] ;
         A6317Lb_TauxOrd = T01SQ21_A6317Lb_TauxOrd[0] ;
         A719PrdNum = T01SQ21_A719PrdNum[0] ;
         A490ForPrdUMe = T01SQ21_A490ForPrdUMe[0] ;
         zm1SQ925( -17) ;
      }
      pr_default.close(19);
      onLoadActions1SQ925( ) ;
   }

   public void onLoadActions1SQ925( )
   {
   }

   public void checkExtendedTable1SQ925( )
   {
      nIsDirty_925 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1SQ925( ) ;
      /* Using cursor T01SQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SQ4_A718PrdNom[0] ;
      pr_default.close(2);
      /* Using cursor T01SQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SQ5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SQ5_n488ForPrdDsc[0] ;
      pr_default.close(3);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SQ925( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1SQ925( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SQ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SQ22_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_19( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01SQ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SQ23_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SQ23_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1SQ925( )
   {
      /* Using cursor T01SQ24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound925 = (short)(1) ;
      }
      else
      {
         RcdFound925 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1SQ925( )
   {
      /* Using cursor T01SQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01SQ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SQ925( 17) ;
         RcdFound925 = (short)(1) ;
         initializeNonKey1SQ925( ) ;
         A6378Lb_TauxLP = T01SQ3_A6378Lb_TauxLP[0] ;
         A6316Lb_TaAuxCt = T01SQ3_A6316Lb_TaAuxCt[0] ;
         A6317Lb_TauxOrd = T01SQ3_A6317Lb_TauxOrd[0] ;
         A719PrdNum = T01SQ3_A719PrdNum[0] ;
         A490ForPrdUMe = T01SQ3_A490ForPrdUMe[0] ;
         O6316Lb_TaAuxCt = A6316Lb_TaAuxCt ;
         O719PrdNum = A719PrdNum ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         Z6378Lb_TauxLP = A6378Lb_TauxLP ;
         sMode925 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SQ925( ) ;
         Gx_mode = sMode925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound925 = (short)(0) ;
         initializeNonKey1SQ925( ) ;
         sMode925 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SQ925( ) ;
         Gx_mode = sMode925 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SQ925( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SQ925( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS007"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6316Lb_TaAuxCt, T01SQ2_A6316Lb_TaAuxCt[0]) != 0 ) || ( Z6317Lb_TauxOrd != T01SQ2_A6317Lb_TauxOrd[0] ) || ( GXutil.strcmp(Z719PrdNum, T01SQ2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01SQ2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6316Lb_TaAuxCt, T01SQ2_A6316Lb_TaAuxCt[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"Lb_TaAuxCt");
               GXutil.writeLogRaw("Old: ",Z6316Lb_TaAuxCt);
               GXutil.writeLogRaw("Current: ",T01SQ2_A6316Lb_TaAuxCt[0]);
            }
            if ( Z6317Lb_TauxOrd != T01SQ2_A6317Lb_TauxOrd[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"Lb_TauxOrd");
               GXutil.writeLogRaw("Old: ",Z6317Lb_TauxOrd);
               GXutil.writeLogRaw("Current: ",T01SQ2_A6317Lb_TauxOrd[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01SQ2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01SQ2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01SQ2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_4:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01SQ2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS007"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SQ925( )
   {
      beforeValidate1SQ925( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SQ925( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SQ925( 0) ;
         checkOptimisticConcurrency1SQ925( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SQ925( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SQ925( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SQ25 */
                  pr_default.execute(23, new Object[] {A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP), A6316Lb_TaAuxCt, Short.valueOf(A6317Lb_TauxOrd), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS007");
                  if ( (pr_default.getStatus(23) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( GXutil.strcmp(A719PrdNum, O719PrdNum) != 0 ) ) || ( ( DecimalUtil.compareTo(A6316Lb_TaAuxCt, O6316Lb_TaAuxCt) != 0 ) ) && true /* After */ || true /* After */ || isDlt( )  )
                     {
                        AV7Modif = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
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
            load1SQ925( ) ;
         }
         endLevel1SQ925( ) ;
      }
      closeExtendedTableCursors1SQ925( ) ;
   }

   public void update1SQ925( )
   {
      beforeValidate1SQ925( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SQ925( ) ;
      }
      if ( ( nIsMod_925 != 0 ) || ( nIsDirty_925 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SQ925( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SQ925( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SQ925( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SQ26 */
                     pr_default.execute(24, new Object[] {A6316Lb_TaAuxCt, Short.valueOf(A6317Lb_TauxOrd), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS007");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS007"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SQ925( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( GXutil.strcmp(A719PrdNum, O719PrdNum) != 0 ) ) || ( ( DecimalUtil.compareTo(A6316Lb_TaAuxCt, O6316Lb_TaAuxCt) != 0 ) ) && true /* After */ || true /* After */ || isDlt( )  )
                        {
                           AV7Modif = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV7Modif", AV7Modif);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1SQ925( ) ;
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
            endLevel1SQ925( ) ;
         }
      }
      closeExtendedTableCursors1SQ925( ) ;
   }

   public void deferredUpdate1SQ925( )
   {
   }

   public void delete1SQ925( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SQ925( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SQ925( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SQ925( ) ;
         afterConfirm1SQ925( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SQ925( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SQ27 */
               pr_default.execute(25, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS007");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
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
      sMode925 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SQ925( ) ;
      Gx_mode = sMode925 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SQ925( )
   {
      standaloneModal1SQ925( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SQ28 */
         pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SQ28_A718PrdNom[0] ;
         pr_default.close(26);
         /* Using cursor T01SQ29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01SQ29_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SQ29_n488ForPrdDsc[0] ;
         pr_default.close(27);
      }
   }

   public void endLevel1SQ925( )
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

   public void scanStart1SQ925( )
   {
      /* Scan By routine */
      /* Using cursor T01SQ30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      RcdFound925 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound925 = (short)(1) ;
         A6378Lb_TauxLP = T01SQ30_A6378Lb_TauxLP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SQ925( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound925 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound925 = (short)(1) ;
         A6378Lb_TauxLP = T01SQ30_A6378Lb_TauxLP[0] ;
      }
   }

   public void scanEnd1SQ925( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1SQ925( )
   {
      /* After Confirm Rules */
      if ( ( A6317Lb_TauxOrd == 0 ) && true /* After */ )
      {
         GXCCtl = "LB_TAUXORD_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta El orden¡", ""), 0, GXCCtl);
      }
   }

   public void beforeInsert1SQ925( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SQ925( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SQ925( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SQ925( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SQ925( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SQ925( )
   {
      edtLb_TauxLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxLP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtLb_TaAuxCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtLb_TauxOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxOrd_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void send_integrity_lvl_hashes1SQ925( )
   {
   }

   public void send_integrity_lvl_hashes1SQ919( )
   {
   }

   public void subsflControlProps_51925( )
   {
      edtLb_TauxLP_Internalname = "LB_TAUXLP_"+sGXsfl_51_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_51_idx ;
      edtLb_TaAuxCt_Internalname = "LB_TAAUXCT_"+sGXsfl_51_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_idx ;
      edtLb_TauxOrd_Internalname = "LB_TAUXORD_"+sGXsfl_51_idx ;
      imgprompt_6317_Internalname = "PROMPT_6317_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_51925( )
   {
      edtLb_TauxLP_Internalname = "LB_TAUXLP_"+sGXsfl_51_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_51_fel_idx ;
      edtLb_TaAuxCt_Internalname = "LB_TAAUXCT_"+sGXsfl_51_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_fel_idx ;
      edtLb_TauxOrd_Internalname = "LB_TAUXORD_"+sGXsfl_51_fel_idx ;
      imgprompt_6317_Internalname = "PROMPT_6317_"+sGXsfl_51_fel_idx ;
   }

   public void addRow1SQ925( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51925( ) ;
      sendRow1SQ925( ) ;
   }

   public void sendRow1SQ925( )
   {
      Gridlevel_productoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_producto_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         subGridlevel_producto_Backcolor = subGridlevel_producto_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
         subGridlevel_producto_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_producto_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
            }
         }
      }
      imgprompt_6317_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"LB_TAUXORD_"+sGXsfl_51_idx+"'), id:'"+"LB_TAUXORD_"+sGXsfl_51_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_925_"+sGXsfl_51_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_925_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TauxLP_Internalname,GXutil.ltrim( localUtil.ntoc( A6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6378Lb_TauxLP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_TauxLP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_TauxLP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_925_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_925_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TaAuxCt_Internalname,GXutil.ltrim( localUtil.ntoc( A6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_TaAuxCt_Enabled!=0) ? localUtil.format( A6316Lb_TaAuxCt, "ZZZZ9.99999") : localUtil.format( A6316Lb_TaAuxCt, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_TaAuxCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_TaAuxCt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_925_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtForPrdUMe_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_925_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_TauxOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_TauxOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6317Lb_TauxOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6317Lb_TauxOrd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_TauxOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_TauxOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6317_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6317_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_productoRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_6317_Internalname,sImgUrl,imgprompt_6317_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_6317_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      httpContext.ajax_sending_grid_row(Gridlevel_productoRow);
      send_integrity_lvl_hashes1SQ925( ) ;
      GXCCtl = "Z6378Lb_TauxLP_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6378Lb_TauxLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6316Lb_TaAuxCt_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6317Lb_TauxOrd_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6317Lb_TauxOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6316Lb_TaAuxCt_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6316Lb_TaAuxCt, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O719PrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "nRcdDeleted_925_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_925_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_925_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_925, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV23EmprCod));
      GXCCtl = "vLB_TAAUXC_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24Lb_TaAuxC));
      GXCCtl = "vLB_TAAUXL_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV25lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vLB_TAAUXD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV22Lb_TaAuxD));
      GXCCtl = "vLB_TAAUXCI_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV17Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vLB_TAAUXCF_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV18Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAUXLP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXCT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TaAuxCt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_51_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAUXORD_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_6317_"+sGXsfl_51_idx+"Link", GXutil.rtrim( imgprompt_6317_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_productoContainer.AddRow(Gridlevel_productoRow);
   }

   public void readRow1SQ925( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51925( ) ;
      edtLb_TauxLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAUXLP_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_TaAuxCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXCT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Horizontalalignment") ;
      edtLb_TauxOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_TAUXORD_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_6317_Link = httpContext.cgiGet( "PROMPT_6317_"+sGXsfl_51_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TauxLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TauxLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_TAUXLP_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TauxLP_Internalname ;
         wbErr = true ;
         A6378Lb_TauxLP = (short)(0) ;
      }
      else
      {
         A6378Lb_TauxLP = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TauxLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCt_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "LB_TAAUXCT_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxCt_Internalname ;
         wbErr = true ;
         A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      }
      else
      {
         A6316Lb_TaAuxCt = localUtil.ctond( httpContext.cgiGet( edtLb_TaAuxCt_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TauxOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_TauxOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_TAUXORD_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TauxOrd_Internalname ;
         wbErr = true ;
         A6317Lb_TauxOrd = (short)(0) ;
      }
      else
      {
         A6317Lb_TauxOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_TauxOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z6378Lb_TauxLP_" + sGXsfl_51_idx ;
      Z6378Lb_TauxLP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6316Lb_TaAuxCt_" + sGXsfl_51_idx ;
      Z6316Lb_TaAuxCt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6317Lb_TauxOrd_" + sGXsfl_51_idx ;
      Z6317Lb_TauxOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6316Lb_TaAuxCt_" + sGXsfl_51_idx ;
      O6316Lb_TaAuxCt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_51_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_925_" + sGXsfl_51_idx ;
      nRcdDeleted_925 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_925_" + sGXsfl_51_idx ;
      nRcdExists_925 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_925_" + sGXsfl_51_idx ;
      nIsMod_925 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_TauxLP_Enabled = edtLb_TauxLP_Enabled ;
   }

   public void confirmValues1SQ0( )
   {
      nGXsfl_51_idx = 0 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51925( ) ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51925( ) ;
         httpContext.changePostValue( "Z6378Lb_TauxLP_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z6378Lb_TauxLP_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6378Lb_TauxLP_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z6316Lb_TaAuxCt_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z6316Lb_TaAuxCt_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6316Lb_TaAuxCt_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z6317Lb_TauxOrd_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z6317Lb_TauxOrd_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6317Lb_TauxOrd_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx) ;
      }
      httpContext.changePostValue( "O6316Lb_TaAuxCt", httpContext.cgiGet( "T6316Lb_TaAuxCt")) ;
      httpContext.deletePostValue( "T6316Lb_TaAuxCt") ;
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_4", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV24Lb_TaAuxC)),GXutil.URLEncode(GXutil.ltrimstr(AV25lb_TaAuxL,4,0)),GXutil.URLEncode(GXutil.rtrim(AV22Lb_TaAuxD)),GXutil.URLEncode(DecimalUtil.decToString(AV17Lb_TaAuxCi)),GXutil.URLEncode(DecimalUtil.decToString(AV18Lb_TaAuxCf))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC","lb_TaAuxL","Lb_TaAuxD","Lb_TaAuxCi","Lb_TaAuxCf"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_4");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\tablaalcalisysulfatos_4:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6313lb_TaAuxL", GXutil.ltrim( localUtil.ntoc( Z6313lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6314Lb_TaAuxCi", GXutil.ltrim( localUtil.ntoc( Z6314Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6315Lb_TaAuxCf", GXutil.ltrim( localUtil.ntoc( Z6315Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6377Lb_TaAuxUP", GXutil.ltrim( localUtil.ntoc( Z6377Lb_TaAuxUP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6377Lb_TaAuxUP", GXutil.ltrim( localUtil.ntoc( O6377Lb_TaAuxUP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nGXsfl_51_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV19PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV19PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFORPRDUME_DATA", AV21ForPrdUMe_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFORPRDUME_DATA", AV21ForPrdUMe_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXD", GXutil.rtrim( AV22Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXCI", GXutil.ltrim( localUtil.ntoc( AV17Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXCF", GXutil.ltrim( localUtil.ntoc( AV18Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXC", GXutil.rtrim( AV24Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24Lb_TaAuxC, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXL", GXutil.ltrim( localUtil.ntoc( AV25lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25lb_TaAuxL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXUP", GXutil.ltrim( localUtil.ntoc( A6377Lb_TaAuxUP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV7Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Objectcall", GXutil.rtrim( Combo_forprdume_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Cls", GXutil.rtrim( Combo_forprdume_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Enabled", GXutil.booltostr( Combo_forprdume_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Titlecontrolidtoreplace", GXutil.rtrim( Combo_forprdume_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Isgriditem", GXutil.booltostr( Combo_forprdume_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Emptyitem", GXutil.booltostr( Combo_forprdume_Emptyitem));
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
      return formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_4", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV24Lb_TaAuxC)),GXutil.URLEncode(GXutil.ltrimstr(AV25lb_TaAuxL,4,0)),GXutil.URLEncode(GXutil.rtrim(AV22Lb_TaAuxD)),GXutil.URLEncode(DecimalUtil.decToString(AV17Lb_TaAuxCi)),GXutil.URLEncode(DecimalUtil.decToString(AV18Lb_TaAuxCf))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC","lb_TaAuxL","Lb_TaAuxD","Lb_TaAuxCi","Lb_TaAuxCf"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.TablaAlcalisySulfatos_4" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Alcalisy Sulfatos (productos)", "") ;
   }

   public void initializeNonKey1SQ919( )
   {
      A6311Lb_TaAuxD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
      A6377Lb_TaAuxUP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      O6377Lb_TaAuxUP = A6377Lb_TaAuxUP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
      Z6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      Z6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      Z6377Lb_TaAuxUP = (short)(0) ;
   }

   public void initAll1SQ919( )
   {
      A6310Lb_TaAuxC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      A6313lb_TaAuxL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      initializeNonKey1SQ919( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1SQ925( )
   {
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A6317Lb_TauxOrd = (short)(0) ;
      O6316Lb_TaAuxCt = A6316Lb_TaAuxCt ;
      O719PrdNum = A719PrdNum ;
      Z6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      Z6317Lb_TauxOrd = (short)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1SQ925( )
   {
      A6378Lb_TauxLP = (short)(0) ;
      initializeNonKey1SQ925( ) ;
   }

   public void standaloneModalInsert1SQ925( )
   {
      A6377Lb_TaAuxUP = i6377Lb_TaAuxUP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6377Lb_TaAuxUP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6377Lb_TaAuxUP), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693849", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/tablaalcalisysulfatos_4.js", "?20268211693849", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties925( )
   {
      edtLb_TauxLP_Enabled = defedtLb_TauxLP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TauxLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TauxLP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void startgridcontrol51( )
   {
      Gridlevel_productoContainer.AddObjectProperty("GridName", "Gridlevel_producto");
      Gridlevel_productoContainer.AddObjectProperty("Header", subGridlevel_producto_Header);
      Gridlevel_productoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_productoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_productoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6378Lb_TauxLP, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6316Lb_TaAuxCt, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TaAuxCt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6317Lb_TauxOrd, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_TauxOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtLb_TaAuxC_Internalname = "LB_TAAUXC" ;
      edtLb_TaAuxD_Internalname = "LB_TAAUXD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtlb_TaAuxL_Internalname = "LB_TAAUXL" ;
      edtLb_TaAuxCi_Internalname = "LB_TAAUXCI" ;
      edtLb_TaAuxCf_Internalname = "LB_TAAUXCF" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLb_TauxLP_Internalname = "LB_TAUXLP" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLb_TaAuxCt_Internalname = "LB_TAAUXCT" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtLb_TauxOrd_Internalname = "LB_TAUXORD" ;
      divTableleaflevel_producto_Internalname = "TABLELEAFLEVEL_PRODUCTO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Combo_forprdume_Internalname = "COMBO_FORPRDUME" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_6317_Internalname = "PROMPT_6317" ;
      subGridlevel_producto_Internalname = "GRIDLEVEL_PRODUCTO" ;
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
      subGridlevel_producto_Allowcollapsing = (byte)(0) ;
      subGridlevel_producto_Allowselection = (byte)(0) ;
      subGridlevel_producto_Header = "" ;
      Combo_forprdume_Enabled = GXutil.toBoolean( -1) ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tabla Alcalisy Sulfatos (productos)", "") );
      imgprompt_6317_Visible = 1 ;
      imgprompt_6317_Link = "" ;
      imgprompt_6317_Visible = 1 ;
      edtLb_TauxOrd_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtLb_TaAuxCt_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLb_TauxLP_Jsonclick = "" ;
      subGridlevel_producto_Class = "GridNoBorder WorkWith" ;
      subGridlevel_producto_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_forprdume_Titlecontrolidtoreplace = "" ;
      edtLb_TauxOrd_Enabled = 1 ;
      edtForPrdUMe_Enabled = 1 ;
      edtLb_TaAuxCt_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtLb_TauxLP_Enabled = 1 ;
      Combo_forprdume_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_forprdume_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_forprdume_Cls = "ExtendedCombo" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLb_TaAuxCf_Jsonclick = "" ;
      edtLb_TaAuxCf_Enabled = 1 ;
      edtLb_TaAuxCi_Jsonclick = "" ;
      edtLb_TaAuxCi_Enabled = 1 ;
      edtlb_TaAuxL_Jsonclick = "" ;
      edtlb_TaAuxL_Enabled = 1 ;
      edtLb_TaAuxD_Jsonclick = "" ;
      edtLb_TaAuxD_Enabled = 0 ;
      edtLb_TaAuxC_Jsonclick = "" ;
      edtLb_TaAuxC_Enabled = 1 ;
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
      edtForPrdUMe_Horizontalalignment = "right" ;
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

   public void gxnrgridlevel_producto_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_51925( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SQ925( ) ;
         standaloneModal1SQ925( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SQ925( ) ;
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51925( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_productoContainer)) ;
      /* End function gxnrGridlevel_producto_newrow */
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

   public void valid_Lb_taauxc( )
   {
      /* Using cursor T01SQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
      }
      A6311Lb_TaAuxD = T01SQ18_A6311Lb_TaAuxD[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", GXutil.rtrim( A6311Lb_TaAuxD));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01SQ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01SQ28_A718PrdNom[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01SQ29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01SQ29_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SQ29_n488ForPrdDsc[0] ;
      pr_default.close(27);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true},{av:'AV25lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'AV22Lb_TaAuxD',fld:'vLB_TAAUXD',pic:''},{av:'AV17Lb_TaAuxCi',fld:'vLB_TAAUXCI',pic:'ZZZZ9.99999'},{av:'AV18Lb_TaAuxCf',fld:'vLB_TAAUXCF',pic:'ZZZZ9.99999'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV24Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true},{av:'AV25lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SQ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_TAAUXC","{handler:'valid_Lb_taauxc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]");
      setEventMetadata("VALID_LB_TAAUXC",",oparms:[{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]}");
      setEventMetadata("VALID_LB_TAAUXL","{handler:'valid_Lb_taauxl',iparms:[]");
      setEventMetadata("VALID_LB_TAAUXL",",oparms:[]}");
      setEventMetadata("VALID_LB_TAUXLP","{handler:'valid_Lb_tauxlp',iparms:[]");
      setEventMetadata("VALID_LB_TAUXLP",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_LB_TAAUXCT","{handler:'valid_Lb_taauxct',iparms:[]");
      setEventMetadata("VALID_LB_TAAUXCT",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_LB_TAUXORD","{handler:'valid_Lb_tauxord',iparms:[]");
      setEventMetadata("VALID_LB_TAUXORD",",oparms:[]}");
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
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV23EmprCod = "" ;
      wcpOAV24Lb_TaAuxC = "" ;
      wcpOAV22Lb_TaAuxD = "" ;
      wcpOAV17Lb_TaAuxCi = DecimalUtil.ZERO ;
      wcpOAV18Lb_TaAuxCf = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z6310Lb_TaAuxC = "" ;
      Z6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      Z6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      Z6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6310Lb_TaAuxC = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV23EmprCod = "" ;
      AV24Lb_TaAuxC = "" ;
      AV22Lb_TaAuxD = "" ;
      AV17Lb_TaAuxCi = DecimalUtil.ZERO ;
      AV18Lb_TaAuxCf = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A6311Lb_TaAuxD = "" ;
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV19PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_forprdume = new com.genexus.webpanels.GXUserControl();
      Combo_forprdume_Caption = "" ;
      AV21ForPrdUMe_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_productoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode925 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      AV7Modif = "" ;
      A718PrdNom = "" ;
      A488ForPrdDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
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
      Combo_forprdume_Objectcall = "" ;
      Combo_forprdume_Class = "" ;
      Combo_forprdume_Icontype = "" ;
      Combo_forprdume_Icon = "" ;
      Combo_forprdume_Tooltip = "" ;
      Combo_forprdume_Selectedvalue_set = "" ;
      Combo_forprdume_Selectedvalue_get = "" ;
      Combo_forprdume_Selectedtext_set = "" ;
      Combo_forprdume_Selectedtext_get = "" ;
      Combo_forprdume_Gamoauthtoken = "" ;
      Combo_forprdume_Ddointernalname = "" ;
      Combo_forprdume_Titlecontrolalign = "" ;
      Combo_forprdume_Dropdownoptionstype = "" ;
      Combo_forprdume_Datalisttype = "" ;
      Combo_forprdume_Datalistfixedvalues = "" ;
      Combo_forprdume_Datalistproc = "" ;
      Combo_forprdume_Datalistprocparametersprefix = "" ;
      Combo_forprdume_Remoteservicesparameters = "" ;
      Combo_forprdume_Htmltemplate = "" ;
      Combo_forprdume_Multiplevaluestype = "" ;
      Combo_forprdume_Loadingdata = "" ;
      Combo_forprdume_Noresultsfound = "" ;
      Combo_forprdume_Emptyitemtext = "" ;
      Combo_forprdume_Onlyselectedvalues = "" ;
      Combo_forprdume_Selectalltext = "" ;
      Combo_forprdume_Multiplevaluesseparator = "" ;
      Combo_forprdume_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode919 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sV7Modif = "" ;
      OV7Modif = "" ;
      GXCCtl = "" ;
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      T6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      AV8Station = "" ;
      AV9EmprNom = "" ;
      AV10UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV20ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z6311Lb_TaAuxD = "" ;
      T01SQ8_A407EmprNom = new String[] {""} ;
      T01SQ8_n407EmprNom = new boolean[] {false} ;
      T01SQ9_A6311Lb_TaAuxD = new String[] {""} ;
      T01SQ10_A6313lb_TaAuxL = new short[1] ;
      T01SQ10_A407EmprNom = new String[] {""} ;
      T01SQ10_n407EmprNom = new boolean[] {false} ;
      T01SQ10_A6311Lb_TaAuxD = new String[] {""} ;
      T01SQ10_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ10_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ10_A6377Lb_TaAuxUP = new short[1] ;
      T01SQ10_A396EmprCod = new String[] {""} ;
      T01SQ10_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ11_A6311Lb_TaAuxD = new String[] {""} ;
      T01SQ12_A396EmprCod = new String[] {""} ;
      T01SQ12_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ12_A6313lb_TaAuxL = new short[1] ;
      T01SQ7_A6313lb_TaAuxL = new short[1] ;
      T01SQ7_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ7_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ7_A6377Lb_TaAuxUP = new short[1] ;
      T01SQ7_A396EmprCod = new String[] {""} ;
      T01SQ7_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ13_A396EmprCod = new String[] {""} ;
      T01SQ13_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ13_A6313lb_TaAuxL = new short[1] ;
      T01SQ14_A396EmprCod = new String[] {""} ;
      T01SQ14_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ14_A6313lb_TaAuxL = new short[1] ;
      T01SQ6_A6313lb_TaAuxL = new short[1] ;
      T01SQ6_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ6_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ6_A6377Lb_TaAuxUP = new short[1] ;
      T01SQ6_A396EmprCod = new String[] {""} ;
      T01SQ6_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ18_A6311Lb_TaAuxD = new String[] {""} ;
      T01SQ20_A396EmprCod = new String[] {""} ;
      T01SQ20_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ20_A6313lb_TaAuxL = new short[1] ;
      Z718PrdNom = "" ;
      Z488ForPrdDsc = "" ;
      T01SQ21_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ21_A6313lb_TaAuxL = new short[1] ;
      T01SQ21_A6378Lb_TauxLP = new short[1] ;
      T01SQ21_A718PrdNom = new String[] {""} ;
      T01SQ21_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ21_A488ForPrdDsc = new String[] {""} ;
      T01SQ21_n488ForPrdDsc = new boolean[] {false} ;
      T01SQ21_A6317Lb_TauxOrd = new short[1] ;
      T01SQ21_A396EmprCod = new String[] {""} ;
      T01SQ21_A719PrdNum = new String[] {""} ;
      T01SQ21_A490ForPrdUMe = new byte[1] ;
      T01SQ4_A718PrdNom = new String[] {""} ;
      T01SQ5_A488ForPrdDsc = new String[] {""} ;
      T01SQ5_n488ForPrdDsc = new boolean[] {false} ;
      T01SQ22_A718PrdNom = new String[] {""} ;
      T01SQ23_A488ForPrdDsc = new String[] {""} ;
      T01SQ23_n488ForPrdDsc = new boolean[] {false} ;
      T01SQ24_A396EmprCod = new String[] {""} ;
      T01SQ24_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ24_A6313lb_TaAuxL = new short[1] ;
      T01SQ24_A6378Lb_TauxLP = new short[1] ;
      T01SQ3_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ3_A6313lb_TaAuxL = new short[1] ;
      T01SQ3_A6378Lb_TauxLP = new short[1] ;
      T01SQ3_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ3_A6317Lb_TauxOrd = new short[1] ;
      T01SQ3_A396EmprCod = new String[] {""} ;
      T01SQ3_A719PrdNum = new String[] {""} ;
      T01SQ3_A490ForPrdUMe = new byte[1] ;
      T01SQ2_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ2_A6313lb_TaAuxL = new short[1] ;
      T01SQ2_A6378Lb_TauxLP = new short[1] ;
      T01SQ2_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SQ2_A6317Lb_TauxOrd = new short[1] ;
      T01SQ2_A396EmprCod = new String[] {""} ;
      T01SQ2_A719PrdNum = new String[] {""} ;
      T01SQ2_A490ForPrdUMe = new byte[1] ;
      T01SQ28_A718PrdNom = new String[] {""} ;
      T01SQ29_A488ForPrdDsc = new String[] {""} ;
      T01SQ29_n488ForPrdDsc = new boolean[] {false} ;
      T01SQ30_A396EmprCod = new String[] {""} ;
      T01SQ30_A6310Lb_TaAuxC = new String[] {""} ;
      T01SQ30_A6313lb_TaAuxL = new short[1] ;
      T01SQ30_A6378Lb_TauxLP = new short[1] ;
      Gridlevel_productoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_producto_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_6317_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_productoColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_4__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_4__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_4__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_4__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_4__default(),
         new Object[] {
             new Object[] {
            T01SQ2_A6310Lb_TaAuxC, T01SQ2_A6313lb_TaAuxL, T01SQ2_A6378Lb_TauxLP, T01SQ2_A6316Lb_TaAuxCt, T01SQ2_A6317Lb_TauxOrd, T01SQ2_A396EmprCod, T01SQ2_A719PrdNum, T01SQ2_A490ForPrdUMe
            }
            , new Object[] {
            T01SQ3_A6310Lb_TaAuxC, T01SQ3_A6313lb_TaAuxL, T01SQ3_A6378Lb_TauxLP, T01SQ3_A6316Lb_TaAuxCt, T01SQ3_A6317Lb_TauxOrd, T01SQ3_A396EmprCod, T01SQ3_A719PrdNum, T01SQ3_A490ForPrdUMe
            }
            , new Object[] {
            T01SQ4_A718PrdNom
            }
            , new Object[] {
            T01SQ5_A488ForPrdDsc, T01SQ5_n488ForPrdDsc
            }
            , new Object[] {
            T01SQ6_A6313lb_TaAuxL, T01SQ6_A6314Lb_TaAuxCi, T01SQ6_A6315Lb_TaAuxCf, T01SQ6_A6377Lb_TaAuxUP, T01SQ6_A396EmprCod, T01SQ6_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SQ7_A6313lb_TaAuxL, T01SQ7_A6314Lb_TaAuxCi, T01SQ7_A6315Lb_TaAuxCf, T01SQ7_A6377Lb_TaAuxUP, T01SQ7_A396EmprCod, T01SQ7_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SQ8_A407EmprNom, T01SQ8_n407EmprNom
            }
            , new Object[] {
            T01SQ9_A6311Lb_TaAuxD
            }
            , new Object[] {
            T01SQ10_A6313lb_TaAuxL, T01SQ10_A407EmprNom, T01SQ10_n407EmprNom, T01SQ10_A6311Lb_TaAuxD, T01SQ10_A6314Lb_TaAuxCi, T01SQ10_A6315Lb_TaAuxCf, T01SQ10_A6377Lb_TaAuxUP, T01SQ10_A396EmprCod, T01SQ10_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SQ11_A6311Lb_TaAuxD
            }
            , new Object[] {
            T01SQ12_A396EmprCod, T01SQ12_A6310Lb_TaAuxC, T01SQ12_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SQ13_A396EmprCod, T01SQ13_A6310Lb_TaAuxC, T01SQ13_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SQ14_A396EmprCod, T01SQ14_A6310Lb_TaAuxC, T01SQ14_A6313lb_TaAuxL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SQ18_A6311Lb_TaAuxD
            }
            , new Object[] {
            }
            , new Object[] {
            T01SQ20_A396EmprCod, T01SQ20_A6310Lb_TaAuxC, T01SQ20_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SQ21_A6310Lb_TaAuxC, T01SQ21_A6313lb_TaAuxL, T01SQ21_A6378Lb_TauxLP, T01SQ21_A718PrdNom, T01SQ21_A6316Lb_TaAuxCt, T01SQ21_A488ForPrdDsc, T01SQ21_n488ForPrdDsc, T01SQ21_A6317Lb_TauxOrd, T01SQ21_A396EmprCod, T01SQ21_A719PrdNum,
            T01SQ21_A490ForPrdUMe
            }
            , new Object[] {
            T01SQ22_A718PrdNom
            }
            , new Object[] {
            T01SQ23_A488ForPrdDsc, T01SQ23_n488ForPrdDsc
            }
            , new Object[] {
            T01SQ24_A396EmprCod, T01SQ24_A6310Lb_TaAuxC, T01SQ24_A6313lb_TaAuxL, T01SQ24_A6378Lb_TauxLP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SQ28_A718PrdNom
            }
            , new Object[] {
            T01SQ29_A488ForPrdDsc, T01SQ29_n488ForPrdDsc
            }
            , new Object[] {
            T01SQ30_A396EmprCod, T01SQ30_A6310Lb_TaAuxC, T01SQ30_A6313lb_TaAuxL, T01SQ30_A6378Lb_TauxLP
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV27Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_4" ;
   }

   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_producto_Backcolorstyle ;
   private byte subGridlevel_producto_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_producto_Allowselection ;
   private byte subGridlevel_producto_Allowhovering ;
   private byte subGridlevel_producto_Allowcollapsing ;
   private byte subGridlevel_producto_Collapsed ;
   private short nIsMod_925 ;
   private short wcpOAV25lb_TaAuxL ;
   private short Z6313lb_TaAuxL ;
   private short Z6377Lb_TaAuxUP ;
   private short O6377Lb_TaAuxUP ;
   private short Z6378Lb_TauxLP ;
   private short Z6317Lb_TauxOrd ;
   private short nRcdDeleted_925 ;
   private short nRcdExists_925 ;
   private short AV25lb_TaAuxL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6377Lb_TaAuxUP ;
   private short A6313lb_TaAuxL ;
   private short nBlankRcdCount925 ;
   private short RcdFound925 ;
   private short B6377Lb_TaAuxUP ;
   private short nBlankRcdUsr925 ;
   private short RcdFound919 ;
   private short s6377Lb_TaAuxUP ;
   private short A6378Lb_TauxLP ;
   private short A6317Lb_TauxOrd ;
   private short nIsDirty_919 ;
   private short nIsDirty_925 ;
   private short i6377Lb_TaAuxUP ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int trnEnded ;
   private int edtLb_TaAuxC_Enabled ;
   private int edtLb_TaAuxD_Enabled ;
   private int edtlb_TaAuxL_Enabled ;
   private int edtLb_TaAuxCi_Enabled ;
   private int edtLb_TaAuxCf_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtLb_TauxLP_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtLb_TaAuxCt_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtLb_TauxOrd_Enabled ;
   private int fRowAdded ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_forprdume_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_producto_Backcolor ;
   private int subGridlevel_producto_Allbackcolor ;
   private int imgprompt_6317_Visible ;
   private int defedtLb_TauxLP_Enabled ;
   private int idxLst ;
   private int subGridlevel_producto_Selectedindex ;
   private int subGridlevel_producto_Selectioncolor ;
   private int subGridlevel_producto_Hoveringcolor ;
   private long GRIDLEVEL_PRODUCTO_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV17Lb_TaAuxCi ;
   private java.math.BigDecimal wcpOAV18Lb_TaAuxCf ;
   private java.math.BigDecimal Z6314Lb_TaAuxCi ;
   private java.math.BigDecimal Z6315Lb_TaAuxCf ;
   private java.math.BigDecimal Z6316Lb_TaAuxCt ;
   private java.math.BigDecimal O6316Lb_TaAuxCt ;
   private java.math.BigDecimal AV17Lb_TaAuxCi ;
   private java.math.BigDecimal AV18Lb_TaAuxCf ;
   private java.math.BigDecimal A6314Lb_TaAuxCi ;
   private java.math.BigDecimal A6315Lb_TaAuxCf ;
   private java.math.BigDecimal A6316Lb_TaAuxCt ;
   private java.math.BigDecimal T6316Lb_TaAuxCt ;
   private String sPrefix ;
   private String sGXsfl_51_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV23EmprCod ;
   private String wcpOAV24Lb_TaAuxC ;
   private String wcpOAV22Lb_TaAuxD ;
   private String Z396EmprCod ;
   private String Z6310Lb_TaAuxC ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV23EmprCod ;
   private String AV24Lb_TaAuxC ;
   private String AV22Lb_TaAuxD ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_TaAuxC_Internalname ;
   private String edtForPrdUMe_Horizontalalignment ;
   private String edtForPrdUMe_Internalname ;
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
   private String TempTags ;
   private String edtLb_TaAuxC_Jsonclick ;
   private String edtLb_TaAuxD_Internalname ;
   private String A6311Lb_TaAuxD ;
   private String edtLb_TaAuxD_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtlb_TaAuxL_Internalname ;
   private String edtlb_TaAuxL_Jsonclick ;
   private String edtLb_TaAuxCi_Internalname ;
   private String edtLb_TaAuxCi_Jsonclick ;
   private String edtLb_TaAuxCf_Internalname ;
   private String edtLb_TaAuxCf_Jsonclick ;
   private String divTableleaflevel_producto_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String Combo_forprdume_Caption ;
   private String Combo_forprdume_Cls ;
   private String Combo_forprdume_Internalname ;
   private String sMode925 ;
   private String edtLb_TauxLP_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtLb_TaAuxCt_Internalname ;
   private String edtLb_TauxOrd_Internalname ;
   private String imgprompt_6317_Link ;
   private String sStyleString ;
   private String subGridlevel_producto_Internalname ;
   private String A407EmprNom ;
   private String AV7Modif ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
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
   private String Combo_forprdume_Objectcall ;
   private String Combo_forprdume_Class ;
   private String Combo_forprdume_Icontype ;
   private String Combo_forprdume_Icon ;
   private String Combo_forprdume_Tooltip ;
   private String Combo_forprdume_Selectedvalue_set ;
   private String Combo_forprdume_Selectedvalue_get ;
   private String Combo_forprdume_Selectedtext_set ;
   private String Combo_forprdume_Selectedtext_get ;
   private String Combo_forprdume_Gamoauthtoken ;
   private String Combo_forprdume_Ddointernalname ;
   private String Combo_forprdume_Titlecontrolalign ;
   private String Combo_forprdume_Dropdownoptionstype ;
   private String Combo_forprdume_Titlecontrolidtoreplace ;
   private String Combo_forprdume_Datalisttype ;
   private String Combo_forprdume_Datalistfixedvalues ;
   private String Combo_forprdume_Datalistproc ;
   private String Combo_forprdume_Datalistprocparametersprefix ;
   private String Combo_forprdume_Remoteservicesparameters ;
   private String Combo_forprdume_Htmltemplate ;
   private String Combo_forprdume_Multiplevaluestype ;
   private String Combo_forprdume_Loadingdata ;
   private String Combo_forprdume_Noresultsfound ;
   private String Combo_forprdume_Emptyitemtext ;
   private String Combo_forprdume_Onlyselectedvalues ;
   private String Combo_forprdume_Selectalltext ;
   private String Combo_forprdume_Multiplevaluesseparator ;
   private String Combo_forprdume_Addnewoptiontext ;
   private String hsh ;
   private String sMode919 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV7Modif ;
   private String OV7Modif ;
   private String GXCCtl ;
   private String T719PrdNum ;
   private String AV8Station ;
   private String AV9EmprNom ;
   private String AV10UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z6311Lb_TaAuxD ;
   private String Z718PrdNom ;
   private String Z488ForPrdDsc ;
   private String imgprompt_6317_Internalname ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGridlevel_producto_Class ;
   private String subGridlevel_producto_Linesclass ;
   private String ROClassString ;
   private String edtLb_TauxLP_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtLb_TaAuxCt_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtLb_TauxOrd_Jsonclick ;
   private String imgprompt_6317_gximage ;
   private String sImgUrl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_producto_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_forprdume_Isgriditem ;
   private boolean Combo_forprdume_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Combo_forprdume_Enabled ;
   private boolean Combo_forprdume_Visible ;
   private boolean Combo_forprdume_Allowmultipleselection ;
   private boolean Combo_forprdume_Hasdescription ;
   private boolean Combo_forprdume_Includeonlyselectedoption ;
   private boolean Combo_forprdume_Includeselectalloption ;
   private boolean Combo_forprdume_Includeaddnewoption ;
   private boolean returnInSub ;
   private String AV20ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_productoContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_productoRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_productoColumn ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_forprdume ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SQ8_A407EmprNom ;
   private boolean[] T01SQ8_n407EmprNom ;
   private String[] T01SQ9_A6311Lb_TaAuxD ;
   private short[] T01SQ10_A6313lb_TaAuxL ;
   private String[] T01SQ10_A407EmprNom ;
   private boolean[] T01SQ10_n407EmprNom ;
   private String[] T01SQ10_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] T01SQ10_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SQ10_A6315Lb_TaAuxCf ;
   private short[] T01SQ10_A6377Lb_TaAuxUP ;
   private String[] T01SQ10_A396EmprCod ;
   private String[] T01SQ10_A6310Lb_TaAuxC ;
   private String[] T01SQ11_A6311Lb_TaAuxD ;
   private String[] T01SQ12_A396EmprCod ;
   private String[] T01SQ12_A6310Lb_TaAuxC ;
   private short[] T01SQ12_A6313lb_TaAuxL ;
   private short[] T01SQ7_A6313lb_TaAuxL ;
   private java.math.BigDecimal[] T01SQ7_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SQ7_A6315Lb_TaAuxCf ;
   private short[] T01SQ7_A6377Lb_TaAuxUP ;
   private String[] T01SQ7_A396EmprCod ;
   private String[] T01SQ7_A6310Lb_TaAuxC ;
   private String[] T01SQ13_A396EmprCod ;
   private String[] T01SQ13_A6310Lb_TaAuxC ;
   private short[] T01SQ13_A6313lb_TaAuxL ;
   private String[] T01SQ14_A396EmprCod ;
   private String[] T01SQ14_A6310Lb_TaAuxC ;
   private short[] T01SQ14_A6313lb_TaAuxL ;
   private short[] T01SQ6_A6313lb_TaAuxL ;
   private java.math.BigDecimal[] T01SQ6_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SQ6_A6315Lb_TaAuxCf ;
   private short[] T01SQ6_A6377Lb_TaAuxUP ;
   private String[] T01SQ6_A396EmprCod ;
   private String[] T01SQ6_A6310Lb_TaAuxC ;
   private String[] T01SQ18_A6311Lb_TaAuxD ;
   private String[] T01SQ20_A396EmprCod ;
   private String[] T01SQ20_A6310Lb_TaAuxC ;
   private short[] T01SQ20_A6313lb_TaAuxL ;
   private String[] T01SQ21_A6310Lb_TaAuxC ;
   private short[] T01SQ21_A6313lb_TaAuxL ;
   private short[] T01SQ21_A6378Lb_TauxLP ;
   private String[] T01SQ21_A718PrdNom ;
   private java.math.BigDecimal[] T01SQ21_A6316Lb_TaAuxCt ;
   private String[] T01SQ21_A488ForPrdDsc ;
   private boolean[] T01SQ21_n488ForPrdDsc ;
   private short[] T01SQ21_A6317Lb_TauxOrd ;
   private String[] T01SQ21_A396EmprCod ;
   private String[] T01SQ21_A719PrdNum ;
   private byte[] T01SQ21_A490ForPrdUMe ;
   private String[] T01SQ4_A718PrdNom ;
   private String[] T01SQ5_A488ForPrdDsc ;
   private boolean[] T01SQ5_n488ForPrdDsc ;
   private String[] T01SQ22_A718PrdNom ;
   private String[] T01SQ23_A488ForPrdDsc ;
   private boolean[] T01SQ23_n488ForPrdDsc ;
   private String[] T01SQ24_A396EmprCod ;
   private String[] T01SQ24_A6310Lb_TaAuxC ;
   private short[] T01SQ24_A6313lb_TaAuxL ;
   private short[] T01SQ24_A6378Lb_TauxLP ;
   private String[] T01SQ3_A6310Lb_TaAuxC ;
   private short[] T01SQ3_A6313lb_TaAuxL ;
   private short[] T01SQ3_A6378Lb_TauxLP ;
   private java.math.BigDecimal[] T01SQ3_A6316Lb_TaAuxCt ;
   private short[] T01SQ3_A6317Lb_TauxOrd ;
   private String[] T01SQ3_A396EmprCod ;
   private String[] T01SQ3_A719PrdNum ;
   private byte[] T01SQ3_A490ForPrdUMe ;
   private String[] T01SQ2_A6310Lb_TaAuxC ;
   private short[] T01SQ2_A6313lb_TaAuxL ;
   private short[] T01SQ2_A6378Lb_TauxLP ;
   private java.math.BigDecimal[] T01SQ2_A6316Lb_TaAuxCt ;
   private short[] T01SQ2_A6317Lb_TauxOrd ;
   private String[] T01SQ2_A396EmprCod ;
   private String[] T01SQ2_A719PrdNum ;
   private byte[] T01SQ2_A490ForPrdUMe ;
   private String[] T01SQ28_A718PrdNom ;
   private String[] T01SQ29_A488ForPrdDsc ;
   private boolean[] T01SQ29_n488ForPrdDsc ;
   private String[] T01SQ30_A396EmprCod ;
   private String[] T01SQ30_A6310Lb_TaAuxC ;
   private short[] T01SQ30_A6313lb_TaAuxL ;
   private short[] T01SQ30_A6378Lb_TauxLP ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV21ForPrdUMe_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
}

final  class tablaalcalisysulfatos_4__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_4__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_4__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_4__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SQ2", "SELECT Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP, Lb_TaAuxCt, Lb_TauxOrd, EmprCod, PrdNum, ForPrdUMe FROM TXPENS007 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ?  FOR UPDATE OF Lb_TaAuxCt, Lb_TauxOrd, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ3", "SELECT Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP, Lb_TaAuxCt, Lb_TauxOrd, EmprCod, PrdNum, ForPrdUMe FROM TXPENS007 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ4", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ6", "SELECT lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, Lb_TaAuxUP, EmprCod, Lb_TaAuxC FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?  FOR UPDATE OF Lb_TaAuxCi, Lb_TaAuxCf, Lb_TaAuxUP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ7", "SELECT lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, Lb_TaAuxUP, EmprCod, Lb_TaAuxC FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ9", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ10", "SELECT /*+ FIRST_ROWS(100) */ TM1.lb_TaAuxL, T2.EmprNom, T3.Lb_TaAuxD, TM1.Lb_TaAuxCi, TM1.Lb_TaAuxCf, TM1.Lb_TaAuxUP, TM1.EmprCod, TM1.Lb_TaAuxC FROM ((TXPENS008 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPENS005 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Lb_TaAuxC = TM1.Lb_TaAuxC) WHERE TM1.EmprCod = ? and TM1.Lb_TaAuxC = ? and TM1.lb_TaAuxL = ? ORDER BY TM1.EmprCod, TM1.Lb_TaAuxC, TM1.lb_TaAuxL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ11", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE ( Lb_TaAuxC > ? or Lb_TaAuxC = ? and lb_TaAuxL > ?) and EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SQ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE ( Lb_TaAuxC < ? or Lb_TaAuxC = ? and lb_TaAuxL < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_TaAuxC DESC, lb_TaAuxL DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SQ15", "INSERT INTO TXPENS008(lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, Lb_TaAuxUP, EmprCod, Lb_TaAuxC) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS008")
         ,new UpdateCursor("T01SQ16", "UPDATE TXPENS008 SET Lb_TaAuxCi=?, Lb_TaAuxCf=?, Lb_TaAuxUP=?  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK, "TXPENS008")
         ,new UpdateCursor("T01SQ17", "DELETE FROM TXPENS008  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK, "TXPENS008")
         ,new ForEachCursor("T01SQ18", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SQ19", "UPDATE TXPENS008 SET Lb_TaAuxUP=?  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK, "TXPENS008")
         ,new ForEachCursor("T01SQ20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ21", "SELECT T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP, T2.PrdNom, T1.Lb_TaAuxCt, T3.ForPrdDsc, T1.Lb_TauxOrd, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe FROM ((TXPENS007 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_TaAuxC = ? and T1.lb_TaAuxL = ? and T1.Lb_TauxLP = ? ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ22", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ23", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ24", "SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SQ25", "INSERT INTO TXPENS007(Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP, Lb_TaAuxCt, Lb_TauxOrd, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS007")
         ,new UpdateCursor("T01SQ26", "UPDATE TXPENS007 SET Lb_TaAuxCt=?, Lb_TauxOrd=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ?", GX_NOMASK, "TXPENS007")
         ,new UpdateCursor("T01SQ27", "DELETE FROM TXPENS007  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ?", GX_NOMASK, "TXPENS007")
         ,new ForEachCursor("T01SQ28", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ29", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SQ30", "SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? and Lb_TaAuxC = ? and lb_TaAuxL = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 4);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 24 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

