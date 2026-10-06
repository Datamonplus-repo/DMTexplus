package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclimarcas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"CLIMARCAEX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12907CliMarcaID = httpContext.GetPar( "CliMarcaID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaclimarcaex1LW1771( A396EmprCod, A252CliCod, A12907CliMarcaID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12907CliMarcaID = httpContext.GetPar( "CliMarcaID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A12907CliMarcaID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_marcas") == 0 )
      {
         gxnrgridlevel_marcas_newrow_invoke( ) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV36CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ClientesvsMarcas", ""), (short)(0)) ;
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

   public void gxnrgridlevel_marcas_newrow_invoke( )
   {
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_marcas_newrow( ) ;
      /* End function gxnrGridlevel_marcas_newrow_invoke */
   }

   public tclimarcas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclimarcas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimarcas_impl.class ));
   }

   public tclimarcas_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkCliNoNom = UIFactory.getCheckbox(this);
      chkCliMarcaEx = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TCLIMARCAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCLIMARCAS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLIMARCAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLIMARCAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLIMARCAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_marcas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_marcas( ) ;
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCLIMARCAS.htm");
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
      /* User Defined Control */
      ucCombo_climarcaid.setProperty("Caption", Combo_climarcaid_Caption);
      ucCombo_climarcaid.setProperty("Cls", Combo_climarcaid_Cls);
      ucCombo_climarcaid.setProperty("IsGridItem", Combo_climarcaid_Isgriditem);
      ucCombo_climarcaid.setProperty("EmptyItem", Combo_climarcaid_Emptyitem);
      ucCombo_climarcaid.setProperty("DropDownOptionsData", AV40CliMarcaID_Data);
      ucCombo_climarcaid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_climarcaid_Internalname, "COMBO_CLIMARCAIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_marcas( )
   {
      /*  Grid Control  */
      startgridcontrol41( ) ;
      nGXsfl_41_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1771 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1771 = (short)(1) ;
            scanStart1LW1771( ) ;
            while ( RcdFound1771 != 0 )
            {
               init_level_properties1771( ) ;
               getByPrimaryKey1LW1771( ) ;
               addRow1LW1771( ) ;
               scanNext1LW1771( ) ;
            }
            scanEnd1LW1771( ) ;
            nBlankRcdCount1771 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LW1771( ) ;
         standaloneModal1LW1771( ) ;
         sMode1771 = Gx_mode ;
         while ( nGXsfl_41_idx < nRC_GXsfl_41 )
         {
            bGXsfl_41_Refreshing = true ;
            readRow1LW1771( ) ;
            edtCliMarcaID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIMARCAID_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliMarcaID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMarcaID_Enabled), 5, 0), !bGXsfl_41_Refreshing);
            chkCliNoNom.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLINONOM_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkCliNoNom.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliNoNom.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
            chkCliMarcaEx.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIMARCAEX_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkCliMarcaEx.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliMarcaEx.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
            if ( ( nRcdExists_1771 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LW1771( ) ;
            }
            sendRow1LW1771( ) ;
            bGXsfl_41_Refreshing = false ;
         }
         Gx_mode = sMode1771 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1771 = (short)(5) ;
         nRcdExists_1771 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LW1771( ) ;
            while ( RcdFound1771 != 0 )
            {
               sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_411771( ) ;
               init_level_properties1771( ) ;
               standaloneNotModal1LW1771( ) ;
               getByPrimaryKey1LW1771( ) ;
               standaloneModal1LW1771( ) ;
               addRow1LW1771( ) ;
               scanNext1LW1771( ) ;
            }
            scanEnd1LW1771( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1771 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_411771( ) ;
         initAll1LW1771( ) ;
         init_level_properties1771( ) ;
         nRcdExists_1771 = (short)(0) ;
         nIsMod_1771 = (short)(0) ;
         nRcdDeleted_1771 = (short)(0) ;
         nBlankRcdCount1771 = (short)(nBlankRcdUsr1771+nBlankRcdCount1771) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1771 > 0 )
         {
            standaloneNotModal1LW1771( ) ;
            standaloneModal1LW1771( ) ;
            addRow1LW1771( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCliMarcaID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1771 = (short)(nBlankRcdCount1771-1) ;
         }
         Gx_mode = sMode1771 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_marcasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_marcas", Gridlevel_marcasContainer, subGridlevel_marcas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_marcasContainerData", Gridlevel_marcasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_marcasContainerData"+"V", Gridlevel_marcasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_marcasContainerData"+"V"+"\" value='"+Gridlevel_marcasContainer.GridValuesHidden()+"'/>") ;
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
      e111LW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIMARCAID_DATA"), AV40CliMarcaID_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV36CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A14256CliMarcasc = (short)(localUtil.ctol( httpContext.cgiGet( "CLIMARCASC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14256CliMarcasc = false ;
            A12908CliMarcaDc = httpContext.cgiGet( "CLIMARCADC") ;
            n12908CliMarcaDc = false ;
            A14004ID_CliMarc = httpContext.cgiGet( "ID_CLIMARC") ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_climarcaid_Objectcall = httpContext.cgiGet( "COMBO_CLIMARCAID_Objectcall") ;
            Combo_climarcaid_Class = httpContext.cgiGet( "COMBO_CLIMARCAID_Class") ;
            Combo_climarcaid_Icontype = httpContext.cgiGet( "COMBO_CLIMARCAID_Icontype") ;
            Combo_climarcaid_Icon = httpContext.cgiGet( "COMBO_CLIMARCAID_Icon") ;
            Combo_climarcaid_Caption = httpContext.cgiGet( "COMBO_CLIMARCAID_Caption") ;
            Combo_climarcaid_Tooltip = httpContext.cgiGet( "COMBO_CLIMARCAID_Tooltip") ;
            Combo_climarcaid_Cls = httpContext.cgiGet( "COMBO_CLIMARCAID_Cls") ;
            Combo_climarcaid_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIMARCAID_Selectedvalue_set") ;
            Combo_climarcaid_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLIMARCAID_Selectedvalue_get") ;
            Combo_climarcaid_Selectedtext_set = httpContext.cgiGet( "COMBO_CLIMARCAID_Selectedtext_set") ;
            Combo_climarcaid_Selectedtext_get = httpContext.cgiGet( "COMBO_CLIMARCAID_Selectedtext_get") ;
            Combo_climarcaid_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLIMARCAID_Gamoauthtoken") ;
            Combo_climarcaid_Ddointernalname = httpContext.cgiGet( "COMBO_CLIMARCAID_Ddointernalname") ;
            Combo_climarcaid_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLIMARCAID_Titlecontrolalign") ;
            Combo_climarcaid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLIMARCAID_Dropdownoptionstype") ;
            Combo_climarcaid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Enabled")) ;
            Combo_climarcaid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Visible")) ;
            Combo_climarcaid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLIMARCAID_Titlecontrolidtoreplace") ;
            Combo_climarcaid_Datalisttype = httpContext.cgiGet( "COMBO_CLIMARCAID_Datalisttype") ;
            Combo_climarcaid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Allowmultipleselection")) ;
            Combo_climarcaid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLIMARCAID_Datalistfixedvalues") ;
            Combo_climarcaid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Isgriditem")) ;
            Combo_climarcaid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Hasdescription")) ;
            Combo_climarcaid_Datalistproc = httpContext.cgiGet( "COMBO_CLIMARCAID_Datalistproc") ;
            Combo_climarcaid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLIMARCAID_Datalistprocparametersprefix") ;
            Combo_climarcaid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLIMARCAID_Remoteservicesparameters") ;
            Combo_climarcaid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLIMARCAID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_climarcaid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Includeonlyselectedoption")) ;
            Combo_climarcaid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Includeselectalloption")) ;
            Combo_climarcaid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Emptyitem")) ;
            Combo_climarcaid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIMARCAID_Includeaddnewoption")) ;
            Combo_climarcaid_Htmltemplate = httpContext.cgiGet( "COMBO_CLIMARCAID_Htmltemplate") ;
            Combo_climarcaid_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLIMARCAID_Multiplevaluestype") ;
            Combo_climarcaid_Loadingdata = httpContext.cgiGet( "COMBO_CLIMARCAID_Loadingdata") ;
            Combo_climarcaid_Noresultsfound = httpContext.cgiGet( "COMBO_CLIMARCAID_Noresultsfound") ;
            Combo_climarcaid_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIMARCAID_Emptyitemtext") ;
            Combo_climarcaid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLIMARCAID_Onlyselectedvalues") ;
            Combo_climarcaid_Selectalltext = httpContext.cgiGet( "COMBO_CLIMARCAID_Selectalltext") ;
            Combo_climarcaid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLIMARCAID_Multiplevaluesseparator") ;
            Combo_climarcaid_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLIMARCAID_Addnewoptiontext") ;
            Combo_climarcaid_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLIMARCAID_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCLIMARCAS");
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tclimarcas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
                  sMode21 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode21 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound21 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1LW0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
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
                        e111LW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121LW2 ();
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
         e121LW2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1LW21( ) ;
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
         disableAttributes1LW21( ) ;
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

   public void confirm_1LW0( )
   {
      beforeValidate1LW21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LW21( ) ;
         }
         else
         {
            checkExtendedTable1LW21( ) ;
            closeExtendedTableCursors1LW21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_1LW1771( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1LW1771( )
   {
      nGXsfl_41_idx = 0 ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         readRow1LW1771( ) ;
         if ( ( nRcdExists_1771 != 0 ) || ( nIsMod_1771 != 0 ) )
         {
            getKey1LW1771( ) ;
            if ( ( nRcdExists_1771 == 0 ) && ( nRcdDeleted_1771 == 0 ) )
            {
               if ( RcdFound1771 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LW1771( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LW1771( ) ;
                     closeExtendedTableCursors1LW1771( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CLIMARCAID_" + sGXsfl_41_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliMarcaID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1771 != 0 )
               {
                  if ( nRcdDeleted_1771 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LW1771( ) ;
                     load1LW1771( ) ;
                     beforeValidate1LW1771( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LW1771( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1771 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LW1771( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LW1771( ) ;
                           closeExtendedTableCursors1LW1771( ) ;
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
                  if ( nRcdDeleted_1771 == 0 )
                  {
                     GXCCtl = "CLIMARCAID_" + sGXsfl_41_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliMarcaID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCliMarcaID_Internalname, GXutil.rtrim( A12907CliMarcaID)) ;
         httpContext.changePostValue( chkCliNoNom.getInternalname(), ((GXutil.strcmp(A14269CliNoNom, "S")==0) ? "S" : "N")) ;
         httpContext.changePostValue( chkCliMarcaEx.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12907CliMarcaID_"+sGXsfl_41_idx, GXutil.rtrim( Z12907CliMarcaID)) ;
         httpContext.changePostValue( "ZT_"+"Z14269CliNoNom_"+sGXsfl_41_idx, GXutil.rtrim( Z14269CliNoNom)) ;
         httpContext.changePostValue( "nRcdDeleted_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1771 != 0 )
         {
            httpContext.changePostValue( "CLIMARCAID_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliMarcaID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINONOM_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliNoNom.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIMARCAEX_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliMarcaEx.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01LW6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A14256CliMarcasc = T01LW6_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW6_n14256CliMarcasc[0] ;
      }
      else
      {
         A14256CliMarcasc = (short)(0) ;
         n14256CliMarcasc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1LW0( )
   {
   }

   public void e111LW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclimarcas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclimarcas_impl.this.AV32EmprCod = GXv_char2[0] ;
      tclimarcas_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclimarcas_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV37WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV37WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_climarcaid_Titlecontrolidtoreplace = edtCliMarcaID_Internalname ;
      ucCombo_climarcaid.sendProperty(context, "", false, Combo_climarcaid_Internalname, "TitleControlIdToReplace", Combo_climarcaid_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOCLIMARCAID' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV38TrnContext.fromxml(AV39WebSession.getValue("TrnContext"), null, null);
   }

   public void e121LW2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV38TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tclimarcasww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIMARCAID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV40CliMarcaID_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.ficherosbasicos.tclimarcasloaddvcombo(remoteHandle, context).execute( "CliMarcaID", Gx_mode, AV32EmprCod, AV36CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tclimarcas_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV40CliMarcaID_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1LW21( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T01LW8_A279CliNom[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z14256CliMarcasc = A14256CliMarcasc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      AV44Pgmname = "FicherosBasicos.TCLIMARCAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01LW9 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LW9_A407EmprNom[0] ;
      n407EmprNom = T01LW9_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV36CliCod) )
      {
         A252CliCod = AV36CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         /* Using cursor T01LW6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A14256CliMarcasc = T01LW6_A14256CliMarcasc[0] ;
            n14256CliMarcasc = T01LW6_n14256CliMarcasc[0] ;
         }
         else
         {
            A14256CliMarcasc = (short)(0) ;
            n14256CliMarcasc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
         }
         pr_default.close(3);
      }
   }

   public void load1LW21( )
   {
      /* Using cursor T01LW11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T01LW11_A407EmprNom[0] ;
         n407EmprNom = T01LW11_n407EmprNom[0] ;
         A279CliNom = T01LW11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A14256CliMarcasc = T01LW11_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW11_n14256CliMarcasc[0] ;
         zm1LW21( -10) ;
      }
      pr_default.close(7);
      onLoadActions1LW21( ) ;
   }

   public void onLoadActions1LW21( )
   {
   }

   public void checkExtendedTable1LW21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LW6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A14256CliMarcasc = T01LW6_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW6_n14256CliMarcasc[0] ;
      }
      else
      {
         nIsDirty_21 = (short)(1) ;
         A14256CliMarcasc = (short)(0) ;
         n14256CliMarcasc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1LW21( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01LW13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A14256CliMarcasc = T01LW13_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW13_n14256CliMarcasc[0] ;
      }
      else
      {
         A14256CliMarcasc = (short)(0) ;
         n14256CliMarcasc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14256CliMarcasc, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1LW21( )
   {
      /* Using cursor T01LW14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LW8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1LW21( 10) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T01LW8_A252CliCod[0] ;
         n252CliCod = T01LW8_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01LW8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A396EmprCod = T01LW8_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LW21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey1LW21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey1LW21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1LW21( ) ;
      if ( RcdFound21 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T01LW15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01LW15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01LW15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LW15_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01LW15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01LW15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LW15_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T01LW15_A396EmprCod[0] ;
            A252CliCod = T01LW15_A252CliCod[0] ;
            n252CliCod = T01LW15_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T01LW16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01LW16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01LW16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LW16_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01LW16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01LW16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LW16_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T01LW16_A396EmprCod[0] ;
            A252CliCod = T01LW16_A252CliCod[0] ;
            n252CliCod = T01LW16_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LW21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1LW21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
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
               update1LW21( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               insert1LW21( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert1LW21( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
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

   public void checkOptimisticConcurrency1LW21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LW7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z279CliNom, T01LW7_A279CliNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T01LW7_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tclimarcas:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T01LW7_A279CliNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LW21( )
   {
      beforeValidate1LW21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LW21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LW21( 0) ;
         checkOptimisticConcurrency1LW21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LW21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LW21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LW17 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevel1LW21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LW0( ) ;
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
            load1LW21( ) ;
         }
         endLevel1LW21( ) ;
      }
      closeExtendedTableCursors1LW21( ) ;
   }

   public void update1LW21( )
   {
      beforeValidate1LW21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LW21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LW21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LW21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LW21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LW18 */
                  pr_default.execute(13, new Object[] {A279CliNom, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LW21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LW21( ) ;
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
         endLevel1LW21( ) ;
      }
      closeExtendedTableCursors1LW21( ) ;
   }

   public void deferredUpdate1LW21( )
   {
   }

   public void delete( )
   {
      beforeValidate1LW21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LW21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LW21( ) ;
         afterConfirm1LW21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LW21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LW19 */
               pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LW21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LW21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LW21 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A14256CliMarcasc = T01LW21_A14256CliMarcasc[0] ;
            n14256CliMarcasc = T01LW21_n14256CliMarcasc[0] ;
         }
         else
         {
            A14256CliMarcasc = (short)(0) ;
            n14256CliMarcasc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LW22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01LW23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01LW24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01LW25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01LW26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01LW27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01LW28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01LW29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01LW30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01LW31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01LW32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01LW33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01LW34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01LW35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01LW36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01LW37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01LW38 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01LW39 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01LW40 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01LW41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01LW42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01LW43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01LW44 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01LW45 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01LW46 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01LW47 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01LW48 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01LW49 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01LW50 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01LW51 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01LW52 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01LW53 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01LW54 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01LW55 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01LW56 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01LW57 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01LW58 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01LW59 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01LW60 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01LW61 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01LW62 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01LW63 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01LW64 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01LW65 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01LW66 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01LW67 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01LW68 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01LW69 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01LW70 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01LW71 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01LW72 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01LW73 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01LW74 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01LW75 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01LW76 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01LW77 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01LW78 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01LW79 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01LW80 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01LW81 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01LW82 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01LW83 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
      }
   }

   public void processNestedLevel1LW1771( )
   {
      nGXsfl_41_idx = 0 ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         readRow1LW1771( ) ;
         if ( ( nRcdExists_1771 != 0 ) || ( nIsMod_1771 != 0 ) )
         {
            standaloneNotModal1LW1771( ) ;
            getKey1LW1771( ) ;
            if ( ( nRcdExists_1771 == 0 ) && ( nRcdDeleted_1771 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LW1771( ) ;
            }
            else
            {
               if ( RcdFound1771 != 0 )
               {
                  if ( ( nRcdDeleted_1771 != 0 ) && ( nRcdExists_1771 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LW1771( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1771 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LW1771( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1771 == 0 )
                  {
                     GXCCtl = "CLIMARCAID_" + sGXsfl_41_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliMarcaID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCliMarcaID_Internalname, GXutil.rtrim( A12907CliMarcaID)) ;
         httpContext.changePostValue( chkCliNoNom.getInternalname(), ((GXutil.strcmp(A14269CliNoNom, "S")==0) ? "S" : "N")) ;
         httpContext.changePostValue( chkCliMarcaEx.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12907CliMarcaID_"+sGXsfl_41_idx, GXutil.rtrim( Z12907CliMarcaID)) ;
         httpContext.changePostValue( "ZT_"+"Z14269CliNoNom_"+sGXsfl_41_idx, GXutil.rtrim( Z14269CliNoNom)) ;
         httpContext.changePostValue( "nRcdDeleted_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1771_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1771 != 0 )
         {
            httpContext.changePostValue( "CLIMARCAID_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliMarcaID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINONOM_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliNoNom.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIMARCAEX_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliMarcaEx.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01LW21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A14256CliMarcasc = T01LW21_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW21_n14256CliMarcasc[0] ;
      }
      else
      {
         A14256CliMarcasc = (short)(0) ;
         n14256CliMarcasc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
      }
      /* End of After( level) rules */
      initAll1LW1771( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1771 = (short)(0) ;
      nIsMod_1771 = (short)(0) ;
      nRcdDeleted_1771 = (short)(0) ;
   }

   public void processLevel1LW21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel1LW1771( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LW21( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LW21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tclimarcas");
         if ( AnyError == 0 )
         {
            confirmValues1LW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tclimarcas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LW21( )
   {
      /* Scan By routine */
      /* Using cursor T01LW84 */
      pr_default.execute(78);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01LW84_A396EmprCod[0] ;
         A252CliCod = T01LW84_A252CliCod[0] ;
         n252CliCod = T01LW84_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LW21( )
   {
      /* Scan next routine */
      pr_default.readNext(78);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T01LW84_A396EmprCod[0] ;
         A252CliCod = T01LW84_A252CliCod[0] ;
         n252CliCod = T01LW84_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd1LW21( )
   {
      pr_default.close(78);
   }

   public void afterConfirm1LW21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LW21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LW21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LW21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LW21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LW21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LW21( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1LW1771( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14269CliNoNom = T01LW3_A14269CliNoNom[0] ;
         }
         else
         {
            Z14269CliNoNom = A14269CliNoNom ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z252CliCod = A252CliCod ;
         Z14269CliNoNom = A14269CliNoNom ;
         Z396EmprCod = A396EmprCod ;
         Z12907CliMarcaID = A12907CliMarcaID ;
         Z12908CliMarcaDc = A12908CliMarcaDc ;
      }
   }

   public void standaloneNotModal1LW1771( )
   {
   }

   public void standaloneModal1LW1771( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCliMarcaID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliMarcaID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMarcaID_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      }
      else
      {
         edtCliMarcaID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliMarcaID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMarcaID_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      }
   }

   public void load1LW1771( )
   {
      /* Using cursor T01LW85 */
      pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1771 = (short)(1) ;
         A12908CliMarcaDc = T01LW85_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = T01LW85_n12908CliMarcaDc[0] ;
         A14269CliNoNom = T01LW85_A14269CliNoNom[0] ;
         zm1LW1771( -13) ;
      }
      pr_default.close(79);
      onLoadActions1LW1771( ) ;
   }

   public void onLoadActions1LW1771( )
   {
      GXt_int8 = A14296CliMarcaEx ;
      GXv_int9[0] = GXt_int8 ;
      new app.ficherosbasicos.marcaclienteexisteproduccion(remoteHandle, context).execute( A396EmprCod, A252CliCod, A12907CliMarcaID, GXv_int9) ;
      tclimarcas_impl.this.GXt_int8 = GXv_int9[0] ;
      A14296CliMarcaEx = (byte)(GXt_int8) ;
      A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14004ID_CliMarc", A14004ID_CliMarc);
   }

   public void checkExtendedTable1LW1771( )
   {
      nIsDirty_1771 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LW1771( ) ;
      /* Using cursor T01LW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A12907CliMarcaID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLIMARCAID_" + sGXsfl_41_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Marcas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliMarcaID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12908CliMarcaDc = T01LW4_A12908CliMarcaDc[0] ;
      n12908CliMarcaDc = T01LW4_n12908CliMarcaDc[0] ;
      pr_default.close(2);
      nIsDirty_1771 = (short)(1) ;
      GXt_int8 = A14296CliMarcaEx ;
      GXv_int9[0] = GXt_int8 ;
      new app.ficherosbasicos.marcaclienteexisteproduccion(remoteHandle, context).execute( A396EmprCod, A252CliCod, A12907CliMarcaID, GXv_int9) ;
      tclimarcas_impl.this.GXt_int8 = GXv_int9[0] ;
      A14296CliMarcaEx = (byte)(GXt_int8) ;
      nIsDirty_1771 = (short)(1) ;
      A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14004ID_CliMarc", A14004ID_CliMarc);
      if ( ! ( ( GXutil.strcmp(A14269CliNoNom, "S") == 0 ) || ( GXutil.strcmp(A14269CliNoNom, "N") == 0 ) ) )
      {
         GXCCtl = "CLINONOM_" + sGXsfl_41_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Omitir Nombre Cliente en Etiqueta ? ", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkCliNoNom.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1LW1771( )
   {
      pr_default.close(2);
   }

   public void enableDisable1LW1771( )
   {
   }

   public void gxload_14( String A396EmprCod ,
                          String A12907CliMarcaID )
   {
      /* Using cursor T01LW86 */
      pr_default.execute(80, new Object[] {A396EmprCod, A12907CliMarcaID});
      if ( (pr_default.getStatus(80) == 101) )
      {
         GXCCtl = "CLIMARCAID_" + sGXsfl_41_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Marcas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliMarcaID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12908CliMarcaDc = T01LW86_A12908CliMarcaDc[0] ;
      n12908CliMarcaDc = T01LW86_n12908CliMarcaDc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12908CliMarcaDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(80) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(80);
   }

   public void getKey1LW1771( )
   {
      /* Using cursor T01LW87 */
      pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound1771 = (short)(1) ;
      }
      else
      {
         RcdFound1771 = (short)(0) ;
      }
      pr_default.close(81);
   }

   public void getByPrimaryKey1LW1771( )
   {
      /* Using cursor T01LW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1LW1771( 13) ;
         RcdFound1771 = (short)(1) ;
         initializeNonKey1LW1771( ) ;
         A14269CliNoNom = T01LW3_A14269CliNoNom[0] ;
         A12907CliMarcaID = T01LW3_A12907CliMarcaID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z12907CliMarcaID = A12907CliMarcaID ;
         sMode1771 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LW1771( ) ;
         Gx_mode = sMode1771 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1771 = (short)(0) ;
         initializeNonKey1LW1771( ) ;
         sMode1771 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LW1771( ) ;
         Gx_mode = sMode1771 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LW1771( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LW1771( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIMAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14269CliNoNom, T01LW2_A14269CliNoNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14269CliNoNom, T01LW2_A14269CliNoNom[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tclimarcas:[seudo value changed for attri]"+"CliNoNom");
               GXutil.writeLogRaw("Old: ",Z14269CliNoNom);
               GXutil.writeLogRaw("Current: ",T01LW2_A14269CliNoNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIMAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LW1771( )
   {
      beforeValidate1LW1771( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LW1771( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LW1771( 0) ;
         checkOptimisticConcurrency1LW1771( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LW1771( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LW1771( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LW88 */
                  pr_default.execute(82, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A14269CliNoNom, A396EmprCod, A12907CliMarcaID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMAR");
                  if ( (pr_default.getStatus(82) == 1) )
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
            load1LW1771( ) ;
         }
         endLevel1LW1771( ) ;
      }
      closeExtendedTableCursors1LW1771( ) ;
   }

   public void update1LW1771( )
   {
      beforeValidate1LW1771( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LW1771( ) ;
      }
      if ( ( nIsMod_1771 != 0 ) || ( nIsDirty_1771 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LW1771( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LW1771( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LW1771( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LW89 */
                     pr_default.execute(83, new Object[] {A14269CliNoNom, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMAR");
                     if ( (pr_default.getStatus(83) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIMAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LW1771( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LW1771( ) ;
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
            endLevel1LW1771( ) ;
         }
      }
      closeExtendedTableCursors1LW1771( ) ;
   }

   public void deferredUpdate1LW1771( )
   {
   }

   public void delete1LW1771( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LW1771( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LW1771( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LW1771( ) ;
         afterConfirm1LW1771( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LW1771( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LW90 */
               pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A12907CliMarcaID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMAR");
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
      sMode1771 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LW1771( ) ;
      Gx_mode = sMode1771 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LW1771( )
   {
      standaloneModal1LW1771( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LW91 */
         pr_default.execute(85, new Object[] {A396EmprCod, A12907CliMarcaID});
         A12908CliMarcaDc = T01LW91_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = T01LW91_n12908CliMarcaDc[0] ;
         pr_default.close(85);
         GXt_int8 = A14296CliMarcaEx ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.marcaclienteexisteproduccion(remoteHandle, context).execute( A396EmprCod, A252CliCod, A12907CliMarcaID, GXv_int9) ;
         tclimarcas_impl.this.GXt_int8 = GXv_int9[0] ;
         A14296CliMarcaEx = (byte)(GXt_int8) ;
         if ( ( A14296CliMarcaEx == 1 ) && isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção, a marca está a ser utilizada na produção.", ""), 1, "");
            AnyError = (short)(1) ;
         }
         A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14004ID_CliMarc", A14004ID_CliMarc);
      }
   }

   public void endLevel1LW1771( )
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

   public void scanStart1LW1771( )
   {
      /* Scan By routine */
      /* Using cursor T01LW92 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1771 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1771 = (short)(1) ;
         A12907CliMarcaID = T01LW92_A12907CliMarcaID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LW1771( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound1771 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1771 = (short)(1) ;
         A12907CliMarcaID = T01LW92_A12907CliMarcaID[0] ;
      }
   }

   public void scanEnd1LW1771( )
   {
      pr_default.close(86);
   }

   public void afterConfirm1LW1771( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LW1771( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LW1771( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LW1771( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LW1771( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LW1771( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LW1771( )
   {
      edtCliMarcaID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliMarcaID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMarcaID_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      chkCliNoNom.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliNoNom.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliNoNom.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
      chkCliMarcaEx.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMarcaEx.getInternalname(), "Enabled", GXutil.ltrimstr( chkCliMarcaEx.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void send_integrity_lvl_hashes1LW1771( )
   {
   }

   public void send_integrity_lvl_hashes1LW21( )
   {
   }

   public void subsflControlProps_411771( )
   {
      edtCliMarcaID_Internalname = "CLIMARCAID_"+sGXsfl_41_idx ;
      chkCliNoNom.setInternalname( "CLINONOM_"+sGXsfl_41_idx );
      chkCliMarcaEx.setInternalname( "CLIMARCAEX_"+sGXsfl_41_idx );
   }

   public void subsflControlProps_fel_411771( )
   {
      edtCliMarcaID_Internalname = "CLIMARCAID_"+sGXsfl_41_fel_idx ;
      chkCliNoNom.setInternalname( "CLINONOM_"+sGXsfl_41_fel_idx );
      chkCliMarcaEx.setInternalname( "CLIMARCAEX_"+sGXsfl_41_fel_idx );
   }

   public void addRow1LW1771( )
   {
      nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_411771( ) ;
      sendRow1LW1771( ) ;
   }

   public void sendRow1LW1771( )
   {
      Gridlevel_marcasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_marcas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_marcas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_marcas_Class, "") != 0 )
         {
            subGridlevel_marcas_Linesclass = subGridlevel_marcas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_marcas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_marcas_Backstyle = (byte)(0) ;
         subGridlevel_marcas_Backcolor = subGridlevel_marcas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_marcas_Class, "") != 0 )
         {
            subGridlevel_marcas_Linesclass = subGridlevel_marcas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_marcas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_marcas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_marcas_Class, "") != 0 )
         {
            subGridlevel_marcas_Linesclass = subGridlevel_marcas_Class+"Odd" ;
         }
         subGridlevel_marcas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_marcas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_marcas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
         {
            subGridlevel_marcas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_marcas_Class, "") != 0 )
            {
               subGridlevel_marcas_Linesclass = subGridlevel_marcas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_marcas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_marcas_Class, "") != 0 )
            {
               subGridlevel_marcas_Linesclass = subGridlevel_marcas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1771_" + sGXsfl_41_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_41_idx + "',41)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_marcasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliMarcaID_Internalname,GXutil.rtrim( A12907CliMarcaID),GXutil.rtrim( localUtil.format( A12907CliMarcaID, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliMarcaID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliMarcaID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1771_" + sGXsfl_41_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_41_idx + "',41)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "CLINONOM_" + sGXsfl_41_idx ;
      chkCliNoNom.setName( GXCCtl );
      chkCliNoNom.setWebtags( "" );
      chkCliNoNom.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliNoNom.getInternalname(), "TitleCaption", chkCliNoNom.getCaption(), !bGXsfl_41_Refreshing);
      chkCliNoNom.setCheckedValue( "S" );
      A14269CliNoNom = ((GXutil.strcmp(GXutil.rtrim( A14269CliNoNom), "N")==0) ? "N" : "S") ;
      Gridlevel_marcasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliNoNom.getInternalname(),A14269CliNoNom,"","",Integer.valueOf(-1),Integer.valueOf(chkCliNoNom.getEnabled()),"N","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(43, this, 'N', 'S',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,43);\""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "CLIMARCAEX_" + sGXsfl_41_idx ;
      chkCliMarcaEx.setName( GXCCtl );
      chkCliMarcaEx.setWebtags( "" );
      chkCliMarcaEx.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMarcaEx.getInternalname(), "TitleCaption", chkCliMarcaEx.getCaption(), !bGXsfl_41_Refreshing);
      chkCliMarcaEx.setCheckedValue( "0" );
      A14296CliMarcaEx = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      Gridlevel_marcasRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliMarcaEx.getInternalname(),GXutil.str( A14296CliMarcaEx, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkCliMarcaEx.getEnabled()),"1","",StyleString,ClassString,"TrnColumn","",""});
      httpContext.ajax_sending_grid_row(Gridlevel_marcasRow);
      send_integrity_lvl_hashes1LW1771( ) ;
      GXCCtl = "Z12907CliMarcaID_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12907CliMarcaID));
      GXCCtl = "Z14269CliNoNom_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14269CliNoNom));
      GXCCtl = "nRcdDeleted_1771_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1771_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1771_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1771, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_41_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV38TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV38TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIMARCAID_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliMarcaID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINONOM_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliNoNom.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIMARCAEX_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkCliMarcaEx.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_marcasContainer.AddRow(Gridlevel_marcasRow);
   }

   public void readRow1LW1771( )
   {
      nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_411771( ) ;
      edtCliMarcaID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIMARCAID_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkCliNoNom.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLINONOM_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkCliMarcaEx.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIMARCAEX_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      A12907CliMarcaID = GXutil.upper( httpContext.cgiGet( edtCliMarcaID_Internalname)) ;
      A14269CliNoNom = ((GXutil.strcmp(httpContext.cgiGet( chkCliNoNom.getInternalname()), "N")==0) ? "N" : "S") ;
      A14296CliMarcaEx = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkCliMarcaEx.getInternalname()), "1")==0) ? 1 : 0)) ;
      GXCCtl = "Z12907CliMarcaID_" + sGXsfl_41_idx ;
      Z12907CliMarcaID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14269CliNoNom_" + sGXsfl_41_idx ;
      Z14269CliNoNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1771_" + sGXsfl_41_idx ;
      nRcdDeleted_1771 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1771_" + sGXsfl_41_idx ;
      nRcdExists_1771 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1771_" + sGXsfl_41_idx ;
      nIsMod_1771 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCliMarcaID_Enabled = edtCliMarcaID_Enabled ;
   }

   public void confirmValues1LW0( )
   {
      nGXsfl_41_idx = 0 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_411771( ) ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_411771( ) ;
         httpContext.changePostValue( "Z12907CliMarcaID_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z12907CliMarcaID_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12907CliMarcaID_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z14269CliNoNom_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z14269CliNoNom_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14269CliNoNom_"+sGXsfl_41_idx) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tclimarcas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIMARCAS");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tclimarcas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nGXsfl_41_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIMARCAID_DATA", AV40CliMarcaID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIMARCAID_DATA", AV40CliMarcaID_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV38TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV38TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV38TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIMARCASC", GXutil.ltrim( localUtil.ntoc( A14256CliMarcasc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIMARCADC", GXutil.rtrim( A12908CliMarcaDc));
      app.GxWebStd.gx_hidden_field( httpContext, "ID_CLIMARC", GXutil.rtrim( A14004ID_CliMarc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Objectcall", GXutil.rtrim( Combo_climarcaid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Cls", GXutil.rtrim( Combo_climarcaid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Enabled", GXutil.booltostr( Combo_climarcaid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Titlecontrolidtoreplace", GXutil.rtrim( Combo_climarcaid_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Isgriditem", GXutil.booltostr( Combo_climarcaid_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIMARCAID_Emptyitem", GXutil.booltostr( Combo_climarcaid_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tclimarcas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TCLIMARCAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ClientesvsMarcas", "") ;
   }

   public void initializeNonKey1LW21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A14256CliMarcasc = (short)(0) ;
      n14256CliMarcasc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14256CliMarcasc), 4, 0));
      Z279CliNom = "" ;
   }

   public void initAll1LW21( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey1LW21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LW1771( )
   {
      A14004ID_CliMarc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14004ID_CliMarc", A14004ID_CliMarc);
      A14296CliMarcaEx = (byte)(0) ;
      A12908CliMarcaDc = "" ;
      n12908CliMarcaDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12908CliMarcaDc", A12908CliMarcaDc);
      A14269CliNoNom = "" ;
      Z14269CliNoNom = "" ;
   }

   public void initAll1LW1771( )
   {
      A12907CliMarcaID = "" ;
      initializeNonKey1LW1771( ) ;
   }

   public void standaloneModalInsert1LW1771( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241594948", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tclimarcas.js", "?20268241594948", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1771( )
   {
      edtCliMarcaID_Enabled = defedtCliMarcaID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliMarcaID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliMarcaID_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void startgridcontrol41( )
   {
      Gridlevel_marcasContainer.AddObjectProperty("GridName", "Gridlevel_marcas");
      Gridlevel_marcasContainer.AddObjectProperty("Header", subGridlevel_marcas_Header);
      Gridlevel_marcasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_marcasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_marcasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_marcasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_marcasColumn.AddObjectProperty("Value", GXutil.rtrim( A12907CliMarcaID));
      Gridlevel_marcasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliMarcaID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddColumnProperties(Gridlevel_marcasColumn);
      Gridlevel_marcasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_marcasColumn.AddObjectProperty("Value", GXutil.rtrim( A14269CliNoNom));
      Gridlevel_marcasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkCliNoNom.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddColumnProperties(Gridlevel_marcasColumn);
      Gridlevel_marcasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_marcasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_marcasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkCliMarcaEx.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddColumnProperties(Gridlevel_marcasColumn);
      Gridlevel_marcasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_marcasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_marcas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtCliMarcaID_Internalname = "CLIMARCAID" ;
      chkCliNoNom.setInternalname( "CLINONOM" );
      chkCliMarcaEx.setInternalname( "CLIMARCAEX" );
      divTableleaflevel_marcas_Internalname = "TABLELEAFLEVEL_MARCAS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_climarcaid_Internalname = "COMBO_CLIMARCAID" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_marcas_Internalname = "GRIDLEVEL_MARCAS" ;
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
      subGridlevel_marcas_Allowcollapsing = (byte)(0) ;
      subGridlevel_marcas_Allowselection = (byte)(0) ;
      subGridlevel_marcas_Header = "" ;
      Combo_climarcaid_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ClientesvsMarcas", "") );
      chkCliMarcaEx.setCaption( "" );
      chkCliNoNom.setCaption( "" );
      edtCliMarcaID_Jsonclick = "" ;
      subGridlevel_marcas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_marcas_Backcolorstyle = (byte)(0) ;
      Combo_climarcaid_Titlecontrolidtoreplace = "" ;
      chkCliMarcaEx.setEnabled( 0 );
      chkCliNoNom.setEnabled( 1 );
      edtCliMarcaID_Enabled = 1 ;
      Combo_climarcaid_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_climarcaid_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_climarcaid_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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

   public void gx7asaclimarcaex1LW1771( String A396EmprCod ,
                                        int A252CliCod ,
                                        String A12907CliMarcaID )
   {
      GXt_int8 = A14296CliMarcaEx ;
      GXv_int9[0] = GXt_int8 ;
      new app.ficherosbasicos.marcaclienteexisteproduccion(remoteHandle, context).execute( A396EmprCod, A252CliCod, A12907CliMarcaID, GXv_int9) ;
      tclimarcas_impl.this.GXt_int8 = GXv_int9[0] ;
      A14296CliMarcaEx = (byte)(GXt_int8) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_marcas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_411771( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LW1771( ) ;
         standaloneModal1LW1771( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LW1771( ) ;
         nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_411771( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_marcasContainer)) ;
      /* End function gxnrGridlevel_marcas_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "CLINONOM_" + sGXsfl_41_idx ;
      chkCliNoNom.setName( GXCCtl );
      chkCliNoNom.setWebtags( "" );
      chkCliNoNom.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliNoNom.getInternalname(), "TitleCaption", chkCliNoNom.getCaption(), !bGXsfl_41_Refreshing);
      chkCliNoNom.setCheckedValue( "S" );
      A14269CliNoNom = ((GXutil.strcmp(GXutil.rtrim( A14269CliNoNom), "N")==0) ? "N" : "S") ;
      GXCCtl = "CLIMARCAEX_" + sGXsfl_41_idx ;
      chkCliMarcaEx.setName( GXCCtl );
      chkCliMarcaEx.setWebtags( "" );
      chkCliMarcaEx.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMarcaEx.getInternalname(), "TitleCaption", chkCliMarcaEx.getCaption(), !bGXsfl_41_Refreshing);
      chkCliMarcaEx.setCheckedValue( "0" );
      A14296CliMarcaEx = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      n14256CliMarcasc = false ;
      /* Using cursor T01LW21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A14256CliMarcasc = T01LW21_A14256CliMarcasc[0] ;
         n14256CliMarcasc = T01LW21_n14256CliMarcasc[0] ;
      }
      else
      {
         A14256CliMarcasc = (short)(0) ;
         n14256CliMarcasc = false ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14256CliMarcasc", GXutil.ltrim( localUtil.ntoc( A14256CliMarcasc, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Climarcaid( )
   {
      n252CliCod = false ;
      n12908CliMarcaDc = false ;
      /* Using cursor T01LW91 */
      pr_default.execute(85, new Object[] {A396EmprCod, A12907CliMarcaID});
      if ( (pr_default.getStatus(85) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Marcas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIMARCAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliMarcaID_Internalname ;
      }
      A12908CliMarcaDc = T01LW91_A12908CliMarcaDc[0] ;
      n12908CliMarcaDc = T01LW91_n12908CliMarcaDc[0] ;
      pr_default.close(85);
      GXt_int8 = A14296CliMarcaEx ;
      GXv_int9[0] = GXt_int8 ;
      new app.ficherosbasicos.marcaclienteexisteproduccion(remoteHandle, context).execute( A396EmprCod, A252CliCod, A12907CliMarcaID, GXv_int9) ;
      tclimarcas_impl.this.GXt_int8 = GXv_int9[0] ;
      A14296CliMarcaEx = (byte)(GXt_int8) ;
      if ( ( A14296CliMarcaEx == 1 ) && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção, a marca está a ser utilizada na produção.", ""), 1, "CLIMARCAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliMarcaID_Internalname ;
      }
      A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
      dynload_actions( ) ;
      A14296CliMarcaEx = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12908CliMarcaDc", GXutil.rtrim( A12908CliMarcaDc));
      httpContext.ajax_rsp_assign_attri("", false, "A14296CliMarcaEx", GXutil.ltrim( localUtil.ntoc( A14296CliMarcaEx, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14004ID_CliMarc", GXutil.rtrim( A14004ID_CliMarc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121LW2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A14256CliMarcasc',fld:'CLIMARCASC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A14256CliMarcasc',fld:'CLIMARCASC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CLIMARCAID","{handler:'valid_Climarcaid',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12907CliMarcaID',fld:'CLIMARCAID',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A14296CliMarcaEx',fld:'CLIMARCAEX',pic:'9'},{av:'A12908CliMarcaDc',fld:'CLIMARCADC',pic:''},{av:'A14004ID_CliMarc',fld:'ID_CLIMARC',pic:''}]");
      setEventMetadata("VALID_CLIMARCAID",",oparms:[{av:'A12908CliMarcaDc',fld:'CLIMARCADC',pic:''},{av:'A14296CliMarcaEx',fld:'CLIMARCAEX',pic:'9'},{av:'A14004ID_CliMarc',fld:'ID_CLIMARC',pic:''}]}");
      setEventMetadata("VALID_CLINONOM","{handler:'valid_Clinonom',iparms:[]");
      setEventMetadata("VALID_CLINONOM",",oparms:[]}");
      setEventMetadata("VALID_CLIMARCAEX","{handler:'valid_Climarcaex',iparms:[]");
      setEventMetadata("VALID_CLIMARCAEX",",oparms:[]}");
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
      pr_default.close(85);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z12907CliMarcaID = "" ;
      Z14269CliNoNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A12907CliMarcaID = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV44Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_climarcaid = new com.genexus.webpanels.GXUserControl();
      Combo_climarcaid_Caption = "" ;
      AV40CliMarcaID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_marcasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1771 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A12908CliMarcaDc = "" ;
      A14004ID_CliMarc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_climarcaid_Objectcall = "" ;
      Combo_climarcaid_Class = "" ;
      Combo_climarcaid_Icontype = "" ;
      Combo_climarcaid_Icon = "" ;
      Combo_climarcaid_Tooltip = "" ;
      Combo_climarcaid_Selectedvalue_set = "" ;
      Combo_climarcaid_Selectedvalue_get = "" ;
      Combo_climarcaid_Selectedtext_set = "" ;
      Combo_climarcaid_Selectedtext_get = "" ;
      Combo_climarcaid_Gamoauthtoken = "" ;
      Combo_climarcaid_Ddointernalname = "" ;
      Combo_climarcaid_Titlecontrolalign = "" ;
      Combo_climarcaid_Dropdownoptionstype = "" ;
      Combo_climarcaid_Datalisttype = "" ;
      Combo_climarcaid_Datalistfixedvalues = "" ;
      Combo_climarcaid_Datalistproc = "" ;
      Combo_climarcaid_Datalistprocparametersprefix = "" ;
      Combo_climarcaid_Remoteservicesparameters = "" ;
      Combo_climarcaid_Htmltemplate = "" ;
      Combo_climarcaid_Multiplevaluestype = "" ;
      Combo_climarcaid_Loadingdata = "" ;
      Combo_climarcaid_Noresultsfound = "" ;
      Combo_climarcaid_Emptyitemtext = "" ;
      Combo_climarcaid_Onlyselectedvalues = "" ;
      Combo_climarcaid_Selectalltext = "" ;
      Combo_climarcaid_Multiplevaluesseparator = "" ;
      Combo_climarcaid_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode21 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14269CliNoNom = "" ;
      T01LW6_A14256CliMarcasc = new short[1] ;
      T01LW6_n14256CliMarcasc = new boolean[] {false} ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      AV37WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV39WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01LW9_A407EmprNom = new String[] {""} ;
      T01LW9_n407EmprNom = new boolean[] {false} ;
      T01LW11_A252CliCod = new int[1] ;
      T01LW11_n252CliCod = new boolean[] {false} ;
      T01LW11_A407EmprNom = new String[] {""} ;
      T01LW11_n407EmprNom = new boolean[] {false} ;
      T01LW11_A279CliNom = new String[] {""} ;
      T01LW11_A396EmprCod = new String[] {""} ;
      T01LW11_A14256CliMarcasc = new short[1] ;
      T01LW11_n14256CliMarcasc = new boolean[] {false} ;
      T01LW13_A14256CliMarcasc = new short[1] ;
      T01LW13_n14256CliMarcasc = new boolean[] {false} ;
      T01LW14_A396EmprCod = new String[] {""} ;
      T01LW14_A252CliCod = new int[1] ;
      T01LW14_n252CliCod = new boolean[] {false} ;
      T01LW8_A252CliCod = new int[1] ;
      T01LW8_n252CliCod = new boolean[] {false} ;
      T01LW8_A279CliNom = new String[] {""} ;
      T01LW8_A396EmprCod = new String[] {""} ;
      T01LW15_A396EmprCod = new String[] {""} ;
      T01LW15_A252CliCod = new int[1] ;
      T01LW15_n252CliCod = new boolean[] {false} ;
      T01LW16_A396EmprCod = new String[] {""} ;
      T01LW16_A252CliCod = new int[1] ;
      T01LW16_n252CliCod = new boolean[] {false} ;
      T01LW7_A252CliCod = new int[1] ;
      T01LW7_n252CliCod = new boolean[] {false} ;
      T01LW7_A279CliNom = new String[] {""} ;
      T01LW7_A396EmprCod = new String[] {""} ;
      T01LW21_A14256CliMarcasc = new short[1] ;
      T01LW21_n14256CliMarcasc = new boolean[] {false} ;
      T01LW22_A396EmprCod = new String[] {""} ;
      T01LW22_A252CliCod = new int[1] ;
      T01LW22_n252CliCod = new boolean[] {false} ;
      T01LW22_A6930Lb_rclin = new int[1] ;
      T01LW23_A396EmprCod = new String[] {""} ;
      T01LW23_A6850Tex_NPed = new int[1] ;
      T01LW24_A396EmprCod = new String[] {""} ;
      T01LW24_A252CliCod = new int[1] ;
      T01LW24_n252CliCod = new boolean[] {false} ;
      T01LW24_A829TipArtCod = new short[1] ;
      T01LW24_A831TipColCod = new byte[1] ;
      T01LW24_A583IntCod = new byte[1] ;
      T01LW24_A5098TipDisCod = new String[] {""} ;
      T01LW24_A6603Est1_anyo = new short[1] ;
      T01LW24_A6604Est1_mes = new byte[1] ;
      T01LW24_A6605Est1_dia = new byte[1] ;
      T01LW25_A396EmprCod = new String[] {""} ;
      T01LW25_A6319C_Barcod = new int[1] ;
      T01LW25_A6320C_Barcodre = new byte[1] ;
      T01LW25_A6321C_Barcodpa = new String[] {""} ;
      T01LW25_A6322C_Reclinma = new short[1] ;
      T01LW26_A396EmprCod = new String[] {""} ;
      T01LW26_A6235DevEmpCod = new int[1] ;
      T01LW27_A396EmprCod = new String[] {""} ;
      T01LW27_A602MaqCod = new String[] {""} ;
      T01LW27_A6078MaqCliCod = new int[1] ;
      T01LW27_A6079MaqArtCod = new String[] {""} ;
      T01LW28_A396EmprCod = new String[] {""} ;
      T01LW28_A5532Lb_numero = new int[1] ;
      T01LW29_A396EmprCod = new String[] {""} ;
      T01LW29_A252CliCod = new int[1] ;
      T01LW29_n252CliCod = new boolean[] {false} ;
      T01LW29_A5503CliifLin = new short[1] ;
      T01LW30_A396EmprCod = new String[] {""} ;
      T01LW30_A252CliCod = new int[1] ;
      T01LW30_n252CliCod = new boolean[] {false} ;
      T01LW30_A5499ClieiLin = new short[1] ;
      T01LW31_A396EmprCod = new String[] {""} ;
      T01LW31_A252CliCod = new int[1] ;
      T01LW31_n252CliCod = new boolean[] {false} ;
      T01LW31_A5495ClidtLin = new short[1] ;
      T01LW32_A396EmprCod = new String[] {""} ;
      T01LW32_A252CliCod = new int[1] ;
      T01LW32_n252CliCod = new boolean[] {false} ;
      T01LW32_A5491CliedLin = new short[1] ;
      T01LW33_A396EmprCod = new String[] {""} ;
      T01LW33_A252CliCod = new int[1] ;
      T01LW33_n252CliCod = new boolean[] {false} ;
      T01LW33_A5452P_ForCod = new String[] {""} ;
      T01LW34_A396EmprCod = new String[] {""} ;
      T01LW34_A252CliCod = new int[1] ;
      T01LW34_n252CliCod = new boolean[] {false} ;
      T01LW34_A5443Mdl_Cod = new String[] {""} ;
      T01LW35_A396EmprCod = new String[] {""} ;
      T01LW35_A252CliCod = new int[1] ;
      T01LW35_n252CliCod = new boolean[] {false} ;
      T01LW35_A5436IntCodF2 = new short[1] ;
      T01LW36_A396EmprCod = new String[] {""} ;
      T01LW36_A252CliCod = new int[1] ;
      T01LW36_n252CliCod = new boolean[] {false} ;
      T01LW36_A5396IntCodFC = new byte[1] ;
      T01LW36_A5434Tip_ColC = new byte[1] ;
      T01LW37_A396EmprCod = new String[] {""} ;
      T01LW37_A252CliCod = new int[1] ;
      T01LW37_n252CliCod = new boolean[] {false} ;
      T01LW37_A5428FasPreCod = new String[] {""} ;
      T01LW38_A396EmprCod = new String[] {""} ;
      T01LW38_A252CliCod = new int[1] ;
      T01LW38_n252CliCod = new boolean[] {false} ;
      T01LW38_A5398Cli_Proc = new String[] {""} ;
      T01LW39_A396EmprCod = new String[] {""} ;
      T01LW39_A5130PagIden = new int[1] ;
      T01LW40_A396EmprCod = new String[] {""} ;
      T01LW40_A5059Hl_hdr = new int[1] ;
      T01LW40_A5060Hl_hdrr = new byte[1] ;
      T01LW40_A5061Hl_hdrp = new String[] {""} ;
      T01LW41_A396EmprCod = new String[] {""} ;
      T01LW41_A252CliCod = new int[1] ;
      T01LW41_n252CliCod = new boolean[] {false} ;
      T01LW41_A4718DishCod = new String[] {""} ;
      T01LW41_A5020TipEstCod = new byte[1] ;
      T01LW41_A5022GraCod = new byte[1] ;
      T01LW42_A396EmprCod = new String[] {""} ;
      T01LW42_A4618EnsLCod = new int[1] ;
      T01LW43_A396EmprCod = new String[] {""} ;
      T01LW43_A4492HreBarCod = new int[1] ;
      T01LW43_A4493HreBarReo = new byte[1] ;
      T01LW43_A4494HreBarPar = new String[] {""} ;
      T01LW43_A4495HreNumCie = new byte[1] ;
      T01LW44_A396EmprCod = new String[] {""} ;
      T01LW44_A252CliCod = new int[1] ;
      T01LW44_n252CliCod = new boolean[] {false} ;
      T01LW44_A4415EstCol = new String[] {""} ;
      T01LW45_A396EmprCod = new String[] {""} ;
      T01LW45_A4185WEBUSU = new String[] {""} ;
      T01LW46_A396EmprCod = new String[] {""} ;
      T01LW46_A252CliCod = new int[1] ;
      T01LW46_n252CliCod = new boolean[] {false} ;
      T01LW46_A4079WEBDISCOD = new String[] {""} ;
      T01LW46_A4078EMPCOD = new String[] {""} ;
      T01LW47_A396EmprCod = new String[] {""} ;
      T01LW47_A2637HisEstHRu = new int[1] ;
      T01LW47_A2636HisEstHRe = new byte[1] ;
      T01LW47_A2635HisEstHPa = new String[] {""} ;
      T01LW47_A2638HisEstLCo = new byte[1] ;
      T01LW47_A2630HisEstCom = new String[] {""} ;
      T01LW47_A2634HisEstFon = new String[] {""} ;
      T01LW48_A396EmprCod = new String[] {""} ;
      T01LW48_A2574GrpDibCod = new int[1] ;
      T01LW49_A396EmprCod = new String[] {""} ;
      T01LW49_A2558GrmDibCod = new int[1] ;
      T01LW50_A396EmprCod = new String[] {""} ;
      T01LW50_A2542GrcDibCod = new int[1] ;
      T01LW51_A396EmprCod = new String[] {""} ;
      T01LW51_A1031EmpesCod = new String[] {""} ;
      T01LW51_A252CliCod = new int[1] ;
      T01LW51_n252CliCod = new boolean[] {false} ;
      T01LW51_A1032FonCod = new String[] {""} ;
      T01LW52_A396EmprCod = new String[] {""} ;
      T01LW52_A1013DibCli = new String[] {""} ;
      T01LW52_A252CliCod = new int[1] ;
      T01LW52_n252CliCod = new boolean[] {false} ;
      T01LW52_A1014DibInt = new int[1] ;
      T01LW53_A396EmprCod = new String[] {""} ;
      T01LW53_A1736AlbExtCod = new long[1] ;
      T01LW54_A396EmprCod = new String[] {""} ;
      T01LW54_A252CliCod = new int[1] ;
      T01LW54_n252CliCod = new boolean[] {false} ;
      T01LW54_A3661FacProAny = new short[1] ;
      T01LW54_A3662FacProSer = new String[] {""} ;
      T01LW54_A3663FacProInt = new byte[1] ;
      T01LW54_A3664FacProTip = new byte[1] ;
      T01LW54_A3665FacProTar = new short[1] ;
      T01LW55_A396EmprCod = new String[] {""} ;
      T01LW55_A3646EstTinAny = new short[1] ;
      T01LW55_A3647EstTinMes = new byte[1] ;
      T01LW55_A3648EstTinDia = new byte[1] ;
      T01LW55_A1929EstTinNr = new short[1] ;
      T01LW56_A396EmprCod = new String[] {""} ;
      T01LW56_A3617AlbTrnCod = new long[1] ;
      T01LW57_A396EmprCod = new String[] {""} ;
      T01LW57_A252CliCod = new int[1] ;
      T01LW57_n252CliCod = new boolean[] {false} ;
      T01LW57_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LW58_A396EmprCod = new String[] {""} ;
      T01LW58_A3073RepCod = new String[] {""} ;
      T01LW58_A252CliCod = new int[1] ;
      T01LW58_n252CliCod = new boolean[] {false} ;
      T01LW59_A396EmprCod = new String[] {""} ;
      T01LW59_A3061Codia = new byte[1] ;
      T01LW59_A3062CoMes = new byte[1] ;
      T01LW59_A3063CoAny = new short[1] ;
      T01LW59_A3065CoLin = new byte[1] ;
      T01LW59_A3010CoBarCod = new int[1] ;
      T01LW59_A3011CoBarReo = new byte[1] ;
      T01LW59_A3012CoBarPar = new String[] {""} ;
      T01LW60_A396EmprCod = new String[] {""} ;
      T01LW60_A2971SabFacCod = new int[1] ;
      T01LW61_A396EmprCod = new String[] {""} ;
      T01LW61_A2954TiDia = new byte[1] ;
      T01LW61_A2955TiMes = new byte[1] ;
      T01LW61_A2956TiAny = new short[1] ;
      T01LW61_A2958TiLin = new byte[1] ;
      T01LW61_A2959TiBarCod = new int[1] ;
      T01LW61_A2960TiBarReo = new byte[1] ;
      T01LW61_A2961TiBarPar = new String[] {""} ;
      T01LW62_A396EmprCod = new String[] {""} ;
      T01LW62_A252CliCod = new int[1] ;
      T01LW62_n252CliCod = new boolean[] {false} ;
      T01LW62_A2933RecTipCon = new short[1] ;
      T01LW63_A396EmprCod = new String[] {""} ;
      T01LW63_A252CliCod = new int[1] ;
      T01LW63_n252CliCod = new boolean[] {false} ;
      T01LW63_A2927RecProCod = new String[] {""} ;
      T01LW64_A396EmprCod = new String[] {""} ;
      T01LW64_A252CliCod = new int[1] ;
      T01LW64_n252CliCod = new boolean[] {false} ;
      T01LW64_A2891HMaForSer = new String[] {""} ;
      T01LW64_A2892HMaForCNom = new String[] {""} ;
      T01LW64_A2893HMaForCNum = new int[1] ;
      T01LW64_A2894HMaTipCCod = new byte[1] ;
      T01LW64_A2895HMaForNumC = new int[1] ;
      T01LW64_A2897HMaColLin = new short[1] ;
      T01LW64_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01LW64_A2907HmaLin = new short[1] ;
      T01LW65_A396EmprCod = new String[] {""} ;
      T01LW65_A252CliCod = new int[1] ;
      T01LW65_n252CliCod = new boolean[] {false} ;
      T01LW65_A425EstAny = new short[1] ;
      T01LW65_A2755EstSerFac = new String[] {""} ;
      T01LW66_A396EmprCod = new String[] {""} ;
      T01LW66_A2730RecTipCo = new short[1] ;
      T01LW66_A252CliCod = new int[1] ;
      T01LW66_n252CliCod = new boolean[] {false} ;
      T01LW67_A396EmprCod = new String[] {""} ;
      T01LW67_A2720TarSec = new String[] {""} ;
      T01LW67_A252CliCod = new int[1] ;
      T01LW67_n252CliCod = new boolean[] {false} ;
      T01LW67_A829TipArtCod = new short[1] ;
      T01LW67_A831TipColCod = new byte[1] ;
      T01LW68_A396EmprCod = new String[] {""} ;
      T01LW68_A2382AbcTerCod = new String[] {""} ;
      T01LW68_A2381AbcSec = new String[] {""} ;
      T01LW68_A252CliCod = new int[1] ;
      T01LW68_n252CliCod = new boolean[] {false} ;
      T01LW69_A396EmprCod = new String[] {""} ;
      T01LW69_A252CliCod = new int[1] ;
      T01LW69_n252CliCod = new boolean[] {false} ;
      T01LW69_A2308CliDesCod = new int[1] ;
      T01LW70_A396EmprCod = new String[] {""} ;
      T01LW70_A2268MovParCod = new String[] {""} ;
      T01LW70_A252CliCod = new int[1] ;
      T01LW70_n252CliCod = new boolean[] {false} ;
      T01LW71_A396EmprCod = new String[] {""} ;
      T01LW71_A966PartCod = new String[] {""} ;
      T01LW71_A252CliCod = new int[1] ;
      T01LW71_n252CliCod = new boolean[] {false} ;
      T01LW72_A396EmprCod = new String[] {""} ;
      T01LW72_A1387AlbPrvCod = new int[1] ;
      T01LW73_A396EmprCod = new String[] {""} ;
      T01LW73_A252CliCod = new int[1] ;
      T01LW73_n252CliCod = new boolean[] {false} ;
      T01LW73_A1213TalCod = new String[] {""} ;
      T01LW74_A396EmprCod = new String[] {""} ;
      T01LW74_A252CliCod = new int[1] ;
      T01LW74_n252CliCod = new boolean[] {false} ;
      T01LW74_A457FasCod = new String[] {""} ;
      T01LW75_A396EmprCod = new String[] {""} ;
      T01LW75_A539HisBarCod = new int[1] ;
      T01LW75_A545HisCodReo = new byte[1] ;
      T01LW75_A544HisCodPar = new String[] {""} ;
      T01LW75_A833TipDefCod = new short[1] ;
      T01LW76_A396EmprCod = new String[] {""} ;
      T01LW76_A506HbaBarCod = new int[1] ;
      T01LW76_A508HbaBarReo = new byte[1] ;
      T01LW76_A507HbaBarPar = new String[] {""} ;
      T01LW77_A396EmprCod = new String[] {""} ;
      T01LW77_A252CliCod = new int[1] ;
      T01LW77_n252CliCod = new boolean[] {false} ;
      T01LW77_A494ForSer = new String[] {""} ;
      T01LW77_A482ForColNom = new String[] {""} ;
      T01LW77_A483ForColNum = new int[1] ;
      T01LW77_A831TipColCod = new byte[1] ;
      T01LW78_A396EmprCod = new String[] {""} ;
      T01LW78_A252CliCod = new int[1] ;
      T01LW78_n252CliCod = new boolean[] {false} ;
      T01LW78_A287CliPagLin = new byte[1] ;
      T01LW79_A396EmprCod = new String[] {""} ;
      T01LW79_A252CliCod = new int[1] ;
      T01LW79_n252CliCod = new boolean[] {false} ;
      T01LW79_A266CliEnvLin = new byte[1] ;
      T01LW80_A396EmprCod = new String[] {""} ;
      T01LW80_A252CliCod = new int[1] ;
      T01LW80_n252CliCod = new boolean[] {false} ;
      T01LW80_A65ArtCod = new String[] {""} ;
      T01LW81_A396EmprCod = new String[] {""} ;
      T01LW81_A44AlbRecCod = new int[1] ;
      T01LW82_A396EmprCod = new String[] {""} ;
      T01LW82_A30AlbProCod = new long[1] ;
      T01LW83_A396EmprCod = new String[] {""} ;
      T01LW83_A14AlbComCod = new int[1] ;
      T01LW84_A396EmprCod = new String[] {""} ;
      T01LW84_A252CliCod = new int[1] ;
      T01LW84_n252CliCod = new boolean[] {false} ;
      Z12908CliMarcaDc = "" ;
      T01LW85_A252CliCod = new int[1] ;
      T01LW85_n252CliCod = new boolean[] {false} ;
      T01LW85_A12908CliMarcaDc = new String[] {""} ;
      T01LW85_n12908CliMarcaDc = new boolean[] {false} ;
      T01LW85_A14269CliNoNom = new String[] {""} ;
      T01LW85_A396EmprCod = new String[] {""} ;
      T01LW85_A12907CliMarcaID = new String[] {""} ;
      T01LW4_A12908CliMarcaDc = new String[] {""} ;
      T01LW4_n12908CliMarcaDc = new boolean[] {false} ;
      T01LW86_A12908CliMarcaDc = new String[] {""} ;
      T01LW86_n12908CliMarcaDc = new boolean[] {false} ;
      T01LW87_A396EmprCod = new String[] {""} ;
      T01LW87_A252CliCod = new int[1] ;
      T01LW87_n252CliCod = new boolean[] {false} ;
      T01LW87_A12907CliMarcaID = new String[] {""} ;
      T01LW3_A252CliCod = new int[1] ;
      T01LW3_n252CliCod = new boolean[] {false} ;
      T01LW3_A14269CliNoNom = new String[] {""} ;
      T01LW3_A396EmprCod = new String[] {""} ;
      T01LW3_A12907CliMarcaID = new String[] {""} ;
      T01LW2_A252CliCod = new int[1] ;
      T01LW2_n252CliCod = new boolean[] {false} ;
      T01LW2_A14269CliNoNom = new String[] {""} ;
      T01LW2_A396EmprCod = new String[] {""} ;
      T01LW2_A12907CliMarcaID = new String[] {""} ;
      T01LW91_A12908CliMarcaDc = new String[] {""} ;
      T01LW91_n12908CliMarcaDc = new boolean[] {false} ;
      T01LW92_A396EmprCod = new String[] {""} ;
      T01LW92_A252CliCod = new int[1] ;
      T01LW92_n252CliCod = new boolean[] {false} ;
      T01LW92_A12907CliMarcaID = new String[] {""} ;
      Gridlevel_marcasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_marcas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_marcasColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int9 = new short[1] ;
      Z14004ID_CliMarc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcas__default(),
         new Object[] {
             new Object[] {
            T01LW2_A252CliCod, T01LW2_A14269CliNoNom, T01LW2_A396EmprCod, T01LW2_A12907CliMarcaID
            }
            , new Object[] {
            T01LW3_A252CliCod, T01LW3_A14269CliNoNom, T01LW3_A396EmprCod, T01LW3_A12907CliMarcaID
            }
            , new Object[] {
            T01LW4_A12908CliMarcaDc, T01LW4_n12908CliMarcaDc
            }
            , new Object[] {
            T01LW6_A14256CliMarcasc, T01LW6_n14256CliMarcasc
            }
            , new Object[] {
            T01LW7_A252CliCod, T01LW7_A279CliNom, T01LW7_A396EmprCod
            }
            , new Object[] {
            T01LW8_A252CliCod, T01LW8_A279CliNom, T01LW8_A396EmprCod
            }
            , new Object[] {
            T01LW9_A407EmprNom, T01LW9_n407EmprNom
            }
            , new Object[] {
            T01LW11_A252CliCod, T01LW11_A407EmprNom, T01LW11_n407EmprNom, T01LW11_A279CliNom, T01LW11_A396EmprCod, T01LW11_A14256CliMarcasc, T01LW11_n14256CliMarcasc
            }
            , new Object[] {
            T01LW13_A14256CliMarcasc, T01LW13_n14256CliMarcasc
            }
            , new Object[] {
            T01LW14_A396EmprCod, T01LW14_A252CliCod
            }
            , new Object[] {
            T01LW15_A396EmprCod, T01LW15_A252CliCod
            }
            , new Object[] {
            T01LW16_A396EmprCod, T01LW16_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LW21_A14256CliMarcasc, T01LW21_n14256CliMarcasc
            }
            , new Object[] {
            T01LW22_A396EmprCod, T01LW22_A252CliCod, T01LW22_A6930Lb_rclin
            }
            , new Object[] {
            T01LW23_A396EmprCod, T01LW23_A6850Tex_NPed
            }
            , new Object[] {
            T01LW24_A396EmprCod, T01LW24_A252CliCod, T01LW24_A829TipArtCod, T01LW24_A831TipColCod, T01LW24_A583IntCod, T01LW24_A5098TipDisCod, T01LW24_A6603Est1_anyo, T01LW24_A6604Est1_mes, T01LW24_A6605Est1_dia
            }
            , new Object[] {
            T01LW25_A396EmprCod, T01LW25_A6319C_Barcod, T01LW25_A6320C_Barcodre, T01LW25_A6321C_Barcodpa, T01LW25_A6322C_Reclinma
            }
            , new Object[] {
            T01LW26_A396EmprCod, T01LW26_A6235DevEmpCod
            }
            , new Object[] {
            T01LW27_A396EmprCod, T01LW27_A602MaqCod, T01LW27_A6078MaqCliCod, T01LW27_A6079MaqArtCod
            }
            , new Object[] {
            T01LW28_A396EmprCod, T01LW28_A5532Lb_numero
            }
            , new Object[] {
            T01LW29_A396EmprCod, T01LW29_A252CliCod, T01LW29_A5503CliifLin
            }
            , new Object[] {
            T01LW30_A396EmprCod, T01LW30_A252CliCod, T01LW30_A5499ClieiLin
            }
            , new Object[] {
            T01LW31_A396EmprCod, T01LW31_A252CliCod, T01LW31_A5495ClidtLin
            }
            , new Object[] {
            T01LW32_A396EmprCod, T01LW32_A252CliCod, T01LW32_A5491CliedLin
            }
            , new Object[] {
            T01LW33_A396EmprCod, T01LW33_A252CliCod, T01LW33_A5452P_ForCod
            }
            , new Object[] {
            T01LW34_A396EmprCod, T01LW34_A252CliCod, T01LW34_A5443Mdl_Cod
            }
            , new Object[] {
            T01LW35_A396EmprCod, T01LW35_A252CliCod, T01LW35_A5436IntCodF2
            }
            , new Object[] {
            T01LW36_A396EmprCod, T01LW36_A252CliCod, T01LW36_A5396IntCodFC, T01LW36_A5434Tip_ColC
            }
            , new Object[] {
            T01LW37_A396EmprCod, T01LW37_A252CliCod, T01LW37_A5428FasPreCod
            }
            , new Object[] {
            T01LW38_A396EmprCod, T01LW38_A252CliCod, T01LW38_A5398Cli_Proc
            }
            , new Object[] {
            T01LW39_A396EmprCod, T01LW39_A5130PagIden
            }
            , new Object[] {
            T01LW40_A396EmprCod, T01LW40_A5059Hl_hdr, T01LW40_A5060Hl_hdrr, T01LW40_A5061Hl_hdrp
            }
            , new Object[] {
            T01LW41_A396EmprCod, T01LW41_A252CliCod, T01LW41_A4718DishCod, T01LW41_A5020TipEstCod, T01LW41_A5022GraCod
            }
            , new Object[] {
            T01LW42_A396EmprCod, T01LW42_A4618EnsLCod
            }
            , new Object[] {
            T01LW43_A396EmprCod, T01LW43_A4492HreBarCod, T01LW43_A4493HreBarReo, T01LW43_A4494HreBarPar, T01LW43_A4495HreNumCie
            }
            , new Object[] {
            T01LW44_A396EmprCod, T01LW44_A252CliCod, T01LW44_A4415EstCol
            }
            , new Object[] {
            T01LW45_A396EmprCod, T01LW45_A4185WEBUSU
            }
            , new Object[] {
            T01LW46_A396EmprCod, T01LW46_A252CliCod, T01LW46_A4079WEBDISCOD, T01LW46_A4078EMPCOD
            }
            , new Object[] {
            T01LW47_A396EmprCod, T01LW47_A2637HisEstHRu, T01LW47_A2636HisEstHRe, T01LW47_A2635HisEstHPa, T01LW47_A2638HisEstLCo, T01LW47_A2630HisEstCom, T01LW47_A2634HisEstFon
            }
            , new Object[] {
            T01LW48_A396EmprCod, T01LW48_A2574GrpDibCod
            }
            , new Object[] {
            T01LW49_A396EmprCod, T01LW49_A2558GrmDibCod
            }
            , new Object[] {
            T01LW50_A396EmprCod, T01LW50_A2542GrcDibCod
            }
            , new Object[] {
            T01LW51_A396EmprCod, T01LW51_A1031EmpesCod, T01LW51_A252CliCod, T01LW51_A1032FonCod
            }
            , new Object[] {
            T01LW52_A396EmprCod, T01LW52_A1013DibCli, T01LW52_A252CliCod, T01LW52_A1014DibInt
            }
            , new Object[] {
            T01LW53_A396EmprCod, T01LW53_A1736AlbExtCod
            }
            , new Object[] {
            T01LW54_A396EmprCod, T01LW54_A252CliCod, T01LW54_A3661FacProAny, T01LW54_A3662FacProSer, T01LW54_A3663FacProInt, T01LW54_A3664FacProTip, T01LW54_A3665FacProTar
            }
            , new Object[] {
            T01LW55_A396EmprCod, T01LW55_A3646EstTinAny, T01LW55_A3647EstTinMes, T01LW55_A3648EstTinDia, T01LW55_A1929EstTinNr
            }
            , new Object[] {
            T01LW56_A396EmprCod, T01LW56_A3617AlbTrnCod
            }
            , new Object[] {
            T01LW57_A396EmprCod, T01LW57_A252CliCod, T01LW57_A3320CliLimKgs
            }
            , new Object[] {
            T01LW58_A396EmprCod, T01LW58_A3073RepCod, T01LW58_A252CliCod
            }
            , new Object[] {
            T01LW59_A396EmprCod, T01LW59_A3061Codia, T01LW59_A3062CoMes, T01LW59_A3063CoAny, T01LW59_A3065CoLin, T01LW59_A3010CoBarCod, T01LW59_A3011CoBarReo, T01LW59_A3012CoBarPar
            }
            , new Object[] {
            T01LW60_A396EmprCod, T01LW60_A2971SabFacCod
            }
            , new Object[] {
            T01LW61_A396EmprCod, T01LW61_A2954TiDia, T01LW61_A2955TiMes, T01LW61_A2956TiAny, T01LW61_A2958TiLin, T01LW61_A2959TiBarCod, T01LW61_A2960TiBarReo, T01LW61_A2961TiBarPar
            }
            , new Object[] {
            T01LW62_A396EmprCod, T01LW62_A252CliCod, T01LW62_A2933RecTipCon
            }
            , new Object[] {
            T01LW63_A396EmprCod, T01LW63_A252CliCod, T01LW63_A2927RecProCod
            }
            , new Object[] {
            T01LW64_A396EmprCod, T01LW64_A252CliCod, T01LW64_A2891HMaForSer, T01LW64_A2892HMaForCNom, T01LW64_A2893HMaForCNum, T01LW64_A2894HMaTipCCod, T01LW64_A2895HMaForNumC, T01LW64_A2897HMaColLin, T01LW64_A2896HMaFec, T01LW64_A2907HmaLin
            }
            , new Object[] {
            T01LW65_A396EmprCod, T01LW65_A252CliCod, T01LW65_A425EstAny, T01LW65_A2755EstSerFac
            }
            , new Object[] {
            T01LW66_A396EmprCod, T01LW66_A2730RecTipCo, T01LW66_A252CliCod
            }
            , new Object[] {
            T01LW67_A396EmprCod, T01LW67_A2720TarSec, T01LW67_A252CliCod, T01LW67_A829TipArtCod, T01LW67_A831TipColCod
            }
            , new Object[] {
            T01LW68_A396EmprCod, T01LW68_A2382AbcTerCod, T01LW68_A2381AbcSec, T01LW68_A252CliCod
            }
            , new Object[] {
            T01LW69_A396EmprCod, T01LW69_A252CliCod, T01LW69_A2308CliDesCod
            }
            , new Object[] {
            T01LW70_A396EmprCod, T01LW70_A2268MovParCod, T01LW70_A252CliCod
            }
            , new Object[] {
            T01LW71_A396EmprCod, T01LW71_A966PartCod, T01LW71_A252CliCod
            }
            , new Object[] {
            T01LW72_A396EmprCod, T01LW72_A1387AlbPrvCod
            }
            , new Object[] {
            T01LW73_A396EmprCod, T01LW73_A252CliCod, T01LW73_A1213TalCod
            }
            , new Object[] {
            T01LW74_A396EmprCod, T01LW74_A252CliCod, T01LW74_A457FasCod
            }
            , new Object[] {
            T01LW75_A396EmprCod, T01LW75_A539HisBarCod, T01LW75_A545HisCodReo, T01LW75_A544HisCodPar, T01LW75_A833TipDefCod
            }
            , new Object[] {
            T01LW76_A396EmprCod, T01LW76_A506HbaBarCod, T01LW76_A508HbaBarReo, T01LW76_A507HbaBarPar
            }
            , new Object[] {
            T01LW77_A396EmprCod, T01LW77_A252CliCod, T01LW77_A494ForSer, T01LW77_A482ForColNom, T01LW77_A483ForColNum, T01LW77_A831TipColCod
            }
            , new Object[] {
            T01LW78_A396EmprCod, T01LW78_A252CliCod, T01LW78_A287CliPagLin
            }
            , new Object[] {
            T01LW79_A396EmprCod, T01LW79_A252CliCod, T01LW79_A266CliEnvLin
            }
            , new Object[] {
            T01LW80_A396EmprCod, T01LW80_A252CliCod, T01LW80_A65ArtCod
            }
            , new Object[] {
            T01LW81_A396EmprCod, T01LW81_A44AlbRecCod
            }
            , new Object[] {
            T01LW82_A396EmprCod, T01LW82_A30AlbProCod
            }
            , new Object[] {
            T01LW83_A396EmprCod, T01LW83_A14AlbComCod
            }
            , new Object[] {
            T01LW84_A396EmprCod, T01LW84_A252CliCod
            }
            , new Object[] {
            T01LW85_A252CliCod, T01LW85_A12908CliMarcaDc, T01LW85_n12908CliMarcaDc, T01LW85_A14269CliNoNom, T01LW85_A396EmprCod, T01LW85_A12907CliMarcaID
            }
            , new Object[] {
            T01LW86_A12908CliMarcaDc, T01LW86_n12908CliMarcaDc
            }
            , new Object[] {
            T01LW87_A396EmprCod, T01LW87_A252CliCod, T01LW87_A12907CliMarcaID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LW91_A12908CliMarcaDc, T01LW91_n12908CliMarcaDc
            }
            , new Object[] {
            T01LW92_A396EmprCod, T01LW92_A252CliCod, T01LW92_A12907CliMarcaID
            }
         }
      );
      AV44Pgmname = "FicherosBasicos.TCLIMARCAS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14296CliMarcaEx ;
   private byte Gx_BScreen ;
   private byte subGridlevel_marcas_Backcolorstyle ;
   private byte subGridlevel_marcas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_marcas_Allowselection ;
   private byte subGridlevel_marcas_Allowhovering ;
   private byte subGridlevel_marcas_Allowcollapsing ;
   private byte subGridlevel_marcas_Collapsed ;
   private byte Z14296CliMarcaEx ;
   private short nRcdDeleted_1771 ;
   private short nRcdExists_1771 ;
   private short nIsMod_1771 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1771 ;
   private short RcdFound1771 ;
   private short nBlankRcdUsr1771 ;
   private short A14256CliMarcasc ;
   private short RcdFound21 ;
   private short Z14256CliMarcasc ;
   private short nIsDirty_21 ;
   private short nIsDirty_1771 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int wcpOAV36CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int A252CliCod ;
   private int AV36CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtCliMarcaID_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_climarcaid_Datalistupdateminimumcharacters ;
   private int Combo_climarcaid_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_marcas_Backcolor ;
   private int subGridlevel_marcas_Allbackcolor ;
   private int defedtCliMarcaID_Enabled ;
   private int idxLst ;
   private int subGridlevel_marcas_Selectedindex ;
   private int subGridlevel_marcas_Selectioncolor ;
   private int subGridlevel_marcas_Hoveringcolor ;
   private long GRIDLEVEL_MARCAS_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z12907CliMarcaID ;
   private String Z14269CliNoNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A12907CliMarcaID ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_41_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divTableleaflevel_marcas_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_climarcaid_Caption ;
   private String Combo_climarcaid_Cls ;
   private String Combo_climarcaid_Internalname ;
   private String sMode1771 ;
   private String edtCliMarcaID_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_marcas_Internalname ;
   private String A407EmprNom ;
   private String A12908CliMarcaDc ;
   private String A14004ID_CliMarc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_climarcaid_Objectcall ;
   private String Combo_climarcaid_Class ;
   private String Combo_climarcaid_Icontype ;
   private String Combo_climarcaid_Icon ;
   private String Combo_climarcaid_Tooltip ;
   private String Combo_climarcaid_Selectedvalue_set ;
   private String Combo_climarcaid_Selectedvalue_get ;
   private String Combo_climarcaid_Selectedtext_set ;
   private String Combo_climarcaid_Selectedtext_get ;
   private String Combo_climarcaid_Gamoauthtoken ;
   private String Combo_climarcaid_Ddointernalname ;
   private String Combo_climarcaid_Titlecontrolalign ;
   private String Combo_climarcaid_Dropdownoptionstype ;
   private String Combo_climarcaid_Titlecontrolidtoreplace ;
   private String Combo_climarcaid_Datalisttype ;
   private String Combo_climarcaid_Datalistfixedvalues ;
   private String Combo_climarcaid_Datalistproc ;
   private String Combo_climarcaid_Datalistprocparametersprefix ;
   private String Combo_climarcaid_Remoteservicesparameters ;
   private String Combo_climarcaid_Htmltemplate ;
   private String Combo_climarcaid_Multiplevaluestype ;
   private String Combo_climarcaid_Loadingdata ;
   private String Combo_climarcaid_Noresultsfound ;
   private String Combo_climarcaid_Emptyitemtext ;
   private String Combo_climarcaid_Onlyselectedvalues ;
   private String Combo_climarcaid_Selectalltext ;
   private String Combo_climarcaid_Multiplevaluesseparator ;
   private String Combo_climarcaid_Addnewoptiontext ;
   private String hsh ;
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14269CliNoNom ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z12908CliMarcaDc ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGridlevel_marcas_Class ;
   private String subGridlevel_marcas_Linesclass ;
   private String ROClassString ;
   private String edtCliMarcaID_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_marcas_Header ;
   private String Z14004ID_CliMarc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_climarcaid_Isgriditem ;
   private boolean Combo_climarcaid_Emptyitem ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n14256CliMarcasc ;
   private boolean n12908CliMarcaDc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_climarcaid_Enabled ;
   private boolean Combo_climarcaid_Visible ;
   private boolean Combo_climarcaid_Allowmultipleselection ;
   private boolean Combo_climarcaid_Hasdescription ;
   private boolean Combo_climarcaid_Includeonlyselectedoption ;
   private boolean Combo_climarcaid_Includeselectalloption ;
   private boolean Combo_climarcaid_Includeaddnewoption ;
   private boolean returnInSub ;
   private String AV41ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_marcasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_marcasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_marcasColumn ;
   private com.genexus.webpanels.WebSession AV39WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_climarcaid ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkCliNoNom ;
   private ICheckbox chkCliMarcaEx ;
   private IDataStoreProvider pr_default ;
   private short[] T01LW6_A14256CliMarcasc ;
   private boolean[] T01LW6_n14256CliMarcasc ;
   private String[] T01LW9_A407EmprNom ;
   private boolean[] T01LW9_n407EmprNom ;
   private int[] T01LW11_A252CliCod ;
   private boolean[] T01LW11_n252CliCod ;
   private String[] T01LW11_A407EmprNom ;
   private boolean[] T01LW11_n407EmprNom ;
   private String[] T01LW11_A279CliNom ;
   private String[] T01LW11_A396EmprCod ;
   private short[] T01LW11_A14256CliMarcasc ;
   private boolean[] T01LW11_n14256CliMarcasc ;
   private short[] T01LW13_A14256CliMarcasc ;
   private boolean[] T01LW13_n14256CliMarcasc ;
   private String[] T01LW14_A396EmprCod ;
   private int[] T01LW14_A252CliCod ;
   private boolean[] T01LW14_n252CliCod ;
   private int[] T01LW8_A252CliCod ;
   private boolean[] T01LW8_n252CliCod ;
   private String[] T01LW8_A279CliNom ;
   private String[] T01LW8_A396EmprCod ;
   private String[] T01LW15_A396EmprCod ;
   private int[] T01LW15_A252CliCod ;
   private boolean[] T01LW15_n252CliCod ;
   private String[] T01LW16_A396EmprCod ;
   private int[] T01LW16_A252CliCod ;
   private boolean[] T01LW16_n252CliCod ;
   private int[] T01LW7_A252CliCod ;
   private boolean[] T01LW7_n252CliCod ;
   private String[] T01LW7_A279CliNom ;
   private String[] T01LW7_A396EmprCod ;
   private short[] T01LW21_A14256CliMarcasc ;
   private boolean[] T01LW21_n14256CliMarcasc ;
   private String[] T01LW22_A396EmprCod ;
   private int[] T01LW22_A252CliCod ;
   private boolean[] T01LW22_n252CliCod ;
   private int[] T01LW22_A6930Lb_rclin ;
   private String[] T01LW23_A396EmprCod ;
   private int[] T01LW23_A6850Tex_NPed ;
   private String[] T01LW24_A396EmprCod ;
   private int[] T01LW24_A252CliCod ;
   private boolean[] T01LW24_n252CliCod ;
   private short[] T01LW24_A829TipArtCod ;
   private byte[] T01LW24_A831TipColCod ;
   private byte[] T01LW24_A583IntCod ;
   private String[] T01LW24_A5098TipDisCod ;
   private short[] T01LW24_A6603Est1_anyo ;
   private byte[] T01LW24_A6604Est1_mes ;
   private byte[] T01LW24_A6605Est1_dia ;
   private String[] T01LW25_A396EmprCod ;
   private int[] T01LW25_A6319C_Barcod ;
   private byte[] T01LW25_A6320C_Barcodre ;
   private String[] T01LW25_A6321C_Barcodpa ;
   private short[] T01LW25_A6322C_Reclinma ;
   private String[] T01LW26_A396EmprCod ;
   private int[] T01LW26_A6235DevEmpCod ;
   private String[] T01LW27_A396EmprCod ;
   private String[] T01LW27_A602MaqCod ;
   private int[] T01LW27_A6078MaqCliCod ;
   private String[] T01LW27_A6079MaqArtCod ;
   private String[] T01LW28_A396EmprCod ;
   private int[] T01LW28_A5532Lb_numero ;
   private String[] T01LW29_A396EmprCod ;
   private int[] T01LW29_A252CliCod ;
   private boolean[] T01LW29_n252CliCod ;
   private short[] T01LW29_A5503CliifLin ;
   private String[] T01LW30_A396EmprCod ;
   private int[] T01LW30_A252CliCod ;
   private boolean[] T01LW30_n252CliCod ;
   private short[] T01LW30_A5499ClieiLin ;
   private String[] T01LW31_A396EmprCod ;
   private int[] T01LW31_A252CliCod ;
   private boolean[] T01LW31_n252CliCod ;
   private short[] T01LW31_A5495ClidtLin ;
   private String[] T01LW32_A396EmprCod ;
   private int[] T01LW32_A252CliCod ;
   private boolean[] T01LW32_n252CliCod ;
   private short[] T01LW32_A5491CliedLin ;
   private String[] T01LW33_A396EmprCod ;
   private int[] T01LW33_A252CliCod ;
   private boolean[] T01LW33_n252CliCod ;
   private String[] T01LW33_A5452P_ForCod ;
   private String[] T01LW34_A396EmprCod ;
   private int[] T01LW34_A252CliCod ;
   private boolean[] T01LW34_n252CliCod ;
   private String[] T01LW34_A5443Mdl_Cod ;
   private String[] T01LW35_A396EmprCod ;
   private int[] T01LW35_A252CliCod ;
   private boolean[] T01LW35_n252CliCod ;
   private short[] T01LW35_A5436IntCodF2 ;
   private String[] T01LW36_A396EmprCod ;
   private int[] T01LW36_A252CliCod ;
   private boolean[] T01LW36_n252CliCod ;
   private byte[] T01LW36_A5396IntCodFC ;
   private byte[] T01LW36_A5434Tip_ColC ;
   private String[] T01LW37_A396EmprCod ;
   private int[] T01LW37_A252CliCod ;
   private boolean[] T01LW37_n252CliCod ;
   private String[] T01LW37_A5428FasPreCod ;
   private String[] T01LW38_A396EmprCod ;
   private int[] T01LW38_A252CliCod ;
   private boolean[] T01LW38_n252CliCod ;
   private String[] T01LW38_A5398Cli_Proc ;
   private String[] T01LW39_A396EmprCod ;
   private int[] T01LW39_A5130PagIden ;
   private String[] T01LW40_A396EmprCod ;
   private int[] T01LW40_A5059Hl_hdr ;
   private byte[] T01LW40_A5060Hl_hdrr ;
   private String[] T01LW40_A5061Hl_hdrp ;
   private String[] T01LW41_A396EmprCod ;
   private int[] T01LW41_A252CliCod ;
   private boolean[] T01LW41_n252CliCod ;
   private String[] T01LW41_A4718DishCod ;
   private byte[] T01LW41_A5020TipEstCod ;
   private byte[] T01LW41_A5022GraCod ;
   private String[] T01LW42_A396EmprCod ;
   private int[] T01LW42_A4618EnsLCod ;
   private String[] T01LW43_A396EmprCod ;
   private int[] T01LW43_A4492HreBarCod ;
   private byte[] T01LW43_A4493HreBarReo ;
   private String[] T01LW43_A4494HreBarPar ;
   private byte[] T01LW43_A4495HreNumCie ;
   private String[] T01LW44_A396EmprCod ;
   private int[] T01LW44_A252CliCod ;
   private boolean[] T01LW44_n252CliCod ;
   private String[] T01LW44_A4415EstCol ;
   private String[] T01LW45_A396EmprCod ;
   private String[] T01LW45_A4185WEBUSU ;
   private String[] T01LW46_A396EmprCod ;
   private int[] T01LW46_A252CliCod ;
   private boolean[] T01LW46_n252CliCod ;
   private String[] T01LW46_A4079WEBDISCOD ;
   private String[] T01LW46_A4078EMPCOD ;
   private String[] T01LW47_A396EmprCod ;
   private int[] T01LW47_A2637HisEstHRu ;
   private byte[] T01LW47_A2636HisEstHRe ;
   private String[] T01LW47_A2635HisEstHPa ;
   private byte[] T01LW47_A2638HisEstLCo ;
   private String[] T01LW47_A2630HisEstCom ;
   private String[] T01LW47_A2634HisEstFon ;
   private String[] T01LW48_A396EmprCod ;
   private int[] T01LW48_A2574GrpDibCod ;
   private String[] T01LW49_A396EmprCod ;
   private int[] T01LW49_A2558GrmDibCod ;
   private String[] T01LW50_A396EmprCod ;
   private int[] T01LW50_A2542GrcDibCod ;
   private String[] T01LW51_A396EmprCod ;
   private String[] T01LW51_A1031EmpesCod ;
   private int[] T01LW51_A252CliCod ;
   private boolean[] T01LW51_n252CliCod ;
   private String[] T01LW51_A1032FonCod ;
   private String[] T01LW52_A396EmprCod ;
   private String[] T01LW52_A1013DibCli ;
   private int[] T01LW52_A252CliCod ;
   private boolean[] T01LW52_n252CliCod ;
   private int[] T01LW52_A1014DibInt ;
   private String[] T01LW53_A396EmprCod ;
   private long[] T01LW53_A1736AlbExtCod ;
   private String[] T01LW54_A396EmprCod ;
   private int[] T01LW54_A252CliCod ;
   private boolean[] T01LW54_n252CliCod ;
   private short[] T01LW54_A3661FacProAny ;
   private String[] T01LW54_A3662FacProSer ;
   private byte[] T01LW54_A3663FacProInt ;
   private byte[] T01LW54_A3664FacProTip ;
   private short[] T01LW54_A3665FacProTar ;
   private String[] T01LW55_A396EmprCod ;
   private short[] T01LW55_A3646EstTinAny ;
   private byte[] T01LW55_A3647EstTinMes ;
   private byte[] T01LW55_A3648EstTinDia ;
   private short[] T01LW55_A1929EstTinNr ;
   private String[] T01LW56_A396EmprCod ;
   private long[] T01LW56_A3617AlbTrnCod ;
   private String[] T01LW57_A396EmprCod ;
   private int[] T01LW57_A252CliCod ;
   private boolean[] T01LW57_n252CliCod ;
   private java.math.BigDecimal[] T01LW57_A3320CliLimKgs ;
   private String[] T01LW58_A396EmprCod ;
   private String[] T01LW58_A3073RepCod ;
   private int[] T01LW58_A252CliCod ;
   private boolean[] T01LW58_n252CliCod ;
   private String[] T01LW59_A396EmprCod ;
   private byte[] T01LW59_A3061Codia ;
   private byte[] T01LW59_A3062CoMes ;
   private short[] T01LW59_A3063CoAny ;
   private byte[] T01LW59_A3065CoLin ;
   private int[] T01LW59_A3010CoBarCod ;
   private byte[] T01LW59_A3011CoBarReo ;
   private String[] T01LW59_A3012CoBarPar ;
   private String[] T01LW60_A396EmprCod ;
   private int[] T01LW60_A2971SabFacCod ;
   private String[] T01LW61_A396EmprCod ;
   private byte[] T01LW61_A2954TiDia ;
   private byte[] T01LW61_A2955TiMes ;
   private short[] T01LW61_A2956TiAny ;
   private byte[] T01LW61_A2958TiLin ;
   private int[] T01LW61_A2959TiBarCod ;
   private byte[] T01LW61_A2960TiBarReo ;
   private String[] T01LW61_A2961TiBarPar ;
   private String[] T01LW62_A396EmprCod ;
   private int[] T01LW62_A252CliCod ;
   private boolean[] T01LW62_n252CliCod ;
   private short[] T01LW62_A2933RecTipCon ;
   private String[] T01LW63_A396EmprCod ;
   private int[] T01LW63_A252CliCod ;
   private boolean[] T01LW63_n252CliCod ;
   private String[] T01LW63_A2927RecProCod ;
   private String[] T01LW64_A396EmprCod ;
   private int[] T01LW64_A252CliCod ;
   private boolean[] T01LW64_n252CliCod ;
   private String[] T01LW64_A2891HMaForSer ;
   private String[] T01LW64_A2892HMaForCNom ;
   private int[] T01LW64_A2893HMaForCNum ;
   private byte[] T01LW64_A2894HMaTipCCod ;
   private int[] T01LW64_A2895HMaForNumC ;
   private short[] T01LW64_A2897HMaColLin ;
   private java.util.Date[] T01LW64_A2896HMaFec ;
   private short[] T01LW64_A2907HmaLin ;
   private String[] T01LW65_A396EmprCod ;
   private int[] T01LW65_A252CliCod ;
   private boolean[] T01LW65_n252CliCod ;
   private short[] T01LW65_A425EstAny ;
   private String[] T01LW65_A2755EstSerFac ;
   private String[] T01LW66_A396EmprCod ;
   private short[] T01LW66_A2730RecTipCo ;
   private int[] T01LW66_A252CliCod ;
   private boolean[] T01LW66_n252CliCod ;
   private String[] T01LW67_A396EmprCod ;
   private String[] T01LW67_A2720TarSec ;
   private int[] T01LW67_A252CliCod ;
   private boolean[] T01LW67_n252CliCod ;
   private short[] T01LW67_A829TipArtCod ;
   private byte[] T01LW67_A831TipColCod ;
   private String[] T01LW68_A396EmprCod ;
   private String[] T01LW68_A2382AbcTerCod ;
   private String[] T01LW68_A2381AbcSec ;
   private int[] T01LW68_A252CliCod ;
   private boolean[] T01LW68_n252CliCod ;
   private String[] T01LW69_A396EmprCod ;
   private int[] T01LW69_A252CliCod ;
   private boolean[] T01LW69_n252CliCod ;
   private int[] T01LW69_A2308CliDesCod ;
   private String[] T01LW70_A396EmprCod ;
   private String[] T01LW70_A2268MovParCod ;
   private int[] T01LW70_A252CliCod ;
   private boolean[] T01LW70_n252CliCod ;
   private String[] T01LW71_A396EmprCod ;
   private String[] T01LW71_A966PartCod ;
   private int[] T01LW71_A252CliCod ;
   private boolean[] T01LW71_n252CliCod ;
   private String[] T01LW72_A396EmprCod ;
   private int[] T01LW72_A1387AlbPrvCod ;
   private String[] T01LW73_A396EmprCod ;
   private int[] T01LW73_A252CliCod ;
   private boolean[] T01LW73_n252CliCod ;
   private String[] T01LW73_A1213TalCod ;
   private String[] T01LW74_A396EmprCod ;
   private int[] T01LW74_A252CliCod ;
   private boolean[] T01LW74_n252CliCod ;
   private String[] T01LW74_A457FasCod ;
   private String[] T01LW75_A396EmprCod ;
   private int[] T01LW75_A539HisBarCod ;
   private byte[] T01LW75_A545HisCodReo ;
   private String[] T01LW75_A544HisCodPar ;
   private short[] T01LW75_A833TipDefCod ;
   private String[] T01LW76_A396EmprCod ;
   private int[] T01LW76_A506HbaBarCod ;
   private byte[] T01LW76_A508HbaBarReo ;
   private String[] T01LW76_A507HbaBarPar ;
   private String[] T01LW77_A396EmprCod ;
   private int[] T01LW77_A252CliCod ;
   private boolean[] T01LW77_n252CliCod ;
   private String[] T01LW77_A494ForSer ;
   private String[] T01LW77_A482ForColNom ;
   private int[] T01LW77_A483ForColNum ;
   private byte[] T01LW77_A831TipColCod ;
   private String[] T01LW78_A396EmprCod ;
   private int[] T01LW78_A252CliCod ;
   private boolean[] T01LW78_n252CliCod ;
   private byte[] T01LW78_A287CliPagLin ;
   private String[] T01LW79_A396EmprCod ;
   private int[] T01LW79_A252CliCod ;
   private boolean[] T01LW79_n252CliCod ;
   private byte[] T01LW79_A266CliEnvLin ;
   private String[] T01LW80_A396EmprCod ;
   private int[] T01LW80_A252CliCod ;
   private boolean[] T01LW80_n252CliCod ;
   private String[] T01LW80_A65ArtCod ;
   private String[] T01LW81_A396EmprCod ;
   private int[] T01LW81_A44AlbRecCod ;
   private String[] T01LW82_A396EmprCod ;
   private long[] T01LW82_A30AlbProCod ;
   private String[] T01LW83_A396EmprCod ;
   private int[] T01LW83_A14AlbComCod ;
   private String[] T01LW84_A396EmprCod ;
   private int[] T01LW84_A252CliCod ;
   private boolean[] T01LW84_n252CliCod ;
   private int[] T01LW85_A252CliCod ;
   private boolean[] T01LW85_n252CliCod ;
   private String[] T01LW85_A12908CliMarcaDc ;
   private boolean[] T01LW85_n12908CliMarcaDc ;
   private String[] T01LW85_A14269CliNoNom ;
   private String[] T01LW85_A396EmprCod ;
   private String[] T01LW85_A12907CliMarcaID ;
   private String[] T01LW4_A12908CliMarcaDc ;
   private boolean[] T01LW4_n12908CliMarcaDc ;
   private String[] T01LW86_A12908CliMarcaDc ;
   private boolean[] T01LW86_n12908CliMarcaDc ;
   private String[] T01LW87_A396EmprCod ;
   private int[] T01LW87_A252CliCod ;
   private boolean[] T01LW87_n252CliCod ;
   private String[] T01LW87_A12907CliMarcaID ;
   private int[] T01LW3_A252CliCod ;
   private boolean[] T01LW3_n252CliCod ;
   private String[] T01LW3_A14269CliNoNom ;
   private String[] T01LW3_A396EmprCod ;
   private String[] T01LW3_A12907CliMarcaID ;
   private int[] T01LW2_A252CliCod ;
   private boolean[] T01LW2_n252CliCod ;
   private String[] T01LW2_A14269CliNoNom ;
   private String[] T01LW2_A396EmprCod ;
   private String[] T01LW2_A12907CliMarcaID ;
   private String[] T01LW91_A12908CliMarcaDc ;
   private boolean[] T01LW91_n12908CliMarcaDc ;
   private String[] T01LW92_A396EmprCod ;
   private int[] T01LW92_A252CliCod ;
   private boolean[] T01LW92_n252CliCod ;
   private String[] T01LW92_A12907CliMarcaID ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40CliMarcaID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV37WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV38TrnContext ;
}

final  class tclimarcas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimarcas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimarcas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimarcas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimarcas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LW2", "SELECT CliCod, CliNoNom, EmprCod, CliMarcaID FROM TXPCLIMAR WHERE EmprCod = ? AND CliCod = ? AND CliMarcaID = ?  FOR UPDATE OF CliNoNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW3", "SELECT CliCod, CliNoNom, EmprCod, CliMarcaID FROM TXPCLIMAR WHERE EmprCod = ? AND CliCod = ? AND CliMarcaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW4", "SELECT MarcaDsc AS CliMarcaDc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW6", "SELECT COALESCE( T1.CliMarcasc, 0) AS CliMarcasc FROM (SELECT COUNT(*) AS CliMarcasc, EmprCod, CliCod FROM TXPCLIMAR GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW7", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW8", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW11", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.EmprCod, COALESCE( T3.CliMarcasc, 0) AS CliMarcasc FROM ((TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS CliMarcasc, EmprCod, CliCod FROM TXPCLIMAR GROUP BY EmprCod, CliCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW13", "SELECT COALESCE( T1.CliMarcasc, 0) AS CliMarcasc FROM (SELECT COUNT(*) AS CliMarcasc, EmprCod, CliCod FROM TXPCLIMAR GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LW17", "INSERT INTO TXPCLIENT(CliCod, CliNom, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01LW18", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01LW19", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T01LW21", "SELECT COALESCE( T1.CliMarcasc, 0) AS CliMarcasc FROM (SELECT COUNT(*) AS CliMarcasc, EmprCod, CliCod FROM TXPCLIMAR GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW22", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW23", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW24", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW25", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW26", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW27", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW28", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW29", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW30", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW31", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW32", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW33", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW34", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW35", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW36", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW37", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW38", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW39", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW40", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW41", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW42", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW43", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW44", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW45", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW46", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW47", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW48", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW49", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW50", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW51", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW52", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW53", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW54", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW55", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW56", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW57", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW58", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW59", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW60", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW61", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW62", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW63", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW64", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW65", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW66", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW67", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW68", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW69", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW70", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW71", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW72", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW73", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW74", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW75", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW76", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW77", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW78", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW79", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW80", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW81", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW82", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW83", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LW84", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW85", "SELECT T1.CliCod, T2.MarcaDsc AS CliMarcaDc, T1.CliNoNom, T1.EmprCod, T1.CliMarcaID AS CliMarcaID FROM (TXPCLIMAR T1 INNER JOIN TXPMARCAS T2 ON T2.EmprCod = T1.EmprCod AND T2.MarcaId = T1.CliMarcaID) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliMarcaID = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliMarcaID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW86", "SELECT MarcaDsc AS CliMarcaDc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW87", "SELECT EmprCod, CliCod, CliMarcaID FROM TXPCLIMAR WHERE EmprCod = ? AND CliCod = ? AND CliMarcaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LW88", "INSERT INTO TXPCLIMAR(CliCod, CliNoNom, EmprCod, CliMarcaID) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPCLIMAR")
         ,new UpdateCursor("T01LW89", "UPDATE TXPCLIMAR SET CliNoNom=?  WHERE EmprCod = ? AND CliCod = ? AND CliMarcaID = ?", GX_NOMASK, "TXPCLIMAR")
         ,new UpdateCursor("T01LW90", "DELETE FROM TXPCLIMAR  WHERE EmprCod = ? AND CliCod = ? AND CliMarcaID = ?", GX_NOMASK, "TXPCLIMAR")
         ,new ForEachCursor("T01LW91", "SELECT MarcaDsc AS CliMarcaDc FROM TXPMARCAS WHERE EmprCod = ? AND MarcaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LW92", "SELECT EmprCod, CliCod, CliMarcaID FROM TXPCLIMAR WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliMarcaID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 58 :
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
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 79 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

