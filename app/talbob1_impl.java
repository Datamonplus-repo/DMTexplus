package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbob1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtalbob1_level1item") == 0 )
      {
         gxnrgridtalbob1_level1item_newrow_invoke( ) ;
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Observaciones (Solo Agregar)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtalbob1_level1item_newrow_invoke( )
   {
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
      A914AlbPObsCon = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsCon"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A33AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtalbob1_level1item_newrow( ) ;
      /* End function gxnrGridtalbob1_level1item_newrow_invoke */
   }

   public talbob1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbob1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbob1_impl.class ));
   }

   public talbob1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Observaciones (Solo Agregar)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TALBOB1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBOB1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBOB1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPObsCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPObsCon_Internalname, httpContext.getMessage( "Contador Lineas Observ.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsCon_Internalname, GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPObsCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbPObsCon_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBOB1.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtalbob1_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBOB1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtalbob1_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol63( ) ;
      nGXsfl_63_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount121 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_121 = (short)(1) ;
            scanStart1JE121( ) ;
            while ( RcdFound121 != 0 )
            {
               init_level_properties121( ) ;
               getByPrimaryKey1JE121( ) ;
               addRow1JE121( ) ;
               scanNext1JE121( ) ;
            }
            scanEnd1JE121( ) ;
            nBlankRcdCount121 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         standaloneNotModal1JE121( ) ;
         standaloneModal1JE121( ) ;
         sMode121 = Gx_mode ;
         while ( nGXsfl_63_idx < nRC_GXsfl_63 )
         {
            bGXsfl_63_Refreshing = true ;
            readRow1JE121( ) ;
            edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_63_Refreshing);
            edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
            if ( ( nRcdExists_121 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JE121( ) ;
            }
            sendRow1JE121( ) ;
            bGXsfl_63_Refreshing = false ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A914AlbPObsCon = B914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount121 = (short)(5) ;
         nRcdExists_121 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JE121( ) ;
            while ( RcdFound121 != 0 )
            {
               sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_63121( ) ;
               init_level_properties121( ) ;
               standaloneNotModal1JE121( ) ;
               getByPrimaryKey1JE121( ) ;
               standaloneModal1JE121( ) ;
               addRow1JE121( ) ;
               scanNext1JE121( ) ;
            }
            scanEnd1JE121( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode121 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_63121( ) ;
      initAll1JE121( ) ;
      init_level_properties121( ) ;
      B914AlbPObsCon = A914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nRcdExists_121 = (short)(0) ;
      nIsMod_121 = (short)(0) ;
      nRcdDeleted_121 = (short)(0) ;
      nBlankRcdCount121 = (short)(nBlankRcdUsr121+nBlankRcdCount121) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount121 > 0 )
      {
         standaloneNotModal1JE121( ) ;
         standaloneModal1JE121( ) ;
         addRow1JE121( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbPObsLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount121 = (short)(nBlankRcdCount121-1) ;
      }
      Gx_mode = sMode121 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A914AlbPObsCon = B914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtalbob1_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtalbob1_level1item", Gridtalbob1_level1itemContainer, subGridtalbob1_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtalbob1_level1itemContainerData", Gridtalbob1_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtalbob1_level1itemContainerData"+"V", Gridtalbob1_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtalbob1_level1itemContainerData"+"V"+"\" value='"+Gridtalbob1_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      e111JE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "O914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A33AlbProEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            }
            else
            {
               A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            }
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                        e111JE2 ();
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
            initAll1JE3( ) ;
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
      disableAttributes1JE3( ) ;
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

   public void confirm_1JE121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_63_idx = 0 ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         readRow1JE121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            getKey1JE121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               if ( RcdFound121 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JE121( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JE121( ) ;
                     closeExtendedTableCursors1JE121( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O914AlbPObsCon = A914AlbPObsCon ;
                     httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPOBSLIN_" + sGXsfl_63_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( nRcdDeleted_121 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JE121( ) ;
                     load1JE121( ) ;
                     beforeValidate1JE121( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JE121( ) ;
                        O914AlbPObsCon = A914AlbPObsCon ;
                        httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JE121( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JE121( ) ;
                           closeExtendedTableCursors1JE121( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O914AlbPObsCon = A914AlbPObsCon ;
                           httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_63_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_63_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N916AlbPObs_"+sGXsfl_63_idx, GXutil.rtrim( A916AlbPObs)) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O914AlbPObsCon = s914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JE0( )
   {
   }

   public void e111JE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1290_", ""), (byte)(99), GXv_char2) ;
      talbob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19lit1", AV19lit1);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      talbob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV18LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      talbob1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18LitFe", AV18LitFe);
      AV20Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbob1_impl.this.AV21EmprCod = GXv_char2[0] ;
      talbob1_impl.this.AV22EmprNom = GXv_char3[0] ;
      talbob1_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprNom", AV22EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm1JE3( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z33AlbProEst = T01JE5_A33AlbProEst[0] ;
            Z914AlbPObsCon = T01JE5_A914AlbPObsCon[0] ;
         }
         else
         {
            Z33AlbProEst = A33AlbProEst ;
            Z914AlbPObsCon = A914AlbPObsCon ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z33AlbProEst = A33AlbProEst ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      /* Using cursor T01JE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JE6_A407EmprNom[0] ;
      n407EmprNom = T01JE6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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

   public void load1JE3( )
   {
      /* Using cursor T01JE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A407EmprNom = T01JE7_A407EmprNom[0] ;
         n407EmprNom = T01JE7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A33AlbProEst = T01JE7_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A914AlbPObsCon = T01JE7_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         zm1JE3( -11) ;
      }
      pr_default.close(5);
      onLoadActions1JE3( ) ;
   }

   public void onLoadActions1JE3( )
   {
   }

   public void checkExtendedTable1JE3( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1JE3( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1JE3( )
   {
      /* Using cursor T01JE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01JE5_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01JE5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JE3( 11) ;
         RcdFound3 = (short)(1) ;
         A33AlbProEst = T01JE5_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A914AlbPObsCon = T01JE5_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         O914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JE3( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1JE3( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1JE3( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1JE3( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T01JE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01JE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JE9_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01JE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JE9_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01JE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01JE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JE10_A30AlbProCod[0] == A30AlbProCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01JE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01JE10_A30AlbProCod[0] == A30AlbProCod ) )
         {
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JE3( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         GX_FocusControl = edtAlbProEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JE3( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               update1JE3( ) ;
               GX_FocusControl = edtAlbProEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               GX_FocusControl = edtAlbProEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JE3( ) ;
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
                  A914AlbPObsCon = O914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  GX_FocusControl = edtAlbProEst_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JE3( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProEst_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbProEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JE3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbProEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JE3( ) ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbProEst_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbProEst_Internalname ;
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
      scanStart1JE3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext1JE3( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbProEst_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JE3( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JE3( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z33AlbProEst != T01JE4_A33AlbProEst[0] ) || ( Z914AlbPObsCon != T01JE4_A914AlbPObsCon[0] ) )
         {
            if ( Z33AlbProEst != T01JE4_A33AlbProEst[0] )
            {
               GXutil.writeLogln("talbob1:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01JE4_A33AlbProEst[0]);
            }
            if ( Z914AlbPObsCon != T01JE4_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("talbob1:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01JE4_A914AlbPObsCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JE3( )
   {
      beforeValidate1JE3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JE3( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JE3( 0) ;
         checkOptimisticConcurrency1JE3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JE3( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JE3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JE11 */
                  pr_default.execute(9, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A33AlbProEst), Byte.valueOf(A914AlbPObsCon), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel1JE3( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JE0( ) ;
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
            load1JE3( ) ;
         }
         endLevel1JE3( ) ;
      }
      closeExtendedTableCursors1JE3( ) ;
   }

   public void update1JE3( )
   {
      beforeValidate1JE3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JE3( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JE3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JE3( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JE3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JE12 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JE3( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JE3( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JE0( ) ;
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
         endLevel1JE3( ) ;
      }
      closeExtendedTableCursors1JE3( ) ;
   }

   public void deferredUpdate1JE3( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JE3( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JE3( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JE3( ) ;
         afterConfirm1JE3( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JE3( ) ;
            if ( AnyError == 0 )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               scanStart1JE121( ) ;
               while ( RcdFound121 != 0 )
               {
                  getByPrimaryKey1JE121( ) ;
                  delete1JE121( ) ;
                  scanNext1JE121( ) ;
                  O914AlbPObsCon = A914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               }
               scanEnd1JE121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JE13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound3 == 0 )
                        {
                           initAll1JE3( ) ;
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
                        resetCaption1JE0( ) ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JE3( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JE3( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01JE14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01JE15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01JE16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01JE17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1JE121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_63_idx = 0 ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         readRow1JE121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            standaloneNotModal1JE121( ) ;
            getKey1JE121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JE121( ) ;
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( ( nRcdDeleted_121 != 0 ) && ( nRcdExists_121 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JE121( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JE121( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_63_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O914AlbPObsCon = A914AlbPObsCon ;
            httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_63_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_63_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N916AlbPObs_"+sGXsfl_63_idx, GXutil.rtrim( A916AlbPObs)) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JE121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      nRcdExists_121 = (short)(0) ;
      nIsMod_121 = (short)(0) ;
      nRcdDeleted_121 = (short)(0) ;
   }

   public void processLevel1JE3( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel1JE121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01JE18 */
      pr_default.execute(16, new Object[] {Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
   }

   public void endLevel1JE3( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1JE3( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbob1");
         if ( AnyError == 0 )
         {
            confirmValues1JE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbob1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JE3( )
   {
      /* Scan By routine */
      /* Using cursor T01JE19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JE3( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
   }

   public void scanEnd1JE3( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1JE3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JE3( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JE3( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JE3( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JE3( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JE3( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JE3( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
   }

   public void zm1JE121( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z916AlbPObs = T01JE3_A916AlbPObs[0] ;
         }
         else
         {
            Z916AlbPObs = A916AlbPObs ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         Z916AlbPObs = A916AlbPObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1JE121( )
   {
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
   }

   public void standaloneModal1JE121( )
   {
      if ( ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      if ( A33AlbProEst == 2 )
      {
         edtAlbPObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      }
      else
      {
         if ( isUpd( )  )
         {
            edtAlbPObs_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
         }
         else
         {
            edtAlbPObs_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
         }
      }
      if ( ( A33AlbProEst == 2 ) && true /* Level */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran Ya Facturado", ""), 1, "ALBPROEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A915AlbPObsLin = A914AlbPObsCon ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      }
      else
      {
         edtAlbPObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      }
   }

   public void load1JE121( )
   {
      /* Using cursor T01JE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A916AlbPObs = T01JE20_A916AlbPObs[0] ;
         zm1JE121( -13) ;
      }
      pr_default.close(18);
      onLoadActions1JE121( ) ;
   }

   public void onLoadActions1JE121( )
   {
   }

   public void checkExtendedTable1JE121( )
   {
      nIsDirty_121 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1JE121( ) ;
   }

   public void closeExtendedTableCursors1JE121( )
   {
   }

   public void enableDisable1JE121( )
   {
   }

   public void getKey1JE121( )
   {
      /* Using cursor T01JE21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound121 = (short)(1) ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1JE121( )
   {
      /* Using cursor T01JE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01JE3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01JE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JE121( 13) ;
         RcdFound121 = (short)(1) ;
         initializeNonKey1JE121( ) ;
         A915AlbPObsLin = T01JE3_A915AlbPObsLin[0] ;
         A916AlbPObs = T01JE3_A916AlbPObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JE121( ) ;
         load1JE121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound121 = (short)(0) ;
         initializeNonKey1JE121( ) ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JE121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JE121( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JE121( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z916AlbPObs, T01JE2_A916AlbPObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z916AlbPObs, T01JE2_A916AlbPObs[0]) != 0 )
            {
               GXutil.writeLogln("talbob1:[seudo value changed for attri]"+"AlbPObs");
               GXutil.writeLogRaw("Old: ",Z916AlbPObs);
               GXutil.writeLogRaw("Current: ",T01JE2_A916AlbPObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JE121( )
   {
      beforeValidate1JE121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JE121( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JE121( 0) ;
         checkOptimisticConcurrency1JE121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JE121( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JE121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JE22 */
                  pr_default.execute(20, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1JE121( ) ;
         }
         endLevel1JE121( ) ;
      }
      closeExtendedTableCursors1JE121( ) ;
   }

   public void update1JE121( )
   {
      beforeValidate1JE121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JE121( ) ;
      }
      if ( ( nIsMod_121 != 0 ) || ( nIsDirty_121 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JE121( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JE121( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JE121( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01JE23 */
                     pr_default.execute(21, new Object[] {A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1JE121( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JE121( ) ;
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
            endLevel1JE121( ) ;
         }
      }
      closeExtendedTableCursors1JE121( ) ;
   }

   public void deferredUpdate1JE121( )
   {
   }

   public void delete1JE121( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JE121( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JE121( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JE121( ) ;
         afterConfirm1JE121( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JE121( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JE24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
      sMode121 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JE121( ) ;
      Gx_mode = sMode121 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JE121( )
   {
      standaloneModal1JE121( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1JE121( )
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

   public void scanStart1JE121( )
   {
      /* Scan By routine */
      /* Using cursor T01JE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01JE25_A915AlbPObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JE121( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01JE25_A915AlbPObsLin[0] ;
      }
   }

   public void scanEnd1JE121( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1JE121( )
   {
      /* After Confirm Rules */
      if ( ( isDlt( )  || isUpd( )  ) && true /* After */ && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1JE121( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JE121( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JE121( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JE121( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JE121( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JE121( )
   {
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtAlbPObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void send_integrity_lvl_hashes1JE121( )
   {
   }

   public void send_integrity_lvl_hashes1JE3( )
   {
   }

   public void subsflControlProps_63121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_63_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_63121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_63_fel_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_63_fel_idx ;
   }

   public void addRow1JE121( )
   {
      nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_63121( ) ;
      sendRow1JE121( ) ;
   }

   public void sendRow1JE121( )
   {
      Gridtalbob1_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtalbob1_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtalbob1_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtalbob1_level1item_Class, "") != 0 )
         {
            subGridtalbob1_level1item_Linesclass = subGridtalbob1_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtalbob1_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtalbob1_level1item_Backstyle = (byte)(0) ;
         subGridtalbob1_level1item_Backcolor = subGridtalbob1_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtalbob1_level1item_Class, "") != 0 )
         {
            subGridtalbob1_level1item_Linesclass = subGridtalbob1_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtalbob1_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtalbob1_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtalbob1_level1item_Class, "") != 0 )
         {
            subGridtalbob1_level1item_Linesclass = subGridtalbob1_level1item_Class+"Odd" ;
         }
         subGridtalbob1_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtalbob1_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtalbob1_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
         {
            subGridtalbob1_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtalbob1_level1item_Class, "") != 0 )
            {
               subGridtalbob1_level1item_Linesclass = subGridtalbob1_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtalbob1_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtalbob1_level1item_Class, "") != 0 )
            {
               subGridtalbob1_level1item_Linesclass = subGridtalbob1_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_63_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_63_idx + "',63)\"" ;
      ROClassString = "Attribute" ;
      Gridtalbob1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A915AlbPObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_63_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_63_idx + "',63)\"" ;
      ROClassString = "Attribute" ;
      Gridtalbob1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObs_Internalname,GXutil.rtrim( A916AlbPObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObs_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtalbob1_level1itemRow);
      send_integrity_lvl_hashes1JE121( ) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z916AlbPObs_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z916AlbPObs));
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_121_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_121_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N916AlbPObs_" + sGXsfl_63_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A916AlbPObs));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSLIN_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBS_"+sGXsfl_63_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtalbob1_level1itemContainer.AddRow(Gridtalbob1_level1itemRow);
   }

   public void readRow1JE121( )
   {
      nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_63121( ) ;
      edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_63_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBPOBSLIN_" + sGXsfl_63_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPObsLin_Internalname ;
         wbErr = true ;
         A915AlbPObsLin = (byte)(0) ;
      }
      else
      {
         A915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A916AlbPObs = httpContext.cgiGet( edtAlbPObs_Internalname) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_63_idx ;
      Z915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z916AlbPObs_" + sGXsfl_63_idx ;
      Z916AlbPObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_63_idx ;
      nRcdDeleted_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_121_" + sGXsfl_63_idx ;
      nRcdExists_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_121_" + sGXsfl_63_idx ;
      nIsMod_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N916AlbPObs_" + sGXsfl_63_idx ;
      N916AlbPObs = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPObs_Enabled = edtAlbPObs_Enabled ;
      defedtAlbPObsLin_Enabled = edtAlbPObsLin_Enabled ;
   }

   public void confirmValues1JE0( )
   {
      nGXsfl_63_idx = 0 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_63121( ) ;
      while ( nGXsfl_63_idx < nRC_GXsfl_63 )
      {
         nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_63121( ) ;
         httpContext.changePostValue( "Z915AlbPObsLin_"+sGXsfl_63_idx, httpContext.cgiGet( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_63_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_63_idx) ;
         httpContext.changePostValue( "Z916AlbPObs_"+sGXsfl_63_idx, httpContext.cgiGet( "ZT_"+"Z916AlbPObs_"+sGXsfl_63_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_63_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbob1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"EmprCod","AlbProCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( O914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nGXsfl_63_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbob1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"EmprCod","AlbProCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBOB1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Observaciones (Solo Agregar)", "") ;
   }

   public void initializeNonKey1JE3( )
   {
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      O914AlbPObsCon = A914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      Z33AlbProEst = (byte)(0) ;
      Z914AlbPObsCon = (byte)(0) ;
   }

   public void initAll1JE3( )
   {
      initializeNonKey1JE3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1JE121( )
   {
      A916AlbPObs = "" ;
      Z916AlbPObs = "" ;
   }

   public void initAll1JE121( )
   {
      A915AlbPObsLin = (byte)(0) ;
      initializeNonKey1JE121( ) ;
   }

   public void standaloneModalInsert1JE121( )
   {
      A914AlbPObsCon = i914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583090", true, true);
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
      httpContext.AddJavascriptSource("talbob1.js", "?20268241583090", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties121( )
   {
      edtAlbPObs_Enabled = defedtAlbPObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtAlbPObsLin_Enabled = defedtAlbPObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_63_Refreshing);
   }

   public void startgridcontrol63( )
   {
      Gridtalbob1_level1itemContainer.AddObjectProperty("GridName", "Gridtalbob1_level1item");
      Gridtalbob1_level1itemContainer.AddObjectProperty("Header", subGridtalbob1_level1item_Header);
      Gridtalbob1_level1itemContainer.AddObjectProperty("DeleteMethod", "none");
      Gridtalbob1_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtalbob1_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtalbob1_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtalbob1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtalbob1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), ".", "")));
      Gridtalbob1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddColumnProperties(Gridtalbob1_level1itemColumn);
      Gridtalbob1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtalbob1_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A916AlbPObs));
      Gridtalbob1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddColumnProperties(Gridtalbob1_level1itemColumn);
      Gridtalbob1_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtalbob1_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtalbob1_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtAlbPObsLin_Internalname = "ALBPOBSLIN" ;
      edtAlbPObs_Internalname = "ALBPOBS" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtalbob1_level1item_Internalname = "GRIDTALBOB1_LEVEL1ITEM" ;
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
      subGridtalbob1_level1item_Allowcollapsing = (byte)(0) ;
      subGridtalbob1_level1item_Allowselection = (byte)(0) ;
      subGridtalbob1_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Observaciones (Solo Agregar)", "") );
      edtAlbPObs_Jsonclick = "" ;
      edtAlbPObsLin_Jsonclick = "" ;
      subGridtalbob1_level1item_Class = "Grid" ;
      subGridtalbob1_level1item_Backcolorstyle = (byte)(0) ;
      edtAlbPObs_Enabled = 1 ;
      edtAlbPObsLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbPObsCon_Enabled = 0 ;
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProEst_Enabled = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
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

   public void gxnrgridtalbob1_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_63121( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JE121( ) ;
         standaloneModal1JE121( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JE121( ) ;
         nGXsfl_63_idx = (int)(nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_63121( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtalbob1_level1itemContainer)) ;
      /* End function gxnrGridtalbob1_level1item_newrow */
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
      /* Using cursor T01JE26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JE26_A407EmprNom[0] ;
      n407EmprNom = T01JE26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtAlbProEst_Internalname ;
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

   public void valid_Albprocod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( O914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z407EmprNom'},{av:'Z33AlbProEst'},{av:'Z914AlbPObsCon'},{av:'O914AlbPObsCon'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBPOBSCON","{handler:'valid_Albpobscon',iparms:[]");
      setEventMetadata("VALID_ALBPOBSCON",",oparms:[]}");
      setEventMetadata("VALID_ALBPOBSLIN","{handler:'valid_Albpobslin',iparms:[]");
      setEventMetadata("VALID_ALBPOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albpobs',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z916AlbPObs = "" ;
      N916AlbPObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtalbob1_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode121 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A916AlbPObs = "" ;
      AV19lit1 = "" ;
      AV16Lit0 = "" ;
      AV18LitFe = "" ;
      GXt_char1 = "" ;
      AV20Station = "" ;
      AV21EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01JE6_A407EmprNom = new String[] {""} ;
      T01JE6_n407EmprNom = new boolean[] {false} ;
      T01JE7_A30AlbProCod = new long[1] ;
      T01JE7_A407EmprNom = new String[] {""} ;
      T01JE7_n407EmprNom = new boolean[] {false} ;
      T01JE7_A33AlbProEst = new byte[1] ;
      T01JE7_A914AlbPObsCon = new byte[1] ;
      T01JE7_A396EmprCod = new String[] {""} ;
      T01JE8_A396EmprCod = new String[] {""} ;
      T01JE8_A30AlbProCod = new long[1] ;
      T01JE5_A30AlbProCod = new long[1] ;
      T01JE5_A33AlbProEst = new byte[1] ;
      T01JE5_A914AlbPObsCon = new byte[1] ;
      T01JE5_A396EmprCod = new String[] {""} ;
      sMode3 = "" ;
      T01JE9_A396EmprCod = new String[] {""} ;
      T01JE9_A30AlbProCod = new long[1] ;
      T01JE10_A396EmprCod = new String[] {""} ;
      T01JE10_A30AlbProCod = new long[1] ;
      T01JE4_A30AlbProCod = new long[1] ;
      T01JE4_A33AlbProEst = new byte[1] ;
      T01JE4_A914AlbPObsCon = new byte[1] ;
      T01JE4_A396EmprCod = new String[] {""} ;
      T01JE14_A396EmprCod = new String[] {""} ;
      T01JE14_A30AlbProCod = new long[1] ;
      T01JE14_A12185DltLinObs = new byte[1] ;
      T01JE15_A396EmprCod = new String[] {""} ;
      T01JE15_A30AlbProCod = new long[1] ;
      T01JE15_A12176DltHdr = new int[1] ;
      T01JE15_A12177DltR = new byte[1] ;
      T01JE15_A12178DltP = new String[] {""} ;
      T01JE16_A396EmprCod = new String[] {""} ;
      T01JE16_A30AlbProCod = new long[1] ;
      T01JE16_A7540Alb_NFisca = new String[] {""} ;
      T01JE17_A396EmprCod = new String[] {""} ;
      T01JE17_A30AlbProCod = new long[1] ;
      T01JE17_A129BarCod = new int[1] ;
      T01JE17_A132BarCodReo = new byte[1] ;
      T01JE17_A130BarCodPar = new String[] {""} ;
      T01JE19_A396EmprCod = new String[] {""} ;
      T01JE19_A30AlbProCod = new long[1] ;
      T01JE20_A30AlbProCod = new long[1] ;
      T01JE20_A915AlbPObsLin = new byte[1] ;
      T01JE20_A916AlbPObs = new String[] {""} ;
      T01JE20_A396EmprCod = new String[] {""} ;
      T01JE21_A396EmprCod = new String[] {""} ;
      T01JE21_A30AlbProCod = new long[1] ;
      T01JE21_A915AlbPObsLin = new byte[1] ;
      T01JE3_A30AlbProCod = new long[1] ;
      T01JE3_A915AlbPObsLin = new byte[1] ;
      T01JE3_A916AlbPObs = new String[] {""} ;
      T01JE3_A396EmprCod = new String[] {""} ;
      T01JE2_A30AlbProCod = new long[1] ;
      T01JE2_A915AlbPObsLin = new byte[1] ;
      T01JE2_A916AlbPObs = new String[] {""} ;
      T01JE2_A396EmprCod = new String[] {""} ;
      T01JE25_A396EmprCod = new String[] {""} ;
      T01JE25_A30AlbProCod = new long[1] ;
      T01JE25_A915AlbPObsLin = new byte[1] ;
      Gridtalbob1_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtalbob1_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtalbob1_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T01JE26_A407EmprNom = new String[] {""} ;
      T01JE26_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbob1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbob1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbob1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbob1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbob1__default(),
         new Object[] {
             new Object[] {
            T01JE2_A30AlbProCod, T01JE2_A915AlbPObsLin, T01JE2_A916AlbPObs, T01JE2_A396EmprCod
            }
            , new Object[] {
            T01JE3_A30AlbProCod, T01JE3_A915AlbPObsLin, T01JE3_A916AlbPObs, T01JE3_A396EmprCod
            }
            , new Object[] {
            T01JE4_A30AlbProCod, T01JE4_A33AlbProEst, T01JE4_A914AlbPObsCon, T01JE4_A396EmprCod
            }
            , new Object[] {
            T01JE5_A30AlbProCod, T01JE5_A33AlbProEst, T01JE5_A914AlbPObsCon, T01JE5_A396EmprCod
            }
            , new Object[] {
            T01JE6_A407EmprNom, T01JE6_n407EmprNom
            }
            , new Object[] {
            T01JE7_A30AlbProCod, T01JE7_A407EmprNom, T01JE7_n407EmprNom, T01JE7_A33AlbProEst, T01JE7_A914AlbPObsCon, T01JE7_A396EmprCod
            }
            , new Object[] {
            T01JE8_A396EmprCod, T01JE8_A30AlbProCod
            }
            , new Object[] {
            T01JE9_A396EmprCod, T01JE9_A30AlbProCod
            }
            , new Object[] {
            T01JE10_A396EmprCod, T01JE10_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JE14_A396EmprCod, T01JE14_A30AlbProCod, T01JE14_A12185DltLinObs
            }
            , new Object[] {
            T01JE15_A396EmprCod, T01JE15_A30AlbProCod, T01JE15_A12176DltHdr, T01JE15_A12177DltR, T01JE15_A12178DltP
            }
            , new Object[] {
            T01JE16_A396EmprCod, T01JE16_A30AlbProCod, T01JE16_A7540Alb_NFisca
            }
            , new Object[] {
            T01JE17_A396EmprCod, T01JE17_A30AlbProCod, T01JE17_A129BarCod, T01JE17_A132BarCodReo, T01JE17_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01JE19_A396EmprCod, T01JE19_A30AlbProCod
            }
            , new Object[] {
            T01JE20_A30AlbProCod, T01JE20_A915AlbPObsLin, T01JE20_A916AlbPObs, T01JE20_A396EmprCod
            }
            , new Object[] {
            T01JE21_A396EmprCod, T01JE21_A30AlbProCod, T01JE21_A915AlbPObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JE25_A396EmprCod, T01JE25_A30AlbProCod, T01JE25_A915AlbPObsLin
            }
            , new Object[] {
            T01JE26_A407EmprNom, T01JE26_n407EmprNom
            }
         }
      );
      Z30AlbProCod = 0 ;
      A30AlbProCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z33AlbProEst ;
   private byte Z914AlbPObsCon ;
   private byte O914AlbPObsCon ;
   private byte Z915AlbPObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A914AlbPObsCon ;
   private byte Gx_BScreen ;
   private byte A33AlbProEst ;
   private byte B914AlbPObsCon ;
   private byte s914AlbPObsCon ;
   private byte A915AlbPObsLin ;
   private byte subGridtalbob1_level1item_Backcolorstyle ;
   private byte subGridtalbob1_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i914AlbPObsCon ;
   private byte subGridtalbob1_level1item_Allowselection ;
   private byte subGridtalbob1_level1item_Allowhovering ;
   private byte subGridtalbob1_level1item_Allowcollapsing ;
   private byte subGridtalbob1_level1item_Collapsed ;
   private byte ZZ33AlbProEst ;
   private byte ZZ914AlbPObsCon ;
   private byte ZO914AlbPObsCon ;
   private short nRcdDeleted_121 ;
   private short nRcdExists_121 ;
   private short nIsMod_121 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount121 ;
   private short RcdFound121 ;
   private short nBlankRcdUsr121 ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short nIsDirty_121 ;
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
   private int edtAlbProCod_Enabled ;
   private int edtAlbProEst_Enabled ;
   private int edtAlbPObsCon_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtAlbPObsLin_Enabled ;
   private int edtAlbPObs_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtalbob1_level1item_Backcolor ;
   private int subGridtalbob1_level1item_Allbackcolor ;
   private int defedtAlbPObs_Enabled ;
   private int defedtAlbPObsLin_Enabled ;
   private int idxLst ;
   private int subGridtalbob1_level1item_Selectedindex ;
   private int subGridtalbob1_level1item_Selectioncolor ;
   private int subGridtalbob1_level1item_Hoveringcolor ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRIDTALBOB1_LEVEL1ITEM_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z916AlbPObs ;
   private String N916AlbPObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProEst_Internalname ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProEst_Jsonclick ;
   private String edtAlbPObsCon_Internalname ;
   private String edtAlbPObsCon_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode121 ;
   private String edtAlbPObsLin_Internalname ;
   private String edtAlbPObs_Internalname ;
   private String sStyleString ;
   private String subGridtalbob1_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A916AlbPObs ;
   private String AV19lit1 ;
   private String AV16Lit0 ;
   private String AV18LitFe ;
   private String GXt_char1 ;
   private String AV20Station ;
   private String AV21EmprCod ;
   private String GXv_char2[] ;
   private String AV22EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode3 ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String subGridtalbob1_level1item_Class ;
   private String subGridtalbob1_level1item_Linesclass ;
   private String ROClassString ;
   private String edtAlbPObsLin_Jsonclick ;
   private String edtAlbPObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtalbob1_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridtalbob1_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtalbob1_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtalbob1_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01JE6_A407EmprNom ;
   private boolean[] T01JE6_n407EmprNom ;
   private long[] T01JE7_A30AlbProCod ;
   private String[] T01JE7_A407EmprNom ;
   private boolean[] T01JE7_n407EmprNom ;
   private byte[] T01JE7_A33AlbProEst ;
   private byte[] T01JE7_A914AlbPObsCon ;
   private String[] T01JE7_A396EmprCod ;
   private String[] T01JE8_A396EmprCod ;
   private long[] T01JE8_A30AlbProCod ;
   private long[] T01JE5_A30AlbProCod ;
   private byte[] T01JE5_A33AlbProEst ;
   private byte[] T01JE5_A914AlbPObsCon ;
   private String[] T01JE5_A396EmprCod ;
   private String[] T01JE9_A396EmprCod ;
   private long[] T01JE9_A30AlbProCod ;
   private String[] T01JE10_A396EmprCod ;
   private long[] T01JE10_A30AlbProCod ;
   private long[] T01JE4_A30AlbProCod ;
   private byte[] T01JE4_A33AlbProEst ;
   private byte[] T01JE4_A914AlbPObsCon ;
   private String[] T01JE4_A396EmprCod ;
   private String[] T01JE14_A396EmprCod ;
   private long[] T01JE14_A30AlbProCod ;
   private byte[] T01JE14_A12185DltLinObs ;
   private String[] T01JE15_A396EmprCod ;
   private long[] T01JE15_A30AlbProCod ;
   private int[] T01JE15_A12176DltHdr ;
   private byte[] T01JE15_A12177DltR ;
   private String[] T01JE15_A12178DltP ;
   private String[] T01JE16_A396EmprCod ;
   private long[] T01JE16_A30AlbProCod ;
   private String[] T01JE16_A7540Alb_NFisca ;
   private String[] T01JE17_A396EmprCod ;
   private long[] T01JE17_A30AlbProCod ;
   private int[] T01JE17_A129BarCod ;
   private byte[] T01JE17_A132BarCodReo ;
   private String[] T01JE17_A130BarCodPar ;
   private String[] T01JE19_A396EmprCod ;
   private long[] T01JE19_A30AlbProCod ;
   private long[] T01JE20_A30AlbProCod ;
   private byte[] T01JE20_A915AlbPObsLin ;
   private String[] T01JE20_A916AlbPObs ;
   private String[] T01JE20_A396EmprCod ;
   private String[] T01JE21_A396EmprCod ;
   private long[] T01JE21_A30AlbProCod ;
   private byte[] T01JE21_A915AlbPObsLin ;
   private long[] T01JE3_A30AlbProCod ;
   private byte[] T01JE3_A915AlbPObsLin ;
   private String[] T01JE3_A916AlbPObs ;
   private String[] T01JE3_A396EmprCod ;
   private long[] T01JE2_A30AlbProCod ;
   private byte[] T01JE2_A915AlbPObsLin ;
   private String[] T01JE2_A916AlbPObs ;
   private String[] T01JE2_A396EmprCod ;
   private String[] T01JE25_A396EmprCod ;
   private long[] T01JE25_A30AlbProCod ;
   private byte[] T01JE25_A915AlbPObsLin ;
   private String[] T01JE26_A407EmprNom ;
   private boolean[] T01JE26_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbob1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbob1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbob1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbob1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbob1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JE2", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JE3", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JE4", "SELECT AlbProCod, AlbProEst, AlbPObsCon, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProEst, AlbPObsCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE5", "SELECT AlbProCod, AlbProEst, AlbPObsCon, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE7", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbProCod, T2.EmprNom, TM1.AlbProEst, TM1.AlbPObsCon, TM1.EmprCod FROM (TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JE11", "INSERT INTO TXPCALPRD(AlbProCod, AlbProEst, AlbPObsCon, EmprCod, AlbProPri, AlbProfch, GuiRemCli, GuiRemDom, EmprGuiRem, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbSec, AlbDivTCod, AlbDivCod, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbCliDes, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbEnvFtp, AlbUsu, AlbOComp, AlbMarCo, AlbLic, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01JE12", "UPDATE TXPCALPRD SET AlbProEst=?, AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01JE13", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01JE14", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE15", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE16", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JE18", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01JE19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JE20", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? and AlbPObsLin = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JE21", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JE22", "INSERT INTO TXPOBSALB(AlbProCod, AlbPObsLin, AlbPObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01JE23", "UPDATE TXPOBSALB SET AlbPObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01JE24", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new ForEachCursor("T01JE25", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JE26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 50);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

