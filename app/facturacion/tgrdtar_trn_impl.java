package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tgrdtar_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A4364GrdTipArt) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Custos Gerals", ""), (short)(0)) ;
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

   public tgrdtar_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tgrdtar_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrdtar_trn_impl.class ));
   }

   public tgrdtar_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Custos Gerals", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Tgrdtar_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Facturacion\\Tgrdtar_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipArt_Internalname, httpContext.getMessage( "Gran Tipo de Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipDsc_Internalname, httpContext.getMessage( "Descripcion Gran Tipo de Artic", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipDsc_Internalname, GXutil.rtrim( A4368GrdTipDsc), GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGrdTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtID_GrdTpDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtID_GrdTpDs_Internalname, httpContext.getMessage( "Id+Desc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtID_GrdTpDs_Internalname, GXutil.rtrim( A14196ID_GrdTpDs), GXutil.rtrim( localUtil.format( A14196ID_GrdTpDs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtID_GrdTpDs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtID_GrdTpDs_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipVal_Internalname, httpContext.getMessage( "Valor Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipVal_Internalname, GXutil.ltrim( localUtil.ntoc( A4376GrdTipVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipVal_Enabled!=0) ? localUtil.format( A4376GrdTipVal, "ZZZZ9.99999") : localUtil.format( A4376GrdTipVal, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGrdTipVal_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipCos_Internalname, httpContext.getMessage( "Valor Coste", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipCos_Internalname, GXutil.ltrim( localUtil.ntoc( A4377GrdTipCos, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipCos_Enabled!=0) ? localUtil.format( A4377GrdTipCos, "ZZZZ9.99999") : localUtil.format( A4377GrdTipCos, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipCos_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGrdTipCos_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Tgrdtar_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Tgrdtar_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4364GrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4376GrdTipVal = localUtil.ctond( httpContext.cgiGet( "Z4376GrdTipVal")) ;
         Z4377GrdTipCos = localUtil.ctond( httpContext.cgiGet( "Z4377GrdTipCos")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRDTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGrdTipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4364GrdTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         }
         else
         {
            A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         }
         A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A14196ID_GrdTpDs = httpContext.cgiGet( edtID_GrdTpDs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", A14196ID_GrdTpDs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGrdTipVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGrdTipVal_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRDTIPVAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGrdTipVal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4376GrdTipVal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
         }
         else
         {
            A4376GrdTipVal = localUtil.ctond( httpContext.cgiGet( edtGrdTipVal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGrdTipCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGrdTipCos_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRDTIPCOS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGrdTipCos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4377GrdTipCos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrimstr( A4377GrdTipCos, 11, 5));
         }
         else
         {
            A4377GrdTipCos = localUtil.ctond( httpContext.cgiGet( edtGrdTipCos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrimstr( A4377GrdTipCos, 11, 5));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4376GrdTipVal = CommonUtil.decimalVal( httpContext.GetPar( "GrdTipVal"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
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
            initAll1VC661( ) ;
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
      disableAttributes1VC661( ) ;
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

   public void resetCaption1VC0( )
   {
   }

   public void zm1VC661( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4377GrdTipCos = T01VC3_A4377GrdTipCos[0] ;
         }
         else
         {
            Z4377GrdTipCos = A4377GrdTipCos ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4376GrdTipVal = A4376GrdTipVal ;
         Z4377GrdTipCos = A4377GrdTipCos ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
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

   public void load1VC661( )
   {
      /* Using cursor T01VC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound661 = (short)(1) ;
         A407EmprNom = T01VC6_A407EmprNom[0] ;
         n407EmprNom = T01VC6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4368GrdTipDsc = T01VC6_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A4377GrdTipCos = T01VC6_A4377GrdTipCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrimstr( A4377GrdTipCos, 11, 5));
         zm1VC661( -2) ;
      }
      pr_default.close(4);
      onLoadActions1VC661( ) ;
   }

   public void onLoadActions1VC661( )
   {
      A14196ID_GrdTpDs = GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) + "-" + GXutil.trim( A4368GrdTipDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", A14196ID_GrdTpDs);
   }

   public void checkExtendedTable1VC661( )
   {
      nIsDirty_661 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VC4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VC4_A407EmprNom[0] ;
      n407EmprNom = T01VC4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01VC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01VC5_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      pr_default.close(3);
      nIsDirty_661 = (short)(1) ;
      A14196ID_GrdTpDs = GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) + "-" + GXutil.trim( A4368GrdTipDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", A14196ID_GrdTpDs);
   }

   public void closeExtendedTableCursors1VC661( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T01VC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VC7_A407EmprNom[0] ;
      n407EmprNom = T01VC7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_4( String A396EmprCod ,
                         short A4364GrdTipArt )
   {
      /* Using cursor T01VC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01VC8_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4368GrdTipDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1VC661( )
   {
      /* Using cursor T01VC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound661 = (short)(1) ;
      }
      else
      {
         RcdFound661 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VC661( 2) ;
         RcdFound661 = (short)(1) ;
         A4376GrdTipVal = T01VC3_A4376GrdTipVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
         A4377GrdTipCos = T01VC3_A4377GrdTipCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrimstr( A4377GrdTipCos, 11, 5));
         A396EmprCod = T01VC3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = T01VC3_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4376GrdTipVal = A4376GrdTipVal ;
         sMode661 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VC661( ) ;
         if ( AnyError == 1 )
         {
            RcdFound661 = (short)(0) ;
            initializeNonKey1VC661( ) ;
         }
         Gx_mode = sMode661 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound661 = (short)(0) ;
         initializeNonKey1VC661( ) ;
         sMode661 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode661 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VC661( ) ;
      if ( RcdFound661 == 0 )
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
      RcdFound661 = (short)(0) ;
      /* Using cursor T01VC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A4364GrdTipArt), A396EmprCod, A4376GrdTipVal});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VC10_A4364GrdTipArt[0] < A4364GrdTipArt ) || ( T01VC10_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( DecimalUtil.compareTo(T01VC10_A4376GrdTipVal[0], A4376GrdTipVal) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VC10_A4364GrdTipArt[0] > A4364GrdTipArt ) || ( T01VC10_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( GXutil.strcmp(T01VC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( DecimalUtil.compareTo(T01VC10_A4376GrdTipVal[0], A4376GrdTipVal) > 0 ) ) )
         {
            A396EmprCod = T01VC10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4364GrdTipArt = T01VC10_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4376GrdTipVal = T01VC10_A4376GrdTipVal[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
            RcdFound661 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound661 = (short)(0) ;
      /* Using cursor T01VC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A4364GrdTipArt), A396EmprCod, A4376GrdTipVal});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VC11_A4364GrdTipArt[0] > A4364GrdTipArt ) || ( T01VC11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( DecimalUtil.compareTo(T01VC11_A4376GrdTipVal[0], A4376GrdTipVal) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VC11_A4364GrdTipArt[0] < A4364GrdTipArt ) || ( T01VC11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( GXutil.strcmp(T01VC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( DecimalUtil.compareTo(T01VC11_A4376GrdTipVal[0], A4376GrdTipVal) < 0 ) ) )
         {
            A396EmprCod = T01VC11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4364GrdTipArt = T01VC11_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4376GrdTipVal = T01VC11_A4376GrdTipVal[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
            RcdFound661 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VC661( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VC661( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound661 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( DecimalUtil.compareTo(A4376GrdTipVal, Z4376GrdTipVal) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4364GrdTipArt = Z4364GrdTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
               A4376GrdTipVal = Z4376GrdTipVal ;
               httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
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
               update1VC661( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( DecimalUtil.compareTo(A4376GrdTipVal, Z4376GrdTipVal) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VC661( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VC661( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( DecimalUtil.compareTo(A4376GrdTipVal, Z4376GrdTipVal) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = Z4364GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4376GrdTipVal = Z4376GrdTipVal ;
         httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      if ( RcdFound661 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtGrdTipCos_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VC661( ) ;
      if ( RcdFound661 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipCos_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VC661( ) ;
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
      if ( RcdFound661 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipCos_Internalname ;
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
      if ( RcdFound661 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipCos_Internalname ;
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
      scanStart1VC661( ) ;
      if ( RcdFound661 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound661 != 0 )
         {
            scanNext1VC661( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGrdTipCos_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VC661( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VC661( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4377GrdTipCos, T01VC2_A4377GrdTipCos[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4377GrdTipCos, T01VC2_A4377GrdTipCos[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tgrdtar_trn:[seudo value changed for attri]"+"GrdTipCos");
               GXutil.writeLogRaw("Old: ",Z4377GrdTipCos);
               GXutil.writeLogRaw("Current: ",T01VC2_A4377GrdTipCos[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRDTAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VC661( )
   {
      beforeValidate1VC661( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VC661( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VC661( 0) ;
         checkOptimisticConcurrency1VC661( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VC661( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VC661( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VC12 */
                  pr_default.execute(10, new Object[] {A4376GrdTipVal, A4377GrdTipCos, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1VC0( ) ;
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
            load1VC661( ) ;
         }
         endLevel1VC661( ) ;
      }
      closeExtendedTableCursors1VC661( ) ;
   }

   public void update1VC661( )
   {
      beforeValidate1VC661( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VC661( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VC661( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VC661( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VC661( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VC13 */
                  pr_default.execute(11, new Object[] {A4377GrdTipCos, A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VC661( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VC0( ) ;
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
         endLevel1VC661( ) ;
      }
      closeExtendedTableCursors1VC661( ) ;
   }

   public void deferredUpdate1VC661( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VC661( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VC661( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VC661( ) ;
         afterConfirm1VC661( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VC661( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VC14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound661 == 0 )
                     {
                        initAll1VC661( ) ;
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
                     resetCaption1VC0( ) ;
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
      sMode661 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VC661( ) ;
      Gx_mode = sMode661 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VC661( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VC15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01VC15_A407EmprNom[0] ;
         n407EmprNom = T01VC15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01VC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         A4368GrdTipDsc = T01VC16_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         pr_default.close(14);
         A14196ID_GrdTpDs = GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) + "-" + GXutil.trim( A4368GrdTipDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", A14196ID_GrdTpDs);
      }
   }

   public void endLevel1VC661( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VC661( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tgrdtar_trn");
         if ( AnyError == 0 )
         {
            confirmValues1VC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tgrdtar_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VC661( )
   {
      /* Using cursor T01VC17 */
      pr_default.execute(15);
      RcdFound661 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound661 = (short)(1) ;
         A396EmprCod = T01VC17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = T01VC17_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4376GrdTipVal = T01VC17_A4376GrdTipVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VC661( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound661 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound661 = (short)(1) ;
         A396EmprCod = T01VC17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = T01VC17_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4376GrdTipVal = T01VC17_A4376GrdTipVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
      }
   }

   public void scanEnd1VC661( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1VC661( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VC661( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VC661( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VC661( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VC661( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VC661( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VC661( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      edtID_GrdTpDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtID_GrdTpDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtID_GrdTpDs_Enabled), 5, 0), true);
      edtGrdTipVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipVal_Enabled), 5, 0), true);
      edtGrdTipCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipCos_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VC661( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tgrdtar_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4376GrdTipVal", GXutil.ltrim( localUtil.ntoc( Z4376GrdTipVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4377GrdTipCos", GXutil.ltrim( localUtil.ntoc( Z4377GrdTipCos, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.facturacion.tgrdtar_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.Tgrdtar_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Custos Gerals", "") ;
   }

   public void initializeNonKey1VC661( )
   {
      A14196ID_GrdTpDs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", A14196ID_GrdTpDs);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      A4377GrdTipCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrimstr( A4377GrdTipCos, 11, 5));
      Z4377GrdTipCos = DecimalUtil.ZERO ;
   }

   public void initAll1VC661( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4364GrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      A4376GrdTipVal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4376GrdTipVal", GXutil.ltrimstr( A4376GrdTipVal, 11, 5));
      initializeNonKey1VC661( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415123662", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tgrdtar_trn.js", "?202682415123662", false, true);
      /* End function include_jscripts */
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
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      edtGrdTipDsc_Internalname = "GRDTIPDSC" ;
      edtID_GrdTpDs_Internalname = "ID_GRDTPDS" ;
      edtGrdTipVal_Internalname = "GRDTIPVAL" ;
      edtGrdTipCos_Internalname = "GRDTIPCOS" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "Custos Gerals", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtGrdTipCos_Jsonclick = "" ;
      edtGrdTipCos_Enabled = 1 ;
      edtGrdTipVal_Jsonclick = "" ;
      edtGrdTipVal_Enabled = 1 ;
      edtID_GrdTpDs_Jsonclick = "" ;
      edtID_GrdTpDs_Enabled = 0 ;
      edtGrdTipDsc_Jsonclick = "" ;
      edtGrdTipDsc_Enabled = 0 ;
      edtGrdTipArt_Jsonclick = "" ;
      edtGrdTipArt_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01VC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VC15_A407EmprNom[0] ;
      n407EmprNom = T01VC15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01VC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01VC16_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      pr_default.close(14);
      GX_FocusControl = edtGrdTipCos_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01VC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01VC15_A407EmprNom[0] ;
      n407EmprNom = T01VC15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Grdtipart( )
   {
      /* Using cursor T01VC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4368GrdTipDsc = T01VC16_A4368GrdTipDsc[0] ;
      pr_default.close(14);
      A14196ID_GrdTpDs = GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) + "-" + GXutil.trim( A4368GrdTipDsc) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", GXutil.rtrim( A14196ID_GrdTpDs));
   }

   public void valid_Grdtipval( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4377GrdTipCos", GXutil.ltrim( localUtil.ntoc( A4377GrdTipCos, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14196ID_GrdTpDs", GXutil.rtrim( A14196ID_GrdTpDs));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4376GrdTipVal", GXutil.ltrim( localUtil.ntoc( Z4376GrdTipVal, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4377GrdTipCos", GXutil.ltrim( localUtil.ntoc( Z4377GrdTipCos, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14196ID_GrdTpDs", GXutil.rtrim( Z14196ID_GrdTpDs));
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
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''},{av:'A14196ID_GrdTpDs',fld:'ID_GRDTPDS',pic:''}]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''},{av:'A14196ID_GrdTpDs',fld:'ID_GRDTPDS',pic:''}]}");
      setEventMetadata("VALID_GRDTIPDSC","{handler:'valid_Grdtipdsc',iparms:[]");
      setEventMetadata("VALID_GRDTIPDSC",",oparms:[]}");
      setEventMetadata("VALID_GRDTIPVAL","{handler:'valid_Grdtipval',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4376GrdTipVal',fld:'GRDTIPVAL',pic:'ZZZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_GRDTIPVAL",",oparms:[{av:'A4377GrdTipCos',fld:'GRDTIPCOS',pic:'ZZZZ9.99999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''},{av:'A14196ID_GrdTpDs',fld:'ID_GRDTPDS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4364GrdTipArt'},{av:'Z4376GrdTipVal'},{av:'Z4377GrdTipCos'},{av:'Z407EmprNom'},{av:'Z4368GrdTipDsc'},{av:'Z14196ID_GrdTpDs'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4376GrdTipVal = DecimalUtil.ZERO ;
      Z4377GrdTipCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A4368GrdTipDsc = "" ;
      A14196ID_GrdTpDs = "" ;
      A4376GrdTipVal = DecimalUtil.ZERO ;
      A4377GrdTipCos = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z4368GrdTipDsc = "" ;
      T01VC6_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC6_A407EmprNom = new String[] {""} ;
      T01VC6_n407EmprNom = new boolean[] {false} ;
      T01VC6_A4368GrdTipDsc = new String[] {""} ;
      T01VC6_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC6_A396EmprCod = new String[] {""} ;
      T01VC6_A4364GrdTipArt = new short[1] ;
      T01VC4_A407EmprNom = new String[] {""} ;
      T01VC4_n407EmprNom = new boolean[] {false} ;
      T01VC5_A4368GrdTipDsc = new String[] {""} ;
      T01VC7_A407EmprNom = new String[] {""} ;
      T01VC7_n407EmprNom = new boolean[] {false} ;
      T01VC8_A4368GrdTipDsc = new String[] {""} ;
      T01VC9_A396EmprCod = new String[] {""} ;
      T01VC9_A4364GrdTipArt = new short[1] ;
      T01VC9_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC3_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC3_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC3_A396EmprCod = new String[] {""} ;
      T01VC3_A4364GrdTipArt = new short[1] ;
      sMode661 = "" ;
      T01VC10_A396EmprCod = new String[] {""} ;
      T01VC10_A4364GrdTipArt = new short[1] ;
      T01VC10_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC11_A396EmprCod = new String[] {""} ;
      T01VC11_A4364GrdTipArt = new short[1] ;
      T01VC11_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC2_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC2_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01VC2_A396EmprCod = new String[] {""} ;
      T01VC2_A4364GrdTipArt = new short[1] ;
      T01VC15_A407EmprNom = new String[] {""} ;
      T01VC15_n407EmprNom = new boolean[] {false} ;
      T01VC16_A4368GrdTipDsc = new String[] {""} ;
      T01VC17_A396EmprCod = new String[] {""} ;
      T01VC17_A4364GrdTipArt = new short[1] ;
      T01VC17_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z14196ID_GrdTpDs = "" ;
      ZZ396EmprCod = "" ;
      ZZ4376GrdTipVal = DecimalUtil.ZERO ;
      ZZ4377GrdTipCos = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ4368GrdTipDsc = "" ;
      ZZ14196ID_GrdTpDs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tgrdtar_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tgrdtar_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tgrdtar_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tgrdtar_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tgrdtar_trn__default(),
         new Object[] {
             new Object[] {
            T01VC2_A4376GrdTipVal, T01VC2_A4377GrdTipCos, T01VC2_A396EmprCod, T01VC2_A4364GrdTipArt
            }
            , new Object[] {
            T01VC3_A4376GrdTipVal, T01VC3_A4377GrdTipCos, T01VC3_A396EmprCod, T01VC3_A4364GrdTipArt
            }
            , new Object[] {
            T01VC4_A407EmprNom, T01VC4_n407EmprNom
            }
            , new Object[] {
            T01VC5_A4368GrdTipDsc
            }
            , new Object[] {
            T01VC6_A4376GrdTipVal, T01VC6_A407EmprNom, T01VC6_n407EmprNom, T01VC6_A4368GrdTipDsc, T01VC6_A4377GrdTipCos, T01VC6_A396EmprCod, T01VC6_A4364GrdTipArt
            }
            , new Object[] {
            T01VC7_A407EmprNom, T01VC7_n407EmprNom
            }
            , new Object[] {
            T01VC8_A4368GrdTipDsc
            }
            , new Object[] {
            T01VC9_A396EmprCod, T01VC9_A4364GrdTipArt, T01VC9_A4376GrdTipVal
            }
            , new Object[] {
            T01VC10_A396EmprCod, T01VC10_A4364GrdTipArt, T01VC10_A4376GrdTipVal
            }
            , new Object[] {
            T01VC11_A396EmprCod, T01VC11_A4364GrdTipArt, T01VC11_A4376GrdTipVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VC15_A407EmprNom, T01VC15_n407EmprNom
            }
            , new Object[] {
            T01VC16_A4368GrdTipDsc
            }
            , new Object[] {
            T01VC17_A396EmprCod, T01VC17_A4364GrdTipArt, T01VC17_A4376GrdTipVal
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z4364GrdTipArt ;
   private short A4364GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound661 ;
   private short nIsDirty_661 ;
   private short ZZ4364GrdTipArt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtGrdTipArt_Enabled ;
   private int edtGrdTipDsc_Enabled ;
   private int edtID_GrdTpDs_Enabled ;
   private int edtGrdTipVal_Enabled ;
   private int edtGrdTipCos_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z4376GrdTipVal ;
   private java.math.BigDecimal Z4377GrdTipCos ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private java.math.BigDecimal ZZ4376GrdTipVal ;
   private java.math.BigDecimal ZZ4377GrdTipCos ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtGrdTipArt_Internalname ;
   private String edtGrdTipArt_Jsonclick ;
   private String edtGrdTipDsc_Internalname ;
   private String A4368GrdTipDsc ;
   private String edtGrdTipDsc_Jsonclick ;
   private String edtID_GrdTpDs_Internalname ;
   private String A14196ID_GrdTpDs ;
   private String edtID_GrdTpDs_Jsonclick ;
   private String edtGrdTipVal_Internalname ;
   private String edtGrdTipVal_Jsonclick ;
   private String edtGrdTipCos_Internalname ;
   private String edtGrdTipCos_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z4368GrdTipDsc ;
   private String sMode661 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z14196ID_GrdTpDs ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ4368GrdTipDsc ;
   private String ZZ14196ID_GrdTpDs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T01VC6_A4376GrdTipVal ;
   private String[] T01VC6_A407EmprNom ;
   private boolean[] T01VC6_n407EmprNom ;
   private String[] T01VC6_A4368GrdTipDsc ;
   private java.math.BigDecimal[] T01VC6_A4377GrdTipCos ;
   private String[] T01VC6_A396EmprCod ;
   private short[] T01VC6_A4364GrdTipArt ;
   private String[] T01VC4_A407EmprNom ;
   private boolean[] T01VC4_n407EmprNom ;
   private String[] T01VC5_A4368GrdTipDsc ;
   private String[] T01VC7_A407EmprNom ;
   private boolean[] T01VC7_n407EmprNom ;
   private String[] T01VC8_A4368GrdTipDsc ;
   private String[] T01VC9_A396EmprCod ;
   private short[] T01VC9_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01VC9_A4376GrdTipVal ;
   private java.math.BigDecimal[] T01VC3_A4376GrdTipVal ;
   private java.math.BigDecimal[] T01VC3_A4377GrdTipCos ;
   private String[] T01VC3_A396EmprCod ;
   private short[] T01VC3_A4364GrdTipArt ;
   private String[] T01VC10_A396EmprCod ;
   private short[] T01VC10_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01VC10_A4376GrdTipVal ;
   private String[] T01VC11_A396EmprCod ;
   private short[] T01VC11_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01VC11_A4376GrdTipVal ;
   private java.math.BigDecimal[] T01VC2_A4376GrdTipVal ;
   private java.math.BigDecimal[] T01VC2_A4377GrdTipCos ;
   private String[] T01VC2_A396EmprCod ;
   private short[] T01VC2_A4364GrdTipArt ;
   private String[] T01VC15_A407EmprNom ;
   private boolean[] T01VC15_n407EmprNom ;
   private String[] T01VC16_A4368GrdTipDsc ;
   private String[] T01VC17_A396EmprCod ;
   private short[] T01VC17_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01VC17_A4376GrdTipVal ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tgrdtar_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtar_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtar_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtar_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtar_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VC2", "SELECT GrdTipVal, GrdTipCos, EmprCod, GrdTipArt FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ? AND GrdTipVal = ?  FOR UPDATE OF GrdTipCos NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC3", "SELECT GrdTipVal, GrdTipCos, EmprCod, GrdTipArt FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ? AND GrdTipVal = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC5", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC6", "SELECT /*+ FIRST_ROWS(100) */ TM1.GrdTipVal, T2.EmprNom, T3.GrdTipDsc, TM1.GrdTipCos, TM1.EmprCod, TM1.GrdTipArt FROM ((TXPGRDTAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPGRDTIP T3 ON T3.EmprCod = TM1.EmprCod AND T3.GrdTipArt = TM1.GrdTipArt) WHERE TM1.EmprCod = ? and TM1.GrdTipArt = ? and TM1.GrdTipVal = ? ORDER BY TM1.EmprCod, TM1.GrdTipArt, TM1.GrdTipVal ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC8", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ? AND GrdTipVal = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE ( EmprCod > ? or EmprCod = ? and GrdTipArt > ? or GrdTipArt = ? and EmprCod = ? and GrdTipVal > ?) ORDER BY EmprCod, GrdTipArt, GrdTipVal) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE ( EmprCod < ? or EmprCod = ? and GrdTipArt < ? or GrdTipArt = ? and EmprCod = ? and GrdTipVal < ?) ORDER BY EmprCod DESC, GrdTipArt DESC, GrdTipVal DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VC12", "INSERT INTO TXPGRDTAR(GrdTipVal, GrdTipCos, EmprCod, GrdTipArt) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPGRDTAR")
         ,new UpdateCursor("T01VC13", "UPDATE TXPGRDTAR SET GrdTipCos=?  WHERE EmprCod = ? AND GrdTipArt = ? AND GrdTipVal = ?", GX_NOMASK, "TXPGRDTAR")
         ,new UpdateCursor("T01VC14", "DELETE FROM TXPGRDTAR  WHERE EmprCod = ? AND GrdTipArt = ? AND GrdTipVal = ?", GX_NOMASK, "TXPGRDTAR")
         ,new ForEachCursor("T01VC15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC16", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VC17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR ORDER BY EmprCod, GrdTipArt, GrdTipVal ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

