package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttarmqp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
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
         gxload_7( A396EmprCod, A602MaqCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridttarmqp_level1item") == 0 )
      {
         gxnrgridttarmqp_level1item_newrow_invoke( ) ;
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
            A4687MaqTipArtD = httpContext.GetPar( "MaqTipArtD") ;
            n4687MaqTipArtD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ASIGNACION MAQUINA F(CTRL)", ""), (short)(0)) ;
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

   public void gxnrgridttarmqp_level1item_newrow_invoke( )
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
      gxnrgridttarmqp_level1item_newrow( ) ;
      /* End function gxnrGridttarmqp_level1item_newrow_invoke */
   }

   public ttarmqp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttarmqp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttarmqp_impl.class ));
   }

   public ttarmqp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "ASIGNACION MAQUINA F(CTRL)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4686MaqTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4686MaqTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4686MaqTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqTipArtD_Internalname, GXutil.rtrim( A4687MaqTipArtD), GXutil.rtrim( localUtil.format( A4687MaqTipArtD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqTipArtD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqTipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTARMQP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridttarmqp_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTARMQP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridttarmqp_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol58( ) ;
      nGXsfl_58_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount695 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_695 = (short)(1) ;
            scanStart162695( ) ;
            while ( RcdFound695 != 0 )
            {
               init_level_properties695( ) ;
               getByPrimaryKey162695( ) ;
               addRow162695( ) ;
               scanNext162695( ) ;
            }
            scanEnd162695( ) ;
            nBlankRcdCount695 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal162695( ) ;
         standaloneModal162695( ) ;
         sMode695 = Gx_mode ;
         while ( nGXsfl_58_idx < nRC_GXsfl_58 )
         {
            bGXsfl_58_Refreshing = true ;
            readRow162695( ) ;
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqKgsMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQKGSMAX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqKgsMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQKGSMIN_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqTAKMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqTAKMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMM_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMm_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqTArMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqTArMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMM_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMm_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqInti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQINTI_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqInti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqInti_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            edtMaqIntf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQINTF_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqIntf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqIntf_Enabled), 5, 0), !bGXsfl_58_Refreshing);
            if ( ( nRcdExists_695 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal162695( ) ;
            }
            sendRow162695( ) ;
            bGXsfl_58_Refreshing = false ;
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
            scanStart162695( ) ;
            while ( RcdFound695 != 0 )
            {
               sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_58695( ) ;
               init_level_properties695( ) ;
               standaloneNotModal162695( ) ;
               getByPrimaryKey162695( ) ;
               standaloneModal162695( ) ;
               addRow162695( ) ;
               scanNext162695( ) ;
            }
            scanEnd162695( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode695 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_58695( ) ;
      initAll162695( ) ;
      init_level_properties695( ) ;
      nRcdExists_695 = (short)(0) ;
      nIsMod_695 = (short)(0) ;
      nRcdDeleted_695 = (short)(0) ;
      nBlankRcdCount695 = (short)(nBlankRcdUsr695+nBlankRcdCount695) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount695 > 0 )
      {
         standaloneNotModal162695( ) ;
         standaloneModal162695( ) ;
         addRow162695( ) ;
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
      httpContext.writeText( "<div id=\""+"Gridttarmqp_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridttarmqp_level1item", Gridttarmqp_level1itemContainer, subGridttarmqp_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttarmqp_level1itemContainerData", Gridttarmqp_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttarmqp_level1itemContainerData"+"V", Gridttarmqp_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridttarmqp_level1itemContainerData"+"V"+"\" value='"+Gridttarmqp_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            initAll162694( ) ;
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
      disableAttributes162694( ) ;
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

   public void confirm_162695( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow162695( ) ;
         if ( ( nRcdExists_695 != 0 ) || ( nIsMod_695 != 0 ) )
         {
            getKey162695( ) ;
            if ( ( nRcdExists_695 == 0 ) && ( nRcdDeleted_695 == 0 ) )
            {
               if ( RcdFound695 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate162695( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable162695( ) ;
                     closeExtendedTableCursors162695( ) ;
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
               if ( RcdFound695 != 0 )
               {
                  if ( nRcdDeleted_695 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey162695( ) ;
                     load162695( ) ;
                     beforeValidate162695( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls162695( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate162695( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable162695( ) ;
                           closeExtendedTableCursors162695( ) ;
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
         httpContext.changePostValue( edtMaqKgsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqKgsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqInti_Internalname, GXutil.ltrim( localUtil.ntoc( A311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqIntf_Internalname, GXutil.ltrim( localUtil.ntoc( A312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z311MaqInti_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z312MaqIntf_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_695 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQKGSMAX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQKGSMIN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQINTI_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqInti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQINTF_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqIntf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1620( )
   {
   }

   public void zm162694( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z4687MaqTipArtD = A4687MaqTipArtD ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01627 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01627_A407EmprNom[0] ;
      n407EmprNom = T01627_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01628 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqTipArt", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQTIPART");
         AnyError = (short)(1) ;
      }
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

   public void load162694( )
   {
      /* Using cursor T01629 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound694 = (short)(1) ;
         A407EmprNom = T01629_A407EmprNom[0] ;
         n407EmprNom = T01629_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm162694( -3) ;
      }
      pr_default.close(7);
      onLoadActions162694( ) ;
   }

   public void onLoadActions162694( )
   {
   }

   public void checkExtendedTable162694( )
   {
      nIsDirty_694 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors162694( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey162694( )
   {
      /* Using cursor T016210 */
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
      /* Using cursor T01626 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01626_A4686MaqTipArt[0] == A4686MaqTipArt ) )
      {
         zm162694( 3) ;
         RcdFound694 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         sMode694 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load162694( ) ;
         if ( AnyError == 1 )
         {
            RcdFound694 = (short)(0) ;
            initializeNonKey162694( ) ;
         }
         Gx_mode = sMode694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound694 = (short)(0) ;
         initializeNonKey162694( ) ;
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
      getKey162694( ) ;
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
      /* Using cursor T016211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016211_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T016211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016211_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            RcdFound694 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound694 = (short)(0) ;
      /* Using cursor T016212 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016212_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016212_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T016212_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016212_A4686MaqTipArt[0] == A4686MaqTipArt ) )
         {
            RcdFound694 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey162694( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert162694( ) ;
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
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update162694( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4686MaqTipArt != Z4686MaqTipArt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert162694( ) ;
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
                  insert162694( ) ;
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
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart162694( ) ;
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd162694( ) ;
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
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart162694( ) ;
      if ( RcdFound694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound694 != 0 )
         {
            scanNext162694( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd162694( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency162694( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01625 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQTAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert162694( )
   {
      beforeValidate162694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable162694( ) ;
      }
      if ( AnyError == 0 )
      {
         zm162694( 0) ;
         checkOptimisticConcurrency162694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm162694( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert162694( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016213 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
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
                        processLevel162694( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1620( ) ;
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
            load162694( ) ;
         }
         endLevel162694( ) ;
      }
      closeExtendedTableCursors162694( ) ;
   }

   public void update162694( )
   {
      beforeValidate162694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable162694( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency162694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm162694( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate162694( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMAQTAR */
                  deferredUpdate162694( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel162694( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1620( ) ;
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
         endLevel162694( ) ;
      }
      closeExtendedTableCursors162694( ) ;
   }

   public void deferredUpdate162694( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate162694( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency162694( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls162694( ) ;
         afterConfirm162694( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete162694( ) ;
            if ( AnyError == 0 )
            {
               scanStart162695( ) ;
               while ( RcdFound695 != 0 )
               {
                  getByPrimaryKey162695( ) ;
                  delete162695( ) ;
                  scanNext162695( ) ;
               }
               scanEnd162695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016214 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
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
                           initAll162694( ) ;
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
                        resetCaption1620( ) ;
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
      endLevel162694( ) ;
      Gx_mode = sMode694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls162694( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel162695( )
   {
      nGXsfl_58_idx = 0 ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         readRow162695( ) ;
         if ( ( nRcdExists_695 != 0 ) || ( nIsMod_695 != 0 ) )
         {
            standaloneNotModal162695( ) ;
            getKey162695( ) ;
            if ( ( nRcdExists_695 == 0 ) && ( nRcdDeleted_695 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert162695( ) ;
            }
            else
            {
               if ( RcdFound695 != 0 )
               {
                  if ( ( nRcdDeleted_695 != 0 ) && ( nRcdExists_695 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete162695( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update162695( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_695 == 0 )
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
         httpContext.changePostValue( edtMaqKgsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqKgsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTAKMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMx_Internalname, GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTArMm_Internalname, GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqInti_Internalname, GXutil.ltrim( localUtil.ntoc( A311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqIntf_Internalname, GXutil.ltrim( localUtil.ntoc( A312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx, GXutil.rtrim( Z602MaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z311MaqInti_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z312MaqIntf_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( Z312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_695_"+sGXsfl_58_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_695 != 0 )
         {
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQKGSMAX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQKGSMIN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTAKMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTARMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQINTI_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqInti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQINTF_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqIntf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll162695( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_695 = (short)(0) ;
      nIsMod_695 = (short)(0) ;
      nRcdDeleted_695 = (short)(0) ;
   }

   public void processLevel162694( )
   {
      /* Save parent mode. */
      sMode694 = Gx_mode ;
      processNestedLevel162695( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel162694( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete162694( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttarmqp");
         if ( AnyError == 0 )
         {
            confirmValues1620( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttarmqp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart162694( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A4686MaqTipArt = A4686MaqTipArt ;
      this.A4687MaqTipArtD = A4687MaqTipArtD ;
      /* Scan By routine */
      /* Using cursor T016215 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      RcdFound694 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound694 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext162694( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound694 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound694 = (short)(1) ;
      }
   }

   public void scanEnd162694( )
   {
      pr_default.close(13);
   }

   public void afterConfirm162694( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert162694( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate162694( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete162694( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete162694( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate162694( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes162694( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArt_Enabled), 5, 0), true);
      edtMaqTipArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTipArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTipArtD_Enabled), 5, 0), true);
   }

   public void zm162695( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4657MaqTAKMm = T01623_A4657MaqTAKMm[0] ;
            Z4655MaqTAKMx = T01623_A4655MaqTAKMx[0] ;
            Z4689MaqTArMx = T01623_A4689MaqTArMx[0] ;
            Z4691MaqTArMm = T01623_A4691MaqTArMm[0] ;
            Z311MaqInti = T01623_A311MaqInti[0] ;
            Z312MaqIntf = T01623_A312MaqIntf[0] ;
         }
         else
         {
            Z4657MaqTAKMm = A4657MaqTAKMm ;
            Z4655MaqTAKMx = A4655MaqTAKMx ;
            Z4689MaqTArMx = A4689MaqTArMx ;
            Z4691MaqTArMm = A4691MaqTArMm ;
            Z311MaqInti = A311MaqInti ;
            Z312MaqIntf = A312MaqIntf ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z4657MaqTAKMm = A4657MaqTAKMm ;
         Z4655MaqTAKMx = A4655MaqTAKMx ;
         Z4689MaqTArMx = A4689MaqTArMx ;
         Z4691MaqTArMm = A4691MaqTArMm ;
         Z311MaqInti = A311MaqInti ;
         Z312MaqIntf = A312MaqIntf ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z606MaqDsc = A606MaqDsc ;
         Z4285MaqKgsMax = A4285MaqKgsMax ;
         Z4283MaqKgsMin = A4283MaqKgsMin ;
      }
   }

   public void standaloneNotModal162695( )
   {
   }

   public void standaloneModal162695( )
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

   public void load162695( )
   {
      /* Using cursor T016216 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A4657MaqTAKMm = T016216_A4657MaqTAKMm[0] ;
         n4657MaqTAKMm = T016216_n4657MaqTAKMm[0] ;
         A4655MaqTAKMx = T016216_A4655MaqTAKMx[0] ;
         n4655MaqTAKMx = T016216_n4655MaqTAKMx[0] ;
         A606MaqDsc = T016216_A606MaqDsc[0] ;
         n606MaqDsc = T016216_n606MaqDsc[0] ;
         A4285MaqKgsMax = T016216_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T016216_n4285MaqKgsMax[0] ;
         A4283MaqKgsMin = T016216_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T016216_n4283MaqKgsMin[0] ;
         A4689MaqTArMx = T016216_A4689MaqTArMx[0] ;
         n4689MaqTArMx = T016216_n4689MaqTArMx[0] ;
         A4691MaqTArMm = T016216_A4691MaqTArMm[0] ;
         n4691MaqTArMm = T016216_n4691MaqTArMm[0] ;
         A311MaqInti = T016216_A311MaqInti[0] ;
         n311MaqInti = T016216_n311MaqInti[0] ;
         A312MaqIntf = T016216_A312MaqIntf[0] ;
         n312MaqIntf = T016216_n312MaqIntf[0] ;
         zm162695( -6) ;
      }
      pr_default.close(14);
      onLoadActions162695( ) ;
   }

   public void onLoadActions162695( )
   {
      if ( isIns( )  )
      {
         A4655MaqTAKMx = A4285MaqKgsMax ;
         n4655MaqTAKMx = false ;
      }
      if ( isIns( )  )
      {
         A4657MaqTAKMm = A4283MaqKgsMin ;
         n4657MaqTAKMm = false ;
      }
   }

   public void checkExtendedTable162695( )
   {
      nIsDirty_695 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal162695( ) ;
      /* Using cursor T01624 */
      pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01624_A606MaqDsc[0] ;
      n606MaqDsc = T01624_n606MaqDsc[0] ;
      A4285MaqKgsMax = T01624_A4285MaqKgsMax[0] ;
      n4285MaqKgsMax = T01624_n4285MaqKgsMax[0] ;
      A4283MaqKgsMin = T01624_A4283MaqKgsMin[0] ;
      n4283MaqKgsMin = T01624_n4283MaqKgsMin[0] ;
      pr_default.close(2);
      if ( isIns( )  )
      {
         nIsDirty_695 = (short)(1) ;
         A4655MaqTAKMx = A4285MaqKgsMax ;
         n4655MaqTAKMx = false ;
      }
      if ( isIns( )  )
      {
         nIsDirty_695 = (short)(1) ;
         A4657MaqTAKMm = A4283MaqKgsMin ;
         n4657MaqTAKMm = false ;
      }
   }

   public void closeExtendedTableCursors162695( )
   {
      pr_default.close(2);
   }

   public void enableDisable162695( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         String A602MaqCod )
   {
      /* Using cursor T016217 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         GXCCtl = "MAQCOD_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T016217_A606MaqDsc[0] ;
      n606MaqDsc = T016217_n606MaqDsc[0] ;
      A4285MaqKgsMax = T016217_A4285MaqKgsMax[0] ;
      n4285MaqKgsMax = T016217_n4285MaqKgsMax[0] ;
      A4283MaqKgsMin = T016217_A4283MaqKgsMin[0] ;
      n4283MaqKgsMin = T016217_n4283MaqKgsMin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey162695( )
   {
      /* Using cursor T016218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound695 = (short)(1) ;
      }
      else
      {
         RcdFound695 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey162695( )
   {
      /* Using cursor T01623 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01623_A4686MaqTipArt[0] == A4686MaqTipArt ) && ( GXutil.strcmp(T01623_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm162695( 6) ;
         RcdFound695 = (short)(1) ;
         initializeNonKey162695( ) ;
         A4657MaqTAKMm = T01623_A4657MaqTAKMm[0] ;
         n4657MaqTAKMm = T01623_n4657MaqTAKMm[0] ;
         A4655MaqTAKMx = T01623_A4655MaqTAKMx[0] ;
         n4655MaqTAKMx = T01623_n4655MaqTAKMx[0] ;
         A4689MaqTArMx = T01623_A4689MaqTArMx[0] ;
         n4689MaqTArMx = T01623_n4689MaqTArMx[0] ;
         A4691MaqTArMm = T01623_A4691MaqTArMm[0] ;
         n4691MaqTArMm = T01623_n4691MaqTArMm[0] ;
         A311MaqInti = T01623_A311MaqInti[0] ;
         n311MaqInti = T01623_n311MaqInti[0] ;
         A312MaqIntf = T01623_A312MaqIntf[0] ;
         n312MaqIntf = T01623_n312MaqIntf[0] ;
         A602MaqCod = T01623_A602MaqCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4686MaqTipArt = A4686MaqTipArt ;
         Z602MaqCod = A602MaqCod ;
         sMode695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal162695( ) ;
         load162695( ) ;
         Gx_mode = sMode695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound695 = (short)(0) ;
         initializeNonKey162695( ) ;
         sMode695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal162695( ) ;
         Gx_mode = sMode695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes162695( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency162695( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01622 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4657MaqTAKMm, T01622_A4657MaqTAKMm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4655MaqTAKMx, T01622_A4655MaqTAKMx[0]) != 0 ) || ( DecimalUtil.compareTo(Z4689MaqTArMx, T01622_A4689MaqTArMx[0]) != 0 ) || ( DecimalUtil.compareTo(Z4691MaqTArMm, T01622_A4691MaqTArMm[0]) != 0 ) || ( Z311MaqInti != T01622_A311MaqInti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z312MaqIntf != T01622_A312MaqIntf[0] ) )
         {
            if ( DecimalUtil.compareTo(Z4657MaqTAKMm, T01622_A4657MaqTAKMm[0]) != 0 )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqTAKMm");
               GXutil.writeLogRaw("Old: ",Z4657MaqTAKMm);
               GXutil.writeLogRaw("Current: ",T01622_A4657MaqTAKMm[0]);
            }
            if ( DecimalUtil.compareTo(Z4655MaqTAKMx, T01622_A4655MaqTAKMx[0]) != 0 )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqTAKMx");
               GXutil.writeLogRaw("Old: ",Z4655MaqTAKMx);
               GXutil.writeLogRaw("Current: ",T01622_A4655MaqTAKMx[0]);
            }
            if ( DecimalUtil.compareTo(Z4689MaqTArMx, T01622_A4689MaqTArMx[0]) != 0 )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqTArMx");
               GXutil.writeLogRaw("Old: ",Z4689MaqTArMx);
               GXutil.writeLogRaw("Current: ",T01622_A4689MaqTArMx[0]);
            }
            if ( DecimalUtil.compareTo(Z4691MaqTArMm, T01622_A4691MaqTArMm[0]) != 0 )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqTArMm");
               GXutil.writeLogRaw("Old: ",Z4691MaqTArMm);
               GXutil.writeLogRaw("Current: ",T01622_A4691MaqTArMm[0]);
            }
            if ( Z311MaqInti != T01622_A311MaqInti[0] )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqInti");
               GXutil.writeLogRaw("Old: ",Z311MaqInti);
               GXutil.writeLogRaw("Current: ",T01622_A311MaqInti[0]);
            }
            if ( Z312MaqIntf != T01622_A312MaqIntf[0] )
            {
               GXutil.writeLogln("ttarmqp:[seudo value changed for attri]"+"MaqIntf");
               GXutil.writeLogRaw("Old: ",Z312MaqIntf);
               GXutil.writeLogRaw("Current: ",T01622_A312MaqIntf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQTA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert162695( )
   {
      beforeValidate162695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable162695( ) ;
      }
      if ( AnyError == 0 )
      {
         zm162695( 0) ;
         checkOptimisticConcurrency162695( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm162695( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert162695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016219 */
                  pr_default.execute(17, new Object[] {Short.valueOf(A4686MaqTipArt), Boolean.valueOf(n4657MaqTAKMm), A4657MaqTAKMm, Boolean.valueOf(n4655MaqTAKMx), A4655MaqTAKMx, Boolean.valueOf(n4689MaqTArMx), A4689MaqTArMx, Boolean.valueOf(n4691MaqTArMm), A4691MaqTArMm, Boolean.valueOf(n311MaqInti), Byte.valueOf(A311MaqInti), Boolean.valueOf(n312MaqIntf), Byte.valueOf(A312MaqIntf), A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTA1");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load162695( ) ;
         }
         endLevel162695( ) ;
      }
      closeExtendedTableCursors162695( ) ;
   }

   public void update162695( )
   {
      beforeValidate162695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable162695( ) ;
      }
      if ( ( nIsMod_695 != 0 ) || ( nIsDirty_695 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency162695( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm162695( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate162695( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016220 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n4657MaqTAKMm), A4657MaqTAKMm, Boolean.valueOf(n4655MaqTAKMx), A4655MaqTAKMx, Boolean.valueOf(n4689MaqTArMx), A4689MaqTArMx, Boolean.valueOf(n4691MaqTArMm), A4691MaqTArMm, Boolean.valueOf(n311MaqInti), Byte.valueOf(A311MaqInti), Boolean.valueOf(n312MaqIntf), Byte.valueOf(A312MaqIntf), A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTA1");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate162695( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey162695( ) ;
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
            endLevel162695( ) ;
         }
      }
      closeExtendedTableCursors162695( ) ;
   }

   public void deferredUpdate162695( )
   {
   }

   public void delete162695( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate162695( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency162695( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls162695( ) ;
         afterConfirm162695( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete162695( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016221 */
               pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt), A602MaqCod});
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
      endLevel162695( ) ;
      Gx_mode = sMode695 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls162695( )
   {
      standaloneModal162695( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016222 */
         pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod});
         A606MaqDsc = T016222_A606MaqDsc[0] ;
         n606MaqDsc = T016222_n606MaqDsc[0] ;
         A4285MaqKgsMax = T016222_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T016222_n4285MaqKgsMax[0] ;
         A4283MaqKgsMin = T016222_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T016222_n4283MaqKgsMin[0] ;
         pr_default.close(20);
      }
   }

   public void endLevel162695( )
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

   public void scanStart162695( )
   {
      /* Scan By routine */
      /* Using cursor T016223 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      RcdFound695 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A602MaqCod = T016223_A602MaqCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext162695( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound695 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound695 = (short)(1) ;
         A602MaqCod = T016223_A602MaqCod[0] ;
      }
   }

   public void scanEnd162695( )
   {
      pr_default.close(21);
   }

   public void afterConfirm162695( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert162695( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate162695( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete162695( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete162695( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate162695( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes162695( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqKgsMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqKgsMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqTAKMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqTAKMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTAKMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTAKMm_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqTArMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMx_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqTArMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTArMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTArMm_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqInti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqInti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqInti_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtMaqIntf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqIntf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqIntf_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void send_integrity_lvl_hashes162695( )
   {
   }

   public void send_integrity_lvl_hashes162694( )
   {
   }

   public void subsflControlProps_58695( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_58_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_58_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_58_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_58_idx ;
      edtMaqTAKMx_Internalname = "MAQTAKMX_"+sGXsfl_58_idx ;
      edtMaqTAKMm_Internalname = "MAQTAKMM_"+sGXsfl_58_idx ;
      edtMaqTArMx_Internalname = "MAQTARMX_"+sGXsfl_58_idx ;
      edtMaqTArMm_Internalname = "MAQTARMM_"+sGXsfl_58_idx ;
      edtMaqInti_Internalname = "MAQINTI_"+sGXsfl_58_idx ;
      edtMaqIntf_Internalname = "MAQINTF_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_58695( )
   {
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_58_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_58_fel_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_58_fel_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_58_fel_idx ;
      edtMaqTAKMx_Internalname = "MAQTAKMX_"+sGXsfl_58_fel_idx ;
      edtMaqTAKMm_Internalname = "MAQTAKMM_"+sGXsfl_58_fel_idx ;
      edtMaqTArMx_Internalname = "MAQTARMX_"+sGXsfl_58_fel_idx ;
      edtMaqTArMm_Internalname = "MAQTARMM_"+sGXsfl_58_fel_idx ;
      edtMaqInti_Internalname = "MAQINTI_"+sGXsfl_58_fel_idx ;
      edtMaqIntf_Internalname = "MAQINTF_"+sGXsfl_58_fel_idx ;
   }

   public void addRow162695( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58695( ) ;
      sendRow162695( ) ;
   }

   public void sendRow162695( )
   {
      Gridttarmqp_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridttarmqp_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridttarmqp_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridttarmqp_level1item_Class, "") != 0 )
         {
            subGridttarmqp_level1item_Linesclass = subGridttarmqp_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridttarmqp_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridttarmqp_level1item_Backstyle = (byte)(0) ;
         subGridttarmqp_level1item_Backcolor = subGridttarmqp_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridttarmqp_level1item_Class, "") != 0 )
         {
            subGridttarmqp_level1item_Linesclass = subGridttarmqp_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridttarmqp_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridttarmqp_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridttarmqp_level1item_Class, "") != 0 )
         {
            subGridttarmqp_level1item_Linesclass = subGridttarmqp_level1item_Class+"Odd" ;
         }
         subGridttarmqp_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridttarmqp_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridttarmqp_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
         {
            subGridttarmqp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttarmqp_level1item_Class, "") != 0 )
            {
               subGridttarmqp_level1item_Linesclass = subGridttarmqp_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridttarmqp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttarmqp_level1item_Class, "") != 0 )
            {
               subGridttarmqp_level1item_Linesclass = subGridttarmqp_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMax_Internalname,GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqKgsMax_Enabled!=0) ? localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99") : localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqKgsMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMin_Internalname,GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqKgsMin_Enabled!=0) ? localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99") : localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqKgsMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTAKMx_Internalname,GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTAKMx_Enabled!=0) ? localUtil.format( A4655MaqTAKMx, "ZZZZZ9.99") : localUtil.format( A4655MaqTAKMx, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTAKMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTAKMx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTAKMm_Internalname,GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTAKMm_Enabled!=0) ? localUtil.format( A4657MaqTAKMm, "ZZZZZ9.99") : localUtil.format( A4657MaqTAKMm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTAKMm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTAKMm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTArMx_Internalname,GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTArMx_Enabled!=0) ? localUtil.format( A4689MaqTArMx, "Z9.99") : localUtil.format( A4689MaqTArMx, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTArMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTArMx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTArMm_Internalname,GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTArMm_Enabled!=0) ? localUtil.format( A4691MaqTArMm, "Z9.99") : localUtil.format( A4691MaqTArMm, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTArMm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTArMm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqInti_Internalname,GXutil.ltrim( localUtil.ntoc( A311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqInti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A311MaqInti), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A311MaqInti), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqInti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqInti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_695_" + sGXsfl_58_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_58_idx + "',58)\"" ;
      ROClassString = "Attribute" ;
      Gridttarmqp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqIntf_Internalname,GXutil.ltrim( localUtil.ntoc( A312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqIntf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A312MaqIntf), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A312MaqIntf), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqIntf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqIntf_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridttarmqp_level1itemRow);
      send_integrity_lvl_hashes162695( ) ;
      GXCCtl = "Z602MaqCod_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z602MaqCod));
      GXCCtl = "Z4657MaqTAKMm_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4657MaqTAKMm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4655MaqTAKMx_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4655MaqTAKMx, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4689MaqTArMx_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4689MaqTArMx, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4691MaqTArMm_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4691MaqTArMm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z311MaqInti_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z311MaqInti, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z312MaqIntf_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z312MaqIntf, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_695_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_695_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_695_" + sGXsfl_58_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQKGSMAX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQKGSMIN_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTAKMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTAKMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTARMX_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTARMM_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQINTI_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqInti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQINTF_"+sGXsfl_58_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqIntf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridttarmqp_level1itemContainer.AddRow(Gridttarmqp_level1itemRow);
   }

   public void readRow162695( )
   {
      nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58695( ) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDSC_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqKgsMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQKGSMAX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqKgsMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQKGSMIN_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTAKMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTAKMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTAKMM_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTArMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMX_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTArMm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTARMM_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqInti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQINTI_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqIntf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQINTF_"+sGXsfl_58_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
      n606MaqDsc = false ;
      A4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)) ;
      n4285MaqKgsMax = false ;
      A4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)) ;
      n4283MaqKgsMin = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTAKMx_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTAKMx_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTAKMX_" + sGXsfl_58_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTAKMm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTAKMm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTAKMM_" + sGXsfl_58_idx ;
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
         GXCCtl = "MAQTARMX_" + sGXsfl_58_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTArMm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTArMm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTARMM_" + sGXsfl_58_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqInti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqInti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MAQINTI_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqInti_Internalname ;
         wbErr = true ;
         A311MaqInti = (byte)(0) ;
         n311MaqInti = false ;
      }
      else
      {
         A311MaqInti = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqInti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n311MaqInti = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqIntf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqIntf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MAQINTF_" + sGXsfl_58_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqIntf_Internalname ;
         wbErr = true ;
         A312MaqIntf = (byte)(0) ;
         n312MaqIntf = false ;
      }
      else
      {
         A312MaqIntf = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqIntf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n312MaqIntf = false ;
      }
      GXCCtl = "Z602MaqCod_" + sGXsfl_58_idx ;
      Z602MaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4657MaqTAKMm_" + sGXsfl_58_idx ;
      Z4657MaqTAKMm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4655MaqTAKMx_" + sGXsfl_58_idx ;
      Z4655MaqTAKMx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4689MaqTArMx_" + sGXsfl_58_idx ;
      Z4689MaqTArMx = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4691MaqTArMm_" + sGXsfl_58_idx ;
      Z4691MaqTArMm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z311MaqInti_" + sGXsfl_58_idx ;
      Z311MaqInti = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z312MaqIntf_" + sGXsfl_58_idx ;
      Z312MaqIntf = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_695_" + sGXsfl_58_idx ;
      nRcdDeleted_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_695_" + sGXsfl_58_idx ;
      nRcdExists_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_695_" + sGXsfl_58_idx ;
      nIsMod_695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqCod_Enabled = edtMaqCod_Enabled ;
   }

   public void confirmValues1620( )
   {
      nGXsfl_58_idx = 0 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_58695( ) ;
      while ( nGXsfl_58_idx < nRC_GXsfl_58 )
      {
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_58695( ) ;
         httpContext.changePostValue( "Z602MaqCod_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z602MaqCod_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z4657MaqTAKMm_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4657MaqTAKMm_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z4655MaqTAKMx_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4655MaqTAKMx_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z4689MaqTArMx_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4689MaqTArMx_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z4691MaqTArMm_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4691MaqTArMm_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z311MaqInti_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z311MaqInti_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z311MaqInti_"+sGXsfl_58_idx) ;
         httpContext.changePostValue( "Z312MaqIntf_"+sGXsfl_58_idx, httpContext.cgiGet( "ZT_"+"Z312MaqIntf_"+sGXsfl_58_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z312MaqIntf_"+sGXsfl_58_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttarmqp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4686MaqTipArt,4,0)),GXutil.URLEncode(GXutil.rtrim(A4687MaqTipArtD))}, new String[] {"EmprCod","MaqTipArt","MaqTipArtD"}) +"\">") ;
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
      return formatLink("app.ttarmqp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4686MaqTipArt,4,0)),GXutil.URLEncode(GXutil.rtrim(A4687MaqTipArtD))}, new String[] {"EmprCod","MaqTipArt","MaqTipArtD"})  ;
   }

   public String getPgmname( )
   {
      return "TTARMQP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ASIGNACION MAQUINA F(CTRL)", "") ;
   }

   public void initializeNonKey162694( )
   {
   }

   public void initAll162694( )
   {
      initializeNonKey162694( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey162695( )
   {
      A4657MaqTAKMm = DecimalUtil.ZERO ;
      n4657MaqTAKMm = false ;
      A4655MaqTAKMx = DecimalUtil.ZERO ;
      n4655MaqTAKMx = false ;
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      n4285MaqKgsMax = false ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      n4283MaqKgsMin = false ;
      A4689MaqTArMx = DecimalUtil.ZERO ;
      n4689MaqTArMx = false ;
      A4691MaqTArMm = DecimalUtil.ZERO ;
      n4691MaqTArMm = false ;
      A311MaqInti = (byte)(0) ;
      n311MaqInti = false ;
      A312MaqIntf = (byte)(0) ;
      n312MaqIntf = false ;
      Z4657MaqTAKMm = DecimalUtil.ZERO ;
      Z4655MaqTAKMx = DecimalUtil.ZERO ;
      Z4689MaqTArMx = DecimalUtil.ZERO ;
      Z4691MaqTArMm = DecimalUtil.ZERO ;
      Z311MaqInti = (byte)(0) ;
      Z312MaqIntf = (byte)(0) ;
   }

   public void initAll162695( )
   {
      A602MaqCod = "" ;
      initializeNonKey162695( ) ;
   }

   public void standaloneModalInsert162695( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241544330", true, true);
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
      httpContext.AddJavascriptSource("ttarmqp.js", "?20268241544331", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties695( )
   {
      edtMaqCod_Enabled = defedtMaqCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
   }

   public void startgridcontrol58( )
   {
      Gridttarmqp_level1itemContainer.AddObjectProperty("GridName", "Gridttarmqp_level1item");
      Gridttarmqp_level1itemContainer.AddObjectProperty("Header", subGridttarmqp_level1item_Header);
      Gridttarmqp_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridttarmqp_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridttarmqp_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTAKMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4689MaqTArMx, (byte)(5), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4691MaqTArMm, (byte)(5), (byte)(2), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTArMm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A311MaqInti, (byte)(2), (byte)(0), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqInti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttarmqp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A312MaqIntf, (byte)(2), (byte)(0), ".", "")));
      Gridttarmqp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqIntf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddColumnProperties(Gridttarmqp_level1itemColumn);
      Gridttarmqp_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridttarmqp_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridttarmqp_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX" ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN" ;
      edtMaqTAKMx_Internalname = "MAQTAKMX" ;
      edtMaqTAKMm_Internalname = "MAQTAKMM" ;
      edtMaqTArMx_Internalname = "MAQTARMX" ;
      edtMaqTArMm_Internalname = "MAQTARMM" ;
      edtMaqInti_Internalname = "MAQINTI" ;
      edtMaqIntf_Internalname = "MAQINTF" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridttarmqp_level1item_Internalname = "GRIDTTARMQP_LEVEL1ITEM" ;
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
      subGridttarmqp_level1item_Allowcollapsing = (byte)(0) ;
      subGridttarmqp_level1item_Allowselection = (byte)(0) ;
      subGridttarmqp_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ASIGNACION MAQUINA F(CTRL)", "") );
      edtMaqIntf_Jsonclick = "" ;
      edtMaqInti_Jsonclick = "" ;
      edtMaqTArMm_Jsonclick = "" ;
      edtMaqTArMx_Jsonclick = "" ;
      edtMaqTAKMm_Jsonclick = "" ;
      edtMaqTAKMx_Jsonclick = "" ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      subGridttarmqp_level1item_Class = "Grid" ;
      subGridttarmqp_level1item_Backcolorstyle = (byte)(0) ;
      edtMaqIntf_Enabled = 1 ;
      edtMaqInti_Enabled = 1 ;
      edtMaqTArMm_Enabled = 1 ;
      edtMaqTArMx_Enabled = 1 ;
      edtMaqTAKMm_Enabled = 1 ;
      edtMaqTAKMx_Enabled = 1 ;
      edtMaqKgsMin_Enabled = 0 ;
      edtMaqKgsMax_Enabled = 0 ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
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

   public void gxnrgridttarmqp_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_58695( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal162695( ) ;
         standaloneModal162695( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow162695( ) ;
         nGXsfl_58_idx = (int)(nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_58695( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridttarmqp_level1itemContainer)) ;
      /* End function gxnrGridttarmqp_level1item_newrow */
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
      /* Using cursor T016224 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016224_A407EmprNom[0] ;
      n407EmprNom = T016224_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T016225 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A4686MaqTipArt)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqTipArt", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQTIPART");
         AnyError = (short)(1) ;
      }
      A4687MaqTipArtD = T016225_A4687MaqTipArtD[0] ;
      n4687MaqTipArtD = T016225_n4687MaqTipArtD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4687MaqTipArtD", A4687MaqTipArtD);
      pr_default.close(23);
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
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4686MaqTipArt", GXutil.ltrim( localUtil.ntoc( Z4686MaqTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4687MaqTipArtD", GXutil.rtrim( Z4687MaqTipArtD));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Maqcod( )
   {
      n4285MaqKgsMax = false ;
      n4283MaqKgsMin = false ;
      n606MaqDsc = false ;
      n4655MaqTAKMx = false ;
      n4657MaqTAKMm = false ;
      /* Using cursor T016222 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      A606MaqDsc = T016222_A606MaqDsc[0] ;
      n606MaqDsc = T016222_n606MaqDsc[0] ;
      A4285MaqKgsMax = T016222_A4285MaqKgsMax[0] ;
      n4285MaqKgsMax = T016222_n4285MaqKgsMax[0] ;
      A4283MaqKgsMin = T016222_A4283MaqKgsMin[0] ;
      n4283MaqKgsMin = T016222_n4283MaqKgsMin[0] ;
      pr_default.close(20);
      if ( isIns( )  )
      {
         A4655MaqTAKMx = A4285MaqKgsMax ;
         n4655MaqTAKMx = false ;
      }
      if ( isIns( )  )
      {
         A4657MaqTAKMm = A4283MaqKgsMin ;
         n4657MaqTAKMm = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4655MaqTAKMx", GXutil.ltrim( localUtil.ntoc( A4655MaqTAKMx, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4657MaqTAKMm", GXutil.ltrim( localUtil.ntoc( A4657MaqTAKMm, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4686MaqTipArt',fld:'MAQTIPART',pic:'ZZZ9'},{av:'A4687MaqTipArtD',fld:'MAQTIPARTD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQTIPART","{handler:'valid_Maqtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4686MaqTipArt',fld:'MAQTIPART',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQTIPART",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4687MaqTipArtD',fld:'MAQTIPARTD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4686MaqTipArt'},{av:'Z407EmprNom'},{av:'Z4687MaqTipArtD'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4285MaqKgsMax',fld:'MAQKGSMAX',pic:'ZZZZZ9.99'},{av:'A4283MaqKgsMin',fld:'MAQKGSMIN',pic:'ZZZZZ9.99'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A4655MaqTAKMx',fld:'MAQTAKMX',pic:'ZZZZZ9.99'},{av:'A4657MaqTAKMm',fld:'MAQTAKMM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A4285MaqKgsMax',fld:'MAQKGSMAX',pic:'ZZZZZ9.99'},{av:'A4283MaqKgsMin',fld:'MAQKGSMIN',pic:'ZZZZZ9.99'},{av:'A4655MaqTAKMx',fld:'MAQTAKMX',pic:'ZZZZZ9.99'},{av:'A4657MaqTAKMm',fld:'MAQTAKMM',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_MAQKGSMAX","{handler:'valid_Maqkgsmax',iparms:[]");
      setEventMetadata("VALID_MAQKGSMAX",",oparms:[]}");
      setEventMetadata("VALID_MAQKGSMIN","{handler:'valid_Maqkgsmin',iparms:[]");
      setEventMetadata("VALID_MAQKGSMIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqintf',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA4687MaqTipArtD = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z4657MaqTAKMm = DecimalUtil.ZERO ;
      Z4655MaqTAKMx = DecimalUtil.ZERO ;
      Z4689MaqTArMx = DecimalUtil.ZERO ;
      Z4691MaqTArMm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A4687MaqTipArtD = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridttarmqp_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode695 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A606MaqDsc = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A4655MaqTAKMx = DecimalUtil.ZERO ;
      A4657MaqTAKMm = DecimalUtil.ZERO ;
      A4689MaqTArMx = DecimalUtil.ZERO ;
      A4691MaqTArMm = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z4687MaqTipArtD = "" ;
      T01627_A407EmprNom = new String[] {""} ;
      T01627_n407EmprNom = new boolean[] {false} ;
      T01628_A4687MaqTipArtD = new String[] {""} ;
      T01628_n4687MaqTipArtD = new boolean[] {false} ;
      T01629_A4687MaqTipArtD = new String[] {""} ;
      T01629_n4687MaqTipArtD = new boolean[] {false} ;
      T01629_A407EmprNom = new String[] {""} ;
      T01629_n407EmprNom = new boolean[] {false} ;
      T01629_A396EmprCod = new String[] {""} ;
      T01629_A4686MaqTipArt = new short[1] ;
      T016210_A396EmprCod = new String[] {""} ;
      T016210_A4686MaqTipArt = new short[1] ;
      T01626_A396EmprCod = new String[] {""} ;
      T01626_A4686MaqTipArt = new short[1] ;
      sMode694 = "" ;
      T016211_A396EmprCod = new String[] {""} ;
      T016211_A4686MaqTipArt = new short[1] ;
      T016212_A396EmprCod = new String[] {""} ;
      T016212_A4686MaqTipArt = new short[1] ;
      T01625_A396EmprCod = new String[] {""} ;
      T01625_A4686MaqTipArt = new short[1] ;
      T016215_A396EmprCod = new String[] {""} ;
      T016215_A4686MaqTipArt = new short[1] ;
      Z606MaqDsc = "" ;
      Z4285MaqKgsMax = DecimalUtil.ZERO ;
      Z4283MaqKgsMin = DecimalUtil.ZERO ;
      T016216_A4686MaqTipArt = new short[1] ;
      T016216_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4657MaqTAKMm = new boolean[] {false} ;
      T016216_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4655MaqTAKMx = new boolean[] {false} ;
      T016216_A606MaqDsc = new String[] {""} ;
      T016216_n606MaqDsc = new boolean[] {false} ;
      T016216_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4285MaqKgsMax = new boolean[] {false} ;
      T016216_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4283MaqKgsMin = new boolean[] {false} ;
      T016216_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4689MaqTArMx = new boolean[] {false} ;
      T016216_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016216_n4691MaqTArMm = new boolean[] {false} ;
      T016216_A311MaqInti = new byte[1] ;
      T016216_n311MaqInti = new boolean[] {false} ;
      T016216_A312MaqIntf = new byte[1] ;
      T016216_n312MaqIntf = new boolean[] {false} ;
      T016216_A396EmprCod = new String[] {""} ;
      T016216_A602MaqCod = new String[] {""} ;
      T01624_A606MaqDsc = new String[] {""} ;
      T01624_n606MaqDsc = new boolean[] {false} ;
      T01624_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01624_n4285MaqKgsMax = new boolean[] {false} ;
      T01624_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01624_n4283MaqKgsMin = new boolean[] {false} ;
      T016217_A606MaqDsc = new String[] {""} ;
      T016217_n606MaqDsc = new boolean[] {false} ;
      T016217_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016217_n4285MaqKgsMax = new boolean[] {false} ;
      T016217_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016217_n4283MaqKgsMin = new boolean[] {false} ;
      T016218_A396EmprCod = new String[] {""} ;
      T016218_A4686MaqTipArt = new short[1] ;
      T016218_A602MaqCod = new String[] {""} ;
      T01623_A4686MaqTipArt = new short[1] ;
      T01623_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01623_n4657MaqTAKMm = new boolean[] {false} ;
      T01623_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01623_n4655MaqTAKMx = new boolean[] {false} ;
      T01623_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01623_n4689MaqTArMx = new boolean[] {false} ;
      T01623_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01623_n4691MaqTArMm = new boolean[] {false} ;
      T01623_A311MaqInti = new byte[1] ;
      T01623_n311MaqInti = new boolean[] {false} ;
      T01623_A312MaqIntf = new byte[1] ;
      T01623_n312MaqIntf = new boolean[] {false} ;
      T01623_A396EmprCod = new String[] {""} ;
      T01623_A602MaqCod = new String[] {""} ;
      T01622_A4686MaqTipArt = new short[1] ;
      T01622_A4657MaqTAKMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01622_n4657MaqTAKMm = new boolean[] {false} ;
      T01622_A4655MaqTAKMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01622_n4655MaqTAKMx = new boolean[] {false} ;
      T01622_A4689MaqTArMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01622_n4689MaqTArMx = new boolean[] {false} ;
      T01622_A4691MaqTArMm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01622_n4691MaqTArMm = new boolean[] {false} ;
      T01622_A311MaqInti = new byte[1] ;
      T01622_n311MaqInti = new boolean[] {false} ;
      T01622_A312MaqIntf = new byte[1] ;
      T01622_n312MaqIntf = new boolean[] {false} ;
      T01622_A396EmprCod = new String[] {""} ;
      T01622_A602MaqCod = new String[] {""} ;
      T016222_A606MaqDsc = new String[] {""} ;
      T016222_n606MaqDsc = new boolean[] {false} ;
      T016222_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016222_n4285MaqKgsMax = new boolean[] {false} ;
      T016222_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016222_n4283MaqKgsMin = new boolean[] {false} ;
      T016223_A396EmprCod = new String[] {""} ;
      T016223_A4686MaqTipArt = new short[1] ;
      T016223_A602MaqCod = new String[] {""} ;
      Gridttarmqp_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridttarmqp_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridttarmqp_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T016224_A407EmprNom = new String[] {""} ;
      T016224_n407EmprNom = new boolean[] {false} ;
      T016225_A4687MaqTipArtD = new String[] {""} ;
      T016225_n4687MaqTipArtD = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4687MaqTipArtD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttarmqp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttarmqp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttarmqp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttarmqp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttarmqp__default(),
         new Object[] {
             new Object[] {
            T01622_A4686MaqTipArt, T01622_A4657MaqTAKMm, T01622_n4657MaqTAKMm, T01622_A4655MaqTAKMx, T01622_n4655MaqTAKMx, T01622_A4689MaqTArMx, T01622_n4689MaqTArMx, T01622_A4691MaqTArMm, T01622_n4691MaqTArMm, T01622_A311MaqInti,
            T01622_n311MaqInti, T01622_A312MaqIntf, T01622_n312MaqIntf, T01622_A396EmprCod, T01622_A602MaqCod
            }
            , new Object[] {
            T01623_A4686MaqTipArt, T01623_A4657MaqTAKMm, T01623_n4657MaqTAKMm, T01623_A4655MaqTAKMx, T01623_n4655MaqTAKMx, T01623_A4689MaqTArMx, T01623_n4689MaqTArMx, T01623_A4691MaqTArMm, T01623_n4691MaqTArMm, T01623_A311MaqInti,
            T01623_n311MaqInti, T01623_A312MaqIntf, T01623_n312MaqIntf, T01623_A396EmprCod, T01623_A602MaqCod
            }
            , new Object[] {
            T01624_A606MaqDsc, T01624_n606MaqDsc, T01624_A4285MaqKgsMax, T01624_n4285MaqKgsMax, T01624_A4283MaqKgsMin, T01624_n4283MaqKgsMin
            }
            , new Object[] {
            T01625_A396EmprCod, T01625_A4686MaqTipArt
            }
            , new Object[] {
            T01626_A396EmprCod, T01626_A4686MaqTipArt
            }
            , new Object[] {
            T01627_A407EmprNom, T01627_n407EmprNom
            }
            , new Object[] {
            T01628_A4687MaqTipArtD, T01628_n4687MaqTipArtD
            }
            , new Object[] {
            T01629_A4687MaqTipArtD, T01629_n4687MaqTipArtD, T01629_A407EmprNom, T01629_n407EmprNom, T01629_A396EmprCod, T01629_A4686MaqTipArt
            }
            , new Object[] {
            T016210_A396EmprCod, T016210_A4686MaqTipArt
            }
            , new Object[] {
            T016211_A396EmprCod, T016211_A4686MaqTipArt
            }
            , new Object[] {
            T016212_A396EmprCod, T016212_A4686MaqTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016215_A396EmprCod, T016215_A4686MaqTipArt
            }
            , new Object[] {
            T016216_A4686MaqTipArt, T016216_A4657MaqTAKMm, T016216_n4657MaqTAKMm, T016216_A4655MaqTAKMx, T016216_n4655MaqTAKMx, T016216_A606MaqDsc, T016216_n606MaqDsc, T016216_A4285MaqKgsMax, T016216_n4285MaqKgsMax, T016216_A4283MaqKgsMin,
            T016216_n4283MaqKgsMin, T016216_A4689MaqTArMx, T016216_n4689MaqTArMx, T016216_A4691MaqTArMm, T016216_n4691MaqTArMm, T016216_A311MaqInti, T016216_n311MaqInti, T016216_A312MaqIntf, T016216_n312MaqIntf, T016216_A396EmprCod,
            T016216_A602MaqCod
            }
            , new Object[] {
            T016217_A606MaqDsc, T016217_n606MaqDsc, T016217_A4285MaqKgsMax, T016217_n4285MaqKgsMax, T016217_A4283MaqKgsMin, T016217_n4283MaqKgsMin
            }
            , new Object[] {
            T016218_A396EmprCod, T016218_A4686MaqTipArt, T016218_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016222_A606MaqDsc, T016222_n606MaqDsc, T016222_A4285MaqKgsMax, T016222_n4285MaqKgsMax, T016222_A4283MaqKgsMin, T016222_n4283MaqKgsMin
            }
            , new Object[] {
            T016223_A396EmprCod, T016223_A4686MaqTipArt, T016223_A602MaqCod
            }
            , new Object[] {
            T016224_A407EmprNom, T016224_n407EmprNom
            }
            , new Object[] {
            T016225_A4687MaqTipArtD, T016225_n4687MaqTipArtD
            }
         }
      );
      Z4687MaqTipArtD = "" ;
      n4687MaqTipArtD = false ;
      A4687MaqTipArtD = "" ;
      n4687MaqTipArtD = false ;
      Z4686MaqTipArt = (short)(0) ;
      A4686MaqTipArt = (short)(0) ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z311MaqInti ;
   private byte Z312MaqIntf ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A311MaqInti ;
   private byte A312MaqIntf ;
   private byte Gx_BScreen ;
   private byte subGridttarmqp_level1item_Backcolorstyle ;
   private byte subGridttarmqp_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridttarmqp_level1item_Allowselection ;
   private byte subGridttarmqp_level1item_Allowhovering ;
   private byte subGridttarmqp_level1item_Allowcollapsing ;
   private byte subGridttarmqp_level1item_Collapsed ;
   private short wcpOA4686MaqTipArt ;
   private short Z4686MaqTipArt ;
   private short nRcdDeleted_695 ;
   private short nRcdExists_695 ;
   private short nIsMod_695 ;
   private short A4686MaqTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount695 ;
   private short RcdFound695 ;
   private short nBlankRcdUsr695 ;
   private short RcdFound694 ;
   private short nIsDirty_694 ;
   private short nIsDirty_695 ;
   private short ZZ4686MaqTipArt ;
   private int nRC_GXsfl_58 ;
   private int nGXsfl_58_idx=1 ;
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
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqKgsMax_Enabled ;
   private int edtMaqKgsMin_Enabled ;
   private int edtMaqTAKMx_Enabled ;
   private int edtMaqTAKMm_Enabled ;
   private int edtMaqTArMx_Enabled ;
   private int edtMaqTArMm_Enabled ;
   private int edtMaqInti_Enabled ;
   private int edtMaqIntf_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridttarmqp_level1item_Backcolor ;
   private int subGridttarmqp_level1item_Allbackcolor ;
   private int defedtMaqCod_Enabled ;
   private int idxLst ;
   private int subGridttarmqp_level1item_Selectedindex ;
   private int subGridttarmqp_level1item_Selectioncolor ;
   private int subGridttarmqp_level1item_Hoveringcolor ;
   private long GRIDTTARMQP_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4657MaqTAKMm ;
   private java.math.BigDecimal Z4655MaqTAKMx ;
   private java.math.BigDecimal Z4689MaqTArMx ;
   private java.math.BigDecimal Z4691MaqTArMm ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A4655MaqTAKMx ;
   private java.math.BigDecimal A4657MaqTAKMm ;
   private java.math.BigDecimal A4689MaqTArMx ;
   private java.math.BigDecimal A4691MaqTArMm ;
   private java.math.BigDecimal Z4285MaqKgsMax ;
   private java.math.BigDecimal Z4283MaqKgsMin ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA4687MaqTipArtD ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A4687MaqTipArtD ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMaqTipArt_Internalname ;
   private String edtMaqTipArt_Jsonclick ;
   private String edtMaqTipArtD_Internalname ;
   private String edtMaqTipArtD_Jsonclick ;
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
   private String edtMaqDsc_Internalname ;
   private String edtMaqKgsMax_Internalname ;
   private String edtMaqKgsMin_Internalname ;
   private String edtMaqTAKMx_Internalname ;
   private String edtMaqTAKMm_Internalname ;
   private String edtMaqTArMx_Internalname ;
   private String edtMaqTArMm_Internalname ;
   private String edtMaqInti_Internalname ;
   private String edtMaqIntf_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridttarmqp_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A606MaqDsc ;
   private String Z407EmprNom ;
   private String Z4687MaqTipArtD ;
   private String sMode694 ;
   private String Z606MaqDsc ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String subGridttarmqp_level1item_Class ;
   private String subGridttarmqp_level1item_Linesclass ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqKgsMax_Jsonclick ;
   private String edtMaqKgsMin_Jsonclick ;
   private String edtMaqTAKMx_Jsonclick ;
   private String edtMaqTAKMm_Jsonclick ;
   private String edtMaqTArMx_Jsonclick ;
   private String edtMaqTArMm_Jsonclick ;
   private String edtMaqInti_Jsonclick ;
   private String edtMaqIntf_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridttarmqp_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ4687MaqTipArtD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4687MaqTipArtD ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4657MaqTAKMm ;
   private boolean n4655MaqTAKMx ;
   private boolean n606MaqDsc ;
   private boolean n4285MaqKgsMax ;
   private boolean n4283MaqKgsMin ;
   private boolean n4689MaqTArMx ;
   private boolean n4691MaqTArMm ;
   private boolean n311MaqInti ;
   private boolean n312MaqIntf ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridttarmqp_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridttarmqp_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridttarmqp_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01627_A407EmprNom ;
   private boolean[] T01627_n407EmprNom ;
   private String[] T01628_A4687MaqTipArtD ;
   private boolean[] T01628_n4687MaqTipArtD ;
   private String[] T01629_A4687MaqTipArtD ;
   private boolean[] T01629_n4687MaqTipArtD ;
   private String[] T01629_A407EmprNom ;
   private boolean[] T01629_n407EmprNom ;
   private String[] T01629_A396EmprCod ;
   private short[] T01629_A4686MaqTipArt ;
   private String[] T016210_A396EmprCod ;
   private short[] T016210_A4686MaqTipArt ;
   private String[] T01626_A396EmprCod ;
   private short[] T01626_A4686MaqTipArt ;
   private String[] T016211_A396EmprCod ;
   private short[] T016211_A4686MaqTipArt ;
   private String[] T016212_A396EmprCod ;
   private short[] T016212_A4686MaqTipArt ;
   private String[] T01625_A396EmprCod ;
   private short[] T01625_A4686MaqTipArt ;
   private String[] T016215_A396EmprCod ;
   private short[] T016215_A4686MaqTipArt ;
   private short[] T016216_A4686MaqTipArt ;
   private java.math.BigDecimal[] T016216_A4657MaqTAKMm ;
   private boolean[] T016216_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T016216_A4655MaqTAKMx ;
   private boolean[] T016216_n4655MaqTAKMx ;
   private String[] T016216_A606MaqDsc ;
   private boolean[] T016216_n606MaqDsc ;
   private java.math.BigDecimal[] T016216_A4285MaqKgsMax ;
   private boolean[] T016216_n4285MaqKgsMax ;
   private java.math.BigDecimal[] T016216_A4283MaqKgsMin ;
   private boolean[] T016216_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T016216_A4689MaqTArMx ;
   private boolean[] T016216_n4689MaqTArMx ;
   private java.math.BigDecimal[] T016216_A4691MaqTArMm ;
   private boolean[] T016216_n4691MaqTArMm ;
   private byte[] T016216_A311MaqInti ;
   private boolean[] T016216_n311MaqInti ;
   private byte[] T016216_A312MaqIntf ;
   private boolean[] T016216_n312MaqIntf ;
   private String[] T016216_A396EmprCod ;
   private String[] T016216_A602MaqCod ;
   private String[] T01624_A606MaqDsc ;
   private boolean[] T01624_n606MaqDsc ;
   private java.math.BigDecimal[] T01624_A4285MaqKgsMax ;
   private boolean[] T01624_n4285MaqKgsMax ;
   private java.math.BigDecimal[] T01624_A4283MaqKgsMin ;
   private boolean[] T01624_n4283MaqKgsMin ;
   private String[] T016217_A606MaqDsc ;
   private boolean[] T016217_n606MaqDsc ;
   private java.math.BigDecimal[] T016217_A4285MaqKgsMax ;
   private boolean[] T016217_n4285MaqKgsMax ;
   private java.math.BigDecimal[] T016217_A4283MaqKgsMin ;
   private boolean[] T016217_n4283MaqKgsMin ;
   private String[] T016218_A396EmprCod ;
   private short[] T016218_A4686MaqTipArt ;
   private String[] T016218_A602MaqCod ;
   private short[] T01623_A4686MaqTipArt ;
   private java.math.BigDecimal[] T01623_A4657MaqTAKMm ;
   private boolean[] T01623_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T01623_A4655MaqTAKMx ;
   private boolean[] T01623_n4655MaqTAKMx ;
   private java.math.BigDecimal[] T01623_A4689MaqTArMx ;
   private boolean[] T01623_n4689MaqTArMx ;
   private java.math.BigDecimal[] T01623_A4691MaqTArMm ;
   private boolean[] T01623_n4691MaqTArMm ;
   private byte[] T01623_A311MaqInti ;
   private boolean[] T01623_n311MaqInti ;
   private byte[] T01623_A312MaqIntf ;
   private boolean[] T01623_n312MaqIntf ;
   private String[] T01623_A396EmprCod ;
   private String[] T01623_A602MaqCod ;
   private short[] T01622_A4686MaqTipArt ;
   private java.math.BigDecimal[] T01622_A4657MaqTAKMm ;
   private boolean[] T01622_n4657MaqTAKMm ;
   private java.math.BigDecimal[] T01622_A4655MaqTAKMx ;
   private boolean[] T01622_n4655MaqTAKMx ;
   private java.math.BigDecimal[] T01622_A4689MaqTArMx ;
   private boolean[] T01622_n4689MaqTArMx ;
   private java.math.BigDecimal[] T01622_A4691MaqTArMm ;
   private boolean[] T01622_n4691MaqTArMm ;
   private byte[] T01622_A311MaqInti ;
   private boolean[] T01622_n311MaqInti ;
   private byte[] T01622_A312MaqIntf ;
   private boolean[] T01622_n312MaqIntf ;
   private String[] T01622_A396EmprCod ;
   private String[] T01622_A602MaqCod ;
   private String[] T016222_A606MaqDsc ;
   private boolean[] T016222_n606MaqDsc ;
   private java.math.BigDecimal[] T016222_A4285MaqKgsMax ;
   private boolean[] T016222_n4285MaqKgsMax ;
   private java.math.BigDecimal[] T016222_A4283MaqKgsMin ;
   private boolean[] T016222_n4283MaqKgsMin ;
   private String[] T016223_A396EmprCod ;
   private short[] T016223_A4686MaqTipArt ;
   private String[] T016223_A602MaqCod ;
   private String[] T016224_A407EmprNom ;
   private boolean[] T016224_n407EmprNom ;
   private String[] T016225_A4687MaqTipArtD ;
   private boolean[] T016225_n4687MaqTipArtD ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttarmqp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttarmqp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttarmqp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttarmqp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttarmqp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01622", "SELECT MaqTipArt, MaqTAKMm, MaqTAKMx, MaqTArMx, MaqTArMm, MaqInti, MaqIntf, EmprCod, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?  FOR UPDATE OF MaqTAKMm, MaqTAKMx, MaqTArMx, MaqTArMm, MaqInti, MaqIntf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01623", "SELECT MaqTipArt, MaqTAKMm, MaqTAKMx, MaqTArMx, MaqTArMm, MaqInti, MaqIntf, EmprCod, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01624", "SELECT MaqDsc, MaqKgsMax, MaqKgsMin FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01625", "SELECT EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01626", "SELECT EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01627", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01628", "SELECT TipArtDsc AS MaqTipArtD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01629", "SELECT /*+ FIRST_ROWS(1) */ T3.TipArtDsc AS MaqTipArtD, T2.EmprNom, TM1.EmprCod, TM1.MaqTipArt AS MaqTipArt FROM ((TXPMAQTAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipArtCod = TM1.MaqTipArt) WHERE TM1.EmprCod = ? and TM1.MaqTipArt = ? ORDER BY TM1.EmprCod, TM1.MaqTipArt ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016210", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016212", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod DESC, MaqTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016213", "INSERT INTO TXPMAQTAR(EmprCod, MaqTipArt, MaqTipArtR) VALUES(?, ?, 0)", GX_NOMASK, "TXPMAQTAR")
         ,new UpdateCursor("T016214", "DELETE FROM TXPMAQTAR  WHERE EmprCod = ? AND MaqTipArt = ?", GX_NOMASK, "TXPMAQTAR")
         ,new ForEachCursor("T016215", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016216", "SELECT T1.MaqTipArt AS MaqTipArt, T1.MaqTAKMm, T1.MaqTAKMx, T2.MaqDsc, T2.MaqKgsMax, T2.MaqKgsMin, T1.MaqTArMx, T1.MaqTArMm, T1.MaqInti, T1.MaqIntf, T1.EmprCod, T1.MaqCod FROM (TXPMAQTA1 T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.MaqTipArt = ? and T1.MaqCod = ? ORDER BY T1.EmprCod, T1.MaqTipArt, T1.MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016217", "SELECT MaqDsc, MaqKgsMax, MaqKgsMin FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016218", "SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016219", "INSERT INTO TXPMAQTA1(MaqTipArt, MaqTAKMm, MaqTAKMx, MaqTArMx, MaqTArMm, MaqInti, MaqIntf, EmprCod, MaqCod, MaqTAKMd, MaqTArMd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK, "TXPMAQTA1")
         ,new UpdateCursor("T016220", "UPDATE TXPMAQTA1 SET MaqTAKMm=?, MaqTAKMx=?, MaqTArMx=?, MaqTArMm=?, MaqInti=?, MaqIntf=?  WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQTA1")
         ,new UpdateCursor("T016221", "DELETE FROM TXPMAQTA1  WHERE EmprCod = ? AND MaqTipArt = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQTA1")
         ,new ForEachCursor("T016222", "SELECT MaqDsc, MaqKgsMax, MaqKgsMin FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016223", "SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt, MaqCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016224", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016225", "SELECT TipArtDsc AS MaqTipArtD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
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
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
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
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 18 :
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
      }
   }

}

