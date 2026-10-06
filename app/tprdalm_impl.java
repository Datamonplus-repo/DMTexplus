package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprdalm_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8908CC_AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCod"))) ;
         n8908CC_AlmCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A8908CC_AlmCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtprdalm_level1item") == 0 )
      {
         gxnrgridtprdalm_level1item_newrow_invoke( ) ;
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
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ASOCIO A PRODUCTOS ALMACENES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtprdalm_level1item_newrow_invoke( )
   {
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtprdalm_level1item_newrow( ) ;
      /* End function gxnrGridtprdalm_level1item_newrow_invoke */
   }

   public tprdalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprdalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdalm_impl.class ));
   }

   public tprdalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "ASOCIO A PRODUCTOS ALMACENES", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDALM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiCC_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel1table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtprdalm_level1item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtprdalm_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol63( ) ;
      nGXsfl_63_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1211 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1211 = (short)(1) ;
            scanStart1361211( ) ;
            while ( RcdFound1211 != 0 )
            {
               init_level_properties1211( ) ;
               getByPrimaryKey1361211( ) ;
               addRow1361211( ) ;
               scanNext1361211( ) ;
            }
            scanEnd1361211( ) ;
            nBlankRcdCount1211 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1361211( ) ;
         standaloneModal1361211( ) ;
         sMode1211 = Gx_mode ;
         while ( nGXsfl_63_idx < nRC_GXsfl_63 )
         {
            bGXsfl_63_Refreshing = true ;
            readRow1361211( ) ;
            edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
            edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
            edtCC_ExisCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXISCC_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_ExisCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExisCC_Enabled), 5, 0), !bGXsfl_63_Refreshing);
            if ( ( nRcdExists_1211 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1361211( ) ;
            }
            sendRow1361211( ) ;
            bGXsfl_63_Refreshing = false ;
         }
         Gx_mode = sMode1211 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1211 = (short)(5) ;
         nRcdExists_1211 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1361211( ) ;
            while ( RcdFound1211 != 0 )
            {
               sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_631211( ) ;
               init_level_properties1211( ) ;
               standaloneNotModal1361211( ) ;
               getByPrimaryKey1361211( ) ;
               standaloneModal1361211( ) ;
               addRow1361211( ) ;
               scanNext1361211( ) ;
            }
            scanEnd1361211( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1211 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_631211( ) ;
      initAll1361211( ) ;
      init_level_properties1211( ) ;
      nRcdExists_1211 = (short)(0) ;
      nIsMod_1211 = (short)(0) ;
      nRcdDeleted_1211 = (short)(0) ;
      nBlankRcdCount1211 = (short)(nBlankRcdUsr1211+nBlankRcdCount1211) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1211 > 0 )
      {
         standaloneNotModal1361211( ) ;
         standaloneModal1361211( ) ;
         addRow1361211( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCC_AlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1211 = (short)(nBlankRcdCount1211-1) ;
      }
      Gx_mode = sMode1211 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtprdalm_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtprdalm_level1item", Gridtprdalm_level1itemContainer, subGridtprdalm_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtprdalm_level1itemContainerData", Gridtprdalm_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtprdalm_level1itemContainerData"+"V", Gridtprdalm_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtprdalm_level1itemContainerData"+"V"+"\" value='"+Gridtprdalm_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      e111362 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdExiCC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A705PrdExiCC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            }
            else
            {
               A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
               standaloneModal( ) ;
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
                        e111362 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'VER MOVIMIENTOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Ver Movimientos' */
                        e121362 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13629( ) ;
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
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes13629( ) ;
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

   public void confirm_1361211( )
   {
      nGXsfl_63_idx = 0 ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         readRow1361211( ) ;
         if ( ( nRcdExists_1211 != 0 ) || ( nIsMod_1211 != 0 ) )
         {
            getKey1361211( ) ;
            if ( ( nRcdExists_1211 == 0 ) && ( nRcdDeleted_1211 == 0 ) )
            {
               if ( RcdFound1211 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1361211( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1361211( ) ;
                     closeExtendedTableCursors1361211( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCC_AlmCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1211 != 0 )
               {
                  if ( nRcdDeleted_1211 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1361211( ) ;
                     load1361211( ) ;
                     beforeValidate1361211( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1361211( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1211 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1361211( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1361211( ) ;
                           closeExtendedTableCursors1361211( ) ;
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
                  if ( nRcdDeleted_1211 == 0 )
                  {
                     GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCC_AlmCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtCC_ExisCC_Internalname, GXutil.ltrim( localUtil.ntoc( A8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8918CC_ExisCC_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1211 != 0 )
         {
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXISCC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExisCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1360( )
   {
   }

   public void e111362( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tprdalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tprdalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tprdalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV15Lit3 = httpContext.getMessage( "Producto", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Exis CC", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprdalm_impl.this.A396EmprCod = GXv_char2[0] ;
      tprdalm_impl.this.AV11EmprNom = GXv_char3[0] ;
      tprdalm_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121362( )
   {
      /* 'Ver Movimientos' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm13629( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01366_A718PrdNom[0] ;
            Z705PrdExiCC = T01366_A705PrdExiCC[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z705PrdExiCC = A705PrdExiCC ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TPRDALM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01367 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01367_A407EmprNom[0] ;
      n407EmprNom = T01367_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load13629( )
   {
      /* Using cursor T01368 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T01368_A407EmprNom[0] ;
         n407EmprNom = T01368_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01368_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A705PrdExiCC = T01368_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         zm13629( -3) ;
      }
      pr_default.close(6);
      onLoadActions13629( ) ;
   }

   public void onLoadActions13629( )
   {
   }

   public void checkExtendedTable13629( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors13629( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey13629( )
   {
      /* Using cursor T01369 */
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
      /* Using cursor T01366 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01366_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01366_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13629( 3) ;
         RcdFound29 = (short)(1) ;
         A718PrdNom = T01366_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A705PrdExiCC = T01366_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load13629( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey13629( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey13629( ) ;
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
      getKey13629( ) ;
      if ( RcdFound29 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T013610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T013610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013610_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T013610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013610_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T013611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T013611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013611_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T013611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013611_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13629( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13629( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update13629( ) ;
               GX_FocusControl = edtPrdNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13629( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtPrdNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13629( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart13629( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13629( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart13629( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext13629( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13629( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency13629( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01365 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z718PrdNom, T01365_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01365_A705PrdExiCC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01365_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tprdalm:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01365_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01365_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdalm:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01365_A705PrdExiCC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13629( )
   {
      beforeValidate13629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13629( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13629( 0) ;
         checkOptimisticConcurrency13629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13629( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013612 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A705PrdExiCC, A396EmprCod});
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
                        processLevel13629( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1360( ) ;
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
            load13629( ) ;
         }
         endLevel13629( ) ;
      }
      closeExtendedTableCursors13629( ) ;
   }

   public void update13629( )
   {
      beforeValidate13629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13629( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13629( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013613 */
                  pr_default.execute(11, new Object[] {A718PrdNom, A705PrdExiCC, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13629( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13629( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1360( ) ;
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
         endLevel13629( ) ;
      }
      closeExtendedTableCursors13629( ) ;
   }

   public void deferredUpdate13629( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13629( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13629( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13629( ) ;
         afterConfirm13629( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13629( ) ;
            if ( AnyError == 0 )
            {
               scanStart1361211( ) ;
               while ( RcdFound1211 != 0 )
               {
                  getByPrimaryKey1361211( ) ;
                  delete1361211( ) ;
                  scanNext1361211( ) ;
               }
               scanEnd1361211( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013614 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound29 == 0 )
                        {
                           initAll13629( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption1360( ) ;
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
      endLevel13629( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13629( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T013615 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T013616 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T013617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T013618 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T013619 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T013620 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T013621 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T013622 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T013623 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T013624 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T013625 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T013626 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T013627 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T013628 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T013629 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T013630 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T013631 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T013632 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T013633 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T013634 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T013635 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T013636 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T013637 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T013638 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T013639 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T013640 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T013641 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T013642 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T013643 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T013644 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T013645 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T013646 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T013647 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T013648 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T013649 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T013650 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T013651 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T013652 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T013653 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T013654 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T013655 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T013656 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T013657 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T013658 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T013659 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T013660 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T013661 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T013662 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T013663 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T013664 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T013665 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T013666 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T013667 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T013668 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T013669 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T013670 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T013671 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T013672 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T013673 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T013674 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T013675 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T013676 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T013677 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T013678 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T013679 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T013680 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T013681 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T013682 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T013683 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T013684 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T013685 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T013686 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T013687 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
      }
   }

   public void processNestedLevel1361211( )
   {
      nGXsfl_63_idx = 0 ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         readRow1361211( ) ;
         if ( ( nRcdExists_1211 != 0 ) || ( nIsMod_1211 != 0 ) )
         {
            standaloneNotModal1361211( ) ;
            getKey1361211( ) ;
            if ( ( nRcdExists_1211 == 0 ) && ( nRcdDeleted_1211 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1361211( ) ;
            }
            else
            {
               if ( RcdFound1211 != 0 )
               {
                  if ( ( nRcdDeleted_1211 != 0 ) && ( nRcdExists_1211 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1361211( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1211 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1361211( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1211 == 0 )
                  {
                     GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCC_AlmCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtCC_ExisCC_Internalname, GXutil.ltrim( localUtil.ntoc( A8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8918CC_ExisCC_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1211_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1211 != 0 )
         {
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXISCC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExisCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1361211( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1211 = (short)(0) ;
      nIsMod_1211 = (short)(0) ;
      nRcdDeleted_1211 = (short)(0) ;
   }

   public void processLevel13629( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1361211( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13629( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13629( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprdalm");
         if ( AnyError == 0 )
         {
            confirmValues1360( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13629( )
   {
      /* Scan By routine */
      /* Using cursor T013688 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13629( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
   }

   public void scanEnd13629( )
   {
      pr_default.close(86);
   }

   public void afterConfirm13629( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13629( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13629( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13629( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13629( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13629( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13629( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
   }

   public void zm1361211( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8918CC_ExisCC = T01363_A8918CC_ExisCC[0] ;
         }
         else
         {
            Z8918CC_ExisCC = A8918CC_ExisCC ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z719PrdNum = A719PrdNum ;
         Z8918CC_ExisCC = A8918CC_ExisCC ;
         Z396EmprCod = A396EmprCod ;
         Z8908CC_AlmCod = A8908CC_AlmCod ;
         Z8909CC_AlmDsc = A8909CC_AlmDsc ;
      }
   }

   public void standaloneNotModal1361211( )
   {
      edtCC_ExisCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExisCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExisCC_Enabled), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void standaloneModal1361211( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCC_AlmCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      }
      else
      {
         edtCC_AlmCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      }
   }

   public void load1361211( )
   {
      /* Using cursor T013689 */
      pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound1211 = (short)(1) ;
         A8909CC_AlmDsc = T013689_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013689_n8909CC_AlmDsc[0] ;
         A8918CC_ExisCC = T013689_A8918CC_ExisCC[0] ;
         n8918CC_ExisCC = T013689_n8918CC_ExisCC[0] ;
         zm1361211( -5) ;
      }
      pr_default.close(87);
      onLoadActions1361211( ) ;
   }

   public void onLoadActions1361211( )
   {
   }

   public void checkExtendedTable1361211( )
   {
      nIsDirty_1211 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1361211( ) ;
      /* Using cursor T01364 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T01364_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T01364_n8909CC_AlmDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1361211( )
   {
      pr_default.close(2);
   }

   public void enableDisable1361211( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         byte A8908CC_AlmCod )
   {
      /* Using cursor T013690 */
      pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(88) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T013690_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013690_n8909CC_AlmDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8909CC_AlmDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(88) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(88);
   }

   public void getKey1361211( )
   {
      /* Using cursor T013691 */
      pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound1211 = (short)(1) ;
      }
      else
      {
         RcdFound1211 = (short)(0) ;
      }
      pr_default.close(89);
   }

   public void getByPrimaryKey1361211( )
   {
      /* Using cursor T01363 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01363_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01363_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1361211( 5) ;
         RcdFound1211 = (short)(1) ;
         initializeNonKey1361211( ) ;
         A8918CC_ExisCC = T01363_A8918CC_ExisCC[0] ;
         n8918CC_ExisCC = T01363_n8918CC_ExisCC[0] ;
         A8908CC_AlmCod = T01363_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = T01363_n8908CC_AlmCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8908CC_AlmCod = A8908CC_AlmCod ;
         sMode1211 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1361211( ) ;
         load1361211( ) ;
         Gx_mode = sMode1211 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1211 = (short)(0) ;
         initializeNonKey1361211( ) ;
         sMode1211 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1361211( ) ;
         Gx_mode = sMode1211 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1361211( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1361211( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01362 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8918CC_ExisCC, T01362_A8918CC_ExisCC[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8918CC_ExisCC, T01362_A8918CC_ExisCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdalm:[seudo value changed for attri]"+"CC_ExisCC");
               GXutil.writeLogRaw("Old: ",Z8918CC_ExisCC);
               GXutil.writeLogRaw("Current: ",T01362_A8918CC_ExisCC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRDALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1361211( )
   {
      beforeValidate1361211( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1361211( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1361211( 0) ;
         checkOptimisticConcurrency1361211( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1361211( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1361211( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013692 */
                  pr_default.execute(90, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8918CC_ExisCC), A8918CC_ExisCC, A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
                  if ( (pr_default.getStatus(90) == 1) )
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
            load1361211( ) ;
         }
         endLevel1361211( ) ;
      }
      closeExtendedTableCursors1361211( ) ;
   }

   public void update1361211( )
   {
      beforeValidate1361211( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1361211( ) ;
      }
      if ( ( nIsMod_1211 != 0 ) || ( nIsDirty_1211 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1361211( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1361211( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1361211( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013693 */
                     pr_default.execute(91, new Object[] {Boolean.valueOf(n8918CC_ExisCC), A8918CC_ExisCC, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
                     if ( (pr_default.getStatus(91) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDALM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1361211( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1361211( ) ;
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
            endLevel1361211( ) ;
         }
      }
      closeExtendedTableCursors1361211( ) ;
   }

   public void deferredUpdate1361211( )
   {
   }

   public void delete1361211( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1361211( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1361211( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1361211( ) ;
         afterConfirm1361211( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1361211( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013694 */
               pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
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
      sMode1211 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1361211( ) ;
      Gx_mode = sMode1211 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1361211( )
   {
      standaloneModal1361211( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013695 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         A8909CC_AlmDsc = T013695_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013695_n8909CC_AlmDsc[0] ;
         pr_default.close(93);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013696 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T013697 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T013698 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
      }
   }

   public void endLevel1361211( )
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

   public void scanStart1361211( )
   {
      /* Scan By routine */
      /* Using cursor T013699 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1211 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound1211 = (short)(1) ;
         A8908CC_AlmCod = T013699_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = T013699_n8908CC_AlmCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1361211( )
   {
      /* Scan next routine */
      pr_default.readNext(97);
      RcdFound1211 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound1211 = (short)(1) ;
         A8908CC_AlmCod = T013699_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = T013699_n8908CC_AlmCod[0] ;
      }
   }

   public void scanEnd1361211( )
   {
      pr_default.close(97);
   }

   public void afterConfirm1361211( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1361211( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1361211( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1361211( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1361211( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1361211( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1361211( )
   {
      edtCC_AlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtCC_AlmDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtCC_ExisCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExisCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExisCC_Enabled), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void send_integrity_lvl_hashes1361211( )
   {
   }

   public void send_integrity_lvl_hashes13629( )
   {
   }

   public void subsflControlProps_631211( )
   {
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_63_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_63_idx ;
      edtCC_ExisCC_Internalname = "CC_EXISCC_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_631211( )
   {
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_63_fel_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_63_fel_idx ;
      edtCC_ExisCC_Internalname = "CC_EXISCC_"+sGXsfl_63_fel_idx ;
   }

   public void addRow1361211( )
   {
      nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_631211( ) ;
      sendRow1361211( ) ;
   }

   public void sendRow1361211( )
   {
      Gridtprdalm_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtprdalm_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtprdalm_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtprdalm_level1item_Class, "") != 0 )
         {
            subGridtprdalm_level1item_Linesclass = subGridtprdalm_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtprdalm_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtprdalm_level1item_Backstyle = (byte)(0) ;
         subGridtprdalm_level1item_Backcolor = subGridtprdalm_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtprdalm_level1item_Class, "") != 0 )
         {
            subGridtprdalm_level1item_Linesclass = subGridtprdalm_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtprdalm_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtprdalm_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtprdalm_level1item_Class, "") != 0 )
         {
            subGridtprdalm_level1item_Linesclass = subGridtprdalm_level1item_Class+"Odd" ;
         }
         subGridtprdalm_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtprdalm_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtprdalm_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
         {
            subGridtprdalm_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtprdalm_level1item_Class, "") != 0 )
            {
               subGridtprdalm_level1item_Linesclass = subGridtprdalm_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtprdalm_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtprdalm_level1item_Class, "") != 0 )
            {
               subGridtprdalm_level1item_Linesclass = subGridtprdalm_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1211_" + sGXsfl_63_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_63_idx + "',63)\"" ;
      ROClassString = "Attribute" ;
      Gridtprdalm_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtprdalm_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmDsc_Internalname,GXutil.rtrim( A8909CC_AlmDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtprdalm_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_ExisCC_Internalname,GXutil.ltrim( localUtil.ntoc( A8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_ExisCC_Enabled!=0) ? localUtil.format( A8918CC_ExisCC, "ZZZZZZ9.9999") : localUtil.format( A8918CC_ExisCC, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_ExisCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_ExisCC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtprdalm_level1itemRow);
      send_integrity_lvl_hashes1361211( ) ;
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8918CC_ExisCC_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8918CC_ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1211_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1211_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1211_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1211, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMCOD_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDSC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_EXISCC_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExisCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtprdalm_level1itemContainer.AddRow(Gridtprdalm_level1itemRow);
   }

   public void readRow1361211( )
   {
      nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_631211( ) ;
      edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_ExisCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXISCC_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_63_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         wbErr = true ;
         A8908CC_AlmCod = (byte)(0) ;
         n8908CC_AlmCod = false ;
      }
      else
      {
         A8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8908CC_AlmCod = false ;
      }
      A8909CC_AlmDsc = httpContext.cgiGet( edtCC_AlmDsc_Internalname) ;
      n8909CC_AlmDsc = false ;
      A8918CC_ExisCC = localUtil.ctond( httpContext.cgiGet( edtCC_ExisCC_Internalname)) ;
      n8918CC_ExisCC = false ;
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_63_idx ;
      Z8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8918CC_ExisCC_" + sGXsfl_63_idx ;
      Z8918CC_ExisCC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1211_" + sGXsfl_63_idx ;
      nRcdDeleted_1211 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1211_" + sGXsfl_63_idx ;
      nRcdExists_1211 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1211_" + sGXsfl_63_idx ;
      nIsMod_1211 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCC_ExisCC_Enabled = edtCC_ExisCC_Enabled ;
      defedtCC_AlmCod_Enabled = edtCC_AlmCod_Enabled ;
   }

   public void confirmValues1360( )
   {
      nGXsfl_63_idx = 0 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_631211( ) ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_631211( ) ;
         httpContext.changePostValue( "Z8908CC_AlmCod_"+sGXsfl_63_idx, httpContext.cgiGet( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_63_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_63_idx) ;
         httpContext.changePostValue( "Z8918CC_ExisCC_"+sGXsfl_63_idx, httpContext.cgiGet( "ZT_"+"Z8918CC_ExisCC_"+sGXsfl_63_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8918CC_ExisCC_"+sGXsfl_63_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprdalm", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"EmprCod","PrdNum"}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nGXsfl_63_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tprdalm", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"EmprCod","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "TPRDALM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ASOCIO A PRODUCTOS ALMACENES", "") ;
   }

   public void initializeNonKey13629( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      Z718PrdNom = "" ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
   }

   public void initAll13629( )
   {
      initializeNonKey13629( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1361211( )
   {
      A8909CC_AlmDsc = "" ;
      n8909CC_AlmDsc = false ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      n8918CC_ExisCC = false ;
      Z8918CC_ExisCC = DecimalUtil.ZERO ;
   }

   public void initAll1361211( )
   {
      A8908CC_AlmCod = (byte)(0) ;
      n8908CC_AlmCod = false ;
      initializeNonKey1361211( ) ;
   }

   public void standaloneModalInsert1361211( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241541175", true, true);
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
      httpContext.AddJavascriptSource("tprdalm.js", "?20268241541176", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1211( )
   {
      edtCC_ExisCC_Enabled = defedtCC_ExisCC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExisCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExisCC_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtCC_AlmCod_Enabled = defedtCC_AlmCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void startgridcontrol63( )
   {
      Gridtprdalm_level1itemContainer.AddObjectProperty("GridName", "Gridtprdalm_level1item");
      Gridtprdalm_level1itemContainer.AddObjectProperty("Header", subGridtprdalm_level1item_Header);
      Gridtprdalm_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtprdalm_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtprdalm_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtprdalm_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtprdalm_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), ".", "")));
      Gridtprdalm_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddColumnProperties(Gridtprdalm_level1itemColumn);
      Gridtprdalm_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtprdalm_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A8909CC_AlmDsc));
      Gridtprdalm_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddColumnProperties(Gridtprdalm_level1itemColumn);
      Gridtprdalm_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtprdalm_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8918CC_ExisCC, (byte)(12), (byte)(4), ".", "")));
      Gridtprdalm_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExisCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddColumnProperties(Gridtprdalm_level1itemColumn);
      Gridtprdalm_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtprdalm_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtprdalm_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD" ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC" ;
      edtCC_ExisCC_Internalname = "CC_EXISCC" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtprdalm_level1item_Internalname = "GRIDTPRDALM_LEVEL1ITEM" ;
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
      subGridtprdalm_level1item_Allowcollapsing = (byte)(0) ;
      subGridtprdalm_level1item_Allowselection = (byte)(0) ;
      subGridtprdalm_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ASOCIO A PRODUCTOS ALMACENES", "") );
      edtCC_ExisCC_Jsonclick = "" ;
      edtCC_AlmDsc_Jsonclick = "" ;
      edtCC_AlmCod_Jsonclick = "" ;
      subGridtprdalm_level1item_Class = "Grid" ;
      subGridtprdalm_level1item_Backcolorstyle = (byte)(0) ;
      edtCC_ExisCC_Enabled = 0 ;
      edtCC_AlmDsc_Enabled = 0 ;
      edtCC_AlmCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void gxnrgridtprdalm_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_631211( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1361211( ) ;
         standaloneModal1361211( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1361211( ) ;
         nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_631211( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtprdalm_level1itemContainer)) ;
      /* End function gxnrGridtprdalm_level1item_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T0136100 */
      pr_default.execute(98, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(98) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T0136100_A407EmprNom[0] ;
      n407EmprNom = T0136100_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(98);
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cc_almcod( )
   {
      n8908CC_AlmCod = false ;
      n8909CC_AlmDsc = false ;
      /* Using cursor T013695 */
      pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(93) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CC_ALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
      }
      A8909CC_AlmDsc = T013695_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013695_n8909CC_AlmDsc[0] ;
      pr_default.close(93);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8909CC_AlmDsc", GXutil.rtrim( A8909CC_AlmDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'VER MOVIMIENTOS'","{handler:'e121362',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("'VER MOVIMIENTOS'",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z407EmprNom'},{av:'Z718PrdNom'},{av:'Z705PrdExiCC'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CC_ALMCOD","{handler:'valid_Cc_almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8908CC_AlmCod',fld:'CC_ALMCOD',pic:'Z9'},{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCOD",",oparms:[{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cc_exiscc',iparms:[]");
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
      pr_default.close(93);
      pr_default.close(98);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA719PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z8918CC_ExisCC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtprdalm_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1211 = "" ;
      sStyleString = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A8909CC_AlmDsc = "" ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01367_A407EmprNom = new String[] {""} ;
      T01367_n407EmprNom = new boolean[] {false} ;
      T01368_A719PrdNum = new String[] {""} ;
      T01368_n719PrdNum = new boolean[] {false} ;
      T01368_A407EmprNom = new String[] {""} ;
      T01368_n407EmprNom = new boolean[] {false} ;
      T01368_A718PrdNom = new String[] {""} ;
      T01368_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01368_A396EmprCod = new String[] {""} ;
      T01369_A396EmprCod = new String[] {""} ;
      T01369_A719PrdNum = new String[] {""} ;
      T01369_n719PrdNum = new boolean[] {false} ;
      T01366_A719PrdNum = new String[] {""} ;
      T01366_n719PrdNum = new boolean[] {false} ;
      T01366_A718PrdNom = new String[] {""} ;
      T01366_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01366_A396EmprCod = new String[] {""} ;
      sMode29 = "" ;
      T013610_A396EmprCod = new String[] {""} ;
      T013610_A719PrdNum = new String[] {""} ;
      T013610_n719PrdNum = new boolean[] {false} ;
      T013611_A396EmprCod = new String[] {""} ;
      T013611_A719PrdNum = new String[] {""} ;
      T013611_n719PrdNum = new boolean[] {false} ;
      T01365_A719PrdNum = new String[] {""} ;
      T01365_n719PrdNum = new boolean[] {false} ;
      T01365_A718PrdNom = new String[] {""} ;
      T01365_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01365_A396EmprCod = new String[] {""} ;
      T013615_A396EmprCod = new String[] {""} ;
      T013615_A719PrdNum = new String[] {""} ;
      T013615_n719PrdNum = new boolean[] {false} ;
      T013615_A13217NormaID = new String[] {""} ;
      T013616_A396EmprCod = new String[] {""} ;
      T013616_A719PrdNum = new String[] {""} ;
      T013616_n719PrdNum = new boolean[] {false} ;
      T013616_A13586TheList = new String[] {""} ;
      T013617_A396EmprCod = new String[] {""} ;
      T013617_A5532Lb_numero = new int[1] ;
      T013617_A5555Lb_opcion = new String[] {""} ;
      T013617_A13460Lb_linCP = new short[1] ;
      T013617_A13458Lb_TipCP = new String[] {""} ;
      T013618_A396EmprCod = new String[] {""} ;
      T013618_A13418AlbProID = new int[1] ;
      T013618_A13442AlbProLine = new short[1] ;
      T013619_A396EmprCod = new String[] {""} ;
      T013619_A13324LDESID = new int[1] ;
      T013619_A13333LDESNPeque = new String[] {""} ;
      T013619_A13337LDESComb = new String[] {""} ;
      T013619_A13339LDESFondo = new String[] {""} ;
      T013619_A13342LDESLinea = new short[1] ;
      T013620_A396EmprCod = new String[] {""} ;
      T013620_A13312Lb_NLab = new int[1] ;
      T013620_A13305Lb_IDVeces = new short[1] ;
      T013620_A13306Lb_LinID = new short[1] ;
      T013621_A396EmprCod = new String[] {""} ;
      T013621_A12673LavMqId = new int[1] ;
      T013621_A12692LavMqLnPq = new short[1] ;
      T013621_A12681LavMqLn = new short[1] ;
      T013622_A396EmprCod = new String[] {""} ;
      T013622_A719PrdNum = new String[] {""} ;
      T013622_n719PrdNum = new boolean[] {false} ;
      T013622_A9713Tb1_Cod = new short[1] ;
      T013623_A396EmprCod = new String[] {""} ;
      T013623_A12236PrdNumD = new String[] {""} ;
      T013623_A719PrdNum = new String[] {""} ;
      T013623_n719PrdNum = new boolean[] {false} ;
      T013624_A396EmprCod = new String[] {""} ;
      T013624_A12225DocDisID = new long[1] ;
      T013624_A12226LinDisID = new short[1] ;
      T013625_A396EmprCod = new String[] {""} ;
      T013625_A12225DocDisID = new long[1] ;
      T013626_A396EmprCod = new String[] {""} ;
      T013626_A12205OrdenCID = new long[1] ;
      T013626_A12206OrdenCLnId = new short[1] ;
      T013627_A396EmprCod = new String[] {""} ;
      T013627_A719PrdNum = new String[] {""} ;
      T013627_n719PrdNum = new boolean[] {false} ;
      T013627_A11664LoteID = new String[] {""} ;
      T013627_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013628_A396EmprCod = new String[] {""} ;
      T013628_A4850DevComCod = new int[1] ;
      T013628_A719PrdNum = new String[] {""} ;
      T013628_n719PrdNum = new boolean[] {false} ;
      T013629_A396EmprCod = new String[] {""} ;
      T013629_A252CliCod = new int[1] ;
      T013629_A494ForSer = new String[] {""} ;
      T013629_A482ForColNom = new String[] {""} ;
      T013629_A483ForColNum = new int[1] ;
      T013629_A831TipColCod = new byte[1] ;
      T013629_A3571EnsCod = new String[] {""} ;
      T013629_A3582EnsLin = new short[1] ;
      T013630_A396EmprCod = new String[] {""} ;
      T013630_A129BarCod = new int[1] ;
      T013630_A132BarCodReo = new byte[1] ;
      T013630_A130BarCodPar = new String[] {""} ;
      T013630_A4075recestncol = new byte[1] ;
      T013630_A4076recestnpro = new byte[1] ;
      T013630_A4108recestlin = new short[1] ;
      T013631_A396EmprCod = new String[] {""} ;
      T013631_A4052EstNumFor = new int[1] ;
      T013631_A4053EstNumCol = new byte[1] ;
      T013631_A4090EstEspLin = new byte[1] ;
      T013632_A396EmprCod = new String[] {""} ;
      T013632_A4052EstNumFor = new int[1] ;
      T013632_A4053EstNumCol = new byte[1] ;
      T013632_A4084EstProLin = new byte[1] ;
      T013633_A396EmprCod = new String[] {""} ;
      T013633_A11644TransferId = new long[1] ;
      T013633_A11653TransferLn = new int[1] ;
      T013634_A396EmprCod = new String[] {""} ;
      T013634_A11634TaesId = new String[] {""} ;
      T013634_A11637TaesLn = new short[1] ;
      T013634_A11641TaesLnP = new short[1] ;
      T013635_A396EmprCod = new String[] {""} ;
      T013635_A719PrdNum = new String[] {""} ;
      T013635_n719PrdNum = new boolean[] {false} ;
      T013635_A11329H_stklin = new long[1] ;
      T013636_A396EmprCod = new String[] {""} ;
      T013636_A11270Pot_num = new int[1] ;
      T013636_A11271Pot_lin = new short[1] ;
      T013637_A396EmprCod = new String[] {""} ;
      T013637_A719PrdNum = new String[] {""} ;
      T013637_n719PrdNum = new boolean[] {false} ;
      T013637_A11199PrdNcasC = new String[] {""} ;
      T013638_A396EmprCod = new String[] {""} ;
      T013638_A719PrdNum = new String[] {""} ;
      T013638_n719PrdNum = new boolean[] {false} ;
      T013638_A11197CFraseR = new String[] {""} ;
      T013639_A396EmprCod = new String[] {""} ;
      T013639_A10243Jt_codigo = new short[1] ;
      T013639_A10246Jt_ord = new short[1] ;
      T013640_A396EmprCod = new String[] {""} ;
      T013640_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T013640_A10238Bny_lin = new short[1] ;
      T013641_A396EmprCod = new String[] {""} ;
      T013641_A129BarCod = new int[1] ;
      T013641_A132BarCodReo = new byte[1] ;
      T013641_A130BarCodPar = new String[] {""} ;
      T013641_A758ProCod = new String[] {""} ;
      T013641_A194BarOrdLin = new short[1] ;
      T013641_A719PrdNum = new String[] {""} ;
      T013641_n719PrdNum = new boolean[] {false} ;
      T013642_A396EmprCod = new String[] {""} ;
      T013642_A719PrdNum = new String[] {""} ;
      T013642_n719PrdNum = new boolean[] {false} ;
      T013642_A9735Cod_Rgo = new String[] {""} ;
      T013643_A396EmprCod = new String[] {""} ;
      T013643_A719PrdNum = new String[] {""} ;
      T013643_n719PrdNum = new boolean[] {false} ;
      T013643_A9711Ct_codigo = new short[1] ;
      T013644_A396EmprCod = new String[] {""} ;
      T013644_A9652OeNum = new long[1] ;
      T013644_A9653OeHdr = new int[1] ;
      T013644_A9654OeHdrr = new byte[1] ;
      T013644_A9655OeHdrp = new String[] {""} ;
      T013644_A9656OeLinC = new byte[1] ;
      T013644_A9657OeComb = new String[] {""} ;
      T013644_A9658Oefondo = new String[] {""} ;
      T013644_A9659OeMolCil = new byte[1] ;
      T013644_A9686OePasLin = new short[1] ;
      T013644_A9694OePasPLi = new short[1] ;
      T013645_A396EmprCod = new String[] {""} ;
      T013645_A9652OeNum = new long[1] ;
      T013645_A9653OeHdr = new int[1] ;
      T013645_A9654OeHdrr = new byte[1] ;
      T013645_A9655OeHdrp = new String[] {""} ;
      T013645_A9656OeLinC = new byte[1] ;
      T013645_A9657OeComb = new String[] {""} ;
      T013645_A9658Oefondo = new String[] {""} ;
      T013645_A9659OeMolCil = new byte[1] ;
      T013645_A9677OeMolLin = new byte[1] ;
      T013646_A396EmprCod = new String[] {""} ;
      T013646_A9578Pas_Num = new int[1] ;
      T013646_A719PrdNum = new String[] {""} ;
      T013646_n719PrdNum = new boolean[] {false} ;
      T013647_A396EmprCod = new String[] {""} ;
      T013647_A719PrdNum = new String[] {""} ;
      T013647_n719PrdNum = new boolean[] {false} ;
      T013647_A8911CC_Lin = new long[1] ;
      T013648_A396EmprCod = new String[] {""} ;
      T013648_A719PrdNum = new String[] {""} ;
      T013648_n719PrdNum = new boolean[] {false} ;
      T013648_A8661Almc_Ln = new int[1] ;
      T013649_A396EmprCod = new String[] {""} ;
      T013649_A719PrdNum = new String[] {""} ;
      T013649_n719PrdNum = new boolean[] {false} ;
      T013649_A8648Mat_PrdN = new String[] {""} ;
      T013650_A396EmprCod = new String[] {""} ;
      T013650_A8585Pet_cod = new long[1] ;
      T013650_A719PrdNum = new String[] {""} ;
      T013650_n719PrdNum = new boolean[] {false} ;
      T013651_A396EmprCod = new String[] {""} ;
      T013651_A719PrdNum = new String[] {""} ;
      T013651_n719PrdNum = new boolean[] {false} ;
      T013651_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T013652_A396EmprCod = new String[] {""} ;
      T013652_A719PrdNum = new String[] {""} ;
      T013652_n719PrdNum = new boolean[] {false} ;
      T013652_A8366PrdAnyo = new short[1] ;
      T013652_A8360PrdProv = new int[1] ;
      T013653_A396EmprCod = new String[] {""} ;
      T013653_A252CliCod = new int[1] ;
      T013653_A494ForSer = new String[] {""} ;
      T013653_A482ForColNom = new String[] {""} ;
      T013653_A483ForColNum = new int[1] ;
      T013653_A831TipColCod = new byte[1] ;
      T013653_A7797Sim_lin = new short[1] ;
      T013654_A396EmprCod = new String[] {""} ;
      T013654_A7163Vir_Codigo = new int[1] ;
      T013654_A719PrdNum = new String[] {""} ;
      T013654_n719PrdNum = new boolean[] {false} ;
      T013655_A396EmprCod = new String[] {""} ;
      T013655_A6310Lb_TaAuxC = new String[] {""} ;
      T013655_A6313lb_TaAuxL = new short[1] ;
      T013655_A6378Lb_TauxLP = new short[1] ;
      T013656_A396EmprCod = new String[] {""} ;
      T013656_A6290PreCoNum = new int[1] ;
      T013656_A719PrdNum = new String[] {""} ;
      T013656_n719PrdNum = new boolean[] {false} ;
      T013657_A396EmprCod = new String[] {""} ;
      T013657_A719PrdNum = new String[] {""} ;
      T013657_n719PrdNum = new boolean[] {false} ;
      T013657_A6158PrdPrv = new int[1] ;
      T013658_A396EmprCod = new String[] {""} ;
      T013658_A719PrdNum = new String[] {""} ;
      T013658_n719PrdNum = new boolean[] {false} ;
      T013658_A5973PrdSusNum = new String[] {""} ;
      T013659_A396EmprCod = new String[] {""} ;
      T013659_A5612Lb_CodGru = new String[] {""} ;
      T013659_A5615Lb_LinGru = new short[1] ;
      T013660_A396EmprCod = new String[] {""} ;
      T013660_A5532Lb_numero = new int[1] ;
      T013660_A5555Lb_opcion = new String[] {""} ;
      T013660_A5560Lb_LineaPr = new short[1] ;
      T013661_A396EmprCod = new String[] {""} ;
      T013661_A5532Lb_numero = new int[1] ;
      T013661_A5555Lb_opcion = new String[] {""} ;
      T013661_A5557Lb_LineaC = new short[1] ;
      T013662_A396EmprCod = new String[] {""} ;
      T013662_A5145SobCod = new int[1] ;
      T013662_A719PrdNum = new String[] {""} ;
      T013662_n719PrdNum = new boolean[] {false} ;
      T013663_A396EmprCod = new String[] {""} ;
      T013663_A4744RecPreCod = new int[1] ;
      T013663_A4762RecPreLin = new short[1] ;
      T013663_A4763RecPreNli = new short[1] ;
      T013664_A396EmprCod = new String[] {""} ;
      T013664_A4492HreBarCod = new int[1] ;
      T013664_A4493HreBarReo = new byte[1] ;
      T013664_A4494HreBarPar = new String[] {""} ;
      T013664_A4495HreNumCie = new byte[1] ;
      T013664_A4545HreLinMaq = new short[1] ;
      T013664_A4550HreLinPro = new byte[1] ;
      T013664_A4557HreRecLin = new short[1] ;
      T013665_A396EmprCod = new String[] {""} ;
      T013665_A4492HreBarCod = new int[1] ;
      T013665_A4493HreBarReo = new byte[1] ;
      T013665_A4494HreBarPar = new String[] {""} ;
      T013665_A4495HreNumCie = new byte[1] ;
      T013665_A4508HreLinMAL = new short[1] ;
      T013665_A4509HreNumAny = new byte[1] ;
      T013665_A719PrdNum = new String[] {""} ;
      T013665_n719PrdNum = new boolean[] {false} ;
      T013666_A396EmprCod = new String[] {""} ;
      T013666_A252CliCod = new int[1] ;
      T013666_A4415EstCol = new String[] {""} ;
      T013666_A4416EstColLin = new short[1] ;
      T013667_A396EmprCod = new String[] {""} ;
      T013667_A129BarCod = new int[1] ;
      T013667_A132BarCodReo = new byte[1] ;
      T013667_A130BarCodPar = new String[] {""} ;
      T013667_A2524DisComLin = new byte[1] ;
      T013667_A1056DisComCod = new String[] {""} ;
      T013667_A1032FonCod = new String[] {""} ;
      T013667_A2124RecMolCod = new byte[1] ;
      T013667_A2672RecPasLin = new short[1] ;
      T013667_A2675RecPasPLi = new short[1] ;
      T013668_A396EmprCod = new String[] {""} ;
      T013668_A129BarCod = new int[1] ;
      T013668_A132BarCodReo = new byte[1] ;
      T013668_A130BarCodPar = new String[] {""} ;
      T013668_A2524DisComLin = new byte[1] ;
      T013668_A1056DisComCod = new String[] {""} ;
      T013668_A1032FonCod = new String[] {""} ;
      T013668_A2124RecMolCod = new byte[1] ;
      T013668_A2126RecMolLin = new byte[1] ;
      T013669_A396EmprCod = new String[] {""} ;
      T013669_A2107PasCod = new String[] {""} ;
      T013669_A719PrdNum = new String[] {""} ;
      T013669_n719PrdNum = new boolean[] {false} ;
      T013670_A396EmprCod = new String[] {""} ;
      T013670_A2637HisEstHRu = new int[1] ;
      T013670_A2636HisEstHRe = new byte[1] ;
      T013670_A2635HisEstHPa = new String[] {""} ;
      T013670_A2638HisEstLCo = new byte[1] ;
      T013670_A2630HisEstCom = new String[] {""} ;
      T013670_A2634HisEstFon = new String[] {""} ;
      T013670_A719PrdNum = new String[] {""} ;
      T013670_n719PrdNum = new boolean[] {false} ;
      T013671_A396EmprCod = new String[] {""} ;
      T013671_A252CliCod = new int[1] ;
      T013671_A2141SerEst = new String[] {""} ;
      T013671_A1013DibCli = new String[] {""} ;
      T013671_A1014DibInt = new int[1] ;
      T013671_A2074ColCom = new String[] {""} ;
      T013671_A2078ColFon = new String[] {""} ;
      T013671_A2098MolCod = new byte[1] ;
      T013671_A2535ForPrdLin = new short[1] ;
      T013672_A396EmprCod = new String[] {""} ;
      T013672_A719PrdNum = new String[] {""} ;
      T013672_n719PrdNum = new boolean[] {false} ;
      T013672_A3342CCStkLin = new long[1] ;
      T013673_A396EmprCod = new String[] {""} ;
      T013673_A252CliCod = new int[1] ;
      T013673_A2891HMaForSer = new String[] {""} ;
      T013673_A2892HMaForCNom = new String[] {""} ;
      T013673_A2893HMaForCNum = new int[1] ;
      T013673_A2894HMaTipCCod = new byte[1] ;
      T013673_A2895HMaForNumC = new int[1] ;
      T013673_A2897HMaColLin = new short[1] ;
      T013673_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013673_A2907HmaLin = new short[1] ;
      T013674_A396EmprCod = new String[] {""} ;
      T013674_A129BarCod = new int[1] ;
      T013674_A132BarCodReo = new byte[1] ;
      T013674_A130BarCodPar = new String[] {""} ;
      T013674_A2808RecLinMAL = new short[1] ;
      T013674_A1377RecNumAny = new byte[1] ;
      T013674_A719PrdNum = new String[] {""} ;
      T013674_n719PrdNum = new boolean[] {false} ;
      T013675_A396EmprCod = new String[] {""} ;
      T013675_A129BarCod = new int[1] ;
      T013675_A132BarCodReo = new byte[1] ;
      T013675_A130BarCodPar = new String[] {""} ;
      T013675_A2804RecLinMaq = new short[1] ;
      T013675_A1273RecLinPro = new byte[1] ;
      T013675_A811RecLin = new short[1] ;
      T013676_A396EmprCod = new String[] {""} ;
      T013676_A129BarCod = new int[1] ;
      T013676_A132BarCodReo = new byte[1] ;
      T013676_A130BarCodPar = new String[] {""} ;
      T013676_A2494BarDosPro = new String[] {""} ;
      T013676_A719PrdNum = new String[] {""} ;
      T013676_n719PrdNum = new boolean[] {false} ;
      T013677_A396EmprCod = new String[] {""} ;
      T013677_A1314EnsLabCod = new int[1] ;
      T013677_A1317EnsLabLin = new short[1] ;
      T013678_A396EmprCod = new String[] {""} ;
      T013678_A910Workstat = new String[] {""} ;
      T013678_A887EscMLin = new int[1] ;
      T013679_A396EmprCod = new String[] {""} ;
      T013679_A859CumCodCont = new int[1] ;
      T013679_A719PrdNum = new String[] {""} ;
      T013679_n719PrdNum = new boolean[] {false} ;
      T013680_A396EmprCod = new String[] {""} ;
      T013680_A719PrdNum = new String[] {""} ;
      T013680_n719PrdNum = new boolean[] {false} ;
      T013680_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013681_A396EmprCod = new String[] {""} ;
      T013681_A486ForNumCol = new int[1] ;
      T013681_A715PrdLin = new short[1] ;
      T013682_A396EmprCod = new String[] {""} ;
      T013682_A719PrdNum = new String[] {""} ;
      T013682_n719PrdNum = new boolean[] {false} ;
      T013682_A681PrdAny = new short[1] ;
      T013683_A396EmprCod = new String[] {""} ;
      T013683_A719PrdNum = new String[] {""} ;
      T013683_n719PrdNum = new boolean[] {false} ;
      T013683_A688PrdComCod = new String[] {""} ;
      T013684_A396EmprCod = new String[] {""} ;
      T013684_A719PrdNum = new String[] {""} ;
      T013684_n719PrdNum = new boolean[] {false} ;
      T013684_A680PrdAltNum = new String[] {""} ;
      T013685_A396EmprCod = new String[] {""} ;
      T013685_A658PedCod = new int[1] ;
      T013685_A719PrdNum = new String[] {""} ;
      T013685_n719PrdNum = new boolean[] {false} ;
      T013686_A396EmprCod = new String[] {""} ;
      T013686_A486ForNumCol = new int[1] ;
      T013686_A309ColLin = new short[1] ;
      T013687_A396EmprCod = new String[] {""} ;
      T013687_A719PrdNum = new String[] {""} ;
      T013687_n719PrdNum = new boolean[] {false} ;
      T013687_A647NumCon = new int[1] ;
      T013688_A396EmprCod = new String[] {""} ;
      T013688_A719PrdNum = new String[] {""} ;
      T013688_n719PrdNum = new boolean[] {false} ;
      Z8909CC_AlmDsc = "" ;
      T013689_A719PrdNum = new String[] {""} ;
      T013689_n719PrdNum = new boolean[] {false} ;
      T013689_A8909CC_AlmDsc = new String[] {""} ;
      T013689_n8909CC_AlmDsc = new boolean[] {false} ;
      T013689_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013689_n8918CC_ExisCC = new boolean[] {false} ;
      T013689_A396EmprCod = new String[] {""} ;
      T013689_A8908CC_AlmCod = new byte[1] ;
      T013689_n8908CC_AlmCod = new boolean[] {false} ;
      T01364_A8909CC_AlmDsc = new String[] {""} ;
      T01364_n8909CC_AlmDsc = new boolean[] {false} ;
      T013690_A8909CC_AlmDsc = new String[] {""} ;
      T013690_n8909CC_AlmDsc = new boolean[] {false} ;
      T013691_A396EmprCod = new String[] {""} ;
      T013691_A719PrdNum = new String[] {""} ;
      T013691_n719PrdNum = new boolean[] {false} ;
      T013691_A8908CC_AlmCod = new byte[1] ;
      T013691_n8908CC_AlmCod = new boolean[] {false} ;
      T01363_A719PrdNum = new String[] {""} ;
      T01363_n719PrdNum = new boolean[] {false} ;
      T01363_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01363_n8918CC_ExisCC = new boolean[] {false} ;
      T01363_A396EmprCod = new String[] {""} ;
      T01363_A8908CC_AlmCod = new byte[1] ;
      T01363_n8908CC_AlmCod = new boolean[] {false} ;
      T01362_A719PrdNum = new String[] {""} ;
      T01362_n719PrdNum = new boolean[] {false} ;
      T01362_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01362_n8918CC_ExisCC = new boolean[] {false} ;
      T01362_A396EmprCod = new String[] {""} ;
      T01362_A8908CC_AlmCod = new byte[1] ;
      T01362_n8908CC_AlmCod = new boolean[] {false} ;
      T013695_A8909CC_AlmDsc = new String[] {""} ;
      T013695_n8909CC_AlmDsc = new boolean[] {false} ;
      T013696_A396EmprCod = new String[] {""} ;
      T013696_A719PrdNum = new String[] {""} ;
      T013696_n719PrdNum = new boolean[] {false} ;
      T013696_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T013696_A8908CC_AlmCod = new byte[1] ;
      T013696_n8908CC_AlmCod = new boolean[] {false} ;
      T013697_A396EmprCod = new String[] {""} ;
      T013697_A719PrdNum = new String[] {""} ;
      T013697_n719PrdNum = new boolean[] {false} ;
      T013697_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013697_A8908CC_AlmCod = new byte[1] ;
      T013697_n8908CC_AlmCod = new boolean[] {false} ;
      T013698_A396EmprCod = new String[] {""} ;
      T013698_A719PrdNum = new String[] {""} ;
      T013698_n719PrdNum = new boolean[] {false} ;
      T013698_A8911CC_Lin = new long[1] ;
      T013699_A396EmprCod = new String[] {""} ;
      T013699_A719PrdNum = new String[] {""} ;
      T013699_n719PrdNum = new boolean[] {false} ;
      T013699_A8908CC_AlmCod = new byte[1] ;
      T013699_n8908CC_AlmCod = new boolean[] {false} ;
      Gridtprdalm_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtprdalm_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtprdalm_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T0136100_A407EmprNom = new String[] {""} ;
      T0136100_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ407EmprNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprdalm__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprdalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprdalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprdalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdalm__default(),
         new Object[] {
             new Object[] {
            T01362_A719PrdNum, T01362_A8918CC_ExisCC, T01362_n8918CC_ExisCC, T01362_A396EmprCod, T01362_A8908CC_AlmCod
            }
            , new Object[] {
            T01363_A719PrdNum, T01363_A8918CC_ExisCC, T01363_n8918CC_ExisCC, T01363_A396EmprCod, T01363_A8908CC_AlmCod
            }
            , new Object[] {
            T01364_A8909CC_AlmDsc, T01364_n8909CC_AlmDsc
            }
            , new Object[] {
            T01365_A719PrdNum, T01365_A718PrdNom, T01365_A705PrdExiCC, T01365_A396EmprCod
            }
            , new Object[] {
            T01366_A719PrdNum, T01366_A718PrdNom, T01366_A705PrdExiCC, T01366_A396EmprCod
            }
            , new Object[] {
            T01367_A407EmprNom, T01367_n407EmprNom
            }
            , new Object[] {
            T01368_A719PrdNum, T01368_A407EmprNom, T01368_n407EmprNom, T01368_A718PrdNom, T01368_A705PrdExiCC, T01368_A396EmprCod
            }
            , new Object[] {
            T01369_A396EmprCod, T01369_A719PrdNum
            }
            , new Object[] {
            T013610_A396EmprCod, T013610_A719PrdNum
            }
            , new Object[] {
            T013611_A396EmprCod, T013611_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013615_A396EmprCod, T013615_A719PrdNum, T013615_A13217NormaID
            }
            , new Object[] {
            T013616_A396EmprCod, T013616_A719PrdNum, T013616_A13586TheList
            }
            , new Object[] {
            T013617_A396EmprCod, T013617_A5532Lb_numero, T013617_A5555Lb_opcion, T013617_A13460Lb_linCP, T013617_A13458Lb_TipCP
            }
            , new Object[] {
            T013618_A396EmprCod, T013618_A13418AlbProID, T013618_A13442AlbProLine
            }
            , new Object[] {
            T013619_A396EmprCod, T013619_A13324LDESID, T013619_A13333LDESNPeque, T013619_A13337LDESComb, T013619_A13339LDESFondo, T013619_A13342LDESLinea
            }
            , new Object[] {
            T013620_A396EmprCod, T013620_A13312Lb_NLab, T013620_A13305Lb_IDVeces, T013620_A13306Lb_LinID
            }
            , new Object[] {
            T013621_A396EmprCod, T013621_A12673LavMqId, T013621_A12692LavMqLnPq, T013621_A12681LavMqLn
            }
            , new Object[] {
            T013622_A396EmprCod, T013622_A719PrdNum, T013622_A9713Tb1_Cod
            }
            , new Object[] {
            T013623_A396EmprCod, T013623_A12236PrdNumD, T013623_A719PrdNum
            }
            , new Object[] {
            T013624_A396EmprCod, T013624_A12225DocDisID, T013624_A12226LinDisID
            }
            , new Object[] {
            T013625_A396EmprCod, T013625_A12225DocDisID
            }
            , new Object[] {
            T013626_A396EmprCod, T013626_A12205OrdenCID, T013626_A12206OrdenCLnId
            }
            , new Object[] {
            T013627_A396EmprCod, T013627_A719PrdNum, T013627_A11664LoteID, T013627_A11665LoteFec
            }
            , new Object[] {
            T013628_A396EmprCod, T013628_A4850DevComCod, T013628_A719PrdNum
            }
            , new Object[] {
            T013629_A396EmprCod, T013629_A252CliCod, T013629_A494ForSer, T013629_A482ForColNom, T013629_A483ForColNum, T013629_A831TipColCod, T013629_A3571EnsCod, T013629_A3582EnsLin
            }
            , new Object[] {
            T013630_A396EmprCod, T013630_A129BarCod, T013630_A132BarCodReo, T013630_A130BarCodPar, T013630_A4075recestncol, T013630_A4076recestnpro, T013630_A4108recestlin
            }
            , new Object[] {
            T013631_A396EmprCod, T013631_A4052EstNumFor, T013631_A4053EstNumCol, T013631_A4090EstEspLin
            }
            , new Object[] {
            T013632_A396EmprCod, T013632_A4052EstNumFor, T013632_A4053EstNumCol, T013632_A4084EstProLin
            }
            , new Object[] {
            T013633_A396EmprCod, T013633_A11644TransferId, T013633_A11653TransferLn
            }
            , new Object[] {
            T013634_A396EmprCod, T013634_A11634TaesId, T013634_A11637TaesLn, T013634_A11641TaesLnP
            }
            , new Object[] {
            T013635_A396EmprCod, T013635_A719PrdNum, T013635_A11329H_stklin
            }
            , new Object[] {
            T013636_A396EmprCod, T013636_A11270Pot_num, T013636_A11271Pot_lin
            }
            , new Object[] {
            T013637_A396EmprCod, T013637_A719PrdNum, T013637_A11199PrdNcasC
            }
            , new Object[] {
            T013638_A396EmprCod, T013638_A719PrdNum, T013638_A11197CFraseR
            }
            , new Object[] {
            T013639_A396EmprCod, T013639_A10243Jt_codigo, T013639_A10246Jt_ord
            }
            , new Object[] {
            T013640_A396EmprCod, T013640_A10236Bny_dia, T013640_A10238Bny_lin
            }
            , new Object[] {
            T013641_A396EmprCod, T013641_A129BarCod, T013641_A132BarCodReo, T013641_A130BarCodPar, T013641_A758ProCod, T013641_A194BarOrdLin, T013641_A719PrdNum
            }
            , new Object[] {
            T013642_A396EmprCod, T013642_A719PrdNum, T013642_A9735Cod_Rgo
            }
            , new Object[] {
            T013643_A396EmprCod, T013643_A719PrdNum, T013643_A9711Ct_codigo
            }
            , new Object[] {
            T013644_A396EmprCod, T013644_A9652OeNum, T013644_A9653OeHdr, T013644_A9654OeHdrr, T013644_A9655OeHdrp, T013644_A9656OeLinC, T013644_A9657OeComb, T013644_A9658Oefondo, T013644_A9659OeMolCil, T013644_A9686OePasLin,
            T013644_A9694OePasPLi
            }
            , new Object[] {
            T013645_A396EmprCod, T013645_A9652OeNum, T013645_A9653OeHdr, T013645_A9654OeHdrr, T013645_A9655OeHdrp, T013645_A9656OeLinC, T013645_A9657OeComb, T013645_A9658Oefondo, T013645_A9659OeMolCil, T013645_A9677OeMolLin
            }
            , new Object[] {
            T013646_A396EmprCod, T013646_A9578Pas_Num, T013646_A719PrdNum
            }
            , new Object[] {
            T013647_A396EmprCod, T013647_A719PrdNum, T013647_A8911CC_Lin
            }
            , new Object[] {
            T013648_A396EmprCod, T013648_A719PrdNum, T013648_A8661Almc_Ln
            }
            , new Object[] {
            T013649_A396EmprCod, T013649_A719PrdNum, T013649_A8648Mat_PrdN
            }
            , new Object[] {
            T013650_A396EmprCod, T013650_A8585Pet_cod, T013650_A719PrdNum
            }
            , new Object[] {
            T013651_A396EmprCod, T013651_A719PrdNum, T013651_A8577RecFecHr
            }
            , new Object[] {
            T013652_A396EmprCod, T013652_A719PrdNum, T013652_A8366PrdAnyo, T013652_A8360PrdProv
            }
            , new Object[] {
            T013653_A396EmprCod, T013653_A252CliCod, T013653_A494ForSer, T013653_A482ForColNom, T013653_A483ForColNum, T013653_A831TipColCod, T013653_A7797Sim_lin
            }
            , new Object[] {
            T013654_A396EmprCod, T013654_A7163Vir_Codigo, T013654_A719PrdNum
            }
            , new Object[] {
            T013655_A396EmprCod, T013655_A6310Lb_TaAuxC, T013655_A6313lb_TaAuxL, T013655_A6378Lb_TauxLP
            }
            , new Object[] {
            T013656_A396EmprCod, T013656_A6290PreCoNum, T013656_A719PrdNum
            }
            , new Object[] {
            T013657_A396EmprCod, T013657_A719PrdNum, T013657_A6158PrdPrv
            }
            , new Object[] {
            T013658_A396EmprCod, T013658_A719PrdNum, T013658_A5973PrdSusNum
            }
            , new Object[] {
            T013659_A396EmprCod, T013659_A5612Lb_CodGru, T013659_A5615Lb_LinGru
            }
            , new Object[] {
            T013660_A396EmprCod, T013660_A5532Lb_numero, T013660_A5555Lb_opcion, T013660_A5560Lb_LineaPr
            }
            , new Object[] {
            T013661_A396EmprCod, T013661_A5532Lb_numero, T013661_A5555Lb_opcion, T013661_A5557Lb_LineaC
            }
            , new Object[] {
            T013662_A396EmprCod, T013662_A5145SobCod, T013662_A719PrdNum
            }
            , new Object[] {
            T013663_A396EmprCod, T013663_A4744RecPreCod, T013663_A4762RecPreLin, T013663_A4763RecPreNli
            }
            , new Object[] {
            T013664_A396EmprCod, T013664_A4492HreBarCod, T013664_A4493HreBarReo, T013664_A4494HreBarPar, T013664_A4495HreNumCie, T013664_A4545HreLinMaq, T013664_A4550HreLinPro, T013664_A4557HreRecLin
            }
            , new Object[] {
            T013665_A396EmprCod, T013665_A4492HreBarCod, T013665_A4493HreBarReo, T013665_A4494HreBarPar, T013665_A4495HreNumCie, T013665_A4508HreLinMAL, T013665_A4509HreNumAny, T013665_A719PrdNum
            }
            , new Object[] {
            T013666_A396EmprCod, T013666_A252CliCod, T013666_A4415EstCol, T013666_A4416EstColLin
            }
            , new Object[] {
            T013667_A396EmprCod, T013667_A129BarCod, T013667_A132BarCodReo, T013667_A130BarCodPar, T013667_A2524DisComLin, T013667_A1056DisComCod, T013667_A1032FonCod, T013667_A2124RecMolCod, T013667_A2672RecPasLin, T013667_A2675RecPasPLi
            }
            , new Object[] {
            T013668_A396EmprCod, T013668_A129BarCod, T013668_A132BarCodReo, T013668_A130BarCodPar, T013668_A2524DisComLin, T013668_A1056DisComCod, T013668_A1032FonCod, T013668_A2124RecMolCod, T013668_A2126RecMolLin
            }
            , new Object[] {
            T013669_A396EmprCod, T013669_A2107PasCod, T013669_A719PrdNum
            }
            , new Object[] {
            T013670_A396EmprCod, T013670_A2637HisEstHRu, T013670_A2636HisEstHRe, T013670_A2635HisEstHPa, T013670_A2638HisEstLCo, T013670_A2630HisEstCom, T013670_A2634HisEstFon, T013670_A719PrdNum
            }
            , new Object[] {
            T013671_A396EmprCod, T013671_A252CliCod, T013671_A2141SerEst, T013671_A1013DibCli, T013671_A1014DibInt, T013671_A2074ColCom, T013671_A2078ColFon, T013671_A2098MolCod, T013671_A2535ForPrdLin
            }
            , new Object[] {
            T013672_A396EmprCod, T013672_A719PrdNum, T013672_A3342CCStkLin
            }
            , new Object[] {
            T013673_A396EmprCod, T013673_A252CliCod, T013673_A2891HMaForSer, T013673_A2892HMaForCNom, T013673_A2893HMaForCNum, T013673_A2894HMaTipCCod, T013673_A2895HMaForNumC, T013673_A2897HMaColLin, T013673_A2896HMaFec, T013673_A2907HmaLin
            }
            , new Object[] {
            T013674_A396EmprCod, T013674_A129BarCod, T013674_A132BarCodReo, T013674_A130BarCodPar, T013674_A2808RecLinMAL, T013674_A1377RecNumAny, T013674_A719PrdNum
            }
            , new Object[] {
            T013675_A396EmprCod, T013675_A129BarCod, T013675_A132BarCodReo, T013675_A130BarCodPar, T013675_A2804RecLinMaq, T013675_A1273RecLinPro, T013675_A811RecLin
            }
            , new Object[] {
            T013676_A396EmprCod, T013676_A129BarCod, T013676_A132BarCodReo, T013676_A130BarCodPar, T013676_A2494BarDosPro, T013676_A719PrdNum
            }
            , new Object[] {
            T013677_A396EmprCod, T013677_A1314EnsLabCod, T013677_A1317EnsLabLin
            }
            , new Object[] {
            T013678_A396EmprCod, T013678_A910Workstat, T013678_A887EscMLin
            }
            , new Object[] {
            T013679_A396EmprCod, T013679_A859CumCodCont, T013679_A719PrdNum
            }
            , new Object[] {
            T013680_A396EmprCod, T013680_A719PrdNum, T013680_A810RecFec
            }
            , new Object[] {
            T013681_A396EmprCod, T013681_A486ForNumCol, T013681_A715PrdLin
            }
            , new Object[] {
            T013682_A396EmprCod, T013682_A719PrdNum, T013682_A681PrdAny
            }
            , new Object[] {
            T013683_A396EmprCod, T013683_A719PrdNum, T013683_A688PrdComCod
            }
            , new Object[] {
            T013684_A396EmprCod, T013684_A719PrdNum, T013684_A680PrdAltNum
            }
            , new Object[] {
            T013685_A396EmprCod, T013685_A658PedCod, T013685_A719PrdNum
            }
            , new Object[] {
            T013686_A396EmprCod, T013686_A486ForNumCol, T013686_A309ColLin
            }
            , new Object[] {
            T013687_A396EmprCod, T013687_A719PrdNum, T013687_A647NumCon
            }
            , new Object[] {
            T013688_A396EmprCod, T013688_A719PrdNum
            }
            , new Object[] {
            T013689_A719PrdNum, T013689_A8909CC_AlmDsc, T013689_n8909CC_AlmDsc, T013689_A8918CC_ExisCC, T013689_n8918CC_ExisCC, T013689_A396EmprCod, T013689_A8908CC_AlmCod
            }
            , new Object[] {
            T013690_A8909CC_AlmDsc, T013690_n8909CC_AlmDsc
            }
            , new Object[] {
            T013691_A396EmprCod, T013691_A719PrdNum, T013691_A8908CC_AlmCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013695_A8909CC_AlmDsc, T013695_n8909CC_AlmDsc
            }
            , new Object[] {
            T013696_A396EmprCod, T013696_A719PrdNum, T013696_A8577RecFecHr, T013696_A8908CC_AlmCod
            }
            , new Object[] {
            T013697_A396EmprCod, T013697_A719PrdNum, T013697_A810RecFec, T013697_A8908CC_AlmCod
            }
            , new Object[] {
            T013698_A396EmprCod, T013698_A719PrdNum, T013698_A8911CC_Lin
            }
            , new Object[] {
            T013699_A396EmprCod, T013699_A719PrdNum, T013699_A8908CC_AlmCod
            }
            , new Object[] {
            T0136100_A407EmprNom, T0136100_n407EmprNom
            }
         }
      );
      Z719PrdNum = "" ;
      n719PrdNum = false ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TPRDALM" ;
   }

   private byte Z8908CC_AlmCod ;
   private byte GxWebError ;
   private byte A8908CC_AlmCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtprdalm_level1item_Backcolorstyle ;
   private byte subGridtprdalm_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtprdalm_level1item_Allowselection ;
   private byte subGridtprdalm_level1item_Allowhovering ;
   private byte subGridtprdalm_level1item_Allowcollapsing ;
   private byte subGridtprdalm_level1item_Collapsed ;
   private short nRcdDeleted_1211 ;
   private short nRcdExists_1211 ;
   private short nIsMod_1211 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1211 ;
   private short RcdFound1211 ;
   private short nBlankRcdUsr1211 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1211 ;
   private int nRC_GXsfl_63 ;
   private int nGXsfl_63_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtCC_AlmCod_Enabled ;
   private int edtCC_AlmDsc_Enabled ;
   private int edtCC_ExisCC_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtprdalm_level1item_Backcolor ;
   private int subGridtprdalm_level1item_Allbackcolor ;
   private int defedtCC_ExisCC_Enabled ;
   private int defedtCC_AlmCod_Enabled ;
   private int idxLst ;
   private int subGridtprdalm_level1item_Selectedindex ;
   private int subGridtprdalm_level1item_Selectioncolor ;
   private int subGridtprdalm_level1item_Hoveringcolor ;
   private long GRIDTPRDALM_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z8918CC_ExisCC ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNom_Internalname ;
   private String sGXsfl_63_idx="0001" ;
   private String Gx_mode ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1211 ;
   private String edtCC_AlmCod_Internalname ;
   private String edtCC_AlmDsc_Internalname ;
   private String edtCC_ExisCC_Internalname ;
   private String sStyleString ;
   private String subGridtprdalm_level1item_Internalname ;
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A8909CC_AlmDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode29 ;
   private String Z8909CC_AlmDsc ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String subGridtprdalm_level1item_Class ;
   private String subGridtprdalm_level1item_Linesclass ;
   private String ROClassString ;
   private String edtCC_AlmCod_Jsonclick ;
   private String edtCC_AlmDsc_Jsonclick ;
   private String edtCC_ExisCC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtprdalm_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ407EmprNom ;
   private String ZZ718PrdNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8908CC_AlmCod ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n8909CC_AlmDsc ;
   private boolean n8918CC_ExisCC ;
   private com.genexus.webpanels.GXWebGrid Gridtprdalm_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtprdalm_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtprdalm_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01367_A407EmprNom ;
   private boolean[] T01367_n407EmprNom ;
   private String[] T01368_A719PrdNum ;
   private boolean[] T01368_n719PrdNum ;
   private String[] T01368_A407EmprNom ;
   private boolean[] T01368_n407EmprNom ;
   private String[] T01368_A718PrdNom ;
   private java.math.BigDecimal[] T01368_A705PrdExiCC ;
   private String[] T01368_A396EmprCod ;
   private String[] T01369_A396EmprCod ;
   private String[] T01369_A719PrdNum ;
   private boolean[] T01369_n719PrdNum ;
   private String[] T01366_A719PrdNum ;
   private boolean[] T01366_n719PrdNum ;
   private String[] T01366_A718PrdNom ;
   private java.math.BigDecimal[] T01366_A705PrdExiCC ;
   private String[] T01366_A396EmprCod ;
   private String[] T013610_A396EmprCod ;
   private String[] T013610_A719PrdNum ;
   private boolean[] T013610_n719PrdNum ;
   private String[] T013611_A396EmprCod ;
   private String[] T013611_A719PrdNum ;
   private boolean[] T013611_n719PrdNum ;
   private String[] T01365_A719PrdNum ;
   private boolean[] T01365_n719PrdNum ;
   private String[] T01365_A718PrdNom ;
   private java.math.BigDecimal[] T01365_A705PrdExiCC ;
   private String[] T01365_A396EmprCod ;
   private String[] T013615_A396EmprCod ;
   private String[] T013615_A719PrdNum ;
   private boolean[] T013615_n719PrdNum ;
   private String[] T013615_A13217NormaID ;
   private String[] T013616_A396EmprCod ;
   private String[] T013616_A719PrdNum ;
   private boolean[] T013616_n719PrdNum ;
   private String[] T013616_A13586TheList ;
   private String[] T013617_A396EmprCod ;
   private int[] T013617_A5532Lb_numero ;
   private String[] T013617_A5555Lb_opcion ;
   private short[] T013617_A13460Lb_linCP ;
   private String[] T013617_A13458Lb_TipCP ;
   private String[] T013618_A396EmprCod ;
   private int[] T013618_A13418AlbProID ;
   private short[] T013618_A13442AlbProLine ;
   private String[] T013619_A396EmprCod ;
   private int[] T013619_A13324LDESID ;
   private String[] T013619_A13333LDESNPeque ;
   private String[] T013619_A13337LDESComb ;
   private String[] T013619_A13339LDESFondo ;
   private short[] T013619_A13342LDESLinea ;
   private String[] T013620_A396EmprCod ;
   private int[] T013620_A13312Lb_NLab ;
   private short[] T013620_A13305Lb_IDVeces ;
   private short[] T013620_A13306Lb_LinID ;
   private String[] T013621_A396EmprCod ;
   private int[] T013621_A12673LavMqId ;
   private short[] T013621_A12692LavMqLnPq ;
   private short[] T013621_A12681LavMqLn ;
   private String[] T013622_A396EmprCod ;
   private String[] T013622_A719PrdNum ;
   private boolean[] T013622_n719PrdNum ;
   private short[] T013622_A9713Tb1_Cod ;
   private String[] T013623_A396EmprCod ;
   private String[] T013623_A12236PrdNumD ;
   private String[] T013623_A719PrdNum ;
   private boolean[] T013623_n719PrdNum ;
   private String[] T013624_A396EmprCod ;
   private long[] T013624_A12225DocDisID ;
   private short[] T013624_A12226LinDisID ;
   private String[] T013625_A396EmprCod ;
   private long[] T013625_A12225DocDisID ;
   private String[] T013626_A396EmprCod ;
   private long[] T013626_A12205OrdenCID ;
   private short[] T013626_A12206OrdenCLnId ;
   private String[] T013627_A396EmprCod ;
   private String[] T013627_A719PrdNum ;
   private boolean[] T013627_n719PrdNum ;
   private String[] T013627_A11664LoteID ;
   private java.util.Date[] T013627_A11665LoteFec ;
   private String[] T013628_A396EmprCod ;
   private int[] T013628_A4850DevComCod ;
   private String[] T013628_A719PrdNum ;
   private boolean[] T013628_n719PrdNum ;
   private String[] T013629_A396EmprCod ;
   private int[] T013629_A252CliCod ;
   private String[] T013629_A494ForSer ;
   private String[] T013629_A482ForColNom ;
   private int[] T013629_A483ForColNum ;
   private byte[] T013629_A831TipColCod ;
   private String[] T013629_A3571EnsCod ;
   private short[] T013629_A3582EnsLin ;
   private String[] T013630_A396EmprCod ;
   private int[] T013630_A129BarCod ;
   private byte[] T013630_A132BarCodReo ;
   private String[] T013630_A130BarCodPar ;
   private byte[] T013630_A4075recestncol ;
   private byte[] T013630_A4076recestnpro ;
   private short[] T013630_A4108recestlin ;
   private String[] T013631_A396EmprCod ;
   private int[] T013631_A4052EstNumFor ;
   private byte[] T013631_A4053EstNumCol ;
   private byte[] T013631_A4090EstEspLin ;
   private String[] T013632_A396EmprCod ;
   private int[] T013632_A4052EstNumFor ;
   private byte[] T013632_A4053EstNumCol ;
   private byte[] T013632_A4084EstProLin ;
   private String[] T013633_A396EmprCod ;
   private long[] T013633_A11644TransferId ;
   private int[] T013633_A11653TransferLn ;
   private String[] T013634_A396EmprCod ;
   private String[] T013634_A11634TaesId ;
   private short[] T013634_A11637TaesLn ;
   private short[] T013634_A11641TaesLnP ;
   private String[] T013635_A396EmprCod ;
   private String[] T013635_A719PrdNum ;
   private boolean[] T013635_n719PrdNum ;
   private long[] T013635_A11329H_stklin ;
   private String[] T013636_A396EmprCod ;
   private int[] T013636_A11270Pot_num ;
   private short[] T013636_A11271Pot_lin ;
   private String[] T013637_A396EmprCod ;
   private String[] T013637_A719PrdNum ;
   private boolean[] T013637_n719PrdNum ;
   private String[] T013637_A11199PrdNcasC ;
   private String[] T013638_A396EmprCod ;
   private String[] T013638_A719PrdNum ;
   private boolean[] T013638_n719PrdNum ;
   private String[] T013638_A11197CFraseR ;
   private String[] T013639_A396EmprCod ;
   private short[] T013639_A10243Jt_codigo ;
   private short[] T013639_A10246Jt_ord ;
   private String[] T013640_A396EmprCod ;
   private java.util.Date[] T013640_A10236Bny_dia ;
   private short[] T013640_A10238Bny_lin ;
   private String[] T013641_A396EmprCod ;
   private int[] T013641_A129BarCod ;
   private byte[] T013641_A132BarCodReo ;
   private String[] T013641_A130BarCodPar ;
   private String[] T013641_A758ProCod ;
   private short[] T013641_A194BarOrdLin ;
   private String[] T013641_A719PrdNum ;
   private boolean[] T013641_n719PrdNum ;
   private String[] T013642_A396EmprCod ;
   private String[] T013642_A719PrdNum ;
   private boolean[] T013642_n719PrdNum ;
   private String[] T013642_A9735Cod_Rgo ;
   private String[] T013643_A396EmprCod ;
   private String[] T013643_A719PrdNum ;
   private boolean[] T013643_n719PrdNum ;
   private short[] T013643_A9711Ct_codigo ;
   private String[] T013644_A396EmprCod ;
   private long[] T013644_A9652OeNum ;
   private int[] T013644_A9653OeHdr ;
   private byte[] T013644_A9654OeHdrr ;
   private String[] T013644_A9655OeHdrp ;
   private byte[] T013644_A9656OeLinC ;
   private String[] T013644_A9657OeComb ;
   private String[] T013644_A9658Oefondo ;
   private byte[] T013644_A9659OeMolCil ;
   private short[] T013644_A9686OePasLin ;
   private short[] T013644_A9694OePasPLi ;
   private String[] T013645_A396EmprCod ;
   private long[] T013645_A9652OeNum ;
   private int[] T013645_A9653OeHdr ;
   private byte[] T013645_A9654OeHdrr ;
   private String[] T013645_A9655OeHdrp ;
   private byte[] T013645_A9656OeLinC ;
   private String[] T013645_A9657OeComb ;
   private String[] T013645_A9658Oefondo ;
   private byte[] T013645_A9659OeMolCil ;
   private byte[] T013645_A9677OeMolLin ;
   private String[] T013646_A396EmprCod ;
   private int[] T013646_A9578Pas_Num ;
   private String[] T013646_A719PrdNum ;
   private boolean[] T013646_n719PrdNum ;
   private String[] T013647_A396EmprCod ;
   private String[] T013647_A719PrdNum ;
   private boolean[] T013647_n719PrdNum ;
   private long[] T013647_A8911CC_Lin ;
   private String[] T013648_A396EmprCod ;
   private String[] T013648_A719PrdNum ;
   private boolean[] T013648_n719PrdNum ;
   private int[] T013648_A8661Almc_Ln ;
   private String[] T013649_A396EmprCod ;
   private String[] T013649_A719PrdNum ;
   private boolean[] T013649_n719PrdNum ;
   private String[] T013649_A8648Mat_PrdN ;
   private String[] T013650_A396EmprCod ;
   private long[] T013650_A8585Pet_cod ;
   private String[] T013650_A719PrdNum ;
   private boolean[] T013650_n719PrdNum ;
   private String[] T013651_A396EmprCod ;
   private String[] T013651_A719PrdNum ;
   private boolean[] T013651_n719PrdNum ;
   private java.util.Date[] T013651_A8577RecFecHr ;
   private String[] T013652_A396EmprCod ;
   private String[] T013652_A719PrdNum ;
   private boolean[] T013652_n719PrdNum ;
   private short[] T013652_A8366PrdAnyo ;
   private int[] T013652_A8360PrdProv ;
   private String[] T013653_A396EmprCod ;
   private int[] T013653_A252CliCod ;
   private String[] T013653_A494ForSer ;
   private String[] T013653_A482ForColNom ;
   private int[] T013653_A483ForColNum ;
   private byte[] T013653_A831TipColCod ;
   private short[] T013653_A7797Sim_lin ;
   private String[] T013654_A396EmprCod ;
   private int[] T013654_A7163Vir_Codigo ;
   private String[] T013654_A719PrdNum ;
   private boolean[] T013654_n719PrdNum ;
   private String[] T013655_A396EmprCod ;
   private String[] T013655_A6310Lb_TaAuxC ;
   private short[] T013655_A6313lb_TaAuxL ;
   private short[] T013655_A6378Lb_TauxLP ;
   private String[] T013656_A396EmprCod ;
   private int[] T013656_A6290PreCoNum ;
   private String[] T013656_A719PrdNum ;
   private boolean[] T013656_n719PrdNum ;
   private String[] T013657_A396EmprCod ;
   private String[] T013657_A719PrdNum ;
   private boolean[] T013657_n719PrdNum ;
   private int[] T013657_A6158PrdPrv ;
   private String[] T013658_A396EmprCod ;
   private String[] T013658_A719PrdNum ;
   private boolean[] T013658_n719PrdNum ;
   private String[] T013658_A5973PrdSusNum ;
   private String[] T013659_A396EmprCod ;
   private String[] T013659_A5612Lb_CodGru ;
   private short[] T013659_A5615Lb_LinGru ;
   private String[] T013660_A396EmprCod ;
   private int[] T013660_A5532Lb_numero ;
   private String[] T013660_A5555Lb_opcion ;
   private short[] T013660_A5560Lb_LineaPr ;
   private String[] T013661_A396EmprCod ;
   private int[] T013661_A5532Lb_numero ;
   private String[] T013661_A5555Lb_opcion ;
   private short[] T013661_A5557Lb_LineaC ;
   private String[] T013662_A396EmprCod ;
   private int[] T013662_A5145SobCod ;
   private String[] T013662_A719PrdNum ;
   private boolean[] T013662_n719PrdNum ;
   private String[] T013663_A396EmprCod ;
   private int[] T013663_A4744RecPreCod ;
   private short[] T013663_A4762RecPreLin ;
   private short[] T013663_A4763RecPreNli ;
   private String[] T013664_A396EmprCod ;
   private int[] T013664_A4492HreBarCod ;
   private byte[] T013664_A4493HreBarReo ;
   private String[] T013664_A4494HreBarPar ;
   private byte[] T013664_A4495HreNumCie ;
   private short[] T013664_A4545HreLinMaq ;
   private byte[] T013664_A4550HreLinPro ;
   private short[] T013664_A4557HreRecLin ;
   private String[] T013665_A396EmprCod ;
   private int[] T013665_A4492HreBarCod ;
   private byte[] T013665_A4493HreBarReo ;
   private String[] T013665_A4494HreBarPar ;
   private byte[] T013665_A4495HreNumCie ;
   private short[] T013665_A4508HreLinMAL ;
   private byte[] T013665_A4509HreNumAny ;
   private String[] T013665_A719PrdNum ;
   private boolean[] T013665_n719PrdNum ;
   private String[] T013666_A396EmprCod ;
   private int[] T013666_A252CliCod ;
   private String[] T013666_A4415EstCol ;
   private short[] T013666_A4416EstColLin ;
   private String[] T013667_A396EmprCod ;
   private int[] T013667_A129BarCod ;
   private byte[] T013667_A132BarCodReo ;
   private String[] T013667_A130BarCodPar ;
   private byte[] T013667_A2524DisComLin ;
   private String[] T013667_A1056DisComCod ;
   private String[] T013667_A1032FonCod ;
   private byte[] T013667_A2124RecMolCod ;
   private short[] T013667_A2672RecPasLin ;
   private short[] T013667_A2675RecPasPLi ;
   private String[] T013668_A396EmprCod ;
   private int[] T013668_A129BarCod ;
   private byte[] T013668_A132BarCodReo ;
   private String[] T013668_A130BarCodPar ;
   private byte[] T013668_A2524DisComLin ;
   private String[] T013668_A1056DisComCod ;
   private String[] T013668_A1032FonCod ;
   private byte[] T013668_A2124RecMolCod ;
   private byte[] T013668_A2126RecMolLin ;
   private String[] T013669_A396EmprCod ;
   private String[] T013669_A2107PasCod ;
   private String[] T013669_A719PrdNum ;
   private boolean[] T013669_n719PrdNum ;
   private String[] T013670_A396EmprCod ;
   private int[] T013670_A2637HisEstHRu ;
   private byte[] T013670_A2636HisEstHRe ;
   private String[] T013670_A2635HisEstHPa ;
   private byte[] T013670_A2638HisEstLCo ;
   private String[] T013670_A2630HisEstCom ;
   private String[] T013670_A2634HisEstFon ;
   private String[] T013670_A719PrdNum ;
   private boolean[] T013670_n719PrdNum ;
   private String[] T013671_A396EmprCod ;
   private int[] T013671_A252CliCod ;
   private String[] T013671_A2141SerEst ;
   private String[] T013671_A1013DibCli ;
   private int[] T013671_A1014DibInt ;
   private String[] T013671_A2074ColCom ;
   private String[] T013671_A2078ColFon ;
   private byte[] T013671_A2098MolCod ;
   private short[] T013671_A2535ForPrdLin ;
   private String[] T013672_A396EmprCod ;
   private String[] T013672_A719PrdNum ;
   private boolean[] T013672_n719PrdNum ;
   private long[] T013672_A3342CCStkLin ;
   private String[] T013673_A396EmprCod ;
   private int[] T013673_A252CliCod ;
   private String[] T013673_A2891HMaForSer ;
   private String[] T013673_A2892HMaForCNom ;
   private int[] T013673_A2893HMaForCNum ;
   private byte[] T013673_A2894HMaTipCCod ;
   private int[] T013673_A2895HMaForNumC ;
   private short[] T013673_A2897HMaColLin ;
   private java.util.Date[] T013673_A2896HMaFec ;
   private short[] T013673_A2907HmaLin ;
   private String[] T013674_A396EmprCod ;
   private int[] T013674_A129BarCod ;
   private byte[] T013674_A132BarCodReo ;
   private String[] T013674_A130BarCodPar ;
   private short[] T013674_A2808RecLinMAL ;
   private byte[] T013674_A1377RecNumAny ;
   private String[] T013674_A719PrdNum ;
   private boolean[] T013674_n719PrdNum ;
   private String[] T013675_A396EmprCod ;
   private int[] T013675_A129BarCod ;
   private byte[] T013675_A132BarCodReo ;
   private String[] T013675_A130BarCodPar ;
   private short[] T013675_A2804RecLinMaq ;
   private byte[] T013675_A1273RecLinPro ;
   private short[] T013675_A811RecLin ;
   private String[] T013676_A396EmprCod ;
   private int[] T013676_A129BarCod ;
   private byte[] T013676_A132BarCodReo ;
   private String[] T013676_A130BarCodPar ;
   private String[] T013676_A2494BarDosPro ;
   private String[] T013676_A719PrdNum ;
   private boolean[] T013676_n719PrdNum ;
   private String[] T013677_A396EmprCod ;
   private int[] T013677_A1314EnsLabCod ;
   private short[] T013677_A1317EnsLabLin ;
   private String[] T013678_A396EmprCod ;
   private String[] T013678_A910Workstat ;
   private int[] T013678_A887EscMLin ;
   private String[] T013679_A396EmprCod ;
   private int[] T013679_A859CumCodCont ;
   private String[] T013679_A719PrdNum ;
   private boolean[] T013679_n719PrdNum ;
   private String[] T013680_A396EmprCod ;
   private String[] T013680_A719PrdNum ;
   private boolean[] T013680_n719PrdNum ;
   private java.util.Date[] T013680_A810RecFec ;
   private String[] T013681_A396EmprCod ;
   private int[] T013681_A486ForNumCol ;
   private short[] T013681_A715PrdLin ;
   private String[] T013682_A396EmprCod ;
   private String[] T013682_A719PrdNum ;
   private boolean[] T013682_n719PrdNum ;
   private short[] T013682_A681PrdAny ;
   private String[] T013683_A396EmprCod ;
   private String[] T013683_A719PrdNum ;
   private boolean[] T013683_n719PrdNum ;
   private String[] T013683_A688PrdComCod ;
   private String[] T013684_A396EmprCod ;
   private String[] T013684_A719PrdNum ;
   private boolean[] T013684_n719PrdNum ;
   private String[] T013684_A680PrdAltNum ;
   private String[] T013685_A396EmprCod ;
   private int[] T013685_A658PedCod ;
   private String[] T013685_A719PrdNum ;
   private boolean[] T013685_n719PrdNum ;
   private String[] T013686_A396EmprCod ;
   private int[] T013686_A486ForNumCol ;
   private short[] T013686_A309ColLin ;
   private String[] T013687_A396EmprCod ;
   private String[] T013687_A719PrdNum ;
   private boolean[] T013687_n719PrdNum ;
   private int[] T013687_A647NumCon ;
   private String[] T013688_A396EmprCod ;
   private String[] T013688_A719PrdNum ;
   private boolean[] T013688_n719PrdNum ;
   private String[] T013689_A719PrdNum ;
   private boolean[] T013689_n719PrdNum ;
   private String[] T013689_A8909CC_AlmDsc ;
   private boolean[] T013689_n8909CC_AlmDsc ;
   private java.math.BigDecimal[] T013689_A8918CC_ExisCC ;
   private boolean[] T013689_n8918CC_ExisCC ;
   private String[] T013689_A396EmprCod ;
   private byte[] T013689_A8908CC_AlmCod ;
   private boolean[] T013689_n8908CC_AlmCod ;
   private String[] T01364_A8909CC_AlmDsc ;
   private boolean[] T01364_n8909CC_AlmDsc ;
   private String[] T013690_A8909CC_AlmDsc ;
   private boolean[] T013690_n8909CC_AlmDsc ;
   private String[] T013691_A396EmprCod ;
   private String[] T013691_A719PrdNum ;
   private boolean[] T013691_n719PrdNum ;
   private byte[] T013691_A8908CC_AlmCod ;
   private boolean[] T013691_n8908CC_AlmCod ;
   private String[] T01363_A719PrdNum ;
   private boolean[] T01363_n719PrdNum ;
   private java.math.BigDecimal[] T01363_A8918CC_ExisCC ;
   private boolean[] T01363_n8918CC_ExisCC ;
   private String[] T01363_A396EmprCod ;
   private byte[] T01363_A8908CC_AlmCod ;
   private boolean[] T01363_n8908CC_AlmCod ;
   private String[] T01362_A719PrdNum ;
   private boolean[] T01362_n719PrdNum ;
   private java.math.BigDecimal[] T01362_A8918CC_ExisCC ;
   private boolean[] T01362_n8918CC_ExisCC ;
   private String[] T01362_A396EmprCod ;
   private byte[] T01362_A8908CC_AlmCod ;
   private boolean[] T01362_n8908CC_AlmCod ;
   private String[] T013695_A8909CC_AlmDsc ;
   private boolean[] T013695_n8909CC_AlmDsc ;
   private String[] T013696_A396EmprCod ;
   private String[] T013696_A719PrdNum ;
   private boolean[] T013696_n719PrdNum ;
   private java.util.Date[] T013696_A8577RecFecHr ;
   private byte[] T013696_A8908CC_AlmCod ;
   private boolean[] T013696_n8908CC_AlmCod ;
   private String[] T013697_A396EmprCod ;
   private String[] T013697_A719PrdNum ;
   private boolean[] T013697_n719PrdNum ;
   private java.util.Date[] T013697_A810RecFec ;
   private byte[] T013697_A8908CC_AlmCod ;
   private boolean[] T013697_n8908CC_AlmCod ;
   private String[] T013698_A396EmprCod ;
   private String[] T013698_A719PrdNum ;
   private boolean[] T013698_n719PrdNum ;
   private long[] T013698_A8911CC_Lin ;
   private String[] T013699_A396EmprCod ;
   private String[] T013699_A719PrdNum ;
   private boolean[] T013699_n719PrdNum ;
   private byte[] T013699_A8908CC_AlmCod ;
   private boolean[] T013699_n8908CC_AlmCod ;
   private String[] T0136100_A407EmprNom ;
   private boolean[] T0136100_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprdalm__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01362", "SELECT PrdNum, CC_ExisCC, EmprCod, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?  FOR UPDATE OF CC_ExisCC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01363", "SELECT PrdNum, CC_ExisCC, EmprCod, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01364", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01365", "SELECT PrdNum, PrdNom, PrdExiCC, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, PrdExiCC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01366", "SELECT PrdNum, PrdNom, PrdExiCC, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01367", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01368", "SELECT /*+ FIRST_ROWS(1) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.PrdExiCC, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01369", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013611", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013612", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, PrdExiCC, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T013613", "UPDATE TXPPRODUC SET PrdNom=?, PrdExiCC=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T013614", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T013615", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013616", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013617", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013618", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013619", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013620", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013621", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013622", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013623", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013624", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013625", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013626", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013627", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013628", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013629", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013630", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013631", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013632", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013633", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013634", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013635", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013636", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013637", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013638", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013639", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013640", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013641", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013642", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013643", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013644", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013645", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013646", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013647", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_Lin FROM TXPCCALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013648", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013649", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013650", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013651", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013652", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013653", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013654", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013655", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013656", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013657", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013658", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013659", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013660", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013661", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013662", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013663", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013664", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013665", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013666", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013667", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013668", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013669", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013670", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013671", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013672", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013673", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013674", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013675", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013676", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013677", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013678", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013679", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013680", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013681", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013682", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013683", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013684", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013685", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013686", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013687", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013688", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013689", "SELECT T1.PrdNum, T2.CC_AlmDsc, T1.CC_ExisCC, T1.EmprCod, T1.CC_AlmCod FROM (TXPPRDALM T1 INNER JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.CC_AlmCod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.CC_AlmCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013690", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013691", "SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013692", "INSERT INTO TXPPRDALM(PrdNum, CC_ExisCC, EmprCod, CC_AlmCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPRDALM")
         ,new UpdateCursor("T013693", "UPDATE TXPPRDALM SET CC_ExisCC=?  WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?", GX_NOMASK, "TXPPRDALM")
         ,new UpdateCursor("T013694", "DELETE FROM TXPPRDALM  WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?", GX_NOMASK, "TXPPRDALM")
         ,new ForEachCursor("T013695", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013696", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr, CC_AlmCod FROM TXPINVALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013697", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013698", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_Lin FROM TXPCCALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013699", "SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CC_AlmCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0136100", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
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
            case 85 :
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
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               return;
            case 91 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 97 :
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
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

