package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqtar_impl extends GXDataArea
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
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A602MaqCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtmaqtar_level1item") == 0 )
      {
         gxnrgridtmaqtar_level1item_newrow_invoke( ) ;
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
            A4686MaqTipArt = (short)(GXutil.lval( httpContext.GetPar( "MaqTipArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4686MaqTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4686MaqTipArt), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAPACIDAD MAQUINA P/T.ARTICULO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqTipArtR_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtmaqtar_level1item_newrow_invoke( )
   {
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtmaqtar_level1item_newrow( ) ;
      /* End function gxnrGridtmaqtar_level1item_newrow_invoke */
   }

   public tmaqtar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqtar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqtar_impl.class ));
   }

   public tmaqtar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "CAPACIDAD MAQUINA P/T.ARTICULO", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTAR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQTAR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTAR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipArt_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4686MaqTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4686MaqTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4686MaqTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipArtD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipArtD_Internalname, httpContext.getMessage( "Desc Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArtD_Internalname, GXutil.rtrim( A4687MaqTipArtD), GXutil.rtrim( localUtil.format( A4687MaqTipArtD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArtD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipArtC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipArtC_Internalname, httpContext.getMessage( "Clasificacion Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArtC_Internalname, GXutil.rtrim( A4688MaqTipArtC), GXutil.rtrim( localUtil.format( A4688MaqTipArtC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArtC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArtC_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqTipArtR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqTipArtR_Internalname, httpContext.getMessage( "Relacion Baño", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArtR_Internalname, GXutil.ltrim( localUtil.ntoc( A5195MaqTipArtR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTipArtR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5195MaqTipArtR), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5195MaqTipArtR), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArtR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArtR_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMAQTAR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtmaqtar_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtmaqtar_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol68( ) ;
      nGXsfl_68_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount695 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_695 = (short)(1) ;
            scanStartM4695( ) ;
            while ( RcdFound695 != 0 )
            {
               init_level_properties695( ) ;
               getByPrimaryKeyM4695( ) ;
               addRowM4695( ) ;
               scanNextM4695( ) ;
            }
            scanEndM4695( ) ;
            nBlankRcdCount695 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalM4695( ) ;
         standaloneModalM4695( ) ;
         sMode695 = Gx_mode ;
         while ( nGXsfl_68_idx < nRC_GXsfl_68 )
         {
            bGXsfl_68_Refreshing = true ;
            readRowM4695( ) ;
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTAKMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMX_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMx_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTAKMd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTAKMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMM_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTArMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMX_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMx_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTArMd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            edtMaqTArMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMM_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
            if ( ( nRcdExists_695 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalM4695( ) ;
            }
            sendRowM4695( ) ;
            bGXsfl_68_Refreshing = false ;
         }
         Gx_mode = sMode695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount695 = (short)(5) ;
         nRcdExists_695 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartM4695( ) ;
            while ( RcdFound695 != 0 )
            {
               sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_68695( ) ;
               init_level_properties695( ) ;
               standaloneNotModalM4695( ) ;
               getByPrimaryKeyM4695( ) ;
               standaloneModalM4695( ) ;
               addRowM4695( ) ;
               scanNextM4695( ) ;
            }
            scanEndM4695( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode695 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_68695( ) ;
      initAllM4695( ) ;
      init_level_properties695( ) ;
      nRcdExists_695 = (short)(0) ;
      nIsMod_695 = (short)(0) ;
      nRcdDeleted_695 = (short)(0) ;
      nBlankRcdCount695 = (short)(nBlankRcdUsr695+nBlankRcdCount695) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount695 > 0 )
      {
         standaloneNotModalM4695( ) ;
         standaloneModalM4695( ) ;
         addRowM4695( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount695 = (short)(nBlankRcdCount695-1) ;
      }
      Gx_mode = sMode695 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtmaqtar_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtmaqtar_level1item", Gridtmaqtar_level1itemContainer, subGridtmaqtar_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmaqtar_level1itemContainerData", Gridtmaqtar_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmaqtar_level1itemContainerData"+"V", Gridtmaqtar_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtmaqtar_level1itemContainerData"+"V"+"\" value='"+Gridtmaqtar_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z4686MaqTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4686MaqTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5195MaqTipArtR = (short)(localUtil.ctol( httpContext.cgiGet( "Z5195MaqTipArtR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19Lit7 = httpContext.cgiGet( "vLIT7") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4686MaqTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4686MaqTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4686MaqTipArt), 4, 0));
         A4687MaqTipArtD = httpContext.cgiGet( edtMaqTipArtD_Internalname) ;
         n4687MaqTipArtD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
         A4688MaqTipArtC = httpContext.cgiGet( edtMaqTipArtC_Internalname) ;
         n4688MaqTipArtC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4688MaqTipArtC", A4688MaqTipArtC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTipArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqTipArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQTIPARTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqTipArtR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5195MaqTipArtR = (short)(0) ;
            n5195MaqTipArtR = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5195MaqTipArtR), 4, 0));
         }
         else
         {
            A5195MaqTipArtR = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqTipArtR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5195MaqTipArtR = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5195MaqTipArtR), 4, 0));
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
            A4686MaqTipArt = (short)(GXutil.lval( httpContext.GetPar( "MaqTipArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4686MaqTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4686MaqTipArt), 4, 0));
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
            initAllM4694( ) ;
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
      disableAttributesM4694( ) ;
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

   public void confirm_M4695( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRowM4695( ) ;
         if ( ( nRcdExists_695 != 0 ) || ( nIsMod_695 != 0 ) )
         {
            getKeyM4695( ) ;
            if ( ( nRcdExists_695 == 0 ) && ( nRcdDeleted_695 == 0 ) )
            {
               if ( RcdFound695 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateM4695( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableM4695( ) ;
                     closeExtendedTableCursorsM4695( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQCOD_" + sGXsfl_68_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound695 != 0 )
               {
                  if ( nRcdDeleted_695 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyM4695( ) ;
                     loadM4695( ) ;
                     beforeValidateM4695( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsM4695( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateM4695( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableM4695( ) ;
                           closeExtendedTableCursorsM4695( ) ;
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
                  if ( nRcdDeleted_695 == 0 )
                  {
                     GXCCtl = "MAQCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqTAKMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMd_Internalname, GXutil.ltrim( localUtil.ntoc( A4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMd_Internalname, GXutil.ltrim( localUtil.ntoc( A4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_68_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4656MaqTAKMd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4690MaqTArMd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_695 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionM40( )
   {
   }

   public void zmM4694( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5195MaqTipArtR = T00M46_A5195MaqTipArtR[0] ;
         }
         else
         {
            Z5195MaqTipArtR = A5195MaqTipArtR ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z5195MaqTipArtR = A5195MaqTipArtR ;
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z4687MaqTipArtD = A4687MaqTipArtD ;
         Z4688MaqTipArtC = A4688MaqTipArtC ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00M47 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00M47_A407EmprNom[0] ;
      n407EmprNom = T00M47_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00M48 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqTipArt", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQTIPART");
         AnyError = (short)(1) ;
      }
      A4687MaqTipArtD = T00M48_A4687MaqTipArtD[0] ;
      n4687MaqTipArtD = T00M48_n4687MaqTipArtD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
      A4688MaqTipArtC = T00M48_A4688MaqTipArtC[0] ;
      n4688MaqTipArtC = T00M48_n4688MaqTipArtC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4688MaqTipArtC", A4688MaqTipArtC);
      pr_default.close(6);
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

   public void loadM4694( )
   {
      /* Using cursor T00M49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound694 = (short)(1) ;
         A407EmprNom = T00M49_A407EmprNom[0] ;
         n407EmprNom = T00M49_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4687MaqTipArtD = T00M49_A4687MaqTipArtD[0] ;
         n4687MaqTipArtD = T00M49_n4687MaqTipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
         A4688MaqTipArtC = T00M49_A4688MaqTipArtC[0] ;
         n4688MaqTipArtC = T00M49_n4688MaqTipArtC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4688MaqTipArtC", A4688MaqTipArtC);
         A5195MaqTipArtR = T00M49_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = T00M49_n5195MaqTipArtR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5195MaqTipArtR), 4, 0));
         zmM4694( -2) ;
      }
      pr_default.close(7);
      onLoadActionsM4694( ) ;
   }

   public void onLoadActionsM4694( )
   {
   }

   public void checkExtendedTableM4694( )
   {
      nIsDirty_694 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsM4694( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyM4694( )
   {
      /* Using cursor T00M410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound694 = (short)(1) ;
      }
      else
      {
         RcdFound694 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00M46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00M46_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M46_A4686MaqTipArt[0] == A4686MaqTipArt ) )
      {
         zmM4694( 2) ;
         RcdFound694 = (short)(1) ;
         A5195MaqTipArtR = T00M46_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = T00M46_n5195MaqTipArtR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5195MaqTipArtR), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         sMode694 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadM4694( ) ;
         if ( AnyError == 1 )
         {
            RcdFound694 = (short)(0) ;
            initializeNonKeyM4694( ) ;
         }
         Gx_mode = sMode694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound694 = (short)(0) ;
         initializeNonKeyM4694( ) ;
         sMode694 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyM4694( ) ;
      if ( RcdFound694 == 0 )
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
      RcdFound694 = (short)(0) ;
      /* Using cursor T00M411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00M411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M411_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00M411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M411_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            RcdFound694 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound694 = (short)(0) ;
      /* Using cursor T00M412 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00M412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M412_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00M412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00M412_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            RcdFound694 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyM4694( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqTipArtR_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertM4694( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound694 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4686MaqTipArt != Z4686MaqTipArt ) )
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
               GX_FocusControl = edtMaqTipArtR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateM4694( ) ;
               GX_FocusControl = edtMaqTipArtR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4686MaqTipArt != Z4686MaqTipArt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqTipArtR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertM4694( ) ;
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
                  GX_FocusControl = edtMaqTipArtR_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertM4694( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4686MaqTipArt != Z4686MaqTipArt ) )
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
         GX_FocusControl = edtMaqTipArtR_Internalname ;
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
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqTipArtR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartM4694( ) ;
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipArtR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM4694( ) ;
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
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipArtR_Internalname ;
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
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipArtR_Internalname ;
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
      scanStartM4694( ) ;
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound694 != 0 )
         {
            scanNextM4694( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqTipArtR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM4694( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyM4694( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M45 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z5195MaqTipArtR != T00M45_A5195MaqTipArtR[0] ) )
         {
            if ( Z5195MaqTipArtR != T00M45_A5195MaqTipArtR[0] )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTipArtR");
               GXutil.writeLogRaw("Old: ",Z5195MaqTipArtR);
               GXutil.writeLogRaw("Current: ",T00M45_A5195MaqTipArtR[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQTAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM4694( )
   {
      beforeValidateM4694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM4694( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM4694( 0) ;
         checkOptimisticConcurrencyM4694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM4694( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM4694( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M413 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n5195MaqTipArtR), Short.valueOf(A5195MaqTipArtR), A396EmprCod, Short.valueOf(A4686MaqTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTAR");
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
                        processLevelM4694( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionM40( ) ;
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
            loadM4694( ) ;
         }
         endLevelM4694( ) ;
      }
      closeExtendedTableCursorsM4694( ) ;
   }

   public void updateM4694( )
   {
      beforeValidateM4694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM4694( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM4694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM4694( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateM4694( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M414 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n5195MaqTipArtR), Short.valueOf(A5195MaqTipArtR), A396EmprCod, Short.valueOf(A4686MaqTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTAR");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateM4694( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelM4694( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionM40( ) ;
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
         endLevelM4694( ) ;
      }
      closeExtendedTableCursorsM4694( ) ;
   }

   public void deferredUpdateM4694( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM4694( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM4694( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM4694( ) ;
         afterConfirmM4694( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM4694( ) ;
            if ( AnyError == 0 )
            {
               scanStartM4695( ) ;
               while ( RcdFound695 != 0 )
               {
                  getByPrimaryKeyM4695( ) ;
                  deleteM4695( ) ;
                  scanNextM4695( ) ;
               }
               scanEndM4695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M415 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTAR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound694 == 0 )
                        {
                           initAllM4694( ) ;
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
                        resetCaptionM40( ) ;
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
      sMode694 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM4694( ) ;
      Gx_mode = sMode694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM4694( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelM4695( )
   {
      nGXsfl_68_idx = 0 ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         readRowM4695( ) ;
         if ( ( nRcdExists_695 != 0 ) || ( nIsMod_695 != 0 ) )
         {
            standaloneNotModalM4695( ) ;
            getKeyM4695( ) ;
            if ( ( nRcdExists_695 == 0 ) && ( nRcdDeleted_695 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertM4695( ) ;
            }
            else
            {
               if ( RcdFound695 != 0 )
               {
                  if ( ( nRcdDeleted_695 != 0 ) && ( nRcdExists_695 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteM4695( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateM4695( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_695 == 0 )
                  {
                     GXCCtl = "MAQCOD_" + sGXsfl_68_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtMaqTAKMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMd_Internalname, GXutil.ltrim( localUtil.ntoc( A4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMd_Internalname, GXutil.ltrim( localUtil.ntoc( A4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_68_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4656MaqTAKMd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4690MaqTArMd_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_695_"+sGXsfl_68_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_695 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllM4695( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_695 = (short)(0) ;
      nIsMod_695 = (short)(0) ;
      nRcdDeleted_695 = (short)(0) ;
   }

   public void processLevelM4694( )
   {
      /* Save parent mode. */
      sMode694 = Gx_mode ;
      processNestedLevelM4695( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelM4694( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteM4694( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqtar");
         if ( AnyError == 0 )
         {
            confirmValuesM40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqtar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartM4694( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A4686MaqTipArt = A4686MaqTipArt ;
      /* Scan By routine */
      /* Using cursor T00M416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      RcdFound694 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound694 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM4694( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound694 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound694 = (short)(1) ;
      }
   }

   public void scanEndM4694( )
   {
      pr_default.close(14);
   }

   public void afterConfirmM4694( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM4694( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM4694( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM4694( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM4694( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM4694( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM4694( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArt_Enabled), 5, 0), true);
      edtMaqTipArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArtD_Enabled), 5, 0), true);
      edtMaqTipArtC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArtC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArtC_Enabled), 5, 0), true);
      edtMaqTipArtR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArtR_Enabled), 5, 0), true);
   }

   public void zmM4695( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4655MaqTAKMx = T00M43_A4655MaqTAKMx[0] ;
            Z4656MaqTAKMd = T00M43_A4656MaqTAKMd[0] ;
            Z4657MaqTAKMm = T00M43_A4657MaqTAKMm[0] ;
            Z4689MaqTArMx = T00M43_A4689MaqTArMx[0] ;
            Z4690MaqTArMd = T00M43_A4690MaqTArMd[0] ;
            Z4691MaqTArMm = T00M43_A4691MaqTArMm[0] ;
         }
         else
         {
            Z4655MaqTAKMx = A4655MaqTAKMx ;
            Z4656MaqTAKMd = A4656MaqTAKMd ;
            Z4657MaqTAKMm = A4657MaqTAKMm ;
            Z4689MaqTArMx = A4689MaqTArMx ;
            Z4690MaqTArMd = A4690MaqTArMd ;
            Z4691MaqTArMm = A4691MaqTArMm ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z4655MaqTAKMx = A4655MaqTAKMx ;
         Z4656MaqTAKMd = A4656MaqTAKMd ;
         Z4657MaqTAKMm = A4657MaqTAKMm ;
         Z4689MaqTArMx = A4689MaqTArMx ;
         Z4690MaqTArMd = A4690MaqTArMd ;
         Z4691MaqTArMm = A4691MaqTArMm ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
      }
   }

   public void standaloneNotModalM4695( )
   {
   }

   public void standaloneModalM4695( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
      else
      {
         edtMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      }
   }

   public void loadM4695( )
   {
      /* Using cursor T00M417 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A4655MaqTAKMx = T00M417_A4655MaqTAKMx[0] ;
         n4655MaqTAKMx = T00M417_n4655MaqTAKMx[0] ;
         A4656MaqTAKMd = T00M417_A4656MaqTAKMd[0] ;
         n4656MaqTAKMd = T00M417_n4656MaqTAKMd[0] ;
         A4657MaqTAKMm = T00M417_A4657MaqTAKMm[0] ;
         n4657MaqTAKMm = T00M417_n4657MaqTAKMm[0] ;
         A4689MaqTArMx = T00M417_A4689MaqTArMx[0] ;
         n4689MaqTArMx = T00M417_n4689MaqTArMx[0] ;
         A4690MaqTArMd = T00M417_A4690MaqTArMd[0] ;
         n4690MaqTArMd = T00M417_n4690MaqTArMd[0] ;
         A4691MaqTArMm = T00M417_A4691MaqTArMm[0] ;
         n4691MaqTArMm = T00M417_n4691MaqTArMm[0] ;
         zmM4695( -5) ;
      }
      pr_default.close(15);
      onLoadActionsM4695( ) ;
   }

   public void onLoadActionsM4695( )
   {
   }

   public void checkExtendedTableM4695( )
   {
      nIsDirty_695 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalM4695( ) ;
      /* Using cursor T00M44 */
      pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsM4695( )
   {
      pr_default.close(2);
   }

   public void enableDisableM4695( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T00M418 */
      pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKeyM4695( )
   {
      /* Using cursor T00M419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound695 = (short)(1) ;
      }
      else
      {
         RcdFound695 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyM4695( )
   {
      /* Using cursor T00M43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(1) != 101) && ( T00M43_A4686MaqTipArt[0] == A4686MaqTipArt ) && ( GXutil.strcmp(T00M43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmM4695( 5) ;
         RcdFound695 = (short)(1) ;
         initializeNonKeyM4695( ) ;
         A4655MaqTAKMx = T00M43_A4655MaqTAKMx[0] ;
         n4655MaqTAKMx = T00M43_n4655MaqTAKMx[0] ;
         A4656MaqTAKMd = T00M43_A4656MaqTAKMd[0] ;
         n4656MaqTAKMd = T00M43_n4656MaqTAKMd[0] ;
         A4657MaqTAKMm = T00M43_A4657MaqTAKMm[0] ;
         n4657MaqTAKMm = T00M43_n4657MaqTAKMm[0] ;
         A4689MaqTArMx = T00M43_A4689MaqTArMx[0] ;
         n4689MaqTArMx = T00M43_n4689MaqTArMx[0] ;
         A4690MaqTArMd = T00M43_A4690MaqTArMd[0] ;
         n4690MaqTArMd = T00M43_n4690MaqTArMd[0] ;
         A4691MaqTArMm = T00M43_A4691MaqTArMm[0] ;
         n4691MaqTArMm = T00M43_n4691MaqTArMm[0] ;
         A602MaqCod = T00M43_A602MaqCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z602MaqCod = A602MaqCod ;
         sMode695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM4695( ) ;
         loadM4695( ) ;
         Gx_mode = sMode695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound695 = (short)(0) ;
         initializeNonKeyM4695( ) ;
         sMode695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalM4695( ) ;
         Gx_mode = sMode695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesM4695( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyM4695( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4655MaqTAKMx, T00M42_A4655MaqTAKMx[0]) != 0 ) || ( DecimalUtil.compareTo(Z4656MaqTAKMd, T00M42_A4656MaqTAKMd[0]) != 0 ) || ( DecimalUtil.compareTo(Z4657MaqTAKMm, T00M42_A4657MaqTAKMm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4689MaqTArMx, T00M42_A4689MaqTArMx[0]) != 0 ) || ( DecimalUtil.compareTo(Z4690MaqTArMd, T00M42_A4690MaqTArMd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4691MaqTArMm, T00M42_A4691MaqTArMm[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4655MaqTAKMx, T00M42_A4655MaqTAKMx[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTAKMx");
               GXutil.writeLogRaw("Old: ",Z4655MaqTAKMx);
               GXutil.writeLogRaw("Current: ",T00M42_A4655MaqTAKMx[0]);
            }
            if ( DecimalUtil.compareTo(Z4656MaqTAKMd, T00M42_A4656MaqTAKMd[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTAKMd");
               GXutil.writeLogRaw("Old: ",Z4656MaqTAKMd);
               GXutil.writeLogRaw("Current: ",T00M42_A4656MaqTAKMd[0]);
            }
            if ( DecimalUtil.compareTo(Z4657MaqTAKMm, T00M42_A4657MaqTAKMm[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTAKMm");
               GXutil.writeLogRaw("Old: ",Z4657MaqTAKMm);
               GXutil.writeLogRaw("Current: ",T00M42_A4657MaqTAKMm[0]);
            }
            if ( DecimalUtil.compareTo(Z4689MaqTArMx, T00M42_A4689MaqTArMx[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTArMx");
               GXutil.writeLogRaw("Old: ",Z4689MaqTArMx);
               GXutil.writeLogRaw("Current: ",T00M42_A4689MaqTArMx[0]);
            }
            if ( DecimalUtil.compareTo(Z4690MaqTArMd, T00M42_A4690MaqTArMd[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTArMd");
               GXutil.writeLogRaw("Old: ",Z4690MaqTArMd);
               GXutil.writeLogRaw("Current: ",T00M42_A4690MaqTArMd[0]);
            }
            if ( DecimalUtil.compareTo(Z4691MaqTArMm, T00M42_A4691MaqTArMm[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtar:[seudo value changed for attri]"+"MaqTArMm");
               GXutil.writeLogRaw("Old: ",Z4691MaqTArMm);
               GXutil.writeLogRaw("Current: ",T00M42_A4691MaqTArMm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQTA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM4695( )
   {
      beforeValidateM4695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM4695( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM4695( 0) ;
         checkOptimisticConcurrencyM4695( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM4695( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM4695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M420 */
                  pr_default.execute(18, new Object[] {Short.valueOf(A4686MaqTipArt), Boolean.valueOf(n4655MaqTAKMx), A4655MaqTAKMx, Boolean.valueOf(n4656MaqTAKMd), A4656MaqTAKMd, Boolean.valueOf(n4657MaqTAKMm), A4657MaqTAKMm, Boolean.valueOf(n4689MaqTArMx), A4689MaqTArMx, Boolean.valueOf(n4690MaqTArMd), A4690MaqTArMd, Boolean.valueOf(n4691MaqTArMm), A4691MaqTArMm, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTA1");
                  if ( (pr_default.getStatus(18) == 1) )
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
            loadM4695( ) ;
         }
         endLevelM4695( ) ;
      }
      closeExtendedTableCursorsM4695( ) ;
   }

   public void updateM4695( )
   {
      beforeValidateM4695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM4695( ) ;
      }
      if ( ( nIsMod_695 != 0 ) || ( nIsDirty_695 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyM4695( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmM4695( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateM4695( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00M421 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n4655MaqTAKMx), A4655MaqTAKMx, Boolean.valueOf(n4656MaqTAKMd), A4656MaqTAKMd, Boolean.valueOf(n4657MaqTAKMm), A4657MaqTAKMm, Boolean.valueOf(n4689MaqTArMx), A4689MaqTArMx, Boolean.valueOf(n4690MaqTArMd), A4690MaqTArMd, Boolean.valueOf(n4691MaqTArMm), A4691MaqTArMm, A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTA1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateM4695( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyM4695( ) ;
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
            endLevelM4695( ) ;
         }
      }
      closeExtendedTableCursorsM4695( ) ;
   }

   public void deferredUpdateM4695( )
   {
   }

   public void deleteM4695( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM4695( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM4695( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM4695( ) ;
         afterConfirmM4695( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM4695( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00M422 */
               pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTA1");
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
      sMode695 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM4695( ) ;
      Gx_mode = sMode695 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM4695( )
   {
      standaloneModalM4695( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelM4695( )
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

   public void scanStartM4695( )
   {
      /* Scan By routine */
      /* Using cursor T00M423 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      RcdFound695 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A602MaqCod = T00M423_A602MaqCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM4695( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound695 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A602MaqCod = T00M423_A602MaqCod[0] ;
      }
   }

   public void scanEndM4695( )
   {
      pr_default.close(21);
   }

   public void afterConfirmM4695( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM4695( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM4695( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM4695( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM4695( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM4695( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM4695( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTAKMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMx_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTAKMd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTAKMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTArMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMx_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTArMd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqTArMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void send_integrity_lvl_hashesM4695( )
   {
   }

   public void send_integrity_lvl_hashesM4694( )
   {
   }

   public void subsflControlProps_68695( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_68_idx ;
      edtMaqTAKMx_Internalname = "MAQTAKMX_"+sGXsfl_68_idx ;
      edtMaqTAKMd_Internalname = "MAQTAKMD_"+sGXsfl_68_idx ;
      edtMaqTAKMm_Internalname = "MAQTAKMM_"+sGXsfl_68_idx ;
      edtMaqTArMx_Internalname = "MAQTARMX_"+sGXsfl_68_idx ;
      edtMaqTArMd_Internalname = "MAQTARMD_"+sGXsfl_68_idx ;
      edtMaqTArMm_Internalname = "MAQTARMM_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_68695( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_68_fel_idx ;
      edtMaqTAKMx_Internalname = "MAQTAKMX_"+sGXsfl_68_fel_idx ;
      edtMaqTAKMd_Internalname = "MAQTAKMD_"+sGXsfl_68_fel_idx ;
      edtMaqTAKMm_Internalname = "MAQTAKMM_"+sGXsfl_68_fel_idx ;
      edtMaqTArMx_Internalname = "MAQTARMX_"+sGXsfl_68_fel_idx ;
      edtMaqTArMd_Internalname = "MAQTARMD_"+sGXsfl_68_fel_idx ;
      edtMaqTArMm_Internalname = "MAQTARMM_"+sGXsfl_68_fel_idx ;
   }

   public void addRowM4695( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68695( ) ;
      sendRowM4695( ) ;
   }

   public void sendRowM4695( )
   {
      Gridtmaqtar_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtmaqtar_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtmaqtar_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtmaqtar_level1item_Class, "") != 0 )
         {
            subGridtmaqtar_level1item_Linesclass = subGridtmaqtar_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtmaqtar_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtmaqtar_level1item_Backstyle = (byte)(0) ;
         subGridtmaqtar_level1item_Backcolor = subGridtmaqtar_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtmaqtar_level1item_Class, "") != 0 )
         {
            subGridtmaqtar_level1item_Linesclass = subGridtmaqtar_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtmaqtar_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtmaqtar_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtmaqtar_level1item_Class, "") != 0 )
         {
            subGridtmaqtar_level1item_Linesclass = subGridtmaqtar_level1item_Class+"Odd" ;
         }
         subGridtmaqtar_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtmaqtar_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtmaqtar_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
         {
            subGridtmaqtar_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmaqtar_level1item_Class, "") != 0 )
            {
               subGridtmaqtar_level1item_Linesclass = subGridtmaqtar_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtmaqtar_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmaqtar_level1item_Class, "") != 0 )
            {
               subGridtmaqtar_level1item_Linesclass = subGridtmaqtar_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTAKMx_Internalname,GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTAKMx_Enabled!=0) ? localUtil.format( A4655MaqTAKMx, "ZZZZZ9.99") : localUtil.format( A4655MaqTAKMx, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTAKMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTAKMx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTAKMd_Internalname,GXutil.ltrim( localUtil.ntoc( A4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTAKMd_Enabled!=0) ? localUtil.format( A4656MaqTAKMd, "ZZZZZ9.99") : localUtil.format( A4656MaqTAKMd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTAKMd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTAKMd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTAKMm_Internalname,GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTAKMm_Enabled!=0) ? localUtil.format( A4657MaqTAKMm, "ZZZZZ9.99") : localUtil.format( A4657MaqTAKMm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTAKMm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTAKMm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTArMx_Internalname,GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTArMx_Enabled!=0) ? localUtil.format( A4689MaqTArMx, "Z9.99") : localUtil.format( A4689MaqTArMx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTArMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTArMx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTArMd_Internalname,GXutil.ltrim( localUtil.ntoc( A4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTArMd_Enabled!=0) ? localUtil.format( A4690MaqTArMd, "Z9.99") : localUtil.format( A4690MaqTArMd, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTArMd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTArMd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_68_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_68_idx + "',68)\"" ;
      ROClassString = "Attribute" ;
      Gridtmaqtar_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTArMm_Internalname,GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTArMm_Enabled!=0) ? localUtil.format( A4691MaqTArMm, "Z9.99") : localUtil.format( A4691MaqTArMm, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTArMm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTArMm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtmaqtar_level1itemRow);
      send_integrity_lvl_hashesM4695( ) ;
      GXCCtl = "Z602MaqCod_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z602MaqCod));
      GXCCtl = "Z4655MaqTAKMx_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4656MaqTAKMd_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4656MaqTAKMd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4657MaqTAKMm_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4689MaqTArMx_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4690MaqTArMd_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4690MaqTArMd, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4691MaqTArMm_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_695_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_695_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_695_" + sGXsfl_68_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTAKMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTAKMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTAKMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTARMX_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTARMD_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTARMM_"+sGXsfl_68_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtmaqtar_level1itemContainer.AddRow(Gridtmaqtar_level1itemRow);
   }

   public void readRowM4695( )
   {
      nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68695( ) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTAKMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMX_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTAKMd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTAKMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMM_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTArMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMX_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTArMd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMD_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTArMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMM_"+sGXsfl_68_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTAKMx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTAKMx_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTAKMX_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTAKMx_Internalname ;
         wbErr = true ;
         A4655MaqTAKMx = DecimalUtil.ZERO ;
         n4655MaqTAKMx = false ;
      }
      else
      {
         A4655MaqTAKMx = localUtil.ctond( httpContext.cgiGet( edtMaqTAKMx_Internalname)) ;
         n4655MaqTAKMx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTAKMd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTAKMd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTAKMD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTAKMd_Internalname ;
         wbErr = true ;
         A4656MaqTAKMd = DecimalUtil.ZERO ;
         n4656MaqTAKMd = false ;
      }
      else
      {
         A4656MaqTAKMd = localUtil.ctond( httpContext.cgiGet( edtMaqTAKMd_Internalname)) ;
         n4656MaqTAKMd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTAKMm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTAKMm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTAKMM_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTAKMm_Internalname ;
         wbErr = true ;
         A4657MaqTAKMm = DecimalUtil.ZERO ;
         n4657MaqTAKMm = false ;
      }
      else
      {
         A4657MaqTAKMm = localUtil.ctond( httpContext.cgiGet( edtMaqTAKMm_Internalname)) ;
         n4657MaqTAKMm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTArMx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTArMx_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTARMX_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTArMx_Internalname ;
         wbErr = true ;
         A4689MaqTArMx = DecimalUtil.ZERO ;
         n4689MaqTArMx = false ;
      }
      else
      {
         A4689MaqTArMx = localUtil.ctond( httpContext.cgiGet( edtMaqTArMx_Internalname)) ;
         n4689MaqTArMx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTArMd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTArMd_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTARMD_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTArMd_Internalname ;
         wbErr = true ;
         A4690MaqTArMd = DecimalUtil.ZERO ;
         n4690MaqTArMd = false ;
      }
      else
      {
         A4690MaqTArMd = localUtil.ctond( httpContext.cgiGet( edtMaqTArMd_Internalname)) ;
         n4690MaqTArMd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTArMm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTArMm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTARMM_" + sGXsfl_68_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTArMm_Internalname ;
         wbErr = true ;
         A4691MaqTArMm = DecimalUtil.ZERO ;
         n4691MaqTArMm = false ;
      }
      else
      {
         A4691MaqTArMm = localUtil.ctond( httpContext.cgiGet( edtMaqTArMm_Internalname)) ;
         n4691MaqTArMm = false ;
      }
      GXCCtl = "Z602MaqCod_" + sGXsfl_68_idx ;
      Z602MaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4655MaqTAKMx_" + sGXsfl_68_idx ;
      Z4655MaqTAKMx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4656MaqTAKMd_" + sGXsfl_68_idx ;
      Z4656MaqTAKMd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4657MaqTAKMm_" + sGXsfl_68_idx ;
      Z4657MaqTAKMm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4689MaqTArMx_" + sGXsfl_68_idx ;
      Z4689MaqTArMx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4690MaqTArMd_" + sGXsfl_68_idx ;
      Z4690MaqTArMd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4691MaqTArMm_" + sGXsfl_68_idx ;
      Z4691MaqTArMm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_695_" + sGXsfl_68_idx ;
      nRcdDeleted_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_695_" + sGXsfl_68_idx ;
      nRcdExists_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_695_" + sGXsfl_68_idx ;
      nIsMod_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqCod_Enabled = edtMaqCod_Enabled ;
   }

   public void confirmValuesM40( )
   {
      nGXsfl_68_idx = 0 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_68695( ) ;
      while ( nGXsfl_68_idx < nRC_GXsfl_68 )
      {
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_68695( ) ;
         httpContext.changePostValue( "Z602MaqCod_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z602MaqCod_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4655MaqTAKMx_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4656MaqTAKMd_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4656MaqTAKMd_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4656MaqTAKMd_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4657MaqTAKMm_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4689MaqTArMx_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4690MaqTArMd_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4690MaqTArMd_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4690MaqTArMd_"+sGXsfl_68_idx) ;
         httpContext.changePostValue( "Z4691MaqTArMm_"+sGXsfl_68_idx, httpContext.cgiGet( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_68_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_68_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmaqtar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4686MaqTipArt,4,0))}, new String[] {"EmprCod","MaqTipArt"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4686MaqTipArt", GXutil.ltrim( localUtil.ntoc( Z4686MaqTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5195MaqTipArtR", GXutil.ltrim( localUtil.ntoc( Z5195MaqTipArtR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nGXsfl_68_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT7", GXutil.rtrim( AV19Lit7));
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
      return formatLink("app.tmaqtar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4686MaqTipArt,4,0))}, new String[] {"EmprCod","MaqTipArt"})  ;
   }

   public String getPgmname( )
   {
      return "TMAQTAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAPACIDAD MAQUINA P/T.ARTICULO", "") ;
   }

   public void initializeNonKeyM4694( )
   {
      AV19Lit7 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      A5195MaqTipArtR = (short)(0) ;
      n5195MaqTipArtR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5195MaqTipArtR), 4, 0));
      Z5195MaqTipArtR = (short)(0) ;
   }

   public void initAllM4694( )
   {
      initializeNonKeyM4694( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyM4695( )
   {
      A4655MaqTAKMx = DecimalUtil.ZERO ;
      n4655MaqTAKMx = false ;
      A4656MaqTAKMd = DecimalUtil.ZERO ;
      n4656MaqTAKMd = false ;
      A4657MaqTAKMm = DecimalUtil.ZERO ;
      n4657MaqTAKMm = false ;
      A4689MaqTArMx = DecimalUtil.ZERO ;
      n4689MaqTArMx = false ;
      A4690MaqTArMd = DecimalUtil.ZERO ;
      n4690MaqTArMd = false ;
      A4691MaqTArMm = DecimalUtil.ZERO ;
      n4691MaqTArMm = false ;
      Z4655MaqTAKMx = DecimalUtil.ZERO ;
      Z4656MaqTAKMd = DecimalUtil.ZERO ;
      Z4657MaqTAKMm = DecimalUtil.ZERO ;
      Z4689MaqTArMx = DecimalUtil.ZERO ;
      Z4690MaqTArMd = DecimalUtil.ZERO ;
      Z4691MaqTArMm = DecimalUtil.ZERO ;
   }

   public void initAllM4695( )
   {
      A602MaqCod = "" ;
      initializeNonKeyM4695( ) ;
   }

   public void standaloneModalInsertM4695( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241521660", true, true);
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
      httpContext.AddJavascriptSource("tmaqtar.js", "?20268241521660", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties695( )
   {
      edtMaqCod_Enabled = defedtMaqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
   }

   public void startgridcontrol68( )
   {
      Gridtmaqtar_level1itemContainer.AddObjectProperty("GridName", "Gridtmaqtar_level1item");
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Header", subGridtmaqtar_level1item_Header);
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtmaqtar_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4656MaqTAKMd, (byte)(9), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4690MaqTArMd, (byte)(5), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), ".", "")));
      Gridtmaqtar_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddColumnProperties(Gridtmaqtar_level1itemColumn);
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtmaqtar_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtmaqtar_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMaqTipArt_Internalname = "MAQTIPART" ;
      edtMaqTipArtD_Internalname = "MAQTIPARTD" ;
      edtMaqTipArtC_Internalname = "MAQTIPARTC" ;
      edtMaqTipArtR_Internalname = "MAQTIPARTR" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqTAKMx_Internalname = "MAQTAKMX" ;
      edtMaqTAKMd_Internalname = "MAQTAKMD" ;
      edtMaqTAKMm_Internalname = "MAQTAKMM" ;
      edtMaqTArMx_Internalname = "MAQTARMX" ;
      edtMaqTArMd_Internalname = "MAQTARMD" ;
      edtMaqTArMm_Internalname = "MAQTARMM" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtmaqtar_level1item_Internalname = "GRIDTMAQTAR_LEVEL1ITEM" ;
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
      subGridtmaqtar_level1item_Allowcollapsing = (byte)(0) ;
      subGridtmaqtar_level1item_Allowselection = (byte)(0) ;
      subGridtmaqtar_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "CAPACIDAD MAQUINA P/T.ARTICULO", "") );
      edtMaqTArMm_Jsonclick = "" ;
      edtMaqTArMd_Jsonclick = "" ;
      edtMaqTArMx_Jsonclick = "" ;
      edtMaqTAKMm_Jsonclick = "" ;
      edtMaqTAKMd_Jsonclick = "" ;
      edtMaqTAKMx_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGridtmaqtar_level1item_Class = "Grid" ;
      subGridtmaqtar_level1item_Backcolorstyle = (byte)(0) ;
      edtMaqTArMm_Enabled = 1 ;
      edtMaqTArMd_Enabled = 1 ;
      edtMaqTArMx_Enabled = 1 ;
      edtMaqTAKMm_Enabled = 1 ;
      edtMaqTAKMd_Enabled = 1 ;
      edtMaqTAKMx_Enabled = 1 ;
      edtMaqCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMaqTipArtR_Jsonclick = "" ;
      edtMaqTipArtR_Enabled = 1 ;
      edtMaqTipArtC_Jsonclick = "" ;
      edtMaqTipArtC_Enabled = 0 ;
      edtMaqTipArtD_Jsonclick = "" ;
      edtMaqTipArtD_Enabled = 0 ;
      edtMaqTipArt_Jsonclick = "" ;
      edtMaqTipArt_Enabled = 0 ;
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

   public void gxnrgridtmaqtar_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_68695( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalM4695( ) ;
         standaloneModalM4695( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowM4695( ) ;
         nGXsfl_68_idx = (int)(nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_68695( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtmaqtar_level1itemContainer)) ;
      /* End function gxnrGridtmaqtar_level1item_newrow */
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
      /* Using cursor T00M424 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00M424_A407EmprNom[0] ;
      n407EmprNom = T00M424_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T00M425 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqTipArt", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQTIPART");
         AnyError = (short)(1) ;
      }
      A4687MaqTipArtD = T00M425_A4687MaqTipArtD[0] ;
      n4687MaqTipArtD = T00M425_n4687MaqTipArtD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
      A4688MaqTipArtC = T00M425_A4688MaqTipArtC[0] ;
      n4688MaqTipArtC = T00M425_n4688MaqTipArtC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4688MaqTipArtC", A4688MaqTipArtC);
      pr_default.close(23);
      GX_FocusControl = edtMaqTipArtR_Internalname ;
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

   public void valid_Maqtipart( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", GXutil.rtrim( A4687MaqTipArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A4688MaqTipArtC", GXutil.rtrim( A4688MaqTipArtC));
      httpContext.ajax_rsp_assign_attri("", false, "A5195MaqTipArtR", GXutil.ltrim( localUtil.ntoc( A5195MaqTipArtR, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4686MaqTipArt", GXutil.ltrim( localUtil.ntoc( Z4686MaqTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4687MaqTipArtD", GXutil.rtrim( Z4687MaqTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4688MaqTipArtC", GXutil.rtrim( Z4688MaqTipArtC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5195MaqTipArtR", GXutil.ltrim( localUtil.ntoc( Z5195MaqTipArtR, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Maqcod( )
   {
      /* Using cursor T00M426 */
      pr_default.execute(24, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4686MaqTipArt',fld:'MAQTIPART',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQTIPART","{handler:'valid_Maqtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4686MaqTipArt',fld:'MAQTIPART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQTIPART",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4687MaqTipArtD',fld:'MAQTIPARTD',pic:''},{av:'A4688MaqTipArtC',fld:'MAQTIPARTC',pic:''},{av:'A5195MaqTipArtR',fld:'MAQTIPARTR',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4686MaqTipArt'},{av:'Z407EmprNom'},{av:'Z4687MaqTipArtD'},{av:'Z4688MaqTipArtC'},{av:'Z5195MaqTipArtR'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqtarmm',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z4655MaqTAKMx = DecimalUtil.ZERO ;
      Z4656MaqTAKMd = DecimalUtil.ZERO ;
      Z4657MaqTAKMm = DecimalUtil.ZERO ;
      Z4689MaqTArMx = DecimalUtil.ZERO ;
      Z4690MaqTArMd = DecimalUtil.ZERO ;
      Z4691MaqTArMm = DecimalUtil.ZERO ;
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
      A407EmprNom = "" ;
      A4687MaqTipArtD = "" ;
      A4688MaqTipArtC = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtmaqtar_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode695 = "" ;
      sStyleString = "" ;
      AV19Lit7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4655MaqTAKMx = DecimalUtil.ZERO ;
      A4656MaqTAKMd = DecimalUtil.ZERO ;
      A4657MaqTAKMm = DecimalUtil.ZERO ;
      A4689MaqTArMx = DecimalUtil.ZERO ;
      A4690MaqTArMd = DecimalUtil.ZERO ;
      A4691MaqTArMm = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z4687MaqTipArtD = "" ;
      Z4688MaqTipArtC = "" ;
      T00M47_A407EmprNom = new String[] {""} ;
      T00M47_n407EmprNom = new boolean[] {false} ;
      T00M48_A4687MaqTipArtD = new String[] {""} ;
      T00M48_n4687MaqTipArtD = new boolean[] {false} ;
      T00M48_A4688MaqTipArtC = new String[] {""} ;
      T00M48_n4688MaqTipArtC = new boolean[] {false} ;
      T00M49_A407EmprNom = new String[] {""} ;
      T00M49_n407EmprNom = new boolean[] {false} ;
      T00M49_A4687MaqTipArtD = new String[] {""} ;
      T00M49_n4687MaqTipArtD = new boolean[] {false} ;
      T00M49_A4688MaqTipArtC = new String[] {""} ;
      T00M49_n4688MaqTipArtC = new boolean[] {false} ;
      T00M49_A5195MaqTipArtR = new short[1] ;
      T00M49_n5195MaqTipArtR = new boolean[] {false} ;
      T00M49_A396EmprCod = new String[] {""} ;
      T00M49_A4686MaqTipArt = new short[1] ;
      T00M410_A396EmprCod = new String[] {""} ;
      T00M410_A4686MaqTipArt = new short[1] ;
      T00M46_A5195MaqTipArtR = new short[1] ;
      T00M46_n5195MaqTipArtR = new boolean[] {false} ;
      T00M46_A396EmprCod = new String[] {""} ;
      T00M46_A4686MaqTipArt = new short[1] ;
      sMode694 = "" ;
      T00M411_A396EmprCod = new String[] {""} ;
      T00M411_A4686MaqTipArt = new short[1] ;
      T00M412_A396EmprCod = new String[] {""} ;
      T00M412_A4686MaqTipArt = new short[1] ;
      T00M45_A5195MaqTipArtR = new short[1] ;
      T00M45_n5195MaqTipArtR = new boolean[] {false} ;
      T00M45_A396EmprCod = new String[] {""} ;
      T00M45_A4686MaqTipArt = new short[1] ;
      T00M416_A396EmprCod = new String[] {""} ;
      T00M416_A4686MaqTipArt = new short[1] ;
      T00M417_A4686MaqTipArt = new short[1] ;
      T00M417_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4655MaqTAKMx = new boolean[] {false} ;
      T00M417_A4656MaqTAKMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4656MaqTAKMd = new boolean[] {false} ;
      T00M417_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4657MaqTAKMm = new boolean[] {false} ;
      T00M417_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4689MaqTArMx = new boolean[] {false} ;
      T00M417_A4690MaqTArMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4690MaqTArMd = new boolean[] {false} ;
      T00M417_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M417_n4691MaqTArMm = new boolean[] {false} ;
      T00M417_A396EmprCod = new String[] {""} ;
      T00M417_A602MaqCod = new String[] {""} ;
      T00M44_A396EmprCod = new String[] {""} ;
      T00M418_A396EmprCod = new String[] {""} ;
      T00M419_A396EmprCod = new String[] {""} ;
      T00M419_A4686MaqTipArt = new short[1] ;
      T00M419_A602MaqCod = new String[] {""} ;
      T00M43_A4686MaqTipArt = new short[1] ;
      T00M43_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4655MaqTAKMx = new boolean[] {false} ;
      T00M43_A4656MaqTAKMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4656MaqTAKMd = new boolean[] {false} ;
      T00M43_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4657MaqTAKMm = new boolean[] {false} ;
      T00M43_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4689MaqTArMx = new boolean[] {false} ;
      T00M43_A4690MaqTArMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4690MaqTArMd = new boolean[] {false} ;
      T00M43_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M43_n4691MaqTArMm = new boolean[] {false} ;
      T00M43_A396EmprCod = new String[] {""} ;
      T00M43_A602MaqCod = new String[] {""} ;
      T00M42_A4686MaqTipArt = new short[1] ;
      T00M42_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4655MaqTAKMx = new boolean[] {false} ;
      T00M42_A4656MaqTAKMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4656MaqTAKMd = new boolean[] {false} ;
      T00M42_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4657MaqTAKMm = new boolean[] {false} ;
      T00M42_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4689MaqTArMx = new boolean[] {false} ;
      T00M42_A4690MaqTArMd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4690MaqTArMd = new boolean[] {false} ;
      T00M42_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M42_n4691MaqTArMm = new boolean[] {false} ;
      T00M42_A396EmprCod = new String[] {""} ;
      T00M42_A602MaqCod = new String[] {""} ;
      T00M423_A396EmprCod = new String[] {""} ;
      T00M423_A4686MaqTipArt = new short[1] ;
      T00M423_A602MaqCod = new String[] {""} ;
      Gridtmaqtar_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtmaqtar_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtmaqtar_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T00M424_A407EmprNom = new String[] {""} ;
      T00M424_n407EmprNom = new boolean[] {false} ;
      T00M425_A4687MaqTipArtD = new String[] {""} ;
      T00M425_n4687MaqTipArtD = new boolean[] {false} ;
      T00M425_A4688MaqTipArtC = new String[] {""} ;
      T00M425_n4688MaqTipArtC = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4687MaqTipArtD = "" ;
      ZZ4688MaqTipArtC = "" ;
      T00M426_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqtar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqtar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqtar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqtar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqtar__default(),
         new Object[] {
             new Object[] {
            T00M42_A4686MaqTipArt, T00M42_A4655MaqTAKMx, T00M42_n4655MaqTAKMx, T00M42_A4656MaqTAKMd, T00M42_n4656MaqTAKMd, T00M42_A4657MaqTAKMm, T00M42_n4657MaqTAKMm, T00M42_A4689MaqTArMx, T00M42_n4689MaqTArMx, T00M42_A4690MaqTArMd,
            T00M42_n4690MaqTArMd, T00M42_A4691MaqTArMm, T00M42_n4691MaqTArMm, T00M42_A396EmprCod, T00M42_A602MaqCod
            }
            , new Object[] {
            T00M43_A4686MaqTipArt, T00M43_A4655MaqTAKMx, T00M43_n4655MaqTAKMx, T00M43_A4656MaqTAKMd, T00M43_n4656MaqTAKMd, T00M43_A4657MaqTAKMm, T00M43_n4657MaqTAKMm, T00M43_A4689MaqTArMx, T00M43_n4689MaqTArMx, T00M43_A4690MaqTArMd,
            T00M43_n4690MaqTArMd, T00M43_A4691MaqTArMm, T00M43_n4691MaqTArMm, T00M43_A396EmprCod, T00M43_A602MaqCod
            }
            , new Object[] {
            T00M44_A396EmprCod
            }
            , new Object[] {
            T00M45_A5195MaqTipArtR, T00M45_n5195MaqTipArtR, T00M45_A396EmprCod, T00M45_A4686MaqTipArt
            }
            , new Object[] {
            T00M46_A5195MaqTipArtR, T00M46_n5195MaqTipArtR, T00M46_A396EmprCod, T00M46_A4686MaqTipArt
            }
            , new Object[] {
            T00M47_A407EmprNom, T00M47_n407EmprNom
            }
            , new Object[] {
            T00M48_A4687MaqTipArtD, T00M48_n4687MaqTipArtD, T00M48_A4688MaqTipArtC, T00M48_n4688MaqTipArtC
            }
            , new Object[] {
            T00M49_A407EmprNom, T00M49_n407EmprNom, T00M49_A4687MaqTipArtD, T00M49_n4687MaqTipArtD, T00M49_A4688MaqTipArtC, T00M49_n4688MaqTipArtC, T00M49_A5195MaqTipArtR, T00M49_n5195MaqTipArtR, T00M49_A396EmprCod, T00M49_A4686MaqTipArt
            }
            , new Object[] {
            T00M410_A396EmprCod, T00M410_A4686MaqTipArt
            }
            , new Object[] {
            T00M411_A396EmprCod, T00M411_A4686MaqTipArt
            }
            , new Object[] {
            T00M412_A396EmprCod, T00M412_A4686MaqTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M416_A396EmprCod, T00M416_A4686MaqTipArt
            }
            , new Object[] {
            T00M417_A4686MaqTipArt, T00M417_A4655MaqTAKMx, T00M417_n4655MaqTAKMx, T00M417_A4656MaqTAKMd, T00M417_n4656MaqTAKMd, T00M417_A4657MaqTAKMm, T00M417_n4657MaqTAKMm, T00M417_A4689MaqTArMx, T00M417_n4689MaqTArMx, T00M417_A4690MaqTArMd,
            T00M417_n4690MaqTArMd, T00M417_A4691MaqTArMm, T00M417_n4691MaqTArMm, T00M417_A396EmprCod, T00M417_A602MaqCod
            }
            , new Object[] {
            T00M418_A396EmprCod
            }
            , new Object[] {
            T00M419_A396EmprCod, T00M419_A4686MaqTipArt, T00M419_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M423_A396EmprCod, T00M423_A4686MaqTipArt, T00M423_A602MaqCod
            }
            , new Object[] {
            T00M424_A407EmprNom, T00M424_n407EmprNom
            }
            , new Object[] {
            T00M425_A4687MaqTipArtD, T00M425_n4687MaqTipArtD, T00M425_A4688MaqTipArtC, T00M425_n4688MaqTipArtC
            }
            , new Object[] {
            T00M426_A396EmprCod
            }
         }
      );
      Z4686MaqTipArt = (short)(0) ;
      A4686MaqTipArt = (short)(0) ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtmaqtar_level1item_Backcolorstyle ;
   private byte subGridtmaqtar_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtmaqtar_level1item_Allowselection ;
   private byte subGridtmaqtar_level1item_Allowhovering ;
   private byte subGridtmaqtar_level1item_Allowcollapsing ;
   private byte subGridtmaqtar_level1item_Collapsed ;
   private short wcpOA4686MaqTipArt ;
   private short Z4686MaqTipArt ;
   private short Z5195MaqTipArtR ;
   private short nRcdDeleted_695 ;
   private short nRcdExists_695 ;
   private short nIsMod_695 ;
   private short A4686MaqTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5195MaqTipArtR ;
   private short nBlankRcdCount695 ;
   private short RcdFound695 ;
   private short nBlankRcdUsr695 ;
   private short RcdFound694 ;
   private short nIsDirty_694 ;
   private short nIsDirty_695 ;
   private short ZZ4686MaqTipArt ;
   private short ZZ5195MaqTipArtR ;
   private int nRC_GXsfl_68 ;
   private int nGXsfl_68_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqTipArt_Enabled ;
   private int edtMaqTipArtD_Enabled ;
   private int edtMaqTipArtC_Enabled ;
   private int edtMaqTipArtR_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqTAKMx_Enabled ;
   private int edtMaqTAKMd_Enabled ;
   private int edtMaqTAKMm_Enabled ;
   private int edtMaqTArMx_Enabled ;
   private int edtMaqTArMd_Enabled ;
   private int edtMaqTArMm_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtmaqtar_level1item_Backcolor ;
   private int subGridtmaqtar_level1item_Allbackcolor ;
   private int defedtMaqCod_Enabled ;
   private int idxLst ;
   private int subGridtmaqtar_level1item_Selectedindex ;
   private int subGridtmaqtar_level1item_Selectioncolor ;
   private int subGridtmaqtar_level1item_Hoveringcolor ;
   private long GRIDTMAQTAR_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4655MaqTAKMx ;
   private java.math.BigDecimal Z4656MaqTAKMd ;
   private java.math.BigDecimal Z4657MaqTAKMm ;
   private java.math.BigDecimal Z4689MaqTArMx ;
   private java.math.BigDecimal Z4690MaqTArMd ;
   private java.math.BigDecimal Z4691MaqTArMm ;
   private java.math.BigDecimal A4655MaqTAKMx ;
   private java.math.BigDecimal A4656MaqTAKMd ;
   private java.math.BigDecimal A4657MaqTAKMm ;
   private java.math.BigDecimal A4689MaqTArMx ;
   private java.math.BigDecimal A4690MaqTArMd ;
   private java.math.BigDecimal A4691MaqTArMm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
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
   private String edtMaqTipArtR_Internalname ;
   private String sGXsfl_68_idx="0001" ;
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
   private String edtMaqTipArt_Internalname ;
   private String edtMaqTipArt_Jsonclick ;
   private String edtMaqTipArtD_Internalname ;
   private String A4687MaqTipArtD ;
   private String edtMaqTipArtD_Jsonclick ;
   private String edtMaqTipArtC_Internalname ;
   private String A4688MaqTipArtC ;
   private String edtMaqTipArtC_Jsonclick ;
   private String edtMaqTipArtR_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode695 ;
   private String edtMaqCod_Internalname ;
   private String edtMaqTAKMx_Internalname ;
   private String edtMaqTAKMd_Internalname ;
   private String edtMaqTAKMm_Internalname ;
   private String edtMaqTArMx_Internalname ;
   private String edtMaqTArMd_Internalname ;
   private String edtMaqTArMm_Internalname ;
   private String sStyleString ;
   private String subGridtmaqtar_level1item_Internalname ;
   private String AV19Lit7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String Z4687MaqTipArtD ;
   private String Z4688MaqTipArtC ;
   private String sMode694 ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String subGridtmaqtar_level1item_Class ;
   private String subGridtmaqtar_level1item_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqTAKMx_Jsonclick ;
   private String edtMaqTAKMd_Jsonclick ;
   private String edtMaqTAKMm_Jsonclick ;
   private String edtMaqTArMx_Jsonclick ;
   private String edtMaqTArMd_Jsonclick ;
   private String edtMaqTArMm_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtmaqtar_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ4687MaqTipArtD ;
   private String ZZ4688MaqTipArtC ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4687MaqTipArtD ;
   private boolean n4688MaqTipArtC ;
   private boolean n5195MaqTipArtR ;
   private boolean n4655MaqTAKMx ;
   private boolean n4656MaqTAKMd ;
   private boolean n4657MaqTAKMm ;
   private boolean n4689MaqTArMx ;
   private boolean n4690MaqTArMd ;
   private boolean n4691MaqTArMm ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridtmaqtar_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtmaqtar_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtmaqtar_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T00M47_A407EmprNom ;
   private boolean[] T00M47_n407EmprNom ;
   private String[] T00M48_A4687MaqTipArtD ;
   private boolean[] T00M48_n4687MaqTipArtD ;
   private String[] T00M48_A4688MaqTipArtC ;
   private boolean[] T00M48_n4688MaqTipArtC ;
   private String[] T00M49_A407EmprNom ;
   private boolean[] T00M49_n407EmprNom ;
   private String[] T00M49_A4687MaqTipArtD ;
   private boolean[] T00M49_n4687MaqTipArtD ;
   private String[] T00M49_A4688MaqTipArtC ;
   private boolean[] T00M49_n4688MaqTipArtC ;
   private short[] T00M49_A5195MaqTipArtR ;
   private boolean[] T00M49_n5195MaqTipArtR ;
   private String[] T00M49_A396EmprCod ;
   private short[] T00M49_A4686MaqTipArt ;
   private String[] T00M410_A396EmprCod ;
   private short[] T00M410_A4686MaqTipArt ;
   private short[] T00M46_A5195MaqTipArtR ;
   private boolean[] T00M46_n5195MaqTipArtR ;
   private String[] T00M46_A396EmprCod ;
   private short[] T00M46_A4686MaqTipArt ;
   private String[] T00M411_A396EmprCod ;
   private short[] T00M411_A4686MaqTipArt ;
   private String[] T00M412_A396EmprCod ;
   private short[] T00M412_A4686MaqTipArt ;
   private short[] T00M45_A5195MaqTipArtR ;
   private boolean[] T00M45_n5195MaqTipArtR ;
   private String[] T00M45_A396EmprCod ;
   private short[] T00M45_A4686MaqTipArt ;
   private String[] T00M416_A396EmprCod ;
   private short[] T00M416_A4686MaqTipArt ;
   private short[] T00M417_A4686MaqTipArt ;
   private java.math.BigDecimal[] T00M417_A4655MaqTAKMx ;
   private boolean[] T00M417_n4655MaqTAKMx ;
   private java.math.BigDecimal[] T00M417_A4656MaqTAKMd ;
   private boolean[] T00M417_n4656MaqTAKMd ;
   private java.math.BigDecimal[] T00M417_A4657MaqTAKMm ;
   private boolean[] T00M417_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T00M417_A4689MaqTArMx ;
   private boolean[] T00M417_n4689MaqTArMx ;
   private java.math.BigDecimal[] T00M417_A4690MaqTArMd ;
   private boolean[] T00M417_n4690MaqTArMd ;
   private java.math.BigDecimal[] T00M417_A4691MaqTArMm ;
   private boolean[] T00M417_n4691MaqTArMm ;
   private String[] T00M417_A396EmprCod ;
   private String[] T00M417_A602MaqCod ;
   private String[] T00M44_A396EmprCod ;
   private String[] T00M418_A396EmprCod ;
   private String[] T00M419_A396EmprCod ;
   private short[] T00M419_A4686MaqTipArt ;
   private String[] T00M419_A602MaqCod ;
   private short[] T00M43_A4686MaqTipArt ;
   private java.math.BigDecimal[] T00M43_A4655MaqTAKMx ;
   private boolean[] T00M43_n4655MaqTAKMx ;
   private java.math.BigDecimal[] T00M43_A4656MaqTAKMd ;
   private boolean[] T00M43_n4656MaqTAKMd ;
   private java.math.BigDecimal[] T00M43_A4657MaqTAKMm ;
   private boolean[] T00M43_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T00M43_A4689MaqTArMx ;
   private boolean[] T00M43_n4689MaqTArMx ;
   private java.math.BigDecimal[] T00M43_A4690MaqTArMd ;
   private boolean[] T00M43_n4690MaqTArMd ;
   private java.math.BigDecimal[] T00M43_A4691MaqTArMm ;
   private boolean[] T00M43_n4691MaqTArMm ;
   private String[] T00M43_A396EmprCod ;
   private String[] T00M43_A602MaqCod ;
   private short[] T00M42_A4686MaqTipArt ;
   private java.math.BigDecimal[] T00M42_A4655MaqTAKMx ;
   private boolean[] T00M42_n4655MaqTAKMx ;
   private java.math.BigDecimal[] T00M42_A4656MaqTAKMd ;
   private boolean[] T00M42_n4656MaqTAKMd ;
   private java.math.BigDecimal[] T00M42_A4657MaqTAKMm ;
   private boolean[] T00M42_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T00M42_A4689MaqTArMx ;
   private boolean[] T00M42_n4689MaqTArMx ;
   private java.math.BigDecimal[] T00M42_A4690MaqTArMd ;
   private boolean[] T00M42_n4690MaqTArMd ;
   private java.math.BigDecimal[] T00M42_A4691MaqTArMm ;
   private boolean[] T00M42_n4691MaqTArMm ;
   private String[] T00M42_A396EmprCod ;
   private String[] T00M42_A602MaqCod ;
   private String[] T00M423_A396EmprCod ;
   private short[] T00M423_A4686MaqTipArt ;
   private String[] T00M423_A602MaqCod ;
   private String[] T00M424_A407EmprNom ;
   private boolean[] T00M424_n407EmprNom ;
   private String[] T00M425_A4687MaqTipArtD ;
   private boolean[] T00M425_n4687MaqTipArtD ;
   private String[] T00M425_A4688MaqTipArtC ;
   private boolean[] T00M425_n4688MaqTipArtC ;
   private String[] T00M426_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqtar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00M42", "SELECT MaqTipArt, MaqTAKMx, MaqTAKMd, MaqTAKMm, MaqTArMx, MaqTArMd, MaqTArMm, EmprCod, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?  FOR UPDATE OF MaqTAKMx, MaqTAKMd, MaqTAKMm, MaqTArMx, MaqTArMd, MaqTArMm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M43", "SELECT MaqTipArt, MaqTAKMx, MaqTAKMd, MaqTAKMm, MaqTArMx, MaqTArMd, MaqTArMm, EmprCod, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M44", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M45", "SELECT MaqTipArtR, EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ?  FOR UPDATE OF MaqTipArtR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M46", "SELECT MaqTipArtR, EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M47", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M48", "SELECT TipArtDsc AS MaqTipArtD, TipArtClas AS MaqTipArtC FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M49", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, T3.TipArtDsc AS MaqTipArtD, T3.TipArtClas AS MaqTipArtC, TM1.MaqTipArtR, TM1.EmprCod, TM1.MaqTipArt AS MaqTipArt FROM ((TXPMAQTAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipArtCod = TM1.MaqTipArt) WHERE TM1.EmprCod = ? and TM1.MaqTipArt = ? ORDER BY TM1.EmprCod, TM1.MaqTipArt ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M410", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod DESC, MaqTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00M413", "INSERT INTO TXPMAQTAR(MaqTipArtR, EmprCod, MaqTipArt) VALUES(?, ?, ?)", GX_NOMASK, "TXPMAQTAR")
         ,new UpdateCursor("T00M414", "UPDATE TXPMAQTAR SET MaqTipArtR=?  WHERE EmprCod = ? AND MaqTipArt = ?", GX_NOMASK, "TXPMAQTAR")
         ,new UpdateCursor("T00M415", "DELETE FROM TXPMAQTAR  WHERE EmprCod = ? AND MaqTipArt = ?", GX_NOMASK, "TXPMAQTAR")
         ,new ForEachCursor("T00M416", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M417", "SELECT MaqTipArt, MaqTAKMx, MaqTAKMd, MaqTAKMm, MaqTArMx, MaqTArMd, MaqTArMm, EmprCod, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? and MaqTipArt = ? and MaqCod = ? ORDER BY EmprCod, MaqTipArt, MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M418", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M419", "SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00M420", "INSERT INTO TXPMAQTA1(MaqTipArt, MaqTAKMx, MaqTAKMd, MaqTAKMm, MaqTArMx, MaqTArMd, MaqTArMm, EmprCod, MaqCod, MaqInti, MaqIntf) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPMAQTA1")
         ,new UpdateCursor("T00M421", "UPDATE TXPMAQTA1 SET MaqTAKMx=?, MaqTAKMd=?, MaqTAKMm=?, MaqTArMx=?, MaqTArMd=?, MaqTArMm=?  WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQTA1")
         ,new UpdateCursor("T00M422", "DELETE FROM TXPMAQTA1  WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQTA1")
         ,new ForEachCursor("T00M423", "SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt, MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M424", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M425", "SELECT TipArtDsc AS MaqTipArtD, TipArtClas AS MaqTipArtC FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M426", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((short[]) buf[9])[0] = rslt.getShort(6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 24 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 18 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

