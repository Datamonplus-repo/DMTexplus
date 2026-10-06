package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdraca_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6031Ac_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Ac_Barcod"))) ;
         A6032Ac_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Ac_BarReo"))) ;
         A6033Ac_BarPar = httpContext.GetPar( "Ac_BarPar") ;
         A6035Ac_Kilos = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Kilos"), ".") ;
         n6035Ac_Kilos = false ;
         A6034Ac_Metros = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Metros"), ".") ;
         n6034Ac_Metros = false ;
         A9839Ac_Abs = CommonUtil.decimalVal( httpContext.GetPar( "Ac_Abs"), ".") ;
         n9839Ac_Abs = false ;
         A118BarAcaQui = httpContext.GetPar( "BarAcaQui") ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A9840Ac_AcaQui = httpContext.GetPar( "Ac_AcaQui") ;
         n9840Ac_AcaQui = false ;
         AV33HumSec = httpContext.GetPar( "HumSec") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33HumSec", AV33HumSec);
         AV32Abs1 = CommonUtil.decimalVal( httpContext.GetPar( "Abs1"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Abs1", GXutil.ltrimstr( AV32Abs1, 6, 2));
         AV36Msg_errfa = httpContext.GetPar( "Msg_errfa") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_errfa", AV36Msg_errfa);
         AV38MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38MaqCod", AV38MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_TD883( A396EmprCod, A6031Ac_Barcod, A6032Ac_BarReo, A6033Ac_BarPar, A6035Ac_Kilos, A6034Ac_Metros, A9839Ac_Abs, A118BarAcaQui, A9840Ac_AcaQui, AV33HumSec, AV32Abs1, AV36Msg_errfa, AV38MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6031Ac_Barcod = (int)(GXutil.lval( httpContext.GetPar( "Ac_Barcod"))) ;
         A6032Ac_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "Ac_BarReo"))) ;
         A6033Ac_BarPar = httpContext.GetPar( "Ac_BarPar") ;
         AV40MsgCtrl = httpContext.GetPar( "MsgCtrl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40MsgCtrl", AV40MsgCtrl);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_TD883( A396EmprCod, A6031Ac_Barcod, A6032Ac_BarReo, A6033Ac_BarPar, AV40MsgCtrl) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV32Abs1 = CommonUtil.decimalVal( httpContext.GetPar( "Abs1"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Abs1", GXutil.ltrimstr( AV32Abs1, 6, 2));
            AV33HumSec = httpContext.GetPar( "HumSec") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33HumSec", AV33HumSec);
            AV38MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MaqCod", AV38MaqCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AGRUPACION RECETAS ACABADO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarAcaQui_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public thdraca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdraca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdraca_impl.class ));
   }

   public thdraca_impl( int remoteHandle ,
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaQui_Internalname, GXutil.rtrim( A118BarAcaQui), GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaQui_Jsonclick, 0, "", "", "", "", "", 1, edtBarAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount883 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_883 = (short)(1) ;
            scanStartTD883( ) ;
            while ( RcdFound883 != 0 )
            {
               init_level_properties883( ) ;
               getByPrimaryKeyTD883( ) ;
               addRowTD883( ) ;
               scanNextTD883( ) ;
            }
            scanEndTD883( ) ;
            nBlankRcdCount883 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalTD883( ) ;
         standaloneModalTD883( ) ;
         sMode883 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRowTD883( ) ;
            edtavnRcdDeleted_883_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_883_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_883_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_883_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARREO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARPAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_Metros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_METROS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_KILOS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_Pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_PZS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_Abs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ABS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtAc_AcaQui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ACAQUI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_883 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalTD883( ) ;
            }
            sendRowTD883( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount883 = (short)(5) ;
         nRcdExists_883 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartTD883( ) ;
            while ( RcdFound883 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50883( ) ;
               init_level_properties883( ) ;
               standaloneNotModalTD883( ) ;
               getByPrimaryKeyTD883( ) ;
               standaloneModalTD883( ) ;
               addRowTD883( ) ;
               scanNextTD883( ) ;
            }
            scanEndTD883( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode883 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_50883( ) ;
      initAllTD883( ) ;
      init_level_properties883( ) ;
      nRcdExists_883 = (short)(0) ;
      nIsMod_883 = (short)(0) ;
      nRcdDeleted_883 = (short)(0) ;
      nBlankRcdCount883 = (short)(nBlankRcdUsr883+nBlankRcdCount883) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount883 > 0 )
      {
         standaloneNotModalTD883( ) ;
         standaloneModalTD883( ) ;
         addRowTD883( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAc_Barcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount883 = (short)(nBlankRcdCount883-1) ;
      }
      Gx_mode = sMode883 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRACA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDRACA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      e11TD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z118BarAcaQui = httpContext.cgiGet( "Z118BarAcaQui") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV36Msg_errfa = httpContext.cgiGet( "vMSG_ERRFA") ;
            AV32Abs1 = localUtil.ctond( httpContext.cgiGet( "vABS1")) ;
            AV37Torient = (byte)(localUtil.ctol( httpContext.cgiGet( "vTORIENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40MsgCtrl = httpContext.cgiGet( "vMSGCTRL") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"THDRACA");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("thdraca:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                        e11TD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12TD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR AGRUPACION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar Agrupacion' */
                        e13TD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR LINEA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar Linea' */
                        e14TD2 ();
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
                     else if ( GXutil.strcmp(sEvt, "GET") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_get( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_check( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                        /* No code required for Help button. It is implemented at the Browser level. */
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
         /* Execute user event: After Trn */
         e12TD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllTD12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_883_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_883_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributesTD12( ) ;
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

   public void confirm_TD0( )
   {
      beforeValidateTD12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsTD12( ) ;
         }
         else
         {
            checkExtendedTableTD12( ) ;
            if ( AnyError == 0 )
            {
               zmTD12( 14) ;
               zmTD12( 15) ;
            }
            closeExtendedTableCursorsTD12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_TD883( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesTD0( ) ;
      }
   }

   public void confirm_TD883( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowTD883( ) ;
         if ( ( nRcdExists_883 != 0 ) || ( nIsMod_883 != 0 ) )
         {
            getKeyTD883( ) ;
            if ( ( nRcdExists_883 == 0 ) && ( nRcdDeleted_883 == 0 ) )
            {
               if ( RcdFound883 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateTD883( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableTD883( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsTD883( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "AC_BARCOD_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAc_Barcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound883 != 0 )
               {
                  if ( nRcdDeleted_883 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyTD883( ) ;
                     loadTD883( ) ;
                     beforeValidateTD883( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsTD883( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_883 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateTD883( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableTD883( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsTD883( ) ;
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
                  if ( nRcdDeleted_883 == 0 )
                  {
                     GXCCtl = "AC_BARCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAc_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_883_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarPar_Internalname, GXutil.rtrim( A6033Ac_BarPar)) ;
         httpContext.changePostValue( edtAc_Metros_Internalname, GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Abs_Internalname, GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_AcaQui_Internalname, GXutil.rtrim( A9840Ac_AcaQui)) ;
         httpContext.changePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_50_idx, GXutil.rtrim( Z6033Ac_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_50_idx, GXutil.rtrim( Z9840Ac_AcaQui)) ;
         httpContext.changePostValue( "nRcdDeleted_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_883 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_883_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_883_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_METROS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_KILOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_PZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ABS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ACAQUI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionTD0( )
   {
   }

   public void e11TD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      thdraca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thdraca_impl.this.A396EmprCod = GXv_char2[0] ;
      thdraca_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdraca_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV37Torient ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      thdraca_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37Torient = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Torient", GXutil.str( AV37Torient, 1, 0));
   }

   public void e12TD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      new app.ptas012(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3) ;
      thdraca_impl.this.A396EmprCod = GXv_char4[0] ;
      thdraca_impl.this.A129BarCod = GXv_int7[0] ;
      thdraca_impl.this.A132BarCodReo = GXv_int6[0] ;
      thdraca_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      /*  Sending Event outputs  */
   }

   public void e13TD2( )
   {
      /* 'Eliminar Agrupacion' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV39MsgErr ;
         new app.pdelac00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2) ;
         thdraca_impl.this.A396EmprCod = GXv_char4[0] ;
         thdraca_impl.this.A129BarCod = GXv_int7[0] ;
         thdraca_impl.this.A132BarCodReo = GXv_int6[0] ;
         thdraca_impl.this.A130BarCodPar = GXv_char3[0] ;
         thdraca_impl.this.AV39MsgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV39MsgErr", AV39MsgErr);
         if ( GXutil.strcmp(AV39MsgErr, "") != 0 )
         {
            httpContext.GX_msglist.addItem(AV39MsgErr);
            GX_FocusControl = edtAc_Barcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXutil.Confirmed = true;
            if ( GXutil.Confirmed )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int7[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_char2[0] = AV8UsurCod ;
               GXv_char8[0] = AV12Station ;
               new app.pdelac01(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_char8) ;
               thdraca_impl.this.A396EmprCod = GXv_char4[0] ;
               thdraca_impl.this.A129BarCod = GXv_int7[0] ;
               thdraca_impl.this.A132BarCodReo = GXv_int6[0] ;
               thdraca_impl.this.A130BarCodPar = GXv_char3[0] ;
               thdraca_impl.this.AV8UsurCod = GXv_char2[0] ;
               thdraca_impl.this.AV12Station = GXv_char8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
            }
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,AV32Abs1,AV33HumSec,AV38MaqCod});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","AV32Abs1","AV33HumSec","AV38MaqCod"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e14TD2( )
   {
      /* 'Eliminar Linea' Routine */
      returnInSub = false ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_char3[0] = AV39MsgErr ;
      new app.pdelac00(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3) ;
      thdraca_impl.this.A396EmprCod = GXv_char8[0] ;
      thdraca_impl.this.A129BarCod = GXv_int7[0] ;
      thdraca_impl.this.A132BarCodReo = GXv_int6[0] ;
      thdraca_impl.this.A130BarCodPar = GXv_char4[0] ;
      thdraca_impl.this.AV39MsgErr = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV39MsgErr", AV39MsgErr);
      if ( GXutil.strcmp(AV39MsgErr, "") != 0 )
      {
         httpContext.GX_msglist.addItem(AV39MsgErr);
         GX_FocusControl = edtAc_Barcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXutil.Confirmed = true;
         if ( GXutil.Confirmed )
         {
            GXv_char8[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int9[0] = A6031Ac_Barcod ;
            GXv_int10[0] = A6032Ac_BarReo ;
            GXv_char3[0] = A6033Ac_BarPar ;
            GXv_char2[0] = AV8UsurCod ;
            GXv_char11[0] = AV12Station ;
            new app.pdelac02(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_int9, GXv_int10, GXv_char3, GXv_char2, GXv_char11) ;
            thdraca_impl.this.A396EmprCod = GXv_char8[0] ;
            thdraca_impl.this.A129BarCod = GXv_int7[0] ;
            thdraca_impl.this.A132BarCodReo = GXv_int6[0] ;
            thdraca_impl.this.A130BarCodPar = GXv_char4[0] ;
            thdraca_impl.this.A6031Ac_Barcod = GXv_int9[0] ;
            thdraca_impl.this.A6032Ac_BarReo = GXv_int10[0] ;
            thdraca_impl.this.A6033Ac_BarPar = GXv_char3[0] ;
            thdraca_impl.this.AV8UsurCod = GXv_char2[0] ;
            thdraca_impl.this.AV12Station = GXv_char11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         }
         GX_FocusControl = edtAc_Barcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void zmTD12( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T00TD5_A361DisCod[0] ;
            Z2759BarMaqGru = T00TD5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T00TD5_A180BarMaqCod[0] ;
            Z118BarAcaQui = T00TD5_A118BarAcaQui[0] ;
            Z252CliCod = T00TD5_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z118BarAcaQui = A118BarAcaQui ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z118BarAcaQui = A118BarAcaQui ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00TD6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TD6_A407EmprNom[0] ;
      n407EmprNom = T00TD6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      /* Using cursor T00TD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T00TD7_A252CliCod[0] ;
      n252CliCod = T00TD7_n252CliCod[0] ;
      A365DisDes = T00TD7_A365DisDes[0] ;
      pr_default.close(5);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_check_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_check_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
   }

   public void loadTD12( )
   {
      /* Using cursor T00TD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T00TD8_A361DisCod[0] ;
         A2759BarMaqGru = T00TD8_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00TD8_A180BarMaqCod[0] ;
         A407EmprNom = T00TD8_A407EmprNom[0] ;
         n407EmprNom = T00TD8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A118BarAcaQui = T00TD8_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A252CliCod = T00TD8_A252CliCod[0] ;
         n252CliCod = T00TD8_n252CliCod[0] ;
         A252CliCod = T00TD8_A252CliCod[0] ;
         n252CliCod = T00TD8_n252CliCod[0] ;
         A365DisDes = T00TD8_A365DisDes[0] ;
         zmTD12( -13) ;
      }
      pr_default.close(6);
      onLoadActionsTD12( ) ;
   }

   public void onLoadActionsTD12( )
   {
   }

   public void checkExtendedTableTD12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsTD12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyTD12( )
   {
      /* Using cursor T00TD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00TD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( T00TD5_A129BarCod[0] == A129BarCod ) && ( T00TD5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00TD5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmTD12( 13) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T00TD5_A361DisCod[0] ;
         A2759BarMaqGru = T00TD5_A2759BarMaqGru[0] ;
         A180BarMaqCod = T00TD5_A180BarMaqCod[0] ;
         A118BarAcaQui = T00TD5_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A252CliCod = T00TD5_A252CliCod[0] ;
         n252CliCod = T00TD5_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadTD12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKeyTD12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKeyTD12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyTD12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T00TD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00TD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TD10_A129BarCod[0] == A129BarCod ) && ( T00TD10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD10_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00TD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TD10_A129BarCod[0] == A129BarCod ) && ( T00TD10_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD10_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T00TD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00TD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TD11_A129BarCod[0] == A129BarCod ) && ( T00TD11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00TD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TD11_A129BarCod[0] == A129BarCod ) && ( T00TD11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyTD12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarAcaQui_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertTD12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
               GX_FocusControl = edtBarAcaQui_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateTD12( ) ;
               GX_FocusControl = edtBarAcaQui_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarAcaQui_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertTD12( ) ;
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
                  GX_FocusControl = edtBarAcaQui_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertTD12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         GX_FocusControl = edtBarAcaQui_Internalname ;
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

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKeyTD12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdraca");
      GX_FocusControl = edtBarAcaQui_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_TD0( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarAcaQui_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartTD12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAcaQui_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndTD12( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAcaQui_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAcaQui_Internalname ;
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
      scanStartTD12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNextTD12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarAcaQui_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndTD12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyTD12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T00TD4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T00TD4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T00TD4_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z118BarAcaQui, T00TD4_A118BarAcaQui[0]) != 0 ) || ( Z252CliCod != T00TD4_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T00TD4_A361DisCod[0] )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T00TD4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T00TD4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T00TD4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T00TD4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T00TD4_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z118BarAcaQui, T00TD4_A118BarAcaQui[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"BarAcaQui");
               GXutil.writeLogRaw("Old: ",Z118BarAcaQui);
               GXutil.writeLogRaw("Current: ",T00TD4_A118BarAcaQui[0]);
            }
            if ( Z252CliCod != T00TD4_A252CliCod[0] )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00TD4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTD12( )
   {
      beforeValidateTD12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTD12( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTD12( 0) ;
         checkOptimisticConcurrencyTD12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTD12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTD12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TD12 */
                  pr_default.execute(10, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A180BarMaqCod, A118BarAcaQui, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN1TD12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelTD12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionTD0( ) ;
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
            loadTD12( ) ;
         }
         endLevelTD12( ) ;
      }
      closeExtendedTableCursorsTD12( ) ;
   }

   public void updateTD12( )
   {
      beforeValidateTD12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTD12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTD12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTD12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateTD12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TD13 */
                  pr_default.execute(11, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, A118BarAcaQui, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateTD12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char11[0] = A396EmprCod ;
                     GXv_int9[0] = A129BarCod ;
                     GXv_int10[0] = A132BarCodReo ;
                     GXv_char8[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_int10, GXv_char8) ;
                     thdraca_impl.this.A396EmprCod = GXv_char11[0] ;
                     thdraca_impl.this.A129BarCod = GXv_int9[0] ;
                     thdraca_impl.this.A132BarCodReo = GXv_int10[0] ;
                     thdraca_impl.this.A130BarCodPar = GXv_char8[0] ;
                     updateTablesN1TD12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelTD12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionTD0( ) ;
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
         endLevelTD12( ) ;
      }
      closeExtendedTableCursorsTD12( ) ;
   }

   public void deferredUpdateTD12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTD12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTD12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTD12( ) ;
         afterConfirmTD12( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTD12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TD14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               if ( AnyError == 0 )
               {
                  updateTablesN1TD12( ) ;
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound12 == 0 )
                     {
                        initAllTD12( ) ;
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
                     resetCaptionTD0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTD12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTD12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelTD883( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowTD883( ) ;
         if ( ( nRcdExists_883 != 0 ) || ( nIsMod_883 != 0 ) )
         {
            standaloneNotModalTD883( ) ;
            getKeyTD883( ) ;
            if ( ( nRcdExists_883 == 0 ) && ( nRcdDeleted_883 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertTD883( ) ;
            }
            else
            {
               if ( RcdFound883 != 0 )
               {
                  if ( ( nRcdDeleted_883 != 0 ) && ( nRcdExists_883 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteTD883( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_883 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateTD883( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_883 == 0 )
                  {
                     GXCCtl = "AC_BARCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAc_Barcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_883_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_BarPar_Internalname, GXutil.rtrim( A6033Ac_BarPar)) ;
         httpContext.changePostValue( edtAc_Metros_Internalname, GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Kilos_Internalname, GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_Abs_Internalname, GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAc_AcaQui_Internalname, GXutil.rtrim( A9840Ac_AcaQui)) ;
         httpContext.changePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_50_idx, GXutil.rtrim( Z6033Ac_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_50_idx, GXutil.rtrim( Z9840Ac_AcaQui)) ;
         httpContext.changePostValue( "nRcdDeleted_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_883_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_883 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_883_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_883_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_BARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_METROS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_KILOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_PZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ABS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "AC_ACAQUI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllTD883( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_883 = (short)(0) ;
      nIsMod_883 = (short)(0) ;
      nRcdDeleted_883 = (short)(0) ;
   }

   public void processLevelTD12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevelTD883( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN1TD12( )
   {
      /* Using cursor T00TD15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevelTD12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteTD12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdraca");
         if ( AnyError == 0 )
         {
            confirmValuesTD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdraca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTD12( )
   {
      /* Scan By routine */
      /* Using cursor T00TD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTD12( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEndTD12( )
   {
      pr_default.close(14);
   }

   public void afterConfirmTD12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTD12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTD12( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTD12( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTD12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTD12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTD12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
   }

   public void zmTD883( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6034Ac_Metros = T00TD3_A6034Ac_Metros[0] ;
            Z6035Ac_Kilos = T00TD3_A6035Ac_Kilos[0] ;
            Z6036Ac_Pzs = T00TD3_A6036Ac_Pzs[0] ;
            Z9839Ac_Abs = T00TD3_A9839Ac_Abs[0] ;
            Z9840Ac_AcaQui = T00TD3_A9840Ac_AcaQui[0] ;
         }
         else
         {
            Z6034Ac_Metros = A6034Ac_Metros ;
            Z6035Ac_Kilos = A6035Ac_Kilos ;
            Z6036Ac_Pzs = A6036Ac_Pzs ;
            Z9839Ac_Abs = A9839Ac_Abs ;
            Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         Z6034Ac_Metros = A6034Ac_Metros ;
         Z6035Ac_Kilos = A6035Ac_Kilos ;
         Z6036Ac_Pzs = A6036Ac_Pzs ;
         Z9839Ac_Abs = A9839Ac_Abs ;
         Z9840Ac_AcaQui = A9840Ac_AcaQui ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalTD883( )
   {
      edtAc_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModalTD883( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_Barcod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAc_Barcod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_BarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAc_BarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAc_BarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtAc_BarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void loadTD883( )
   {
      /* Using cursor T00TD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6034Ac_Metros = T00TD17_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T00TD17_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = T00TD17_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T00TD17_n6035Ac_Kilos[0] ;
         A6036Ac_Pzs = T00TD17_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T00TD17_n6036Ac_Pzs[0] ;
         A9839Ac_Abs = T00TD17_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T00TD17_n9839Ac_Abs[0] ;
         A9840Ac_AcaQui = T00TD17_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T00TD17_n9840Ac_AcaQui[0] ;
         zmTD883( -16) ;
      }
      pr_default.close(15);
      onLoadActionsTD883( ) ;
   }

   public void onLoadActionsTD883( )
   {
   }

   public void checkExtendedTableTD883( )
   {
      nIsDirty_883 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalTD883( ) ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char8[0] = A6033Ac_BarPar ;
         GXv_decimal12[0] = A6035Ac_Kilos ;
         GXv_decimal13[0] = A6034Ac_Metros ;
         GXv_decimal14[0] = A9839Ac_Abs ;
         GXv_char4[0] = A118BarAcaQui ;
         GXv_char3[0] = A9840Ac_AcaQui ;
         GXv_char2[0] = AV33HumSec ;
         GXv_decimal15[0] = AV32Abs1 ;
         GXv_char16[0] = AV36Msg_errfa ;
         GXv_char17[0] = AV38MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_int10, GXv_char8, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_char4, GXv_char3, GXv_char2, GXv_decimal15, GXv_char16, GXv_char17) ;
         thdraca_impl.this.A396EmprCod = GXv_char11[0] ;
         thdraca_impl.this.A6031Ac_Barcod = GXv_int9[0] ;
         thdraca_impl.this.A6032Ac_BarReo = GXv_int10[0] ;
         thdraca_impl.this.A6033Ac_BarPar = GXv_char8[0] ;
         thdraca_impl.this.A6035Ac_Kilos = GXv_decimal12[0] ;
         thdraca_impl.this.A6034Ac_Metros = GXv_decimal13[0] ;
         thdraca_impl.this.A9839Ac_Abs = GXv_decimal14[0] ;
         thdraca_impl.this.A118BarAcaQui = GXv_char4[0] ;
         thdraca_impl.this.A9840Ac_AcaQui = GXv_char3[0] ;
         thdraca_impl.this.AV33HumSec = GXv_char2[0] ;
         thdraca_impl.this.AV32Abs1 = GXv_decimal15[0] ;
         thdraca_impl.this.AV36Msg_errfa = GXv_char16[0] ;
         thdraca_impl.this.AV38MaqCod = GXv_char17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         httpContext.ajax_rsp_assign_attri("", false, "AV33HumSec", AV33HumSec);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Abs1", GXutil.ltrimstr( AV32Abs1, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_errfa", AV36Msg_errfa);
         httpContext.ajax_rsp_assign_attri("", false, "AV38MaqCod", AV38MaqCod);
      }
      if ( true /* Level */ && ( A129BarCod == A6031Ac_Barcod ) && ( A132BarCodReo == A6032Ac_BarReo ) && ( GXutil.strcmp(A130BarCodPar, A6033Ac_BarPar) == 0 ) )
      {
         GXCCtl = "AC_BARCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Barcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( DecimalUtil.compareTo(AV32Abs1, A9839Ac_Abs) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 1 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( DecimalUtil.compareTo(AV32Abs1, A9839Ac_Abs) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 0 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 0, GXCCtl);
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 1 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 0 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 0, GXCCtl);
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char16[0] = A6033Ac_BarPar ;
         GXv_char11[0] = AV40MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16, GXv_char11) ;
         thdraca_impl.this.A396EmprCod = GXv_char17[0] ;
         thdraca_impl.this.A6031Ac_Barcod = GXv_int9[0] ;
         thdraca_impl.this.A6032Ac_BarReo = GXv_int10[0] ;
         thdraca_impl.this.A6033Ac_BarPar = GXv_char16[0] ;
         thdraca_impl.this.AV40MsgCtrl = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV40MsgCtrl", AV40MsgCtrl);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV40MsgCtrl, " ") != 0 ) )
      {
         GXCCtl = "AC_BARPAR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(AV40MsgCtrl, 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursorsTD883( )
   {
   }

   public void enableDisableTD883( )
   {
   }

   public void getKeyTD883( )
   {
      /* Using cursor T00TD18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound883 = (short)(1) ;
      }
      else
      {
         RcdFound883 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKeyTD883( )
   {
      /* Using cursor T00TD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      if ( (pr_default.getStatus(1) != 101) && ( T00TD3_A129BarCod[0] == A129BarCod ) && ( T00TD3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00TD3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00TD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmTD883( 16) ;
         RcdFound883 = (short)(1) ;
         initializeNonKeyTD883( ) ;
         A6031Ac_Barcod = T00TD3_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T00TD3_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T00TD3_A6033Ac_BarPar[0] ;
         A6034Ac_Metros = T00TD3_A6034Ac_Metros[0] ;
         n6034Ac_Metros = T00TD3_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = T00TD3_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = T00TD3_n6035Ac_Kilos[0] ;
         A6036Ac_Pzs = T00TD3_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = T00TD3_n6036Ac_Pzs[0] ;
         A9839Ac_Abs = T00TD3_A9839Ac_Abs[0] ;
         n9839Ac_Abs = T00TD3_n9839Ac_Abs[0] ;
         A9840Ac_AcaQui = T00TD3_A9840Ac_AcaQui[0] ;
         n9840Ac_AcaQui = T00TD3_n9840Ac_AcaQui[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6031Ac_Barcod = A6031Ac_Barcod ;
         Z6032Ac_BarReo = A6032Ac_BarReo ;
         Z6033Ac_BarPar = A6033Ac_BarPar ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTD883( ) ;
         loadTD883( ) ;
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound883 = (short)(0) ;
         initializeNonKeyTD883( ) ;
         sMode883 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTD883( ) ;
         Gx_mode = sMode883 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesTD883( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyTD883( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6034Ac_Metros, T00TD2_A6034Ac_Metros[0]) != 0 ) || ( DecimalUtil.compareTo(Z6035Ac_Kilos, T00TD2_A6035Ac_Kilos[0]) != 0 ) || ( Z6036Ac_Pzs != T00TD2_A6036Ac_Pzs[0] ) || ( DecimalUtil.compareTo(Z9839Ac_Abs, T00TD2_A9839Ac_Abs[0]) != 0 ) || ( GXutil.strcmp(Z9840Ac_AcaQui, T00TD2_A9840Ac_AcaQui[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6034Ac_Metros, T00TD2_A6034Ac_Metros[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"Ac_Metros");
               GXutil.writeLogRaw("Old: ",Z6034Ac_Metros);
               GXutil.writeLogRaw("Current: ",T00TD2_A6034Ac_Metros[0]);
            }
            if ( DecimalUtil.compareTo(Z6035Ac_Kilos, T00TD2_A6035Ac_Kilos[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"Ac_Kilos");
               GXutil.writeLogRaw("Old: ",Z6035Ac_Kilos);
               GXutil.writeLogRaw("Current: ",T00TD2_A6035Ac_Kilos[0]);
            }
            if ( Z6036Ac_Pzs != T00TD2_A6036Ac_Pzs[0] )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"Ac_Pzs");
               GXutil.writeLogRaw("Old: ",Z6036Ac_Pzs);
               GXutil.writeLogRaw("Current: ",T00TD2_A6036Ac_Pzs[0]);
            }
            if ( DecimalUtil.compareTo(Z9839Ac_Abs, T00TD2_A9839Ac_Abs[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"Ac_Abs");
               GXutil.writeLogRaw("Old: ",Z9839Ac_Abs);
               GXutil.writeLogRaw("Current: ",T00TD2_A9839Ac_Abs[0]);
            }
            if ( GXutil.strcmp(Z9840Ac_AcaQui, T00TD2_A9840Ac_AcaQui[0]) != 0 )
            {
               GXutil.writeLogln("thdraca:[seudo value changed for attri]"+"Ac_AcaQui");
               GXutil.writeLogRaw("Old: ",Z9840Ac_AcaQui);
               GXutil.writeLogRaw("Current: ",T00TD2_A9840Ac_AcaQui[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRACA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTD883( )
   {
      beforeValidateTD883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTD883( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTD883( 0) ;
         checkOptimisticConcurrencyTD883( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTD883( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTD883( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TD19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar, Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
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
            loadTD883( ) ;
         }
         endLevelTD883( ) ;
      }
      closeExtendedTableCursorsTD883( ) ;
   }

   public void updateTD883( )
   {
      beforeValidateTD883( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTD883( ) ;
      }
      if ( ( nIsMod_883 != 0 ) || ( nIsDirty_883 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyTD883( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmTD883( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateTD883( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00TD20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n6034Ac_Metros), A6034Ac_Metros, Boolean.valueOf(n6035Ac_Kilos), A6035Ac_Kilos, Boolean.valueOf(n6036Ac_Pzs), Short.valueOf(A6036Ac_Pzs), Boolean.valueOf(n9839Ac_Abs), A9839Ac_Abs, Boolean.valueOf(n9840Ac_AcaQui), A9840Ac_AcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRACA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateTD883( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char17[0] = A396EmprCod ;
                        GXv_int9[0] = A129BarCod ;
                        GXv_int10[0] = A132BarCodReo ;
                        GXv_char16[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16) ;
                        thdraca_impl.this.A396EmprCod = GXv_char17[0] ;
                        thdraca_impl.this.A129BarCod = GXv_int9[0] ;
                        thdraca_impl.this.A132BarCodReo = GXv_int10[0] ;
                        thdraca_impl.this.A130BarCodPar = GXv_char16[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyTD883( ) ;
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
            endLevelTD883( ) ;
         }
      }
      closeExtendedTableCursorsTD883( ) ;
   }

   public void deferredUpdateTD883( )
   {
   }

   public void deleteTD883( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTD883( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTD883( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTD883( ) ;
         afterConfirmTD883( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTD883( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TD21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
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
      sMode883 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTD883( ) ;
      Gx_mode = sMode883 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTD883( )
   {
      standaloneModalTD883( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelTD883( )
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

   public void scanStartTD883( )
   {
      /* Scan By routine */
      /* Using cursor T00TD22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6031Ac_Barcod = T00TD22_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T00TD22_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T00TD22_A6033Ac_BarPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTD883( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound883 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound883 = (short)(1) ;
         A6031Ac_Barcod = T00TD22_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = T00TD22_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = T00TD22_A6033Ac_BarPar[0] ;
      }
   }

   public void scanEndTD883( )
   {
      pr_default.close(20);
   }

   public void afterConfirmTD883( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTD883( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTD883( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTD883( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTD883( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTD883( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTD883( )
   {
      edtAc_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Metros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Kilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Pzs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Abs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Abs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Abs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_AcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_AcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_AcaQui_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashesTD883( )
   {
   }

   public void send_integrity_lvl_hashesTD12( )
   {
   }

   public void subsflControlProps_50883( )
   {
      edtavnRcdDeleted_883_Internalname = "vNRCDDELETED_883_"+sGXsfl_50_idx ;
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_50_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_50_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_50_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_50_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_50_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_50_idx ;
      edtAc_Abs_Internalname = "AC_ABS_"+sGXsfl_50_idx ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50883( )
   {
      edtavnRcdDeleted_883_Internalname = "vNRCDDELETED_883_"+sGXsfl_50_fel_idx ;
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_50_fel_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_50_fel_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_50_fel_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_50_fel_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_50_fel_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_50_fel_idx ;
      edtAc_Abs_Internalname = "AC_ABS_"+sGXsfl_50_fel_idx ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI_"+sGXsfl_50_fel_idx ;
   }

   public void addRowTD883( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50883( ) ;
      sendRowTD883( ) ;
   }

   public void sendRowTD883( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_883_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_883_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_883), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_883), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_883_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_883_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6031Ac_Barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_Barcod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6032Ac_BarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_BarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarPar_Internalname,GXutil.rtrim( A6033Ac_BarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_BarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Metros_Internalname,GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Metros_Enabled!=0) ? localUtil.format( A6034Ac_Metros, "ZZZZZ9.99") : localUtil.format( A6034Ac_Metros, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Metros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_Metros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Kilos_Internalname,GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Kilos_Enabled!=0) ? localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99") : localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_Kilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Pzs_Internalname,GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Pzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_Pzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Abs_Internalname,GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAc_Abs_Enabled!=0) ? localUtil.format( A9839Ac_Abs, "ZZ9.99") : localUtil.format( A9839Ac_Abs, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Abs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_Abs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_883_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_AcaQui_Internalname,GXutil.rtrim( A9840Ac_AcaQui),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_AcaQui_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAc_AcaQui_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesTD883( ) ;
      GXCCtl = "Z6031Ac_Barcod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6032Ac_BarReo_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6033Ac_BarPar_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6033Ac_BarPar));
      GXCCtl = "Z6034Ac_Metros_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6035Ac_Kilos_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6036Ac_Pzs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9839Ac_Abs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9839Ac_Abs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9840Ac_AcaQui_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9840Ac_AcaQui));
      GXCCtl = "nRcdDeleted_883_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_883_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_883_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_883, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vMSGERR_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV39MsgErr));
      GXCCtl = "vUSURCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Station));
      GXCCtl = "vABS1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32Abs1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vHUMSEC_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33HumSec));
      GXCCtl = "vMAQCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_883_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_883_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_METROS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_KILOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_PZS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_ABS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_ACAQUI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowTD883( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50883( ) ;
      edtavnRcdDeleted_883_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_883_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARREO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_BARPAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Metros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_METROS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Kilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_KILOS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Pzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_PZS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_Abs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ABS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAc_AcaQui_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "AC_ACAQUI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_883_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_883_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_883");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_883_Internalname ;
         wbErr = true ;
         nRcdDeleted_883 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_883 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_883_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "AC_BARCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Barcod_Internalname ;
         wbErr = true ;
         A6031Ac_Barcod = 0 ;
      }
      else
      {
         A6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "AC_BARREO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarReo_Internalname ;
         wbErr = true ;
         A6032Ac_BarReo = (byte)(0) ;
      }
      else
      {
         A6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6033Ac_BarPar = httpContext.cgiGet( edtAc_BarPar_Internalname) ;
      A6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)) ;
      n6034Ac_Metros = false ;
      A6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)) ;
      n6035Ac_Kilos = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "AC_PZS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Pzs_Internalname ;
         wbErr = true ;
         A6036Ac_Pzs = (short)(0) ;
         n6036Ac_Pzs = false ;
      }
      else
      {
         A6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6036Ac_Pzs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "AC_ABS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_Abs_Internalname ;
         wbErr = true ;
         A9839Ac_Abs = DecimalUtil.ZERO ;
         n9839Ac_Abs = false ;
      }
      else
      {
         A9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( edtAc_Abs_Internalname)) ;
         n9839Ac_Abs = false ;
      }
      A9840Ac_AcaQui = httpContext.cgiGet( edtAc_AcaQui_Internalname) ;
      n9840Ac_AcaQui = false ;
      GXCCtl = "Z6031Ac_Barcod_" + sGXsfl_50_idx ;
      Z6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6032Ac_BarReo_" + sGXsfl_50_idx ;
      Z6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6033Ac_BarPar_" + sGXsfl_50_idx ;
      Z6033Ac_BarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6034Ac_Metros_" + sGXsfl_50_idx ;
      Z6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6035Ac_Kilos_" + sGXsfl_50_idx ;
      Z6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6036Ac_Pzs_" + sGXsfl_50_idx ;
      Z6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9839Ac_Abs_" + sGXsfl_50_idx ;
      Z9839Ac_Abs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9840Ac_AcaQui_" + sGXsfl_50_idx ;
      Z9840Ac_AcaQui = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_883_" + sGXsfl_50_idx ;
      nRcdDeleted_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_883_" + sGXsfl_50_idx ;
      nRcdExists_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_883_" + sGXsfl_50_idx ;
      nIsMod_883 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAc_Kilos_Enabled = edtAc_Kilos_Enabled ;
      defedtAc_Metros_Enabled = edtAc_Metros_Enabled ;
      defedtAc_BarPar_Enabled = edtAc_BarPar_Enabled ;
      defedtAc_BarReo_Enabled = edtAc_BarReo_Enabled ;
      defedtAc_Barcod_Enabled = edtAc_Barcod_Enabled ;
   }

   public void confirmValuesTD0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50883( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50883( ) ;
         httpContext.changePostValue( "Z6031Ac_Barcod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6031Ac_Barcod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6032Ac_BarReo_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6032Ac_BarReo_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6033Ac_BarPar_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6033Ac_BarPar_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6034Ac_Metros_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6034Ac_Metros_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6035Ac_Kilos_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6035Ac_Kilos_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6036Ac_Pzs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6036Ac_Pzs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9839Ac_Abs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9839Ac_Abs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9840Ac_AcaQui_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9840Ac_AcaQui_"+sGXsfl_50_idx) ;
      }
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
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
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdraca", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV32Abs1)),GXutil.URLEncode(GXutil.rtrim(AV33HumSec)),GXutil.URLEncode(GXutil.rtrim(AV38MaqCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Abs1","HumSec","MaqCod"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THDRACA");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thdraca:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z118BarAcaQui", GXutil.rtrim( Z118BarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", GXutil.rtrim( AV39MsgErr));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUMSEC", GXutil.rtrim( AV33HumSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV38MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRFA", GXutil.rtrim( AV36Msg_errfa));
      app.GxWebStd.gx_hidden_field( httpContext, "vABS1", GXutil.ltrim( localUtil.ntoc( AV32Abs1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTORIENT", GXutil.ltrim( localUtil.ntoc( AV37Torient, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGCTRL", GXutil.rtrim( AV40MsgCtrl));
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
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.thdraca", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV32Abs1)),GXutil.URLEncode(GXutil.rtrim(AV33HumSec)),GXutil.URLEncode(GXutil.rtrim(AV38MaqCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Abs1","HumSec","MaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "THDRACA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AGRUPACION RECETAS ACABADO", "") ;
   }

   public void initializeNonKeyTD12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A118BarAcaQui = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z118BarAcaQui = "" ;
      Z252CliCod = 0 ;
   }

   public void initAllTD12( )
   {
      initializeNonKeyTD12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyTD883( )
   {
      AV36Msg_errfa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_errfa", AV36Msg_errfa);
      AV40MsgCtrl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40MsgCtrl", AV40MsgCtrl);
      A6034Ac_Metros = DecimalUtil.ZERO ;
      n6034Ac_Metros = false ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      n6035Ac_Kilos = false ;
      A6036Ac_Pzs = (short)(0) ;
      n6036Ac_Pzs = false ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      n9839Ac_Abs = false ;
      A9840Ac_AcaQui = "" ;
      n9840Ac_AcaQui = false ;
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z6036Ac_Pzs = (short)(0) ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
   }

   public void initAllTD883( )
   {
      A6031Ac_Barcod = 0 ;
      A6032Ac_BarReo = (byte)(0) ;
      A6033Ac_BarPar = "" ;
      initializeNonKeyTD883( ) ;
   }

   public void standaloneModalInsertTD883( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153360", true, true);
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
      httpContext.AddJavascriptSource("thdraca.js", "?2026824153360", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties883( )
   {
      edtAc_Kilos_Enabled = defedtAc_Kilos_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Kilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Kilos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Metros_Enabled = defedtAc_Metros_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Metros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Metros_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_BarPar_Enabled = defedtAc_BarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_BarReo_Enabled = defedtAc_BarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_BarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtAc_Barcod_Enabled = defedtAc_Barcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAc_Barcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_883, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_883_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6033Ac_BarPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Metros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Kilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_Abs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9840Ac_AcaQui));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAc_AcaQui_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      edtavnRcdDeleted_883_Internalname = "vNRCDDELETED_883" ;
      edtAc_Barcod_Internalname = "AC_BARCOD" ;
      edtAc_BarReo_Internalname = "AC_BARREO" ;
      edtAc_BarPar_Internalname = "AC_BARPAR" ;
      edtAc_Metros_Internalname = "AC_METROS" ;
      edtAc_Kilos_Internalname = "AC_KILOS" ;
      edtAc_Pzs_Internalname = "AC_PZS" ;
      edtAc_Abs_Internalname = "AC_ABS" ;
      edtAc_AcaQui_Internalname = "AC_ACAQUI" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "AGRUPACION RECETAS ACABADO", "") );
      edtAc_AcaQui_Jsonclick = "" ;
      edtAc_Abs_Jsonclick = "" ;
      edtAc_Pzs_Jsonclick = "" ;
      edtAc_Kilos_Jsonclick = "" ;
      edtAc_Metros_Jsonclick = "" ;
      edtAc_BarPar_Jsonclick = "" ;
      edtAc_BarReo_Jsonclick = "" ;
      edtAc_Barcod_Jsonclick = "" ;
      edtavnRcdDeleted_883_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAc_AcaQui_Enabled = 1 ;
      edtAc_Abs_Enabled = 1 ;
      edtAc_Pzs_Enabled = 1 ;
      edtAc_Kilos_Enabled = 0 ;
      edtAc_Metros_Enabled = 0 ;
      edtAc_BarPar_Enabled = 1 ;
      edtAc_BarReo_Enabled = 1 ;
      edtAc_Barcod_Enabled = 1 ;
      edtavnRcdDeleted_883_Enabled = 1 ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Backcolor = (int)(0xFFFFFF) ;
      edtBarAcaQui_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
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

   public void xc_5_TD883( String A396EmprCod ,
                           int A6031Ac_Barcod ,
                           byte A6032Ac_BarReo ,
                           String A6033Ac_BarPar ,
                           java.math.BigDecimal A6035Ac_Kilos ,
                           java.math.BigDecimal A6034Ac_Metros ,
                           java.math.BigDecimal A9839Ac_Abs ,
                           String A118BarAcaQui ,
                           String A9840Ac_AcaQui ,
                           String AV33HumSec ,
                           java.math.BigDecimal AV32Abs1 ,
                           String AV36Msg_errfa ,
                           String AV38MaqCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char16[0] = A6033Ac_BarPar ;
         GXv_decimal15[0] = A6035Ac_Kilos ;
         GXv_decimal14[0] = A6034Ac_Metros ;
         GXv_decimal13[0] = A9839Ac_Abs ;
         GXv_char11[0] = A118BarAcaQui ;
         GXv_char8[0] = A9840Ac_AcaQui ;
         GXv_char4[0] = AV33HumSec ;
         GXv_decimal12[0] = AV32Abs1 ;
         GXv_char3[0] = AV36Msg_errfa ;
         GXv_char2[0] = AV38MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_char11, GXv_char8, GXv_char4, GXv_decimal12, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char17[0] ;
         A6031Ac_Barcod = GXv_int9[0] ;
         A6032Ac_BarReo = GXv_int10[0] ;
         A6033Ac_BarPar = GXv_char16[0] ;
         A6035Ac_Kilos = GXv_decimal15[0] ;
         A6034Ac_Metros = GXv_decimal14[0] ;
         A9839Ac_Abs = GXv_decimal13[0] ;
         A118BarAcaQui = GXv_char11[0] ;
         A9840Ac_AcaQui = GXv_char8[0] ;
         AV33HumSec = GXv_char4[0] ;
         AV32Abs1 = GXv_decimal12[0] ;
         AV36Msg_errfa = GXv_char3[0] ;
         AV38MaqCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         httpContext.ajax_rsp_assign_attri("", false, "AV33HumSec", AV33HumSec);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Abs1", GXutil.ltrimstr( AV32Abs1, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_errfa", AV36Msg_errfa);
         httpContext.ajax_rsp_assign_attri("", false, "AV38MaqCod", AV38MaqCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6033Ac_BarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A118BarAcaQui))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9840Ac_AcaQui))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33HumSec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Abs1, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36Msg_errfa))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV38MaqCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_11_TD883( String A396EmprCod ,
                            int A6031Ac_Barcod ,
                            byte A6032Ac_BarReo ,
                            String A6033Ac_BarPar ,
                            String AV40MsgCtrl )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char16[0] = A6033Ac_BarPar ;
         GXv_char11[0] = AV40MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16, GXv_char11) ;
         A396EmprCod = GXv_char17[0] ;
         A6031Ac_Barcod = GXv_int9[0] ;
         A6032Ac_BarReo = GXv_int10[0] ;
         A6033Ac_BarPar = GXv_char16[0] ;
         AV40MsgCtrl = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV40MsgCtrl", AV40MsgCtrl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6033Ac_BarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV40MsgCtrl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_50883( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalTD883( ) ;
         standaloneModalTD883( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowTD883( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50883( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
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
      /* Using cursor T00TD23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TD23_A407EmprNom[0] ;
      n407EmprNom = T00TD23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      GX_FocusControl = edtBarAcaQui_Internalname ;
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

   public void valid_Barcodpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", GXutil.rtrim( A118BarAcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z118BarAcaQui", GXutil.rtrim( Z118BarAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Ac_barpar( )
   {
      n9840Ac_AcaQui = false ;
      n9839Ac_Abs = false ;
      n6034Ac_Metros = false ;
      n6035Ac_Kilos = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char16[0] = A6033Ac_BarPar ;
         GXv_decimal15[0] = A6035Ac_Kilos ;
         GXv_decimal14[0] = A6034Ac_Metros ;
         GXv_decimal13[0] = A9839Ac_Abs ;
         GXv_char11[0] = A118BarAcaQui ;
         GXv_char8[0] = A9840Ac_AcaQui ;
         GXv_char4[0] = AV33HumSec ;
         GXv_decimal12[0] = AV32Abs1 ;
         GXv_char3[0] = AV36Msg_errfa ;
         GXv_char2[0] = AV38MaqCod ;
         new app.prac010(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_char11, GXv_char8, GXv_char4, GXv_decimal12, GXv_char3, GXv_char2) ;
         thdraca_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         thdraca_impl.this.A6031Ac_Barcod = GXv_int9[0] ;
         A6031Ac_Barcod = this.A6031Ac_Barcod ;
         thdraca_impl.this.A6032Ac_BarReo = GXv_int10[0] ;
         A6032Ac_BarReo = this.A6032Ac_BarReo ;
         thdraca_impl.this.A6033Ac_BarPar = GXv_char16[0] ;
         A6033Ac_BarPar = this.A6033Ac_BarPar ;
         thdraca_impl.this.A6035Ac_Kilos = GXv_decimal15[0] ;
         A6035Ac_Kilos = this.A6035Ac_Kilos ;
         thdraca_impl.this.A6034Ac_Metros = GXv_decimal14[0] ;
         A6034Ac_Metros = this.A6034Ac_Metros ;
         thdraca_impl.this.A9839Ac_Abs = GXv_decimal13[0] ;
         A9839Ac_Abs = this.A9839Ac_Abs ;
         thdraca_impl.this.A118BarAcaQui = GXv_char11[0] ;
         A118BarAcaQui = this.A118BarAcaQui ;
         thdraca_impl.this.A9840Ac_AcaQui = GXv_char8[0] ;
         A9840Ac_AcaQui = this.A9840Ac_AcaQui ;
         thdraca_impl.this.AV33HumSec = GXv_char4[0] ;
         AV33HumSec = this.AV33HumSec ;
         thdraca_impl.this.AV32Abs1 = GXv_decimal12[0] ;
         AV32Abs1 = this.AV32Abs1 ;
         thdraca_impl.this.AV36Msg_errfa = GXv_char3[0] ;
         AV36Msg_errfa = this.AV36Msg_errfa ;
         thdraca_impl.this.AV38MaqCod = GXv_char2[0] ;
         AV38MaqCod = this.AV38MaqCod ;
      }
      if ( true /* Level */ && ( A129BarCod == A6031Ac_Barcod ) && ( A132BarCodReo == A6032Ac_BarReo ) && ( GXutil.strcmp(A130BarCodPar, A6033Ac_BarPar) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, "AC_BARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
      }
      if ( ( DecimalUtil.compareTo(AV32Abs1, A9839Ac_Abs) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 1, "AC_BARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
      }
      if ( ( DecimalUtil.compareTo(AV32Abs1, A9839Ac_Abs) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 0, "AC_BARPAR");
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 1, "AC_BARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAc_BarPar_Internalname ;
      }
      if ( ( GXutil.strcmp(A118BarAcaQui, A9840Ac_AcaQui) != 0 ) && true /* Level */ && true /* After */ && ( AV37Torient == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV36Msg_errfa, 0, "AC_BARPAR");
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int9[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char16[0] = A6033Ac_BarPar ;
         GXv_char11[0] = AV40MsgCtrl ;
         new app.pprc201(remoteHandle, context).execute( GXv_char17, GXv_int9, GXv_int10, GXv_char16, GXv_char11) ;
         thdraca_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         thdraca_impl.this.A6031Ac_Barcod = GXv_int9[0] ;
         A6031Ac_Barcod = this.A6031Ac_Barcod ;
         thdraca_impl.this.A6032Ac_BarReo = GXv_int10[0] ;
         A6032Ac_BarReo = this.A6032Ac_BarReo ;
         thdraca_impl.this.A6033Ac_BarPar = GXv_char16[0] ;
         A6033Ac_BarPar = this.A6033Ac_BarPar ;
         thdraca_impl.this.AV40MsgCtrl = GXv_char11[0] ;
         AV40MsgCtrl = this.AV40MsgCtrl ;
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV40MsgCtrl, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV40MsgCtrl, 0, "AC_BARPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6035Ac_Kilos", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6034Ac_Metros", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9839Ac_Abs", GXutil.ltrim( localUtil.ntoc( A9839Ac_Abs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", GXutil.rtrim( A118BarAcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "A9840Ac_AcaQui", GXutil.rtrim( A9840Ac_AcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "AV33HumSec", GXutil.rtrim( AV33HumSec));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Abs1", GXutil.ltrim( localUtil.ntoc( AV32Abs1, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Msg_errfa", GXutil.rtrim( AV36Msg_errfa));
      httpContext.ajax_rsp_assign_attri("", false, "AV38MaqCod", GXutil.rtrim( AV38MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6031Ac_Barcod", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6032Ac_BarReo", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6033Ac_BarPar", GXutil.rtrim( A6033Ac_BarPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV40MsgCtrl", GXutil.rtrim( AV40MsgCtrl));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV32Abs1',fld:'vABS1',pic:'ZZ9.99'},{av:'AV33HumSec',fld:'vHUMSEC',pic:''},{av:'AV38MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12TD2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ELIMINAR AGRUPACION'","{handler:'e13TD2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV39MsgErr',fld:'vMSGERR',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'ELIMINAR AGRUPACION'",",oparms:[{av:'AV39MsgErr',fld:'vMSGERR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]}");
      setEventMetadata("'ELIMINAR LINEA'","{handler:'e14TD2',iparms:[{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV39MsgErr',fld:'vMSGERR',pic:''},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'ELIMINAR LINEA'",",oparms:[{av:'AV39MsgErr',fld:'vMSGERR',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z407EmprNom'},{av:'Z118BarAcaQui'},{av:'Z252CliCod'},{av:'Z365DisDes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_AC_BARCOD","{handler:'valid_Ac_barcod',iparms:[]");
      setEventMetadata("VALID_AC_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_AC_BARREO","{handler:'valid_Ac_barreo',iparms:[]");
      setEventMetadata("VALID_AC_BARREO",",oparms:[]}");
      setEventMetadata("VALID_AC_BARPAR","{handler:'valid_Ac_barpar',iparms:[{av:'AV38MaqCod',fld:'vMAQCOD',pic:''},{av:'AV32Abs1',fld:'vABS1',pic:'ZZ9.99'},{av:'AV33HumSec',fld:'vHUMSEC',pic:''},{av:'A9840Ac_AcaQui',fld:'AC_ACAQUI',pic:''},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A9839Ac_Abs',fld:'AC_ABS',pic:'ZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV36Msg_errfa',fld:'vMSG_ERRFA',pic:''},{av:'AV40MsgCtrl',fld:'vMSGCTRL',pic:''}]");
      setEventMetadata("VALID_AC_BARPAR",",oparms:[{av:'A6035Ac_Kilos',fld:'AC_KILOS',pic:'ZZZZZ9.99'},{av:'A6034Ac_Metros',fld:'AC_METROS',pic:'ZZZZZ9.99'},{av:'A9839Ac_Abs',fld:'AC_ABS',pic:'ZZ9.99'},{av:'A118BarAcaQui',fld:'BARACAQUI',pic:''},{av:'A9840Ac_AcaQui',fld:'AC_ACAQUI',pic:''},{av:'AV33HumSec',fld:'vHUMSEC',pic:''},{av:'AV32Abs1',fld:'vABS1',pic:'ZZ9.99'},{av:'AV36Msg_errfa',fld:'vMSG_ERRFA',pic:''},{av:'AV38MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''},{av:'AV40MsgCtrl',fld:'vMSGCTRL',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ac_acaqui',iparms:[]");
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
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV32Abs1 = DecimalUtil.ZERO ;
      wcpOAV33HumSec = "" ;
      wcpOAV38MaqCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z118BarAcaQui = "" ;
      Z6033Ac_BarPar = "" ;
      Z6034Ac_Metros = DecimalUtil.ZERO ;
      Z6035Ac_Kilos = DecimalUtil.ZERO ;
      Z9839Ac_Abs = DecimalUtil.ZERO ;
      Z9840Ac_AcaQui = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A9839Ac_Abs = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A9840Ac_AcaQui = "" ;
      AV33HumSec = "" ;
      AV32Abs1 = DecimalUtil.ZERO ;
      AV36Msg_errfa = "" ;
      AV38MaqCod = "" ;
      AV40MsgCtrl = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode883 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV39MsgErr = "" ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T00TD6_A407EmprNom = new String[] {""} ;
      T00TD6_n407EmprNom = new boolean[] {false} ;
      T00TD7_A252CliCod = new int[1] ;
      T00TD7_n252CliCod = new boolean[] {false} ;
      T00TD7_A365DisDes = new String[] {""} ;
      T00TD8_A361DisCod = new int[1] ;
      T00TD8_A2759BarMaqGru = new String[] {""} ;
      T00TD8_A129BarCod = new int[1] ;
      T00TD8_A132BarCodReo = new byte[1] ;
      T00TD8_A130BarCodPar = new String[] {""} ;
      T00TD8_A180BarMaqCod = new String[] {""} ;
      T00TD8_A407EmprNom = new String[] {""} ;
      T00TD8_n407EmprNom = new boolean[] {false} ;
      T00TD8_A118BarAcaQui = new String[] {""} ;
      T00TD8_A252CliCod = new int[1] ;
      T00TD8_n252CliCod = new boolean[] {false} ;
      T00TD8_A365DisDes = new String[] {""} ;
      T00TD8_A396EmprCod = new String[] {""} ;
      T00TD9_A396EmprCod = new String[] {""} ;
      T00TD9_A129BarCod = new int[1] ;
      T00TD9_A132BarCodReo = new byte[1] ;
      T00TD9_A130BarCodPar = new String[] {""} ;
      T00TD5_A361DisCod = new int[1] ;
      T00TD5_A2759BarMaqGru = new String[] {""} ;
      T00TD5_A129BarCod = new int[1] ;
      T00TD5_A132BarCodReo = new byte[1] ;
      T00TD5_A130BarCodPar = new String[] {""} ;
      T00TD5_A180BarMaqCod = new String[] {""} ;
      T00TD5_A118BarAcaQui = new String[] {""} ;
      T00TD5_A396EmprCod = new String[] {""} ;
      T00TD5_A252CliCod = new int[1] ;
      T00TD5_n252CliCod = new boolean[] {false} ;
      T00TD5_A365DisDes = new String[] {""} ;
      T00TD10_A396EmprCod = new String[] {""} ;
      T00TD10_A129BarCod = new int[1] ;
      T00TD10_A132BarCodReo = new byte[1] ;
      T00TD10_A130BarCodPar = new String[] {""} ;
      T00TD11_A396EmprCod = new String[] {""} ;
      T00TD11_A129BarCod = new int[1] ;
      T00TD11_A132BarCodReo = new byte[1] ;
      T00TD11_A130BarCodPar = new String[] {""} ;
      T00TD4_A361DisCod = new int[1] ;
      T00TD4_A2759BarMaqGru = new String[] {""} ;
      T00TD4_A129BarCod = new int[1] ;
      T00TD4_A132BarCodReo = new byte[1] ;
      T00TD4_A130BarCodPar = new String[] {""} ;
      T00TD4_A180BarMaqCod = new String[] {""} ;
      T00TD4_A118BarAcaQui = new String[] {""} ;
      T00TD4_A396EmprCod = new String[] {""} ;
      T00TD4_A252CliCod = new int[1] ;
      T00TD4_n252CliCod = new boolean[] {false} ;
      T00TD4_A365DisDes = new String[] {""} ;
      T00TD16_A396EmprCod = new String[] {""} ;
      T00TD16_A129BarCod = new int[1] ;
      T00TD16_A132BarCodReo = new byte[1] ;
      T00TD16_A130BarCodPar = new String[] {""} ;
      T00TD17_A129BarCod = new int[1] ;
      T00TD17_A132BarCodReo = new byte[1] ;
      T00TD17_A130BarCodPar = new String[] {""} ;
      T00TD17_A6031Ac_Barcod = new int[1] ;
      T00TD17_A6032Ac_BarReo = new byte[1] ;
      T00TD17_A6033Ac_BarPar = new String[] {""} ;
      T00TD17_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD17_n6034Ac_Metros = new boolean[] {false} ;
      T00TD17_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD17_n6035Ac_Kilos = new boolean[] {false} ;
      T00TD17_A6036Ac_Pzs = new short[1] ;
      T00TD17_n6036Ac_Pzs = new boolean[] {false} ;
      T00TD17_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD17_n9839Ac_Abs = new boolean[] {false} ;
      T00TD17_A9840Ac_AcaQui = new String[] {""} ;
      T00TD17_n9840Ac_AcaQui = new boolean[] {false} ;
      T00TD17_A396EmprCod = new String[] {""} ;
      T00TD18_A396EmprCod = new String[] {""} ;
      T00TD18_A129BarCod = new int[1] ;
      T00TD18_A132BarCodReo = new byte[1] ;
      T00TD18_A130BarCodPar = new String[] {""} ;
      T00TD18_A6031Ac_Barcod = new int[1] ;
      T00TD18_A6032Ac_BarReo = new byte[1] ;
      T00TD18_A6033Ac_BarPar = new String[] {""} ;
      T00TD3_A129BarCod = new int[1] ;
      T00TD3_A132BarCodReo = new byte[1] ;
      T00TD3_A130BarCodPar = new String[] {""} ;
      T00TD3_A6031Ac_Barcod = new int[1] ;
      T00TD3_A6032Ac_BarReo = new byte[1] ;
      T00TD3_A6033Ac_BarPar = new String[] {""} ;
      T00TD3_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD3_n6034Ac_Metros = new boolean[] {false} ;
      T00TD3_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD3_n6035Ac_Kilos = new boolean[] {false} ;
      T00TD3_A6036Ac_Pzs = new short[1] ;
      T00TD3_n6036Ac_Pzs = new boolean[] {false} ;
      T00TD3_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD3_n9839Ac_Abs = new boolean[] {false} ;
      T00TD3_A9840Ac_AcaQui = new String[] {""} ;
      T00TD3_n9840Ac_AcaQui = new boolean[] {false} ;
      T00TD3_A396EmprCod = new String[] {""} ;
      T00TD2_A129BarCod = new int[1] ;
      T00TD2_A132BarCodReo = new byte[1] ;
      T00TD2_A130BarCodPar = new String[] {""} ;
      T00TD2_A6031Ac_Barcod = new int[1] ;
      T00TD2_A6032Ac_BarReo = new byte[1] ;
      T00TD2_A6033Ac_BarPar = new String[] {""} ;
      T00TD2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD2_n6034Ac_Metros = new boolean[] {false} ;
      T00TD2_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD2_n6035Ac_Kilos = new boolean[] {false} ;
      T00TD2_A6036Ac_Pzs = new short[1] ;
      T00TD2_n6036Ac_Pzs = new boolean[] {false} ;
      T00TD2_A9839Ac_Abs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00TD2_n9839Ac_Abs = new boolean[] {false} ;
      T00TD2_A9840Ac_AcaQui = new String[] {""} ;
      T00TD2_n9840Ac_AcaQui = new boolean[] {false} ;
      T00TD2_A396EmprCod = new String[] {""} ;
      T00TD22_A396EmprCod = new String[] {""} ;
      T00TD22_A129BarCod = new int[1] ;
      T00TD22_A132BarCodReo = new byte[1] ;
      T00TD22_A130BarCodPar = new String[] {""} ;
      T00TD22_A6031Ac_Barcod = new int[1] ;
      T00TD22_A6032Ac_BarReo = new byte[1] ;
      T00TD22_A6033Ac_BarPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00TD23_A407EmprNom = new String[] {""} ;
      T00TD23_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ118BarAcaQui = "" ;
      ZZ365DisDes = "" ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_char11 = new String[1] ;
      ZV33HumSec = "" ;
      ZV32Abs1 = DecimalUtil.ZERO ;
      ZV36Msg_errfa = "" ;
      ZV38MaqCod = "" ;
      ZV40MsgCtrl = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdraca__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdraca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdraca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdraca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdraca__default(),
         new Object[] {
             new Object[] {
            T00TD2_A129BarCod, T00TD2_A132BarCodReo, T00TD2_A130BarCodPar, T00TD2_A6031Ac_Barcod, T00TD2_A6032Ac_BarReo, T00TD2_A6033Ac_BarPar, T00TD2_A6034Ac_Metros, T00TD2_n6034Ac_Metros, T00TD2_A6035Ac_Kilos, T00TD2_n6035Ac_Kilos,
            T00TD2_A6036Ac_Pzs, T00TD2_n6036Ac_Pzs, T00TD2_A9839Ac_Abs, T00TD2_n9839Ac_Abs, T00TD2_A9840Ac_AcaQui, T00TD2_n9840Ac_AcaQui, T00TD2_A396EmprCod
            }
            , new Object[] {
            T00TD3_A129BarCod, T00TD3_A132BarCodReo, T00TD3_A130BarCodPar, T00TD3_A6031Ac_Barcod, T00TD3_A6032Ac_BarReo, T00TD3_A6033Ac_BarPar, T00TD3_A6034Ac_Metros, T00TD3_n6034Ac_Metros, T00TD3_A6035Ac_Kilos, T00TD3_n6035Ac_Kilos,
            T00TD3_A6036Ac_Pzs, T00TD3_n6036Ac_Pzs, T00TD3_A9839Ac_Abs, T00TD3_n9839Ac_Abs, T00TD3_A9840Ac_AcaQui, T00TD3_n9840Ac_AcaQui, T00TD3_A396EmprCod
            }
            , new Object[] {
            T00TD4_A361DisCod, T00TD4_A2759BarMaqGru, T00TD4_A129BarCod, T00TD4_A132BarCodReo, T00TD4_A130BarCodPar, T00TD4_A180BarMaqCod, T00TD4_A118BarAcaQui, T00TD4_A396EmprCod, T00TD4_A252CliCod, T00TD4_n252CliCod,
            T00TD4_A365DisDes
            }
            , new Object[] {
            T00TD5_A361DisCod, T00TD5_A2759BarMaqGru, T00TD5_A129BarCod, T00TD5_A132BarCodReo, T00TD5_A130BarCodPar, T00TD5_A180BarMaqCod, T00TD5_A118BarAcaQui, T00TD5_A396EmprCod, T00TD5_A252CliCod, T00TD5_n252CliCod,
            T00TD5_A365DisDes
            }
            , new Object[] {
            T00TD6_A407EmprNom, T00TD6_n407EmprNom
            }
            , new Object[] {
            T00TD7_A252CliCod, T00TD7_A365DisDes
            }
            , new Object[] {
            T00TD8_A361DisCod, T00TD8_A2759BarMaqGru, T00TD8_A129BarCod, T00TD8_A132BarCodReo, T00TD8_A130BarCodPar, T00TD8_A180BarMaqCod, T00TD8_A407EmprNom, T00TD8_n407EmprNom, T00TD8_A118BarAcaQui, T00TD8_A252CliCod,
            T00TD8_n252CliCod, T00TD8_A365DisDes, T00TD8_A396EmprCod
            }
            , new Object[] {
            T00TD9_A396EmprCod, T00TD9_A129BarCod, T00TD9_A132BarCodReo, T00TD9_A130BarCodPar
            }
            , new Object[] {
            T00TD10_A396EmprCod, T00TD10_A129BarCod, T00TD10_A132BarCodReo, T00TD10_A130BarCodPar
            }
            , new Object[] {
            T00TD11_A396EmprCod, T00TD11_A129BarCod, T00TD11_A132BarCodReo, T00TD11_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TD16_A396EmprCod, T00TD16_A129BarCod, T00TD16_A132BarCodReo, T00TD16_A130BarCodPar
            }
            , new Object[] {
            T00TD17_A129BarCod, T00TD17_A132BarCodReo, T00TD17_A130BarCodPar, T00TD17_A6031Ac_Barcod, T00TD17_A6032Ac_BarReo, T00TD17_A6033Ac_BarPar, T00TD17_A6034Ac_Metros, T00TD17_n6034Ac_Metros, T00TD17_A6035Ac_Kilos, T00TD17_n6035Ac_Kilos,
            T00TD17_A6036Ac_Pzs, T00TD17_n6036Ac_Pzs, T00TD17_A9839Ac_Abs, T00TD17_n9839Ac_Abs, T00TD17_A9840Ac_AcaQui, T00TD17_n9840Ac_AcaQui, T00TD17_A396EmprCod
            }
            , new Object[] {
            T00TD18_A396EmprCod, T00TD18_A129BarCod, T00TD18_A132BarCodReo, T00TD18_A130BarCodPar, T00TD18_A6031Ac_Barcod, T00TD18_A6032Ac_BarReo, T00TD18_A6033Ac_BarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TD22_A396EmprCod, T00TD22_A129BarCod, T00TD22_A132BarCodReo, T00TD22_A130BarCodPar, T00TD22_A6031Ac_Barcod, T00TD22_A6032Ac_BarReo, T00TD22_A6033Ac_BarPar
            }
            , new Object[] {
            T00TD23_A407EmprNom, T00TD23_n407EmprNom
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z6032Ac_BarReo ;
   private byte GxWebError ;
   private byte A6032Ac_BarReo ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte AV37Torient ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte GXv_int10[] ;
   private short Z6036Ac_Pzs ;
   private short nRcdDeleted_883 ;
   private short nRcdExists_883 ;
   private short nIsMod_883 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount883 ;
   private short RcdFound883 ;
   private short nBlankRcdUsr883 ;
   private short A6036Ac_Pzs ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_883 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z6031Ac_Barcod ;
   private int A6031Ac_Barcod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarAcaQui_Enabled ;
   private int edtavnRcdDeleted_883_Enabled ;
   private int edtAc_Barcod_Enabled ;
   private int edtAc_BarReo_Enabled ;
   private int edtAc_BarPar_Enabled ;
   private int edtAc_Metros_Enabled ;
   private int edtAc_Kilos_Enabled ;
   private int edtAc_Pzs_Enabled ;
   private int edtAc_Abs_Enabled ;
   private int edtAc_AcaQui_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GXv_int7[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAc_Kilos_Enabled ;
   private int defedtAc_Metros_Enabled ;
   private int defedtAc_BarPar_Enabled ;
   private int defedtAc_BarReo_Enabled ;
   private int defedtAc_Barcod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarAcaQui_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int GXv_int9[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV32Abs1 ;
   private java.math.BigDecimal Z6034Ac_Metros ;
   private java.math.BigDecimal Z6035Ac_Kilos ;
   private java.math.BigDecimal Z9839Ac_Abs ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A9839Ac_Abs ;
   private java.math.BigDecimal AV32Abs1 ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal ZV32Abs1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV33HumSec ;
   private String wcpOAV38MaqCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z118BarAcaQui ;
   private String Z6033Ac_BarPar ;
   private String Z9840Ac_AcaQui ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6033Ac_BarPar ;
   private String A118BarAcaQui ;
   private String A9840Ac_AcaQui ;
   private String AV33HumSec ;
   private String AV36Msg_errfa ;
   private String AV38MaqCod ;
   private String AV40MsgCtrl ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarAcaQui_Internalname ;
   private String sGXsfl_50_idx="0001" ;
   private String Gx_mode ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
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
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarAcaQui_Jsonclick ;
   private String sMode883 ;
   private String edtavnRcdDeleted_883_Internalname ;
   private String edtAc_Barcod_Internalname ;
   private String edtAc_BarReo_Internalname ;
   private String edtAc_BarPar_Internalname ;
   private String edtAc_Metros_Internalname ;
   private String edtAc_Kilos_Internalname ;
   private String edtAc_Pzs_Internalname ;
   private String edtAc_Abs_Internalname ;
   private String edtAc_AcaQui_Internalname ;
   private String subGrid1_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_check_Internalname ;
   private String bttBtn_check_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String bttBtn_help_Internalname ;
   private String bttBtn_help_Jsonclick ;
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV39MsgErr ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_883_Jsonclick ;
   private String edtAc_Barcod_Jsonclick ;
   private String edtAc_BarReo_Jsonclick ;
   private String edtAc_BarPar_Jsonclick ;
   private String edtAc_Metros_Jsonclick ;
   private String edtAc_Kilos_Jsonclick ;
   private String edtAc_Pzs_Jsonclick ;
   private String edtAc_Abs_Jsonclick ;
   private String edtAc_AcaQui_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ118BarAcaQui ;
   private String ZZ365DisDes ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private String ZV33HumSec ;
   private String ZV36Msg_errfa ;
   private String ZV38MaqCod ;
   private String ZV40MsgCtrl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private boolean n9839Ac_Abs ;
   private boolean n9840Ac_AcaQui ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n6036Ac_Pzs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00TD6_A407EmprNom ;
   private boolean[] T00TD6_n407EmprNom ;
   private int[] T00TD7_A252CliCod ;
   private boolean[] T00TD7_n252CliCod ;
   private String[] T00TD7_A365DisDes ;
   private int[] T00TD8_A361DisCod ;
   private String[] T00TD8_A2759BarMaqGru ;
   private int[] T00TD8_A129BarCod ;
   private byte[] T00TD8_A132BarCodReo ;
   private String[] T00TD8_A130BarCodPar ;
   private String[] T00TD8_A180BarMaqCod ;
   private String[] T00TD8_A407EmprNom ;
   private boolean[] T00TD8_n407EmprNom ;
   private String[] T00TD8_A118BarAcaQui ;
   private int[] T00TD8_A252CliCod ;
   private boolean[] T00TD8_n252CliCod ;
   private String[] T00TD8_A365DisDes ;
   private String[] T00TD8_A396EmprCod ;
   private String[] T00TD9_A396EmprCod ;
   private int[] T00TD9_A129BarCod ;
   private byte[] T00TD9_A132BarCodReo ;
   private String[] T00TD9_A130BarCodPar ;
   private int[] T00TD5_A361DisCod ;
   private String[] T00TD5_A2759BarMaqGru ;
   private int[] T00TD5_A129BarCod ;
   private byte[] T00TD5_A132BarCodReo ;
   private String[] T00TD5_A130BarCodPar ;
   private String[] T00TD5_A180BarMaqCod ;
   private String[] T00TD5_A118BarAcaQui ;
   private String[] T00TD5_A396EmprCod ;
   private int[] T00TD5_A252CliCod ;
   private boolean[] T00TD5_n252CliCod ;
   private String[] T00TD5_A365DisDes ;
   private String[] T00TD10_A396EmprCod ;
   private int[] T00TD10_A129BarCod ;
   private byte[] T00TD10_A132BarCodReo ;
   private String[] T00TD10_A130BarCodPar ;
   private String[] T00TD11_A396EmprCod ;
   private int[] T00TD11_A129BarCod ;
   private byte[] T00TD11_A132BarCodReo ;
   private String[] T00TD11_A130BarCodPar ;
   private int[] T00TD4_A361DisCod ;
   private String[] T00TD4_A2759BarMaqGru ;
   private int[] T00TD4_A129BarCod ;
   private byte[] T00TD4_A132BarCodReo ;
   private String[] T00TD4_A130BarCodPar ;
   private String[] T00TD4_A180BarMaqCod ;
   private String[] T00TD4_A118BarAcaQui ;
   private String[] T00TD4_A396EmprCod ;
   private int[] T00TD4_A252CliCod ;
   private boolean[] T00TD4_n252CliCod ;
   private String[] T00TD4_A365DisDes ;
   private String[] T00TD16_A396EmprCod ;
   private int[] T00TD16_A129BarCod ;
   private byte[] T00TD16_A132BarCodReo ;
   private String[] T00TD16_A130BarCodPar ;
   private int[] T00TD17_A129BarCod ;
   private byte[] T00TD17_A132BarCodReo ;
   private String[] T00TD17_A130BarCodPar ;
   private int[] T00TD17_A6031Ac_Barcod ;
   private byte[] T00TD17_A6032Ac_BarReo ;
   private String[] T00TD17_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T00TD17_A6034Ac_Metros ;
   private boolean[] T00TD17_n6034Ac_Metros ;
   private java.math.BigDecimal[] T00TD17_A6035Ac_Kilos ;
   private boolean[] T00TD17_n6035Ac_Kilos ;
   private short[] T00TD17_A6036Ac_Pzs ;
   private boolean[] T00TD17_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T00TD17_A9839Ac_Abs ;
   private boolean[] T00TD17_n9839Ac_Abs ;
   private String[] T00TD17_A9840Ac_AcaQui ;
   private boolean[] T00TD17_n9840Ac_AcaQui ;
   private String[] T00TD17_A396EmprCod ;
   private String[] T00TD18_A396EmprCod ;
   private int[] T00TD18_A129BarCod ;
   private byte[] T00TD18_A132BarCodReo ;
   private String[] T00TD18_A130BarCodPar ;
   private int[] T00TD18_A6031Ac_Barcod ;
   private byte[] T00TD18_A6032Ac_BarReo ;
   private String[] T00TD18_A6033Ac_BarPar ;
   private int[] T00TD3_A129BarCod ;
   private byte[] T00TD3_A132BarCodReo ;
   private String[] T00TD3_A130BarCodPar ;
   private int[] T00TD3_A6031Ac_Barcod ;
   private byte[] T00TD3_A6032Ac_BarReo ;
   private String[] T00TD3_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T00TD3_A6034Ac_Metros ;
   private boolean[] T00TD3_n6034Ac_Metros ;
   private java.math.BigDecimal[] T00TD3_A6035Ac_Kilos ;
   private boolean[] T00TD3_n6035Ac_Kilos ;
   private short[] T00TD3_A6036Ac_Pzs ;
   private boolean[] T00TD3_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T00TD3_A9839Ac_Abs ;
   private boolean[] T00TD3_n9839Ac_Abs ;
   private String[] T00TD3_A9840Ac_AcaQui ;
   private boolean[] T00TD3_n9840Ac_AcaQui ;
   private String[] T00TD3_A396EmprCod ;
   private int[] T00TD2_A129BarCod ;
   private byte[] T00TD2_A132BarCodReo ;
   private String[] T00TD2_A130BarCodPar ;
   private int[] T00TD2_A6031Ac_Barcod ;
   private byte[] T00TD2_A6032Ac_BarReo ;
   private String[] T00TD2_A6033Ac_BarPar ;
   private java.math.BigDecimal[] T00TD2_A6034Ac_Metros ;
   private boolean[] T00TD2_n6034Ac_Metros ;
   private java.math.BigDecimal[] T00TD2_A6035Ac_Kilos ;
   private boolean[] T00TD2_n6035Ac_Kilos ;
   private short[] T00TD2_A6036Ac_Pzs ;
   private boolean[] T00TD2_n6036Ac_Pzs ;
   private java.math.BigDecimal[] T00TD2_A9839Ac_Abs ;
   private boolean[] T00TD2_n9839Ac_Abs ;
   private String[] T00TD2_A9840Ac_AcaQui ;
   private boolean[] T00TD2_n9840Ac_AcaQui ;
   private String[] T00TD2_A396EmprCod ;
   private String[] T00TD22_A396EmprCod ;
   private int[] T00TD22_A129BarCod ;
   private byte[] T00TD22_A132BarCodReo ;
   private String[] T00TD22_A130BarCodPar ;
   private int[] T00TD22_A6031Ac_Barcod ;
   private byte[] T00TD22_A6032Ac_BarReo ;
   private String[] T00TD22_A6033Ac_BarPar ;
   private String[] T00TD23_A407EmprNom ;
   private boolean[] T00TD23_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdraca__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdraca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdraca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdraca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdraca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00TD2", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?  FOR UPDATE OF Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TD3", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TD4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarAcaQui, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD7", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD8", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.BarAcaQui, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TD12", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarAcaQui, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00TD13", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarAcaQui=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00TD14", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T00TD15", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T00TD16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TD17", "SELECT BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TD18", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00TD19", "INSERT INTO TXPHDRACA(BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros, Ac_Kilos, Ac_Pzs, Ac_Abs, Ac_AcaQui, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T00TD20", "UPDATE TXPHDRACA SET Ac_Metros=?, Ac_Kilos=?, Ac_Pzs=?, Ac_Abs=?, Ac_AcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new UpdateCursor("T00TD21", "DELETE FROM TXPHDRACA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK, "TXPHDRACA")
         ,new ForEachCursor("T00TD22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TD23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 21 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[10]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 6);
               }
               stmt.setString(12, (String)parms[16], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               stmt.setString(12, (String)parms[16], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

