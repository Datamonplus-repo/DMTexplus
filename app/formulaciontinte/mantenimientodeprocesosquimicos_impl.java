package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientodeprocesosquimicos_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A710PrdFind = httpContext.GetPar( "PrdFind") ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A764ProForCod, A767ProForLin, A710PrdFind, A770ProForPrd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A767ProForLin = (short)(GXutil.lval( httpContext.GetPar( "ProForLin"))) ;
         A768ProForLinV = (short)(GXutil.lval( httpContext.GetPar( "ProForLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         A941EmprCodV2 = httpContext.GetPar( "EmprCodV2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
         A920ProForCodV = httpContext.GetPar( "ProForCodV") ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A764ProForCod, A767ProForLin, A768ProForLinV, A941EmprCodV2, A920ProForCodV) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmantenimientodeprocesosquimicos_lineas") == 0 )
      {
         gxnrgridmantenimientodeprocesosquimicos_lineas_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Procesos Quimicos", ""), (short)(0)) ;
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

   public void gxnrgridmantenimientodeprocesosquimicos_lineas_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmantenimientodeprocesosquimicos_lineas_newrow( ) ;
      /* End function gxnrGridmantenimientodeprocesosquimicos_lineas_newrow_invoke */
   }

   public mantenimientodeprocesosquimicos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientodeprocesosquimicos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientodeprocesosquimicos_impl.class ));
   }

   public mantenimientodeprocesosquimicos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Mantenimiento de Procesos Quimicos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Proc. Quim.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Proc. Quim.(large)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "Temp.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRs_Internalname, httpContext.getMessage( "Resina?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRs_Internalname, GXutil.rtrim( A13936ProForRs), GXutil.rtrim( localUtil.format( A13936ProForRs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProForRs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLineastable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelineas_Internalname, httpContext.getMessage( "Lineas", ""), "", "", lblTitlelineas_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridmantenimientodeprocesosquimicos_lineas( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MantenimientodeProcesosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridmantenimientodeprocesosquimicos_lineas( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount90 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_90 = (short)(1) ;
            scanStart1RT90( ) ;
            while ( RcdFound90 != 0 )
            {
               init_level_properties90( ) ;
               getByPrimaryKey1RT90( ) ;
               addRow1RT90( ) ;
               scanNext1RT90( ) ;
            }
            scanEnd1RT90( ) ;
            nBlankRcdCount90 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RT90( ) ;
         standaloneModal1RT90( ) ;
         sMode90 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRow1RT90( ) ;
            edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForDe2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDE2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDe2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDe2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_90 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RT90( ) ;
            }
            sendRow1RT90( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount90 = (short)(5) ;
         nRcdExists_90 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RT90( ) ;
            while ( RcdFound90 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_7390( ) ;
               init_level_properties90( ) ;
               standaloneNotModal1RT90( ) ;
               getByPrimaryKey1RT90( ) ;
               standaloneModal1RT90( ) ;
               addRow1RT90( ) ;
               scanNext1RT90( ) ;
            }
            scanEnd1RT90( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode90 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_7390( ) ;
      initAll1RT90( ) ;
      init_level_properties90( ) ;
      nRcdExists_90 = (short)(0) ;
      nIsMod_90 = (short)(0) ;
      nRcdDeleted_90 = (short)(0) ;
      nBlankRcdCount90 = (short)(nBlankRcdUsr90+nBlankRcdCount90) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount90 > 0 )
      {
         standaloneNotModal1RT90( ) ;
         standaloneModal1RT90( ) ;
         addRow1RT90( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount90 = (short)(nBlankRcdCount90-1) ;
      }
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridmantenimientodeprocesosquimicos_lineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridmantenimientodeprocesosquimicos_lineas", Gridmantenimientodeprocesosquimicos_lineasContainer, subGridmantenimientodeprocesosquimicos_lineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridmantenimientodeprocesosquimicos_lineasContainerData", Gridmantenimientodeprocesosquimicos_lineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridmantenimientodeprocesosquimicos_lineasContainerData"+"V", Gridmantenimientodeprocesosquimicos_lineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmantenimientodeprocesosquimicos_lineasContainerData"+"V"+"\" value='"+Gridmantenimientodeprocesosquimicos_lineasContainer.GridValuesHidden()+"'/>") ;
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
         Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
         Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
         Z4715ProForDsc2 = httpContext.cgiGet( "Z4715ProForDsc2") ;
         Z771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z771ProForTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( "Z772ProForTmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z769ProForMat = httpContext.cgiGet( "Z769ProForMat") ;
         Z674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
         Z773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z2393ProNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3005ProRev = httpContext.cgiGet( "Z3005ProRev") ;
         Z4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
         Z4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
         Z5523ProForTip = httpContext.cgiGet( "Z5523ProForTip") ;
         Z6061ProForLab = httpContext.cgiGet( "Z6061ProForLab") ;
         Z8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "Z8527ProForAbs")) ;
         Z8528ProForCos = localUtil.ctond( httpContext.cgiGet( "Z8528ProForCos")) ;
         Z10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10547ProH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
         Z13133ProForAct = httpContext.cgiGet( "Z13133ProForAct") ;
         Z13936ProForRs = httpContext.cgiGet( "Z13936ProForRs") ;
         A769ProForMat = httpContext.cgiGet( "Z769ProForMat") ;
         A674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
         A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z2393ProNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3005ProRev = httpContext.cgiGet( "Z3005ProRev") ;
         A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
         A4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
         A5523ProForTip = httpContext.cgiGet( "Z5523ProForTip") ;
         A6061ProForLab = httpContext.cgiGet( "Z6061ProForLab") ;
         A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "Z8527ProForAbs")) ;
         A8528ProForCos = localUtil.ctond( httpContext.cgiGet( "Z8528ProForCos")) ;
         A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10547ProH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
         A13133ProForAct = httpContext.cgiGet( "Z13133ProForAct") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A941EmprCodV2 = httpContext.cgiGet( "EMPRCODV2") ;
         A13740ProFDsc = httpContext.cgiGet( "PROFDSC") ;
         A920ProForCodV = httpContext.cgiGet( "PROFORCODV") ;
         A769ProForMat = httpContext.cgiGet( "PROFORMAT") ;
         A674PorForFul = localUtil.ctod( httpContext.cgiGet( "PORFORFUL"), 0) ;
         A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMPRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMREC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3005ProRev = httpContext.cgiGet( "PROREV") ;
         A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORPAU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORRB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4864ProForCCi = httpContext.cgiGet( "PROFORCCI") ;
         A4865ProForDCi = httpContext.cgiGet( "PROFORDCI") ;
         A5523ProForTip = httpContext.cgiGet( "PROFORTIP") ;
         A6061ProForLab = httpContext.cgiGet( "PROFORLAB") ;
         A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "PROFORABS")) ;
         A8528ProForCos = localUtil.ctond( httpContext.cgiGet( "PROFORCOS")) ;
         A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORVL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "PROH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "PROFORMER")) ;
         A13133ProForAct = httpContext.cgiGet( "PROFORACT") ;
         A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
         n407EmprNom = false ;
         A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( "PROFORCPO")) ;
         A13178ProForFT = httpContext.cgiGet( "PROFORFT") ;
         A710PrdFind = httpContext.cgiGet( "PRDFIND") ;
         A4340PrdUMeFind = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFIND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4340PrdUMeFind = false ;
         A717PrdMaxFind = httpContext.cgiGet( "PRDMAXFIND") ;
         n717PrdMaxFind = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForTie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A771ProForTie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         }
         else
         {
            A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTMX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProForTmx_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A772ProForTmx = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         }
         else
         {
            A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         }
         A13936ProForRs = httpContext.cgiGet( edtProForRs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientodeProcesosQuimicos");
         forbiddenHiddens.add("ProForMat", GXutil.rtrim( localUtil.format( A769ProForMat, "")));
         forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
         forbiddenHiddens.add("ProForUli", localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9"));
         forbiddenHiddens.add("ProNumPro", localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"));
         forbiddenHiddens.add("ProNumRec", localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"));
         forbiddenHiddens.add("ProRev", GXutil.rtrim( localUtil.format( A3005ProRev, "@!")));
         forbiddenHiddens.add("ProForPau", localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"));
         forbiddenHiddens.add("ProForRb", localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"));
         forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
         forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
         forbiddenHiddens.add("ProForTip", GXutil.rtrim( localUtil.format( A5523ProForTip, "")));
         forbiddenHiddens.add("ProForLab", GXutil.rtrim( localUtil.format( A6061ProForLab, "")));
         forbiddenHiddens.add("ProForAbs", localUtil.format( A8527ProForAbs, "ZZ9.99"));
         forbiddenHiddens.add("ProForCos", localUtil.format( A8528ProForCos, "ZZ9.9999"));
         forbiddenHiddens.add("ProforVl", localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"));
         forbiddenHiddens.add("ProH2O", localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"));
         forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
         forbiddenHiddens.add("ProForAct", GXutil.rtrim( localUtil.format( A13133ProForAct, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\mantenimientodeprocesosquimicos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A764ProForCod = httpContext.GetPar( "ProForCod") ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
            initAll1RT89( ) ;
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
      disableAttributes1RT89( ) ;
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

   public void confirm_1RT90( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1RT90( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            getKey1RT90( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               if ( RcdFound90 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RT90( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RT90( ) ;
                     closeExtendedTableCursors1RT90( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROFORLIN_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( nRcdDeleted_90 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RT90( ) ;
                     load1RT90( ) ;
                     beforeValidate1RT90( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RT90( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RT90( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RT90( ) ;
                           closeExtendedTableCursors1RT90( ) ;
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
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtProForDe2_Internalname, GXutil.rtrim( A13111ProForDe2)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_73_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_73_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_73_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_73_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_73_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_73_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDE2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDe2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RT0( )
   {
   }

   public void zm1RT89( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z766ProForDsc = T01RT16_A766ProForDsc[0] ;
            Z4715ProForDsc2 = T01RT16_A4715ProForDsc2[0] ;
            Z771ProForTie = T01RT16_A771ProForTie[0] ;
            Z772ProForTmx = T01RT16_A772ProForTmx[0] ;
            Z769ProForMat = T01RT16_A769ProForMat[0] ;
            Z674PorForFul = T01RT16_A674PorForFul[0] ;
            Z773ProForUli = T01RT16_A773ProForUli[0] ;
            Z2392ProNumPro = T01RT16_A2392ProNumPro[0] ;
            Z2393ProNumRec = T01RT16_A2393ProNumRec[0] ;
            Z3005ProRev = T01RT16_A3005ProRev[0] ;
            Z4705ProForPau = T01RT16_A4705ProForPau[0] ;
            Z4706ProForRb = T01RT16_A4706ProForRb[0] ;
            Z4864ProForCCi = T01RT16_A4864ProForCCi[0] ;
            Z4865ProForDCi = T01RT16_A4865ProForDCi[0] ;
            Z5523ProForTip = T01RT16_A5523ProForTip[0] ;
            Z6061ProForLab = T01RT16_A6061ProForLab[0] ;
            Z8527ProForAbs = T01RT16_A8527ProForAbs[0] ;
            Z8528ProForCos = T01RT16_A8528ProForCos[0] ;
            Z10120ProforVl = T01RT16_A10120ProforVl[0] ;
            Z10547ProH2O = T01RT16_A10547ProH2O[0] ;
            Z3589ProForMer = T01RT16_A3589ProForMer[0] ;
            Z13133ProForAct = T01RT16_A13133ProForAct[0] ;
            Z13936ProForRs = T01RT16_A13936ProForRs[0] ;
         }
         else
         {
            Z766ProForDsc = A766ProForDsc ;
            Z4715ProForDsc2 = A4715ProForDsc2 ;
            Z771ProForTie = A771ProForTie ;
            Z772ProForTmx = A772ProForTmx ;
            Z769ProForMat = A769ProForMat ;
            Z674PorForFul = A674PorForFul ;
            Z773ProForUli = A773ProForUli ;
            Z2392ProNumPro = A2392ProNumPro ;
            Z2393ProNumRec = A2393ProNumRec ;
            Z3005ProRev = A3005ProRev ;
            Z4705ProForPau = A4705ProForPau ;
            Z4706ProForRb = A4706ProForRb ;
            Z4864ProForCCi = A4864ProForCCi ;
            Z4865ProForDCi = A4865ProForDCi ;
            Z5523ProForTip = A5523ProForTip ;
            Z6061ProForLab = A6061ProForLab ;
            Z8527ProForAbs = A8527ProForAbs ;
            Z8528ProForCos = A8528ProForCos ;
            Z10120ProforVl = A10120ProforVl ;
            Z10547ProH2O = A10547ProH2O ;
            Z3589ProForMer = A3589ProForMer ;
            Z13133ProForAct = A13133ProForAct ;
            Z13936ProForRs = A13936ProForRs ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
         Z674PorForFul = A674PorForFul ;
         Z773ProForUli = A773ProForUli ;
         Z2392ProNumPro = A2392ProNumPro ;
         Z2393ProNumRec = A2393ProNumRec ;
         Z3005ProRev = A3005ProRev ;
         Z4705ProForPau = A4705ProForPau ;
         Z4706ProForRb = A4706ProForRb ;
         Z4864ProForCCi = A4864ProForCCi ;
         Z4865ProForDCi = A4865ProForDCi ;
         Z5523ProForTip = A5523ProForTip ;
         Z6061ProForLab = A6061ProForLab ;
         Z8527ProForAbs = A8527ProForAbs ;
         Z8528ProForCos = A8528ProForCos ;
         Z10120ProforVl = A10120ProforVl ;
         Z10547ProH2O = A10547ProH2O ;
         Z3589ProForMer = A3589ProForMer ;
         Z13133ProForAct = A13133ProForAct ;
         Z13936ProForRs = A13936ProForRs ;
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

   public void load1RT89( )
   {
      /* Using cursor T01RT18 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T01RT18_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01RT18_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T01RT18_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RT18_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RT18_A769ProForMat[0] ;
         A674PorForFul = T01RT18_A674PorForFul[0] ;
         A773ProForUli = T01RT18_A773ProForUli[0] ;
         A407EmprNom = T01RT18_A407EmprNom[0] ;
         n407EmprNom = T01RT18_n407EmprNom[0] ;
         A2392ProNumPro = T01RT18_A2392ProNumPro[0] ;
         A2393ProNumRec = T01RT18_A2393ProNumRec[0] ;
         A3005ProRev = T01RT18_A3005ProRev[0] ;
         A4705ProForPau = T01RT18_A4705ProForPau[0] ;
         A4706ProForRb = T01RT18_A4706ProForRb[0] ;
         A4864ProForCCi = T01RT18_A4864ProForCCi[0] ;
         A4865ProForDCi = T01RT18_A4865ProForDCi[0] ;
         A5523ProForTip = T01RT18_A5523ProForTip[0] ;
         A6061ProForLab = T01RT18_A6061ProForLab[0] ;
         A8527ProForAbs = T01RT18_A8527ProForAbs[0] ;
         A8528ProForCos = T01RT18_A8528ProForCos[0] ;
         A10120ProforVl = T01RT18_A10120ProforVl[0] ;
         A10547ProH2O = T01RT18_A10547ProH2O[0] ;
         A3589ProForMer = T01RT18_A3589ProForMer[0] ;
         A13133ProForAct = T01RT18_A13133ProForAct[0] ;
         A13936ProForRs = T01RT18_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         zm1RT89( -6) ;
      }
      pr_default.close(9);
      onLoadActions1RT89( ) ;
   }

   public void onLoadActions1RT89( )
   {
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
   }

   public void checkExtendedTable1RT89( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RT17 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RT17_A407EmprNom[0] ;
      n407EmprNom = T01RT17_n407EmprNom[0] ;
      pr_default.close(8);
      nIsDirty_89 = (short)(1) ;
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      nIsDirty_89 = (short)(1) ;
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      nIsDirty_89 = (short)(1) ;
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
   }

   public void closeExtendedTableCursors1RT89( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod )
   {
      /* Using cursor T01RT19 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RT19_A407EmprNom[0] ;
      n407EmprNom = T01RT19_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1RT89( )
   {
      /* Using cursor T01RT20 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RT16 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm1RT89( 6) ;
         RcdFound89 = (short)(1) ;
         A764ProForCod = T01RT16_A764ProForCod[0] ;
         n764ProForCod = T01RT16_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A766ProForDsc = T01RT16_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01RT16_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A771ProForTie = T01RT16_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01RT16_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01RT16_A769ProForMat[0] ;
         A674PorForFul = T01RT16_A674PorForFul[0] ;
         A773ProForUli = T01RT16_A773ProForUli[0] ;
         A2392ProNumPro = T01RT16_A2392ProNumPro[0] ;
         A2393ProNumRec = T01RT16_A2393ProNumRec[0] ;
         A3005ProRev = T01RT16_A3005ProRev[0] ;
         A4705ProForPau = T01RT16_A4705ProForPau[0] ;
         A4706ProForRb = T01RT16_A4706ProForRb[0] ;
         A4864ProForCCi = T01RT16_A4864ProForCCi[0] ;
         A4865ProForDCi = T01RT16_A4865ProForDCi[0] ;
         A5523ProForTip = T01RT16_A5523ProForTip[0] ;
         A6061ProForLab = T01RT16_A6061ProForLab[0] ;
         A8527ProForAbs = T01RT16_A8527ProForAbs[0] ;
         A8528ProForCos = T01RT16_A8528ProForCos[0] ;
         A10120ProforVl = T01RT16_A10120ProforVl[0] ;
         A10547ProH2O = T01RT16_A10547ProH2O[0] ;
         A3589ProForMer = T01RT16_A3589ProForMer[0] ;
         A13133ProForAct = T01RT16_A13133ProForAct[0] ;
         A13936ProForRs = T01RT16_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         A396EmprCod = T01RT16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RT89( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKey1RT89( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKey1RT89( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1RT89( ) ;
      if ( RcdFound89 == 0 )
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
      RcdFound89 = (short)(0) ;
      /* Using cursor T01RT21 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RT21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RT21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RT21_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RT21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RT21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RT21_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            A396EmprCod = T01RT21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01RT21_A764ProForCod[0] ;
            n764ProForCod = T01RT21_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01RT22 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RT22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RT22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RT22_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RT22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RT22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RT22_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            A396EmprCod = T01RT22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01RT22_A764ProForCod[0] ;
            n764ProForCod = T01RT22_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RT89( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RT89( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = Z764ProForCod ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
               update1RT89( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RT89( ) ;
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
                  insert1RT89( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = Z764ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RT89( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RT89( ) ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      scanStart1RT89( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound89 != 0 )
         {
            scanNext1RT89( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RT89( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RT89( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RT15 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z766ProForDsc, T01RT15_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4715ProForDsc2, T01RT15_A4715ProForDsc2[0]) != 0 ) || ( Z771ProForTie != T01RT15_A771ProForTie[0] ) || ( Z772ProForTmx != T01RT15_A772ProForTmx[0] ) || ( GXutil.strcmp(Z769ProForMat, T01RT15_A769ProForMat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01RT15_A674PorForFul[0])) ) || ( Z773ProForUli != T01RT15_A773ProForUli[0] ) || ( Z2392ProNumPro != T01RT15_A2392ProNumPro[0] ) || ( Z2393ProNumRec != T01RT15_A2393ProNumRec[0] ) || ( GXutil.strcmp(Z3005ProRev, T01RT15_A3005ProRev[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4705ProForPau != T01RT15_A4705ProForPau[0] ) || ( Z4706ProForRb != T01RT15_A4706ProForRb[0] ) || ( GXutil.strcmp(Z4864ProForCCi, T01RT15_A4864ProForCCi[0]) != 0 ) || ( GXutil.strcmp(Z4865ProForDCi, T01RT15_A4865ProForDCi[0]) != 0 ) || ( GXutil.strcmp(Z5523ProForTip, T01RT15_A5523ProForTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6061ProForLab, T01RT15_A6061ProForLab[0]) != 0 ) || ( DecimalUtil.compareTo(Z8527ProForAbs, T01RT15_A8527ProForAbs[0]) != 0 ) || ( DecimalUtil.compareTo(Z8528ProForCos, T01RT15_A8528ProForCos[0]) != 0 ) || ( Z10120ProforVl != T01RT15_A10120ProforVl[0] ) || ( Z10547ProH2O != T01RT15_A10547ProH2O[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3589ProForMer, T01RT15_A3589ProForMer[0]) != 0 ) || ( GXutil.strcmp(Z13133ProForAct, T01RT15_A13133ProForAct[0]) != 0 ) || ( GXutil.strcmp(Z13936ProForRs, T01RT15_A13936ProForRs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z766ProForDsc, T01RT15_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T01RT15_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4715ProForDsc2, T01RT15_A4715ProForDsc2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForDsc2");
               GXutil.writeLogRaw("Old: ",Z4715ProForDsc2);
               GXutil.writeLogRaw("Current: ",T01RT15_A4715ProForDsc2[0]);
            }
            if ( Z771ProForTie != T01RT15_A771ProForTie[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForTie");
               GXutil.writeLogRaw("Old: ",Z771ProForTie);
               GXutil.writeLogRaw("Current: ",T01RT15_A771ProForTie[0]);
            }
            if ( Z772ProForTmx != T01RT15_A772ProForTmx[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForTmx");
               GXutil.writeLogRaw("Old: ",Z772ProForTmx);
               GXutil.writeLogRaw("Current: ",T01RT15_A772ProForTmx[0]);
            }
            if ( GXutil.strcmp(Z769ProForMat, T01RT15_A769ProForMat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForMat");
               GXutil.writeLogRaw("Old: ",Z769ProForMat);
               GXutil.writeLogRaw("Current: ",T01RT15_A769ProForMat[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01RT15_A674PorForFul[0])) ) )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"PorForFul");
               GXutil.writeLogRaw("Old: ",Z674PorForFul);
               GXutil.writeLogRaw("Current: ",T01RT15_A674PorForFul[0]);
            }
            if ( Z773ProForUli != T01RT15_A773ProForUli[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForUli");
               GXutil.writeLogRaw("Old: ",Z773ProForUli);
               GXutil.writeLogRaw("Current: ",T01RT15_A773ProForUli[0]);
            }
            if ( Z2392ProNumPro != T01RT15_A2392ProNumPro[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProNumPro");
               GXutil.writeLogRaw("Old: ",Z2392ProNumPro);
               GXutil.writeLogRaw("Current: ",T01RT15_A2392ProNumPro[0]);
            }
            if ( Z2393ProNumRec != T01RT15_A2393ProNumRec[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProNumRec");
               GXutil.writeLogRaw("Old: ",Z2393ProNumRec);
               GXutil.writeLogRaw("Current: ",T01RT15_A2393ProNumRec[0]);
            }
            if ( GXutil.strcmp(Z3005ProRev, T01RT15_A3005ProRev[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProRev");
               GXutil.writeLogRaw("Old: ",Z3005ProRev);
               GXutil.writeLogRaw("Current: ",T01RT15_A3005ProRev[0]);
            }
            if ( Z4705ProForPau != T01RT15_A4705ProForPau[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForPau");
               GXutil.writeLogRaw("Old: ",Z4705ProForPau);
               GXutil.writeLogRaw("Current: ",T01RT15_A4705ProForPau[0]);
            }
            if ( Z4706ProForRb != T01RT15_A4706ProForRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForRb");
               GXutil.writeLogRaw("Old: ",Z4706ProForRb);
               GXutil.writeLogRaw("Current: ",T01RT15_A4706ProForRb[0]);
            }
            if ( GXutil.strcmp(Z4864ProForCCi, T01RT15_A4864ProForCCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForCCi");
               GXutil.writeLogRaw("Old: ",Z4864ProForCCi);
               GXutil.writeLogRaw("Current: ",T01RT15_A4864ProForCCi[0]);
            }
            if ( GXutil.strcmp(Z4865ProForDCi, T01RT15_A4865ProForDCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForDCi");
               GXutil.writeLogRaw("Old: ",Z4865ProForDCi);
               GXutil.writeLogRaw("Current: ",T01RT15_A4865ProForDCi[0]);
            }
            if ( GXutil.strcmp(Z5523ProForTip, T01RT15_A5523ProForTip[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForTip");
               GXutil.writeLogRaw("Old: ",Z5523ProForTip);
               GXutil.writeLogRaw("Current: ",T01RT15_A5523ProForTip[0]);
            }
            if ( GXutil.strcmp(Z6061ProForLab, T01RT15_A6061ProForLab[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForLab");
               GXutil.writeLogRaw("Old: ",Z6061ProForLab);
               GXutil.writeLogRaw("Current: ",T01RT15_A6061ProForLab[0]);
            }
            if ( DecimalUtil.compareTo(Z8527ProForAbs, T01RT15_A8527ProForAbs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForAbs");
               GXutil.writeLogRaw("Old: ",Z8527ProForAbs);
               GXutil.writeLogRaw("Current: ",T01RT15_A8527ProForAbs[0]);
            }
            if ( DecimalUtil.compareTo(Z8528ProForCos, T01RT15_A8528ProForCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForCos");
               GXutil.writeLogRaw("Old: ",Z8528ProForCos);
               GXutil.writeLogRaw("Current: ",T01RT15_A8528ProForCos[0]);
            }
            if ( Z10120ProforVl != T01RT15_A10120ProforVl[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProforVl");
               GXutil.writeLogRaw("Old: ",Z10120ProforVl);
               GXutil.writeLogRaw("Current: ",T01RT15_A10120ProforVl[0]);
            }
            if ( Z10547ProH2O != T01RT15_A10547ProH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProH2O");
               GXutil.writeLogRaw("Old: ",Z10547ProH2O);
               GXutil.writeLogRaw("Current: ",T01RT15_A10547ProH2O[0]);
            }
            if ( DecimalUtil.compareTo(Z3589ProForMer, T01RT15_A3589ProForMer[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForMer");
               GXutil.writeLogRaw("Old: ",Z3589ProForMer);
               GXutil.writeLogRaw("Current: ",T01RT15_A3589ProForMer[0]);
            }
            if ( GXutil.strcmp(Z13133ProForAct, T01RT15_A13133ProForAct[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForAct");
               GXutil.writeLogRaw("Old: ",Z13133ProForAct);
               GXutil.writeLogRaw("Current: ",T01RT15_A13133ProForAct[0]);
            }
            if ( GXutil.strcmp(Z13936ProForRs, T01RT15_A13936ProForRs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForRs");
               GXutil.writeLogRaw("Old: ",Z13936ProForRs);
               GXutil.writeLogRaw("Current: ",T01RT15_A13936ProForRs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RT89( )
   {
      beforeValidate1RT89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RT89( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RT89( 0) ;
         checkOptimisticConcurrency1RT89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RT89( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RT89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RT23 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A6061ProForLab, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
                        processLevel1RT89( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RT0( ) ;
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
            load1RT89( ) ;
         }
         endLevel1RT89( ) ;
      }
      closeExtendedTableCursors1RT89( ) ;
   }

   public void update1RT89( )
   {
      beforeValidate1RT89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RT89( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RT89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RT89( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RT89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RT24 */
                  pr_default.execute(15, new Object[] {A766ProForDsc, A4715ProForDsc2, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4864ProForCCi, A4865ProForDCi, A5523ProForTip, A6061ProForLab, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13133ProForAct, A13936ProForRs, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RT89( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RT89( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1RT0( ) ;
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
         endLevel1RT89( ) ;
      }
      closeExtendedTableCursors1RT89( ) ;
   }

   public void deferredUpdate1RT89( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RT89( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RT89( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RT89( ) ;
         afterConfirm1RT89( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RT89( ) ;
            if ( AnyError == 0 )
            {
               scanStart1RT90( ) ;
               while ( RcdFound90 != 0 )
               {
                  getByPrimaryKey1RT90( ) ;
                  delete1RT90( ) ;
                  scanNext1RT90( ) ;
               }
               scanEnd1RT90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RT25 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound89 == 0 )
                        {
                           initAll1RT89( ) ;
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
                        resetCaption1RT0( ) ;
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
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RT89( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RT89( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RT26 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01RT26_A407EmprNom[0] ;
         n407EmprNom = T01RT26_n407EmprNom[0] ;
         pr_default.close(17);
         A941EmprCodV2 = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RT27 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01RT28 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01RT29 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01RT30 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01RT31 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01RT32 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01RT33 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01RT34 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01RT35 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RT36 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RT37 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RT38 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RT39 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RT40 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RT41 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RT42 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RT43 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RT44 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RT45 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RT46 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RT47 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RT48 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RT49 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
      }
   }

   public void processNestedLevel1RT90( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1RT90( ) ;
         if ( ( nRcdExists_90 != 0 ) || ( nIsMod_90 != 0 ) )
         {
            standaloneNotModal1RT90( ) ;
            getKey1RT90( ) ;
            if ( ( nRcdExists_90 == 0 ) && ( nRcdDeleted_90 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RT90( ) ;
            }
            else
            {
               if ( RcdFound90 != 0 )
               {
                  if ( ( nRcdDeleted_90 != 0 ) && ( nRcdExists_90 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RT90( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_90 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RT90( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_90 == 0 )
                  {
                     GXCCtl = "PROFORLIN_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForPrd_Internalname, GXutil.rtrim( A770ProForPrd)) ;
         httpContext.changePostValue( edtProForDes_Internalname, GXutil.rtrim( A765ProForDes)) ;
         httpContext.changePostValue( edtProForDe2_Internalname, GXutil.rtrim( A13111ProForDe2)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtProForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCla_Internalname, GXutil.rtrim( A763ProForCla)) ;
         httpContext.changePostValue( edtProForClv_Internalname, GXutil.rtrim( A5358ProForClv)) ;
         httpContext.changePostValue( edtProForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_73_idx, GXutil.rtrim( Z770ProForPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_73_idx, GXutil.rtrim( Z765ProForDes)) ;
         httpContext.changePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_73_idx, GXutil.rtrim( Z13111ProForDe2)) ;
         httpContext.changePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_73_idx, GXutil.rtrim( Z763ProForCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_73_idx, GXutil.rtrim( Z5358ProForClv)) ;
         httpContext.changePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_73_idx, GXutil.rtrim( Z13178ProForFT)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_90_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_90 != 0 )
         {
            httpContext.changePostValue( "PROFORLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORPRD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDES_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDE2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDe2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCAN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCLV_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORNRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORTNQ_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RT90( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_90 = (short)(0) ;
      nIsMod_90 = (short)(0) ;
      nRcdDeleted_90 = (short)(0) ;
   }

   public void processLevel1RT89( )
   {
      /* Save parent mode. */
      sMode89 = Gx_mode ;
      processNestedLevel1RT90( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1RT89( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RT89( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.mantenimientodeprocesosquimicos");
         if ( AnyError == 0 )
         {
            confirmValues1RT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.mantenimientodeprocesosquimicos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RT89( )
   {
      /* Using cursor T01RT50 */
      pr_default.execute(41);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01RT50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RT50_A764ProForCod[0] ;
         n764ProForCod = T01RT50_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RT89( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01RT50_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RT50_A764ProForCod[0] ;
         n764ProForCod = T01RT50_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
   }

   public void scanEnd1RT89( )
   {
      pr_default.close(41);
   }

   public void afterConfirm1RT89( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RT89( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RT89( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RT89( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RT89( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RT89( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RT89( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProForRs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Enabled), 5, 0), true);
   }

   public void zm1RT90( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z770ProForPrd = T01RT3_A770ProForPrd[0] ;
            Z765ProForDes = T01RT3_A765ProForDes[0] ;
            Z13111ProForDe2 = T01RT3_A13111ProForDe2[0] ;
            Z762ProForCan = T01RT3_A762ProForCan[0] ;
            Z763ProForCla = T01RT3_A763ProForCla[0] ;
            Z5358ProForClv = T01RT3_A5358ProForClv[0] ;
            Z1645ProForNro = T01RT3_A1645ProForNro[0] ;
            Z3379ProForTnq = T01RT3_A3379ProForTnq[0] ;
            Z6062ProForCPo = T01RT3_A6062ProForCPo[0] ;
            Z13178ProForFT = T01RT3_A13178ProForFT[0] ;
            Z490ForPrdUMe = T01RT3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z770ProForPrd = A770ProForPrd ;
            Z765ProForDes = A765ProForDes ;
            Z13111ProForDe2 = A13111ProForDe2 ;
            Z762ProForCan = A762ProForCan ;
            Z763ProForCla = A763ProForCla ;
            Z5358ProForClv = A5358ProForClv ;
            Z1645ProForNro = A1645ProForNro ;
            Z3379ProForTnq = A3379ProForTnq ;
            Z6062ProForCPo = A6062ProForCPo ;
            Z13178ProForFT = A13178ProForFT ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         Z770ProForPrd = A770ProForPrd ;
         Z765ProForDes = A765ProForDes ;
         Z13111ProForDe2 = A13111ProForDe2 ;
         Z762ProForCan = A762ProForCan ;
         Z763ProForCla = A763ProForCla ;
         Z5358ProForClv = A5358ProForClv ;
         Z1645ProForNro = A1645ProForNro ;
         Z3379ProForTnq = A3379ProForTnq ;
         Z6062ProForCPo = A6062ProForCPo ;
         Z13178ProForFT = A13178ProForFT ;
         Z396EmprCod = A396EmprCod ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z710PrdFind = A710PrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1RT90( )
   {
   }

   public void standaloneModal1RT90( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtProForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void load1RT90( )
   {
      /* Using cursor T01RT51 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A770ProForPrd = T01RT51_A770ProForPrd[0] ;
         A765ProForDes = T01RT51_A765ProForDes[0] ;
         A13111ProForDe2 = T01RT51_A13111ProForDe2[0] ;
         A488ForPrdDsc = T01RT51_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RT51_n488ForPrdDsc[0] ;
         A762ProForCan = T01RT51_A762ProForCan[0] ;
         A763ProForCla = T01RT51_A763ProForCla[0] ;
         A5358ProForClv = T01RT51_A5358ProForClv[0] ;
         A1645ProForNro = T01RT51_A1645ProForNro[0] ;
         A3379ProForTnq = T01RT51_A3379ProForTnq[0] ;
         A6062ProForCPo = T01RT51_A6062ProForCPo[0] ;
         A13178ProForFT = T01RT51_A13178ProForFT[0] ;
         A490ForPrdUMe = T01RT51_A490ForPrdUMe[0] ;
         A710PrdFind = T01RT51_A710PrdFind[0] ;
         n710PrdFind = T01RT51_n710PrdFind[0] ;
         zm1RT90( -8) ;
      }
      pr_default.close(42);
      onLoadActions1RT90( ) ;
   }

   public void onLoadActions1RT90( )
   {
      /* Using cursor T01RT6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01RT6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RT6_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      /* Using cursor T01RT12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01RT12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RT12_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      pr_default.close(3);
   }

   public void checkExtendedTable1RT90( )
   {
      nIsDirty_90 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1RT90( ) ;
      /* Using cursor T01RT13 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01RT13_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RT13_n488ForPrdDsc[0] ;
      pr_default.close(4);
      /* Using cursor T01RT14 */
      pr_default.execute(5, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A710PrdFind = T01RT14_A710PrdFind[0] ;
         n710PrdFind = T01RT14_n710PrdFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      pr_default.close(5);
      /* Using cursor T01RT6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4340PrdUMeFind = T01RT6_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RT6_n4340PrdUMeFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      pr_default.close(2);
      nIsDirty_90 = (short)(1) ;
      A768ProForLinV = A767ProForLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      /* Using cursor T01RT12 */
      pr_default.execute(3, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A717PrdMaxFind = T01RT12_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RT12_n717PrdMaxFind[0] ;
      }
      else
      {
         nIsDirty_90 = (short)(1) ;
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      pr_default.close(3);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1RT90( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1RT90( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01RT52 */
      pr_default.execute(43, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01RT52_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RT52_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(43) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(43);
   }

   public void gxload_12( String A396EmprCod ,
                          String A770ProForPrd )
   {
      /* Using cursor T01RT53 */
      pr_default.execute(44, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(44) != 101) )
      {
         A710PrdFind = T01RT53_A710PrdFind[0] ;
         n710PrdFind = T01RT53_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A710PrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(44) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(44);
   }

   public void gxload_9( String A396EmprCod ,
                         String A764ProForCod ,
                         short A767ProForLin ,
                         String A710PrdFind ,
                         String A770ProForPrd )
   {
      /* Using cursor T01RT56 */
      pr_default.execute(45, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(45) != 101) )
      {
         A4340PrdUMeFind = T01RT56_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RT56_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(45) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(45);
   }

   public void gxload_10( String A396EmprCod ,
                          String A764ProForCod ,
                          short A767ProForLin ,
                          short A768ProForLinV ,
                          String A941EmprCodV2 ,
                          String A920ProForCodV )
   {
      /* Using cursor T01RT62 */
      pr_default.execute(46, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(46) != 101) )
      {
         A717PrdMaxFind = T01RT62_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RT62_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A717PrdMaxFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(46) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(46);
   }

   public void getKey1RT90( )
   {
      /* Using cursor T01RT63 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound90 = (short)(1) ;
      }
      else
      {
         RcdFound90 = (short)(0) ;
      }
      pr_default.close(47);
   }

   public void getByPrimaryKey1RT90( )
   {
      /* Using cursor T01RT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RT90( 8) ;
         RcdFound90 = (short)(1) ;
         initializeNonKey1RT90( ) ;
         A767ProForLin = T01RT3_A767ProForLin[0] ;
         A770ProForPrd = T01RT3_A770ProForPrd[0] ;
         A765ProForDes = T01RT3_A765ProForDes[0] ;
         A13111ProForDe2 = T01RT3_A13111ProForDe2[0] ;
         A762ProForCan = T01RT3_A762ProForCan[0] ;
         A763ProForCla = T01RT3_A763ProForCla[0] ;
         A5358ProForClv = T01RT3_A5358ProForClv[0] ;
         A1645ProForNro = T01RT3_A1645ProForNro[0] ;
         A3379ProForTnq = T01RT3_A3379ProForTnq[0] ;
         A6062ProForCPo = T01RT3_A6062ProForCPo[0] ;
         A13178ProForFT = T01RT3_A13178ProForFT[0] ;
         A490ForPrdUMe = T01RT3_A490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z767ProForLin = A767ProForLin ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RT90( ) ;
         load1RT90( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound90 = (short)(0) ;
         initializeNonKey1RT90( ) ;
         sMode90 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RT90( ) ;
         Gx_mode = sMode90 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RT90( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RT90( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z770ProForPrd, T01RT2_A770ProForPrd[0]) != 0 ) || ( GXutil.strcmp(Z765ProForDes, T01RT2_A765ProForDes[0]) != 0 ) || ( GXutil.strcmp(Z13111ProForDe2, T01RT2_A13111ProForDe2[0]) != 0 ) || ( DecimalUtil.compareTo(Z762ProForCan, T01RT2_A762ProForCan[0]) != 0 ) || ( GXutil.strcmp(Z763ProForCla, T01RT2_A763ProForCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5358ProForClv, T01RT2_A5358ProForClv[0]) != 0 ) || ( Z1645ProForNro != T01RT2_A1645ProForNro[0] ) || ( Z3379ProForTnq != T01RT2_A3379ProForTnq[0] ) || ( DecimalUtil.compareTo(Z6062ProForCPo, T01RT2_A6062ProForCPo[0]) != 0 ) || ( GXutil.strcmp(Z13178ProForFT, T01RT2_A13178ProForFT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01RT2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z770ProForPrd, T01RT2_A770ProForPrd[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForPrd");
               GXutil.writeLogRaw("Old: ",Z770ProForPrd);
               GXutil.writeLogRaw("Current: ",T01RT2_A770ProForPrd[0]);
            }
            if ( GXutil.strcmp(Z765ProForDes, T01RT2_A765ProForDes[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForDes");
               GXutil.writeLogRaw("Old: ",Z765ProForDes);
               GXutil.writeLogRaw("Current: ",T01RT2_A765ProForDes[0]);
            }
            if ( GXutil.strcmp(Z13111ProForDe2, T01RT2_A13111ProForDe2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForDe2");
               GXutil.writeLogRaw("Old: ",Z13111ProForDe2);
               GXutil.writeLogRaw("Current: ",T01RT2_A13111ProForDe2[0]);
            }
            if ( DecimalUtil.compareTo(Z762ProForCan, T01RT2_A762ProForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForCan");
               GXutil.writeLogRaw("Old: ",Z762ProForCan);
               GXutil.writeLogRaw("Current: ",T01RT2_A762ProForCan[0]);
            }
            if ( GXutil.strcmp(Z763ProForCla, T01RT2_A763ProForCla[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForCla");
               GXutil.writeLogRaw("Old: ",Z763ProForCla);
               GXutil.writeLogRaw("Current: ",T01RT2_A763ProForCla[0]);
            }
            if ( GXutil.strcmp(Z5358ProForClv, T01RT2_A5358ProForClv[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForClv");
               GXutil.writeLogRaw("Old: ",Z5358ProForClv);
               GXutil.writeLogRaw("Current: ",T01RT2_A5358ProForClv[0]);
            }
            if ( Z1645ProForNro != T01RT2_A1645ProForNro[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForNro");
               GXutil.writeLogRaw("Old: ",Z1645ProForNro);
               GXutil.writeLogRaw("Current: ",T01RT2_A1645ProForNro[0]);
            }
            if ( Z3379ProForTnq != T01RT2_A3379ProForTnq[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForTnq");
               GXutil.writeLogRaw("Old: ",Z3379ProForTnq);
               GXutil.writeLogRaw("Current: ",T01RT2_A3379ProForTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z6062ProForCPo, T01RT2_A6062ProForCPo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForCPo");
               GXutil.writeLogRaw("Old: ",Z6062ProForCPo);
               GXutil.writeLogRaw("Current: ",T01RT2_A6062ProForCPo[0]);
            }
            if ( GXutil.strcmp(Z13178ProForFT, T01RT2_A13178ProForFT[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ProForFT");
               GXutil.writeLogRaw("Old: ",Z13178ProForFT);
               GXutil.writeLogRaw("Current: ",T01RT2_A13178ProForFT[0]);
            }
            if ( Z490ForPrdUMe != T01RT2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.mantenimientodeprocesosquimicos:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01RT2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RT90( )
   {
      beforeValidate1RT90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RT90( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RT90( 0) ;
         checkOptimisticConcurrency1RT90( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RT90( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RT90( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RT64 */
                  pr_default.execute(48, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, A765ProForDes, A13111ProForDe2, A762ProForCan, A763ProForCla, A5358ProForClv, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A13178ProForFT, A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                  if ( (pr_default.getStatus(48) == 1) )
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
            load1RT90( ) ;
         }
         endLevel1RT90( ) ;
      }
      closeExtendedTableCursors1RT90( ) ;
   }

   public void update1RT90( )
   {
      beforeValidate1RT90( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RT90( ) ;
      }
      if ( ( nIsMod_90 != 0 ) || ( nIsDirty_90 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RT90( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RT90( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RT90( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RT65 */
                     pr_default.execute(49, new Object[] {A770ProForPrd, A765ProForDes, A13111ProForDe2, A762ProForCan, A763ProForCla, A5358ProForClv, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A6062ProForCPo, A13178ProForFT, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
                     if ( (pr_default.getStatus(49) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPROFO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RT90( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RT90( ) ;
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
            endLevel1RT90( ) ;
         }
      }
      closeExtendedTableCursors1RT90( ) ;
   }

   public void deferredUpdate1RT90( )
   {
   }

   public void delete1RT90( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RT90( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RT90( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RT90( ) ;
         afterConfirm1RT90( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RT90( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RT66 */
               pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A767ProForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
      sMode90 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RT90( ) ;
      Gx_mode = sMode90 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RT90( )
   {
      standaloneModal1RT90( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A768ProForLinV = A767ProForLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
         /* Using cursor T01RT72 */
         pr_default.execute(51, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
         if ( (pr_default.getStatus(51) != 101) )
         {
            A717PrdMaxFind = T01RT72_A717PrdMaxFind[0] ;
            n717PrdMaxFind = T01RT72_n717PrdMaxFind[0] ;
         }
         else
         {
            A717PrdMaxFind = "" ;
            n717PrdMaxFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
         }
         pr_default.close(51);
         /* Using cursor T01RT73 */
         pr_default.execute(52, new Object[] {A396EmprCod, A770ProForPrd});
         if ( (pr_default.getStatus(52) != 101) )
         {
            A710PrdFind = T01RT73_A710PrdFind[0] ;
            n710PrdFind = T01RT73_n710PrdFind[0] ;
         }
         else
         {
            A710PrdFind = "xxxxxx" ;
            n710PrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
         }
         pr_default.close(52);
         /* Using cursor T01RT76 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            A4340PrdUMeFind = T01RT76_A4340PrdUMeFind[0] ;
            n4340PrdUMeFind = T01RT76_n4340PrdUMeFind[0] ;
         }
         else
         {
            A4340PrdUMeFind = (byte)(0) ;
            n4340PrdUMeFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
         }
         pr_default.close(53);
         /* Using cursor T01RT77 */
         pr_default.execute(54, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01RT77_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RT77_n488ForPrdDsc[0] ;
         pr_default.close(54);
      }
   }

   public void endLevel1RT90( )
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

   public void scanStart1RT90( )
   {
      /* Scan By routine */
      /* Using cursor T01RT78 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01RT78_A767ProForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RT90( )
   {
      /* Scan next routine */
      pr_default.readNext(55);
      RcdFound90 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound90 = (short)(1) ;
         A767ProForLin = T01RT78_A767ProForLin[0] ;
      }
   }

   public void scanEnd1RT90( )
   {
      pr_default.close(55);
   }

   public void afterConfirm1RT90( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RT90( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RT90( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RT90( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RT90( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RT90( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RT90( )
   {
      edtProForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPrd_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDes_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForDe2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDe2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDe2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCan_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCla_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForClv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForClv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForClv_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForNro_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtProForTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTnq_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashes1RT90( )
   {
   }

   public void send_integrity_lvl_hashes1RT89( )
   {
   }

   public void subsflControlProps_7390( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_73_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_73_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_73_idx ;
      edtProForDe2_Internalname = "PROFORDE2_"+sGXsfl_73_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_73_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_73_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_73_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_73_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_73_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_73_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_7390( )
   {
      edtProForLin_Internalname = "PROFORLIN_"+sGXsfl_73_fel_idx ;
      edtProForPrd_Internalname = "PROFORPRD_"+sGXsfl_73_fel_idx ;
      edtProForDes_Internalname = "PROFORDES_"+sGXsfl_73_fel_idx ;
      edtProForDe2_Internalname = "PROFORDE2_"+sGXsfl_73_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_73_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_73_fel_idx ;
      edtProForCan_Internalname = "PROFORCAN_"+sGXsfl_73_fel_idx ;
      edtProForCla_Internalname = "PROFORCLA_"+sGXsfl_73_fel_idx ;
      edtProForClv_Internalname = "PROFORCLV_"+sGXsfl_73_fel_idx ;
      edtProForNro_Internalname = "PROFORNRO_"+sGXsfl_73_fel_idx ;
      edtProForTnq_Internalname = "PROFORTNQ_"+sGXsfl_73_fel_idx ;
   }

   public void addRow1RT90( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7390( ) ;
      sendRow1RT90( ) ;
   }

   public void sendRow1RT90( )
   {
      Gridmantenimientodeprocesosquimicos_lineasRow = GXWebRow.GetNew(context) ;
      if ( subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridmantenimientodeprocesosquimicos_lineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridmantenimientodeprocesosquimicos_lineas_Class, "") != 0 )
         {
            subGridmantenimientodeprocesosquimicos_lineas_Linesclass = subGridmantenimientodeprocesosquimicos_lineas_Class+"Odd" ;
         }
      }
      else if ( subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridmantenimientodeprocesosquimicos_lineas_Backstyle = (byte)(0) ;
         subGridmantenimientodeprocesosquimicos_lineas_Backcolor = subGridmantenimientodeprocesosquimicos_lineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridmantenimientodeprocesosquimicos_lineas_Class, "") != 0 )
         {
            subGridmantenimientodeprocesosquimicos_lineas_Linesclass = subGridmantenimientodeprocesosquimicos_lineas_Class+"Uniform" ;
         }
      }
      else if ( subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridmantenimientodeprocesosquimicos_lineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridmantenimientodeprocesosquimicos_lineas_Class, "") != 0 )
         {
            subGridmantenimientodeprocesosquimicos_lineas_Linesclass = subGridmantenimientodeprocesosquimicos_lineas_Class+"Odd" ;
         }
         subGridmantenimientodeprocesosquimicos_lineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridmantenimientodeprocesosquimicos_lineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridmantenimientodeprocesosquimicos_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmantenimientodeprocesosquimicos_lineas_Class, "") != 0 )
            {
               subGridmantenimientodeprocesosquimicos_lineas_Linesclass = subGridmantenimientodeprocesosquimicos_lineas_Class+"Even" ;
            }
         }
         else
         {
            subGridmantenimientodeprocesosquimicos_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmantenimientodeprocesosquimicos_lineas_Class, "") != 0 )
            {
               subGridmantenimientodeprocesosquimicos_lineas_Linesclass = subGridmantenimientodeprocesosquimicos_lineas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForPrd_Internalname,GXutil.rtrim( A770ProForPrd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForPrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDes_Internalname,GXutil.rtrim( A765ProForDes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDe2_Internalname,GXutil.rtrim( A13111ProForDe2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDe2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDe2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForCan_Enabled!=0) ? localUtil.format( A762ProForCan, "ZZZZZ9.9999") : localUtil.format( A762ProForCan, "ZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCla_Internalname,GXutil.rtrim( A763ProForCla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForClv_Internalname,GXutil.rtrim( A5358ProForClv),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForClv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForClv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1645ProForNro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForNro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_90_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridmantenimientodeprocesosquimicos_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProForTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3379ProForTnq), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForTnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridmantenimientodeprocesosquimicos_lineasRow);
      send_integrity_lvl_hashes1RT90( ) ;
      GXCCtl = "Z767ProForLin_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z770ProForPrd_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z770ProForPrd));
      GXCCtl = "Z765ProForDes_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z765ProForDes));
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13111ProForDe2));
      GXCCtl = "Z762ProForCan_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z762ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z763ProForCla_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z763ProForCla));
      GXCCtl = "Z5358ProForClv_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5358ProForClv));
      GXCCtl = "Z1645ProForNro_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1645ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3379ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13178ProForFT_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13178ProForFT));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PROFORLINV_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_90_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_90_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_90, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORPRD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDES_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDE2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDe2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCAN_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLA_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCLV_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORNRO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTNQ_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddRow(Gridmantenimientodeprocesosquimicos_lineasRow);
   }

   public void readRow1RT90( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7390( ) ;
      edtProForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLIN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORPRD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDES_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDe2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDE2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCAN_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLA_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForClv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCLV_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORNRO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORTNQ_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORLIN_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLin_Internalname ;
         wbErr = true ;
         A767ProForLin = (short)(0) ;
      }
      else
      {
         A767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A770ProForPrd = httpContext.cgiGet( edtProForPrd_Internalname) ;
      A765ProForDes = httpContext.cgiGet( edtProForDes_Internalname) ;
      A13111ProForDe2 = httpContext.cgiGet( edtProForDe2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_73_idx ;
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
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PROFORCAN_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCan_Internalname ;
         wbErr = true ;
         A762ProForCan = DecimalUtil.ZERO ;
      }
      else
      {
         A762ProForCan = localUtil.ctond( httpContext.cgiGet( edtProForCan_Internalname)) ;
      }
      A763ProForCla = httpContext.cgiGet( edtProForCla_Internalname) ;
      A5358ProForClv = httpContext.cgiGet( edtProForClv_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORNRO_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForNro_Internalname ;
         wbErr = true ;
         A1645ProForNro = (byte)(0) ;
      }
      else
      {
         A1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PROFORTNQ_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTnq_Internalname ;
         wbErr = true ;
         A3379ProForTnq = (byte)(0) ;
      }
      else
      {
         A3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtProForTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z767ProForLin_" + sGXsfl_73_idx ;
      Z767ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z770ProForPrd_" + sGXsfl_73_idx ;
      Z770ProForPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z765ProForDes_" + sGXsfl_73_idx ;
      Z765ProForDes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13111ProForDe2_" + sGXsfl_73_idx ;
      Z13111ProForDe2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z762ProForCan_" + sGXsfl_73_idx ;
      Z762ProForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z763ProForCla_" + sGXsfl_73_idx ;
      Z763ProForCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5358ProForClv_" + sGXsfl_73_idx ;
      Z5358ProForClv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1645ProForNro_" + sGXsfl_73_idx ;
      Z1645ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3379ProForTnq_" + sGXsfl_73_idx ;
      Z3379ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_73_idx ;
      Z6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_73_idx ;
      Z13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_73_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6062ProForCPo_" + sGXsfl_73_idx ;
      A6062ProForCPo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13178ProForFT_" + sGXsfl_73_idx ;
      A13178ProForFT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PROFORLINV_" + sGXsfl_73_idx ;
      A768ProForLinV = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_90_" + sGXsfl_73_idx ;
      nRcdDeleted_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_90_" + sGXsfl_73_idx ;
      nRcdExists_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_90_" + sGXsfl_73_idx ;
      nIsMod_90 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProForLin_Enabled = edtProForLin_Enabled ;
   }

   public void confirmValues1RT0( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7390( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7390( ) ;
         httpContext.changePostValue( "Z767ProForLin_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z767ProForLin_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z767ProForLin_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z770ProForPrd_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z770ProForPrd_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z770ProForPrd_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z765ProForDes_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z765ProForDes_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z765ProForDes_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z13111ProForDe2_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z13111ProForDe2_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13111ProForDe2_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z762ProForCan_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z762ProForCan_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z762ProForCan_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z763ProForCla_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z763ProForCla_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z763ProForCla_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5358ProForClv_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5358ProForClv_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5358ProForClv_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z1645ProForNro_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z1645ProForNro_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1645ProForNro_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z3379ProForTnq_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z3379ProForTnq_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3379ProForTnq_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z6062ProForCPo_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z6062ProForCPo_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6062ProForCPo_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z13178ProForFT_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z13178ProForFT_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13178ProForFT_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_73_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.mantenimientodeprocesosquimicos", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientodeProcesosQuimicos");
      forbiddenHiddens.add("ProForMat", GXutil.rtrim( localUtil.format( A769ProForMat, "")));
      forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      forbiddenHiddens.add("ProForUli", localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9"));
      forbiddenHiddens.add("ProNumPro", localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"));
      forbiddenHiddens.add("ProNumRec", localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"));
      forbiddenHiddens.add("ProRev", GXutil.rtrim( localUtil.format( A3005ProRev, "@!")));
      forbiddenHiddens.add("ProForPau", localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"));
      forbiddenHiddens.add("ProForRb", localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"));
      forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
      forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
      forbiddenHiddens.add("ProForTip", GXutil.rtrim( localUtil.format( A5523ProForTip, "")));
      forbiddenHiddens.add("ProForLab", GXutil.rtrim( localUtil.format( A6061ProForLab, "")));
      forbiddenHiddens.add("ProForAbs", localUtil.format( A8527ProForAbs, "ZZ9.99"));
      forbiddenHiddens.add("ProForCos", localUtil.format( A8528ProForCos, "ZZ9.9999"));
      forbiddenHiddens.add("ProforVl", localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"));
      forbiddenHiddens.add("ProH2O", localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"));
      forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
      forbiddenHiddens.add("ProForAct", GXutil.rtrim( localUtil.format( A13133ProForAct, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mantenimientodeprocesosquimicos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.dtoc( Z674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCODV2", GXutil.rtrim( A941EmprCodV2));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFDSC", A13740ProFDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCODV", GXutil.rtrim( A920ProForCodV));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMAT", GXutil.rtrim( A769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "PORFORFUL", localUtil.dtoc( A674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORULI", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMPRO", GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMREC", GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROREV", GXutil.rtrim( A3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORPAU", GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORRB", GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCCI", GXutil.rtrim( A4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDCI", GXutil.rtrim( A4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORTIP", GXutil.rtrim( A5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLAB", GXutil.rtrim( A6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORABS", GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOS", GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORVL", GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROH2O", GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMER", GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORACT", GXutil.rtrim( A13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLINV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCPO", GXutil.ltrim( localUtil.ntoc( A6062ProForCPo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORFT", GXutil.rtrim( A13178ProForFT));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIND", GXutil.rtrim( A710PrdFind));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFIND", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDMAXFIND", GXutil.rtrim( A717PrdMaxFind));
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
      return formatLink("app.formulaciontinte.mantenimientodeprocesosquimicos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.MantenimientodeProcesosQuimicos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Procesos Quimicos", "") ;
   }

   public void initializeNonKey1RT89( )
   {
      A920ProForCodV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      A13740ProFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A941EmprCodV2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A771ProForTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      A674PorForFul = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      A773ProForUli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2392ProNumPro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
      A2393ProNumRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
      A3005ProRev = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      A4705ProForPau = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
      A4706ProForRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
      A4864ProForCCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
      A4865ProForDCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
      A5523ProForTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
      A6061ProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      A8527ProForAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
      A8528ProForCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
      A10120ProforVl = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
      A10547ProH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
      A3589ProForMer = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
      A13133ProForAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A13936ProForRs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
      A13750ProForMaxL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13750ProForMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13750ProForMaxL), 4, 0));
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z771ProForTie = (short)(0) ;
      Z772ProForTmx = (short)(0) ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z773ProForUli = (short)(0) ;
      Z2392ProNumPro = 0 ;
      Z2393ProNumRec = 0 ;
      Z3005ProRev = "" ;
      Z4705ProForPau = (short)(0) ;
      Z4706ProForRb = (short)(0) ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z6061ProForLab = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z10120ProforVl = 0 ;
      Z10547ProH2O = (short)(0) ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
   }

   public void initAll1RT89( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A764ProForCod = "" ;
      n764ProForCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      initializeNonKey1RT89( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RT90( )
   {
      A710PrdFind = "" ;
      n710PrdFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", A710PrdFind);
      A4340PrdUMeFind = (byte)(0) ;
      n4340PrdUMeFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.str( A4340PrdUMeFind, 1, 0));
      A717PrdMaxFind = "" ;
      n717PrdMaxFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", A717PrdMaxFind);
      A768ProForLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A768ProForLinV), 4, 0));
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A13111ProForDe2 = "" ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A1645ProForNro = (byte)(0) ;
      A3379ProForTnq = (byte)(0) ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6062ProForCPo", GXutil.ltrimstr( A6062ProForCPo, 6, 2));
      A13178ProForFT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13178ProForFT", A13178ProForFT);
      A702PrdDscFind = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A702PrdDscFind", A702PrdDscFind);
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      Z1645ProForNro = (byte)(0) ;
      Z3379ProForTnq = (byte)(0) ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1RT90( )
   {
      A767ProForLin = (short)(0) ;
      initializeNonKey1RT90( ) ;
   }

   public void standaloneModalInsert1RT90( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415113323", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/mantenimientodeprocesosquimicos.js", "?202682415113323", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties90( )
   {
      edtProForLin_Enabled = defedtProForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("GridName", "Gridmantenimientodeprocesosquimicos_lineas");
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Header", subGridmantenimientodeprocesosquimicos_lineas_Header);
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Class", "Grid");
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("CmpContext", "");
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A770ProForPrd));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A765ProForDes));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A13111ProForDe2));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDe2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A762ProForCan, (byte)(12), (byte)(5), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A763ProForCla));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A5358ProForClv));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForClv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1645ProForNro, (byte)(2), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3379ProForTnq, (byte)(2), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddColumnProperties(Gridmantenimientodeprocesosquimicos_lineasColumn);
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridmantenimientodeprocesosquimicos_lineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmantenimientodeprocesosquimicos_lineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForRs_Internalname = "PROFORRS" ;
      lblTitlelineas_Internalname = "TITLELINEAS" ;
      edtProForLin_Internalname = "PROFORLIN" ;
      edtProForPrd_Internalname = "PROFORPRD" ;
      edtProForDes_Internalname = "PROFORDES" ;
      edtProForDe2_Internalname = "PROFORDE2" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtProForCan_Internalname = "PROFORCAN" ;
      edtProForCla_Internalname = "PROFORCLA" ;
      edtProForClv_Internalname = "PROFORCLV" ;
      edtProForNro_Internalname = "PROFORNRO" ;
      edtProForTnq_Internalname = "PROFORTNQ" ;
      divLineastable_Internalname = "LINEASTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridmantenimientodeprocesosquimicos_lineas_Internalname = "GRIDMANTENIMIENTODEPROCESOSQUIMICOS_LINEAS" ;
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
      subGridmantenimientodeprocesosquimicos_lineas_Allowcollapsing = (byte)(0) ;
      subGridmantenimientodeprocesosquimicos_lineas_Allowselection = (byte)(0) ;
      subGridmantenimientodeprocesosquimicos_lineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Procesos Quimicos", "") );
      edtProForTnq_Jsonclick = "" ;
      edtProForNro_Jsonclick = "" ;
      edtProForClv_Jsonclick = "" ;
      edtProForCla_Jsonclick = "" ;
      edtProForCan_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtProForDe2_Jsonclick = "" ;
      edtProForDes_Jsonclick = "" ;
      edtProForPrd_Jsonclick = "" ;
      edtProForLin_Jsonclick = "" ;
      subGridmantenimientodeprocesosquimicos_lineas_Class = "Grid" ;
      subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle = (byte)(0) ;
      edtProForTnq_Enabled = 1 ;
      edtProForNro_Enabled = 1 ;
      edtProForClv_Enabled = 1 ;
      edtProForCla_Enabled = 1 ;
      edtProForCan_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtProForDe2_Enabled = 1 ;
      edtProForDes_Enabled = 1 ;
      edtProForPrd_Enabled = 1 ;
      edtProForLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProForRs_Jsonclick = "" ;
      edtProForRs_Enabled = 1 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 1 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 1 ;
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
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

   public void gxnrgridmantenimientodeprocesosquimicos_lineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_7390( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RT90( ) ;
         standaloneModal1RT90( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RT90( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7390( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmantenimientodeprocesosquimicos_lineasContainer)) ;
      /* End function gxnrGridmantenimientodeprocesosquimicos_lineas_newrow */
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
      /* Using cursor T01RT26 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RT26_A407EmprNom[0] ;
      n407EmprNom = T01RT26_n407EmprNom[0] ;
      pr_default.close(17);
      GX_FocusControl = edtProForDsc_Internalname ;
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
      /* Using cursor T01RT26 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RT26_A407EmprNom[0] ;
      n407EmprNom = T01RT26_n407EmprNom[0] ;
      pr_default.close(17);
      A941EmprCodV2 = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", GXutil.rtrim( A941EmprCodV2));
   }

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      A920ProForCodV = A764ProForCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", GXutil.rtrim( A769ProForMat));
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", GXutil.rtrim( A3005ProRev));
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", GXutil.rtrim( A4864ProForCCi));
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", GXutil.rtrim( A4865ProForDCi));
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", GXutil.rtrim( A5523ProForTip));
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", GXutil.rtrim( A6061ProForLab));
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", GXutil.rtrim( A13133ProForAct));
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", GXutil.rtrim( A13936ProForRs));
      httpContext.ajax_rsp_assign_attri("", false, "A13750ProForMaxL", GXutil.ltrim( localUtil.ntoc( A13750ProForMaxL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", GXutil.rtrim( A941EmprCodV2));
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", GXutil.rtrim( A920ProForCodV));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.format(Z674PorForFul, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13750ProForMaxL", GXutil.ltrim( localUtil.ntoc( Z13750ProForMaxL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z941EmprCodV2", GXutil.rtrim( Z941EmprCodV2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13740ProFDsc", Z13740ProFDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z920ProForCodV", GXutil.rtrim( Z920ProForCodV));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforlin( )
   {
      n764ProForCod = false ;
      n717PrdMaxFind = false ;
      A768ProForLinV = A767ProForLin ;
      /* Using cursor T01RT72 */
      pr_default.execute(51, new Object[] {Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV, Short.valueOf(A768ProForLinV), A941EmprCodV2, A920ProForCodV});
      if ( (pr_default.getStatus(51) != 101) )
      {
         A717PrdMaxFind = T01RT72_A717PrdMaxFind[0] ;
         n717PrdMaxFind = T01RT72_n717PrdMaxFind[0] ;
      }
      else
      {
         A717PrdMaxFind = "" ;
         n717PrdMaxFind = false ;
      }
      pr_default.close(51);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A768ProForLinV", GXutil.ltrim( localUtil.ntoc( A768ProForLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A717PrdMaxFind", GXutil.rtrim( A717PrdMaxFind));
   }

   public void valid_Proforprd( )
   {
      n764ProForCod = false ;
      n710PrdFind = false ;
      n4340PrdUMeFind = false ;
      /* Using cursor T01RT73 */
      pr_default.execute(52, new Object[] {A396EmprCod, A770ProForPrd});
      if ( (pr_default.getStatus(52) != 101) )
      {
         A710PrdFind = T01RT73_A710PrdFind[0] ;
         n710PrdFind = T01RT73_n710PrdFind[0] ;
      }
      else
      {
         A710PrdFind = "xxxxxx" ;
         n710PrdFind = false ;
      }
      pr_default.close(52);
      /* Using cursor T01RT76 */
      pr_default.execute(53, new Object[] {Boolean.valueOf(n710PrdFind), A710PrdFind, A770ProForPrd, A396EmprCod});
      if ( (pr_default.getStatus(53) != 101) )
      {
         A4340PrdUMeFind = T01RT76_A4340PrdUMeFind[0] ;
         n4340PrdUMeFind = T01RT76_n4340PrdUMeFind[0] ;
      }
      else
      {
         A4340PrdUMeFind = (byte)(0) ;
         n4340PrdUMeFind = false ;
      }
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A710PrdFind", GXutil.rtrim( A710PrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A4340PrdUMeFind", GXutil.ltrim( localUtil.ntoc( A4340PrdUMeFind, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01RT77 */
      pr_default.execute(54, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01RT77_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RT77_n488ForPrdDsc[0] ;
      pr_default.close(54);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A2392ProNumPro',fld:'PRONUMPRO',pic:'ZZZZ9'},{av:'A2393ProNumRec',fld:'PRONUMREC',pic:'ZZZZ9'},{av:'A3005ProRev',fld:'PROREV',pic:'@!'},{av:'A4705ProForPau',fld:'PROFORPAU',pic:'ZZZ9'},{av:'A4706ProForRb',fld:'PROFORRB',pic:'ZZZ9'},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A5523ProForTip',fld:'PROFORTIP',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A8527ProForAbs',fld:'PROFORABS',pic:'ZZ9.99'},{av:'A8528ProForCos',fld:'PROFORCOS',pic:'ZZ9.9999'},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A10547ProH2O',fld:'PROH2O',pic:'ZZZ9'},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A10547ProH2O',fld:'PROH2O',pic:'ZZZ9'},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A8528ProForCos',fld:'PROFORCOS',pic:'ZZ9.9999'},{av:'A8527ProForAbs',fld:'PROFORABS',pic:'ZZ9.99'},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A5523ProForTip',fld:'PROFORTIP',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4706ProForRb',fld:'PROFORRB',pic:'ZZZ9'},{av:'A4705ProForPau',fld:'PROFORPAU',pic:'ZZZ9'},{av:'A3005ProRev',fld:'PROREV',pic:'@!'},{av:'A2393ProNumRec',fld:'PRONUMREC',pic:'ZZZZ9'},{av:'A2392ProNumPro',fld:'PRONUMPRO',pic:'ZZZZ9'},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'A771ProForTie',fld:'PROFORTIE',pic:'ZZZ9'},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'A769ProForMat',fld:'PROFORMAT',pic:''},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A2392ProNumPro',fld:'PRONUMPRO',pic:'ZZZZ9'},{av:'A2393ProNumRec',fld:'PRONUMREC',pic:'ZZZZ9'},{av:'A3005ProRev',fld:'PROREV',pic:'@!'},{av:'A4705ProForPau',fld:'PROFORPAU',pic:'ZZZ9'},{av:'A4706ProForRb',fld:'PROFORRB',pic:'ZZZ9'},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A5523ProForTip',fld:'PROFORTIP',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A8527ProForAbs',fld:'PROFORABS',pic:'ZZ9.99'},{av:'A8528ProForCos',fld:'PROFORCOS',pic:'ZZ9.9999'},{av:'A10120ProforVl',fld:'PROFORVL',pic:'ZZZZ9'},{av:'A10547ProH2O',fld:'PROH2O',pic:'ZZZ9'},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''},{av:'A13936ProForRs',fld:'PROFORRS',pic:''},{av:'A13750ProForMaxL',fld:'PROFORMAXL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A13740ProFDsc',fld:'PROFDSC',pic:''},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z764ProForCod'},{av:'Z766ProForDsc'},{av:'Z4715ProForDsc2'},{av:'Z771ProForTie'},{av:'Z772ProForTmx'},{av:'Z769ProForMat'},{av:'Z674PorForFul'},{av:'Z773ProForUli'},{av:'Z2392ProNumPro'},{av:'Z2393ProNumRec'},{av:'Z3005ProRev'},{av:'Z4705ProForPau'},{av:'Z4706ProForRb'},{av:'Z4864ProForCCi'},{av:'Z4865ProForDCi'},{av:'Z5523ProForTip'},{av:'Z6061ProForLab'},{av:'Z8527ProForAbs'},{av:'Z8528ProForCos'},{av:'Z10120ProforVl'},{av:'Z10547ProH2O'},{av:'Z3589ProForMer'},{av:'Z13133ProForAct'},{av:'Z13936ProForRs'},{av:'Z13750ProForMaxL'},{av:'Z407EmprNom'},{av:'Z941EmprCodV2'},{av:'Z13740ProFDsc'},{av:'Z920ProForCodV'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROFORDSC","{handler:'valid_Profordsc',iparms:[]");
      setEventMetadata("VALID_PROFORDSC",",oparms:[]}");
      setEventMetadata("VALID_PROFORLIN","{handler:'valid_Proforlin',iparms:[{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A941EmprCodV2',fld:'EMPRCODV2',pic:'@!'},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''}]");
      setEventMetadata("VALID_PROFORLIN",",oparms:[{av:'A768ProForLinV',fld:'PROFORLINV',pic:'ZZZ9'},{av:'A717PrdMaxFind',fld:'PRDMAXFIND',pic:''}]}");
      setEventMetadata("VALID_PROFORPRD","{handler:'valid_Proforprd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A770ProForPrd',fld:'PROFORPRD',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'},{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'}]");
      setEventMetadata("VALID_PROFORPRD",",oparms:[{av:'A710PrdFind',fld:'PRDFIND',pic:''},{av:'A4340PrdUMeFind',fld:'PRDUMEFIND',pic:'9'}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Profortnq',iparms:[]");
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
      pr_default.close(54);
      pr_default.close(52);
      pr_default.close(53);
      pr_default.close(51);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z3005ProRev = "" ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z5523ProForTip = "" ;
      Z6061ProForLab = "" ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13133ProForAct = "" ;
      Z13936ProForRs = "" ;
      Z770ProForPrd = "" ;
      Z765ProForDes = "" ;
      Z13111ProForDe2 = "" ;
      Z762ProForCan = DecimalUtil.ZERO ;
      Z763ProForCla = "" ;
      Z5358ProForClv = "" ;
      Z6062ProForCPo = DecimalUtil.ZERO ;
      Z13178ProForFT = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A770ProForPrd = "" ;
      A764ProForCod = "" ;
      A710PrdFind = "" ;
      A941EmprCodV2 = "" ;
      A920ProForCodV = "" ;
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
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A13936ProForRs = "" ;
      lblTitlelineas_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridmantenimientodeprocesosquimicos_lineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode90 = "" ;
      sStyleString = "" ;
      A769ProForMat = "" ;
      A674PorForFul = GXutil.nullDate() ;
      A3005ProRev = "" ;
      A4864ProForCCi = "" ;
      A4865ProForDCi = "" ;
      A5523ProForTip = "" ;
      A6061ProForLab = "" ;
      A8527ProForAbs = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A13133ProForAct = "" ;
      A13740ProFDsc = "" ;
      A407EmprNom = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A13178ProForFT = "" ;
      A717PrdMaxFind = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A765ProForDes = "" ;
      A13111ProForDe2 = "" ;
      A488ForPrdDsc = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      Z407EmprNom = "" ;
      T01RT18_A764ProForCod = new String[] {""} ;
      T01RT18_n764ProForCod = new boolean[] {false} ;
      T01RT18_A766ProForDsc = new String[] {""} ;
      T01RT18_A4715ProForDsc2 = new String[] {""} ;
      T01RT18_A771ProForTie = new short[1] ;
      T01RT18_A772ProForTmx = new short[1] ;
      T01RT18_A769ProForMat = new String[] {""} ;
      T01RT18_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RT18_A773ProForUli = new short[1] ;
      T01RT18_A407EmprNom = new String[] {""} ;
      T01RT18_n407EmprNom = new boolean[] {false} ;
      T01RT18_A2392ProNumPro = new int[1] ;
      T01RT18_A2393ProNumRec = new int[1] ;
      T01RT18_A3005ProRev = new String[] {""} ;
      T01RT18_A4705ProForPau = new short[1] ;
      T01RT18_A4706ProForRb = new short[1] ;
      T01RT18_A4864ProForCCi = new String[] {""} ;
      T01RT18_A4865ProForDCi = new String[] {""} ;
      T01RT18_A5523ProForTip = new String[] {""} ;
      T01RT18_A6061ProForLab = new String[] {""} ;
      T01RT18_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT18_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT18_A10120ProforVl = new int[1] ;
      T01RT18_A10547ProH2O = new short[1] ;
      T01RT18_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT18_A13133ProForAct = new String[] {""} ;
      T01RT18_A13936ProForRs = new String[] {""} ;
      T01RT18_A396EmprCod = new String[] {""} ;
      T01RT17_A407EmprNom = new String[] {""} ;
      T01RT17_n407EmprNom = new boolean[] {false} ;
      T01RT19_A407EmprNom = new String[] {""} ;
      T01RT19_n407EmprNom = new boolean[] {false} ;
      T01RT20_A396EmprCod = new String[] {""} ;
      T01RT20_A764ProForCod = new String[] {""} ;
      T01RT20_n764ProForCod = new boolean[] {false} ;
      T01RT16_A764ProForCod = new String[] {""} ;
      T01RT16_n764ProForCod = new boolean[] {false} ;
      T01RT16_A766ProForDsc = new String[] {""} ;
      T01RT16_A4715ProForDsc2 = new String[] {""} ;
      T01RT16_A771ProForTie = new short[1] ;
      T01RT16_A772ProForTmx = new short[1] ;
      T01RT16_A769ProForMat = new String[] {""} ;
      T01RT16_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RT16_A773ProForUli = new short[1] ;
      T01RT16_A2392ProNumPro = new int[1] ;
      T01RT16_A2393ProNumRec = new int[1] ;
      T01RT16_A3005ProRev = new String[] {""} ;
      T01RT16_A4705ProForPau = new short[1] ;
      T01RT16_A4706ProForRb = new short[1] ;
      T01RT16_A4864ProForCCi = new String[] {""} ;
      T01RT16_A4865ProForDCi = new String[] {""} ;
      T01RT16_A5523ProForTip = new String[] {""} ;
      T01RT16_A6061ProForLab = new String[] {""} ;
      T01RT16_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT16_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT16_A10120ProforVl = new int[1] ;
      T01RT16_A10547ProH2O = new short[1] ;
      T01RT16_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT16_A13133ProForAct = new String[] {""} ;
      T01RT16_A13936ProForRs = new String[] {""} ;
      T01RT16_A396EmprCod = new String[] {""} ;
      sMode89 = "" ;
      T01RT21_A396EmprCod = new String[] {""} ;
      T01RT21_A764ProForCod = new String[] {""} ;
      T01RT21_n764ProForCod = new boolean[] {false} ;
      T01RT22_A396EmprCod = new String[] {""} ;
      T01RT22_A764ProForCod = new String[] {""} ;
      T01RT22_n764ProForCod = new boolean[] {false} ;
      T01RT15_A764ProForCod = new String[] {""} ;
      T01RT15_n764ProForCod = new boolean[] {false} ;
      T01RT15_A766ProForDsc = new String[] {""} ;
      T01RT15_A4715ProForDsc2 = new String[] {""} ;
      T01RT15_A771ProForTie = new short[1] ;
      T01RT15_A772ProForTmx = new short[1] ;
      T01RT15_A769ProForMat = new String[] {""} ;
      T01RT15_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01RT15_A773ProForUli = new short[1] ;
      T01RT15_A2392ProNumPro = new int[1] ;
      T01RT15_A2393ProNumRec = new int[1] ;
      T01RT15_A3005ProRev = new String[] {""} ;
      T01RT15_A4705ProForPau = new short[1] ;
      T01RT15_A4706ProForRb = new short[1] ;
      T01RT15_A4864ProForCCi = new String[] {""} ;
      T01RT15_A4865ProForDCi = new String[] {""} ;
      T01RT15_A5523ProForTip = new String[] {""} ;
      T01RT15_A6061ProForLab = new String[] {""} ;
      T01RT15_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT15_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT15_A10120ProforVl = new int[1] ;
      T01RT15_A10547ProH2O = new short[1] ;
      T01RT15_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT15_A13133ProForAct = new String[] {""} ;
      T01RT15_A13936ProForRs = new String[] {""} ;
      T01RT15_A396EmprCod = new String[] {""} ;
      T01RT26_A407EmprNom = new String[] {""} ;
      T01RT26_n407EmprNom = new boolean[] {false} ;
      T01RT27_A396EmprCod = new String[] {""} ;
      T01RT27_A252CliCod = new int[1] ;
      T01RT27_A13381CliProQui = new String[] {""} ;
      T01RT28_A396EmprCod = new String[] {""} ;
      T01RT28_A13026PedDGId = new int[1] ;
      T01RT28_A758ProCod = new String[] {""} ;
      T01RT28_A13045PedDGFasLi = new short[1] ;
      T01RT28_A13057PedDGPQLin = new short[1] ;
      T01RT29_A396EmprCod = new String[] {""} ;
      T01RT29_A12673LavMqId = new int[1] ;
      T01RT29_A12692LavMqLnPq = new short[1] ;
      T01RT30_A396EmprCod = new String[] {""} ;
      T01RT30_A129BarCod = new int[1] ;
      T01RT30_A132BarCodReo = new byte[1] ;
      T01RT30_A130BarCodPar = new String[] {""} ;
      T01RT30_A4075recestncol = new byte[1] ;
      T01RT30_A4076recestnpro = new byte[1] ;
      T01RT31_A396EmprCod = new String[] {""} ;
      T01RT31_A4052EstNumFor = new int[1] ;
      T01RT31_A4053EstNumCol = new byte[1] ;
      T01RT31_A4057EstNumLin = new byte[1] ;
      T01RT32_A396EmprCod = new String[] {""} ;
      T01RT32_A6380Ft_procod = new String[] {""} ;
      T01RT32_A6383Ft_ProLin = new short[1] ;
      T01RT33_A396EmprCod = new String[] {""} ;
      T01RT33_A11270Pot_num = new int[1] ;
      T01RT34_A396EmprCod = new String[] {""} ;
      T01RT34_A764ProForCod = new String[] {""} ;
      T01RT34_n764ProForCod = new boolean[] {false} ;
      T01RT34_A8877Prg_Cod = new int[1] ;
      T01RT35_A396EmprCod = new String[] {""} ;
      T01RT35_A252CliCod = new int[1] ;
      T01RT35_A494ForSer = new String[] {""} ;
      T01RT35_A482ForColNom = new String[] {""} ;
      T01RT35_A483ForColNum = new int[1] ;
      T01RT35_A831TipColCod = new byte[1] ;
      T01RT35_A7094Acab_Ter = new String[] {""} ;
      T01RT36_A396EmprCod = new String[] {""} ;
      T01RT36_A758ProCod = new String[] {""} ;
      T01RT36_A774ProNumLin = new short[1] ;
      T01RT36_A6438ProFsaL = new short[1] ;
      T01RT37_A396EmprCod = new String[] {""} ;
      T01RT37_A6319C_Barcod = new int[1] ;
      T01RT37_A6320C_Barcodre = new byte[1] ;
      T01RT37_A6321C_Barcodpa = new String[] {""} ;
      T01RT37_A6322C_Reclinma = new short[1] ;
      T01RT37_A6323C_Reclinpr = new byte[1] ;
      T01RT38_A396EmprCod = new String[] {""} ;
      T01RT38_A361DisCod = new int[1] ;
      T01RT38_A758ProCod = new String[] {""} ;
      T01RT38_A368DisFasLin = new short[1] ;
      T01RT38_A5377DisQuiLin = new short[1] ;
      T01RT39_A396EmprCod = new String[] {""} ;
      T01RT39_A129BarCod = new int[1] ;
      T01RT39_A132BarCodReo = new byte[1] ;
      T01RT39_A130BarCodPar = new String[] {""} ;
      T01RT39_A758ProCod = new String[] {""} ;
      T01RT39_A194BarOrdLin = new short[1] ;
      T01RT39_A5371FasQuiLin = new short[1] ;
      T01RT40_A396EmprCod = new String[] {""} ;
      T01RT40_A764ProForCod = new String[] {""} ;
      T01RT40_n764ProForCod = new boolean[] {false} ;
      T01RT40_A5191ProForLC = new short[1] ;
      T01RT41_A396EmprCod = new String[] {""} ;
      T01RT41_A764ProForCod = new String[] {""} ;
      T01RT41_n764ProForCod = new boolean[] {false} ;
      T01RT41_A5191ProForLC = new short[1] ;
      T01RT42_A396EmprCod = new String[] {""} ;
      T01RT42_A831TipColCod = new byte[1] ;
      T01RT42_A5162TipColLin = new short[1] ;
      T01RT43_A396EmprCod = new String[] {""} ;
      T01RT43_A4744RecPreCod = new int[1] ;
      T01RT43_A4762RecPreLin = new short[1] ;
      T01RT44_A396EmprCod = new String[] {""} ;
      T01RT44_A252CliCod = new int[1] ;
      T01RT44_A65ArtCod = new String[] {""} ;
      T01RT44_A4658MdlCod = new String[] {""} ;
      T01RT44_A457FasCod = new String[] {""} ;
      T01RT44_A4660FasProLin = new short[1] ;
      T01RT45_A396EmprCod = new String[] {""} ;
      T01RT45_A457FasCod = new String[] {""} ;
      T01RT45_A4650FasForLin = new short[1] ;
      T01RT46_A396EmprCod = new String[] {""} ;
      T01RT46_A129BarCod = new int[1] ;
      T01RT46_A132BarCodReo = new byte[1] ;
      T01RT46_A130BarCodPar = new String[] {""} ;
      T01RT46_A2804RecLinMaq = new short[1] ;
      T01RT46_A1273RecLinPro = new byte[1] ;
      T01RT47_A396EmprCod = new String[] {""} ;
      T01RT47_A1514MacProCod = new String[] {""} ;
      T01RT47_A1517MacProLin = new short[1] ;
      T01RT48_A396EmprCod = new String[] {""} ;
      T01RT48_A252CliCod = new int[1] ;
      T01RT48_A494ForSer = new String[] {""} ;
      T01RT48_A482ForColNom = new String[] {""} ;
      T01RT48_A483ForColNum = new int[1] ;
      T01RT48_A831TipColCod = new byte[1] ;
      T01RT48_A1160ProForL = new short[1] ;
      T01RT49_A396EmprCod = new String[] {""} ;
      T01RT49_A910Workstat = new String[] {""} ;
      T01RT49_A887EscMLin = new int[1] ;
      T01RT50_A396EmprCod = new String[] {""} ;
      T01RT50_A764ProForCod = new String[] {""} ;
      T01RT50_n764ProForCod = new boolean[] {false} ;
      Z710PrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T01RT51_A719PrdNum = new String[] {""} ;
      T01RT51_A764ProForCod = new String[] {""} ;
      T01RT51_n764ProForCod = new boolean[] {false} ;
      T01RT51_A767ProForLin = new short[1] ;
      T01RT51_A770ProForPrd = new String[] {""} ;
      T01RT51_A765ProForDes = new String[] {""} ;
      T01RT51_A13111ProForDe2 = new String[] {""} ;
      T01RT51_A488ForPrdDsc = new String[] {""} ;
      T01RT51_n488ForPrdDsc = new boolean[] {false} ;
      T01RT51_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT51_A763ProForCla = new String[] {""} ;
      T01RT51_A5358ProForClv = new String[] {""} ;
      T01RT51_A1645ProForNro = new byte[1] ;
      T01RT51_A3379ProForTnq = new byte[1] ;
      T01RT51_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT51_A13178ProForFT = new String[] {""} ;
      T01RT51_A396EmprCod = new String[] {""} ;
      T01RT51_A490ForPrdUMe = new byte[1] ;
      T01RT51_A710PrdFind = new String[] {""} ;
      T01RT51_n710PrdFind = new boolean[] {false} ;
      T01RT6_A4340PrdUMeFind = new byte[1] ;
      T01RT6_n4340PrdUMeFind = new boolean[] {false} ;
      T01RT12_A717PrdMaxFind = new String[] {""} ;
      T01RT12_n717PrdMaxFind = new boolean[] {false} ;
      T01RT13_A488ForPrdDsc = new String[] {""} ;
      T01RT13_n488ForPrdDsc = new boolean[] {false} ;
      T01RT14_A710PrdFind = new String[] {""} ;
      T01RT14_n710PrdFind = new boolean[] {false} ;
      T01RT52_A488ForPrdDsc = new String[] {""} ;
      T01RT52_n488ForPrdDsc = new boolean[] {false} ;
      T01RT53_A710PrdFind = new String[] {""} ;
      T01RT53_n710PrdFind = new boolean[] {false} ;
      T01RT56_A4340PrdUMeFind = new byte[1] ;
      T01RT56_n4340PrdUMeFind = new boolean[] {false} ;
      T01RT62_A717PrdMaxFind = new String[] {""} ;
      T01RT62_n717PrdMaxFind = new boolean[] {false} ;
      T01RT63_A396EmprCod = new String[] {""} ;
      T01RT63_A764ProForCod = new String[] {""} ;
      T01RT63_n764ProForCod = new boolean[] {false} ;
      T01RT63_A767ProForLin = new short[1] ;
      T01RT3_A764ProForCod = new String[] {""} ;
      T01RT3_n764ProForCod = new boolean[] {false} ;
      T01RT3_A767ProForLin = new short[1] ;
      T01RT3_A770ProForPrd = new String[] {""} ;
      T01RT3_A765ProForDes = new String[] {""} ;
      T01RT3_A13111ProForDe2 = new String[] {""} ;
      T01RT3_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT3_A763ProForCla = new String[] {""} ;
      T01RT3_A5358ProForClv = new String[] {""} ;
      T01RT3_A1645ProForNro = new byte[1] ;
      T01RT3_A3379ProForTnq = new byte[1] ;
      T01RT3_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT3_A13178ProForFT = new String[] {""} ;
      T01RT3_A396EmprCod = new String[] {""} ;
      T01RT3_A490ForPrdUMe = new byte[1] ;
      T01RT2_A764ProForCod = new String[] {""} ;
      T01RT2_n764ProForCod = new boolean[] {false} ;
      T01RT2_A767ProForLin = new short[1] ;
      T01RT2_A770ProForPrd = new String[] {""} ;
      T01RT2_A765ProForDes = new String[] {""} ;
      T01RT2_A13111ProForDe2 = new String[] {""} ;
      T01RT2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT2_A763ProForCla = new String[] {""} ;
      T01RT2_A5358ProForClv = new String[] {""} ;
      T01RT2_A1645ProForNro = new byte[1] ;
      T01RT2_A3379ProForTnq = new byte[1] ;
      T01RT2_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RT2_A13178ProForFT = new String[] {""} ;
      T01RT2_A396EmprCod = new String[] {""} ;
      T01RT2_A490ForPrdUMe = new byte[1] ;
      T01RT72_A717PrdMaxFind = new String[] {""} ;
      T01RT72_n717PrdMaxFind = new boolean[] {false} ;
      T01RT73_A710PrdFind = new String[] {""} ;
      T01RT73_n710PrdFind = new boolean[] {false} ;
      T01RT76_A4340PrdUMeFind = new byte[1] ;
      T01RT76_n4340PrdUMeFind = new boolean[] {false} ;
      T01RT77_A488ForPrdDsc = new String[] {""} ;
      T01RT77_n488ForPrdDsc = new boolean[] {false} ;
      T01RT78_A396EmprCod = new String[] {""} ;
      T01RT78_A764ProForCod = new String[] {""} ;
      T01RT78_n764ProForCod = new boolean[] {false} ;
      T01RT78_A767ProForLin = new short[1] ;
      Gridmantenimientodeprocesosquimicos_lineasRow = new com.genexus.webpanels.GXWebRow();
      subGridmantenimientodeprocesosquimicos_lineas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A702PrdDscFind = "" ;
      Gridmantenimientodeprocesosquimicos_lineasColumn = new com.genexus.webpanels.GXWebColumn();
      Z941EmprCodV2 = "" ;
      Z13740ProFDsc = "" ;
      Z920ProForCodV = "" ;
      ZZ396EmprCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ766ProForDsc = "" ;
      ZZ4715ProForDsc2 = "" ;
      ZZ769ProForMat = "" ;
      ZZ674PorForFul = GXutil.nullDate() ;
      ZZ3005ProRev = "" ;
      ZZ4864ProForCCi = "" ;
      ZZ4865ProForDCi = "" ;
      ZZ5523ProForTip = "" ;
      ZZ6061ProForLab = "" ;
      ZZ8527ProForAbs = DecimalUtil.ZERO ;
      ZZ8528ProForCos = DecimalUtil.ZERO ;
      ZZ3589ProForMer = DecimalUtil.ZERO ;
      ZZ13133ProForAct = "" ;
      ZZ13936ProForRs = "" ;
      ZZ407EmprNom = "" ;
      ZZ941EmprCodV2 = "" ;
      ZZ13740ProFDsc = "" ;
      ZZ920ProForCodV = "" ;
      Z717PrdMaxFind = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mantenimientodeprocesosquimicos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mantenimientodeprocesosquimicos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mantenimientodeprocesosquimicos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mantenimientodeprocesosquimicos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mantenimientodeprocesosquimicos__default(),
         new Object[] {
             new Object[] {
            T01RT2_A764ProForCod, T01RT2_A767ProForLin, T01RT2_A770ProForPrd, T01RT2_A765ProForDes, T01RT2_A13111ProForDe2, T01RT2_A762ProForCan, T01RT2_A763ProForCla, T01RT2_A5358ProForClv, T01RT2_A1645ProForNro, T01RT2_A3379ProForTnq,
            T01RT2_A6062ProForCPo, T01RT2_A13178ProForFT, T01RT2_A396EmprCod, T01RT2_A490ForPrdUMe
            }
            , new Object[] {
            T01RT3_A764ProForCod, T01RT3_A767ProForLin, T01RT3_A770ProForPrd, T01RT3_A765ProForDes, T01RT3_A13111ProForDe2, T01RT3_A762ProForCan, T01RT3_A763ProForCla, T01RT3_A5358ProForClv, T01RT3_A1645ProForNro, T01RT3_A3379ProForTnq,
            T01RT3_A6062ProForCPo, T01RT3_A13178ProForFT, T01RT3_A396EmprCod, T01RT3_A490ForPrdUMe
            }
            , new Object[] {
            T01RT6_A4340PrdUMeFind, T01RT6_n4340PrdUMeFind
            }
            , new Object[] {
            T01RT12_A717PrdMaxFind, T01RT12_n717PrdMaxFind
            }
            , new Object[] {
            T01RT13_A488ForPrdDsc, T01RT13_n488ForPrdDsc
            }
            , new Object[] {
            T01RT14_A710PrdFind, T01RT14_n710PrdFind
            }
            , new Object[] {
            T01RT15_A764ProForCod, T01RT15_A766ProForDsc, T01RT15_A4715ProForDsc2, T01RT15_A771ProForTie, T01RT15_A772ProForTmx, T01RT15_A769ProForMat, T01RT15_A674PorForFul, T01RT15_A773ProForUli, T01RT15_A2392ProNumPro, T01RT15_A2393ProNumRec,
            T01RT15_A3005ProRev, T01RT15_A4705ProForPau, T01RT15_A4706ProForRb, T01RT15_A4864ProForCCi, T01RT15_A4865ProForDCi, T01RT15_A5523ProForTip, T01RT15_A6061ProForLab, T01RT15_A8527ProForAbs, T01RT15_A8528ProForCos, T01RT15_A10120ProforVl,
            T01RT15_A10547ProH2O, T01RT15_A3589ProForMer, T01RT15_A13133ProForAct, T01RT15_A13936ProForRs, T01RT15_A396EmprCod
            }
            , new Object[] {
            T01RT16_A764ProForCod, T01RT16_A766ProForDsc, T01RT16_A4715ProForDsc2, T01RT16_A771ProForTie, T01RT16_A772ProForTmx, T01RT16_A769ProForMat, T01RT16_A674PorForFul, T01RT16_A773ProForUli, T01RT16_A2392ProNumPro, T01RT16_A2393ProNumRec,
            T01RT16_A3005ProRev, T01RT16_A4705ProForPau, T01RT16_A4706ProForRb, T01RT16_A4864ProForCCi, T01RT16_A4865ProForDCi, T01RT16_A5523ProForTip, T01RT16_A6061ProForLab, T01RT16_A8527ProForAbs, T01RT16_A8528ProForCos, T01RT16_A10120ProforVl,
            T01RT16_A10547ProH2O, T01RT16_A3589ProForMer, T01RT16_A13133ProForAct, T01RT16_A13936ProForRs, T01RT16_A396EmprCod
            }
            , new Object[] {
            T01RT17_A407EmprNom, T01RT17_n407EmprNom
            }
            , new Object[] {
            T01RT18_A764ProForCod, T01RT18_A766ProForDsc, T01RT18_A4715ProForDsc2, T01RT18_A771ProForTie, T01RT18_A772ProForTmx, T01RT18_A769ProForMat, T01RT18_A674PorForFul, T01RT18_A773ProForUli, T01RT18_A407EmprNom, T01RT18_n407EmprNom,
            T01RT18_A2392ProNumPro, T01RT18_A2393ProNumRec, T01RT18_A3005ProRev, T01RT18_A4705ProForPau, T01RT18_A4706ProForRb, T01RT18_A4864ProForCCi, T01RT18_A4865ProForDCi, T01RT18_A5523ProForTip, T01RT18_A6061ProForLab, T01RT18_A8527ProForAbs,
            T01RT18_A8528ProForCos, T01RT18_A10120ProforVl, T01RT18_A10547ProH2O, T01RT18_A3589ProForMer, T01RT18_A13133ProForAct, T01RT18_A13936ProForRs, T01RT18_A396EmprCod
            }
            , new Object[] {
            T01RT19_A407EmprNom, T01RT19_n407EmprNom
            }
            , new Object[] {
            T01RT20_A396EmprCod, T01RT20_A764ProForCod
            }
            , new Object[] {
            T01RT21_A396EmprCod, T01RT21_A764ProForCod
            }
            , new Object[] {
            T01RT22_A396EmprCod, T01RT22_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RT26_A407EmprNom, T01RT26_n407EmprNom
            }
            , new Object[] {
            T01RT27_A396EmprCod, T01RT27_A252CliCod, T01RT27_A13381CliProQui
            }
            , new Object[] {
            T01RT28_A396EmprCod, T01RT28_A13026PedDGId, T01RT28_A758ProCod, T01RT28_A13045PedDGFasLi, T01RT28_A13057PedDGPQLin
            }
            , new Object[] {
            T01RT29_A396EmprCod, T01RT29_A12673LavMqId, T01RT29_A12692LavMqLnPq
            }
            , new Object[] {
            T01RT30_A396EmprCod, T01RT30_A129BarCod, T01RT30_A132BarCodReo, T01RT30_A130BarCodPar, T01RT30_A4075recestncol, T01RT30_A4076recestnpro
            }
            , new Object[] {
            T01RT31_A396EmprCod, T01RT31_A4052EstNumFor, T01RT31_A4053EstNumCol, T01RT31_A4057EstNumLin
            }
            , new Object[] {
            T01RT32_A396EmprCod, T01RT32_A6380Ft_procod, T01RT32_A6383Ft_ProLin
            }
            , new Object[] {
            T01RT33_A396EmprCod, T01RT33_A11270Pot_num
            }
            , new Object[] {
            T01RT34_A396EmprCod, T01RT34_A764ProForCod, T01RT34_A8877Prg_Cod
            }
            , new Object[] {
            T01RT35_A396EmprCod, T01RT35_A252CliCod, T01RT35_A494ForSer, T01RT35_A482ForColNom, T01RT35_A483ForColNum, T01RT35_A831TipColCod, T01RT35_A7094Acab_Ter
            }
            , new Object[] {
            T01RT36_A396EmprCod, T01RT36_A758ProCod, T01RT36_A774ProNumLin, T01RT36_A6438ProFsaL
            }
            , new Object[] {
            T01RT37_A396EmprCod, T01RT37_A6319C_Barcod, T01RT37_A6320C_Barcodre, T01RT37_A6321C_Barcodpa, T01RT37_A6322C_Reclinma, T01RT37_A6323C_Reclinpr
            }
            , new Object[] {
            T01RT38_A396EmprCod, T01RT38_A361DisCod, T01RT38_A758ProCod, T01RT38_A368DisFasLin, T01RT38_A5377DisQuiLin
            }
            , new Object[] {
            T01RT39_A396EmprCod, T01RT39_A129BarCod, T01RT39_A132BarCodReo, T01RT39_A130BarCodPar, T01RT39_A758ProCod, T01RT39_A194BarOrdLin, T01RT39_A5371FasQuiLin
            }
            , new Object[] {
            T01RT40_A396EmprCod, T01RT40_A764ProForCod, T01RT40_A5191ProForLC
            }
            , new Object[] {
            T01RT41_A396EmprCod, T01RT41_A764ProForCod, T01RT41_A5191ProForLC
            }
            , new Object[] {
            T01RT42_A396EmprCod, T01RT42_A831TipColCod, T01RT42_A5162TipColLin
            }
            , new Object[] {
            T01RT43_A396EmprCod, T01RT43_A4744RecPreCod, T01RT43_A4762RecPreLin
            }
            , new Object[] {
            T01RT44_A396EmprCod, T01RT44_A252CliCod, T01RT44_A65ArtCod, T01RT44_A4658MdlCod, T01RT44_A457FasCod, T01RT44_A4660FasProLin
            }
            , new Object[] {
            T01RT45_A396EmprCod, T01RT45_A457FasCod, T01RT45_A4650FasForLin
            }
            , new Object[] {
            T01RT46_A396EmprCod, T01RT46_A129BarCod, T01RT46_A132BarCodReo, T01RT46_A130BarCodPar, T01RT46_A2804RecLinMaq, T01RT46_A1273RecLinPro
            }
            , new Object[] {
            T01RT47_A396EmprCod, T01RT47_A1514MacProCod, T01RT47_A1517MacProLin
            }
            , new Object[] {
            T01RT48_A396EmprCod, T01RT48_A252CliCod, T01RT48_A494ForSer, T01RT48_A482ForColNom, T01RT48_A483ForColNum, T01RT48_A831TipColCod, T01RT48_A1160ProForL
            }
            , new Object[] {
            T01RT49_A396EmprCod, T01RT49_A910Workstat, T01RT49_A887EscMLin
            }
            , new Object[] {
            T01RT50_A396EmprCod, T01RT50_A764ProForCod
            }
            , new Object[] {
            T01RT51_A719PrdNum, T01RT51_A764ProForCod, T01RT51_A767ProForLin, T01RT51_A770ProForPrd, T01RT51_A765ProForDes, T01RT51_A13111ProForDe2, T01RT51_A488ForPrdDsc, T01RT51_n488ForPrdDsc, T01RT51_A762ProForCan, T01RT51_A763ProForCla,
            T01RT51_A5358ProForClv, T01RT51_A1645ProForNro, T01RT51_A3379ProForTnq, T01RT51_A6062ProForCPo, T01RT51_A13178ProForFT, T01RT51_A396EmprCod, T01RT51_A490ForPrdUMe, T01RT51_A710PrdFind, T01RT51_n710PrdFind
            }
            , new Object[] {
            T01RT52_A488ForPrdDsc, T01RT52_n488ForPrdDsc
            }
            , new Object[] {
            T01RT53_A710PrdFind, T01RT53_n710PrdFind
            }
            , new Object[] {
            T01RT56_A4340PrdUMeFind, T01RT56_n4340PrdUMeFind
            }
            , new Object[] {
            T01RT62_A717PrdMaxFind, T01RT62_n717PrdMaxFind
            }
            , new Object[] {
            T01RT63_A396EmprCod, T01RT63_A764ProForCod, T01RT63_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RT72_A717PrdMaxFind, T01RT72_n717PrdMaxFind
            }
            , new Object[] {
            T01RT73_A710PrdFind, T01RT73_n710PrdFind
            }
            , new Object[] {
            T01RT76_A4340PrdUMeFind, T01RT76_n4340PrdUMeFind
            }
            , new Object[] {
            T01RT77_A488ForPrdDsc, T01RT77_n488ForPrdDsc
            }
            , new Object[] {
            T01RT78_A396EmprCod, T01RT78_A764ProForCod, T01RT78_A767ProForLin
            }
         }
      );
   }

   private byte Z1645ProForNro ;
   private byte Z3379ProForTnq ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A4340PrdUMeFind ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte Gx_BScreen ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Backcolorstyle ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Allowselection ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Allowhovering ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Allowcollapsing ;
   private byte subGridmantenimientodeprocesosquimicos_lineas_Collapsed ;
   private byte Z4340PrdUMeFind ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short Z773ProForUli ;
   private short Z4705ProForPau ;
   private short Z4706ProForRb ;
   private short Z10547ProH2O ;
   private short Z767ProForLin ;
   private short nRcdDeleted_90 ;
   private short nRcdExists_90 ;
   private short nIsMod_90 ;
   private short A767ProForLin ;
   private short A768ProForLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short nBlankRcdCount90 ;
   private short RcdFound90 ;
   private short nBlankRcdUsr90 ;
   private short A773ProForUli ;
   private short A4705ProForPau ;
   private short A4706ProForRb ;
   private short A10547ProH2O ;
   private short RcdFound89 ;
   private short nIsDirty_89 ;
   private short nIsDirty_90 ;
   private short A13750ProForMaxL ;
   private short Z13750ProForMaxL ;
   private short ZZ771ProForTie ;
   private short ZZ772ProForTmx ;
   private short ZZ773ProForUli ;
   private short ZZ4705ProForPau ;
   private short ZZ4706ProForRb ;
   private short ZZ10547ProH2O ;
   private short ZZ13750ProForMaxL ;
   private short Z768ProForLinV ;
   private int Z2392ProNumPro ;
   private int Z2393ProNumRec ;
   private int Z10120ProforVl ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForRs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtProForLin_Enabled ;
   private int edtProForPrd_Enabled ;
   private int edtProForDes_Enabled ;
   private int edtProForDe2_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtProForCan_Enabled ;
   private int edtProForCla_Enabled ;
   private int edtProForClv_Enabled ;
   private int edtProForNro_Enabled ;
   private int edtProForTnq_Enabled ;
   private int fRowAdded ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int A10120ProforVl ;
   private int GX_JID ;
   private int subGridmantenimientodeprocesosquimicos_lineas_Backcolor ;
   private int subGridmantenimientodeprocesosquimicos_lineas_Allbackcolor ;
   private int defedtProForLin_Enabled ;
   private int idxLst ;
   private int subGridmantenimientodeprocesosquimicos_lineas_Selectedindex ;
   private int subGridmantenimientodeprocesosquimicos_lineas_Selectioncolor ;
   private int subGridmantenimientodeprocesosquimicos_lineas_Hoveringcolor ;
   private int ZZ2392ProNumPro ;
   private int ZZ2393ProNumRec ;
   private int ZZ10120ProforVl ;
   private long GRIDMANTENIMIENTODEPROCESOSQUIMICOS_LINEAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8527ProForAbs ;
   private java.math.BigDecimal Z8528ProForCos ;
   private java.math.BigDecimal Z3589ProForMer ;
   private java.math.BigDecimal Z762ProForCan ;
   private java.math.BigDecimal Z6062ProForCPo ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal ZZ8527ProForAbs ;
   private java.math.BigDecimal ZZ8528ProForCos ;
   private java.math.BigDecimal ZZ3589ProForMer ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z769ProForMat ;
   private String Z3005ProRev ;
   private String Z4864ProForCCi ;
   private String Z4865ProForDCi ;
   private String Z5523ProForTip ;
   private String Z6061ProForLab ;
   private String Z13133ProForAct ;
   private String Z13936ProForRs ;
   private String Z770ProForPrd ;
   private String Z765ProForDes ;
   private String Z13111ProForDe2 ;
   private String Z763ProForCla ;
   private String Z5358ProForClv ;
   private String Z13178ProForFT ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A770ProForPrd ;
   private String A764ProForCod ;
   private String A710PrdFind ;
   private String A941EmprCodV2 ;
   private String A920ProForCodV ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_73_idx="0001" ;
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
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForRs_Internalname ;
   private String A13936ProForRs ;
   private String edtProForRs_Jsonclick ;
   private String divLineastable_Internalname ;
   private String lblTitlelineas_Internalname ;
   private String lblTitlelineas_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode90 ;
   private String edtProForLin_Internalname ;
   private String edtProForPrd_Internalname ;
   private String edtProForDes_Internalname ;
   private String edtProForDe2_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtProForCan_Internalname ;
   private String edtProForCla_Internalname ;
   private String edtProForClv_Internalname ;
   private String edtProForNro_Internalname ;
   private String edtProForTnq_Internalname ;
   private String sStyleString ;
   private String subGridmantenimientodeprocesosquimicos_lineas_Internalname ;
   private String A769ProForMat ;
   private String A3005ProRev ;
   private String A4864ProForCCi ;
   private String A4865ProForDCi ;
   private String A5523ProForTip ;
   private String A6061ProForLab ;
   private String A13133ProForAct ;
   private String A407EmprNom ;
   private String A13178ProForFT ;
   private String A717PrdMaxFind ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A765ProForDes ;
   private String A13111ProForDe2 ;
   private String A488ForPrdDsc ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String Z407EmprNom ;
   private String sMode89 ;
   private String Z710PrdFind ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridmantenimientodeprocesosquimicos_lineas_Class ;
   private String subGridmantenimientodeprocesosquimicos_lineas_Linesclass ;
   private String ROClassString ;
   private String edtProForLin_Jsonclick ;
   private String edtProForPrd_Jsonclick ;
   private String edtProForDes_Jsonclick ;
   private String edtProForDe2_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtProForCan_Jsonclick ;
   private String edtProForCla_Jsonclick ;
   private String edtProForClv_Jsonclick ;
   private String edtProForNro_Jsonclick ;
   private String edtProForTnq_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A702PrdDscFind ;
   private String subGridmantenimientodeprocesosquimicos_lineas_Header ;
   private String Z941EmprCodV2 ;
   private String Z920ProForCodV ;
   private String ZZ396EmprCod ;
   private String ZZ764ProForCod ;
   private String ZZ766ProForDsc ;
   private String ZZ4715ProForDsc2 ;
   private String ZZ769ProForMat ;
   private String ZZ3005ProRev ;
   private String ZZ4864ProForCCi ;
   private String ZZ4865ProForDCi ;
   private String ZZ5523ProForTip ;
   private String ZZ6061ProForLab ;
   private String ZZ13133ProForAct ;
   private String ZZ13936ProForRs ;
   private String ZZ407EmprNom ;
   private String ZZ941EmprCodV2 ;
   private String ZZ920ProForCodV ;
   private String Z717PrdMaxFind ;
   private java.util.Date Z674PorForFul ;
   private java.util.Date A674PorForFul ;
   private java.util.Date ZZ674PorForFul ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean n710PrdFind ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4340PrdUMeFind ;
   private boolean n717PrdMaxFind ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private String A13740ProFDsc ;
   private String Z13740ProFDsc ;
   private String ZZ13740ProFDsc ;
   private com.genexus.webpanels.GXWebGrid Gridmantenimientodeprocesosquimicos_lineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridmantenimientodeprocesosquimicos_lineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridmantenimientodeprocesosquimicos_lineasColumn ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RT18_A764ProForCod ;
   private boolean[] T01RT18_n764ProForCod ;
   private String[] T01RT18_A766ProForDsc ;
   private String[] T01RT18_A4715ProForDsc2 ;
   private short[] T01RT18_A771ProForTie ;
   private short[] T01RT18_A772ProForTmx ;
   private String[] T01RT18_A769ProForMat ;
   private java.util.Date[] T01RT18_A674PorForFul ;
   private short[] T01RT18_A773ProForUli ;
   private String[] T01RT18_A407EmprNom ;
   private boolean[] T01RT18_n407EmprNom ;
   private int[] T01RT18_A2392ProNumPro ;
   private int[] T01RT18_A2393ProNumRec ;
   private String[] T01RT18_A3005ProRev ;
   private short[] T01RT18_A4705ProForPau ;
   private short[] T01RT18_A4706ProForRb ;
   private String[] T01RT18_A4864ProForCCi ;
   private String[] T01RT18_A4865ProForDCi ;
   private String[] T01RT18_A5523ProForTip ;
   private String[] T01RT18_A6061ProForLab ;
   private java.math.BigDecimal[] T01RT18_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RT18_A8528ProForCos ;
   private int[] T01RT18_A10120ProforVl ;
   private short[] T01RT18_A10547ProH2O ;
   private java.math.BigDecimal[] T01RT18_A3589ProForMer ;
   private String[] T01RT18_A13133ProForAct ;
   private String[] T01RT18_A13936ProForRs ;
   private String[] T01RT18_A396EmprCod ;
   private String[] T01RT17_A407EmprNom ;
   private boolean[] T01RT17_n407EmprNom ;
   private String[] T01RT19_A407EmprNom ;
   private boolean[] T01RT19_n407EmprNom ;
   private String[] T01RT20_A396EmprCod ;
   private String[] T01RT20_A764ProForCod ;
   private boolean[] T01RT20_n764ProForCod ;
   private String[] T01RT16_A764ProForCod ;
   private boolean[] T01RT16_n764ProForCod ;
   private String[] T01RT16_A766ProForDsc ;
   private String[] T01RT16_A4715ProForDsc2 ;
   private short[] T01RT16_A771ProForTie ;
   private short[] T01RT16_A772ProForTmx ;
   private String[] T01RT16_A769ProForMat ;
   private java.util.Date[] T01RT16_A674PorForFul ;
   private short[] T01RT16_A773ProForUli ;
   private int[] T01RT16_A2392ProNumPro ;
   private int[] T01RT16_A2393ProNumRec ;
   private String[] T01RT16_A3005ProRev ;
   private short[] T01RT16_A4705ProForPau ;
   private short[] T01RT16_A4706ProForRb ;
   private String[] T01RT16_A4864ProForCCi ;
   private String[] T01RT16_A4865ProForDCi ;
   private String[] T01RT16_A5523ProForTip ;
   private String[] T01RT16_A6061ProForLab ;
   private java.math.BigDecimal[] T01RT16_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RT16_A8528ProForCos ;
   private int[] T01RT16_A10120ProforVl ;
   private short[] T01RT16_A10547ProH2O ;
   private java.math.BigDecimal[] T01RT16_A3589ProForMer ;
   private String[] T01RT16_A13133ProForAct ;
   private String[] T01RT16_A13936ProForRs ;
   private String[] T01RT16_A396EmprCod ;
   private String[] T01RT21_A396EmprCod ;
   private String[] T01RT21_A764ProForCod ;
   private boolean[] T01RT21_n764ProForCod ;
   private String[] T01RT22_A396EmprCod ;
   private String[] T01RT22_A764ProForCod ;
   private boolean[] T01RT22_n764ProForCod ;
   private String[] T01RT15_A764ProForCod ;
   private boolean[] T01RT15_n764ProForCod ;
   private String[] T01RT15_A766ProForDsc ;
   private String[] T01RT15_A4715ProForDsc2 ;
   private short[] T01RT15_A771ProForTie ;
   private short[] T01RT15_A772ProForTmx ;
   private String[] T01RT15_A769ProForMat ;
   private java.util.Date[] T01RT15_A674PorForFul ;
   private short[] T01RT15_A773ProForUli ;
   private int[] T01RT15_A2392ProNumPro ;
   private int[] T01RT15_A2393ProNumRec ;
   private String[] T01RT15_A3005ProRev ;
   private short[] T01RT15_A4705ProForPau ;
   private short[] T01RT15_A4706ProForRb ;
   private String[] T01RT15_A4864ProForCCi ;
   private String[] T01RT15_A4865ProForDCi ;
   private String[] T01RT15_A5523ProForTip ;
   private String[] T01RT15_A6061ProForLab ;
   private java.math.BigDecimal[] T01RT15_A8527ProForAbs ;
   private java.math.BigDecimal[] T01RT15_A8528ProForCos ;
   private int[] T01RT15_A10120ProforVl ;
   private short[] T01RT15_A10547ProH2O ;
   private java.math.BigDecimal[] T01RT15_A3589ProForMer ;
   private String[] T01RT15_A13133ProForAct ;
   private String[] T01RT15_A13936ProForRs ;
   private String[] T01RT15_A396EmprCod ;
   private String[] T01RT26_A407EmprNom ;
   private boolean[] T01RT26_n407EmprNom ;
   private String[] T01RT27_A396EmprCod ;
   private int[] T01RT27_A252CliCod ;
   private String[] T01RT27_A13381CliProQui ;
   private String[] T01RT28_A396EmprCod ;
   private int[] T01RT28_A13026PedDGId ;
   private String[] T01RT28_A758ProCod ;
   private short[] T01RT28_A13045PedDGFasLi ;
   private short[] T01RT28_A13057PedDGPQLin ;
   private String[] T01RT29_A396EmprCod ;
   private int[] T01RT29_A12673LavMqId ;
   private short[] T01RT29_A12692LavMqLnPq ;
   private String[] T01RT30_A396EmprCod ;
   private int[] T01RT30_A129BarCod ;
   private byte[] T01RT30_A132BarCodReo ;
   private String[] T01RT30_A130BarCodPar ;
   private byte[] T01RT30_A4075recestncol ;
   private byte[] T01RT30_A4076recestnpro ;
   private String[] T01RT31_A396EmprCod ;
   private int[] T01RT31_A4052EstNumFor ;
   private byte[] T01RT31_A4053EstNumCol ;
   private byte[] T01RT31_A4057EstNumLin ;
   private String[] T01RT32_A396EmprCod ;
   private String[] T01RT32_A6380Ft_procod ;
   private short[] T01RT32_A6383Ft_ProLin ;
   private String[] T01RT33_A396EmprCod ;
   private int[] T01RT33_A11270Pot_num ;
   private String[] T01RT34_A396EmprCod ;
   private String[] T01RT34_A764ProForCod ;
   private boolean[] T01RT34_n764ProForCod ;
   private int[] T01RT34_A8877Prg_Cod ;
   private String[] T01RT35_A396EmprCod ;
   private int[] T01RT35_A252CliCod ;
   private String[] T01RT35_A494ForSer ;
   private String[] T01RT35_A482ForColNom ;
   private int[] T01RT35_A483ForColNum ;
   private byte[] T01RT35_A831TipColCod ;
   private String[] T01RT35_A7094Acab_Ter ;
   private String[] T01RT36_A396EmprCod ;
   private String[] T01RT36_A758ProCod ;
   private short[] T01RT36_A774ProNumLin ;
   private short[] T01RT36_A6438ProFsaL ;
   private String[] T01RT37_A396EmprCod ;
   private int[] T01RT37_A6319C_Barcod ;
   private byte[] T01RT37_A6320C_Barcodre ;
   private String[] T01RT37_A6321C_Barcodpa ;
   private short[] T01RT37_A6322C_Reclinma ;
   private byte[] T01RT37_A6323C_Reclinpr ;
   private String[] T01RT38_A396EmprCod ;
   private int[] T01RT38_A361DisCod ;
   private String[] T01RT38_A758ProCod ;
   private short[] T01RT38_A368DisFasLin ;
   private short[] T01RT38_A5377DisQuiLin ;
   private String[] T01RT39_A396EmprCod ;
   private int[] T01RT39_A129BarCod ;
   private byte[] T01RT39_A132BarCodReo ;
   private String[] T01RT39_A130BarCodPar ;
   private String[] T01RT39_A758ProCod ;
   private short[] T01RT39_A194BarOrdLin ;
   private short[] T01RT39_A5371FasQuiLin ;
   private String[] T01RT40_A396EmprCod ;
   private String[] T01RT40_A764ProForCod ;
   private boolean[] T01RT40_n764ProForCod ;
   private short[] T01RT40_A5191ProForLC ;
   private String[] T01RT41_A396EmprCod ;
   private String[] T01RT41_A764ProForCod ;
   private boolean[] T01RT41_n764ProForCod ;
   private short[] T01RT41_A5191ProForLC ;
   private String[] T01RT42_A396EmprCod ;
   private byte[] T01RT42_A831TipColCod ;
   private short[] T01RT42_A5162TipColLin ;
   private String[] T01RT43_A396EmprCod ;
   private int[] T01RT43_A4744RecPreCod ;
   private short[] T01RT43_A4762RecPreLin ;
   private String[] T01RT44_A396EmprCod ;
   private int[] T01RT44_A252CliCod ;
   private String[] T01RT44_A65ArtCod ;
   private String[] T01RT44_A4658MdlCod ;
   private String[] T01RT44_A457FasCod ;
   private short[] T01RT44_A4660FasProLin ;
   private String[] T01RT45_A396EmprCod ;
   private String[] T01RT45_A457FasCod ;
   private short[] T01RT45_A4650FasForLin ;
   private String[] T01RT46_A396EmprCod ;
   private int[] T01RT46_A129BarCod ;
   private byte[] T01RT46_A132BarCodReo ;
   private String[] T01RT46_A130BarCodPar ;
   private short[] T01RT46_A2804RecLinMaq ;
   private byte[] T01RT46_A1273RecLinPro ;
   private String[] T01RT47_A396EmprCod ;
   private String[] T01RT47_A1514MacProCod ;
   private short[] T01RT47_A1517MacProLin ;
   private String[] T01RT48_A396EmprCod ;
   private int[] T01RT48_A252CliCod ;
   private String[] T01RT48_A494ForSer ;
   private String[] T01RT48_A482ForColNom ;
   private int[] T01RT48_A483ForColNum ;
   private byte[] T01RT48_A831TipColCod ;
   private short[] T01RT48_A1160ProForL ;
   private String[] T01RT49_A396EmprCod ;
   private String[] T01RT49_A910Workstat ;
   private int[] T01RT49_A887EscMLin ;
   private String[] T01RT50_A396EmprCod ;
   private String[] T01RT50_A764ProForCod ;
   private boolean[] T01RT50_n764ProForCod ;
   private String[] T01RT51_A719PrdNum ;
   private String[] T01RT51_A764ProForCod ;
   private boolean[] T01RT51_n764ProForCod ;
   private short[] T01RT51_A767ProForLin ;
   private String[] T01RT51_A770ProForPrd ;
   private String[] T01RT51_A765ProForDes ;
   private String[] T01RT51_A13111ProForDe2 ;
   private String[] T01RT51_A488ForPrdDsc ;
   private boolean[] T01RT51_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RT51_A762ProForCan ;
   private String[] T01RT51_A763ProForCla ;
   private String[] T01RT51_A5358ProForClv ;
   private byte[] T01RT51_A1645ProForNro ;
   private byte[] T01RT51_A3379ProForTnq ;
   private java.math.BigDecimal[] T01RT51_A6062ProForCPo ;
   private String[] T01RT51_A13178ProForFT ;
   private String[] T01RT51_A396EmprCod ;
   private byte[] T01RT51_A490ForPrdUMe ;
   private String[] T01RT51_A710PrdFind ;
   private boolean[] T01RT51_n710PrdFind ;
   private byte[] T01RT6_A4340PrdUMeFind ;
   private boolean[] T01RT6_n4340PrdUMeFind ;
   private String[] T01RT12_A717PrdMaxFind ;
   private boolean[] T01RT12_n717PrdMaxFind ;
   private String[] T01RT13_A488ForPrdDsc ;
   private boolean[] T01RT13_n488ForPrdDsc ;
   private String[] T01RT14_A710PrdFind ;
   private boolean[] T01RT14_n710PrdFind ;
   private String[] T01RT52_A488ForPrdDsc ;
   private boolean[] T01RT52_n488ForPrdDsc ;
   private String[] T01RT53_A710PrdFind ;
   private boolean[] T01RT53_n710PrdFind ;
   private byte[] T01RT56_A4340PrdUMeFind ;
   private boolean[] T01RT56_n4340PrdUMeFind ;
   private String[] T01RT62_A717PrdMaxFind ;
   private boolean[] T01RT62_n717PrdMaxFind ;
   private String[] T01RT63_A396EmprCod ;
   private String[] T01RT63_A764ProForCod ;
   private boolean[] T01RT63_n764ProForCod ;
   private short[] T01RT63_A767ProForLin ;
   private String[] T01RT3_A764ProForCod ;
   private boolean[] T01RT3_n764ProForCod ;
   private short[] T01RT3_A767ProForLin ;
   private String[] T01RT3_A770ProForPrd ;
   private String[] T01RT3_A765ProForDes ;
   private String[] T01RT3_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01RT3_A762ProForCan ;
   private String[] T01RT3_A763ProForCla ;
   private String[] T01RT3_A5358ProForClv ;
   private byte[] T01RT3_A1645ProForNro ;
   private byte[] T01RT3_A3379ProForTnq ;
   private java.math.BigDecimal[] T01RT3_A6062ProForCPo ;
   private String[] T01RT3_A13178ProForFT ;
   private String[] T01RT3_A396EmprCod ;
   private byte[] T01RT3_A490ForPrdUMe ;
   private String[] T01RT2_A764ProForCod ;
   private boolean[] T01RT2_n764ProForCod ;
   private short[] T01RT2_A767ProForLin ;
   private String[] T01RT2_A770ProForPrd ;
   private String[] T01RT2_A765ProForDes ;
   private String[] T01RT2_A13111ProForDe2 ;
   private java.math.BigDecimal[] T01RT2_A762ProForCan ;
   private String[] T01RT2_A763ProForCla ;
   private String[] T01RT2_A5358ProForClv ;
   private byte[] T01RT2_A1645ProForNro ;
   private byte[] T01RT2_A3379ProForTnq ;
   private java.math.BigDecimal[] T01RT2_A6062ProForCPo ;
   private String[] T01RT2_A13178ProForFT ;
   private String[] T01RT2_A396EmprCod ;
   private byte[] T01RT2_A490ForPrdUMe ;
   private String[] T01RT72_A717PrdMaxFind ;
   private boolean[] T01RT72_n717PrdMaxFind ;
   private String[] T01RT73_A710PrdFind ;
   private boolean[] T01RT73_n710PrdFind ;
   private byte[] T01RT76_A4340PrdUMeFind ;
   private boolean[] T01RT76_n4340PrdUMeFind ;
   private String[] T01RT77_A488ForPrdDsc ;
   private boolean[] T01RT77_n488ForPrdDsc ;
   private String[] T01RT78_A396EmprCod ;
   private String[] T01RT78_A764ProForCod ;
   private boolean[] T01RT78_n764ProForCod ;
   private short[] T01RT78_A767ProForLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mantenimientodeprocesosquimicos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientodeprocesosquimicos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientodeprocesosquimicos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientodeprocesosquimicos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientodeprocesosquimicos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RT2", "SELECT ProForCod, ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForCla, ProForClv, ProForNro, ProForTnq, ProForCPo, ProForFT, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?  FOR UPDATE OF ProForPrd, ProForDes, ProForDe2, ProForCan, ProForCla, ProForClv, ProForNro, ProForTnq, ProForCPo, ProForFT, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT3", "SELECT ProForCod, ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForCla, ProForClv, ProForNro, ProForTnq, ProForCPo, ProForFT, EmprCod, ForPrdUMe FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT6", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT12", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT13", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT14", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT15", "SELECT ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT16", "SELECT ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT18", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForCod, TM1.ProForDsc, TM1.ProForDsc2, TM1.ProForTie, TM1.ProForTmx, TM1.ProForMat, TM1.PorForFul, TM1.ProForUli, T2.EmprNom, TM1.ProNumPro, TM1.ProNumRec, TM1.ProRev, TM1.ProForPau, TM1.ProForRb, TM1.ProForCCi, TM1.ProForDCi, TM1.ProForTip, TM1.ProForLab, TM1.ProForAbs, TM1.ProForCos, TM1.ProforVl, TM1.ProH2O, TM1.ProForMer, TM1.ProForAct, TM1.ProForRs, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod > ? or EmprCod = ? and ProForCod > ?) ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod < ? or EmprCod = ? and ProForCod < ?) ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RT23", "INSERT INTO TXPCPROFO(ProForCod, ProForDsc, ProForDsc2, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForPau, ProForRb, ProForCCi, ProForDCi, ProForTip, ProForLab, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProForAct, ProForRs, EmprCod, ProForObs, ProFoLCU, ProForFac, IntCodF2, ProForFab, ProForCol, ProForPhx, ProForPhn, ProNh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01RT24", "UPDATE TXPCPROFO SET ProForDsc=?, ProForDsc2=?, ProForTie=?, ProForTmx=?, ProForMat=?, PorForFul=?, ProForUli=?, ProNumPro=?, ProNumRec=?, ProRev=?, ProForPau=?, ProForRb=?, ProForCCi=?, ProForDCi=?, ProForTip=?, ProForLab=?, ProForAbs=?, ProForCos=?, ProforVl=?, ProH2O=?, ProForMer=?, ProForAct=?, ProForRs=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01RT25", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T01RT26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT27", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT28", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT29", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT31", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT32", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT33", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT34", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT35", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT36", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT37", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT38", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT40", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT41", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT42", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT43", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT45", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT47", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT48", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT49", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RT50", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT51", "SELECT T2.PrdNum, T1.ProForCod, T1.ProForLin, T1.ProForPrd, T1.ProForDes, T1.ProForDe2, T3.ForPrdDsc, T1.ProForCan, T1.ProForCla, T1.ProForClv, T1.ProForNro, T1.ProForTnq, T1.ProForCPo, T1.ProForFT, T1.EmprCod, T1.ForPrdUMe, COALESCE( T2.PrdNum, 'xxxxxx') AS PrdFind FROM ((TXPLPROFO T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.ProForPrd) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? and T1.ProForLin = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT52", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT53", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT56", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT62", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT63", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RT64", "INSERT INTO TXPLPROFO(ProForCod, ProForLin, ProForPrd, ProForDes, ProForDe2, ProForCan, ProForCla, ProForClv, ProForNro, ProForTnq, ProForCPo, ProForFT, EmprCod, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01RT65", "UPDATE TXPLPROFO SET ProForPrd=?, ProForDes=?, ProForDe2=?, ProForCan=?, ProForCla=?, ProForClv=?, ProForNro=?, ProForTnq=?, ProForCPo=?, ProForFT=?, ForPrdUMe=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new UpdateCursor("T01RT66", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK, "TXPLPROFO")
         ,new ForEachCursor("T01RT72", "SELECT COALESCE( T1.PrdMaxFind, '') AS PrdMaxFind FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC3, ' ') ELSE COALESCE( T2.GXC4, ' ') END AS PrdMaxFind FROM (SELECT T4.ProForPrd AS GXC4, T4.ProForLin, T5.GXC7 AS GXC7, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC7 FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC7) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T2 FULL OUTER JOIN  (SELECT T4.ProForPrd AS GXC3, T4.ProForLin, T5.GXC6 AS GXC6, T4.EmprCod, T4.ProForCod FROM TXPLPROFO T4 FULL OUTER JOIN  (SELECT MAX(ProForLin) AS GXC6 FROM TXPLPROFO WHERE (ProForLin < ?) AND (EmprCod = ?) AND (ProForCod = ?) ) T5 ON 1=1 WHERE (T4.ProForLin = T5.GXC6) AND (T4.ProForLin < ?) AND (T4.EmprCod = ?) AND (T4.ProForCod = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT73", "SELECT COALESCE( PrdNum, 'xxxxxx') AS PrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT76", "SELECT COALESCE( T1.PrdUMeFind, 0) AS PrdUMeFind FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdUMeFo, 0) END AS PrdUMeFind FROM (SELECT PrdUMeFo, EmprCod, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2 WHERE T2.EmprCod = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT77", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RT78", "SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[22])[0] = rslt.getString(23, 1);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 53 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 40);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 16);
               stmt.setDate(7, (java.util.Date)parms[7]);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 1);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setString(14, (String)parms[14], 10);
               stmt.setString(15, (String)parms[15], 16);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setString(17, (String)parms[17], 6);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setInt(20, ((Number) parms[20]).intValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               stmt.setString(23, (String)parms[23], 1);
               stmt.setString(24, (String)parms[24], 1);
               stmt.setString(25, (String)parms[25], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 16);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 4);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 6);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 46 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 26);
               stmt.setString(5, (String)parms[5], 40);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 30);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(12, (String)parms[12], 6);
               stmt.setString(13, (String)parms[13], 3);
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 6);
               }
               stmt.setShort(14, ((Number) parms[14]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 51 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 6);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
      }
   }

}

