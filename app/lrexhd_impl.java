package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lrexhd_impl extends GXDataArea
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
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A2248ManCod, A2711RpExHdFe) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla LREXHD", ""), (short)(0)) ;
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

   public lrexhd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lrexhd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lrexhd_impl.class ));
   }

   public lrexhd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla LREXHD", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LREXHD.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LREXHD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtManCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdFe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdFe_Internalname, httpContext.getMessage( "Fecha Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRpExHdFe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdFe_Internalname, localUtil.format(A2711RpExHdFe, "99/99/99"), localUtil.format( A2711RpExHdFe, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdFe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdFe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRpExHdFe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRpExHdFe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LREXHD.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdLi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdLi_Internalname, httpContext.getMessage( "Numero Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdLi_Internalname, GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2713RpExHdLi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2713RpExHdLi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdLi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdLi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdAlb_Internalname, httpContext.getMessage( "Albaran de Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2714RpExHdAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2714RpExHdAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdAlb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdKgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdKgs_Internalname, httpContext.getMessage( "Kgs Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdKgs_Enabled!=0) ? localUtil.format( A2715RpExHdKgs, "ZZZZZ9.99") : localUtil.format( A2715RpExHdKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdKgs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdCns_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdCns_Internalname, httpContext.getMessage( "Conos Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdCns_Internalname, GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdCns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2716RpExHdCns), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2716RpExHdCns), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdCns_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdCns_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdTip_Internalname, httpContext.getMessage( "Tipo Entrega,Parcial o Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdTip_Internalname, GXutil.rtrim( A2717RpExHdTip), GXutil.rtrim( localUtil.format( A2717RpExHdTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdRes_Internalname, httpContext.getMessage( "Restos? S/N", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdRes_Internalname, GXutil.rtrim( A2718RpExHdRes), GXutil.rtrim( localUtil.format( A2718RpExHdRes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdRes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdRes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdLoc_Internalname, GXutil.rtrim( A2719RpExHdLoc), GXutil.rtrim( localUtil.format( A2719RpExHdLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdLoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExHdMts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExHdMts_Internalname, httpContext.getMessage( "Metros Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdMts_Enabled!=0) ? localUtil.format( A2847RpExHdMts, "ZZZZZ9.99") : localUtil.format( A2847RpExHdMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdMts_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExHdMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero del Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRpExSalLn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRpExSalLn_Internalname, httpContext.getMessage( "Linea Alnaran Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExSalLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExSalLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6262RpExSalLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6262RpExSalLn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExSalLn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRpExSalLn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LREXHD.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LREXHD.htm");
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
         Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2711RpExHdFe = localUtil.ctod( httpContext.cgiGet( "Z2711RpExHdFe"), 0) ;
         Z2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z2713RpExHdLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2714RpExHdAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2715RpExHdKgs = localUtil.ctond( httpContext.cgiGet( "Z2715RpExHdKgs")) ;
         Z2716RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( "Z2716RpExHdCns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2717RpExHdTip = httpContext.cgiGet( "Z2717RpExHdTip") ;
         Z2718RpExHdRes = httpContext.cgiGet( "Z2718RpExHdRes") ;
         Z2719RpExHdLoc = httpContext.cgiGet( "Z2719RpExHdLoc") ;
         Z2847RpExHdMts = localUtil.ctond( httpContext.cgiGet( "Z2847RpExHdMts")) ;
         Z6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( "Z6262RpExSalLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2248ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtRpExHdFe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RPEXHDFE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdFe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2711RpExHdFe = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         }
         else
         {
            A2711RpExHdFe = localUtil.ctod( httpContext.cgiGet( edtRpExHdFe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2713RpExHdLi = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
         }
         else
         {
            A2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDALB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdAlb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2714RpExHdAlb = 0 ;
            n2714RpExHdAlb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2714RpExHdAlb), 8, 0));
         }
         else
         {
            A2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2714RpExHdAlb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2714RpExHdAlb), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2715RpExHdKgs = DecimalUtil.ZERO ;
            n2715RpExHdKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrimstr( A2715RpExHdKgs, 9, 2));
         }
         else
         {
            A2715RpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)) ;
            n2715RpExHdKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrimstr( A2715RpExHdKgs, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDCNS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdCns_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2716RpExHdCns = (short)(0) ;
            n2716RpExHdCns = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2716RpExHdCns), 4, 0));
         }
         else
         {
            A2716RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2716RpExHdCns = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2716RpExHdCns), 4, 0));
         }
         A2717RpExHdTip = httpContext.cgiGet( edtRpExHdTip_Internalname) ;
         n2717RpExHdTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2717RpExHdTip", A2717RpExHdTip);
         A2718RpExHdRes = httpContext.cgiGet( edtRpExHdRes_Internalname) ;
         n2718RpExHdRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2718RpExHdRes", A2718RpExHdRes);
         A2719RpExHdLoc = httpContext.cgiGet( edtRpExHdLoc_Internalname) ;
         n2719RpExHdLoc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2719RpExHdLoc", A2719RpExHdLoc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDMTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdMts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2847RpExHdMts = DecimalUtil.ZERO ;
            n2847RpExHdMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrimstr( A2847RpExHdMts, 9, 2));
         }
         else
         {
            A2847RpExHdMts = localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)) ;
            n2847RpExHdMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrimstr( A2847RpExHdMts, 9, 2));
         }
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXSALLN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExSalLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6262RpExSalLn = (short)(0) ;
            n6262RpExSalLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6262RpExSalLn), 4, 0));
         }
         else
         {
            A6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6262RpExSalLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6262RpExSalLn), 4, 0));
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
            A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
            A2713RpExHdLi = (short)(GXutil.lval( httpContext.GetPar( "RpExHdLi"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
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
            initAll1PT385( ) ;
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
      disableAttributes1PT385( ) ;
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

   public void resetCaption1PT0( )
   {
   }

   public void zm1PT385( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2714RpExHdAlb = T01PT3_A2714RpExHdAlb[0] ;
            Z2715RpExHdKgs = T01PT3_A2715RpExHdKgs[0] ;
            Z2716RpExHdCns = T01PT3_A2716RpExHdCns[0] ;
            Z2717RpExHdTip = T01PT3_A2717RpExHdTip[0] ;
            Z2718RpExHdRes = T01PT3_A2718RpExHdRes[0] ;
            Z2719RpExHdLoc = T01PT3_A2719RpExHdLoc[0] ;
            Z2847RpExHdMts = T01PT3_A2847RpExHdMts[0] ;
            Z6262RpExSalLn = T01PT3_A6262RpExSalLn[0] ;
            Z129BarCod = T01PT3_A129BarCod[0] ;
            Z132BarCodReo = T01PT3_A132BarCodReo[0] ;
            Z130BarCodPar = T01PT3_A130BarCodPar[0] ;
         }
         else
         {
            Z2714RpExHdAlb = A2714RpExHdAlb ;
            Z2715RpExHdKgs = A2715RpExHdKgs ;
            Z2716RpExHdCns = A2716RpExHdCns ;
            Z2717RpExHdTip = A2717RpExHdTip ;
            Z2718RpExHdRes = A2718RpExHdRes ;
            Z2719RpExHdLoc = A2719RpExHdLoc ;
            Z2847RpExHdMts = A2847RpExHdMts ;
            Z6262RpExSalLn = A6262RpExSalLn ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2713RpExHdLi = A2713RpExHdLi ;
         Z2714RpExHdAlb = A2714RpExHdAlb ;
         Z2715RpExHdKgs = A2715RpExHdKgs ;
         Z2716RpExHdCns = A2716RpExHdCns ;
         Z2717RpExHdTip = A2717RpExHdTip ;
         Z2718RpExHdRes = A2718RpExHdRes ;
         Z2719RpExHdLoc = A2719RpExHdLoc ;
         Z2847RpExHdMts = A2847RpExHdMts ;
         Z6262RpExSalLn = A6262RpExSalLn ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2248ManCod = A2248ManCod ;
         Z2711RpExHdFe = A2711RpExHdFe ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z252CliCod = A252CliCod ;
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

   public void load1PT385( )
   {
      /* Using cursor T01PT6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A2714RpExHdAlb = T01PT6_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = T01PT6_n2714RpExHdAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2714RpExHdAlb), 8, 0));
         A2715RpExHdKgs = T01PT6_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = T01PT6_n2715RpExHdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrimstr( A2715RpExHdKgs, 9, 2));
         A2716RpExHdCns = T01PT6_A2716RpExHdCns[0] ;
         n2716RpExHdCns = T01PT6_n2716RpExHdCns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2716RpExHdCns), 4, 0));
         A2717RpExHdTip = T01PT6_A2717RpExHdTip[0] ;
         n2717RpExHdTip = T01PT6_n2717RpExHdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2717RpExHdTip", A2717RpExHdTip);
         A2718RpExHdRes = T01PT6_A2718RpExHdRes[0] ;
         n2718RpExHdRes = T01PT6_n2718RpExHdRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2718RpExHdRes", A2718RpExHdRes);
         A2719RpExHdLoc = T01PT6_A2719RpExHdLoc[0] ;
         n2719RpExHdLoc = T01PT6_n2719RpExHdLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2719RpExHdLoc", A2719RpExHdLoc);
         A2847RpExHdMts = T01PT6_A2847RpExHdMts[0] ;
         n2847RpExHdMts = T01PT6_n2847RpExHdMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrimstr( A2847RpExHdMts, 9, 2));
         A135BarColNom = T01PT6_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01PT6_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A6262RpExSalLn = T01PT6_A6262RpExSalLn[0] ;
         n6262RpExSalLn = T01PT6_n6262RpExSalLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6262RpExSalLn), 4, 0));
         A129BarCod = T01PT6_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PT6_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PT6_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = T01PT6_A252CliCod[0] ;
         n252CliCod = T01PT6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1PT385( -1) ;
      }
      pr_default.close(4);
      onLoadActions1PT385( ) ;
   }

   public void onLoadActions1PT385( )
   {
   }

   public void checkExtendedTable1PT385( )
   {
      nIsDirty_385 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A135BarColNom = T01PT4_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01PT4_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A252CliCod = T01PT4_A252CliCod[0] ;
      n252CliCod = T01PT4_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(2);
      /* Using cursor T01PT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CREXHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPEXHDFE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1PT385( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01PT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A135BarColNom = T01PT7_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01PT7_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A252CliCod = T01PT7_A252CliCod[0] ;
      n252CliCod = T01PT7_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
                         short A2248ManCod ,
                         java.util.Date A2711RpExHdFe )
   {
      /* Using cursor T01PT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CREXHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPEXHDFE");
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

   public void getKey1PT385( )
   {
      /* Using cursor T01PT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound385 = (short)(1) ;
      }
      else
      {
         RcdFound385 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PT385( 1) ;
         RcdFound385 = (short)(1) ;
         A2713RpExHdLi = T01PT3_A2713RpExHdLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
         A2714RpExHdAlb = T01PT3_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = T01PT3_n2714RpExHdAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2714RpExHdAlb), 8, 0));
         A2715RpExHdKgs = T01PT3_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = T01PT3_n2715RpExHdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrimstr( A2715RpExHdKgs, 9, 2));
         A2716RpExHdCns = T01PT3_A2716RpExHdCns[0] ;
         n2716RpExHdCns = T01PT3_n2716RpExHdCns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2716RpExHdCns), 4, 0));
         A2717RpExHdTip = T01PT3_A2717RpExHdTip[0] ;
         n2717RpExHdTip = T01PT3_n2717RpExHdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2717RpExHdTip", A2717RpExHdTip);
         A2718RpExHdRes = T01PT3_A2718RpExHdRes[0] ;
         n2718RpExHdRes = T01PT3_n2718RpExHdRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2718RpExHdRes", A2718RpExHdRes);
         A2719RpExHdLoc = T01PT3_A2719RpExHdLoc[0] ;
         n2719RpExHdLoc = T01PT3_n2719RpExHdLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2719RpExHdLoc", A2719RpExHdLoc);
         A2847RpExHdMts = T01PT3_A2847RpExHdMts[0] ;
         n2847RpExHdMts = T01PT3_n2847RpExHdMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrimstr( A2847RpExHdMts, 9, 2));
         A6262RpExSalLn = T01PT3_A6262RpExSalLn[0] ;
         n6262RpExSalLn = T01PT3_n6262RpExSalLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6262RpExSalLn), 4, 0));
         A396EmprCod = T01PT3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01PT3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01PT3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01PT3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2248ManCod = T01PT3_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = T01PT3_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z2711RpExHdFe = A2711RpExHdFe ;
         Z2713RpExHdLi = A2713RpExHdLi ;
         sMode385 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1PT385( ) ;
         if ( AnyError == 1 )
         {
            RcdFound385 = (short)(0) ;
            initializeNonKey1PT385( ) ;
         }
         Gx_mode = sMode385 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound385 = (short)(0) ;
         initializeNonKey1PT385( ) ;
         sMode385 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode385 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PT385( ) ;
      if ( RcdFound385 == 0 )
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
      RcdFound385 = (short)(0) ;
      /* Using cursor T01PT10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2711RpExHdFe, A2711RpExHdFe, Short.valueOf(A2248ManCod), A396EmprCod, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT10_A2248ManCod[0] < A2248ManCod ) || ( T01PT10_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01PT10_A2711RpExHdFe[0]).before( GXutil.resetTime( A2711RpExHdFe )) || GXutil.dateCompare(GXutil.resetTime(T01PT10_A2711RpExHdFe[0]), GXutil.resetTime(A2711RpExHdFe)) && ( T01PT10_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT10_A2713RpExHdLi[0] < A2713RpExHdLi ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT10_A2248ManCod[0] > A2248ManCod ) || ( T01PT10_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01PT10_A2711RpExHdFe[0]).after( GXutil.resetTime( A2711RpExHdFe )) || GXutil.dateCompare(GXutil.resetTime(T01PT10_A2711RpExHdFe[0]), GXutil.resetTime(A2711RpExHdFe)) && ( T01PT10_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT10_A2713RpExHdLi[0] > A2713RpExHdLi ) ) )
         {
            A396EmprCod = T01PT10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T01PT10_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = T01PT10_A2711RpExHdFe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
            A2713RpExHdLi = T01PT10_A2713RpExHdLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
            RcdFound385 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound385 = (short)(0) ;
      /* Using cursor T01PT11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2711RpExHdFe, A2711RpExHdFe, Short.valueOf(A2248ManCod), A396EmprCod, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT11_A2248ManCod[0] > A2248ManCod ) || ( T01PT11_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01PT11_A2711RpExHdFe[0]).after( GXutil.resetTime( A2711RpExHdFe )) || GXutil.dateCompare(GXutil.resetTime(T01PT11_A2711RpExHdFe[0]), GXutil.resetTime(A2711RpExHdFe)) && ( T01PT11_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT11_A2713RpExHdLi[0] > A2713RpExHdLi ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT11_A2248ManCod[0] < A2248ManCod ) || ( T01PT11_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01PT11_A2711RpExHdFe[0]).before( GXutil.resetTime( A2711RpExHdFe )) || GXutil.dateCompare(GXutil.resetTime(T01PT11_A2711RpExHdFe[0]), GXutil.resetTime(A2711RpExHdFe)) && ( T01PT11_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01PT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PT11_A2713RpExHdLi[0] < A2713RpExHdLi ) ) )
         {
            A396EmprCod = T01PT11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T01PT11_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = T01PT11_A2711RpExHdFe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
            A2713RpExHdLi = T01PT11_A2713RpExHdLi[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
            RcdFound385 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PT385( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PT385( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound385 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) || ( A2713RpExHdLi != Z2713RpExHdLi ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2248ManCod = Z2248ManCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               A2711RpExHdFe = Z2711RpExHdFe ;
               httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
               A2713RpExHdLi = Z2713RpExHdLi ;
               httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
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
               update1PT385( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) || ( A2713RpExHdLi != Z2713RpExHdLi ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PT385( ) ;
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
                  insert1PT385( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) || ( A2713RpExHdLi != Z2713RpExHdLi ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = Z2248ManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = Z2711RpExHdFe ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         A2713RpExHdLi = Z2713RpExHdLi ;
         httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
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
      if ( RcdFound385 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PT385( ) ;
      if ( RcdFound385 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PT385( ) ;
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
      if ( RcdFound385 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound385 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1PT385( ) ;
      if ( RcdFound385 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound385 != 0 )
         {
            scanNext1PT385( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PT385( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PT385( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLREXHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z2714RpExHdAlb != T01PT2_A2714RpExHdAlb[0] ) || ( DecimalUtil.compareTo(Z2715RpExHdKgs, T01PT2_A2715RpExHdKgs[0]) != 0 ) || ( Z2716RpExHdCns != T01PT2_A2716RpExHdCns[0] ) || ( GXutil.strcmp(Z2717RpExHdTip, T01PT2_A2717RpExHdTip[0]) != 0 ) || ( GXutil.strcmp(Z2718RpExHdRes, T01PT2_A2718RpExHdRes[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2719RpExHdLoc, T01PT2_A2719RpExHdLoc[0]) != 0 ) || ( DecimalUtil.compareTo(Z2847RpExHdMts, T01PT2_A2847RpExHdMts[0]) != 0 ) || ( Z6262RpExSalLn != T01PT2_A6262RpExSalLn[0] ) || ( Z129BarCod != T01PT2_A129BarCod[0] ) || ( Z132BarCodReo != T01PT2_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01PT2_A130BarCodPar[0]) != 0 ) )
         {
            if ( Z2714RpExHdAlb != T01PT2_A2714RpExHdAlb[0] )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdAlb");
               GXutil.writeLogRaw("Old: ",Z2714RpExHdAlb);
               GXutil.writeLogRaw("Current: ",T01PT2_A2714RpExHdAlb[0]);
            }
            if ( DecimalUtil.compareTo(Z2715RpExHdKgs, T01PT2_A2715RpExHdKgs[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdKgs");
               GXutil.writeLogRaw("Old: ",Z2715RpExHdKgs);
               GXutil.writeLogRaw("Current: ",T01PT2_A2715RpExHdKgs[0]);
            }
            if ( Z2716RpExHdCns != T01PT2_A2716RpExHdCns[0] )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdCns");
               GXutil.writeLogRaw("Old: ",Z2716RpExHdCns);
               GXutil.writeLogRaw("Current: ",T01PT2_A2716RpExHdCns[0]);
            }
            if ( GXutil.strcmp(Z2717RpExHdTip, T01PT2_A2717RpExHdTip[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdTip");
               GXutil.writeLogRaw("Old: ",Z2717RpExHdTip);
               GXutil.writeLogRaw("Current: ",T01PT2_A2717RpExHdTip[0]);
            }
            if ( GXutil.strcmp(Z2718RpExHdRes, T01PT2_A2718RpExHdRes[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdRes");
               GXutil.writeLogRaw("Old: ",Z2718RpExHdRes);
               GXutil.writeLogRaw("Current: ",T01PT2_A2718RpExHdRes[0]);
            }
            if ( GXutil.strcmp(Z2719RpExHdLoc, T01PT2_A2719RpExHdLoc[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdLoc");
               GXutil.writeLogRaw("Old: ",Z2719RpExHdLoc);
               GXutil.writeLogRaw("Current: ",T01PT2_A2719RpExHdLoc[0]);
            }
            if ( DecimalUtil.compareTo(Z2847RpExHdMts, T01PT2_A2847RpExHdMts[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExHdMts");
               GXutil.writeLogRaw("Old: ",Z2847RpExHdMts);
               GXutil.writeLogRaw("Current: ",T01PT2_A2847RpExHdMts[0]);
            }
            if ( Z6262RpExSalLn != T01PT2_A6262RpExSalLn[0] )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"RpExSalLn");
               GXutil.writeLogRaw("Old: ",Z6262RpExSalLn);
               GXutil.writeLogRaw("Current: ",T01PT2_A6262RpExSalLn[0]);
            }
            if ( Z129BarCod != T01PT2_A129BarCod[0] )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01PT2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01PT2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01PT2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01PT2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("lrexhd:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01PT2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLREXHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PT385( )
   {
      beforeValidate1PT385( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PT385( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PT385( 0) ;
         checkOptimisticConcurrency1PT385( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PT385( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PT385( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PT12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A2713RpExHdLi), Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Boolean.valueOf(n2715RpExHdKgs), A2715RpExHdKgs, Boolean.valueOf(n2716RpExHdCns), Short.valueOf(A2716RpExHdCns), Boolean.valueOf(n2717RpExHdTip), A2717RpExHdTip, Boolean.valueOf(n2718RpExHdRes), A2718RpExHdRes, Boolean.valueOf(n2719RpExHdLoc), A2719RpExHdLoc, Boolean.valueOf(n2847RpExHdMts), A2847RpExHdMts, Boolean.valueOf(n6262RpExSalLn), Short.valueOf(A6262RpExSalLn), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2248ManCod), A2711RpExHdFe});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
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
                        resetCaption1PT0( ) ;
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
            load1PT385( ) ;
         }
         endLevel1PT385( ) ;
      }
      closeExtendedTableCursors1PT385( ) ;
   }

   public void update1PT385( )
   {
      beforeValidate1PT385( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PT385( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PT385( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PT385( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PT385( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PT13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Boolean.valueOf(n2715RpExHdKgs), A2715RpExHdKgs, Boolean.valueOf(n2716RpExHdCns), Short.valueOf(A2716RpExHdCns), Boolean.valueOf(n2717RpExHdTip), A2717RpExHdTip, Boolean.valueOf(n2718RpExHdRes), A2718RpExHdRes, Boolean.valueOf(n2719RpExHdLoc), A2719RpExHdLoc, Boolean.valueOf(n2847RpExHdMts), A2847RpExHdMts, Boolean.valueOf(n6262RpExSalLn), Short.valueOf(A6262RpExSalLn), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLREXHD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PT385( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1PT0( ) ;
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
         endLevel1PT385( ) ;
      }
      closeExtendedTableCursors1PT385( ) ;
   }

   public void deferredUpdate1PT385( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PT385( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PT385( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PT385( ) ;
         afterConfirm1PT385( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PT385( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PT14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound385 == 0 )
                     {
                        initAll1PT385( ) ;
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
                     resetCaption1PT0( ) ;
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
      sMode385 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PT385( ) ;
      Gx_mode = sMode385 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PT385( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PT15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A135BarColNom = T01PT15_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01PT15_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A252CliCod = T01PT15_A252CliCod[0] ;
         n252CliCod = T01PT15_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(13);
      }
   }

   public void endLevel1PT385( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PT385( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lrexhd");
         if ( AnyError == 0 )
         {
            confirmValues1PT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lrexhd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PT385( )
   {
      /* Using cursor T01PT16 */
      pr_default.execute(14);
      RcdFound385 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A396EmprCod = T01PT16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T01PT16_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = T01PT16_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         A2713RpExHdLi = T01PT16_A2713RpExHdLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PT385( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound385 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A396EmprCod = T01PT16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T01PT16_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = T01PT16_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         A2713RpExHdLi = T01PT16_A2713RpExHdLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
      }
   }

   public void scanEnd1PT385( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1PT385( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PT385( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PT385( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PT385( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PT385( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PT385( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PT385( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtRpExHdFe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdFe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdFe_Enabled), 5, 0), true);
      edtRpExHdLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtRpExHdAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdAlb_Enabled), 5, 0), true);
      edtRpExHdKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdKgs_Enabled), 5, 0), true);
      edtRpExHdCns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdCns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdCns_Enabled), 5, 0), true);
      edtRpExHdTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdTip_Enabled), 5, 0), true);
      edtRpExHdRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdRes_Enabled), 5, 0), true);
      edtRpExHdLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLoc_Enabled), 5, 0), true);
      edtRpExHdMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdMts_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtRpExSalLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExSalLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExSalLn_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PT385( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PT0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lrexhd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2711RpExHdFe", localUtil.dtoc( Z2711RpExHdFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2713RpExHdLi", GXutil.ltrim( localUtil.ntoc( Z2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2714RpExHdAlb", GXutil.ltrim( localUtil.ntoc( Z2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2715RpExHdKgs", GXutil.ltrim( localUtil.ntoc( Z2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2716RpExHdCns", GXutil.ltrim( localUtil.ntoc( Z2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2717RpExHdTip", GXutil.rtrim( Z2717RpExHdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2718RpExHdRes", GXutil.rtrim( Z2718RpExHdRes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2719RpExHdLoc", GXutil.rtrim( Z2719RpExHdLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2847RpExHdMts", GXutil.ltrim( localUtil.ntoc( Z2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6262RpExSalLn", GXutil.ltrim( localUtil.ntoc( Z6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
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
      return formatLink("app.lrexhd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LREXHD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla LREXHD", "") ;
   }

   public void initializeNonKey1PT385( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2714RpExHdAlb = 0 ;
      n2714RpExHdAlb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2714RpExHdAlb), 8, 0));
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      n2715RpExHdKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrimstr( A2715RpExHdKgs, 9, 2));
      A2716RpExHdCns = (short)(0) ;
      n2716RpExHdCns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2716RpExHdCns), 4, 0));
      A2717RpExHdTip = "" ;
      n2717RpExHdTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2717RpExHdTip", A2717RpExHdTip);
      A2718RpExHdRes = "" ;
      n2718RpExHdRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2718RpExHdRes", A2718RpExHdRes);
      A2719RpExHdLoc = "" ;
      n2719RpExHdLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2719RpExHdLoc", A2719RpExHdLoc);
      A2847RpExHdMts = DecimalUtil.ZERO ;
      n2847RpExHdMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrimstr( A2847RpExHdMts, 9, 2));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A6262RpExSalLn = (short)(0) ;
      n6262RpExSalLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6262RpExSalLn), 4, 0));
      Z2714RpExHdAlb = 0 ;
      Z2715RpExHdKgs = DecimalUtil.ZERO ;
      Z2716RpExHdCns = (short)(0) ;
      Z2717RpExHdTip = "" ;
      Z2718RpExHdRes = "" ;
      Z2719RpExHdLoc = "" ;
      Z2847RpExHdMts = DecimalUtil.ZERO ;
      Z6262RpExSalLn = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1PT385( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A2711RpExHdFe = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
      A2713RpExHdLi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2713RpExHdLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2713RpExHdLi), 4, 0));
      initializeNonKey1PT385( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016364946", true, true);
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
      httpContext.AddJavascriptSource("lrexhd.js", "?202661016364946", false, true);
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
      edtManCod_Internalname = "MANCOD" ;
      edtRpExHdFe_Internalname = "RPEXHDFE" ;
      edtRpExHdLi_Internalname = "RPEXHDLI" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRpExHdAlb_Internalname = "RPEXHDALB" ;
      edtRpExHdKgs_Internalname = "RPEXHDKGS" ;
      edtRpExHdCns_Internalname = "RPEXHDCNS" ;
      edtRpExHdTip_Internalname = "RPEXHDTIP" ;
      edtRpExHdRes_Internalname = "RPEXHDRES" ;
      edtRpExHdLoc_Internalname = "RPEXHDLOC" ;
      edtRpExHdMts_Internalname = "RPEXHDMTS" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtRpExSalLn_Internalname = "RPEXSALLN" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla LREXHD", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRpExSalLn_Jsonclick = "" ;
      edtRpExSalLn_Enabled = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtRpExHdMts_Jsonclick = "" ;
      edtRpExHdMts_Enabled = 1 ;
      edtRpExHdLoc_Jsonclick = "" ;
      edtRpExHdLoc_Enabled = 1 ;
      edtRpExHdRes_Jsonclick = "" ;
      edtRpExHdRes_Enabled = 1 ;
      edtRpExHdTip_Jsonclick = "" ;
      edtRpExHdTip_Enabled = 1 ;
      edtRpExHdCns_Jsonclick = "" ;
      edtRpExHdCns_Enabled = 1 ;
      edtRpExHdKgs_Jsonclick = "" ;
      edtRpExHdKgs_Enabled = 1 ;
      edtRpExHdAlb_Jsonclick = "" ;
      edtRpExHdAlb_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtRpExHdLi_Jsonclick = "" ;
      edtRpExHdLi_Enabled = 1 ;
      edtRpExHdFe_Jsonclick = "" ;
      edtRpExHdFe_Enabled = 1 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 1 ;
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
      /* Using cursor T01PT17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CREXHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPEXHDFE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtBarCod_Internalname ;
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

   public void valid_Rpexhdfe( )
   {
      /* Using cursor T01PT17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CREXHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RPEXHDFE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Rpexhdli( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A2714RpExHdAlb", GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2715RpExHdKgs", GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2716RpExHdCns", GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2717RpExHdTip", GXutil.rtrim( A2717RpExHdTip));
      httpContext.ajax_rsp_assign_attri("", false, "A2718RpExHdRes", GXutil.rtrim( A2718RpExHdRes));
      httpContext.ajax_rsp_assign_attri("", false, "A2719RpExHdLoc", GXutil.rtrim( A2719RpExHdLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A2847RpExHdMts", GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6262RpExSalLn", GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2711RpExHdFe", localUtil.format(Z2711RpExHdFe, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2713RpExHdLi", GXutil.ltrim( localUtil.ntoc( Z2713RpExHdLi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2714RpExHdAlb", GXutil.ltrim( localUtil.ntoc( Z2714RpExHdAlb, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2715RpExHdKgs", GXutil.ltrim( localUtil.ntoc( Z2715RpExHdKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2716RpExHdCns", GXutil.ltrim( localUtil.ntoc( Z2716RpExHdCns, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2717RpExHdTip", GXutil.rtrim( Z2717RpExHdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2718RpExHdRes", GXutil.rtrim( Z2718RpExHdRes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2719RpExHdLoc", GXutil.rtrim( Z2719RpExHdLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2847RpExHdMts", GXutil.ltrim( localUtil.ntoc( Z2847RpExHdMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6262RpExSalLn", GXutil.ltrim( localUtil.ntoc( Z6262RpExSalLn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T01PT15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A135BarColNom = T01PT15_A135BarColNom[0] ;
      A136BarColNum = T01PT15_A136BarColNum[0] ;
      A252CliCod = T01PT15_A252CliCod[0] ;
      n252CliCod = T01PT15_n252CliCod[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[]");
      setEventMetadata("VALID_MANCOD",",oparms:[]}");
      setEventMetadata("VALID_RPEXHDFE","{handler:'valid_Rpexhdfe',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''}]");
      setEventMetadata("VALID_RPEXHDFE",",oparms:[]}");
      setEventMetadata("VALID_RPEXHDLI","{handler:'valid_Rpexhdli',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'A2713RpExHdLi',fld:'RPEXHDLI',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RPEXHDLI",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2714RpExHdAlb',fld:'RPEXHDALB',pic:'ZZZZZZZ9'},{av:'A2715RpExHdKgs',fld:'RPEXHDKGS',pic:'ZZZZZ9.99'},{av:'A2716RpExHdCns',fld:'RPEXHDCNS',pic:'ZZZ9'},{av:'A2717RpExHdTip',fld:'RPEXHDTIP',pic:''},{av:'A2718RpExHdRes',fld:'RPEXHDRES',pic:''},{av:'A2719RpExHdLoc',fld:'RPEXHDLOC',pic:''},{av:'A2847RpExHdMts',fld:'RPEXHDMTS',pic:'ZZZZZ9.99'},{av:'A6262RpExSalLn',fld:'RPEXSALLN',pic:'ZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2248ManCod'},{av:'Z2711RpExHdFe'},{av:'Z2713RpExHdLi'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2714RpExHdAlb'},{av:'Z2715RpExHdKgs'},{av:'Z2716RpExHdCns'},{av:'Z2717RpExHdTip'},{av:'Z2718RpExHdRes'},{av:'Z2719RpExHdLoc'},{av:'Z2847RpExHdMts'},{av:'Z6262RpExSalLn'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z252CliCod'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
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
      Z2711RpExHdFe = GXutil.nullDate() ;
      Z2715RpExHdKgs = DecimalUtil.ZERO ;
      Z2717RpExHdTip = "" ;
      Z2718RpExHdRes = "" ;
      Z2719RpExHdLoc = "" ;
      Z2847RpExHdMts = DecimalUtil.ZERO ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2711RpExHdFe = GXutil.nullDate() ;
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
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      A2718RpExHdRes = "" ;
      A2719RpExHdLoc = "" ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
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
      Z135BarColNom = "" ;
      T01PT6_A2713RpExHdLi = new short[1] ;
      T01PT6_A2714RpExHdAlb = new int[1] ;
      T01PT6_n2714RpExHdAlb = new boolean[] {false} ;
      T01PT6_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT6_n2715RpExHdKgs = new boolean[] {false} ;
      T01PT6_A2716RpExHdCns = new short[1] ;
      T01PT6_n2716RpExHdCns = new boolean[] {false} ;
      T01PT6_A2717RpExHdTip = new String[] {""} ;
      T01PT6_n2717RpExHdTip = new boolean[] {false} ;
      T01PT6_A2718RpExHdRes = new String[] {""} ;
      T01PT6_n2718RpExHdRes = new boolean[] {false} ;
      T01PT6_A2719RpExHdLoc = new String[] {""} ;
      T01PT6_n2719RpExHdLoc = new boolean[] {false} ;
      T01PT6_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT6_n2847RpExHdMts = new boolean[] {false} ;
      T01PT6_A135BarColNom = new String[] {""} ;
      T01PT6_A136BarColNum = new int[1] ;
      T01PT6_A6262RpExSalLn = new short[1] ;
      T01PT6_n6262RpExSalLn = new boolean[] {false} ;
      T01PT6_A396EmprCod = new String[] {""} ;
      T01PT6_A129BarCod = new int[1] ;
      T01PT6_A132BarCodReo = new byte[1] ;
      T01PT6_A130BarCodPar = new String[] {""} ;
      T01PT6_A2248ManCod = new short[1] ;
      T01PT6_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT6_A252CliCod = new int[1] ;
      T01PT6_n252CliCod = new boolean[] {false} ;
      T01PT4_A135BarColNom = new String[] {""} ;
      T01PT4_A136BarColNum = new int[1] ;
      T01PT4_A252CliCod = new int[1] ;
      T01PT4_n252CliCod = new boolean[] {false} ;
      T01PT5_A396EmprCod = new String[] {""} ;
      T01PT7_A135BarColNom = new String[] {""} ;
      T01PT7_A136BarColNum = new int[1] ;
      T01PT7_A252CliCod = new int[1] ;
      T01PT7_n252CliCod = new boolean[] {false} ;
      T01PT8_A396EmprCod = new String[] {""} ;
      T01PT9_A396EmprCod = new String[] {""} ;
      T01PT9_A2248ManCod = new short[1] ;
      T01PT9_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT9_A2713RpExHdLi = new short[1] ;
      T01PT3_A2713RpExHdLi = new short[1] ;
      T01PT3_A2714RpExHdAlb = new int[1] ;
      T01PT3_n2714RpExHdAlb = new boolean[] {false} ;
      T01PT3_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT3_n2715RpExHdKgs = new boolean[] {false} ;
      T01PT3_A2716RpExHdCns = new short[1] ;
      T01PT3_n2716RpExHdCns = new boolean[] {false} ;
      T01PT3_A2717RpExHdTip = new String[] {""} ;
      T01PT3_n2717RpExHdTip = new boolean[] {false} ;
      T01PT3_A2718RpExHdRes = new String[] {""} ;
      T01PT3_n2718RpExHdRes = new boolean[] {false} ;
      T01PT3_A2719RpExHdLoc = new String[] {""} ;
      T01PT3_n2719RpExHdLoc = new boolean[] {false} ;
      T01PT3_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT3_n2847RpExHdMts = new boolean[] {false} ;
      T01PT3_A6262RpExSalLn = new short[1] ;
      T01PT3_n6262RpExSalLn = new boolean[] {false} ;
      T01PT3_A396EmprCod = new String[] {""} ;
      T01PT3_A129BarCod = new int[1] ;
      T01PT3_A132BarCodReo = new byte[1] ;
      T01PT3_A130BarCodPar = new String[] {""} ;
      T01PT3_A2248ManCod = new short[1] ;
      T01PT3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      sMode385 = "" ;
      T01PT10_A396EmprCod = new String[] {""} ;
      T01PT10_A2248ManCod = new short[1] ;
      T01PT10_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT10_A2713RpExHdLi = new short[1] ;
      T01PT11_A396EmprCod = new String[] {""} ;
      T01PT11_A2248ManCod = new short[1] ;
      T01PT11_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT11_A2713RpExHdLi = new short[1] ;
      T01PT2_A2713RpExHdLi = new short[1] ;
      T01PT2_A2714RpExHdAlb = new int[1] ;
      T01PT2_n2714RpExHdAlb = new boolean[] {false} ;
      T01PT2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT2_n2715RpExHdKgs = new boolean[] {false} ;
      T01PT2_A2716RpExHdCns = new short[1] ;
      T01PT2_n2716RpExHdCns = new boolean[] {false} ;
      T01PT2_A2717RpExHdTip = new String[] {""} ;
      T01PT2_n2717RpExHdTip = new boolean[] {false} ;
      T01PT2_A2718RpExHdRes = new String[] {""} ;
      T01PT2_n2718RpExHdRes = new boolean[] {false} ;
      T01PT2_A2719RpExHdLoc = new String[] {""} ;
      T01PT2_n2719RpExHdLoc = new boolean[] {false} ;
      T01PT2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PT2_n2847RpExHdMts = new boolean[] {false} ;
      T01PT2_A6262RpExSalLn = new short[1] ;
      T01PT2_n6262RpExSalLn = new boolean[] {false} ;
      T01PT2_A396EmprCod = new String[] {""} ;
      T01PT2_A129BarCod = new int[1] ;
      T01PT2_A132BarCodReo = new byte[1] ;
      T01PT2_A130BarCodPar = new String[] {""} ;
      T01PT2_A2248ManCod = new short[1] ;
      T01PT2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT15_A135BarColNom = new String[] {""} ;
      T01PT15_A136BarColNum = new int[1] ;
      T01PT15_A252CliCod = new int[1] ;
      T01PT15_n252CliCod = new boolean[] {false} ;
      T01PT16_A396EmprCod = new String[] {""} ;
      T01PT16_A2248ManCod = new short[1] ;
      T01PT16_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01PT16_A2713RpExHdLi = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01PT17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2711RpExHdFe = GXutil.nullDate() ;
      ZZ130BarCodPar = "" ;
      ZZ2715RpExHdKgs = DecimalUtil.ZERO ;
      ZZ2717RpExHdTip = "" ;
      ZZ2718RpExHdRes = "" ;
      ZZ2719RpExHdLoc = "" ;
      ZZ2847RpExHdMts = DecimalUtil.ZERO ;
      ZZ135BarColNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lrexhd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lrexhd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lrexhd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lrexhd__default(),
         new Object[] {
             new Object[] {
            T01PT2_A2713RpExHdLi, T01PT2_A2714RpExHdAlb, T01PT2_n2714RpExHdAlb, T01PT2_A2715RpExHdKgs, T01PT2_n2715RpExHdKgs, T01PT2_A2716RpExHdCns, T01PT2_n2716RpExHdCns, T01PT2_A2717RpExHdTip, T01PT2_n2717RpExHdTip, T01PT2_A2718RpExHdRes,
            T01PT2_n2718RpExHdRes, T01PT2_A2719RpExHdLoc, T01PT2_n2719RpExHdLoc, T01PT2_A2847RpExHdMts, T01PT2_n2847RpExHdMts, T01PT2_A6262RpExSalLn, T01PT2_n6262RpExSalLn, T01PT2_A396EmprCod, T01PT2_A129BarCod, T01PT2_A132BarCodReo,
            T01PT2_A130BarCodPar, T01PT2_A2248ManCod, T01PT2_A2711RpExHdFe
            }
            , new Object[] {
            T01PT3_A2713RpExHdLi, T01PT3_A2714RpExHdAlb, T01PT3_n2714RpExHdAlb, T01PT3_A2715RpExHdKgs, T01PT3_n2715RpExHdKgs, T01PT3_A2716RpExHdCns, T01PT3_n2716RpExHdCns, T01PT3_A2717RpExHdTip, T01PT3_n2717RpExHdTip, T01PT3_A2718RpExHdRes,
            T01PT3_n2718RpExHdRes, T01PT3_A2719RpExHdLoc, T01PT3_n2719RpExHdLoc, T01PT3_A2847RpExHdMts, T01PT3_n2847RpExHdMts, T01PT3_A6262RpExSalLn, T01PT3_n6262RpExSalLn, T01PT3_A396EmprCod, T01PT3_A129BarCod, T01PT3_A132BarCodReo,
            T01PT3_A130BarCodPar, T01PT3_A2248ManCod, T01PT3_A2711RpExHdFe
            }
            , new Object[] {
            T01PT4_A135BarColNom, T01PT4_A136BarColNum, T01PT4_A252CliCod, T01PT4_n252CliCod
            }
            , new Object[] {
            T01PT5_A396EmprCod
            }
            , new Object[] {
            T01PT6_A2713RpExHdLi, T01PT6_A2714RpExHdAlb, T01PT6_n2714RpExHdAlb, T01PT6_A2715RpExHdKgs, T01PT6_n2715RpExHdKgs, T01PT6_A2716RpExHdCns, T01PT6_n2716RpExHdCns, T01PT6_A2717RpExHdTip, T01PT6_n2717RpExHdTip, T01PT6_A2718RpExHdRes,
            T01PT6_n2718RpExHdRes, T01PT6_A2719RpExHdLoc, T01PT6_n2719RpExHdLoc, T01PT6_A2847RpExHdMts, T01PT6_n2847RpExHdMts, T01PT6_A135BarColNom, T01PT6_A136BarColNum, T01PT6_A6262RpExSalLn, T01PT6_n6262RpExSalLn, T01PT6_A396EmprCod,
            T01PT6_A129BarCod, T01PT6_A132BarCodReo, T01PT6_A130BarCodPar, T01PT6_A2248ManCod, T01PT6_A2711RpExHdFe, T01PT6_A252CliCod, T01PT6_n252CliCod
            }
            , new Object[] {
            T01PT7_A135BarColNom, T01PT7_A136BarColNum, T01PT7_A252CliCod, T01PT7_n252CliCod
            }
            , new Object[] {
            T01PT8_A396EmprCod
            }
            , new Object[] {
            T01PT9_A396EmprCod, T01PT9_A2248ManCod, T01PT9_A2711RpExHdFe, T01PT9_A2713RpExHdLi
            }
            , new Object[] {
            T01PT10_A396EmprCod, T01PT10_A2248ManCod, T01PT10_A2711RpExHdFe, T01PT10_A2713RpExHdLi
            }
            , new Object[] {
            T01PT11_A396EmprCod, T01PT11_A2248ManCod, T01PT11_A2711RpExHdFe, T01PT11_A2713RpExHdLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PT15_A135BarColNom, T01PT15_A136BarColNum, T01PT15_A252CliCod, T01PT15_n252CliCod
            }
            , new Object[] {
            T01PT16_A396EmprCod, T01PT16_A2248ManCod, T01PT16_A2711RpExHdFe, T01PT16_A2713RpExHdLi
            }
            , new Object[] {
            T01PT17_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private short Z2248ManCod ;
   private short Z2713RpExHdLi ;
   private short Z2716RpExHdCns ;
   private short Z6262RpExSalLn ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A6262RpExSalLn ;
   private short RcdFound385 ;
   private short nIsDirty_385 ;
   private short ZZ2248ManCod ;
   private short ZZ2713RpExHdLi ;
   private short ZZ2716RpExHdCns ;
   private short ZZ6262RpExSalLn ;
   private int Z2714RpExHdAlb ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtManCod_Enabled ;
   private int edtRpExHdFe_Enabled ;
   private int edtRpExHdLi_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int A2714RpExHdAlb ;
   private int edtRpExHdAlb_Enabled ;
   private int edtRpExHdKgs_Enabled ;
   private int edtRpExHdCns_Enabled ;
   private int edtRpExHdTip_Enabled ;
   private int edtRpExHdRes_Enabled ;
   private int edtRpExHdLoc_Enabled ;
   private int edtRpExHdMts_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtRpExSalLn_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ2714RpExHdAlb ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z2715RpExHdKgs ;
   private java.math.BigDecimal Z2847RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal ZZ2715RpExHdKgs ;
   private java.math.BigDecimal ZZ2847RpExHdMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2717RpExHdTip ;
   private String Z2718RpExHdRes ;
   private String Z2719RpExHdLoc ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
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
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String edtRpExHdFe_Internalname ;
   private String edtRpExHdFe_Jsonclick ;
   private String edtRpExHdLi_Internalname ;
   private String edtRpExHdLi_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRpExHdAlb_Internalname ;
   private String edtRpExHdAlb_Jsonclick ;
   private String edtRpExHdKgs_Internalname ;
   private String edtRpExHdKgs_Jsonclick ;
   private String edtRpExHdCns_Internalname ;
   private String edtRpExHdCns_Jsonclick ;
   private String edtRpExHdTip_Internalname ;
   private String A2717RpExHdTip ;
   private String edtRpExHdTip_Jsonclick ;
   private String edtRpExHdRes_Internalname ;
   private String A2718RpExHdRes ;
   private String edtRpExHdRes_Jsonclick ;
   private String edtRpExHdLoc_Internalname ;
   private String A2719RpExHdLoc ;
   private String edtRpExHdLoc_Jsonclick ;
   private String edtRpExHdMts_Internalname ;
   private String edtRpExHdMts_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtRpExSalLn_Internalname ;
   private String edtRpExSalLn_Jsonclick ;
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
   private String Z135BarColNom ;
   private String sMode385 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2717RpExHdTip ;
   private String ZZ2718RpExHdRes ;
   private String ZZ2719RpExHdLoc ;
   private String ZZ135BarColNom ;
   private java.util.Date Z2711RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date ZZ2711RpExHdFe ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n2714RpExHdAlb ;
   private boolean n2715RpExHdKgs ;
   private boolean n2716RpExHdCns ;
   private boolean n2717RpExHdTip ;
   private boolean n2718RpExHdRes ;
   private boolean n2719RpExHdLoc ;
   private boolean n2847RpExHdMts ;
   private boolean n252CliCod ;
   private boolean n6262RpExSalLn ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01PT6_A2713RpExHdLi ;
   private int[] T01PT6_A2714RpExHdAlb ;
   private boolean[] T01PT6_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01PT6_A2715RpExHdKgs ;
   private boolean[] T01PT6_n2715RpExHdKgs ;
   private short[] T01PT6_A2716RpExHdCns ;
   private boolean[] T01PT6_n2716RpExHdCns ;
   private String[] T01PT6_A2717RpExHdTip ;
   private boolean[] T01PT6_n2717RpExHdTip ;
   private String[] T01PT6_A2718RpExHdRes ;
   private boolean[] T01PT6_n2718RpExHdRes ;
   private String[] T01PT6_A2719RpExHdLoc ;
   private boolean[] T01PT6_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01PT6_A2847RpExHdMts ;
   private boolean[] T01PT6_n2847RpExHdMts ;
   private String[] T01PT6_A135BarColNom ;
   private int[] T01PT6_A136BarColNum ;
   private short[] T01PT6_A6262RpExSalLn ;
   private boolean[] T01PT6_n6262RpExSalLn ;
   private String[] T01PT6_A396EmprCod ;
   private int[] T01PT6_A129BarCod ;
   private byte[] T01PT6_A132BarCodReo ;
   private String[] T01PT6_A130BarCodPar ;
   private short[] T01PT6_A2248ManCod ;
   private java.util.Date[] T01PT6_A2711RpExHdFe ;
   private int[] T01PT6_A252CliCod ;
   private boolean[] T01PT6_n252CliCod ;
   private String[] T01PT4_A135BarColNom ;
   private int[] T01PT4_A136BarColNum ;
   private int[] T01PT4_A252CliCod ;
   private boolean[] T01PT4_n252CliCod ;
   private String[] T01PT5_A396EmprCod ;
   private String[] T01PT7_A135BarColNom ;
   private int[] T01PT7_A136BarColNum ;
   private int[] T01PT7_A252CliCod ;
   private boolean[] T01PT7_n252CliCod ;
   private String[] T01PT8_A396EmprCod ;
   private String[] T01PT9_A396EmprCod ;
   private short[] T01PT9_A2248ManCod ;
   private java.util.Date[] T01PT9_A2711RpExHdFe ;
   private short[] T01PT9_A2713RpExHdLi ;
   private short[] T01PT3_A2713RpExHdLi ;
   private int[] T01PT3_A2714RpExHdAlb ;
   private boolean[] T01PT3_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01PT3_A2715RpExHdKgs ;
   private boolean[] T01PT3_n2715RpExHdKgs ;
   private short[] T01PT3_A2716RpExHdCns ;
   private boolean[] T01PT3_n2716RpExHdCns ;
   private String[] T01PT3_A2717RpExHdTip ;
   private boolean[] T01PT3_n2717RpExHdTip ;
   private String[] T01PT3_A2718RpExHdRes ;
   private boolean[] T01PT3_n2718RpExHdRes ;
   private String[] T01PT3_A2719RpExHdLoc ;
   private boolean[] T01PT3_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01PT3_A2847RpExHdMts ;
   private boolean[] T01PT3_n2847RpExHdMts ;
   private short[] T01PT3_A6262RpExSalLn ;
   private boolean[] T01PT3_n6262RpExSalLn ;
   private String[] T01PT3_A396EmprCod ;
   private int[] T01PT3_A129BarCod ;
   private byte[] T01PT3_A132BarCodReo ;
   private String[] T01PT3_A130BarCodPar ;
   private short[] T01PT3_A2248ManCod ;
   private java.util.Date[] T01PT3_A2711RpExHdFe ;
   private String[] T01PT10_A396EmprCod ;
   private short[] T01PT10_A2248ManCod ;
   private java.util.Date[] T01PT10_A2711RpExHdFe ;
   private short[] T01PT10_A2713RpExHdLi ;
   private String[] T01PT11_A396EmprCod ;
   private short[] T01PT11_A2248ManCod ;
   private java.util.Date[] T01PT11_A2711RpExHdFe ;
   private short[] T01PT11_A2713RpExHdLi ;
   private short[] T01PT2_A2713RpExHdLi ;
   private int[] T01PT2_A2714RpExHdAlb ;
   private boolean[] T01PT2_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01PT2_A2715RpExHdKgs ;
   private boolean[] T01PT2_n2715RpExHdKgs ;
   private short[] T01PT2_A2716RpExHdCns ;
   private boolean[] T01PT2_n2716RpExHdCns ;
   private String[] T01PT2_A2717RpExHdTip ;
   private boolean[] T01PT2_n2717RpExHdTip ;
   private String[] T01PT2_A2718RpExHdRes ;
   private boolean[] T01PT2_n2718RpExHdRes ;
   private String[] T01PT2_A2719RpExHdLoc ;
   private boolean[] T01PT2_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01PT2_A2847RpExHdMts ;
   private boolean[] T01PT2_n2847RpExHdMts ;
   private short[] T01PT2_A6262RpExSalLn ;
   private boolean[] T01PT2_n6262RpExSalLn ;
   private String[] T01PT2_A396EmprCod ;
   private int[] T01PT2_A129BarCod ;
   private byte[] T01PT2_A132BarCodReo ;
   private String[] T01PT2_A130BarCodPar ;
   private short[] T01PT2_A2248ManCod ;
   private java.util.Date[] T01PT2_A2711RpExHdFe ;
   private String[] T01PT15_A135BarColNom ;
   private int[] T01PT15_A136BarColNum ;
   private int[] T01PT15_A252CliCod ;
   private boolean[] T01PT15_n252CliCod ;
   private String[] T01PT16_A396EmprCod ;
   private short[] T01PT16_A2248ManCod ;
   private java.util.Date[] T01PT16_A2711RpExHdFe ;
   private short[] T01PT16_A2713RpExHdLi ;
   private String[] T01PT17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lrexhd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrexhd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrexhd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrexhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PT2", "SELECT RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar, ManCod, RpExHdFe FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?  FOR UPDATE OF RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT3", "SELECT RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar, ManCod, RpExHdFe FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT4", "SELECT BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT5", "SELECT EmprCod FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT6", "SELECT /*+ FIRST_ROWS(100) */ TM1.RpExHdLi, TM1.RpExHdAlb, TM1.RpExHdKgs, TM1.RpExHdCns, TM1.RpExHdTip, TM1.RpExHdRes, TM1.RpExHdLoc, TM1.RpExHdMts, T2.BarColNom, T2.BarColNum, TM1.RpExSalLn, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ManCod, TM1.RpExHdFe, T2.CliCod FROM (TXPLREXHD TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.ManCod = ? and TM1.RpExHdFe = ? and TM1.RpExHdLi = ? ORDER BY TM1.EmprCod, TM1.ManCod, TM1.RpExHdFe, TM1.RpExHdLi ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT7", "SELECT BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT8", "SELECT EmprCod FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE ( EmprCod > ? or EmprCod = ? and ManCod > ? or ManCod = ? and EmprCod = ? and RpExHdFe > ? or RpExHdFe = ? and ManCod = ? and EmprCod = ? and RpExHdLi > ?) ORDER BY EmprCod, ManCod, RpExHdFe, RpExHdLi) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PT11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE ( EmprCod < ? or EmprCod = ? and ManCod < ? or ManCod = ? and EmprCod = ? and RpExHdFe < ? or RpExHdFe = ? and ManCod = ? and EmprCod = ? and RpExHdLi < ?) ORDER BY EmprCod DESC, ManCod DESC, RpExHdFe DESC, RpExHdLi DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PT12", "INSERT INTO TXPLREXHD(RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar, ManCod, RpExHdFe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLREXHD")
         ,new UpdateCursor("T01PT13", "UPDATE TXPLREXHD SET RpExHdAlb=?, RpExHdKgs=?, RpExHdCns=?, RpExHdTip=?, RpExHdRes=?, RpExHdLoc=?, RpExHdMts=?, RpExSalLn=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK, "TXPLREXHD")
         ,new UpdateCursor("T01PT14", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK, "TXPLREXHD")
         ,new ForEachCursor("T01PT15", "SELECT BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD ORDER BY EmprCod, ManCod, RpExHdFe, RpExHdLi ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PT17", "SELECT EmprCod FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((short[]) buf[23])[0] = rslt.getShort(16);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(17);
               ((int[]) buf[25])[0] = rslt.getInt(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               stmt.setString(10, (String)parms[17], 3);
               stmt.setInt(11, ((Number) parms[18]).intValue());
               stmt.setByte(12, ((Number) parms[19]).byteValue());
               stmt.setString(13, (String)parms[20], 1);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               stmt.setDate(15, (java.util.Date)parms[22]);
               return;
            case 11 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setInt(9, ((Number) parms[16]).intValue());
               stmt.setByte(10, ((Number) parms[17]).byteValue());
               stmt.setString(11, (String)parms[18], 1);
               stmt.setString(12, (String)parms[19], 3);
               stmt.setShort(13, ((Number) parms[20]).shortValue());
               stmt.setDate(14, (java.util.Date)parms[21]);
               stmt.setShort(15, ((Number) parms[22]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

