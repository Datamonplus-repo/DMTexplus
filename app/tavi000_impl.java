package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tavi000_impl extends GXDataArea
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
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtavi000_level1item") == 0 )
      {
         gxnrgridtavi000_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA DE AVISOS VERSION II", ""), (short)(0)) ;
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

   public void gxnrgridtavi000_level1item_newrow_invoke( )
   {
      nRC_GXsfl_124 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_124"))) ;
      nGXsfl_124_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_124_idx"))) ;
      sGXsfl_124_idx = httpContext.GetPar( "sGXsfl_124_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtavi000_level1item_newrow( ) ;
      /* End function gxnrGridtavi000_level1item_newrow_invoke */
   }

   public tavi000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tavi000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tavi000_impl.class ));
   }

   public tavi000_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Container FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "TABLA DE AVISOS VERSION II", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviNumero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviNumero_Internalname, httpContext.getMessage( "Numero aviso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A1131AviNumero, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviNumero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1131AviNumero), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1131AviNumero), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviNumero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviNumero_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviCliCod_Internalname, httpContext.getMessage( "AviCliCod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9814AviCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9814AviCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9814AviCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarSer_Internalname, httpContext.getMessage( "AviBarSer", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarSer_Internalname, GXutil.rtrim( A9815AviBarSer), GXutil.rtrim( localUtil.format( A9815AviBarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviForNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviForNum_Internalname, httpContext.getMessage( "AviForNum", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviForNum_Internalname, GXutil.ltrim( localUtil.ntoc( A9816AviForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviForNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9816AviForNum), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9816AviForNum), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviForNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviForNum_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarTip_Internalname, httpContext.getMessage( "AviBarTip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarTip_Internalname, GXutil.ltrim( localUtil.ntoc( A9817AviBarTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviBarTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9817AviBarTip), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A9817AviBarTip), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarTip_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarArt_Internalname, httpContext.getMessage( "Tipo Composcion (TIPART)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarArt_Internalname, GXutil.ltrim( localUtil.ntoc( A9818AviBarArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviBarArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9818AviBarArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9818AviBarArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarT1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarT1_Internalname, httpContext.getMessage( "AviBarT1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarT1_Internalname, GXutil.rtrim( A9819AviBarT1), GXutil.rtrim( localUtil.format( A9819AviBarT1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarT1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarT1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarTP1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarTP1_Internalname, httpContext.getMessage( "AviBarTP1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarTP1_Internalname, GXutil.ltrim( localUtil.ntoc( A9820AviBarTP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviBarTP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9820AviBarTP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9820AviBarTP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarTP1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarTP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarT2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarT2_Internalname, httpContext.getMessage( "AviBarT2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarT2_Internalname, GXutil.rtrim( A9821AviBarT2), GXutil.rtrim( localUtil.format( A9821AviBarT2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarT2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarT2_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarTP2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarTP2_Internalname, httpContext.getMessage( "AviBarTP2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarTP2_Internalname, GXutil.ltrim( localUtil.ntoc( A9822AviBarTP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviBarTP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9822AviBarTP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9822AviBarTP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarTP2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarTP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarT3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarT3_Internalname, httpContext.getMessage( "AviBarT3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarT3_Internalname, GXutil.rtrim( A9823AviBarT3), GXutil.rtrim( localUtil.format( A9823AviBarT3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarT3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarT3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarTP3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarTP3_Internalname, httpContext.getMessage( "AviBarTP3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarTP3_Internalname, GXutil.ltrim( localUtil.ntoc( A9824AviBarTP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviBarTP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9824AviBarTP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9824AviBarTP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarTP3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarTP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviBarAca_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviBarAca_Internalname, httpContext.getMessage( "AviBarAca", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviBarAca_Internalname, GXutil.rtrim( A9825AviBarAca), GXutil.rtrim( localUtil.format( A9825AviBarAca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviBarAca_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviBarAca_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviSecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviSecCod_Internalname, httpContext.getMessage( "AviSecCod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviSecCod_Internalname, GXutil.rtrim( A9826AviSecCod), GXutil.rtrim( localUtil.format( A9826AviSecCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviSecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviSecCod_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviProcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviProcod_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviProcod_Internalname, GXutil.rtrim( A1128AviProcod), GXutil.rtrim( localUtil.format( A1128AviProcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviProcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviProcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviForNfi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviForNfi_Internalname, httpContext.getMessage( "N Formula I", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviForNfi_Internalname, GXutil.ltrim( localUtil.ntoc( A1129AviForNfi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviForNfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1129AviForNfi), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1129AviForNfi), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviForNfi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviForNfi_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAviForNff_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAviForNff_Internalname, httpContext.getMessage( "N Form F", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAviForNff_Internalname, GXutil.ltrim( localUtil.ntoc( A1130AviForNff, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAviForNff_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1130AviForNff), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1130AviForNff), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAviForNff_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAviForNff_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridtavi000_level1item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAVI000.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtavi000_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol124( ) ;
      nGXsfl_124_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1355 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1355 = (short)(1) ;
            scanStart16O1355( ) ;
            while ( RcdFound1355 != 0 )
            {
               init_level_properties1355( ) ;
               getByPrimaryKey16O1355( ) ;
               addRow16O1355( ) ;
               scanNext16O1355( ) ;
            }
            scanEnd16O1355( ) ;
            nBlankRcdCount1355 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16O1355( ) ;
         standaloneModal16O1355( ) ;
         sMode1355 = Gx_mode ;
         while ( nGXsfl_124_idx < nRC_GXsfl_124 )
         {
            bGXsfl_124_Refreshing = true ;
            readRow16O1355( ) ;
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
            edtAviTxt2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AVITXT2_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAviTxt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviTxt2_Enabled), 5, 0), !bGXsfl_124_Refreshing);
            if ( ( nRcdExists_1355 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16O1355( ) ;
            }
            sendRow16O1355( ) ;
            bGXsfl_124_Refreshing = false ;
         }
         Gx_mode = sMode1355 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1355 = (short)(5) ;
         nRcdExists_1355 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16O1355( ) ;
            while ( RcdFound1355 != 0 )
            {
               sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1241355( ) ;
               init_level_properties1355( ) ;
               standaloneNotModal16O1355( ) ;
               getByPrimaryKey16O1355( ) ;
               standaloneModal16O1355( ) ;
               addRow16O1355( ) ;
               scanNext16O1355( ) ;
            }
            scanEnd16O1355( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1355 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1241355( ) ;
      initAll16O1355( ) ;
      init_level_properties1355( ) ;
      nRcdExists_1355 = (short)(0) ;
      nIsMod_1355 = (short)(0) ;
      nRcdDeleted_1355 = (short)(0) ;
      nBlankRcdCount1355 = (short)(nBlankRcdUsr1355+nBlankRcdCount1355) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1355 > 0 )
      {
         standaloneNotModal16O1355( ) ;
         standaloneModal16O1355( ) ;
         addRow16O1355( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1355 = (short)(nBlankRcdCount1355-1) ;
      }
      Gx_mode = sMode1355 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtavi000_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtavi000_level1item", Gridtavi000_level1itemContainer, subGridtavi000_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtavi000_level1itemContainerData", Gridtavi000_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtavi000_level1itemContainerData"+"V", Gridtavi000_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtavi000_level1itemContainerData"+"V"+"\" value='"+Gridtavi000_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z1131AviNumero = localUtil.ctol( httpContext.cgiGet( "Z1131AviNumero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z9814AviCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9814AviCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9815AviBarSer = httpContext.cgiGet( "Z9815AviBarSer") ;
         Z9816AviForNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z9816AviForNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9817AviBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9817AviBarTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9818AviBarArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z9818AviBarArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9819AviBarT1 = httpContext.cgiGet( "Z9819AviBarT1") ;
         Z9820AviBarTP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z9820AviBarTP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9821AviBarT2 = httpContext.cgiGet( "Z9821AviBarT2") ;
         Z9822AviBarTP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z9822AviBarTP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9823AviBarT3 = httpContext.cgiGet( "Z9823AviBarT3") ;
         Z9824AviBarTP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z9824AviBarTP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9825AviBarAca = httpContext.cgiGet( "Z9825AviBarAca") ;
         Z9826AviSecCod = httpContext.cgiGet( "Z9826AviSecCod") ;
         Z1128AviProcod = httpContext.cgiGet( "Z1128AviProcod") ;
         Z1129AviForNfi = (int)(localUtil.ctol( httpContext.cgiGet( "Z1129AviForNfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1130AviForNff = (int)(localUtil.ctol( httpContext.cgiGet( "Z1130AviForNff"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVINUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviNumero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1131AviNumero = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
         }
         else
         {
            A1131AviNumero = localUtil.ctol( httpContext.cgiGet( edtAviNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVICLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9814AviCliCod = 0 ;
            n9814AviCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9814AviCliCod), 6, 0));
         }
         else
         {
            A9814AviCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAviCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9814AviCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9814AviCliCod), 6, 0));
         }
         A9815AviBarSer = httpContext.cgiGet( edtAviBarSer_Internalname) ;
         n9815AviBarSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9815AviBarSer", A9815AviBarSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIFORNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviForNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9816AviForNum = 0 ;
            n9816AviForNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9816AviForNum), 8, 0));
         }
         else
         {
            A9816AviForNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAviForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9816AviForNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9816AviForNum), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIBARTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviBarTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9817AviBarTip = (byte)(0) ;
            n9817AviBarTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9817AviBarTip), 2, 0));
         }
         else
         {
            A9817AviBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtAviBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9817AviBarTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9817AviBarTip), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIBARART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviBarArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9818AviBarArt = (short)(0) ;
            n9818AviBarArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9818AviBarArt), 4, 0));
         }
         else
         {
            A9818AviBarArt = (short)(localUtil.ctol( httpContext.cgiGet( edtAviBarArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9818AviBarArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9818AviBarArt), 4, 0));
         }
         A9819AviBarT1 = httpContext.cgiGet( edtAviBarT1_Internalname) ;
         n9819AviBarT1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9819AviBarT1", A9819AviBarT1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIBARTP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviBarTP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9820AviBarTP1 = (short)(0) ;
            n9820AviBarTP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9820AviBarTP1), 3, 0));
         }
         else
         {
            A9820AviBarTP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtAviBarTP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9820AviBarTP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9820AviBarTP1), 3, 0));
         }
         A9821AviBarT2 = httpContext.cgiGet( edtAviBarT2_Internalname) ;
         n9821AviBarT2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9821AviBarT2", A9821AviBarT2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIBARTP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviBarTP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9822AviBarTP2 = (short)(0) ;
            n9822AviBarTP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9822AviBarTP2), 3, 0));
         }
         else
         {
            A9822AviBarTP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAviBarTP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9822AviBarTP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9822AviBarTP2), 3, 0));
         }
         A9823AviBarT3 = httpContext.cgiGet( edtAviBarT3_Internalname) ;
         n9823AviBarT3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9823AviBarT3", A9823AviBarT3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviBarTP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIBARTP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviBarTP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9824AviBarTP3 = (short)(0) ;
            n9824AviBarTP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9824AviBarTP3), 3, 0));
         }
         else
         {
            A9824AviBarTP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtAviBarTP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9824AviBarTP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9824AviBarTP3), 3, 0));
         }
         A9825AviBarAca = httpContext.cgiGet( edtAviBarAca_Internalname) ;
         n9825AviBarAca = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9825AviBarAca", A9825AviBarAca);
         A9826AviSecCod = httpContext.cgiGet( edtAviSecCod_Internalname) ;
         n9826AviSecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9826AviSecCod", A9826AviSecCod);
         A1128AviProcod = httpContext.cgiGet( edtAviProcod_Internalname) ;
         n1128AviProcod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1128AviProcod", A1128AviProcod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIFORNFI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviForNfi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1129AviForNfi = 0 ;
            n1129AviForNfi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1129AviForNfi), 8, 0));
         }
         else
         {
            A1129AviForNfi = (int)(localUtil.ctol( httpContext.cgiGet( edtAviForNfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1129AviForNfi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1129AviForNfi), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAviForNff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AVIFORNFF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAviForNff_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1130AviForNff = 0 ;
            n1130AviForNff = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1130AviForNff), 8, 0));
         }
         else
         {
            A1130AviForNff = (int)(localUtil.ctol( httpContext.cgiGet( edtAviForNff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1130AviForNff = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1130AviForNff), 8, 0));
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
            A1131AviNumero = GXutil.lval( httpContext.GetPar( "AviNumero")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
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
            initAll16O1354( ) ;
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
      disableAttributes16O1354( ) ;
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

   public void confirm_16O1355( )
   {
      nGXsfl_124_idx = 0 ;
      while ( nGXsfl_124_idx < nRC_GXsfl_124 )
      {
         readRow16O1355( ) ;
         if ( ( nRcdExists_1355 != 0 ) || ( nIsMod_1355 != 0 ) )
         {
            getKey16O1355( ) ;
            if ( ( nRcdExists_1355 == 0 ) && ( nRcdDeleted_1355 == 0 ) )
            {
               if ( RcdFound1355 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16O1355( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16O1355( ) ;
                     closeExtendedTableCursors16O1355( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_124_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1355 != 0 )
               {
                  if ( nRcdDeleted_1355 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16O1355( ) ;
                     load16O1355( ) ;
                     beforeValidate16O1355( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16O1355( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1355 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16O1355( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16O1355( ) ;
                           closeExtendedTableCursors16O1355( ) ;
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
                  if ( nRcdDeleted_1355 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_124_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtAviTxt2_Internalname, A1132AviTxt2) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_124_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1355 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AVITXT2_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAviTxt2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16O0( )
   {
   }

   public void zm16O1354( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9814AviCliCod = T016O6_A9814AviCliCod[0] ;
            Z9815AviBarSer = T016O6_A9815AviBarSer[0] ;
            Z9816AviForNum = T016O6_A9816AviForNum[0] ;
            Z9817AviBarTip = T016O6_A9817AviBarTip[0] ;
            Z9818AviBarArt = T016O6_A9818AviBarArt[0] ;
            Z9819AviBarT1 = T016O6_A9819AviBarT1[0] ;
            Z9820AviBarTP1 = T016O6_A9820AviBarTP1[0] ;
            Z9821AviBarT2 = T016O6_A9821AviBarT2[0] ;
            Z9822AviBarTP2 = T016O6_A9822AviBarTP2[0] ;
            Z9823AviBarT3 = T016O6_A9823AviBarT3[0] ;
            Z9824AviBarTP3 = T016O6_A9824AviBarTP3[0] ;
            Z9825AviBarAca = T016O6_A9825AviBarAca[0] ;
            Z9826AviSecCod = T016O6_A9826AviSecCod[0] ;
            Z1128AviProcod = T016O6_A1128AviProcod[0] ;
            Z1129AviForNfi = T016O6_A1129AviForNfi[0] ;
            Z1130AviForNff = T016O6_A1130AviForNff[0] ;
         }
         else
         {
            Z9814AviCliCod = A9814AviCliCod ;
            Z9815AviBarSer = A9815AviBarSer ;
            Z9816AviForNum = A9816AviForNum ;
            Z9817AviBarTip = A9817AviBarTip ;
            Z9818AviBarArt = A9818AviBarArt ;
            Z9819AviBarT1 = A9819AviBarT1 ;
            Z9820AviBarTP1 = A9820AviBarTP1 ;
            Z9821AviBarT2 = A9821AviBarT2 ;
            Z9822AviBarTP2 = A9822AviBarTP2 ;
            Z9823AviBarT3 = A9823AviBarT3 ;
            Z9824AviBarTP3 = A9824AviBarTP3 ;
            Z9825AviBarAca = A9825AviBarAca ;
            Z9826AviSecCod = A9826AviSecCod ;
            Z1128AviProcod = A1128AviProcod ;
            Z1129AviForNfi = A1129AviForNfi ;
            Z1130AviForNff = A1130AviForNff ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1131AviNumero = A1131AviNumero ;
         Z9814AviCliCod = A9814AviCliCod ;
         Z9815AviBarSer = A9815AviBarSer ;
         Z9816AviForNum = A9816AviForNum ;
         Z9817AviBarTip = A9817AviBarTip ;
         Z9818AviBarArt = A9818AviBarArt ;
         Z9819AviBarT1 = A9819AviBarT1 ;
         Z9820AviBarTP1 = A9820AviBarTP1 ;
         Z9821AviBarT2 = A9821AviBarT2 ;
         Z9822AviBarTP2 = A9822AviBarTP2 ;
         Z9823AviBarT3 = A9823AviBarT3 ;
         Z9824AviBarTP3 = A9824AviBarTP3 ;
         Z9825AviBarAca = A9825AviBarAca ;
         Z9826AviSecCod = A9826AviSecCod ;
         Z1128AviProcod = A1128AviProcod ;
         Z1129AviForNfi = A1129AviForNfi ;
         Z1130AviForNff = A1130AviForNff ;
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

   public void load16O1354( )
   {
      /* Using cursor T016O8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1354 = (short)(1) ;
         A407EmprNom = T016O8_A407EmprNom[0] ;
         n407EmprNom = T016O8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9814AviCliCod = T016O8_A9814AviCliCod[0] ;
         n9814AviCliCod = T016O8_n9814AviCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9814AviCliCod), 6, 0));
         A9815AviBarSer = T016O8_A9815AviBarSer[0] ;
         n9815AviBarSer = T016O8_n9815AviBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9815AviBarSer", A9815AviBarSer);
         A9816AviForNum = T016O8_A9816AviForNum[0] ;
         n9816AviForNum = T016O8_n9816AviForNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9816AviForNum), 8, 0));
         A9817AviBarTip = T016O8_A9817AviBarTip[0] ;
         n9817AviBarTip = T016O8_n9817AviBarTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9817AviBarTip), 2, 0));
         A9818AviBarArt = T016O8_A9818AviBarArt[0] ;
         n9818AviBarArt = T016O8_n9818AviBarArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9818AviBarArt), 4, 0));
         A9819AviBarT1 = T016O8_A9819AviBarT1[0] ;
         n9819AviBarT1 = T016O8_n9819AviBarT1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9819AviBarT1", A9819AviBarT1);
         A9820AviBarTP1 = T016O8_A9820AviBarTP1[0] ;
         n9820AviBarTP1 = T016O8_n9820AviBarTP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9820AviBarTP1), 3, 0));
         A9821AviBarT2 = T016O8_A9821AviBarT2[0] ;
         n9821AviBarT2 = T016O8_n9821AviBarT2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9821AviBarT2", A9821AviBarT2);
         A9822AviBarTP2 = T016O8_A9822AviBarTP2[0] ;
         n9822AviBarTP2 = T016O8_n9822AviBarTP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9822AviBarTP2), 3, 0));
         A9823AviBarT3 = T016O8_A9823AviBarT3[0] ;
         n9823AviBarT3 = T016O8_n9823AviBarT3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9823AviBarT3", A9823AviBarT3);
         A9824AviBarTP3 = T016O8_A9824AviBarTP3[0] ;
         n9824AviBarTP3 = T016O8_n9824AviBarTP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9824AviBarTP3), 3, 0));
         A9825AviBarAca = T016O8_A9825AviBarAca[0] ;
         n9825AviBarAca = T016O8_n9825AviBarAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9825AviBarAca", A9825AviBarAca);
         A9826AviSecCod = T016O8_A9826AviSecCod[0] ;
         n9826AviSecCod = T016O8_n9826AviSecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9826AviSecCod", A9826AviSecCod);
         A1128AviProcod = T016O8_A1128AviProcod[0] ;
         n1128AviProcod = T016O8_n1128AviProcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1128AviProcod", A1128AviProcod);
         A1129AviForNfi = T016O8_A1129AviForNfi[0] ;
         n1129AviForNfi = T016O8_n1129AviForNfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1129AviForNfi), 8, 0));
         A1130AviForNff = T016O8_A1130AviForNff[0] ;
         n1130AviForNff = T016O8_n1130AviForNff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1130AviForNff), 8, 0));
         zm16O1354( -1) ;
      }
      pr_default.close(6);
      onLoadActions16O1354( ) ;
   }

   public void onLoadActions16O1354( )
   {
   }

   public void checkExtendedTable16O1354( )
   {
      nIsDirty_1354 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T016O7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T016O7_A407EmprNom[0] ;
      n407EmprNom = T016O7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors16O1354( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T016O9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T016O9_A407EmprNom[0] ;
      n407EmprNom = T016O9_n407EmprNom[0] ;
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

   public void getKey16O1354( )
   {
      /* Using cursor T016O10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1354 = (short)(1) ;
      }
      else
      {
         RcdFound1354 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016O6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm16O1354( 1) ;
         RcdFound1354 = (short)(1) ;
         A1131AviNumero = T016O6_A1131AviNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
         A9814AviCliCod = T016O6_A9814AviCliCod[0] ;
         n9814AviCliCod = T016O6_n9814AviCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9814AviCliCod), 6, 0));
         A9815AviBarSer = T016O6_A9815AviBarSer[0] ;
         n9815AviBarSer = T016O6_n9815AviBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9815AviBarSer", A9815AviBarSer);
         A9816AviForNum = T016O6_A9816AviForNum[0] ;
         n9816AviForNum = T016O6_n9816AviForNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9816AviForNum), 8, 0));
         A9817AviBarTip = T016O6_A9817AviBarTip[0] ;
         n9817AviBarTip = T016O6_n9817AviBarTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9817AviBarTip), 2, 0));
         A9818AviBarArt = T016O6_A9818AviBarArt[0] ;
         n9818AviBarArt = T016O6_n9818AviBarArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9818AviBarArt), 4, 0));
         A9819AviBarT1 = T016O6_A9819AviBarT1[0] ;
         n9819AviBarT1 = T016O6_n9819AviBarT1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9819AviBarT1", A9819AviBarT1);
         A9820AviBarTP1 = T016O6_A9820AviBarTP1[0] ;
         n9820AviBarTP1 = T016O6_n9820AviBarTP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9820AviBarTP1), 3, 0));
         A9821AviBarT2 = T016O6_A9821AviBarT2[0] ;
         n9821AviBarT2 = T016O6_n9821AviBarT2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9821AviBarT2", A9821AviBarT2);
         A9822AviBarTP2 = T016O6_A9822AviBarTP2[0] ;
         n9822AviBarTP2 = T016O6_n9822AviBarTP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9822AviBarTP2), 3, 0));
         A9823AviBarT3 = T016O6_A9823AviBarT3[0] ;
         n9823AviBarT3 = T016O6_n9823AviBarT3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9823AviBarT3", A9823AviBarT3);
         A9824AviBarTP3 = T016O6_A9824AviBarTP3[0] ;
         n9824AviBarTP3 = T016O6_n9824AviBarTP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9824AviBarTP3), 3, 0));
         A9825AviBarAca = T016O6_A9825AviBarAca[0] ;
         n9825AviBarAca = T016O6_n9825AviBarAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9825AviBarAca", A9825AviBarAca);
         A9826AviSecCod = T016O6_A9826AviSecCod[0] ;
         n9826AviSecCod = T016O6_n9826AviSecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9826AviSecCod", A9826AviSecCod);
         A1128AviProcod = T016O6_A1128AviProcod[0] ;
         n1128AviProcod = T016O6_n1128AviProcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1128AviProcod", A1128AviProcod);
         A1129AviForNfi = T016O6_A1129AviForNfi[0] ;
         n1129AviForNfi = T016O6_n1129AviForNfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1129AviForNfi), 8, 0));
         A1130AviForNff = T016O6_A1130AviForNff[0] ;
         n1130AviForNff = T016O6_n1130AviForNff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1130AviForNff), 8, 0));
         A396EmprCod = T016O6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z1131AviNumero = A1131AviNumero ;
         sMode1354 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16O1354( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1354 = (short)(0) ;
            initializeNonKey16O1354( ) ;
         }
         Gx_mode = sMode1354 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1354 = (short)(0) ;
         initializeNonKey16O1354( ) ;
         sMode1354 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1354 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16O1354( ) ;
      if ( RcdFound1354 == 0 )
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
      RcdFound1354 = (short)(0) ;
      /* Using cursor T016O11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A1131AviNumero)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T016O11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016O11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016O11_A1131AviNumero[0] < A1131AviNumero ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T016O11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016O11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016O11_A1131AviNumero[0] > A1131AviNumero ) ) )
         {
            A396EmprCod = T016O11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1131AviNumero = T016O11_A1131AviNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
            RcdFound1354 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1354 = (short)(0) ;
      /* Using cursor T016O12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A1131AviNumero)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016O12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016O12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016O12_A1131AviNumero[0] > A1131AviNumero ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016O12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016O12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016O12_A1131AviNumero[0] < A1131AviNumero ) ) )
         {
            A396EmprCod = T016O12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1131AviNumero = T016O12_A1131AviNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
            RcdFound1354 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16O1354( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16O1354( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1354 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1131AviNumero != Z1131AviNumero ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1131AviNumero = Z1131AviNumero ;
               httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
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
               update16O1354( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1131AviNumero != Z1131AviNumero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16O1354( ) ;
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
                  insert16O1354( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1131AviNumero != Z1131AviNumero ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1131AviNumero = Z1131AviNumero ;
         httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
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
      if ( RcdFound1354 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAviCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16O1354( ) ;
      if ( RcdFound1354 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAviCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16O1354( ) ;
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
      if ( RcdFound1354 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAviCliCod_Internalname ;
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
      if ( RcdFound1354 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAviCliCod_Internalname ;
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
      scanStart16O1354( ) ;
      if ( RcdFound1354 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1354 != 0 )
         {
            scanNext16O1354( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAviCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16O1354( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16O1354( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016O5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAVI000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( Z9814AviCliCod != T016O5_A9814AviCliCod[0] ) || ( GXutil.strcmp(Z9815AviBarSer, T016O5_A9815AviBarSer[0]) != 0 ) || ( Z9816AviForNum != T016O5_A9816AviForNum[0] ) || ( Z9817AviBarTip != T016O5_A9817AviBarTip[0] ) || ( Z9818AviBarArt != T016O5_A9818AviBarArt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9819AviBarT1, T016O5_A9819AviBarT1[0]) != 0 ) || ( Z9820AviBarTP1 != T016O5_A9820AviBarTP1[0] ) || ( GXutil.strcmp(Z9821AviBarT2, T016O5_A9821AviBarT2[0]) != 0 ) || ( Z9822AviBarTP2 != T016O5_A9822AviBarTP2[0] ) || ( GXutil.strcmp(Z9823AviBarT3, T016O5_A9823AviBarT3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9824AviBarTP3 != T016O5_A9824AviBarTP3[0] ) || ( GXutil.strcmp(Z9825AviBarAca, T016O5_A9825AviBarAca[0]) != 0 ) || ( GXutil.strcmp(Z9826AviSecCod, T016O5_A9826AviSecCod[0]) != 0 ) || ( GXutil.strcmp(Z1128AviProcod, T016O5_A1128AviProcod[0]) != 0 ) || ( Z1129AviForNfi != T016O5_A1129AviForNfi[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1130AviForNff != T016O5_A1130AviForNff[0] ) )
         {
            if ( Z9814AviCliCod != T016O5_A9814AviCliCod[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviCliCod");
               GXutil.writeLogRaw("Old: ",Z9814AviCliCod);
               GXutil.writeLogRaw("Current: ",T016O5_A9814AviCliCod[0]);
            }
            if ( GXutil.strcmp(Z9815AviBarSer, T016O5_A9815AviBarSer[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarSer");
               GXutil.writeLogRaw("Old: ",Z9815AviBarSer);
               GXutil.writeLogRaw("Current: ",T016O5_A9815AviBarSer[0]);
            }
            if ( Z9816AviForNum != T016O5_A9816AviForNum[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviForNum");
               GXutil.writeLogRaw("Old: ",Z9816AviForNum);
               GXutil.writeLogRaw("Current: ",T016O5_A9816AviForNum[0]);
            }
            if ( Z9817AviBarTip != T016O5_A9817AviBarTip[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarTip");
               GXutil.writeLogRaw("Old: ",Z9817AviBarTip);
               GXutil.writeLogRaw("Current: ",T016O5_A9817AviBarTip[0]);
            }
            if ( Z9818AviBarArt != T016O5_A9818AviBarArt[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarArt");
               GXutil.writeLogRaw("Old: ",Z9818AviBarArt);
               GXutil.writeLogRaw("Current: ",T016O5_A9818AviBarArt[0]);
            }
            if ( GXutil.strcmp(Z9819AviBarT1, T016O5_A9819AviBarT1[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarT1");
               GXutil.writeLogRaw("Old: ",Z9819AviBarT1);
               GXutil.writeLogRaw("Current: ",T016O5_A9819AviBarT1[0]);
            }
            if ( Z9820AviBarTP1 != T016O5_A9820AviBarTP1[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarTP1");
               GXutil.writeLogRaw("Old: ",Z9820AviBarTP1);
               GXutil.writeLogRaw("Current: ",T016O5_A9820AviBarTP1[0]);
            }
            if ( GXutil.strcmp(Z9821AviBarT2, T016O5_A9821AviBarT2[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarT2");
               GXutil.writeLogRaw("Old: ",Z9821AviBarT2);
               GXutil.writeLogRaw("Current: ",T016O5_A9821AviBarT2[0]);
            }
            if ( Z9822AviBarTP2 != T016O5_A9822AviBarTP2[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarTP2");
               GXutil.writeLogRaw("Old: ",Z9822AviBarTP2);
               GXutil.writeLogRaw("Current: ",T016O5_A9822AviBarTP2[0]);
            }
            if ( GXutil.strcmp(Z9823AviBarT3, T016O5_A9823AviBarT3[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarT3");
               GXutil.writeLogRaw("Old: ",Z9823AviBarT3);
               GXutil.writeLogRaw("Current: ",T016O5_A9823AviBarT3[0]);
            }
            if ( Z9824AviBarTP3 != T016O5_A9824AviBarTP3[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarTP3");
               GXutil.writeLogRaw("Old: ",Z9824AviBarTP3);
               GXutil.writeLogRaw("Current: ",T016O5_A9824AviBarTP3[0]);
            }
            if ( GXutil.strcmp(Z9825AviBarAca, T016O5_A9825AviBarAca[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviBarAca");
               GXutil.writeLogRaw("Old: ",Z9825AviBarAca);
               GXutil.writeLogRaw("Current: ",T016O5_A9825AviBarAca[0]);
            }
            if ( GXutil.strcmp(Z9826AviSecCod, T016O5_A9826AviSecCod[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviSecCod");
               GXutil.writeLogRaw("Old: ",Z9826AviSecCod);
               GXutil.writeLogRaw("Current: ",T016O5_A9826AviSecCod[0]);
            }
            if ( GXutil.strcmp(Z1128AviProcod, T016O5_A1128AviProcod[0]) != 0 )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviProcod");
               GXutil.writeLogRaw("Old: ",Z1128AviProcod);
               GXutil.writeLogRaw("Current: ",T016O5_A1128AviProcod[0]);
            }
            if ( Z1129AviForNfi != T016O5_A1129AviForNfi[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviForNfi");
               GXutil.writeLogRaw("Old: ",Z1129AviForNfi);
               GXutil.writeLogRaw("Current: ",T016O5_A1129AviForNfi[0]);
            }
            if ( Z1130AviForNff != T016O5_A1130AviForNff[0] )
            {
               GXutil.writeLogln("tavi000:[seudo value changed for attri]"+"AviForNff");
               GXutil.writeLogRaw("Old: ",Z1130AviForNff);
               GXutil.writeLogRaw("Current: ",T016O5_A1130AviForNff[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAVI000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16O1354( )
   {
      beforeValidate16O1354( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16O1354( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16O1354( 0) ;
         checkOptimisticConcurrency16O1354( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16O1354( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16O1354( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016O13 */
                  pr_default.execute(11, new Object[] {Long.valueOf(A1131AviNumero), Boolean.valueOf(n9814AviCliCod), Integer.valueOf(A9814AviCliCod), Boolean.valueOf(n9815AviBarSer), A9815AviBarSer, Boolean.valueOf(n9816AviForNum), Integer.valueOf(A9816AviForNum), Boolean.valueOf(n9817AviBarTip), Byte.valueOf(A9817AviBarTip), Boolean.valueOf(n9818AviBarArt), Short.valueOf(A9818AviBarArt), Boolean.valueOf(n9819AviBarT1), A9819AviBarT1, Boolean.valueOf(n9820AviBarTP1), Short.valueOf(A9820AviBarTP1), Boolean.valueOf(n9821AviBarT2), A9821AviBarT2, Boolean.valueOf(n9822AviBarTP2), Short.valueOf(A9822AviBarTP2), Boolean.valueOf(n9823AviBarT3), A9823AviBarT3, Boolean.valueOf(n9824AviBarTP3), Short.valueOf(A9824AviBarTP3), Boolean.valueOf(n9825AviBarAca), A9825AviBarAca, Boolean.valueOf(n9826AviSecCod), A9826AviSecCod, Boolean.valueOf(n1128AviProcod), A1128AviProcod, Boolean.valueOf(n1129AviForNfi), Integer.valueOf(A1129AviForNfi), Boolean.valueOf(n1130AviForNff), Integer.valueOf(A1130AviForNff), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI000");
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
                        processLevel16O1354( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16O0( ) ;
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
            load16O1354( ) ;
         }
         endLevel16O1354( ) ;
      }
      closeExtendedTableCursors16O1354( ) ;
   }

   public void update16O1354( )
   {
      beforeValidate16O1354( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16O1354( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16O1354( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16O1354( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16O1354( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016O14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n9814AviCliCod), Integer.valueOf(A9814AviCliCod), Boolean.valueOf(n9815AviBarSer), A9815AviBarSer, Boolean.valueOf(n9816AviForNum), Integer.valueOf(A9816AviForNum), Boolean.valueOf(n9817AviBarTip), Byte.valueOf(A9817AviBarTip), Boolean.valueOf(n9818AviBarArt), Short.valueOf(A9818AviBarArt), Boolean.valueOf(n9819AviBarT1), A9819AviBarT1, Boolean.valueOf(n9820AviBarTP1), Short.valueOf(A9820AviBarTP1), Boolean.valueOf(n9821AviBarT2), A9821AviBarT2, Boolean.valueOf(n9822AviBarTP2), Short.valueOf(A9822AviBarTP2), Boolean.valueOf(n9823AviBarT3), A9823AviBarT3, Boolean.valueOf(n9824AviBarTP3), Short.valueOf(A9824AviBarTP3), Boolean.valueOf(n9825AviBarAca), A9825AviBarAca, Boolean.valueOf(n9826AviSecCod), A9826AviSecCod, Boolean.valueOf(n1128AviProcod), A1128AviProcod, Boolean.valueOf(n1129AviForNfi), Integer.valueOf(A1129AviForNfi), Boolean.valueOf(n1130AviForNff), Integer.valueOf(A1130AviForNff), A396EmprCod, Long.valueOf(A1131AviNumero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI000");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAVI000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16O1354( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16O1354( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16O0( ) ;
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
         endLevel16O1354( ) ;
      }
      closeExtendedTableCursors16O1354( ) ;
   }

   public void deferredUpdate16O1354( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16O1354( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16O1354( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16O1354( ) ;
         afterConfirm16O1354( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16O1354( ) ;
            if ( AnyError == 0 )
            {
               scanStart16O1355( ) ;
               while ( RcdFound1355 != 0 )
               {
                  getByPrimaryKey16O1355( ) ;
                  delete16O1355( ) ;
                  scanNext16O1355( ) ;
               }
               scanEnd16O1355( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016O15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI000");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1354 == 0 )
                        {
                           initAll16O1354( ) ;
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
                        resetCaption16O0( ) ;
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
      sMode1354 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16O1354( ) ;
      Gx_mode = sMode1354 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16O1354( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016O16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T016O16_A407EmprNom[0] ;
         n407EmprNom = T016O16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel16O1355( )
   {
      nGXsfl_124_idx = 0 ;
      while ( nGXsfl_124_idx < nRC_GXsfl_124 )
      {
         readRow16O1355( ) ;
         if ( ( nRcdExists_1355 != 0 ) || ( nIsMod_1355 != 0 ) )
         {
            standaloneNotModal16O1355( ) ;
            getKey16O1355( ) ;
            if ( ( nRcdExists_1355 == 0 ) && ( nRcdDeleted_1355 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16O1355( ) ;
            }
            else
            {
               if ( RcdFound1355 != 0 )
               {
                  if ( ( nRcdDeleted_1355 != 0 ) && ( nRcdExists_1355 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16O1355( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1355 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16O1355( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1355 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_124_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtAviTxt2_Internalname, A1132AviTxt2) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_124_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1355_"+sGXsfl_124_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1355 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AVITXT2_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAviTxt2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16O1355( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1355 = (short)(0) ;
      nIsMod_1355 = (short)(0) ;
      nRcdDeleted_1355 = (short)(0) ;
   }

   public void processLevel16O1354( )
   {
      /* Save parent mode. */
      sMode1354 = Gx_mode ;
      processNestedLevel16O1355( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1354 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16O1354( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16O1354( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tavi000");
         if ( AnyError == 0 )
         {
            confirmValues16O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tavi000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16O1354( )
   {
      /* Using cursor T016O17 */
      pr_default.execute(15);
      RcdFound1354 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1354 = (short)(1) ;
         A396EmprCod = T016O17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1131AviNumero = T016O17_A1131AviNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16O1354( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1354 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1354 = (short)(1) ;
         A396EmprCod = T016O17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1131AviNumero = T016O17_A1131AviNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
      }
   }

   public void scanEnd16O1354( )
   {
      pr_default.close(15);
   }

   public void afterConfirm16O1354( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16O1354( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16O1354( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16O1354( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16O1354( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16O1354( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16O1354( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAviNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviNumero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviNumero_Enabled), 5, 0), true);
      edtAviCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviCliCod_Enabled), 5, 0), true);
      edtAviBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarSer_Enabled), 5, 0), true);
      edtAviForNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviForNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviForNum_Enabled), 5, 0), true);
      edtAviBarTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarTip_Enabled), 5, 0), true);
      edtAviBarArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarArt_Enabled), 5, 0), true);
      edtAviBarT1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarT1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarT1_Enabled), 5, 0), true);
      edtAviBarTP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarTP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarTP1_Enabled), 5, 0), true);
      edtAviBarT2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarT2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarT2_Enabled), 5, 0), true);
      edtAviBarTP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarTP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarTP2_Enabled), 5, 0), true);
      edtAviBarT3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarT3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarT3_Enabled), 5, 0), true);
      edtAviBarTP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarTP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarTP3_Enabled), 5, 0), true);
      edtAviBarAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviBarAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviBarAca_Enabled), 5, 0), true);
      edtAviSecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviSecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviSecCod_Enabled), 5, 0), true);
      edtAviProcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviProcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviProcod_Enabled), 5, 0), true);
      edtAviForNfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviForNfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviForNfi_Enabled), 5, 0), true);
      edtAviForNff_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviForNff_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviForNff_Enabled), 5, 0), true);
   }

   public void zm16O1355( int GX_JID )
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
         Z1131AviNumero = A1131AviNumero ;
         Z1132AviTxt2 = A1132AviTxt2 ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal16O1355( )
   {
   }

   public void standaloneModal16O1355( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      }
   }

   public void load16O1355( )
   {
      /* Using cursor T016O18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1355 = (short)(1) ;
         A1132AviTxt2 = T016O18_A1132AviTxt2[0] ;
         n1132AviTxt2 = T016O18_n1132AviTxt2[0] ;
         A460FasDsc = T016O18_A460FasDsc[0] ;
         zm16O1355( -3) ;
      }
      pr_default.close(16);
      onLoadActions16O1355( ) ;
   }

   public void onLoadActions16O1355( )
   {
   }

   public void checkExtendedTable16O1355( )
   {
      nIsDirty_1355 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16O1355( ) ;
      /* Using cursor T016O4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_124_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T016O4_A460FasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors16O1355( )
   {
      pr_default.close(2);
   }

   public void enableDisable16O1355( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T016O19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_124_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T016O19_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey16O1355( )
   {
      /* Using cursor T016O20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1355 = (short)(1) ;
      }
      else
      {
         RcdFound1355 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey16O1355( )
   {
      /* Using cursor T016O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm16O1355( 3) ;
         RcdFound1355 = (short)(1) ;
         initializeNonKey16O1355( ) ;
         A1132AviTxt2 = T016O3_A1132AviTxt2[0] ;
         n1132AviTxt2 = T016O3_n1132AviTxt2[0] ;
         A457FasCod = T016O3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1131AviNumero = A1131AviNumero ;
         Z457FasCod = A457FasCod ;
         sMode1355 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16O1355( ) ;
         load16O1355( ) ;
         Gx_mode = sMode1355 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1355 = (short)(0) ;
         initializeNonKey16O1355( ) ;
         sMode1355 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16O1355( ) ;
         Gx_mode = sMode1355 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16O1355( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16O1355( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016O2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAVI001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAVI001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16O1355( )
   {
      beforeValidate16O1355( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16O1355( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16O1355( 0) ;
         checkOptimisticConcurrency16O1355( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16O1355( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16O1355( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016O21 */
                  pr_default.execute(19, new Object[] {Long.valueOf(A1131AviNumero), Boolean.valueOf(n1132AviTxt2), A1132AviTxt2, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI001");
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
            load16O1355( ) ;
         }
         endLevel16O1355( ) ;
      }
      closeExtendedTableCursors16O1355( ) ;
   }

   public void update16O1355( )
   {
      beforeValidate16O1355( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16O1355( ) ;
      }
      if ( ( nIsMod_1355 != 0 ) || ( nIsDirty_1355 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16O1355( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16O1355( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16O1355( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016O22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n1132AviTxt2), A1132AviTxt2, A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI001");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAVI001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16O1355( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16O1355( ) ;
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
            endLevel16O1355( ) ;
         }
      }
      closeExtendedTableCursors16O1355( ) ;
   }

   public void deferredUpdate16O1355( )
   {
   }

   public void delete16O1355( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16O1355( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16O1355( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16O1355( ) ;
         afterConfirm16O1355( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16O1355( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016O23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero), A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAVI001");
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
      sMode1355 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16O1355( ) ;
      Gx_mode = sMode1355 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16O1355( )
   {
      standaloneModal16O1355( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016O24 */
         pr_default.execute(22, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T016O24_A460FasDsc[0] ;
         pr_default.close(22);
      }
   }

   public void endLevel16O1355( )
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

   public void scanStart16O1355( )
   {
      /* Scan By routine */
      /* Using cursor T016O25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A1131AviNumero)});
      RcdFound1355 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1355 = (short)(1) ;
         A457FasCod = T016O25_A457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16O1355( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1355 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1355 = (short)(1) ;
         A457FasCod = T016O25_A457FasCod[0] ;
      }
   }

   public void scanEnd16O1355( )
   {
      pr_default.close(23);
   }

   public void afterConfirm16O1355( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16O1355( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16O1355( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16O1355( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16O1355( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16O1355( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16O1355( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      edtAviTxt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAviTxt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAviTxt2_Enabled), 5, 0), !bGXsfl_124_Refreshing);
   }

   public void send_integrity_lvl_hashes16O1355( )
   {
   }

   public void send_integrity_lvl_hashes16O1354( )
   {
   }

   public void subsflControlProps_1241355( )
   {
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_124_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_124_idx ;
      edtAviTxt2_Internalname = "AVITXT2_"+sGXsfl_124_idx ;
   }

   public void subsflControlProps_fel_1241355( )
   {
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_124_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_124_fel_idx ;
      edtAviTxt2_Internalname = "AVITXT2_"+sGXsfl_124_fel_idx ;
   }

   public void addRow16O1355( )
   {
      nGXsfl_124_idx = (int)(nGXsfl_124_idx+1) ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1241355( ) ;
      sendRow16O1355( ) ;
   }

   public void sendRow16O1355( )
   {
      Gridtavi000_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtavi000_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtavi000_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtavi000_level1item_Class, "") != 0 )
         {
            subGridtavi000_level1item_Linesclass = subGridtavi000_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtavi000_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtavi000_level1item_Backstyle = (byte)(0) ;
         subGridtavi000_level1item_Backcolor = subGridtavi000_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtavi000_level1item_Class, "") != 0 )
         {
            subGridtavi000_level1item_Linesclass = subGridtavi000_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtavi000_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtavi000_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtavi000_level1item_Class, "") != 0 )
         {
            subGridtavi000_level1item_Linesclass = subGridtavi000_level1item_Class+"Odd" ;
         }
         subGridtavi000_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtavi000_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtavi000_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_124_idx) % (2))) == 0 )
         {
            subGridtavi000_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtavi000_level1item_Class, "") != 0 )
            {
               subGridtavi000_level1item_Linesclass = subGridtavi000_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtavi000_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtavi000_level1item_Class, "") != 0 )
            {
               subGridtavi000_level1item_Linesclass = subGridtavi000_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1355_" + sGXsfl_124_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_124_idx + "',124)\"" ;
      ROClassString = "Attribute" ;
      Gridtavi000_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtavi000_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1355_" + sGXsfl_124_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_124_idx + "',124)\"" ;
      ROClassString = "Attribute" ;
      Gridtavi000_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAviTxt2_Internalname,A1132AviTxt2,A1132AviTxt2,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAviTxt2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAviTxt2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtavi000_level1itemRow);
      send_integrity_lvl_hashes16O1355( ) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_124_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_1355_" + sGXsfl_124_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1355_" + sGXsfl_124_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1355_" + sGXsfl_124_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1355, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AVITXT2_"+sGXsfl_124_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAviTxt2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtavi000_level1itemContainer.AddRow(Gridtavi000_level1itemRow);
   }

   public void readRow16O1355( )
   {
      nGXsfl_124_idx = (int)(nGXsfl_124_idx+1) ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1241355( ) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAviTxt2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AVITXT2_"+sGXsfl_124_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A1132AviTxt2 = httpContext.cgiGet( edtAviTxt2_Internalname) ;
      n1132AviTxt2 = false ;
      GXCCtl = "Z457FasCod_" + sGXsfl_124_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1355_" + sGXsfl_124_idx ;
      nRcdDeleted_1355 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1355_" + sGXsfl_124_idx ;
      nRcdExists_1355 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1355_" + sGXsfl_124_idx ;
      nIsMod_1355 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasCod_Enabled = edtFasCod_Enabled ;
   }

   public void confirmValues16O0( )
   {
      nGXsfl_124_idx = 0 ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1241355( ) ;
      while ( nGXsfl_124_idx < nRC_GXsfl_124 )
      {
         nGXsfl_124_idx = (int)(nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1241355( ) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_124_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_124_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_124_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tavi000", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1131AviNumero", GXutil.ltrim( localUtil.ntoc( Z1131AviNumero, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9814AviCliCod", GXutil.ltrim( localUtil.ntoc( Z9814AviCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9815AviBarSer", GXutil.rtrim( Z9815AviBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9816AviForNum", GXutil.ltrim( localUtil.ntoc( Z9816AviForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9817AviBarTip", GXutil.ltrim( localUtil.ntoc( Z9817AviBarTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9818AviBarArt", GXutil.ltrim( localUtil.ntoc( Z9818AviBarArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9819AviBarT1", GXutil.rtrim( Z9819AviBarT1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9820AviBarTP1", GXutil.ltrim( localUtil.ntoc( Z9820AviBarTP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9821AviBarT2", GXutil.rtrim( Z9821AviBarT2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9822AviBarTP2", GXutil.ltrim( localUtil.ntoc( Z9822AviBarTP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9823AviBarT3", GXutil.rtrim( Z9823AviBarT3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9824AviBarTP3", GXutil.ltrim( localUtil.ntoc( Z9824AviBarTP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9825AviBarAca", GXutil.rtrim( Z9825AviBarAca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9826AviSecCod", GXutil.rtrim( Z9826AviSecCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1128AviProcod", GXutil.rtrim( Z1128AviProcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1129AviForNfi", GXutil.ltrim( localUtil.ntoc( Z1129AviForNfi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1130AviForNff", GXutil.ltrim( localUtil.ntoc( Z1130AviForNff, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_124", GXutil.ltrim( localUtil.ntoc( nGXsfl_124_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tavi000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TAVI000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA DE AVISOS VERSION II", "") ;
   }

   public void initializeNonKey16O1354( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9814AviCliCod = 0 ;
      n9814AviCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9814AviCliCod), 6, 0));
      A9815AviBarSer = "" ;
      n9815AviBarSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9815AviBarSer", A9815AviBarSer);
      A9816AviForNum = 0 ;
      n9816AviForNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9816AviForNum), 8, 0));
      A9817AviBarTip = (byte)(0) ;
      n9817AviBarTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9817AviBarTip), 2, 0));
      A9818AviBarArt = (short)(0) ;
      n9818AviBarArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9818AviBarArt), 4, 0));
      A9819AviBarT1 = "" ;
      n9819AviBarT1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9819AviBarT1", A9819AviBarT1);
      A9820AviBarTP1 = (short)(0) ;
      n9820AviBarTP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9820AviBarTP1), 3, 0));
      A9821AviBarT2 = "" ;
      n9821AviBarT2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9821AviBarT2", A9821AviBarT2);
      A9822AviBarTP2 = (short)(0) ;
      n9822AviBarTP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9822AviBarTP2), 3, 0));
      A9823AviBarT3 = "" ;
      n9823AviBarT3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9823AviBarT3", A9823AviBarT3);
      A9824AviBarTP3 = (short)(0) ;
      n9824AviBarTP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9824AviBarTP3), 3, 0));
      A9825AviBarAca = "" ;
      n9825AviBarAca = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9825AviBarAca", A9825AviBarAca);
      A9826AviSecCod = "" ;
      n9826AviSecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9826AviSecCod", A9826AviSecCod);
      A1128AviProcod = "" ;
      n1128AviProcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1128AviProcod", A1128AviProcod);
      A1129AviForNfi = 0 ;
      n1129AviForNfi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1129AviForNfi), 8, 0));
      A1130AviForNff = 0 ;
      n1130AviForNff = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1130AviForNff), 8, 0));
      Z9814AviCliCod = 0 ;
      Z9815AviBarSer = "" ;
      Z9816AviForNum = 0 ;
      Z9817AviBarTip = (byte)(0) ;
      Z9818AviBarArt = (short)(0) ;
      Z9819AviBarT1 = "" ;
      Z9820AviBarTP1 = (short)(0) ;
      Z9821AviBarT2 = "" ;
      Z9822AviBarTP2 = (short)(0) ;
      Z9823AviBarT3 = "" ;
      Z9824AviBarTP3 = (short)(0) ;
      Z9825AviBarAca = "" ;
      Z9826AviSecCod = "" ;
      Z1128AviProcod = "" ;
      Z1129AviForNfi = 0 ;
      Z1130AviForNff = 0 ;
   }

   public void initAll16O1354( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1131AviNumero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1131AviNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1131AviNumero), 10, 0));
      initializeNonKey16O1354( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16O1355( )
   {
      A460FasDsc = "" ;
      A1132AviTxt2 = "" ;
      n1132AviTxt2 = false ;
   }

   public void initAll16O1355( )
   {
      A457FasCod = "" ;
      initializeNonKey16O1355( ) ;
   }

   public void standaloneModalInsert16O1355( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241545148", true, true);
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
      httpContext.AddJavascriptSource("tavi000.js", "?20268241545148", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1355( )
   {
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_124_Refreshing);
   }

   public void startgridcontrol124( )
   {
      Gridtavi000_level1itemContainer.AddObjectProperty("GridName", "Gridtavi000_level1item");
      Gridtavi000_level1itemContainer.AddObjectProperty("Header", subGridtavi000_level1item_Header);
      Gridtavi000_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtavi000_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtavi000_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtavi000_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtavi000_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridtavi000_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddColumnProperties(Gridtavi000_level1itemColumn);
      Gridtavi000_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtavi000_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridtavi000_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddColumnProperties(Gridtavi000_level1itemColumn);
      Gridtavi000_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtavi000_level1itemColumn.AddObjectProperty("Value", A1132AviTxt2);
      Gridtavi000_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAviTxt2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddColumnProperties(Gridtavi000_level1itemColumn);
      Gridtavi000_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtavi000_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtavi000_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAviNumero_Internalname = "AVINUMERO" ;
      edtAviCliCod_Internalname = "AVICLICOD" ;
      edtAviBarSer_Internalname = "AVIBARSER" ;
      edtAviForNum_Internalname = "AVIFORNUM" ;
      edtAviBarTip_Internalname = "AVIBARTIP" ;
      edtAviBarArt_Internalname = "AVIBARART" ;
      edtAviBarT1_Internalname = "AVIBART1" ;
      edtAviBarTP1_Internalname = "AVIBARTP1" ;
      edtAviBarT2_Internalname = "AVIBART2" ;
      edtAviBarTP2_Internalname = "AVIBARTP2" ;
      edtAviBarT3_Internalname = "AVIBART3" ;
      edtAviBarTP3_Internalname = "AVIBARTP3" ;
      edtAviBarAca_Internalname = "AVIBARACA" ;
      edtAviSecCod_Internalname = "AVISECCOD" ;
      edtAviProcod_Internalname = "AVIPROCOD" ;
      edtAviForNfi_Internalname = "AVIFORNFI" ;
      edtAviForNff_Internalname = "AVIFORNFF" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtAviTxt2_Internalname = "AVITXT2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
      subGridtavi000_level1item_Internalname = "GRIDTAVI000_LEVEL1ITEM" ;
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
      subGridtavi000_level1item_Allowcollapsing = (byte)(0) ;
      subGridtavi000_level1item_Allowselection = (byte)(0) ;
      subGridtavi000_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TABLA DE AVISOS VERSION II", "") );
      edtAviTxt2_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      subGridtavi000_level1item_Class = "Grid" ;
      subGridtavi000_level1item_Backcolorstyle = (byte)(0) ;
      edtAviTxt2_Enabled = 1 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAviForNff_Jsonclick = "" ;
      edtAviForNff_Enabled = 1 ;
      edtAviForNfi_Jsonclick = "" ;
      edtAviForNfi_Enabled = 1 ;
      edtAviProcod_Jsonclick = "" ;
      edtAviProcod_Enabled = 1 ;
      edtAviSecCod_Jsonclick = "" ;
      edtAviSecCod_Enabled = 1 ;
      edtAviBarAca_Jsonclick = "" ;
      edtAviBarAca_Enabled = 1 ;
      edtAviBarTP3_Jsonclick = "" ;
      edtAviBarTP3_Enabled = 1 ;
      edtAviBarT3_Jsonclick = "" ;
      edtAviBarT3_Enabled = 1 ;
      edtAviBarTP2_Jsonclick = "" ;
      edtAviBarTP2_Enabled = 1 ;
      edtAviBarT2_Jsonclick = "" ;
      edtAviBarT2_Enabled = 1 ;
      edtAviBarTP1_Jsonclick = "" ;
      edtAviBarTP1_Enabled = 1 ;
      edtAviBarT1_Jsonclick = "" ;
      edtAviBarT1_Enabled = 1 ;
      edtAviBarArt_Jsonclick = "" ;
      edtAviBarArt_Enabled = 1 ;
      edtAviBarTip_Jsonclick = "" ;
      edtAviBarTip_Enabled = 1 ;
      edtAviForNum_Jsonclick = "" ;
      edtAviForNum_Enabled = 1 ;
      edtAviBarSer_Jsonclick = "" ;
      edtAviBarSer_Enabled = 1 ;
      edtAviCliCod_Jsonclick = "" ;
      edtAviCliCod_Enabled = 1 ;
      edtAviNumero_Jsonclick = "" ;
      edtAviNumero_Enabled = 1 ;
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

   public void gxnrgridtavi000_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1241355( ) ;
      while ( nGXsfl_124_idx <= nRC_GXsfl_124 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16O1355( ) ;
         standaloneModal16O1355( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16O1355( ) ;
         nGXsfl_124_idx = (int)(nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1241355( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtavi000_level1itemContainer)) ;
      /* End function gxnrGridtavi000_level1item_newrow */
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
      /* Using cursor T016O16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T016O16_A407EmprNom[0] ;
      n407EmprNom = T016O16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtAviCliCod_Internalname ;
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
      /* Using cursor T016O16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T016O16_A407EmprNom[0] ;
      n407EmprNom = T016O16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Avinumero( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9814AviCliCod", GXutil.ltrim( localUtil.ntoc( A9814AviCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9815AviBarSer", GXutil.rtrim( A9815AviBarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A9816AviForNum", GXutil.ltrim( localUtil.ntoc( A9816AviForNum, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9817AviBarTip", GXutil.ltrim( localUtil.ntoc( A9817AviBarTip, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9818AviBarArt", GXutil.ltrim( localUtil.ntoc( A9818AviBarArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9819AviBarT1", GXutil.rtrim( A9819AviBarT1));
      httpContext.ajax_rsp_assign_attri("", false, "A9820AviBarTP1", GXutil.ltrim( localUtil.ntoc( A9820AviBarTP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9821AviBarT2", GXutil.rtrim( A9821AviBarT2));
      httpContext.ajax_rsp_assign_attri("", false, "A9822AviBarTP2", GXutil.ltrim( localUtil.ntoc( A9822AviBarTP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9823AviBarT3", GXutil.rtrim( A9823AviBarT3));
      httpContext.ajax_rsp_assign_attri("", false, "A9824AviBarTP3", GXutil.ltrim( localUtil.ntoc( A9824AviBarTP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9825AviBarAca", GXutil.rtrim( A9825AviBarAca));
      httpContext.ajax_rsp_assign_attri("", false, "A9826AviSecCod", GXutil.rtrim( A9826AviSecCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1128AviProcod", GXutil.rtrim( A1128AviProcod));
      httpContext.ajax_rsp_assign_attri("", false, "A1129AviForNfi", GXutil.ltrim( localUtil.ntoc( A1129AviForNfi, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1130AviForNff", GXutil.ltrim( localUtil.ntoc( A1130AviForNff, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1131AviNumero", GXutil.ltrim( localUtil.ntoc( Z1131AviNumero, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9814AviCliCod", GXutil.ltrim( localUtil.ntoc( Z9814AviCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9815AviBarSer", GXutil.rtrim( Z9815AviBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9816AviForNum", GXutil.ltrim( localUtil.ntoc( Z9816AviForNum, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9817AviBarTip", GXutil.ltrim( localUtil.ntoc( Z9817AviBarTip, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9818AviBarArt", GXutil.ltrim( localUtil.ntoc( Z9818AviBarArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9819AviBarT1", GXutil.rtrim( Z9819AviBarT1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9820AviBarTP1", GXutil.ltrim( localUtil.ntoc( Z9820AviBarTP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9821AviBarT2", GXutil.rtrim( Z9821AviBarT2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9822AviBarTP2", GXutil.ltrim( localUtil.ntoc( Z9822AviBarTP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9823AviBarT3", GXutil.rtrim( Z9823AviBarT3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9824AviBarTP3", GXutil.ltrim( localUtil.ntoc( Z9824AviBarTP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9825AviBarAca", GXutil.rtrim( Z9825AviBarAca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9826AviSecCod", GXutil.rtrim( Z9826AviSecCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1128AviProcod", GXutil.rtrim( Z1128AviProcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1129AviForNfi", GXutil.ltrim( localUtil.ntoc( Z1129AviForNfi, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1130AviForNff", GXutil.ltrim( localUtil.ntoc( Z1130AviForNff, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T016O24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T016O24_A460FasDsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
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
      setEventMetadata("VALID_AVINUMERO","{handler:'valid_Avinumero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1131AviNumero',fld:'AVINUMERO',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AVINUMERO",",oparms:[{av:'A9814AviCliCod',fld:'AVICLICOD',pic:'ZZZZZ9'},{av:'A9815AviBarSer',fld:'AVIBARSER',pic:''},{av:'A9816AviForNum',fld:'AVIFORNUM',pic:'ZZZZZZZ9'},{av:'A9817AviBarTip',fld:'AVIBARTIP',pic:'Z9'},{av:'A9818AviBarArt',fld:'AVIBARART',pic:'ZZZ9'},{av:'A9819AviBarT1',fld:'AVIBART1',pic:''},{av:'A9820AviBarTP1',fld:'AVIBARTP1',pic:'ZZ9'},{av:'A9821AviBarT2',fld:'AVIBART2',pic:''},{av:'A9822AviBarTP2',fld:'AVIBARTP2',pic:'ZZ9'},{av:'A9823AviBarT3',fld:'AVIBART3',pic:''},{av:'A9824AviBarTP3',fld:'AVIBARTP3',pic:'ZZ9'},{av:'A9825AviBarAca',fld:'AVIBARACA',pic:''},{av:'A9826AviSecCod',fld:'AVISECCOD',pic:''},{av:'A1128AviProcod',fld:'AVIPROCOD',pic:''},{av:'A1129AviForNfi',fld:'AVIFORNFI',pic:'ZZZZZZZ9'},{av:'A1130AviForNff',fld:'AVIFORNFF',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1131AviNumero'},{av:'Z9814AviCliCod'},{av:'Z9815AviBarSer'},{av:'Z9816AviForNum'},{av:'Z9817AviBarTip'},{av:'Z9818AviBarArt'},{av:'Z9819AviBarT1'},{av:'Z9820AviBarTP1'},{av:'Z9821AviBarT2'},{av:'Z9822AviBarTP2'},{av:'Z9823AviBarT3'},{av:'Z9824AviBarTP3'},{av:'Z9825AviBarAca'},{av:'Z9826AviSecCod'},{av:'Z1128AviProcod'},{av:'Z1129AviForNfi'},{av:'Z1130AviForNff'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Avitxt2',iparms:[]");
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
      Z9815AviBarSer = "" ;
      Z9819AviBarT1 = "" ;
      Z9821AviBarT2 = "" ;
      Z9823AviBarT3 = "" ;
      Z9825AviBarAca = "" ;
      Z9826AviSecCod = "" ;
      Z1128AviProcod = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A407EmprNom = "" ;
      A9815AviBarSer = "" ;
      A9819AviBarT1 = "" ;
      A9821AviBarT2 = "" ;
      A9823AviBarT3 = "" ;
      A9825AviBarAca = "" ;
      A9826AviSecCod = "" ;
      A1128AviProcod = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtavi000_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1355 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A1132AviTxt2 = "" ;
      Z407EmprNom = "" ;
      T016O8_A1131AviNumero = new long[1] ;
      T016O8_A407EmprNom = new String[] {""} ;
      T016O8_n407EmprNom = new boolean[] {false} ;
      T016O8_A9814AviCliCod = new int[1] ;
      T016O8_n9814AviCliCod = new boolean[] {false} ;
      T016O8_A9815AviBarSer = new String[] {""} ;
      T016O8_n9815AviBarSer = new boolean[] {false} ;
      T016O8_A9816AviForNum = new int[1] ;
      T016O8_n9816AviForNum = new boolean[] {false} ;
      T016O8_A9817AviBarTip = new byte[1] ;
      T016O8_n9817AviBarTip = new boolean[] {false} ;
      T016O8_A9818AviBarArt = new short[1] ;
      T016O8_n9818AviBarArt = new boolean[] {false} ;
      T016O8_A9819AviBarT1 = new String[] {""} ;
      T016O8_n9819AviBarT1 = new boolean[] {false} ;
      T016O8_A9820AviBarTP1 = new short[1] ;
      T016O8_n9820AviBarTP1 = new boolean[] {false} ;
      T016O8_A9821AviBarT2 = new String[] {""} ;
      T016O8_n9821AviBarT2 = new boolean[] {false} ;
      T016O8_A9822AviBarTP2 = new short[1] ;
      T016O8_n9822AviBarTP2 = new boolean[] {false} ;
      T016O8_A9823AviBarT3 = new String[] {""} ;
      T016O8_n9823AviBarT3 = new boolean[] {false} ;
      T016O8_A9824AviBarTP3 = new short[1] ;
      T016O8_n9824AviBarTP3 = new boolean[] {false} ;
      T016O8_A9825AviBarAca = new String[] {""} ;
      T016O8_n9825AviBarAca = new boolean[] {false} ;
      T016O8_A9826AviSecCod = new String[] {""} ;
      T016O8_n9826AviSecCod = new boolean[] {false} ;
      T016O8_A1128AviProcod = new String[] {""} ;
      T016O8_n1128AviProcod = new boolean[] {false} ;
      T016O8_A1129AviForNfi = new int[1] ;
      T016O8_n1129AviForNfi = new boolean[] {false} ;
      T016O8_A1130AviForNff = new int[1] ;
      T016O8_n1130AviForNff = new boolean[] {false} ;
      T016O8_A396EmprCod = new String[] {""} ;
      T016O7_A407EmprNom = new String[] {""} ;
      T016O7_n407EmprNom = new boolean[] {false} ;
      T016O9_A407EmprNom = new String[] {""} ;
      T016O9_n407EmprNom = new boolean[] {false} ;
      T016O10_A396EmprCod = new String[] {""} ;
      T016O10_A1131AviNumero = new long[1] ;
      T016O6_A1131AviNumero = new long[1] ;
      T016O6_A9814AviCliCod = new int[1] ;
      T016O6_n9814AviCliCod = new boolean[] {false} ;
      T016O6_A9815AviBarSer = new String[] {""} ;
      T016O6_n9815AviBarSer = new boolean[] {false} ;
      T016O6_A9816AviForNum = new int[1] ;
      T016O6_n9816AviForNum = new boolean[] {false} ;
      T016O6_A9817AviBarTip = new byte[1] ;
      T016O6_n9817AviBarTip = new boolean[] {false} ;
      T016O6_A9818AviBarArt = new short[1] ;
      T016O6_n9818AviBarArt = new boolean[] {false} ;
      T016O6_A9819AviBarT1 = new String[] {""} ;
      T016O6_n9819AviBarT1 = new boolean[] {false} ;
      T016O6_A9820AviBarTP1 = new short[1] ;
      T016O6_n9820AviBarTP1 = new boolean[] {false} ;
      T016O6_A9821AviBarT2 = new String[] {""} ;
      T016O6_n9821AviBarT2 = new boolean[] {false} ;
      T016O6_A9822AviBarTP2 = new short[1] ;
      T016O6_n9822AviBarTP2 = new boolean[] {false} ;
      T016O6_A9823AviBarT3 = new String[] {""} ;
      T016O6_n9823AviBarT3 = new boolean[] {false} ;
      T016O6_A9824AviBarTP3 = new short[1] ;
      T016O6_n9824AviBarTP3 = new boolean[] {false} ;
      T016O6_A9825AviBarAca = new String[] {""} ;
      T016O6_n9825AviBarAca = new boolean[] {false} ;
      T016O6_A9826AviSecCod = new String[] {""} ;
      T016O6_n9826AviSecCod = new boolean[] {false} ;
      T016O6_A1128AviProcod = new String[] {""} ;
      T016O6_n1128AviProcod = new boolean[] {false} ;
      T016O6_A1129AviForNfi = new int[1] ;
      T016O6_n1129AviForNfi = new boolean[] {false} ;
      T016O6_A1130AviForNff = new int[1] ;
      T016O6_n1130AviForNff = new boolean[] {false} ;
      T016O6_A396EmprCod = new String[] {""} ;
      sMode1354 = "" ;
      T016O11_A396EmprCod = new String[] {""} ;
      T016O11_A1131AviNumero = new long[1] ;
      T016O12_A396EmprCod = new String[] {""} ;
      T016O12_A1131AviNumero = new long[1] ;
      T016O5_A1131AviNumero = new long[1] ;
      T016O5_A9814AviCliCod = new int[1] ;
      T016O5_n9814AviCliCod = new boolean[] {false} ;
      T016O5_A9815AviBarSer = new String[] {""} ;
      T016O5_n9815AviBarSer = new boolean[] {false} ;
      T016O5_A9816AviForNum = new int[1] ;
      T016O5_n9816AviForNum = new boolean[] {false} ;
      T016O5_A9817AviBarTip = new byte[1] ;
      T016O5_n9817AviBarTip = new boolean[] {false} ;
      T016O5_A9818AviBarArt = new short[1] ;
      T016O5_n9818AviBarArt = new boolean[] {false} ;
      T016O5_A9819AviBarT1 = new String[] {""} ;
      T016O5_n9819AviBarT1 = new boolean[] {false} ;
      T016O5_A9820AviBarTP1 = new short[1] ;
      T016O5_n9820AviBarTP1 = new boolean[] {false} ;
      T016O5_A9821AviBarT2 = new String[] {""} ;
      T016O5_n9821AviBarT2 = new boolean[] {false} ;
      T016O5_A9822AviBarTP2 = new short[1] ;
      T016O5_n9822AviBarTP2 = new boolean[] {false} ;
      T016O5_A9823AviBarT3 = new String[] {""} ;
      T016O5_n9823AviBarT3 = new boolean[] {false} ;
      T016O5_A9824AviBarTP3 = new short[1] ;
      T016O5_n9824AviBarTP3 = new boolean[] {false} ;
      T016O5_A9825AviBarAca = new String[] {""} ;
      T016O5_n9825AviBarAca = new boolean[] {false} ;
      T016O5_A9826AviSecCod = new String[] {""} ;
      T016O5_n9826AviSecCod = new boolean[] {false} ;
      T016O5_A1128AviProcod = new String[] {""} ;
      T016O5_n1128AviProcod = new boolean[] {false} ;
      T016O5_A1129AviForNfi = new int[1] ;
      T016O5_n1129AviForNfi = new boolean[] {false} ;
      T016O5_A1130AviForNff = new int[1] ;
      T016O5_n1130AviForNff = new boolean[] {false} ;
      T016O5_A396EmprCod = new String[] {""} ;
      T016O16_A407EmprNom = new String[] {""} ;
      T016O16_n407EmprNom = new boolean[] {false} ;
      T016O17_A396EmprCod = new String[] {""} ;
      T016O17_A1131AviNumero = new long[1] ;
      Z1132AviTxt2 = "" ;
      Z460FasDsc = "" ;
      T016O18_A1132AviTxt2 = new String[] {""} ;
      T016O18_n1132AviTxt2 = new boolean[] {false} ;
      T016O18_A1131AviNumero = new long[1] ;
      T016O18_A460FasDsc = new String[] {""} ;
      T016O18_A396EmprCod = new String[] {""} ;
      T016O18_A457FasCod = new String[] {""} ;
      T016O4_A460FasDsc = new String[] {""} ;
      T016O19_A460FasDsc = new String[] {""} ;
      T016O20_A396EmprCod = new String[] {""} ;
      T016O20_A1131AviNumero = new long[1] ;
      T016O20_A457FasCod = new String[] {""} ;
      T016O3_A1132AviTxt2 = new String[] {""} ;
      T016O3_n1132AviTxt2 = new boolean[] {false} ;
      T016O3_A1131AviNumero = new long[1] ;
      T016O3_A396EmprCod = new String[] {""} ;
      T016O3_A457FasCod = new String[] {""} ;
      T016O2_A1132AviTxt2 = new String[] {""} ;
      T016O2_n1132AviTxt2 = new boolean[] {false} ;
      T016O2_A1131AviNumero = new long[1] ;
      T016O2_A396EmprCod = new String[] {""} ;
      T016O2_A457FasCod = new String[] {""} ;
      T016O24_A460FasDsc = new String[] {""} ;
      T016O25_A396EmprCod = new String[] {""} ;
      T016O25_A1131AviNumero = new long[1] ;
      T016O25_A457FasCod = new String[] {""} ;
      Gridtavi000_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtavi000_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtavi000_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ9815AviBarSer = "" ;
      ZZ9819AviBarT1 = "" ;
      ZZ9821AviBarT2 = "" ;
      ZZ9823AviBarT3 = "" ;
      ZZ9825AviBarAca = "" ;
      ZZ9826AviSecCod = "" ;
      ZZ1128AviProcod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tavi000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tavi000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tavi000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tavi000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tavi000__default(),
         new Object[] {
             new Object[] {
            T016O2_A1132AviTxt2, T016O2_n1132AviTxt2, T016O2_A1131AviNumero, T016O2_A396EmprCod, T016O2_A457FasCod
            }
            , new Object[] {
            T016O3_A1132AviTxt2, T016O3_n1132AviTxt2, T016O3_A1131AviNumero, T016O3_A396EmprCod, T016O3_A457FasCod
            }
            , new Object[] {
            T016O4_A460FasDsc
            }
            , new Object[] {
            T016O5_A1131AviNumero, T016O5_A9814AviCliCod, T016O5_n9814AviCliCod, T016O5_A9815AviBarSer, T016O5_n9815AviBarSer, T016O5_A9816AviForNum, T016O5_n9816AviForNum, T016O5_A9817AviBarTip, T016O5_n9817AviBarTip, T016O5_A9818AviBarArt,
            T016O5_n9818AviBarArt, T016O5_A9819AviBarT1, T016O5_n9819AviBarT1, T016O5_A9820AviBarTP1, T016O5_n9820AviBarTP1, T016O5_A9821AviBarT2, T016O5_n9821AviBarT2, T016O5_A9822AviBarTP2, T016O5_n9822AviBarTP2, T016O5_A9823AviBarT3,
            T016O5_n9823AviBarT3, T016O5_A9824AviBarTP3, T016O5_n9824AviBarTP3, T016O5_A9825AviBarAca, T016O5_n9825AviBarAca, T016O5_A9826AviSecCod, T016O5_n9826AviSecCod, T016O5_A1128AviProcod, T016O5_n1128AviProcod, T016O5_A1129AviForNfi,
            T016O5_n1129AviForNfi, T016O5_A1130AviForNff, T016O5_n1130AviForNff, T016O5_A396EmprCod
            }
            , new Object[] {
            T016O6_A1131AviNumero, T016O6_A9814AviCliCod, T016O6_n9814AviCliCod, T016O6_A9815AviBarSer, T016O6_n9815AviBarSer, T016O6_A9816AviForNum, T016O6_n9816AviForNum, T016O6_A9817AviBarTip, T016O6_n9817AviBarTip, T016O6_A9818AviBarArt,
            T016O6_n9818AviBarArt, T016O6_A9819AviBarT1, T016O6_n9819AviBarT1, T016O6_A9820AviBarTP1, T016O6_n9820AviBarTP1, T016O6_A9821AviBarT2, T016O6_n9821AviBarT2, T016O6_A9822AviBarTP2, T016O6_n9822AviBarTP2, T016O6_A9823AviBarT3,
            T016O6_n9823AviBarT3, T016O6_A9824AviBarTP3, T016O6_n9824AviBarTP3, T016O6_A9825AviBarAca, T016O6_n9825AviBarAca, T016O6_A9826AviSecCod, T016O6_n9826AviSecCod, T016O6_A1128AviProcod, T016O6_n1128AviProcod, T016O6_A1129AviForNfi,
            T016O6_n1129AviForNfi, T016O6_A1130AviForNff, T016O6_n1130AviForNff, T016O6_A396EmprCod
            }
            , new Object[] {
            T016O7_A407EmprNom, T016O7_n407EmprNom
            }
            , new Object[] {
            T016O8_A1131AviNumero, T016O8_A407EmprNom, T016O8_n407EmprNom, T016O8_A9814AviCliCod, T016O8_n9814AviCliCod, T016O8_A9815AviBarSer, T016O8_n9815AviBarSer, T016O8_A9816AviForNum, T016O8_n9816AviForNum, T016O8_A9817AviBarTip,
            T016O8_n9817AviBarTip, T016O8_A9818AviBarArt, T016O8_n9818AviBarArt, T016O8_A9819AviBarT1, T016O8_n9819AviBarT1, T016O8_A9820AviBarTP1, T016O8_n9820AviBarTP1, T016O8_A9821AviBarT2, T016O8_n9821AviBarT2, T016O8_A9822AviBarTP2,
            T016O8_n9822AviBarTP2, T016O8_A9823AviBarT3, T016O8_n9823AviBarT3, T016O8_A9824AviBarTP3, T016O8_n9824AviBarTP3, T016O8_A9825AviBarAca, T016O8_n9825AviBarAca, T016O8_A9826AviSecCod, T016O8_n9826AviSecCod, T016O8_A1128AviProcod,
            T016O8_n1128AviProcod, T016O8_A1129AviForNfi, T016O8_n1129AviForNfi, T016O8_A1130AviForNff, T016O8_n1130AviForNff, T016O8_A396EmprCod
            }
            , new Object[] {
            T016O9_A407EmprNom, T016O9_n407EmprNom
            }
            , new Object[] {
            T016O10_A396EmprCod, T016O10_A1131AviNumero
            }
            , new Object[] {
            T016O11_A396EmprCod, T016O11_A1131AviNumero
            }
            , new Object[] {
            T016O12_A396EmprCod, T016O12_A1131AviNumero
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016O16_A407EmprNom, T016O16_n407EmprNom
            }
            , new Object[] {
            T016O17_A396EmprCod, T016O17_A1131AviNumero
            }
            , new Object[] {
            T016O18_A1132AviTxt2, T016O18_n1132AviTxt2, T016O18_A1131AviNumero, T016O18_A460FasDsc, T016O18_A396EmprCod, T016O18_A457FasCod
            }
            , new Object[] {
            T016O19_A460FasDsc
            }
            , new Object[] {
            T016O20_A396EmprCod, T016O20_A1131AviNumero, T016O20_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016O24_A460FasDsc
            }
            , new Object[] {
            T016O25_A396EmprCod, T016O25_A1131AviNumero, T016O25_A457FasCod
            }
         }
      );
   }

   private byte Z9817AviBarTip ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A9817AviBarTip ;
   private byte Gx_BScreen ;
   private byte subGridtavi000_level1item_Backcolorstyle ;
   private byte subGridtavi000_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtavi000_level1item_Allowselection ;
   private byte subGridtavi000_level1item_Allowhovering ;
   private byte subGridtavi000_level1item_Allowcollapsing ;
   private byte subGridtavi000_level1item_Collapsed ;
   private byte ZZ9817AviBarTip ;
   private short Z9818AviBarArt ;
   private short Z9820AviBarTP1 ;
   private short Z9822AviBarTP2 ;
   private short Z9824AviBarTP3 ;
   private short nRcdDeleted_1355 ;
   private short nRcdExists_1355 ;
   private short nIsMod_1355 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9818AviBarArt ;
   private short A9820AviBarTP1 ;
   private short A9822AviBarTP2 ;
   private short A9824AviBarTP3 ;
   private short nBlankRcdCount1355 ;
   private short RcdFound1355 ;
   private short nBlankRcdUsr1355 ;
   private short RcdFound1354 ;
   private short nIsDirty_1354 ;
   private short nIsDirty_1355 ;
   private short ZZ9818AviBarArt ;
   private short ZZ9820AviBarTP1 ;
   private short ZZ9822AviBarTP2 ;
   private short ZZ9824AviBarTP3 ;
   private int Z9814AviCliCod ;
   private int Z9816AviForNum ;
   private int Z1129AviForNfi ;
   private int Z1130AviForNff ;
   private int nRC_GXsfl_124 ;
   private int nGXsfl_124_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAviNumero_Enabled ;
   private int A9814AviCliCod ;
   private int edtAviCliCod_Enabled ;
   private int edtAviBarSer_Enabled ;
   private int A9816AviForNum ;
   private int edtAviForNum_Enabled ;
   private int edtAviBarTip_Enabled ;
   private int edtAviBarArt_Enabled ;
   private int edtAviBarT1_Enabled ;
   private int edtAviBarTP1_Enabled ;
   private int edtAviBarT2_Enabled ;
   private int edtAviBarTP2_Enabled ;
   private int edtAviBarT3_Enabled ;
   private int edtAviBarTP3_Enabled ;
   private int edtAviBarAca_Enabled ;
   private int edtAviSecCod_Enabled ;
   private int edtAviProcod_Enabled ;
   private int A1129AviForNfi ;
   private int edtAviForNfi_Enabled ;
   private int A1130AviForNff ;
   private int edtAviForNff_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtAviTxt2_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtavi000_level1item_Backcolor ;
   private int subGridtavi000_level1item_Allbackcolor ;
   private int defedtFasCod_Enabled ;
   private int idxLst ;
   private int subGridtavi000_level1item_Selectedindex ;
   private int subGridtavi000_level1item_Selectioncolor ;
   private int subGridtavi000_level1item_Hoveringcolor ;
   private int ZZ9814AviCliCod ;
   private int ZZ9816AviForNum ;
   private int ZZ1129AviForNfi ;
   private int ZZ1130AviForNff ;
   private long Z1131AviNumero ;
   private long A1131AviNumero ;
   private long GRIDTAVI000_LEVEL1ITEM_nFirstRecordOnPage ;
   private long ZZ1131AviNumero ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9815AviBarSer ;
   private String Z9819AviBarT1 ;
   private String Z9821AviBarT2 ;
   private String Z9823AviBarT3 ;
   private String Z9825AviBarAca ;
   private String Z9826AviSecCod ;
   private String Z1128AviProcod ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_124_idx="0001" ;
   private String Gx_mode ;
   private String divTablemain_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtAviNumero_Internalname ;
   private String edtAviNumero_Jsonclick ;
   private String edtAviCliCod_Internalname ;
   private String edtAviCliCod_Jsonclick ;
   private String edtAviBarSer_Internalname ;
   private String A9815AviBarSer ;
   private String edtAviBarSer_Jsonclick ;
   private String edtAviForNum_Internalname ;
   private String edtAviForNum_Jsonclick ;
   private String edtAviBarTip_Internalname ;
   private String edtAviBarTip_Jsonclick ;
   private String edtAviBarArt_Internalname ;
   private String edtAviBarArt_Jsonclick ;
   private String edtAviBarT1_Internalname ;
   private String A9819AviBarT1 ;
   private String edtAviBarT1_Jsonclick ;
   private String edtAviBarTP1_Internalname ;
   private String edtAviBarTP1_Jsonclick ;
   private String edtAviBarT2_Internalname ;
   private String A9821AviBarT2 ;
   private String edtAviBarT2_Jsonclick ;
   private String edtAviBarTP2_Internalname ;
   private String edtAviBarTP2_Jsonclick ;
   private String edtAviBarT3_Internalname ;
   private String A9823AviBarT3 ;
   private String edtAviBarT3_Jsonclick ;
   private String edtAviBarTP3_Internalname ;
   private String edtAviBarTP3_Jsonclick ;
   private String edtAviBarAca_Internalname ;
   private String A9825AviBarAca ;
   private String edtAviBarAca_Jsonclick ;
   private String edtAviSecCod_Internalname ;
   private String A9826AviSecCod ;
   private String edtAviSecCod_Jsonclick ;
   private String edtAviProcod_Internalname ;
   private String A1128AviProcod ;
   private String edtAviProcod_Jsonclick ;
   private String edtAviForNfi_Internalname ;
   private String edtAviForNfi_Jsonclick ;
   private String edtAviForNff_Internalname ;
   private String edtAviForNff_Jsonclick ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1355 ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtAviTxt2_Internalname ;
   private String sStyleString ;
   private String subGridtavi000_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String Z407EmprNom ;
   private String sMode1354 ;
   private String Z460FasDsc ;
   private String sGXsfl_124_fel_idx="0001" ;
   private String subGridtavi000_level1item_Class ;
   private String subGridtavi000_level1item_Linesclass ;
   private String ROClassString ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtAviTxt2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtavi000_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ9815AviBarSer ;
   private String ZZ9819AviBarT1 ;
   private String ZZ9821AviBarT2 ;
   private String ZZ9823AviBarT3 ;
   private String ZZ9825AviBarAca ;
   private String ZZ9826AviSecCod ;
   private String ZZ1128AviProcod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_124_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9814AviCliCod ;
   private boolean n9815AviBarSer ;
   private boolean n9816AviForNum ;
   private boolean n9817AviBarTip ;
   private boolean n9818AviBarArt ;
   private boolean n9819AviBarT1 ;
   private boolean n9820AviBarTP1 ;
   private boolean n9821AviBarT2 ;
   private boolean n9822AviBarTP2 ;
   private boolean n9823AviBarT3 ;
   private boolean n9824AviBarTP3 ;
   private boolean n9825AviBarAca ;
   private boolean n9826AviSecCod ;
   private boolean n1128AviProcod ;
   private boolean n1129AviForNfi ;
   private boolean n1130AviForNff ;
   private boolean Gx_longc ;
   private boolean n1132AviTxt2 ;
   private String A1132AviTxt2 ;
   private String Z1132AviTxt2 ;
   private com.genexus.webpanels.GXWebGrid Gridtavi000_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtavi000_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtavi000_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private long[] T016O8_A1131AviNumero ;
   private String[] T016O8_A407EmprNom ;
   private boolean[] T016O8_n407EmprNom ;
   private int[] T016O8_A9814AviCliCod ;
   private boolean[] T016O8_n9814AviCliCod ;
   private String[] T016O8_A9815AviBarSer ;
   private boolean[] T016O8_n9815AviBarSer ;
   private int[] T016O8_A9816AviForNum ;
   private boolean[] T016O8_n9816AviForNum ;
   private byte[] T016O8_A9817AviBarTip ;
   private boolean[] T016O8_n9817AviBarTip ;
   private short[] T016O8_A9818AviBarArt ;
   private boolean[] T016O8_n9818AviBarArt ;
   private String[] T016O8_A9819AviBarT1 ;
   private boolean[] T016O8_n9819AviBarT1 ;
   private short[] T016O8_A9820AviBarTP1 ;
   private boolean[] T016O8_n9820AviBarTP1 ;
   private String[] T016O8_A9821AviBarT2 ;
   private boolean[] T016O8_n9821AviBarT2 ;
   private short[] T016O8_A9822AviBarTP2 ;
   private boolean[] T016O8_n9822AviBarTP2 ;
   private String[] T016O8_A9823AviBarT3 ;
   private boolean[] T016O8_n9823AviBarT3 ;
   private short[] T016O8_A9824AviBarTP3 ;
   private boolean[] T016O8_n9824AviBarTP3 ;
   private String[] T016O8_A9825AviBarAca ;
   private boolean[] T016O8_n9825AviBarAca ;
   private String[] T016O8_A9826AviSecCod ;
   private boolean[] T016O8_n9826AviSecCod ;
   private String[] T016O8_A1128AviProcod ;
   private boolean[] T016O8_n1128AviProcod ;
   private int[] T016O8_A1129AviForNfi ;
   private boolean[] T016O8_n1129AviForNfi ;
   private int[] T016O8_A1130AviForNff ;
   private boolean[] T016O8_n1130AviForNff ;
   private String[] T016O8_A396EmprCod ;
   private String[] T016O7_A407EmprNom ;
   private boolean[] T016O7_n407EmprNom ;
   private String[] T016O9_A407EmprNom ;
   private boolean[] T016O9_n407EmprNom ;
   private String[] T016O10_A396EmprCod ;
   private long[] T016O10_A1131AviNumero ;
   private long[] T016O6_A1131AviNumero ;
   private int[] T016O6_A9814AviCliCod ;
   private boolean[] T016O6_n9814AviCliCod ;
   private String[] T016O6_A9815AviBarSer ;
   private boolean[] T016O6_n9815AviBarSer ;
   private int[] T016O6_A9816AviForNum ;
   private boolean[] T016O6_n9816AviForNum ;
   private byte[] T016O6_A9817AviBarTip ;
   private boolean[] T016O6_n9817AviBarTip ;
   private short[] T016O6_A9818AviBarArt ;
   private boolean[] T016O6_n9818AviBarArt ;
   private String[] T016O6_A9819AviBarT1 ;
   private boolean[] T016O6_n9819AviBarT1 ;
   private short[] T016O6_A9820AviBarTP1 ;
   private boolean[] T016O6_n9820AviBarTP1 ;
   private String[] T016O6_A9821AviBarT2 ;
   private boolean[] T016O6_n9821AviBarT2 ;
   private short[] T016O6_A9822AviBarTP2 ;
   private boolean[] T016O6_n9822AviBarTP2 ;
   private String[] T016O6_A9823AviBarT3 ;
   private boolean[] T016O6_n9823AviBarT3 ;
   private short[] T016O6_A9824AviBarTP3 ;
   private boolean[] T016O6_n9824AviBarTP3 ;
   private String[] T016O6_A9825AviBarAca ;
   private boolean[] T016O6_n9825AviBarAca ;
   private String[] T016O6_A9826AviSecCod ;
   private boolean[] T016O6_n9826AviSecCod ;
   private String[] T016O6_A1128AviProcod ;
   private boolean[] T016O6_n1128AviProcod ;
   private int[] T016O6_A1129AviForNfi ;
   private boolean[] T016O6_n1129AviForNfi ;
   private int[] T016O6_A1130AviForNff ;
   private boolean[] T016O6_n1130AviForNff ;
   private String[] T016O6_A396EmprCod ;
   private String[] T016O11_A396EmprCod ;
   private long[] T016O11_A1131AviNumero ;
   private String[] T016O12_A396EmprCod ;
   private long[] T016O12_A1131AviNumero ;
   private long[] T016O5_A1131AviNumero ;
   private int[] T016O5_A9814AviCliCod ;
   private boolean[] T016O5_n9814AviCliCod ;
   private String[] T016O5_A9815AviBarSer ;
   private boolean[] T016O5_n9815AviBarSer ;
   private int[] T016O5_A9816AviForNum ;
   private boolean[] T016O5_n9816AviForNum ;
   private byte[] T016O5_A9817AviBarTip ;
   private boolean[] T016O5_n9817AviBarTip ;
   private short[] T016O5_A9818AviBarArt ;
   private boolean[] T016O5_n9818AviBarArt ;
   private String[] T016O5_A9819AviBarT1 ;
   private boolean[] T016O5_n9819AviBarT1 ;
   private short[] T016O5_A9820AviBarTP1 ;
   private boolean[] T016O5_n9820AviBarTP1 ;
   private String[] T016O5_A9821AviBarT2 ;
   private boolean[] T016O5_n9821AviBarT2 ;
   private short[] T016O5_A9822AviBarTP2 ;
   private boolean[] T016O5_n9822AviBarTP2 ;
   private String[] T016O5_A9823AviBarT3 ;
   private boolean[] T016O5_n9823AviBarT3 ;
   private short[] T016O5_A9824AviBarTP3 ;
   private boolean[] T016O5_n9824AviBarTP3 ;
   private String[] T016O5_A9825AviBarAca ;
   private boolean[] T016O5_n9825AviBarAca ;
   private String[] T016O5_A9826AviSecCod ;
   private boolean[] T016O5_n9826AviSecCod ;
   private String[] T016O5_A1128AviProcod ;
   private boolean[] T016O5_n1128AviProcod ;
   private int[] T016O5_A1129AviForNfi ;
   private boolean[] T016O5_n1129AviForNfi ;
   private int[] T016O5_A1130AviForNff ;
   private boolean[] T016O5_n1130AviForNff ;
   private String[] T016O5_A396EmprCod ;
   private String[] T016O16_A407EmprNom ;
   private boolean[] T016O16_n407EmprNom ;
   private String[] T016O17_A396EmprCod ;
   private long[] T016O17_A1131AviNumero ;
   private String[] T016O18_A1132AviTxt2 ;
   private boolean[] T016O18_n1132AviTxt2 ;
   private long[] T016O18_A1131AviNumero ;
   private String[] T016O18_A460FasDsc ;
   private String[] T016O18_A396EmprCod ;
   private String[] T016O18_A457FasCod ;
   private String[] T016O4_A460FasDsc ;
   private String[] T016O19_A460FasDsc ;
   private String[] T016O20_A396EmprCod ;
   private long[] T016O20_A1131AviNumero ;
   private String[] T016O20_A457FasCod ;
   private String[] T016O3_A1132AviTxt2 ;
   private boolean[] T016O3_n1132AviTxt2 ;
   private long[] T016O3_A1131AviNumero ;
   private String[] T016O3_A396EmprCod ;
   private String[] T016O3_A457FasCod ;
   private String[] T016O2_A1132AviTxt2 ;
   private boolean[] T016O2_n1132AviTxt2 ;
   private long[] T016O2_A1131AviNumero ;
   private String[] T016O2_A396EmprCod ;
   private String[] T016O2_A457FasCod ;
   private String[] T016O24_A460FasDsc ;
   private String[] T016O25_A396EmprCod ;
   private long[] T016O25_A1131AviNumero ;
   private String[] T016O25_A457FasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tavi000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tavi000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tavi000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tavi000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tavi000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016O2", "SELECT AviTxt2, AviNumero, EmprCod, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND AviNumero = ? AND FasCod = ?  FOR UPDATE OF AviTxt2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O3", "SELECT AviTxt2, AviNumero, EmprCod, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND AviNumero = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O4", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O5", "SELECT AviNumero, AviCliCod, AviBarSer, AviForNum, AviBarTip, AviBarArt, AviBarT1, AviBarTP1, AviBarT2, AviBarTP2, AviBarT3, AviBarTP3, AviBarAca, AviSecCod, AviProcod, AviForNfi, AviForNff, EmprCod FROM TXPAVI000 WHERE EmprCod = ? AND AviNumero = ?  FOR UPDATE OF AviCliCod, AviBarSer, AviForNum, AviBarTip, AviBarArt, AviBarT1, AviBarTP1, AviBarT2, AviBarTP2, AviBarT3, AviBarTP3, AviBarAca, AviSecCod, AviProcod, AviForNfi, AviForNff NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O6", "SELECT AviNumero, AviCliCod, AviBarSer, AviForNum, AviBarTip, AviBarArt, AviBarT1, AviBarTP1, AviBarT2, AviBarTP2, AviBarT3, AviBarTP3, AviBarAca, AviSecCod, AviProcod, AviForNfi, AviForNff, EmprCod FROM TXPAVI000 WHERE EmprCod = ? AND AviNumero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O8", "SELECT /*+ FIRST_ROWS(100) */ TM1.AviNumero, T2.EmprNom, TM1.AviCliCod, TM1.AviBarSer, TM1.AviForNum, TM1.AviBarTip, TM1.AviBarArt, TM1.AviBarT1, TM1.AviBarTP1, TM1.AviBarT2, TM1.AviBarTP2, TM1.AviBarT3, TM1.AviBarTP3, TM1.AviBarAca, TM1.AviSecCod, TM1.AviProcod, TM1.AviForNfi, TM1.AviForNff, TM1.EmprCod FROM (TXPAVI000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AviNumero = ? ORDER BY TM1.EmprCod, TM1.AviNumero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AviNumero FROM TXPAVI000 WHERE EmprCod = ? AND AviNumero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AviNumero FROM TXPAVI000 WHERE ( EmprCod > ? or EmprCod = ? and AviNumero > ?) ORDER BY EmprCod, AviNumero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016O12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AviNumero FROM TXPAVI000 WHERE ( EmprCod < ? or EmprCod = ? and AviNumero < ?) ORDER BY EmprCod DESC, AviNumero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016O13", "INSERT INTO TXPAVI000(AviNumero, AviCliCod, AviBarSer, AviForNum, AviBarTip, AviBarArt, AviBarT1, AviBarTP1, AviBarT2, AviBarTP2, AviBarT3, AviBarTP3, AviBarAca, AviSecCod, AviProcod, AviForNfi, AviForNff, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAVI000")
         ,new UpdateCursor("T016O14", "UPDATE TXPAVI000 SET AviCliCod=?, AviBarSer=?, AviForNum=?, AviBarTip=?, AviBarArt=?, AviBarT1=?, AviBarTP1=?, AviBarT2=?, AviBarTP2=?, AviBarT3=?, AviBarTP3=?, AviBarAca=?, AviSecCod=?, AviProcod=?, AviForNfi=?, AviForNff=?  WHERE EmprCod = ? AND AviNumero = ?", GX_NOMASK, "TXPAVI000")
         ,new UpdateCursor("T016O15", "DELETE FROM TXPAVI000  WHERE EmprCod = ? AND AviNumero = ?", GX_NOMASK, "TXPAVI000")
         ,new ForEachCursor("T016O16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AviNumero FROM TXPAVI000 ORDER BY EmprCod, AviNumero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O18", "SELECT T1.AviTxt2, T1.AviNumero, T2.FasDsc, T1.EmprCod, T1.FasCod FROM (TXPAVI001 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AviNumero = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.AviNumero, T1.FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O19", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O20", "SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND AviNumero = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016O21", "INSERT INTO TXPAVI001(AviNumero, AviTxt2, EmprCod, FasCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPAVI001")
         ,new UpdateCursor("T016O22", "UPDATE TXPAVI001 SET AviTxt2=?  WHERE EmprCod = ? AND AviNumero = ? AND FasCod = ?", GX_NOMASK, "TXPAVI001")
         ,new UpdateCursor("T016O23", "DELETE FROM TXPAVI001  WHERE EmprCod = ? AND AviNumero = ? AND FasCod = ?", GX_NOMASK, "TXPAVI001")
         ,new ForEachCursor("T016O24", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016O25", "SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? and AviNumero = ? ORDER BY EmprCod, AviNumero, FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 3);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 8);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[32]).intValue());
               }
               stmt.setString(18, (String)parms[33], 3);
               return;
            case 12 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               stmt.setString(17, (String)parms[32], 3);
               stmt.setLong(18, ((Number) parms[33]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[2]);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(1, (String)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

