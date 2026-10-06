package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class packinglist_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
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
         gxload_10( A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridpackinglist_pieza") == 0 )
      {
         gxnrgridpackinglist_pieza_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Packing List", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridpackinglist_pieza_newrow_invoke( )
   {
      nRC_GXsfl_83 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_83"))) ;
      nGXsfl_83_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_83_idx"))) ;
      sGXsfl_83_idx = httpContext.GetPar( "sGXsfl_83_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridpackinglist_pieza_newrow( ) ;
      /* End function gxnrGridpackinglist_pieza_newrow_invoke */
   }

   public packinglist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public packinglist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( packinglist_impl.class ));
   }

   public packinglist_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Packing List", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\PackingList.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Produccion\\PackingList.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\PackingList.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTerCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTerCod_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotPie_Internalname, httpContext.getMessage( "Total Piezas Meradas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2812MetTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotMet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotMet_Internalname, httpContext.getMessage( "Total Metros Metrados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotMet_Enabled!=0) ? localUtil.format( A2811MetTotMet, "ZZZZZ9.99") : localUtil.format( A2811MetTotMet, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotMet_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetTotKil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetTotKil_Internalname, httpContext.getMessage( "Total Kilos Metrados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTotKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetTotKil_Enabled!=0) ? localUtil.format( A2810MetTotKil, "ZZZZZ9.99") : localUtil.format( A2810MetTotKil, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTotKil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetTotKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPiezatable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlepieza_Internalname, httpContext.getMessage( "Pieza", ""), "", "", lblTitlepieza_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridpackinglist_pieza( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\PackingList.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridpackinglist_pieza( )
   {
      /*  Grid Control  */
      startgridcontrol83( ) ;
      nGXsfl_83_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_413 = (short)(1) ;
            scanStart1SC413( ) ;
            while ( RcdFound413 != 0 )
            {
               init_level_properties413( ) ;
               getByPrimaryKey1SC413( ) ;
               addRow1SC413( ) ;
               scanNext1SC413( ) ;
            }
            scanEnd1SC413( ) ;
            nBlankRcdCount413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2811MetTotMet = A2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         B2810MetTotKil = A2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         B2812MetTotPie = A2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         standaloneNotModal1SC413( ) ;
         standaloneModal1SC413( ) ;
         sMode413 = Gx_mode ;
         while ( nGXsfl_83_idx < nRC_GXsfl_83 )
         {
            bGXsfl_83_Refreshing = true ;
            readRow1SC413( ) ;
            edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEID_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieId_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOB_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOb_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCol_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPiePDo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEPDO_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPiePDo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiePDo_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIELOC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieLoc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieRap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIERAP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieRap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieRap_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieDCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDCP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDCP_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieMue_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMUE_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMue_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOBS_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieDfUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFUL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieOpe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOPE_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            edtMetPieTurn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIETURN_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_83_Refreshing);
            if ( ( nRcdExists_413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SC413( ) ;
            }
            sendRow1SC413( ) ;
            bGXsfl_83_Refreshing = false ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2811MetTotMet = B2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = B2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = B2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount413 = (short)(5) ;
         nRcdExists_413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SC413( ) ;
            while ( RcdFound413 != 0 )
            {
               sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_83413( ) ;
               init_level_properties413( ) ;
               standaloneNotModal1SC413( ) ;
               getByPrimaryKey1SC413( ) ;
               standaloneModal1SC413( ) ;
               addRow1SC413( ) ;
               scanNext1SC413( ) ;
            }
            scanEnd1SC413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode413 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_83413( ) ;
      initAll1SC413( ) ;
      init_level_properties413( ) ;
      B2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      B2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      B2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
      nBlankRcdCount413 = (short)(nBlankRcdUsr413+nBlankRcdCount413) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount413 > 0 )
      {
         standaloneNotModal1SC413( ) ;
         standaloneModal1SC413( ) ;
         addRow1SC413( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMetPieCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount413 = (short)(nBlankRcdCount413-1) ;
      }
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A2811MetTotMet = B2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2810MetTotKil = B2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      A2812MetTotPie = B2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridpackinglist_piezaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridpackinglist_pieza", Gridpackinglist_piezaContainer, subGridpackinglist_pieza_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridpackinglist_piezaContainerData", Gridpackinglist_piezaContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridpackinglist_piezaContainerData"+"V", Gridpackinglist_piezaContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridpackinglist_piezaContainerData"+"V"+"\" value='"+Gridpackinglist_piezaContainer.GridValuesHidden()+"'/>") ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         O2811MetTotMet = localUtil.ctond( httpContext.cgiGet( "O2811MetTotMet")) ;
         O2810MetTotKil = localUtil.ctond( httpContext.cgiGet( "O2810MetTotKil")) ;
         O2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( "O2812MetTotPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_83 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2812MetTotPie = (short)(localUtil.ctol( httpContext.cgiGet( edtMetTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = localUtil.ctond( httpContext.cgiGet( edtMetTotMet_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = localUtil.ctond( httpContext.cgiGet( edtMetTotKil_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
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
            A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1SC412( ) ;
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
      disableAttributes1SC412( ) ;
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

   public void confirm_1SC413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nGXsfl_83_idx = 0 ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         readRow1SC413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            getKey1SC413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               if ( RcdFound413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SC413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SC413( ) ;
                     closeExtendedTableCursors1SC413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2811MetTotMet = A2811MetTotMet ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                     O2810MetTotKil = A2810MetTotKil ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                     O2812MetTotPie = A2812MetTotPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "METPIECOD_" + sGXsfl_83_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMetPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( nRcdDeleted_413 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SC413( ) ;
                     load1SC413( ) ;
                     beforeValidate1SC413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SC413( ) ;
                        O2811MetTotMet = A2811MetTotMet ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                        O2810MetTotKil = A2810MetTotKil ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                        O2812MetTotPie = A2812MetTotPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SC413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SC413( ) ;
                           closeExtendedTableCursors1SC413( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2811MetTotMet = A2811MetTotMet ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                           O2810MetTotKil = A2810MetTotKil ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                           O2812MetTotPie = A2812MetTotPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_83_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieId_Internalname, GXutil.rtrim( A10784MetPieId)) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( edtMetPieOb_Internalname, GXutil.rtrim( A10779MetPieOb)) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCol_Internalname, GXutil.rtrim( A4911MetPieCol)) ;
         httpContext.changePostValue( edtMetPiePDo_Internalname, GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieLoc_Internalname, GXutil.rtrim( A4913MetPieLoc)) ;
         httpContext.changePostValue( edtMetPieRap_Internalname, GXutil.rtrim( A4914MetPieRap)) ;
         httpContext.changePostValue( edtMetPieDCP_Internalname, GXutil.rtrim( A4915MetPieDCP)) ;
         httpContext.changePostValue( edtMetPieMue_Internalname, GXutil.rtrim( A4916MetPieMue)) ;
         httpContext.changePostValue( edtMetPieObs_Internalname, A4917MetPieObs) ;
         httpContext.changePostValue( edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieTurn_Internalname, GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_83_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_83_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_83_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_83_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_83_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_83_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4911MetPieCol_"+sGXsfl_83_idx, GXutil.rtrim( Z4911MetPieCol)) ;
         httpContext.changePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_83_idx, GXutil.rtrim( Z4913MetPieLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z4914MetPieRap_"+sGXsfl_83_idx, GXutil.rtrim( Z4914MetPieRap)) ;
         httpContext.changePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_83_idx, GXutil.rtrim( Z4915MetPieDCP)) ;
         httpContext.changePostValue( "ZT_"+"Z4916MetPieMue_"+sGXsfl_83_idx, GXutil.rtrim( Z4916MetPieMue)) ;
         httpContext.changePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_83_idx, Z4917MetPieObs) ;
         httpContext.changePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEID_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEPDO_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIELOC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIERAP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieRap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDCP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMUE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMue_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOBS_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFUL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOPE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIETURN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2811MetTotMet = s2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = s2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = s2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SC0( )
   {
   }

   public void zm1SC412( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -7 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z2812MetTotPie = A2812MetTotPie ;
         Z2811MetTotMet = A2811MetTotMet ;
         Z2810MetTotKil = A2810MetTotKil ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
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

   public void load1SC412( )
   {
      /* Using cursor T01SC11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A407EmprNom = T01SC11_A407EmprNom[0] ;
         n407EmprNom = T01SC11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2812MetTotPie = T01SC11_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01SC11_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01SC11_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         zm1SC412( -7) ;
      }
      pr_default.close(7);
      onLoadActions1SC412( ) ;
   }

   public void onLoadActions1SC412( )
   {
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
   }

   public void checkExtendedTable1SC412( )
   {
      nIsDirty_412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SC6_A407EmprNom[0] ;
      n407EmprNom = T01SC6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01SC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01SC9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A2812MetTotPie = T01SC9_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01SC9_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01SC9_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         nIsDirty_412 = (short)(1) ;
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         nIsDirty_412 = (short)(1) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         nIsDirty_412 = (short)(1) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1SC412( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod )
   {
      /* Using cursor T01SC12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SC12_A407EmprNom[0] ;
      n407EmprNom = T01SC12_n407EmprNom[0] ;
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

   public void gxload_9( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01SC13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_10( String A396EmprCod ,
                          String A2809MetTerCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01SC15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A2812MetTotPie = T01SC15_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01SC15_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01SC15_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1SC412( )
   {
      /* Using cursor T01SC16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      else
      {
         RcdFound412 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1SC412( 7) ;
         RcdFound412 = (short)(1) ;
         A2809MetTerCod = T01SC5_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A396EmprCod = T01SC5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01SC5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01SC5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01SC5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SC412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound412 = (short)(0) ;
            initializeNonKey1SC412( ) ;
         }
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound412 = (short)(0) ;
         initializeNonKey1SC412( ) ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1SC412( ) ;
      if ( RcdFound412 == 0 )
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
      RcdFound412 = (short)(0) ;
      /* Using cursor T01SC17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC17_A129BarCod[0] < A129BarCod ) || ( T01SC17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC17_A132BarCodReo[0] < A132BarCodReo ) || ( T01SC17_A132BarCodReo[0] == A132BarCodReo ) && ( T01SC17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC17_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC17_A129BarCod[0] > A129BarCod ) || ( T01SC17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC17_A132BarCodReo[0] > A132BarCodReo ) || ( T01SC17_A132BarCodReo[0] == A132BarCodReo ) && ( T01SC17_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC17_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC17_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01SC17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01SC17_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01SC17_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01SC17_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01SC17_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T01SC18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A2809MetTerCod, A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A2809MetTerCod, A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) > 0 ) || ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC18_A129BarCod[0] > A129BarCod ) || ( T01SC18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC18_A132BarCodReo[0] > A132BarCodReo ) || ( T01SC18_A132BarCodReo[0] == A132BarCodReo ) && ( T01SC18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC18_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) < 0 ) || ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC18_A129BarCod[0] < A129BarCod ) || ( T01SC18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SC18_A132BarCodReo[0] < A132BarCodReo ) || ( T01SC18_A132BarCodReo[0] == A132BarCodReo ) && ( T01SC18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01SC18_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01SC18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SC18_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01SC18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = T01SC18_A2809MetTerCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = T01SC18_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01SC18_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01SC18_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SC412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SC412( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound412 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2809MetTerCod = Z2809MetTerCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               update1SC412( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SC412( ) ;
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
                  A2811MetTotMet = O2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  A2810MetTotKil = O2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  A2812MetTotPie = O2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SC412( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = Z2809MetTerCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2811MetTotMet = O2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = O2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         A2812MetTotPie = O2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SC412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1SC412( ) ;
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SC412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound412 != 0 )
         {
            scanNext1SC412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1SC412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SC412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SC412( )
   {
      beforeValidate1SC412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SC412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SC412( 0) ;
         checkOptimisticConcurrency1SC412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SC412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SC412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SC19 */
                  pr_default.execute(14, new Object[] {A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1SC412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SC0( ) ;
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
            load1SC412( ) ;
         }
         endLevel1SC412( ) ;
      }
      closeExtendedTableCursors1SC412( ) ;
   }

   public void update1SC412( )
   {
      beforeValidate1SC412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SC412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SC412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SC412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SC412( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCMETPI */
                  deferredUpdate1SC412( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SC412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1SC0( ) ;
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
         endLevel1SC412( ) ;
      }
      closeExtendedTableCursors1SC412( ) ;
   }

   public void deferredUpdate1SC412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SC412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SC412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SC412( ) ;
         afterConfirm1SC412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SC412( ) ;
            if ( AnyError == 0 )
            {
               A2811MetTotMet = O2811MetTotMet ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               A2810MetTotKil = O2810MetTotKil ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               scanStart1SC413( ) ;
               while ( RcdFound413 != 0 )
               {
                  getByPrimaryKey1SC413( ) ;
                  delete1SC413( ) ;
                  scanNext1SC413( ) ;
                  O2811MetTotMet = A2811MetTotMet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
                  O2810MetTotKil = A2810MetTotKil ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
                  O2812MetTotPie = A2812MetTotPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               }
               scanEnd1SC413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SC20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound412 == 0 )
                        {
                           initAll1SC412( ) ;
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
                        resetCaption1SC0( ) ;
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
      sMode412 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SC412( ) ;
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SC412( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SC21 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T01SC21_A407EmprNom[0] ;
         n407EmprNom = T01SC21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T01SC23 */
         pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A2812MetTotPie = T01SC23_A2812MetTotPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = T01SC23_A2811MetTotMet[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = T01SC23_A2810MetTotKil[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            A2812MetTotPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SC24 */
         pr_default.execute(18, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1SC413( )
   {
      s2811MetTotMet = O2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      s2810MetTotKil = O2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      s2812MetTotPie = O2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      nGXsfl_83_idx = 0 ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         readRow1SC413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            standaloneNotModal1SC413( ) ;
            getKey1SC413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SC413( ) ;
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( ( nRcdDeleted_413 != 0 ) && ( nRcdExists_413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SC413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SC413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_83_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2811MetTotMet = A2811MetTotMet ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            O2810MetTotKil = A2810MetTotKil ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            O2812MetTotPie = A2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieId_Internalname, GXutil.rtrim( A10784MetPieId)) ;
         httpContext.changePostValue( edtMetPiectr_Internalname, GXutil.rtrim( A10780MetPiectr)) ;
         httpContext.changePostValue( edtMetPieOb_Internalname, GXutil.rtrim( A10779MetPieOb)) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCol_Internalname, GXutil.rtrim( A4911MetPieCol)) ;
         httpContext.changePostValue( edtMetPiePDo_Internalname, GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieLoc_Internalname, GXutil.rtrim( A4913MetPieLoc)) ;
         httpContext.changePostValue( edtMetPieRap_Internalname, GXutil.rtrim( A4914MetPieRap)) ;
         httpContext.changePostValue( edtMetPieDCP_Internalname, GXutil.rtrim( A4915MetPieDCP)) ;
         httpContext.changePostValue( edtMetPieMue_Internalname, GXutil.rtrim( A4916MetPieMue)) ;
         httpContext.changePostValue( edtMetPieObs_Internalname, A4917MetPieObs) ;
         httpContext.changePostValue( edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieTurn_Internalname, GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_83_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_83_idx, GXutil.rtrim( Z10784MetPieId)) ;
         httpContext.changePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_83_idx, GXutil.rtrim( Z10780MetPiectr)) ;
         httpContext.changePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_83_idx, GXutil.rtrim( Z10779MetPieOb)) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_83_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_83_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4911MetPieCol_"+sGXsfl_83_idx, GXutil.rtrim( Z4911MetPieCol)) ;
         httpContext.changePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_83_idx, GXutil.rtrim( Z4913MetPieLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z4914MetPieRap_"+sGXsfl_83_idx, GXutil.rtrim( Z4914MetPieRap)) ;
         httpContext.changePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_83_idx, GXutil.rtrim( Z4915MetPieDCP)) ;
         httpContext.changePostValue( "ZT_"+"Z4916MetPieMue_"+sGXsfl_83_idx, GXutil.rtrim( Z4916MetPieMue)) ;
         httpContext.changePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_83_idx, Z4917MetPieObs) ;
         httpContext.changePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_83_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEID_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECTR_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEPDO_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIELOC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIERAP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieRap_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDCP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMUE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMue_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOBS_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFUL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOPE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIETURN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SC413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
   }

   public void processLevel1SC412( )
   {
      /* Save parent mode. */
      sMode412 = Gx_mode ;
      processNestedLevel1SC413( ) ;
      if ( AnyError != 0 )
      {
         O2811MetTotMet = s2811MetTotMet ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         O2810MetTotKil = s2810MetTotKil ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         O2812MetTotPie = s2812MetTotPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1SC412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SC412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "produccion.packinglist");
         if ( AnyError == 0 )
         {
            confirmValues1SC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "produccion.packinglist");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SC412( )
   {
      /* Using cursor T01SC25 */
      pr_default.execute(19);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01SC25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01SC25_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01SC25_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01SC25_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01SC25_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SC412( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A396EmprCod = T01SC25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2809MetTerCod = T01SC25_A2809MetTerCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         A129BarCod = T01SC25_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01SC25_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01SC25_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1SC412( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1SC412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SC412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SC412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SC412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SC412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SC412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SC412( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMetTotPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotPie_Enabled), 5, 0), true);
      edtMetTotMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotMet_Enabled), 5, 0), true);
      edtMetTotKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTotKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTotKil_Enabled), 5, 0), true);
   }

   public void zm1SC413( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01SC3_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01SC3_A2815MetPieMet[0] ;
            Z10784MetPieId = T01SC3_A10784MetPieId[0] ;
            Z10780MetPiectr = T01SC3_A10780MetPiectr[0] ;
            Z10779MetPieOb = T01SC3_A10779MetPieOb[0] ;
            Z6635MetPieAnc = T01SC3_A6635MetPieAnc[0] ;
            Z5136MetPieFch = T01SC3_A5136MetPieFch[0] ;
            Z4909MetPieDef = T01SC3_A4909MetPieDef[0] ;
            Z2846MetPieDsc = T01SC3_A2846MetPieDsc[0] ;
            Z2816MetPieEst = T01SC3_A2816MetPieEst[0] ;
            Z4910MetPieMtD = T01SC3_A4910MetPieMtD[0] ;
            Z4911MetPieCol = T01SC3_A4911MetPieCol[0] ;
            Z4912MetPiePDo = T01SC3_A4912MetPiePDo[0] ;
            Z4913MetPieLoc = T01SC3_A4913MetPieLoc[0] ;
            Z4914MetPieRap = T01SC3_A4914MetPieRap[0] ;
            Z4915MetPieDCP = T01SC3_A4915MetPieDCP[0] ;
            Z4916MetPieMue = T01SC3_A4916MetPieMue[0] ;
            Z4917MetPieObs = T01SC3_A4917MetPieObs[0] ;
            Z12994MetPieDfUl = T01SC3_A12994MetPieDfUl[0] ;
            Z13005MetPieOpe = T01SC3_A13005MetPieOpe[0] ;
            Z13006MetPieTurn = T01SC3_A13006MetPieTurn[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z10784MetPieId = A10784MetPieId ;
            Z10780MetPiectr = A10780MetPiectr ;
            Z10779MetPieOb = A10779MetPieOb ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z5136MetPieFch = A5136MetPieFch ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z4910MetPieMtD = A4910MetPieMtD ;
            Z4911MetPieCol = A4911MetPieCol ;
            Z4912MetPiePDo = A4912MetPiePDo ;
            Z4913MetPieLoc = A4913MetPieLoc ;
            Z4914MetPieRap = A4914MetPieRap ;
            Z4915MetPieDCP = A4915MetPieDCP ;
            Z4916MetPieMue = A4916MetPieMue ;
            Z4917MetPieObs = A4917MetPieObs ;
            Z12994MetPieDfUl = A12994MetPieDfUl ;
            Z13005MetPieOpe = A13005MetPieOpe ;
            Z13006MetPieTurn = A13006MetPieTurn ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z10784MetPieId = A10784MetPieId ;
         Z10780MetPiectr = A10780MetPiectr ;
         Z10779MetPieOb = A10779MetPieOb ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z4911MetPieCol = A4911MetPieCol ;
         Z4912MetPiePDo = A4912MetPiePDo ;
         Z4913MetPieLoc = A4913MetPieLoc ;
         Z4914MetPieRap = A4914MetPieRap ;
         Z4915MetPieDCP = A4915MetPieDCP ;
         Z4916MetPieMue = A4916MetPieMue ;
         Z4917MetPieObs = A4917MetPieObs ;
         Z12994MetPieDfUl = A12994MetPieDfUl ;
         Z13005MetPieOpe = A13005MetPieOpe ;
         Z13006MetPieTurn = A13006MetPieTurn ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1SC413( )
   {
   }

   public void standaloneModal1SC413( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      }
   }

   public void load1SC413( )
   {
      /* Using cursor T01SC26 */
      pr_default.execute(20, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01SC26_A2814MetPieKil[0] ;
         A2815MetPieMet = T01SC26_A2815MetPieMet[0] ;
         A10784MetPieId = T01SC26_A10784MetPieId[0] ;
         A10780MetPiectr = T01SC26_A10780MetPiectr[0] ;
         A10779MetPieOb = T01SC26_A10779MetPieOb[0] ;
         A6635MetPieAnc = T01SC26_A6635MetPieAnc[0] ;
         A5136MetPieFch = T01SC26_A5136MetPieFch[0] ;
         A4909MetPieDef = T01SC26_A4909MetPieDef[0] ;
         A2846MetPieDsc = T01SC26_A2846MetPieDsc[0] ;
         A2816MetPieEst = T01SC26_A2816MetPieEst[0] ;
         A4910MetPieMtD = T01SC26_A4910MetPieMtD[0] ;
         A4911MetPieCol = T01SC26_A4911MetPieCol[0] ;
         A4912MetPiePDo = T01SC26_A4912MetPiePDo[0] ;
         A4913MetPieLoc = T01SC26_A4913MetPieLoc[0] ;
         A4914MetPieRap = T01SC26_A4914MetPieRap[0] ;
         A4915MetPieDCP = T01SC26_A4915MetPieDCP[0] ;
         A4916MetPieMue = T01SC26_A4916MetPieMue[0] ;
         A4917MetPieObs = T01SC26_A4917MetPieObs[0] ;
         A12994MetPieDfUl = T01SC26_A12994MetPieDfUl[0] ;
         A13005MetPieOpe = T01SC26_A13005MetPieOpe[0] ;
         A13006MetPieTurn = T01SC26_A13006MetPieTurn[0] ;
         zm1SC413( -11) ;
      }
      pr_default.close(20);
      onLoadActions1SC413( ) ;
   }

   public void onLoadActions1SC413( )
   {
      if ( isIns( )  )
      {
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1SC413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1SC413( ) ;
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2812MetTotPie = (short)(O2812MetTotPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2812MetTotPie = O2812MetTotPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2812MetTotPie = (short)(O2812MetTotPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
         }
      }
      if ( ! ( ( GXutil.strcmp(A4914MetPieRap, "S") == 0 ) || ( GXutil.strcmp(A4914MetPieRap, "N") == 0 ) ) )
      {
         GXCCtl = "METPIERAP_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Raport", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieRap_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4915MetPieDCP, "S") == 0 ) || ( GXutil.strcmp(A4915MetPieDCP, "N") == 0 ) ) )
      {
         GXCCtl = "METPIEDCP_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "S=Calidad 1, N=Calidad 2", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDCP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4916MetPieMue, "S") == 0 ) || ( GXutil.strcmp(A4916MetPieMue, "N") == 0 ) ) )
      {
         GXCCtl = "METPIEMUE_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Muestra?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMue_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SC413( )
   {
   }

   public void enableDisable1SC413( )
   {
   }

   public void getKey1SC413( )
   {
      /* Using cursor T01SC27 */
      pr_default.execute(21, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1SC413( )
   {
      /* Using cursor T01SC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SC413( 11) ;
         RcdFound413 = (short)(1) ;
         initializeNonKey1SC413( ) ;
         A2813MetPieCod = T01SC3_A2813MetPieCod[0] ;
         A2814MetPieKil = T01SC3_A2814MetPieKil[0] ;
         A2815MetPieMet = T01SC3_A2815MetPieMet[0] ;
         A10784MetPieId = T01SC3_A10784MetPieId[0] ;
         A10780MetPiectr = T01SC3_A10780MetPiectr[0] ;
         A10779MetPieOb = T01SC3_A10779MetPieOb[0] ;
         A6635MetPieAnc = T01SC3_A6635MetPieAnc[0] ;
         A5136MetPieFch = T01SC3_A5136MetPieFch[0] ;
         A4909MetPieDef = T01SC3_A4909MetPieDef[0] ;
         A2846MetPieDsc = T01SC3_A2846MetPieDsc[0] ;
         A2816MetPieEst = T01SC3_A2816MetPieEst[0] ;
         A4910MetPieMtD = T01SC3_A4910MetPieMtD[0] ;
         A4911MetPieCol = T01SC3_A4911MetPieCol[0] ;
         A4912MetPiePDo = T01SC3_A4912MetPiePDo[0] ;
         A4913MetPieLoc = T01SC3_A4913MetPieLoc[0] ;
         A4914MetPieRap = T01SC3_A4914MetPieRap[0] ;
         A4915MetPieDCP = T01SC3_A4915MetPieDCP[0] ;
         A4916MetPieMue = T01SC3_A4916MetPieMue[0] ;
         A4917MetPieObs = T01SC3_A4917MetPieObs[0] ;
         A12994MetPieDfUl = T01SC3_A12994MetPieDfUl[0] ;
         A13005MetPieOpe = T01SC3_A13005MetPieOpe[0] ;
         A13006MetPieTurn = T01SC3_A13006MetPieTurn[0] ;
         O2815MetPieMet = A2815MetPieMet ;
         O2814MetPieKil = A2814MetPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SC413( ) ;
         load1SC413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1SC413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SC413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SC413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SC413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01SC2_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01SC2_A2815MetPieMet[0]) != 0 ) || ( GXutil.strcmp(Z10784MetPieId, T01SC2_A10784MetPieId[0]) != 0 ) || ( GXutil.strcmp(Z10780MetPiectr, T01SC2_A10780MetPiectr[0]) != 0 ) || ( GXutil.strcmp(Z10779MetPieOb, T01SC2_A10779MetPieOb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6635MetPieAnc != T01SC2_A6635MetPieAnc[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01SC2_A5136MetPieFch[0])) ) || ( Z4909MetPieDef != T01SC2_A4909MetPieDef[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T01SC2_A2846MetPieDsc[0]) != 0 ) || ( Z2816MetPieEst != T01SC2_A2816MetPieEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4910MetPieMtD, T01SC2_A4910MetPieMtD[0]) != 0 ) || ( GXutil.strcmp(Z4911MetPieCol, T01SC2_A4911MetPieCol[0]) != 0 ) || ( Z4912MetPiePDo != T01SC2_A4912MetPiePDo[0] ) || ( GXutil.strcmp(Z4913MetPieLoc, T01SC2_A4913MetPieLoc[0]) != 0 ) || ( GXutil.strcmp(Z4914MetPieRap, T01SC2_A4914MetPieRap[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4915MetPieDCP, T01SC2_A4915MetPieDCP[0]) != 0 ) || ( GXutil.strcmp(Z4916MetPieMue, T01SC2_A4916MetPieMue[0]) != 0 ) || ( GXutil.strcmp(Z4917MetPieObs, T01SC2_A4917MetPieObs[0]) != 0 ) || ( Z12994MetPieDfUl != T01SC2_A12994MetPieDfUl[0] ) || ( Z13005MetPieOpe != T01SC2_A13005MetPieOpe[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13006MetPieTurn != T01SC2_A13006MetPieTurn[0] ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01SC2_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01SC2_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01SC2_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01SC2_A2815MetPieMet[0]);
            }
            if ( GXutil.strcmp(Z10784MetPieId, T01SC2_A10784MetPieId[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieId");
               GXutil.writeLogRaw("Old: ",Z10784MetPieId);
               GXutil.writeLogRaw("Current: ",T01SC2_A10784MetPieId[0]);
            }
            if ( GXutil.strcmp(Z10780MetPiectr, T01SC2_A10780MetPiectr[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPiectr");
               GXutil.writeLogRaw("Old: ",Z10780MetPiectr);
               GXutil.writeLogRaw("Current: ",T01SC2_A10780MetPiectr[0]);
            }
            if ( GXutil.strcmp(Z10779MetPieOb, T01SC2_A10779MetPieOb[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieOb");
               GXutil.writeLogRaw("Old: ",Z10779MetPieOb);
               GXutil.writeLogRaw("Current: ",T01SC2_A10779MetPieOb[0]);
            }
            if ( Z6635MetPieAnc != T01SC2_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01SC2_A6635MetPieAnc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01SC2_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T01SC2_A5136MetPieFch[0]);
            }
            if ( Z4909MetPieDef != T01SC2_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01SC2_A4909MetPieDef[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T01SC2_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T01SC2_A2846MetPieDsc[0]);
            }
            if ( Z2816MetPieEst != T01SC2_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01SC2_A2816MetPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T01SC2_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T01SC2_A4910MetPieMtD[0]);
            }
            if ( GXutil.strcmp(Z4911MetPieCol, T01SC2_A4911MetPieCol[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieCol");
               GXutil.writeLogRaw("Old: ",Z4911MetPieCol);
               GXutil.writeLogRaw("Current: ",T01SC2_A4911MetPieCol[0]);
            }
            if ( Z4912MetPiePDo != T01SC2_A4912MetPiePDo[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPiePDo");
               GXutil.writeLogRaw("Old: ",Z4912MetPiePDo);
               GXutil.writeLogRaw("Current: ",T01SC2_A4912MetPiePDo[0]);
            }
            if ( GXutil.strcmp(Z4913MetPieLoc, T01SC2_A4913MetPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieLoc");
               GXutil.writeLogRaw("Old: ",Z4913MetPieLoc);
               GXutil.writeLogRaw("Current: ",T01SC2_A4913MetPieLoc[0]);
            }
            if ( GXutil.strcmp(Z4914MetPieRap, T01SC2_A4914MetPieRap[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieRap");
               GXutil.writeLogRaw("Old: ",Z4914MetPieRap);
               GXutil.writeLogRaw("Current: ",T01SC2_A4914MetPieRap[0]);
            }
            if ( GXutil.strcmp(Z4915MetPieDCP, T01SC2_A4915MetPieDCP[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieDCP");
               GXutil.writeLogRaw("Old: ",Z4915MetPieDCP);
               GXutil.writeLogRaw("Current: ",T01SC2_A4915MetPieDCP[0]);
            }
            if ( GXutil.strcmp(Z4916MetPieMue, T01SC2_A4916MetPieMue[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieMue");
               GXutil.writeLogRaw("Old: ",Z4916MetPieMue);
               GXutil.writeLogRaw("Current: ",T01SC2_A4916MetPieMue[0]);
            }
            if ( GXutil.strcmp(Z4917MetPieObs, T01SC2_A4917MetPieObs[0]) != 0 )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieObs");
               GXutil.writeLogRaw("Old: ",Z4917MetPieObs);
               GXutil.writeLogRaw("Current: ",T01SC2_A4917MetPieObs[0]);
            }
            if ( Z12994MetPieDfUl != T01SC2_A12994MetPieDfUl[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieDfUl");
               GXutil.writeLogRaw("Old: ",Z12994MetPieDfUl);
               GXutil.writeLogRaw("Current: ",T01SC2_A12994MetPieDfUl[0]);
            }
            if ( Z13005MetPieOpe != T01SC2_A13005MetPieOpe[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieOpe");
               GXutil.writeLogRaw("Old: ",Z13005MetPieOpe);
               GXutil.writeLogRaw("Current: ",T01SC2_A13005MetPieOpe[0]);
            }
            if ( Z13006MetPieTurn != T01SC2_A13006MetPieTurn[0] )
            {
               GXutil.writeLogln("produccion.packinglist:[seudo value changed for attri]"+"MetPieTurn");
               GXutil.writeLogRaw("Old: ",Z13006MetPieTurn);
               GXutil.writeLogRaw("Current: ",T01SC2_A13006MetPieTurn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SC413( )
   {
      beforeValidate1SC413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SC413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SC413( 0) ;
         checkOptimisticConcurrency1SC413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SC413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SC413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SC28 */
                  pr_default.execute(22, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A4911MetPieCol, Long.valueOf(A4912MetPiePDo), A4913MetPieLoc, A4914MetPieRap, A4915MetPieDCP, A4916MetPieMue, A4917MetPieObs, Short.valueOf(A12994MetPieDfUl), Integer.valueOf(A13005MetPieOpe), Byte.valueOf(A13006MetPieTurn), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load1SC413( ) ;
         }
         endLevel1SC413( ) ;
      }
      closeExtendedTableCursors1SC413( ) ;
   }

   public void update1SC413( )
   {
      beforeValidate1SC413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SC413( ) ;
      }
      if ( ( nIsMod_413 != 0 ) || ( nIsDirty_413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SC413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SC413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SC413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SC29 */
                     pr_default.execute(23, new Object[] {A2814MetPieKil, A2815MetPieMet, A10784MetPieId, A10780MetPiectr, A10779MetPieOb, Short.valueOf(A6635MetPieAnc), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, Byte.valueOf(A2816MetPieEst), A4910MetPieMtD, A4911MetPieCol, Long.valueOf(A4912MetPiePDo), A4913MetPieLoc, A4914MetPieRap, A4915MetPieDCP, A4916MetPieMue, A4917MetPieObs, Short.valueOf(A12994MetPieDfUl), Integer.valueOf(A13005MetPieOpe), Byte.valueOf(A13006MetPieTurn), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SC413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1SC413( ) ;
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
            endLevel1SC413( ) ;
         }
      }
      closeExtendedTableCursors1SC413( ) ;
   }

   public void deferredUpdate1SC413( )
   {
   }

   public void delete1SC413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SC413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SC413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SC413( ) ;
         afterConfirm1SC413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SC413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SC30 */
               pr_default.execute(24, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SC413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SC413( )
   {
      standaloneModal1SC413( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A2812MetTotPie = (short)(O2812MetTotPie+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2812MetTotPie = O2812MetTotPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2812MetTotPie = (short)(O2812MetTotPie-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2810MetTotKil = O2810MetTotKil.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2810MetTotKil = O2810MetTotKil.subtract(O2814MetPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2811MetTotMet = O2811MetTotMet.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2811MetTotMet = O2811MetTotMet.subtract(O2815MetPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SC31 */
         pr_default.execute(25, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void endLevel1SC413( )
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

   public void scanStart1SC413( )
   {
      /* Scan By routine */
      /* Using cursor T01SC32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01SC32_A2813MetPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SC413( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01SC32_A2813MetPieCod[0] ;
      }
   }

   public void scanEnd1SC413( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1SC413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SC413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SC413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SC413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SC413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SC413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SC413( )
   {
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieId_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPiectr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiectr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiectr_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOb_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieMtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCol_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPiePDo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiePDo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiePDo_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieLoc_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieRap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieRap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieRap_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieDCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDCP_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieMue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMue_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtMetPieTurn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_83_Refreshing);
   }

   public void send_integrity_lvl_hashes1SC413( )
   {
   }

   public void send_integrity_lvl_hashes1SC412( )
   {
   }

   public void subsflControlProps_83413( )
   {
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_83_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_83_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_83_idx ;
      edtMetPieId_Internalname = "METPIEID_"+sGXsfl_83_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_83_idx ;
      edtMetPieOb_Internalname = "METPIEOB_"+sGXsfl_83_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_83_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_83_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_83_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_83_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_83_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_83_idx ;
      edtMetPieCol_Internalname = "METPIECOL_"+sGXsfl_83_idx ;
      edtMetPiePDo_Internalname = "METPIEPDO_"+sGXsfl_83_idx ;
      edtMetPieLoc_Internalname = "METPIELOC_"+sGXsfl_83_idx ;
      edtMetPieRap_Internalname = "METPIERAP_"+sGXsfl_83_idx ;
      edtMetPieDCP_Internalname = "METPIEDCP_"+sGXsfl_83_idx ;
      edtMetPieMue_Internalname = "METPIEMUE_"+sGXsfl_83_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_83_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_83_idx ;
      edtMetPieOpe_Internalname = "METPIEOPE_"+sGXsfl_83_idx ;
      edtMetPieTurn_Internalname = "METPIETURN_"+sGXsfl_83_idx ;
   }

   public void subsflControlProps_fel_83413( )
   {
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_83_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_83_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_83_fel_idx ;
      edtMetPieId_Internalname = "METPIEID_"+sGXsfl_83_fel_idx ;
      edtMetPiectr_Internalname = "METPIECTR_"+sGXsfl_83_fel_idx ;
      edtMetPieOb_Internalname = "METPIEOB_"+sGXsfl_83_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_83_fel_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_83_fel_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_83_fel_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_83_fel_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_83_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_83_fel_idx ;
      edtMetPieCol_Internalname = "METPIECOL_"+sGXsfl_83_fel_idx ;
      edtMetPiePDo_Internalname = "METPIEPDO_"+sGXsfl_83_fel_idx ;
      edtMetPieLoc_Internalname = "METPIELOC_"+sGXsfl_83_fel_idx ;
      edtMetPieRap_Internalname = "METPIERAP_"+sGXsfl_83_fel_idx ;
      edtMetPieDCP_Internalname = "METPIEDCP_"+sGXsfl_83_fel_idx ;
      edtMetPieMue_Internalname = "METPIEMUE_"+sGXsfl_83_fel_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_83_fel_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_83_fel_idx ;
      edtMetPieOpe_Internalname = "METPIEOPE_"+sGXsfl_83_fel_idx ;
      edtMetPieTurn_Internalname = "METPIETURN_"+sGXsfl_83_fel_idx ;
   }

   public void addRow1SC413( )
   {
      nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83413( ) ;
      sendRow1SC413( ) ;
   }

   public void sendRow1SC413( )
   {
      Gridpackinglist_piezaRow = GXWebRow.GetNew(context) ;
      if ( subGridpackinglist_pieza_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridpackinglist_pieza_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridpackinglist_pieza_Class, "") != 0 )
         {
            subGridpackinglist_pieza_Linesclass = subGridpackinglist_pieza_Class+"Odd" ;
         }
      }
      else if ( subGridpackinglist_pieza_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridpackinglist_pieza_Backstyle = (byte)(0) ;
         subGridpackinglist_pieza_Backcolor = subGridpackinglist_pieza_Allbackcolor ;
         if ( GXutil.strcmp(subGridpackinglist_pieza_Class, "") != 0 )
         {
            subGridpackinglist_pieza_Linesclass = subGridpackinglist_pieza_Class+"Uniform" ;
         }
      }
      else if ( subGridpackinglist_pieza_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridpackinglist_pieza_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridpackinglist_pieza_Class, "") != 0 )
         {
            subGridpackinglist_pieza_Linesclass = subGridpackinglist_pieza_Class+"Odd" ;
         }
         subGridpackinglist_pieza_Backcolor = (int)(0x0) ;
      }
      else if ( subGridpackinglist_pieza_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridpackinglist_pieza_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_83_idx) % (2))) == 0 )
         {
            subGridpackinglist_pieza_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridpackinglist_pieza_Class, "") != 0 )
            {
               subGridpackinglist_pieza_Linesclass = subGridpackinglist_pieza_Class+"Even" ;
            }
         }
         else
         {
            subGridpackinglist_pieza_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridpackinglist_pieza_Class, "") != 0 )
            {
               subGridpackinglist_pieza_Linesclass = subGridpackinglist_pieza_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieId_Internalname,GXutil.rtrim( A10784MetPieId),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieId_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiectr_Internalname,GXutil.rtrim( A10780MetPiectr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiectr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPiectr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieOb_Internalname,GXutil.rtrim( A10779MetPieOb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieOb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieOb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieFch_Internalname,localUtil.format(A5136MetPieFch, "99/99/99"),localUtil.format( A5136MetPieFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDsc_Internalname,GXutil.rtrim( A2846MetPieDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMtD_Enabled!=0) ? localUtil.format( A4910MetPieMtD, "ZZZZ9.99") : localUtil.format( A4910MetPieMtD, "ZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMtD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCol_Internalname,GXutil.rtrim( A4911MetPieCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiePDo_Internalname,GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPiePDo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiePDo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPiePDo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieLoc_Internalname,GXutil.rtrim( A4913MetPieLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieRap_Internalname,GXutil.rtrim( A4914MetPieRap),GXutil.rtrim( localUtil.format( A4914MetPieRap, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieRap_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieRap_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDCP_Internalname,GXutil.rtrim( A4915MetPieDCP),GXutil.rtrim( localUtil.format( A4915MetPieDCP, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDCP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDCP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMue_Internalname,GXutil.rtrim( A4916MetPieMue),GXutil.rtrim( localUtil.format( A4916MetPieMue, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMue_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMue_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfUl_Internalname,GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDfUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfUl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfUl_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieOpe_Internalname,GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieOpe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13005MetPieOpe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13005MetPieOpe), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieOpe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieOpe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_83_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_83_idx + "',83)\"" ;
      ROClassString = "Attribute" ;
      Gridpackinglist_piezaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieTurn_Internalname,GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieTurn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13006MetPieTurn), "9") : localUtil.format( DecimalUtil.doubleToDec(A13006MetPieTurn), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieTurn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieTurn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridpackinglist_piezaRow);
      send_integrity_lvl_hashes1SC413( ) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2813MetPieCod));
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10784MetPieId_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10784MetPieId));
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10780MetPiectr));
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10779MetPieOb));
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2846MetPieDsc));
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4911MetPieCol_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4911MetPieCol));
      GXCCtl = "Z4912MetPiePDo_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4913MetPieLoc_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4913MetPieLoc));
      GXCCtl = "Z4914MetPieRap_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4914MetPieRap));
      GXCCtl = "Z4915MetPieDCP_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4915MetPieDCP));
      GXCCtl = "Z4916MetPieMue_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4916MetPieMue));
      GXCCtl = "Z4917MetPieObs_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z4917MetPieObs);
      GXCCtl = "Z12994MetPieDfUl_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13005MetPieOpe_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13006MetPieTurn_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2815MetPieMet_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2814MetPieKil_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_413_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_413_" + sGXsfl_83_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEKIL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMET_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEID_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECTR_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOB_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEFCH_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDEF_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDSC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEEST_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMTD_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEPDO_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIELOC_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIERAP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieRap_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDCP_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMUE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMue_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOBS_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFUL_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOPE_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIETURN_"+sGXsfl_83_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridpackinglist_piezaContainer.AddRow(Gridpackinglist_piezaRow);
   }

   public void readRow1SC413( )
   {
      nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83413( ) ;
      edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEID_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPiectr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECTR_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOB_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPiePDo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEPDO_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIELOC_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieRap_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIERAP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDCP_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMue_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMUE_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOBS_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFUL_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieOpe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOPE_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieTurn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIETURN_"+sGXsfl_83_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEKIL_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieKil_Internalname ;
         wbErr = true ;
         A2814MetPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMET_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMet_Internalname ;
         wbErr = true ;
         A2815MetPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
      }
      A10784MetPieId = httpContext.cgiGet( edtMetPieId_Internalname) ;
      A10780MetPiectr = httpContext.cgiGet( edtMetPiectr_Internalname) ;
      A10779MetPieOb = httpContext.cgiGet( edtMetPieOb_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEANC_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieAnc_Internalname ;
         wbErr = true ;
         A6635MetPieAnc = (short)(0) ;
      }
      else
      {
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtMetPieFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "METPIEFCH_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieFch_Internalname ;
         wbErr = true ;
         A5136MetPieFch = GXutil.nullDate() ;
      }
      else
      {
         A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( edtMetPieFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEDEF_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDef_Internalname ;
         wbErr = true ;
         A4909MetPieDef = (short)(0) ;
      }
      else
      {
         A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2846MetPieDsc = httpContext.cgiGet( edtMetPieDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "METPIEEST_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieEst_Internalname ;
         wbErr = true ;
         A2816MetPieEst = (byte)(0) ;
      }
      else
      {
         A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMTD_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMtD_Internalname ;
         wbErr = true ;
         A4910MetPieMtD = DecimalUtil.ZERO ;
      }
      else
      {
         A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
      }
      A4911MetPieCol = httpContext.cgiGet( edtMetPieCol_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "METPIEPDO_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPiePDo_Internalname ;
         wbErr = true ;
         A4912MetPiePDo = 0 ;
      }
      else
      {
         A4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      A4913MetPieLoc = httpContext.cgiGet( edtMetPieLoc_Internalname) ;
      A4914MetPieRap = GXutil.upper( httpContext.cgiGet( edtMetPieRap_Internalname)) ;
      A4915MetPieDCP = GXutil.upper( httpContext.cgiGet( edtMetPieDCP_Internalname)) ;
      A4916MetPieMue = GXutil.upper( httpContext.cgiGet( edtMetPieMue_Internalname)) ;
      A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "METPIEDFUL_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfUl_Internalname ;
         wbErr = true ;
         A12994MetPieDfUl = (short)(0) ;
      }
      else
      {
         A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "METPIEOPE_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieOpe_Internalname ;
         wbErr = true ;
         A13005MetPieOpe = 0 ;
      }
      else
      {
         A13005MetPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( edtMetPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "METPIETURN_" + sGXsfl_83_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieTurn_Internalname ;
         wbErr = true ;
         A13006MetPieTurn = (byte)(0) ;
      }
      else
      {
         A13006MetPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_83_idx ;
      Z2813MetPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_83_idx ;
      Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_83_idx ;
      Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10784MetPieId_" + sGXsfl_83_idx ;
      Z10784MetPieId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10780MetPiectr_" + sGXsfl_83_idx ;
      Z10780MetPiectr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10779MetPieOb_" + sGXsfl_83_idx ;
      Z10779MetPieOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_83_idx ;
      Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_83_idx ;
      Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_83_idx ;
      Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_83_idx ;
      Z2846MetPieDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_83_idx ;
      Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_83_idx ;
      Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4911MetPieCol_" + sGXsfl_83_idx ;
      Z4911MetPieCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4912MetPiePDo_" + sGXsfl_83_idx ;
      Z4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z4913MetPieLoc_" + sGXsfl_83_idx ;
      Z4913MetPieLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4914MetPieRap_" + sGXsfl_83_idx ;
      Z4914MetPieRap = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4915MetPieDCP_" + sGXsfl_83_idx ;
      Z4915MetPieDCP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4916MetPieMue_" + sGXsfl_83_idx ;
      Z4916MetPieMue = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4917MetPieObs_" + sGXsfl_83_idx ;
      Z4917MetPieObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12994MetPieDfUl_" + sGXsfl_83_idx ;
      Z12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13005MetPieOpe_" + sGXsfl_83_idx ;
      Z13005MetPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13006MetPieTurn_" + sGXsfl_83_idx ;
      Z13006MetPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2815MetPieMet_" + sGXsfl_83_idx ;
      O2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2814MetPieKil_" + sGXsfl_83_idx ;
      O2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_83_idx ;
      nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_413_" + sGXsfl_83_idx ;
      nRcdExists_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_413_" + sGXsfl_83_idx ;
      nIsMod_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieCod_Enabled = edtMetPieCod_Enabled ;
   }

   public void confirmValues1SC0( )
   {
      nGXsfl_83_idx = 0 ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_83413( ) ;
      while ( nGXsfl_83_idx < nRC_GXsfl_83 )
      {
         nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_83413( ) ;
         httpContext.changePostValue( "Z2813MetPieCod_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z2813MetPieCod_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z2814MetPieKil_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z2814MetPieKil_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z2815MetPieMet_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z2815MetPieMet_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z10784MetPieId_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z10784MetPieId_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10784MetPieId_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z10780MetPiectr_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z10780MetPiectr_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10780MetPiectr_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z10779MetPieOb_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z10779MetPieOb_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10779MetPieOb_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z6635MetPieAnc_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z5136MetPieFch_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z5136MetPieFch_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4909MetPieDef_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4909MetPieDef_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z2846MetPieDsc_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z2816MetPieEst_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z2816MetPieEst_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4910MetPieMtD_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4911MetPieCol_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4911MetPieCol_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4911MetPieCol_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4912MetPiePDo_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4913MetPieLoc_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4914MetPieRap_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4914MetPieRap_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4914MetPieRap_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4915MetPieDCP_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4916MetPieMue_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4916MetPieMue_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4916MetPieMue_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z4917MetPieObs_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z4917MetPieObs_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z12994MetPieDfUl_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z13005MetPieOpe_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_83_idx) ;
         httpContext.changePostValue( "Z13006MetPieTurn_"+sGXsfl_83_idx, httpContext.cgiGet( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_83_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_83_idx) ;
      }
      httpContext.changePostValue( "O2815MetPieMet", httpContext.cgiGet( "T2815MetPieMet")) ;
      httpContext.deletePostValue( "T2815MetPieMet") ;
      httpContext.changePostValue( "O2814MetPieKil", httpContext.cgiGet( "T2814MetPieKil")) ;
      httpContext.deletePostValue( "T2814MetPieKil") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.packinglist", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "O2811MetTotMet", GXutil.ltrim( localUtil.ntoc( O2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2810MetTotKil", GXutil.ltrim( localUtil.ntoc( O2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2812MetTotPie", GXutil.ltrim( localUtil.ntoc( O2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_83", GXutil.ltrim( localUtil.ntoc( nGXsfl_83_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.produccion.packinglist", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.PackingList" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Packing List", "") ;
   }

   public void initializeNonKey1SC412( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2812MetTotPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
      A2811MetTotMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      A2810MetTotKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2811MetTotMet = A2811MetTotMet ;
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
      O2810MetTotKil = A2810MetTotKil ;
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      O2812MetTotPie = A2812MetTotPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
   }

   public void initAll1SC412( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2809MetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1SC412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1SC413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A10784MetPieId = "" ;
      A10780MetPiectr = "" ;
      A10779MetPieOb = "" ;
      A6635MetPieAnc = (short)(0) ;
      A5136MetPieFch = GXutil.nullDate() ;
      A4909MetPieDef = (short)(0) ;
      A2846MetPieDsc = "" ;
      A2816MetPieEst = (byte)(0) ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4911MetPieCol = "" ;
      A4912MetPiePDo = 0 ;
      A4913MetPieLoc = "" ;
      A4914MetPieRap = "" ;
      A4915MetPieDCP = "" ;
      A4916MetPieMue = "" ;
      A4917MetPieObs = "" ;
      A12994MetPieDfUl = (short)(0) ;
      A13005MetPieOpe = 0 ;
      A13006MetPieTurn = (byte)(0) ;
      O2815MetPieMet = A2815MetPieMet ;
      O2814MetPieKil = A2814MetPieKil ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z6635MetPieAnc = (short)(0) ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z4909MetPieDef = (short)(0) ;
      Z2846MetPieDsc = "" ;
      Z2816MetPieEst = (byte)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z4911MetPieCol = "" ;
      Z4912MetPiePDo = 0 ;
      Z4913MetPieLoc = "" ;
      Z4914MetPieRap = "" ;
      Z4915MetPieDCP = "" ;
      Z4916MetPieMue = "" ;
      Z4917MetPieObs = "" ;
      Z12994MetPieDfUl = (short)(0) ;
      Z13005MetPieOpe = 0 ;
      Z13006MetPieTurn = (byte)(0) ;
   }

   public void initAll1SC413( )
   {
      A2813MetPieCod = "" ;
      initializeNonKey1SC413( ) ;
   }

   public void standaloneModalInsert1SC413( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415114983", true, true);
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
      httpContext.AddJavascriptSource("produccion/packinglist.js", "?202682415114983", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties413( )
   {
      edtMetPieCod_Enabled = defedtMetPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_83_Refreshing);
   }

   public void startgridcontrol83( )
   {
      Gridpackinglist_piezaContainer.AddObjectProperty("GridName", "Gridpackinglist_pieza");
      Gridpackinglist_piezaContainer.AddObjectProperty("Header", subGridpackinglist_pieza_Header);
      Gridpackinglist_piezaContainer.AddObjectProperty("Class", "Grid");
      Gridpackinglist_piezaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("CmpContext", "");
      Gridpackinglist_piezaContainer.AddObjectProperty("InMasterPage", "false");
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A10784MetPieId));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A10780MetPiectr));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiectr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A10779MetPieOb));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", localUtil.format(A5136MetPieFch, "99/99/99"));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A2846MetPieDsc));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A4911MetPieCol));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A4913MetPieLoc));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A4914MetPieRap));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieRap_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A4915MetPieDCP));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.rtrim( A4916MetPieMue));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMue_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", A4917MetPieObs);
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridpackinglist_piezaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddColumnProperties(Gridpackinglist_piezaColumn);
      Gridpackinglist_piezaContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridpackinglist_piezaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridpackinglist_pieza_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtMetTotPie_Internalname = "METTOTPIE" ;
      edtMetTotMet_Internalname = "METTOTMET" ;
      edtMetTotKil_Internalname = "METTOTKIL" ;
      lblTitlepieza_Internalname = "TITLEPIEZA" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieId_Internalname = "METPIEID" ;
      edtMetPiectr_Internalname = "METPIECTR" ;
      edtMetPieOb_Internalname = "METPIEOB" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieFch_Internalname = "METPIEFCH" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      edtMetPieDsc_Internalname = "METPIEDSC" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      edtMetPieCol_Internalname = "METPIECOL" ;
      edtMetPiePDo_Internalname = "METPIEPDO" ;
      edtMetPieLoc_Internalname = "METPIELOC" ;
      edtMetPieRap_Internalname = "METPIERAP" ;
      edtMetPieDCP_Internalname = "METPIEDCP" ;
      edtMetPieMue_Internalname = "METPIEMUE" ;
      edtMetPieObs_Internalname = "METPIEOBS" ;
      edtMetPieDfUl_Internalname = "METPIEDFUL" ;
      edtMetPieOpe_Internalname = "METPIEOPE" ;
      edtMetPieTurn_Internalname = "METPIETURN" ;
      divPiezatable_Internalname = "PIEZATABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridpackinglist_pieza_Internalname = "GRIDPACKINGLIST_PIEZA" ;
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
      subGridpackinglist_pieza_Allowcollapsing = (byte)(0) ;
      subGridpackinglist_pieza_Allowselection = (byte)(0) ;
      subGridpackinglist_pieza_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Packing List", "") );
      edtMetPieTurn_Jsonclick = "" ;
      edtMetPieOpe_Jsonclick = "" ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieMue_Jsonclick = "" ;
      edtMetPieDCP_Jsonclick = "" ;
      edtMetPieRap_Jsonclick = "" ;
      edtMetPieLoc_Jsonclick = "" ;
      edtMetPiePDo_Jsonclick = "" ;
      edtMetPieCol_Jsonclick = "" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieDsc_Jsonclick = "" ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieFch_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieOb_Jsonclick = "" ;
      edtMetPiectr_Jsonclick = "" ;
      edtMetPieId_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      subGridpackinglist_pieza_Class = "Grid" ;
      subGridpackinglist_pieza_Backcolorstyle = (byte)(0) ;
      edtMetPieTurn_Enabled = 1 ;
      edtMetPieOpe_Enabled = 1 ;
      edtMetPieDfUl_Enabled = 1 ;
      edtMetPieObs_Enabled = 1 ;
      edtMetPieMue_Enabled = 1 ;
      edtMetPieDCP_Enabled = 1 ;
      edtMetPieRap_Enabled = 1 ;
      edtMetPieLoc_Enabled = 1 ;
      edtMetPiePDo_Enabled = 1 ;
      edtMetPieCol_Enabled = 1 ;
      edtMetPieMtD_Enabled = 1 ;
      edtMetPieEst_Enabled = 1 ;
      edtMetPieDsc_Enabled = 1 ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieFch_Enabled = 1 ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPieOb_Enabled = 1 ;
      edtMetPiectr_Enabled = 1 ;
      edtMetPieId_Enabled = 1 ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMetTotKil_Jsonclick = "" ;
      edtMetTotKil_Enabled = 0 ;
      edtMetTotMet_Jsonclick = "" ;
      edtMetTotMet_Enabled = 0 ;
      edtMetTotPie_Jsonclick = "" ;
      edtMetTotPie_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
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

   public void gxnrgridpackinglist_pieza_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_83413( ) ;
      while ( nGXsfl_83_idx <= nRC_GXsfl_83 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SC413( ) ;
         standaloneModal1SC413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SC413( ) ;
         nGXsfl_83_idx = (int)(nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_83413( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridpackinglist_piezaContainer)) ;
      /* End function gxnrGridpackinglist_pieza_newrow */
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
      /* Using cursor T01SC21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SC21_A407EmprNom[0] ;
      n407EmprNom = T01SC21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      /* Using cursor T01SC33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(27);
      /* Using cursor T01SC23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A2812MetTotPie = T01SC23_A2812MetTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = T01SC23_A2811MetTotMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = T01SC23_A2810MetTotKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      else
      {
         A2812MetTotPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2812MetTotPie), 4, 0));
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrimstr( A2811MetTotMet, 9, 2));
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrimstr( A2810MetTotKil, 9, 2));
      }
      pr_default.close(17);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01SC21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SC21_A407EmprNom[0] ;
      n407EmprNom = T01SC21_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01SC33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(27);
      /* Using cursor T01SC23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A2812MetTotPie = T01SC23_A2812MetTotPie[0] ;
         A2811MetTotMet = T01SC23_A2811MetTotMet[0] ;
         A2810MetTotKil = T01SC23_A2810MetTotKil[0] ;
      }
      else
      {
         A2812MetTotPie = (short)(0) ;
         A2811MetTotMet = DecimalUtil.doubleToDec(0) ;
         A2810MetTotKil = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2812MetTotPie", GXutil.ltrim( localUtil.ntoc( A2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2811MetTotMet", GXutil.ltrim( localUtil.ntoc( A2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2810MetTotKil", GXutil.ltrim( localUtil.ntoc( A2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2812MetTotPie", GXutil.ltrim( localUtil.ntoc( Z2812MetTotPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2811MetTotMet", GXutil.ltrim( localUtil.ntoc( Z2811MetTotMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2810MetTotKil", GXutil.ltrim( localUtil.ntoc( Z2810MetTotKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2811MetTotMet", GXutil.ltrim( localUtil.ntoc( O2811MetTotMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2810MetTotKil", GXutil.ltrim( localUtil.ntoc( O2810MetTotKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2812MetTotPie", GXutil.ltrim( localUtil.ntoc( O2812MetTotPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2812MetTotPie',fld:'METTOTPIE',pic:'ZZZ9'},{av:'A2811MetTotMet',fld:'METTOTMET',pic:'ZZZZZ9.99'},{av:'A2810MetTotKil',fld:'METTOTKIL',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z2812MetTotPie'},{av:'Z2811MetTotMet'},{av:'Z2810MetTotKil'},{av:'O2811MetTotMet'},{av:'O2810MetTotKil'},{av:'O2812MetTotPie'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("VALID_METPIEKIL","{handler:'valid_Metpiekil',iparms:[]");
      setEventMetadata("VALID_METPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_METPIEMET","{handler:'valid_Metpiemet',iparms:[]");
      setEventMetadata("VALID_METPIEMET",",oparms:[]}");
      setEventMetadata("VALID_METPIERAP","{handler:'valid_Metpierap',iparms:[]");
      setEventMetadata("VALID_METPIERAP",",oparms:[]}");
      setEventMetadata("VALID_METPIEDCP","{handler:'valid_Metpiedcp',iparms:[]");
      setEventMetadata("VALID_METPIEDCP",",oparms:[]}");
      setEventMetadata("VALID_METPIEMUE","{handler:'valid_Metpiemue',iparms:[]");
      setEventMetadata("VALID_METPIEMUE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metpieturn',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      O2811MetTotMet = DecimalUtil.ZERO ;
      O2810MetTotKil = DecimalUtil.ZERO ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z10784MetPieId = "" ;
      Z10780MetPiectr = "" ;
      Z10779MetPieOb = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z2846MetPieDsc = "" ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z4911MetPieCol = "" ;
      Z4913MetPieLoc = "" ;
      Z4914MetPieRap = "" ;
      Z4915MetPieDCP = "" ;
      Z4916MetPieMue = "" ;
      Z4917MetPieObs = "" ;
      O2815MetPieMet = DecimalUtil.ZERO ;
      O2814MetPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
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
      A2811MetTotMet = DecimalUtil.ZERO ;
      A2810MetTotKil = DecimalUtil.ZERO ;
      lblTitlepieza_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridpackinglist_piezaContainer = new com.genexus.webpanels.GXWebGrid(context);
      B2811MetTotMet = DecimalUtil.ZERO ;
      B2810MetTotKil = DecimalUtil.ZERO ;
      sMode413 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s2811MetTotMet = DecimalUtil.ZERO ;
      s2810MetTotKil = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A10784MetPieId = "" ;
      A10780MetPiectr = "" ;
      A10779MetPieOb = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A2846MetPieDsc = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4911MetPieCol = "" ;
      A4913MetPieLoc = "" ;
      A4914MetPieRap = "" ;
      A4915MetPieDCP = "" ;
      A4916MetPieMue = "" ;
      A4917MetPieObs = "" ;
      T2815MetPieMet = DecimalUtil.ZERO ;
      T2814MetPieKil = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z2811MetTotMet = DecimalUtil.ZERO ;
      Z2810MetTotKil = DecimalUtil.ZERO ;
      T01SC11_A2809MetTerCod = new String[] {""} ;
      T01SC11_A407EmprNom = new String[] {""} ;
      T01SC11_n407EmprNom = new boolean[] {false} ;
      T01SC11_A396EmprCod = new String[] {""} ;
      T01SC11_A129BarCod = new int[1] ;
      T01SC11_A132BarCodReo = new byte[1] ;
      T01SC11_A130BarCodPar = new String[] {""} ;
      T01SC11_A2812MetTotPie = new short[1] ;
      T01SC11_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC11_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC6_A407EmprNom = new String[] {""} ;
      T01SC6_n407EmprNom = new boolean[] {false} ;
      T01SC7_A396EmprCod = new String[] {""} ;
      T01SC9_A2812MetTotPie = new short[1] ;
      T01SC9_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC9_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC12_A407EmprNom = new String[] {""} ;
      T01SC12_n407EmprNom = new boolean[] {false} ;
      T01SC13_A396EmprCod = new String[] {""} ;
      T01SC15_A2812MetTotPie = new short[1] ;
      T01SC15_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC15_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC16_A396EmprCod = new String[] {""} ;
      T01SC16_A2809MetTerCod = new String[] {""} ;
      T01SC16_A129BarCod = new int[1] ;
      T01SC16_A132BarCodReo = new byte[1] ;
      T01SC16_A130BarCodPar = new String[] {""} ;
      T01SC5_A2809MetTerCod = new String[] {""} ;
      T01SC5_A396EmprCod = new String[] {""} ;
      T01SC5_A129BarCod = new int[1] ;
      T01SC5_A132BarCodReo = new byte[1] ;
      T01SC5_A130BarCodPar = new String[] {""} ;
      sMode412 = "" ;
      T01SC17_A396EmprCod = new String[] {""} ;
      T01SC17_A2809MetTerCod = new String[] {""} ;
      T01SC17_A129BarCod = new int[1] ;
      T01SC17_A132BarCodReo = new byte[1] ;
      T01SC17_A130BarCodPar = new String[] {""} ;
      T01SC18_A396EmprCod = new String[] {""} ;
      T01SC18_A2809MetTerCod = new String[] {""} ;
      T01SC18_A129BarCod = new int[1] ;
      T01SC18_A132BarCodReo = new byte[1] ;
      T01SC18_A130BarCodPar = new String[] {""} ;
      T01SC4_A2809MetTerCod = new String[] {""} ;
      T01SC4_A396EmprCod = new String[] {""} ;
      T01SC4_A129BarCod = new int[1] ;
      T01SC4_A132BarCodReo = new byte[1] ;
      T01SC4_A130BarCodPar = new String[] {""} ;
      T01SC21_A407EmprNom = new String[] {""} ;
      T01SC21_n407EmprNom = new boolean[] {false} ;
      T01SC23_A2812MetTotPie = new short[1] ;
      T01SC23_A2811MetTotMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC23_A2810MetTotKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC24_A396EmprCod = new String[] {""} ;
      T01SC24_A2809MetTerCod = new String[] {""} ;
      T01SC24_A129BarCod = new int[1] ;
      T01SC24_A132BarCodReo = new byte[1] ;
      T01SC24_A130BarCodPar = new String[] {""} ;
      T01SC24_A2813MetPieCod = new String[] {""} ;
      T01SC24_A12995MetPieDfLi = new short[1] ;
      T01SC25_A396EmprCod = new String[] {""} ;
      T01SC25_A2809MetTerCod = new String[] {""} ;
      T01SC25_A129BarCod = new int[1] ;
      T01SC25_A132BarCodReo = new byte[1] ;
      T01SC25_A130BarCodPar = new String[] {""} ;
      T01SC26_A2809MetTerCod = new String[] {""} ;
      T01SC26_A129BarCod = new int[1] ;
      T01SC26_A132BarCodReo = new byte[1] ;
      T01SC26_A130BarCodPar = new String[] {""} ;
      T01SC26_A2813MetPieCod = new String[] {""} ;
      T01SC26_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC26_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC26_A10784MetPieId = new String[] {""} ;
      T01SC26_A10780MetPiectr = new String[] {""} ;
      T01SC26_A10779MetPieOb = new String[] {""} ;
      T01SC26_A6635MetPieAnc = new short[1] ;
      T01SC26_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SC26_A4909MetPieDef = new short[1] ;
      T01SC26_A2846MetPieDsc = new String[] {""} ;
      T01SC26_A2816MetPieEst = new byte[1] ;
      T01SC26_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC26_A4911MetPieCol = new String[] {""} ;
      T01SC26_A4912MetPiePDo = new long[1] ;
      T01SC26_A4913MetPieLoc = new String[] {""} ;
      T01SC26_A4914MetPieRap = new String[] {""} ;
      T01SC26_A4915MetPieDCP = new String[] {""} ;
      T01SC26_A4916MetPieMue = new String[] {""} ;
      T01SC26_A4917MetPieObs = new String[] {""} ;
      T01SC26_A12994MetPieDfUl = new short[1] ;
      T01SC26_A13005MetPieOpe = new int[1] ;
      T01SC26_A13006MetPieTurn = new byte[1] ;
      T01SC26_A396EmprCod = new String[] {""} ;
      T01SC27_A396EmprCod = new String[] {""} ;
      T01SC27_A2809MetTerCod = new String[] {""} ;
      T01SC27_A129BarCod = new int[1] ;
      T01SC27_A132BarCodReo = new byte[1] ;
      T01SC27_A130BarCodPar = new String[] {""} ;
      T01SC27_A2813MetPieCod = new String[] {""} ;
      T01SC3_A2809MetTerCod = new String[] {""} ;
      T01SC3_A129BarCod = new int[1] ;
      T01SC3_A132BarCodReo = new byte[1] ;
      T01SC3_A130BarCodPar = new String[] {""} ;
      T01SC3_A2813MetPieCod = new String[] {""} ;
      T01SC3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC3_A10784MetPieId = new String[] {""} ;
      T01SC3_A10780MetPiectr = new String[] {""} ;
      T01SC3_A10779MetPieOb = new String[] {""} ;
      T01SC3_A6635MetPieAnc = new short[1] ;
      T01SC3_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SC3_A4909MetPieDef = new short[1] ;
      T01SC3_A2846MetPieDsc = new String[] {""} ;
      T01SC3_A2816MetPieEst = new byte[1] ;
      T01SC3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC3_A4911MetPieCol = new String[] {""} ;
      T01SC3_A4912MetPiePDo = new long[1] ;
      T01SC3_A4913MetPieLoc = new String[] {""} ;
      T01SC3_A4914MetPieRap = new String[] {""} ;
      T01SC3_A4915MetPieDCP = new String[] {""} ;
      T01SC3_A4916MetPieMue = new String[] {""} ;
      T01SC3_A4917MetPieObs = new String[] {""} ;
      T01SC3_A12994MetPieDfUl = new short[1] ;
      T01SC3_A13005MetPieOpe = new int[1] ;
      T01SC3_A13006MetPieTurn = new byte[1] ;
      T01SC3_A396EmprCod = new String[] {""} ;
      T01SC2_A2809MetTerCod = new String[] {""} ;
      T01SC2_A129BarCod = new int[1] ;
      T01SC2_A132BarCodReo = new byte[1] ;
      T01SC2_A130BarCodPar = new String[] {""} ;
      T01SC2_A2813MetPieCod = new String[] {""} ;
      T01SC2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC2_A10784MetPieId = new String[] {""} ;
      T01SC2_A10780MetPiectr = new String[] {""} ;
      T01SC2_A10779MetPieOb = new String[] {""} ;
      T01SC2_A6635MetPieAnc = new short[1] ;
      T01SC2_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01SC2_A4909MetPieDef = new short[1] ;
      T01SC2_A2846MetPieDsc = new String[] {""} ;
      T01SC2_A2816MetPieEst = new byte[1] ;
      T01SC2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SC2_A4911MetPieCol = new String[] {""} ;
      T01SC2_A4912MetPiePDo = new long[1] ;
      T01SC2_A4913MetPieLoc = new String[] {""} ;
      T01SC2_A4914MetPieRap = new String[] {""} ;
      T01SC2_A4915MetPieDCP = new String[] {""} ;
      T01SC2_A4916MetPieMue = new String[] {""} ;
      T01SC2_A4917MetPieObs = new String[] {""} ;
      T01SC2_A12994MetPieDfUl = new short[1] ;
      T01SC2_A13005MetPieOpe = new int[1] ;
      T01SC2_A13006MetPieTurn = new byte[1] ;
      T01SC2_A396EmprCod = new String[] {""} ;
      T01SC31_A396EmprCod = new String[] {""} ;
      T01SC31_A2809MetTerCod = new String[] {""} ;
      T01SC31_A129BarCod = new int[1] ;
      T01SC31_A132BarCodReo = new byte[1] ;
      T01SC31_A130BarCodPar = new String[] {""} ;
      T01SC31_A2813MetPieCod = new String[] {""} ;
      T01SC31_A12995MetPieDfLi = new short[1] ;
      T01SC32_A396EmprCod = new String[] {""} ;
      T01SC32_A2809MetTerCod = new String[] {""} ;
      T01SC32_A129BarCod = new int[1] ;
      T01SC32_A132BarCodReo = new byte[1] ;
      T01SC32_A130BarCodPar = new String[] {""} ;
      T01SC32_A2813MetPieCod = new String[] {""} ;
      Gridpackinglist_piezaRow = new com.genexus.webpanels.GXWebRow();
      subGridpackinglist_pieza_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridpackinglist_piezaColumn = new com.genexus.webpanels.GXWebColumn();
      T01SC33_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ2811MetTotMet = DecimalUtil.ZERO ;
      ZZ2810MetTotKil = DecimalUtil.ZERO ;
      ZO2811MetTotMet = DecimalUtil.ZERO ;
      ZO2810MetTotKil = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist__default(),
         new Object[] {
             new Object[] {
            T01SC2_A2809MetTerCod, T01SC2_A129BarCod, T01SC2_A132BarCodReo, T01SC2_A130BarCodPar, T01SC2_A2813MetPieCod, T01SC2_A2814MetPieKil, T01SC2_A2815MetPieMet, T01SC2_A10784MetPieId, T01SC2_A10780MetPiectr, T01SC2_A10779MetPieOb,
            T01SC2_A6635MetPieAnc, T01SC2_A5136MetPieFch, T01SC2_A4909MetPieDef, T01SC2_A2846MetPieDsc, T01SC2_A2816MetPieEst, T01SC2_A4910MetPieMtD, T01SC2_A4911MetPieCol, T01SC2_A4912MetPiePDo, T01SC2_A4913MetPieLoc, T01SC2_A4914MetPieRap,
            T01SC2_A4915MetPieDCP, T01SC2_A4916MetPieMue, T01SC2_A4917MetPieObs, T01SC2_A12994MetPieDfUl, T01SC2_A13005MetPieOpe, T01SC2_A13006MetPieTurn, T01SC2_A396EmprCod
            }
            , new Object[] {
            T01SC3_A2809MetTerCod, T01SC3_A129BarCod, T01SC3_A132BarCodReo, T01SC3_A130BarCodPar, T01SC3_A2813MetPieCod, T01SC3_A2814MetPieKil, T01SC3_A2815MetPieMet, T01SC3_A10784MetPieId, T01SC3_A10780MetPiectr, T01SC3_A10779MetPieOb,
            T01SC3_A6635MetPieAnc, T01SC3_A5136MetPieFch, T01SC3_A4909MetPieDef, T01SC3_A2846MetPieDsc, T01SC3_A2816MetPieEst, T01SC3_A4910MetPieMtD, T01SC3_A4911MetPieCol, T01SC3_A4912MetPiePDo, T01SC3_A4913MetPieLoc, T01SC3_A4914MetPieRap,
            T01SC3_A4915MetPieDCP, T01SC3_A4916MetPieMue, T01SC3_A4917MetPieObs, T01SC3_A12994MetPieDfUl, T01SC3_A13005MetPieOpe, T01SC3_A13006MetPieTurn, T01SC3_A396EmprCod
            }
            , new Object[] {
            T01SC4_A2809MetTerCod, T01SC4_A396EmprCod, T01SC4_A129BarCod, T01SC4_A132BarCodReo, T01SC4_A130BarCodPar
            }
            , new Object[] {
            T01SC5_A2809MetTerCod, T01SC5_A396EmprCod, T01SC5_A129BarCod, T01SC5_A132BarCodReo, T01SC5_A130BarCodPar
            }
            , new Object[] {
            T01SC6_A407EmprNom, T01SC6_n407EmprNom
            }
            , new Object[] {
            T01SC7_A396EmprCod
            }
            , new Object[] {
            T01SC9_A2812MetTotPie, T01SC9_A2811MetTotMet, T01SC9_A2810MetTotKil
            }
            , new Object[] {
            T01SC11_A2809MetTerCod, T01SC11_A407EmprNom, T01SC11_n407EmprNom, T01SC11_A396EmprCod, T01SC11_A129BarCod, T01SC11_A132BarCodReo, T01SC11_A130BarCodPar, T01SC11_A2812MetTotPie, T01SC11_A2811MetTotMet, T01SC11_A2810MetTotKil
            }
            , new Object[] {
            T01SC12_A407EmprNom, T01SC12_n407EmprNom
            }
            , new Object[] {
            T01SC13_A396EmprCod
            }
            , new Object[] {
            T01SC15_A2812MetTotPie, T01SC15_A2811MetTotMet, T01SC15_A2810MetTotKil
            }
            , new Object[] {
            T01SC16_A396EmprCod, T01SC16_A2809MetTerCod, T01SC16_A129BarCod, T01SC16_A132BarCodReo, T01SC16_A130BarCodPar
            }
            , new Object[] {
            T01SC17_A396EmprCod, T01SC17_A2809MetTerCod, T01SC17_A129BarCod, T01SC17_A132BarCodReo, T01SC17_A130BarCodPar
            }
            , new Object[] {
            T01SC18_A396EmprCod, T01SC18_A2809MetTerCod, T01SC18_A129BarCod, T01SC18_A132BarCodReo, T01SC18_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SC21_A407EmprNom, T01SC21_n407EmprNom
            }
            , new Object[] {
            T01SC23_A2812MetTotPie, T01SC23_A2811MetTotMet, T01SC23_A2810MetTotKil
            }
            , new Object[] {
            T01SC24_A396EmprCod, T01SC24_A2809MetTerCod, T01SC24_A129BarCod, T01SC24_A132BarCodReo, T01SC24_A130BarCodPar, T01SC24_A2813MetPieCod, T01SC24_A12995MetPieDfLi
            }
            , new Object[] {
            T01SC25_A396EmprCod, T01SC25_A2809MetTerCod, T01SC25_A129BarCod, T01SC25_A132BarCodReo, T01SC25_A130BarCodPar
            }
            , new Object[] {
            T01SC26_A2809MetTerCod, T01SC26_A129BarCod, T01SC26_A132BarCodReo, T01SC26_A130BarCodPar, T01SC26_A2813MetPieCod, T01SC26_A2814MetPieKil, T01SC26_A2815MetPieMet, T01SC26_A10784MetPieId, T01SC26_A10780MetPiectr, T01SC26_A10779MetPieOb,
            T01SC26_A6635MetPieAnc, T01SC26_A5136MetPieFch, T01SC26_A4909MetPieDef, T01SC26_A2846MetPieDsc, T01SC26_A2816MetPieEst, T01SC26_A4910MetPieMtD, T01SC26_A4911MetPieCol, T01SC26_A4912MetPiePDo, T01SC26_A4913MetPieLoc, T01SC26_A4914MetPieRap,
            T01SC26_A4915MetPieDCP, T01SC26_A4916MetPieMue, T01SC26_A4917MetPieObs, T01SC26_A12994MetPieDfUl, T01SC26_A13005MetPieOpe, T01SC26_A13006MetPieTurn, T01SC26_A396EmprCod
            }
            , new Object[] {
            T01SC27_A396EmprCod, T01SC27_A2809MetTerCod, T01SC27_A129BarCod, T01SC27_A132BarCodReo, T01SC27_A130BarCodPar, T01SC27_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SC31_A396EmprCod, T01SC31_A2809MetTerCod, T01SC31_A129BarCod, T01SC31_A132BarCodReo, T01SC31_A130BarCodPar, T01SC31_A2813MetPieCod, T01SC31_A12995MetPieDfLi
            }
            , new Object[] {
            T01SC32_A396EmprCod, T01SC32_A2809MetTerCod, T01SC32_A129BarCod, T01SC32_A132BarCodReo, T01SC32_A130BarCodPar, T01SC32_A2813MetPieCod
            }
            , new Object[] {
            T01SC33_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte Z13006MetPieTurn ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2816MetPieEst ;
   private byte A13006MetPieTurn ;
   private byte Gx_BScreen ;
   private byte subGridpackinglist_pieza_Backcolorstyle ;
   private byte subGridpackinglist_pieza_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridpackinglist_pieza_Allowselection ;
   private byte subGridpackinglist_pieza_Allowhovering ;
   private byte subGridpackinglist_pieza_Allowcollapsing ;
   private byte subGridpackinglist_pieza_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short O2812MetTotPie ;
   private short Z6635MetPieAnc ;
   private short Z4909MetPieDef ;
   private short Z12994MetPieDfUl ;
   private short nRcdDeleted_413 ;
   private short nRcdExists_413 ;
   private short nIsMod_413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2812MetTotPie ;
   private short nBlankRcdCount413 ;
   private short RcdFound413 ;
   private short B2812MetTotPie ;
   private short nBlankRcdUsr413 ;
   private short s2812MetTotPie ;
   private short A6635MetPieAnc ;
   private short A4909MetPieDef ;
   private short A12994MetPieDfUl ;
   private short Z2812MetTotPie ;
   private short RcdFound412 ;
   private short nIsDirty_412 ;
   private short nIsDirty_413 ;
   private short ZZ2812MetTotPie ;
   private short ZO2812MetTotPie ;
   private int Z129BarCod ;
   private int nRC_GXsfl_83 ;
   private int nGXsfl_83_idx=1 ;
   private int Z13005MetPieOpe ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMetTotPie_Enabled ;
   private int edtMetTotMet_Enabled ;
   private int edtMetTotKil_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieId_Enabled ;
   private int edtMetPiectr_Enabled ;
   private int edtMetPieOb_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieFch_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPieDsc_Enabled ;
   private int edtMetPieEst_Enabled ;
   private int edtMetPieMtD_Enabled ;
   private int edtMetPieCol_Enabled ;
   private int edtMetPiePDo_Enabled ;
   private int edtMetPieLoc_Enabled ;
   private int edtMetPieRap_Enabled ;
   private int edtMetPieDCP_Enabled ;
   private int edtMetPieMue_Enabled ;
   private int edtMetPieObs_Enabled ;
   private int edtMetPieDfUl_Enabled ;
   private int edtMetPieOpe_Enabled ;
   private int edtMetPieTurn_Enabled ;
   private int fRowAdded ;
   private int A13005MetPieOpe ;
   private int GX_JID ;
   private int subGridpackinglist_pieza_Backcolor ;
   private int subGridpackinglist_pieza_Allbackcolor ;
   private int defedtMetPieCod_Enabled ;
   private int idxLst ;
   private int subGridpackinglist_pieza_Selectedindex ;
   private int subGridpackinglist_pieza_Selectioncolor ;
   private int subGridpackinglist_pieza_Hoveringcolor ;
   private int ZZ129BarCod ;
   private long Z4912MetPiePDo ;
   private long GRIDPACKINGLIST_PIEZA_nFirstRecordOnPage ;
   private long A4912MetPiePDo ;
   private java.math.BigDecimal O2811MetTotMet ;
   private java.math.BigDecimal O2810MetTotKil ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z4910MetPieMtD ;
   private java.math.BigDecimal O2815MetPieMet ;
   private java.math.BigDecimal O2814MetPieKil ;
   private java.math.BigDecimal A2811MetTotMet ;
   private java.math.BigDecimal A2810MetTotKil ;
   private java.math.BigDecimal B2811MetTotMet ;
   private java.math.BigDecimal B2810MetTotKil ;
   private java.math.BigDecimal s2811MetTotMet ;
   private java.math.BigDecimal s2810MetTotKil ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal T2815MetPieMet ;
   private java.math.BigDecimal T2814MetPieKil ;
   private java.math.BigDecimal Z2811MetTotMet ;
   private java.math.BigDecimal Z2810MetTotKil ;
   private java.math.BigDecimal ZZ2811MetTotMet ;
   private java.math.BigDecimal ZZ2810MetTotKil ;
   private java.math.BigDecimal ZO2811MetTotMet ;
   private java.math.BigDecimal ZO2810MetTotKil ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z10784MetPieId ;
   private String Z10780MetPiectr ;
   private String Z10779MetPieOb ;
   private String Z2846MetPieDsc ;
   private String Z4911MetPieCol ;
   private String Z4913MetPieLoc ;
   private String Z4914MetPieRap ;
   private String Z4915MetPieDCP ;
   private String Z4916MetPieMue ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_83_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetTotPie_Internalname ;
   private String edtMetTotPie_Jsonclick ;
   private String edtMetTotMet_Internalname ;
   private String edtMetTotMet_Jsonclick ;
   private String edtMetTotKil_Internalname ;
   private String edtMetTotKil_Jsonclick ;
   private String divPiezatable_Internalname ;
   private String lblTitlepieza_Internalname ;
   private String lblTitlepieza_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode413 ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieId_Internalname ;
   private String edtMetPiectr_Internalname ;
   private String edtMetPieOb_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieFch_Internalname ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPieDsc_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieCol_Internalname ;
   private String edtMetPiePDo_Internalname ;
   private String edtMetPieLoc_Internalname ;
   private String edtMetPieRap_Internalname ;
   private String edtMetPieDCP_Internalname ;
   private String edtMetPieMue_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtMetPieDfUl_Internalname ;
   private String edtMetPieOpe_Internalname ;
   private String edtMetPieTurn_Internalname ;
   private String sStyleString ;
   private String subGridpackinglist_pieza_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2813MetPieCod ;
   private String A10784MetPieId ;
   private String A10780MetPiectr ;
   private String A10779MetPieOb ;
   private String A2846MetPieDsc ;
   private String A4911MetPieCol ;
   private String A4913MetPieLoc ;
   private String A4914MetPieRap ;
   private String A4915MetPieDCP ;
   private String A4916MetPieMue ;
   private String Z407EmprNom ;
   private String sMode412 ;
   private String sGXsfl_83_fel_idx="0001" ;
   private String subGridpackinglist_pieza_Class ;
   private String subGridpackinglist_pieza_Linesclass ;
   private String ROClassString ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieId_Jsonclick ;
   private String edtMetPiectr_Jsonclick ;
   private String edtMetPieOb_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieFch_Jsonclick ;
   private String edtMetPieDef_Jsonclick ;
   private String edtMetPieDsc_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPieCol_Jsonclick ;
   private String edtMetPiePDo_Jsonclick ;
   private String edtMetPieLoc_Jsonclick ;
   private String edtMetPieRap_Jsonclick ;
   private String edtMetPieDCP_Jsonclick ;
   private String edtMetPieMue_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
   private String edtMetPieDfUl_Jsonclick ;
   private String edtMetPieOpe_Jsonclick ;
   private String edtMetPieTurn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridpackinglist_pieza_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date A5136MetPieFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_83_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private String Z4917MetPieObs ;
   private String A4917MetPieObs ;
   private com.genexus.webpanels.GXWebGrid Gridpackinglist_piezaContainer ;
   private com.genexus.webpanels.GXWebRow Gridpackinglist_piezaRow ;
   private com.genexus.webpanels.GXWebColumn Gridpackinglist_piezaColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01SC11_A2809MetTerCod ;
   private String[] T01SC11_A407EmprNom ;
   private boolean[] T01SC11_n407EmprNom ;
   private String[] T01SC11_A396EmprCod ;
   private int[] T01SC11_A129BarCod ;
   private byte[] T01SC11_A132BarCodReo ;
   private String[] T01SC11_A130BarCodPar ;
   private short[] T01SC11_A2812MetTotPie ;
   private java.math.BigDecimal[] T01SC11_A2811MetTotMet ;
   private java.math.BigDecimal[] T01SC11_A2810MetTotKil ;
   private String[] T01SC6_A407EmprNom ;
   private boolean[] T01SC6_n407EmprNom ;
   private String[] T01SC7_A396EmprCod ;
   private short[] T01SC9_A2812MetTotPie ;
   private java.math.BigDecimal[] T01SC9_A2811MetTotMet ;
   private java.math.BigDecimal[] T01SC9_A2810MetTotKil ;
   private String[] T01SC12_A407EmprNom ;
   private boolean[] T01SC12_n407EmprNom ;
   private String[] T01SC13_A396EmprCod ;
   private short[] T01SC15_A2812MetTotPie ;
   private java.math.BigDecimal[] T01SC15_A2811MetTotMet ;
   private java.math.BigDecimal[] T01SC15_A2810MetTotKil ;
   private String[] T01SC16_A396EmprCod ;
   private String[] T01SC16_A2809MetTerCod ;
   private int[] T01SC16_A129BarCod ;
   private byte[] T01SC16_A132BarCodReo ;
   private String[] T01SC16_A130BarCodPar ;
   private String[] T01SC5_A2809MetTerCod ;
   private String[] T01SC5_A396EmprCod ;
   private int[] T01SC5_A129BarCod ;
   private byte[] T01SC5_A132BarCodReo ;
   private String[] T01SC5_A130BarCodPar ;
   private String[] T01SC17_A396EmprCod ;
   private String[] T01SC17_A2809MetTerCod ;
   private int[] T01SC17_A129BarCod ;
   private byte[] T01SC17_A132BarCodReo ;
   private String[] T01SC17_A130BarCodPar ;
   private String[] T01SC18_A396EmprCod ;
   private String[] T01SC18_A2809MetTerCod ;
   private int[] T01SC18_A129BarCod ;
   private byte[] T01SC18_A132BarCodReo ;
   private String[] T01SC18_A130BarCodPar ;
   private String[] T01SC4_A2809MetTerCod ;
   private String[] T01SC4_A396EmprCod ;
   private int[] T01SC4_A129BarCod ;
   private byte[] T01SC4_A132BarCodReo ;
   private String[] T01SC4_A130BarCodPar ;
   private String[] T01SC21_A407EmprNom ;
   private boolean[] T01SC21_n407EmprNom ;
   private short[] T01SC23_A2812MetTotPie ;
   private java.math.BigDecimal[] T01SC23_A2811MetTotMet ;
   private java.math.BigDecimal[] T01SC23_A2810MetTotKil ;
   private String[] T01SC24_A396EmprCod ;
   private String[] T01SC24_A2809MetTerCod ;
   private int[] T01SC24_A129BarCod ;
   private byte[] T01SC24_A132BarCodReo ;
   private String[] T01SC24_A130BarCodPar ;
   private String[] T01SC24_A2813MetPieCod ;
   private short[] T01SC24_A12995MetPieDfLi ;
   private String[] T01SC25_A396EmprCod ;
   private String[] T01SC25_A2809MetTerCod ;
   private int[] T01SC25_A129BarCod ;
   private byte[] T01SC25_A132BarCodReo ;
   private String[] T01SC25_A130BarCodPar ;
   private String[] T01SC26_A2809MetTerCod ;
   private int[] T01SC26_A129BarCod ;
   private byte[] T01SC26_A132BarCodReo ;
   private String[] T01SC26_A130BarCodPar ;
   private String[] T01SC26_A2813MetPieCod ;
   private java.math.BigDecimal[] T01SC26_A2814MetPieKil ;
   private java.math.BigDecimal[] T01SC26_A2815MetPieMet ;
   private String[] T01SC26_A10784MetPieId ;
   private String[] T01SC26_A10780MetPiectr ;
   private String[] T01SC26_A10779MetPieOb ;
   private short[] T01SC26_A6635MetPieAnc ;
   private java.util.Date[] T01SC26_A5136MetPieFch ;
   private short[] T01SC26_A4909MetPieDef ;
   private String[] T01SC26_A2846MetPieDsc ;
   private byte[] T01SC26_A2816MetPieEst ;
   private java.math.BigDecimal[] T01SC26_A4910MetPieMtD ;
   private String[] T01SC26_A4911MetPieCol ;
   private long[] T01SC26_A4912MetPiePDo ;
   private String[] T01SC26_A4913MetPieLoc ;
   private String[] T01SC26_A4914MetPieRap ;
   private String[] T01SC26_A4915MetPieDCP ;
   private String[] T01SC26_A4916MetPieMue ;
   private String[] T01SC26_A4917MetPieObs ;
   private short[] T01SC26_A12994MetPieDfUl ;
   private int[] T01SC26_A13005MetPieOpe ;
   private byte[] T01SC26_A13006MetPieTurn ;
   private String[] T01SC26_A396EmprCod ;
   private String[] T01SC27_A396EmprCod ;
   private String[] T01SC27_A2809MetTerCod ;
   private int[] T01SC27_A129BarCod ;
   private byte[] T01SC27_A132BarCodReo ;
   private String[] T01SC27_A130BarCodPar ;
   private String[] T01SC27_A2813MetPieCod ;
   private String[] T01SC3_A2809MetTerCod ;
   private int[] T01SC3_A129BarCod ;
   private byte[] T01SC3_A132BarCodReo ;
   private String[] T01SC3_A130BarCodPar ;
   private String[] T01SC3_A2813MetPieCod ;
   private java.math.BigDecimal[] T01SC3_A2814MetPieKil ;
   private java.math.BigDecimal[] T01SC3_A2815MetPieMet ;
   private String[] T01SC3_A10784MetPieId ;
   private String[] T01SC3_A10780MetPiectr ;
   private String[] T01SC3_A10779MetPieOb ;
   private short[] T01SC3_A6635MetPieAnc ;
   private java.util.Date[] T01SC3_A5136MetPieFch ;
   private short[] T01SC3_A4909MetPieDef ;
   private String[] T01SC3_A2846MetPieDsc ;
   private byte[] T01SC3_A2816MetPieEst ;
   private java.math.BigDecimal[] T01SC3_A4910MetPieMtD ;
   private String[] T01SC3_A4911MetPieCol ;
   private long[] T01SC3_A4912MetPiePDo ;
   private String[] T01SC3_A4913MetPieLoc ;
   private String[] T01SC3_A4914MetPieRap ;
   private String[] T01SC3_A4915MetPieDCP ;
   private String[] T01SC3_A4916MetPieMue ;
   private String[] T01SC3_A4917MetPieObs ;
   private short[] T01SC3_A12994MetPieDfUl ;
   private int[] T01SC3_A13005MetPieOpe ;
   private byte[] T01SC3_A13006MetPieTurn ;
   private String[] T01SC3_A396EmprCod ;
   private String[] T01SC2_A2809MetTerCod ;
   private int[] T01SC2_A129BarCod ;
   private byte[] T01SC2_A132BarCodReo ;
   private String[] T01SC2_A130BarCodPar ;
   private String[] T01SC2_A2813MetPieCod ;
   private java.math.BigDecimal[] T01SC2_A2814MetPieKil ;
   private java.math.BigDecimal[] T01SC2_A2815MetPieMet ;
   private String[] T01SC2_A10784MetPieId ;
   private String[] T01SC2_A10780MetPiectr ;
   private String[] T01SC2_A10779MetPieOb ;
   private short[] T01SC2_A6635MetPieAnc ;
   private java.util.Date[] T01SC2_A5136MetPieFch ;
   private short[] T01SC2_A4909MetPieDef ;
   private String[] T01SC2_A2846MetPieDsc ;
   private byte[] T01SC2_A2816MetPieEst ;
   private java.math.BigDecimal[] T01SC2_A4910MetPieMtD ;
   private String[] T01SC2_A4911MetPieCol ;
   private long[] T01SC2_A4912MetPiePDo ;
   private String[] T01SC2_A4913MetPieLoc ;
   private String[] T01SC2_A4914MetPieRap ;
   private String[] T01SC2_A4915MetPieDCP ;
   private String[] T01SC2_A4916MetPieMue ;
   private String[] T01SC2_A4917MetPieObs ;
   private short[] T01SC2_A12994MetPieDfUl ;
   private int[] T01SC2_A13005MetPieOpe ;
   private byte[] T01SC2_A13006MetPieTurn ;
   private String[] T01SC2_A396EmprCod ;
   private String[] T01SC31_A396EmprCod ;
   private String[] T01SC31_A2809MetTerCod ;
   private int[] T01SC31_A129BarCod ;
   private byte[] T01SC31_A132BarCodReo ;
   private String[] T01SC31_A130BarCodPar ;
   private String[] T01SC31_A2813MetPieCod ;
   private short[] T01SC31_A12995MetPieDfLi ;
   private String[] T01SC32_A396EmprCod ;
   private String[] T01SC32_A2809MetTerCod ;
   private int[] T01SC32_A129BarCod ;
   private byte[] T01SC32_A132BarCodReo ;
   private String[] T01SC32_A130BarCodPar ;
   private String[] T01SC32_A2813MetPieCod ;
   private String[] T01SC33_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class packinglist__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class packinglist__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class packinglist__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class packinglist__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class packinglist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SC2", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC3", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC4", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF MetTerCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC5", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC9", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC11", "SELECT /*+ FIRST_ROWS(100) */ TM1.MetTerCod, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, COALESCE( T3.MetTotPie, 0) AS MetTotPie, COALESCE( T3.MetTotMet, 0) AS MetTotMet, COALESCE( T3.MetTotKil, 0) AS MetTotKil FROM ((TXPCMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MetTerCod = TM1.MetTerCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC13", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC15", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod > ? or EmprCod = ? and MetTerCod > ? or MetTerCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SC18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE ( EmprCod < ? or EmprCod = ? and MetTerCod < ? or MetTerCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and MetTerCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SC19", "INSERT INTO TXPCMETPI(MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T01SC20", "DELETE FROM TXPCMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new ForEachCursor("T01SC21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC23", "SELECT COALESCE( T1.MetTotPie, 0) AS MetTotPie, COALESCE( T1.MetTotMet, 0) AS MetTotMet, COALESCE( T1.MetTotKil, 0) AS MetTotKil FROM (SELECT COUNT(*) AS MetTotPie, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieMet) AS MetTotMet, SUM(MetPieKil) AS MetTotKil FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC24", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SC25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC26", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn, EmprCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC27", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SC28", "INSERT INTO TXPLMETPI(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieDef, MetPieDsc, MetPieEst, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01SC29", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieId=?, MetPiectr=?, MetPieOb=?, MetPieAnc=?, MetPieFch=?, MetPieDef=?, MetPieDsc=?, MetPieEst=?, MetPieMtD=?, MetPieCol=?, MetPiePDo=?, MetPieLoc=?, MetPieRap=?, MetPieDCP=?, MetPieMue=?, MetPieObs=?, MetPieDfUl=?, MetPieOpe=?, MetPieTurn=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01SC30", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01SC31", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SC32", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SC33", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 60);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((long[]) buf[17])[0] = rslt.getLong(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((byte[]) buf[25])[0] = rslt.getByte(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 27 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 9);
               stmt.setString(9, (String)parms[8], 40);
               stmt.setString(10, (String)parms[9], 60);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 20);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(17, (String)parms[16], 13);
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setString(19, (String)parms[18], 10);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setString(21, (String)parms[20], 1);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setVarchar(23, (String)parms[22], 1024, false);
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setString(27, (String)parms[26], 3);
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setString(14, (String)parms[13], 10);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setVarchar(18, (String)parms[17], 1024, false);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setString(22, (String)parms[21], 3);
               stmt.setString(23, (String)parms[22], 10);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               stmt.setString(27, (String)parms[26], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

