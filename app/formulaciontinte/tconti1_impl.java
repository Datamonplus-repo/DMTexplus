package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tconti1_impl extends GXDataArea
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
         A3646EstTinAny = (short)(GXutil.lval( httpContext.GetPar( "EstTinAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = (byte)(GXutil.lval( httpContext.GetPar( "EstTinMes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = (byte)(GXutil.lval( httpContext.GetPar( "EstTinDia"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = (short)(GXutil.lval( httpContext.GetPar( "EstTinNr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A3646EstTinAny, A3647EstTinMes, A3648EstTinDia, A1929EstTinNr) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TCONTI1", ""), (short)(0)) ;
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

   public tconti1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tconti1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tconti1_impl.class ));
   }

   public tconti1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "TCONTI1", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TCONTI1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\TCONTI1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinAny_Internalname, httpContext.getMessage( "Año", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinMes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinMes_Internalname, httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinMes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinDia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinDia_Internalname, httpContext.getMessage( "Dia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinDia_Internalname, GXutil.ltrim( localUtil.ntoc( A3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinDia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinDia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinDia_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TCONTI1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinNr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinNr_Internalname, httpContext.getMessage( "Numero Linea,Secuencial", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinNr_Internalname, GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinNr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinNr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinNr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstNormaId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstNormaId_Internalname, httpContext.getMessage( "Norma", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNormaId_Internalname, GXutil.rtrim( A13944EstNormaId), GXutil.rtrim( localUtil.format( A13944EstNormaId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNormaId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstNormaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstNormDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstNormDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNormDsc_Internalname, GXutil.rtrim( A13945EstNormDsc), GXutil.rtrim( localUtil.format( A13945EstNormDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNormDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstNormDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstNormSt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstNormSt_Internalname, httpContext.getMessage( "Status", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNormSt_Internalname, GXutil.rtrim( A13946EstNormSt), GXutil.rtrim( localUtil.format( A13946EstNormSt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNormSt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstNormSt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstNormNc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstNormNc_Internalname, httpContext.getMessage( "C", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNormNc_Internalname, GXutil.rtrim( A13947EstNormNc), GXutil.rtrim( localUtil.format( A13947EstNormNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNormNc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstNormNc_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TCONTI1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TCONTI1.htm");
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
         Z3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z3646EstTinAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3647EstTinMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3648EstTinDia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( "Z1929EstTinNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13944EstNormaId = httpContext.cgiGet( "Z13944EstNormaId") ;
         Z13945EstNormDsc = httpContext.cgiGet( "Z13945EstNormDsc") ;
         Z13946EstNormSt = httpContext.cgiGet( "Z13946EstNormSt") ;
         Z13947EstNormNc = httpContext.cgiGet( "Z13947EstNormNc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3646EstTinAny = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         }
         else
         {
            A3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINMES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3647EstTinMes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         }
         else
         {
            A3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINDIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3648EstTinDia = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         }
         else
         {
            A3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINNR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinNr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1929EstTinNr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         }
         else
         {
            A1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         }
         A13944EstNormaId = httpContext.cgiGet( edtEstNormaId_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
         A13945EstNormDsc = httpContext.cgiGet( edtEstNormDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13945EstNormDsc", A13945EstNormDsc);
         A13946EstNormSt = httpContext.cgiGet( edtEstNormSt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13946EstNormSt", A13946EstNormSt);
         A13947EstNormNc = httpContext.cgiGet( edtEstNormNc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13947EstNormNc", A13947EstNormNc);
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
            A3646EstTinAny = (short)(GXutil.lval( httpContext.GetPar( "EstTinAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = (byte)(GXutil.lval( httpContext.GetPar( "EstTinMes"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = (byte)(GXutil.lval( httpContext.GetPar( "EstTinDia"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = (short)(GXutil.lval( httpContext.GetPar( "EstTinNr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
            A13944EstNormaId = httpContext.GetPar( "EstNormaId") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
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
            initAll1RV1879( ) ;
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
      disableAttributes1RV1879( ) ;
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

   public void resetCaption1RV0( )
   {
   }

   public void zm1RV1879( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13945EstNormDsc = T01RV3_A13945EstNormDsc[0] ;
            Z13946EstNormSt = T01RV3_A13946EstNormSt[0] ;
            Z13947EstNormNc = T01RV3_A13947EstNormNc[0] ;
         }
         else
         {
            Z13945EstNormDsc = A13945EstNormDsc ;
            Z13946EstNormSt = A13946EstNormSt ;
            Z13947EstNormNc = A13947EstNormNc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13944EstNormaId = A13944EstNormaId ;
         Z13945EstNormDsc = A13945EstNormDsc ;
         Z13946EstNormSt = A13946EstNormSt ;
         Z13947EstNormNc = A13947EstNormNc ;
         Z396EmprCod = A396EmprCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z1929EstTinNr = A1929EstTinNr ;
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

   public void load1RV1879( )
   {
      /* Using cursor T01RV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1879 = (short)(1) ;
         A407EmprNom = T01RV6_A407EmprNom[0] ;
         n407EmprNom = T01RV6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13945EstNormDsc = T01RV6_A13945EstNormDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13945EstNormDsc", A13945EstNormDsc);
         A13946EstNormSt = T01RV6_A13946EstNormSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13946EstNormSt", A13946EstNormSt);
         A13947EstNormNc = T01RV6_A13947EstNormNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13947EstNormNc", A13947EstNormNc);
         zm1RV1879( -1) ;
      }
      pr_default.close(4);
      onLoadActions1RV1879( ) ;
   }

   public void onLoadActions1RV1879( )
   {
   }

   public void checkExtendedTable1RV1879( )
   {
      nIsDirty_1879 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RV4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RV4_A407EmprNom[0] ;
      n407EmprNom = T01RV4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01RV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LCONTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINNR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1RV1879( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01RV7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RV7_A407EmprNom[0] ;
      n407EmprNom = T01RV7_n407EmprNom[0] ;
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
                         short A3646EstTinAny ,
                         byte A3647EstTinMes ,
                         byte A3648EstTinDia ,
                         short A1929EstTinNr )
   {
      /* Using cursor T01RV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LCONTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINNR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1RV1879( )
   {
      /* Using cursor T01RV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1879 = (short)(1) ;
      }
      else
      {
         RcdFound1879 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RV1879( 1) ;
         RcdFound1879 = (short)(1) ;
         A13944EstNormaId = T01RV3_A13944EstNormaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
         A13945EstNormDsc = T01RV3_A13945EstNormDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13945EstNormDsc", A13945EstNormDsc);
         A13946EstNormSt = T01RV3_A13946EstNormSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13946EstNormSt", A13946EstNormSt);
         A13947EstNormNc = T01RV3_A13947EstNormNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13947EstNormNc", A13947EstNormNc);
         A396EmprCod = T01RV3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T01RV3_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01RV3_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01RV3_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = T01RV3_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z1929EstTinNr = A1929EstTinNr ;
         Z13944EstNormaId = A13944EstNormaId ;
         sMode1879 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RV1879( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1879 = (short)(0) ;
            initializeNonKey1RV1879( ) ;
         }
         Gx_mode = sMode1879 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1879 = (short)(0) ;
         initializeNonKey1RV1879( ) ;
         sMode1879 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1879 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RV1879( ) ;
      if ( RcdFound1879 == 0 )
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
      RcdFound1879 = (short)(0) ;
      /* Using cursor T01RV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Short.valueOf(A1929EstTinNr), Short.valueOf(A1929EstTinNr), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, A13944EstNormaId});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3646EstTinAny[0] < A3646EstTinAny ) || ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3647EstTinMes[0] < A3647EstTinMes ) || ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3648EstTinDia[0] < A3648EstTinDia ) || ( T01RV10_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A1929EstTinNr[0] < A1929EstTinNr ) || ( T01RV10_A1929EstTinNr[0] == A1929EstTinNr ) && ( T01RV10_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RV10_A13944EstNormaId[0], A13944EstNormaId) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3646EstTinAny[0] > A3646EstTinAny ) || ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3647EstTinMes[0] > A3647EstTinMes ) || ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A3648EstTinDia[0] > A3648EstTinDia ) || ( T01RV10_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV10_A1929EstTinNr[0] > A1929EstTinNr ) || ( T01RV10_A1929EstTinNr[0] == A1929EstTinNr ) && ( T01RV10_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV10_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV10_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RV10_A13944EstNormaId[0], A13944EstNormaId) > 0 ) ) )
         {
            A396EmprCod = T01RV10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T01RV10_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T01RV10_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T01RV10_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = T01RV10_A1929EstTinNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
            A13944EstNormaId = T01RV10_A13944EstNormaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
            RcdFound1879 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1879 = (short)(0) ;
      /* Using cursor T01RV11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Short.valueOf(A1929EstTinNr), Short.valueOf(A1929EstTinNr), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, A13944EstNormaId});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3646EstTinAny[0] > A3646EstTinAny ) || ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3647EstTinMes[0] > A3647EstTinMes ) || ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3648EstTinDia[0] > A3648EstTinDia ) || ( T01RV11_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A1929EstTinNr[0] > A1929EstTinNr ) || ( T01RV11_A1929EstTinNr[0] == A1929EstTinNr ) && ( T01RV11_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RV11_A13944EstNormaId[0], A13944EstNormaId) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3646EstTinAny[0] < A3646EstTinAny ) || ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3647EstTinMes[0] < A3647EstTinMes ) || ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A3648EstTinDia[0] < A3648EstTinDia ) || ( T01RV11_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RV11_A1929EstTinNr[0] < A1929EstTinNr ) || ( T01RV11_A1929EstTinNr[0] == A1929EstTinNr ) && ( T01RV11_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01RV11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01RV11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01RV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RV11_A13944EstNormaId[0], A13944EstNormaId) < 0 ) ) )
         {
            A396EmprCod = T01RV11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T01RV11_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T01RV11_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T01RV11_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = T01RV11_A1929EstTinNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
            A13944EstNormaId = T01RV11_A13944EstNormaId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
            RcdFound1879 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RV1879( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RV1879( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1879 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) || ( GXutil.strcmp(A13944EstNormaId, Z13944EstNormaId) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A3646EstTinAny = Z3646EstTinAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
               A3647EstTinMes = Z3647EstTinMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
               A3648EstTinDia = Z3648EstTinDia ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
               A1929EstTinNr = Z1929EstTinNr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
               A13944EstNormaId = Z13944EstNormaId ;
               httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
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
               update1RV1879( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) || ( GXutil.strcmp(A13944EstNormaId, Z13944EstNormaId) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RV1879( ) ;
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
                  insert1RV1879( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) || ( GXutil.strcmp(A13944EstNormaId, Z13944EstNormaId) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = Z3646EstTinAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = Z3647EstTinMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = Z3648EstTinDia ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = Z1929EstTinNr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         A13944EstNormaId = Z13944EstNormaId ;
         httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
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
      if ( RcdFound1879 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEstNormDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RV1879( ) ;
      if ( RcdFound1879 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstNormDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RV1879( ) ;
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
      if ( RcdFound1879 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstNormDsc_Internalname ;
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
      if ( RcdFound1879 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstNormDsc_Internalname ;
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
      scanStart1RV1879( ) ;
      if ( RcdFound1879 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1879 != 0 )
         {
            scanNext1RV1879( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstNormDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RV1879( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RV1879( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONTI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13945EstNormDsc, T01RV2_A13945EstNormDsc[0]) != 0 ) || ( GXutil.strcmp(Z13946EstNormSt, T01RV2_A13946EstNormSt[0]) != 0 ) || ( GXutil.strcmp(Z13947EstNormNc, T01RV2_A13947EstNormNc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13945EstNormDsc, T01RV2_A13945EstNormDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tconti1:[seudo value changed for attri]"+"EstNormDsc");
               GXutil.writeLogRaw("Old: ",Z13945EstNormDsc);
               GXutil.writeLogRaw("Current: ",T01RV2_A13945EstNormDsc[0]);
            }
            if ( GXutil.strcmp(Z13946EstNormSt, T01RV2_A13946EstNormSt[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tconti1:[seudo value changed for attri]"+"EstNormSt");
               GXutil.writeLogRaw("Old: ",Z13946EstNormSt);
               GXutil.writeLogRaw("Current: ",T01RV2_A13946EstNormSt[0]);
            }
            if ( GXutil.strcmp(Z13947EstNormNc, T01RV2_A13947EstNormNc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tconti1:[seudo value changed for attri]"+"EstNormNc");
               GXutil.writeLogRaw("Old: ",Z13947EstNormNc);
               GXutil.writeLogRaw("Current: ",T01RV2_A13947EstNormNc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCONTI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RV1879( )
   {
      beforeValidate1RV1879( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RV1879( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RV1879( 0) ;
         checkOptimisticConcurrency1RV1879( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RV1879( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RV1879( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RV12 */
                  pr_default.execute(10, new Object[] {A13944EstNormaId, A13945EstNormDsc, A13946EstNormSt, A13947EstNormNc, A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTI1");
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
                        resetCaption1RV0( ) ;
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
            load1RV1879( ) ;
         }
         endLevel1RV1879( ) ;
      }
      closeExtendedTableCursors1RV1879( ) ;
   }

   public void update1RV1879( )
   {
      beforeValidate1RV1879( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RV1879( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RV1879( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RV1879( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RV1879( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RV13 */
                  pr_default.execute(11, new Object[] {A13945EstNormDsc, A13946EstNormSt, A13947EstNormNc, A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTI1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONTI1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RV1879( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RV0( ) ;
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
         endLevel1RV1879( ) ;
      }
      closeExtendedTableCursors1RV1879( ) ;
   }

   public void deferredUpdate1RV1879( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RV1879( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RV1879( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RV1879( ) ;
         afterConfirm1RV1879( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RV1879( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RV14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTI1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1879 == 0 )
                     {
                        initAll1RV1879( ) ;
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
                     resetCaption1RV0( ) ;
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
      sMode1879 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RV1879( ) ;
      Gx_mode = sMode1879 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RV1879( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RV15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01RV15_A407EmprNom[0] ;
         n407EmprNom = T01RV15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void endLevel1RV1879( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RV1879( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tconti1");
         if ( AnyError == 0 )
         {
            confirmValues1RV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tconti1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RV1879( )
   {
      /* Using cursor T01RV16 */
      pr_default.execute(14);
      RcdFound1879 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1879 = (short)(1) ;
         A396EmprCod = T01RV16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T01RV16_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01RV16_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01RV16_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = T01RV16_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         A13944EstNormaId = T01RV16_A13944EstNormaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RV1879( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1879 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1879 = (short)(1) ;
         A396EmprCod = T01RV16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T01RV16_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01RV16_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01RV16_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = T01RV16_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         A13944EstNormaId = T01RV16_A13944EstNormaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
      }
   }

   public void scanEnd1RV1879( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1RV1879( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RV1879( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RV1879( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RV1879( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RV1879( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RV1879( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RV1879( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEstTinAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinAny_Enabled), 5, 0), true);
      edtEstTinMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinMes_Enabled), 5, 0), true);
      edtEstTinDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinDia_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstTinNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), true);
      edtEstNormaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNormaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNormaId_Enabled), 5, 0), true);
      edtEstNormDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNormDsc_Enabled), 5, 0), true);
      edtEstNormSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNormSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNormSt_Enabled), 5, 0), true);
      edtEstNormNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNormNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNormNc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RV1879( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RV0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tconti1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1929EstTinNr", GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13944EstNormaId", GXutil.rtrim( Z13944EstNormaId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13945EstNormDsc", GXutil.rtrim( Z13945EstNormDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13946EstNormSt", GXutil.rtrim( Z13946EstNormSt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13947EstNormNc", GXutil.rtrim( Z13947EstNormNc));
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
      return formatLink("app.formulaciontinte.tconti1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TCONTI1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TCONTI1", "") ;
   }

   public void initializeNonKey1RV1879( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A13945EstNormDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13945EstNormDsc", A13945EstNormDsc);
      A13946EstNormSt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13946EstNormSt", A13946EstNormSt);
      A13947EstNormNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13947EstNormNc", A13947EstNormNc);
      Z13945EstNormDsc = "" ;
      Z13946EstNormSt = "" ;
      Z13947EstNormNc = "" ;
   }

   public void initAll1RV1879( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3646EstTinAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
      A3647EstTinMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
      A3648EstTinDia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
      A1929EstTinNr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
      A13944EstNormaId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13944EstNormaId", A13944EstNormaId);
      initializeNonKey1RV1879( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511272", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tconti1.js", "?20268241511272", false, true);
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
      edtEstTinAny_Internalname = "ESTTINANY" ;
      edtEstTinMes_Internalname = "ESTTINMES" ;
      edtEstTinDia_Internalname = "ESTTINDIA" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEstTinNr_Internalname = "ESTTINNR" ;
      edtEstNormaId_Internalname = "ESTNORMAID" ;
      edtEstNormDsc_Internalname = "ESTNORMDSC" ;
      edtEstNormSt_Internalname = "ESTNORMST" ;
      edtEstNormNc_Internalname = "ESTNORMNC" ;
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
      Form.setCaption( httpContext.getMessage( "TCONTI1", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEstNormNc_Jsonclick = "" ;
      edtEstNormNc_Enabled = 1 ;
      edtEstNormSt_Jsonclick = "" ;
      edtEstNormSt_Enabled = 1 ;
      edtEstNormDsc_Jsonclick = "" ;
      edtEstNormDsc_Enabled = 1 ;
      edtEstNormaId_Jsonclick = "" ;
      edtEstNormaId_Enabled = 1 ;
      edtEstTinNr_Jsonclick = "" ;
      edtEstTinNr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEstTinDia_Jsonclick = "" ;
      edtEstTinDia_Enabled = 1 ;
      edtEstTinMes_Jsonclick = "" ;
      edtEstTinMes_Enabled = 1 ;
      edtEstTinAny_Jsonclick = "" ;
      edtEstTinAny_Enabled = 1 ;
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
      /* Using cursor T01RV15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RV15_A407EmprNom[0] ;
      n407EmprNom = T01RV15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01RV17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LCONTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINNR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtEstNormDsc_Internalname ;
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
      /* Using cursor T01RV15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RV15_A407EmprNom[0] ;
      n407EmprNom = T01RV15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Esttinnr( )
   {
      /* Using cursor T01RV17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LCONTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINNR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Estnormaid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13945EstNormDsc", GXutil.rtrim( A13945EstNormDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13946EstNormSt", GXutil.rtrim( A13946EstNormSt));
      httpContext.ajax_rsp_assign_attri("", false, "A13947EstNormNc", GXutil.rtrim( A13947EstNormNc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1929EstTinNr", GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13944EstNormaId", GXutil.rtrim( Z13944EstNormaId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13945EstNormDsc", GXutil.rtrim( Z13945EstNormDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13946EstNormSt", GXutil.rtrim( Z13946EstNormSt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13947EstNormNc", GXutil.rtrim( Z13947EstNormNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_ESTTINANY","{handler:'valid_Esttinany',iparms:[]");
      setEventMetadata("VALID_ESTTINANY",",oparms:[]}");
      setEventMetadata("VALID_ESTTINMES","{handler:'valid_Esttinmes',iparms:[]");
      setEventMetadata("VALID_ESTTINMES",",oparms:[]}");
      setEventMetadata("VALID_ESTTINDIA","{handler:'valid_Esttindia',iparms:[]");
      setEventMetadata("VALID_ESTTINDIA",",oparms:[]}");
      setEventMetadata("VALID_ESTTINNR","{handler:'valid_Esttinnr',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'A1929EstTinNr',fld:'ESTTINNR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ESTTINNR",",oparms:[]}");
      setEventMetadata("VALID_ESTNORMAID","{handler:'valid_Estnormaid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'A1929EstTinNr',fld:'ESTTINNR',pic:'ZZZ9'},{av:'A13944EstNormaId',fld:'ESTNORMAID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTNORMAID",",oparms:[{av:'A13945EstNormDsc',fld:'ESTNORMDSC',pic:''},{av:'A13946EstNormSt',fld:'ESTNORMST',pic:''},{av:'A13947EstNormNc',fld:'ESTNORMNC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3646EstTinAny'},{av:'Z3647EstTinMes'},{av:'Z3648EstTinDia'},{av:'Z1929EstTinNr'},{av:'Z13944EstNormaId'},{av:'Z13945EstNormDsc'},{av:'Z13946EstNormSt'},{av:'Z13947EstNormNc'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13944EstNormaId = "" ;
      Z13945EstNormDsc = "" ;
      Z13946EstNormSt = "" ;
      Z13947EstNormNc = "" ;
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
      A13944EstNormaId = "" ;
      A13945EstNormDsc = "" ;
      A13946EstNormSt = "" ;
      A13947EstNormNc = "" ;
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
      T01RV6_A13944EstNormaId = new String[] {""} ;
      T01RV6_A407EmprNom = new String[] {""} ;
      T01RV6_n407EmprNom = new boolean[] {false} ;
      T01RV6_A13945EstNormDsc = new String[] {""} ;
      T01RV6_A13946EstNormSt = new String[] {""} ;
      T01RV6_A13947EstNormNc = new String[] {""} ;
      T01RV6_A396EmprCod = new String[] {""} ;
      T01RV6_A3646EstTinAny = new short[1] ;
      T01RV6_A3647EstTinMes = new byte[1] ;
      T01RV6_A3648EstTinDia = new byte[1] ;
      T01RV6_A1929EstTinNr = new short[1] ;
      T01RV4_A407EmprNom = new String[] {""} ;
      T01RV4_n407EmprNom = new boolean[] {false} ;
      T01RV5_A396EmprCod = new String[] {""} ;
      T01RV7_A407EmprNom = new String[] {""} ;
      T01RV7_n407EmprNom = new boolean[] {false} ;
      T01RV8_A396EmprCod = new String[] {""} ;
      T01RV9_A396EmprCod = new String[] {""} ;
      T01RV9_A3646EstTinAny = new short[1] ;
      T01RV9_A3647EstTinMes = new byte[1] ;
      T01RV9_A3648EstTinDia = new byte[1] ;
      T01RV9_A1929EstTinNr = new short[1] ;
      T01RV9_A13944EstNormaId = new String[] {""} ;
      T01RV3_A13944EstNormaId = new String[] {""} ;
      T01RV3_A13945EstNormDsc = new String[] {""} ;
      T01RV3_A13946EstNormSt = new String[] {""} ;
      T01RV3_A13947EstNormNc = new String[] {""} ;
      T01RV3_A396EmprCod = new String[] {""} ;
      T01RV3_A3646EstTinAny = new short[1] ;
      T01RV3_A3647EstTinMes = new byte[1] ;
      T01RV3_A3648EstTinDia = new byte[1] ;
      T01RV3_A1929EstTinNr = new short[1] ;
      sMode1879 = "" ;
      T01RV10_A396EmprCod = new String[] {""} ;
      T01RV10_A3646EstTinAny = new short[1] ;
      T01RV10_A3647EstTinMes = new byte[1] ;
      T01RV10_A3648EstTinDia = new byte[1] ;
      T01RV10_A1929EstTinNr = new short[1] ;
      T01RV10_A13944EstNormaId = new String[] {""} ;
      T01RV11_A396EmprCod = new String[] {""} ;
      T01RV11_A3646EstTinAny = new short[1] ;
      T01RV11_A3647EstTinMes = new byte[1] ;
      T01RV11_A3648EstTinDia = new byte[1] ;
      T01RV11_A1929EstTinNr = new short[1] ;
      T01RV11_A13944EstNormaId = new String[] {""} ;
      T01RV2_A13944EstNormaId = new String[] {""} ;
      T01RV2_A13945EstNormDsc = new String[] {""} ;
      T01RV2_A13946EstNormSt = new String[] {""} ;
      T01RV2_A13947EstNormNc = new String[] {""} ;
      T01RV2_A396EmprCod = new String[] {""} ;
      T01RV2_A3646EstTinAny = new short[1] ;
      T01RV2_A3647EstTinMes = new byte[1] ;
      T01RV2_A3648EstTinDia = new byte[1] ;
      T01RV2_A1929EstTinNr = new short[1] ;
      T01RV15_A407EmprNom = new String[] {""} ;
      T01RV15_n407EmprNom = new boolean[] {false} ;
      T01RV16_A396EmprCod = new String[] {""} ;
      T01RV16_A3646EstTinAny = new short[1] ;
      T01RV16_A3647EstTinMes = new byte[1] ;
      T01RV16_A3648EstTinDia = new byte[1] ;
      T01RV16_A1929EstTinNr = new short[1] ;
      T01RV16_A13944EstNormaId = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01RV17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ13944EstNormaId = "" ;
      ZZ13945EstNormDsc = "" ;
      ZZ13946EstNormSt = "" ;
      ZZ13947EstNormNc = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tconti1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tconti1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tconti1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tconti1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tconti1__default(),
         new Object[] {
             new Object[] {
            T01RV2_A13944EstNormaId, T01RV2_A13945EstNormDsc, T01RV2_A13946EstNormSt, T01RV2_A13947EstNormNc, T01RV2_A396EmprCod, T01RV2_A3646EstTinAny, T01RV2_A3647EstTinMes, T01RV2_A3648EstTinDia, T01RV2_A1929EstTinNr
            }
            , new Object[] {
            T01RV3_A13944EstNormaId, T01RV3_A13945EstNormDsc, T01RV3_A13946EstNormSt, T01RV3_A13947EstNormNc, T01RV3_A396EmprCod, T01RV3_A3646EstTinAny, T01RV3_A3647EstTinMes, T01RV3_A3648EstTinDia, T01RV3_A1929EstTinNr
            }
            , new Object[] {
            T01RV4_A407EmprNom, T01RV4_n407EmprNom
            }
            , new Object[] {
            T01RV5_A396EmprCod
            }
            , new Object[] {
            T01RV6_A13944EstNormaId, T01RV6_A407EmprNom, T01RV6_n407EmprNom, T01RV6_A13945EstNormDsc, T01RV6_A13946EstNormSt, T01RV6_A13947EstNormNc, T01RV6_A396EmprCod, T01RV6_A3646EstTinAny, T01RV6_A3647EstTinMes, T01RV6_A3648EstTinDia,
            T01RV6_A1929EstTinNr
            }
            , new Object[] {
            T01RV7_A407EmprNom, T01RV7_n407EmprNom
            }
            , new Object[] {
            T01RV8_A396EmprCod
            }
            , new Object[] {
            T01RV9_A396EmprCod, T01RV9_A3646EstTinAny, T01RV9_A3647EstTinMes, T01RV9_A3648EstTinDia, T01RV9_A1929EstTinNr, T01RV9_A13944EstNormaId
            }
            , new Object[] {
            T01RV10_A396EmprCod, T01RV10_A3646EstTinAny, T01RV10_A3647EstTinMes, T01RV10_A3648EstTinDia, T01RV10_A1929EstTinNr, T01RV10_A13944EstNormaId
            }
            , new Object[] {
            T01RV11_A396EmprCod, T01RV11_A3646EstTinAny, T01RV11_A3647EstTinMes, T01RV11_A3648EstTinDia, T01RV11_A1929EstTinNr, T01RV11_A13944EstNormaId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RV15_A407EmprNom, T01RV15_n407EmprNom
            }
            , new Object[] {
            T01RV16_A396EmprCod, T01RV16_A3646EstTinAny, T01RV16_A3647EstTinMes, T01RV16_A3648EstTinDia, T01RV16_A1929EstTinNr, T01RV16_A13944EstNormaId
            }
            , new Object[] {
            T01RV17_A396EmprCod
            }
         }
      );
   }

   private byte Z3647EstTinMes ;
   private byte Z3648EstTinDia ;
   private byte GxWebError ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ3647EstTinMes ;
   private byte ZZ3648EstTinDia ;
   private short Z3646EstTinAny ;
   private short Z1929EstTinNr ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1879 ;
   private short nIsDirty_1879 ;
   private short ZZ3646EstTinAny ;
   private short ZZ1929EstTinNr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEstTinAny_Enabled ;
   private int edtEstTinMes_Enabled ;
   private int edtEstTinDia_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstTinNr_Enabled ;
   private int edtEstNormaId_Enabled ;
   private int edtEstNormDsc_Enabled ;
   private int edtEstNormSt_Enabled ;
   private int edtEstNormNc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13944EstNormaId ;
   private String Z13945EstNormDsc ;
   private String Z13946EstNormSt ;
   private String Z13947EstNormNc ;
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
   private String edtEstTinAny_Internalname ;
   private String edtEstTinAny_Jsonclick ;
   private String edtEstTinMes_Internalname ;
   private String edtEstTinMes_Jsonclick ;
   private String edtEstTinDia_Internalname ;
   private String edtEstTinDia_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEstTinNr_Internalname ;
   private String edtEstTinNr_Jsonclick ;
   private String edtEstNormaId_Internalname ;
   private String A13944EstNormaId ;
   private String edtEstNormaId_Jsonclick ;
   private String edtEstNormDsc_Internalname ;
   private String A13945EstNormDsc ;
   private String edtEstNormDsc_Jsonclick ;
   private String edtEstNormSt_Internalname ;
   private String A13946EstNormSt ;
   private String edtEstNormSt_Jsonclick ;
   private String edtEstNormNc_Internalname ;
   private String A13947EstNormNc ;
   private String edtEstNormNc_Jsonclick ;
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
   private String sMode1879 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ13944EstNormaId ;
   private String ZZ13945EstNormDsc ;
   private String ZZ13946EstNormSt ;
   private String ZZ13947EstNormNc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private String[] T01RV6_A13944EstNormaId ;
   private String[] T01RV6_A407EmprNom ;
   private boolean[] T01RV6_n407EmprNom ;
   private String[] T01RV6_A13945EstNormDsc ;
   private String[] T01RV6_A13946EstNormSt ;
   private String[] T01RV6_A13947EstNormNc ;
   private String[] T01RV6_A396EmprCod ;
   private short[] T01RV6_A3646EstTinAny ;
   private byte[] T01RV6_A3647EstTinMes ;
   private byte[] T01RV6_A3648EstTinDia ;
   private short[] T01RV6_A1929EstTinNr ;
   private String[] T01RV4_A407EmprNom ;
   private boolean[] T01RV4_n407EmprNom ;
   private String[] T01RV5_A396EmprCod ;
   private String[] T01RV7_A407EmprNom ;
   private boolean[] T01RV7_n407EmprNom ;
   private String[] T01RV8_A396EmprCod ;
   private String[] T01RV9_A396EmprCod ;
   private short[] T01RV9_A3646EstTinAny ;
   private byte[] T01RV9_A3647EstTinMes ;
   private byte[] T01RV9_A3648EstTinDia ;
   private short[] T01RV9_A1929EstTinNr ;
   private String[] T01RV9_A13944EstNormaId ;
   private String[] T01RV3_A13944EstNormaId ;
   private String[] T01RV3_A13945EstNormDsc ;
   private String[] T01RV3_A13946EstNormSt ;
   private String[] T01RV3_A13947EstNormNc ;
   private String[] T01RV3_A396EmprCod ;
   private short[] T01RV3_A3646EstTinAny ;
   private byte[] T01RV3_A3647EstTinMes ;
   private byte[] T01RV3_A3648EstTinDia ;
   private short[] T01RV3_A1929EstTinNr ;
   private String[] T01RV10_A396EmprCod ;
   private short[] T01RV10_A3646EstTinAny ;
   private byte[] T01RV10_A3647EstTinMes ;
   private byte[] T01RV10_A3648EstTinDia ;
   private short[] T01RV10_A1929EstTinNr ;
   private String[] T01RV10_A13944EstNormaId ;
   private String[] T01RV11_A396EmprCod ;
   private short[] T01RV11_A3646EstTinAny ;
   private byte[] T01RV11_A3647EstTinMes ;
   private byte[] T01RV11_A3648EstTinDia ;
   private short[] T01RV11_A1929EstTinNr ;
   private String[] T01RV11_A13944EstNormaId ;
   private String[] T01RV2_A13944EstNormaId ;
   private String[] T01RV2_A13945EstNormDsc ;
   private String[] T01RV2_A13946EstNormSt ;
   private String[] T01RV2_A13947EstNormNc ;
   private String[] T01RV2_A396EmprCod ;
   private short[] T01RV2_A3646EstTinAny ;
   private byte[] T01RV2_A3647EstTinMes ;
   private byte[] T01RV2_A3648EstTinDia ;
   private short[] T01RV2_A1929EstTinNr ;
   private String[] T01RV15_A407EmprNom ;
   private boolean[] T01RV15_n407EmprNom ;
   private String[] T01RV16_A396EmprCod ;
   private short[] T01RV16_A3646EstTinAny ;
   private byte[] T01RV16_A3647EstTinMes ;
   private byte[] T01RV16_A3648EstTinDia ;
   private short[] T01RV16_A1929EstTinNr ;
   private String[] T01RV16_A13944EstNormaId ;
   private String[] T01RV17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tconti1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconti1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconti1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconti1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconti1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RV2", "SELECT EstNormaId, EstNormDsc, EstNormSt, EstNormNc, EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? AND EstNormaId = ?  FOR UPDATE OF EstNormDsc, EstNormSt, EstNormNc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV3", "SELECT EstNormaId, EstNormDsc, EstNormSt, EstNormNc, EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? AND EstNormaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV5", "SELECT EmprCod FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV6", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstNormaId, T2.EmprNom, TM1.EstNormDsc, TM1.EstNormSt, TM1.EstNormNc, TM1.EmprCod, TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia, TM1.EstTinNr FROM (TXPCONTI1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.EstTinAny = ? and TM1.EstTinMes = ? and TM1.EstTinDia = ? and TM1.EstTinNr = ? and TM1.EstNormaId = ? ORDER BY TM1.EmprCod, TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia, TM1.EstTinNr, TM1.EstNormaId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV8", "SELECT EmprCod FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? AND EstNormaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE ( EmprCod > ? or EmprCod = ? and EstTinAny > ? or EstTinAny = ? and EmprCod = ? and EstTinMes > ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia > ? or EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinNr > ? or EstTinNr = ? and EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstNormaId > ?) ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RV11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE ( EmprCod < ? or EmprCod = ? and EstTinAny < ? or EstTinAny = ? and EmprCod = ? and EstTinMes < ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia < ? or EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinNr < ? or EstTinNr = ? and EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstNormaId < ?) ORDER BY EmprCod DESC, EstTinAny DESC, EstTinMes DESC, EstTinDia DESC, EstTinNr DESC, EstNormaId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RV12", "INSERT INTO TXPCONTI1(EstNormaId, EstNormDsc, EstNormSt, EstNormNc, EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCONTI1")
         ,new UpdateCursor("T01RV13", "UPDATE TXPCONTI1 SET EstNormDsc=?, EstNormSt=?, EstNormNc=?  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? AND EstNormaId = ?", GX_NOMASK, "TXPCONTI1")
         ,new UpdateCursor("T01RV14", "DELETE FROM TXPCONTI1  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? AND EstNormaId = ?", GX_NOMASK, "TXPCONTI1")
         ,new ForEachCursor("T01RV15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RV17", "SELECT EmprCod FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 15 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 4);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

