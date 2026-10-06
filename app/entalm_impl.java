package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entalm_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PEDNUMLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapednumlin1QK42( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A658PedCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla ENTALM", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public entalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entalm_impl.class ));
   }

   public entalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla ENTALM", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ENTALM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ENTALM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLinEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLinEnt_Internalname, httpContext.getMessage( "Linea Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLinEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLinEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLinEnt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFecEnt_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99"), localUtil.format( A415EntFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFecEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ENTALM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbaran_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbaran_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbaran_Internalname, GXutil.rtrim( A11Albaran), GXutil.rtrim( localUtil.format( A11Albaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbaran_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbaran_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntNAlbar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntNAlbar_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar), GXutil.rtrim( localUtil.format( A12857EntNAlbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNAlbar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntNAlbar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniEnt_Internalname, httpContext.getMessage( "Uds  Ent", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniEnt_Enabled!=0) ? localUtil.format( A418EntUniEnt, "ZZZZZ9.99") : localUtil.format( A418EntUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntPre_Enabled!=0) ? localUtil.format( A417EntPre, "ZZZZZZZ9.999") : localUtil.format( A417EntPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniRem_Internalname, httpContext.getMessage( "Uds Rem", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniRem_Enabled!=0) ? localUtil.format( A419EntUniRem, "ZZZZZ9.9999") : localUtil.format( A419EntUniRem, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniRem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntUniRem_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntLotN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntLotN_Internalname, httpContext.getMessage( "Nº Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN), GXutil.rtrim( localUtil.format( A5686EntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntLotN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntLotN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFVal_Internalname, httpContext.getMessage( "Fecha Caducidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFVal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99"), localUtil.format( A5685EntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntFVal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ENTALM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFVal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFVal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ENTALM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntObs_Internalname, GXutil.rtrim( A10783EntObs), GXutil.rtrim( localUtil.format( A10783EntObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntObs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ENTALM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ENTALM.htm");
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111QK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z597LinEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "Z415EntFecEnt"), 0) ;
            Z11Albaran = httpContext.cgiGet( "Z11Albaran") ;
            Z12857EntNAlbar = httpContext.cgiGet( "Z12857EntNAlbar") ;
            Z6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z6156EntPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "Z418EntUniEnt")) ;
            Z417EntPre = localUtil.ctond( httpContext.cgiGet( "Z417EntPre")) ;
            Z419EntUniRem = localUtil.ctond( httpContext.cgiGet( "Z419EntUniRem")) ;
            Z5686EntLotN = httpContext.cgiGet( "Z5686EntLotN") ;
            Z5685EntFVal = localUtil.ctod( httpContext.cgiGet( "Z5685EntFVal"), 0) ;
            Z10783EntObs = httpContext.cgiGet( "Z10783EntObs") ;
            Z416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z416EntNumCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z414EntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z411EntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z413EntConIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z412EntConFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5469EntNro = (int)(localUtil.ctol( httpContext.cgiGet( "Z5469EntNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "Z10782EntUniAlb")) ;
            Z3404EntPedCum = httpContext.cgiGet( "Z3404EntPedCum") ;
            Z5691EntBnc = httpContext.cgiGet( "Z5691EntBnc") ;
            Z7695EntCC = httpContext.cgiGet( "Z7695EntCC") ;
            Z7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7696EntCCoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10187EntRemNro = httpContext.cgiGet( "Z10187EntRemNro") ;
            Z10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "Z10186EntRemFch"), 0) ;
            Z10185EntRemSuc = httpContext.cgiGet( "Z10185EntRemSuc") ;
            Z10184EntRemTpo = httpContext.cgiGet( "Z10184EntRemTpo") ;
            Z12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12716EntFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "Z13235EntLoteID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13456EntUbicaci = httpContext.cgiGet( "Z13456EntUbicaci") ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z416EntNumCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z414EntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z411EntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z413EntConIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z412EntConFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5469EntNro = (int)(localUtil.ctol( httpContext.cgiGet( "Z5469EntNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "Z10782EntUniAlb")) ;
            A3404EntPedCum = httpContext.cgiGet( "Z3404EntPedCum") ;
            A5691EntBnc = httpContext.cgiGet( "Z5691EntBnc") ;
            A7695EntCC = httpContext.cgiGet( "Z7695EntCC") ;
            A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7696EntCCoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10187EntRemNro = httpContext.cgiGet( "Z10187EntRemNro") ;
            A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "Z10186EntRemFch"), 0) ;
            A10185EntRemSuc = httpContext.cgiGet( "Z10185EntRemSuc") ;
            A10184EntRemTpo = httpContext.cgiGet( "Z10184EntRemTpo") ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12716EntFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "Z13235EntLoteID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13456EntUbicaci = httpContext.cgiGet( "Z13456EntUbicaci") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "ENTNUMCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTETI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCONINI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "ENTCONFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5469EntNro = (int)(localUtil.ctol( httpContext.cgiGet( "ENTNRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "ENTUNIALB")) ;
            A3404EntPedCum = httpContext.cgiGet( "ENTPEDCUM") ;
            A5691EntBnc = httpContext.cgiGet( "ENTBNC") ;
            A7695EntCC = httpContext.cgiGet( "ENTCC") ;
            A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "ENTCCOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10187EntRemNro = httpContext.cgiGet( "ENTREMNRO") ;
            A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "ENTREMFCH"), 0) ;
            A10185EntRemSuc = httpContext.cgiGet( "ENTREMSUC") ;
            A10184EntRemTpo = httpContext.cgiGet( "ENTREMTPO") ;
            A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "ENTFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "ENTLOTEID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13456EntUbicaci = httpContext.cgiGet( "ENTUBICACI") ;
            A661PedFec = localUtil.ctod( httpContext.cgiGet( "PEDFEC"), 0) ;
            A666PedPri = httpContext.cgiGet( "PEDPRI") ;
            A667PedSit = httpContext.cgiGet( "PEDSIT") ;
            A659PedCum = httpContext.cgiGet( "PEDCUM") ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "PEDFULENT"), 0) ;
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "PEDCANENT")) ;
            A669PedUni = localUtil.ctond( httpContext.cgiGet( "PEDUNI")) ;
            A665PedPre = localUtil.ctond( httpContext.cgiGet( "PEDPRE")) ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LINENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLinEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A597LinEnt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            }
            else
            {
               A597LinEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtLinEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEntFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ENTFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A415EntFecEnt = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
            }
            else
            {
               A415EntFecEnt = localUtil.ctod( httpContext.cgiGet( edtEntFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
            }
            A11Albaran = httpContext.cgiGet( edtAlbaran_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
            A12857EntNAlbar = httpContext.cgiGet( edtEntNAlbar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658PedCod = 0 ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            else
            {
               A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6156EntPrvNum = 0 ;
               n6156EntPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            }
            else
            {
               A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6156EntPrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTUNIENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntUniEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A418EntUniEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
            }
            else
            {
               A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A417EntPre = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
            else
            {
               A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTUNIREM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntUniRem_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A419EntUniRem = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
            else
            {
               A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
            A5686EntLotN = httpContext.cgiGet( edtEntLotN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEntFVal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ENTFVAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntFVal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5685EntFVal = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
            }
            else
            {
               A5685EntFVal = localUtil.ctod( httpContext.cgiGet( edtEntFVal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
            }
            A10783EntObs = httpContext.cgiGet( edtEntObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ENTALM");
            forbiddenHiddens.add("EntNumCon", localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9"));
            forbiddenHiddens.add("EntEti", localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9"));
            forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
            forbiddenHiddens.add("EntConIni", localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9"));
            forbiddenHiddens.add("EntConFin", localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9"));
            forbiddenHiddens.add("EntNro", localUtil.format( DecimalUtil.doubleToDec(A5469EntNro), "ZZZZZ9"));
            forbiddenHiddens.add("EntUniAlb", localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999"));
            forbiddenHiddens.add("EntPedCum", GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")));
            forbiddenHiddens.add("EntBnc", GXutil.rtrim( localUtil.format( A5691EntBnc, "")));
            forbiddenHiddens.add("EntCC", GXutil.rtrim( localUtil.format( A7695EntCC, "")));
            forbiddenHiddens.add("EntCCoCod", localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9"));
            forbiddenHiddens.add("EntRemNro", GXutil.rtrim( localUtil.format( A10187EntRemNro, "")));
            forbiddenHiddens.add("EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
            forbiddenHiddens.add("EntRemSuc", GXutil.rtrim( localUtil.format( A10185EntRemSuc, "")));
            forbiddenHiddens.add("EntRemTpo", GXutil.rtrim( localUtil.format( A10184EntRemTpo, "")));
            forbiddenHiddens.add("EntFabId", localUtil.format( DecimalUtil.doubleToDec(A12716EntFabId), "ZZZZZ9"));
            forbiddenHiddens.add("EntLoteID", localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9"));
            forbiddenHiddens.add("EntUbicaci", GXutil.rtrim( localUtil.format( A13456EntUbicaci, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("entalm:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
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
                        e111QK2 ();
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
            initAll1QK42( ) ;
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
      disableAttributes1QK42( ) ;
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

   public void resetCaption1QK0( )
   {
   }

   public void e111QK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      entalm_impl.this.A396EmprCod = GXv_char2[0] ;
      entalm_impl.this.AV8EmprNom = GXv_char3[0] ;
      entalm_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
   }

   public void zm1QK42( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z415EntFecEnt = T01QK3_A415EntFecEnt[0] ;
            Z11Albaran = T01QK3_A11Albaran[0] ;
            Z12857EntNAlbar = T01QK3_A12857EntNAlbar[0] ;
            Z6156EntPrvNum = T01QK3_A6156EntPrvNum[0] ;
            Z418EntUniEnt = T01QK3_A418EntUniEnt[0] ;
            Z417EntPre = T01QK3_A417EntPre[0] ;
            Z419EntUniRem = T01QK3_A419EntUniRem[0] ;
            Z5686EntLotN = T01QK3_A5686EntLotN[0] ;
            Z5685EntFVal = T01QK3_A5685EntFVal[0] ;
            Z10783EntObs = T01QK3_A10783EntObs[0] ;
            Z416EntNumCon = T01QK3_A416EntNumCon[0] ;
            Z414EntEti = T01QK3_A414EntEti[0] ;
            Z411EntCon = T01QK3_A411EntCon[0] ;
            Z413EntConIni = T01QK3_A413EntConIni[0] ;
            Z412EntConFin = T01QK3_A412EntConFin[0] ;
            Z5469EntNro = T01QK3_A5469EntNro[0] ;
            Z10782EntUniAlb = T01QK3_A10782EntUniAlb[0] ;
            Z3404EntPedCum = T01QK3_A3404EntPedCum[0] ;
            Z5691EntBnc = T01QK3_A5691EntBnc[0] ;
            Z7695EntCC = T01QK3_A7695EntCC[0] ;
            Z7696EntCCoCod = T01QK3_A7696EntCCoCod[0] ;
            Z10187EntRemNro = T01QK3_A10187EntRemNro[0] ;
            Z10186EntRemFch = T01QK3_A10186EntRemFch[0] ;
            Z10185EntRemSuc = T01QK3_A10185EntRemSuc[0] ;
            Z10184EntRemTpo = T01QK3_A10184EntRemTpo[0] ;
            Z12716EntFabId = T01QK3_A12716EntFabId[0] ;
            Z13235EntLoteID = T01QK3_A13235EntLoteID[0] ;
            Z13456EntUbicaci = T01QK3_A13456EntUbicaci[0] ;
            Z658PedCod = T01QK3_A658PedCod[0] ;
         }
         else
         {
            Z415EntFecEnt = A415EntFecEnt ;
            Z11Albaran = A11Albaran ;
            Z12857EntNAlbar = A12857EntNAlbar ;
            Z6156EntPrvNum = A6156EntPrvNum ;
            Z418EntUniEnt = A418EntUniEnt ;
            Z417EntPre = A417EntPre ;
            Z419EntUniRem = A419EntUniRem ;
            Z5686EntLotN = A5686EntLotN ;
            Z5685EntFVal = A5685EntFVal ;
            Z10783EntObs = A10783EntObs ;
            Z416EntNumCon = A416EntNumCon ;
            Z414EntEti = A414EntEti ;
            Z411EntCon = A411EntCon ;
            Z413EntConIni = A413EntConIni ;
            Z412EntConFin = A412EntConFin ;
            Z5469EntNro = A5469EntNro ;
            Z10782EntUniAlb = A10782EntUniAlb ;
            Z3404EntPedCum = A3404EntPedCum ;
            Z5691EntBnc = A5691EntBnc ;
            Z7695EntCC = A7695EntCC ;
            Z7696EntCCoCod = A7696EntCCoCod ;
            Z10187EntRemNro = A10187EntRemNro ;
            Z10186EntRemFch = A10186EntRemFch ;
            Z10185EntRemSuc = A10185EntRemSuc ;
            Z10184EntRemTpo = A10184EntRemTpo ;
            Z12716EntFabId = A12716EntFabId ;
            Z13235EntLoteID = A13235EntLoteID ;
            Z13456EntUbicaci = A13456EntUbicaci ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z597LinEnt = A597LinEnt ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z6156EntPrvNum = A6156EntPrvNum ;
         Z418EntUniEnt = A418EntUniEnt ;
         Z417EntPre = A417EntPre ;
         Z419EntUniRem = A419EntUniRem ;
         Z5686EntLotN = A5686EntLotN ;
         Z5685EntFVal = A5685EntFVal ;
         Z10783EntObs = A10783EntObs ;
         Z416EntNumCon = A416EntNumCon ;
         Z414EntEti = A414EntEti ;
         Z411EntCon = A411EntCon ;
         Z413EntConIni = A413EntConIni ;
         Z412EntConFin = A412EntConFin ;
         Z5469EntNro = A5469EntNro ;
         Z10782EntUniAlb = A10782EntUniAlb ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z5691EntBnc = A5691EntBnc ;
         Z7695EntCC = A7695EntCC ;
         Z7696EntCCoCod = A7696EntCCoCod ;
         Z10187EntRemNro = A10187EntRemNro ;
         Z10186EntRemFch = A10186EntRemFch ;
         Z10185EntRemSuc = A10185EntRemSuc ;
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z12716EntFabId = A12716EntFabId ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z661PedFec = A661PedFec ;
         Z666PedPri = A666PedPri ;
         Z667PedSit = A667PedSit ;
         Z659PedCum = A659PedCum ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z669PedUni = A669PedUni ;
         Z665PedPre = A665PedPre ;
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

   public void load1QK42( )
   {
      /* Using cursor T01QK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A415EntFecEnt = T01QK7_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01QK7_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01QK7_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01QK7_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01QK7_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A418EntUniEnt = T01QK7_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A417EntPre = T01QK7_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A419EntUniRem = T01QK7_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A5686EntLotN = T01QK7_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01QK7_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A10783EntObs = T01QK7_A10783EntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
         A416EntNumCon = T01QK7_A416EntNumCon[0] ;
         A414EntEti = T01QK7_A414EntEti[0] ;
         A411EntCon = T01QK7_A411EntCon[0] ;
         A413EntConIni = T01QK7_A413EntConIni[0] ;
         A412EntConFin = T01QK7_A412EntConFin[0] ;
         A5469EntNro = T01QK7_A5469EntNro[0] ;
         A10782EntUniAlb = T01QK7_A10782EntUniAlb[0] ;
         A3404EntPedCum = T01QK7_A3404EntPedCum[0] ;
         A5691EntBnc = T01QK7_A5691EntBnc[0] ;
         A661PedFec = T01QK7_A661PedFec[0] ;
         A666PedPri = T01QK7_A666PedPri[0] ;
         A667PedSit = T01QK7_A667PedSit[0] ;
         A659PedCum = T01QK7_A659PedCum[0] ;
         A663PedFulEnt = T01QK7_A663PedFulEnt[0] ;
         A657PedCanEnt = T01QK7_A657PedCanEnt[0] ;
         A669PedUni = T01QK7_A669PedUni[0] ;
         A665PedPre = T01QK7_A665PedPre[0] ;
         A7695EntCC = T01QK7_A7695EntCC[0] ;
         A7696EntCCoCod = T01QK7_A7696EntCCoCod[0] ;
         A10187EntRemNro = T01QK7_A10187EntRemNro[0] ;
         A10186EntRemFch = T01QK7_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01QK7_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01QK7_A10184EntRemTpo[0] ;
         A12716EntFabId = T01QK7_A12716EntFabId[0] ;
         A13235EntLoteID = T01QK7_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01QK7_A13456EntUbicaci[0] ;
         A658PedCod = T01QK7_A658PedCod[0] ;
         n658PedCod = T01QK7_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         zm1QK42( -2) ;
      }
      pr_default.close(5);
      onLoadActions1QK42( ) ;
   }

   public void onLoadActions1QK42( )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
   }

   public void checkExtendedTable1QK42( )
   {
      nIsDirty_42 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01QK5_A661PedFec[0] ;
      A666PedPri = T01QK5_A666PedPri[0] ;
      A667PedSit = T01QK5_A667PedSit[0] ;
      pr_default.close(3);
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      /* Using cursor T01QK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01QK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A659PedCum = T01QK6_A659PedCum[0] ;
      A663PedFulEnt = T01QK6_A663PedFulEnt[0] ;
      A657PedCanEnt = T01QK6_A657PedCanEnt[0] ;
      A669PedUni = T01QK6_A669PedUni[0] ;
      A665PedPre = T01QK6_A665PedPre[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1QK42( )
   {
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A658PedCod )
   {
      /* Using cursor T01QK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01QK8_A661PedFec[0] ;
      A666PedPri = T01QK8_A666PedPri[0] ;
      A667PedSit = T01QK8_A667PedSit[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A661PedFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A666PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A667PedSit))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_3( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01QK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_5( String A396EmprCod ,
                         int A658PedCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01QK10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A659PedCum = T01QK10_A659PedCum[0] ;
      A663PedFulEnt = T01QK10_A663PedFulEnt[0] ;
      A657PedCanEnt = T01QK10_A657PedCanEnt[0] ;
      A669PedUni = T01QK10_A669PedUni[0] ;
      A665PedPre = T01QK10_A665PedPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659PedCum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A663PedFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1QK42( )
   {
      /* Using cursor T01QK11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01QK3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1QK42( 2) ;
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01QK3_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         A415EntFecEnt = T01QK3_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01QK3_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01QK3_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01QK3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01QK3_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A418EntUniEnt = T01QK3_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A417EntPre = T01QK3_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A419EntUniRem = T01QK3_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A5686EntLotN = T01QK3_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01QK3_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A10783EntObs = T01QK3_A10783EntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
         A416EntNumCon = T01QK3_A416EntNumCon[0] ;
         A414EntEti = T01QK3_A414EntEti[0] ;
         A411EntCon = T01QK3_A411EntCon[0] ;
         A413EntConIni = T01QK3_A413EntConIni[0] ;
         A412EntConFin = T01QK3_A412EntConFin[0] ;
         A5469EntNro = T01QK3_A5469EntNro[0] ;
         A10782EntUniAlb = T01QK3_A10782EntUniAlb[0] ;
         A3404EntPedCum = T01QK3_A3404EntPedCum[0] ;
         A5691EntBnc = T01QK3_A5691EntBnc[0] ;
         A7695EntCC = T01QK3_A7695EntCC[0] ;
         A7696EntCCoCod = T01QK3_A7696EntCCoCod[0] ;
         A10187EntRemNro = T01QK3_A10187EntRemNro[0] ;
         A10186EntRemFch = T01QK3_A10186EntRemFch[0] ;
         A10185EntRemSuc = T01QK3_A10185EntRemSuc[0] ;
         A10184EntRemTpo = T01QK3_A10184EntRemTpo[0] ;
         A12716EntFabId = T01QK3_A12716EntFabId[0] ;
         A13235EntLoteID = T01QK3_A13235EntLoteID[0] ;
         A13456EntUbicaci = T01QK3_A13456EntUbicaci[0] ;
         A719PrdNum = T01QK3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A658PedCod = T01QK3_A658PedCod[0] ;
         n658PedCod = T01QK3_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QK42( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1QK42( ) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1QK42( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QK42( ) ;
      if ( RcdFound42 == 0 )
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
      RcdFound42 = (short)(0) ;
      /* Using cursor T01QK12 */
      pr_default.execute(10, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01QK12_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QK12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01QK12_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01QK12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01QK12_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QK12_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01QK12_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01QK12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01QK12_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01QK12_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01QK13 */
      pr_default.execute(11, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01QK13_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QK13_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01QK13_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01QK13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01QK13_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QK13_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01QK13_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01QK13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01QK13_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01QK13_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QK42( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QK42( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound42 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A597LinEnt = Z597LinEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1QK42( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QK42( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1QK42( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
      {
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = Z597LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QK42( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QK42( ) ;
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
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
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
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
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
      scanStart1QK42( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound42 != 0 )
         {
            scanNext1QK42( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QK42( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QK42( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01QK2_A415EntFecEnt[0])) ) || ( GXutil.strcmp(Z11Albaran, T01QK2_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, T01QK2_A12857EntNAlbar[0]) != 0 ) || ( Z6156EntPrvNum != T01QK2_A6156EntPrvNum[0] ) || ( DecimalUtil.compareTo(Z418EntUniEnt, T01QK2_A418EntUniEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z417EntPre, T01QK2_A417EntPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z419EntUniRem, T01QK2_A419EntUniRem[0]) != 0 ) || ( GXutil.strcmp(Z5686EntLotN, T01QK2_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01QK2_A5685EntFVal[0])) ) || ( GXutil.strcmp(Z10783EntObs, T01QK2_A10783EntObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z416EntNumCon != T01QK2_A416EntNumCon[0] ) || ( Z414EntEti != T01QK2_A414EntEti[0] ) || ( Z411EntCon != T01QK2_A411EntCon[0] ) || ( Z413EntConIni != T01QK2_A413EntConIni[0] ) || ( Z412EntConFin != T01QK2_A412EntConFin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5469EntNro != T01QK2_A5469EntNro[0] ) || ( DecimalUtil.compareTo(Z10782EntUniAlb, T01QK2_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z3404EntPedCum, T01QK2_A3404EntPedCum[0]) != 0 ) || ( GXutil.strcmp(Z5691EntBnc, T01QK2_A5691EntBnc[0]) != 0 ) || ( GXutil.strcmp(Z7695EntCC, T01QK2_A7695EntCC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7696EntCCoCod != T01QK2_A7696EntCCoCod[0] ) || ( GXutil.strcmp(Z10187EntRemNro, T01QK2_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01QK2_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, T01QK2_A10185EntRemSuc[0]) != 0 ) || ( GXutil.strcmp(Z10184EntRemTpo, T01QK2_A10184EntRemTpo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12716EntFabId != T01QK2_A12716EntFabId[0] ) || ( Z13235EntLoteID != T01QK2_A13235EntLoteID[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, T01QK2_A13456EntUbicaci[0]) != 0 ) || ( Z658PedCod != T01QK2_A658PedCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01QK2_A415EntFecEnt[0])) ) )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntFecEnt");
               GXutil.writeLogRaw("Old: ",Z415EntFecEnt);
               GXutil.writeLogRaw("Current: ",T01QK2_A415EntFecEnt[0]);
            }
            if ( GXutil.strcmp(Z11Albaran, T01QK2_A11Albaran[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"Albaran");
               GXutil.writeLogRaw("Old: ",Z11Albaran);
               GXutil.writeLogRaw("Current: ",T01QK2_A11Albaran[0]);
            }
            if ( GXutil.strcmp(Z12857EntNAlbar, T01QK2_A12857EntNAlbar[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntNAlbar");
               GXutil.writeLogRaw("Old: ",Z12857EntNAlbar);
               GXutil.writeLogRaw("Current: ",T01QK2_A12857EntNAlbar[0]);
            }
            if ( Z6156EntPrvNum != T01QK2_A6156EntPrvNum[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntPrvNum");
               GXutil.writeLogRaw("Old: ",Z6156EntPrvNum);
               GXutil.writeLogRaw("Current: ",T01QK2_A6156EntPrvNum[0]);
            }
            if ( DecimalUtil.compareTo(Z418EntUniEnt, T01QK2_A418EntUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntUniEnt");
               GXutil.writeLogRaw("Old: ",Z418EntUniEnt);
               GXutil.writeLogRaw("Current: ",T01QK2_A418EntUniEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z417EntPre, T01QK2_A417EntPre[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntPre");
               GXutil.writeLogRaw("Old: ",Z417EntPre);
               GXutil.writeLogRaw("Current: ",T01QK2_A417EntPre[0]);
            }
            if ( DecimalUtil.compareTo(Z419EntUniRem, T01QK2_A419EntUniRem[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntUniRem");
               GXutil.writeLogRaw("Old: ",Z419EntUniRem);
               GXutil.writeLogRaw("Current: ",T01QK2_A419EntUniRem[0]);
            }
            if ( GXutil.strcmp(Z5686EntLotN, T01QK2_A5686EntLotN[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntLotN");
               GXutil.writeLogRaw("Old: ",Z5686EntLotN);
               GXutil.writeLogRaw("Current: ",T01QK2_A5686EntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01QK2_A5685EntFVal[0])) ) )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntFVal");
               GXutil.writeLogRaw("Old: ",Z5685EntFVal);
               GXutil.writeLogRaw("Current: ",T01QK2_A5685EntFVal[0]);
            }
            if ( GXutil.strcmp(Z10783EntObs, T01QK2_A10783EntObs[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntObs");
               GXutil.writeLogRaw("Old: ",Z10783EntObs);
               GXutil.writeLogRaw("Current: ",T01QK2_A10783EntObs[0]);
            }
            if ( Z416EntNumCon != T01QK2_A416EntNumCon[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntNumCon");
               GXutil.writeLogRaw("Old: ",Z416EntNumCon);
               GXutil.writeLogRaw("Current: ",T01QK2_A416EntNumCon[0]);
            }
            if ( Z414EntEti != T01QK2_A414EntEti[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntEti");
               GXutil.writeLogRaw("Old: ",Z414EntEti);
               GXutil.writeLogRaw("Current: ",T01QK2_A414EntEti[0]);
            }
            if ( Z411EntCon != T01QK2_A411EntCon[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntCon");
               GXutil.writeLogRaw("Old: ",Z411EntCon);
               GXutil.writeLogRaw("Current: ",T01QK2_A411EntCon[0]);
            }
            if ( Z413EntConIni != T01QK2_A413EntConIni[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntConIni");
               GXutil.writeLogRaw("Old: ",Z413EntConIni);
               GXutil.writeLogRaw("Current: ",T01QK2_A413EntConIni[0]);
            }
            if ( Z412EntConFin != T01QK2_A412EntConFin[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntConFin");
               GXutil.writeLogRaw("Old: ",Z412EntConFin);
               GXutil.writeLogRaw("Current: ",T01QK2_A412EntConFin[0]);
            }
            if ( Z5469EntNro != T01QK2_A5469EntNro[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntNro");
               GXutil.writeLogRaw("Old: ",Z5469EntNro);
               GXutil.writeLogRaw("Current: ",T01QK2_A5469EntNro[0]);
            }
            if ( DecimalUtil.compareTo(Z10782EntUniAlb, T01QK2_A10782EntUniAlb[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntUniAlb");
               GXutil.writeLogRaw("Old: ",Z10782EntUniAlb);
               GXutil.writeLogRaw("Current: ",T01QK2_A10782EntUniAlb[0]);
            }
            if ( GXutil.strcmp(Z3404EntPedCum, T01QK2_A3404EntPedCum[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntPedCum");
               GXutil.writeLogRaw("Old: ",Z3404EntPedCum);
               GXutil.writeLogRaw("Current: ",T01QK2_A3404EntPedCum[0]);
            }
            if ( GXutil.strcmp(Z5691EntBnc, T01QK2_A5691EntBnc[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntBnc");
               GXutil.writeLogRaw("Old: ",Z5691EntBnc);
               GXutil.writeLogRaw("Current: ",T01QK2_A5691EntBnc[0]);
            }
            if ( GXutil.strcmp(Z7695EntCC, T01QK2_A7695EntCC[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntCC");
               GXutil.writeLogRaw("Old: ",Z7695EntCC);
               GXutil.writeLogRaw("Current: ",T01QK2_A7695EntCC[0]);
            }
            if ( Z7696EntCCoCod != T01QK2_A7696EntCCoCod[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntCCoCod");
               GXutil.writeLogRaw("Old: ",Z7696EntCCoCod);
               GXutil.writeLogRaw("Current: ",T01QK2_A7696EntCCoCod[0]);
            }
            if ( GXutil.strcmp(Z10187EntRemNro, T01QK2_A10187EntRemNro[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntRemNro");
               GXutil.writeLogRaw("Old: ",Z10187EntRemNro);
               GXutil.writeLogRaw("Current: ",T01QK2_A10187EntRemNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01QK2_A10186EntRemFch[0])) ) )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntRemFch");
               GXutil.writeLogRaw("Old: ",Z10186EntRemFch);
               GXutil.writeLogRaw("Current: ",T01QK2_A10186EntRemFch[0]);
            }
            if ( GXutil.strcmp(Z10185EntRemSuc, T01QK2_A10185EntRemSuc[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntRemSuc");
               GXutil.writeLogRaw("Old: ",Z10185EntRemSuc);
               GXutil.writeLogRaw("Current: ",T01QK2_A10185EntRemSuc[0]);
            }
            if ( GXutil.strcmp(Z10184EntRemTpo, T01QK2_A10184EntRemTpo[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntRemTpo");
               GXutil.writeLogRaw("Old: ",Z10184EntRemTpo);
               GXutil.writeLogRaw("Current: ",T01QK2_A10184EntRemTpo[0]);
            }
            if ( Z12716EntFabId != T01QK2_A12716EntFabId[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntFabId");
               GXutil.writeLogRaw("Old: ",Z12716EntFabId);
               GXutil.writeLogRaw("Current: ",T01QK2_A12716EntFabId[0]);
            }
            if ( Z13235EntLoteID != T01QK2_A13235EntLoteID[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntLoteID");
               GXutil.writeLogRaw("Old: ",Z13235EntLoteID);
               GXutil.writeLogRaw("Current: ",T01QK2_A13235EntLoteID[0]);
            }
            if ( GXutil.strcmp(Z13456EntUbicaci, T01QK2_A13456EntUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"EntUbicaci");
               GXutil.writeLogRaw("Old: ",Z13456EntUbicaci);
               GXutil.writeLogRaw("Current: ",T01QK2_A13456EntUbicaci[0]);
            }
            if ( Z658PedCod != T01QK2_A658PedCod[0] )
            {
               GXutil.writeLogln("entalm:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01QK2_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QK42( )
   {
      beforeValidate1QK42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QK42( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QK42( 0) ;
         checkOptimisticConcurrency1QK42( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QK42( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QK42( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QK14 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A597LinEnt), A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, A417EntPre, A419EntUniRem, A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1QK0( ) ;
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
            load1QK42( ) ;
         }
         endLevel1QK42( ) ;
      }
      closeExtendedTableCursors1QK42( ) ;
   }

   public void update1QK42( )
   {
      beforeValidate1QK42( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QK42( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QK42( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QK42( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QK42( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QK15 */
                  pr_default.execute(13, new Object[] {A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A418EntUniEnt, A417EntPre, A419EntUniRem, A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), Long.valueOf(A13235EntLoteID), A13456EntUbicaci, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QK42( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QK0( ) ;
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
         endLevel1QK42( ) ;
      }
      closeExtendedTableCursors1QK42( ) ;
   }

   public void deferredUpdate1QK42( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QK42( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QK42( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QK42( ) ;
         afterConfirm1QK42( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QK42( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QK16 */
               pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound42 == 0 )
                     {
                        initAll1QK42( ) ;
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
                     resetCaption1QK0( ) ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QK42( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QK42( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QK17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01QK17_A661PedFec[0] ;
         A666PedPri = T01QK17_A666PedPri[0] ;
         A667PedSit = T01QK17_A667PedSit[0] ;
         pr_default.close(15);
         /* Using cursor T01QK18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         A659PedCum = T01QK18_A659PedCum[0] ;
         A663PedFulEnt = T01QK18_A663PedFulEnt[0] ;
         A657PedCanEnt = T01QK18_A657PedCanEnt[0] ;
         A669PedUni = T01QK18_A669PedUni[0] ;
         A665PedPre = T01QK18_A665PedPre[0] ;
         pr_default.close(16);
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      }
   }

   public void endLevel1QK42( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QK42( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "entalm");
         if ( AnyError == 0 )
         {
            confirmValues1QK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "entalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QK42( )
   {
      /* Scan By routine */
      /* Using cursor T01QK19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01QK19_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01QK19_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QK42( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01QK19_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01QK19_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
   }

   public void scanEnd1QK42( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1QK42( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QK42( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QK42( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QK42( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QK42( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QK42( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QK42( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtLinEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLinEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLinEnt_Enabled), 5, 0), true);
      edtEntFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Enabled), 5, 0), true);
      edtAlbaran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbaran_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbaran_Enabled), 5, 0), true);
      edtEntNAlbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNAlbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNAlbar_Enabled), 5, 0), true);
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtEntPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Enabled), 5, 0), true);
      edtEntUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Enabled), 5, 0), true);
      edtEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Enabled), 5, 0), true);
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      edtEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      edtEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      edtEntObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntObs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QK42( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entalm", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ENTALM");
      forbiddenHiddens.add("EntNumCon", localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9"));
      forbiddenHiddens.add("EntEti", localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9"));
      forbiddenHiddens.add("EntCon", localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"));
      forbiddenHiddens.add("EntConIni", localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9"));
      forbiddenHiddens.add("EntConFin", localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9"));
      forbiddenHiddens.add("EntNro", localUtil.format( DecimalUtil.doubleToDec(A5469EntNro), "ZZZZZ9"));
      forbiddenHiddens.add("EntUniAlb", localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999"));
      forbiddenHiddens.add("EntPedCum", GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")));
      forbiddenHiddens.add("EntBnc", GXutil.rtrim( localUtil.format( A5691EntBnc, "")));
      forbiddenHiddens.add("EntCC", GXutil.rtrim( localUtil.format( A7695EntCC, "")));
      forbiddenHiddens.add("EntCCoCod", localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9"));
      forbiddenHiddens.add("EntRemNro", GXutil.rtrim( localUtil.format( A10187EntRemNro, "")));
      forbiddenHiddens.add("EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      forbiddenHiddens.add("EntRemSuc", GXutil.rtrim( localUtil.format( A10185EntRemSuc, "")));
      forbiddenHiddens.add("EntRemTpo", GXutil.rtrim( localUtil.format( A10184EntRemTpo, "")));
      forbiddenHiddens.add("EntFabId", localUtil.format( DecimalUtil.doubleToDec(A12716EntFabId), "ZZZZZ9"));
      forbiddenHiddens.add("EntLoteID", localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9"));
      forbiddenHiddens.add("EntUbicaci", GXutil.rtrim( localUtil.format( A13456EntUbicaci, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entalm:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z597LinEnt", GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z415EntFecEnt", localUtil.dtoc( Z415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11Albaran", GXutil.rtrim( Z11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12857EntNAlbar", GXutil.rtrim( Z12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z418EntUniEnt", GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5686EntLotN", GXutil.rtrim( Z5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5685EntFVal", localUtil.dtoc( Z5685EntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10783EntObs", GXutil.rtrim( Z10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z416EntNumCon", GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z414EntEti", GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z411EntCon", GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z413EntConIni", GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z412EntConFin", GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5469EntNro", GXutil.ltrim( localUtil.ntoc( Z5469EntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5691EntBnc", GXutil.rtrim( Z5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7695EntCC", GXutil.rtrim( Z7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10187EntRemNro", GXutil.rtrim( Z10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10186EntRemFch", localUtil.dtoc( Z10186EntRemFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10185EntRemSuc", GXutil.rtrim( Z10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10184EntRemTpo", GXutil.rtrim( Z10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12716EntFabId", GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13235EntLoteID", GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13456EntUbicaci", GXutil.rtrim( Z13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMLIN", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNUMCON", GXutil.ltrim( localUtil.ntoc( A416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTETI", GXutil.ltrim( localUtil.ntoc( A414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCON", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCONINI", GXutil.ltrim( localUtil.ntoc( A413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCONFIN", GXutil.ltrim( localUtil.ntoc( A412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNRO", GXutil.ltrim( localUtil.ntoc( A5469EntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUNIALB", GXutil.ltrim( localUtil.ntoc( A10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTPEDCUM", GXutil.rtrim( A3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTBNC", GXutil.rtrim( A5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCC", GXutil.rtrim( A7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTCCOCOD", GXutil.ltrim( localUtil.ntoc( A7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMNRO", GXutil.rtrim( A10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMFCH", localUtil.dtoc( A10186EntRemFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMSUC", GXutil.rtrim( A10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTREMTPO", GXutil.rtrim( A10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTFABID", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTLOTEID", GXutil.ltrim( localUtil.ntoc( A13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTUBICACI", GXutil.rtrim( A13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFEC", localUtil.dtoc( A661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRI", GXutil.rtrim( A666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDSIT", GXutil.rtrim( A667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCUM", GXutil.rtrim( A659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFULENT", localUtil.dtoc( A663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANENT", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRE", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.entalm", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ENTALM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla ENTALM", "") ;
   }

   public void initializeNonKey1QK42( )
   {
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A415EntFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      A11Albaran = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
      A12857EntNAlbar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
      A418EntUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      A417EntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      A419EntUniRem = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      A5686EntLotN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      A5685EntFVal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
      A10783EntObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
      A416EntNumCon = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
      A414EntEti = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
      A411EntCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      A413EntConIni = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
      A412EntConFin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
      A5469EntNro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
      A10782EntUniAlb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
      A3404EntPedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      A5691EntBnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A666PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A667PedSit = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      A659PedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A669PedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A665PedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A7695EntCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
      A7696EntCCoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
      A10187EntRemNro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
      A10186EntRemFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      A10185EntRemSuc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
      A10184EntRemTpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      A12716EntFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      A13235EntLoteID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
      A13456EntUbicaci = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z6156EntPrvNum = 0 ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      Z416EntNumCon = (short)(0) ;
      Z414EntEti = (byte)(0) ;
      Z411EntCon = (byte)(0) ;
      Z413EntConIni = 0 ;
      Z412EntConFin = 0 ;
      Z5469EntNro = 0 ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z7696EntCCoCod = (short)(0) ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      Z12716EntFabId = 0 ;
      Z13235EntLoteID = 0 ;
      Z13456EntUbicaci = "" ;
      Z658PedCod = 0 ;
   }

   public void initAll1QK42( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A597LinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      initializeNonKey1QK42( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016374123", true, true);
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
      httpContext.AddJavascriptSource("entalm.js", "?202661016374123", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLinEnt_Internalname = "LINENT" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      edtEntNAlbar_Internalname = "ENTNALBAR" ;
      edtPedCod_Internalname = "PEDCOD" ;
      edtEntPrvNum_Internalname = "ENTPRVNUM" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntUniRem_Internalname = "ENTUNIREM" ;
      edtEntLotN_Internalname = "ENTLOTN" ;
      edtEntFVal_Internalname = "ENTFVAL" ;
      edtEntObs_Internalname = "ENTOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla ENTALM", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEntObs_Jsonclick = "" ;
      edtEntObs_Enabled = 1 ;
      edtEntFVal_Jsonclick = "" ;
      edtEntFVal_Enabled = 1 ;
      edtEntLotN_Jsonclick = "" ;
      edtEntLotN_Enabled = 1 ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntUniRem_Enabled = 1 ;
      edtEntPre_Jsonclick = "" ;
      edtEntPre_Enabled = 1 ;
      edtEntUniEnt_Jsonclick = "" ;
      edtEntUniEnt_Enabled = 1 ;
      edtEntPrvNum_Jsonclick = "" ;
      edtEntPrvNum_Enabled = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
      edtEntNAlbar_Jsonclick = "" ;
      edtEntNAlbar_Enabled = 1 ;
      edtAlbaran_Jsonclick = "" ;
      edtAlbaran_Enabled = 1 ;
      edtEntFecEnt_Jsonclick = "" ;
      edtEntFecEnt_Enabled = 1 ;
      edtLinEnt_Jsonclick = "" ;
      edtLinEnt_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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

   public void gx1asapednumlin1QK42( String A396EmprCod ,
                                     int A658PedCod )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01QK20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(18);
      GX_FocusControl = edtEntFecEnt_Internalname ;
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

   public void valid_Prdnum( )
   {
      /* Using cursor T01QK20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Linent( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", GXutil.rtrim( A11Albaran));
      httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", GXutil.rtrim( A12857EntNAlbar));
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", GXutil.rtrim( A5686EntLotN));
      httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", GXutil.rtrim( A10783EntObs));
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrim( localUtil.ntoc( A416EntNumCon, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.ltrim( localUtil.ntoc( A414EntEti, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrim( localUtil.ntoc( A413EntConIni, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrim( localUtil.ntoc( A412EntConFin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrim( localUtil.ntoc( A5469EntNro, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( A10782EntUniAlb, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", GXutil.rtrim( A5691EntBnc));
      httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", GXutil.rtrim( A7695EntCC));
      httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( A7696EntCCoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", GXutil.rtrim( A10187EntRemNro));
      httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", GXutil.rtrim( A10185EntRemSuc));
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", GXutil.rtrim( A10184EntRemTpo));
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrim( localUtil.ntoc( A13235EntLoteID, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", GXutil.rtrim( A13456EntUbicaci));
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z597LinEnt", GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z415EntFecEnt", localUtil.format(Z415EntFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11Albaran", GXutil.rtrim( Z11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12857EntNAlbar", GXutil.rtrim( Z12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z418EntUniEnt", GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5686EntLotN", GXutil.rtrim( Z5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5685EntFVal", localUtil.format(Z5685EntFVal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10783EntObs", GXutil.rtrim( Z10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z416EntNumCon", GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z414EntEti", GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z411EntCon", GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z413EntConIni", GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z412EntConFin", GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5469EntNro", GXutil.ltrim( localUtil.ntoc( Z5469EntNro, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5691EntBnc", GXutil.rtrim( Z5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7695EntCC", GXutil.rtrim( Z7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10187EntRemNro", GXutil.rtrim( Z10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10186EntRemFch", localUtil.format(Z10186EntRemFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10185EntRemSuc", GXutil.rtrim( Z10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10184EntRemTpo", GXutil.rtrim( Z10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12716EntFabId", GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13235EntLoteID", GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13456EntUbicaci", GXutil.rtrim( Z13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z661PedFec", localUtil.format(Z661PedFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z666PedPri", GXutil.rtrim( Z666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z667PedSit", GXutil.rtrim( Z667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "Z664PedNumLin", GXutil.ltrim( localUtil.ntoc( Z664PedNumLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.format(Z663PedFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z657PedCanEnt", GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      /* Using cursor T01QK17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A661PedFec = T01QK17_A661PedFec[0] ;
      A666PedPri = T01QK17_A666PedPri[0] ;
      A667PedSit = T01QK17_A667PedSit[0] ;
      pr_default.close(15);
      /* Using cursor T01QK18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A659PedCum = T01QK18_A659PedCum[0] ;
      A663PedFulEnt = T01QK18_A663PedFulEnt[0] ;
      A657PedCanEnt = T01QK18_A657PedCanEnt[0] ;
      A669PedUni = T01QK18_A669PedUni[0] ;
      A665PedPre = T01QK18_A665PedPre[0] ;
      pr_default.close(16);
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5469EntNro',fld:'ENTNRO',pic:'ZZZZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_LINENT","{handler:'valid_Linent',iparms:[{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A5469EntNro',fld:'ENTNRO',pic:'ZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LINENT",",oparms:[{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A12857EntNAlbar',fld:'ENTNALBAR',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'A5685EntFVal',fld:'ENTFVAL',pic:''},{av:'A10783EntObs',fld:'ENTOBS',pic:''},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5469EntNro',fld:'ENTNRO',pic:'ZZZZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z597LinEnt'},{av:'Z415EntFecEnt'},{av:'Z11Albaran'},{av:'Z12857EntNAlbar'},{av:'Z658PedCod'},{av:'Z6156EntPrvNum'},{av:'Z418EntUniEnt'},{av:'Z417EntPre'},{av:'Z419EntUniRem'},{av:'Z5686EntLotN'},{av:'Z5685EntFVal'},{av:'Z10783EntObs'},{av:'Z416EntNumCon'},{av:'Z414EntEti'},{av:'Z411EntCon'},{av:'Z413EntConIni'},{av:'Z412EntConFin'},{av:'Z5469EntNro'},{av:'Z10782EntUniAlb'},{av:'Z3404EntPedCum'},{av:'Z5691EntBnc'},{av:'Z7695EntCC'},{av:'Z7696EntCCoCod'},{av:'Z10187EntRemNro'},{av:'Z10186EntRemFch'},{av:'Z10185EntRemSuc'},{av:'Z10184EntRemTpo'},{av:'Z12716EntFabId'},{av:'Z13235EntLoteID'},{av:'Z13456EntUbicaci'},{av:'Z661PedFec'},{av:'Z666PedPri'},{av:'Z667PedSit'},{av:'Z664PedNumLin'},{av:'Z659PedCum'},{av:'Z663PedFulEnt'},{av:'Z657PedCanEnt'},{av:'Z669PedUni'},{av:'Z665PedPre'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
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
      pr_default.close(18);
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01QK21 */
      pr_default.execute(19, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01QK21_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
         {
            if ( Gx_first )
            {
               Gx_cnt = 1 ;
               Gx_first = false ;
            }
            else
            {
               Gx_cnt = (int)(Gx_cnt+1) ;
            }
         }
         pr_default.readNext(19);
      }
      pr_default.close(19);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      Z13456EntUbicaci = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
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
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A10783EntObs = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      A3404EntPedCum = "" ;
      A5691EntBnc = "" ;
      A7695EntCC = "" ;
      A10187EntRemNro = "" ;
      A10186EntRemFch = GXutil.nullDate() ;
      A10185EntRemSuc = "" ;
      A10184EntRemTpo = "" ;
      A13456EntUbicaci = "" ;
      Gx_mode = "" ;
      A661PedFec = GXutil.nullDate() ;
      A666PedPri = "" ;
      A667PedSit = "" ;
      A659PedCum = "" ;
      A663PedFulEnt = GXutil.nullDate() ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV9UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z661PedFec = GXutil.nullDate() ;
      Z666PedPri = "" ;
      Z667PedSit = "" ;
      Z659PedCum = "" ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      T01QK7_A597LinEnt = new short[1] ;
      T01QK7_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK7_A11Albaran = new String[] {""} ;
      T01QK7_A12857EntNAlbar = new String[] {""} ;
      T01QK7_A6156EntPrvNum = new int[1] ;
      T01QK7_n6156EntPrvNum = new boolean[] {false} ;
      T01QK7_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A5686EntLotN = new String[] {""} ;
      T01QK7_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK7_A10783EntObs = new String[] {""} ;
      T01QK7_A416EntNumCon = new short[1] ;
      T01QK7_A414EntEti = new byte[1] ;
      T01QK7_A411EntCon = new byte[1] ;
      T01QK7_A413EntConIni = new int[1] ;
      T01QK7_A412EntConFin = new int[1] ;
      T01QK7_A5469EntNro = new int[1] ;
      T01QK7_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A3404EntPedCum = new String[] {""} ;
      T01QK7_A5691EntBnc = new String[] {""} ;
      T01QK7_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK7_A666PedPri = new String[] {""} ;
      T01QK7_A667PedSit = new String[] {""} ;
      T01QK7_A659PedCum = new String[] {""} ;
      T01QK7_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK7_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK7_A7695EntCC = new String[] {""} ;
      T01QK7_A7696EntCCoCod = new short[1] ;
      T01QK7_A10187EntRemNro = new String[] {""} ;
      T01QK7_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK7_A10185EntRemSuc = new String[] {""} ;
      T01QK7_A10184EntRemTpo = new String[] {""} ;
      T01QK7_A12716EntFabId = new int[1] ;
      T01QK7_A13235EntLoteID = new long[1] ;
      T01QK7_A13456EntUbicaci = new String[] {""} ;
      T01QK7_A396EmprCod = new String[] {""} ;
      T01QK7_A719PrdNum = new String[] {""} ;
      T01QK7_A658PedCod = new int[1] ;
      T01QK7_n658PedCod = new boolean[] {false} ;
      T01QK5_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK5_A666PedPri = new String[] {""} ;
      T01QK5_A667PedSit = new String[] {""} ;
      T01QK4_A396EmprCod = new String[] {""} ;
      T01QK6_A659PedCum = new String[] {""} ;
      T01QK6_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK6_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK6_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK6_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK8_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK8_A666PedPri = new String[] {""} ;
      T01QK8_A667PedSit = new String[] {""} ;
      T01QK9_A396EmprCod = new String[] {""} ;
      T01QK10_A659PedCum = new String[] {""} ;
      T01QK10_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK10_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK10_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK10_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK11_A396EmprCod = new String[] {""} ;
      T01QK11_A719PrdNum = new String[] {""} ;
      T01QK11_A597LinEnt = new short[1] ;
      T01QK3_A597LinEnt = new short[1] ;
      T01QK3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK3_A11Albaran = new String[] {""} ;
      T01QK3_A12857EntNAlbar = new String[] {""} ;
      T01QK3_A6156EntPrvNum = new int[1] ;
      T01QK3_n6156EntPrvNum = new boolean[] {false} ;
      T01QK3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK3_A5686EntLotN = new String[] {""} ;
      T01QK3_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK3_A10783EntObs = new String[] {""} ;
      T01QK3_A416EntNumCon = new short[1] ;
      T01QK3_A414EntEti = new byte[1] ;
      T01QK3_A411EntCon = new byte[1] ;
      T01QK3_A413EntConIni = new int[1] ;
      T01QK3_A412EntConFin = new int[1] ;
      T01QK3_A5469EntNro = new int[1] ;
      T01QK3_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK3_A3404EntPedCum = new String[] {""} ;
      T01QK3_A5691EntBnc = new String[] {""} ;
      T01QK3_A7695EntCC = new String[] {""} ;
      T01QK3_A7696EntCCoCod = new short[1] ;
      T01QK3_A10187EntRemNro = new String[] {""} ;
      T01QK3_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK3_A10185EntRemSuc = new String[] {""} ;
      T01QK3_A10184EntRemTpo = new String[] {""} ;
      T01QK3_A12716EntFabId = new int[1] ;
      T01QK3_A13235EntLoteID = new long[1] ;
      T01QK3_A13456EntUbicaci = new String[] {""} ;
      T01QK3_A396EmprCod = new String[] {""} ;
      T01QK3_A719PrdNum = new String[] {""} ;
      T01QK3_A658PedCod = new int[1] ;
      T01QK3_n658PedCod = new boolean[] {false} ;
      sMode42 = "" ;
      T01QK12_A396EmprCod = new String[] {""} ;
      T01QK12_A719PrdNum = new String[] {""} ;
      T01QK12_A597LinEnt = new short[1] ;
      T01QK13_A396EmprCod = new String[] {""} ;
      T01QK13_A719PrdNum = new String[] {""} ;
      T01QK13_A597LinEnt = new short[1] ;
      T01QK2_A597LinEnt = new short[1] ;
      T01QK2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK2_A11Albaran = new String[] {""} ;
      T01QK2_A12857EntNAlbar = new String[] {""} ;
      T01QK2_A6156EntPrvNum = new int[1] ;
      T01QK2_n6156EntPrvNum = new boolean[] {false} ;
      T01QK2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK2_A5686EntLotN = new String[] {""} ;
      T01QK2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK2_A10783EntObs = new String[] {""} ;
      T01QK2_A416EntNumCon = new short[1] ;
      T01QK2_A414EntEti = new byte[1] ;
      T01QK2_A411EntCon = new byte[1] ;
      T01QK2_A413EntConIni = new int[1] ;
      T01QK2_A412EntConFin = new int[1] ;
      T01QK2_A5469EntNro = new int[1] ;
      T01QK2_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK2_A3404EntPedCum = new String[] {""} ;
      T01QK2_A5691EntBnc = new String[] {""} ;
      T01QK2_A7695EntCC = new String[] {""} ;
      T01QK2_A7696EntCCoCod = new short[1] ;
      T01QK2_A10187EntRemNro = new String[] {""} ;
      T01QK2_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK2_A10185EntRemSuc = new String[] {""} ;
      T01QK2_A10184EntRemTpo = new String[] {""} ;
      T01QK2_A12716EntFabId = new int[1] ;
      T01QK2_A13235EntLoteID = new long[1] ;
      T01QK2_A13456EntUbicaci = new String[] {""} ;
      T01QK2_A396EmprCod = new String[] {""} ;
      T01QK2_A719PrdNum = new String[] {""} ;
      T01QK2_A658PedCod = new int[1] ;
      T01QK2_n658PedCod = new boolean[] {false} ;
      T01QK17_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK17_A666PedPri = new String[] {""} ;
      T01QK17_A667PedSit = new String[] {""} ;
      T01QK18_A659PedCum = new String[] {""} ;
      T01QK18_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01QK18_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK18_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK18_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QK19_A396EmprCod = new String[] {""} ;
      T01QK19_A719PrdNum = new String[] {""} ;
      T01QK19_A597LinEnt = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QK20_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ415EntFecEnt = GXutil.nullDate() ;
      ZZ11Albaran = "" ;
      ZZ12857EntNAlbar = "" ;
      ZZ418EntUniEnt = DecimalUtil.ZERO ;
      ZZ417EntPre = DecimalUtil.ZERO ;
      ZZ419EntUniRem = DecimalUtil.ZERO ;
      ZZ5686EntLotN = "" ;
      ZZ5685EntFVal = GXutil.nullDate() ;
      ZZ10783EntObs = "" ;
      ZZ10782EntUniAlb = DecimalUtil.ZERO ;
      ZZ3404EntPedCum = "" ;
      ZZ5691EntBnc = "" ;
      ZZ7695EntCC = "" ;
      ZZ10187EntRemNro = "" ;
      ZZ10186EntRemFch = GXutil.nullDate() ;
      ZZ10185EntRemSuc = "" ;
      ZZ10184EntRemTpo = "" ;
      ZZ13456EntUbicaci = "" ;
      ZZ661PedFec = GXutil.nullDate() ;
      ZZ666PedPri = "" ;
      ZZ667PedSit = "" ;
      ZZ659PedCum = "" ;
      ZZ663PedFulEnt = GXutil.nullDate() ;
      ZZ657PedCanEnt = DecimalUtil.ZERO ;
      ZZ669PedUni = DecimalUtil.ZERO ;
      ZZ665PedPre = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      T01QK21_A396EmprCod = new String[] {""} ;
      T01QK21_A658PedCod = new int[1] ;
      T01QK21_n658PedCod = new boolean[] {false} ;
      T01QK21_A719PrdNum = new String[] {""} ;
      T01QK21_A659PedCum = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.entalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.entalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.entalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entalm__default(),
         new Object[] {
             new Object[] {
            T01QK2_A597LinEnt, T01QK2_A415EntFecEnt, T01QK2_A11Albaran, T01QK2_A12857EntNAlbar, T01QK2_A6156EntPrvNum, T01QK2_n6156EntPrvNum, T01QK2_A418EntUniEnt, T01QK2_A417EntPre, T01QK2_A419EntUniRem, T01QK2_A5686EntLotN,
            T01QK2_A5685EntFVal, T01QK2_A10783EntObs, T01QK2_A416EntNumCon, T01QK2_A414EntEti, T01QK2_A411EntCon, T01QK2_A413EntConIni, T01QK2_A412EntConFin, T01QK2_A5469EntNro, T01QK2_A10782EntUniAlb, T01QK2_A3404EntPedCum,
            T01QK2_A5691EntBnc, T01QK2_A7695EntCC, T01QK2_A7696EntCCoCod, T01QK2_A10187EntRemNro, T01QK2_A10186EntRemFch, T01QK2_A10185EntRemSuc, T01QK2_A10184EntRemTpo, T01QK2_A12716EntFabId, T01QK2_A13235EntLoteID, T01QK2_A13456EntUbicaci,
            T01QK2_A396EmprCod, T01QK2_A719PrdNum, T01QK2_A658PedCod, T01QK2_n658PedCod
            }
            , new Object[] {
            T01QK3_A597LinEnt, T01QK3_A415EntFecEnt, T01QK3_A11Albaran, T01QK3_A12857EntNAlbar, T01QK3_A6156EntPrvNum, T01QK3_n6156EntPrvNum, T01QK3_A418EntUniEnt, T01QK3_A417EntPre, T01QK3_A419EntUniRem, T01QK3_A5686EntLotN,
            T01QK3_A5685EntFVal, T01QK3_A10783EntObs, T01QK3_A416EntNumCon, T01QK3_A414EntEti, T01QK3_A411EntCon, T01QK3_A413EntConIni, T01QK3_A412EntConFin, T01QK3_A5469EntNro, T01QK3_A10782EntUniAlb, T01QK3_A3404EntPedCum,
            T01QK3_A5691EntBnc, T01QK3_A7695EntCC, T01QK3_A7696EntCCoCod, T01QK3_A10187EntRemNro, T01QK3_A10186EntRemFch, T01QK3_A10185EntRemSuc, T01QK3_A10184EntRemTpo, T01QK3_A12716EntFabId, T01QK3_A13235EntLoteID, T01QK3_A13456EntUbicaci,
            T01QK3_A396EmprCod, T01QK3_A719PrdNum, T01QK3_A658PedCod, T01QK3_n658PedCod
            }
            , new Object[] {
            T01QK4_A396EmprCod
            }
            , new Object[] {
            T01QK5_A661PedFec, T01QK5_A666PedPri, T01QK5_A667PedSit
            }
            , new Object[] {
            T01QK6_A659PedCum, T01QK6_A663PedFulEnt, T01QK6_A657PedCanEnt, T01QK6_A669PedUni, T01QK6_A665PedPre
            }
            , new Object[] {
            T01QK7_A597LinEnt, T01QK7_A415EntFecEnt, T01QK7_A11Albaran, T01QK7_A12857EntNAlbar, T01QK7_A6156EntPrvNum, T01QK7_n6156EntPrvNum, T01QK7_A418EntUniEnt, T01QK7_A417EntPre, T01QK7_A419EntUniRem, T01QK7_A5686EntLotN,
            T01QK7_A5685EntFVal, T01QK7_A10783EntObs, T01QK7_A416EntNumCon, T01QK7_A414EntEti, T01QK7_A411EntCon, T01QK7_A413EntConIni, T01QK7_A412EntConFin, T01QK7_A5469EntNro, T01QK7_A10782EntUniAlb, T01QK7_A3404EntPedCum,
            T01QK7_A5691EntBnc, T01QK7_A661PedFec, T01QK7_A666PedPri, T01QK7_A667PedSit, T01QK7_A659PedCum, T01QK7_A663PedFulEnt, T01QK7_A657PedCanEnt, T01QK7_A669PedUni, T01QK7_A665PedPre, T01QK7_A7695EntCC,
            T01QK7_A7696EntCCoCod, T01QK7_A10187EntRemNro, T01QK7_A10186EntRemFch, T01QK7_A10185EntRemSuc, T01QK7_A10184EntRemTpo, T01QK7_A12716EntFabId, T01QK7_A13235EntLoteID, T01QK7_A13456EntUbicaci, T01QK7_A396EmprCod, T01QK7_A719PrdNum,
            T01QK7_A658PedCod, T01QK7_n658PedCod
            }
            , new Object[] {
            T01QK8_A661PedFec, T01QK8_A666PedPri, T01QK8_A667PedSit
            }
            , new Object[] {
            T01QK9_A396EmprCod
            }
            , new Object[] {
            T01QK10_A659PedCum, T01QK10_A663PedFulEnt, T01QK10_A657PedCanEnt, T01QK10_A669PedUni, T01QK10_A665PedPre
            }
            , new Object[] {
            T01QK11_A396EmprCod, T01QK11_A719PrdNum, T01QK11_A597LinEnt
            }
            , new Object[] {
            T01QK12_A396EmprCod, T01QK12_A719PrdNum, T01QK12_A597LinEnt
            }
            , new Object[] {
            T01QK13_A396EmprCod, T01QK13_A719PrdNum, T01QK13_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QK17_A661PedFec, T01QK17_A666PedPri, T01QK17_A667PedSit
            }
            , new Object[] {
            T01QK18_A659PedCum, T01QK18_A663PedFulEnt, T01QK18_A657PedCanEnt, T01QK18_A669PedUni, T01QK18_A665PedPre
            }
            , new Object[] {
            T01QK19_A396EmprCod, T01QK19_A719PrdNum, T01QK19_A597LinEnt
            }
            , new Object[] {
            T01QK20_A396EmprCod
            }
            , new Object[] {
            T01QK21_A396EmprCod, T01QK21_A658PedCod, T01QK21_A719PrdNum, T01QK21_A659PedCum
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z414EntEti ;
   private byte Z411EntCon ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A414EntEti ;
   private byte A411EntCon ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ414EntEti ;
   private byte ZZ411EntCon ;
   private short Z597LinEnt ;
   private short Z416EntNumCon ;
   private short Z7696EntCCoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A597LinEnt ;
   private short A416EntNumCon ;
   private short A7696EntCCoCod ;
   private short A664PedNumLin ;
   private short RcdFound42 ;
   private short nIsDirty_42 ;
   private short Z664PedNumLin ;
   private short ZZ597LinEnt ;
   private short ZZ416EntNumCon ;
   private short ZZ7696EntCCoCod ;
   private short ZZ664PedNumLin ;
   private int Z6156EntPrvNum ;
   private int Z413EntConIni ;
   private int Z412EntConFin ;
   private int Z5469EntNro ;
   private int Z12716EntFabId ;
   private int Z658PedCod ;
   private int A658PedCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtLinEnt_Enabled ;
   private int edtEntFecEnt_Enabled ;
   private int edtAlbaran_Enabled ;
   private int edtEntNAlbar_Enabled ;
   private int edtPedCod_Enabled ;
   private int A6156EntPrvNum ;
   private int edtEntPrvNum_Enabled ;
   private int edtEntUniEnt_Enabled ;
   private int edtEntPre_Enabled ;
   private int edtEntUniRem_Enabled ;
   private int edtEntLotN_Enabled ;
   private int edtEntFVal_Enabled ;
   private int edtEntObs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A413EntConIni ;
   private int A412EntConFin ;
   private int A5469EntNro ;
   private int A12716EntFabId ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ658PedCod ;
   private int ZZ6156EntPrvNum ;
   private int ZZ413EntConIni ;
   private int ZZ412EntConFin ;
   private int ZZ5469EntNro ;
   private int ZZ12716EntFabId ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private long ZZ13235EntLoteID ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal ZZ418EntUniEnt ;
   private java.math.BigDecimal ZZ417EntPre ;
   private java.math.BigDecimal ZZ419EntUniRem ;
   private java.math.BigDecimal ZZ10782EntUniAlb ;
   private java.math.BigDecimal ZZ657PedCanEnt ;
   private java.math.BigDecimal ZZ669PedUni ;
   private java.math.BigDecimal ZZ665PedPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11Albaran ;
   private String Z12857EntNAlbar ;
   private String Z5686EntLotN ;
   private String Z10783EntObs ;
   private String Z3404EntPedCum ;
   private String Z5691EntBnc ;
   private String Z7695EntCC ;
   private String Z10187EntRemNro ;
   private String Z10185EntRemSuc ;
   private String Z10184EntRemTpo ;
   private String Z13456EntUbicaci ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
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
   private String edtPrdNum_Jsonclick ;
   private String edtLinEnt_Internalname ;
   private String edtLinEnt_Jsonclick ;
   private String edtEntFecEnt_Internalname ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtAlbaran_Internalname ;
   private String A11Albaran ;
   private String edtAlbaran_Jsonclick ;
   private String edtEntNAlbar_Internalname ;
   private String A12857EntNAlbar ;
   private String edtEntNAlbar_Jsonclick ;
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntPrvNum_Jsonclick ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Internalname ;
   private String edtEntPre_Jsonclick ;
   private String edtEntUniRem_Internalname ;
   private String edtEntUniRem_Jsonclick ;
   private String edtEntLotN_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Internalname ;
   private String edtEntFVal_Jsonclick ;
   private String edtEntObs_Internalname ;
   private String A10783EntObs ;
   private String edtEntObs_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A3404EntPedCum ;
   private String A5691EntBnc ;
   private String A7695EntCC ;
   private String A10187EntRemNro ;
   private String A10185EntRemSuc ;
   private String A10184EntRemTpo ;
   private String A13456EntUbicaci ;
   private String Gx_mode ;
   private String A666PedPri ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV8EmprNom ;
   private String GXv_char3[] ;
   private String AV9UsurCod ;
   private String GXv_char4[] ;
   private String Z666PedPri ;
   private String Z667PedSit ;
   private String Z659PedCum ;
   private String sMode42 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ11Albaran ;
   private String ZZ12857EntNAlbar ;
   private String ZZ5686EntLotN ;
   private String ZZ10783EntObs ;
   private String ZZ3404EntPedCum ;
   private String ZZ5691EntBnc ;
   private String ZZ7695EntCC ;
   private String ZZ10187EntRemNro ;
   private String ZZ10185EntRemSuc ;
   private String ZZ10184EntRemTpo ;
   private String ZZ13456EntUbicaci ;
   private String ZZ666PedPri ;
   private String ZZ667PedSit ;
   private String ZZ659PedCum ;
   private String E396EmprCod ;
   private java.util.Date Z415EntFecEnt ;
   private java.util.Date Z5685EntFVal ;
   private java.util.Date Z10186EntRemFch ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date A10186EntRemFch ;
   private java.util.Date A661PedFec ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date Z661PedFec ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date ZZ415EntFecEnt ;
   private java.util.Date ZZ5685EntFVal ;
   private java.util.Date ZZ10186EntRemFch ;
   private java.util.Date ZZ661PedFec ;
   private java.util.Date ZZ663PedFulEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean n6156EntPrvNum ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T01QK7_A597LinEnt ;
   private java.util.Date[] T01QK7_A415EntFecEnt ;
   private String[] T01QK7_A11Albaran ;
   private String[] T01QK7_A12857EntNAlbar ;
   private int[] T01QK7_A6156EntPrvNum ;
   private boolean[] T01QK7_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01QK7_A418EntUniEnt ;
   private java.math.BigDecimal[] T01QK7_A417EntPre ;
   private java.math.BigDecimal[] T01QK7_A419EntUniRem ;
   private String[] T01QK7_A5686EntLotN ;
   private java.util.Date[] T01QK7_A5685EntFVal ;
   private String[] T01QK7_A10783EntObs ;
   private short[] T01QK7_A416EntNumCon ;
   private byte[] T01QK7_A414EntEti ;
   private byte[] T01QK7_A411EntCon ;
   private int[] T01QK7_A413EntConIni ;
   private int[] T01QK7_A412EntConFin ;
   private int[] T01QK7_A5469EntNro ;
   private java.math.BigDecimal[] T01QK7_A10782EntUniAlb ;
   private String[] T01QK7_A3404EntPedCum ;
   private String[] T01QK7_A5691EntBnc ;
   private java.util.Date[] T01QK7_A661PedFec ;
   private String[] T01QK7_A666PedPri ;
   private String[] T01QK7_A667PedSit ;
   private String[] T01QK7_A659PedCum ;
   private java.util.Date[] T01QK7_A663PedFulEnt ;
   private java.math.BigDecimal[] T01QK7_A657PedCanEnt ;
   private java.math.BigDecimal[] T01QK7_A669PedUni ;
   private java.math.BigDecimal[] T01QK7_A665PedPre ;
   private String[] T01QK7_A7695EntCC ;
   private short[] T01QK7_A7696EntCCoCod ;
   private String[] T01QK7_A10187EntRemNro ;
   private java.util.Date[] T01QK7_A10186EntRemFch ;
   private String[] T01QK7_A10185EntRemSuc ;
   private String[] T01QK7_A10184EntRemTpo ;
   private int[] T01QK7_A12716EntFabId ;
   private long[] T01QK7_A13235EntLoteID ;
   private String[] T01QK7_A13456EntUbicaci ;
   private String[] T01QK7_A396EmprCod ;
   private String[] T01QK7_A719PrdNum ;
   private int[] T01QK7_A658PedCod ;
   private boolean[] T01QK7_n658PedCod ;
   private java.util.Date[] T01QK5_A661PedFec ;
   private String[] T01QK5_A666PedPri ;
   private String[] T01QK5_A667PedSit ;
   private String[] T01QK4_A396EmprCod ;
   private String[] T01QK6_A659PedCum ;
   private java.util.Date[] T01QK6_A663PedFulEnt ;
   private java.math.BigDecimal[] T01QK6_A657PedCanEnt ;
   private java.math.BigDecimal[] T01QK6_A669PedUni ;
   private java.math.BigDecimal[] T01QK6_A665PedPre ;
   private java.util.Date[] T01QK8_A661PedFec ;
   private String[] T01QK8_A666PedPri ;
   private String[] T01QK8_A667PedSit ;
   private String[] T01QK9_A396EmprCod ;
   private String[] T01QK10_A659PedCum ;
   private java.util.Date[] T01QK10_A663PedFulEnt ;
   private java.math.BigDecimal[] T01QK10_A657PedCanEnt ;
   private java.math.BigDecimal[] T01QK10_A669PedUni ;
   private java.math.BigDecimal[] T01QK10_A665PedPre ;
   private String[] T01QK11_A396EmprCod ;
   private String[] T01QK11_A719PrdNum ;
   private short[] T01QK11_A597LinEnt ;
   private short[] T01QK3_A597LinEnt ;
   private java.util.Date[] T01QK3_A415EntFecEnt ;
   private String[] T01QK3_A11Albaran ;
   private String[] T01QK3_A12857EntNAlbar ;
   private int[] T01QK3_A6156EntPrvNum ;
   private boolean[] T01QK3_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01QK3_A418EntUniEnt ;
   private java.math.BigDecimal[] T01QK3_A417EntPre ;
   private java.math.BigDecimal[] T01QK3_A419EntUniRem ;
   private String[] T01QK3_A5686EntLotN ;
   private java.util.Date[] T01QK3_A5685EntFVal ;
   private String[] T01QK3_A10783EntObs ;
   private short[] T01QK3_A416EntNumCon ;
   private byte[] T01QK3_A414EntEti ;
   private byte[] T01QK3_A411EntCon ;
   private int[] T01QK3_A413EntConIni ;
   private int[] T01QK3_A412EntConFin ;
   private int[] T01QK3_A5469EntNro ;
   private java.math.BigDecimal[] T01QK3_A10782EntUniAlb ;
   private String[] T01QK3_A3404EntPedCum ;
   private String[] T01QK3_A5691EntBnc ;
   private String[] T01QK3_A7695EntCC ;
   private short[] T01QK3_A7696EntCCoCod ;
   private String[] T01QK3_A10187EntRemNro ;
   private java.util.Date[] T01QK3_A10186EntRemFch ;
   private String[] T01QK3_A10185EntRemSuc ;
   private String[] T01QK3_A10184EntRemTpo ;
   private int[] T01QK3_A12716EntFabId ;
   private long[] T01QK3_A13235EntLoteID ;
   private String[] T01QK3_A13456EntUbicaci ;
   private String[] T01QK3_A396EmprCod ;
   private String[] T01QK3_A719PrdNum ;
   private int[] T01QK3_A658PedCod ;
   private boolean[] T01QK3_n658PedCod ;
   private String[] T01QK12_A396EmprCod ;
   private String[] T01QK12_A719PrdNum ;
   private short[] T01QK12_A597LinEnt ;
   private String[] T01QK13_A396EmprCod ;
   private String[] T01QK13_A719PrdNum ;
   private short[] T01QK13_A597LinEnt ;
   private short[] T01QK2_A597LinEnt ;
   private java.util.Date[] T01QK2_A415EntFecEnt ;
   private String[] T01QK2_A11Albaran ;
   private String[] T01QK2_A12857EntNAlbar ;
   private int[] T01QK2_A6156EntPrvNum ;
   private boolean[] T01QK2_n6156EntPrvNum ;
   private java.math.BigDecimal[] T01QK2_A418EntUniEnt ;
   private java.math.BigDecimal[] T01QK2_A417EntPre ;
   private java.math.BigDecimal[] T01QK2_A419EntUniRem ;
   private String[] T01QK2_A5686EntLotN ;
   private java.util.Date[] T01QK2_A5685EntFVal ;
   private String[] T01QK2_A10783EntObs ;
   private short[] T01QK2_A416EntNumCon ;
   private byte[] T01QK2_A414EntEti ;
   private byte[] T01QK2_A411EntCon ;
   private int[] T01QK2_A413EntConIni ;
   private int[] T01QK2_A412EntConFin ;
   private int[] T01QK2_A5469EntNro ;
   private java.math.BigDecimal[] T01QK2_A10782EntUniAlb ;
   private String[] T01QK2_A3404EntPedCum ;
   private String[] T01QK2_A5691EntBnc ;
   private String[] T01QK2_A7695EntCC ;
   private short[] T01QK2_A7696EntCCoCod ;
   private String[] T01QK2_A10187EntRemNro ;
   private java.util.Date[] T01QK2_A10186EntRemFch ;
   private String[] T01QK2_A10185EntRemSuc ;
   private String[] T01QK2_A10184EntRemTpo ;
   private int[] T01QK2_A12716EntFabId ;
   private long[] T01QK2_A13235EntLoteID ;
   private String[] T01QK2_A13456EntUbicaci ;
   private String[] T01QK2_A396EmprCod ;
   private String[] T01QK2_A719PrdNum ;
   private int[] T01QK2_A658PedCod ;
   private boolean[] T01QK2_n658PedCod ;
   private java.util.Date[] T01QK17_A661PedFec ;
   private String[] T01QK17_A666PedPri ;
   private String[] T01QK17_A667PedSit ;
   private String[] T01QK18_A659PedCum ;
   private java.util.Date[] T01QK18_A663PedFulEnt ;
   private java.math.BigDecimal[] T01QK18_A657PedCanEnt ;
   private java.math.BigDecimal[] T01QK18_A669PedUni ;
   private java.math.BigDecimal[] T01QK18_A665PedPre ;
   private String[] T01QK19_A396EmprCod ;
   private String[] T01QK19_A719PrdNum ;
   private short[] T01QK19_A597LinEnt ;
   private String[] T01QK20_A396EmprCod ;
   private String[] T01QK21_A396EmprCod ;
   private int[] T01QK21_A658PedCod ;
   private boolean[] T01QK21_n658PedCod ;
   private String[] T01QK21_A719PrdNum ;
   private String[] T01QK21_A659PedCum ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class entalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QK2", "SELECT LinEnt, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntPre, EntUniRem, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntPre, EntUniRem, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK3", "SELECT LinEnt, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntPre, EntUniRem, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK4", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK5", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK6", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK7", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, TM1.EntUniEnt, TM1.EntPre, TM1.EntUniRem, TM1.EntLotN, TM1.EntFVal, TM1.EntObs, TM1.EntNumCon, TM1.EntEti, TM1.EntCon, TM1.EntConIni, TM1.EntConFin, TM1.EntNro, TM1.EntUniAlb, TM1.EntPedCum, TM1.EntBnc, T2.PedFec, T2.PedPri, T2.PedSit, T3.PedCum, T3.PedFulEnt, T3.PedCanEnt, T3.PedUni, T3.PedPre, TM1.EntCC, TM1.EntCCoCod, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, TM1.EntFabId, TM1.EntLoteID, TM1.EntUbicaci, TM1.EmprCod, TM1.PrdNum, TM1.PedCod FROM ((TXPENTALM TM1 LEFT JOIN TXPCPEDID T2 ON T2.EmprCod = TM1.EmprCod AND T2.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK8", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK9", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK10", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE ( PrdNum > ? or PrdNum = ? and LinEnt > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum, LinEnt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QK13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE ( PrdNum < ? or PrdNum = ? and LinEnt < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC, LinEnt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QK14", "INSERT INTO TXPENTALM(LinEnt, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntUniEnt, EntPre, EntUniRem, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntLoteID, EntUbicaci, EmprCod, PrdNum, PedCod, EntNEmb, EntHfCon, EntFfCon, EntHiCon, EntFiCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01QK15", "UPDATE TXPENTALM SET EntFecEnt=?, Albaran=?, EntNAlbar=?, EntPrvNum=?, EntUniEnt=?, EntPre=?, EntUniRem=?, EntLotN=?, EntFVal=?, EntObs=?, EntNumCon=?, EntEti=?, EntCon=?, EntConIni=?, EntConFin=?, EntNro=?, EntUniAlb=?, EntPedCum=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntRemTpo=?, EntFabId=?, EntLoteID=?, EntUbicaci=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01QK16", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("T01QK17", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK18", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK20", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QK21", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 10);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 12);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 4);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((long[]) buf[28])[0] = rslt.getLong(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((String[]) buf[30])[0] = rslt.getString(30, 3);
               ((String[]) buf[31])[0] = rslt.getString(31, 6);
               ((int[]) buf[32])[0] = rslt.getInt(32);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 10);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 12);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 4);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((long[]) buf[28])[0] = rslt.getLong(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((String[]) buf[30])[0] = rslt.getString(30, 3);
               ((String[]) buf[31])[0] = rslt.getString(31, 6);
               ((int[]) buf[32])[0] = rslt.getInt(32);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 10);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,5);
               ((String[]) buf[29])[0] = rslt.getString(29, 1);
               ((short[]) buf[30])[0] = rslt.getShort(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 12);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(32);
               ((String[]) buf[33])[0] = rslt.getString(33, 4);
               ((String[]) buf[34])[0] = rslt.getString(34, 4);
               ((int[]) buf[35])[0] = rslt.getInt(35);
               ((long[]) buf[36])[0] = rslt.getLong(36);
               ((String[]) buf[37])[0] = rslt.getString(37, 20);
               ((String[]) buf[38])[0] = rslt.getString(38, 3);
               ((String[]) buf[39])[0] = rslt.getString(39, 6);
               ((int[]) buf[40])[0] = rslt.getInt(40);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 20);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 4);
               stmt.setString(9, (String)parms[9], 26);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setString(11, (String)parms[11], 100);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 4);
               stmt.setString(19, (String)parms[19], 1);
               stmt.setString(20, (String)parms[20], 10);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setString(23, (String)parms[23], 12);
               stmt.setDate(24, (java.util.Date)parms[24]);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setInt(27, ((Number) parms[27]).intValue());
               stmt.setLong(28, ((Number) parms[28]).longValue());
               stmt.setString(29, (String)parms[29], 20);
               stmt.setString(30, (String)parms[30], 3);
               stmt.setString(31, (String)parms[31], 6);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[33]).intValue());
               }
               return;
            case 13 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 20);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 4);
               stmt.setString(8, (String)parms[8], 26);
               stmt.setDate(9, (java.util.Date)parms[9]);
               stmt.setString(10, (String)parms[10], 100);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 4);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setString(19, (String)parms[19], 10);
               stmt.setString(20, (String)parms[20], 1);
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setString(22, (String)parms[22], 12);
               stmt.setDate(23, (java.util.Date)parms[23]);
               stmt.setString(24, (String)parms[24], 4);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setInt(26, ((Number) parms[26]).intValue());
               stmt.setLong(27, ((Number) parms[27]).longValue());
               stmt.setString(28, (String)parms[28], 20);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[30]).intValue());
               }
               stmt.setString(30, (String)parms[31], 3);
               stmt.setString(31, (String)parms[32], 6);
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               return;
      }
   }

}

