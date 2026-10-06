package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class equipos_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Equipos", ""), (short)(0)) ;
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

   public equipos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public equipos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( equipos_impl.class ));
   }

   public equipos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Equipos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\Equipos.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\Equipos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqEquCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqEquCod_Internalname, httpContext.getMessage( "Equipo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqEquCod_Internalname, GXutil.rtrim( A11438MaqEquCod), GXutil.rtrim( localUtil.format( A11438MaqEquCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqEquCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqEquCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqEquDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqEquDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqEquDsc_Internalname, GXutil.rtrim( A11435MaqEquDsc), GXutil.rtrim( localUtil.format( A11435MaqEquDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqEquDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqEquDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqSEqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqSEqCod_Internalname, httpContext.getMessage( "Sub Equipo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqSEqCod_Internalname, GXutil.rtrim( A11439MaqSEqCod), GXutil.rtrim( localUtil.format( A11439MaqSEqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqSEqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqSEqCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqSEqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqSEqDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqSEqDsc_Internalname, GXutil.rtrim( A11441MaqSEqDsc), GXutil.rtrim( localUtil.format( A11441MaqSEqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqSEqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqSEqDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPieCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqPieCod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPieCod_Internalname, GXutil.rtrim( A11440MaqPieCod), GXutil.rtrim( localUtil.format( A11440MaqPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPieCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqPieCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPieDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqPieDsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPieDsc_Internalname, GXutil.rtrim( A11436MaqPieDsc), GXutil.rtrim( localUtil.format( A11436MaqPieDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPieDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqPieDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqPieShw_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqPieShw_Internalname, httpContext.getMessage( "Mostrar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqPieShw_Internalname, GXutil.ltrim( localUtil.ntoc( A11437MaqPieShw, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqPieShw_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11437MaqPieShw), "9") : localUtil.format( DecimalUtil.doubleToDec(A11437MaqPieShw), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqPieShw_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqPieShw_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\Equipos.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\Equipos.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z11438MaqEquCod = httpContext.cgiGet( "Z11438MaqEquCod") ;
         Z11439MaqSEqCod = httpContext.cgiGet( "Z11439MaqSEqCod") ;
         Z11440MaqPieCod = httpContext.cgiGet( "Z11440MaqPieCod") ;
         Z11435MaqEquDsc = httpContext.cgiGet( "Z11435MaqEquDsc") ;
         Z11441MaqSEqDsc = httpContext.cgiGet( "Z11441MaqSEqDsc") ;
         Z11436MaqPieDsc = httpContext.cgiGet( "Z11436MaqPieDsc") ;
         Z11437MaqPieShw = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11437MaqPieShw"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A11438MaqEquCod = httpContext.cgiGet( edtMaqEquCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
         A11435MaqEquDsc = httpContext.cgiGet( edtMaqEquDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11435MaqEquDsc", A11435MaqEquDsc);
         A11439MaqSEqCod = httpContext.cgiGet( edtMaqSEqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
         A11441MaqSEqDsc = httpContext.cgiGet( edtMaqSEqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11441MaqSEqDsc", A11441MaqSEqDsc);
         A11440MaqPieCod = httpContext.cgiGet( edtMaqPieCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
         A11436MaqPieDsc = httpContext.cgiGet( edtMaqPieDsc_Internalname) ;
         n11436MaqPieDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11436MaqPieDsc", A11436MaqPieDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPieShw_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqPieShw_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQPIESHW");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqPieShw_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11437MaqPieShw = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.str( A11437MaqPieShw, 1, 0));
         }
         else
         {
            A11437MaqPieShw = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqPieShw_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.str( A11437MaqPieShw, 1, 0));
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A11438MaqEquCod = httpContext.GetPar( "MaqEquCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
            A11439MaqSEqCod = httpContext.GetPar( "MaqSEqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
            A11440MaqPieCod = httpContext.GetPar( "MaqPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
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
            initAll1VW1519( ) ;
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
      disableAttributes1VW1519( ) ;
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

   public void resetCaption1VW0( )
   {
   }

   public void zm1VW1519( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11435MaqEquDsc = T01VW3_A11435MaqEquDsc[0] ;
            Z11441MaqSEqDsc = T01VW3_A11441MaqSEqDsc[0] ;
            Z11436MaqPieDsc = T01VW3_A11436MaqPieDsc[0] ;
            Z11437MaqPieShw = T01VW3_A11437MaqPieShw[0] ;
         }
         else
         {
            Z11435MaqEquDsc = A11435MaqEquDsc ;
            Z11441MaqSEqDsc = A11441MaqSEqDsc ;
            Z11436MaqPieDsc = A11436MaqPieDsc ;
            Z11437MaqPieShw = A11437MaqPieShw ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11438MaqEquCod = A11438MaqEquCod ;
         Z11439MaqSEqCod = A11439MaqSEqCod ;
         Z11440MaqPieCod = A11440MaqPieCod ;
         Z11435MaqEquDsc = A11435MaqEquDsc ;
         Z11441MaqSEqDsc = A11441MaqSEqDsc ;
         Z11436MaqPieDsc = A11436MaqPieDsc ;
         Z11437MaqPieShw = A11437MaqPieShw ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
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

   public void load1VW1519( )
   {
      /* Using cursor T01VW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1519 = (short)(1) ;
         A407EmprNom = T01VW6_A407EmprNom[0] ;
         n407EmprNom = T01VW6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A606MaqDsc = T01VW6_A606MaqDsc[0] ;
         n606MaqDsc = T01VW6_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A11435MaqEquDsc = T01VW6_A11435MaqEquDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11435MaqEquDsc", A11435MaqEquDsc);
         A11441MaqSEqDsc = T01VW6_A11441MaqSEqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11441MaqSEqDsc", A11441MaqSEqDsc);
         A11436MaqPieDsc = T01VW6_A11436MaqPieDsc[0] ;
         n11436MaqPieDsc = T01VW6_n11436MaqPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11436MaqPieDsc", A11436MaqPieDsc);
         A11437MaqPieShw = T01VW6_A11437MaqPieShw[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.str( A11437MaqPieShw, 1, 0));
         zm1VW1519( -1) ;
      }
      pr_default.close(4);
      onLoadActions1VW1519( ) ;
   }

   public void onLoadActions1VW1519( )
   {
   }

   public void checkExtendedTable1VW1519( )
   {
      nIsDirty_1519 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VW4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VW4_A407EmprNom[0] ;
      n407EmprNom = T01VW4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01VW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01VW5_A606MaqDsc[0] ;
      n606MaqDsc = T01VW5_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1VW1519( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01VW7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VW7_A407EmprNom[0] ;
      n407EmprNom = T01VW7_n407EmprNom[0] ;
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

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T01VW8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01VW8_A606MaqDsc[0] ;
      n606MaqDsc = T01VW8_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1VW1519( )
   {
      /* Using cursor T01VW9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1519 = (short)(1) ;
      }
      else
      {
         RcdFound1519 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VW1519( 1) ;
         RcdFound1519 = (short)(1) ;
         A11438MaqEquCod = T01VW3_A11438MaqEquCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
         A11439MaqSEqCod = T01VW3_A11439MaqSEqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
         A11440MaqPieCod = T01VW3_A11440MaqPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
         A11435MaqEquDsc = T01VW3_A11435MaqEquDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11435MaqEquDsc", A11435MaqEquDsc);
         A11441MaqSEqDsc = T01VW3_A11441MaqSEqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11441MaqSEqDsc", A11441MaqSEqDsc);
         A11436MaqPieDsc = T01VW3_A11436MaqPieDsc[0] ;
         n11436MaqPieDsc = T01VW3_n11436MaqPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11436MaqPieDsc", A11436MaqPieDsc);
         A11437MaqPieShw = T01VW3_A11437MaqPieShw[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.str( A11437MaqPieShw, 1, 0));
         A396EmprCod = T01VW3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01VW3_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z11438MaqEquCod = A11438MaqEquCod ;
         Z11439MaqSEqCod = A11439MaqSEqCod ;
         Z11440MaqPieCod = A11440MaqPieCod ;
         sMode1519 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VW1519( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1519 = (short)(0) ;
            initializeNonKey1VW1519( ) ;
         }
         Gx_mode = sMode1519 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1519 = (short)(0) ;
         initializeNonKey1VW1519( ) ;
         sMode1519 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1519 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VW1519( ) ;
      if ( RcdFound1519 == 0 )
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
      RcdFound1519 = (short)(0) ;
      /* Using cursor T01VW10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A11438MaqEquCod, A11438MaqEquCod, A602MaqCod, A396EmprCod, A11439MaqSEqCod, A11439MaqSEqCod, A11438MaqEquCod, A602MaqCod, A396EmprCod, A11440MaqPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) < 0 ) || ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11439MaqSEqCod[0], A11439MaqSEqCod) < 0 ) || ( GXutil.strcmp(T01VW10_A11439MaqSEqCod[0], A11439MaqSEqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11440MaqPieCod[0], A11440MaqPieCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) > 0 ) || ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11439MaqSEqCod[0], A11439MaqSEqCod) > 0 ) || ( GXutil.strcmp(T01VW10_A11439MaqSEqCod[0], A11439MaqSEqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW10_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW10_A11440MaqPieCod[0], A11440MaqPieCod) > 0 ) ) )
         {
            A396EmprCod = T01VW10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01VW10_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A11438MaqEquCod = T01VW10_A11438MaqEquCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
            A11439MaqSEqCod = T01VW10_A11439MaqSEqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
            A11440MaqPieCod = T01VW10_A11440MaqPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
            RcdFound1519 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1519 = (short)(0) ;
      /* Using cursor T01VW11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A602MaqCod, A602MaqCod, A396EmprCod, A11438MaqEquCod, A11438MaqEquCod, A602MaqCod, A396EmprCod, A11439MaqSEqCod, A11439MaqSEqCod, A11438MaqEquCod, A602MaqCod, A396EmprCod, A11440MaqPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) > 0 ) || ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11439MaqSEqCod[0], A11439MaqSEqCod) > 0 ) || ( GXutil.strcmp(T01VW11_A11439MaqSEqCod[0], A11439MaqSEqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11440MaqPieCod[0], A11440MaqPieCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) < 0 ) || ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11439MaqSEqCod[0], A11439MaqSEqCod) < 0 ) || ( GXutil.strcmp(T01VW11_A11439MaqSEqCod[0], A11439MaqSEqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) && ( GXutil.strcmp(T01VW11_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01VW11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01VW11_A11440MaqPieCod[0], A11440MaqPieCod) < 0 ) ) )
         {
            A396EmprCod = T01VW11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01VW11_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A11438MaqEquCod = T01VW11_A11438MaqEquCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
            A11439MaqSEqCod = T01VW11_A11439MaqSEqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
            A11440MaqPieCod = T01VW11_A11440MaqPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
            RcdFound1519 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VW1519( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VW1519( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1519 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A11438MaqEquCod, Z11438MaqEquCod) != 0 ) || ( GXutil.strcmp(A11439MaqSEqCod, Z11439MaqSEqCod) != 0 ) || ( GXutil.strcmp(A11440MaqPieCod, Z11440MaqPieCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A11438MaqEquCod = Z11438MaqEquCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
               A11439MaqSEqCod = Z11439MaqSEqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
               A11440MaqPieCod = Z11440MaqPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
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
               update1VW1519( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A11438MaqEquCod, Z11438MaqEquCod) != 0 ) || ( GXutil.strcmp(A11439MaqSEqCod, Z11439MaqSEqCod) != 0 ) || ( GXutil.strcmp(A11440MaqPieCod, Z11440MaqPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VW1519( ) ;
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
                  insert1VW1519( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( GXutil.strcmp(A11438MaqEquCod, Z11438MaqEquCod) != 0 ) || ( GXutil.strcmp(A11439MaqSEqCod, Z11439MaqSEqCod) != 0 ) || ( GXutil.strcmp(A11440MaqPieCod, Z11440MaqPieCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A11438MaqEquCod = Z11438MaqEquCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
         A11439MaqSEqCod = Z11439MaqSEqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
         A11440MaqPieCod = Z11440MaqPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
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
      if ( RcdFound1519 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqEquDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VW1519( ) ;
      if ( RcdFound1519 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqEquDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VW1519( ) ;
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
      if ( RcdFound1519 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqEquDsc_Internalname ;
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
      if ( RcdFound1519 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqEquDsc_Internalname ;
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
      scanStart1VW1519( ) ;
      if ( RcdFound1519 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1519 != 0 )
         {
            scanNext1VW1519( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqEquDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VW1519( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VW1519( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMaqPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11435MaqEquDsc, T01VW2_A11435MaqEquDsc[0]) != 0 ) || ( GXutil.strcmp(Z11441MaqSEqDsc, T01VW2_A11441MaqSEqDsc[0]) != 0 ) || ( GXutil.strcmp(Z11436MaqPieDsc, T01VW2_A11436MaqPieDsc[0]) != 0 ) || ( Z11437MaqPieShw != T01VW2_A11437MaqPieShw[0] ) )
         {
            if ( GXutil.strcmp(Z11435MaqEquDsc, T01VW2_A11435MaqEquDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.equipos:[seudo value changed for attri]"+"MaqEquDsc");
               GXutil.writeLogRaw("Old: ",Z11435MaqEquDsc);
               GXutil.writeLogRaw("Current: ",T01VW2_A11435MaqEquDsc[0]);
            }
            if ( GXutil.strcmp(Z11441MaqSEqDsc, T01VW2_A11441MaqSEqDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.equipos:[seudo value changed for attri]"+"MaqSEqDsc");
               GXutil.writeLogRaw("Old: ",Z11441MaqSEqDsc);
               GXutil.writeLogRaw("Current: ",T01VW2_A11441MaqSEqDsc[0]);
            }
            if ( GXutil.strcmp(Z11436MaqPieDsc, T01VW2_A11436MaqPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.equipos:[seudo value changed for attri]"+"MaqPieDsc");
               GXutil.writeLogRaw("Old: ",Z11436MaqPieDsc);
               GXutil.writeLogRaw("Current: ",T01VW2_A11436MaqPieDsc[0]);
            }
            if ( Z11437MaqPieShw != T01VW2_A11437MaqPieShw[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.equipos:[seudo value changed for attri]"+"MaqPieShw");
               GXutil.writeLogRaw("Old: ",Z11437MaqPieShw);
               GXutil.writeLogRaw("Current: ",T01VW2_A11437MaqPieShw[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMaqPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VW1519( )
   {
      beforeValidate1VW1519( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VW1519( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VW1519( 0) ;
         checkOptimisticConcurrency1VW1519( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VW1519( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VW1519( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VW12 */
                  pr_default.execute(10, new Object[] {A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod, A11435MaqEquDsc, A11441MaqSEqDsc, Boolean.valueOf(n11436MaqPieDsc), A11436MaqPieDsc, Byte.valueOf(A11437MaqPieShw), A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqPie");
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
                        resetCaption1VW0( ) ;
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
            load1VW1519( ) ;
         }
         endLevel1VW1519( ) ;
      }
      closeExtendedTableCursors1VW1519( ) ;
   }

   public void update1VW1519( )
   {
      beforeValidate1VW1519( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VW1519( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VW1519( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VW1519( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VW1519( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VW13 */
                  pr_default.execute(11, new Object[] {A11435MaqEquDsc, A11441MaqSEqDsc, Boolean.valueOf(n11436MaqPieDsc), A11436MaqPieDsc, Byte.valueOf(A11437MaqPieShw), A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqPie");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMaqPie"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VW1519( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VW0( ) ;
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
         endLevel1VW1519( ) ;
      }
      closeExtendedTableCursors1VW1519( ) ;
   }

   public void deferredUpdate1VW1519( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VW1519( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VW1519( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VW1519( ) ;
         afterConfirm1VW1519( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VW1519( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VW14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqPie");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1519 == 0 )
                     {
                        initAll1VW1519( ) ;
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
                     resetCaption1VW0( ) ;
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
      sMode1519 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VW1519( ) ;
      Gx_mode = sMode1519 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VW1519( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VW15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01VW15_A407EmprNom[0] ;
         n407EmprNom = T01VW15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01VW16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T01VW16_A606MaqDsc[0] ;
         n606MaqDsc = T01VW16_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01VW17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1VW1519( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VW1519( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.equipos");
         if ( AnyError == 0 )
         {
            confirmValues1VW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.equipos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VW1519( )
   {
      /* Using cursor T01VW18 */
      pr_default.execute(16);
      RcdFound1519 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1519 = (short)(1) ;
         A396EmprCod = T01VW18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01VW18_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A11438MaqEquCod = T01VW18_A11438MaqEquCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
         A11439MaqSEqCod = T01VW18_A11439MaqSEqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
         A11440MaqPieCod = T01VW18_A11440MaqPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VW1519( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1519 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1519 = (short)(1) ;
         A396EmprCod = T01VW18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01VW18_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A11438MaqEquCod = T01VW18_A11438MaqEquCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
         A11439MaqSEqCod = T01VW18_A11439MaqSEqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
         A11440MaqPieCod = T01VW18_A11440MaqPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
      }
   }

   public void scanEnd1VW1519( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1VW1519( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VW1519( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VW1519( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VW1519( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VW1519( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VW1519( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VW1519( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqEquCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqEquCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqEquCod_Enabled), 5, 0), true);
      edtMaqEquDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqEquDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqEquDsc_Enabled), 5, 0), true);
      edtMaqSEqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqSEqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqSEqCod_Enabled), 5, 0), true);
      edtMaqSEqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqSEqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqSEqDsc_Enabled), 5, 0), true);
      edtMaqPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqPieCod_Enabled), 5, 0), true);
      edtMaqPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqPieDsc_Enabled), 5, 0), true);
      edtMaqPieShw_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqPieShw_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqPieShw_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VW1519( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VW0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.equipos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11438MaqEquCod", GXutil.rtrim( Z11438MaqEquCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11439MaqSEqCod", GXutil.rtrim( Z11439MaqSEqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11440MaqPieCod", GXutil.rtrim( Z11440MaqPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11435MaqEquDsc", GXutil.rtrim( Z11435MaqEquDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11441MaqSEqDsc", GXutil.rtrim( Z11441MaqSEqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11436MaqPieDsc", GXutil.rtrim( Z11436MaqPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11437MaqPieShw", GXutil.ltrim( localUtil.ntoc( Z11437MaqPieShw, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mantenimientomaquina.equipos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.Equipos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Equipos", "") ;
   }

   public void initializeNonKey1VW1519( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A11435MaqEquDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11435MaqEquDsc", A11435MaqEquDsc);
      A11441MaqSEqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11441MaqSEqDsc", A11441MaqSEqDsc);
      A11436MaqPieDsc = "" ;
      n11436MaqPieDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11436MaqPieDsc", A11436MaqPieDsc);
      A11437MaqPieShw = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.str( A11437MaqPieShw, 1, 0));
      Z11435MaqEquDsc = "" ;
      Z11441MaqSEqDsc = "" ;
      Z11436MaqPieDsc = "" ;
      Z11437MaqPieShw = (byte)(0) ;
   }

   public void initAll1VW1519( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A11438MaqEquCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11438MaqEquCod", A11438MaqEquCod);
      A11439MaqSEqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11439MaqSEqCod", A11439MaqSEqCod);
      A11440MaqPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11440MaqPieCod", A11440MaqPieCod);
      initializeNonKey1VW1519( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124820", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/equipos.js", "?202682415124820", false, true);
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqEquCod_Internalname = "MAQEQUCOD" ;
      edtMaqEquDsc_Internalname = "MAQEQUDSC" ;
      edtMaqSEqCod_Internalname = "MAQSEQCOD" ;
      edtMaqSEqDsc_Internalname = "MAQSEQDSC" ;
      edtMaqPieCod_Internalname = "MAQPIECOD" ;
      edtMaqPieDsc_Internalname = "MAQPIEDSC" ;
      edtMaqPieShw_Internalname = "MAQPIESHW" ;
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
      Form.setCaption( httpContext.getMessage( "Equipos", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMaqPieShw_Jsonclick = "" ;
      edtMaqPieShw_Enabled = 1 ;
      edtMaqPieDsc_Jsonclick = "" ;
      edtMaqPieDsc_Enabled = 1 ;
      edtMaqPieCod_Jsonclick = "" ;
      edtMaqPieCod_Enabled = 1 ;
      edtMaqSEqDsc_Jsonclick = "" ;
      edtMaqSEqDsc_Enabled = 1 ;
      edtMaqSEqCod_Jsonclick = "" ;
      edtMaqSEqCod_Enabled = 1 ;
      edtMaqEquDsc_Jsonclick = "" ;
      edtMaqEquDsc_Enabled = 1 ;
      edtMaqEquCod_Jsonclick = "" ;
      edtMaqEquCod_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 1 ;
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
      /* Using cursor T01VW15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01VW15_A407EmprNom[0] ;
      n407EmprNom = T01VW15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01VW16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01VW16_A606MaqDsc[0] ;
      n606MaqDsc = T01VW16_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(14);
      GX_FocusControl = edtMaqEquDsc_Internalname ;
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
      /* Using cursor T01VW15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01VW15_A407EmprNom[0] ;
      n407EmprNom = T01VW15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor T01VW16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A606MaqDsc = T01VW16_A606MaqDsc[0] ;
      n606MaqDsc = T01VW16_n606MaqDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Maqpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11435MaqEquDsc", GXutil.rtrim( A11435MaqEquDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11441MaqSEqDsc", GXutil.rtrim( A11441MaqSEqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11436MaqPieDsc", GXutil.rtrim( A11436MaqPieDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11437MaqPieShw", GXutil.ltrim( localUtil.ntoc( A11437MaqPieShw, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11438MaqEquCod", GXutil.rtrim( Z11438MaqEquCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11439MaqSEqCod", GXutil.rtrim( Z11439MaqSEqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11440MaqPieCod", GXutil.rtrim( Z11440MaqPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11435MaqEquDsc", GXutil.rtrim( Z11435MaqEquDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11441MaqSEqDsc", GXutil.rtrim( Z11441MaqSEqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11436MaqPieDsc", GXutil.rtrim( Z11436MaqPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11437MaqPieShw", GXutil.ltrim( localUtil.ntoc( Z11437MaqPieShw, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("VALID_MAQEQUCOD","{handler:'valid_Maqequcod',iparms:[]");
      setEventMetadata("VALID_MAQEQUCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQSEQCOD","{handler:'valid_Maqseqcod',iparms:[]");
      setEventMetadata("VALID_MAQSEQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQPIECOD","{handler:'valid_Maqpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A11438MaqEquCod',fld:'MAQEQUCOD',pic:''},{av:'A11439MaqSEqCod',fld:'MAQSEQCOD',pic:''},{av:'A11440MaqPieCod',fld:'MAQPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQPIECOD",",oparms:[{av:'A11435MaqEquDsc',fld:'MAQEQUDSC',pic:''},{av:'A11441MaqSEqDsc',fld:'MAQSEQDSC',pic:''},{av:'A11436MaqPieDsc',fld:'MAQPIEDSC',pic:''},{av:'A11437MaqPieShw',fld:'MAQPIESHW',pic:'9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z11438MaqEquCod'},{av:'Z11439MaqSEqCod'},{av:'Z11440MaqPieCod'},{av:'Z11435MaqEquDsc'},{av:'Z11441MaqSEqDsc'},{av:'Z11436MaqPieDsc'},{av:'Z11437MaqPieShw'},{av:'Z407EmprNom'},{av:'Z606MaqDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z602MaqCod = "" ;
      Z11438MaqEquCod = "" ;
      Z11439MaqSEqCod = "" ;
      Z11440MaqPieCod = "" ;
      Z11435MaqEquDsc = "" ;
      Z11441MaqSEqDsc = "" ;
      Z11436MaqPieDsc = "" ;
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
      A606MaqDsc = "" ;
      A11438MaqEquCod = "" ;
      A11435MaqEquDsc = "" ;
      A11439MaqSEqCod = "" ;
      A11441MaqSEqDsc = "" ;
      A11440MaqPieCod = "" ;
      A11436MaqPieDsc = "" ;
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
      Z606MaqDsc = "" ;
      T01VW6_A11438MaqEquCod = new String[] {""} ;
      T01VW6_A11439MaqSEqCod = new String[] {""} ;
      T01VW6_A11440MaqPieCod = new String[] {""} ;
      T01VW6_A407EmprNom = new String[] {""} ;
      T01VW6_n407EmprNom = new boolean[] {false} ;
      T01VW6_A606MaqDsc = new String[] {""} ;
      T01VW6_n606MaqDsc = new boolean[] {false} ;
      T01VW6_A11435MaqEquDsc = new String[] {""} ;
      T01VW6_A11441MaqSEqDsc = new String[] {""} ;
      T01VW6_A11436MaqPieDsc = new String[] {""} ;
      T01VW6_n11436MaqPieDsc = new boolean[] {false} ;
      T01VW6_A11437MaqPieShw = new byte[1] ;
      T01VW6_A396EmprCod = new String[] {""} ;
      T01VW6_A602MaqCod = new String[] {""} ;
      T01VW4_A407EmprNom = new String[] {""} ;
      T01VW4_n407EmprNom = new boolean[] {false} ;
      T01VW5_A606MaqDsc = new String[] {""} ;
      T01VW5_n606MaqDsc = new boolean[] {false} ;
      T01VW7_A407EmprNom = new String[] {""} ;
      T01VW7_n407EmprNom = new boolean[] {false} ;
      T01VW8_A606MaqDsc = new String[] {""} ;
      T01VW8_n606MaqDsc = new boolean[] {false} ;
      T01VW9_A396EmprCod = new String[] {""} ;
      T01VW9_A602MaqCod = new String[] {""} ;
      T01VW9_A11438MaqEquCod = new String[] {""} ;
      T01VW9_A11439MaqSEqCod = new String[] {""} ;
      T01VW9_A11440MaqPieCod = new String[] {""} ;
      T01VW3_A11438MaqEquCod = new String[] {""} ;
      T01VW3_A11439MaqSEqCod = new String[] {""} ;
      T01VW3_A11440MaqPieCod = new String[] {""} ;
      T01VW3_A11435MaqEquDsc = new String[] {""} ;
      T01VW3_A11441MaqSEqDsc = new String[] {""} ;
      T01VW3_A11436MaqPieDsc = new String[] {""} ;
      T01VW3_n11436MaqPieDsc = new boolean[] {false} ;
      T01VW3_A11437MaqPieShw = new byte[1] ;
      T01VW3_A396EmprCod = new String[] {""} ;
      T01VW3_A602MaqCod = new String[] {""} ;
      sMode1519 = "" ;
      T01VW10_A396EmprCod = new String[] {""} ;
      T01VW10_A602MaqCod = new String[] {""} ;
      T01VW10_A11438MaqEquCod = new String[] {""} ;
      T01VW10_A11439MaqSEqCod = new String[] {""} ;
      T01VW10_A11440MaqPieCod = new String[] {""} ;
      T01VW11_A396EmprCod = new String[] {""} ;
      T01VW11_A602MaqCod = new String[] {""} ;
      T01VW11_A11438MaqEquCod = new String[] {""} ;
      T01VW11_A11439MaqSEqCod = new String[] {""} ;
      T01VW11_A11440MaqPieCod = new String[] {""} ;
      T01VW2_A11438MaqEquCod = new String[] {""} ;
      T01VW2_A11439MaqSEqCod = new String[] {""} ;
      T01VW2_A11440MaqPieCod = new String[] {""} ;
      T01VW2_A11435MaqEquDsc = new String[] {""} ;
      T01VW2_A11441MaqSEqDsc = new String[] {""} ;
      T01VW2_A11436MaqPieDsc = new String[] {""} ;
      T01VW2_n11436MaqPieDsc = new boolean[] {false} ;
      T01VW2_A11437MaqPieShw = new byte[1] ;
      T01VW2_A396EmprCod = new String[] {""} ;
      T01VW2_A602MaqCod = new String[] {""} ;
      T01VW15_A407EmprNom = new String[] {""} ;
      T01VW15_n407EmprNom = new boolean[] {false} ;
      T01VW16_A606MaqDsc = new String[] {""} ;
      T01VW16_n606MaqDsc = new boolean[] {false} ;
      T01VW17_A396EmprCod = new String[] {""} ;
      T01VW17_A602MaqCod = new String[] {""} ;
      T01VW17_A11438MaqEquCod = new String[] {""} ;
      T01VW17_A11439MaqSEqCod = new String[] {""} ;
      T01VW17_A11440MaqPieCod = new String[] {""} ;
      T01VW17_A9492MRCod = new int[1] ;
      T01VW18_A396EmprCod = new String[] {""} ;
      T01VW18_A602MaqCod = new String[] {""} ;
      T01VW18_A11438MaqEquCod = new String[] {""} ;
      T01VW18_A11439MaqSEqCod = new String[] {""} ;
      T01VW18_A11440MaqPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ11438MaqEquCod = "" ;
      ZZ11439MaqSEqCod = "" ;
      ZZ11440MaqPieCod = "" ;
      ZZ11435MaqEquDsc = "" ;
      ZZ11441MaqSEqDsc = "" ;
      ZZ11436MaqPieDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ606MaqDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.equipos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.equipos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.equipos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.equipos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.equipos__default(),
         new Object[] {
             new Object[] {
            T01VW2_A11438MaqEquCod, T01VW2_A11439MaqSEqCod, T01VW2_A11440MaqPieCod, T01VW2_A11435MaqEquDsc, T01VW2_A11441MaqSEqDsc, T01VW2_A11436MaqPieDsc, T01VW2_n11436MaqPieDsc, T01VW2_A11437MaqPieShw, T01VW2_A396EmprCod, T01VW2_A602MaqCod
            }
            , new Object[] {
            T01VW3_A11438MaqEquCod, T01VW3_A11439MaqSEqCod, T01VW3_A11440MaqPieCod, T01VW3_A11435MaqEquDsc, T01VW3_A11441MaqSEqDsc, T01VW3_A11436MaqPieDsc, T01VW3_n11436MaqPieDsc, T01VW3_A11437MaqPieShw, T01VW3_A396EmprCod, T01VW3_A602MaqCod
            }
            , new Object[] {
            T01VW4_A407EmprNom, T01VW4_n407EmprNom
            }
            , new Object[] {
            T01VW5_A606MaqDsc, T01VW5_n606MaqDsc
            }
            , new Object[] {
            T01VW6_A11438MaqEquCod, T01VW6_A11439MaqSEqCod, T01VW6_A11440MaqPieCod, T01VW6_A407EmprNom, T01VW6_n407EmprNom, T01VW6_A606MaqDsc, T01VW6_n606MaqDsc, T01VW6_A11435MaqEquDsc, T01VW6_A11441MaqSEqDsc, T01VW6_A11436MaqPieDsc,
            T01VW6_n11436MaqPieDsc, T01VW6_A11437MaqPieShw, T01VW6_A396EmprCod, T01VW6_A602MaqCod
            }
            , new Object[] {
            T01VW7_A407EmprNom, T01VW7_n407EmprNom
            }
            , new Object[] {
            T01VW8_A606MaqDsc, T01VW8_n606MaqDsc
            }
            , new Object[] {
            T01VW9_A396EmprCod, T01VW9_A602MaqCod, T01VW9_A11438MaqEquCod, T01VW9_A11439MaqSEqCod, T01VW9_A11440MaqPieCod
            }
            , new Object[] {
            T01VW10_A396EmprCod, T01VW10_A602MaqCod, T01VW10_A11438MaqEquCod, T01VW10_A11439MaqSEqCod, T01VW10_A11440MaqPieCod
            }
            , new Object[] {
            T01VW11_A396EmprCod, T01VW11_A602MaqCod, T01VW11_A11438MaqEquCod, T01VW11_A11439MaqSEqCod, T01VW11_A11440MaqPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VW15_A407EmprNom, T01VW15_n407EmprNom
            }
            , new Object[] {
            T01VW16_A606MaqDsc, T01VW16_n606MaqDsc
            }
            , new Object[] {
            T01VW17_A396EmprCod, T01VW17_A602MaqCod, T01VW17_A11438MaqEquCod, T01VW17_A11439MaqSEqCod, T01VW17_A11440MaqPieCod, T01VW17_A9492MRCod
            }
            , new Object[] {
            T01VW18_A396EmprCod, T01VW18_A602MaqCod, T01VW18_A11438MaqEquCod, T01VW18_A11439MaqSEqCod, T01VW18_A11440MaqPieCod
            }
         }
      );
   }

   private byte Z11437MaqPieShw ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11437MaqPieShw ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11437MaqPieShw ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1519 ;
   private short nIsDirty_1519 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqEquCod_Enabled ;
   private int edtMaqEquDsc_Enabled ;
   private int edtMaqSEqCod_Enabled ;
   private int edtMaqSEqDsc_Enabled ;
   private int edtMaqPieCod_Enabled ;
   private int edtMaqPieDsc_Enabled ;
   private int edtMaqPieShw_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z11438MaqEquCod ;
   private String Z11439MaqSEqCod ;
   private String Z11440MaqPieCod ;
   private String Z11435MaqEquDsc ;
   private String Z11441MaqSEqDsc ;
   private String Z11436MaqPieDsc ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqEquCod_Internalname ;
   private String A11438MaqEquCod ;
   private String edtMaqEquCod_Jsonclick ;
   private String edtMaqEquDsc_Internalname ;
   private String A11435MaqEquDsc ;
   private String edtMaqEquDsc_Jsonclick ;
   private String edtMaqSEqCod_Internalname ;
   private String A11439MaqSEqCod ;
   private String edtMaqSEqCod_Jsonclick ;
   private String edtMaqSEqDsc_Internalname ;
   private String A11441MaqSEqDsc ;
   private String edtMaqSEqDsc_Jsonclick ;
   private String edtMaqPieCod_Internalname ;
   private String A11440MaqPieCod ;
   private String edtMaqPieCod_Jsonclick ;
   private String edtMaqPieDsc_Internalname ;
   private String A11436MaqPieDsc ;
   private String edtMaqPieDsc_Jsonclick ;
   private String edtMaqPieShw_Internalname ;
   private String edtMaqPieShw_Jsonclick ;
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
   private String Z606MaqDsc ;
   private String sMode1519 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ11438MaqEquCod ;
   private String ZZ11439MaqSEqCod ;
   private String ZZ11440MaqPieCod ;
   private String ZZ11435MaqEquDsc ;
   private String ZZ11441MaqSEqDsc ;
   private String ZZ11436MaqPieDsc ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n606MaqDsc ;
   private boolean n11436MaqPieDsc ;
   private IDataStoreProvider pr_default ;
   private String[] T01VW6_A11438MaqEquCod ;
   private String[] T01VW6_A11439MaqSEqCod ;
   private String[] T01VW6_A11440MaqPieCod ;
   private String[] T01VW6_A407EmprNom ;
   private boolean[] T01VW6_n407EmprNom ;
   private String[] T01VW6_A606MaqDsc ;
   private boolean[] T01VW6_n606MaqDsc ;
   private String[] T01VW6_A11435MaqEquDsc ;
   private String[] T01VW6_A11441MaqSEqDsc ;
   private String[] T01VW6_A11436MaqPieDsc ;
   private boolean[] T01VW6_n11436MaqPieDsc ;
   private byte[] T01VW6_A11437MaqPieShw ;
   private String[] T01VW6_A396EmprCod ;
   private String[] T01VW6_A602MaqCod ;
   private String[] T01VW4_A407EmprNom ;
   private boolean[] T01VW4_n407EmprNom ;
   private String[] T01VW5_A606MaqDsc ;
   private boolean[] T01VW5_n606MaqDsc ;
   private String[] T01VW7_A407EmprNom ;
   private boolean[] T01VW7_n407EmprNom ;
   private String[] T01VW8_A606MaqDsc ;
   private boolean[] T01VW8_n606MaqDsc ;
   private String[] T01VW9_A396EmprCod ;
   private String[] T01VW9_A602MaqCod ;
   private String[] T01VW9_A11438MaqEquCod ;
   private String[] T01VW9_A11439MaqSEqCod ;
   private String[] T01VW9_A11440MaqPieCod ;
   private String[] T01VW3_A11438MaqEquCod ;
   private String[] T01VW3_A11439MaqSEqCod ;
   private String[] T01VW3_A11440MaqPieCod ;
   private String[] T01VW3_A11435MaqEquDsc ;
   private String[] T01VW3_A11441MaqSEqDsc ;
   private String[] T01VW3_A11436MaqPieDsc ;
   private boolean[] T01VW3_n11436MaqPieDsc ;
   private byte[] T01VW3_A11437MaqPieShw ;
   private String[] T01VW3_A396EmprCod ;
   private String[] T01VW3_A602MaqCod ;
   private String[] T01VW10_A396EmprCod ;
   private String[] T01VW10_A602MaqCod ;
   private String[] T01VW10_A11438MaqEquCod ;
   private String[] T01VW10_A11439MaqSEqCod ;
   private String[] T01VW10_A11440MaqPieCod ;
   private String[] T01VW11_A396EmprCod ;
   private String[] T01VW11_A602MaqCod ;
   private String[] T01VW11_A11438MaqEquCod ;
   private String[] T01VW11_A11439MaqSEqCod ;
   private String[] T01VW11_A11440MaqPieCod ;
   private String[] T01VW2_A11438MaqEquCod ;
   private String[] T01VW2_A11439MaqSEqCod ;
   private String[] T01VW2_A11440MaqPieCod ;
   private String[] T01VW2_A11435MaqEquDsc ;
   private String[] T01VW2_A11441MaqSEqDsc ;
   private String[] T01VW2_A11436MaqPieDsc ;
   private boolean[] T01VW2_n11436MaqPieDsc ;
   private byte[] T01VW2_A11437MaqPieShw ;
   private String[] T01VW2_A396EmprCod ;
   private String[] T01VW2_A602MaqCod ;
   private String[] T01VW15_A407EmprNom ;
   private boolean[] T01VW15_n407EmprNom ;
   private String[] T01VW16_A606MaqDsc ;
   private boolean[] T01VW16_n606MaqDsc ;
   private String[] T01VW17_A396EmprCod ;
   private String[] T01VW17_A602MaqCod ;
   private String[] T01VW17_A11438MaqEquCod ;
   private String[] T01VW17_A11439MaqSEqCod ;
   private String[] T01VW17_A11440MaqPieCod ;
   private int[] T01VW17_A9492MRCod ;
   private String[] T01VW18_A396EmprCod ;
   private String[] T01VW18_A602MaqCod ;
   private String[] T01VW18_A11438MaqEquCod ;
   private String[] T01VW18_A11439MaqSEqCod ;
   private String[] T01VW18_A11440MaqPieCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class equipos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class equipos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class equipos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class equipos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class equipos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VW2", "SELECT MaqEquCod, MaqSEqCod, MaqPieCod, MaqEquDsc, MaqSEqDsc, MaqPieDsc, MaqPieShw, EmprCod, MaqCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ?  FOR UPDATE OF MaqEquDsc, MaqSEqDsc, MaqPieDsc, MaqPieShw NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW3", "SELECT MaqEquCod, MaqSEqCod, MaqPieCod, MaqEquDsc, MaqSEqDsc, MaqPieDsc, MaqPieShw, EmprCod, MaqCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW5", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqEquCod, TM1.MaqSEqCod, TM1.MaqPieCod, T2.EmprNom, T3.MaqDsc, TM1.MaqEquDsc, TM1.MaqSEqDsc, TM1.MaqPieDsc, TM1.MaqPieShw, TM1.EmprCod, TM1.MaqCod FROM ((TXPMaqPie TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqEquCod = ? and TM1.MaqSEqCod = ? and TM1.MaqPieCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MaqEquCod, TM1.MaqSEqCod, TM1.MaqPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW8", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and MaqEquCod > ? or MaqEquCod = ? and MaqCod = ? and EmprCod = ? and MaqSEqCod > ? or MaqSEqCod = ? and MaqEquCod = ? and MaqCod = ? and EmprCod = ? and MaqPieCod > ?) ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VW11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and MaqEquCod < ? or MaqEquCod = ? and MaqCod = ? and EmprCod = ? and MaqSEqCod < ? or MaqSEqCod = ? and MaqEquCod = ? and MaqCod = ? and EmprCod = ? and MaqPieCod < ?) ORDER BY EmprCod DESC, MaqCod DESC, MaqEquCod DESC, MaqSEqCod DESC, MaqPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VW12", "INSERT INTO TXPMaqPie(MaqEquCod, MaqSEqCod, MaqPieCod, MaqEquDsc, MaqSEqDsc, MaqPieDsc, MaqPieShw, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMaqPie")
         ,new UpdateCursor("T01VW13", "UPDATE TXPMaqPie SET MaqEquDsc=?, MaqSEqDsc=?, MaqPieDsc=?, MaqPieShw=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ?", GX_NOMASK, "TXPMaqPie")
         ,new UpdateCursor("T01VW14", "DELETE FROM TXPMaqPie  WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ?", GX_NOMASK, "TXPMaqPie")
         ,new ForEachCursor("T01VW15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW16", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VW17", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod, MRCod FROM TXPMaqRep WHERE EmprCod = ? AND MaqCod = ? AND MaqEquCod = ? AND MaqSEqCod = ? AND MaqPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VW18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 100);
               ((String[]) buf[8])[0] = rslt.getString(7, 100);
               ((String[]) buf[9])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 100);
               stmt.setString(5, (String)parms[4], 100);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 100);
               }
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 3);
               stmt.setString(9, (String)parms[9], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 100);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 100);
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setString(6, (String)parms[6], 6);
               stmt.setString(7, (String)parms[7], 10);
               stmt.setString(8, (String)parms[8], 10);
               stmt.setString(9, (String)parms[9], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               return;
      }
   }

}

