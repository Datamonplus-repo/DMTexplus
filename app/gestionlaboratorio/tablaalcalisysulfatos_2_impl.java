package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tablaalcalisysulfatos_2_impl extends GXDataArea
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
            AV8Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Lb_TaAuxC", AV8Lb_TaAuxC);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Lb_TaAuxC, ""))));
            AV9lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9lb_TaAuxL), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9lb_TaAuxL), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Alcalis y Sulfatos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtlb_TaAuxL_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tablaalcalisysulfatos_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tablaalcalisysulfatos_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tablaalcalisysulfatos_2_impl.class ));
   }

   public tablaalcalisysulfatos_2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavEmprcod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV7EmprCod), GXutil.rtrim( localUtil.format( AV7EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLb_taauxc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavLb_taauxc_Internalname, httpContext.getMessage( "Codigo Tabla Auxiliares", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_taauxc_Internalname, GXutil.rtrim( AV8Lb_TaAuxC), GXutil.rtrim( localUtil.format( AV8Lb_TaAuxC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_taauxc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_taauxc_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0037"+"", GXutil.rtrim( WebComp_Wctablaalcalisysulfatos_5_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0037"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWctablaalcalisysulfatos_5), GXutil.lower( WebComp_Wctablaalcalisysulfatos_5_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0037"+"");
            }
            WebComp_Wctablaalcalisysulfatos_5.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWctablaalcalisysulfatos_5), GXutil.lower( WebComp_Wctablaalcalisysulfatos_5_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtlb_TaAuxL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtlb_TaAuxL_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtlb_TaAuxL_Internalname, GXutil.ltrim( localUtil.ntoc( A6313lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6313lb_TaAuxL), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlb_TaAuxL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtlb_TaAuxL_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxCi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxCi_Internalname, httpContext.getMessage( "Valor Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxCi_Internalname, GXutil.ltrim( localUtil.ntoc( A6314Lb_TaAuxCi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxCi_Enabled!=0) ? localUtil.format( A6314Lb_TaAuxCi, "ZZZZ9.99999") : localUtil.format( A6314Lb_TaAuxCi, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxCi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxCi_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_TaAuxCf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxCf_Internalname, httpContext.getMessage( "Valor Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxCf_Internalname, GXutil.ltrim( localUtil.ntoc( A6315Lb_TaAuxCf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_TaAuxCf_Enabled!=0) ? localUtil.format( A6315Lb_TaAuxCf, "ZZZZ9.99999") : localUtil.format( A6315Lb_TaAuxCf, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxCf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_TaAuxCf_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV17Pgmname), GXutil.rtrim( localUtil.format( AV17Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TablaAlcalisySulfatos_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
            {
               WebComp_Wctablaalcalisysulfatos_5.componentstart();
            }
         }
      }
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
      e111SP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
            Z6313lb_TaAuxL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6313lb_TaAuxL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6314Lb_TaAuxCi = localUtil.ctond( httpContext.cgiGet( "Z6314Lb_TaAuxCi")) ;
            Z6315Lb_TaAuxCf = localUtil.ctond( httpContext.cgiGet( "Z6315Lb_TaAuxCf")) ;
            Z6311Lb_TaAuxD = httpContext.cgiGet( "Z6311Lb_TaAuxD") ;
            Z6596Lb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6596Lb_TaAuxf1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6597Lb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6597Lb_TaAuxf2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6598Lb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6598Lb_TaAuxf3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6311Lb_TaAuxD = httpContext.cgiGet( "Z6311Lb_TaAuxD") ;
            A6596Lb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6596Lb_TaAuxf1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6597Lb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6597Lb_TaAuxf2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6598Lb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6598Lb_TaAuxf3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6312lb_TaAuxUL = (short)(localUtil.ctol( httpContext.cgiGet( "O6312lb_TaAuxUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A6310Lb_TaAuxC = httpContext.cgiGet( "LB_TAAUXC") ;
            A6311Lb_TaAuxD = httpContext.cgiGet( "LB_TAAUXD") ;
            A13756Lb_TaAuxCD = httpContext.cgiGet( "LB_TAAUXCD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV9lb_TaAuxL = (short)(localUtil.ctol( httpContext.cgiGet( "vLB_TAAUXL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6312lb_TaAuxUL = (short)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A6596Lb_TaAuxf1 = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXF1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6597Lb_TaAuxf2 = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXF2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6598Lb_TaAuxf3 = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_TAAUXF3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            /* Read variables values. */
            AV7EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8Lb_TaAuxC = httpContext.cgiGet( edtavLb_taauxc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Lb_TaAuxC", AV8Lb_TaAuxC);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Lb_TaAuxC, ""))));
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
            AV17Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\tablaalcalisysulfatos_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
               A6313lb_TaAuxL = (short)(GXutil.lval( httpContext.GetPar( "lb_TaAuxL"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV9lb_TaAuxL) )
               {
                  A6313lb_TaAuxL = AV9lb_TaAuxL ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
               }
               else
               {
                  if ( isIns( )  && ( Gx_BScreen == 1 ) )
                  {
                     A6313lb_TaAuxL = A6312lb_TaAuxUL ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
                  }
               }
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
                  if ( ! (0==AV9lb_TaAuxL) )
                  {
                     A6313lb_TaAuxL = AV9lb_TaAuxL ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
                  }
                  else
                  {
                     if ( isIns( )  && ( Gx_BScreen == 1 ) )
                     {
                        A6313lb_TaAuxL = A6312lb_TaAuxUL ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
                     }
                  }
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
                        confirm_1SP0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_TAAUXL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtlb_TaAuxL_Internalname ;
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
                        e111SP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SP2 ();
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
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 37 )
                  {
                     OldWctablaalcalisysulfatos_5 = httpContext.cgiGet( "W0037") ;
                     if ( ( GXutil.len( OldWctablaalcalisysulfatos_5) == 0 ) || ( GXutil.strcmp(OldWctablaalcalisysulfatos_5, WebComp_Wctablaalcalisysulfatos_5_Component) != 0 ) )
                     {
                        WebComp_Wctablaalcalisysulfatos_5 = WebUtils.getWebComponent(getClass(), "app." + OldWctablaalcalisysulfatos_5 + "_impl", remoteHandle, context);
                        WebComp_Wctablaalcalisysulfatos_5_Component = OldWctablaalcalisysulfatos_5 ;
                     }
                     if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
                     {
                        WebComp_Wctablaalcalisysulfatos_5.componentprocess("W0037", "", sEvt);
                     }
                     WebComp_Wctablaalcalisysulfatos_5_Component = OldWctablaalcalisysulfatos_5 ;
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
         e121SP2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SP919( ) ;
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
         disableAttributes1SP919( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxc_Enabled), 5, 0), true);
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

   public void confirm_1SP0( )
   {
      beforeValidate1SP919( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SP919( ) ;
         }
         else
         {
            checkExtendedTable1SP919( ) ;
            closeExtendedTableCursors1SP919( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SP0( )
   {
   }

   public void e111SP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tablaalcalisysulfatos_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tablaalcalisysulfatos_2_impl.this.A396EmprCod = GXv_char2[0] ;
      tablaalcalisysulfatos_2_impl.this.AV14EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_2_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tablaalcalisysulfatos_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      tablaalcalisysulfatos_2_impl.this.AV7EmprCod = GXv_char4[0] ;
      tablaalcalisysulfatos_2_impl.this.AV14EmprNom = GXv_char3[0] ;
      tablaalcalisysulfatos_2_impl.this.AV15UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wctablaalcalisysulfatos_5 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wctablaalcalisysulfatos_5_Component), GXutil.lower( "GestionLaboratorio.TablaAlcalisySulfatos_5")) != 0 )
      {
         WebComp_Wctablaalcalisysulfatos_5 = WebUtils.getWebComponent(getClass(), "app.gestionlaboratorio.tablaalcalisysulfatos_5_impl", remoteHandle, context);
         WebComp_Wctablaalcalisysulfatos_5_Component = "GestionLaboratorio.TablaAlcalisySulfatos_5" ;
      }
      if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
      {
         WebComp_Wctablaalcalisysulfatos_5.setjustcreated();
         WebComp_Wctablaalcalisysulfatos_5.componentprepare(new Object[] {"W0037","",AV7EmprCod,AV8Lb_TaAuxC});
         WebComp_Wctablaalcalisysulfatos_5.componentbind(new Object[] {"vEMPRCOD","vLB_TAAUXC"});
      }
   }

   public void e121SP2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         httpContext.popup(formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A6310Lb_TaAuxC)),GXutil.URLEncode(GXutil.ltrimstr(A6313lb_TaAuxL,4,0)),GXutil.URLEncode(GXutil.rtrim(A6311Lb_TaAuxD)),GXutil.URLEncode(DecimalUtil.decToString(A6314Lb_TaAuxCi)),GXutil.URLEncode(DecimalUtil.decToString(A6315Lb_TaAuxCf))}, new String[] {"Mode","EmprCod","Lb_TaAuxC","lb_TaAuxL","Lb_TaAuxD","Lb_TaAuxCi","Lb_TaAuxCf"}) , new Object[] {"A6311Lb_TaAuxD","A6314Lb_TaAuxCi","A6315Lb_TaAuxCf"});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm1SP919( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6314Lb_TaAuxCi = T01SP3_A6314Lb_TaAuxCi[0] ;
            Z6315Lb_TaAuxCf = T01SP3_A6315Lb_TaAuxCf[0] ;
         }
         else
         {
            Z6314Lb_TaAuxCi = A6314Lb_TaAuxCi ;
            Z6315Lb_TaAuxCf = A6315Lb_TaAuxCf ;
         }
      }
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z6311Lb_TaAuxD = T01SP6_A6311Lb_TaAuxD[0] ;
         Z6596Lb_TaAuxf1 = T01SP6_A6596Lb_TaAuxf1[0] ;
         Z6597Lb_TaAuxf2 = T01SP6_A6597Lb_TaAuxf2[0] ;
         Z6598Lb_TaAuxf3 = T01SP6_A6598Lb_TaAuxf3[0] ;
      }
      if ( GX_JID == -10 )
      {
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         Z6314Lb_TaAuxCi = A6314Lb_TaAuxCi ;
         Z6315Lb_TaAuxCf = A6315Lb_TaAuxCf ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z407EmprNom = A407EmprNom ;
         Z6312lb_TaAuxUL = A6312lb_TaAuxUL ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
         Z6596Lb_TaAuxf1 = A6596Lb_TaAuxf1 ;
         Z6597Lb_TaAuxf2 = A6597Lb_TaAuxf2 ;
         Z6598Lb_TaAuxf3 = A6598Lb_TaAuxf3 ;
      }
   }

   public void standaloneNotModal( )
   {
      AV17Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SP4_A407EmprNom[0] ;
      n407EmprNom = T01SP4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV8Lb_TaAuxC)==0) )
      {
         A6310Lb_TaAuxC = AV8Lb_TaAuxC ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      /* Using cursor T01SP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      zm1SP919( 12) ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
         AnyError = (short)(1) ;
      }
      A6312lb_TaAuxUL = T01SP6_A6312lb_TaAuxUL[0] ;
      A6311Lb_TaAuxD = T01SP6_A6311Lb_TaAuxD[0] ;
      A6596Lb_TaAuxf1 = T01SP6_A6596Lb_TaAuxf1[0] ;
      A6597Lb_TaAuxf2 = T01SP6_A6597Lb_TaAuxf2[0] ;
      A6598Lb_TaAuxf3 = T01SP6_A6598Lb_TaAuxf3[0] ;
      O6312lb_TaAuxUL = A6312lb_TaAuxUL ;
      httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
      pr_default.close(3);
      A13756Lb_TaAuxCD = GXutil.trim( A6310Lb_TaAuxC) + "-" + GXutil.trim( A6311Lb_TaAuxD) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13756Lb_TaAuxCD", A13756Lb_TaAuxCD);
      if ( ! (0==AV9lb_TaAuxL) )
      {
         edtlb_TaAuxL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
      else
      {
         edtlb_TaAuxL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9lb_TaAuxL) )
      {
         edtlb_TaAuxL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         A6312lb_TaAuxUL = (short)(O6312lb_TaAuxUL+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
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
      if ( ! (0==AV9lb_TaAuxL) )
      {
         A6313lb_TaAuxL = AV9lb_TaAuxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
      else
      {
         if ( isIns( )  && ( Gx_BScreen == 1 ) )
         {
            A6313lb_TaAuxL = A6312lb_TaAuxUL ;
            httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
         }
      }
   }

   public void load1SP919( )
   {
      /* Using cursor T01SP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A6312lb_TaAuxUL = T01SP7_A6312lb_TaAuxUL[0] ;
         A407EmprNom = T01SP7_A407EmprNom[0] ;
         n407EmprNom = T01SP7_n407EmprNom[0] ;
         A6311Lb_TaAuxD = T01SP7_A6311Lb_TaAuxD[0] ;
         A6596Lb_TaAuxf1 = T01SP7_A6596Lb_TaAuxf1[0] ;
         A6597Lb_TaAuxf2 = T01SP7_A6597Lb_TaAuxf2[0] ;
         A6598Lb_TaAuxf3 = T01SP7_A6598Lb_TaAuxf3[0] ;
         A6314Lb_TaAuxCi = T01SP7_A6314Lb_TaAuxCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
         A6315Lb_TaAuxCf = T01SP7_A6315Lb_TaAuxCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
         zm1SP919( -10) ;
      }
      pr_default.close(5);
      onLoadActions1SP919( ) ;
   }

   public void onLoadActions1SP919( )
   {
      O6312lb_TaAuxUL = A6312lb_TaAuxUL ;
      httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
   }

   public void checkExtendedTable1SP919( )
   {
      nIsDirty_919 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1SP919( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1SP919( )
   {
      /* Using cursor T01SP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound919 = (short)(1) ;
      }
      else
      {
         RcdFound919 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01SP3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SP919( 10) ;
         RcdFound919 = (short)(1) ;
         A6313lb_TaAuxL = T01SP3_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
         A6314Lb_TaAuxCi = T01SP3_A6314Lb_TaAuxCi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
         A6315Lb_TaAuxCf = T01SP3_A6315Lb_TaAuxCf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
         A6310Lb_TaAuxC = T01SP3_A6310Lb_TaAuxC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z6313lb_TaAuxL = A6313lb_TaAuxL ;
         sMode919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SP919( ) ;
         if ( AnyError == 1 )
         {
            RcdFound919 = (short)(0) ;
            initializeNonKey1SP919( ) ;
         }
         Gx_mode = sMode919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound919 = (short)(0) ;
         initializeNonKey1SP919( ) ;
         sMode919 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode919 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SP919( ) ;
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
      /* Using cursor T01SP9 */
      pr_default.execute(7, new Object[] {A6310Lb_TaAuxC, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01SP9_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) || ( GXutil.strcmp(T01SP9_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SP9_A6313lb_TaAuxL[0] < A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SP9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01SP9_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) || ( GXutil.strcmp(T01SP9_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SP9_A6313lb_TaAuxL[0] > A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SP9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SP9_A6310Lb_TaAuxC[0] ;
            A6313lb_TaAuxL = T01SP9_A6313lb_TaAuxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            RcdFound919 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound919 = (short)(0) ;
      /* Using cursor T01SP10 */
      pr_default.execute(8, new Object[] {A6310Lb_TaAuxC, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SP10_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) > 0 ) || ( GXutil.strcmp(T01SP10_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SP10_A6313lb_TaAuxL[0] > A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SP10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SP10_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) < 0 ) || ( GXutil.strcmp(T01SP10_A6310Lb_TaAuxC[0], A6310Lb_TaAuxC) == 0 ) && ( T01SP10_A6313lb_TaAuxL[0] < A6313lb_TaAuxL ) ) && ( GXutil.strcmp(T01SP10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A6310Lb_TaAuxC = T01SP10_A6310Lb_TaAuxC[0] ;
            A6313lb_TaAuxL = T01SP10_A6313lb_TaAuxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
            RcdFound919 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SP919( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtlb_TaAuxL_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SP919( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_TAAUXL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtlb_TaAuxL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtlb_TaAuxL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SP919( ) ;
               GX_FocusControl = edtlb_TaAuxL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6310Lb_TaAuxC, Z6310Lb_TaAuxC) != 0 ) || ( A6313lb_TaAuxL != Z6313lb_TaAuxL ) )
            {
               /* Insert record */
               GX_FocusControl = edtlb_TaAuxL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SP919( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_TAAUXL");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtlb_TaAuxL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtlb_TaAuxL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SP919( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_TAAUXL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtlb_TaAuxL_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtlb_TaAuxL_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SP919( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS008"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6314Lb_TaAuxCi, T01SP2_A6314Lb_TaAuxCi[0]) != 0 ) || ( DecimalUtil.compareTo(Z6315Lb_TaAuxCf, T01SP2_A6315Lb_TaAuxCf[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6314Lb_TaAuxCi, T01SP2_A6314Lb_TaAuxCi[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxCi");
               GXutil.writeLogRaw("Old: ",Z6314Lb_TaAuxCi);
               GXutil.writeLogRaw("Current: ",T01SP2_A6314Lb_TaAuxCi[0]);
            }
            if ( DecimalUtil.compareTo(Z6315Lb_TaAuxCf, T01SP2_A6315Lb_TaAuxCf[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxCf");
               GXutil.writeLogRaw("Old: ",Z6315Lb_TaAuxCf);
               GXutil.writeLogRaw("Current: ",T01SP2_A6315Lb_TaAuxCf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS008"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01SP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(9) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS005"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z6311Lb_TaAuxD, T01SP11_A6311Lb_TaAuxD[0]) != 0 ) || ( Z6596Lb_TaAuxf1 != T01SP11_A6596Lb_TaAuxf1[0] ) || ( Z6597Lb_TaAuxf2 != T01SP11_A6597Lb_TaAuxf2[0] ) || ( Z6598Lb_TaAuxf3 != T01SP11_A6598Lb_TaAuxf3[0] ) )
         {
            if ( GXutil.strcmp(Z6311Lb_TaAuxD, T01SP11_A6311Lb_TaAuxD[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxD");
               GXutil.writeLogRaw("Old: ",Z6311Lb_TaAuxD);
               GXutil.writeLogRaw("Current: ",T01SP11_A6311Lb_TaAuxD[0]);
            }
            if ( Z6596Lb_TaAuxf1 != T01SP11_A6596Lb_TaAuxf1[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxf1");
               GXutil.writeLogRaw("Old: ",Z6596Lb_TaAuxf1);
               GXutil.writeLogRaw("Current: ",T01SP11_A6596Lb_TaAuxf1[0]);
            }
            if ( Z6597Lb_TaAuxf2 != T01SP11_A6597Lb_TaAuxf2[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxf2");
               GXutil.writeLogRaw("Old: ",Z6597Lb_TaAuxf2);
               GXutil.writeLogRaw("Current: ",T01SP11_A6597Lb_TaAuxf2[0]);
            }
            if ( Z6598Lb_TaAuxf3 != T01SP11_A6598Lb_TaAuxf3[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tablaalcalisysulfatos_2:[seudo value changed for attri]"+"Lb_TaAuxf3");
               GXutil.writeLogRaw("Old: ",Z6598Lb_TaAuxf3);
               GXutil.writeLogRaw("Current: ",T01SP11_A6598Lb_TaAuxf3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS005"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SP919( )
   {
      beforeValidate1SP919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SP919( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SP919( 0) ;
         checkOptimisticConcurrency1SP919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SP919( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SP919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SP12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A6313lb_TaAuxL), A6314Lb_TaAuxCi, A6315Lb_TaAuxCf, A396EmprCod, A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SP919( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1SP0( ) ;
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
            load1SP919( ) ;
         }
         endLevel1SP919( ) ;
      }
      closeExtendedTableCursors1SP919( ) ;
   }

   public void update1SP919( )
   {
      beforeValidate1SP919( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SP919( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SP919( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SP919( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SP919( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SP13 */
                  pr_default.execute(11, new Object[] {A6314Lb_TaAuxCi, A6315Lb_TaAuxCf, A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS008"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SP919( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11SP919( ) ;
                     /* Start of After( update) rules */
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
         endLevel1SP919( ) ;
      }
      closeExtendedTableCursors1SP919( ) ;
   }

   public void deferredUpdate1SP919( )
   {
   }

   public void delete( )
   {
      beforeValidate1SP919( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SP919( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SP919( ) ;
         afterConfirm1SP919( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SP919( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SP14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS008");
               if ( AnyError == 0 )
               {
                  updateTablesN11SP919( ) ;
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
      sMode919 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SP919( ) ;
      Gx_mode = sMode919 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SP919( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01SP15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void updateTablesN11SP919( )
   {
      /* Using cursor T01SP16 */
      pr_default.execute(14, new Object[] {Short.valueOf(A6312lb_TaAuxUL), A396EmprCod, A6310Lb_TaAuxC});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS005");
   }

   public void endLevel1SP919( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(9);
      if ( AnyError == 0 )
      {
         beforeComplete1SP919( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_2");
         if ( AnyError == 0 )
         {
            confirmValues1SP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tablaalcalisysulfatos_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SP919( )
   {
      /* Scan By routine */
      /* Using cursor T01SP17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound919 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A6310Lb_TaAuxC = T01SP17_A6310Lb_TaAuxC[0] ;
         A6313lb_TaAuxL = T01SP17_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SP919( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound919 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound919 = (short)(1) ;
         A6310Lb_TaAuxC = T01SP17_A6310Lb_TaAuxC[0] ;
         A6313lb_TaAuxL = T01SP17_A6313lb_TaAuxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      }
   }

   public void scanEnd1SP919( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1SP919( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SP919( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SP919( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SP919( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SP919( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SP919( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SP919( )
   {
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavLb_taauxc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLb_taauxc_Enabled), 5, 0), true);
      edtlb_TaAuxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlb_TaAuxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlb_TaAuxL_Enabled), 5, 0), true);
      edtLb_TaAuxCi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCi_Enabled), 5, 0), true);
      edtLb_TaAuxCf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxCf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxCf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SP919( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Lb_TaAuxC, ""))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SP0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8Lb_TaAuxC)),GXutil.URLEncode(GXutil.ltrimstr(AV9lb_TaAuxL,4,0))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC","lb_TaAuxL"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Lb_TaAuxC, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TablaAlcalisySulfatos_2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\tablaalcalisysulfatos_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6311Lb_TaAuxD", GXutil.rtrim( Z6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6596Lb_TaAuxf1", GXutil.ltrim( localUtil.ntoc( Z6596Lb_TaAuxf1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6597Lb_TaAuxf2", GXutil.ltrim( localUtil.ntoc( Z6597Lb_TaAuxf2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6598Lb_TaAuxf3", GXutil.ltrim( localUtil.ntoc( Z6598Lb_TaAuxf3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6312lb_TaAuxUL", GXutil.ltrim( localUtil.ntoc( O6312lb_TaAuxUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXC", GXutil.rtrim( A6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXD", GXutil.rtrim( A6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXCD", A13756Lb_TaAuxCD);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_TAAUXL", GXutil.ltrim( localUtil.ntoc( AV9lb_TaAuxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_TAAUXL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9lb_TaAuxL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXUL", GXutil.ltrim( localUtil.ntoc( A6312lb_TaAuxUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXF1", GXutil.ltrim( localUtil.ntoc( A6596Lb_TaAuxf1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXF2", GXutil.ltrim( localUtil.ntoc( A6597Lb_TaAuxf2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXF3", GXutil.ltrim( localUtil.ntoc( A6598Lb_TaAuxf3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
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
      if ( ! ( WebComp_Wctablaalcalisysulfatos_5 == null ) )
      {
         WebComp_Wctablaalcalisysulfatos_5.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
            {
               WebComp_Wctablaalcalisysulfatos_5.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
            {
               WebComp_Wctablaalcalisysulfatos_5.componentstart();
            }
         }
      }
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
      return formatLink("app.gestionlaboratorio.tablaalcalisysulfatos_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8Lb_TaAuxC)),GXutil.URLEncode(GXutil.ltrimstr(AV9lb_TaAuxL,4,0))}, new String[] {"Gx_mode","EmprCod","Lb_TaAuxC","lb_TaAuxL"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.TablaAlcalisySulfatos_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Alcalis y Sulfatos", "") ;
   }

   public void initializeNonKey1SP919( )
   {
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6314Lb_TaAuxCi", GXutil.ltrimstr( A6314Lb_TaAuxCi, 11, 5));
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6315Lb_TaAuxCf", GXutil.ltrimstr( A6315Lb_TaAuxCf, 11, 5));
      O6312lb_TaAuxUL = A6312lb_TaAuxUL ;
      httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
      Z6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      Z6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      Z6311Lb_TaAuxD = "" ;
      Z6596Lb_TaAuxf1 = (byte)(0) ;
      Z6597Lb_TaAuxf2 = (byte)(0) ;
      Z6598Lb_TaAuxf3 = (byte)(0) ;
   }

   public void initAll1SP919( )
   {
      A6310Lb_TaAuxC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      A6313lb_TaAuxL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6313lb_TaAuxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6313lb_TaAuxL), 4, 0));
      initializeNonKey1SP919( ) ;
   }

   public void standaloneModalInsert( )
   {
      A6312lb_TaAuxUL = i6312lb_TaAuxUL ;
      httpContext.ajax_rsp_assign_attri("", false, "A6312lb_TaAuxUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6312lb_TaAuxUL), 4, 0));
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wctablaalcalisysulfatos_5 == null ) )
      {
         if ( GXutil.len( WebComp_Wctablaalcalisysulfatos_5_Component) != 0 )
         {
            WebComp_Wctablaalcalisysulfatos_5.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693676", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/tablaalcalisysulfatos_2.js", "?20268211693676", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtavLb_taauxc_Internalname = "vLB_TAAUXC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtlb_TaAuxL_Internalname = "LB_TAAUXL" ;
      edtLb_TaAuxCi_Internalname = "LB_TAAUXCI" ;
      edtLb_TaAuxCf_Internalname = "LB_TAAUXCF" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Alcalis y Sulfatos", "") );
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Lineas", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtavLb_taauxc_Jsonclick = "" ;
      edtavLb_taauxc_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true},{av:'AV9lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9lb_TaAuxL',fld:'vLB_TAAUXL',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Lb_TaAuxC',fld:'vLB_TAAUXC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SP2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6313lb_TaAuxL',fld:'LB_TAAUXL',pic:'ZZZ9'},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''},{av:'A6314Lb_TaAuxCi',fld:'LB_TAAUXCI',pic:'ZZZZ9.99999'},{av:'A6315Lb_TaAuxCf',fld:'LB_TAAUXCF',pic:'ZZZZ9.99999'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A6315Lb_TaAuxCf',fld:'LB_TAAUXCF',pic:'ZZZZ9.99999'},{av:'A6314Lb_TaAuxCi',fld:'LB_TAAUXCI',pic:'ZZZZ9.99999'},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALIDV_LB_TAAUXC","{handler:'validv_Lb_taauxc',iparms:[]");
      setEventMetadata("VALIDV_LB_TAAUXC",",oparms:[]}");
      setEventMetadata("VALID_LB_TAAUXL","{handler:'valid_Lb_taauxl',iparms:[]");
      setEventMetadata("VALID_LB_TAAUXL",",oparms:[]}");
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
      pr_default.close(4);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV8Lb_TaAuxC = "" ;
      Z396EmprCod = "" ;
      Z6310Lb_TaAuxC = "" ;
      Z6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      Z6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      Z6311Lb_TaAuxD = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV8Lb_TaAuxC = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wctablaalcalisysulfatos_5_Component = "" ;
      OldWctablaalcalisysulfatos_5 = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV17Pgmname = "" ;
      A6311Lb_TaAuxD = "" ;
      A6310Lb_TaAuxC = "" ;
      A13756Lb_TaAuxCD = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode919 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV13Station = "" ;
      AV14EmprNom = "" ;
      AV15UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T01SP4_A407EmprNom = new String[] {""} ;
      T01SP4_n407EmprNom = new boolean[] {false} ;
      T01SP6_A6312lb_TaAuxUL = new short[1] ;
      T01SP6_A6311Lb_TaAuxD = new String[] {""} ;
      T01SP6_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SP6_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SP6_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SP7_A6313lb_TaAuxL = new short[1] ;
      T01SP7_A6312lb_TaAuxUL = new short[1] ;
      T01SP7_A407EmprNom = new String[] {""} ;
      T01SP7_n407EmprNom = new boolean[] {false} ;
      T01SP7_A6311Lb_TaAuxD = new String[] {""} ;
      T01SP7_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SP7_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SP7_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SP7_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP7_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP7_A396EmprCod = new String[] {""} ;
      T01SP7_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP8_A396EmprCod = new String[] {""} ;
      T01SP8_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP8_A6313lb_TaAuxL = new short[1] ;
      T01SP3_A6313lb_TaAuxL = new short[1] ;
      T01SP3_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP3_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP3_A396EmprCod = new String[] {""} ;
      T01SP3_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP9_A396EmprCod = new String[] {""} ;
      T01SP9_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP9_A6313lb_TaAuxL = new short[1] ;
      T01SP10_A396EmprCod = new String[] {""} ;
      T01SP10_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP10_A6313lb_TaAuxL = new short[1] ;
      T01SP2_A6313lb_TaAuxL = new short[1] ;
      T01SP2_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP2_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SP2_A396EmprCod = new String[] {""} ;
      T01SP2_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP11_A6312lb_TaAuxUL = new short[1] ;
      T01SP11_A6311Lb_TaAuxD = new String[] {""} ;
      T01SP11_A6596Lb_TaAuxf1 = new byte[1] ;
      T01SP11_A6597Lb_TaAuxf2 = new byte[1] ;
      T01SP11_A6598Lb_TaAuxf3 = new byte[1] ;
      T01SP15_A396EmprCod = new String[] {""} ;
      T01SP15_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP15_A6313lb_TaAuxL = new short[1] ;
      T01SP15_A6378Lb_TauxLP = new short[1] ;
      T01SP17_A396EmprCod = new String[] {""} ;
      T01SP17_A6310Lb_TaAuxC = new String[] {""} ;
      T01SP17_A6313lb_TaAuxL = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_2__default(),
         new Object[] {
             new Object[] {
            T01SP2_A6313lb_TaAuxL, T01SP2_A6314Lb_TaAuxCi, T01SP2_A6315Lb_TaAuxCf, T01SP2_A396EmprCod, T01SP2_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SP3_A6313lb_TaAuxL, T01SP3_A6314Lb_TaAuxCi, T01SP3_A6315Lb_TaAuxCf, T01SP3_A396EmprCod, T01SP3_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SP4_A407EmprNom, T01SP4_n407EmprNom
            }
            , new Object[] {
            T01SP5_A6312lb_TaAuxUL, T01SP5_A6311Lb_TaAuxD, T01SP5_A6596Lb_TaAuxf1, T01SP5_A6597Lb_TaAuxf2, T01SP5_A6598Lb_TaAuxf3
            }
            , new Object[] {
            T01SP6_A6312lb_TaAuxUL, T01SP6_A6311Lb_TaAuxD, T01SP6_A6596Lb_TaAuxf1, T01SP6_A6597Lb_TaAuxf2, T01SP6_A6598Lb_TaAuxf3
            }
            , new Object[] {
            T01SP7_A6313lb_TaAuxL, T01SP7_A6312lb_TaAuxUL, T01SP7_A407EmprNom, T01SP7_n407EmprNom, T01SP7_A6311Lb_TaAuxD, T01SP7_A6596Lb_TaAuxf1, T01SP7_A6597Lb_TaAuxf2, T01SP7_A6598Lb_TaAuxf3, T01SP7_A6314Lb_TaAuxCi, T01SP7_A6315Lb_TaAuxCf,
            T01SP7_A396EmprCod, T01SP7_A6310Lb_TaAuxC
            }
            , new Object[] {
            T01SP8_A396EmprCod, T01SP8_A6310Lb_TaAuxC, T01SP8_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SP9_A396EmprCod, T01SP9_A6310Lb_TaAuxC, T01SP9_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SP10_A396EmprCod, T01SP10_A6310Lb_TaAuxC, T01SP10_A6313lb_TaAuxL
            }
            , new Object[] {
            T01SP11_A6312lb_TaAuxUL, T01SP11_A6311Lb_TaAuxD, T01SP11_A6596Lb_TaAuxf1, T01SP11_A6597Lb_TaAuxf2, T01SP11_A6598Lb_TaAuxf3
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SP15_A396EmprCod, T01SP15_A6310Lb_TaAuxC, T01SP15_A6313lb_TaAuxL, T01SP15_A6378Lb_TauxLP
            }
            , new Object[] {
            }
            , new Object[] {
            T01SP17_A396EmprCod, T01SP17_A6310Lb_TaAuxC, T01SP17_A6313lb_TaAuxL
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV17Pgmname = "GestionLaboratorio.TablaAlcalisySulfatos_2" ;
      WebComp_Wctablaalcalisysulfatos_5 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte Z6596Lb_TaAuxf1 ;
   private byte Z6597Lb_TaAuxf2 ;
   private byte Z6598Lb_TaAuxf3 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6596Lb_TaAuxf1 ;
   private byte A6597Lb_TaAuxf2 ;
   private byte A6598Lb_TaAuxf3 ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9lb_TaAuxL ;
   private short Z6313lb_TaAuxL ;
   private short O6312lb_TaAuxUL ;
   private short AV9lb_TaAuxL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6313lb_TaAuxL ;
   private short A6312lb_TaAuxUL ;
   private short RcdFound919 ;
   private short nCmpId ;
   private short Z6312lb_TaAuxUL ;
   private short nIsDirty_919 ;
   private short i6312lb_TaAuxUL ;
   private int trnEnded ;
   private int edtavEmprcod_Enabled ;
   private int edtavLb_taauxc_Enabled ;
   private int edtlb_TaAuxL_Enabled ;
   private int edtLb_TaAuxCi_Enabled ;
   private int edtLb_TaAuxCf_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z6314Lb_TaAuxCi ;
   private java.math.BigDecimal Z6315Lb_TaAuxCf ;
   private java.math.BigDecimal A6314Lb_TaAuxCi ;
   private java.math.BigDecimal A6315Lb_TaAuxCf ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8Lb_TaAuxC ;
   private String Z396EmprCod ;
   private String Z6310Lb_TaAuxC ;
   private String Z6311Lb_TaAuxD ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV8Lb_TaAuxC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtlb_TaAuxL_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavLb_taauxc_Internalname ;
   private String edtavLb_taauxc_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wctablaalcalisysulfatos_5_Component ;
   private String OldWctablaalcalisysulfatos_5 ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtlb_TaAuxL_Jsonclick ;
   private String edtLb_TaAuxCi_Internalname ;
   private String edtLb_TaAuxCi_Jsonclick ;
   private String edtLb_TaAuxCf_Internalname ;
   private String edtLb_TaAuxCf_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV17Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A6311Lb_TaAuxD ;
   private String A6310Lb_TaAuxC ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String hsh ;
   private String sMode919 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV13Station ;
   private String AV14EmprNom ;
   private String AV15UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wctablaalcalisysulfatos_5 ;
   private String A13756Lb_TaAuxCD ;
   private GXWebComponent WebComp_Wctablaalcalisysulfatos_5 ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SP4_A407EmprNom ;
   private boolean[] T01SP4_n407EmprNom ;
   private short[] T01SP6_A6312lb_TaAuxUL ;
   private String[] T01SP6_A6311Lb_TaAuxD ;
   private byte[] T01SP6_A6596Lb_TaAuxf1 ;
   private byte[] T01SP6_A6597Lb_TaAuxf2 ;
   private byte[] T01SP6_A6598Lb_TaAuxf3 ;
   private short[] T01SP7_A6313lb_TaAuxL ;
   private short[] T01SP7_A6312lb_TaAuxUL ;
   private String[] T01SP7_A407EmprNom ;
   private boolean[] T01SP7_n407EmprNom ;
   private String[] T01SP7_A6311Lb_TaAuxD ;
   private byte[] T01SP7_A6596Lb_TaAuxf1 ;
   private byte[] T01SP7_A6597Lb_TaAuxf2 ;
   private byte[] T01SP7_A6598Lb_TaAuxf3 ;
   private java.math.BigDecimal[] T01SP7_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SP7_A6315Lb_TaAuxCf ;
   private String[] T01SP7_A396EmprCod ;
   private String[] T01SP7_A6310Lb_TaAuxC ;
   private String[] T01SP8_A396EmprCod ;
   private String[] T01SP8_A6310Lb_TaAuxC ;
   private short[] T01SP8_A6313lb_TaAuxL ;
   private short[] T01SP3_A6313lb_TaAuxL ;
   private java.math.BigDecimal[] T01SP3_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SP3_A6315Lb_TaAuxCf ;
   private String[] T01SP3_A396EmprCod ;
   private String[] T01SP3_A6310Lb_TaAuxC ;
   private String[] T01SP9_A396EmprCod ;
   private String[] T01SP9_A6310Lb_TaAuxC ;
   private short[] T01SP9_A6313lb_TaAuxL ;
   private String[] T01SP10_A396EmprCod ;
   private String[] T01SP10_A6310Lb_TaAuxC ;
   private short[] T01SP10_A6313lb_TaAuxL ;
   private short[] T01SP2_A6313lb_TaAuxL ;
   private java.math.BigDecimal[] T01SP2_A6314Lb_TaAuxCi ;
   private java.math.BigDecimal[] T01SP2_A6315Lb_TaAuxCf ;
   private String[] T01SP2_A396EmprCod ;
   private String[] T01SP2_A6310Lb_TaAuxC ;
   private short[] T01SP11_A6312lb_TaAuxUL ;
   private String[] T01SP11_A6311Lb_TaAuxD ;
   private byte[] T01SP11_A6596Lb_TaAuxf1 ;
   private byte[] T01SP11_A6597Lb_TaAuxf2 ;
   private byte[] T01SP11_A6598Lb_TaAuxf3 ;
   private String[] T01SP15_A396EmprCod ;
   private String[] T01SP15_A6310Lb_TaAuxC ;
   private short[] T01SP15_A6313lb_TaAuxL ;
   private short[] T01SP15_A6378Lb_TauxLP ;
   private String[] T01SP17_A396EmprCod ;
   private String[] T01SP17_A6310Lb_TaAuxC ;
   private short[] T01SP17_A6313lb_TaAuxL ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01SP5_A6312lb_TaAuxUL ;
   private String[] T01SP5_A6311Lb_TaAuxD ;
   private byte[] T01SP5_A6596Lb_TaAuxf1 ;
   private byte[] T01SP5_A6597Lb_TaAuxf2 ;
   private byte[] T01SP5_A6598Lb_TaAuxf3 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class tablaalcalisysulfatos_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tablaalcalisysulfatos_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SP2", "SELECT lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, EmprCod, Lb_TaAuxC FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?  FOR UPDATE OF Lb_TaAuxCi, Lb_TaAuxCf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP3", "SELECT lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, EmprCod, Lb_TaAuxC FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP5", "SELECT lb_TaAuxUL, Lb_TaAuxD, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3 FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ?  FOR UPDATE OF lb_TaAuxUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP6", "SELECT lb_TaAuxUL, Lb_TaAuxD, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3 FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP7", "SELECT /*+ FIRST_ROWS(100) */ TM1.lb_TaAuxL, T3.lb_TaAuxUL, T2.EmprNom, T3.Lb_TaAuxD, T3.Lb_TaAuxf1, T3.Lb_TaAuxf2, T3.Lb_TaAuxf3, TM1.Lb_TaAuxCi, TM1.Lb_TaAuxCf, TM1.EmprCod, TM1.Lb_TaAuxC FROM ((TXPENS008 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPENS005 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Lb_TaAuxC = TM1.Lb_TaAuxC) WHERE TM1.EmprCod = ? and TM1.Lb_TaAuxC = ? and TM1.lb_TaAuxL = ? ORDER BY TM1.EmprCod, TM1.Lb_TaAuxC, TM1.lb_TaAuxL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SP9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE ( Lb_TaAuxC > ? or Lb_TaAuxC = ? and lb_TaAuxL > ?) and EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SP10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE ( Lb_TaAuxC < ? or Lb_TaAuxC = ? and lb_TaAuxL < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_TaAuxC DESC, lb_TaAuxL DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SP11", "SELECT lb_TaAuxUL, Lb_TaAuxD, Lb_TaAuxf1, Lb_TaAuxf2, Lb_TaAuxf3 FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ?  FOR UPDATE OF lb_TaAuxUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SP12", "INSERT INTO TXPENS008(lb_TaAuxL, Lb_TaAuxCi, Lb_TaAuxCf, EmprCod, Lb_TaAuxC, Lb_TaAuxUP) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPENS008")
         ,new UpdateCursor("T01SP13", "UPDATE TXPENS008 SET Lb_TaAuxCi=?, Lb_TaAuxCf=?  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK, "TXPENS008")
         ,new UpdateCursor("T01SP14", "DELETE FROM TXPENS008  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?", GX_NOMASK, "TXPENS008")
         ,new ForEachCursor("T01SP15", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SP16", "UPDATE TXPENS005 SET lb_TaAuxUL=?  WHERE EmprCod = ? AND Lb_TaAuxC = ?", GX_NOMASK, "TXPENS005")
         ,new ForEachCursor("T01SP17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_TaAuxC, lb_TaAuxL FROM TXPENS008 WHERE EmprCod = ? ORDER BY EmprCod, Lb_TaAuxC, lb_TaAuxL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
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
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 4);
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 4);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

