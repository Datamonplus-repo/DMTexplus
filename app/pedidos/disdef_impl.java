package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disdef_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         n833TipDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A833TipDefCod) ;
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
            AV8DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
            AV9TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9TipDefCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPDEFCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9TipDefCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Defecto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public disdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disdef_impl.class ));
   }

   public disdef_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablepedido_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablepedido_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
      ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
      ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
      ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
      ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
      ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
      ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
      ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
      ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
      ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
      ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Disp Int</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisFec_Internalname, httpContext.getMessage( "Fecha Generación Pedido", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisDef.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisDef.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletipdefcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_tipdefcod.setProperty("Caption", Combo_tipdefcod_Caption);
      ucCombo_tipdefcod.setProperty("Cls", Combo_tipdefcod_Cls);
      ucCombo_tipdefcod.setProperty("EmptyItem", Combo_tipdefcod_Emptyitem);
      ucCombo_tipdefcod.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
      ucCombo_tipdefcod.setProperty("DropDownOptionsData", AV13TipDefCod_Data);
      ucCombo_tipdefcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipdefcod_Internalname, "COMBO_TIPDEFCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDefCod_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTipDefCod_Visible, edtTipDefCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDefPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDefPor_Internalname, httpContext.getMessage( "% defecto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDefPor_Internalname, GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDefPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDefPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDefPor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisDef.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV18Pgmname), GXutil.rtrim( localUtil.format( AV18Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisDef.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_tipdefcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotipdefcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15ComboTipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15ComboTipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15ComboTipDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotipdefcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotipdefcod_Visible, edtavCombotipdefcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisDef.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc), GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDefDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtTipDefDsc_Visible, edtTipDefDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisDef.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisDef.htm");
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
      e111TM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPDEFCOD_DATA"), AV13TipDefCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z833TipDefCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( "Z319DefPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPDEFCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A335DisArtCod = httpContext.cgiGet( "DISARTCOD") ;
            Dvpanel_tablepedido_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Objectcall") ;
            Dvpanel_tablepedido_Class = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Class") ;
            Dvpanel_tablepedido_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Enabled")) ;
            Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
            Dvpanel_tablepedido_Height = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Height") ;
            Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
            Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
            Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
            Dvpanel_tablepedido_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showheader")) ;
            Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
            Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
            Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
            Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
            Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
            Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
            Dvpanel_tablepedido_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Visible")) ;
            Combo_tipdefcod_Objectcall = httpContext.cgiGet( "COMBO_TIPDEFCOD_Objectcall") ;
            Combo_tipdefcod_Class = httpContext.cgiGet( "COMBO_TIPDEFCOD_Class") ;
            Combo_tipdefcod_Icontype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Icontype") ;
            Combo_tipdefcod_Icon = httpContext.cgiGet( "COMBO_TIPDEFCOD_Icon") ;
            Combo_tipdefcod_Caption = httpContext.cgiGet( "COMBO_TIPDEFCOD_Caption") ;
            Combo_tipdefcod_Tooltip = httpContext.cgiGet( "COMBO_TIPDEFCOD_Tooltip") ;
            Combo_tipdefcod_Cls = httpContext.cgiGet( "COMBO_TIPDEFCOD_Cls") ;
            Combo_tipdefcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedvalue_set") ;
            Combo_tipdefcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedvalue_get") ;
            Combo_tipdefcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedtext_set") ;
            Combo_tipdefcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedtext_get") ;
            Combo_tipdefcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPDEFCOD_Gamoauthtoken") ;
            Combo_tipdefcod_Ddointernalname = httpContext.cgiGet( "COMBO_TIPDEFCOD_Ddointernalname") ;
            Combo_tipdefcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPDEFCOD_Titlecontrolalign") ;
            Combo_tipdefcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Dropdownoptionstype") ;
            Combo_tipdefcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Enabled")) ;
            Combo_tipdefcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Visible")) ;
            Combo_tipdefcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPDEFCOD_Titlecontrolidtoreplace") ;
            Combo_tipdefcod_Datalisttype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalisttype") ;
            Combo_tipdefcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Allowmultipleselection")) ;
            Combo_tipdefcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistfixedvalues") ;
            Combo_tipdefcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Isgriditem")) ;
            Combo_tipdefcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Hasdescription")) ;
            Combo_tipdefcod_Datalistproc = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistproc") ;
            Combo_tipdefcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistprocparametersprefix") ;
            Combo_tipdefcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPDEFCOD_Remoteservicesparameters") ;
            Combo_tipdefcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipdefcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeonlyselectedoption")) ;
            Combo_tipdefcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeselectalloption")) ;
            Combo_tipdefcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Emptyitem")) ;
            Combo_tipdefcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeaddnewoption")) ;
            Combo_tipdefcod_Htmltemplate = httpContext.cgiGet( "COMBO_TIPDEFCOD_Htmltemplate") ;
            Combo_tipdefcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Multiplevaluestype") ;
            Combo_tipdefcod_Loadingdata = httpContext.cgiGet( "COMBO_TIPDEFCOD_Loadingdata") ;
            Combo_tipdefcod_Noresultsfound = httpContext.cgiGet( "COMBO_TIPDEFCOD_Noresultsfound") ;
            Combo_tipdefcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Emptyitemtext") ;
            Combo_tipdefcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPDEFCOD_Onlyselectedvalues") ;
            Combo_tipdefcod_Selectalltext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectalltext") ;
            Combo_tipdefcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPDEFCOD_Multiplevaluesseparator") ;
            Combo_tipdefcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Addnewoptiontext") ;
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
            /* Read variables values. */
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDEFCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A833TipDefCod = (short)(0) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            }
            else
            {
               A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEFPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDefPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A319DefPor = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A319DefPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A319DefPor), 3, 0));
            }
            else
            {
               A319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A319DefPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A319DefPor), 3, 0));
            }
            AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
            AV15ComboTipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ComboTipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ComboTipDefCod), 4, 0));
            A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
            n834TipDefDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisDef");
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A833TipDefCod != Z833TipDefCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disdef:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
                  sMode37 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode37 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound37 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TM0( ) ;
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
                        e111TM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TM2 ();
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
         e121TM2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TM37( ) ;
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
         disableAttributes1TM37( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipdefcod_Enabled), 5, 0), true);
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

   public void confirm_1TM0( )
   {
      beforeValidate1TM37( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TM37( ) ;
         }
         else
         {
            checkExtendedTable1TM37( ) ;
            closeExtendedTableCursors1TM37( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TM0( )
   {
   }

   public void e111TM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      disdef_impl.this.AV7EmprCod = GXv_char2[0] ;
      disdef_impl.this.AV20Emprnom = GXv_char3[0] ;
      disdef_impl.this.AV21Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Emprnom", AV20Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usurcod", AV21Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtTipDefCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Visible), 5, 0), true);
      AV15ComboTipDefCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ComboTipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ComboTipDefCod), 4, 0));
      edtavCombotipdefcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipdefcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipdefcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTIPDEFCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      edtTipDefDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121TM2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOTIPDEFCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV13TipDefCod_Data ;
      GXv_char4[0] = AV14ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.pedidos.disdefloaddvcombo(remoteHandle, context).execute( "TipDefCod", Gx_mode, AV7EmprCod, AV8DisCod, AV9TipDefCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      disdef_impl.this.AV14ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV13TipDefCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_tipdefcod_Selectedvalue_set = AV14ComboSelectedValue ;
      ucCombo_tipdefcod.sendProperty(context, "", false, Combo_tipdefcod_Internalname, "SelectedValue_set", Combo_tipdefcod_Selectedvalue_set);
      AV15ComboTipDefCod = (short)(GXutil.lval( AV14ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ComboTipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ComboTipDefCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ! (0==AV9TipDefCod) )
      {
         Combo_tipdefcod_Enabled = false ;
         ucCombo_tipdefcod.sendProperty(context, "", false, Combo_tipdefcod_Internalname, "Enabled", GXutil.booltostr( Combo_tipdefcod_Enabled));
      }
   }

   public void zm1TM37( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z319DefPor = T01TM3_A319DefPor[0] ;
         }
         else
         {
            Z319DefPor = A319DefPor ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z319DefPor = A319DefPor ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z369DisFec = A369DisFec ;
         Z335DisArtCod = A335DisArtCod ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      AV18Pgmname = "Pedidos.DisDef" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
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
      if ( ! (0==AV8DisCod) )
      {
         A361DisCod = AV8DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV9TipDefCod) )
      {
         edtTipDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipDefCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9TipDefCod) )
      {
         edtTipDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9TipDefCod) )
      {
         A833TipDefCod = AV9TipDefCod ;
         n833TipDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
      else
      {
         A833TipDefCod = AV15ComboTipDefCod ;
         n833TipDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
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
         /* Using cursor T01TM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01TM4_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A335DisArtCod = T01TM4_A335DisArtCod[0] ;
         A337DisArtDsc = T01TM4_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01TM4_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(2);
         /* Using cursor T01TM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TM6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(4);
         /* Using cursor T01TM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T01TM5_A834TipDefDsc[0] ;
         n834TipDefDsc = T01TM5_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         pr_default.close(3);
      }
   }

   public void load1TM37( )
   {
      /* Using cursor T01TM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A369DisFec = T01TM7_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A279CliNom = T01TM7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01TM7_A335DisArtCod[0] ;
         A337DisArtDsc = T01TM7_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A834TipDefDsc = T01TM7_A834TipDefDsc[0] ;
         n834TipDefDsc = T01TM7_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         A319DefPor = T01TM7_A319DefPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319DefPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A319DefPor), 3, 0));
         A252CliCod = T01TM7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1TM37( -9) ;
      }
      pr_default.close(5);
      onLoadActions1TM37( ) ;
   }

   public void onLoadActions1TM37( )
   {
   }

   public void checkExtendedTable1TM37( )
   {
      nIsDirty_37 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01TM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01TM4_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A335DisArtCod = T01TM4_A335DisArtCod[0] ;
      A337DisArtDsc = T01TM4_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A252CliCod = T01TM4_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(2);
      /* Using cursor T01TM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TM6_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T01TM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T01TM5_A834TipDefDsc[0] ;
      n834TipDefDsc = T01TM5_n834TipDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1TM37( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01TM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01TM8_A369DisFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A335DisArtCod = T01TM8_A335DisArtCod[0] ;
      A337DisArtDsc = T01TM8_A337DisArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A252CliCod = T01TM8_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A369DisFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A335DisArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A337DisArtDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TM9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_11( String A396EmprCod ,
                          short A833TipDefCod )
   {
      /* Using cursor T01TM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T01TM10_A834TipDefDsc[0] ;
      n834TipDefDsc = T01TM10_n834TipDefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1TM37( )
   {
      /* Using cursor T01TM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TM37( 9) ;
         RcdFound37 = (short)(1) ;
         A319DefPor = T01TM3_A319DefPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319DefPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A319DefPor), 3, 0));
         A396EmprCod = T01TM3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01TM3_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A833TipDefCod = T01TM3_A833TipDefCod[0] ;
         n833TipDefCod = T01TM3_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z833TipDefCod = A833TipDefCod ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TM37( ) ;
         if ( AnyError == 1 )
         {
            RcdFound37 = (short)(0) ;
            initializeNonKey1TM37( ) ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey1TM37( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TM37( ) ;
      if ( RcdFound37 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound37 = (short)(0) ;
      /* Using cursor T01TM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM12_A361DisCod[0] < A361DisCod ) || ( T01TM12_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM12_A833TipDefCod[0] < A833TipDefCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM12_A361DisCod[0] > A361DisCod ) || ( T01TM12_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01TM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM12_A833TipDefCod[0] > A833TipDefCod ) ) )
         {
            A396EmprCod = T01TM12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01TM12_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A833TipDefCod = T01TM12_A833TipDefCod[0] ;
            n833TipDefCod = T01TM12_n833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound37 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound37 = (short)(0) ;
      /* Using cursor T01TM13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM13_A361DisCod[0] > A361DisCod ) || ( T01TM13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM13_A833TipDefCod[0] > A833TipDefCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM13_A361DisCod[0] < A361DisCod ) || ( T01TM13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01TM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TM13_A833TipDefCod[0] < A833TipDefCod ) ) )
         {
            A396EmprCod = T01TM13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01TM13_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A833TipDefCod = T01TM13_A833TipDefCod[0] ;
            n833TipDefCod = T01TM13_n833TipDefCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
            RcdFound37 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TM37( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TM37( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound37 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A833TipDefCod = Z833TipDefCod ;
               n833TipDefCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TM37( ) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A833TipDefCod != Z833TipDefCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TM37( ) ;
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
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TM37( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A833TipDefCod != Z833TipDefCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A833TipDefCod = Z833TipDefCod ;
         n833TipDefCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TM37( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z319DefPor != T01TM2_A319DefPor[0] ) )
         {
            if ( Z319DefPor != T01TM2_A319DefPor[0] )
            {
               GXutil.writeLogln("pedidos.disdef:[seudo value changed for attri]"+"DefPor");
               GXutil.writeLogRaw("Old: ",Z319DefPor);
               GXutil.writeLogRaw("Current: ",T01TM2_A319DefPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISDEF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TM37( )
   {
      beforeValidate1TM37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TM37( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TM37( 0) ;
         checkOptimisticConcurrency1TM37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TM37( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TM37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TM14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A319DefPor), A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1TM0( ) ;
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
            load1TM37( ) ;
         }
         endLevel1TM37( ) ;
      }
      closeExtendedTableCursors1TM37( ) ;
   }

   public void update1TM37( )
   {
      beforeValidate1TM37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TM37( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TM37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TM37( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TM37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TM15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A319DefPor), A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TM37( ) ;
                  if ( AnyError == 0 )
                  {
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
         endLevel1TM37( ) ;
      }
      closeExtendedTableCursors1TM37( ) ;
   }

   public void deferredUpdate1TM37( )
   {
   }

   public void delete( )
   {
      beforeValidate1TM37( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TM37( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TM37( ) ;
         afterConfirm1TM37( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TM37( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TM16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
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
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TM37( ) ;
      Gx_mode = sMode37 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TM37( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TM17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01TM17_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A335DisArtCod = T01TM17_A335DisArtCod[0] ;
         A337DisArtDsc = T01TM17_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A252CliCod = T01TM17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(15);
         /* Using cursor T01TM18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TM18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01TM19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T01TM19_A834TipDefDsc[0] ;
         n834TipDefDsc = T01TM19_n834TipDefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TM20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel1TM37( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TM37( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disdef");
         if ( AnyError == 0 )
         {
            confirmValues1TM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TM37( )
   {
      /* Scan By routine */
      /* Using cursor T01TM21 */
      pr_default.execute(19);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A396EmprCod = T01TM21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01TM21_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A833TipDefCod = T01TM21_A833TipDefCod[0] ;
         n833TipDefCod = T01TM21_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TM37( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A396EmprCod = T01TM21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01TM21_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A833TipDefCod = T01TM21_A833TipDefCod[0] ;
         n833TipDefCod = T01TM21_n833TipDefCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      }
   }

   public void scanEnd1TM37( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1TM37( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TM37( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TM37( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TM37( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TM37( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TM37( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TM37( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), true);
      edtDefPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefPor_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombotipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotipdefcod_Enabled), 5, 0), true);
      edtTipDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TM37( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TM0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9TipDefCod,4,0))}, new String[] {"Gx_mode","EmprCod","DisCod","TipDefCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DisDef");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disdef:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z833TipDefCod", GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z319DefPor", GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPDEFCOD_DATA", AV13TipDefCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPDEFCOD_DATA", AV13TipDefCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV9TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPDEFCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9TipDefCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Objectcall", GXutil.rtrim( Dvpanel_tablepedido_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Enabled", GXutil.booltostr( Dvpanel_tablepedido_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Objectcall", GXutil.rtrim( Combo_tipdefcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Cls", GXutil.rtrim( Combo_tipdefcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipdefcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Enabled", GXutil.booltostr( Combo_tipdefcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Emptyitem", GXutil.booltostr( Combo_tipdefcod_Emptyitem));
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
      return formatLink("app.pedidos.disdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9TipDefCod,4,0))}, new String[] {"Gx_mode","EmprCod","DisCod","TipDefCod"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisDef" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Defecto", "") ;
   }

   public void initializeNonKey1TM37( )
   {
      A369DisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      A319DefPor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A319DefPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A319DefPor), 3, 0));
      Z319DefPor = (short)(0) ;
   }

   public void initAll1TM37( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A833TipDefCod), 4, 0));
      initializeNonKey1TM37( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101093", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disdef.js", "?202682116101093", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      divDvpanel_tablepedido_cell_Internalname = "DVPANEL_TABLEPEDIDO_CELL" ;
      Combo_tipdefcod_Internalname = "COMBO_TIPDEFCOD" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      divUnnamedtabletipdefcod_Internalname = "UNNAMEDTABLETIPDEFCOD" ;
      edtDefPor_Internalname = "DEFPOR" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombotipdefcod_Internalname = "vCOMBOTIPDEFCOD" ;
      divSectionattribute_tipdefcod_Internalname = "SECTIONATTRIBUTE_TIPDEFCOD" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Form.setCaption( httpContext.getMessage( "Defecto", "") );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtTipDefDsc_Jsonclick = "" ;
      edtTipDefDsc_Enabled = 0 ;
      edtTipDefDsc_Visible = 1 ;
      edtavCombotipdefcod_Jsonclick = "" ;
      edtavCombotipdefcod_Enabled = 0 ;
      edtavCombotipdefcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDefPor_Jsonclick = "" ;
      edtDefPor_Enabled = 1 ;
      edtTipDefCod_Jsonclick = "" ;
      edtTipDefCod_Enabled = 1 ;
      edtTipDefCod_Visible = 1 ;
      Combo_tipdefcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipdefcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipdefcod_Caption = "" ;
      Combo_tipdefcod_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Defecto", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Title = "" ;
      Dvpanel_tablepedido_Cls = "PanelNoHeader" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
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

   public void valid_Emprcod( )
   {
      n833TipDefCod = false ;
      n834TipDefDsc = false ;
      /* Using cursor T01TM17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A369DisFec = T01TM17_A369DisFec[0] ;
      A335DisArtCod = T01TM17_A335DisArtCod[0] ;
      A337DisArtDsc = T01TM17_A337DisArtDsc[0] ;
      A252CliCod = T01TM17_A252CliCod[0] ;
      pr_default.close(15);
      /* Using cursor T01TM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A834TipDefDsc = T01TM19_A834TipDefDsc[0] ;
      n834TipDefDsc = T01TM19_n834TipDefDsc[0] ;
      pr_default.close(17);
      /* Using cursor T01TM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01TM18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TM2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTIPDEFCOD","{handler:'validv_Combotipdefcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTIPDEFCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
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
      pr_default.close(15);
      pr_default.close(17);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Combo_tipdefcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A337DisArtDsc = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucCombo_tipdefcod = new com.genexus.webpanels.GXUserControl();
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13TipDefCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV18Pgmname = "" ;
      A834TipDefDsc = "" ;
      A335DisArtCod = "" ;
      Dvpanel_tablepedido_Objectcall = "" ;
      Dvpanel_tablepedido_Class = "" ;
      Dvpanel_tablepedido_Height = "" ;
      Combo_tipdefcod_Objectcall = "" ;
      Combo_tipdefcod_Class = "" ;
      Combo_tipdefcod_Icontype = "" ;
      Combo_tipdefcod_Icon = "" ;
      Combo_tipdefcod_Tooltip = "" ;
      Combo_tipdefcod_Selectedvalue_set = "" ;
      Combo_tipdefcod_Selectedtext_set = "" ;
      Combo_tipdefcod_Selectedtext_get = "" ;
      Combo_tipdefcod_Gamoauthtoken = "" ;
      Combo_tipdefcod_Ddointernalname = "" ;
      Combo_tipdefcod_Titlecontrolalign = "" ;
      Combo_tipdefcod_Dropdownoptionstype = "" ;
      Combo_tipdefcod_Titlecontrolidtoreplace = "" ;
      Combo_tipdefcod_Datalisttype = "" ;
      Combo_tipdefcod_Datalistfixedvalues = "" ;
      Combo_tipdefcod_Datalistproc = "" ;
      Combo_tipdefcod_Datalistprocparametersprefix = "" ;
      Combo_tipdefcod_Remoteservicesparameters = "" ;
      Combo_tipdefcod_Htmltemplate = "" ;
      Combo_tipdefcod_Multiplevaluestype = "" ;
      Combo_tipdefcod_Loadingdata = "" ;
      Combo_tipdefcod_Noresultsfound = "" ;
      Combo_tipdefcod_Emptyitemtext = "" ;
      Combo_tipdefcod_Onlyselectedvalues = "" ;
      Combo_tipdefcod_Selectalltext = "" ;
      Combo_tipdefcod_Multiplevaluesseparator = "" ;
      Combo_tipdefcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode37 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV14ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z369DisFec = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z337DisArtDsc = "" ;
      Z279CliNom = "" ;
      Z834TipDefDsc = "" ;
      T01TM4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TM4_A335DisArtCod = new String[] {""} ;
      T01TM4_A337DisArtDsc = new String[] {""} ;
      T01TM4_A252CliCod = new int[1] ;
      T01TM6_A279CliNom = new String[] {""} ;
      T01TM5_A834TipDefDsc = new String[] {""} ;
      T01TM5_n834TipDefDsc = new boolean[] {false} ;
      T01TM7_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TM7_A279CliNom = new String[] {""} ;
      T01TM7_A335DisArtCod = new String[] {""} ;
      T01TM7_A337DisArtDsc = new String[] {""} ;
      T01TM7_A834TipDefDsc = new String[] {""} ;
      T01TM7_n834TipDefDsc = new boolean[] {false} ;
      T01TM7_A319DefPor = new short[1] ;
      T01TM7_A396EmprCod = new String[] {""} ;
      T01TM7_A361DisCod = new int[1] ;
      T01TM7_A833TipDefCod = new short[1] ;
      T01TM7_n833TipDefCod = new boolean[] {false} ;
      T01TM7_A252CliCod = new int[1] ;
      T01TM8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TM8_A335DisArtCod = new String[] {""} ;
      T01TM8_A337DisArtDsc = new String[] {""} ;
      T01TM8_A252CliCod = new int[1] ;
      T01TM9_A279CliNom = new String[] {""} ;
      T01TM10_A834TipDefDsc = new String[] {""} ;
      T01TM10_n834TipDefDsc = new boolean[] {false} ;
      T01TM11_A396EmprCod = new String[] {""} ;
      T01TM11_A361DisCod = new int[1] ;
      T01TM11_A833TipDefCod = new short[1] ;
      T01TM11_n833TipDefCod = new boolean[] {false} ;
      T01TM3_A319DefPor = new short[1] ;
      T01TM3_A396EmprCod = new String[] {""} ;
      T01TM3_A361DisCod = new int[1] ;
      T01TM3_A833TipDefCod = new short[1] ;
      T01TM3_n833TipDefCod = new boolean[] {false} ;
      T01TM12_A396EmprCod = new String[] {""} ;
      T01TM12_A361DisCod = new int[1] ;
      T01TM12_A833TipDefCod = new short[1] ;
      T01TM12_n833TipDefCod = new boolean[] {false} ;
      T01TM13_A396EmprCod = new String[] {""} ;
      T01TM13_A361DisCod = new int[1] ;
      T01TM13_A833TipDefCod = new short[1] ;
      T01TM13_n833TipDefCod = new boolean[] {false} ;
      T01TM2_A319DefPor = new short[1] ;
      T01TM2_A396EmprCod = new String[] {""} ;
      T01TM2_A361DisCod = new int[1] ;
      T01TM2_A833TipDefCod = new short[1] ;
      T01TM2_n833TipDefCod = new boolean[] {false} ;
      T01TM17_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TM17_A335DisArtCod = new String[] {""} ;
      T01TM17_A337DisArtDsc = new String[] {""} ;
      T01TM17_A252CliCod = new int[1] ;
      T01TM18_A279CliNom = new String[] {""} ;
      T01TM19_A834TipDefDsc = new String[] {""} ;
      T01TM19_n834TipDefDsc = new boolean[] {false} ;
      T01TM20_A396EmprCod = new String[] {""} ;
      T01TM20_A129BarCod = new int[1] ;
      T01TM20_A132BarCodReo = new byte[1] ;
      T01TM20_A130BarCodPar = new String[] {""} ;
      T01TM21_A396EmprCod = new String[] {""} ;
      T01TM21_A361DisCod = new int[1] ;
      T01TM21_A833TipDefCod = new short[1] ;
      T01TM21_n833TipDefCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdef__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdef__default(),
         new Object[] {
             new Object[] {
            T01TM2_A319DefPor, T01TM2_A396EmprCod, T01TM2_A361DisCod, T01TM2_A833TipDefCod
            }
            , new Object[] {
            T01TM3_A319DefPor, T01TM3_A396EmprCod, T01TM3_A361DisCod, T01TM3_A833TipDefCod
            }
            , new Object[] {
            T01TM4_A369DisFec, T01TM4_A335DisArtCod, T01TM4_A337DisArtDsc, T01TM4_A252CliCod
            }
            , new Object[] {
            T01TM5_A834TipDefDsc, T01TM5_n834TipDefDsc
            }
            , new Object[] {
            T01TM6_A279CliNom
            }
            , new Object[] {
            T01TM7_A369DisFec, T01TM7_A279CliNom, T01TM7_A335DisArtCod, T01TM7_A337DisArtDsc, T01TM7_A834TipDefDsc, T01TM7_n834TipDefDsc, T01TM7_A319DefPor, T01TM7_A396EmprCod, T01TM7_A361DisCod, T01TM7_A833TipDefCod,
            T01TM7_A252CliCod
            }
            , new Object[] {
            T01TM8_A369DisFec, T01TM8_A335DisArtCod, T01TM8_A337DisArtDsc, T01TM8_A252CliCod
            }
            , new Object[] {
            T01TM9_A279CliNom
            }
            , new Object[] {
            T01TM10_A834TipDefDsc, T01TM10_n834TipDefDsc
            }
            , new Object[] {
            T01TM11_A396EmprCod, T01TM11_A361DisCod, T01TM11_A833TipDefCod
            }
            , new Object[] {
            T01TM12_A396EmprCod, T01TM12_A361DisCod, T01TM12_A833TipDefCod
            }
            , new Object[] {
            T01TM13_A396EmprCod, T01TM13_A361DisCod, T01TM13_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TM17_A369DisFec, T01TM17_A335DisArtCod, T01TM17_A337DisArtDsc, T01TM17_A252CliCod
            }
            , new Object[] {
            T01TM18_A279CliNom
            }
            , new Object[] {
            T01TM19_A834TipDefDsc, T01TM19_n834TipDefDsc
            }
            , new Object[] {
            T01TM20_A396EmprCod, T01TM20_A129BarCod, T01TM20_A132BarCodReo, T01TM20_A130BarCodPar
            }
            , new Object[] {
            T01TM21_A396EmprCod, T01TM21_A361DisCod, T01TM21_A833TipDefCod
            }
         }
      );
      AV18Pgmname = "Pedidos.DisDef" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9TipDefCod ;
   private short Z833TipDefCod ;
   private short Z319DefPor ;
   private short A833TipDefCod ;
   private short AV9TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A319DefPor ;
   private short AV15ComboTipDefCod ;
   private short RcdFound37 ;
   private short nIsDirty_37 ;
   private int wcpOAV8DisCod ;
   private int Z361DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV8DisCod ;
   private int trnEnded ;
   private int edtDisCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtTipDefCod_Visible ;
   private int edtTipDefCod_Enabled ;
   private int edtDefPor_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombotipdefcod_Enabled ;
   private int edtavCombotipdefcod_Visible ;
   private int edtTipDefDsc_Visible ;
   private int edtTipDefDsc_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int Combo_tipdefcod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Combo_tipdefcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipDefCod_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divDvpanel_tablepedido_cell_Internalname ;
   private String divDvpanel_tablepedido_cell_Class ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtabletipdefcod_Internalname ;
   private String Combo_tipdefcod_Caption ;
   private String Combo_tipdefcod_Cls ;
   private String Combo_tipdefcod_Internalname ;
   private String TempTags ;
   private String edtTipDefCod_Jsonclick ;
   private String edtDefPor_Internalname ;
   private String edtDefPor_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV18Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_tipdefcod_Internalname ;
   private String edtavCombotipdefcod_Internalname ;
   private String edtavCombotipdefcod_Jsonclick ;
   private String edtTipDefDsc_Internalname ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String A335DisArtCod ;
   private String Dvpanel_tablepedido_Objectcall ;
   private String Dvpanel_tablepedido_Class ;
   private String Dvpanel_tablepedido_Height ;
   private String Combo_tipdefcod_Objectcall ;
   private String Combo_tipdefcod_Class ;
   private String Combo_tipdefcod_Icontype ;
   private String Combo_tipdefcod_Icon ;
   private String Combo_tipdefcod_Tooltip ;
   private String Combo_tipdefcod_Selectedvalue_set ;
   private String Combo_tipdefcod_Selectedtext_set ;
   private String Combo_tipdefcod_Selectedtext_get ;
   private String Combo_tipdefcod_Gamoauthtoken ;
   private String Combo_tipdefcod_Ddointernalname ;
   private String Combo_tipdefcod_Titlecontrolalign ;
   private String Combo_tipdefcod_Dropdownoptionstype ;
   private String Combo_tipdefcod_Titlecontrolidtoreplace ;
   private String Combo_tipdefcod_Datalisttype ;
   private String Combo_tipdefcod_Datalistfixedvalues ;
   private String Combo_tipdefcod_Datalistproc ;
   private String Combo_tipdefcod_Datalistprocparametersprefix ;
   private String Combo_tipdefcod_Remoteservicesparameters ;
   private String Combo_tipdefcod_Htmltemplate ;
   private String Combo_tipdefcod_Multiplevaluestype ;
   private String Combo_tipdefcod_Loadingdata ;
   private String Combo_tipdefcod_Noresultsfound ;
   private String Combo_tipdefcod_Emptyitemtext ;
   private String Combo_tipdefcod_Onlyselectedvalues ;
   private String Combo_tipdefcod_Selectalltext ;
   private String Combo_tipdefcod_Multiplevaluesseparator ;
   private String Combo_tipdefcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode37 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String GXv_char4[] ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z279CliNom ;
   private String Z834TipDefDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date A369DisFec ;
   private java.util.Date Z369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n833TipDefCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_tipdefcod_Emptyitem ;
   private boolean Dvpanel_tablepedido_Enabled ;
   private boolean Dvpanel_tablepedido_Showheader ;
   private boolean Dvpanel_tablepedido_Visible ;
   private boolean Combo_tipdefcod_Enabled ;
   private boolean Combo_tipdefcod_Visible ;
   private boolean Combo_tipdefcod_Allowmultipleselection ;
   private boolean Combo_tipdefcod_Isgriditem ;
   private boolean Combo_tipdefcod_Hasdescription ;
   private boolean Combo_tipdefcod_Includeonlyselectedoption ;
   private boolean Combo_tipdefcod_Includeselectalloption ;
   private boolean Combo_tipdefcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n834TipDefDsc ;
   private boolean returnInSub ;
   private String AV14ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipdefcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01TM4_A369DisFec ;
   private String[] T01TM4_A335DisArtCod ;
   private String[] T01TM4_A337DisArtDsc ;
   private int[] T01TM4_A252CliCod ;
   private String[] T01TM6_A279CliNom ;
   private String[] T01TM5_A834TipDefDsc ;
   private boolean[] T01TM5_n834TipDefDsc ;
   private java.util.Date[] T01TM7_A369DisFec ;
   private String[] T01TM7_A279CliNom ;
   private String[] T01TM7_A335DisArtCod ;
   private String[] T01TM7_A337DisArtDsc ;
   private String[] T01TM7_A834TipDefDsc ;
   private boolean[] T01TM7_n834TipDefDsc ;
   private short[] T01TM7_A319DefPor ;
   private String[] T01TM7_A396EmprCod ;
   private int[] T01TM7_A361DisCod ;
   private short[] T01TM7_A833TipDefCod ;
   private boolean[] T01TM7_n833TipDefCod ;
   private int[] T01TM7_A252CliCod ;
   private java.util.Date[] T01TM8_A369DisFec ;
   private String[] T01TM8_A335DisArtCod ;
   private String[] T01TM8_A337DisArtDsc ;
   private int[] T01TM8_A252CliCod ;
   private String[] T01TM9_A279CliNom ;
   private String[] T01TM10_A834TipDefDsc ;
   private boolean[] T01TM10_n834TipDefDsc ;
   private String[] T01TM11_A396EmprCod ;
   private int[] T01TM11_A361DisCod ;
   private short[] T01TM11_A833TipDefCod ;
   private boolean[] T01TM11_n833TipDefCod ;
   private short[] T01TM3_A319DefPor ;
   private String[] T01TM3_A396EmprCod ;
   private int[] T01TM3_A361DisCod ;
   private short[] T01TM3_A833TipDefCod ;
   private boolean[] T01TM3_n833TipDefCod ;
   private String[] T01TM12_A396EmprCod ;
   private int[] T01TM12_A361DisCod ;
   private short[] T01TM12_A833TipDefCod ;
   private boolean[] T01TM12_n833TipDefCod ;
   private String[] T01TM13_A396EmprCod ;
   private int[] T01TM13_A361DisCod ;
   private short[] T01TM13_A833TipDefCod ;
   private boolean[] T01TM13_n833TipDefCod ;
   private short[] T01TM2_A319DefPor ;
   private String[] T01TM2_A396EmprCod ;
   private int[] T01TM2_A361DisCod ;
   private short[] T01TM2_A833TipDefCod ;
   private boolean[] T01TM2_n833TipDefCod ;
   private java.util.Date[] T01TM17_A369DisFec ;
   private String[] T01TM17_A335DisArtCod ;
   private String[] T01TM17_A337DisArtDsc ;
   private int[] T01TM17_A252CliCod ;
   private String[] T01TM18_A279CliNom ;
   private String[] T01TM19_A834TipDefDsc ;
   private boolean[] T01TM19_n834TipDefDsc ;
   private String[] T01TM20_A396EmprCod ;
   private int[] T01TM20_A129BarCod ;
   private byte[] T01TM20_A132BarCodReo ;
   private String[] T01TM20_A130BarCodPar ;
   private String[] T01TM21_A396EmprCod ;
   private int[] T01TM21_A361DisCod ;
   private short[] T01TM21_A833TipDefCod ;
   private boolean[] T01TM21_n833TipDefCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13TipDefCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class disdef__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TM2", "SELECT DefPor, EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?  FOR UPDATE OF DefPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM3", "SELECT DefPor, EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM4", "SELECT DisFec, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM5", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM6", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM7", "SELECT /*+ FIRST_ROWS(100) */ T2.DisFec, T3.CliNom, T2.DisArtCod, T2.DisArtDsc, T4.TipDefDsc, TM1.DefPor, TM1.EmprCod, TM1.DisCod, TM1.TipDefCod, T2.CliCod FROM (((TXPDISDEF TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipDefCod = TM1.TipDefCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.TipDefCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM8", "SELECT DisFec, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM10", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ? or DisCod = ? and EmprCod = ? and TipDefCod > ?) ORDER BY EmprCod, DisCod, TipDefCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TM13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ? or DisCod = ? and EmprCod = ? and TipDefCod < ?) ORDER BY EmprCod DESC, DisCod DESC, TipDefCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TM14", "INSERT INTO TXPDISDEF(DefPor, EmprCod, DisCod, TipDefCod, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T01TM15", "UPDATE TXPDISDEF SET DefPor=?  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T01TM16", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new ForEachCursor("T01TM17", "SELECT DisFec, DisArtCod, DisArtDsc, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM19", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TM20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TM21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, TipDefCod FROM TXPDISDEF ORDER BY EmprCod, DisCod, TipDefCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 19 :
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
      }
   }

}

