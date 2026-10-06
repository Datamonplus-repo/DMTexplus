package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttartmq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A602MaqCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridttartmq_level1item") == 0 )
      {
         gxnrgridttartmq_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RELACION TARTICULO-MAQUINA-RB", ""), (short)(0)) ;
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

   public void gxnrgridttartmq_level1item_newrow_invoke( )
   {
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridttartmq_level1item_newrow( ) ;
      /* End function gxnrGridttartmq_level1item_newrow_invoke */
   }

   public ttartmq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttartmq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttartmq_impl.class ));
   }

   public ttartmq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "RELACION TARTICULO-MAQUINA-RB", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTARTMQ.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTARTMQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTArt_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTArt_Internalname, GXutil.ltrim( localUtil.ntoc( A6188MaqTArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6188MaqTArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6188MaqTArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipDsc_Internalname, httpContext.getMessage( "Descripcion Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipDsc_Internalname, GXutil.rtrim( A6189MaqTipDsc), GXutil.rtrim( localUtil.format( A6189MaqTipDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARTMQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARTMQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridttartmq_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARTMQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridttartmq_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol58( ) ;
      nGXsfl_58_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount903 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_903 = (short)(1) ;
            scanStartU2903( ) ;
            while ( RcdFound903 != 0 )
            {
               init_level_properties903( ) ;
               getByPrimaryKeyU2903( ) ;
               addRowU2903( ) ;
               scanNextU2903( ) ;
            }
            scanEndU2903( ) ;
            nBlankRcdCount903 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalU2903( ) ;
         standaloneModalU2903( ) ;
         sMode903 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRowU2903( ) ;
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtTipArtRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTRB_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtRb_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtTipArtVmn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTVMN_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtVmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtVmn_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtTipArtVmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTVMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtVmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtVmx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            if ( ( nRcdExists_903 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalU2903( ) ;
            }
            sendRowU2903( ) ;
            bGXsfl_58_Refreshing = false ;
         }
         Gx_mode = sMode903 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount903 = (short)(5) ;
         nRcdExists_903 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartU2903( ) ;
            while ( RcdFound903 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_58903( ) ;
               init_level_properties903( ) ;
               standaloneNotModalU2903( ) ;
               getByPrimaryKeyU2903( ) ;
               standaloneModalU2903( ) ;
               addRowU2903( ) ;
               scanNextU2903( ) ;
            }
            scanEndU2903( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode903 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_58903( ) ;
      initAllU2903( ) ;
      init_level_properties903( ) ;
      nRcdExists_903 = (short)(0) ;
      nIsMod_903 = (short)(0) ;
      nRcdDeleted_903 = (short)(0) ;
      nBlankRcdCount903 = (short)(nBlankRcdUsr903+nBlankRcdCount903) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount903 > 0 )
      {
         standaloneNotModalU2903( ) ;
         standaloneModalU2903( ) ;
         addRowU2903( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount903 = (short)(nBlankRcdCount903-1) ;
      }
      Gx_mode = sMode903 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridttartmq_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridttartmq_level1item", Gridttartmq_level1itemContainer, subGridttartmq_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttartmq_level1itemContainerData", Gridttartmq_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttartmq_level1itemContainerData"+"V", Gridttartmq_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridttartmq_level1itemContainerData"+"V"+"\" value='"+Gridttartmq_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z6188MaqTArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z6188MaqTArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6189MaqTipDsc = httpContext.cgiGet( "Z6189MaqTipDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQTART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqTArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6188MaqTArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
         }
         else
         {
            A6188MaqTArt = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
         }
         A6189MaqTipDsc = httpContext.cgiGet( edtMaqTipDsc_Internalname) ;
         n6189MaqTipDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6189MaqTipDsc", A6189MaqTipDsc);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            A6188MaqTArt = (short)(GXutil.lval( httpContext.GetPar( "MaqTArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
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
            initAllU2902( ) ;
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
      disableAttributesU2902( ) ;
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

   public void confirm_U2903( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRowU2903( ) ;
         if ( ( nRcdExists_903 != 0 ) || ( nIsMod_903 != 0 ) )
         {
            getKeyU2903( ) ;
            if ( ( nRcdExists_903 == 0 ) && ( nRcdDeleted_903 == 0 ) )
            {
               if ( RcdFound903 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateU2903( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableU2903( ) ;
                     closeExtendedTableCursorsU2903( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound903 != 0 )
               {
                  if ( nRcdDeleted_903 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyU2903( ) ;
                     loadU2903( ) ;
                     beforeValidateU2903( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsU2903( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_903 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateU2903( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableU2903( ) ;
                           closeExtendedTableCursorsU2903( ) ;
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
                  if ( nRcdDeleted_903 == 0 )
                  {
                     GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc)) ;
         httpContext.changePostValue( edtTipArtRb_Internalname, GXutil.ltrim( localUtil.ntoc( A6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtVmn_Internalname, GXutil.ltrim( localUtil.ntoc( A6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtVmx_Internalname, GXutil.ltrim( localUtil.ntoc( A6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z6190TipArtRb_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6233TipArtVmn_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6234TipArtVmx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_903 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTRB_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTVMN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTVMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionU20( )
   {
   }

   public void zmU2902( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6189MaqTipDsc = T00U26_A6189MaqTipDsc[0] ;
         }
         else
         {
            Z6189MaqTipDsc = A6189MaqTipDsc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6188MaqTArt = A6188MaqTArt ;
         Z6189MaqTipDsc = A6189MaqTipDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void loadU2902( )
   {
      /* Using cursor T00U28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound902 = (short)(1) ;
         A6189MaqTipDsc = T00U28_A6189MaqTipDsc[0] ;
         n6189MaqTipDsc = T00U28_n6189MaqTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6189MaqTipDsc", A6189MaqTipDsc);
         A407EmprNom = T00U28_A407EmprNom[0] ;
         n407EmprNom = T00U28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmU2902( -1) ;
      }
      pr_default.close(6);
      onLoadActionsU2902( ) ;
   }

   public void onLoadActionsU2902( )
   {
   }

   public void checkExtendedTableU2902( )
   {
      nIsDirty_902 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00U27 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00U27_A407EmprNom[0] ;
      n407EmprNom = T00U27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsU2902( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00U29 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00U29_A407EmprNom[0] ;
      n407EmprNom = T00U29_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyU2902( )
   {
      /* Using cursor T00U210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound902 = (short)(1) ;
      }
      else
      {
         RcdFound902 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00U26 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmU2902( 1) ;
         RcdFound902 = (short)(1) ;
         A6188MaqTArt = T00U26_A6188MaqTArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
         A6189MaqTipDsc = T00U26_A6189MaqTipDsc[0] ;
         n6189MaqTipDsc = T00U26_n6189MaqTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6189MaqTipDsc", A6189MaqTipDsc);
         A396EmprCod = T00U26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z6188MaqTArt = A6188MaqTArt ;
         sMode902 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadU2902( ) ;
         if ( AnyError == 1 )
         {
            RcdFound902 = (short)(0) ;
            initializeNonKeyU2902( ) ;
         }
         Gx_mode = sMode902 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound902 = (short)(0) ;
         initializeNonKeyU2902( ) ;
         sMode902 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode902 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyU2902( ) ;
      if ( RcdFound902 == 0 )
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
      RcdFound902 = (short)(0) ;
      /* Using cursor T00U211 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A6188MaqTArt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00U211_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00U211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U211_A6188MaqTArt[0] < A6188MaqTArt ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00U211_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00U211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U211_A6188MaqTArt[0] > A6188MaqTArt ) ) )
         {
            A396EmprCod = T00U211_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6188MaqTArt = T00U211_A6188MaqTArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
            RcdFound902 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound902 = (short)(0) ;
      /* Using cursor T00U212 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A6188MaqTArt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00U212_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00U212_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U212_A6188MaqTArt[0] > A6188MaqTArt ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00U212_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00U212_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U212_A6188MaqTArt[0] < A6188MaqTArt ) ) )
         {
            A396EmprCod = T00U212_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6188MaqTArt = T00U212_A6188MaqTArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
            RcdFound902 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyU2902( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertU2902( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound902 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6188MaqTArt != Z6188MaqTArt ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A6188MaqTArt = Z6188MaqTArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
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
               updateU2902( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6188MaqTArt != Z6188MaqTArt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertU2902( ) ;
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
                  insertU2902( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6188MaqTArt != Z6188MaqTArt ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6188MaqTArt = Z6188MaqTArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
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
      if ( RcdFound902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartU2902( ) ;
      if ( RcdFound902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU2902( ) ;
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
      if ( RcdFound902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipDsc_Internalname ;
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
      if ( RcdFound902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipDsc_Internalname ;
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
      scanStartU2902( ) ;
      if ( RcdFound902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound902 != 0 )
         {
            scanNextU2902( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU2902( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyU2902( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U25 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTARTMQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z6189MaqTipDsc, T00U25_A6189MaqTipDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6189MaqTipDsc, T00U25_A6189MaqTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("ttartmq:[seudo value changed for attri]"+"MaqTipDsc");
               GXutil.writeLogRaw("Old: ",Z6189MaqTipDsc);
               GXutil.writeLogRaw("Current: ",T00U25_A6189MaqTipDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTARTMQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU2902( )
   {
      beforeValidateU2902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU2902( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU2902( 0) ;
         checkOptimisticConcurrencyU2902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU2902( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU2902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U213 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A6188MaqTArt), Boolean.valueOf(n6189MaqTipDsc), A6189MaqTipDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTMQ");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevelU2902( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionU20( ) ;
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
            loadU2902( ) ;
         }
         endLevelU2902( ) ;
      }
      closeExtendedTableCursorsU2902( ) ;
   }

   public void updateU2902( )
   {
      beforeValidateU2902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU2902( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU2902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU2902( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateU2902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U214 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n6189MaqTipDsc), A6189MaqTipDsc, A396EmprCod, Short.valueOf(A6188MaqTArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTMQ");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTARTMQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateU2902( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelU2902( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionU20( ) ;
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
         endLevelU2902( ) ;
      }
      closeExtendedTableCursorsU2902( ) ;
   }

   public void deferredUpdateU2902( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU2902( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU2902( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU2902( ) ;
         afterConfirmU2902( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU2902( ) ;
            if ( AnyError == 0 )
            {
               scanStartU2903( ) ;
               while ( RcdFound903 != 0 )
               {
                  getByPrimaryKeyU2903( ) ;
                  deleteU2903( ) ;
                  scanNextU2903( ) ;
               }
               scanEndU2903( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U215 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTMQ");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound902 == 0 )
                        {
                           initAllU2902( ) ;
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
                        resetCaptionU20( ) ;
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
      sMode902 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU2902( ) ;
      Gx_mode = sMode902 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU2902( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00U216 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T00U216_A407EmprNom[0] ;
         n407EmprNom = T00U216_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevelU2903( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRowU2903( ) ;
         if ( ( nRcdExists_903 != 0 ) || ( nIsMod_903 != 0 ) )
         {
            standaloneNotModalU2903( ) ;
            getKeyU2903( ) ;
            if ( ( nRcdExists_903 == 0 ) && ( nRcdDeleted_903 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertU2903( ) ;
            }
            else
            {
               if ( RcdFound903 != 0 )
               {
                  if ( ( nRcdDeleted_903 != 0 ) && ( nRcdExists_903 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteU2903( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_903 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateU2903( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_903 == 0 )
                  {
                     GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc)) ;
         httpContext.changePostValue( edtTipArtRb_Internalname, GXutil.ltrim( localUtil.ntoc( A6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtVmn_Internalname, GXutil.ltrim( localUtil.ntoc( A6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipArtVmx_Internalname, GXutil.ltrim( localUtil.ntoc( A6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z6190TipArtRb_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6233TipArtVmn_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6234TipArtVmx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_903_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_903 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTRB_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTVMN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTVMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllU2903( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_903 = (short)(0) ;
      nIsMod_903 = (short)(0) ;
      nRcdDeleted_903 = (short)(0) ;
   }

   public void processLevelU2902( )
   {
      /* Save parent mode. */
      sMode902 = Gx_mode ;
      processNestedLevelU2903( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode902 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelU2902( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteU2902( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttartmq");
         if ( AnyError == 0 )
         {
            confirmValuesU20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttartmq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartU2902( )
   {
      /* Using cursor T00U217 */
      pr_default.execute(15);
      RcdFound902 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound902 = (short)(1) ;
         A396EmprCod = T00U217_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6188MaqTArt = T00U217_A6188MaqTArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU2902( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound902 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound902 = (short)(1) ;
         A396EmprCod = T00U217_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6188MaqTArt = T00U217_A6188MaqTArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
      }
   }

   public void scanEndU2902( )
   {
      pr_default.close(15);
   }

   public void afterConfirmU2902( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU2902( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU2902( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU2902( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU2902( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU2902( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU2902( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqTArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArt_Enabled), 5, 0), true);
      edtMaqTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmU2903( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6190TipArtRb = T00U23_A6190TipArtRb[0] ;
            Z6233TipArtVmn = T00U23_A6233TipArtVmn[0] ;
            Z6234TipArtVmx = T00U23_A6234TipArtVmx[0] ;
         }
         else
         {
            Z6190TipArtRb = A6190TipArtRb ;
            Z6233TipArtVmn = A6233TipArtVmn ;
            Z6234TipArtVmx = A6234TipArtVmx ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z6188MaqTArt = A6188MaqTArt ;
         Z6190TipArtRb = A6190TipArtRb ;
         Z6233TipArtVmn = A6233TipArtVmn ;
         Z6234TipArtVmx = A6234TipArtVmx ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z606MaqDsc = A606MaqDsc ;
      }
   }

   public void standaloneNotModalU2903( )
   {
   }

   public void standaloneModalU2903( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      }
   }

   public void loadU2903( )
   {
      /* Using cursor T00U218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound903 = (short)(1) ;
         A606MaqDsc = T00U218_A606MaqDsc[0] ;
         n606MaqDsc = T00U218_n606MaqDsc[0] ;
         A6190TipArtRb = T00U218_A6190TipArtRb[0] ;
         n6190TipArtRb = T00U218_n6190TipArtRb[0] ;
         A6233TipArtVmn = T00U218_A6233TipArtVmn[0] ;
         n6233TipArtVmn = T00U218_n6233TipArtVmn[0] ;
         A6234TipArtVmx = T00U218_A6234TipArtVmx[0] ;
         n6234TipArtVmx = T00U218_n6234TipArtVmx[0] ;
         zmU2903( -3) ;
      }
      pr_default.close(16);
      onLoadActionsU2903( ) ;
   }

   public void onLoadActionsU2903( )
   {
   }

   public void checkExtendedTableU2903( )
   {
      nIsDirty_903 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalU2903( ) ;
      /* Using cursor T00U24 */
      pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T00U24_A606MaqDsc[0] ;
      n606MaqDsc = T00U24_n606MaqDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsU2903( )
   {
      pr_default.close(2);
   }

   public void enableDisableU2903( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T00U219 */
      pr_default.execute(17, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T00U219_A606MaqDsc[0] ;
      n606MaqDsc = T00U219_n606MaqDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKeyU2903( )
   {
      /* Using cursor T00U220 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound903 = (short)(1) ;
      }
      else
      {
         RcdFound903 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKeyU2903( )
   {
      /* Using cursor T00U23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmU2903( 3) ;
         RcdFound903 = (short)(1) ;
         initializeNonKeyU2903( ) ;
         A6190TipArtRb = T00U23_A6190TipArtRb[0] ;
         n6190TipArtRb = T00U23_n6190TipArtRb[0] ;
         A6233TipArtVmn = T00U23_A6233TipArtVmn[0] ;
         n6233TipArtVmn = T00U23_n6233TipArtVmn[0] ;
         A6234TipArtVmx = T00U23_A6234TipArtVmx[0] ;
         n6234TipArtVmx = T00U23_n6234TipArtVmx[0] ;
         A602MaqCod = T00U23_A602MaqCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6188MaqTArt = A6188MaqTArt ;
         Z602MaqCod = A602MaqCod ;
         sMode903 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalU2903( ) ;
         loadU2903( ) ;
         Gx_mode = sMode903 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound903 = (short)(0) ;
         initializeNonKeyU2903( ) ;
         sMode903 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalU2903( ) ;
         Gx_mode = sMode903 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesU2903( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyU2903( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTARTM1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6190TipArtRb, T00U22_A6190TipArtRb[0]) != 0 ) || ( Z6233TipArtVmn != T00U22_A6233TipArtVmn[0] ) || ( Z6234TipArtVmx != T00U22_A6234TipArtVmx[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6190TipArtRb, T00U22_A6190TipArtRb[0]) != 0 )
            {
               GXutil.writeLogln("ttartmq:[seudo value changed for attri]"+"TipArtRb");
               GXutil.writeLogRaw("Old: ",Z6190TipArtRb);
               GXutil.writeLogRaw("Current: ",T00U22_A6190TipArtRb[0]);
            }
            if ( Z6233TipArtVmn != T00U22_A6233TipArtVmn[0] )
            {
               GXutil.writeLogln("ttartmq:[seudo value changed for attri]"+"TipArtVmn");
               GXutil.writeLogRaw("Old: ",Z6233TipArtVmn);
               GXutil.writeLogRaw("Current: ",T00U22_A6233TipArtVmn[0]);
            }
            if ( Z6234TipArtVmx != T00U22_A6234TipArtVmx[0] )
            {
               GXutil.writeLogln("ttartmq:[seudo value changed for attri]"+"TipArtVmx");
               GXutil.writeLogRaw("Old: ",Z6234TipArtVmx);
               GXutil.writeLogRaw("Current: ",T00U22_A6234TipArtVmx[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTARTM1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU2903( )
   {
      beforeValidateU2903( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU2903( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU2903( 0) ;
         checkOptimisticConcurrencyU2903( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU2903( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU2903( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U221 */
                  pr_default.execute(19, new Object[] {Short.valueOf(A6188MaqTArt), Boolean.valueOf(n6190TipArtRb), A6190TipArtRb, Boolean.valueOf(n6233TipArtVmn), Integer.valueOf(A6233TipArtVmn), Boolean.valueOf(n6234TipArtVmx), Integer.valueOf(A6234TipArtVmx), A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTM1");
                  if ( (pr_default.getStatus(19) == 1) )
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
            loadU2903( ) ;
         }
         endLevelU2903( ) ;
      }
      closeExtendedTableCursorsU2903( ) ;
   }

   public void updateU2903( )
   {
      beforeValidateU2903( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU2903( ) ;
      }
      if ( ( nIsMod_903 != 0 ) || ( nIsDirty_903 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyU2903( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmU2903( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateU2903( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00U222 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n6190TipArtRb), A6190TipArtRb, Boolean.valueOf(n6233TipArtVmn), Integer.valueOf(A6233TipArtVmn), Boolean.valueOf(n6234TipArtVmx), Integer.valueOf(A6234TipArtVmx), A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTM1");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTARTM1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateU2903( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyU2903( ) ;
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
            endLevelU2903( ) ;
         }
      }
      closeExtendedTableCursorsU2903( ) ;
   }

   public void deferredUpdateU2903( )
   {
   }

   public void deleteU2903( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU2903( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU2903( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU2903( ) ;
         afterConfirmU2903( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU2903( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00U223 */
               pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt), A602MaqCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARTM1");
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
      sMode903 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU2903( ) ;
      Gx_mode = sMode903 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU2903( )
   {
      standaloneModalU2903( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00U224 */
         pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T00U224_A606MaqDsc[0] ;
         n606MaqDsc = T00U224_n606MaqDsc[0] ;
         pr_default.close(22);
      }
   }

   public void endLevelU2903( )
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

   public void scanStartU2903( )
   {
      /* Scan By routine */
      /* Using cursor T00U225 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A6188MaqTArt)});
      RcdFound903 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound903 = (short)(1) ;
         A602MaqCod = T00U225_A602MaqCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU2903( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound903 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound903 = (short)(1) ;
         A602MaqCod = T00U225_A602MaqCod[0] ;
      }
   }

   public void scanEndU2903( )
   {
      pr_default.close(23);
   }

   public void afterConfirmU2903( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU2903( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU2903( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU2903( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU2903( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU2903( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU2903( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtTipArtRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtRb_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtTipArtVmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtVmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtVmn_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtTipArtVmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtVmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtVmx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void send_integrity_lvl_hashesU2903( )
   {
   }

   public void send_integrity_lvl_hashesU2902( )
   {
   }

   public void subsflControlProps_58903( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_58_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_58_idx ;
      edtTipArtRb_Internalname = "TIPARTRB_"+sGXsfl_58_idx ;
      edtTipArtVmn_Internalname = "TIPARTVMN_"+sGXsfl_58_idx ;
      edtTipArtVmx_Internalname = "TIPARTVMX_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_58903( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_58_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_58_fel_idx ;
      edtTipArtRb_Internalname = "TIPARTRB_"+sGXsfl_58_fel_idx ;
      edtTipArtVmn_Internalname = "TIPARTVMN_"+sGXsfl_58_fel_idx ;
      edtTipArtVmx_Internalname = "TIPARTVMX_"+sGXsfl_58_fel_idx ;
   }

   public void addRowU2903( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58903( ) ;
      sendRowU2903( ) ;
   }

   public void sendRowU2903( )
   {
      Gridttartmq_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridttartmq_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridttartmq_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridttartmq_level1item_Class, "") != 0 )
         {
            subGridttartmq_level1item_Linesclass = subGridttartmq_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridttartmq_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridttartmq_level1item_Backstyle = (byte)(0) ;
         subGridttartmq_level1item_Backcolor = subGridttartmq_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridttartmq_level1item_Class, "") != 0 )
         {
            subGridttartmq_level1item_Linesclass = subGridttartmq_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridttartmq_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridttartmq_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridttartmq_level1item_Class, "") != 0 )
         {
            subGridttartmq_level1item_Linesclass = subGridttartmq_level1item_Class+"Odd" ;
         }
         subGridttartmq_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridttartmq_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridttartmq_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGridttartmq_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttartmq_level1item_Class, "") != 0 )
            {
               subGridttartmq_level1item_Linesclass = subGridttartmq_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridttartmq_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttartmq_level1item_Class, "") != 0 )
            {
               subGridttartmq_level1item_Linesclass = subGridttartmq_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_903_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttartmq_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridttartmq_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_903_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttartmq_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtRb_Internalname,GXutil.ltrim( localUtil.ntoc( A6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipArtRb_Enabled!=0) ? localUtil.format( A6190TipArtRb, "ZZ9.99") : localUtil.format( A6190TipArtRb, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipArtRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_903_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttartmq_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtVmn_Internalname,GXutil.ltrim( localUtil.ntoc( A6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipArtVmn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6233TipArtVmn), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6233TipArtVmn), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtVmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipArtVmn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_903_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttartmq_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtVmx_Internalname,GXutil.ltrim( localUtil.ntoc( A6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipArtVmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6234TipArtVmx), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6234TipArtVmx), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtVmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipArtVmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridttartmq_level1itemRow);
      send_integrity_lvl_hashesU2903( ) ;
      GXCCtl = "Z602MaqCod_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z602MaqCod));
      GXCCtl = "Z6190TipArtRb_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6190TipArtRb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6233TipArtVmn_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6233TipArtVmn, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6234TipArtVmx_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6234TipArtVmx, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_903_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_903_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_903_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_903, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTRB_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTVMN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTVMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridttartmq_level1itemContainer.AddRow(Gridttartmq_level1itemRow);
   }

   public void readRowU2903( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58903( ) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipArtRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTRB_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipArtVmn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTVMN_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipArtVmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTVMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
      n606MaqDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipArtRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipArtRb_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "TIPARTRB_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtRb_Internalname ;
         wbErr = true ;
         A6190TipArtRb = DecimalUtil.ZERO ;
         n6190TipArtRb = false ;
      }
      else
      {
         A6190TipArtRb = localUtil.ctond( httpContext.cgiGet( edtTipArtRb_Internalname)) ;
         n6190TipArtRb = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtVmn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtVmn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "TIPARTVMN_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtVmn_Internalname ;
         wbErr = true ;
         A6233TipArtVmn = 0 ;
         n6233TipArtVmn = false ;
      }
      else
      {
         A6233TipArtVmn = (int)(localUtil.ctol( httpContext.cgiGet( edtTipArtVmn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6233TipArtVmn = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtVmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtVmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "TIPARTVMX_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtVmx_Internalname ;
         wbErr = true ;
         A6234TipArtVmx = 0 ;
         n6234TipArtVmx = false ;
      }
      else
      {
         A6234TipArtVmx = (int)(localUtil.ctol( httpContext.cgiGet( edtTipArtVmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6234TipArtVmx = false ;
      }
      GXCCtl = "Z602MaqCod_" + sGXsfl_58_idx ;
      Z602MaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6190TipArtRb_" + sGXsfl_58_idx ;
      Z6190TipArtRb = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6233TipArtVmn_" + sGXsfl_58_idx ;
      Z6233TipArtVmn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6234TipArtVmx_" + sGXsfl_58_idx ;
      Z6234TipArtVmx = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_903_" + sGXsfl_58_idx ;
      nRcdDeleted_903 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_903_" + sGXsfl_58_idx ;
      nRcdExists_903 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_903_" + sGXsfl_58_idx ;
      nIsMod_903 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqCod_Enabled = edtMaqCod_Enabled ;
   }

   public void confirmValuesU20( )
   {
      nGXsfl_58_idx = 0 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58903( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_58903( ) ;
         httpContext.changePostValue( "Z602MaqCod_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z6190TipArtRb_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z6190TipArtRb_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6190TipArtRb_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z6233TipArtVmn_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z6233TipArtVmn_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6233TipArtVmn_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z6234TipArtVmx_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z6234TipArtVmx_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6234TipArtVmx_"+sGXsfl_58_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttartmq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6188MaqTArt", GXutil.ltrim( localUtil.ntoc( Z6188MaqTArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6189MaqTipDsc", GXutil.rtrim( Z6189MaqTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nGXsfl_58_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttartmq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTARTMQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RELACION TARTICULO-MAQUINA-RB", "") ;
   }

   public void initializeNonKeyU2902( )
   {
      A6189MaqTipDsc = "" ;
      n6189MaqTipDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6189MaqTipDsc", A6189MaqTipDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      Z6189MaqTipDsc = "" ;
   }

   public void initAllU2902( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6188MaqTArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6188MaqTArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6188MaqTArt), 4, 0));
      initializeNonKeyU2902( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyU2903( )
   {
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      A6190TipArtRb = DecimalUtil.ZERO ;
      n6190TipArtRb = false ;
      A6233TipArtVmn = 0 ;
      n6233TipArtVmn = false ;
      A6234TipArtVmx = 0 ;
      n6234TipArtVmx = false ;
      Z6190TipArtRb = DecimalUtil.ZERO ;
      Z6233TipArtVmn = 0 ;
      Z6234TipArtVmx = 0 ;
   }

   public void initAllU2903( )
   {
      A602MaqCod = "" ;
      initializeNonKeyU2903( ) ;
   }

   public void standaloneModalInsertU2903( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153152", true, true);
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
      httpContext.AddJavascriptSource("ttartmq.js", "?2026824153152", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties903( )
   {
      edtMaqCod_Enabled = defedtMaqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void startgridcontrol58( )
   {
      Gridttartmq_level1itemContainer.AddObjectProperty("GridName", "Gridttartmq_level1item");
      Gridttartmq_level1itemContainer.AddObjectProperty("Header", subGridttartmq_level1item_Header);
      Gridttartmq_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridttartmq_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridttartmq_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridttartmq_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttartmq_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridttartmq_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddColumnProperties(Gridttartmq_level1itemColumn);
      Gridttartmq_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttartmq_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
      Gridttartmq_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddColumnProperties(Gridttartmq_level1itemColumn);
      Gridttartmq_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttartmq_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6190TipArtRb, (byte)(6), (byte)(2), ".", "")));
      Gridttartmq_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddColumnProperties(Gridttartmq_level1itemColumn);
      Gridttartmq_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttartmq_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6233TipArtVmn, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddColumnProperties(Gridttartmq_level1itemColumn);
      Gridttartmq_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttartmq_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6234TipArtVmx, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtVmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddColumnProperties(Gridttartmq_level1itemColumn);
      Gridttartmq_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridttartmq_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridttartmq_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMaqTArt_Internalname = "MAQTART" ;
      edtMaqTipDsc_Internalname = "MAQTIPDSC" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtTipArtRb_Internalname = "TIPARTRB" ;
      edtTipArtVmn_Internalname = "TIPARTVMN" ;
      edtTipArtVmx_Internalname = "TIPARTVMX" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridttartmq_level1item_Internalname = "GRIDTTARTMQ_LEVEL1ITEM" ;
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
      subGridttartmq_level1item_Allowcollapsing = (byte)(0) ;
      subGridttartmq_level1item_Allowselection = (byte)(0) ;
      subGridttartmq_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "RELACION TARTICULO-MAQUINA-RB", "") );
      edtTipArtVmx_Jsonclick = "" ;
      edtTipArtVmn_Jsonclick = "" ;
      edtTipArtRb_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGridttartmq_level1item_Class = "Grid" ;
      subGridttartmq_level1item_Backcolorstyle = (byte)(0) ;
      edtTipArtVmx_Enabled = 1 ;
      edtTipArtVmn_Enabled = 1 ;
      edtTipArtRb_Enabled = 1 ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtMaqTipDsc_Jsonclick = "" ;
      edtMaqTipDsc_Enabled = 1 ;
      edtMaqTArt_Jsonclick = "" ;
      edtMaqTArt_Enabled = 1 ;
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

   public void gxnrgridttartmq_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_58903( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalU2903( ) ;
         standaloneModalU2903( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowU2903( ) ;
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_58903( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridttartmq_level1itemContainer)) ;
      /* End function gxnrGridttartmq_level1item_newrow */
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
      /* Using cursor T00U216 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00U216_A407EmprNom[0] ;
      n407EmprNom = T00U216_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtMaqTipDsc_Internalname ;
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
      /* Using cursor T00U216 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00U216_A407EmprNom[0] ;
      n407EmprNom = T00U216_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Maqtart( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6189MaqTipDsc", GXutil.rtrim( A6189MaqTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6188MaqTArt", GXutil.ltrim( localUtil.ntoc( Z6188MaqTArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6189MaqTipDsc", GXutil.rtrim( Z6189MaqTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor T00U224 */
      pr_default.execute(22, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      A606MaqDsc = T00U224_A606MaqDsc[0] ;
      n606MaqDsc = T00U224_n606MaqDsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
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
      setEventMetadata("VALID_MAQTART","{handler:'valid_Maqtart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6188MaqTArt',fld:'MAQTART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQTART",",oparms:[{av:'A6189MaqTipDsc',fld:'MAQTIPDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6188MaqTArt'},{av:'Z6189MaqTipDsc'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tipartvmx',iparms:[]");
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
      pr_default.close(22);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6189MaqTipDsc = "" ;
      Z602MaqCod = "" ;
      Z6190TipArtRb = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
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
      A6189MaqTipDsc = "" ;
      A407EmprNom = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridttartmq_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode903 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A606MaqDsc = "" ;
      A6190TipArtRb = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      T00U28_A6188MaqTArt = new short[1] ;
      T00U28_A6189MaqTipDsc = new String[] {""} ;
      T00U28_n6189MaqTipDsc = new boolean[] {false} ;
      T00U28_A407EmprNom = new String[] {""} ;
      T00U28_n407EmprNom = new boolean[] {false} ;
      T00U28_A396EmprCod = new String[] {""} ;
      T00U27_A407EmprNom = new String[] {""} ;
      T00U27_n407EmprNom = new boolean[] {false} ;
      T00U29_A407EmprNom = new String[] {""} ;
      T00U29_n407EmprNom = new boolean[] {false} ;
      T00U210_A396EmprCod = new String[] {""} ;
      T00U210_A6188MaqTArt = new short[1] ;
      T00U26_A6188MaqTArt = new short[1] ;
      T00U26_A6189MaqTipDsc = new String[] {""} ;
      T00U26_n6189MaqTipDsc = new boolean[] {false} ;
      T00U26_A396EmprCod = new String[] {""} ;
      sMode902 = "" ;
      T00U211_A396EmprCod = new String[] {""} ;
      T00U211_A6188MaqTArt = new short[1] ;
      T00U212_A396EmprCod = new String[] {""} ;
      T00U212_A6188MaqTArt = new short[1] ;
      T00U25_A6188MaqTArt = new short[1] ;
      T00U25_A6189MaqTipDsc = new String[] {""} ;
      T00U25_n6189MaqTipDsc = new boolean[] {false} ;
      T00U25_A396EmprCod = new String[] {""} ;
      T00U216_A407EmprNom = new String[] {""} ;
      T00U216_n407EmprNom = new boolean[] {false} ;
      T00U217_A396EmprCod = new String[] {""} ;
      T00U217_A6188MaqTArt = new short[1] ;
      Z606MaqDsc = "" ;
      T00U218_A6188MaqTArt = new short[1] ;
      T00U218_A606MaqDsc = new String[] {""} ;
      T00U218_n606MaqDsc = new boolean[] {false} ;
      T00U218_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U218_n6190TipArtRb = new boolean[] {false} ;
      T00U218_A6233TipArtVmn = new int[1] ;
      T00U218_n6233TipArtVmn = new boolean[] {false} ;
      T00U218_A6234TipArtVmx = new int[1] ;
      T00U218_n6234TipArtVmx = new boolean[] {false} ;
      T00U218_A396EmprCod = new String[] {""} ;
      T00U218_A602MaqCod = new String[] {""} ;
      T00U24_A606MaqDsc = new String[] {""} ;
      T00U24_n606MaqDsc = new boolean[] {false} ;
      T00U219_A606MaqDsc = new String[] {""} ;
      T00U219_n606MaqDsc = new boolean[] {false} ;
      T00U220_A396EmprCod = new String[] {""} ;
      T00U220_A6188MaqTArt = new short[1] ;
      T00U220_A602MaqCod = new String[] {""} ;
      T00U23_A6188MaqTArt = new short[1] ;
      T00U23_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U23_n6190TipArtRb = new boolean[] {false} ;
      T00U23_A6233TipArtVmn = new int[1] ;
      T00U23_n6233TipArtVmn = new boolean[] {false} ;
      T00U23_A6234TipArtVmx = new int[1] ;
      T00U23_n6234TipArtVmx = new boolean[] {false} ;
      T00U23_A396EmprCod = new String[] {""} ;
      T00U23_A602MaqCod = new String[] {""} ;
      T00U22_A6188MaqTArt = new short[1] ;
      T00U22_A6190TipArtRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U22_n6190TipArtRb = new boolean[] {false} ;
      T00U22_A6233TipArtVmn = new int[1] ;
      T00U22_n6233TipArtVmn = new boolean[] {false} ;
      T00U22_A6234TipArtVmx = new int[1] ;
      T00U22_n6234TipArtVmx = new boolean[] {false} ;
      T00U22_A396EmprCod = new String[] {""} ;
      T00U22_A602MaqCod = new String[] {""} ;
      T00U224_A606MaqDsc = new String[] {""} ;
      T00U224_n606MaqDsc = new boolean[] {false} ;
      T00U225_A396EmprCod = new String[] {""} ;
      T00U225_A6188MaqTArt = new short[1] ;
      T00U225_A602MaqCod = new String[] {""} ;
      Gridttartmq_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridttartmq_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridttartmq_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ6189MaqTipDsc = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttartmq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttartmq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttartmq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttartmq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttartmq__default(),
         new Object[] {
             new Object[] {
            T00U22_A6188MaqTArt, T00U22_A6190TipArtRb, T00U22_n6190TipArtRb, T00U22_A6233TipArtVmn, T00U22_n6233TipArtVmn, T00U22_A6234TipArtVmx, T00U22_n6234TipArtVmx, T00U22_A396EmprCod, T00U22_A602MaqCod
            }
            , new Object[] {
            T00U23_A6188MaqTArt, T00U23_A6190TipArtRb, T00U23_n6190TipArtRb, T00U23_A6233TipArtVmn, T00U23_n6233TipArtVmn, T00U23_A6234TipArtVmx, T00U23_n6234TipArtVmx, T00U23_A396EmprCod, T00U23_A602MaqCod
            }
            , new Object[] {
            T00U24_A606MaqDsc, T00U24_n606MaqDsc
            }
            , new Object[] {
            T00U25_A6188MaqTArt, T00U25_A6189MaqTipDsc, T00U25_n6189MaqTipDsc, T00U25_A396EmprCod
            }
            , new Object[] {
            T00U26_A6188MaqTArt, T00U26_A6189MaqTipDsc, T00U26_n6189MaqTipDsc, T00U26_A396EmprCod
            }
            , new Object[] {
            T00U27_A407EmprNom, T00U27_n407EmprNom
            }
            , new Object[] {
            T00U28_A6188MaqTArt, T00U28_A6189MaqTipDsc, T00U28_n6189MaqTipDsc, T00U28_A407EmprNom, T00U28_n407EmprNom, T00U28_A396EmprCod
            }
            , new Object[] {
            T00U29_A407EmprNom, T00U29_n407EmprNom
            }
            , new Object[] {
            T00U210_A396EmprCod, T00U210_A6188MaqTArt
            }
            , new Object[] {
            T00U211_A396EmprCod, T00U211_A6188MaqTArt
            }
            , new Object[] {
            T00U212_A396EmprCod, T00U212_A6188MaqTArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U216_A407EmprNom, T00U216_n407EmprNom
            }
            , new Object[] {
            T00U217_A396EmprCod, T00U217_A6188MaqTArt
            }
            , new Object[] {
            T00U218_A6188MaqTArt, T00U218_A606MaqDsc, T00U218_n606MaqDsc, T00U218_A6190TipArtRb, T00U218_n6190TipArtRb, T00U218_A6233TipArtVmn, T00U218_n6233TipArtVmn, T00U218_A6234TipArtVmx, T00U218_n6234TipArtVmx, T00U218_A396EmprCod,
            T00U218_A602MaqCod
            }
            , new Object[] {
            T00U219_A606MaqDsc, T00U219_n606MaqDsc
            }
            , new Object[] {
            T00U220_A396EmprCod, T00U220_A6188MaqTArt, T00U220_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U224_A606MaqDsc, T00U224_n606MaqDsc
            }
            , new Object[] {
            T00U225_A396EmprCod, T00U225_A6188MaqTArt, T00U225_A602MaqCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridttartmq_level1item_Backcolorstyle ;
   private byte subGridttartmq_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridttartmq_level1item_Allowselection ;
   private byte subGridttartmq_level1item_Allowhovering ;
   private byte subGridttartmq_level1item_Allowcollapsing ;
   private byte subGridttartmq_level1item_Collapsed ;
   private short Z6188MaqTArt ;
   private short nRcdDeleted_903 ;
   private short nRcdExists_903 ;
   private short nIsMod_903 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6188MaqTArt ;
   private short nBlankRcdCount903 ;
   private short RcdFound903 ;
   private short nBlankRcdUsr903 ;
   private short RcdFound902 ;
   private short nIsDirty_902 ;
   private short nIsDirty_903 ;
   private short ZZ6188MaqTArt ;
   private int nRC_GXsfl_58 ;
   private int nGXsfl_58_idx=1 ;
   private int Z6233TipArtVmn ;
   private int Z6234TipArtVmx ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqTArt_Enabled ;
   private int edtMaqTipDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtTipArtRb_Enabled ;
   private int edtTipArtVmn_Enabled ;
   private int edtTipArtVmx_Enabled ;
   private int fRowAdded ;
   private int A6233TipArtVmn ;
   private int A6234TipArtVmx ;
   private int GX_JID ;
   private int subGridttartmq_level1item_Backcolor ;
   private int subGridttartmq_level1item_Allbackcolor ;
   private int defedtMaqCod_Enabled ;
   private int idxLst ;
   private int subGridttartmq_level1item_Selectedindex ;
   private int subGridttartmq_level1item_Selectioncolor ;
   private int subGridttartmq_level1item_Hoveringcolor ;
   private long GRIDTTARTMQ_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6190TipArtRb ;
   private java.math.BigDecimal A6190TipArtRb ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6189MaqTipDsc ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_58_idx="0001" ;
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
   private String edtMaqTArt_Internalname ;
   private String edtMaqTArt_Jsonclick ;
   private String edtMaqTipDsc_Internalname ;
   private String A6189MaqTipDsc ;
   private String edtMaqTipDsc_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode903 ;
   private String edtMaqCod_Internalname ;
   private String edtMaqDsc_Internalname ;
   private String edtTipArtRb_Internalname ;
   private String edtTipArtVmn_Internalname ;
   private String edtTipArtVmx_Internalname ;
   private String sStyleString ;
   private String subGridttartmq_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A606MaqDsc ;
   private String Z407EmprNom ;
   private String sMode902 ;
   private String Z606MaqDsc ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGridttartmq_level1item_Class ;
   private String subGridttartmq_level1item_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtTipArtRb_Jsonclick ;
   private String edtTipArtVmn_Jsonclick ;
   private String edtTipArtVmx_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridttartmq_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6189MaqTipDsc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean n6189MaqTipDsc ;
   private boolean n407EmprNom ;
   private boolean n606MaqDsc ;
   private boolean n6190TipArtRb ;
   private boolean n6233TipArtVmn ;
   private boolean n6234TipArtVmx ;
   private com.genexus.webpanels.GXWebGrid Gridttartmq_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridttartmq_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridttartmq_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private short[] T00U28_A6188MaqTArt ;
   private String[] T00U28_A6189MaqTipDsc ;
   private boolean[] T00U28_n6189MaqTipDsc ;
   private String[] T00U28_A407EmprNom ;
   private boolean[] T00U28_n407EmprNom ;
   private String[] T00U28_A396EmprCod ;
   private String[] T00U27_A407EmprNom ;
   private boolean[] T00U27_n407EmprNom ;
   private String[] T00U29_A407EmprNom ;
   private boolean[] T00U29_n407EmprNom ;
   private String[] T00U210_A396EmprCod ;
   private short[] T00U210_A6188MaqTArt ;
   private short[] T00U26_A6188MaqTArt ;
   private String[] T00U26_A6189MaqTipDsc ;
   private boolean[] T00U26_n6189MaqTipDsc ;
   private String[] T00U26_A396EmprCod ;
   private String[] T00U211_A396EmprCod ;
   private short[] T00U211_A6188MaqTArt ;
   private String[] T00U212_A396EmprCod ;
   private short[] T00U212_A6188MaqTArt ;
   private short[] T00U25_A6188MaqTArt ;
   private String[] T00U25_A6189MaqTipDsc ;
   private boolean[] T00U25_n6189MaqTipDsc ;
   private String[] T00U25_A396EmprCod ;
   private String[] T00U216_A407EmprNom ;
   private boolean[] T00U216_n407EmprNom ;
   private String[] T00U217_A396EmprCod ;
   private short[] T00U217_A6188MaqTArt ;
   private short[] T00U218_A6188MaqTArt ;
   private String[] T00U218_A606MaqDsc ;
   private boolean[] T00U218_n606MaqDsc ;
   private java.math.BigDecimal[] T00U218_A6190TipArtRb ;
   private boolean[] T00U218_n6190TipArtRb ;
   private int[] T00U218_A6233TipArtVmn ;
   private boolean[] T00U218_n6233TipArtVmn ;
   private int[] T00U218_A6234TipArtVmx ;
   private boolean[] T00U218_n6234TipArtVmx ;
   private String[] T00U218_A396EmprCod ;
   private String[] T00U218_A602MaqCod ;
   private String[] T00U24_A606MaqDsc ;
   private boolean[] T00U24_n606MaqDsc ;
   private String[] T00U219_A606MaqDsc ;
   private boolean[] T00U219_n606MaqDsc ;
   private String[] T00U220_A396EmprCod ;
   private short[] T00U220_A6188MaqTArt ;
   private String[] T00U220_A602MaqCod ;
   private short[] T00U23_A6188MaqTArt ;
   private java.math.BigDecimal[] T00U23_A6190TipArtRb ;
   private boolean[] T00U23_n6190TipArtRb ;
   private int[] T00U23_A6233TipArtVmn ;
   private boolean[] T00U23_n6233TipArtVmn ;
   private int[] T00U23_A6234TipArtVmx ;
   private boolean[] T00U23_n6234TipArtVmx ;
   private String[] T00U23_A396EmprCod ;
   private String[] T00U23_A602MaqCod ;
   private short[] T00U22_A6188MaqTArt ;
   private java.math.BigDecimal[] T00U22_A6190TipArtRb ;
   private boolean[] T00U22_n6190TipArtRb ;
   private int[] T00U22_A6233TipArtVmn ;
   private boolean[] T00U22_n6233TipArtVmn ;
   private int[] T00U22_A6234TipArtVmx ;
   private boolean[] T00U22_n6234TipArtVmx ;
   private String[] T00U22_A396EmprCod ;
   private String[] T00U22_A602MaqCod ;
   private String[] T00U224_A606MaqDsc ;
   private boolean[] T00U224_n606MaqDsc ;
   private String[] T00U225_A396EmprCod ;
   private short[] T00U225_A6188MaqTArt ;
   private String[] T00U225_A602MaqCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttartmq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttartmq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttartmq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttartmq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttartmq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00U22", "SELECT MaqTArt, TipArtRb, TipArtVmn, TipArtVmx, EmprCod, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqTArt = ? AND MaqCod = ?  FOR UPDATE OF TipArtRb, TipArtVmn, TipArtVmx NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U23", "SELECT MaqTArt, TipArtRb, TipArtVmn, TipArtVmx, EmprCod, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqTArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U24", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U25", "SELECT MaqTArt, MaqTipDsc, EmprCod FROM TXPTARTMQ WHERE EmprCod = ? AND MaqTArt = ?  FOR UPDATE OF MaqTipDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U26", "SELECT MaqTArt, MaqTipDsc, EmprCod FROM TXPTARTMQ WHERE EmprCod = ? AND MaqTArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U28", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqTArt, TM1.MaqTipDsc, T2.EmprNom, TM1.EmprCod FROM (TXPTARTMQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqTArt = ? ORDER BY TM1.EmprCod, TM1.MaqTArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U210", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTArt FROM TXPTARTMQ WHERE EmprCod = ? AND MaqTArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTArt FROM TXPTARTMQ WHERE ( EmprCod > ? or EmprCod = ? and MaqTArt > ?) ORDER BY EmprCod, MaqTArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U212", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTArt FROM TXPTARTMQ WHERE ( EmprCod < ? or EmprCod = ? and MaqTArt < ?) ORDER BY EmprCod DESC, MaqTArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U213", "INSERT INTO TXPTARTMQ(MaqTArt, MaqTipDsc, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPTARTMQ")
         ,new UpdateCursor("T00U214", "UPDATE TXPTARTMQ SET MaqTipDsc=?  WHERE EmprCod = ? AND MaqTArt = ?", GX_NOMASK, "TXPTARTMQ")
         ,new UpdateCursor("T00U215", "DELETE FROM TXPTARTMQ  WHERE EmprCod = ? AND MaqTArt = ?", GX_NOMASK, "TXPTARTMQ")
         ,new ForEachCursor("T00U216", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U217", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqTArt FROM TXPTARTMQ ORDER BY EmprCod, MaqTArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U218", "SELECT T1.MaqTArt, T2.MaqDsc, T1.TipArtRb, T1.TipArtVmn, T1.TipArtVmx, T1.EmprCod, T1.MaqCod FROM (TXPTARTM1 T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.MaqTArt = ? and T1.MaqCod = ? ORDER BY T1.EmprCod, T1.MaqTArt, T1.MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U219", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U220", "SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqTArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00U221", "INSERT INTO TXPTARTM1(MaqTArt, TipArtRb, TipArtVmn, TipArtVmx, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTARTM1")
         ,new UpdateCursor("T00U222", "UPDATE TXPTARTM1 SET TipArtRb=?, TipArtVmn=?, TipArtVmx=?  WHERE EmprCod = ? AND MaqTArt = ? AND MaqCod = ?", GX_NOMASK, "TXPTARTM1")
         ,new UpdateCursor("T00U223", "DELETE FROM TXPTARTM1  WHERE EmprCod = ? AND MaqTArt = ? AND MaqCod = ?", GX_NOMASK, "TXPTARTM1")
         ,new ForEachCursor("T00U224", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U225", "SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? and MaqTArt = ? ORDER BY EmprCod, MaqTArt, MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setString(6, (String)parms[8], 6);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setString(6, (String)parms[8], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

