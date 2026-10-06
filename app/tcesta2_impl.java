package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcesta2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtcesta2_level1item") == 0 )
      {
         gxnrgridtcesta2_level1item_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtcesta2_level2item") == 0 )
      {
         gxnrgridtcesta2_level2item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO ESTAMPACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtcesta2_level1item_newrow_invoke( )
   {
      nRC_GXsfl_78 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_78"))) ;
      nGXsfl_78_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_78_idx"))) ;
      sGXsfl_78_idx = httpContext.GetPar( "sGXsfl_78_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtcesta2_level1item_newrow( ) ;
      /* End function gxnrGridtcesta2_level1item_newrow_invoke */
   }

   public void gxnrgridtcesta2_level2item_newrow_invoke( )
   {
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtcesta2_level2item_newrow( ) ;
      /* End function gxnrGridtcesta2_level2item_newrow_invoke */
   }

   public tcesta2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcesta2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcesta2_impl.class ));
   }

   public tcesta2_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkArtDefEst = UIFactory.getCheckbox(this);
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
      A4115ArtDefEst = ((GXutil.strcmp(GXutil.rtrim( A4115ArtDefEst), "S")==0) ? "S" : "N") ;
      n4115ArtDefEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "PRECIO ESTAMPACION", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTA2.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCESTA2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTA2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtPreEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtPreEst_Internalname, httpContext.getMessage( "Precio Estampacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPreEst_Internalname, GXutil.ltrim( localUtil.ntoc( A4114ArtPreEst, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPreEst_Enabled!=0) ? localUtil.format( A4114ArtPreEst, "ZZZZZZ9.99") : localUtil.format( A4114ArtPreEst, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPreEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtArtPreEst_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkArtDefEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkArtDefEst.getInternalname(), httpContext.getMessage( "Precio Definitivo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkArtDefEst.getInternalname(), A4115ArtDefEst, "", httpContext.getMessage( "Precio Definitivo", ""), 1, chkArtDefEst.getEnabled(), "S", httpContext.getMessage( "Definitivo", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(69, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,69);\"");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtcesta2_level1item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel2table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel2_Internalname, httpContext.getMessage( "Level2", ""), "", "", lblTitlelevel2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtcesta2_level2item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtcesta2_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol78( ) ;
      nGXsfl_78_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1570 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1570 = (short)(1) ;
            scanStart1FH1570( ) ;
            while ( RcdFound1570 != 0 )
            {
               init_level_properties1570( ) ;
               getByPrimaryKey1FH1570( ) ;
               addRow1FH1570( ) ;
               scanNext1FH1570( ) ;
            }
            scanEnd1FH1570( ) ;
            nBlankRcdCount1570 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FH1570( ) ;
         standaloneModal1FH1570( ) ;
         sMode1570 = Gx_mode ;
         while ( nGXsfl_78_idx < nRC_GXsfl_78 )
         {
            bGXsfl_78_Refreshing = true ;
            readRow1FH1570( ) ;
            edtEstNomCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTNOMCOL_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtEstPreKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTPREKG_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstPreKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreKg_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtEstPreDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTPREDEF_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstPreDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreDef_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            if ( ( nRcdExists_1570 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FH1570( ) ;
            }
            sendRow1FH1570( ) ;
            bGXsfl_78_Refreshing = false ;
         }
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1570 = (short)(5) ;
         nRcdExists_1570 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FH1570( ) ;
            while ( RcdFound1570 != 0 )
            {
               sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_781570( ) ;
               init_level_properties1570( ) ;
               standaloneNotModal1FH1570( ) ;
               getByPrimaryKey1FH1570( ) ;
               standaloneModal1FH1570( ) ;
               addRow1FH1570( ) ;
               scanNext1FH1570( ) ;
            }
            scanEnd1FH1570( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1570 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_781570( ) ;
      initAll1FH1570( ) ;
      init_level_properties1570( ) ;
      nRcdExists_1570 = (short)(0) ;
      nIsMod_1570 = (short)(0) ;
      nRcdDeleted_1570 = (short)(0) ;
      nBlankRcdCount1570 = (short)(nBlankRcdUsr1570+nBlankRcdCount1570) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1570 > 0 )
      {
         standaloneNotModal1FH1570( ) ;
         standaloneModal1FH1570( ) ;
         addRow1FH1570( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstNomCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1570 = (short)(nBlankRcdCount1570-1) ;
      }
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtcesta2_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtcesta2_level1item", Gridtcesta2_level1itemContainer, subGridtcesta2_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcesta2_level1itemContainerData", Gridtcesta2_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcesta2_level1itemContainerData"+"V", Gridtcesta2_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtcesta2_level1itemContainerData"+"V"+"\" value='"+Gridtcesta2_level1itemContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridtcesta2_level2item( )
   {
      /*  Grid Control  */
      startgridcontrol90( ) ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1571 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1571 = (short)(1) ;
            scanStart1FH1571( ) ;
            while ( RcdFound1571 != 0 )
            {
               init_level_properties1571( ) ;
               getByPrimaryKey1FH1571( ) ;
               addRow1FH1571( ) ;
               scanNext1FH1571( ) ;
            }
            scanEnd1FH1571( ) ;
            nBlankRcdCount1571 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FH1571( ) ;
         standaloneModal1FH1571( ) ;
         sMode1571 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRow1FH1571( ) ;
            edtestreclim_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTRECLIM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtestreclim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestreclim_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtestrecpor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTRECPOR_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtestrecpor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestrecpor_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_1571 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FH1571( ) ;
            }
            sendRow1FH1571( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode1571 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1571 = (short)(5) ;
         nRcdExists_1571 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FH1571( ) ;
            while ( RcdFound1571 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_901571( ) ;
               init_level_properties1571( ) ;
               standaloneNotModal1FH1571( ) ;
               getByPrimaryKey1FH1571( ) ;
               standaloneModal1FH1571( ) ;
               addRow1FH1571( ) ;
               scanNext1FH1571( ) ;
            }
            scanEnd1FH1571( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1571 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_901571( ) ;
      initAll1FH1571( ) ;
      init_level_properties1571( ) ;
      nRcdExists_1571 = (short)(0) ;
      nIsMod_1571 = (short)(0) ;
      nRcdDeleted_1571 = (short)(0) ;
      nBlankRcdCount1571 = (short)(nBlankRcdUsr1571+nBlankRcdCount1571) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1571 > 0 )
      {
         standaloneNotModal1FH1571( ) ;
         standaloneModal1FH1571( ) ;
         addRow1FH1571( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtestreclim_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1571 = (short)(nBlankRcdCount1571-1) ;
      }
      Gx_mode = sMode1571 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtcesta2_level2itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtcesta2_level2item", Gridtcesta2_level2itemContainer, subGridtcesta2_level2item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcesta2_level2itemContainerData", Gridtcesta2_level2itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtcesta2_level2itemContainerData"+"V", Gridtcesta2_level2itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtcesta2_level2itemContainerData"+"V"+"\" value='"+Gridtcesta2_level2itemContainer.GridValuesHidden()+"'/>") ;
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
      e111FH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
            Z4114ArtPreEst = localUtil.ctond( httpContext.cgiGet( "Z4114ArtPreEst")) ;
            Z4115ArtDefEst = httpContext.cgiGet( "Z4115ArtDefEst") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_78 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_78"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtPreEst_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtPreEst_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPREEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtArtPreEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4114ArtPreEst = DecimalUtil.ZERO ;
               n4114ArtPreEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrimstr( A4114ArtPreEst, 10, 2));
            }
            else
            {
               A4114ArtPreEst = localUtil.ctond( httpContext.cgiGet( edtArtPreEst_Internalname)) ;
               n4114ArtPreEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrimstr( A4114ArtPreEst, 10, 2));
            }
            A4115ArtDefEst = ((GXutil.strcmp(httpContext.cgiGet( chkArtDefEst.getInternalname()), "S")==0) ? "S" : "N") ;
            n4115ArtDefEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                        e111FH2 ();
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
            initAll1FH10( ) ;
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
      disableAttributes1FH10( ) ;
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

   public void confirm_1FH1571( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1FH1571( ) ;
         if ( ( nRcdExists_1571 != 0 ) || ( nIsMod_1571 != 0 ) )
         {
            getKey1FH1571( ) ;
            if ( ( nRcdExists_1571 == 0 ) && ( nRcdDeleted_1571 == 0 ) )
            {
               if ( RcdFound1571 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FH1571( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FH1571( ) ;
                     closeExtendedTableCursors1FH1571( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESTRECLIM_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtestreclim_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1571 != 0 )
               {
                  if ( nRcdDeleted_1571 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FH1571( ) ;
                     load1FH1571( ) ;
                     beforeValidate1FH1571( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FH1571( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1571 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FH1571( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FH1571( ) ;
                           closeExtendedTableCursors1FH1571( ) ;
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
                  if ( nRcdDeleted_1571 == 0 )
                  {
                     GXCCtl = "ESTRECLIM_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtestreclim_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtestreclim_Internalname, GXutil.ltrim( localUtil.ntoc( A4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtestrecpor_Internalname, GXutil.ltrim( localUtil.ntoc( A4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4116estreclim_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4117estrecpor_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1571 != 0 )
         {
            httpContext.changePostValue( "ESTRECLIM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestreclim_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTRECPOR_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestrecpor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1FH1570( )
   {
      nGXsfl_78_idx = 0 ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         readRow1FH1570( ) ;
         if ( ( nRcdExists_1570 != 0 ) || ( nIsMod_1570 != 0 ) )
         {
            getKey1FH1570( ) ;
            if ( ( nRcdExists_1570 == 0 ) && ( nRcdDeleted_1570 == 0 ) )
            {
               if ( RcdFound1570 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FH1570( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FH1570( ) ;
                     closeExtendedTableCursors1FH1570( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESTNOMCOL_" + sGXsfl_78_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstNomCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1570 != 0 )
               {
                  if ( nRcdDeleted_1570 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FH1570( ) ;
                     load1FH1570( ) ;
                     beforeValidate1FH1570( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FH1570( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1570 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FH1570( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FH1570( ) ;
                           closeExtendedTableCursors1FH1570( ) ;
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
                  if ( nRcdDeleted_1570 == 0 )
                  {
                     GXCCtl = "ESTNOMCOL_" + sGXsfl_78_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNomCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol)) ;
         httpContext.changePostValue( edtEstPreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstPreDef_Internalname, GXutil.rtrim( A4071EstPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z4061EstNomCol_"+sGXsfl_78_idx, GXutil.rtrim( Z4061EstNomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z4070EstPreKg_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4071EstPreDef_"+sGXsfl_78_idx, GXutil.rtrim( Z4071EstPreDef)) ;
         httpContext.changePostValue( "nRcdDeleted_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1570 != 0 )
         {
            httpContext.changePostValue( "ESTNOMCOL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstNomCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTPREKG_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTPREDEF_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FH0( )
   {
   }

   public void e111FH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcesta2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tcesta2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "PRECIOS ESTAMPACION", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      AV29station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29station", AV29station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29station, GXv_char2, GXv_char3, GXv_char4) ;
      tcesta2_impl.this.A396EmprCod = GXv_char2[0] ;
      tcesta2_impl.this.A407EmprNom = GXv_char3[0] ;
      tcesta2_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FH10( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T01FH7_A69ArtDsc[0] ;
            Z4114ArtPreEst = T01FH7_A4114ArtPreEst[0] ;
            Z4115ArtDefEst = T01FH7_A4115ArtDefEst[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
            Z4114ArtPreEst = A4114ArtPreEst ;
            Z4115ArtDefEst = A4115ArtDefEst ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z4114ArtPreEst = A4114ArtPreEst ;
         Z4115ArtDefEst = A4115ArtDefEst ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01FH8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
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

   public void load1FH10( )
   {
      /* Using cursor T01FH10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A279CliNom = T01FH10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01FH10_A69ArtDsc[0] ;
         n69ArtDsc = T01FH10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A4114ArtPreEst = T01FH10_A4114ArtPreEst[0] ;
         n4114ArtPreEst = T01FH10_n4114ArtPreEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrimstr( A4114ArtPreEst, 10, 2));
         A4115ArtDefEst = T01FH10_A4115ArtDefEst[0] ;
         n4115ArtDefEst = T01FH10_n4115ArtDefEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
         zm1FH10( -3) ;
      }
      pr_default.close(8);
      onLoadActions1FH10( ) ;
   }

   public void onLoadActions1FH10( )
   {
   }

   public void checkExtendedTable1FH10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FH9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FH9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      if ( ! ( ( GXutil.strcmp(A4115ArtDefEst, "S") == 0 ) || ( GXutil.strcmp(A4115ArtDefEst, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Precio Definitivo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTDEFEST");
         AnyError = (short)(1) ;
         GX_FocusControl = chkArtDefEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FH10( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FH11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FH11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1FH10( )
   {
      /* Using cursor T01FH12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FH7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01FH7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FH10( 3) ;
         RcdFound10 = (short)(1) ;
         A65ArtCod = T01FH7_A65ArtCod[0] ;
         n65ArtCod = T01FH7_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = T01FH7_A69ArtDsc[0] ;
         n69ArtDsc = T01FH7_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A4114ArtPreEst = T01FH7_A4114ArtPreEst[0] ;
         n4114ArtPreEst = T01FH7_n4114ArtPreEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrimstr( A4114ArtPreEst, 10, 2));
         A4115ArtDefEst = T01FH7_A4115ArtDefEst[0] ;
         n4115ArtDefEst = T01FH7_n4115ArtDefEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
         A252CliCod = T01FH7_A252CliCod[0] ;
         n252CliCod = T01FH7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FH10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey1FH10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey1FH10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1FH10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T01FH13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01FH13_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01FH13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FH13_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T01FH13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01FH13_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01FH13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FH13_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T01FH13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A65ArtCod = T01FH13_A65ArtCod[0] ;
            n65ArtCod = T01FH13_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A252CliCod = T01FH13_A252CliCod[0] ;
            n252CliCod = T01FH13_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T01FH14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01FH14_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01FH14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FH14_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T01FH14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01FH14_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01FH14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01FH14_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T01FH14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A65ArtCod = T01FH14_A65ArtCod[0] ;
            n65ArtCod = T01FH14_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A252CliCod = T01FH14_A252CliCod[0] ;
            n252CliCod = T01FH14_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FH10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FH10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FH10( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FH10( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FH10( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FH10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FH10( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      scanStart1FH10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext1FH10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FH10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FH10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FH6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z69ArtDsc, T01FH6_A69ArtDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4114ArtPreEst, T01FH6_A4114ArtPreEst[0]) != 0 ) || ( GXutil.strcmp(Z4115ArtDefEst, T01FH6_A4115ArtDefEst[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T01FH6_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T01FH6_A69ArtDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4114ArtPreEst, T01FH6_A4114ArtPreEst[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"ArtPreEst");
               GXutil.writeLogRaw("Old: ",Z4114ArtPreEst);
               GXutil.writeLogRaw("Current: ",T01FH6_A4114ArtPreEst[0]);
            }
            if ( GXutil.strcmp(Z4115ArtDefEst, T01FH6_A4115ArtDefEst[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"ArtDefEst");
               GXutil.writeLogRaw("Old: ",Z4115ArtDefEst);
               GXutil.writeLogRaw("Current: ",T01FH6_A4115ArtDefEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FH10( )
   {
      beforeValidate1FH10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FH10( 0) ;
         checkOptimisticConcurrency1FH10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FH10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FH10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FH15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n4114ArtPreEst), A4114ArtPreEst, Boolean.valueOf(n4115ArtDefEst), A4115ArtDefEst, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1FH10( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FH0( ) ;
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
            load1FH10( ) ;
         }
         endLevel1FH10( ) ;
      }
      closeExtendedTableCursors1FH10( ) ;
   }

   public void update1FH10( )
   {
      beforeValidate1FH10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FH10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FH10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FH10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FH16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n4114ArtPreEst), A4114ArtPreEst, Boolean.valueOf(n4115ArtDefEst), A4115ArtDefEst, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FH10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                     tcesta2_impl.this.A396EmprCod = GXv_char4[0] ;
                     tcesta2_impl.this.A252CliCod = GXv_int5[0] ;
                     tcesta2_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FH10( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FH0( ) ;
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
         endLevel1FH10( ) ;
      }
      closeExtendedTableCursors1FH10( ) ;
   }

   public void deferredUpdate1FH10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FH10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FH10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FH10( ) ;
         afterConfirm1FH10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FH10( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FH1571( ) ;
               while ( RcdFound1571 != 0 )
               {
                  getByPrimaryKey1FH1571( ) ;
                  delete1FH1571( ) ;
                  scanNext1FH1571( ) ;
               }
               scanEnd1FH1571( ) ;
               scanStart1FH1570( ) ;
               while ( RcdFound1570 != 0 )
               {
                  getByPrimaryKey1FH1570( ) ;
                  delete1FH1570( ) ;
                  scanNext1FH1570( ) ;
               }
               scanEnd1FH1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FH17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound10 == 0 )
                        {
                           initAll1FH10( ) ;
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
                        resetCaption1FH0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FH10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FH10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FH18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01FH18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FH19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01FH20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01FH21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01FH22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01FH23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01FH24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01FH25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Observaciones formula", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01FH26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01FH27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01FH28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01FH29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01FH30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01FH31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01FH32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01FH33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01FH34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01FH35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01FH36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01FH37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01FH38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01FH39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01FH40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01FH41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01FH42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01FH43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01FH44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01FH45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01FH46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01FH47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01FH48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01FH49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01FH50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01FH51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01FH52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01FH53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01FH54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01FH55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01FH56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01FH57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01FH58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01FH59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01FH60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01FH61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
      }
   }

   public void processNestedLevel1FH1570( )
   {
      nGXsfl_78_idx = 0 ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         readRow1FH1570( ) ;
         if ( ( nRcdExists_1570 != 0 ) || ( nIsMod_1570 != 0 ) )
         {
            standaloneNotModal1FH1570( ) ;
            getKey1FH1570( ) ;
            if ( ( nRcdExists_1570 == 0 ) && ( nRcdDeleted_1570 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FH1570( ) ;
            }
            else
            {
               if ( RcdFound1570 != 0 )
               {
                  if ( ( nRcdDeleted_1570 != 0 ) && ( nRcdExists_1570 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FH1570( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1570 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FH1570( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1570 == 0 )
                  {
                     GXCCtl = "ESTNOMCOL_" + sGXsfl_78_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNomCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol)) ;
         httpContext.changePostValue( edtEstPreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstPreDef_Internalname, GXutil.rtrim( A4071EstPreDef)) ;
         httpContext.changePostValue( "ZT_"+"Z4061EstNomCol_"+sGXsfl_78_idx, GXutil.rtrim( Z4061EstNomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z4070EstPreKg_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4071EstPreDef_"+sGXsfl_78_idx, GXutil.rtrim( Z4071EstPreDef)) ;
         httpContext.changePostValue( "nRcdDeleted_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1570_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1570 != 0 )
         {
            httpContext.changePostValue( "ESTNOMCOL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstNomCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTPREKG_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTPREDEF_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FH1570( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1570 = (short)(0) ;
      nIsMod_1570 = (short)(0) ;
      nRcdDeleted_1570 = (short)(0) ;
   }

   public void processNestedLevel1FH1571( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1FH1571( ) ;
         if ( ( nRcdExists_1571 != 0 ) || ( nIsMod_1571 != 0 ) )
         {
            standaloneNotModal1FH1571( ) ;
            getKey1FH1571( ) ;
            if ( ( nRcdExists_1571 == 0 ) && ( nRcdDeleted_1571 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FH1571( ) ;
            }
            else
            {
               if ( RcdFound1571 != 0 )
               {
                  if ( ( nRcdDeleted_1571 != 0 ) && ( nRcdExists_1571 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FH1571( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1571 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FH1571( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1571 == 0 )
                  {
                     GXCCtl = "ESTRECLIM_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtestreclim_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtestreclim_Internalname, GXutil.ltrim( localUtil.ntoc( A4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtestrecpor_Internalname, GXutil.ltrim( localUtil.ntoc( A4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4116estreclim_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4117estrecpor_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1571_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1571 != 0 )
         {
            httpContext.changePostValue( "ESTRECLIM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestreclim_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTRECPOR_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestrecpor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FH1571( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1571 = (short)(0) ;
      nIsMod_1571 = (short)(0) ;
      nRcdDeleted_1571 = (short)(0) ;
   }

   public void processLevel1FH10( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel1FH1570( ) ;
      processNestedLevel1FH1571( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FH10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FH10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcesta2");
         if ( AnyError == 0 )
         {
            confirmValues1FH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcesta2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FH10( )
   {
      /* Scan By routine */
      /* Using cursor T01FH62 */
      pr_default.execute(60, new Object[] {A396EmprCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T01FH62_A252CliCod[0] ;
         n252CliCod = T01FH62_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FH62_A65ArtCod[0] ;
         n65ArtCod = T01FH62_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FH10( )
   {
      /* Scan next routine */
      pr_default.readNext(60);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(60) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T01FH62_A252CliCod[0] ;
         n252CliCod = T01FH62_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01FH62_A65ArtCod[0] ;
         n65ArtCod = T01FH62_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd1FH10( )
   {
      pr_default.close(60);
   }

   public void afterConfirm1FH10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FH10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FH10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FH10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FH10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FH10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FH10( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtArtPreEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPreEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPreEst_Enabled), 5, 0), true);
      chkArtDefEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkArtDefEst.getInternalname(), "Enabled", GXutil.ltrimstr( chkArtDefEst.getEnabled(), 5, 0), true);
   }

   public void zm1FH1570( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4070EstPreKg = T01FH5_A4070EstPreKg[0] ;
            Z4071EstPreDef = T01FH5_A4071EstPreDef[0] ;
         }
         else
         {
            Z4070EstPreKg = A4070EstPreKg ;
            Z4071EstPreDef = A4071EstPreDef ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4070EstPreKg = A4070EstPreKg ;
         Z4071EstPreDef = A4071EstPreDef ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FH1570( )
   {
   }

   public void standaloneModal1FH1570( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEstNomCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      }
      else
      {
         edtEstNomCol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      }
   }

   public void load1FH1570( )
   {
      /* Using cursor T01FH63 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4070EstPreKg = T01FH63_A4070EstPreKg[0] ;
         n4070EstPreKg = T01FH63_n4070EstPreKg[0] ;
         A4071EstPreDef = T01FH63_A4071EstPreDef[0] ;
         n4071EstPreDef = T01FH63_n4071EstPreDef[0] ;
         zm1FH1570( -6) ;
      }
      pr_default.close(61);
      onLoadActions1FH1570( ) ;
   }

   public void onLoadActions1FH1570( )
   {
   }

   public void checkExtendedTable1FH1570( )
   {
      nIsDirty_1570 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FH1570( ) ;
      if ( ! ( ( GXutil.strcmp(A4071EstPreDef, "S") == 0 ) || ( GXutil.strcmp(A4071EstPreDef, "N") == 0 ) ) )
      {
         GXCCtl = "ESTPREDEF_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Definitivo (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstPreDef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FH1570( )
   {
   }

   public void enableDisable1FH1570( )
   {
   }

   public void getKey1FH1570( )
   {
      /* Using cursor T01FH64 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
      else
      {
         RcdFound1570 = (short)(0) ;
      }
      pr_default.close(62);
   }

   public void getByPrimaryKey1FH1570( )
   {
      /* Using cursor T01FH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FH5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FH1570( 6) ;
         RcdFound1570 = (short)(1) ;
         initializeNonKey1FH1570( ) ;
         A4061EstNomCol = T01FH5_A4061EstNomCol[0] ;
         A4070EstPreKg = T01FH5_A4070EstPreKg[0] ;
         n4070EstPreKg = T01FH5_n4070EstPreKg[0] ;
         A4071EstPreDef = T01FH5_A4071EstPreDef[0] ;
         n4071EstPreDef = T01FH5_n4071EstPreDef[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FH1570( ) ;
         load1FH1570( ) ;
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1570 = (short)(0) ;
         initializeNonKey1FH1570( ) ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FH1570( ) ;
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FH1570( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1FH1570( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z4070EstPreKg, T01FH4_A4070EstPreKg[0]) != 0 ) || ( GXutil.strcmp(Z4071EstPreDef, T01FH4_A4071EstPreDef[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4070EstPreKg, T01FH4_A4070EstPreKg[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"EstPreKg");
               GXutil.writeLogRaw("Old: ",Z4070EstPreKg);
               GXutil.writeLogRaw("Current: ",T01FH4_A4070EstPreKg[0]);
            }
            if ( GXutil.strcmp(Z4071EstPreDef, T01FH4_A4071EstPreDef[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"EstPreDef");
               GXutil.writeLogRaw("Old: ",Z4071EstPreDef);
               GXutil.writeLogRaw("Current: ",T01FH4_A4071EstPreDef[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESTAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FH1570( )
   {
      beforeValidate1FH1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH1570( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FH1570( 0) ;
         checkOptimisticConcurrency1FH1570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FH1570( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FH1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FH65 */
                  pr_default.execute(63, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol, Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( (pr_default.getStatus(63) == 1) )
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
            load1FH1570( ) ;
         }
         endLevel1FH1570( ) ;
      }
      closeExtendedTableCursors1FH1570( ) ;
   }

   public void update1FH1570( )
   {
      beforeValidate1FH1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH1570( ) ;
      }
      if ( ( nIsMod_1570 != 0 ) || ( nIsDirty_1570 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FH1570( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FH1570( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FH1570( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FH66 */
                     pr_default.execute(64, new Object[] {Boolean.valueOf(n4070EstPreKg), A4070EstPreKg, Boolean.valueOf(n4071EstPreDef), A4071EstPreDef, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                     if ( (pr_default.getStatus(64) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FH1570( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        tcesta2_impl.this.A396EmprCod = GXv_char4[0] ;
                        tcesta2_impl.this.A252CliCod = GXv_int5[0] ;
                        tcesta2_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FH1570( ) ;
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
            endLevel1FH1570( ) ;
         }
      }
      closeExtendedTableCursors1FH1570( ) ;
   }

   public void deferredUpdate1FH1570( )
   {
   }

   public void delete1FH1570( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FH1570( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FH1570( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FH1570( ) ;
         afterConfirm1FH1570( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FH1570( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FH67 */
               pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
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
      sMode1570 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FH1570( ) ;
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FH1570( )
   {
      standaloneModal1FH1570( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FH68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Observaciones formula", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void endLevel1FH1570( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FH1570( )
   {
      /* Scan By routine */
      /* Using cursor T01FH69 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4061EstNomCol = T01FH69_A4061EstNomCol[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FH1570( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4061EstNomCol = T01FH69_A4061EstNomCol[0] ;
      }
   }

   public void scanEnd1FH1570( )
   {
      pr_default.close(67);
   }

   public void afterConfirm1FH1570( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FH1570( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FH1570( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FH1570( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FH1570( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FH1570( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FH1570( )
   {
      edtEstNomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtEstPreKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstPreKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreKg_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtEstPreDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstPreDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPreDef_Enabled), 5, 0), !bGXsfl_78_Refreshing);
   }

   public void send_integrity_lvl_hashes1FH1570( )
   {
   }

   public void zm1FH1571( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4117estrecpor = T01FH3_A4117estrecpor[0] ;
         }
         else
         {
            Z4117estrecpor = A4117estrecpor ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4116estreclim = A4116estreclim ;
         Z4117estrecpor = A4117estrecpor ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FH1571( )
   {
   }

   public void standaloneModal1FH1571( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtestreclim_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtestreclim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestreclim_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtestreclim_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtestreclim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestreclim_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void load1FH1571( )
   {
      /* Using cursor T01FH70 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound1571 = (short)(1) ;
         A4117estrecpor = T01FH70_A4117estrecpor[0] ;
         n4117estrecpor = T01FH70_n4117estrecpor[0] ;
         zm1FH1571( -7) ;
      }
      pr_default.close(68);
      onLoadActions1FH1571( ) ;
   }

   public void onLoadActions1FH1571( )
   {
   }

   public void checkExtendedTable1FH1571( )
   {
      nIsDirty_1571 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FH1571( ) ;
   }

   public void closeExtendedTableCursors1FH1571( )
   {
   }

   public void enableDisable1FH1571( )
   {
   }

   public void getKey1FH1571( )
   {
      /* Using cursor T01FH71 */
      pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
      if ( (pr_default.getStatus(69) != 101) )
      {
         RcdFound1571 = (short)(1) ;
      }
      else
      {
         RcdFound1571 = (short)(0) ;
      }
      pr_default.close(69);
   }

   public void getByPrimaryKey1FH1571( )
   {
      /* Using cursor T01FH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FH3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FH1571( 7) ;
         RcdFound1571 = (short)(1) ;
         initializeNonKey1FH1571( ) ;
         A4116estreclim = T01FH3_A4116estreclim[0] ;
         A4117estrecpor = T01FH3_A4117estrecpor[0] ;
         n4117estrecpor = T01FH3_n4117estrecpor[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4116estreclim = A4116estreclim ;
         sMode1571 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FH1571( ) ;
         load1FH1571( ) ;
         Gx_mode = sMode1571 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1571 = (short)(0) ;
         initializeNonKey1FH1571( ) ;
         sMode1571 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FH1571( ) ;
         Gx_mode = sMode1571 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FH1571( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FH1571( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPrecest"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4117estrecpor, T01FH2_A4117estrecpor[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4117estrecpor, T01FH2_A4117estrecpor[0]) != 0 )
            {
               GXutil.writeLogln("tcesta2:[seudo value changed for attri]"+"estrecpor");
               GXutil.writeLogRaw("Old: ",Z4117estrecpor);
               GXutil.writeLogRaw("Current: ",T01FH2_A4117estrecpor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPrecest"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FH1571( )
   {
      beforeValidate1FH1571( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH1571( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FH1571( 0) ;
         checkOptimisticConcurrency1FH1571( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FH1571( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FH1571( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FH72 */
                  pr_default.execute(70, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim), Boolean.valueOf(n4117estrecpor), A4117estrecpor, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPrecest");
                  if ( (pr_default.getStatus(70) == 1) )
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
            load1FH1571( ) ;
         }
         endLevel1FH1571( ) ;
      }
      closeExtendedTableCursors1FH1571( ) ;
   }

   public void update1FH1571( )
   {
      beforeValidate1FH1571( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FH1571( ) ;
      }
      if ( ( nIsMod_1571 != 0 ) || ( nIsDirty_1571 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FH1571( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FH1571( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FH1571( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FH73 */
                     pr_default.execute(71, new Object[] {Boolean.valueOf(n4117estrecpor), A4117estrecpor, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPrecest");
                     if ( (pr_default.getStatus(71) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPrecest"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FH1571( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        tcesta2_impl.this.A396EmprCod = GXv_char4[0] ;
                        tcesta2_impl.this.A252CliCod = GXv_int5[0] ;
                        tcesta2_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FH1571( ) ;
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
            endLevel1FH1571( ) ;
         }
      }
      closeExtendedTableCursors1FH1571( ) ;
   }

   public void deferredUpdate1FH1571( )
   {
   }

   public void delete1FH1571( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FH1571( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FH1571( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FH1571( ) ;
         afterConfirm1FH1571( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FH1571( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FH74 */
               pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Integer.valueOf(A4116estreclim)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPrecest");
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
      sMode1571 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FH1571( ) ;
      Gx_mode = sMode1571 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FH1571( )
   {
      standaloneModal1FH1571( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FH1571( )
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

   public void scanStart1FH1571( )
   {
      /* Scan By routine */
      /* Using cursor T01FH75 */
      pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1571 = (short)(0) ;
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound1571 = (short)(1) ;
         A4116estreclim = T01FH75_A4116estreclim[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FH1571( )
   {
      /* Scan next routine */
      pr_default.readNext(73);
      RcdFound1571 = (short)(0) ;
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound1571 = (short)(1) ;
         A4116estreclim = T01FH75_A4116estreclim[0] ;
      }
   }

   public void scanEnd1FH1571( )
   {
      pr_default.close(73);
   }

   public void afterConfirm1FH1571( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FH1571( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FH1571( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FH1571( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FH1571( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FH1571( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FH1571( )
   {
      edtestreclim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtestreclim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestreclim_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtestrecpor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtestrecpor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestrecpor_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void send_integrity_lvl_hashes1FH1571( )
   {
   }

   public void send_integrity_lvl_hashes1FH10( )
   {
   }

   public void subsflControlProps_781570( )
   {
      edtEstNomCol_Internalname = "ESTNOMCOL_"+sGXsfl_78_idx ;
      edtEstPreKg_Internalname = "ESTPREKG_"+sGXsfl_78_idx ;
      edtEstPreDef_Internalname = "ESTPREDEF_"+sGXsfl_78_idx ;
   }

   public void subsflControlProps_fel_781570( )
   {
      edtEstNomCol_Internalname = "ESTNOMCOL_"+sGXsfl_78_fel_idx ;
      edtEstPreKg_Internalname = "ESTPREKG_"+sGXsfl_78_fel_idx ;
      edtEstPreDef_Internalname = "ESTPREDEF_"+sGXsfl_78_fel_idx ;
   }

   public void addRow1FH1570( )
   {
      nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_781570( ) ;
      sendRow1FH1570( ) ;
   }

   public void sendRow1FH1570( )
   {
      Gridtcesta2_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtcesta2_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtcesta2_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtcesta2_level1item_Class, "") != 0 )
         {
            subGridtcesta2_level1item_Linesclass = subGridtcesta2_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtcesta2_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtcesta2_level1item_Backstyle = (byte)(0) ;
         subGridtcesta2_level1item_Backcolor = subGridtcesta2_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtcesta2_level1item_Class, "") != 0 )
         {
            subGridtcesta2_level1item_Linesclass = subGridtcesta2_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtcesta2_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtcesta2_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtcesta2_level1item_Class, "") != 0 )
         {
            subGridtcesta2_level1item_Linesclass = subGridtcesta2_level1item_Class+"Odd" ;
         }
         subGridtcesta2_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtcesta2_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtcesta2_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_78_idx) % (2))) == 0 )
         {
            subGridtcesta2_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcesta2_level1item_Class, "") != 0 )
            {
               subGridtcesta2_level1item_Linesclass = subGridtcesta2_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtcesta2_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcesta2_level1item_Class, "") != 0 )
            {
               subGridtcesta2_level1item_Linesclass = subGridtcesta2_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1570_" + sGXsfl_78_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridtcesta2_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstNomCol_Internalname,GXutil.rtrim( A4061EstNomCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstNomCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstNomCol_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1570_" + sGXsfl_78_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridtcesta2_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstPreKg_Internalname,GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstPreKg_Enabled!=0) ? localUtil.format( A4070EstPreKg, "ZZZZZ9.99") : localUtil.format( A4070EstPreKg, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstPreKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstPreKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1570_" + sGXsfl_78_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridtcesta2_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstPreDef_Internalname,GXutil.rtrim( A4071EstPreDef),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstPreDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstPreDef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtcesta2_level1itemRow);
      send_integrity_lvl_hashes1FH1570( ) ;
      GXCCtl = "Z4061EstNomCol_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4061EstNomCol));
      GXCCtl = "Z4070EstPreKg_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4070EstPreKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4071EstPreDef_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4071EstPreDef));
      GXCCtl = "nRcdDeleted_1570_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1570_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1570_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1570, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTNOMCOL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstNomCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTPREKG_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTPREDEF_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtcesta2_level1itemContainer.AddRow(Gridtcesta2_level1itemRow);
   }

   public void readRow1FH1570( )
   {
      nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_781570( ) ;
      edtEstNomCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTNOMCOL_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstPreKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTPREKG_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstPreDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTPREDEF_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4061EstNomCol = httpContext.cgiGet( edtEstNomCol_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ESTPREKG_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstPreKg_Internalname ;
         wbErr = true ;
         A4070EstPreKg = DecimalUtil.ZERO ;
         n4070EstPreKg = false ;
      }
      else
      {
         A4070EstPreKg = localUtil.ctond( httpContext.cgiGet( edtEstPreKg_Internalname)) ;
         n4070EstPreKg = false ;
      }
      A4071EstPreDef = httpContext.cgiGet( edtEstPreDef_Internalname) ;
      n4071EstPreDef = false ;
      GXCCtl = "Z4061EstNomCol_" + sGXsfl_78_idx ;
      Z4061EstNomCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4070EstPreKg_" + sGXsfl_78_idx ;
      Z4070EstPreKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4071EstPreDef_" + sGXsfl_78_idx ;
      Z4071EstPreDef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1570_" + sGXsfl_78_idx ;
      nRcdDeleted_1570 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1570_" + sGXsfl_78_idx ;
      nRcdExists_1570 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1570_" + sGXsfl_78_idx ;
      nIsMod_1570 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_901571( )
   {
      edtestreclim_Internalname = "ESTRECLIM_"+sGXsfl_90_idx ;
      edtestrecpor_Internalname = "ESTRECPOR_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_901571( )
   {
      edtestreclim_Internalname = "ESTRECLIM_"+sGXsfl_90_fel_idx ;
      edtestrecpor_Internalname = "ESTRECPOR_"+sGXsfl_90_fel_idx ;
   }

   public void addRow1FH1571( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901571( ) ;
      sendRow1FH1571( ) ;
   }

   public void sendRow1FH1571( )
   {
      Gridtcesta2_level2itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtcesta2_level2item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtcesta2_level2item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtcesta2_level2item_Class, "") != 0 )
         {
            subGridtcesta2_level2item_Linesclass = subGridtcesta2_level2item_Class+"Odd" ;
         }
      }
      else if ( subGridtcesta2_level2item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtcesta2_level2item_Backstyle = (byte)(0) ;
         subGridtcesta2_level2item_Backcolor = subGridtcesta2_level2item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtcesta2_level2item_Class, "") != 0 )
         {
            subGridtcesta2_level2item_Linesclass = subGridtcesta2_level2item_Class+"Uniform" ;
         }
      }
      else if ( subGridtcesta2_level2item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtcesta2_level2item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtcesta2_level2item_Class, "") != 0 )
         {
            subGridtcesta2_level2item_Linesclass = subGridtcesta2_level2item_Class+"Odd" ;
         }
         subGridtcesta2_level2item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtcesta2_level2item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtcesta2_level2item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
         {
            subGridtcesta2_level2item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcesta2_level2item_Class, "") != 0 )
            {
               subGridtcesta2_level2item_Linesclass = subGridtcesta2_level2item_Class+"Even" ;
            }
         }
         else
         {
            subGridtcesta2_level2item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtcesta2_level2item_Class, "") != 0 )
            {
               subGridtcesta2_level2item_Linesclass = subGridtcesta2_level2item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1571_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Gridtcesta2_level2itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtestreclim_Internalname,GXutil.ltrim( localUtil.ntoc( A4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4116estreclim), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtestreclim_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtestreclim_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1571_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Gridtcesta2_level2itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtestrecpor_Internalname,GXutil.ltrim( localUtil.ntoc( A4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtestrecpor_Enabled!=0) ? localUtil.format( A4117estrecpor, "ZZ9.99") : localUtil.format( A4117estrecpor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtestrecpor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtestrecpor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtcesta2_level2itemRow);
      send_integrity_lvl_hashes1FH1571( ) ;
      GXCCtl = "Z4116estreclim_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4116estreclim, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4117estrecpor_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4117estrecpor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1571_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1571_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1571_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1571, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTRECLIM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestreclim_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTRECPOR_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtestrecpor_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtcesta2_level2itemContainer.AddRow(Gridtcesta2_level2itemRow);
   }

   public void readRow1FH1571( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901571( ) ;
      edtestreclim_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTRECLIM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtestrecpor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTRECPOR_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtestreclim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtestreclim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ESTRECLIM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtestreclim_Internalname ;
         wbErr = true ;
         A4116estreclim = 0 ;
      }
      else
      {
         A4116estreclim = (int)(localUtil.ctol( httpContext.cgiGet( edtestreclim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtestrecpor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtestrecpor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ESTRECPOR_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtestrecpor_Internalname ;
         wbErr = true ;
         A4117estrecpor = DecimalUtil.ZERO ;
         n4117estrecpor = false ;
      }
      else
      {
         A4117estrecpor = localUtil.ctond( httpContext.cgiGet( edtestrecpor_Internalname)) ;
         n4117estrecpor = false ;
      }
      GXCCtl = "Z4116estreclim_" + sGXsfl_90_idx ;
      Z4116estreclim = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4117estrecpor_" + sGXsfl_90_idx ;
      Z4117estrecpor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1571_" + sGXsfl_90_idx ;
      nRcdDeleted_1571 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1571_" + sGXsfl_90_idx ;
      nRcdExists_1571 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1571_" + sGXsfl_90_idx ;
      nIsMod_1571 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtestreclim_Enabled = edtestreclim_Enabled ;
      defedtEstNomCol_Enabled = edtEstNomCol_Enabled ;
   }

   public void confirmValues1FH0( )
   {
      nGXsfl_78_idx = 0 ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_781570( ) ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_781570( ) ;
         httpContext.changePostValue( "Z4061EstNomCol_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z4061EstNomCol_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4061EstNomCol_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z4070EstPreKg_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z4070EstPreKg_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4070EstPreKg_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z4071EstPreDef_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z4071EstPreDef_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4071EstPreDef_"+sGXsfl_78_idx) ;
      }
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901571( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901571( ) ;
         httpContext.changePostValue( "Z4116estreclim_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4116estreclim_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4116estreclim_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z4117estrecpor_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4117estrecpor_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4117estrecpor_"+sGXsfl_90_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcesta2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4114ArtPreEst", GXutil.ltrim( localUtil.ntoc( Z4114ArtPreEst, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4115ArtDefEst", GXutil.rtrim( Z4115ArtDefEst));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_78", GXutil.ltrim( localUtil.ntoc( nGXsfl_78_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcesta2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCESTA2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO ESTAMPACION", "") ;
   }

   public void initializeNonKey1FH10( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A4114ArtPreEst = DecimalUtil.ZERO ;
      n4114ArtPreEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrimstr( A4114ArtPreEst, 10, 2));
      A4115ArtDefEst = "" ;
      n4115ArtDefEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
      Z69ArtDsc = "" ;
      Z4114ArtPreEst = DecimalUtil.ZERO ;
      Z4115ArtDefEst = "" ;
   }

   public void initAll1FH10( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey1FH10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FH1570( )
   {
      A4070EstPreKg = DecimalUtil.ZERO ;
      n4070EstPreKg = false ;
      A4071EstPreDef = "" ;
      n4071EstPreDef = false ;
      Z4070EstPreKg = DecimalUtil.ZERO ;
      Z4071EstPreDef = "" ;
   }

   public void initAll1FH1570( )
   {
      A4061EstNomCol = "" ;
      initializeNonKey1FH1570( ) ;
   }

   public void standaloneModalInsert1FH1570( )
   {
   }

   public void initializeNonKey1FH1571( )
   {
      A4117estrecpor = DecimalUtil.ZERO ;
      n4117estrecpor = false ;
      Z4117estrecpor = DecimalUtil.ZERO ;
   }

   public void initAll1FH1571( )
   {
      A4116estreclim = 0 ;
      initializeNonKey1FH1571( ) ;
   }

   public void standaloneModalInsert1FH1571( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572976", true, true);
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
      httpContext.AddJavascriptSource("tcesta2.js", "?20268241572976", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1570( )
   {
      edtEstNomCol_Enabled = defedtEstNomCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), !bGXsfl_78_Refreshing);
   }

   public void init_level_properties1571( )
   {
      edtestreclim_Enabled = defedtestreclim_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtestreclim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtestreclim_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void startgridcontrol78( )
   {
      Gridtcesta2_level1itemContainer.AddObjectProperty("GridName", "Gridtcesta2_level1item");
      Gridtcesta2_level1itemContainer.AddObjectProperty("Header", subGridtcesta2_level1item_Header);
      Gridtcesta2_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtcesta2_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtcesta2_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtcesta2_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcesta2_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4061EstNomCol));
      Gridtcesta2_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstNomCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddColumnProperties(Gridtcesta2_level1itemColumn);
      Gridtcesta2_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcesta2_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4070EstPreKg, (byte)(9), (byte)(2), ".", "")));
      Gridtcesta2_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddColumnProperties(Gridtcesta2_level1itemColumn);
      Gridtcesta2_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcesta2_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A4071EstPreDef));
      Gridtcesta2_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstPreDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddColumnProperties(Gridtcesta2_level1itemColumn);
      Gridtcesta2_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol90( )
   {
      Gridtcesta2_level2itemContainer.AddObjectProperty("GridName", "Gridtcesta2_level2item");
      Gridtcesta2_level2itemContainer.AddObjectProperty("Header", subGridtcesta2_level2item_Header);
      Gridtcesta2_level2itemContainer.AddObjectProperty("Class", "Grid");
      Gridtcesta2_level2itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("CmpContext", "");
      Gridtcesta2_level2itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtcesta2_level2itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcesta2_level2itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4116estreclim, (byte)(8), (byte)(0), ".", "")));
      Gridtcesta2_level2itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtestreclim_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddColumnProperties(Gridtcesta2_level2itemColumn);
      Gridtcesta2_level2itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtcesta2_level2itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4117estrecpor, (byte)(6), (byte)(2), ".", "")));
      Gridtcesta2_level2itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtestrecpor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddColumnProperties(Gridtcesta2_level2itemColumn);
      Gridtcesta2_level2itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtcesta2_level2itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtcesta2_level2item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtArtPreEst_Internalname = "ARTPREEST" ;
      chkArtDefEst.setInternalname( "ARTDEFEST" );
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtEstNomCol_Internalname = "ESTNOMCOL" ;
      edtEstPreKg_Internalname = "ESTPREKG" ;
      edtEstPreDef_Internalname = "ESTPREDEF" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      lblTitlelevel2_Internalname = "TITLELEVEL2" ;
      edtestreclim_Internalname = "ESTRECLIM" ;
      edtestrecpor_Internalname = "ESTRECPOR" ;
      divLevel2table_Internalname = "LEVEL2TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtcesta2_level1item_Internalname = "GRIDTCESTA2_LEVEL1ITEM" ;
      subGridtcesta2_level2item_Internalname = "GRIDTCESTA2_LEVEL2ITEM" ;
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
      subGridtcesta2_level2item_Allowcollapsing = (byte)(0) ;
      subGridtcesta2_level2item_Allowselection = (byte)(0) ;
      subGridtcesta2_level2item_Header = "" ;
      subGridtcesta2_level1item_Allowcollapsing = (byte)(0) ;
      subGridtcesta2_level1item_Allowselection = (byte)(0) ;
      subGridtcesta2_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PRECIO ESTAMPACION", "") );
      edtestrecpor_Jsonclick = "" ;
      edtestreclim_Jsonclick = "" ;
      subGridtcesta2_level2item_Class = "Grid" ;
      subGridtcesta2_level2item_Backcolorstyle = (byte)(0) ;
      edtEstPreDef_Jsonclick = "" ;
      edtEstPreKg_Jsonclick = "" ;
      edtEstNomCol_Jsonclick = "" ;
      subGridtcesta2_level1item_Class = "Grid" ;
      subGridtcesta2_level1item_Backcolorstyle = (byte)(0) ;
      edtestrecpor_Enabled = 1 ;
      edtestreclim_Enabled = 1 ;
      edtEstPreDef_Enabled = 1 ;
      edtEstPreKg_Enabled = 1 ;
      edtEstNomCol_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      chkArtDefEst.setEnabled( 1 );
      edtArtPreEst_Jsonclick = "" ;
      edtArtPreEst_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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

   public void gxnrgridtcesta2_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_781570( ) ;
      while ( nGXsfl_78_idx <= nRC_GXsfl_78 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FH1570( ) ;
         standaloneModal1FH1570( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FH1570( ) ;
         nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_781570( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtcesta2_level1itemContainer)) ;
      /* End function gxnrGridtcesta2_level1item_newrow */
   }

   public void gxnrgridtcesta2_level2item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_901571( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FH1571( ) ;
         standaloneModal1FH1571( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FH1571( ) ;
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901571( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtcesta2_level2itemContainer)) ;
      /* End function gxnrGridtcesta2_level2item_newrow */
   }

   public void init_web_controls( )
   {
      chkArtDefEst.setName( "ARTDEFEST" );
      chkArtDefEst.setWebtags( "" );
      chkArtDefEst.setCaption( httpContext.getMessage( "Definitivo", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkArtDefEst.getInternalname(), "TitleCaption", chkArtDefEst.getCaption(), true);
      chkArtDefEst.setCheckedValue( "N" );
      A4115ArtDefEst = ((GXutil.strcmp(GXutil.rtrim( A4115ArtDefEst), "S")==0) ? "S" : "N") ;
      n4115ArtDefEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", A4115ArtDefEst);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01FH76 */
      pr_default.execute(74, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(74) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FH76_A407EmprNom[0] ;
      n407EmprNom = T01FH76_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(74);
      /* Using cursor T01FH18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FH18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      GX_FocusControl = edtArtDsc_Internalname ;
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01FH18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01FH18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A4115ArtDefEst = ((GXutil.strcmp(GXutil.rtrim( A4115ArtDefEst), "S")==0) ? "S" : "N") ;
      n4115ArtDefEst = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4114ArtPreEst", GXutil.ltrim( localUtil.ntoc( A4114ArtPreEst, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4115ArtDefEst", GXutil.rtrim( A4115ArtDefEst));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4114ArtPreEst", GXutil.ltrim( localUtil.ntoc( Z4114ArtPreEst, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4115ArtDefEst", GXutil.rtrim( Z4115ArtDefEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A4114ArtPreEst',fld:'ARTPREEST',pic:'ZZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z69ArtDsc'},{av:'Z4114ArtPreEst'},{av:'Z4115ArtDefEst'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_ARTDEFEST","{handler:'valid_Artdefest',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_ARTDEFEST",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_ESTNOMCOL","{handler:'valid_Estnomcol',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_ESTNOMCOL",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_ESTPREDEF","{handler:'valid_Estpredef',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_ESTPREDEF",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("VALID_ESTRECLIM","{handler:'valid_Estreclim',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("VALID_ESTRECLIM",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Estrecpor',iparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A4115ArtDefEst',fld:'ARTDEFEST',pic:''}]}");
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
      pr_default.close(16);
      pr_default.close(74);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z4114ArtPreEst = DecimalUtil.ZERO ;
      Z4115ArtDefEst = "" ;
      Z4061EstNomCol = "" ;
      Z4070EstPreKg = DecimalUtil.ZERO ;
      Z4071EstPreDef = "" ;
      Z4117estrecpor = DecimalUtil.ZERO ;
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
      A4115ArtDefEst = "" ;
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
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A4114ArtPreEst = DecimalUtil.ZERO ;
      lblTitlelevel1_Jsonclick = "" ;
      lblTitlelevel2_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtcesta2_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1570 = "" ;
      sStyleString = "" ;
      Gridtcesta2_level2itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1571 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4117estrecpor = DecimalUtil.ZERO ;
      A4061EstNomCol = "" ;
      A4070EstPreKg = DecimalUtil.ZERO ;
      A4071EstPreDef = "" ;
      AV9LitFe = "" ;
      AV7Lit0 = "" ;
      GXt_char1 = "" ;
      AV10Lit1 = "" ;
      AV29station = "" ;
      GXv_char2 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01FH8_A407EmprNom = new String[] {""} ;
      T01FH8_n407EmprNom = new boolean[] {false} ;
      T01FH10_A407EmprNom = new String[] {""} ;
      T01FH10_n407EmprNom = new boolean[] {false} ;
      T01FH10_A65ArtCod = new String[] {""} ;
      T01FH10_n65ArtCod = new boolean[] {false} ;
      T01FH10_A279CliNom = new String[] {""} ;
      T01FH10_A69ArtDsc = new String[] {""} ;
      T01FH10_n69ArtDsc = new boolean[] {false} ;
      T01FH10_A4114ArtPreEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH10_n4114ArtPreEst = new boolean[] {false} ;
      T01FH10_A4115ArtDefEst = new String[] {""} ;
      T01FH10_n4115ArtDefEst = new boolean[] {false} ;
      T01FH10_A396EmprCod = new String[] {""} ;
      T01FH10_A252CliCod = new int[1] ;
      T01FH10_n252CliCod = new boolean[] {false} ;
      T01FH9_A279CliNom = new String[] {""} ;
      T01FH11_A279CliNom = new String[] {""} ;
      T01FH12_A396EmprCod = new String[] {""} ;
      T01FH12_A252CliCod = new int[1] ;
      T01FH12_n252CliCod = new boolean[] {false} ;
      T01FH12_A65ArtCod = new String[] {""} ;
      T01FH12_n65ArtCod = new boolean[] {false} ;
      T01FH7_A65ArtCod = new String[] {""} ;
      T01FH7_n65ArtCod = new boolean[] {false} ;
      T01FH7_A69ArtDsc = new String[] {""} ;
      T01FH7_n69ArtDsc = new boolean[] {false} ;
      T01FH7_A4114ArtPreEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH7_n4114ArtPreEst = new boolean[] {false} ;
      T01FH7_A4115ArtDefEst = new String[] {""} ;
      T01FH7_n4115ArtDefEst = new boolean[] {false} ;
      T01FH7_A396EmprCod = new String[] {""} ;
      T01FH7_A252CliCod = new int[1] ;
      T01FH7_n252CliCod = new boolean[] {false} ;
      sMode10 = "" ;
      T01FH13_A65ArtCod = new String[] {""} ;
      T01FH13_n65ArtCod = new boolean[] {false} ;
      T01FH13_A396EmprCod = new String[] {""} ;
      T01FH13_A252CliCod = new int[1] ;
      T01FH13_n252CliCod = new boolean[] {false} ;
      T01FH14_A65ArtCod = new String[] {""} ;
      T01FH14_n65ArtCod = new boolean[] {false} ;
      T01FH14_A396EmprCod = new String[] {""} ;
      T01FH14_A252CliCod = new int[1] ;
      T01FH14_n252CliCod = new boolean[] {false} ;
      T01FH6_A65ArtCod = new String[] {""} ;
      T01FH6_n65ArtCod = new boolean[] {false} ;
      T01FH6_A69ArtDsc = new String[] {""} ;
      T01FH6_n69ArtDsc = new boolean[] {false} ;
      T01FH6_A4114ArtPreEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH6_n4114ArtPreEst = new boolean[] {false} ;
      T01FH6_A4115ArtDefEst = new String[] {""} ;
      T01FH6_n4115ArtDefEst = new boolean[] {false} ;
      T01FH6_A396EmprCod = new String[] {""} ;
      T01FH6_A252CliCod = new int[1] ;
      T01FH6_n252CliCod = new boolean[] {false} ;
      T01FH18_A279CliNom = new String[] {""} ;
      T01FH19_A396EmprCod = new String[] {""} ;
      T01FH19_A252CliCod = new int[1] ;
      T01FH19_n252CliCod = new boolean[] {false} ;
      T01FH19_A65ArtCod = new String[] {""} ;
      T01FH19_n65ArtCod = new boolean[] {false} ;
      T01FH19_A499GrpFamCod = new byte[1] ;
      T01FH20_A396EmprCod = new String[] {""} ;
      T01FH20_A252CliCod = new int[1] ;
      T01FH20_n252CliCod = new boolean[] {false} ;
      T01FH20_A12814ARTConID = new String[] {""} ;
      T01FH20_A65ArtCod = new String[] {""} ;
      T01FH20_n65ArtCod = new boolean[] {false} ;
      T01FH21_A396EmprCod = new String[] {""} ;
      T01FH21_A252CliCod = new int[1] ;
      T01FH21_n252CliCod = new boolean[] {false} ;
      T01FH21_A65ArtCod = new String[] {""} ;
      T01FH21_n65ArtCod = new boolean[] {false} ;
      T01FH21_A12363SocInt = new byte[1] ;
      T01FH22_A396EmprCod = new String[] {""} ;
      T01FH22_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01FH22_A5728JBCLLin = new short[1] ;
      T01FH23_A396EmprCod = new String[] {""} ;
      T01FH23_A252CliCod = new int[1] ;
      T01FH23_n252CliCod = new boolean[] {false} ;
      T01FH23_A5809MMezCod = new String[] {""} ;
      T01FH23_A65ArtCod = new String[] {""} ;
      T01FH23_n65ArtCod = new boolean[] {false} ;
      T01FH24_A396EmprCod = new String[] {""} ;
      T01FH24_A252CliCod = new int[1] ;
      T01FH24_n252CliCod = new boolean[] {false} ;
      T01FH24_A5234MezCod = new String[] {""} ;
      T01FH24_A5240MezLin = new byte[1] ;
      T01FH25_A396EmprCod = new String[] {""} ;
      T01FH25_A252CliCod = new int[1] ;
      T01FH25_n252CliCod = new boolean[] {false} ;
      T01FH25_A65ArtCod = new String[] {""} ;
      T01FH25_n65ArtCod = new boolean[] {false} ;
      T01FH25_A4061EstNomCol = new String[] {""} ;
      T01FH25_A4073EstObsLin2 = new byte[1] ;
      T01FH26_A396EmprCod = new String[] {""} ;
      T01FH26_A9705ErpNped = new String[] {""} ;
      T01FH26_A8652ErpLin = new short[1] ;
      T01FH27_A396EmprCod = new String[] {""} ;
      T01FH27_A252CliCod = new int[1] ;
      T01FH27_n252CliCod = new boolean[] {false} ;
      T01FH27_A65ArtCod = new String[] {""} ;
      T01FH27_n65ArtCod = new boolean[] {false} ;
      T01FH27_A7266CAAqP = new String[] {""} ;
      T01FH28_A396EmprCod = new String[] {""} ;
      T01FH28_A252CliCod = new int[1] ;
      T01FH28_n252CliCod = new boolean[] {false} ;
      T01FH28_A65ArtCod = new String[] {""} ;
      T01FH28_n65ArtCod = new boolean[] {false} ;
      T01FH28_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01FH29_A396EmprCod = new String[] {""} ;
      T01FH29_A252CliCod = new int[1] ;
      T01FH29_n252CliCod = new boolean[] {false} ;
      T01FH29_A65ArtCod = new String[] {""} ;
      T01FH29_n65ArtCod = new boolean[] {false} ;
      T01FH29_A10972Int_cod = new byte[1] ;
      T01FH30_A396EmprCod = new String[] {""} ;
      T01FH30_A252CliCod = new int[1] ;
      T01FH30_n252CliCod = new boolean[] {false} ;
      T01FH30_A65ArtCod = new String[] {""} ;
      T01FH30_n65ArtCod = new boolean[] {false} ;
      T01FH30_A10577Pg_Procod = new String[] {""} ;
      T01FH31_A396EmprCod = new String[] {""} ;
      T01FH31_A252CliCod = new int[1] ;
      T01FH31_n252CliCod = new boolean[] {false} ;
      T01FH31_A65ArtCod = new String[] {""} ;
      T01FH31_n65ArtCod = new boolean[] {false} ;
      T01FH31_A10272Hz_cod = new String[] {""} ;
      T01FH32_A396EmprCod = new String[] {""} ;
      T01FH32_A252CliCod = new int[1] ;
      T01FH32_n252CliCod = new boolean[] {false} ;
      T01FH32_A65ArtCod = new String[] {""} ;
      T01FH32_n65ArtCod = new boolean[] {false} ;
      T01FH32_A10041ArtSH = new String[] {""} ;
      T01FH33_A396EmprCod = new String[] {""} ;
      T01FH33_A252CliCod = new int[1] ;
      T01FH33_n252CliCod = new boolean[] {false} ;
      T01FH33_A65ArtCod = new String[] {""} ;
      T01FH33_n65ArtCod = new boolean[] {false} ;
      T01FH33_A8427TipoCt = new String[] {""} ;
      T01FH33_A8428CapMxMq = new int[1] ;
      T01FH34_A396EmprCod = new String[] {""} ;
      T01FH34_A252CliCod = new int[1] ;
      T01FH34_n252CliCod = new boolean[] {false} ;
      T01FH34_A65ArtCod = new String[] {""} ;
      T01FH34_n65ArtCod = new boolean[] {false} ;
      T01FH34_A8342CodPred = new short[1] ;
      T01FH35_A396EmprCod = new String[] {""} ;
      T01FH35_A252CliCod = new int[1] ;
      T01FH35_n252CliCod = new boolean[] {false} ;
      T01FH35_A65ArtCod = new String[] {""} ;
      T01FH35_n65ArtCod = new boolean[] {false} ;
      T01FH35_A8089ArtcodTj = new String[] {""} ;
      T01FH36_A396EmprCod = new String[] {""} ;
      T01FH36_A252CliCod = new int[1] ;
      T01FH36_n252CliCod = new boolean[] {false} ;
      T01FH36_A65ArtCod = new String[] {""} ;
      T01FH36_n65ArtCod = new boolean[] {false} ;
      T01FH36_A7956Mq_CodM = new String[] {""} ;
      T01FH37_A396EmprCod = new String[] {""} ;
      T01FH37_A252CliCod = new int[1] ;
      T01FH37_n252CliCod = new boolean[] {false} ;
      T01FH37_A65ArtCod = new String[] {""} ;
      T01FH37_n65ArtCod = new boolean[] {false} ;
      T01FH37_A7949Par_Art = new short[1] ;
      T01FH38_A396EmprCod = new String[] {""} ;
      T01FH38_A252CliCod = new int[1] ;
      T01FH38_n252CliCod = new boolean[] {false} ;
      T01FH38_A65ArtCod = new String[] {""} ;
      T01FH38_n65ArtCod = new boolean[] {false} ;
      T01FH38_A7135Lin_fast = new short[1] ;
      T01FH39_A396EmprCod = new String[] {""} ;
      T01FH39_A252CliCod = new int[1] ;
      T01FH39_n252CliCod = new boolean[] {false} ;
      T01FH39_A65ArtCod = new String[] {""} ;
      T01FH39_n65ArtCod = new boolean[] {false} ;
      T01FH39_A6954Mat_lin = new short[1] ;
      T01FH40_A396EmprCod = new String[] {""} ;
      T01FH40_A602MaqCod = new String[] {""} ;
      T01FH40_A6078MaqCliCod = new int[1] ;
      T01FH40_A6079MaqArtCod = new String[] {""} ;
      T01FH41_A396EmprCod = new String[] {""} ;
      T01FH41_A252CliCod = new int[1] ;
      T01FH41_n252CliCod = new boolean[] {false} ;
      T01FH41_A65ArtCod = new String[] {""} ;
      T01FH41_n65ArtCod = new boolean[] {false} ;
      T01FH41_A5382EstCatAny = new short[1] ;
      T01FH41_A5383EstCatSer = new String[] {""} ;
      T01FH41_A5384EstCatTip = new short[1] ;
      T01FH42_A396EmprCod = new String[] {""} ;
      T01FH42_A252CliCod = new int[1] ;
      T01FH42_n252CliCod = new boolean[] {false} ;
      T01FH42_A65ArtCod = new String[] {""} ;
      T01FH42_n65ArtCod = new boolean[] {false} ;
      T01FH42_A4658MdlCod = new String[] {""} ;
      T01FH43_A396EmprCod = new String[] {""} ;
      T01FH43_A252CliCod = new int[1] ;
      T01FH43_n252CliCod = new boolean[] {false} ;
      T01FH43_A4175WebEmpCod = new String[] {""} ;
      T01FH44_A396EmprCod = new String[] {""} ;
      T01FH44_A252CliCod = new int[1] ;
      T01FH44_n252CliCod = new boolean[] {false} ;
      T01FH44_A4079WEBDISCOD = new String[] {""} ;
      T01FH45_A396EmprCod = new String[] {""} ;
      T01FH45_A252CliCod = new int[1] ;
      T01FH45_n252CliCod = new boolean[] {false} ;
      T01FH45_A65ArtCod = new String[] {""} ;
      T01FH45_n65ArtCod = new boolean[] {false} ;
      T01FH45_A4058CCFColNom = new String[] {""} ;
      T01FH45_A4059CCFColNum = new int[1] ;
      T01FH46_A396EmprCod = new String[] {""} ;
      T01FH46_A252CliCod = new int[1] ;
      T01FH46_n252CliCod = new boolean[] {false} ;
      T01FH46_A65ArtCod = new String[] {""} ;
      T01FH46_n65ArtCod = new boolean[] {false} ;
      T01FH46_A1177Dibujo = new String[] {""} ;
      T01FH46_A1790DibIntCod = new int[1] ;
      T01FH47_A396EmprCod = new String[] {""} ;
      T01FH47_A252CliCod = new int[1] ;
      T01FH47_n252CliCod = new boolean[] {false} ;
      T01FH47_A65ArtCod = new String[] {""} ;
      T01FH47_n65ArtCod = new boolean[] {false} ;
      T01FH47_A1080LinPre = new byte[1] ;
      T01FH48_A396EmprCod = new String[] {""} ;
      T01FH48_A3814PePCod = new long[1] ;
      T01FH49_A396EmprCod = new String[] {""} ;
      T01FH49_A3413OpeManCod = new byte[1] ;
      T01FH49_A3430PreManNMt = new String[] {""} ;
      T01FH49_A252CliCod = new int[1] ;
      T01FH49_n252CliCod = new boolean[] {false} ;
      T01FH49_A65ArtCod = new String[] {""} ;
      T01FH49_n65ArtCod = new boolean[] {false} ;
      T01FH50_A396EmprCod = new String[] {""} ;
      T01FH50_A3415ParManNum = new int[1] ;
      T01FH51_A396EmprCod = new String[] {""} ;
      T01FH51_A3331LanBroCod = new byte[1] ;
      T01FH51_A3333LanBroLin = new short[1] ;
      T01FH52_A396EmprCod = new String[] {""} ;
      T01FH52_A252CliCod = new int[1] ;
      T01FH52_n252CliCod = new boolean[] {false} ;
      T01FH52_A65ArtCod = new String[] {""} ;
      T01FH52_n65ArtCod = new boolean[] {false} ;
      T01FH52_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH53_A396EmprCod = new String[] {""} ;
      T01FH53_A252CliCod = new int[1] ;
      T01FH53_n252CliCod = new boolean[] {false} ;
      T01FH53_A65ArtCod = new String[] {""} ;
      T01FH53_n65ArtCod = new boolean[] {false} ;
      T01FH53_A3288CCalCod = new String[] {""} ;
      T01FH54_A396EmprCod = new String[] {""} ;
      T01FH54_A252CliCod = new int[1] ;
      T01FH54_n252CliCod = new boolean[] {false} ;
      T01FH54_A65ArtCod = new String[] {""} ;
      T01FH54_n65ArtCod = new boolean[] {false} ;
      T01FH54_A3033CCCod = new String[] {""} ;
      T01FH55_A396EmprCod = new String[] {""} ;
      T01FH55_A252CliCod = new int[1] ;
      T01FH55_n252CliCod = new boolean[] {false} ;
      T01FH55_A65ArtCod = new String[] {""} ;
      T01FH55_n65ArtCod = new boolean[] {false} ;
      T01FH55_A2937RecIntCod = new byte[1] ;
      T01FH56_A396EmprCod = new String[] {""} ;
      T01FH56_A252CliCod = new int[1] ;
      T01FH56_n252CliCod = new boolean[] {false} ;
      T01FH56_A65ArtCod = new String[] {""} ;
      T01FH56_n65ArtCod = new boolean[] {false} ;
      T01FH56_A2931Limite2 = new short[1] ;
      T01FH57_A396EmprCod = new String[] {""} ;
      T01FH57_A252CliCod = new int[1] ;
      T01FH57_n252CliCod = new boolean[] {false} ;
      T01FH57_A65ArtCod = new String[] {""} ;
      T01FH57_n65ArtCod = new boolean[] {false} ;
      T01FH57_A71ArtEstAny = new short[1] ;
      T01FH57_A2756ArtEstSer = new String[] {""} ;
      T01FH58_A396EmprCod = new String[] {""} ;
      T01FH58_A252CliCod = new int[1] ;
      T01FH58_n252CliCod = new boolean[] {false} ;
      T01FH58_A1504CliProCod = new String[] {""} ;
      T01FH58_A65ArtCod = new String[] {""} ;
      T01FH58_n65ArtCod = new boolean[] {false} ;
      T01FH59_A396EmprCod = new String[] {""} ;
      T01FH59_A252CliCod = new int[1] ;
      T01FH59_n252CliCod = new boolean[] {false} ;
      T01FH59_A65ArtCod = new String[] {""} ;
      T01FH59_n65ArtCod = new boolean[] {false} ;
      T01FH59_A598LinRec = new byte[1] ;
      T01FH60_A396EmprCod = new String[] {""} ;
      T01FH60_A252CliCod = new int[1] ;
      T01FH60_n252CliCod = new boolean[] {false} ;
      T01FH60_A65ArtCod = new String[] {""} ;
      T01FH60_n65ArtCod = new boolean[] {false} ;
      T01FH60_A831TipColCod = new byte[1] ;
      T01FH61_A396EmprCod = new String[] {""} ;
      T01FH61_A252CliCod = new int[1] ;
      T01FH61_n252CliCod = new boolean[] {false} ;
      T01FH61_A65ArtCod = new String[] {""} ;
      T01FH61_n65ArtCod = new boolean[] {false} ;
      T01FH61_A758ProCod = new String[] {""} ;
      T01FH62_A396EmprCod = new String[] {""} ;
      T01FH62_A252CliCod = new int[1] ;
      T01FH62_n252CliCod = new boolean[] {false} ;
      T01FH62_A65ArtCod = new String[] {""} ;
      T01FH62_n65ArtCod = new boolean[] {false} ;
      T01FH63_A252CliCod = new int[1] ;
      T01FH63_n252CliCod = new boolean[] {false} ;
      T01FH63_A65ArtCod = new String[] {""} ;
      T01FH63_n65ArtCod = new boolean[] {false} ;
      T01FH63_A4061EstNomCol = new String[] {""} ;
      T01FH63_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH63_n4070EstPreKg = new boolean[] {false} ;
      T01FH63_A4071EstPreDef = new String[] {""} ;
      T01FH63_n4071EstPreDef = new boolean[] {false} ;
      T01FH63_A396EmprCod = new String[] {""} ;
      T01FH64_A396EmprCod = new String[] {""} ;
      T01FH64_A252CliCod = new int[1] ;
      T01FH64_n252CliCod = new boolean[] {false} ;
      T01FH64_A65ArtCod = new String[] {""} ;
      T01FH64_n65ArtCod = new boolean[] {false} ;
      T01FH64_A4061EstNomCol = new String[] {""} ;
      T01FH5_A252CliCod = new int[1] ;
      T01FH5_n252CliCod = new boolean[] {false} ;
      T01FH5_A65ArtCod = new String[] {""} ;
      T01FH5_n65ArtCod = new boolean[] {false} ;
      T01FH5_A4061EstNomCol = new String[] {""} ;
      T01FH5_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH5_n4070EstPreKg = new boolean[] {false} ;
      T01FH5_A4071EstPreDef = new String[] {""} ;
      T01FH5_n4071EstPreDef = new boolean[] {false} ;
      T01FH5_A396EmprCod = new String[] {""} ;
      T01FH4_A252CliCod = new int[1] ;
      T01FH4_n252CliCod = new boolean[] {false} ;
      T01FH4_A65ArtCod = new String[] {""} ;
      T01FH4_n65ArtCod = new boolean[] {false} ;
      T01FH4_A4061EstNomCol = new String[] {""} ;
      T01FH4_A4070EstPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH4_n4070EstPreKg = new boolean[] {false} ;
      T01FH4_A4071EstPreDef = new String[] {""} ;
      T01FH4_n4071EstPreDef = new boolean[] {false} ;
      T01FH4_A396EmprCod = new String[] {""} ;
      T01FH68_A396EmprCod = new String[] {""} ;
      T01FH68_A252CliCod = new int[1] ;
      T01FH68_n252CliCod = new boolean[] {false} ;
      T01FH68_A65ArtCod = new String[] {""} ;
      T01FH68_n65ArtCod = new boolean[] {false} ;
      T01FH68_A4061EstNomCol = new String[] {""} ;
      T01FH68_A4073EstObsLin2 = new byte[1] ;
      T01FH69_A396EmprCod = new String[] {""} ;
      T01FH69_A252CliCod = new int[1] ;
      T01FH69_n252CliCod = new boolean[] {false} ;
      T01FH69_A65ArtCod = new String[] {""} ;
      T01FH69_n65ArtCod = new boolean[] {false} ;
      T01FH69_A4061EstNomCol = new String[] {""} ;
      T01FH70_A252CliCod = new int[1] ;
      T01FH70_n252CliCod = new boolean[] {false} ;
      T01FH70_A65ArtCod = new String[] {""} ;
      T01FH70_n65ArtCod = new boolean[] {false} ;
      T01FH70_A4116estreclim = new int[1] ;
      T01FH70_A4117estrecpor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH70_n4117estrecpor = new boolean[] {false} ;
      T01FH70_A396EmprCod = new String[] {""} ;
      T01FH71_A396EmprCod = new String[] {""} ;
      T01FH71_A252CliCod = new int[1] ;
      T01FH71_n252CliCod = new boolean[] {false} ;
      T01FH71_A65ArtCod = new String[] {""} ;
      T01FH71_n65ArtCod = new boolean[] {false} ;
      T01FH71_A4116estreclim = new int[1] ;
      T01FH3_A252CliCod = new int[1] ;
      T01FH3_n252CliCod = new boolean[] {false} ;
      T01FH3_A65ArtCod = new String[] {""} ;
      T01FH3_n65ArtCod = new boolean[] {false} ;
      T01FH3_A4116estreclim = new int[1] ;
      T01FH3_A4117estrecpor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH3_n4117estrecpor = new boolean[] {false} ;
      T01FH3_A396EmprCod = new String[] {""} ;
      T01FH2_A252CliCod = new int[1] ;
      T01FH2_n252CliCod = new boolean[] {false} ;
      T01FH2_A65ArtCod = new String[] {""} ;
      T01FH2_n65ArtCod = new boolean[] {false} ;
      T01FH2_A4116estreclim = new int[1] ;
      T01FH2_A4117estrecpor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FH2_n4117estrecpor = new boolean[] {false} ;
      T01FH2_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      T01FH75_A396EmprCod = new String[] {""} ;
      T01FH75_A252CliCod = new int[1] ;
      T01FH75_n252CliCod = new boolean[] {false} ;
      T01FH75_A65ArtCod = new String[] {""} ;
      T01FH75_n65ArtCod = new boolean[] {false} ;
      T01FH75_A4116estreclim = new int[1] ;
      Gridtcesta2_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtcesta2_level1item_Linesclass = "" ;
      ROClassString = "" ;
      Gridtcesta2_level2itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtcesta2_level2item_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtcesta2_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      Gridtcesta2_level2itemColumn = new com.genexus.webpanels.GXWebColumn();
      T01FH76_A407EmprNom = new String[] {""} ;
      T01FH76_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ69ArtDsc = "" ;
      ZZ4114ArtPreEst = DecimalUtil.ZERO ;
      ZZ4115ArtDefEst = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcesta2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcesta2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcesta2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcesta2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcesta2__default(),
         new Object[] {
             new Object[] {
            T01FH2_A252CliCod, T01FH2_A65ArtCod, T01FH2_A4116estreclim, T01FH2_A4117estrecpor, T01FH2_n4117estrecpor, T01FH2_A396EmprCod
            }
            , new Object[] {
            T01FH3_A252CliCod, T01FH3_A65ArtCod, T01FH3_A4116estreclim, T01FH3_A4117estrecpor, T01FH3_n4117estrecpor, T01FH3_A396EmprCod
            }
            , new Object[] {
            T01FH4_A252CliCod, T01FH4_A65ArtCod, T01FH4_A4061EstNomCol, T01FH4_A4070EstPreKg, T01FH4_n4070EstPreKg, T01FH4_A4071EstPreDef, T01FH4_n4071EstPreDef, T01FH4_A396EmprCod
            }
            , new Object[] {
            T01FH5_A252CliCod, T01FH5_A65ArtCod, T01FH5_A4061EstNomCol, T01FH5_A4070EstPreKg, T01FH5_n4070EstPreKg, T01FH5_A4071EstPreDef, T01FH5_n4071EstPreDef, T01FH5_A396EmprCod
            }
            , new Object[] {
            T01FH6_A65ArtCod, T01FH6_A69ArtDsc, T01FH6_n69ArtDsc, T01FH6_A4114ArtPreEst, T01FH6_n4114ArtPreEst, T01FH6_A4115ArtDefEst, T01FH6_n4115ArtDefEst, T01FH6_A396EmprCod, T01FH6_A252CliCod
            }
            , new Object[] {
            T01FH7_A65ArtCod, T01FH7_A69ArtDsc, T01FH7_n69ArtDsc, T01FH7_A4114ArtPreEst, T01FH7_n4114ArtPreEst, T01FH7_A4115ArtDefEst, T01FH7_n4115ArtDefEst, T01FH7_A396EmprCod, T01FH7_A252CliCod
            }
            , new Object[] {
            T01FH8_A407EmprNom, T01FH8_n407EmprNom
            }
            , new Object[] {
            T01FH9_A279CliNom
            }
            , new Object[] {
            T01FH10_A407EmprNom, T01FH10_n407EmprNom, T01FH10_A65ArtCod, T01FH10_A279CliNom, T01FH10_A69ArtDsc, T01FH10_n69ArtDsc, T01FH10_A4114ArtPreEst, T01FH10_n4114ArtPreEst, T01FH10_A4115ArtDefEst, T01FH10_n4115ArtDefEst,
            T01FH10_A396EmprCod, T01FH10_A252CliCod
            }
            , new Object[] {
            T01FH11_A279CliNom
            }
            , new Object[] {
            T01FH12_A396EmprCod, T01FH12_A252CliCod, T01FH12_A65ArtCod
            }
            , new Object[] {
            T01FH13_A65ArtCod, T01FH13_A396EmprCod, T01FH13_A252CliCod
            }
            , new Object[] {
            T01FH14_A65ArtCod, T01FH14_A396EmprCod, T01FH14_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FH18_A279CliNom
            }
            , new Object[] {
            T01FH19_A396EmprCod, T01FH19_A252CliCod, T01FH19_A65ArtCod, T01FH19_A499GrpFamCod
            }
            , new Object[] {
            T01FH20_A396EmprCod, T01FH20_A252CliCod, T01FH20_A12814ARTConID, T01FH20_A65ArtCod
            }
            , new Object[] {
            T01FH21_A396EmprCod, T01FH21_A252CliCod, T01FH21_A65ArtCod, T01FH21_A12363SocInt
            }
            , new Object[] {
            T01FH22_A396EmprCod, T01FH22_A4929Inc_Dia, T01FH22_A5728JBCLLin
            }
            , new Object[] {
            T01FH23_A396EmprCod, T01FH23_A252CliCod, T01FH23_A5809MMezCod, T01FH23_A65ArtCod
            }
            , new Object[] {
            T01FH24_A396EmprCod, T01FH24_A252CliCod, T01FH24_A5234MezCod, T01FH24_A5240MezLin
            }
            , new Object[] {
            T01FH25_A396EmprCod, T01FH25_A252CliCod, T01FH25_A65ArtCod, T01FH25_A4061EstNomCol, T01FH25_A4073EstObsLin2
            }
            , new Object[] {
            T01FH26_A396EmprCod, T01FH26_A9705ErpNped, T01FH26_A8652ErpLin
            }
            , new Object[] {
            T01FH27_A396EmprCod, T01FH27_A252CliCod, T01FH27_A65ArtCod, T01FH27_A7266CAAqP
            }
            , new Object[] {
            T01FH28_A396EmprCod, T01FH28_A252CliCod, T01FH28_A65ArtCod, T01FH28_A11084H_DiaA
            }
            , new Object[] {
            T01FH29_A396EmprCod, T01FH29_A252CliCod, T01FH29_A65ArtCod, T01FH29_A10972Int_cod
            }
            , new Object[] {
            T01FH30_A396EmprCod, T01FH30_A252CliCod, T01FH30_A65ArtCod, T01FH30_A10577Pg_Procod
            }
            , new Object[] {
            T01FH31_A396EmprCod, T01FH31_A252CliCod, T01FH31_A65ArtCod, T01FH31_A10272Hz_cod
            }
            , new Object[] {
            T01FH32_A396EmprCod, T01FH32_A252CliCod, T01FH32_A65ArtCod, T01FH32_A10041ArtSH
            }
            , new Object[] {
            T01FH33_A396EmprCod, T01FH33_A252CliCod, T01FH33_A65ArtCod, T01FH33_A8427TipoCt, T01FH33_A8428CapMxMq
            }
            , new Object[] {
            T01FH34_A396EmprCod, T01FH34_A252CliCod, T01FH34_A65ArtCod, T01FH34_A8342CodPred
            }
            , new Object[] {
            T01FH35_A396EmprCod, T01FH35_A252CliCod, T01FH35_A65ArtCod, T01FH35_A8089ArtcodTj
            }
            , new Object[] {
            T01FH36_A396EmprCod, T01FH36_A252CliCod, T01FH36_A65ArtCod, T01FH36_A7956Mq_CodM
            }
            , new Object[] {
            T01FH37_A396EmprCod, T01FH37_A252CliCod, T01FH37_A65ArtCod, T01FH37_A7949Par_Art
            }
            , new Object[] {
            T01FH38_A396EmprCod, T01FH38_A252CliCod, T01FH38_A65ArtCod, T01FH38_A7135Lin_fast
            }
            , new Object[] {
            T01FH39_A396EmprCod, T01FH39_A252CliCod, T01FH39_A65ArtCod, T01FH39_A6954Mat_lin
            }
            , new Object[] {
            T01FH40_A396EmprCod, T01FH40_A602MaqCod, T01FH40_A6078MaqCliCod, T01FH40_A6079MaqArtCod
            }
            , new Object[] {
            T01FH41_A396EmprCod, T01FH41_A252CliCod, T01FH41_A65ArtCod, T01FH41_A5382EstCatAny, T01FH41_A5383EstCatSer, T01FH41_A5384EstCatTip
            }
            , new Object[] {
            T01FH42_A396EmprCod, T01FH42_A252CliCod, T01FH42_A65ArtCod, T01FH42_A4658MdlCod
            }
            , new Object[] {
            T01FH43_A396EmprCod, T01FH43_A252CliCod, T01FH43_A4175WebEmpCod
            }
            , new Object[] {
            T01FH44_A396EmprCod, T01FH44_A252CliCod, T01FH44_A4079WEBDISCOD
            }
            , new Object[] {
            T01FH45_A396EmprCod, T01FH45_A252CliCod, T01FH45_A65ArtCod, T01FH45_A4058CCFColNom, T01FH45_A4059CCFColNum
            }
            , new Object[] {
            T01FH46_A396EmprCod, T01FH46_A252CliCod, T01FH46_A65ArtCod, T01FH46_A1177Dibujo, T01FH46_A1790DibIntCod
            }
            , new Object[] {
            T01FH47_A396EmprCod, T01FH47_A252CliCod, T01FH47_A65ArtCod, T01FH47_A1080LinPre
            }
            , new Object[] {
            T01FH48_A396EmprCod, T01FH48_A3814PePCod
            }
            , new Object[] {
            T01FH49_A396EmprCod, T01FH49_A3413OpeManCod, T01FH49_A3430PreManNMt, T01FH49_A252CliCod, T01FH49_A65ArtCod
            }
            , new Object[] {
            T01FH50_A396EmprCod, T01FH50_A3415ParManNum
            }
            , new Object[] {
            T01FH51_A396EmprCod, T01FH51_A3331LanBroCod, T01FH51_A3333LanBroLin
            }
            , new Object[] {
            T01FH52_A396EmprCod, T01FH52_A252CliCod, T01FH52_A65ArtCod, T01FH52_A3319ArtCapKgs
            }
            , new Object[] {
            T01FH53_A396EmprCod, T01FH53_A252CliCod, T01FH53_A65ArtCod, T01FH53_A3288CCalCod
            }
            , new Object[] {
            T01FH54_A396EmprCod, T01FH54_A252CliCod, T01FH54_A65ArtCod, T01FH54_A3033CCCod
            }
            , new Object[] {
            T01FH55_A396EmprCod, T01FH55_A252CliCod, T01FH55_A65ArtCod, T01FH55_A2937RecIntCod
            }
            , new Object[] {
            T01FH56_A396EmprCod, T01FH56_A252CliCod, T01FH56_A65ArtCod, T01FH56_A2931Limite2
            }
            , new Object[] {
            T01FH57_A396EmprCod, T01FH57_A252CliCod, T01FH57_A65ArtCod, T01FH57_A71ArtEstAny, T01FH57_A2756ArtEstSer
            }
            , new Object[] {
            T01FH58_A396EmprCod, T01FH58_A252CliCod, T01FH58_A1504CliProCod, T01FH58_A65ArtCod
            }
            , new Object[] {
            T01FH59_A396EmprCod, T01FH59_A252CliCod, T01FH59_A65ArtCod, T01FH59_A598LinRec
            }
            , new Object[] {
            T01FH60_A396EmprCod, T01FH60_A252CliCod, T01FH60_A65ArtCod, T01FH60_A831TipColCod
            }
            , new Object[] {
            T01FH61_A396EmprCod, T01FH61_A252CliCod, T01FH61_A65ArtCod, T01FH61_A758ProCod
            }
            , new Object[] {
            T01FH62_A396EmprCod, T01FH62_A252CliCod, T01FH62_A65ArtCod
            }
            , new Object[] {
            T01FH63_A252CliCod, T01FH63_A65ArtCod, T01FH63_A4061EstNomCol, T01FH63_A4070EstPreKg, T01FH63_n4070EstPreKg, T01FH63_A4071EstPreDef, T01FH63_n4071EstPreDef, T01FH63_A396EmprCod
            }
            , new Object[] {
            T01FH64_A396EmprCod, T01FH64_A252CliCod, T01FH64_A65ArtCod, T01FH64_A4061EstNomCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FH68_A396EmprCod, T01FH68_A252CliCod, T01FH68_A65ArtCod, T01FH68_A4061EstNomCol, T01FH68_A4073EstObsLin2
            }
            , new Object[] {
            T01FH69_A396EmprCod, T01FH69_A252CliCod, T01FH69_A65ArtCod, T01FH69_A4061EstNomCol
            }
            , new Object[] {
            T01FH70_A252CliCod, T01FH70_A65ArtCod, T01FH70_A4116estreclim, T01FH70_A4117estrecpor, T01FH70_n4117estrecpor, T01FH70_A396EmprCod
            }
            , new Object[] {
            T01FH71_A396EmprCod, T01FH71_A252CliCod, T01FH71_A65ArtCod, T01FH71_A4116estreclim
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FH75_A396EmprCod, T01FH75_A252CliCod, T01FH75_A65ArtCod, T01FH75_A4116estreclim
            }
            , new Object[] {
            T01FH76_A407EmprNom, T01FH76_n407EmprNom
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtcesta2_level1item_Backcolorstyle ;
   private byte subGridtcesta2_level1item_Backstyle ;
   private byte subGridtcesta2_level2item_Backcolorstyle ;
   private byte subGridtcesta2_level2item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtcesta2_level1item_Allowselection ;
   private byte subGridtcesta2_level1item_Allowhovering ;
   private byte subGridtcesta2_level1item_Allowcollapsing ;
   private byte subGridtcesta2_level1item_Collapsed ;
   private byte subGridtcesta2_level2item_Allowselection ;
   private byte subGridtcesta2_level2item_Allowhovering ;
   private byte subGridtcesta2_level2item_Allowcollapsing ;
   private byte subGridtcesta2_level2item_Collapsed ;
   private short nRcdDeleted_1570 ;
   private short nRcdExists_1570 ;
   private short nIsMod_1570 ;
   private short nRcdDeleted_1571 ;
   private short nRcdExists_1571 ;
   private short nIsMod_1571 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1570 ;
   private short RcdFound1570 ;
   private short nBlankRcdUsr1570 ;
   private short nBlankRcdCount1571 ;
   private short RcdFound1571 ;
   private short nBlankRcdUsr1571 ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_1570 ;
   private short nIsDirty_1571 ;
   private int Z252CliCod ;
   private int nRC_GXsfl_78 ;
   private int nGXsfl_78_idx=1 ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
   private int Z4116estreclim ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtPreEst_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtEstNomCol_Enabled ;
   private int edtEstPreKg_Enabled ;
   private int edtEstPreDef_Enabled ;
   private int fRowAdded ;
   private int edtestreclim_Enabled ;
   private int edtestrecpor_Enabled ;
   private int A4116estreclim ;
   private int GX_JID ;
   private int GXv_int5[] ;
   private int subGridtcesta2_level1item_Backcolor ;
   private int subGridtcesta2_level1item_Allbackcolor ;
   private int subGridtcesta2_level2item_Backcolor ;
   private int subGridtcesta2_level2item_Allbackcolor ;
   private int defedtestreclim_Enabled ;
   private int defedtEstNomCol_Enabled ;
   private int idxLst ;
   private int subGridtcesta2_level1item_Selectedindex ;
   private int subGridtcesta2_level1item_Selectioncolor ;
   private int subGridtcesta2_level1item_Hoveringcolor ;
   private int subGridtcesta2_level2item_Selectedindex ;
   private int subGridtcesta2_level2item_Selectioncolor ;
   private int subGridtcesta2_level2item_Hoveringcolor ;
   private int ZZ252CliCod ;
   private long GRIDTCESTA2_LEVEL1ITEM_nFirstRecordOnPage ;
   private long GRIDTCESTA2_LEVEL2ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4114ArtPreEst ;
   private java.math.BigDecimal Z4070EstPreKg ;
   private java.math.BigDecimal Z4117estrecpor ;
   private java.math.BigDecimal A4114ArtPreEst ;
   private java.math.BigDecimal A4117estrecpor ;
   private java.math.BigDecimal A4070EstPreKg ;
   private java.math.BigDecimal ZZ4114ArtPreEst ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z4115ArtDefEst ;
   private String Z4061EstNomCol ;
   private String Z4071EstPreDef ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_78_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_90_idx="0001" ;
   private String A4115ArtDefEst ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String edtArtPreEst_Internalname ;
   private String edtArtPreEst_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String divLevel2table_Internalname ;
   private String lblTitlelevel2_Internalname ;
   private String lblTitlelevel2_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1570 ;
   private String edtEstNomCol_Internalname ;
   private String edtEstPreKg_Internalname ;
   private String edtEstPreDef_Internalname ;
   private String sStyleString ;
   private String subGridtcesta2_level1item_Internalname ;
   private String sMode1571 ;
   private String edtestreclim_Internalname ;
   private String edtestrecpor_Internalname ;
   private String subGridtcesta2_level2item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4061EstNomCol ;
   private String A4071EstPreDef ;
   private String AV9LitFe ;
   private String AV7Lit0 ;
   private String GXt_char1 ;
   private String AV10Lit1 ;
   private String AV29station ;
   private String GXv_char2[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode10 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_78_fel_idx="0001" ;
   private String subGridtcesta2_level1item_Class ;
   private String subGridtcesta2_level1item_Linesclass ;
   private String ROClassString ;
   private String edtEstNomCol_Jsonclick ;
   private String edtEstPreKg_Jsonclick ;
   private String edtEstPreDef_Jsonclick ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGridtcesta2_level2item_Class ;
   private String subGridtcesta2_level2item_Linesclass ;
   private String edtestreclim_Jsonclick ;
   private String edtestrecpor_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtcesta2_level1item_Header ;
   private String subGridtcesta2_level2item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ69ArtDsc ;
   private String ZZ4115ArtDefEst ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n4115ArtDefEst ;
   private boolean bGXsfl_78_Refreshing=false ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n65ArtCod ;
   private boolean n69ArtDsc ;
   private boolean n4114ArtPreEst ;
   private boolean returnInSub ;
   private boolean n4070EstPreKg ;
   private boolean n4071EstPreDef ;
   private boolean n4117estrecpor ;
   private com.genexus.webpanels.GXWebGrid Gridtcesta2_level1itemContainer ;
   private com.genexus.webpanels.GXWebGrid Gridtcesta2_level2itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtcesta2_level1itemRow ;
   private com.genexus.webpanels.GXWebRow Gridtcesta2_level2itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtcesta2_level1itemColumn ;
   private com.genexus.webpanels.GXWebColumn Gridtcesta2_level2itemColumn ;
   private ICheckbox chkArtDefEst ;
   private IDataStoreProvider pr_default ;
   private String[] T01FH8_A407EmprNom ;
   private boolean[] T01FH8_n407EmprNom ;
   private String[] T01FH10_A407EmprNom ;
   private boolean[] T01FH10_n407EmprNom ;
   private String[] T01FH10_A65ArtCod ;
   private boolean[] T01FH10_n65ArtCod ;
   private String[] T01FH10_A279CliNom ;
   private String[] T01FH10_A69ArtDsc ;
   private boolean[] T01FH10_n69ArtDsc ;
   private java.math.BigDecimal[] T01FH10_A4114ArtPreEst ;
   private boolean[] T01FH10_n4114ArtPreEst ;
   private String[] T01FH10_A4115ArtDefEst ;
   private boolean[] T01FH10_n4115ArtDefEst ;
   private String[] T01FH10_A396EmprCod ;
   private int[] T01FH10_A252CliCod ;
   private boolean[] T01FH10_n252CliCod ;
   private String[] T01FH9_A279CliNom ;
   private String[] T01FH11_A279CliNom ;
   private String[] T01FH12_A396EmprCod ;
   private int[] T01FH12_A252CliCod ;
   private boolean[] T01FH12_n252CliCod ;
   private String[] T01FH12_A65ArtCod ;
   private boolean[] T01FH12_n65ArtCod ;
   private String[] T01FH7_A65ArtCod ;
   private boolean[] T01FH7_n65ArtCod ;
   private String[] T01FH7_A69ArtDsc ;
   private boolean[] T01FH7_n69ArtDsc ;
   private java.math.BigDecimal[] T01FH7_A4114ArtPreEst ;
   private boolean[] T01FH7_n4114ArtPreEst ;
   private String[] T01FH7_A4115ArtDefEst ;
   private boolean[] T01FH7_n4115ArtDefEst ;
   private String[] T01FH7_A396EmprCod ;
   private int[] T01FH7_A252CliCod ;
   private boolean[] T01FH7_n252CliCod ;
   private String[] T01FH13_A65ArtCod ;
   private boolean[] T01FH13_n65ArtCod ;
   private String[] T01FH13_A396EmprCod ;
   private int[] T01FH13_A252CliCod ;
   private boolean[] T01FH13_n252CliCod ;
   private String[] T01FH14_A65ArtCod ;
   private boolean[] T01FH14_n65ArtCod ;
   private String[] T01FH14_A396EmprCod ;
   private int[] T01FH14_A252CliCod ;
   private boolean[] T01FH14_n252CliCod ;
   private String[] T01FH6_A65ArtCod ;
   private boolean[] T01FH6_n65ArtCod ;
   private String[] T01FH6_A69ArtDsc ;
   private boolean[] T01FH6_n69ArtDsc ;
   private java.math.BigDecimal[] T01FH6_A4114ArtPreEst ;
   private boolean[] T01FH6_n4114ArtPreEst ;
   private String[] T01FH6_A4115ArtDefEst ;
   private boolean[] T01FH6_n4115ArtDefEst ;
   private String[] T01FH6_A396EmprCod ;
   private int[] T01FH6_A252CliCod ;
   private boolean[] T01FH6_n252CliCod ;
   private String[] T01FH18_A279CliNom ;
   private String[] T01FH19_A396EmprCod ;
   private int[] T01FH19_A252CliCod ;
   private boolean[] T01FH19_n252CliCod ;
   private String[] T01FH19_A65ArtCod ;
   private boolean[] T01FH19_n65ArtCod ;
   private byte[] T01FH19_A499GrpFamCod ;
   private String[] T01FH20_A396EmprCod ;
   private int[] T01FH20_A252CliCod ;
   private boolean[] T01FH20_n252CliCod ;
   private String[] T01FH20_A12814ARTConID ;
   private String[] T01FH20_A65ArtCod ;
   private boolean[] T01FH20_n65ArtCod ;
   private String[] T01FH21_A396EmprCod ;
   private int[] T01FH21_A252CliCod ;
   private boolean[] T01FH21_n252CliCod ;
   private String[] T01FH21_A65ArtCod ;
   private boolean[] T01FH21_n65ArtCod ;
   private byte[] T01FH21_A12363SocInt ;
   private String[] T01FH22_A396EmprCod ;
   private java.util.Date[] T01FH22_A4929Inc_Dia ;
   private short[] T01FH22_A5728JBCLLin ;
   private String[] T01FH23_A396EmprCod ;
   private int[] T01FH23_A252CliCod ;
   private boolean[] T01FH23_n252CliCod ;
   private String[] T01FH23_A5809MMezCod ;
   private String[] T01FH23_A65ArtCod ;
   private boolean[] T01FH23_n65ArtCod ;
   private String[] T01FH24_A396EmprCod ;
   private int[] T01FH24_A252CliCod ;
   private boolean[] T01FH24_n252CliCod ;
   private String[] T01FH24_A5234MezCod ;
   private byte[] T01FH24_A5240MezLin ;
   private String[] T01FH25_A396EmprCod ;
   private int[] T01FH25_A252CliCod ;
   private boolean[] T01FH25_n252CliCod ;
   private String[] T01FH25_A65ArtCod ;
   private boolean[] T01FH25_n65ArtCod ;
   private String[] T01FH25_A4061EstNomCol ;
   private byte[] T01FH25_A4073EstObsLin2 ;
   private String[] T01FH26_A396EmprCod ;
   private String[] T01FH26_A9705ErpNped ;
   private short[] T01FH26_A8652ErpLin ;
   private String[] T01FH27_A396EmprCod ;
   private int[] T01FH27_A252CliCod ;
   private boolean[] T01FH27_n252CliCod ;
   private String[] T01FH27_A65ArtCod ;
   private boolean[] T01FH27_n65ArtCod ;
   private String[] T01FH27_A7266CAAqP ;
   private String[] T01FH28_A396EmprCod ;
   private int[] T01FH28_A252CliCod ;
   private boolean[] T01FH28_n252CliCod ;
   private String[] T01FH28_A65ArtCod ;
   private boolean[] T01FH28_n65ArtCod ;
   private java.util.Date[] T01FH28_A11084H_DiaA ;
   private String[] T01FH29_A396EmprCod ;
   private int[] T01FH29_A252CliCod ;
   private boolean[] T01FH29_n252CliCod ;
   private String[] T01FH29_A65ArtCod ;
   private boolean[] T01FH29_n65ArtCod ;
   private byte[] T01FH29_A10972Int_cod ;
   private String[] T01FH30_A396EmprCod ;
   private int[] T01FH30_A252CliCod ;
   private boolean[] T01FH30_n252CliCod ;
   private String[] T01FH30_A65ArtCod ;
   private boolean[] T01FH30_n65ArtCod ;
   private String[] T01FH30_A10577Pg_Procod ;
   private String[] T01FH31_A396EmprCod ;
   private int[] T01FH31_A252CliCod ;
   private boolean[] T01FH31_n252CliCod ;
   private String[] T01FH31_A65ArtCod ;
   private boolean[] T01FH31_n65ArtCod ;
   private String[] T01FH31_A10272Hz_cod ;
   private String[] T01FH32_A396EmprCod ;
   private int[] T01FH32_A252CliCod ;
   private boolean[] T01FH32_n252CliCod ;
   private String[] T01FH32_A65ArtCod ;
   private boolean[] T01FH32_n65ArtCod ;
   private String[] T01FH32_A10041ArtSH ;
   private String[] T01FH33_A396EmprCod ;
   private int[] T01FH33_A252CliCod ;
   private boolean[] T01FH33_n252CliCod ;
   private String[] T01FH33_A65ArtCod ;
   private boolean[] T01FH33_n65ArtCod ;
   private String[] T01FH33_A8427TipoCt ;
   private int[] T01FH33_A8428CapMxMq ;
   private String[] T01FH34_A396EmprCod ;
   private int[] T01FH34_A252CliCod ;
   private boolean[] T01FH34_n252CliCod ;
   private String[] T01FH34_A65ArtCod ;
   private boolean[] T01FH34_n65ArtCod ;
   private short[] T01FH34_A8342CodPred ;
   private String[] T01FH35_A396EmprCod ;
   private int[] T01FH35_A252CliCod ;
   private boolean[] T01FH35_n252CliCod ;
   private String[] T01FH35_A65ArtCod ;
   private boolean[] T01FH35_n65ArtCod ;
   private String[] T01FH35_A8089ArtcodTj ;
   private String[] T01FH36_A396EmprCod ;
   private int[] T01FH36_A252CliCod ;
   private boolean[] T01FH36_n252CliCod ;
   private String[] T01FH36_A65ArtCod ;
   private boolean[] T01FH36_n65ArtCod ;
   private String[] T01FH36_A7956Mq_CodM ;
   private String[] T01FH37_A396EmprCod ;
   private int[] T01FH37_A252CliCod ;
   private boolean[] T01FH37_n252CliCod ;
   private String[] T01FH37_A65ArtCod ;
   private boolean[] T01FH37_n65ArtCod ;
   private short[] T01FH37_A7949Par_Art ;
   private String[] T01FH38_A396EmprCod ;
   private int[] T01FH38_A252CliCod ;
   private boolean[] T01FH38_n252CliCod ;
   private String[] T01FH38_A65ArtCod ;
   private boolean[] T01FH38_n65ArtCod ;
   private short[] T01FH38_A7135Lin_fast ;
   private String[] T01FH39_A396EmprCod ;
   private int[] T01FH39_A252CliCod ;
   private boolean[] T01FH39_n252CliCod ;
   private String[] T01FH39_A65ArtCod ;
   private boolean[] T01FH39_n65ArtCod ;
   private short[] T01FH39_A6954Mat_lin ;
   private String[] T01FH40_A396EmprCod ;
   private String[] T01FH40_A602MaqCod ;
   private int[] T01FH40_A6078MaqCliCod ;
   private String[] T01FH40_A6079MaqArtCod ;
   private String[] T01FH41_A396EmprCod ;
   private int[] T01FH41_A252CliCod ;
   private boolean[] T01FH41_n252CliCod ;
   private String[] T01FH41_A65ArtCod ;
   private boolean[] T01FH41_n65ArtCod ;
   private short[] T01FH41_A5382EstCatAny ;
   private String[] T01FH41_A5383EstCatSer ;
   private short[] T01FH41_A5384EstCatTip ;
   private String[] T01FH42_A396EmprCod ;
   private int[] T01FH42_A252CliCod ;
   private boolean[] T01FH42_n252CliCod ;
   private String[] T01FH42_A65ArtCod ;
   private boolean[] T01FH42_n65ArtCod ;
   private String[] T01FH42_A4658MdlCod ;
   private String[] T01FH43_A396EmprCod ;
   private int[] T01FH43_A252CliCod ;
   private boolean[] T01FH43_n252CliCod ;
   private String[] T01FH43_A4175WebEmpCod ;
   private String[] T01FH44_A396EmprCod ;
   private int[] T01FH44_A252CliCod ;
   private boolean[] T01FH44_n252CliCod ;
   private String[] T01FH44_A4079WEBDISCOD ;
   private String[] T01FH45_A396EmprCod ;
   private int[] T01FH45_A252CliCod ;
   private boolean[] T01FH45_n252CliCod ;
   private String[] T01FH45_A65ArtCod ;
   private boolean[] T01FH45_n65ArtCod ;
   private String[] T01FH45_A4058CCFColNom ;
   private int[] T01FH45_A4059CCFColNum ;
   private String[] T01FH46_A396EmprCod ;
   private int[] T01FH46_A252CliCod ;
   private boolean[] T01FH46_n252CliCod ;
   private String[] T01FH46_A65ArtCod ;
   private boolean[] T01FH46_n65ArtCod ;
   private String[] T01FH46_A1177Dibujo ;
   private int[] T01FH46_A1790DibIntCod ;
   private String[] T01FH47_A396EmprCod ;
   private int[] T01FH47_A252CliCod ;
   private boolean[] T01FH47_n252CliCod ;
   private String[] T01FH47_A65ArtCod ;
   private boolean[] T01FH47_n65ArtCod ;
   private byte[] T01FH47_A1080LinPre ;
   private String[] T01FH48_A396EmprCod ;
   private long[] T01FH48_A3814PePCod ;
   private String[] T01FH49_A396EmprCod ;
   private byte[] T01FH49_A3413OpeManCod ;
   private String[] T01FH49_A3430PreManNMt ;
   private int[] T01FH49_A252CliCod ;
   private boolean[] T01FH49_n252CliCod ;
   private String[] T01FH49_A65ArtCod ;
   private boolean[] T01FH49_n65ArtCod ;
   private String[] T01FH50_A396EmprCod ;
   private int[] T01FH50_A3415ParManNum ;
   private String[] T01FH51_A396EmprCod ;
   private byte[] T01FH51_A3331LanBroCod ;
   private short[] T01FH51_A3333LanBroLin ;
   private String[] T01FH52_A396EmprCod ;
   private int[] T01FH52_A252CliCod ;
   private boolean[] T01FH52_n252CliCod ;
   private String[] T01FH52_A65ArtCod ;
   private boolean[] T01FH52_n65ArtCod ;
   private java.math.BigDecimal[] T01FH52_A3319ArtCapKgs ;
   private String[] T01FH53_A396EmprCod ;
   private int[] T01FH53_A252CliCod ;
   private boolean[] T01FH53_n252CliCod ;
   private String[] T01FH53_A65ArtCod ;
   private boolean[] T01FH53_n65ArtCod ;
   private String[] T01FH53_A3288CCalCod ;
   private String[] T01FH54_A396EmprCod ;
   private int[] T01FH54_A252CliCod ;
   private boolean[] T01FH54_n252CliCod ;
   private String[] T01FH54_A65ArtCod ;
   private boolean[] T01FH54_n65ArtCod ;
   private String[] T01FH54_A3033CCCod ;
   private String[] T01FH55_A396EmprCod ;
   private int[] T01FH55_A252CliCod ;
   private boolean[] T01FH55_n252CliCod ;
   private String[] T01FH55_A65ArtCod ;
   private boolean[] T01FH55_n65ArtCod ;
   private byte[] T01FH55_A2937RecIntCod ;
   private String[] T01FH56_A396EmprCod ;
   private int[] T01FH56_A252CliCod ;
   private boolean[] T01FH56_n252CliCod ;
   private String[] T01FH56_A65ArtCod ;
   private boolean[] T01FH56_n65ArtCod ;
   private short[] T01FH56_A2931Limite2 ;
   private String[] T01FH57_A396EmprCod ;
   private int[] T01FH57_A252CliCod ;
   private boolean[] T01FH57_n252CliCod ;
   private String[] T01FH57_A65ArtCod ;
   private boolean[] T01FH57_n65ArtCod ;
   private short[] T01FH57_A71ArtEstAny ;
   private String[] T01FH57_A2756ArtEstSer ;
   private String[] T01FH58_A396EmprCod ;
   private int[] T01FH58_A252CliCod ;
   private boolean[] T01FH58_n252CliCod ;
   private String[] T01FH58_A1504CliProCod ;
   private String[] T01FH58_A65ArtCod ;
   private boolean[] T01FH58_n65ArtCod ;
   private String[] T01FH59_A396EmprCod ;
   private int[] T01FH59_A252CliCod ;
   private boolean[] T01FH59_n252CliCod ;
   private String[] T01FH59_A65ArtCod ;
   private boolean[] T01FH59_n65ArtCod ;
   private byte[] T01FH59_A598LinRec ;
   private String[] T01FH60_A396EmprCod ;
   private int[] T01FH60_A252CliCod ;
   private boolean[] T01FH60_n252CliCod ;
   private String[] T01FH60_A65ArtCod ;
   private boolean[] T01FH60_n65ArtCod ;
   private byte[] T01FH60_A831TipColCod ;
   private String[] T01FH61_A396EmprCod ;
   private int[] T01FH61_A252CliCod ;
   private boolean[] T01FH61_n252CliCod ;
   private String[] T01FH61_A65ArtCod ;
   private boolean[] T01FH61_n65ArtCod ;
   private String[] T01FH61_A758ProCod ;
   private String[] T01FH62_A396EmprCod ;
   private int[] T01FH62_A252CliCod ;
   private boolean[] T01FH62_n252CliCod ;
   private String[] T01FH62_A65ArtCod ;
   private boolean[] T01FH62_n65ArtCod ;
   private int[] T01FH63_A252CliCod ;
   private boolean[] T01FH63_n252CliCod ;
   private String[] T01FH63_A65ArtCod ;
   private boolean[] T01FH63_n65ArtCod ;
   private String[] T01FH63_A4061EstNomCol ;
   private java.math.BigDecimal[] T01FH63_A4070EstPreKg ;
   private boolean[] T01FH63_n4070EstPreKg ;
   private String[] T01FH63_A4071EstPreDef ;
   private boolean[] T01FH63_n4071EstPreDef ;
   private String[] T01FH63_A396EmprCod ;
   private String[] T01FH64_A396EmprCod ;
   private int[] T01FH64_A252CliCod ;
   private boolean[] T01FH64_n252CliCod ;
   private String[] T01FH64_A65ArtCod ;
   private boolean[] T01FH64_n65ArtCod ;
   private String[] T01FH64_A4061EstNomCol ;
   private int[] T01FH5_A252CliCod ;
   private boolean[] T01FH5_n252CliCod ;
   private String[] T01FH5_A65ArtCod ;
   private boolean[] T01FH5_n65ArtCod ;
   private String[] T01FH5_A4061EstNomCol ;
   private java.math.BigDecimal[] T01FH5_A4070EstPreKg ;
   private boolean[] T01FH5_n4070EstPreKg ;
   private String[] T01FH5_A4071EstPreDef ;
   private boolean[] T01FH5_n4071EstPreDef ;
   private String[] T01FH5_A396EmprCod ;
   private int[] T01FH4_A252CliCod ;
   private boolean[] T01FH4_n252CliCod ;
   private String[] T01FH4_A65ArtCod ;
   private boolean[] T01FH4_n65ArtCod ;
   private String[] T01FH4_A4061EstNomCol ;
   private java.math.BigDecimal[] T01FH4_A4070EstPreKg ;
   private boolean[] T01FH4_n4070EstPreKg ;
   private String[] T01FH4_A4071EstPreDef ;
   private boolean[] T01FH4_n4071EstPreDef ;
   private String[] T01FH4_A396EmprCod ;
   private String[] T01FH68_A396EmprCod ;
   private int[] T01FH68_A252CliCod ;
   private boolean[] T01FH68_n252CliCod ;
   private String[] T01FH68_A65ArtCod ;
   private boolean[] T01FH68_n65ArtCod ;
   private String[] T01FH68_A4061EstNomCol ;
   private byte[] T01FH68_A4073EstObsLin2 ;
   private String[] T01FH69_A396EmprCod ;
   private int[] T01FH69_A252CliCod ;
   private boolean[] T01FH69_n252CliCod ;
   private String[] T01FH69_A65ArtCod ;
   private boolean[] T01FH69_n65ArtCod ;
   private String[] T01FH69_A4061EstNomCol ;
   private int[] T01FH70_A252CliCod ;
   private boolean[] T01FH70_n252CliCod ;
   private String[] T01FH70_A65ArtCod ;
   private boolean[] T01FH70_n65ArtCod ;
   private int[] T01FH70_A4116estreclim ;
   private java.math.BigDecimal[] T01FH70_A4117estrecpor ;
   private boolean[] T01FH70_n4117estrecpor ;
   private String[] T01FH70_A396EmprCod ;
   private String[] T01FH71_A396EmprCod ;
   private int[] T01FH71_A252CliCod ;
   private boolean[] T01FH71_n252CliCod ;
   private String[] T01FH71_A65ArtCod ;
   private boolean[] T01FH71_n65ArtCod ;
   private int[] T01FH71_A4116estreclim ;
   private int[] T01FH3_A252CliCod ;
   private boolean[] T01FH3_n252CliCod ;
   private String[] T01FH3_A65ArtCod ;
   private boolean[] T01FH3_n65ArtCod ;
   private int[] T01FH3_A4116estreclim ;
   private java.math.BigDecimal[] T01FH3_A4117estrecpor ;
   private boolean[] T01FH3_n4117estrecpor ;
   private String[] T01FH3_A396EmprCod ;
   private int[] T01FH2_A252CliCod ;
   private boolean[] T01FH2_n252CliCod ;
   private String[] T01FH2_A65ArtCod ;
   private boolean[] T01FH2_n65ArtCod ;
   private int[] T01FH2_A4116estreclim ;
   private java.math.BigDecimal[] T01FH2_A4117estrecpor ;
   private boolean[] T01FH2_n4117estrecpor ;
   private String[] T01FH2_A396EmprCod ;
   private String[] T01FH75_A396EmprCod ;
   private int[] T01FH75_A252CliCod ;
   private boolean[] T01FH75_n252CliCod ;
   private String[] T01FH75_A65ArtCod ;
   private boolean[] T01FH75_n65ArtCod ;
   private int[] T01FH75_A4116estreclim ;
   private String[] T01FH76_A407EmprNom ;
   private boolean[] T01FH76_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcesta2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcesta2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcesta2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcesta2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcesta2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FH2", "SELECT CliCod, ArtCod, estreclim, estrecpor, EmprCod FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND estreclim = ?  FOR UPDATE OF estrecpor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH3", "SELECT CliCod, ArtCod, estreclim, estrecpor, EmprCod FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND estreclim = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH4", "SELECT CliCod, ArtCod, EstNomCol, EstPreKg, EstPreDef, EmprCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?  FOR UPDATE OF EstPreKg, EstPreDef NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH5", "SELECT CliCod, ArtCod, EstNomCol, EstPreKg, EstPreDef, EmprCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH6", "SELECT ArtCod, ArtDsc, ArtPreEst, ArtDefEst, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc, ArtPreEst, ArtDefEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH7", "SELECT ArtCod, ArtDsc, ArtPreEst, ArtDefEst, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH10", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.ArtCod, T3.CliNom, TM1.ArtDsc, TM1.ArtPreEst, TM1.ArtDefEst, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.ArtCod = ? and TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE ( ArtCod > ? or ArtCod = ? and CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE ( ArtCod < ? or ArtCod = ? and CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FH15", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, ArtPreEst, ArtDefEst, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01FH16", "UPDATE TXPARTICU SET ArtDsc=?, ArtPreEst=?, ArtDefEst=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01FH17", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01FH18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH19", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH20", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH22", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH23", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH24", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH26", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH38", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH40", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH41", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH42", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH43", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH44", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH45", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH46", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH47", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH48", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH49", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH50", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH51", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH54", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH55", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH56", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH58", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH60", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH61", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH62", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH63", "SELECT CliCod, ArtCod, EstNomCol, EstPreKg, EstPreDef, EmprCod FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH64", "SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FH65", "INSERT INTO TXPCESTAM(CliCod, ArtCod, EstNomCol, EstPreKg, EstPreDef, EmprCod, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstNumFor, EstObsUlt2) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0)", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FH66", "UPDATE TXPCESTAM SET EstPreKg=?, EstPreDef=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FH67", "DELETE FROM TXPCESTAM  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new ForEachCursor("T01FH68", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FH69", "SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH70", "SELECT CliCod, ArtCod, estreclim, estrecpor, EmprCod FROM TXPrecest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and estreclim = ? ORDER BY EmprCod, CliCod, ArtCod, estreclim ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH71", "SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND estreclim = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FH72", "INSERT INTO TXPrecest(CliCod, ArtCod, estreclim, estrecpor, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPrecest")
         ,new UpdateCursor("T01FH73", "UPDATE TXPrecest SET estrecpor=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND estreclim = ?", GX_NOMASK, "TXPrecest")
         ,new UpdateCursor("T01FH74", "DELETE FROM TXPrecest  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND estreclim = ?", GX_NOMASK, "TXPrecest")
         ,new ForEachCursor("T01FH75", "SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, estreclim ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FH76", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 61 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 68 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 74 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 2 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 5 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 9 :
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
            case 10 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
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
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
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
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
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
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
               return;
            case 63 :
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
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 13);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 64 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               stmt.setString(6, (String)parms[9], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 13);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 70 :
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
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setInt(3, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setString(5, (String)parms[7], 3);
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               stmt.setInt(5, ((Number) parms[7]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

