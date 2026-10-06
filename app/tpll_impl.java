package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpll_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_Z61045( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"vPLLNRO") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapllnroZ61045( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"vCLINOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7435PLLCliCod = (int)(GXutil.lval( httpContext.GetPar( "PLLCliCod"))) ;
         n7435PLLCliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaclinomZ61045( A396EmprCod, A7435PLLCliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pedidos Lindalana", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPLLNro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tpll_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpll_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpll_impl.class ));
   }

   public tpll_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPLLTip = new HTMLChoice();
      chkPLLCum = UIFactory.getCheckbox(this);
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
      if ( cmbPLLTip.getItemCount() > 0 )
      {
         A7440PLLTip = cmbPLLTip.getValidValue(A7440PLLTip) ;
         n7440PLLTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLLTip.setValue( GXutil.rtrim( A7440PLLTip) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Values", cmbPLLTip.ToJavascriptSource(), true);
      }
      A7441PLLCum = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7441PLLCum, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7441PLLCum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPLL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nro de Pedido", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLNro_Internalname, GXutil.ltrim( localUtil.ntoc( A7434PLLNro, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPLLNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7434PLLNro), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7434PLLNro), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLNro_Jsonclick, 0, "", "", "", "", "", 1, edtPLLNro_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7435PLLCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPLLCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7435PLLCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7435PLLCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtPLLCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha de Pedido", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPLLFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLFch_Internalname, localUtil.format(A7436PLLFch, "99/99/99"), localUtil.format( A7436PLLFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLFch_Jsonclick, 0, "", "", "", "", "", 1, edtPLLFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPLLFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPLLFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPLL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nro Pedido Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLNroCli_Internalname, GXutil.rtrim( A7438PLLNroCli), GXutil.rtrim( localUtil.format( A7438PLLNroCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLNroCli_Jsonclick, 0, "", "", "", "", "", 1, edtPLLNroCli_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fecha Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPLLFchCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLFchCli_Internalname, localUtil.format(A7439PLLFchCli, "99/99/99"), localUtil.format( A7439PLLFchCli, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLFchCli_Jsonclick, 0, "", "", "", "", "", 1, edtPLLFchCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPLLFchCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPLLFchCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPLL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPLLFchEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLFchEnt_Internalname, localUtil.format(A7827PLLFchEnt, "99/99/99"), localUtil.format( A7827PLLFchEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLFchEnt_Jsonclick, 0, "", "", "", "", "", 1, edtPLLFchEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPLLFchEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPLLFchEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPLL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo de Pedido", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPLLTip, cmbPLLTip.getInternalname(), GXutil.rtrim( A7440PLLTip), 1, cmbPLLTip.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPLLTip.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TPLL.htm");
      cmbPLLTip.setValue( GXutil.rtrim( A7440PLLTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Values", cmbPLLTip.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPLLCum.getInternalname(), GXutil.str( A7441PLLCum, 1, 0), "", "", 1, chkPLLCum.getEnabled(), "1", httpContext.getMessage( "Cumplimentado", ""), StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ult. línea del pedido", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPLLUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A7442PLLUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPLLUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7442PLLUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7442PLLUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPLLUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtPLLUltLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPLL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPLL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPLL.htm");
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
      e11Z62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z7434PLLNro = (int)(localUtil.ctol( httpContext.cgiGet( "Z7434PLLNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7435PLLCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z7435PLLCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7436PLLFch = localUtil.ctod( httpContext.cgiGet( "Z7436PLLFch"), 0) ;
            Z7438PLLNroCli = httpContext.cgiGet( "Z7438PLLNroCli") ;
            Z7439PLLFchCli = localUtil.ctod( httpContext.cgiGet( "Z7439PLLFchCli"), 0) ;
            Z7827PLLFchEnt = localUtil.ctod( httpContext.cgiGet( "Z7827PLLFchEnt"), 0) ;
            Z7440PLLTip = httpContext.cgiGet( "Z7440PLLTip") ;
            Z7441PLLCum = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7441PLLCum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7442PLLUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z7442PLLUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV34CliNom = httpContext.cgiGet( "CLINOM") ;
            AV35PLLNro = (int)(localUtil.ctol( httpContext.cgiGet( "vPLLNRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34CliNom = httpContext.cgiGet( "vCLINOM") ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPLLNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPLLNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PLLNRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPLLNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7434PLLNro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
            }
            else
            {
               A7434PLLNro = (int)(localUtil.ctol( httpContext.cgiGet( edtPLLNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
            }
            A7435PLLCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPLLCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7435PLLCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
            A7436PLLFch = localUtil.ctod( httpContext.cgiGet( edtPLLFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7436PLLFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
            A7438PLLNroCli = httpContext.cgiGet( edtPLLNroCli_Internalname) ;
            n7438PLLNroCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", A7438PLLNroCli);
            A7439PLLFchCli = localUtil.ctod( httpContext.cgiGet( edtPLLFchCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7439PLLFchCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
            A7827PLLFchEnt = localUtil.ctod( httpContext.cgiGet( edtPLLFchEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7827PLLFchEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
            cmbPLLTip.setValue( httpContext.cgiGet( cmbPLLTip.getInternalname()) );
            A7440PLLTip = httpContext.cgiGet( cmbPLLTip.getInternalname()) ;
            n7440PLLTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
            A7441PLLCum = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPLLCum.getInternalname()), "1")==0) ? 1 : 0)) ;
            n7441PLLCum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
            A7442PLLUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPLLUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7442PLLUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7442PLLUltLin), 3, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPLL");
            A7435PLLCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPLLCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7435PLLCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
            forbiddenHiddens.add("PLLCliCod", localUtil.format( DecimalUtil.doubleToDec(A7435PLLCliCod), "ZZZZZ9"));
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( AV34CliNom, "")));
            A7436PLLFch = localUtil.ctod( httpContext.cgiGet( edtPLLFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7436PLLFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
            forbiddenHiddens.add("PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
            A7438PLLNroCli = httpContext.cgiGet( edtPLLNroCli_Internalname) ;
            n7438PLLNroCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", A7438PLLNroCli);
            forbiddenHiddens.add("PLLNroCli", GXutil.rtrim( localUtil.format( A7438PLLNroCli, "")));
            A7439PLLFchCli = localUtil.ctod( httpContext.cgiGet( edtPLLFchCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7439PLLFchCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
            forbiddenHiddens.add("PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
            A7827PLLFchEnt = localUtil.ctod( httpContext.cgiGet( edtPLLFchEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n7827PLLFchEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
            forbiddenHiddens.add("PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
            A7440PLLTip = httpContext.cgiGet( cmbPLLTip.getInternalname()) ;
            n7440PLLTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
            forbiddenHiddens.add("PLLTip", GXutil.rtrim( localUtil.format( A7440PLLTip, "")));
            A7441PLLCum = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPLLCum.getInternalname()), "1")==0) ? 1 : 0)) ;
            n7441PLLCum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
            forbiddenHiddens.add("PLLCum", localUtil.format( DecimalUtil.doubleToDec(A7441PLLCum), "9"));
            A7442PLLUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPLLUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7442PLLUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7442PLLUltLin), 3, 0));
            forbiddenHiddens.add("PLLUltLin", localUtil.format( DecimalUtil.doubleToDec(A7442PLLUltLin), "ZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A7434PLLNro != Z7434PLLNro ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpll:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A7434PLLNro = (int)(GXutil.lval( httpContext.GetPar( "PLLNro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
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
                        e11Z62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'LINEAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Lineas' */
                        e12Z62 ();
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
            initAllZ61045( ) ;
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
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributesZ61045( ) ;
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

   public void confirm_Z60( )
   {
      beforeValidateZ61045( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsZ61045( ) ;
         }
         else
         {
            checkExtendedTableZ61045( ) ;
            if ( AnyError == 0 )
            {
               zmZ61045( 17) ;
            }
            closeExtendedTableCursorsZ61045( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesZ60( ) ;
      }
   }

   public void resetCaptionZ60( )
   {
   }

   public void e11Z62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpll_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tpll_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpll_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpll_impl.this.A396EmprCod = GXv_char2[0] ;
      tpll_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpll_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e12Z62( )
   {
      /* 'Lineas' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) != 0 )
      {
      }
      /*  Sending Event outputs  */
   }

   public void zmZ61045( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7435PLLCliCod = T00Z63_A7435PLLCliCod[0] ;
            Z7436PLLFch = T00Z63_A7436PLLFch[0] ;
            Z7438PLLNroCli = T00Z63_A7438PLLNroCli[0] ;
            Z7439PLLFchCli = T00Z63_A7439PLLFchCli[0] ;
            Z7827PLLFchEnt = T00Z63_A7827PLLFchEnt[0] ;
            Z7440PLLTip = T00Z63_A7440PLLTip[0] ;
            Z7441PLLCum = T00Z63_A7441PLLCum[0] ;
            Z7442PLLUltLin = T00Z63_A7442PLLUltLin[0] ;
         }
         else
         {
            Z7435PLLCliCod = A7435PLLCliCod ;
            Z7436PLLFch = A7436PLLFch ;
            Z7438PLLNroCli = A7438PLLNroCli ;
            Z7439PLLFchCli = A7439PLLFchCli ;
            Z7827PLLFchEnt = A7827PLLFchEnt ;
            Z7440PLLTip = A7440PLLTip ;
            Z7441PLLCum = A7441PLLCum ;
            Z7442PLLUltLin = A7442PLLUltLin ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z7434PLLNro = A7434PLLNro ;
         Z7435PLLCliCod = A7435PLLCliCod ;
         Z7436PLLFch = A7436PLLFch ;
         Z7438PLLNroCli = A7438PLLNroCli ;
         Z7439PLLFchCli = A7439PLLFchCli ;
         Z7827PLLFchEnt = A7827PLLFchEnt ;
         Z7440PLLTip = A7440PLLTip ;
         Z7441PLLCum = A7441PLLCum ;
         Z7442PLLUltLin = A7442PLLUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPLLCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLCliCod_Enabled), 5, 0), true);
      edtPLLFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFch_Enabled), 5, 0), true);
      edtPLLNroCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLNroCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLNroCli_Enabled), 5, 0), true);
      edtPLLFchCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchCli_Enabled), 5, 0), true);
      edtPLLFchEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchEnt_Enabled), 5, 0), true);
      cmbPLLTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPLLTip.getEnabled(), 5, 0), true);
      chkPLLCum.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPLLCum.getInternalname(), "Enabled", GXutil.ltrimstr( chkPLLCum.getEnabled(), 5, 0), true);
      edtPLLUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLUltLin_Enabled), 5, 0), true);
      AV37Pgmname = "TPLL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      edtPLLCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLCliCod_Enabled), 5, 0), true);
      edtPLLFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFch_Enabled), 5, 0), true);
      edtPLLNroCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLNroCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLNroCli_Enabled), 5, 0), true);
      edtPLLFchCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchCli_Enabled), 5, 0), true);
      edtPLLFchEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchEnt_Enabled), 5, 0), true);
      cmbPLLTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPLLTip.getEnabled(), 5, 0), true);
      chkPLLCum.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPLLCum.getInternalname(), "Enabled", GXutil.ltrimstr( chkPLLCum.getEnabled(), 5, 0), true);
      edtPLLUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLUltLin_Enabled), 5, 0), true);
      /* Using cursor T00Z64 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00Z64_A407EmprNom[0] ;
      n407EmprNom = T00Z64_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden crear pedidos.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden eliminar pedidos.", ""), 1, "");
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
      GXt_char1 = AV34CliNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7435PLLCliCod, GXv_char4) ;
      tpll_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34CliNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CliNom", AV34CliNom);
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

   public void loadZ61045( )
   {
      /* Using cursor T00Z65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1045 = (short)(1) ;
         A407EmprNom = T00Z65_A407EmprNom[0] ;
         n407EmprNom = T00Z65_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7435PLLCliCod = T00Z65_A7435PLLCliCod[0] ;
         n7435PLLCliCod = T00Z65_n7435PLLCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
         A7436PLLFch = T00Z65_A7436PLLFch[0] ;
         n7436PLLFch = T00Z65_n7436PLLFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
         A7438PLLNroCli = T00Z65_A7438PLLNroCli[0] ;
         n7438PLLNroCli = T00Z65_n7438PLLNroCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", A7438PLLNroCli);
         A7439PLLFchCli = T00Z65_A7439PLLFchCli[0] ;
         n7439PLLFchCli = T00Z65_n7439PLLFchCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
         A7827PLLFchEnt = T00Z65_A7827PLLFchEnt[0] ;
         n7827PLLFchEnt = T00Z65_n7827PLLFchEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
         A7440PLLTip = T00Z65_A7440PLLTip[0] ;
         n7440PLLTip = T00Z65_n7440PLLTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
         A7441PLLCum = T00Z65_A7441PLLCum[0] ;
         n7441PLLCum = T00Z65_n7441PLLCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
         A7442PLLUltLin = T00Z65_A7442PLLUltLin[0] ;
         n7442PLLUltLin = T00Z65_n7442PLLUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7442PLLUltLin), 3, 0));
         zmZ61045( -16) ;
      }
      pr_default.close(3);
      onLoadActionsZ61045( ) ;
   }

   public void onLoadActionsZ61045( )
   {
   }

   public void checkExtendedTableZ61045( )
   {
      nIsDirty_1045 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsZ61045( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyZ61045( )
   {
      /* Using cursor T00Z66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1045 = (short)(1) ;
      }
      else
      {
         RcdFound1045 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00Z63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00Z63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmZ61045( 16) ;
         RcdFound1045 = (short)(1) ;
         A7434PLLNro = T00Z63_A7434PLLNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
         A7435PLLCliCod = T00Z63_A7435PLLCliCod[0] ;
         n7435PLLCliCod = T00Z63_n7435PLLCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
         A7436PLLFch = T00Z63_A7436PLLFch[0] ;
         n7436PLLFch = T00Z63_n7436PLLFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
         A7438PLLNroCli = T00Z63_A7438PLLNroCli[0] ;
         n7438PLLNroCli = T00Z63_n7438PLLNroCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", A7438PLLNroCli);
         A7439PLLFchCli = T00Z63_A7439PLLFchCli[0] ;
         n7439PLLFchCli = T00Z63_n7439PLLFchCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
         A7827PLLFchEnt = T00Z63_A7827PLLFchEnt[0] ;
         n7827PLLFchEnt = T00Z63_n7827PLLFchEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
         A7440PLLTip = T00Z63_A7440PLLTip[0] ;
         n7440PLLTip = T00Z63_n7440PLLTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
         A7441PLLCum = T00Z63_A7441PLLCum[0] ;
         n7441PLLCum = T00Z63_n7441PLLCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
         A7442PLLUltLin = T00Z63_A7442PLLUltLin[0] ;
         n7442PLLUltLin = T00Z63_n7442PLLUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7442PLLUltLin), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z7434PLLNro = A7434PLLNro ;
         sMode1045 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadZ61045( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1045 = (short)(0) ;
            initializeNonKeyZ61045( ) ;
         }
         Gx_mode = sMode1045 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1045 = (short)(0) ;
         initializeNonKeyZ61045( ) ;
         sMode1045 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1045 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyZ61045( ) ;
      if ( RcdFound1045 == 0 )
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
      RcdFound1045 = (short)(0) ;
      /* Using cursor T00Z67 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A7434PLLNro), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00Z67_A7434PLLNro[0] < A7434PLLNro ) ) && ( GXutil.strcmp(T00Z67_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00Z67_A7434PLLNro[0] > A7434PLLNro ) ) && ( GXutil.strcmp(T00Z67_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7434PLLNro = T00Z67_A7434PLLNro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
            RcdFound1045 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1045 = (short)(0) ;
      /* Using cursor T00Z68 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A7434PLLNro), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00Z68_A7434PLLNro[0] > A7434PLLNro ) ) && ( GXutil.strcmp(T00Z68_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00Z68_A7434PLLNro[0] < A7434PLLNro ) ) && ( GXutil.strcmp(T00Z68_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7434PLLNro = T00Z68_A7434PLLNro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
            RcdFound1045 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyZ61045( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPLLNro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertZ61045( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1045 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7434PLLNro != Z7434PLLNro ) )
            {
               A7434PLLNro = Z7434PLLNro ;
               httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPLLNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateZ61045( ) ;
               GX_FocusControl = edtPLLNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7434PLLNro != Z7434PLLNro ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPLLNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertZ61045( ) ;
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
                  GX_FocusControl = edtPLLNro_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertZ61045( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7434PLLNro != Z7434PLLNro ) )
      {
         A7434PLLNro = Z7434PLLNro ;
         httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPLLNro_Internalname ;
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
      getKeyZ61045( ) ;
      if ( RcdFound1045 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7434PLLNro != Z7434PLLNro ) )
         {
            A7434PLLNro = Z7434PLLNro ;
            httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7434PLLNro != Z7434PLLNro ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpll");
   }

   public void insert_check( )
   {
      confirm_Z60( ) ;
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
      if ( RcdFound1045 == 0 )
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
      scanStartZ61045( ) ;
      if ( RcdFound1045 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndZ61045( ) ;
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
      if ( RcdFound1045 == 0 )
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
      if ( RcdFound1045 == 0 )
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
      scanStartZ61045( ) ;
      if ( RcdFound1045 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1045 != 0 )
         {
            scanNextZ61045( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndZ61045( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyZ61045( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00Z62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z7435PLLCliCod != T00Z62_A7435PLLCliCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z7436PLLFch), GXutil.resetTime(T00Z62_A7436PLLFch[0])) ) || ( GXutil.strcmp(Z7438PLLNroCli, T00Z62_A7438PLLNroCli[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z7439PLLFchCli), GXutil.resetTime(T00Z62_A7439PLLFchCli[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z7827PLLFchEnt), GXutil.resetTime(T00Z62_A7827PLLFchEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7440PLLTip, T00Z62_A7440PLLTip[0]) != 0 ) || ( Z7441PLLCum != T00Z62_A7441PLLCum[0] ) || ( Z7442PLLUltLin != T00Z62_A7442PLLUltLin[0] ) )
         {
            if ( Z7435PLLCliCod != T00Z62_A7435PLLCliCod[0] )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLCliCod");
               GXutil.writeLogRaw("Old: ",Z7435PLLCliCod);
               GXutil.writeLogRaw("Current: ",T00Z62_A7435PLLCliCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7436PLLFch), GXutil.resetTime(T00Z62_A7436PLLFch[0])) ) )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLFch");
               GXutil.writeLogRaw("Old: ",Z7436PLLFch);
               GXutil.writeLogRaw("Current: ",T00Z62_A7436PLLFch[0]);
            }
            if ( GXutil.strcmp(Z7438PLLNroCli, T00Z62_A7438PLLNroCli[0]) != 0 )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLNroCli");
               GXutil.writeLogRaw("Old: ",Z7438PLLNroCli);
               GXutil.writeLogRaw("Current: ",T00Z62_A7438PLLNroCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7439PLLFchCli), GXutil.resetTime(T00Z62_A7439PLLFchCli[0])) ) )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLFchCli");
               GXutil.writeLogRaw("Old: ",Z7439PLLFchCli);
               GXutil.writeLogRaw("Current: ",T00Z62_A7439PLLFchCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7827PLLFchEnt), GXutil.resetTime(T00Z62_A7827PLLFchEnt[0])) ) )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLFchEnt");
               GXutil.writeLogRaw("Old: ",Z7827PLLFchEnt);
               GXutil.writeLogRaw("Current: ",T00Z62_A7827PLLFchEnt[0]);
            }
            if ( GXutil.strcmp(Z7440PLLTip, T00Z62_A7440PLLTip[0]) != 0 )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLTip");
               GXutil.writeLogRaw("Old: ",Z7440PLLTip);
               GXutil.writeLogRaw("Current: ",T00Z62_A7440PLLTip[0]);
            }
            if ( Z7441PLLCum != T00Z62_A7441PLLCum[0] )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLCum");
               GXutil.writeLogRaw("Old: ",Z7441PLLCum);
               GXutil.writeLogRaw("Current: ",T00Z62_A7441PLLCum[0]);
            }
            if ( Z7442PLLUltLin != T00Z62_A7442PLLUltLin[0] )
            {
               GXutil.writeLogln("tpll:[seudo value changed for attri]"+"PLLUltLin");
               GXutil.writeLogRaw("Old: ",Z7442PLLUltLin);
               GXutil.writeLogRaw("Current: ",T00Z62_A7442PLLUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPLL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZ61045( )
   {
      beforeValidateZ61045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ61045( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZ61045( 0) ;
         checkOptimisticConcurrencyZ61045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZ61045( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZ61045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Z69 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A7434PLLNro), Boolean.valueOf(n7435PLLCliCod), Integer.valueOf(A7435PLLCliCod), Boolean.valueOf(n7436PLLFch), A7436PLLFch, Boolean.valueOf(n7438PLLNroCli), A7438PLLNroCli, Boolean.valueOf(n7439PLLFchCli), A7439PLLFchCli, Boolean.valueOf(n7827PLLFchEnt), A7827PLLFchEnt, Boolean.valueOf(n7440PLLTip), A7440PLLTip, Boolean.valueOf(n7441PLLCum), Byte.valueOf(A7441PLLCum), Boolean.valueOf(n7442PLLUltLin), Short.valueOf(A7442PLLUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLL");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaptionZ60( ) ;
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
            loadZ61045( ) ;
         }
         endLevelZ61045( ) ;
      }
      closeExtendedTableCursorsZ61045( ) ;
   }

   public void updateZ61045( )
   {
      beforeValidateZ61045( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ61045( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZ61045( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZ61045( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateZ61045( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Z610 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n7435PLLCliCod), Integer.valueOf(A7435PLLCliCod), Boolean.valueOf(n7436PLLFch), A7436PLLFch, Boolean.valueOf(n7438PLLNroCli), A7438PLLNroCli, Boolean.valueOf(n7439PLLFchCli), A7439PLLFchCli, Boolean.valueOf(n7827PLLFchEnt), A7827PLLFchEnt, Boolean.valueOf(n7440PLLTip), A7440PLLTip, Boolean.valueOf(n7441PLLCum), Byte.valueOf(A7441PLLCum), Boolean.valueOf(n7442PLLUltLin), Short.valueOf(A7442PLLUltLin), A396EmprCod, Integer.valueOf(A7434PLLNro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLL");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPLL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateZ61045( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionZ60( ) ;
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
         endLevelZ61045( ) ;
      }
      closeExtendedTableCursorsZ61045( ) ;
   }

   public void deferredUpdateZ61045( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZ61045( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZ61045( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZ61045( ) ;
         afterConfirmZ61045( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZ61045( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00Z611 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLL");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1045 == 0 )
                     {
                        initAllZ61045( ) ;
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
                     resetCaptionZ60( ) ;
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
      sMode1045 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZ61045( ) ;
      Gx_mode = sMode1045 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZ61045( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelZ61045( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteZ61045( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpll");
         if ( AnyError == 0 )
         {
            confirmValuesZ60( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ && isIns( )  )
         {
            httpContext.wjLoc = formatLink("app.tpll1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7434PLLNro,8,0))}, new String[] {"EmprCod","PLLNro"})  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpll");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZ61045( )
   {
      /* Scan By routine */
      /* Using cursor T00Z612 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1045 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1045 = (short)(1) ;
         A7434PLLNro = T00Z612_A7434PLLNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZ61045( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1045 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1045 = (short)(1) ;
         A7434PLLNro = T00Z612_A7434PLLNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
      }
   }

   public void scanEndZ61045( )
   {
      pr_default.close(10);
   }

   public void afterConfirmZ61045( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int5 = AV35PLLNro ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "PLLNRO", ""), ""), GXv_int6) ;
         tpll_impl.this.GXt_int5 = GXv_int6[0] ;
         AV35PLLNro = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PLLNro), 8, 0));
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         A7434PLLNro = AV35PLLNro ;
         httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
      }
   }

   public void beforeInsertZ61045( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZ61045( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZ61045( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZ61045( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZ61045( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZ61045( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPLLNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLNro_Enabled), 5, 0), true);
      edtPLLCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLCliCod_Enabled), 5, 0), true);
      edtPLLFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFch_Enabled), 5, 0), true);
      edtPLLNroCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLNroCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLNroCli_Enabled), 5, 0), true);
      edtPLLFchCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchCli_Enabled), 5, 0), true);
      edtPLLFchEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLFchEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLFchEnt_Enabled), 5, 0), true);
      cmbPLLTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPLLTip.getEnabled(), 5, 0), true);
      chkPLLCum.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPLLCum.getInternalname(), "Enabled", GXutil.ltrimstr( chkPLLCum.getEnabled(), 5, 0), true);
      edtPLLUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPLLUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPLLUltLin_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesZ61045( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesZ60( )
   {
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
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpll", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPLL");
      forbiddenHiddens.add("PLLCliCod", localUtil.format( DecimalUtil.doubleToDec(A7435PLLCliCod), "ZZZZZ9"));
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( AV34CliNom, "")));
      forbiddenHiddens.add("PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
      forbiddenHiddens.add("PLLNroCli", GXutil.rtrim( localUtil.format( A7438PLLNroCli, "")));
      forbiddenHiddens.add("PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
      forbiddenHiddens.add("PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
      forbiddenHiddens.add("PLLTip", GXutil.rtrim( localUtil.format( A7440PLLTip, "")));
      A7441PLLCum = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7441PLLCum, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7441PLLCum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
      forbiddenHiddens.add("PLLCum", localUtil.format( DecimalUtil.doubleToDec(A7441PLLCum), "9"));
      forbiddenHiddens.add("PLLUltLin", localUtil.format( DecimalUtil.doubleToDec(A7442PLLUltLin), "ZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpll:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7434PLLNro", GXutil.ltrim( localUtil.ntoc( Z7434PLLNro, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7435PLLCliCod", GXutil.ltrim( localUtil.ntoc( Z7435PLLCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7436PLLFch", localUtil.dtoc( Z7436PLLFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7438PLLNroCli", GXutil.rtrim( Z7438PLLNroCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7439PLLFchCli", localUtil.dtoc( Z7439PLLFchCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7827PLLFchEnt", localUtil.dtoc( Z7827PLLFchEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7440PLLTip", GXutil.rtrim( Z7440PLLTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7441PLLCum", GXutil.ltrim( localUtil.ntoc( Z7441PLLCum, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7442PLLUltLin", GXutil.ltrim( localUtil.ntoc( Z7442PLLUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( AV34CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLLNRO", GXutil.ltrim( localUtil.ntoc( AV35PLLNro, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV34CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
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
      return formatLink("app.tpll", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPLL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pedidos Lindalana", "") ;
   }

   public void initializeNonKeyZ61045( )
   {
      AV35PLLNro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PLLNro), 8, 0));
      AV34CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CliNom", AV34CliNom);
      A7435PLLCliCod = 0 ;
      n7435PLLCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7435PLLCliCod), 6, 0));
      A7436PLLFch = GXutil.nullDate() ;
      n7436PLLFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
      A7438PLLNroCli = "" ;
      n7438PLLNroCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", A7438PLLNroCli);
      A7439PLLFchCli = GXutil.nullDate() ;
      n7439PLLFchCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
      A7827PLLFchEnt = GXutil.nullDate() ;
      n7827PLLFchEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
      A7440PLLTip = "" ;
      n7440PLLTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
      A7441PLLCum = (byte)(0) ;
      n7441PLLCum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
      A7442PLLUltLin = (short)(0) ;
      n7442PLLUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7442PLLUltLin), 3, 0));
      Z7435PLLCliCod = 0 ;
      Z7436PLLFch = GXutil.nullDate() ;
      Z7438PLLNroCli = "" ;
      Z7439PLLFchCli = GXutil.nullDate() ;
      Z7827PLLFchEnt = GXutil.nullDate() ;
      Z7440PLLTip = "" ;
      Z7441PLLCum = (byte)(0) ;
      Z7442PLLUltLin = (short)(0) ;
   }

   public void initAllZ61045( )
   {
      A7434PLLNro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7434PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7434PLLNro), 8, 0));
      initializeNonKeyZ61045( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532388", true, true);
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
      httpContext.AddJavascriptSource("tpll.js", "?20268241532388", false, true);
      /* End function include_jscripts */
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPLLNro_Internalname = "PLLNRO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPLLCliCod_Internalname = "PLLCLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPLLFch_Internalname = "PLLFCH" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPLLNroCli_Internalname = "PLLNROCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPLLFchCli_Internalname = "PLLFCHCLI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPLLFchEnt_Internalname = "PLLFCHENT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      cmbPLLTip.setInternalname( "PLLTIP" );
      chkPLLCum.setInternalname( "PLLCUM" );
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPLLUltLin_Internalname = "PLLULTLIN" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
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
      Form.setCaption( httpContext.getMessage( "Pedidos Lindalana", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPLLUltLin_Jsonclick = "" ;
      edtPLLUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtPLLUltLin_Enabled = 0 ;
      chkPLLCum.setIBackground( (int)(0xFFFFFF) );
      chkPLLCum.setEnabled( 0 );
      cmbPLLTip.setJsonclick( "" );
      cmbPLLTip.setEnabled( 0 );
      cmbPLLTip.setIBackground( (int)(0xFFFFFF) );
      edtPLLFchEnt_Jsonclick = "" ;
      edtPLLFchEnt_Backcolor = (int)(0xFFFFFF) ;
      edtPLLFchEnt_Enabled = 0 ;
      edtPLLFchCli_Jsonclick = "" ;
      edtPLLFchCli_Backcolor = (int)(0xFFFFFF) ;
      edtPLLFchCli_Enabled = 0 ;
      edtPLLNroCli_Jsonclick = "" ;
      edtPLLNroCli_Backcolor = (int)(0xFFFFFF) ;
      edtPLLNroCli_Enabled = 0 ;
      edtPLLFch_Jsonclick = "" ;
      edtPLLFch_Backcolor = (int)(0xFFFFFF) ;
      edtPLLFch_Enabled = 0 ;
      edtPLLCliCod_Jsonclick = "" ;
      edtPLLCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtPLLCliCod_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPLLNro_Jsonclick = "" ;
      edtPLLNro_Backcolor = (int)(0xFFFFFF) ;
      edtPLLNro_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gx1asapllnroZ61045( String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXt_int5 = AV35PLLNro ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "PLLNRO", ""), ""), GXv_int6) ;
         tpll_impl.this.GXt_int5 = GXv_int6[0] ;
         AV35PLLNro = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PLLNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35PLLNro), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35PLLNro, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asaclinomZ61045( String A396EmprCod ,
                                   int A7435PLLCliCod )
   {
      GXt_char1 = AV34CliNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7435PLLCliCod, GXv_char4) ;
      tpll_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34CliNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34CliNom", AV34CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34CliNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_12_Z61045( )
   {
      if ( true /* After */ && isIns( )  )
      {
         httpContext.wjLoc = formatLink("app.tpll1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7434PLLNro,8,0))}, new String[] {"EmprCod","PLLNro"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      cmbPLLTip.setName( "PLLTIP" );
      cmbPLLTip.setWebtags( "" );
      cmbPLLTip.addItem("E", httpContext.getMessage( "Estampado", ""), (short)(0));
      cmbPLLTip.addItem("T", httpContext.getMessage( "Teñido", ""), (short)(0));
      if ( cmbPLLTip.getItemCount() > 0 )
      {
         A7440PLLTip = cmbPLLTip.getValidValue(A7440PLLTip) ;
         n7440PLLTip = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", A7440PLLTip);
      }
      chkPLLCum.setName( "PLLCUM" );
      chkPLLCum.setWebtags( "" );
      chkPLLCum.setCaption( httpContext.getMessage( "Cumplimentado", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkPLLCum.getInternalname(), "TitleCaption", chkPLLCum.getCaption(), true);
      chkPLLCum.setCheckedValue( "0" );
      A7441PLLCum = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7441PLLCum, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7441PLLCum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.str( A7441PLLCum, 1, 0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00Z613 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00Z613_A407EmprNom[0] ;
      n407EmprNom = T00Z613_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
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

   public void valid_Pllnro( )
   {
      n7442PLLUltLin = false ;
      n7441PLLCum = false ;
      n7827PLLFchEnt = false ;
      n7439PLLFchCli = false ;
      n7438PLLNroCli = false ;
      n7436PLLFch = false ;
      n7440PLLTip = false ;
      A7440PLLTip = cmbPLLTip.getValue() ;
      n7440PLLTip = false ;
      cmbPLLTip.setValue( A7440PLLTip );
      n7435PLLCliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbPLLTip.getItemCount() > 0 )
      {
         A7440PLLTip = cmbPLLTip.getValidValue(A7440PLLTip) ;
         n7440PLLTip = false ;
         cmbPLLTip.setValue( A7440PLLTip );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPLLTip.setValue( GXutil.rtrim( A7440PLLTip) );
      }
      A7441PLLCum = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A7441PLLCum, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n7441PLLCum = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7435PLLCliCod", GXutil.ltrim( localUtil.ntoc( A7435PLLCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7436PLLFch", localUtil.format(A7436PLLFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A7438PLLNroCli", GXutil.rtrim( A7438PLLNroCli));
      httpContext.ajax_rsp_assign_attri("", false, "A7439PLLFchCli", localUtil.format(A7439PLLFchCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A7827PLLFchEnt", localUtil.format(A7827PLLFchEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A7440PLLTip", GXutil.rtrim( A7440PLLTip));
      cmbPLLTip.setValue( GXutil.rtrim( A7440PLLTip) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPLLTip.getInternalname(), "Values", cmbPLLTip.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7441PLLCum", GXutil.ltrim( localUtil.ntoc( A7441PLLCum, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7442PLLUltLin", GXutil.ltrim( localUtil.ntoc( A7442PLLUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7434PLLNro", GXutil.ltrim( localUtil.ntoc( Z7434PLLNro, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7435PLLCliCod", GXutil.ltrim( localUtil.ntoc( Z7435PLLCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7436PLLFch", localUtil.format(Z7436PLLFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7438PLLNroCli", GXutil.rtrim( Z7438PLLNroCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7439PLLFchCli", localUtil.format(Z7439PLLFchCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7827PLLFchEnt", localUtil.format(Z7827PLLFchEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7440PLLTip", GXutil.rtrim( Z7440PLLTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7441PLLCum", GXutil.ltrim( localUtil.ntoc( Z7441PLLCum, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7442PLLUltLin", GXutil.ltrim( localUtil.ntoc( Z7442PLLUltLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A7435PLLCliCod',fld:'PLLCLICOD',pic:'ZZZZZ9'},{av:'AV34CliNom',fld:'vCLINOM',pic:''},{av:'A7436PLLFch',fld:'PLLFCH',pic:''},{av:'A7438PLLNroCli',fld:'PLLNROCLI',pic:''},{av:'A7439PLLFchCli',fld:'PLLFCHCLI',pic:''},{av:'A7827PLLFchEnt',fld:'PLLFCHENT',pic:''},{av:'cmbPLLTip'},{av:'A7440PLLTip',fld:'PLLTIP',pic:''},{av:'A7442PLLUltLin',fld:'PLLULTLIN',pic:'ZZ9'},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
      setEventMetadata("'LINEAS'","{handler:'e12Z62',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7434PLLNro',fld:'PLLNRO',pic:'ZZZZZZZ9'},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("'LINEAS'",",oparms:[{av:'A7434PLLNro',fld:'PLLNRO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
      setEventMetadata("VALID_PLLNRO","{handler:'valid_Pllnro',iparms:[{av:'A7442PLLUltLin',fld:'PLLULTLIN',pic:'ZZ9'},{av:'A7827PLLFchEnt',fld:'PLLFCHENT',pic:''},{av:'A7439PLLFchCli',fld:'PLLFCHCLI',pic:''},{av:'A7438PLLNroCli',fld:'PLLNROCLI',pic:''},{av:'A7436PLLFch',fld:'PLLFCH',pic:''},{av:'cmbPLLTip'},{av:'A7440PLLTip',fld:'PLLTIP',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7434PLLNro',fld:'PLLNRO',pic:'ZZZZZZZ9'},{av:'A7435PLLCliCod',fld:'PLLCLICOD',pic:'ZZZZZ9'},{av:'AV34CliNom',fld:'vCLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("VALID_PLLNRO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7435PLLCliCod',fld:'PLLCLICOD',pic:'ZZZZZ9'},{av:'A7436PLLFch',fld:'PLLFCH',pic:''},{av:'A7438PLLNroCli',fld:'PLLNROCLI',pic:''},{av:'A7439PLLFchCli',fld:'PLLFCHCLI',pic:''},{av:'A7827PLLFchEnt',fld:'PLLFCHENT',pic:''},{av:'cmbPLLTip'},{av:'A7440PLLTip',fld:'PLLTIP',pic:''},{av:'A7442PLLUltLin',fld:'PLLULTLIN',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Z396EmprCod'},{av:'Z7434PLLNro'},{av:'Z407EmprNom'},{av:'Z7435PLLCliCod'},{av:'Z7436PLLFch'},{av:'Z7438PLLNroCli'},{av:'Z7439PLLFchCli'},{av:'Z7827PLLFchEnt'},{av:'Z7440PLLTip'},{av:'Z7441PLLCum'},{av:'Z7442PLLUltLin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
      setEventMetadata("VALID_PLLCLICOD","{handler:'valid_Pllclicod',iparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]");
      setEventMetadata("VALID_PLLCLICOD",",oparms:[{av:'A7441PLLCum',fld:'PLLCUM',pic:'9'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z7436PLLFch = GXutil.nullDate() ;
      Z7438PLLNroCli = "" ;
      Z7439PLLFchCli = GXutil.nullDate() ;
      Z7827PLLFchEnt = GXutil.nullDate() ;
      Z7440PLLTip = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A7440PLLTip = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A7436PLLFch = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      A7438PLLNroCli = "" ;
      lblTextblock7_Jsonclick = "" ;
      A7439PLLFchCli = GXutil.nullDate() ;
      lblTextblock8_Jsonclick = "" ;
      A7827PLLFchEnt = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34CliNom = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T00Z64_A407EmprNom = new String[] {""} ;
      T00Z64_n407EmprNom = new boolean[] {false} ;
      T00Z65_A7434PLLNro = new int[1] ;
      T00Z65_A407EmprNom = new String[] {""} ;
      T00Z65_n407EmprNom = new boolean[] {false} ;
      T00Z65_A7435PLLCliCod = new int[1] ;
      T00Z65_n7435PLLCliCod = new boolean[] {false} ;
      T00Z65_A7436PLLFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z65_n7436PLLFch = new boolean[] {false} ;
      T00Z65_A7438PLLNroCli = new String[] {""} ;
      T00Z65_n7438PLLNroCli = new boolean[] {false} ;
      T00Z65_A7439PLLFchCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z65_n7439PLLFchCli = new boolean[] {false} ;
      T00Z65_A7827PLLFchEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z65_n7827PLLFchEnt = new boolean[] {false} ;
      T00Z65_A7440PLLTip = new String[] {""} ;
      T00Z65_n7440PLLTip = new boolean[] {false} ;
      T00Z65_A7441PLLCum = new byte[1] ;
      T00Z65_n7441PLLCum = new boolean[] {false} ;
      T00Z65_A7442PLLUltLin = new short[1] ;
      T00Z65_n7442PLLUltLin = new boolean[] {false} ;
      T00Z65_A396EmprCod = new String[] {""} ;
      T00Z66_A396EmprCod = new String[] {""} ;
      T00Z66_A7434PLLNro = new int[1] ;
      T00Z63_A7434PLLNro = new int[1] ;
      T00Z63_A7435PLLCliCod = new int[1] ;
      T00Z63_n7435PLLCliCod = new boolean[] {false} ;
      T00Z63_A7436PLLFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z63_n7436PLLFch = new boolean[] {false} ;
      T00Z63_A7438PLLNroCli = new String[] {""} ;
      T00Z63_n7438PLLNroCli = new boolean[] {false} ;
      T00Z63_A7439PLLFchCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z63_n7439PLLFchCli = new boolean[] {false} ;
      T00Z63_A7827PLLFchEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z63_n7827PLLFchEnt = new boolean[] {false} ;
      T00Z63_A7440PLLTip = new String[] {""} ;
      T00Z63_n7440PLLTip = new boolean[] {false} ;
      T00Z63_A7441PLLCum = new byte[1] ;
      T00Z63_n7441PLLCum = new boolean[] {false} ;
      T00Z63_A7442PLLUltLin = new short[1] ;
      T00Z63_n7442PLLUltLin = new boolean[] {false} ;
      T00Z63_A396EmprCod = new String[] {""} ;
      sMode1045 = "" ;
      T00Z67_A396EmprCod = new String[] {""} ;
      T00Z67_A7434PLLNro = new int[1] ;
      T00Z68_A396EmprCod = new String[] {""} ;
      T00Z68_A7434PLLNro = new int[1] ;
      T00Z62_A7434PLLNro = new int[1] ;
      T00Z62_A7435PLLCliCod = new int[1] ;
      T00Z62_n7435PLLCliCod = new boolean[] {false} ;
      T00Z62_A7436PLLFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z62_n7436PLLFch = new boolean[] {false} ;
      T00Z62_A7438PLLNroCli = new String[] {""} ;
      T00Z62_n7438PLLNroCli = new boolean[] {false} ;
      T00Z62_A7439PLLFchCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z62_n7439PLLFchCli = new boolean[] {false} ;
      T00Z62_A7827PLLFchEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z62_n7827PLLFchEnt = new boolean[] {false} ;
      T00Z62_A7440PLLTip = new String[] {""} ;
      T00Z62_n7440PLLTip = new boolean[] {false} ;
      T00Z62_A7441PLLCum = new byte[1] ;
      T00Z62_n7441PLLCum = new boolean[] {false} ;
      T00Z62_A7442PLLUltLin = new short[1] ;
      T00Z62_n7442PLLUltLin = new boolean[] {false} ;
      T00Z62_A396EmprCod = new String[] {""} ;
      T00Z612_A396EmprCod = new String[] {""} ;
      T00Z612_A7434PLLNro = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int6 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T00Z613_A407EmprNom = new String[] {""} ;
      T00Z613_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ7436PLLFch = GXutil.nullDate() ;
      ZZ7438PLLNroCli = "" ;
      ZZ7439PLLFchCli = GXutil.nullDate() ;
      ZZ7827PLLFchEnt = GXutil.nullDate() ;
      ZZ7440PLLTip = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpll__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpll__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpll__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpll__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpll__default(),
         new Object[] {
             new Object[] {
            T00Z62_A7434PLLNro, T00Z62_A7435PLLCliCod, T00Z62_n7435PLLCliCod, T00Z62_A7436PLLFch, T00Z62_n7436PLLFch, T00Z62_A7438PLLNroCli, T00Z62_n7438PLLNroCli, T00Z62_A7439PLLFchCli, T00Z62_n7439PLLFchCli, T00Z62_A7827PLLFchEnt,
            T00Z62_n7827PLLFchEnt, T00Z62_A7440PLLTip, T00Z62_n7440PLLTip, T00Z62_A7441PLLCum, T00Z62_n7441PLLCum, T00Z62_A7442PLLUltLin, T00Z62_n7442PLLUltLin, T00Z62_A396EmprCod
            }
            , new Object[] {
            T00Z63_A7434PLLNro, T00Z63_A7435PLLCliCod, T00Z63_n7435PLLCliCod, T00Z63_A7436PLLFch, T00Z63_n7436PLLFch, T00Z63_A7438PLLNroCli, T00Z63_n7438PLLNroCli, T00Z63_A7439PLLFchCli, T00Z63_n7439PLLFchCli, T00Z63_A7827PLLFchEnt,
            T00Z63_n7827PLLFchEnt, T00Z63_A7440PLLTip, T00Z63_n7440PLLTip, T00Z63_A7441PLLCum, T00Z63_n7441PLLCum, T00Z63_A7442PLLUltLin, T00Z63_n7442PLLUltLin, T00Z63_A396EmprCod
            }
            , new Object[] {
            T00Z64_A407EmprNom, T00Z64_n407EmprNom
            }
            , new Object[] {
            T00Z65_A7434PLLNro, T00Z65_A407EmprNom, T00Z65_n407EmprNom, T00Z65_A7435PLLCliCod, T00Z65_n7435PLLCliCod, T00Z65_A7436PLLFch, T00Z65_n7436PLLFch, T00Z65_A7438PLLNroCli, T00Z65_n7438PLLNroCli, T00Z65_A7439PLLFchCli,
            T00Z65_n7439PLLFchCli, T00Z65_A7827PLLFchEnt, T00Z65_n7827PLLFchEnt, T00Z65_A7440PLLTip, T00Z65_n7440PLLTip, T00Z65_A7441PLLCum, T00Z65_n7441PLLCum, T00Z65_A7442PLLUltLin, T00Z65_n7442PLLUltLin, T00Z65_A396EmprCod
            }
            , new Object[] {
            T00Z66_A396EmprCod, T00Z66_A7434PLLNro
            }
            , new Object[] {
            T00Z67_A396EmprCod, T00Z67_A7434PLLNro
            }
            , new Object[] {
            T00Z68_A396EmprCod, T00Z68_A7434PLLNro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00Z612_A396EmprCod, T00Z612_A7434PLLNro
            }
            , new Object[] {
            T00Z613_A407EmprNom, T00Z613_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TPLL" ;
   }

   private byte Z7441PLLCum ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7441PLLCum ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ7441PLLCum ;
   private short Z7442PLLUltLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7442PLLUltLin ;
   private short RcdFound1045 ;
   private short nIsDirty_1045 ;
   private short ZZ7442PLLUltLin ;
   private int Z7434PLLNro ;
   private int Z7435PLLCliCod ;
   private int A7435PLLCliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A7434PLLNro ;
   private int edtPLLNro_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPLLCliCod_Enabled ;
   private int edtPLLFch_Enabled ;
   private int edtPLLNroCli_Enabled ;
   private int edtPLLFchCli_Enabled ;
   private int edtPLLFchEnt_Enabled ;
   private int edtPLLUltLin_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV35PLLNro ;
   private int GX_JID ;
   private int idxLst ;
   private int edtPLLUltLin_Backcolor ;
   private int edtPLLFchEnt_Backcolor ;
   private int edtPLLFchCli_Backcolor ;
   private int edtPLLNroCli_Backcolor ;
   private int edtPLLFch_Backcolor ;
   private int edtPLLCliCod_Backcolor ;
   private int edtPLLNro_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int ZZ7434PLLNro ;
   private int ZZ7435PLLCliCod ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z7438PLLNroCli ;
   private String Z7440PLLTip ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPLLNro_Internalname ;
   private String A7440PLLTip ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPLLNro_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPLLCliCod_Internalname ;
   private String edtPLLCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPLLFch_Internalname ;
   private String edtPLLFch_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPLLNroCli_Internalname ;
   private String A7438PLLNroCli ;
   private String edtPLLNroCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPLLFchCli_Internalname ;
   private String edtPLLFchCli_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPLLFchEnt_Internalname ;
   private String edtPLLFchEnt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPLLUltLin_Internalname ;
   private String edtPLLUltLin_Jsonclick ;
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
   private String AV34CliNom ;
   private String AV37Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String sMode1045 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ7438PLLNroCli ;
   private String ZZ7440PLLTip ;
   private java.util.Date Z7436PLLFch ;
   private java.util.Date Z7439PLLFchCli ;
   private java.util.Date Z7827PLLFchEnt ;
   private java.util.Date A7436PLLFch ;
   private java.util.Date A7439PLLFchCli ;
   private java.util.Date A7827PLLFchEnt ;
   private java.util.Date ZZ7436PLLFch ;
   private java.util.Date ZZ7439PLLFchCli ;
   private java.util.Date ZZ7827PLLFchEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7435PLLCliCod ;
   private boolean wbErr ;
   private boolean n7440PLLTip ;
   private boolean n7441PLLCum ;
   private boolean n407EmprNom ;
   private boolean n7436PLLFch ;
   private boolean n7438PLLNroCli ;
   private boolean n7439PLLFchCli ;
   private boolean n7827PLLFchEnt ;
   private boolean n7442PLLUltLin ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPLLTip ;
   private ICheckbox chkPLLCum ;
   private IDataStoreProvider pr_default ;
   private String[] T00Z64_A407EmprNom ;
   private boolean[] T00Z64_n407EmprNom ;
   private int[] T00Z65_A7434PLLNro ;
   private String[] T00Z65_A407EmprNom ;
   private boolean[] T00Z65_n407EmprNom ;
   private int[] T00Z65_A7435PLLCliCod ;
   private boolean[] T00Z65_n7435PLLCliCod ;
   private java.util.Date[] T00Z65_A7436PLLFch ;
   private boolean[] T00Z65_n7436PLLFch ;
   private String[] T00Z65_A7438PLLNroCli ;
   private boolean[] T00Z65_n7438PLLNroCli ;
   private java.util.Date[] T00Z65_A7439PLLFchCli ;
   private boolean[] T00Z65_n7439PLLFchCli ;
   private java.util.Date[] T00Z65_A7827PLLFchEnt ;
   private boolean[] T00Z65_n7827PLLFchEnt ;
   private String[] T00Z65_A7440PLLTip ;
   private boolean[] T00Z65_n7440PLLTip ;
   private byte[] T00Z65_A7441PLLCum ;
   private boolean[] T00Z65_n7441PLLCum ;
   private short[] T00Z65_A7442PLLUltLin ;
   private boolean[] T00Z65_n7442PLLUltLin ;
   private String[] T00Z65_A396EmprCod ;
   private String[] T00Z66_A396EmprCod ;
   private int[] T00Z66_A7434PLLNro ;
   private int[] T00Z63_A7434PLLNro ;
   private int[] T00Z63_A7435PLLCliCod ;
   private boolean[] T00Z63_n7435PLLCliCod ;
   private java.util.Date[] T00Z63_A7436PLLFch ;
   private boolean[] T00Z63_n7436PLLFch ;
   private String[] T00Z63_A7438PLLNroCli ;
   private boolean[] T00Z63_n7438PLLNroCli ;
   private java.util.Date[] T00Z63_A7439PLLFchCli ;
   private boolean[] T00Z63_n7439PLLFchCli ;
   private java.util.Date[] T00Z63_A7827PLLFchEnt ;
   private boolean[] T00Z63_n7827PLLFchEnt ;
   private String[] T00Z63_A7440PLLTip ;
   private boolean[] T00Z63_n7440PLLTip ;
   private byte[] T00Z63_A7441PLLCum ;
   private boolean[] T00Z63_n7441PLLCum ;
   private short[] T00Z63_A7442PLLUltLin ;
   private boolean[] T00Z63_n7442PLLUltLin ;
   private String[] T00Z63_A396EmprCod ;
   private String[] T00Z67_A396EmprCod ;
   private int[] T00Z67_A7434PLLNro ;
   private String[] T00Z68_A396EmprCod ;
   private int[] T00Z68_A7434PLLNro ;
   private int[] T00Z62_A7434PLLNro ;
   private int[] T00Z62_A7435PLLCliCod ;
   private boolean[] T00Z62_n7435PLLCliCod ;
   private java.util.Date[] T00Z62_A7436PLLFch ;
   private boolean[] T00Z62_n7436PLLFch ;
   private String[] T00Z62_A7438PLLNroCli ;
   private boolean[] T00Z62_n7438PLLNroCli ;
   private java.util.Date[] T00Z62_A7439PLLFchCli ;
   private boolean[] T00Z62_n7439PLLFchCli ;
   private java.util.Date[] T00Z62_A7827PLLFchEnt ;
   private boolean[] T00Z62_n7827PLLFchEnt ;
   private String[] T00Z62_A7440PLLTip ;
   private boolean[] T00Z62_n7440PLLTip ;
   private byte[] T00Z62_A7441PLLCum ;
   private boolean[] T00Z62_n7441PLLCum ;
   private short[] T00Z62_A7442PLLUltLin ;
   private boolean[] T00Z62_n7442PLLUltLin ;
   private String[] T00Z62_A396EmprCod ;
   private String[] T00Z612_A396EmprCod ;
   private int[] T00Z612_A7434PLLNro ;
   private String[] T00Z613_A407EmprNom ;
   private boolean[] T00Z613_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpll__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpll__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpll__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpll__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpll__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00Z62", "SELECT PLLNro, PLLCliCod, PLLFch, PLLNroCli, PLLFchCli, PLLFchEnt, PLLTip, PLLCum, PLLUltLin, EmprCod FROM TXPPLL WHERE EmprCod = ? AND PLLNro = ?  FOR UPDATE OF PLLCliCod, PLLFch, PLLNroCli, PLLFchCli, PLLFchEnt, PLLTip, PLLCum, PLLUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z63", "SELECT PLLNro, PLLCliCod, PLLFch, PLLNroCli, PLLFchCli, PLLFchEnt, PLLTip, PLLCum, PLLUltLin, EmprCod FROM TXPPLL WHERE EmprCod = ? AND PLLNro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z64", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z65", "SELECT /*+ FIRST_ROWS(100) */ TM1.PLLNro, T2.EmprNom, TM1.PLLCliCod, TM1.PLLFch, TM1.PLLNroCli, TM1.PLLFchCli, TM1.PLLFchEnt, TM1.PLLTip, TM1.PLLCum, TM1.PLLUltLin, TM1.EmprCod FROM (TXPPLL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PLLNro = ? ORDER BY TM1.EmprCod, TM1.PLLNro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z66", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLLNro FROM TXPPLL WHERE EmprCod = ? AND PLLNro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z67", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLLNro FROM TXPPLL WHERE ( PLLNro > ?) and EmprCod = ? ORDER BY EmprCod, PLLNro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z68", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PLLNro FROM TXPPLL WHERE ( PLLNro < ?) and EmprCod = ? ORDER BY EmprCod DESC, PLLNro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00Z69", "INSERT INTO TXPPLL(PLLNro, PLLCliCod, PLLFch, PLLNroCli, PLLFchCli, PLLFchEnt, PLLTip, PLLCum, PLLUltLin, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPLL")
         ,new UpdateCursor("T00Z610", "UPDATE TXPPLL SET PLLCliCod=?, PLLFch=?, PLLNroCli=?, PLLFchCli=?, PLLFchEnt=?, PLLTip=?, PLLCum=?, PLLUltLin=?  WHERE EmprCod = ? AND PLLNro = ?", GX_NOMASK, "TXPPLL")
         ,new UpdateCursor("T00Z611", "DELETE FROM TXPPLL  WHERE EmprCod = ? AND PLLNro = ?", GX_NOMASK, "TXPPLL")
         ,new ForEachCursor("T00Z612", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PLLNro FROM TXPPLL WHERE EmprCod = ? ORDER BY EmprCod, PLLNro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z613", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
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
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
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
               return;
            case 8 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

