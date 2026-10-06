package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmezcli_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5809MMezCod = httpContext.GetPar( "MMezCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod, A5809MMezCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A252CliCod, A65ArtCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtmezcli_level1item") == 0 )
      {
         gxnrgridtmezcli_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAESTRO MEZCLAS CLIENTE", ""), (short)(0)) ;
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

   public void gxnrgridtmezcli_level1item_newrow_invoke( )
   {
      nRC_GXsfl_84 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_84"))) ;
      nGXsfl_84_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_84_idx"))) ;
      sGXsfl_84_idx = httpContext.GetPar( "sGXsfl_84_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtmezcli_level1item_newrow( ) ;
      /* End function gxnrGridtmezcli_level1item_newrow_invoke */
   }

   public tmezcli_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmezcli_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmezcli_impl.class ));
   }

   public tmezcli_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MAESTRO MEZCLAS CLIENTE", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMEZCLI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezCod_Internalname, httpContext.getMessage( "Codigo de Mezcla", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezCod_Internalname, GXutil.rtrim( A5809MMezCod), GXutil.rtrim( localUtil.format( A5809MMezCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezCod_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezKgs_Internalname, httpContext.getMessage( "Kgs necesarios Materia Mezcla", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A5810MMezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezKgs_Enabled!=0) ? localUtil.format( A5810MMezKgs, "ZZZZZ9.99") : localUtil.format( A5810MMezKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezKgs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezPda_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezPda_Internalname, httpContext.getMessage( "Numero Partida Mezcla", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPda_Internalname, GXutil.rtrim( A5811MMezPda), GXutil.rtrim( localUtil.format( A5811MMezPda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPda_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezFecPda_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezFecPda_Internalname, httpContext.getMessage( "Fecha Partida Mezcla", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMMezFecPda_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecPda_Internalname, localUtil.format(A5812MMezFecPda, "99/99/99"), localUtil.format( A5812MMezFecPda, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecPda_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezFecPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecPda_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecPda_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCLI.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezFecEnt_Internalname, httpContext.getMessage( "Fecha Entrega Cli. Mezclas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMMezFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezFecEnt_Internalname, localUtil.format(A5813MMezFecEnt, "99/99/99"), localUtil.format( A5813MMezFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezFecEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMMezFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMMezFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCLI.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezPorTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezPorTot_Internalname, httpContext.getMessage( "Porcentaje Total Mezcla HSS", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPorTot_Internalname, GXutil.ltrim( localUtil.ntoc( A5814MMezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezPorTot_Enabled!=0) ? localUtil.format( A5814MMezPorTot, "ZZ9.99") : localUtil.format( A5814MMezPorTot, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPorTot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezPorTot_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMezPorT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMezPorT_Internalname, httpContext.getMessage( "Suma Porcentaje Mezcla Articul", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMezPorT_Internalname, GXutil.ltrim( localUtil.ntoc( A5815MMezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMezPorT_Enabled!=0) ? localUtil.format( A5815MMezPorT, "ZZ9.99") : localUtil.format( A5815MMezPorT, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMezPorT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMezPorT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridtmezcli_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtmezcli_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol84( ) ;
      nGXsfl_84_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1582 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1582 = (short)(1) ;
            scanStart1FQ1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               init_level_properties1582( ) ;
               getByPrimaryKey1FQ1582( ) ;
               addRow1FQ1582( ) ;
               scanNext1FQ1582( ) ;
            }
            scanEnd1FQ1582( ) ;
            nBlankRcdCount1582 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5815MMezPorT = A5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         standaloneNotModal1FQ1582( ) ;
         standaloneModal1FQ1582( ) ;
         sMode1582 = Gx_mode ;
         while ( nGXsfl_84_idx < nRC_GXsfl_84 )
         {
            bGXsfl_84_Refreshing = true ;
            readRow1FQ1582( ) ;
            edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMmezUltCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTCOL_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMmezUltPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTPAR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMmezArtPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPOR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPor_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            edtMmezArtKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTKIL_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMmezArtKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtKil_Enabled), 5, 0), !bGXsfl_84_Refreshing);
            if ( ( nRcdExists_1582 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FQ1582( ) ;
            }
            sendRow1FQ1582( ) ;
            bGXsfl_84_Refreshing = false ;
         }
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5815MMezPorT = B5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1582 = (short)(5) ;
         nRcdExists_1582 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FQ1582( ) ;
            while ( RcdFound1582 != 0 )
            {
               sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_841582( ) ;
               init_level_properties1582( ) ;
               standaloneNotModal1FQ1582( ) ;
               getByPrimaryKey1FQ1582( ) ;
               standaloneModal1FQ1582( ) ;
               addRow1FQ1582( ) ;
               scanNext1FQ1582( ) ;
            }
            scanEnd1FQ1582( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1582 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_841582( ) ;
      initAll1FQ1582( ) ;
      init_level_properties1582( ) ;
      B5815MMezPorT = A5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
      nBlankRcdCount1582 = (short)(nBlankRcdUsr1582+nBlankRcdCount1582) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1582 > 0 )
      {
         standaloneNotModal1FQ1582( ) ;
         standaloneModal1FQ1582( ) ;
         addRow1FQ1582( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1582 = (short)(nBlankRcdCount1582-1) ;
      }
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5815MMezPorT = B5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtmezcli_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtmezcli_level1item", Gridtmezcli_level1itemContainer, subGridtmezcli_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmezcli_level1itemContainerData", Gridtmezcli_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmezcli_level1itemContainerData"+"V", Gridtmezcli_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtmezcli_level1itemContainerData"+"V"+"\" value='"+Gridtmezcli_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5809MMezCod = httpContext.cgiGet( "Z5809MMezCod") ;
         Z5810MMezKgs = localUtil.ctond( httpContext.cgiGet( "Z5810MMezKgs")) ;
         Z5811MMezPda = httpContext.cgiGet( "Z5811MMezPda") ;
         Z5812MMezFecPda = localUtil.ctod( httpContext.cgiGet( "Z5812MMezFecPda"), 0) ;
         Z5813MMezFecEnt = localUtil.ctod( httpContext.cgiGet( "Z5813MMezFecEnt"), 0) ;
         Z5814MMezPorTot = localUtil.ctond( httpContext.cgiGet( "Z5814MMezPorTot")) ;
         O5815MMezPorT = localUtil.ctond( httpContext.cgiGet( "O5815MMezPorT")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_84 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A5809MMezCod = httpContext.cgiGet( edtMMezCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMezKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMezKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMEZKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMezKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5810MMezKgs = DecimalUtil.ZERO ;
            n5810MMezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         }
         else
         {
            A5810MMezKgs = localUtil.ctond( httpContext.cgiGet( edtMMezKgs_Internalname)) ;
            n5810MMezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         }
         A5811MMezPda = httpContext.cgiGet( edtMMezPda_Internalname) ;
         n5811MMezPda = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         if ( localUtil.vcdate( httpContext.cgiGet( edtMMezFecPda_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MMEZFECPDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMezFecPda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5812MMezFecPda = GXutil.nullDate() ;
            n5812MMezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         }
         else
         {
            A5812MMezFecPda = localUtil.ctod( httpContext.cgiGet( edtMMezFecPda_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5812MMezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtMMezFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MMEZFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMezFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5813MMezFecEnt = GXutil.nullDate() ;
            n5813MMezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         }
         else
         {
            A5813MMezFecEnt = localUtil.ctod( httpContext.cgiGet( edtMMezFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5813MMezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMezPorTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMezPorTot_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMEZPORTOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMezPorTot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5814MMezPorTot = DecimalUtil.ZERO ;
            n5814MMezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         }
         else
         {
            A5814MMezPorTot = localUtil.ctond( httpContext.cgiGet( edtMMezPorTot_Internalname)) ;
            n5814MMezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         }
         A5815MMezPorT = localUtil.ctond( httpContext.cgiGet( edtMMezPorT_Internalname)) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5809MMezCod = httpContext.GetPar( "MMezCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
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
            initAll1FQ1581( ) ;
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
      disableAttributes1FQ1581( ) ;
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

   public void confirm_1FQ1582( )
   {
      s5815MMezPorT = O5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1FQ1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            getKey1FQ1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               if ( RcdFound1582 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FQ1582( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FQ1582( ) ;
                     closeExtendedTableCursors1FQ1582( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5815MMezPorT = A5815MMezPorT ;
                     n5815MMezPorT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "ARTCOD_" + sGXsfl_84_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1582 != 0 )
               {
                  if ( nRcdDeleted_1582 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FQ1582( ) ;
                     load1FQ1582( ) ;
                     beforeValidate1FQ1582( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FQ1582( ) ;
                        O5815MMezPorT = A5815MMezPorT ;
                        n5815MMezPorT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FQ1582( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FQ1582( ) ;
                           closeExtendedTableCursors1FQ1582( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5815MMezPorT = A5815MMezPorT ;
                           n5815MMezPorT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1582 == 0 )
                  {
                     GXCCtl = "ARTCOD_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc)) ;
         httpContext.changePostValue( edtMMezArtDsc_Internalname, GXutil.rtrim( A5816MMezArtDsc)) ;
         httpContext.changePostValue( edtMmezUltCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezUltPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_84_idx, GXutil.rtrim( Z65ArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_84_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5819MmezArtPor_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5819MmezArtPor_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1582 != 0 )
         {
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTCOL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPOR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTKIL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5815MMezPorT = s5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FQ0( )
   {
   }

   public void zm1FQ1581( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5810MMezKgs = T01FQ6_A5810MMezKgs[0] ;
            Z5811MMezPda = T01FQ6_A5811MMezPda[0] ;
            Z5812MMezFecPda = T01FQ6_A5812MMezFecPda[0] ;
            Z5813MMezFecEnt = T01FQ6_A5813MMezFecEnt[0] ;
            Z5814MMezPorTot = T01FQ6_A5814MMezPorTot[0] ;
         }
         else
         {
            Z5810MMezKgs = A5810MMezKgs ;
            Z5811MMezPda = A5811MMezPda ;
            Z5812MMezFecPda = A5812MMezFecPda ;
            Z5813MMezFecEnt = A5813MMezFecEnt ;
            Z5814MMezPorTot = A5814MMezPorTot ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z5810MMezKgs = A5810MMezKgs ;
         Z5811MMezPda = A5811MMezPda ;
         Z5812MMezFecPda = A5812MMezFecPda ;
         Z5813MMezFecEnt = A5813MMezFecEnt ;
         Z5814MMezPorTot = A5814MMezPorTot ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z5815MMezPorT = A5815MMezPorT ;
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

   public void load1FQ1581( )
   {
      /* Using cursor T01FQ12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1581 = (short)(1) ;
         A407EmprNom = T01FQ12_A407EmprNom[0] ;
         n407EmprNom = T01FQ12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01FQ12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5810MMezKgs = T01FQ12_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FQ12_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FQ12_A5811MMezPda[0] ;
         n5811MMezPda = T01FQ12_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FQ12_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FQ12_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FQ12_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FQ12_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FQ12_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FQ12_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         A5815MMezPorT = T01FQ12_A5815MMezPorT[0] ;
         n5815MMezPorT = T01FQ12_n5815MMezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         zm1FQ1581( -3) ;
      }
      pr_default.close(8);
      onLoadActions1FQ1581( ) ;
   }

   public void onLoadActions1FQ1581( )
   {
      O5815MMezPorT = A5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
   }

   public void checkExtendedTable1FQ1581( )
   {
      nIsDirty_1581 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FQ7_A407EmprNom[0] ;
      n407EmprNom = T01FQ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01FQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FQ8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T01FQ10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A5815MMezPorT = T01FQ10_A5815MMezPorT[0] ;
         n5815MMezPorT = T01FQ10_n5815MMezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         nIsDirty_1581 = (short)(1) ;
         A5815MMezPorT = DecimalUtil.doubleToDec(0) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1FQ1581( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T01FQ13 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FQ13_A407EmprNom[0] ;
      n407EmprNom = T01FQ13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FQ14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FQ14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod ,
                         String A5809MMezCod )
   {
      /* Using cursor T01FQ16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A5815MMezPorT = T01FQ16_A5815MMezPorT[0] ;
         n5815MMezPorT = T01FQ16_n5815MMezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         A5815MMezPorT = DecimalUtil.doubleToDec(0) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5815MMezPorT, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1FQ1581( )
   {
      /* Using cursor T01FQ17 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1581 = (short)(1) ;
      }
      else
      {
         RcdFound1581 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1FQ1581( 3) ;
         RcdFound1581 = (short)(1) ;
         A5809MMezCod = T01FQ6_A5809MMezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
         A5810MMezKgs = T01FQ6_A5810MMezKgs[0] ;
         n5810MMezKgs = T01FQ6_n5810MMezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
         A5811MMezPda = T01FQ6_A5811MMezPda[0] ;
         n5811MMezPda = T01FQ6_n5811MMezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
         A5812MMezFecPda = T01FQ6_A5812MMezFecPda[0] ;
         n5812MMezFecPda = T01FQ6_n5812MMezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
         A5813MMezFecEnt = T01FQ6_A5813MMezFecEnt[0] ;
         n5813MMezFecEnt = T01FQ6_n5813MMezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
         A5814MMezPorTot = T01FQ6_A5814MMezPorTot[0] ;
         n5814MMezPorTot = T01FQ6_n5814MMezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
         A396EmprCod = T01FQ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FQ6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FQ1581( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1581 = (short)(0) ;
            initializeNonKey1FQ1581( ) ;
         }
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1581 = (short)(0) ;
         initializeNonKey1FQ1581( ) ;
         sMode1581 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1581 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1FQ1581( ) ;
      if ( RcdFound1581 == 0 )
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
      RcdFound1581 = (short)(0) ;
      /* Using cursor T01FQ18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5809MMezCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FQ18_A252CliCod[0] < A252CliCod ) || ( T01FQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FQ18_A5809MMezCod[0], A5809MMezCod) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FQ18_A252CliCod[0] > A252CliCod ) || ( T01FQ18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FQ18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FQ18_A5809MMezCod[0], A5809MMezCod) > 0 ) ) )
         {
            A396EmprCod = T01FQ18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01FQ18_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5809MMezCod = T01FQ18_A5809MMezCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1581 = (short)(0) ;
      /* Using cursor T01FQ19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5809MMezCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FQ19_A252CliCod[0] > A252CliCod ) || ( T01FQ19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FQ19_A5809MMezCod[0], A5809MMezCod) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FQ19_A252CliCod[0] < A252CliCod ) || ( T01FQ19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FQ19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FQ19_A5809MMezCod[0], A5809MMezCod) < 0 ) ) )
         {
            A396EmprCod = T01FQ19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01FQ19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5809MMezCod = T01FQ19_A5809MMezCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
            RcdFound1581 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FQ1581( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5815MMezPorT = O5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FQ1581( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1581 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A5809MMezCod = Z5809MMezCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5815MMezPorT = O5815MMezPorT ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
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
               A5815MMezPorT = O5815MMezPorT ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
               update1FQ1581( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5815MMezPorT = O5815MMezPorT ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FQ1581( ) ;
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
                  A5815MMezPorT = O5815MMezPorT ;
                  n5815MMezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FQ1581( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5809MMezCod, Z5809MMezCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5809MMezCod = Z5809MMezCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5815MMezPorT = O5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
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
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMMezKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FQ1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMezKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FQ1581( ) ;
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
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMezKgs_Internalname ;
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
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMezKgs_Internalname ;
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
      scanStart1FQ1581( ) ;
      if ( RcdFound1581 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1581 != 0 )
         {
            scanNext1FQ1581( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMezKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FQ1581( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FQ1581( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z5810MMezKgs, T01FQ5_A5810MMezKgs[0]) != 0 ) || ( GXutil.strcmp(Z5811MMezPda, T01FQ5_A5811MMezPda[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FQ5_A5812MMezFecPda[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FQ5_A5813MMezFecEnt[0])) ) || ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FQ5_A5814MMezPorTot[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5810MMezKgs, T01FQ5_A5810MMezKgs[0]) != 0 )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezKgs");
               GXutil.writeLogRaw("Old: ",Z5810MMezKgs);
               GXutil.writeLogRaw("Current: ",T01FQ5_A5810MMezKgs[0]);
            }
            if ( GXutil.strcmp(Z5811MMezPda, T01FQ5_A5811MMezPda[0]) != 0 )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezPda");
               GXutil.writeLogRaw("Old: ",Z5811MMezPda);
               GXutil.writeLogRaw("Current: ",T01FQ5_A5811MMezPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5812MMezFecPda), GXutil.resetTime(T01FQ5_A5812MMezFecPda[0])) ) )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezFecPda");
               GXutil.writeLogRaw("Old: ",Z5812MMezFecPda);
               GXutil.writeLogRaw("Current: ",T01FQ5_A5812MMezFecPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5813MMezFecEnt), GXutil.resetTime(T01FQ5_A5813MMezFecEnt[0])) ) )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezFecEnt");
               GXutil.writeLogRaw("Old: ",Z5813MMezFecEnt);
               GXutil.writeLogRaw("Current: ",T01FQ5_A5813MMezFecEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z5814MMezPorTot, T01FQ5_A5814MMezPorTot[0]) != 0 )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezPorTot");
               GXutil.writeLogRaw("Old: ",Z5814MMezPorTot);
               GXutil.writeLogRaw("Current: ",T01FQ5_A5814MMezPorTot[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FQ1581( )
   {
      beforeValidate1FQ1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FQ1581( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FQ1581( 0) ;
         checkOptimisticConcurrency1FQ1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FQ1581( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FQ1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FQ20 */
                  pr_default.execute(15, new Object[] {A5809MMezCod, Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel1FQ1581( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FQ0( ) ;
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
            load1FQ1581( ) ;
         }
         endLevel1FQ1581( ) ;
      }
      closeExtendedTableCursors1FQ1581( ) ;
   }

   public void update1FQ1581( )
   {
      beforeValidate1FQ1581( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FQ1581( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FQ1581( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FQ1581( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FQ1581( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FQ21 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n5810MMezKgs), A5810MMezKgs, Boolean.valueOf(n5811MMezPda), A5811MMezPda, Boolean.valueOf(n5812MMezFecPda), A5812MMezFecPda, Boolean.valueOf(n5813MMezFecEnt), A5813MMezFecEnt, Boolean.valueOf(n5814MMezPorTot), A5814MMezPorTot, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FQ1581( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FQ1581( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FQ0( ) ;
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
         endLevel1FQ1581( ) ;
      }
      closeExtendedTableCursors1FQ1581( ) ;
   }

   public void deferredUpdate1FQ1581( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FQ1581( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FQ1581( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FQ1581( ) ;
         afterConfirm1FQ1581( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FQ1581( ) ;
            if ( AnyError == 0 )
            {
               A5815MMezPorT = O5815MMezPorT ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
               scanStart1FQ1582( ) ;
               while ( RcdFound1582 != 0 )
               {
                  getByPrimaryKey1FQ1582( ) ;
                  delete1FQ1582( ) ;
                  scanNext1FQ1582( ) ;
                  O5815MMezPorT = A5815MMezPorT ;
                  n5815MMezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
               }
               scanEnd1FQ1582( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FQ22 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1581 == 0 )
                        {
                           initAll1FQ1581( ) ;
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
                        resetCaption1FQ0( ) ;
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
      sMode1581 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FQ1581( ) ;
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FQ1581( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FQ23 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         A407EmprNom = T01FQ23_A407EmprNom[0] ;
         n407EmprNom = T01FQ23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(18);
         /* Using cursor T01FQ24 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01FQ24_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(19);
         /* Using cursor T01FQ26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            A5815MMezPorT = T01FQ26_A5815MMezPorT[0] ;
            n5815MMezPorT = T01FQ26_n5815MMezPorT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         else
         {
            A5815MMezPorT = DecimalUtil.doubleToDec(0) ;
            n5815MMezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FQ27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS COLORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1FQ1582( )
   {
      s5815MMezPorT = O5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      nGXsfl_84_idx = 0 ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         readRow1FQ1582( ) ;
         if ( ( nRcdExists_1582 != 0 ) || ( nIsMod_1582 != 0 ) )
         {
            standaloneNotModal1FQ1582( ) ;
            getKey1FQ1582( ) ;
            if ( ( nRcdExists_1582 == 0 ) && ( nRcdDeleted_1582 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FQ1582( ) ;
            }
            else
            {
               if ( RcdFound1582 != 0 )
               {
                  if ( ( nRcdDeleted_1582 != 0 ) && ( nRcdExists_1582 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FQ1582( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1582 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FQ1582( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1582 == 0 )
                  {
                     GXCCtl = "ARTCOD_" + sGXsfl_84_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtArtCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5815MMezPorT = A5815MMezPorT ;
            n5815MMezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc)) ;
         httpContext.changePostValue( edtMMezArtDsc_Internalname, GXutil.rtrim( A5816MMezArtDsc)) ;
         httpContext.changePostValue( edtMmezUltCol_Internalname, GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezUltPar_Internalname, GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMmezArtKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_84_idx, GXutil.rtrim( Z65ArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_84_idx, GXutil.rtrim( Z5816MMezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5819MmezArtPor_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( Z5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5819MmezArtPor_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( O5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1582_"+sGXsfl_84_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1582 != 0 )
         {
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTCOL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZULTPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTPOR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MMEZARTKIL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FQ1582( ) ;
      if ( AnyError != 0 )
      {
         O5815MMezPorT = s5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      nRcdExists_1582 = (short)(0) ;
      nIsMod_1582 = (short)(0) ;
      nRcdDeleted_1582 = (short)(0) ;
   }

   public void processLevel1FQ1581( )
   {
      /* Save parent mode. */
      sMode1581 = Gx_mode ;
      processNestedLevel1FQ1582( ) ;
      if ( AnyError != 0 )
      {
         O5815MMezPorT = s5815MMezPorT ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1581 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FQ1581( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FQ1581( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmezcli");
         if ( AnyError == 0 )
         {
            confirmValues1FQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezcli");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FQ1581( )
   {
      /* Using cursor T01FQ28 */
      pr_default.execute(22);
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1581 = (short)(1) ;
         A396EmprCod = T01FQ28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FQ28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5809MMezCod = T01FQ28_A5809MMezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FQ1581( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1581 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1581 = (short)(1) ;
         A396EmprCod = T01FQ28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FQ28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5809MMezCod = T01FQ28_A5809MMezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
      }
   }

   public void scanEnd1FQ1581( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1FQ1581( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FQ1581( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FQ1581( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FQ1581( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FQ1581( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FQ1581( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FQ1581( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtMMezCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtMMezKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezKgs_Enabled), 5, 0), true);
      edtMMezPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPda_Enabled), 5, 0), true);
      edtMMezFecPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecPda_Enabled), 5, 0), true);
      edtMMezFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezFecEnt_Enabled), 5, 0), true);
      edtMMezPorTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPorTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPorTot_Enabled), 5, 0), true);
      edtMMezPorT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezPorT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezPorT_Enabled), 5, 0), true);
   }

   public void zm1FQ1582( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5816MMezArtDsc = T01FQ3_A5816MMezArtDsc[0] ;
            Z5817MmezUltCol = T01FQ3_A5817MmezUltCol[0] ;
            Z5818MmezUltPar = T01FQ3_A5818MmezUltPar[0] ;
            Z5819MmezArtPor = T01FQ3_A5819MmezArtPor[0] ;
         }
         else
         {
            Z5816MMezArtDsc = A5816MMezArtDsc ;
            Z5817MmezUltCol = A5817MmezUltCol ;
            Z5818MmezUltPar = A5818MmezUltPar ;
            Z5819MmezArtPor = A5819MmezArtPor ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z5809MMezCod = A5809MMezCod ;
         Z5816MMezArtDsc = A5816MMezArtDsc ;
         Z5817MmezUltCol = A5817MmezUltCol ;
         Z5818MmezUltPar = A5818MmezUltPar ;
         Z5819MmezArtPor = A5819MmezArtPor ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal1FQ1582( )
   {
   }

   public void standaloneModal1FQ1582( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      }
   }

   public void load1FQ1582( )
   {
      /* Using cursor T01FQ29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1582 = (short)(1) ;
         A69ArtDsc = T01FQ29_A69ArtDsc[0] ;
         n69ArtDsc = T01FQ29_n69ArtDsc[0] ;
         A5816MMezArtDsc = T01FQ29_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FQ29_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FQ29_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FQ29_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FQ29_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FQ29_n5818MmezUltPar[0] ;
         A5819MmezArtPor = T01FQ29_A5819MmezArtPor[0] ;
         n5819MmezArtPor = T01FQ29_n5819MmezArtPor[0] ;
         zm1FQ1582( -7) ;
      }
      pr_default.close(23);
      onLoadActions1FQ1582( ) ;
   }

   public void onLoadActions1FQ1582( )
   {
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor).subtract(O5819MmezArtPor) ;
            n5815MMezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5815MMezPorT = O5815MMezPorT.subtract(O5819MmezArtPor) ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
            }
         }
      }
   }

   public void checkExtendedTable1FQ1582( )
   {
      nIsDirty_1582 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FQ1582( ) ;
      nIsDirty_1582 = (short)(1) ;
      A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
      /* Using cursor T01FQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01FQ4_A69ArtDsc[0] ;
      n69ArtDsc = T01FQ4_n69ArtDsc[0] ;
      pr_default.close(2);
      if ( isIns( )  )
      {
         nIsDirty_1582 = (short)(1) ;
         A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1582 = (short)(1) ;
            A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor).subtract(O5819MmezArtPor) ;
            n5815MMezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1582 = (short)(1) ;
               A5815MMezPorT = O5815MMezPorT.subtract(O5819MmezArtPor) ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1FQ1582( )
   {
      pr_default.close(2);
   }

   public void enableDisable1FQ1582( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01FQ30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01FQ30_A69ArtDsc[0] ;
      n69ArtDsc = T01FQ30_n69ArtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1FQ1582( )
   {
      /* Using cursor T01FQ31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1582 = (short)(1) ;
      }
      else
      {
         RcdFound1582 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1FQ1582( )
   {
      /* Using cursor T01FQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1FQ1582( 7) ;
         RcdFound1582 = (short)(1) ;
         initializeNonKey1FQ1582( ) ;
         A5816MMezArtDsc = T01FQ3_A5816MMezArtDsc[0] ;
         n5816MMezArtDsc = T01FQ3_n5816MMezArtDsc[0] ;
         A5817MmezUltCol = T01FQ3_A5817MmezUltCol[0] ;
         n5817MmezUltCol = T01FQ3_n5817MmezUltCol[0] ;
         A5818MmezUltPar = T01FQ3_A5818MmezUltPar[0] ;
         n5818MmezUltPar = T01FQ3_n5818MmezUltPar[0] ;
         A5819MmezArtPor = T01FQ3_A5819MmezArtPor[0] ;
         n5819MmezArtPor = T01FQ3_n5819MmezArtPor[0] ;
         A65ArtCod = T01FQ3_A65ArtCod[0] ;
         O5819MmezArtPor = A5819MmezArtPor ;
         n5819MmezArtPor = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5809MMezCod = A5809MMezCod ;
         Z65ArtCod = A65ArtCod ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FQ1582( ) ;
         load1FQ1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1582 = (short)(0) ;
         initializeNonKey1FQ1582( ) ;
         sMode1582 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FQ1582( ) ;
         Gx_mode = sMode1582 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FQ1582( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FQ1582( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5816MMezArtDsc, T01FQ2_A5816MMezArtDsc[0]) != 0 ) || ( Z5817MmezUltCol != T01FQ2_A5817MmezUltCol[0] ) || ( Z5818MmezUltPar != T01FQ2_A5818MmezUltPar[0] ) || ( DecimalUtil.compareTo(Z5819MmezArtPor, T01FQ2_A5819MmezArtPor[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5816MMezArtDsc, T01FQ2_A5816MMezArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MMezArtDsc");
               GXutil.writeLogRaw("Old: ",Z5816MMezArtDsc);
               GXutil.writeLogRaw("Current: ",T01FQ2_A5816MMezArtDsc[0]);
            }
            if ( Z5817MmezUltCol != T01FQ2_A5817MmezUltCol[0] )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MmezUltCol");
               GXutil.writeLogRaw("Old: ",Z5817MmezUltCol);
               GXutil.writeLogRaw("Current: ",T01FQ2_A5817MmezUltCol[0]);
            }
            if ( Z5818MmezUltPar != T01FQ2_A5818MmezUltPar[0] )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MmezUltPar");
               GXutil.writeLogRaw("Old: ",Z5818MmezUltPar);
               GXutil.writeLogRaw("Current: ",T01FQ2_A5818MmezUltPar[0]);
            }
            if ( DecimalUtil.compareTo(Z5819MmezArtPor, T01FQ2_A5819MmezArtPor[0]) != 0 )
            {
               GXutil.writeLogln("tmezcli:[seudo value changed for attri]"+"MmezArtPor");
               GXutil.writeLogRaw("Old: ",Z5819MmezArtPor);
               GXutil.writeLogRaw("Current: ",T01FQ2_A5819MmezArtPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCL1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FQ1582( )
   {
      beforeValidate1FQ1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FQ1582( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FQ1582( 0) ;
         checkOptimisticConcurrency1FQ1582( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FQ1582( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FQ1582( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FQ32 */
                  pr_default.execute(26, new Object[] {A5809MMezCod, Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1FQ1582( ) ;
         }
         endLevel1FQ1582( ) ;
      }
      closeExtendedTableCursors1FQ1582( ) ;
   }

   public void update1FQ1582( )
   {
      beforeValidate1FQ1582( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FQ1582( ) ;
      }
      if ( ( nIsMod_1582 != 0 ) || ( nIsDirty_1582 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FQ1582( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FQ1582( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FQ1582( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FQ33 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n5816MMezArtDsc), A5816MMezArtDsc, Boolean.valueOf(n5817MmezUltCol), Byte.valueOf(A5817MmezUltCol), Boolean.valueOf(n5818MmezUltPar), Byte.valueOf(A5818MmezUltPar), Boolean.valueOf(n5819MmezArtPor), A5819MmezArtPor, A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCL1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FQ1582( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FQ1582( ) ;
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
            endLevel1FQ1582( ) ;
         }
      }
      closeExtendedTableCursors1FQ1582( ) ;
   }

   public void deferredUpdate1FQ1582( )
   {
   }

   public void delete1FQ1582( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FQ1582( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FQ1582( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FQ1582( ) ;
         afterConfirm1FQ1582( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FQ1582( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FQ34 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCL1");
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
      sMode1582 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FQ1582( ) ;
      Gx_mode = sMode1582 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FQ1582( )
   {
      standaloneModal1FQ1582( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FQ35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01FQ35_A69ArtDsc[0] ;
         n69ArtDsc = T01FQ35_n69ArtDsc[0] ;
         pr_default.close(29);
         A5820MmezArtKil = GXutil.roundDecimal( (A5810MMezKgs.multiply(A5819MmezArtPor).divide(A5814MMezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
         if ( isIns( )  )
         {
            A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor) ;
            n5815MMezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5815MMezPorT = O5815MMezPorT.add(A5819MmezArtPor).subtract(O5819MmezArtPor) ;
               n5815MMezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5815MMezPorT = O5815MMezPorT.subtract(O5819MmezArtPor) ;
                  n5815MMezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FQ36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS PARTIDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01FQ37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod, A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS COLORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void endLevel1FQ1582( )
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

   public void scanStart1FQ1582( )
   {
      /* Scan By routine */
      /* Using cursor T01FQ38 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1582 = (short)(1) ;
         A65ArtCod = T01FQ38_A65ArtCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FQ1582( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1582 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1582 = (short)(1) ;
         A65ArtCod = T01FQ38_A65ArtCod[0] ;
      }
   }

   public void scanEnd1FQ1582( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1FQ1582( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FQ1582( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FQ1582( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FQ1582( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FQ1582( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FQ1582( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FQ1582( )
   {
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMezArtDsc_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMmezUltCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltCol_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMmezUltPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezUltPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezUltPar_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMmezArtPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtPor_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtMmezArtKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMmezArtKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMmezArtKil_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void send_integrity_lvl_hashes1FQ1582( )
   {
   }

   public void send_integrity_lvl_hashes1FQ1581( )
   {
   }

   public void subsflControlProps_841582( )
   {
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_84_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_84_idx ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC_"+sGXsfl_84_idx ;
      edtMmezUltCol_Internalname = "MMEZULTCOL_"+sGXsfl_84_idx ;
      edtMmezUltPar_Internalname = "MMEZULTPAR_"+sGXsfl_84_idx ;
      edtMmezArtPor_Internalname = "MMEZARTPOR_"+sGXsfl_84_idx ;
      edtMmezArtKil_Internalname = "MMEZARTKIL_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_841582( )
   {
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_84_fel_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_84_fel_idx ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC_"+sGXsfl_84_fel_idx ;
      edtMmezUltCol_Internalname = "MMEZULTCOL_"+sGXsfl_84_fel_idx ;
      edtMmezUltPar_Internalname = "MMEZULTPAR_"+sGXsfl_84_fel_idx ;
      edtMmezArtPor_Internalname = "MMEZARTPOR_"+sGXsfl_84_fel_idx ;
      edtMmezArtKil_Internalname = "MMEZARTKIL_"+sGXsfl_84_fel_idx ;
   }

   public void addRow1FQ1582( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_841582( ) ;
      sendRow1FQ1582( ) ;
   }

   public void sendRow1FQ1582( )
   {
      Gridtmezcli_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtmezcli_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtmezcli_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtmezcli_level1item_Class, "") != 0 )
         {
            subGridtmezcli_level1item_Linesclass = subGridtmezcli_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtmezcli_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtmezcli_level1item_Backstyle = (byte)(0) ;
         subGridtmezcli_level1item_Backcolor = subGridtmezcli_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtmezcli_level1item_Class, "") != 0 )
         {
            subGridtmezcli_level1item_Linesclass = subGridtmezcli_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtmezcli_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtmezcli_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtmezcli_level1item_Class, "") != 0 )
         {
            subGridtmezcli_level1item_Linesclass = subGridtmezcli_level1item_Class+"Odd" ;
         }
         subGridtmezcli_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtmezcli_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtmezcli_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
         {
            subGridtmezcli_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmezcli_level1item_Class, "") != 0 )
            {
               subGridtmezcli_level1item_Linesclass = subGridtmezcli_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtmezcli_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmezcli_level1item_Class, "") != 0 )
            {
               subGridtmezcli_level1item_Linesclass = subGridtmezcli_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtDsc_Internalname,GXutil.rtrim( A69ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMezArtDsc_Internalname,GXutil.rtrim( A5816MMezArtDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMezArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMMezArtDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltCol_Internalname,GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5817MmezUltCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezUltCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezUltPar_Internalname,GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezUltPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5818MmezUltPar), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezUltPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezUltPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1582_" + sGXsfl_84_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_84_idx + "',84)\"" ;
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtPor_Enabled!=0) ? localUtil.format( A5819MmezArtPor, "ZZ9.99") : localUtil.format( A5819MmezArtPor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezArtPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtmezcli_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMmezArtKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMmezArtKil_Enabled!=0) ? localUtil.format( A5820MmezArtKil, "ZZZZZ9.99") : localUtil.format( A5820MmezArtKil, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMmezArtKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMmezArtKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtmezcli_level1itemRow);
      send_integrity_lvl_hashes1FQ1582( ) ;
      GXCCtl = "Z65ArtCod_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z65ArtCod));
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5816MMezArtDsc));
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5817MmezUltCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5818MmezUltPar, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5819MmezArtPor_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5819MmezArtPor_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5819MmezArtPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1582_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1582_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1582_" + sGXsfl_84_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1582, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTDSC_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTCOL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZULTPAR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTPOR_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MMEZARTKIL_"+sGXsfl_84_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtmezcli_level1itemContainer.AddRow(Gridtmezcli_level1itemRow);
   }

   public void readRow1FQ1582( )
   {
      nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_841582( ) ;
      edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTDSC_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezUltCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTCOL_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezUltPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZULTPAR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezArtPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTPOR_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMmezArtKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MMEZARTKIL_"+sGXsfl_84_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
      A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
      n69ArtDsc = false ;
      A5816MMezArtDsc = httpContext.cgiGet( edtMMezArtDsc_Internalname) ;
      n5816MMezArtDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZULTCOL_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezUltCol_Internalname ;
         wbErr = true ;
         A5817MmezUltCol = (byte)(0) ;
         n5817MmezUltCol = false ;
      }
      else
      {
         A5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5817MmezUltCol = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MMEZULTPAR_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezUltPar_Internalname ;
         wbErr = true ;
         A5818MmezUltPar = (byte)(0) ;
         n5818MmezUltPar = false ;
      }
      else
      {
         A5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( edtMmezUltPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5818MmezUltPar = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMmezArtPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMmezArtPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MMEZARTPOR_" + sGXsfl_84_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMmezArtPor_Internalname ;
         wbErr = true ;
         A5819MmezArtPor = DecimalUtil.ZERO ;
         n5819MmezArtPor = false ;
      }
      else
      {
         A5819MmezArtPor = localUtil.ctond( httpContext.cgiGet( edtMmezArtPor_Internalname)) ;
         n5819MmezArtPor = false ;
      }
      A5820MmezArtKil = localUtil.ctond( httpContext.cgiGet( edtMmezArtKil_Internalname)) ;
      GXCCtl = "Z65ArtCod_" + sGXsfl_84_idx ;
      Z65ArtCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5816MMezArtDsc_" + sGXsfl_84_idx ;
      Z5816MMezArtDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5817MmezUltCol_" + sGXsfl_84_idx ;
      Z5817MmezUltCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5818MmezUltPar_" + sGXsfl_84_idx ;
      Z5818MmezUltPar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5819MmezArtPor_" + sGXsfl_84_idx ;
      Z5819MmezArtPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O5819MmezArtPor_" + sGXsfl_84_idx ;
      O5819MmezArtPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1582_" + sGXsfl_84_idx ;
      nRcdDeleted_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1582_" + sGXsfl_84_idx ;
      nRcdExists_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1582_" + sGXsfl_84_idx ;
      nIsMod_1582 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtArtCod_Enabled = edtArtCod_Enabled ;
   }

   public void confirmValues1FQ0( )
   {
      nGXsfl_84_idx = 0 ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_841582( ) ;
      while ( nGXsfl_84_idx < nRC_GXsfl_84 )
      {
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_841582( ) ;
         httpContext.changePostValue( "Z65ArtCod_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z65ArtCod_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z5816MMezArtDsc_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5816MMezArtDsc_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z5817MmezUltCol_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5817MmezUltCol_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z5818MmezUltPar_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5818MmezUltPar_"+sGXsfl_84_idx) ;
         httpContext.changePostValue( "Z5819MmezArtPor_"+sGXsfl_84_idx, httpContext.cgiGet( "ZT_"+"Z5819MmezArtPor_"+sGXsfl_84_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5819MmezArtPor_"+sGXsfl_84_idx) ;
      }
      httpContext.changePostValue( "O5819MmezArtPor", httpContext.cgiGet( "T5819MmezArtPor")) ;
      httpContext.deletePostValue( "T5819MmezArtPor") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmezcli", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5809MMezCod", GXutil.rtrim( Z5809MMezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5810MMezKgs", GXutil.ltrim( localUtil.ntoc( Z5810MMezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5811MMezPda", GXutil.rtrim( Z5811MMezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5812MMezFecPda", localUtil.dtoc( Z5812MMezFecPda, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5813MMezFecEnt", localUtil.dtoc( Z5813MMezFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( Z5814MMezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5815MMezPorT", GXutil.ltrim( localUtil.ntoc( O5815MMezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nGXsfl_84_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmezcli", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMEZCLI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAESTRO MEZCLAS CLIENTE", "") ;
   }

   public void initializeNonKey1FQ1581( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5810MMezKgs = DecimalUtil.ZERO ;
      n5810MMezKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrimstr( A5810MMezKgs, 9, 2));
      A5811MMezPda = "" ;
      n5811MMezPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", A5811MMezPda);
      A5812MMezFecPda = GXutil.nullDate() ;
      n5812MMezFecPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      A5813MMezFecEnt = GXutil.nullDate() ;
      n5813MMezFecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      A5814MMezPorTot = DecimalUtil.ZERO ;
      n5814MMezPorTot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrimstr( A5814MMezPorTot, 6, 2));
      A5815MMezPorT = DecimalUtil.ZERO ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      O5815MMezPorT = A5815MMezPorT ;
      n5815MMezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      Z5810MMezKgs = DecimalUtil.ZERO ;
      Z5811MMezPda = "" ;
      Z5812MMezFecPda = GXutil.nullDate() ;
      Z5813MMezFecEnt = GXutil.nullDate() ;
      Z5814MMezPorTot = DecimalUtil.ZERO ;
   }

   public void initAll1FQ1581( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A5809MMezCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5809MMezCod", A5809MMezCod);
      initializeNonKey1FQ1581( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FQ1582( )
   {
      A5820MmezArtKil = DecimalUtil.ZERO ;
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      A5816MMezArtDsc = "" ;
      n5816MMezArtDsc = false ;
      A5817MmezUltCol = (byte)(0) ;
      n5817MmezUltCol = false ;
      A5818MmezUltPar = (byte)(0) ;
      n5818MmezUltPar = false ;
      A5819MmezArtPor = DecimalUtil.ZERO ;
      n5819MmezArtPor = false ;
      O5819MmezArtPor = A5819MmezArtPor ;
      n5819MmezArtPor = false ;
      Z5816MMezArtDsc = "" ;
      Z5817MmezUltCol = (byte)(0) ;
      Z5818MmezUltPar = (byte)(0) ;
      Z5819MmezArtPor = DecimalUtil.ZERO ;
   }

   public void initAll1FQ1582( )
   {
      A65ArtCod = "" ;
      initializeNonKey1FQ1582( ) ;
   }

   public void standaloneModalInsert1FQ1582( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573254", true, true);
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
      httpContext.AddJavascriptSource("tmezcli.js", "?20268241573255", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1582( )
   {
      edtArtCod_Enabled = defedtArtCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_84_Refreshing);
   }

   public void startgridcontrol84( )
   {
      Gridtmezcli_level1itemContainer.AddObjectProperty("GridName", "Gridtmezcli_level1item");
      Gridtmezcli_level1itemContainer.AddObjectProperty("Header", subGridtmezcli_level1item_Header);
      Gridtmezcli_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtmezcli_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtmezcli_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A69ArtDsc));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A5816MMezArtDsc));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5817MmezUltCol, (byte)(2), (byte)(0), ".", "")));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5818MmezUltPar, (byte)(2), (byte)(0), ".", "")));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezUltPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5819MmezArtPor, (byte)(6), (byte)(2), ".", "")));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmezcli_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5820MmezArtKil, (byte)(9), (byte)(2), ".", "")));
      Gridtmezcli_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMmezArtKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddColumnProperties(Gridtmezcli_level1itemColumn);
      Gridtmezcli_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtmezcli_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtmezcli_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtMMezCod_Internalname = "MMEZCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtMMezKgs_Internalname = "MMEZKGS" ;
      edtMMezPda_Internalname = "MMEZPDA" ;
      edtMMezFecPda_Internalname = "MMEZFECPDA" ;
      edtMMezFecEnt_Internalname = "MMEZFECENT" ;
      edtMMezPorTot_Internalname = "MMEZPORTOT" ;
      edtMMezPorT_Internalname = "MMEZPORT" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtMMezArtDsc_Internalname = "MMEZARTDSC" ;
      edtMmezUltCol_Internalname = "MMEZULTCOL" ;
      edtMmezUltPar_Internalname = "MMEZULTPAR" ;
      edtMmezArtPor_Internalname = "MMEZARTPOR" ;
      edtMmezArtKil_Internalname = "MMEZARTKIL" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
      subGridtmezcli_level1item_Internalname = "GRIDTMEZCLI_LEVEL1ITEM" ;
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
      subGridtmezcli_level1item_Allowcollapsing = (byte)(0) ;
      subGridtmezcli_level1item_Allowselection = (byte)(0) ;
      subGridtmezcli_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MAESTRO MEZCLAS CLIENTE", "") );
      edtMmezArtKil_Jsonclick = "" ;
      edtMmezArtPor_Jsonclick = "" ;
      edtMmezUltPar_Jsonclick = "" ;
      edtMmezUltCol_Jsonclick = "" ;
      edtMMezArtDsc_Jsonclick = "" ;
      edtArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      subGridtmezcli_level1item_Class = "Grid" ;
      subGridtmezcli_level1item_Backcolorstyle = (byte)(0) ;
      edtMmezArtKil_Enabled = 0 ;
      edtMmezArtPor_Enabled = 1 ;
      edtMmezUltPar_Enabled = 1 ;
      edtMmezUltCol_Enabled = 1 ;
      edtMMezArtDsc_Enabled = 1 ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMMezPorT_Jsonclick = "" ;
      edtMMezPorT_Enabled = 0 ;
      edtMMezPorTot_Jsonclick = "" ;
      edtMMezPorTot_Enabled = 1 ;
      edtMMezFecEnt_Jsonclick = "" ;
      edtMMezFecEnt_Enabled = 1 ;
      edtMMezFecPda_Jsonclick = "" ;
      edtMMezFecPda_Enabled = 1 ;
      edtMMezPda_Jsonclick = "" ;
      edtMMezPda_Enabled = 1 ;
      edtMMezKgs_Jsonclick = "" ;
      edtMMezKgs_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtMMezCod_Jsonclick = "" ;
      edtMMezCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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

   public void gxnrgridtmezcli_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_841582( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FQ1582( ) ;
         standaloneModal1FQ1582( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FQ1582( ) ;
         nGXsfl_84_idx = (int)(nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_841582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtmezcli_level1itemContainer)) ;
      /* End function gxnrGridtmezcli_level1item_newrow */
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
      /* Using cursor T01FQ23 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FQ23_A407EmprNom[0] ;
      n407EmprNom = T01FQ23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(18);
      /* Using cursor T01FQ24 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FQ24_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(19);
      /* Using cursor T01FQ26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A5815MMezPorT = T01FQ26_A5815MMezPorT[0] ;
         n5815MMezPorT = T01FQ26_n5815MMezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      else
      {
         A5815MMezPorT = DecimalUtil.doubleToDec(0) ;
         n5815MMezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrimstr( A5815MMezPorT, 6, 2));
      }
      pr_default.close(20);
      GX_FocusControl = edtMMezKgs_Internalname ;
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
      /* Using cursor T01FQ23 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01FQ23_A407EmprNom[0] ;
      n407EmprNom = T01FQ23_n407EmprNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01FQ24 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01FQ24_A279CliNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Mmezcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01FQ26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5809MMezCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A5815MMezPorT = T01FQ26_A5815MMezPorT[0] ;
         n5815MMezPorT = T01FQ26_n5815MMezPorT[0] ;
      }
      else
      {
         A5815MMezPorT = DecimalUtil.doubleToDec(0) ;
         n5815MMezPorT = false ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5810MMezKgs", GXutil.ltrim( localUtil.ntoc( A5810MMezKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5811MMezPda", GXutil.rtrim( A5811MMezPda));
      httpContext.ajax_rsp_assign_attri("", false, "A5812MMezFecPda", localUtil.format(A5812MMezFecPda, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5813MMezFecEnt", localUtil.format(A5813MMezFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( A5814MMezPorTot, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5815MMezPorT", GXutil.ltrim( localUtil.ntoc( A5815MMezPorT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5809MMezCod", GXutil.rtrim( Z5809MMezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5810MMezKgs", GXutil.ltrim( localUtil.ntoc( Z5810MMezKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5811MMezPda", GXutil.rtrim( Z5811MMezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5812MMezFecPda", localUtil.format(Z5812MMezFecPda, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5813MMezFecEnt", localUtil.format(Z5813MMezFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5814MMezPorTot", GXutil.ltrim( localUtil.ntoc( Z5814MMezPorTot, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5815MMezPorT", GXutil.ltrim( localUtil.ntoc( Z5815MMezPorT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5815MMezPorT", GXutil.ltrim( localUtil.ntoc( O5815MMezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01FQ35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
      }
      A69ArtDsc = T01FQ35_A69ArtDsc[0] ;
      n69ArtDsc = T01FQ35_n69ArtDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_MMEZCOD","{handler:'valid_Mmezcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5809MMezCod',fld:'MMEZCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MMEZCOD",",oparms:[{av:'A5810MMezKgs',fld:'MMEZKGS',pic:'ZZZZZ9.99'},{av:'A5811MMezPda',fld:'MMEZPDA',pic:''},{av:'A5812MMezFecPda',fld:'MMEZFECPDA',pic:''},{av:'A5813MMezFecEnt',fld:'MMEZFECENT',pic:''},{av:'A5814MMezPorTot',fld:'MMEZPORTOT',pic:'ZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5815MMezPorT',fld:'MMEZPORT',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z5809MMezCod'},{av:'Z5810MMezKgs'},{av:'Z5811MMezPda'},{av:'Z5812MMezFecPda'},{av:'Z5813MMezFecEnt'},{av:'Z5814MMezPorTot'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5815MMezPorT'},{av:'O5815MMezPorT'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MMEZKGS","{handler:'valid_Mmezkgs',iparms:[]");
      setEventMetadata("VALID_MMEZKGS",",oparms:[]}");
      setEventMetadata("VALID_MMEZPORTOT","{handler:'valid_Mmezportot',iparms:[]");
      setEventMetadata("VALID_MMEZPORTOT",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_MMEZARTPOR","{handler:'valid_Mmezartpor',iparms:[]");
      setEventMetadata("VALID_MMEZARTPOR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mmezartkil',iparms:[]");
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
      pr_default.close(29);
      pr_default.close(19);
      pr_default.close(18);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z5809MMezCod = "" ;
      Z5810MMezKgs = DecimalUtil.ZERO ;
      Z5811MMezPda = "" ;
      Z5812MMezFecPda = GXutil.nullDate() ;
      Z5813MMezFecEnt = GXutil.nullDate() ;
      Z5814MMezPorTot = DecimalUtil.ZERO ;
      O5815MMezPorT = DecimalUtil.ZERO ;
      Z65ArtCod = "" ;
      Z5816MMezArtDsc = "" ;
      Z5819MmezArtPor = DecimalUtil.ZERO ;
      O5819MmezArtPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5809MMezCod = "" ;
      A65ArtCod = "" ;
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
      A279CliNom = "" ;
      A5810MMezKgs = DecimalUtil.ZERO ;
      A5811MMezPda = "" ;
      A5812MMezFecPda = GXutil.nullDate() ;
      A5813MMezFecEnt = GXutil.nullDate() ;
      A5814MMezPorTot = DecimalUtil.ZERO ;
      A5815MMezPorT = DecimalUtil.ZERO ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtmezcli_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      B5815MMezPorT = DecimalUtil.ZERO ;
      sMode1582 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s5815MMezPorT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A69ArtDsc = "" ;
      A5816MMezArtDsc = "" ;
      A5819MmezArtPor = DecimalUtil.ZERO ;
      A5820MmezArtKil = DecimalUtil.ZERO ;
      T5819MmezArtPor = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z5815MMezPorT = DecimalUtil.ZERO ;
      T01FQ12_A5809MMezCod = new String[] {""} ;
      T01FQ12_A407EmprNom = new String[] {""} ;
      T01FQ12_n407EmprNom = new boolean[] {false} ;
      T01FQ12_A279CliNom = new String[] {""} ;
      T01FQ12_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ12_n5810MMezKgs = new boolean[] {false} ;
      T01FQ12_A5811MMezPda = new String[] {""} ;
      T01FQ12_n5811MMezPda = new boolean[] {false} ;
      T01FQ12_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ12_n5812MMezFecPda = new boolean[] {false} ;
      T01FQ12_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ12_n5813MMezFecEnt = new boolean[] {false} ;
      T01FQ12_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ12_n5814MMezPorTot = new boolean[] {false} ;
      T01FQ12_A396EmprCod = new String[] {""} ;
      T01FQ12_A252CliCod = new int[1] ;
      T01FQ12_A5815MMezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ12_n5815MMezPorT = new boolean[] {false} ;
      T01FQ7_A407EmprNom = new String[] {""} ;
      T01FQ7_n407EmprNom = new boolean[] {false} ;
      T01FQ8_A279CliNom = new String[] {""} ;
      T01FQ10_A5815MMezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ10_n5815MMezPorT = new boolean[] {false} ;
      T01FQ13_A407EmprNom = new String[] {""} ;
      T01FQ13_n407EmprNom = new boolean[] {false} ;
      T01FQ14_A279CliNom = new String[] {""} ;
      T01FQ16_A5815MMezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ16_n5815MMezPorT = new boolean[] {false} ;
      T01FQ17_A396EmprCod = new String[] {""} ;
      T01FQ17_A252CliCod = new int[1] ;
      T01FQ17_A5809MMezCod = new String[] {""} ;
      T01FQ6_A5809MMezCod = new String[] {""} ;
      T01FQ6_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ6_n5810MMezKgs = new boolean[] {false} ;
      T01FQ6_A5811MMezPda = new String[] {""} ;
      T01FQ6_n5811MMezPda = new boolean[] {false} ;
      T01FQ6_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ6_n5812MMezFecPda = new boolean[] {false} ;
      T01FQ6_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ6_n5813MMezFecEnt = new boolean[] {false} ;
      T01FQ6_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ6_n5814MMezPorTot = new boolean[] {false} ;
      T01FQ6_A396EmprCod = new String[] {""} ;
      T01FQ6_A252CliCod = new int[1] ;
      sMode1581 = "" ;
      T01FQ18_A396EmprCod = new String[] {""} ;
      T01FQ18_A252CliCod = new int[1] ;
      T01FQ18_A5809MMezCod = new String[] {""} ;
      T01FQ19_A396EmprCod = new String[] {""} ;
      T01FQ19_A252CliCod = new int[1] ;
      T01FQ19_A5809MMezCod = new String[] {""} ;
      T01FQ5_A5809MMezCod = new String[] {""} ;
      T01FQ5_A5810MMezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ5_n5810MMezKgs = new boolean[] {false} ;
      T01FQ5_A5811MMezPda = new String[] {""} ;
      T01FQ5_n5811MMezPda = new boolean[] {false} ;
      T01FQ5_A5812MMezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ5_n5812MMezFecPda = new boolean[] {false} ;
      T01FQ5_A5813MMezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FQ5_n5813MMezFecEnt = new boolean[] {false} ;
      T01FQ5_A5814MMezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ5_n5814MMezPorTot = new boolean[] {false} ;
      T01FQ5_A396EmprCod = new String[] {""} ;
      T01FQ5_A252CliCod = new int[1] ;
      T01FQ23_A407EmprNom = new String[] {""} ;
      T01FQ23_n407EmprNom = new boolean[] {false} ;
      T01FQ24_A279CliNom = new String[] {""} ;
      T01FQ26_A5815MMezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ26_n5815MMezPorT = new boolean[] {false} ;
      T01FQ27_A396EmprCod = new String[] {""} ;
      T01FQ27_A252CliCod = new int[1] ;
      T01FQ27_A5809MMezCod = new String[] {""} ;
      T01FQ27_A65ArtCod = new String[] {""} ;
      T01FQ27_A5822MmezLinCol = new byte[1] ;
      T01FQ28_A396EmprCod = new String[] {""} ;
      T01FQ28_A252CliCod = new int[1] ;
      T01FQ28_A5809MMezCod = new String[] {""} ;
      Z69ArtDsc = "" ;
      T01FQ29_A5809MMezCod = new String[] {""} ;
      T01FQ29_A69ArtDsc = new String[] {""} ;
      T01FQ29_n69ArtDsc = new boolean[] {false} ;
      T01FQ29_A5816MMezArtDsc = new String[] {""} ;
      T01FQ29_n5816MMezArtDsc = new boolean[] {false} ;
      T01FQ29_A5817MmezUltCol = new byte[1] ;
      T01FQ29_n5817MmezUltCol = new boolean[] {false} ;
      T01FQ29_A5818MmezUltPar = new byte[1] ;
      T01FQ29_n5818MmezUltPar = new boolean[] {false} ;
      T01FQ29_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ29_n5819MmezArtPor = new boolean[] {false} ;
      T01FQ29_A396EmprCod = new String[] {""} ;
      T01FQ29_A252CliCod = new int[1] ;
      T01FQ29_A65ArtCod = new String[] {""} ;
      T01FQ4_A69ArtDsc = new String[] {""} ;
      T01FQ4_n69ArtDsc = new boolean[] {false} ;
      T01FQ30_A69ArtDsc = new String[] {""} ;
      T01FQ30_n69ArtDsc = new boolean[] {false} ;
      T01FQ31_A396EmprCod = new String[] {""} ;
      T01FQ31_A252CliCod = new int[1] ;
      T01FQ31_A5809MMezCod = new String[] {""} ;
      T01FQ31_A65ArtCod = new String[] {""} ;
      T01FQ3_A5809MMezCod = new String[] {""} ;
      T01FQ3_A5816MMezArtDsc = new String[] {""} ;
      T01FQ3_n5816MMezArtDsc = new boolean[] {false} ;
      T01FQ3_A5817MmezUltCol = new byte[1] ;
      T01FQ3_n5817MmezUltCol = new boolean[] {false} ;
      T01FQ3_A5818MmezUltPar = new byte[1] ;
      T01FQ3_n5818MmezUltPar = new boolean[] {false} ;
      T01FQ3_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ3_n5819MmezArtPor = new boolean[] {false} ;
      T01FQ3_A396EmprCod = new String[] {""} ;
      T01FQ3_A252CliCod = new int[1] ;
      T01FQ3_A65ArtCod = new String[] {""} ;
      T01FQ2_A5809MMezCod = new String[] {""} ;
      T01FQ2_A5816MMezArtDsc = new String[] {""} ;
      T01FQ2_n5816MMezArtDsc = new boolean[] {false} ;
      T01FQ2_A5817MmezUltCol = new byte[1] ;
      T01FQ2_n5817MmezUltCol = new boolean[] {false} ;
      T01FQ2_A5818MmezUltPar = new byte[1] ;
      T01FQ2_n5818MmezUltPar = new boolean[] {false} ;
      T01FQ2_A5819MmezArtPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FQ2_n5819MmezArtPor = new boolean[] {false} ;
      T01FQ2_A396EmprCod = new String[] {""} ;
      T01FQ2_A252CliCod = new int[1] ;
      T01FQ2_A65ArtCod = new String[] {""} ;
      T01FQ35_A69ArtDsc = new String[] {""} ;
      T01FQ35_n69ArtDsc = new boolean[] {false} ;
      T01FQ36_A396EmprCod = new String[] {""} ;
      T01FQ36_A252CliCod = new int[1] ;
      T01FQ36_A5809MMezCod = new String[] {""} ;
      T01FQ36_A65ArtCod = new String[] {""} ;
      T01FQ36_A5829MmezLinPar = new byte[1] ;
      T01FQ37_A396EmprCod = new String[] {""} ;
      T01FQ37_A252CliCod = new int[1] ;
      T01FQ37_A5809MMezCod = new String[] {""} ;
      T01FQ37_A65ArtCod = new String[] {""} ;
      T01FQ37_A5822MmezLinCol = new byte[1] ;
      T01FQ38_A396EmprCod = new String[] {""} ;
      T01FQ38_A252CliCod = new int[1] ;
      T01FQ38_A5809MMezCod = new String[] {""} ;
      T01FQ38_A65ArtCod = new String[] {""} ;
      Gridtmezcli_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtmezcli_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtmezcli_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ5809MMezCod = "" ;
      ZZ5810MMezKgs = DecimalUtil.ZERO ;
      ZZ5811MMezPda = "" ;
      ZZ5812MMezFecPda = GXutil.nullDate() ;
      ZZ5813MMezFecEnt = GXutil.nullDate() ;
      ZZ5814MMezPorTot = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ5815MMezPorT = DecimalUtil.ZERO ;
      ZO5815MMezPorT = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmezcli__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmezcli__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmezcli__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmezcli__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmezcli__default(),
         new Object[] {
             new Object[] {
            T01FQ2_A5809MMezCod, T01FQ2_A5816MMezArtDsc, T01FQ2_n5816MMezArtDsc, T01FQ2_A5817MmezUltCol, T01FQ2_n5817MmezUltCol, T01FQ2_A5818MmezUltPar, T01FQ2_n5818MmezUltPar, T01FQ2_A5819MmezArtPor, T01FQ2_n5819MmezArtPor, T01FQ2_A396EmprCod,
            T01FQ2_A252CliCod, T01FQ2_A65ArtCod
            }
            , new Object[] {
            T01FQ3_A5809MMezCod, T01FQ3_A5816MMezArtDsc, T01FQ3_n5816MMezArtDsc, T01FQ3_A5817MmezUltCol, T01FQ3_n5817MmezUltCol, T01FQ3_A5818MmezUltPar, T01FQ3_n5818MmezUltPar, T01FQ3_A5819MmezArtPor, T01FQ3_n5819MmezArtPor, T01FQ3_A396EmprCod,
            T01FQ3_A252CliCod, T01FQ3_A65ArtCod
            }
            , new Object[] {
            T01FQ4_A69ArtDsc, T01FQ4_n69ArtDsc
            }
            , new Object[] {
            T01FQ5_A5809MMezCod, T01FQ5_A5810MMezKgs, T01FQ5_n5810MMezKgs, T01FQ5_A5811MMezPda, T01FQ5_n5811MMezPda, T01FQ5_A5812MMezFecPda, T01FQ5_n5812MMezFecPda, T01FQ5_A5813MMezFecEnt, T01FQ5_n5813MMezFecEnt, T01FQ5_A5814MMezPorTot,
            T01FQ5_n5814MMezPorTot, T01FQ5_A396EmprCod, T01FQ5_A252CliCod
            }
            , new Object[] {
            T01FQ6_A5809MMezCod, T01FQ6_A5810MMezKgs, T01FQ6_n5810MMezKgs, T01FQ6_A5811MMezPda, T01FQ6_n5811MMezPda, T01FQ6_A5812MMezFecPda, T01FQ6_n5812MMezFecPda, T01FQ6_A5813MMezFecEnt, T01FQ6_n5813MMezFecEnt, T01FQ6_A5814MMezPorTot,
            T01FQ6_n5814MMezPorTot, T01FQ6_A396EmprCod, T01FQ6_A252CliCod
            }
            , new Object[] {
            T01FQ7_A407EmprNom, T01FQ7_n407EmprNom
            }
            , new Object[] {
            T01FQ8_A279CliNom
            }
            , new Object[] {
            T01FQ10_A5815MMezPorT, T01FQ10_n5815MMezPorT
            }
            , new Object[] {
            T01FQ12_A5809MMezCod, T01FQ12_A407EmprNom, T01FQ12_n407EmprNom, T01FQ12_A279CliNom, T01FQ12_A5810MMezKgs, T01FQ12_n5810MMezKgs, T01FQ12_A5811MMezPda, T01FQ12_n5811MMezPda, T01FQ12_A5812MMezFecPda, T01FQ12_n5812MMezFecPda,
            T01FQ12_A5813MMezFecEnt, T01FQ12_n5813MMezFecEnt, T01FQ12_A5814MMezPorTot, T01FQ12_n5814MMezPorTot, T01FQ12_A396EmprCod, T01FQ12_A252CliCod, T01FQ12_A5815MMezPorT, T01FQ12_n5815MMezPorT
            }
            , new Object[] {
            T01FQ13_A407EmprNom, T01FQ13_n407EmprNom
            }
            , new Object[] {
            T01FQ14_A279CliNom
            }
            , new Object[] {
            T01FQ16_A5815MMezPorT, T01FQ16_n5815MMezPorT
            }
            , new Object[] {
            T01FQ17_A396EmprCod, T01FQ17_A252CliCod, T01FQ17_A5809MMezCod
            }
            , new Object[] {
            T01FQ18_A396EmprCod, T01FQ18_A252CliCod, T01FQ18_A5809MMezCod
            }
            , new Object[] {
            T01FQ19_A396EmprCod, T01FQ19_A252CliCod, T01FQ19_A5809MMezCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FQ23_A407EmprNom, T01FQ23_n407EmprNom
            }
            , new Object[] {
            T01FQ24_A279CliNom
            }
            , new Object[] {
            T01FQ26_A5815MMezPorT, T01FQ26_n5815MMezPorT
            }
            , new Object[] {
            T01FQ27_A396EmprCod, T01FQ27_A252CliCod, T01FQ27_A5809MMezCod, T01FQ27_A65ArtCod, T01FQ27_A5822MmezLinCol
            }
            , new Object[] {
            T01FQ28_A396EmprCod, T01FQ28_A252CliCod, T01FQ28_A5809MMezCod
            }
            , new Object[] {
            T01FQ29_A5809MMezCod, T01FQ29_A69ArtDsc, T01FQ29_n69ArtDsc, T01FQ29_A5816MMezArtDsc, T01FQ29_n5816MMezArtDsc, T01FQ29_A5817MmezUltCol, T01FQ29_n5817MmezUltCol, T01FQ29_A5818MmezUltPar, T01FQ29_n5818MmezUltPar, T01FQ29_A5819MmezArtPor,
            T01FQ29_n5819MmezArtPor, T01FQ29_A396EmprCod, T01FQ29_A252CliCod, T01FQ29_A65ArtCod
            }
            , new Object[] {
            T01FQ30_A69ArtDsc, T01FQ30_n69ArtDsc
            }
            , new Object[] {
            T01FQ31_A396EmprCod, T01FQ31_A252CliCod, T01FQ31_A5809MMezCod, T01FQ31_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FQ35_A69ArtDsc, T01FQ35_n69ArtDsc
            }
            , new Object[] {
            T01FQ36_A396EmprCod, T01FQ36_A252CliCod, T01FQ36_A5809MMezCod, T01FQ36_A65ArtCod, T01FQ36_A5829MmezLinPar
            }
            , new Object[] {
            T01FQ37_A396EmprCod, T01FQ37_A252CliCod, T01FQ37_A5809MMezCod, T01FQ37_A65ArtCod, T01FQ37_A5822MmezLinCol
            }
            , new Object[] {
            T01FQ38_A396EmprCod, T01FQ38_A252CliCod, T01FQ38_A5809MMezCod, T01FQ38_A65ArtCod
            }
         }
      );
   }

   private byte Z5817MmezUltCol ;
   private byte Z5818MmezUltPar ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5817MmezUltCol ;
   private byte A5818MmezUltPar ;
   private byte Gx_BScreen ;
   private byte subGridtmezcli_level1item_Backcolorstyle ;
   private byte subGridtmezcli_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtmezcli_level1item_Allowselection ;
   private byte subGridtmezcli_level1item_Allowhovering ;
   private byte subGridtmezcli_level1item_Allowcollapsing ;
   private byte subGridtmezcli_level1item_Collapsed ;
   private short nRcdDeleted_1582 ;
   private short nRcdExists_1582 ;
   private short nIsMod_1582 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1582 ;
   private short RcdFound1582 ;
   private short nBlankRcdUsr1582 ;
   private short RcdFound1581 ;
   private short nIsDirty_1581 ;
   private short nIsDirty_1582 ;
   private int Z252CliCod ;
   private int nRC_GXsfl_84 ;
   private int nGXsfl_84_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtMMezCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtMMezKgs_Enabled ;
   private int edtMMezPda_Enabled ;
   private int edtMMezFecPda_Enabled ;
   private int edtMMezFecEnt_Enabled ;
   private int edtMMezPorTot_Enabled ;
   private int edtMMezPorT_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtMMezArtDsc_Enabled ;
   private int edtMmezUltCol_Enabled ;
   private int edtMmezUltPar_Enabled ;
   private int edtMmezArtPor_Enabled ;
   private int edtMmezArtKil_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtmezcli_level1item_Backcolor ;
   private int subGridtmezcli_level1item_Allbackcolor ;
   private int defedtArtCod_Enabled ;
   private int idxLst ;
   private int subGridtmezcli_level1item_Selectedindex ;
   private int subGridtmezcli_level1item_Selectioncolor ;
   private int subGridtmezcli_level1item_Hoveringcolor ;
   private int ZZ252CliCod ;
   private long GRIDTMEZCLI_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5810MMezKgs ;
   private java.math.BigDecimal Z5814MMezPorTot ;
   private java.math.BigDecimal O5815MMezPorT ;
   private java.math.BigDecimal Z5819MmezArtPor ;
   private java.math.BigDecimal O5819MmezArtPor ;
   private java.math.BigDecimal A5810MMezKgs ;
   private java.math.BigDecimal A5814MMezPorTot ;
   private java.math.BigDecimal A5815MMezPorT ;
   private java.math.BigDecimal B5815MMezPorT ;
   private java.math.BigDecimal s5815MMezPorT ;
   private java.math.BigDecimal A5819MmezArtPor ;
   private java.math.BigDecimal A5820MmezArtKil ;
   private java.math.BigDecimal T5819MmezArtPor ;
   private java.math.BigDecimal Z5815MMezPorT ;
   private java.math.BigDecimal ZZ5810MMezKgs ;
   private java.math.BigDecimal ZZ5814MMezPorTot ;
   private java.math.BigDecimal ZZ5815MMezPorT ;
   private java.math.BigDecimal ZO5815MMezPorT ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5809MMezCod ;
   private String Z5811MMezPda ;
   private String Z65ArtCod ;
   private String Z5816MMezArtDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5809MMezCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_84_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtMMezCod_Internalname ;
   private String edtMMezCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtMMezKgs_Internalname ;
   private String edtMMezKgs_Jsonclick ;
   private String edtMMezPda_Internalname ;
   private String A5811MMezPda ;
   private String edtMMezPda_Jsonclick ;
   private String edtMMezFecPda_Internalname ;
   private String edtMMezFecPda_Jsonclick ;
   private String edtMMezFecEnt_Internalname ;
   private String edtMMezFecEnt_Jsonclick ;
   private String edtMMezPorTot_Internalname ;
   private String edtMMezPorTot_Jsonclick ;
   private String edtMMezPorT_Internalname ;
   private String edtMMezPorT_Jsonclick ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1582 ;
   private String edtArtCod_Internalname ;
   private String edtArtDsc_Internalname ;
   private String edtMMezArtDsc_Internalname ;
   private String edtMmezUltCol_Internalname ;
   private String edtMmezUltPar_Internalname ;
   private String edtMmezArtPor_Internalname ;
   private String edtMmezArtKil_Internalname ;
   private String sStyleString ;
   private String subGridtmezcli_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A69ArtDsc ;
   private String A5816MMezArtDsc ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1581 ;
   private String Z69ArtDsc ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String subGridtmezcli_level1item_Class ;
   private String subGridtmezcli_level1item_Linesclass ;
   private String ROClassString ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Jsonclick ;
   private String edtMMezArtDsc_Jsonclick ;
   private String edtMmezUltCol_Jsonclick ;
   private String edtMmezUltPar_Jsonclick ;
   private String edtMmezArtPor_Jsonclick ;
   private String edtMmezArtKil_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtmezcli_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ5809MMezCod ;
   private String ZZ5811MMezPda ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private java.util.Date Z5812MMezFecPda ;
   private java.util.Date Z5813MMezFecEnt ;
   private java.util.Date A5812MMezFecPda ;
   private java.util.Date A5813MMezFecEnt ;
   private java.util.Date ZZ5812MMezFecPda ;
   private java.util.Date ZZ5813MMezFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5815MMezPorT ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5810MMezKgs ;
   private boolean n5811MMezPda ;
   private boolean n5812MMezFecPda ;
   private boolean n5813MMezFecEnt ;
   private boolean n5814MMezPorTot ;
   private boolean n69ArtDsc ;
   private boolean n5816MMezArtDsc ;
   private boolean n5817MmezUltCol ;
   private boolean n5818MmezUltPar ;
   private boolean n5819MmezArtPor ;
   private com.genexus.webpanels.GXWebGrid Gridtmezcli_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtmezcli_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtmezcli_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T01FQ12_A5809MMezCod ;
   private String[] T01FQ12_A407EmprNom ;
   private boolean[] T01FQ12_n407EmprNom ;
   private String[] T01FQ12_A279CliNom ;
   private java.math.BigDecimal[] T01FQ12_A5810MMezKgs ;
   private boolean[] T01FQ12_n5810MMezKgs ;
   private String[] T01FQ12_A5811MMezPda ;
   private boolean[] T01FQ12_n5811MMezPda ;
   private java.util.Date[] T01FQ12_A5812MMezFecPda ;
   private boolean[] T01FQ12_n5812MMezFecPda ;
   private java.util.Date[] T01FQ12_A5813MMezFecEnt ;
   private boolean[] T01FQ12_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FQ12_A5814MMezPorTot ;
   private boolean[] T01FQ12_n5814MMezPorTot ;
   private String[] T01FQ12_A396EmprCod ;
   private int[] T01FQ12_A252CliCod ;
   private java.math.BigDecimal[] T01FQ12_A5815MMezPorT ;
   private boolean[] T01FQ12_n5815MMezPorT ;
   private String[] T01FQ7_A407EmprNom ;
   private boolean[] T01FQ7_n407EmprNom ;
   private String[] T01FQ8_A279CliNom ;
   private java.math.BigDecimal[] T01FQ10_A5815MMezPorT ;
   private boolean[] T01FQ10_n5815MMezPorT ;
   private String[] T01FQ13_A407EmprNom ;
   private boolean[] T01FQ13_n407EmprNom ;
   private String[] T01FQ14_A279CliNom ;
   private java.math.BigDecimal[] T01FQ16_A5815MMezPorT ;
   private boolean[] T01FQ16_n5815MMezPorT ;
   private String[] T01FQ17_A396EmprCod ;
   private int[] T01FQ17_A252CliCod ;
   private String[] T01FQ17_A5809MMezCod ;
   private String[] T01FQ6_A5809MMezCod ;
   private java.math.BigDecimal[] T01FQ6_A5810MMezKgs ;
   private boolean[] T01FQ6_n5810MMezKgs ;
   private String[] T01FQ6_A5811MMezPda ;
   private boolean[] T01FQ6_n5811MMezPda ;
   private java.util.Date[] T01FQ6_A5812MMezFecPda ;
   private boolean[] T01FQ6_n5812MMezFecPda ;
   private java.util.Date[] T01FQ6_A5813MMezFecEnt ;
   private boolean[] T01FQ6_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FQ6_A5814MMezPorTot ;
   private boolean[] T01FQ6_n5814MMezPorTot ;
   private String[] T01FQ6_A396EmprCod ;
   private int[] T01FQ6_A252CliCod ;
   private String[] T01FQ18_A396EmprCod ;
   private int[] T01FQ18_A252CliCod ;
   private String[] T01FQ18_A5809MMezCod ;
   private String[] T01FQ19_A396EmprCod ;
   private int[] T01FQ19_A252CliCod ;
   private String[] T01FQ19_A5809MMezCod ;
   private String[] T01FQ5_A5809MMezCod ;
   private java.math.BigDecimal[] T01FQ5_A5810MMezKgs ;
   private boolean[] T01FQ5_n5810MMezKgs ;
   private String[] T01FQ5_A5811MMezPda ;
   private boolean[] T01FQ5_n5811MMezPda ;
   private java.util.Date[] T01FQ5_A5812MMezFecPda ;
   private boolean[] T01FQ5_n5812MMezFecPda ;
   private java.util.Date[] T01FQ5_A5813MMezFecEnt ;
   private boolean[] T01FQ5_n5813MMezFecEnt ;
   private java.math.BigDecimal[] T01FQ5_A5814MMezPorTot ;
   private boolean[] T01FQ5_n5814MMezPorTot ;
   private String[] T01FQ5_A396EmprCod ;
   private int[] T01FQ5_A252CliCod ;
   private String[] T01FQ23_A407EmprNom ;
   private boolean[] T01FQ23_n407EmprNom ;
   private String[] T01FQ24_A279CliNom ;
   private java.math.BigDecimal[] T01FQ26_A5815MMezPorT ;
   private boolean[] T01FQ26_n5815MMezPorT ;
   private String[] T01FQ27_A396EmprCod ;
   private int[] T01FQ27_A252CliCod ;
   private String[] T01FQ27_A5809MMezCod ;
   private String[] T01FQ27_A65ArtCod ;
   private byte[] T01FQ27_A5822MmezLinCol ;
   private String[] T01FQ28_A396EmprCod ;
   private int[] T01FQ28_A252CliCod ;
   private String[] T01FQ28_A5809MMezCod ;
   private String[] T01FQ29_A5809MMezCod ;
   private String[] T01FQ29_A69ArtDsc ;
   private boolean[] T01FQ29_n69ArtDsc ;
   private String[] T01FQ29_A5816MMezArtDsc ;
   private boolean[] T01FQ29_n5816MMezArtDsc ;
   private byte[] T01FQ29_A5817MmezUltCol ;
   private boolean[] T01FQ29_n5817MmezUltCol ;
   private byte[] T01FQ29_A5818MmezUltPar ;
   private boolean[] T01FQ29_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FQ29_A5819MmezArtPor ;
   private boolean[] T01FQ29_n5819MmezArtPor ;
   private String[] T01FQ29_A396EmprCod ;
   private int[] T01FQ29_A252CliCod ;
   private String[] T01FQ29_A65ArtCod ;
   private String[] T01FQ4_A69ArtDsc ;
   private boolean[] T01FQ4_n69ArtDsc ;
   private String[] T01FQ30_A69ArtDsc ;
   private boolean[] T01FQ30_n69ArtDsc ;
   private String[] T01FQ31_A396EmprCod ;
   private int[] T01FQ31_A252CliCod ;
   private String[] T01FQ31_A5809MMezCod ;
   private String[] T01FQ31_A65ArtCod ;
   private String[] T01FQ3_A5809MMezCod ;
   private String[] T01FQ3_A5816MMezArtDsc ;
   private boolean[] T01FQ3_n5816MMezArtDsc ;
   private byte[] T01FQ3_A5817MmezUltCol ;
   private boolean[] T01FQ3_n5817MmezUltCol ;
   private byte[] T01FQ3_A5818MmezUltPar ;
   private boolean[] T01FQ3_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FQ3_A5819MmezArtPor ;
   private boolean[] T01FQ3_n5819MmezArtPor ;
   private String[] T01FQ3_A396EmprCod ;
   private int[] T01FQ3_A252CliCod ;
   private String[] T01FQ3_A65ArtCod ;
   private String[] T01FQ2_A5809MMezCod ;
   private String[] T01FQ2_A5816MMezArtDsc ;
   private boolean[] T01FQ2_n5816MMezArtDsc ;
   private byte[] T01FQ2_A5817MmezUltCol ;
   private boolean[] T01FQ2_n5817MmezUltCol ;
   private byte[] T01FQ2_A5818MmezUltPar ;
   private boolean[] T01FQ2_n5818MmezUltPar ;
   private java.math.BigDecimal[] T01FQ2_A5819MmezArtPor ;
   private boolean[] T01FQ2_n5819MmezArtPor ;
   private String[] T01FQ2_A396EmprCod ;
   private int[] T01FQ2_A252CliCod ;
   private String[] T01FQ2_A65ArtCod ;
   private String[] T01FQ35_A69ArtDsc ;
   private boolean[] T01FQ35_n69ArtDsc ;
   private String[] T01FQ36_A396EmprCod ;
   private int[] T01FQ36_A252CliCod ;
   private String[] T01FQ36_A5809MMezCod ;
   private String[] T01FQ36_A65ArtCod ;
   private byte[] T01FQ36_A5829MmezLinPar ;
   private String[] T01FQ37_A396EmprCod ;
   private int[] T01FQ37_A252CliCod ;
   private String[] T01FQ37_A5809MMezCod ;
   private String[] T01FQ37_A65ArtCod ;
   private byte[] T01FQ37_A5822MmezLinCol ;
   private String[] T01FQ38_A396EmprCod ;
   private int[] T01FQ38_A252CliCod ;
   private String[] T01FQ38_A5809MMezCod ;
   private String[] T01FQ38_A65ArtCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmezcli__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcli__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcli__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcli__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FQ2", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?  FOR UPDATE OF MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ3", "SELECT MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ4", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ5", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?  FOR UPDATE OF MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ6", "SELECT MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ10", "SELECT COALESCE( T1.MMezPorT, 0) AS MMezPorT FROM (SELECT SUM(MmezArtPor) AS MMezPorT, EmprCod, CliCod, MMezCod FROM TXPMEZCL1 GROUP BY EmprCod, CliCod, MMezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ12", "SELECT /*+ FIRST_ROWS(100) */ TM1.MMezCod, T2.EmprNom, T3.CliNom, TM1.MMezKgs, TM1.MMezPda, TM1.MMezFecPda, TM1.MMezFecEnt, TM1.MMezPorTot, TM1.EmprCod, TM1.CliCod, COALESCE( T4.MMezPorT, 0) AS MMezPorT FROM (((TXPMEZCLI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT SUM(MmezArtPor) AS MMezPorT, EmprCod, CliCod, MMezCod FROM TXPMEZCL1 GROUP BY EmprCod, CliCod, MMezCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.MMezCod = TM1.MMezCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.MMezCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.MMezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ16", "SELECT COALESCE( T1.MMezPorT, 0) AS MMezPorT FROM (SELECT SUM(MmezArtPor) AS MMezPorT, EmprCod, CliCod, MMezCod FROM TXPMEZCL1 GROUP BY EmprCod, CliCod, MMezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and MMezCod > ?) ORDER BY EmprCod, CliCod, MMezCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FQ19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and MMezCod < ?) ORDER BY EmprCod DESC, CliCod DESC, MMezCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FQ20", "INSERT INTO TXPMEZCLI(MMezCod, MMezKgs, MMezPda, MMezFecPda, MMezFecEnt, MMezPorTot, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FQ21", "UPDATE TXPMEZCLI SET MMezKgs=?, MMezPda=?, MMezFecPda=?, MMezFecEnt=?, MMezPorTot=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new UpdateCursor("T01FQ22", "DELETE FROM TXPMEZCLI  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?", GX_NOMASK, "TXPMEZCLI")
         ,new ForEachCursor("T01FQ23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ26", "SELECT COALESCE( T1.MMezPorT, 0) AS MMezPorT FROM (SELECT SUM(MmezArtPor) AS MMezPorT, EmprCod, CliCod, MMezCod FROM TXPMEZCL1 GROUP BY EmprCod, CliCod, MMezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MMezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ27", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FQ28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, MMezCod FROM TXPMEZCLI ORDER BY EmprCod, CliCod, MMezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ29", "SELECT T1.MMezCod, T2.ArtDsc, T1.MMezArtDsc, T1.MmezUltCol, T1.MmezUltPar, T1.MmezArtPor, T1.EmprCod, T1.CliCod, T1.ArtCod FROM (TXPMEZCL1 T1 INNER JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.MMezCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.MMezCod, T1.ArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ30", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ31", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FQ32", "INSERT INTO TXPMEZCL1(MMezCod, MMezArtDsc, MmezUltCol, MmezUltPar, MmezArtPor, EmprCod, CliCod, ArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FQ33", "UPDATE TXPMEZCL1 SET MMezArtDsc=?, MmezUltCol=?, MmezUltPar=?, MmezArtPor=?  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new UpdateCursor("T01FQ34", "DELETE FROM TXPMEZCL1  WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?", GX_NOMASK, "TXPMEZCL1")
         ,new ForEachCursor("T01FQ35", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FQ36", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinPar FROM TXPMEZPAR WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FQ37", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod, MmezLinCol FROM TXPMEZCOL WHERE EmprCod = ? AND CliCod = ? AND MMezCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FQ38", "SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? and CliCod = ? and MMezCod = ? ORDER BY EmprCod, CliCod, MMezCod, ArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 20);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 20);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 16 :
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
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 20);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 20);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 26);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setString(8, (String)parms[11], 16);
               return;
            case 27 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 20);
               stmt.setString(8, (String)parms[11], 16);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

