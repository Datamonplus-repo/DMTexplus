package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprefas_impl extends GXDataArea
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
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
            AV29EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
            AV46CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precios por Fase", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tprefas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprefas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprefas_impl.class ));
   }

   public tprefas_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkFasPreU = UIFactory.getCheckbox(this);
      chkFasPreKgF = UIFactory.getCheckbox(this);
      chkFasKgsEnt = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "Pdf", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "Pdf", ""), "", StyleString, ClassString, bttBtnpdf_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiar_Internalname, "", httpContext.getMessage( "Copiar", ""), bttBtncopiar_Jsonclick, 7, httpContext.getMessage( "Copiar", ""), "", StyleString, ClassString, bttBtncopiar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112021_client"+"'", TempTags, "", 2, "HLP_Facturacion\\TPREFAS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TPREFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts CellMarginTop", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV54Pgmname), GXutil.rtrim( localUtil.format( AV54Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TPREFAS.htm");
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
      ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
      ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
      ucCombo_fascod.setProperty("IsGridItem", Combo_fascod_Isgriditem);
      ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
      ucCombo_fascod.setProperty("DropDownOptionsData", AV50FasCod_Data);
      ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
      /* User Defined Control */
      ucGridlevel_level1_titlescategories.setProperty("GridTitlesCategories", Gridlevel_level1_titlescategories_Gridtitlescategories);
      ucGridlevel_level1_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_level1_titlescategories_Internalname, "GRIDLEVEL_LEVEL1_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount85 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_85 = (short)(1) ;
            scanStart2085( ) ;
            while ( RcdFound85 != 0 )
            {
               init_level_properties85( ) ;
               getByPrimaryKey2085( ) ;
               addRow2085( ) ;
               scanNext2085( ) ;
            }
            scanEnd2085( ) ;
            nBlankRcdCount85 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal2085( ) ;
         standaloneModal2085( ) ;
         sMode85 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow2085( ) ;
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPreMt2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMT2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMt2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPreFAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            chkFasPreU.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreU.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            chkFasPreKgF.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreKgF.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            chkFasKgsEnt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASKGSENT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasKgsEnt.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            edtFasKgsMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGSMN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasKgsMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgsMn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_85 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal2085( ) ;
            }
            sendRow2085( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount85 = (short)(5) ;
         nRcdExists_85 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart2085( ) ;
            while ( RcdFound85 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5085( ) ;
               init_level_properties85( ) ;
               standaloneNotModal2085( ) ;
               getByPrimaryKey2085( ) ;
               standaloneModal2085( ) ;
               addRow2085( ) ;
               scanNext2085( ) ;
            }
            scanEnd2085( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode85 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_5085( ) ;
         initAll2085( ) ;
         init_level_properties85( ) ;
         nRcdExists_85 = (short)(0) ;
         nIsMod_85 = (short)(0) ;
         nRcdDeleted_85 = (short)(0) ;
         nBlankRcdCount85 = (short)(nBlankRcdUsr85+nBlankRcdCount85) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount85 > 0 )
         {
            standaloneNotModal2085( ) ;
            standaloneModal2085( ) ;
            addRow2085( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount85 = (short)(nBlankRcdCount85-1) ;
         }
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e12202 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV50FasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z10045CliAct = httpContext.cgiGet( "Z10045CliAct") ;
            A10045CliAct = httpContext.cgiGet( "Z10045CliAct") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV46CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10045CliAct = httpContext.cgiGet( "CLIACT") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A470FasSumTin = httpContext.cgiGet( "FASSUMTIN") ;
            n470FasSumTin = false ;
            A3615FasFacCod = httpContext.cgiGet( "FASFACCOD") ;
            n3615FasFacCod = false ;
            A4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( "FASPREKAN")) ;
            n4386FasPreKAn = false ;
            A4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( "FASPREMAN")) ;
            n4387FasPreMAn = false ;
            A4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( "FASPREFAN"), 0) ;
            n4388FasPreFAn = false ;
            A14258FasFactura = httpContext.cgiGet( "FASFACTURA") ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
            A4642FasDsc2 = httpContext.cgiGet( "FASDSC2") ;
            n4642FasDsc2 = false ;
            A7070FasSigla = httpContext.cgiGet( "FASSIGLA") ;
            n7070FasSigla = false ;
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
            Combo_fascod_Objectcall = httpContext.cgiGet( "COMBO_FASCOD_Objectcall") ;
            Combo_fascod_Class = httpContext.cgiGet( "COMBO_FASCOD_Class") ;
            Combo_fascod_Icontype = httpContext.cgiGet( "COMBO_FASCOD_Icontype") ;
            Combo_fascod_Icon = httpContext.cgiGet( "COMBO_FASCOD_Icon") ;
            Combo_fascod_Caption = httpContext.cgiGet( "COMBO_FASCOD_Caption") ;
            Combo_fascod_Tooltip = httpContext.cgiGet( "COMBO_FASCOD_Tooltip") ;
            Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
            Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
            Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
            Combo_fascod_Selectedtext_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_set") ;
            Combo_fascod_Selectedtext_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_get") ;
            Combo_fascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FASCOD_Gamoauthtoken") ;
            Combo_fascod_Ddointernalname = httpContext.cgiGet( "COMBO_FASCOD_Ddointernalname") ;
            Combo_fascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolalign") ;
            Combo_fascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FASCOD_Dropdownoptionstype") ;
            Combo_fascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Enabled")) ;
            Combo_fascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Visible")) ;
            Combo_fascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolidtoreplace") ;
            Combo_fascod_Datalisttype = httpContext.cgiGet( "COMBO_FASCOD_Datalisttype") ;
            Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
            Combo_fascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FASCOD_Datalistfixedvalues") ;
            Combo_fascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Isgriditem")) ;
            Combo_fascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Hasdescription")) ;
            Combo_fascod_Datalistproc = httpContext.cgiGet( "COMBO_FASCOD_Datalistproc") ;
            Combo_fascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FASCOD_Datalistprocparametersprefix") ;
            Combo_fascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FASCOD_Remoteservicesparameters") ;
            Combo_fascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
            Combo_fascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeselectalloption")) ;
            Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
            Combo_fascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeaddnewoption")) ;
            Combo_fascod_Htmltemplate = httpContext.cgiGet( "COMBO_FASCOD_Htmltemplate") ;
            Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
            Combo_fascod_Loadingdata = httpContext.cgiGet( "COMBO_FASCOD_Loadingdata") ;
            Combo_fascod_Noresultsfound = httpContext.cgiGet( "COMBO_FASCOD_Noresultsfound") ;
            Combo_fascod_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCOD_Emptyitemtext") ;
            Combo_fascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FASCOD_Onlyselectedvalues") ;
            Combo_fascod_Selectalltext = httpContext.cgiGet( "COMBO_FASCOD_Selectalltext") ;
            Combo_fascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluesseparator") ;
            Combo_fascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FASCOD_Addnewoptiontext") ;
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            AV54Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPREFAS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
            forbiddenHiddens.add("CliAct", GXutil.rtrim( localUtil.format( A10045CliAct, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tprefas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_200( ) ;
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
                        e12202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e13202 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoPDF' */
                        e14202 ();
                        nKeyPressed = (byte)(3) ;
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
         e13202 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2021( ) ;
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
         disableAttributes2021( ) ;
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

   public void confirm_200( )
   {
      beforeValidate2021( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2021( ) ;
         }
         else
         {
            checkExtendedTable2021( ) ;
            closeExtendedTableCursors2021( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_2085( ) ;
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

   public void confirm_2085( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow2085( ) ;
         if ( ( nRcdExists_85 != 0 ) || ( nIsMod_85 != 0 ) )
         {
            getKey2085( ) ;
            if ( ( nRcdExists_85 == 0 ) && ( nRcdDeleted_85 == 0 ) )
            {
               if ( RcdFound85 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate2085( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2085( ) ;
                     closeExtendedTableCursors2085( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound85 != 0 )
               {
                  if ( nRcdDeleted_85 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey2085( ) ;
                     load2085( ) ;
                     beforeValidate2085( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2085( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_85 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate2085( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2085( ) ;
                           closeExtendedTableCursors2085( ) ;
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
                  if ( nRcdDeleted_85 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMt2_Internalname, GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreFAc_Internalname, localUtil.format(A4385FasPreFAc, "99/99/99")) ;
         httpContext.changePostValue( chkFasPreU.getInternalname(), GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkFasPreKgF.getInternalname(), ((GXutil.strcmp(A12577FasPreKgF, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkFasKgsEnt.getInternalname(), ((GXutil.strcmp(A13587FasKgsEnt, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtFasKgsMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_50_idx, GXutil.rtrim( Z470FasSumTin)) ;
         httpContext.changePostValue( "ZT_"+"Z12577FasPreKgF_"+sGXsfl_50_idx, GXutil.rtrim( Z12577FasPreKgF)) ;
         httpContext.changePostValue( "ZT_"+"Z12704FasKgsMn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13587FasKgsEnt_"+sGXsfl_50_idx, GXutil.rtrim( Z13587FasKgsEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_50_idx, localUtil.dtoc( Z4385FasPreFAc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_50_idx, GXutil.rtrim( Z3615FasFacCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_50_idx, localUtil.dtoc( Z4388FasPreFAn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10882FasPreU_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12576FasPreMt2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14258FasFactura_"+sGXsfl_50_idx, GXutil.rtrim( Z14258FasFactura)) ;
         httpContext.changePostValue( "T466FasPreKgm_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T467FasPreMtr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_85 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMT2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMt2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreU.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreKgF.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGSENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasKgsEnt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGSMN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgsMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption200( )
   {
   }

   public void e12202( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprefas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprefas_impl.this.AV29EmprCod = GXv_char2[0] ;
      tprefas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprefas_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tprefas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tprefas_impl.this.AV29EmprCod = GXv_char4[0] ;
      tprefas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprefas_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV47WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV47WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_fascod_Titlecontrolidtoreplace = edtFasCod_Internalname ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "TitleControlIdToReplace", Combo_fascod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
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
      AV48TrnContext.fromxml(AV49WebSession.getValue("TrnContext"), null, null);
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
   }

   public void e13202( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV48TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.tprefasww", new String[] {}, new String[] {}) );
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

   public void e14202( )
   {
      /* 'DoPDF' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.rmei002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim("S")),GXutil.URLEncode(GXutil.rtrim("T"))}, new String[] {"EmprCod","ImpCod","PCliCod","UCliCod","ImprimirFase","ClienteActivo","Fases"}) , new Object[] {"AV29EmprCod","","A252CliCod","A252CliCod","",""});
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV50FasCod_Data ;
      GXv_char4[0] = AV51ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.facturacion.tprefasloaddvcombo(remoteHandle, context).execute( "FasCod", Gx_mode, AV29EmprCod, AV46CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tprefas_impl.this.AV51ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV50FasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm2021( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T00206_A279CliNom[0] ;
            Z10045CliAct = T00206_A10045CliAct[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z10045CliAct = A10045CliAct ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z10045CliAct = A10045CliAct ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      AV54Pgmname = "Facturacion.TPREFAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV29EmprCod)==0) )
      {
         A396EmprCod = AV29EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00207 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00207_A407EmprNom[0] ;
      n407EmprNom = T00207_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV46CliCod) )
      {
         A252CliCod = AV46CliCod ;
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
   }

   public void load2021( )
   {
      /* Using cursor T00208 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A279CliNom = T00208_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T00208_A407EmprNom[0] ;
         n407EmprNom = T00208_n407EmprNom[0] ;
         A10045CliAct = T00208_A10045CliAct[0] ;
         zm2021( -13) ;
      }
      pr_default.close(6);
      onLoadActions2021( ) ;
   }

   public void onLoadActions2021( )
   {
   }

   public void checkExtendedTable2021( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors2021( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2021( )
   {
      /* Using cursor T00209 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00206 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm2021( 13) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T00206_A252CliCod[0] ;
         n252CliCod = T00206_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T00206_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10045CliAct = T00206_A10045CliAct[0] ;
         A396EmprCod = T00206_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2021( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey2021( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey2021( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey2021( ) ;
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
      /* Using cursor T002010 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T002010_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002010_A252CliCod[0] < A252CliCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T002010_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002010_A252CliCod[0] > A252CliCod ) ) )
         {
            A396EmprCod = T002010_A396EmprCod[0] ;
            A252CliCod = T002010_A252CliCod[0] ;
            n252CliCod = T002010_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T002011 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T002011_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002011_A252CliCod[0] > A252CliCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T002011_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T002011_A252CliCod[0] < A252CliCod ) ) )
         {
            A396EmprCod = T002011_A396EmprCod[0] ;
            A252CliCod = T002011_A252CliCod[0] ;
            n252CliCod = T002011_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2021( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert2021( ) ;
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
               update2021( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               insert2021( ) ;
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
                  insert2021( ) ;
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

   public void checkOptimisticConcurrency2021( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00205 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T00205_A279CliNom[0]) != 0 ) || ( GXutil.strcmp(Z10045CliAct, T00205_A10045CliAct[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T00205_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T00205_A279CliNom[0]);
            }
            if ( GXutil.strcmp(Z10045CliAct, T00205_A10045CliAct[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"CliAct");
               GXutil.writeLogRaw("Old: ",Z10045CliAct);
               GXutil.writeLogRaw("Current: ",T00205_A10045CliAct[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2021( )
   {
      beforeValidate2021( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2021( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2021( 0) ;
         checkOptimisticConcurrency2021( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2021( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2021( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002012 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, A10045CliAct, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevel2021( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption200( ) ;
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
            load2021( ) ;
         }
         endLevel2021( ) ;
      }
      closeExtendedTableCursors2021( ) ;
   }

   public void update2021( )
   {
      beforeValidate2021( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2021( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2021( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2021( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2021( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002013 */
                  pr_default.execute(11, new Object[] {A279CliNom, A10045CliAct, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2021( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2021( ) ;
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
         endLevel2021( ) ;
      }
      closeExtendedTableCursors2021( ) ;
   }

   public void deferredUpdate2021( )
   {
   }

   public void delete( )
   {
      beforeValidate2021( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2021( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2021( ) ;
         afterConfirm2021( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2021( ) ;
            if ( AnyError == 0 )
            {
               scanStart2085( ) ;
               while ( RcdFound85 != 0 )
               {
                  getByPrimaryKey2085( ) ;
                  delete2085( ) ;
                  scanNext2085( ) ;
               }
               scanEnd2085( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002014 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
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
      }
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2021( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2021( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T002015 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002016 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T002017 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T002018 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002019 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002020 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002021 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T002022 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002023 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002024 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T002025 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T002026 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T002027 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T002028 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T002029 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T002030 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T002031 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T002032 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T002033 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T002034 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T002035 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T002036 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T002037 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T002038 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T002039 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T002040 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T002041 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T002042 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T002043 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T002044 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T002045 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T002046 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T002047 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T002048 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T002049 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T002050 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T002051 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T002052 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T002053 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T002054 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T002055 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T002056 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T002057 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T002058 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T002059 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T002060 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T002061 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T002062 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T002063 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T002064 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T002065 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T002066 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T002067 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRETIT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T002068 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T002069 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T002070 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T002071 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T002072 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T002073 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T002074 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T002075 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T002076 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
      }
   }

   public void processNestedLevel2085( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow2085( ) ;
         if ( ( nRcdExists_85 != 0 ) || ( nIsMod_85 != 0 ) )
         {
            standaloneNotModal2085( ) ;
            getKey2085( ) ;
            if ( ( nRcdExists_85 == 0 ) && ( nRcdDeleted_85 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert2085( ) ;
            }
            else
            {
               if ( RcdFound85 != 0 )
               {
                  if ( ( nRcdDeleted_85 != 0 ) && ( nRcdExists_85 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete2085( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_85 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update2085( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_85 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMt2_Internalname, GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreFAc_Internalname, localUtil.format(A4385FasPreFAc, "99/99/99")) ;
         httpContext.changePostValue( chkFasPreU.getInternalname(), GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkFasPreKgF.getInternalname(), ((GXutil.strcmp(A12577FasPreKgF, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( chkFasKgsEnt.getInternalname(), ((GXutil.strcmp(A13587FasKgsEnt, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtFasKgsMn_Internalname, GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_50_idx, GXutil.rtrim( Z470FasSumTin)) ;
         httpContext.changePostValue( "ZT_"+"Z12577FasPreKgF_"+sGXsfl_50_idx, GXutil.rtrim( Z12577FasPreKgF)) ;
         httpContext.changePostValue( "ZT_"+"Z12704FasKgsMn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13587FasKgsEnt_"+sGXsfl_50_idx, GXutil.rtrim( Z13587FasKgsEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_50_idx, localUtil.dtoc( Z4385FasPreFAc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_50_idx, GXutil.rtrim( Z3615FasFacCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_50_idx, localUtil.dtoc( Z4388FasPreFAn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10882FasPreU_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12576FasPreMt2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14258FasFactura_"+sGXsfl_50_idx, GXutil.rtrim( Z14258FasFactura)) ;
         httpContext.changePostValue( "T466FasPreKgm_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T467FasPreMtr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_85_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_85 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMT2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMt2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreU.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreKgF.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGSENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasKgsEnt.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGSMN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgsMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll2085( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_85 = (short)(0) ;
      nIsMod_85 = (short)(0) ;
      nRcdDeleted_85 = (short)(0) ;
   }

   public void processLevel2021( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel2085( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel2021( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2021( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tprefas");
         if ( AnyError == 0 )
         {
            confirmValues200( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tprefas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2021( )
   {
      /* Scan By routine */
      /* Using cursor T002077 */
      pr_default.execute(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T002077_A396EmprCod[0] ;
         A252CliCod = T002077_A252CliCod[0] ;
         n252CliCod = T002077_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2021( )
   {
      /* Scan next routine */
      pr_default.readNext(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A396EmprCod = T002077_A396EmprCod[0] ;
         A252CliCod = T002077_A252CliCod[0] ;
         n252CliCod = T002077_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd2021( )
   {
      pr_default.close(75);
   }

   public void afterConfirm2021( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2021( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2021( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2021( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2021( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2021( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2021( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm2085( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z470FasSumTin = T00203_A470FasSumTin[0] ;
            Z12577FasPreKgF = T00203_A12577FasPreKgF[0] ;
            Z12704FasKgsMn = T00203_A12704FasKgsMn[0] ;
            Z13587FasKgsEnt = T00203_A13587FasKgsEnt[0] ;
            Z4385FasPreFAc = T00203_A4385FasPreFAc[0] ;
            Z467FasPreMtr = T00203_A467FasPreMtr[0] ;
            Z466FasPreKgm = T00203_A466FasPreKgm[0] ;
            Z3615FasFacCod = T00203_A3615FasFacCod[0] ;
            Z4386FasPreKAn = T00203_A4386FasPreKAn[0] ;
            Z4387FasPreMAn = T00203_A4387FasPreMAn[0] ;
            Z4388FasPreFAn = T00203_A4388FasPreFAn[0] ;
            Z10882FasPreU = T00203_A10882FasPreU[0] ;
            Z12576FasPreMt2 = T00203_A12576FasPreMt2[0] ;
            Z14258FasFactura = T00203_A14258FasFactura[0] ;
         }
         else
         {
            Z470FasSumTin = A470FasSumTin ;
            Z12577FasPreKgF = A12577FasPreKgF ;
            Z12704FasKgsMn = A12704FasKgsMn ;
            Z13587FasKgsEnt = A13587FasKgsEnt ;
            Z4385FasPreFAc = A4385FasPreFAc ;
            Z467FasPreMtr = A467FasPreMtr ;
            Z466FasPreKgm = A466FasPreKgm ;
            Z3615FasFacCod = A3615FasFacCod ;
            Z4386FasPreKAn = A4386FasPreKAn ;
            Z4387FasPreMAn = A4387FasPreMAn ;
            Z4388FasPreFAn = A4388FasPreFAn ;
            Z10882FasPreU = A10882FasPreU ;
            Z12576FasPreMt2 = A12576FasPreMt2 ;
            Z14258FasFactura = A14258FasFactura ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z470FasSumTin = A470FasSumTin ;
         Z12577FasPreKgF = A12577FasPreKgF ;
         Z12704FasKgsMn = A12704FasKgsMn ;
         Z13587FasKgsEnt = A13587FasKgsEnt ;
         Z4385FasPreFAc = A4385FasPreFAc ;
         Z467FasPreMtr = A467FasPreMtr ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z3615FasFacCod = A3615FasFacCod ;
         Z4386FasPreKAn = A4386FasPreKAn ;
         Z4387FasPreMAn = A4387FasPreMAn ;
         Z4388FasPreFAn = A4388FasPreFAn ;
         Z10882FasPreU = A10882FasPreU ;
         Z12576FasPreMt2 = A12576FasPreMt2 ;
         Z14258FasFactura = A14258FasFactura ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z4642FasDsc2 = A4642FasDsc2 ;
         Z7070FasSigla = A7070FasSigla ;
      }
   }

   public void standaloneNotModal2085( )
   {
      edtFasPreFAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal2085( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A470FasSumTin)==0) && ( Gx_BScreen == 0 ) )
      {
         A470FasSumTin = httpContext.getMessage( "S", "") ;
         n470FasSumTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
      }
      if ( isIns( )  && (GXutil.strcmp("", A12577FasPreKgF)==0) && ( Gx_BScreen == 0 ) )
      {
         A12577FasPreKgF = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n12577FasPreKgF = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12704FasKgsMn)==0) && ( Gx_BScreen == 0 ) )
      {
         A12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
         n12704FasKgsMn = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13587FasKgsEnt)==0) && ( Gx_BScreen == 0 ) )
      {
         A13587FasKgsEnt = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n13587FasKgsEnt = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4385FasPreFAc)) && ( Gx_BScreen == 0 ) )
      {
         A4385FasPreFAc = Gx_date ;
         n4385FasPreFAc = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load2085( )
   {
      /* Using cursor T002078 */
      pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A470FasSumTin = T002078_A470FasSumTin[0] ;
         n470FasSumTin = T002078_n470FasSumTin[0] ;
         A12577FasPreKgF = T002078_A12577FasPreKgF[0] ;
         n12577FasPreKgF = T002078_n12577FasPreKgF[0] ;
         A12704FasKgsMn = T002078_A12704FasKgsMn[0] ;
         n12704FasKgsMn = T002078_n12704FasKgsMn[0] ;
         A13587FasKgsEnt = T002078_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = T002078_n13587FasKgsEnt[0] ;
         A4385FasPreFAc = T002078_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T002078_n4385FasPreFAc[0] ;
         A460FasDsc = T002078_A460FasDsc[0] ;
         A4642FasDsc2 = T002078_A4642FasDsc2[0] ;
         n4642FasDsc2 = T002078_n4642FasDsc2[0] ;
         A467FasPreMtr = T002078_A467FasPreMtr[0] ;
         n467FasPreMtr = T002078_n467FasPreMtr[0] ;
         A466FasPreKgm = T002078_A466FasPreKgm[0] ;
         n466FasPreKgm = T002078_n466FasPreKgm[0] ;
         A3615FasFacCod = T002078_A3615FasFacCod[0] ;
         n3615FasFacCod = T002078_n3615FasFacCod[0] ;
         A4386FasPreKAn = T002078_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T002078_n4386FasPreKAn[0] ;
         A4387FasPreMAn = T002078_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T002078_n4387FasPreMAn[0] ;
         A4388FasPreFAn = T002078_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T002078_n4388FasPreFAn[0] ;
         A10882FasPreU = T002078_A10882FasPreU[0] ;
         n10882FasPreU = T002078_n10882FasPreU[0] ;
         A12576FasPreMt2 = T002078_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = T002078_n12576FasPreMt2[0] ;
         A7070FasSigla = T002078_A7070FasSigla[0] ;
         n7070FasSigla = T002078_n7070FasSigla[0] ;
         A14258FasFactura = T002078_A14258FasFactura[0] ;
         zm2085( -15) ;
      }
      pr_default.close(76);
      onLoadActions2085( ) ;
   }

   public void onLoadActions2085( )
   {
   }

   public void checkExtendedTable2085( )
   {
      nIsDirty_85 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal2085( ) ;
      /* Using cursor T00204 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00204_A460FasDsc[0] ;
      A4642FasDsc2 = T00204_A4642FasDsc2[0] ;
      n4642FasDsc2 = T00204_n4642FasDsc2[0] ;
      A7070FasSigla = T00204_A7070FasSigla[0] ;
      n7070FasSigla = T00204_n7070FasSigla[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors2085( )
   {
      pr_default.close(2);
   }

   public void enableDisable2085( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T002079 */
      pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(77) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T002079_A460FasDsc[0] ;
      A4642FasDsc2 = T002079_A4642FasDsc2[0] ;
      n4642FasDsc2 = T002079_n4642FasDsc2[0] ;
      A7070FasSigla = T002079_A7070FasSigla[0] ;
      n7070FasSigla = T002079_n7070FasSigla[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4642FasDsc2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7070FasSigla))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(77) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(77);
   }

   public void getKey2085( )
   {
      /* Using cursor T002080 */
      pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound85 = (short)(1) ;
      }
      else
      {
         RcdFound85 = (short)(0) ;
      }
      pr_default.close(78);
   }

   public void getByPrimaryKey2085( )
   {
      /* Using cursor T00203 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2085( 15) ;
         RcdFound85 = (short)(1) ;
         initializeNonKey2085( ) ;
         A470FasSumTin = T00203_A470FasSumTin[0] ;
         n470FasSumTin = T00203_n470FasSumTin[0] ;
         A12577FasPreKgF = T00203_A12577FasPreKgF[0] ;
         n12577FasPreKgF = T00203_n12577FasPreKgF[0] ;
         A12704FasKgsMn = T00203_A12704FasKgsMn[0] ;
         n12704FasKgsMn = T00203_n12704FasKgsMn[0] ;
         A13587FasKgsEnt = T00203_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = T00203_n13587FasKgsEnt[0] ;
         A4385FasPreFAc = T00203_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T00203_n4385FasPreFAc[0] ;
         A467FasPreMtr = T00203_A467FasPreMtr[0] ;
         n467FasPreMtr = T00203_n467FasPreMtr[0] ;
         A466FasPreKgm = T00203_A466FasPreKgm[0] ;
         n466FasPreKgm = T00203_n466FasPreKgm[0] ;
         A3615FasFacCod = T00203_A3615FasFacCod[0] ;
         n3615FasFacCod = T00203_n3615FasFacCod[0] ;
         A4386FasPreKAn = T00203_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T00203_n4386FasPreKAn[0] ;
         A4387FasPreMAn = T00203_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T00203_n4387FasPreMAn[0] ;
         A4388FasPreFAn = T00203_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T00203_n4388FasPreFAn[0] ;
         A10882FasPreU = T00203_A10882FasPreU[0] ;
         n10882FasPreU = T00203_n10882FasPreU[0] ;
         A12576FasPreMt2 = T00203_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = T00203_n12576FasPreMt2[0] ;
         A14258FasFactura = T00203_A14258FasFactura[0] ;
         A457FasCod = T00203_A457FasCod[0] ;
         n457FasCod = T00203_n457FasCod[0] ;
         O466FasPreKgm = A466FasPreKgm ;
         n466FasPreKgm = false ;
         O467FasPreMtr = A467FasPreMtr ;
         n467FasPreMtr = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z457FasCod = A457FasCod ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2085( ) ;
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound85 = (short)(0) ;
         initializeNonKey2085( ) ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2085( ) ;
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2085( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency2085( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00202 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z470FasSumTin, T00202_A470FasSumTin[0]) != 0 ) || ( GXutil.strcmp(Z12577FasPreKgF, T00202_A12577FasPreKgF[0]) != 0 ) || ( DecimalUtil.compareTo(Z12704FasKgsMn, T00202_A12704FasKgsMn[0]) != 0 ) || ( GXutil.strcmp(Z13587FasKgsEnt, T00202_A13587FasKgsEnt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T00202_A4385FasPreFAc[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z467FasPreMtr, T00202_A467FasPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z466FasPreKgm, T00202_A466FasPreKgm[0]) != 0 ) || ( GXutil.strcmp(Z3615FasFacCod, T00202_A3615FasFacCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z4386FasPreKAn, T00202_A4386FasPreKAn[0]) != 0 ) || ( DecimalUtil.compareTo(Z4387FasPreMAn, T00202_A4387FasPreMAn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T00202_A4388FasPreFAn[0])) ) || ( Z10882FasPreU != T00202_A10882FasPreU[0] ) || ( DecimalUtil.compareTo(Z12576FasPreMt2, T00202_A12576FasPreMt2[0]) != 0 ) || ( GXutil.strcmp(Z14258FasFactura, T00202_A14258FasFactura[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z470FasSumTin, T00202_A470FasSumTin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasSumTin");
               GXutil.writeLogRaw("Old: ",Z470FasSumTin);
               GXutil.writeLogRaw("Current: ",T00202_A470FasSumTin[0]);
            }
            if ( GXutil.strcmp(Z12577FasPreKgF, T00202_A12577FasPreKgF[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreKgF");
               GXutil.writeLogRaw("Old: ",Z12577FasPreKgF);
               GXutil.writeLogRaw("Current: ",T00202_A12577FasPreKgF[0]);
            }
            if ( DecimalUtil.compareTo(Z12704FasKgsMn, T00202_A12704FasKgsMn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasKgsMn");
               GXutil.writeLogRaw("Old: ",Z12704FasKgsMn);
               GXutil.writeLogRaw("Current: ",T00202_A12704FasKgsMn[0]);
            }
            if ( GXutil.strcmp(Z13587FasKgsEnt, T00202_A13587FasKgsEnt[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasKgsEnt");
               GXutil.writeLogRaw("Old: ",Z13587FasKgsEnt);
               GXutil.writeLogRaw("Current: ",T00202_A13587FasKgsEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T00202_A4385FasPreFAc[0])) ) )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreFAc");
               GXutil.writeLogRaw("Old: ",Z4385FasPreFAc);
               GXutil.writeLogRaw("Current: ",T00202_A4385FasPreFAc[0]);
            }
            if ( DecimalUtil.compareTo(Z467FasPreMtr, T00202_A467FasPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreMtr");
               GXutil.writeLogRaw("Old: ",Z467FasPreMtr);
               GXutil.writeLogRaw("Current: ",T00202_A467FasPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z466FasPreKgm, T00202_A466FasPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreKgm");
               GXutil.writeLogRaw("Old: ",Z466FasPreKgm);
               GXutil.writeLogRaw("Current: ",T00202_A466FasPreKgm[0]);
            }
            if ( GXutil.strcmp(Z3615FasFacCod, T00202_A3615FasFacCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasFacCod");
               GXutil.writeLogRaw("Old: ",Z3615FasFacCod);
               GXutil.writeLogRaw("Current: ",T00202_A3615FasFacCod[0]);
            }
            if ( DecimalUtil.compareTo(Z4386FasPreKAn, T00202_A4386FasPreKAn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreKAn");
               GXutil.writeLogRaw("Old: ",Z4386FasPreKAn);
               GXutil.writeLogRaw("Current: ",T00202_A4386FasPreKAn[0]);
            }
            if ( DecimalUtil.compareTo(Z4387FasPreMAn, T00202_A4387FasPreMAn[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreMAn");
               GXutil.writeLogRaw("Old: ",Z4387FasPreMAn);
               GXutil.writeLogRaw("Current: ",T00202_A4387FasPreMAn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T00202_A4388FasPreFAn[0])) ) )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreFAn");
               GXutil.writeLogRaw("Old: ",Z4388FasPreFAn);
               GXutil.writeLogRaw("Current: ",T00202_A4388FasPreFAn[0]);
            }
            if ( Z10882FasPreU != T00202_A10882FasPreU[0] )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreU");
               GXutil.writeLogRaw("Old: ",Z10882FasPreU);
               GXutil.writeLogRaw("Current: ",T00202_A10882FasPreU[0]);
            }
            if ( DecimalUtil.compareTo(Z12576FasPreMt2, T00202_A12576FasPreMt2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasPreMt2");
               GXutil.writeLogRaw("Old: ",Z12576FasPreMt2);
               GXutil.writeLogRaw("Current: ",T00202_A12576FasPreMt2[0]);
            }
            if ( GXutil.strcmp(Z14258FasFactura, T00202_A14258FasFactura[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tprefas:[seudo value changed for attri]"+"FasFactura");
               GXutil.writeLogRaw("Old: ",Z14258FasFactura);
               GXutil.writeLogRaw("Current: ",T00202_A14258FasFactura[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2085( )
   {
      beforeValidate2085( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2085( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2085( 0) ;
         checkOptimisticConcurrency2085( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2085( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2085( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002081 */
                  pr_default.execute(79, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, A14258FasFactura, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                  if ( (pr_default.getStatus(79) == 1) )
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
            load2085( ) ;
         }
         endLevel2085( ) ;
      }
      closeExtendedTableCursors2085( ) ;
   }

   public void update2085( )
   {
      beforeValidate2085( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2085( ) ;
      }
      if ( ( nIsMod_85 != 0 ) || ( nIsDirty_85 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency2085( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm2085( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate2085( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T002082 */
                     pr_default.execute(80, new Object[] {Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, A14258FasFactura, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                     if ( (pr_default.getStatus(80) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate2085( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey2085( ) ;
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
            endLevel2085( ) ;
         }
      }
      closeExtendedTableCursors2085( ) ;
   }

   public void deferredUpdate2085( )
   {
   }

   public void delete2085( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2085( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2085( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2085( ) ;
         afterConfirm2085( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2085( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002083 */
               pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
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
      sMode85 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2085( ) ;
      Gx_mode = sMode85 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2085( )
   {
      standaloneModal2085( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002084 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         A460FasDsc = T002084_A460FasDsc[0] ;
         A4642FasDsc2 = T002084_A4642FasDsc2[0] ;
         n4642FasDsc2 = T002084_n4642FasDsc2[0] ;
         A7070FasSigla = T002084_A7070FasSigla[0] ;
         n7070FasSigla = T002084_n7070FasSigla[0] ;
         pr_default.close(82);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002085 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Lin)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T002086 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T002087 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T002088 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T002089 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASCLIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T002090 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIMTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T002091 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T002092 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFSD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T002093 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cab Est Cliente-Fase(Servicios", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T002094 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de Formulac. por Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T002095 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T002096 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T002097 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T002098 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRETIT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
      }
   }

   public void endLevel2085( )
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

   public void scanStart2085( )
   {
      /* Scan By routine */
      /* Using cursor T002099 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A457FasCod = T002099_A457FasCod[0] ;
         n457FasCod = T002099_n457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2085( )
   {
      /* Scan next routine */
      pr_default.readNext(97);
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A457FasCod = T002099_A457FasCod[0] ;
         n457FasCod = T002099_n457FasCod[0] ;
      }
   }

   public void scanEnd2085( )
   {
      pr_default.close(97);
   }

   public void afterConfirm2085( )
   {
      /* After Confirm Rules */
      if ( isUpd( )  && true /* After */ && ( ( DecimalUtil.compareTo(A467FasPreMtr, O467FasPreMtr) != 0 ) || ( DecimalUtil.compareTo(A466FasPreKgm, O466FasPreKgm) != 0 ) ) )
      {
         A4385FasPreFAc = Gx_date ;
         n4385FasPreFAc = false ;
      }
   }

   public void beforeInsert2085( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2085( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2085( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2085( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2085( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2085( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPreMt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMt2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPreFAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      chkFasPreU.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreU.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      chkFasPreKgF.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasPreKgF.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      chkFasKgsEnt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "Enabled", GXutil.ltrimstr( chkFasKgsEnt.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      edtFasKgsMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgsMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgsMn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes2085( )
   {
   }

   public void send_integrity_lvl_hashes2021( )
   {
   }

   public void subsflControlProps_5085( )
   {
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_50_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_50_idx ;
      edtFasPreMt2_Internalname = "FASPREMT2_"+sGXsfl_50_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_50_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_50_idx ;
      chkFasPreU.setInternalname( "FASPREU_"+sGXsfl_50_idx );
      chkFasPreKgF.setInternalname( "FASPREKGF_"+sGXsfl_50_idx );
      chkFasKgsEnt.setInternalname( "FASKGSENT_"+sGXsfl_50_idx );
      edtFasKgsMn_Internalname = "FASKGSMN_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_5085( )
   {
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_50_fel_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_50_fel_idx ;
      edtFasPreMt2_Internalname = "FASPREMT2_"+sGXsfl_50_fel_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_50_fel_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_50_fel_idx ;
      chkFasPreU.setInternalname( "FASPREU_"+sGXsfl_50_fel_idx );
      chkFasPreKgF.setInternalname( "FASPREKGF_"+sGXsfl_50_fel_idx );
      chkFasKgsEnt.setInternalname( "FASKGSENT_"+sGXsfl_50_fel_idx );
      edtFasKgsMn_Internalname = "FASKGSMN_"+sGXsfl_50_fel_idx ;
   }

   public void addRow2085( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5085( ) ;
      sendRow2085( ) ;
   }

   public void sendRow2085( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreMtr_Enabled!=0) ? localUtil.format( A467FasPreMtr, "ZZZZZZ9.999") : localUtil.format( A467FasPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMt2_Internalname,GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreMt2_Enabled!=0) ? localUtil.format( A12576FasPreMt2, "ZZZZZZ9.99999") : localUtil.format( A12576FasPreMt2, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMt2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPreMt2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreKgm_Enabled!=0) ? localUtil.format( A466FasPreKgm, "ZZZZZZ9.999") : localUtil.format( A466FasPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreFAc_Internalname,localUtil.format(A4385FasPreFAc, "99/99/99"),localUtil.format( A4385FasPreFAc, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreFAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPreFAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "FASPREU_" + sGXsfl_50_idx ;
      chkFasPreU.setName( GXCCtl );
      chkFasPreU.setWebtags( "" );
      chkFasPreU.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "TitleCaption", chkFasPreU.getCaption(), !bGXsfl_50_Refreshing);
      chkFasPreU.setCheckedValue( "0" );
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreU.getInternalname(),GXutil.str( A10882FasPreU, 1, 0),"","",Integer.valueOf(-1),Integer.valueOf(chkFasPreU.getEnabled()),"1","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(56, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "FASPREKGF_" + sGXsfl_50_idx ;
      chkFasPreKgF.setName( GXCCtl );
      chkFasPreKgF.setWebtags( "" );
      chkFasPreKgF.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "TitleCaption", chkFasPreKgF.getCaption(), !bGXsfl_50_Refreshing);
      chkFasPreKgF.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A12577FasPreKgF)==0) )
      {
         A12577FasPreKgF = httpContext.getMessage( "N", "") ;
         n12577FasPreKgF = false ;
      }
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasPreKgF.getInternalname(),A12577FasPreKgF,"","",Integer.valueOf(-1),Integer.valueOf(chkFasPreKgF.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(57, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,57);\""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "FASKGSENT_" + sGXsfl_50_idx ;
      chkFasKgsEnt.setName( GXCCtl );
      chkFasKgsEnt.setWebtags( "" );
      chkFasKgsEnt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "TitleCaption", chkFasKgsEnt.getCaption(), !bGXsfl_50_Refreshing);
      chkFasKgsEnt.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A13587FasKgsEnt)==0) )
      {
         A13587FasKgsEnt = httpContext.getMessage( "N", "") ;
         n13587FasKgsEnt = false ;
      }
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkFasKgsEnt.getInternalname(),A13587FasKgsEnt,"","",Integer.valueOf(-1),Integer.valueOf(chkFasKgsEnt.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(58, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,58);\""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgsMn_Internalname,GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasKgsMn_Enabled!=0) ? localUtil.format( A12704FasKgsMn, "ZZZZZ9.99") : localUtil.format( A12704FasKgsMn, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasKgsMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasKgsMn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes2085( ) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z470FasSumTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z470FasSumTin));
      GXCCtl = "Z12577FasPreKgF_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12577FasPreKgF));
      GXCCtl = "Z12704FasKgsMn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12704FasKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13587FasKgsEnt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13587FasKgsEnt));
      GXCCtl = "Z4385FasPreFAc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4385FasPreFAc, 0, "/"));
      GXCCtl = "Z467FasPreMtr_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z466FasPreKgm_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3615FasFacCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3615FasFacCod));
      GXCCtl = "Z4386FasPreKAn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4387FasPreMAn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4388FasPreFAn_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4388FasPreFAn, 0, "/"));
      GXCCtl = "Z10882FasPreU_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10882FasPreU, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12576FasPreMt2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12576FasPreMt2, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14258FasFactura_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14258FasFactura));
      GXCCtl = "O466FasPreKgm_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O467FasPreMtr_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_85_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_85_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_85_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_50_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV48TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV48TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV29EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV46CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "FASSUMTIN_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A470FasSumTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMTR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMT2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMt2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFAC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreU.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreKgF.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASKGSENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkFasKgsEnt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASKGSMN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgsMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow2085( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5085( ) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreMt2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMT2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreFAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkFasPreU.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkFasPreKgF.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      chkFasKgsEnt.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "FASKGSENT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtFasKgsMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGSMN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      n457FasCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREMTR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreMtr_Internalname ;
         wbErr = true ;
         A467FasPreMtr = DecimalUtil.ZERO ;
         n467FasPreMtr = false ;
      }
      else
      {
         A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
         n467FasPreMtr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREMT2_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreMt2_Internalname ;
         wbErr = true ;
         A12576FasPreMt2 = DecimalUtil.ZERO ;
         n12576FasPreMt2 = false ;
      }
      else
      {
         A12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( edtFasPreMt2_Internalname)) ;
         n12576FasPreMt2 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREKGM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreKgm_Internalname ;
         wbErr = true ;
         A466FasPreKgm = DecimalUtil.ZERO ;
         n466FasPreKgm = false ;
      }
      else
      {
         A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
         n466FasPreKgm = false ;
      }
      A4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( edtFasPreFAc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      n4385FasPreFAc = false ;
      if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
      {
         GXCCtl = "FASPREU_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkFasPreU.getInternalname() ;
         wbErr = true ;
         A10882FasPreU = (byte)(0) ;
         n10882FasPreU = false ;
      }
      else
      {
         A10882FasPreU = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkFasPreU.getInternalname()), "1")==0) ? 1 : 0)) ;
         n10882FasPreU = false ;
      }
      A12577FasPreKgF = ((GXutil.strcmp(httpContext.cgiGet( chkFasPreKgF.getInternalname()), "S")==0) ? "S" : "N") ;
      n12577FasPreKgF = false ;
      A13587FasKgsEnt = ((GXutil.strcmp(httpContext.cgiGet( chkFasKgsEnt.getInternalname()), "S")==0) ? "S" : "N") ;
      n13587FasKgsEnt = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FASKGSMN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasKgsMn_Internalname ;
         wbErr = true ;
         A12704FasKgsMn = DecimalUtil.ZERO ;
         n12704FasKgsMn = false ;
      }
      else
      {
         A12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( edtFasKgsMn_Internalname)) ;
         n12704FasKgsMn = false ;
      }
      GXCCtl = "Z457FasCod_" + sGXsfl_50_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z470FasSumTin_" + sGXsfl_50_idx ;
      Z470FasSumTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12577FasPreKgF_" + sGXsfl_50_idx ;
      Z12577FasPreKgF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12704FasKgsMn_" + sGXsfl_50_idx ;
      Z12704FasKgsMn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13587FasKgsEnt_" + sGXsfl_50_idx ;
      Z13587FasKgsEnt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4385FasPreFAc_" + sGXsfl_50_idx ;
      Z4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z467FasPreMtr_" + sGXsfl_50_idx ;
      Z467FasPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z466FasPreKgm_" + sGXsfl_50_idx ;
      Z466FasPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3615FasFacCod_" + sGXsfl_50_idx ;
      Z3615FasFacCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4386FasPreKAn_" + sGXsfl_50_idx ;
      Z4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4387FasPreMAn_" + sGXsfl_50_idx ;
      Z4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4388FasPreFAn_" + sGXsfl_50_idx ;
      Z4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10882FasPreU_" + sGXsfl_50_idx ;
      Z10882FasPreU = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12576FasPreMt2_" + sGXsfl_50_idx ;
      Z12576FasPreMt2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14258FasFactura_" + sGXsfl_50_idx ;
      Z14258FasFactura = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z470FasSumTin_" + sGXsfl_50_idx ;
      A470FasSumTin = httpContext.cgiGet( GXCCtl) ;
      n470FasSumTin = false ;
      GXCCtl = "Z3615FasFacCod_" + sGXsfl_50_idx ;
      A3615FasFacCod = httpContext.cgiGet( GXCCtl) ;
      n3615FasFacCod = false ;
      GXCCtl = "Z4386FasPreKAn_" + sGXsfl_50_idx ;
      A4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n4386FasPreKAn = false ;
      GXCCtl = "Z4387FasPreMAn_" + sGXsfl_50_idx ;
      A4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n4387FasPreMAn = false ;
      GXCCtl = "Z4388FasPreFAn_" + sGXsfl_50_idx ;
      A4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      n4388FasPreFAn = false ;
      GXCCtl = "Z14258FasFactura_" + sGXsfl_50_idx ;
      A14258FasFactura = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O466FasPreKgm_" + sGXsfl_50_idx ;
      O466FasPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O467FasPreMtr_" + sGXsfl_50_idx ;
      O467FasPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_85_" + sGXsfl_50_idx ;
      nRcdDeleted_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_85_" + sGXsfl_50_idx ;
      nRcdExists_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_85_" + sGXsfl_50_idx ;
      nIsMod_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "FASSUMTIN_" + sGXsfl_50_idx ;
      A470FasSumTin = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtFasPreFAc_Enabled = edtFasPreFAc_Enabled ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
   }

   public void confirmValues200( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5085( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5085( ) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z470FasSumTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z470FasSumTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12577FasPreKgF_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12577FasPreKgF_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12577FasPreKgF_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12704FasKgsMn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12704FasKgsMn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12704FasKgsMn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13587FasKgsEnt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13587FasKgsEnt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13587FasKgsEnt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4385FasPreFAc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z467FasPreMtr_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z467FasPreMtr_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z466FasPreKgm_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z466FasPreKgm_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3615FasFacCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3615FasFacCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4386FasPreKAn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4387FasPreMAn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4388FasPreFAn_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10882FasPreU_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10882FasPreU_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10882FasPreU_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12576FasPreMt2_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12576FasPreMt2_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12576FasPreMt2_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z14258FasFactura_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z14258FasFactura_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14258FasFactura_"+sGXsfl_50_idx) ;
      }
      httpContext.changePostValue( "O466FasPreKgm", httpContext.cgiGet( "T466FasPreKgm")) ;
      httpContext.deletePostValue( "T466FasPreKgm") ;
      httpContext.changePostValue( "O467FasPreMtr", httpContext.cgiGet( "T467FasPreMtr")) ;
      httpContext.deletePostValue( "T467FasPreMtr") ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tprefas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV46CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPREFAS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      forbiddenHiddens.add("CliAct", GXutil.rtrim( localUtil.format( A10045CliAct, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tprefas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10045CliAct", GXutil.rtrim( Z10045CliAct));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV50FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV50FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV48TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV48TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV48TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV46CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV46CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIACT", GXutil.rtrim( A10045CliAct));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSUMTIN", GXutil.rtrim( A470FasSumTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFACCOD", GXutil.rtrim( A3615FasFacCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKAN", GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMAN", GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFAN", localUtil.dtoc( A4388FasPreFAn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFACTURA", GXutil.rtrim( A14258FasFactura));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC2", GXutil.rtrim( A4642FasDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSIGLA", GXutil.rtrim( A7070FasSigla));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Objectcall", GXutil.rtrim( Combo_fascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_fascod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Isgriditem", GXutil.booltostr( Combo_fascod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_level1_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_level1_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridtitlescategories));
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
      return formatLink("app.facturacion.tprefas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV46CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TPREFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precios por Fase", "") ;
   }

   public void initializeNonKey2021( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A10045CliAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10045CliAct", A10045CliAct);
      Z279CliNom = "" ;
      Z10045CliAct = "" ;
   }

   public void initAll2021( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey2021( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey2085( )
   {
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A4642FasDsc2 = "" ;
      n4642FasDsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", A4642FasDsc2);
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      A3615FasFacCod = "" ;
      n3615FasFacCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3615FasFacCod", A3615FasFacCod);
      A4386FasPreKAn = DecimalUtil.ZERO ;
      n4386FasPreKAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4386FasPreKAn", GXutil.ltrimstr( A4386FasPreKAn, 13, 5));
      A4387FasPreMAn = DecimalUtil.ZERO ;
      n4387FasPreMAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4387FasPreMAn", GXutil.ltrimstr( A4387FasPreMAn, 13, 5));
      A4388FasPreFAn = GXutil.nullDate() ;
      n4388FasPreFAn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4388FasPreFAn", localUtil.format(A4388FasPreFAn, "99/99/99"));
      A10882FasPreU = (byte)(0) ;
      n10882FasPreU = false ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      n12576FasPreMt2 = false ;
      A7070FasSigla = "" ;
      n7070FasSigla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", A7070FasSigla);
      A14258FasFactura = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14258FasFactura", A14258FasFactura);
      A470FasSumTin = "S" ;
      n470FasSumTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
      A12577FasPreKgF = httpContext.getMessage( "N", "") ;
      n12577FasPreKgF = false ;
      A12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
      n12704FasKgsMn = false ;
      A13587FasKgsEnt = httpContext.getMessage( "N", "") ;
      n13587FasKgsEnt = false ;
      A4385FasPreFAc = Gx_date ;
      n4385FasPreFAc = false ;
      O466FasPreKgm = A466FasPreKgm ;
      n466FasPreKgm = false ;
      O467FasPreMtr = A467FasPreMtr ;
      n467FasPreMtr = false ;
      Z470FasSumTin = "" ;
      Z12577FasPreKgF = "" ;
      Z12704FasKgsMn = DecimalUtil.ZERO ;
      Z13587FasKgsEnt = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z3615FasFacCod = "" ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z10882FasPreU = (byte)(0) ;
      Z12576FasPreMt2 = DecimalUtil.ZERO ;
      Z14258FasFactura = "" ;
   }

   public void initAll2085( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      initializeNonKey2085( ) ;
   }

   public void standaloneModalInsert2085( )
   {
      A470FasSumTin = i470FasSumTin ;
      n470FasSumTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470FasSumTin", A470FasSumTin);
      A12577FasPreKgF = i12577FasPreKgF ;
      n12577FasPreKgF = false ;
      A12704FasKgsMn = i12704FasKgsMn ;
      n12704FasKgsMn = false ;
      A13587FasKgsEnt = i13587FasKgsEnt ;
      n13587FasKgsEnt = false ;
      A4385FasPreFAc = i4385FasPreFAc ;
      n4385FasPreFAc = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654774", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tprefas.js", "?20268211654775", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties85( )
   {
      edtFasPreFAc_Enabled = defedtFasPreFAc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12576FasPreMt2, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMt2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.format(A4385FasPreFAc, "99/99/99"));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreU.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A12577FasPreKgF));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkFasPreKgF.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13587FasKgsEnt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkFasKgsEnt.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12704FasKgsMn, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgsMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncopiar_Internalname = "BTNCOPIAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasPreMt2_Internalname = "FASPREMT2" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasPreFAc_Internalname = "FASPREFAC" ;
      chkFasPreU.setInternalname( "FASPREU" );
      chkFasPreKgF.setInternalname( "FASPREKGF" );
      chkFasKgsEnt.setInternalname( "FASKGSENT" );
      edtFasKgsMn_Internalname = "FASKGSMN" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precios por Fase", "") );
      edtFasKgsMn_Jsonclick = "" ;
      chkFasKgsEnt.setCaption( "" );
      chkFasPreKgF.setCaption( "" );
      chkFasPreU.setCaption( "" );
      edtFasPreFAc_Jsonclick = "" ;
      edtFasPreKgm_Jsonclick = "" ;
      edtFasPreMt2_Jsonclick = "" ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_fascod_Titlecontrolidtoreplace = "" ;
      edtFasKgsMn_Enabled = 1 ;
      chkFasKgsEnt.setEnabled( 1 );
      chkFasPreKgF.setEnabled( 1 );
      chkFasPreU.setEnabled( 1 );
      edtFasPreFAc_Enabled = 0 ;
      edtFasPreKgm_Enabled = 1 ;
      edtFasPreMt2_Enabled = 1 ;
      edtFasPreMtr_Enabled = 1 ;
      edtFasCod_Enabled = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;Precio;Precio;Precio;;;;;" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtncopiar_Visible = 1 ;
      bttBtnpdf_Visible = 1 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5085( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal2085( ) ;
         standaloneModal2085( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow2085( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5085( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "FASPREU_" + sGXsfl_50_idx ;
      chkFasPreU.setName( GXCCtl );
      chkFasPreU.setWebtags( "" );
      chkFasPreU.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreU.getInternalname(), "TitleCaption", chkFasPreU.getCaption(), !bGXsfl_50_Refreshing);
      chkFasPreU.setCheckedValue( "0" );
      A10882FasPreU = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A10882FasPreU, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n10882FasPreU = false ;
      GXCCtl = "FASPREKGF_" + sGXsfl_50_idx ;
      chkFasPreKgF.setName( GXCCtl );
      chkFasPreKgF.setWebtags( "" );
      chkFasPreKgF.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasPreKgF.getInternalname(), "TitleCaption", chkFasPreKgF.getCaption(), !bGXsfl_50_Refreshing);
      chkFasPreKgF.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A12577FasPreKgF)==0) )
      {
         A12577FasPreKgF = httpContext.getMessage( "N", "") ;
         n12577FasPreKgF = false ;
      }
      GXCCtl = "FASKGSENT_" + sGXsfl_50_idx ;
      chkFasKgsEnt.setName( GXCCtl );
      chkFasKgsEnt.setWebtags( "" );
      chkFasKgsEnt.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFasKgsEnt.getInternalname(), "TitleCaption", chkFasKgsEnt.getCaption(), !bGXsfl_50_Refreshing);
      chkFasKgsEnt.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A13587FasKgsEnt)==0) )
      {
         A13587FasKgsEnt = httpContext.getMessage( "N", "") ;
         n13587FasKgsEnt = false ;
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

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      n4642FasDsc2 = false ;
      n7070FasSigla = false ;
      /* Using cursor T002084 */
      pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(82) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T002084_A460FasDsc[0] ;
      A4642FasDsc2 = T002084_A4642FasDsc2[0] ;
      n4642FasDsc2 = T002084_n4642FasDsc2[0] ;
      A7070FasSigla = T002084_A7070FasSigla[0] ;
      n7070FasSigla = T002084_n7070FasSigla[0] ;
      pr_default.close(82);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", GXutil.rtrim( A4642FasDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A7070FasSigla", GXutil.rtrim( A7070FasSigla));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV48TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV46CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10045CliAct',fld:'CLIACT',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e13202',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV48TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOPDF'","{handler:'e14202',iparms:[{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCOPIAR'","{handler:'e112021',iparms:[{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("'DOCOPIAR'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''},{av:'A7070FasSigla',fld:'FASSIGLA',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''},{av:'A7070FasSigla',fld:'FASSIGLA',pic:''}]}");
      setEventMetadata("VALID_FASPREMTR","{handler:'valid_Faspremtr',iparms:[]");
      setEventMetadata("VALID_FASPREMTR",",oparms:[]}");
      setEventMetadata("VALID_FASPREKGM","{handler:'valid_Fasprekgm',iparms:[]");
      setEventMetadata("VALID_FASPREKGM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Faskgsmn',iparms:[]");
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
      pr_default.close(82);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV29EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z10045CliAct = "" ;
      Z457FasCod = "" ;
      Z470FasSumTin = "" ;
      Z12577FasPreKgF = "" ;
      Z12704FasKgsMn = DecimalUtil.ZERO ;
      Z13587FasKgsEnt = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z3615FasFacCod = "" ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z12576FasPreMt2 = DecimalUtil.ZERO ;
      Z14258FasFactura = "" ;
      O466FasPreKgm = DecimalUtil.ZERO ;
      O467FasPreMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV29EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_date = GXutil.nullDate() ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      TempTags = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncopiar_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV54Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      AV50FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode85 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A10045CliAct = "" ;
      A407EmprNom = "" ;
      A470FasSumTin = "" ;
      A3615FasFacCod = "" ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A4388FasPreFAn = GXutil.nullDate() ;
      A14258FasFactura = "" ;
      A460FasDsc = "" ;
      A4642FasDsc2 = "" ;
      A7070FasSigla = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_fascod_Objectcall = "" ;
      Combo_fascod_Class = "" ;
      Combo_fascod_Icontype = "" ;
      Combo_fascod_Icon = "" ;
      Combo_fascod_Tooltip = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_fascod_Selectedtext_set = "" ;
      Combo_fascod_Selectedtext_get = "" ;
      Combo_fascod_Gamoauthtoken = "" ;
      Combo_fascod_Ddointernalname = "" ;
      Combo_fascod_Titlecontrolalign = "" ;
      Combo_fascod_Dropdownoptionstype = "" ;
      Combo_fascod_Datalisttype = "" ;
      Combo_fascod_Datalistfixedvalues = "" ;
      Combo_fascod_Datalistproc = "" ;
      Combo_fascod_Datalistprocparametersprefix = "" ;
      Combo_fascod_Remoteservicesparameters = "" ;
      Combo_fascod_Htmltemplate = "" ;
      Combo_fascod_Multiplevaluestype = "" ;
      Combo_fascod_Loadingdata = "" ;
      Combo_fascod_Noresultsfound = "" ;
      Combo_fascod_Emptyitemtext = "" ;
      Combo_fascod_Onlyselectedvalues = "" ;
      Combo_fascod_Selectalltext = "" ;
      Combo_fascod_Multiplevaluesseparator = "" ;
      Combo_fascod_Addnewoptiontext = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
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
      A467FasPreMtr = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A12577FasPreKgF = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      T466FasPreKgm = DecimalUtil.ZERO ;
      T467FasPreMtr = DecimalUtil.ZERO ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV47WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV48TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV49WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV51ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00207_A407EmprNom = new String[] {""} ;
      T00207_n407EmprNom = new boolean[] {false} ;
      T00208_A252CliCod = new int[1] ;
      T00208_n252CliCod = new boolean[] {false} ;
      T00208_A279CliNom = new String[] {""} ;
      T00208_A407EmprNom = new String[] {""} ;
      T00208_n407EmprNom = new boolean[] {false} ;
      T00208_A10045CliAct = new String[] {""} ;
      T00208_A396EmprCod = new String[] {""} ;
      T00209_A396EmprCod = new String[] {""} ;
      T00209_A252CliCod = new int[1] ;
      T00209_n252CliCod = new boolean[] {false} ;
      T00206_A252CliCod = new int[1] ;
      T00206_n252CliCod = new boolean[] {false} ;
      T00206_A279CliNom = new String[] {""} ;
      T00206_A10045CliAct = new String[] {""} ;
      T00206_A396EmprCod = new String[] {""} ;
      T002010_A396EmprCod = new String[] {""} ;
      T002010_A252CliCod = new int[1] ;
      T002010_n252CliCod = new boolean[] {false} ;
      T002011_A396EmprCod = new String[] {""} ;
      T002011_A252CliCod = new int[1] ;
      T002011_n252CliCod = new boolean[] {false} ;
      T00205_A252CliCod = new int[1] ;
      T00205_n252CliCod = new boolean[] {false} ;
      T00205_A279CliNom = new String[] {""} ;
      T00205_A10045CliAct = new String[] {""} ;
      T00205_A396EmprCod = new String[] {""} ;
      T002015_A396EmprCod = new String[] {""} ;
      T002015_A252CliCod = new int[1] ;
      T002015_n252CliCod = new boolean[] {false} ;
      T002015_A6930Lb_rclin = new int[1] ;
      T002016_A396EmprCod = new String[] {""} ;
      T002016_A6850Tex_NPed = new int[1] ;
      T002017_A396EmprCod = new String[] {""} ;
      T002017_A252CliCod = new int[1] ;
      T002017_n252CliCod = new boolean[] {false} ;
      T002017_A829TipArtCod = new short[1] ;
      T002017_A831TipColCod = new byte[1] ;
      T002017_A583IntCod = new byte[1] ;
      T002017_A5098TipDisCod = new String[] {""} ;
      T002017_A6603Est1_anyo = new short[1] ;
      T002017_A6604Est1_mes = new byte[1] ;
      T002017_A6605Est1_dia = new byte[1] ;
      T002018_A396EmprCod = new String[] {""} ;
      T002018_A6319C_Barcod = new int[1] ;
      T002018_A6320C_Barcodre = new byte[1] ;
      T002018_A6321C_Barcodpa = new String[] {""} ;
      T002018_A6322C_Reclinma = new short[1] ;
      T002019_A396EmprCod = new String[] {""} ;
      T002019_A6235DevEmpCod = new int[1] ;
      T002020_A396EmprCod = new String[] {""} ;
      T002020_A602MaqCod = new String[] {""} ;
      T002020_A6078MaqCliCod = new int[1] ;
      T002020_A6079MaqArtCod = new String[] {""} ;
      T002021_A396EmprCod = new String[] {""} ;
      T002021_A5532Lb_numero = new int[1] ;
      T002022_A396EmprCod = new String[] {""} ;
      T002022_A252CliCod = new int[1] ;
      T002022_n252CliCod = new boolean[] {false} ;
      T002022_A5503CliifLin = new short[1] ;
      T002023_A396EmprCod = new String[] {""} ;
      T002023_A252CliCod = new int[1] ;
      T002023_n252CliCod = new boolean[] {false} ;
      T002023_A5499ClieiLin = new short[1] ;
      T002024_A396EmprCod = new String[] {""} ;
      T002024_A252CliCod = new int[1] ;
      T002024_n252CliCod = new boolean[] {false} ;
      T002024_A5495ClidtLin = new short[1] ;
      T002025_A396EmprCod = new String[] {""} ;
      T002025_A252CliCod = new int[1] ;
      T002025_n252CliCod = new boolean[] {false} ;
      T002025_A5491CliedLin = new short[1] ;
      T002026_A396EmprCod = new String[] {""} ;
      T002026_A252CliCod = new int[1] ;
      T002026_n252CliCod = new boolean[] {false} ;
      T002026_A5452P_ForCod = new String[] {""} ;
      T002027_A396EmprCod = new String[] {""} ;
      T002027_A252CliCod = new int[1] ;
      T002027_n252CliCod = new boolean[] {false} ;
      T002027_A5443Mdl_Cod = new String[] {""} ;
      T002028_A396EmprCod = new String[] {""} ;
      T002028_A252CliCod = new int[1] ;
      T002028_n252CliCod = new boolean[] {false} ;
      T002028_A5436IntCodF2 = new short[1] ;
      T002029_A396EmprCod = new String[] {""} ;
      T002029_A252CliCod = new int[1] ;
      T002029_n252CliCod = new boolean[] {false} ;
      T002029_A5396IntCodFC = new byte[1] ;
      T002029_A5434Tip_ColC = new byte[1] ;
      T002030_A396EmprCod = new String[] {""} ;
      T002030_A252CliCod = new int[1] ;
      T002030_n252CliCod = new boolean[] {false} ;
      T002030_A5428FasPreCod = new String[] {""} ;
      T002031_A396EmprCod = new String[] {""} ;
      T002031_A252CliCod = new int[1] ;
      T002031_n252CliCod = new boolean[] {false} ;
      T002031_A5398Cli_Proc = new String[] {""} ;
      T002032_A396EmprCod = new String[] {""} ;
      T002032_A5130PagIden = new int[1] ;
      T002033_A396EmprCod = new String[] {""} ;
      T002033_A5059Hl_hdr = new int[1] ;
      T002033_A5060Hl_hdrr = new byte[1] ;
      T002033_A5061Hl_hdrp = new String[] {""} ;
      T002034_A396EmprCod = new String[] {""} ;
      T002034_A252CliCod = new int[1] ;
      T002034_n252CliCod = new boolean[] {false} ;
      T002034_A4718DishCod = new String[] {""} ;
      T002034_A5020TipEstCod = new byte[1] ;
      T002034_A5022GraCod = new byte[1] ;
      T002035_A396EmprCod = new String[] {""} ;
      T002035_A4618EnsLCod = new int[1] ;
      T002036_A396EmprCod = new String[] {""} ;
      T002036_A4492HreBarCod = new int[1] ;
      T002036_A4493HreBarReo = new byte[1] ;
      T002036_A4494HreBarPar = new String[] {""} ;
      T002036_A4495HreNumCie = new byte[1] ;
      T002037_A396EmprCod = new String[] {""} ;
      T002037_A252CliCod = new int[1] ;
      T002037_n252CliCod = new boolean[] {false} ;
      T002037_A4415EstCol = new String[] {""} ;
      T002038_A396EmprCod = new String[] {""} ;
      T002038_A4185WEBUSU = new String[] {""} ;
      T002039_A396EmprCod = new String[] {""} ;
      T002039_A252CliCod = new int[1] ;
      T002039_n252CliCod = new boolean[] {false} ;
      T002039_A4079WEBDISCOD = new String[] {""} ;
      T002039_A4078EMPCOD = new String[] {""} ;
      T002040_A396EmprCod = new String[] {""} ;
      T002040_A2637HisEstHRu = new int[1] ;
      T002040_A2636HisEstHRe = new byte[1] ;
      T002040_A2635HisEstHPa = new String[] {""} ;
      T002040_A2638HisEstLCo = new byte[1] ;
      T002040_A2630HisEstCom = new String[] {""} ;
      T002040_A2634HisEstFon = new String[] {""} ;
      T002041_A396EmprCod = new String[] {""} ;
      T002041_A2574GrpDibCod = new int[1] ;
      T002042_A396EmprCod = new String[] {""} ;
      T002042_A2558GrmDibCod = new int[1] ;
      T002043_A396EmprCod = new String[] {""} ;
      T002043_A2542GrcDibCod = new int[1] ;
      T002044_A396EmprCod = new String[] {""} ;
      T002044_A1031EmpesCod = new String[] {""} ;
      T002044_A252CliCod = new int[1] ;
      T002044_n252CliCod = new boolean[] {false} ;
      T002044_A1032FonCod = new String[] {""} ;
      T002045_A396EmprCod = new String[] {""} ;
      T002045_A1013DibCli = new String[] {""} ;
      T002045_A252CliCod = new int[1] ;
      T002045_n252CliCod = new boolean[] {false} ;
      T002045_A1014DibInt = new int[1] ;
      T002046_A396EmprCod = new String[] {""} ;
      T002046_A1736AlbExtCod = new long[1] ;
      T002047_A396EmprCod = new String[] {""} ;
      T002047_A252CliCod = new int[1] ;
      T002047_n252CliCod = new boolean[] {false} ;
      T002047_A3661FacProAny = new short[1] ;
      T002047_A3662FacProSer = new String[] {""} ;
      T002047_A3663FacProInt = new byte[1] ;
      T002047_A3664FacProTip = new byte[1] ;
      T002047_A3665FacProTar = new short[1] ;
      T002048_A396EmprCod = new String[] {""} ;
      T002048_A3646EstTinAny = new short[1] ;
      T002048_A3647EstTinMes = new byte[1] ;
      T002048_A3648EstTinDia = new byte[1] ;
      T002048_A1929EstTinNr = new short[1] ;
      T002049_A396EmprCod = new String[] {""} ;
      T002049_A3617AlbTrnCod = new long[1] ;
      T002050_A396EmprCod = new String[] {""} ;
      T002050_A252CliCod = new int[1] ;
      T002050_n252CliCod = new boolean[] {false} ;
      T002050_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002051_A396EmprCod = new String[] {""} ;
      T002051_A3073RepCod = new String[] {""} ;
      T002051_A252CliCod = new int[1] ;
      T002051_n252CliCod = new boolean[] {false} ;
      T002052_A396EmprCod = new String[] {""} ;
      T002052_A3061Codia = new byte[1] ;
      T002052_A3062CoMes = new byte[1] ;
      T002052_A3063CoAny = new short[1] ;
      T002052_A3065CoLin = new byte[1] ;
      T002052_A3010CoBarCod = new int[1] ;
      T002052_A3011CoBarReo = new byte[1] ;
      T002052_A3012CoBarPar = new String[] {""} ;
      T002053_A396EmprCod = new String[] {""} ;
      T002053_A2971SabFacCod = new int[1] ;
      T002054_A396EmprCod = new String[] {""} ;
      T002054_A2954TiDia = new byte[1] ;
      T002054_A2955TiMes = new byte[1] ;
      T002054_A2956TiAny = new short[1] ;
      T002054_A2958TiLin = new byte[1] ;
      T002054_A2959TiBarCod = new int[1] ;
      T002054_A2960TiBarReo = new byte[1] ;
      T002054_A2961TiBarPar = new String[] {""} ;
      T002055_A396EmprCod = new String[] {""} ;
      T002055_A252CliCod = new int[1] ;
      T002055_n252CliCod = new boolean[] {false} ;
      T002055_A2933RecTipCon = new short[1] ;
      T002056_A396EmprCod = new String[] {""} ;
      T002056_A252CliCod = new int[1] ;
      T002056_n252CliCod = new boolean[] {false} ;
      T002056_A2927RecProCod = new String[] {""} ;
      T002057_A396EmprCod = new String[] {""} ;
      T002057_A252CliCod = new int[1] ;
      T002057_n252CliCod = new boolean[] {false} ;
      T002057_A2891HMaForSer = new String[] {""} ;
      T002057_A2892HMaForCNom = new String[] {""} ;
      T002057_A2893HMaForCNum = new int[1] ;
      T002057_A2894HMaTipCCod = new byte[1] ;
      T002057_A2895HMaForNumC = new int[1] ;
      T002057_A2897HMaColLin = new short[1] ;
      T002057_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002057_A2907HmaLin = new short[1] ;
      T002058_A396EmprCod = new String[] {""} ;
      T002058_A252CliCod = new int[1] ;
      T002058_n252CliCod = new boolean[] {false} ;
      T002058_A425EstAny = new short[1] ;
      T002058_A2755EstSerFac = new String[] {""} ;
      T002059_A396EmprCod = new String[] {""} ;
      T002059_A2730RecTipCo = new short[1] ;
      T002059_A252CliCod = new int[1] ;
      T002059_n252CliCod = new boolean[] {false} ;
      T002060_A396EmprCod = new String[] {""} ;
      T002060_A2720TarSec = new String[] {""} ;
      T002060_A252CliCod = new int[1] ;
      T002060_n252CliCod = new boolean[] {false} ;
      T002060_A829TipArtCod = new short[1] ;
      T002060_A831TipColCod = new byte[1] ;
      T002061_A396EmprCod = new String[] {""} ;
      T002061_A2382AbcTerCod = new String[] {""} ;
      T002061_A2381AbcSec = new String[] {""} ;
      T002061_A252CliCod = new int[1] ;
      T002061_n252CliCod = new boolean[] {false} ;
      T002062_A396EmprCod = new String[] {""} ;
      T002062_A252CliCod = new int[1] ;
      T002062_n252CliCod = new boolean[] {false} ;
      T002062_A2308CliDesCod = new int[1] ;
      T002063_A396EmprCod = new String[] {""} ;
      T002063_A2268MovParCod = new String[] {""} ;
      T002063_A252CliCod = new int[1] ;
      T002063_n252CliCod = new boolean[] {false} ;
      T002064_A396EmprCod = new String[] {""} ;
      T002064_A966PartCod = new String[] {""} ;
      T002064_A252CliCod = new int[1] ;
      T002064_n252CliCod = new boolean[] {false} ;
      T002065_A396EmprCod = new String[] {""} ;
      T002065_A1387AlbPrvCod = new int[1] ;
      T002066_A396EmprCod = new String[] {""} ;
      T002066_A252CliCod = new int[1] ;
      T002066_n252CliCod = new boolean[] {false} ;
      T002066_A1213TalCod = new String[] {""} ;
      T002067_A396EmprCod = new String[] {""} ;
      T002067_A2730RecTipCo = new short[1] ;
      T002067_A252CliCod = new int[1] ;
      T002067_n252CliCod = new boolean[] {false} ;
      T002067_A2736RecLin2 = new short[1] ;
      T002068_A396EmprCod = new String[] {""} ;
      T002068_A539HisBarCod = new int[1] ;
      T002068_A545HisCodReo = new byte[1] ;
      T002068_A544HisCodPar = new String[] {""} ;
      T002068_A833TipDefCod = new short[1] ;
      T002069_A396EmprCod = new String[] {""} ;
      T002069_A506HbaBarCod = new int[1] ;
      T002069_A508HbaBarReo = new byte[1] ;
      T002069_A507HbaBarPar = new String[] {""} ;
      T002070_A396EmprCod = new String[] {""} ;
      T002070_A252CliCod = new int[1] ;
      T002070_n252CliCod = new boolean[] {false} ;
      T002070_A494ForSer = new String[] {""} ;
      T002070_A482ForColNom = new String[] {""} ;
      T002070_A483ForColNum = new int[1] ;
      T002070_A831TipColCod = new byte[1] ;
      T002071_A396EmprCod = new String[] {""} ;
      T002071_A252CliCod = new int[1] ;
      T002071_n252CliCod = new boolean[] {false} ;
      T002071_A287CliPagLin = new byte[1] ;
      T002072_A396EmprCod = new String[] {""} ;
      T002072_A252CliCod = new int[1] ;
      T002072_n252CliCod = new boolean[] {false} ;
      T002072_A266CliEnvLin = new byte[1] ;
      T002073_A396EmprCod = new String[] {""} ;
      T002073_A252CliCod = new int[1] ;
      T002073_n252CliCod = new boolean[] {false} ;
      T002073_A65ArtCod = new String[] {""} ;
      T002074_A396EmprCod = new String[] {""} ;
      T002074_A44AlbRecCod = new int[1] ;
      T002075_A396EmprCod = new String[] {""} ;
      T002075_A30AlbProCod = new long[1] ;
      T002076_A396EmprCod = new String[] {""} ;
      T002076_A14AlbComCod = new int[1] ;
      T002077_A396EmprCod = new String[] {""} ;
      T002077_A252CliCod = new int[1] ;
      T002077_n252CliCod = new boolean[] {false} ;
      Z460FasDsc = "" ;
      Z4642FasDsc2 = "" ;
      Z7070FasSigla = "" ;
      T002078_A252CliCod = new int[1] ;
      T002078_n252CliCod = new boolean[] {false} ;
      T002078_A470FasSumTin = new String[] {""} ;
      T002078_n470FasSumTin = new boolean[] {false} ;
      T002078_A12577FasPreKgF = new String[] {""} ;
      T002078_n12577FasPreKgF = new boolean[] {false} ;
      T002078_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n12704FasKgsMn = new boolean[] {false} ;
      T002078_A13587FasKgsEnt = new String[] {""} ;
      T002078_n13587FasKgsEnt = new boolean[] {false} ;
      T002078_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T002078_n4385FasPreFAc = new boolean[] {false} ;
      T002078_A460FasDsc = new String[] {""} ;
      T002078_A4642FasDsc2 = new String[] {""} ;
      T002078_n4642FasDsc2 = new boolean[] {false} ;
      T002078_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n467FasPreMtr = new boolean[] {false} ;
      T002078_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n466FasPreKgm = new boolean[] {false} ;
      T002078_A3615FasFacCod = new String[] {""} ;
      T002078_n3615FasFacCod = new boolean[] {false} ;
      T002078_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n4386FasPreKAn = new boolean[] {false} ;
      T002078_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n4387FasPreMAn = new boolean[] {false} ;
      T002078_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T002078_n4388FasPreFAn = new boolean[] {false} ;
      T002078_A10882FasPreU = new byte[1] ;
      T002078_n10882FasPreU = new boolean[] {false} ;
      T002078_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002078_n12576FasPreMt2 = new boolean[] {false} ;
      T002078_A7070FasSigla = new String[] {""} ;
      T002078_n7070FasSigla = new boolean[] {false} ;
      T002078_A14258FasFactura = new String[] {""} ;
      T002078_A396EmprCod = new String[] {""} ;
      T002078_A457FasCod = new String[] {""} ;
      T002078_n457FasCod = new boolean[] {false} ;
      T00204_A460FasDsc = new String[] {""} ;
      T00204_A4642FasDsc2 = new String[] {""} ;
      T00204_n4642FasDsc2 = new boolean[] {false} ;
      T00204_A7070FasSigla = new String[] {""} ;
      T00204_n7070FasSigla = new boolean[] {false} ;
      T002079_A460FasDsc = new String[] {""} ;
      T002079_A4642FasDsc2 = new String[] {""} ;
      T002079_n4642FasDsc2 = new boolean[] {false} ;
      T002079_A7070FasSigla = new String[] {""} ;
      T002079_n7070FasSigla = new boolean[] {false} ;
      T002080_A396EmprCod = new String[] {""} ;
      T002080_A252CliCod = new int[1] ;
      T002080_n252CliCod = new boolean[] {false} ;
      T002080_A457FasCod = new String[] {""} ;
      T002080_n457FasCod = new boolean[] {false} ;
      T00203_A252CliCod = new int[1] ;
      T00203_n252CliCod = new boolean[] {false} ;
      T00203_A470FasSumTin = new String[] {""} ;
      T00203_n470FasSumTin = new boolean[] {false} ;
      T00203_A12577FasPreKgF = new String[] {""} ;
      T00203_n12577FasPreKgF = new boolean[] {false} ;
      T00203_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n12704FasKgsMn = new boolean[] {false} ;
      T00203_A13587FasKgsEnt = new String[] {""} ;
      T00203_n13587FasKgsEnt = new boolean[] {false} ;
      T00203_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T00203_n4385FasPreFAc = new boolean[] {false} ;
      T00203_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n467FasPreMtr = new boolean[] {false} ;
      T00203_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n466FasPreKgm = new boolean[] {false} ;
      T00203_A3615FasFacCod = new String[] {""} ;
      T00203_n3615FasFacCod = new boolean[] {false} ;
      T00203_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n4386FasPreKAn = new boolean[] {false} ;
      T00203_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n4387FasPreMAn = new boolean[] {false} ;
      T00203_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T00203_n4388FasPreFAn = new boolean[] {false} ;
      T00203_A10882FasPreU = new byte[1] ;
      T00203_n10882FasPreU = new boolean[] {false} ;
      T00203_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00203_n12576FasPreMt2 = new boolean[] {false} ;
      T00203_A14258FasFactura = new String[] {""} ;
      T00203_A396EmprCod = new String[] {""} ;
      T00203_A457FasCod = new String[] {""} ;
      T00203_n457FasCod = new boolean[] {false} ;
      T00202_A252CliCod = new int[1] ;
      T00202_n252CliCod = new boolean[] {false} ;
      T00202_A470FasSumTin = new String[] {""} ;
      T00202_n470FasSumTin = new boolean[] {false} ;
      T00202_A12577FasPreKgF = new String[] {""} ;
      T00202_n12577FasPreKgF = new boolean[] {false} ;
      T00202_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n12704FasKgsMn = new boolean[] {false} ;
      T00202_A13587FasKgsEnt = new String[] {""} ;
      T00202_n13587FasKgsEnt = new boolean[] {false} ;
      T00202_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T00202_n4385FasPreFAc = new boolean[] {false} ;
      T00202_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n467FasPreMtr = new boolean[] {false} ;
      T00202_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n466FasPreKgm = new boolean[] {false} ;
      T00202_A3615FasFacCod = new String[] {""} ;
      T00202_n3615FasFacCod = new boolean[] {false} ;
      T00202_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n4386FasPreKAn = new boolean[] {false} ;
      T00202_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n4387FasPreMAn = new boolean[] {false} ;
      T00202_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T00202_n4388FasPreFAn = new boolean[] {false} ;
      T00202_A10882FasPreU = new byte[1] ;
      T00202_n10882FasPreU = new boolean[] {false} ;
      T00202_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00202_n12576FasPreMt2 = new boolean[] {false} ;
      T00202_A14258FasFactura = new String[] {""} ;
      T00202_A396EmprCod = new String[] {""} ;
      T00202_A457FasCod = new String[] {""} ;
      T00202_n457FasCod = new boolean[] {false} ;
      T002084_A460FasDsc = new String[] {""} ;
      T002084_A4642FasDsc2 = new String[] {""} ;
      T002084_n4642FasDsc2 = new boolean[] {false} ;
      T002084_A7070FasSigla = new String[] {""} ;
      T002084_n7070FasSigla = new boolean[] {false} ;
      T002085_A396EmprCod = new String[] {""} ;
      T002085_A252CliCod = new int[1] ;
      T002085_n252CliCod = new boolean[] {false} ;
      T002085_A4589FFProCod = new String[] {""} ;
      T002085_A4591FFFasCod = new String[] {""} ;
      T002086_A396EmprCod = new String[] {""} ;
      T002086_A252CliCod = new int[1] ;
      T002086_n252CliCod = new boolean[] {false} ;
      T002086_A494ForSer = new String[] {""} ;
      T002086_A482ForColNom = new String[] {""} ;
      T002086_A483ForColNum = new int[1] ;
      T002086_A831TipColCod = new byte[1] ;
      T002086_A853For_ProC = new String[] {""} ;
      T002086_A1028For_Ord = new int[1] ;
      T002087_A396EmprCod = new String[] {""} ;
      T002087_A252CliCod = new int[1] ;
      T002087_n252CliCod = new boolean[] {false} ;
      T002087_A457FasCod = new String[] {""} ;
      T002087_n457FasCod = new boolean[] {false} ;
      T002087_A7727ArtAdiCod = new short[1] ;
      T002088_A396EmprCod = new String[] {""} ;
      T002088_A252CliCod = new int[1] ;
      T002088_n252CliCod = new boolean[] {false} ;
      T002088_A65ArtCod = new String[] {""} ;
      T002088_A7135Lin_fast = new short[1] ;
      T002089_A396EmprCod = new String[] {""} ;
      T002089_A252CliCod = new int[1] ;
      T002089_n252CliCod = new boolean[] {false} ;
      T002089_A6016FasExpLin = new short[1] ;
      T002090_A396EmprCod = new String[] {""} ;
      T002090_A966PartCod = new String[] {""} ;
      T002090_A252CliCod = new int[1] ;
      T002090_n252CliCod = new boolean[] {false} ;
      T002090_A5849UbiLin = new short[1] ;
      T002091_A396EmprCod = new String[] {""} ;
      T002091_A252CliCod = new int[1] ;
      T002091_n252CliCod = new boolean[] {false} ;
      T002091_A457FasCod = new String[] {""} ;
      T002091_n457FasCod = new boolean[] {false} ;
      T002091_A5515ClifsiLin = new short[1] ;
      T002092_A396EmprCod = new String[] {""} ;
      T002092_A252CliCod = new int[1] ;
      T002092_n252CliCod = new boolean[] {false} ;
      T002092_A457FasCod = new String[] {""} ;
      T002092_n457FasCod = new boolean[] {false} ;
      T002092_A5519ClifsdLin = new short[1] ;
      T002093_A396EmprCod = new String[] {""} ;
      T002093_A252CliCod = new int[1] ;
      T002093_n252CliCod = new boolean[] {false} ;
      T002093_A457FasCod = new String[] {""} ;
      T002093_n457FasCod = new boolean[] {false} ;
      T002093_A5310ClFsAny = new short[1] ;
      T002093_A5311ClFsSer = new String[] {""} ;
      T002094_A396EmprCod = new String[] {""} ;
      T002094_A252CliCod = new int[1] ;
      T002094_n252CliCod = new boolean[] {false} ;
      T002094_A65ArtCod = new String[] {""} ;
      T002094_A4658MdlCod = new String[] {""} ;
      T002094_A457FasCod = new String[] {""} ;
      T002094_n457FasCod = new boolean[] {false} ;
      T002095_A396EmprCod = new String[] {""} ;
      T002095_A252CliCod = new int[1] ;
      T002095_n252CliCod = new boolean[] {false} ;
      T002095_A65ArtCod = new String[] {""} ;
      T002095_A758ProCod = new String[] {""} ;
      T002095_A457FasCod = new String[] {""} ;
      T002095_n457FasCod = new boolean[] {false} ;
      T002096_A396EmprCod = new String[] {""} ;
      T002096_A2333ExtPdoAlb = new int[1] ;
      T002096_A2790ExtPdoLin = new short[1] ;
      T002097_A396EmprCod = new String[] {""} ;
      T002097_A252CliCod = new int[1] ;
      T002097_n252CliCod = new boolean[] {false} ;
      T002097_A457FasCod = new String[] {""} ;
      T002097_n457FasCod = new boolean[] {false} ;
      T002097_A2740PreExtSer = new String[] {""} ;
      T002097_A2427PreExtNMtr = new String[] {""} ;
      T002098_A396EmprCod = new String[] {""} ;
      T002098_A2730RecTipCo = new short[1] ;
      T002098_A252CliCod = new int[1] ;
      T002098_n252CliCod = new boolean[] {false} ;
      T002098_A2736RecLin2 = new short[1] ;
      T002099_A396EmprCod = new String[] {""} ;
      T002099_A252CliCod = new int[1] ;
      T002099_n252CliCod = new boolean[] {false} ;
      T002099_A457FasCod = new String[] {""} ;
      T002099_n457FasCod = new boolean[] {false} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i470FasSumTin = "" ;
      i12577FasPreKgF = "" ;
      i12704FasKgsMn = DecimalUtil.ZERO ;
      i13587FasKgsEnt = "" ;
      i4385FasPreFAc = GXutil.nullDate() ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefas__default(),
         new Object[] {
             new Object[] {
            T00202_A252CliCod, T00202_A470FasSumTin, T00202_n470FasSumTin, T00202_A12577FasPreKgF, T00202_n12577FasPreKgF, T00202_A12704FasKgsMn, T00202_n12704FasKgsMn, T00202_A13587FasKgsEnt, T00202_n13587FasKgsEnt, T00202_A4385FasPreFAc,
            T00202_n4385FasPreFAc, T00202_A467FasPreMtr, T00202_n467FasPreMtr, T00202_A466FasPreKgm, T00202_n466FasPreKgm, T00202_A3615FasFacCod, T00202_n3615FasFacCod, T00202_A4386FasPreKAn, T00202_n4386FasPreKAn, T00202_A4387FasPreMAn,
            T00202_n4387FasPreMAn, T00202_A4388FasPreFAn, T00202_n4388FasPreFAn, T00202_A10882FasPreU, T00202_n10882FasPreU, T00202_A12576FasPreMt2, T00202_n12576FasPreMt2, T00202_A14258FasFactura, T00202_A396EmprCod, T00202_A457FasCod
            }
            , new Object[] {
            T00203_A252CliCod, T00203_A470FasSumTin, T00203_n470FasSumTin, T00203_A12577FasPreKgF, T00203_n12577FasPreKgF, T00203_A12704FasKgsMn, T00203_n12704FasKgsMn, T00203_A13587FasKgsEnt, T00203_n13587FasKgsEnt, T00203_A4385FasPreFAc,
            T00203_n4385FasPreFAc, T00203_A467FasPreMtr, T00203_n467FasPreMtr, T00203_A466FasPreKgm, T00203_n466FasPreKgm, T00203_A3615FasFacCod, T00203_n3615FasFacCod, T00203_A4386FasPreKAn, T00203_n4386FasPreKAn, T00203_A4387FasPreMAn,
            T00203_n4387FasPreMAn, T00203_A4388FasPreFAn, T00203_n4388FasPreFAn, T00203_A10882FasPreU, T00203_n10882FasPreU, T00203_A12576FasPreMt2, T00203_n12576FasPreMt2, T00203_A14258FasFactura, T00203_A396EmprCod, T00203_A457FasCod
            }
            , new Object[] {
            T00204_A460FasDsc, T00204_A4642FasDsc2, T00204_n4642FasDsc2, T00204_A7070FasSigla, T00204_n7070FasSigla
            }
            , new Object[] {
            T00205_A252CliCod, T00205_A279CliNom, T00205_A10045CliAct, T00205_A396EmprCod
            }
            , new Object[] {
            T00206_A252CliCod, T00206_A279CliNom, T00206_A10045CliAct, T00206_A396EmprCod
            }
            , new Object[] {
            T00207_A407EmprNom, T00207_n407EmprNom
            }
            , new Object[] {
            T00208_A252CliCod, T00208_A279CliNom, T00208_A407EmprNom, T00208_n407EmprNom, T00208_A10045CliAct, T00208_A396EmprCod
            }
            , new Object[] {
            T00209_A396EmprCod, T00209_A252CliCod
            }
            , new Object[] {
            T002010_A396EmprCod, T002010_A252CliCod
            }
            , new Object[] {
            T002011_A396EmprCod, T002011_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002015_A396EmprCod, T002015_A252CliCod, T002015_A6930Lb_rclin
            }
            , new Object[] {
            T002016_A396EmprCod, T002016_A6850Tex_NPed
            }
            , new Object[] {
            T002017_A396EmprCod, T002017_A252CliCod, T002017_A829TipArtCod, T002017_A831TipColCod, T002017_A583IntCod, T002017_A5098TipDisCod, T002017_A6603Est1_anyo, T002017_A6604Est1_mes, T002017_A6605Est1_dia
            }
            , new Object[] {
            T002018_A396EmprCod, T002018_A6319C_Barcod, T002018_A6320C_Barcodre, T002018_A6321C_Barcodpa, T002018_A6322C_Reclinma
            }
            , new Object[] {
            T002019_A396EmprCod, T002019_A6235DevEmpCod
            }
            , new Object[] {
            T002020_A396EmprCod, T002020_A602MaqCod, T002020_A6078MaqCliCod, T002020_A6079MaqArtCod
            }
            , new Object[] {
            T002021_A396EmprCod, T002021_A5532Lb_numero
            }
            , new Object[] {
            T002022_A396EmprCod, T002022_A252CliCod, T002022_A5503CliifLin
            }
            , new Object[] {
            T002023_A396EmprCod, T002023_A252CliCod, T002023_A5499ClieiLin
            }
            , new Object[] {
            T002024_A396EmprCod, T002024_A252CliCod, T002024_A5495ClidtLin
            }
            , new Object[] {
            T002025_A396EmprCod, T002025_A252CliCod, T002025_A5491CliedLin
            }
            , new Object[] {
            T002026_A396EmprCod, T002026_A252CliCod, T002026_A5452P_ForCod
            }
            , new Object[] {
            T002027_A396EmprCod, T002027_A252CliCod, T002027_A5443Mdl_Cod
            }
            , new Object[] {
            T002028_A396EmprCod, T002028_A252CliCod, T002028_A5436IntCodF2
            }
            , new Object[] {
            T002029_A396EmprCod, T002029_A252CliCod, T002029_A5396IntCodFC, T002029_A5434Tip_ColC
            }
            , new Object[] {
            T002030_A396EmprCod, T002030_A252CliCod, T002030_A5428FasPreCod
            }
            , new Object[] {
            T002031_A396EmprCod, T002031_A252CliCod, T002031_A5398Cli_Proc
            }
            , new Object[] {
            T002032_A396EmprCod, T002032_A5130PagIden
            }
            , new Object[] {
            T002033_A396EmprCod, T002033_A5059Hl_hdr, T002033_A5060Hl_hdrr, T002033_A5061Hl_hdrp
            }
            , new Object[] {
            T002034_A396EmprCod, T002034_A252CliCod, T002034_A4718DishCod, T002034_A5020TipEstCod, T002034_A5022GraCod
            }
            , new Object[] {
            T002035_A396EmprCod, T002035_A4618EnsLCod
            }
            , new Object[] {
            T002036_A396EmprCod, T002036_A4492HreBarCod, T002036_A4493HreBarReo, T002036_A4494HreBarPar, T002036_A4495HreNumCie
            }
            , new Object[] {
            T002037_A396EmprCod, T002037_A252CliCod, T002037_A4415EstCol
            }
            , new Object[] {
            T002038_A396EmprCod, T002038_A4185WEBUSU
            }
            , new Object[] {
            T002039_A396EmprCod, T002039_A252CliCod, T002039_A4079WEBDISCOD, T002039_A4078EMPCOD
            }
            , new Object[] {
            T002040_A396EmprCod, T002040_A2637HisEstHRu, T002040_A2636HisEstHRe, T002040_A2635HisEstHPa, T002040_A2638HisEstLCo, T002040_A2630HisEstCom, T002040_A2634HisEstFon
            }
            , new Object[] {
            T002041_A396EmprCod, T002041_A2574GrpDibCod
            }
            , new Object[] {
            T002042_A396EmprCod, T002042_A2558GrmDibCod
            }
            , new Object[] {
            T002043_A396EmprCod, T002043_A2542GrcDibCod
            }
            , new Object[] {
            T002044_A396EmprCod, T002044_A1031EmpesCod, T002044_A252CliCod, T002044_A1032FonCod
            }
            , new Object[] {
            T002045_A396EmprCod, T002045_A1013DibCli, T002045_A252CliCod, T002045_A1014DibInt
            }
            , new Object[] {
            T002046_A396EmprCod, T002046_A1736AlbExtCod
            }
            , new Object[] {
            T002047_A396EmprCod, T002047_A252CliCod, T002047_A3661FacProAny, T002047_A3662FacProSer, T002047_A3663FacProInt, T002047_A3664FacProTip, T002047_A3665FacProTar
            }
            , new Object[] {
            T002048_A396EmprCod, T002048_A3646EstTinAny, T002048_A3647EstTinMes, T002048_A3648EstTinDia, T002048_A1929EstTinNr
            }
            , new Object[] {
            T002049_A396EmprCod, T002049_A3617AlbTrnCod
            }
            , new Object[] {
            T002050_A396EmprCod, T002050_A252CliCod, T002050_A3320CliLimKgs
            }
            , new Object[] {
            T002051_A396EmprCod, T002051_A3073RepCod, T002051_A252CliCod
            }
            , new Object[] {
            T002052_A396EmprCod, T002052_A3061Codia, T002052_A3062CoMes, T002052_A3063CoAny, T002052_A3065CoLin, T002052_A3010CoBarCod, T002052_A3011CoBarReo, T002052_A3012CoBarPar
            }
            , new Object[] {
            T002053_A396EmprCod, T002053_A2971SabFacCod
            }
            , new Object[] {
            T002054_A396EmprCod, T002054_A2954TiDia, T002054_A2955TiMes, T002054_A2956TiAny, T002054_A2958TiLin, T002054_A2959TiBarCod, T002054_A2960TiBarReo, T002054_A2961TiBarPar
            }
            , new Object[] {
            T002055_A396EmprCod, T002055_A252CliCod, T002055_A2933RecTipCon
            }
            , new Object[] {
            T002056_A396EmprCod, T002056_A252CliCod, T002056_A2927RecProCod
            }
            , new Object[] {
            T002057_A396EmprCod, T002057_A252CliCod, T002057_A2891HMaForSer, T002057_A2892HMaForCNom, T002057_A2893HMaForCNum, T002057_A2894HMaTipCCod, T002057_A2895HMaForNumC, T002057_A2897HMaColLin, T002057_A2896HMaFec, T002057_A2907HmaLin
            }
            , new Object[] {
            T002058_A396EmprCod, T002058_A252CliCod, T002058_A425EstAny, T002058_A2755EstSerFac
            }
            , new Object[] {
            T002059_A396EmprCod, T002059_A2730RecTipCo, T002059_A252CliCod
            }
            , new Object[] {
            T002060_A396EmprCod, T002060_A2720TarSec, T002060_A252CliCod, T002060_A829TipArtCod, T002060_A831TipColCod
            }
            , new Object[] {
            T002061_A396EmprCod, T002061_A2382AbcTerCod, T002061_A2381AbcSec, T002061_A252CliCod
            }
            , new Object[] {
            T002062_A396EmprCod, T002062_A252CliCod, T002062_A2308CliDesCod
            }
            , new Object[] {
            T002063_A396EmprCod, T002063_A2268MovParCod, T002063_A252CliCod
            }
            , new Object[] {
            T002064_A396EmprCod, T002064_A966PartCod, T002064_A252CliCod
            }
            , new Object[] {
            T002065_A396EmprCod, T002065_A1387AlbPrvCod
            }
            , new Object[] {
            T002066_A396EmprCod, T002066_A252CliCod, T002066_A1213TalCod
            }
            , new Object[] {
            T002067_A396EmprCod, T002067_A2730RecTipCo, T002067_A252CliCod, T002067_A2736RecLin2
            }
            , new Object[] {
            T002068_A396EmprCod, T002068_A539HisBarCod, T002068_A545HisCodReo, T002068_A544HisCodPar, T002068_A833TipDefCod
            }
            , new Object[] {
            T002069_A396EmprCod, T002069_A506HbaBarCod, T002069_A508HbaBarReo, T002069_A507HbaBarPar
            }
            , new Object[] {
            T002070_A396EmprCod, T002070_A252CliCod, T002070_A494ForSer, T002070_A482ForColNom, T002070_A483ForColNum, T002070_A831TipColCod
            }
            , new Object[] {
            T002071_A396EmprCod, T002071_A252CliCod, T002071_A287CliPagLin
            }
            , new Object[] {
            T002072_A396EmprCod, T002072_A252CliCod, T002072_A266CliEnvLin
            }
            , new Object[] {
            T002073_A396EmprCod, T002073_A252CliCod, T002073_A65ArtCod
            }
            , new Object[] {
            T002074_A396EmprCod, T002074_A44AlbRecCod
            }
            , new Object[] {
            T002075_A396EmprCod, T002075_A30AlbProCod
            }
            , new Object[] {
            T002076_A396EmprCod, T002076_A14AlbComCod
            }
            , new Object[] {
            T002077_A396EmprCod, T002077_A252CliCod
            }
            , new Object[] {
            T002078_A252CliCod, T002078_A470FasSumTin, T002078_n470FasSumTin, T002078_A12577FasPreKgF, T002078_n12577FasPreKgF, T002078_A12704FasKgsMn, T002078_n12704FasKgsMn, T002078_A13587FasKgsEnt, T002078_n13587FasKgsEnt, T002078_A4385FasPreFAc,
            T002078_n4385FasPreFAc, T002078_A460FasDsc, T002078_A4642FasDsc2, T002078_n4642FasDsc2, T002078_A467FasPreMtr, T002078_n467FasPreMtr, T002078_A466FasPreKgm, T002078_n466FasPreKgm, T002078_A3615FasFacCod, T002078_n3615FasFacCod,
            T002078_A4386FasPreKAn, T002078_n4386FasPreKAn, T002078_A4387FasPreMAn, T002078_n4387FasPreMAn, T002078_A4388FasPreFAn, T002078_n4388FasPreFAn, T002078_A10882FasPreU, T002078_n10882FasPreU, T002078_A12576FasPreMt2, T002078_n12576FasPreMt2,
            T002078_A7070FasSigla, T002078_n7070FasSigla, T002078_A14258FasFactura, T002078_A396EmprCod, T002078_A457FasCod
            }
            , new Object[] {
            T002079_A460FasDsc, T002079_A4642FasDsc2, T002079_n4642FasDsc2, T002079_A7070FasSigla, T002079_n7070FasSigla
            }
            , new Object[] {
            T002080_A396EmprCod, T002080_A252CliCod, T002080_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002084_A460FasDsc, T002084_A4642FasDsc2, T002084_n4642FasDsc2, T002084_A7070FasSigla, T002084_n7070FasSigla
            }
            , new Object[] {
            T002085_A396EmprCod, T002085_A252CliCod, T002085_A4589FFProCod, T002085_A4591FFFasCod
            }
            , new Object[] {
            T002086_A396EmprCod, T002086_A252CliCod, T002086_A494ForSer, T002086_A482ForColNom, T002086_A483ForColNum, T002086_A831TipColCod, T002086_A853For_ProC, T002086_A1028For_Ord
            }
            , new Object[] {
            T002087_A396EmprCod, T002087_A252CliCod, T002087_A457FasCod, T002087_A7727ArtAdiCod
            }
            , new Object[] {
            T002088_A396EmprCod, T002088_A252CliCod, T002088_A65ArtCod, T002088_A7135Lin_fast
            }
            , new Object[] {
            T002089_A396EmprCod, T002089_A252CliCod, T002089_A6016FasExpLin
            }
            , new Object[] {
            T002090_A396EmprCod, T002090_A966PartCod, T002090_A252CliCod, T002090_A5849UbiLin
            }
            , new Object[] {
            T002091_A396EmprCod, T002091_A252CliCod, T002091_A457FasCod, T002091_A5515ClifsiLin
            }
            , new Object[] {
            T002092_A396EmprCod, T002092_A252CliCod, T002092_A457FasCod, T002092_A5519ClifsdLin
            }
            , new Object[] {
            T002093_A396EmprCod, T002093_A252CliCod, T002093_A457FasCod, T002093_A5310ClFsAny, T002093_A5311ClFsSer
            }
            , new Object[] {
            T002094_A396EmprCod, T002094_A252CliCod, T002094_A65ArtCod, T002094_A4658MdlCod, T002094_A457FasCod
            }
            , new Object[] {
            T002095_A396EmprCod, T002095_A252CliCod, T002095_A65ArtCod, T002095_A758ProCod, T002095_A457FasCod
            }
            , new Object[] {
            T002096_A396EmprCod, T002096_A2333ExtPdoAlb, T002096_A2790ExtPdoLin
            }
            , new Object[] {
            T002097_A396EmprCod, T002097_A252CliCod, T002097_A457FasCod, T002097_A2740PreExtSer, T002097_A2427PreExtNMtr
            }
            , new Object[] {
            T002098_A396EmprCod, T002098_A2730RecTipCo, T002098_A252CliCod, T002098_A2736RecLin2
            }
            , new Object[] {
            T002099_A396EmprCod, T002099_A252CliCod, T002099_A457FasCod
            }
         }
      );
      AV54Pgmname = "Facturacion.TPREFAS" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      A4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      i4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      Gx_date = GXutil.today( ) ;
      Z13587FasKgsEnt = httpContext.getMessage( "N", "") ;
      n13587FasKgsEnt = false ;
      A13587FasKgsEnt = httpContext.getMessage( "N", "") ;
      n13587FasKgsEnt = false ;
      i13587FasKgsEnt = httpContext.getMessage( "N", "") ;
      n13587FasKgsEnt = false ;
      Z12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
      n12704FasKgsMn = false ;
      A12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
      n12704FasKgsMn = false ;
      i12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
      n12704FasKgsMn = false ;
      Z12577FasPreKgF = httpContext.getMessage( "N", "") ;
      n12577FasPreKgF = false ;
      A12577FasPreKgF = httpContext.getMessage( "N", "") ;
      n12577FasPreKgF = false ;
      i12577FasPreKgF = httpContext.getMessage( "N", "") ;
      n12577FasPreKgF = false ;
      Z470FasSumTin = "S" ;
      n470FasSumTin = false ;
      A470FasSumTin = "S" ;
      n470FasSumTin = false ;
      i470FasSumTin = "S" ;
      n470FasSumTin = false ;
   }

   private byte Z10882FasPreU ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A10882FasPreU ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_85 ;
   private short nRcdExists_85 ;
   private short nIsMod_85 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount85 ;
   private short RcdFound85 ;
   private short nBlankRcdUsr85 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_85 ;
   private int wcpOAV46CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int AV46CliCod ;
   private int trnEnded ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int bttBtnpdf_Visible ;
   private int bttBtncopiar_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasPreMtr_Enabled ;
   private int edtFasPreMt2_Enabled ;
   private int edtFasPreKgm_Enabled ;
   private int edtFasPreFAc_Enabled ;
   private int edtFasKgsMn_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_fascod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtFasPreFAc_Enabled ;
   private int defedtFasCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12704FasKgsMn ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z4386FasPreKAn ;
   private java.math.BigDecimal Z4387FasPreMAn ;
   private java.math.BigDecimal Z12576FasPreMt2 ;
   private java.math.BigDecimal O466FasPreKgm ;
   private java.math.BigDecimal O467FasPreMtr ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal T466FasPreKgm ;
   private java.math.BigDecimal T467FasPreMtr ;
   private java.math.BigDecimal i12704FasKgsMn ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV29EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z10045CliAct ;
   private String Z457FasCod ;
   private String Z470FasSumTin ;
   private String Z12577FasPreKgF ;
   private String Z13587FasKgsEnt ;
   private String Z3615FasFacCod ;
   private String Z14258FasFactura ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV29EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String TempTags ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncopiar_Internalname ;
   private String bttBtncopiar_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV54Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Internalname ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode85 ;
   private String edtFasCod_Internalname ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasPreMt2_Internalname ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasPreFAc_Internalname ;
   private String edtFasKgsMn_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A10045CliAct ;
   private String A407EmprNom ;
   private String A470FasSumTin ;
   private String A3615FasFacCod ;
   private String A14258FasFactura ;
   private String A460FasDsc ;
   private String A4642FasDsc2 ;
   private String A7070FasSigla ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_fascod_Objectcall ;
   private String Combo_fascod_Class ;
   private String Combo_fascod_Icontype ;
   private String Combo_fascod_Icon ;
   private String Combo_fascod_Tooltip ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Selectedvalue_get ;
   private String Combo_fascod_Selectedtext_set ;
   private String Combo_fascod_Selectedtext_get ;
   private String Combo_fascod_Gamoauthtoken ;
   private String Combo_fascod_Ddointernalname ;
   private String Combo_fascod_Titlecontrolalign ;
   private String Combo_fascod_Dropdownoptionstype ;
   private String Combo_fascod_Titlecontrolidtoreplace ;
   private String Combo_fascod_Datalisttype ;
   private String Combo_fascod_Datalistfixedvalues ;
   private String Combo_fascod_Datalistproc ;
   private String Combo_fascod_Datalistprocparametersprefix ;
   private String Combo_fascod_Remoteservicesparameters ;
   private String Combo_fascod_Htmltemplate ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_fascod_Loadingdata ;
   private String Combo_fascod_Noresultsfound ;
   private String Combo_fascod_Emptyitemtext ;
   private String Combo_fascod_Onlyselectedvalues ;
   private String Combo_fascod_Selectalltext ;
   private String Combo_fascod_Multiplevaluesseparator ;
   private String Combo_fascod_Addnewoptiontext ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A12577FasPreKgF ;
   private String A13587FasKgsEnt ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z4642FasDsc2 ;
   private String Z7070FasSigla ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtFasCod_Jsonclick ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasPreMt2_Jsonclick ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasPreFAc_Jsonclick ;
   private String edtFasKgsMn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i470FasSumTin ;
   private String i12577FasPreKgF ;
   private String i13587FasKgsEnt ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z4385FasPreFAc ;
   private java.util.Date Z4388FasPreFAn ;
   private java.util.Date Gx_date ;
   private java.util.Date A4388FasPreFAn ;
   private java.util.Date A4385FasPreFAc ;
   private java.util.Date i4385FasPreFAc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n457FasCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_fascod_Isgriditem ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n470FasSumTin ;
   private boolean n3615FasFacCod ;
   private boolean n4386FasPreKAn ;
   private boolean n4387FasPreMAn ;
   private boolean n4388FasPreFAn ;
   private boolean n4642FasDsc2 ;
   private boolean n7070FasSigla ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Visible ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Hasdescription ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Includeselectalloption ;
   private boolean Combo_fascod_Includeaddnewoption ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n12577FasPreKgF ;
   private boolean n12704FasKgsMn ;
   private boolean n13587FasKgsEnt ;
   private boolean n4385FasPreFAc ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private boolean n10882FasPreU ;
   private boolean n12576FasPreMt2 ;
   private boolean Gx_longc ;
   private String AV51ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV49WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkFasPreU ;
   private ICheckbox chkFasPreKgF ;
   private ICheckbox chkFasKgsEnt ;
   private IDataStoreProvider pr_default ;
   private String[] T00207_A407EmprNom ;
   private boolean[] T00207_n407EmprNom ;
   private int[] T00208_A252CliCod ;
   private boolean[] T00208_n252CliCod ;
   private String[] T00208_A279CliNom ;
   private String[] T00208_A407EmprNom ;
   private boolean[] T00208_n407EmprNom ;
   private String[] T00208_A10045CliAct ;
   private String[] T00208_A396EmprCod ;
   private String[] T00209_A396EmprCod ;
   private int[] T00209_A252CliCod ;
   private boolean[] T00209_n252CliCod ;
   private int[] T00206_A252CliCod ;
   private boolean[] T00206_n252CliCod ;
   private String[] T00206_A279CliNom ;
   private String[] T00206_A10045CliAct ;
   private String[] T00206_A396EmprCod ;
   private String[] T002010_A396EmprCod ;
   private int[] T002010_A252CliCod ;
   private boolean[] T002010_n252CliCod ;
   private String[] T002011_A396EmprCod ;
   private int[] T002011_A252CliCod ;
   private boolean[] T002011_n252CliCod ;
   private int[] T00205_A252CliCod ;
   private boolean[] T00205_n252CliCod ;
   private String[] T00205_A279CliNom ;
   private String[] T00205_A10045CliAct ;
   private String[] T00205_A396EmprCod ;
   private String[] T002015_A396EmprCod ;
   private int[] T002015_A252CliCod ;
   private boolean[] T002015_n252CliCod ;
   private int[] T002015_A6930Lb_rclin ;
   private String[] T002016_A396EmprCod ;
   private int[] T002016_A6850Tex_NPed ;
   private String[] T002017_A396EmprCod ;
   private int[] T002017_A252CliCod ;
   private boolean[] T002017_n252CliCod ;
   private short[] T002017_A829TipArtCod ;
   private byte[] T002017_A831TipColCod ;
   private byte[] T002017_A583IntCod ;
   private String[] T002017_A5098TipDisCod ;
   private short[] T002017_A6603Est1_anyo ;
   private byte[] T002017_A6604Est1_mes ;
   private byte[] T002017_A6605Est1_dia ;
   private String[] T002018_A396EmprCod ;
   private int[] T002018_A6319C_Barcod ;
   private byte[] T002018_A6320C_Barcodre ;
   private String[] T002018_A6321C_Barcodpa ;
   private short[] T002018_A6322C_Reclinma ;
   private String[] T002019_A396EmprCod ;
   private int[] T002019_A6235DevEmpCod ;
   private String[] T002020_A396EmprCod ;
   private String[] T002020_A602MaqCod ;
   private int[] T002020_A6078MaqCliCod ;
   private String[] T002020_A6079MaqArtCod ;
   private String[] T002021_A396EmprCod ;
   private int[] T002021_A5532Lb_numero ;
   private String[] T002022_A396EmprCod ;
   private int[] T002022_A252CliCod ;
   private boolean[] T002022_n252CliCod ;
   private short[] T002022_A5503CliifLin ;
   private String[] T002023_A396EmprCod ;
   private int[] T002023_A252CliCod ;
   private boolean[] T002023_n252CliCod ;
   private short[] T002023_A5499ClieiLin ;
   private String[] T002024_A396EmprCod ;
   private int[] T002024_A252CliCod ;
   private boolean[] T002024_n252CliCod ;
   private short[] T002024_A5495ClidtLin ;
   private String[] T002025_A396EmprCod ;
   private int[] T002025_A252CliCod ;
   private boolean[] T002025_n252CliCod ;
   private short[] T002025_A5491CliedLin ;
   private String[] T002026_A396EmprCod ;
   private int[] T002026_A252CliCod ;
   private boolean[] T002026_n252CliCod ;
   private String[] T002026_A5452P_ForCod ;
   private String[] T002027_A396EmprCod ;
   private int[] T002027_A252CliCod ;
   private boolean[] T002027_n252CliCod ;
   private String[] T002027_A5443Mdl_Cod ;
   private String[] T002028_A396EmprCod ;
   private int[] T002028_A252CliCod ;
   private boolean[] T002028_n252CliCod ;
   private short[] T002028_A5436IntCodF2 ;
   private String[] T002029_A396EmprCod ;
   private int[] T002029_A252CliCod ;
   private boolean[] T002029_n252CliCod ;
   private byte[] T002029_A5396IntCodFC ;
   private byte[] T002029_A5434Tip_ColC ;
   private String[] T002030_A396EmprCod ;
   private int[] T002030_A252CliCod ;
   private boolean[] T002030_n252CliCod ;
   private String[] T002030_A5428FasPreCod ;
   private String[] T002031_A396EmprCod ;
   private int[] T002031_A252CliCod ;
   private boolean[] T002031_n252CliCod ;
   private String[] T002031_A5398Cli_Proc ;
   private String[] T002032_A396EmprCod ;
   private int[] T002032_A5130PagIden ;
   private String[] T002033_A396EmprCod ;
   private int[] T002033_A5059Hl_hdr ;
   private byte[] T002033_A5060Hl_hdrr ;
   private String[] T002033_A5061Hl_hdrp ;
   private String[] T002034_A396EmprCod ;
   private int[] T002034_A252CliCod ;
   private boolean[] T002034_n252CliCod ;
   private String[] T002034_A4718DishCod ;
   private byte[] T002034_A5020TipEstCod ;
   private byte[] T002034_A5022GraCod ;
   private String[] T002035_A396EmprCod ;
   private int[] T002035_A4618EnsLCod ;
   private String[] T002036_A396EmprCod ;
   private int[] T002036_A4492HreBarCod ;
   private byte[] T002036_A4493HreBarReo ;
   private String[] T002036_A4494HreBarPar ;
   private byte[] T002036_A4495HreNumCie ;
   private String[] T002037_A396EmprCod ;
   private int[] T002037_A252CliCod ;
   private boolean[] T002037_n252CliCod ;
   private String[] T002037_A4415EstCol ;
   private String[] T002038_A396EmprCod ;
   private String[] T002038_A4185WEBUSU ;
   private String[] T002039_A396EmprCod ;
   private int[] T002039_A252CliCod ;
   private boolean[] T002039_n252CliCod ;
   private String[] T002039_A4079WEBDISCOD ;
   private String[] T002039_A4078EMPCOD ;
   private String[] T002040_A396EmprCod ;
   private int[] T002040_A2637HisEstHRu ;
   private byte[] T002040_A2636HisEstHRe ;
   private String[] T002040_A2635HisEstHPa ;
   private byte[] T002040_A2638HisEstLCo ;
   private String[] T002040_A2630HisEstCom ;
   private String[] T002040_A2634HisEstFon ;
   private String[] T002041_A396EmprCod ;
   private int[] T002041_A2574GrpDibCod ;
   private String[] T002042_A396EmprCod ;
   private int[] T002042_A2558GrmDibCod ;
   private String[] T002043_A396EmprCod ;
   private int[] T002043_A2542GrcDibCod ;
   private String[] T002044_A396EmprCod ;
   private String[] T002044_A1031EmpesCod ;
   private int[] T002044_A252CliCod ;
   private boolean[] T002044_n252CliCod ;
   private String[] T002044_A1032FonCod ;
   private String[] T002045_A396EmprCod ;
   private String[] T002045_A1013DibCli ;
   private int[] T002045_A252CliCod ;
   private boolean[] T002045_n252CliCod ;
   private int[] T002045_A1014DibInt ;
   private String[] T002046_A396EmprCod ;
   private long[] T002046_A1736AlbExtCod ;
   private String[] T002047_A396EmprCod ;
   private int[] T002047_A252CliCod ;
   private boolean[] T002047_n252CliCod ;
   private short[] T002047_A3661FacProAny ;
   private String[] T002047_A3662FacProSer ;
   private byte[] T002047_A3663FacProInt ;
   private byte[] T002047_A3664FacProTip ;
   private short[] T002047_A3665FacProTar ;
   private String[] T002048_A396EmprCod ;
   private short[] T002048_A3646EstTinAny ;
   private byte[] T002048_A3647EstTinMes ;
   private byte[] T002048_A3648EstTinDia ;
   private short[] T002048_A1929EstTinNr ;
   private String[] T002049_A396EmprCod ;
   private long[] T002049_A3617AlbTrnCod ;
   private String[] T002050_A396EmprCod ;
   private int[] T002050_A252CliCod ;
   private boolean[] T002050_n252CliCod ;
   private java.math.BigDecimal[] T002050_A3320CliLimKgs ;
   private String[] T002051_A396EmprCod ;
   private String[] T002051_A3073RepCod ;
   private int[] T002051_A252CliCod ;
   private boolean[] T002051_n252CliCod ;
   private String[] T002052_A396EmprCod ;
   private byte[] T002052_A3061Codia ;
   private byte[] T002052_A3062CoMes ;
   private short[] T002052_A3063CoAny ;
   private byte[] T002052_A3065CoLin ;
   private int[] T002052_A3010CoBarCod ;
   private byte[] T002052_A3011CoBarReo ;
   private String[] T002052_A3012CoBarPar ;
   private String[] T002053_A396EmprCod ;
   private int[] T002053_A2971SabFacCod ;
   private String[] T002054_A396EmprCod ;
   private byte[] T002054_A2954TiDia ;
   private byte[] T002054_A2955TiMes ;
   private short[] T002054_A2956TiAny ;
   private byte[] T002054_A2958TiLin ;
   private int[] T002054_A2959TiBarCod ;
   private byte[] T002054_A2960TiBarReo ;
   private String[] T002054_A2961TiBarPar ;
   private String[] T002055_A396EmprCod ;
   private int[] T002055_A252CliCod ;
   private boolean[] T002055_n252CliCod ;
   private short[] T002055_A2933RecTipCon ;
   private String[] T002056_A396EmprCod ;
   private int[] T002056_A252CliCod ;
   private boolean[] T002056_n252CliCod ;
   private String[] T002056_A2927RecProCod ;
   private String[] T002057_A396EmprCod ;
   private int[] T002057_A252CliCod ;
   private boolean[] T002057_n252CliCod ;
   private String[] T002057_A2891HMaForSer ;
   private String[] T002057_A2892HMaForCNom ;
   private int[] T002057_A2893HMaForCNum ;
   private byte[] T002057_A2894HMaTipCCod ;
   private int[] T002057_A2895HMaForNumC ;
   private short[] T002057_A2897HMaColLin ;
   private java.util.Date[] T002057_A2896HMaFec ;
   private short[] T002057_A2907HmaLin ;
   private String[] T002058_A396EmprCod ;
   private int[] T002058_A252CliCod ;
   private boolean[] T002058_n252CliCod ;
   private short[] T002058_A425EstAny ;
   private String[] T002058_A2755EstSerFac ;
   private String[] T002059_A396EmprCod ;
   private short[] T002059_A2730RecTipCo ;
   private int[] T002059_A252CliCod ;
   private boolean[] T002059_n252CliCod ;
   private String[] T002060_A396EmprCod ;
   private String[] T002060_A2720TarSec ;
   private int[] T002060_A252CliCod ;
   private boolean[] T002060_n252CliCod ;
   private short[] T002060_A829TipArtCod ;
   private byte[] T002060_A831TipColCod ;
   private String[] T002061_A396EmprCod ;
   private String[] T002061_A2382AbcTerCod ;
   private String[] T002061_A2381AbcSec ;
   private int[] T002061_A252CliCod ;
   private boolean[] T002061_n252CliCod ;
   private String[] T002062_A396EmprCod ;
   private int[] T002062_A252CliCod ;
   private boolean[] T002062_n252CliCod ;
   private int[] T002062_A2308CliDesCod ;
   private String[] T002063_A396EmprCod ;
   private String[] T002063_A2268MovParCod ;
   private int[] T002063_A252CliCod ;
   private boolean[] T002063_n252CliCod ;
   private String[] T002064_A396EmprCod ;
   private String[] T002064_A966PartCod ;
   private int[] T002064_A252CliCod ;
   private boolean[] T002064_n252CliCod ;
   private String[] T002065_A396EmprCod ;
   private int[] T002065_A1387AlbPrvCod ;
   private String[] T002066_A396EmprCod ;
   private int[] T002066_A252CliCod ;
   private boolean[] T002066_n252CliCod ;
   private String[] T002066_A1213TalCod ;
   private String[] T002067_A396EmprCod ;
   private short[] T002067_A2730RecTipCo ;
   private int[] T002067_A252CliCod ;
   private boolean[] T002067_n252CliCod ;
   private short[] T002067_A2736RecLin2 ;
   private String[] T002068_A396EmprCod ;
   private int[] T002068_A539HisBarCod ;
   private byte[] T002068_A545HisCodReo ;
   private String[] T002068_A544HisCodPar ;
   private short[] T002068_A833TipDefCod ;
   private String[] T002069_A396EmprCod ;
   private int[] T002069_A506HbaBarCod ;
   private byte[] T002069_A508HbaBarReo ;
   private String[] T002069_A507HbaBarPar ;
   private String[] T002070_A396EmprCod ;
   private int[] T002070_A252CliCod ;
   private boolean[] T002070_n252CliCod ;
   private String[] T002070_A494ForSer ;
   private String[] T002070_A482ForColNom ;
   private int[] T002070_A483ForColNum ;
   private byte[] T002070_A831TipColCod ;
   private String[] T002071_A396EmprCod ;
   private int[] T002071_A252CliCod ;
   private boolean[] T002071_n252CliCod ;
   private byte[] T002071_A287CliPagLin ;
   private String[] T002072_A396EmprCod ;
   private int[] T002072_A252CliCod ;
   private boolean[] T002072_n252CliCod ;
   private byte[] T002072_A266CliEnvLin ;
   private String[] T002073_A396EmprCod ;
   private int[] T002073_A252CliCod ;
   private boolean[] T002073_n252CliCod ;
   private String[] T002073_A65ArtCod ;
   private String[] T002074_A396EmprCod ;
   private int[] T002074_A44AlbRecCod ;
   private String[] T002075_A396EmprCod ;
   private long[] T002075_A30AlbProCod ;
   private String[] T002076_A396EmprCod ;
   private int[] T002076_A14AlbComCod ;
   private String[] T002077_A396EmprCod ;
   private int[] T002077_A252CliCod ;
   private boolean[] T002077_n252CliCod ;
   private int[] T002078_A252CliCod ;
   private boolean[] T002078_n252CliCod ;
   private String[] T002078_A470FasSumTin ;
   private boolean[] T002078_n470FasSumTin ;
   private String[] T002078_A12577FasPreKgF ;
   private boolean[] T002078_n12577FasPreKgF ;
   private java.math.BigDecimal[] T002078_A12704FasKgsMn ;
   private boolean[] T002078_n12704FasKgsMn ;
   private String[] T002078_A13587FasKgsEnt ;
   private boolean[] T002078_n13587FasKgsEnt ;
   private java.util.Date[] T002078_A4385FasPreFAc ;
   private boolean[] T002078_n4385FasPreFAc ;
   private String[] T002078_A460FasDsc ;
   private String[] T002078_A4642FasDsc2 ;
   private boolean[] T002078_n4642FasDsc2 ;
   private java.math.BigDecimal[] T002078_A467FasPreMtr ;
   private boolean[] T002078_n467FasPreMtr ;
   private java.math.BigDecimal[] T002078_A466FasPreKgm ;
   private boolean[] T002078_n466FasPreKgm ;
   private String[] T002078_A3615FasFacCod ;
   private boolean[] T002078_n3615FasFacCod ;
   private java.math.BigDecimal[] T002078_A4386FasPreKAn ;
   private boolean[] T002078_n4386FasPreKAn ;
   private java.math.BigDecimal[] T002078_A4387FasPreMAn ;
   private boolean[] T002078_n4387FasPreMAn ;
   private java.util.Date[] T002078_A4388FasPreFAn ;
   private boolean[] T002078_n4388FasPreFAn ;
   private byte[] T002078_A10882FasPreU ;
   private boolean[] T002078_n10882FasPreU ;
   private java.math.BigDecimal[] T002078_A12576FasPreMt2 ;
   private boolean[] T002078_n12576FasPreMt2 ;
   private String[] T002078_A7070FasSigla ;
   private boolean[] T002078_n7070FasSigla ;
   private String[] T002078_A14258FasFactura ;
   private String[] T002078_A396EmprCod ;
   private String[] T002078_A457FasCod ;
   private boolean[] T002078_n457FasCod ;
   private String[] T00204_A460FasDsc ;
   private String[] T00204_A4642FasDsc2 ;
   private boolean[] T00204_n4642FasDsc2 ;
   private String[] T00204_A7070FasSigla ;
   private boolean[] T00204_n7070FasSigla ;
   private String[] T002079_A460FasDsc ;
   private String[] T002079_A4642FasDsc2 ;
   private boolean[] T002079_n4642FasDsc2 ;
   private String[] T002079_A7070FasSigla ;
   private boolean[] T002079_n7070FasSigla ;
   private String[] T002080_A396EmprCod ;
   private int[] T002080_A252CliCod ;
   private boolean[] T002080_n252CliCod ;
   private String[] T002080_A457FasCod ;
   private boolean[] T002080_n457FasCod ;
   private int[] T00203_A252CliCod ;
   private boolean[] T00203_n252CliCod ;
   private String[] T00203_A470FasSumTin ;
   private boolean[] T00203_n470FasSumTin ;
   private String[] T00203_A12577FasPreKgF ;
   private boolean[] T00203_n12577FasPreKgF ;
   private java.math.BigDecimal[] T00203_A12704FasKgsMn ;
   private boolean[] T00203_n12704FasKgsMn ;
   private String[] T00203_A13587FasKgsEnt ;
   private boolean[] T00203_n13587FasKgsEnt ;
   private java.util.Date[] T00203_A4385FasPreFAc ;
   private boolean[] T00203_n4385FasPreFAc ;
   private java.math.BigDecimal[] T00203_A467FasPreMtr ;
   private boolean[] T00203_n467FasPreMtr ;
   private java.math.BigDecimal[] T00203_A466FasPreKgm ;
   private boolean[] T00203_n466FasPreKgm ;
   private String[] T00203_A3615FasFacCod ;
   private boolean[] T00203_n3615FasFacCod ;
   private java.math.BigDecimal[] T00203_A4386FasPreKAn ;
   private boolean[] T00203_n4386FasPreKAn ;
   private java.math.BigDecimal[] T00203_A4387FasPreMAn ;
   private boolean[] T00203_n4387FasPreMAn ;
   private java.util.Date[] T00203_A4388FasPreFAn ;
   private boolean[] T00203_n4388FasPreFAn ;
   private byte[] T00203_A10882FasPreU ;
   private boolean[] T00203_n10882FasPreU ;
   private java.math.BigDecimal[] T00203_A12576FasPreMt2 ;
   private boolean[] T00203_n12576FasPreMt2 ;
   private String[] T00203_A14258FasFactura ;
   private String[] T00203_A396EmprCod ;
   private String[] T00203_A457FasCod ;
   private boolean[] T00203_n457FasCod ;
   private int[] T00202_A252CliCod ;
   private boolean[] T00202_n252CliCod ;
   private String[] T00202_A470FasSumTin ;
   private boolean[] T00202_n470FasSumTin ;
   private String[] T00202_A12577FasPreKgF ;
   private boolean[] T00202_n12577FasPreKgF ;
   private java.math.BigDecimal[] T00202_A12704FasKgsMn ;
   private boolean[] T00202_n12704FasKgsMn ;
   private String[] T00202_A13587FasKgsEnt ;
   private boolean[] T00202_n13587FasKgsEnt ;
   private java.util.Date[] T00202_A4385FasPreFAc ;
   private boolean[] T00202_n4385FasPreFAc ;
   private java.math.BigDecimal[] T00202_A467FasPreMtr ;
   private boolean[] T00202_n467FasPreMtr ;
   private java.math.BigDecimal[] T00202_A466FasPreKgm ;
   private boolean[] T00202_n466FasPreKgm ;
   private String[] T00202_A3615FasFacCod ;
   private boolean[] T00202_n3615FasFacCod ;
   private java.math.BigDecimal[] T00202_A4386FasPreKAn ;
   private boolean[] T00202_n4386FasPreKAn ;
   private java.math.BigDecimal[] T00202_A4387FasPreMAn ;
   private boolean[] T00202_n4387FasPreMAn ;
   private java.util.Date[] T00202_A4388FasPreFAn ;
   private boolean[] T00202_n4388FasPreFAn ;
   private byte[] T00202_A10882FasPreU ;
   private boolean[] T00202_n10882FasPreU ;
   private java.math.BigDecimal[] T00202_A12576FasPreMt2 ;
   private boolean[] T00202_n12576FasPreMt2 ;
   private String[] T00202_A14258FasFactura ;
   private String[] T00202_A396EmprCod ;
   private String[] T00202_A457FasCod ;
   private boolean[] T00202_n457FasCod ;
   private String[] T002084_A460FasDsc ;
   private String[] T002084_A4642FasDsc2 ;
   private boolean[] T002084_n4642FasDsc2 ;
   private String[] T002084_A7070FasSigla ;
   private boolean[] T002084_n7070FasSigla ;
   private String[] T002085_A396EmprCod ;
   private int[] T002085_A252CliCod ;
   private boolean[] T002085_n252CliCod ;
   private String[] T002085_A4589FFProCod ;
   private String[] T002085_A4591FFFasCod ;
   private String[] T002086_A396EmprCod ;
   private int[] T002086_A252CliCod ;
   private boolean[] T002086_n252CliCod ;
   private String[] T002086_A494ForSer ;
   private String[] T002086_A482ForColNom ;
   private int[] T002086_A483ForColNum ;
   private byte[] T002086_A831TipColCod ;
   private String[] T002086_A853For_ProC ;
   private int[] T002086_A1028For_Ord ;
   private String[] T002087_A396EmprCod ;
   private int[] T002087_A252CliCod ;
   private boolean[] T002087_n252CliCod ;
   private String[] T002087_A457FasCod ;
   private boolean[] T002087_n457FasCod ;
   private short[] T002087_A7727ArtAdiCod ;
   private String[] T002088_A396EmprCod ;
   private int[] T002088_A252CliCod ;
   private boolean[] T002088_n252CliCod ;
   private String[] T002088_A65ArtCod ;
   private short[] T002088_A7135Lin_fast ;
   private String[] T002089_A396EmprCod ;
   private int[] T002089_A252CliCod ;
   private boolean[] T002089_n252CliCod ;
   private short[] T002089_A6016FasExpLin ;
   private String[] T002090_A396EmprCod ;
   private String[] T002090_A966PartCod ;
   private int[] T002090_A252CliCod ;
   private boolean[] T002090_n252CliCod ;
   private short[] T002090_A5849UbiLin ;
   private String[] T002091_A396EmprCod ;
   private int[] T002091_A252CliCod ;
   private boolean[] T002091_n252CliCod ;
   private String[] T002091_A457FasCod ;
   private boolean[] T002091_n457FasCod ;
   private short[] T002091_A5515ClifsiLin ;
   private String[] T002092_A396EmprCod ;
   private int[] T002092_A252CliCod ;
   private boolean[] T002092_n252CliCod ;
   private String[] T002092_A457FasCod ;
   private boolean[] T002092_n457FasCod ;
   private short[] T002092_A5519ClifsdLin ;
   private String[] T002093_A396EmprCod ;
   private int[] T002093_A252CliCod ;
   private boolean[] T002093_n252CliCod ;
   private String[] T002093_A457FasCod ;
   private boolean[] T002093_n457FasCod ;
   private short[] T002093_A5310ClFsAny ;
   private String[] T002093_A5311ClFsSer ;
   private String[] T002094_A396EmprCod ;
   private int[] T002094_A252CliCod ;
   private boolean[] T002094_n252CliCod ;
   private String[] T002094_A65ArtCod ;
   private String[] T002094_A4658MdlCod ;
   private String[] T002094_A457FasCod ;
   private boolean[] T002094_n457FasCod ;
   private String[] T002095_A396EmprCod ;
   private int[] T002095_A252CliCod ;
   private boolean[] T002095_n252CliCod ;
   private String[] T002095_A65ArtCod ;
   private String[] T002095_A758ProCod ;
   private String[] T002095_A457FasCod ;
   private boolean[] T002095_n457FasCod ;
   private String[] T002096_A396EmprCod ;
   private int[] T002096_A2333ExtPdoAlb ;
   private short[] T002096_A2790ExtPdoLin ;
   private String[] T002097_A396EmprCod ;
   private int[] T002097_A252CliCod ;
   private boolean[] T002097_n252CliCod ;
   private String[] T002097_A457FasCod ;
   private boolean[] T002097_n457FasCod ;
   private String[] T002097_A2740PreExtSer ;
   private String[] T002097_A2427PreExtNMtr ;
   private String[] T002098_A396EmprCod ;
   private short[] T002098_A2730RecTipCo ;
   private int[] T002098_A252CliCod ;
   private boolean[] T002098_n252CliCod ;
   private short[] T002098_A2736RecLin2 ;
   private String[] T002099_A396EmprCod ;
   private int[] T002099_A252CliCod ;
   private boolean[] T002099_n252CliCod ;
   private String[] T002099_A457FasCod ;
   private boolean[] T002099_n457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV47WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV48TrnContext ;
}

final  class tprefas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprefas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprefas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprefas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprefas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00202", "SELECT CliCod, FasSumTin, FasPreKgF, FasKgsMn, FasKgsEnt, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasFactura, EmprCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?  FOR UPDATE OF FasSumTin, FasPreKgF, FasKgsMn, FasKgsEnt, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasFactura NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00203", "SELECT CliCod, FasSumTin, FasPreKgF, FasKgsMn, FasKgsEnt, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasFactura, EmprCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00204", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00205", "SELECT CliCod, CliNom, CliAct, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, CliAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00206", "SELECT CliCod, CliNom, CliAct, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00207", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00208", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, TM1.CliNom, T2.EmprNom, TM1.CliAct, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00209", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002010", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ?) ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002011", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ?) ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002012", "INSERT INTO TXPCLIENT(CliCod, CliNom, CliAct, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T002013", "UPDATE TXPCLIENT SET CliNom=?, CliAct=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T002014", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T002015", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002016", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002017", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002018", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002019", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002020", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002021", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002022", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002023", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002024", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002025", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002026", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002027", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002028", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002029", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002030", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002031", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002032", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002033", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002034", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002035", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002036", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002037", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002038", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002039", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002040", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002041", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002042", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002043", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002044", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002045", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002046", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002047", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002048", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002049", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002050", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002051", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002052", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002053", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002054", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002055", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002056", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002057", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002058", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002059", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002060", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002061", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002062", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002063", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002064", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002065", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002066", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002067", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod, RecLin2 FROM TXPLRETIT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002068", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002069", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002070", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002071", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002072", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002073", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002074", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002075", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002076", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002077", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002078", "SELECT T1.CliCod, T1.FasSumTin, T1.FasPreKgF, T1.FasKgsMn, T1.FasKgsEnt, T1.FasPreFAc, T2.FasDsc, T2.FasDsc2, T1.FasPreMtr, T1.FasPreKgm, T1.FasFacCod, T1.FasPreKAn, T1.FasPreMAn, T1.FasPreFAn, T1.FasPreU, T1.FasPreMt2, T2.FasSigla, T1.FasFactura, T1.EmprCod, T1.FasCod FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002079", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002080", "SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002081", "INSERT INTO TXPPREFAS(CliCod, FasSumTin, FasPreKgF, FasKgsMn, FasKgsEnt, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, FasPreU, FasPreMt2, FasFactura, EmprCod, FasCod, ClifsdUl, ClifsiUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T002082", "UPDATE TXPPREFAS SET FasSumTin=?, FasPreKgF=?, FasKgsMn=?, FasKgsEnt=?, FasPreFAc=?, FasPreMtr=?, FasPreKgm=?, FasFacCod=?, FasPreKAn=?, FasPreMAn=?, FasPreFAn=?, FasPreU=?, FasPreMt2=?, FasFactura=?  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T002083", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new ForEachCursor("T002084", "SELECT FasDsc, FasDsc2, FasSigla FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002085", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod, FFFasCod FROM TXPFasFC2 WHERE EmprCod = ? AND CliCod = ? AND FFFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002086", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC, For_Ord FROM TXPTAB001 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002087", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ArtAdiCod FROM TXPARTPFA WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002088", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND FasCodt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002089", "SELECT * FROM (SELECT EmprCod, CliCod, FasExpLin FROM TXPFASCLI WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002090", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod, UbiLin FROM TXPUBIMTO WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002091", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsiLin FROM TXPCLIFS1 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002092", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsdLin FROM TXPCLIFSD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002093", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClFsAny, ClFsSer FROM TXPCLFSE WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002094", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod FROM TXPCForFa WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002095", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002096", "SELECT * FROM (SELECT EmprCod, ExtPdoAlb, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002097", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr FROM TXPPREEXT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002098", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod, RecLin2 FROM TXPLRETIT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002099", "SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((String[]) buf[28])[0] = rslt.getString(16, 3);
               ((String[]) buf[29])[0] = rslt.getString(17, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((String[]) buf[28])[0] = rslt.getString(16, 3);
               ((String[]) buf[29])[0] = rslt.getString(17, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
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
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 55 :
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
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 28);
               ((String[]) buf[12])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 4);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((String[]) buf[33])[0] = rslt.getString(19, 3);
               ((String[]) buf[34])[0] = rslt.getString(20, 8);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
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
               return;
            case 6 :
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
            case 9 :
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
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
            case 12 :
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
            case 13 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 6);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 5);
               }
               stmt.setString(15, (String)parms[28], 1);
               stmt.setString(16, (String)parms[29], 3);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 8);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 6);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 5);
               }
               stmt.setString(14, (String)parms[26], 1);
               stmt.setString(15, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 97 :
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

