package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tingqui_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_1JC1694( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12205OrdenCID = GXutil.lval( httpContext.GetPar( "OrdenCID")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         AV33Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", AV33Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1JC1695( Gx_mode, A396EmprCod, A12205OrdenCID, A719PrdNum, AV33Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A12204OrdenCPre = CommonUtil.decimalVal( httpContext.GetPar( "OrdenCPre"), ".") ;
         n12204OrdenCPre = false ;
         AV34Msg_err2 = httpContext.GetPar( "Msg_err2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", AV34Msg_err2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1JC1695( Gx_mode, A396EmprCod, A719PrdNum, A795PrvNum, A12204OrdenCPre, AV34Msg_err2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ingresos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOrdenCID_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tingqui_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tingqui_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tingqui_impl.class ));
   }

   public tingqui_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOrdenCEst = new HTMLChoice();
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
      if ( cmbOrdenCEst.getItemCount() > 0 )
      {
         A12202OrdenCEst = (byte)(GXutil.lval( cmbOrdenCEst.getValidValue(GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0))))) ;
         n12202OrdenCEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOrdenCEst.setValue( GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOrdenCEst.getInternalname(), "Values", cmbOrdenCEst.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TIngQui.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "OrdenCompraID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrdenCID_Internalname, GXutil.ltrim( localUtil.ntoc( A12205OrdenCID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOrdenCID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12205OrdenCID), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12205OrdenCID), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrdenCID_Jsonclick, 0, "", "", "", "", "", 1, edtOrdenCID_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtOrdenCFc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrdenCFc_Internalname, localUtil.format(A12201OrdenCFc, "99/99/99"), localUtil.format( A12201OrdenCFc, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrdenCFc_Jsonclick, 0, "", "", "", "", "", 1, edtOrdenCFc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngQui.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOrdenCFc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOrdenCFc_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIngQui.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOrdenCEst, cmbOrdenCEst.getInternalname(), GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0)), 1, cmbOrdenCEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbOrdenCEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, (byte)(0), "HLP_TIngQui.htm");
      cmbOrdenCEst.setValue( GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrdenCEst.getInternalname(), "Values", cmbOrdenCEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "ProveedorID", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIngQui.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1695 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1695 = (short)(1) ;
            scanStart1JC1695( ) ;
            while ( RcdFound1695 != 0 )
            {
               init_level_properties1695( ) ;
               getByPrimaryKey1JC1695( ) ;
               addRow1JC1695( ) ;
               scanNext1JC1695( ) ;
            }
            scanEnd1JC1695( ) ;
            nBlankRcdCount1695 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1JC1695( ) ;
         standaloneModal1JC1695( ) ;
         sMode1695 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1JC1695( ) ;
            edtavnRcdDeleted_1695_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1695_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1695_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1695_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCLnId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCLNID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLnId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLnId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCLSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCLST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLSt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCCn2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCN2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCn2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCn2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCNdc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCNDC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCNdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCNdc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCCnA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCNA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCnA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCnA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCCPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCPA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCPA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtOrdenCCPr2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCPR2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCPr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCPr2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1695 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JC1695( ) ;
            }
            sendRow1JC1695( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1695 = (short)(5) ;
         nRcdExists_1695 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JC1695( ) ;
            while ( RcdFound1695 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551695( ) ;
               init_level_properties1695( ) ;
               standaloneNotModal1JC1695( ) ;
               getByPrimaryKey1JC1695( ) ;
               standaloneModal1JC1695( ) ;
               addRow1JC1695( ) ;
               scanNext1JC1695( ) ;
            }
            scanEnd1JC1695( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1695 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551695( ) ;
      initAll1JC1695( ) ;
      init_level_properties1695( ) ;
      nRcdExists_1695 = (short)(0) ;
      nIsMod_1695 = (short)(0) ;
      nRcdDeleted_1695 = (short)(0) ;
      nBlankRcdCount1695 = (short)(nBlankRcdUsr1695+nBlankRcdCount1695) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1695 > 0 )
      {
         standaloneNotModal1JC1695( ) ;
         standaloneModal1JC1695( ) ;
         addRow1JC1695( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtOrdenCLnId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1695 = (short)(nBlankRcdCount1695-1) ;
      }
      Gx_mode = sMode1695 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIngQui.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TIngQui.htm");
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
      e111JC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12205OrdenCID = localUtil.ctol( httpContext.cgiGet( "Z12205OrdenCID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12201OrdenCFc = localUtil.ctod( httpContext.cgiGet( "Z12201OrdenCFc"), 0) ;
            Z12202OrdenCEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12202OrdenCEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV33Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV34Msg_err2 = httpContext.cgiGet( "vMSG_ERR2") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ORDENCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOrdenCID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12205OrdenCID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
            }
            else
            {
               A12205OrdenCID = localUtil.ctol( httpContext.cgiGet( edtOrdenCID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
            }
            A12201OrdenCFc = localUtil.ctod( httpContext.cgiGet( edtOrdenCFc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12201OrdenCFc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
            cmbOrdenCEst.setName( cmbOrdenCEst.getInternalname() );
            cmbOrdenCEst.setValue( httpContext.cgiGet( cmbOrdenCEst.getInternalname()) );
            A12202OrdenCEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbOrdenCEst.getInternalname()))) ;
            n12202OrdenCEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A795PrvNum = 0 ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            else
            {
               A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n795PrvNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            }
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TIngQui");
            A12201OrdenCFc = localUtil.ctod( httpContext.cgiGet( edtOrdenCFc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12201OrdenCFc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
            forbiddenHiddens.add("OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A12205OrdenCID != Z12205OrdenCID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tingqui:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A12205OrdenCID = GXutil.lval( httpContext.GetPar( "OrdenCID")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
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
                        e111JC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'INFORME ORDEN COMPRA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Informe Orden Compra' */
                        e121JC2 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1JC1694( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1695_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1695_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1JC1694( ) ;
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

   public void confirm_1JC0( )
   {
      beforeValidate1JC1694( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JC1694( ) ;
         }
         else
         {
            checkExtendedTable1JC1694( ) ;
            if ( AnyError == 0 )
            {
               zm1JC1694( 19) ;
               zm1JC1694( 20) ;
            }
            closeExtendedTableCursors1JC1694( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1694 = Gx_mode ;
         confirm_1JC1695( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1694 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1JC0( ) ;
      }
   }

   public void confirm_1JC1695( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1JC1695( ) ;
         if ( ( nRcdExists_1695 != 0 ) || ( nIsMod_1695 != 0 ) )
         {
            getKey1JC1695( ) ;
            if ( ( nRcdExists_1695 == 0 ) && ( nRcdDeleted_1695 == 0 ) )
            {
               if ( RcdFound1695 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JC1695( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JC1695( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1JC1695( 22) ;
                     }
                     closeExtendedTableCursors1JC1695( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ORDENCLNID_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOrdenCLnId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1695 != 0 )
               {
                  if ( nRcdDeleted_1695 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JC1695( ) ;
                     load1JC1695( ) ;
                     beforeValidate1JC1695( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JC1695( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JC1695( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JC1695( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1JC1695( 22) ;
                           }
                           closeExtendedTableCursors1JC1695( ) ;
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
                  if ( nRcdDeleted_1695 == 0 )
                  {
                     GXCCtl = "ORDENCLNID_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOrdenCLnId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1695_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCLnId_Internalname, GXutil.ltrim( localUtil.ntoc( A12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtOrdenCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCLSt_Internalname, GXutil.ltrim( localUtil.ntoc( A12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCCn2_Internalname, GXutil.ltrim( localUtil.ntoc( A12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCNdc_Internalname, GXutil.ltrim( localUtil.ntoc( A12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCCnA_Internalname, GXutil.rtrim( A12261OrdenCCnA)) ;
         httpContext.changePostValue( edtOrdenCCPA_Internalname, GXutil.rtrim( A12262OrdenCCPA)) ;
         httpContext.changePostValue( edtOrdenCCPr2_Internalname, GXutil.ltrim( localUtil.ntoc( A12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12206OrdenCLnId_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12258OrdenCLSt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12259OrdenCCn2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12260OrdenCNdc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12261OrdenCCnA_"+sGXsfl_55_idx, GXutil.rtrim( Z12261OrdenCCnA)) ;
         httpContext.changePostValue( "ZT_"+"Z12262OrdenCCPA_"+sGXsfl_55_idx, GXutil.rtrim( Z12262OrdenCCPA)) ;
         httpContext.changePostValue( "ZT_"+"Z12263OrdenCCPr2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12203OrdenCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12204OrdenCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_55_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1695 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1695_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1695_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCLNID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLnId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCLST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCn2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCNDC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCNdc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCNA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCPR2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPr2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JC0( )
   {
   }

   public void e111JC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tingqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tingqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV31Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tingqui_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit1", AV31Lit1);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tingqui_impl.this.A396EmprCod = GXv_char2[0] ;
      tingqui_impl.this.AV11EmprNom = GXv_char3[0] ;
      tingqui_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV10EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      GXt_int5 = AV32ExisteC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INGQUI", ""), GXv_int6) ;
      tingqui_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32ExisteC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32ExisteC", GXutil.str( AV32ExisteC, 1, 0));
      if ( AV32ExisteC == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta contador INGQUI", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e121JC2( )
   {
      /* 'Informe Orden Compra' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) && ! (0==A12205OrdenCID) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12205OrdenCID ;
         new app.pingq01(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
         tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
         tingqui_impl.this.A12205OrdenCID = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
      }
      /*  Sending Event outputs  */
   }

   public void zm1JC1694( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12201OrdenCFc = T01JC6_A12201OrdenCFc[0] ;
            Z12202OrdenCEst = T01JC6_A12202OrdenCEst[0] ;
            Z795PrvNum = T01JC6_A795PrvNum[0] ;
         }
         else
         {
            Z12201OrdenCFc = A12201OrdenCFc ;
            Z12202OrdenCEst = A12202OrdenCEst ;
            Z795PrvNum = A795PrvNum ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z12205OrdenCID = A12205OrdenCID ;
         Z12201OrdenCFc = A12201OrdenCFc ;
         Z12202OrdenCEst = A12202OrdenCEst ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z407EmprNom = A407EmprNom ;
         Z794PrvNom = A794PrvNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtOrdenCFc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCFc_Enabled), 5, 0), true);
      AV36Pgmname = "TIngQui" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOrdenCFc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCFc_Enabled), 5, 0), true);
      /* Using cursor T01JC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JC7_A407EmprNom[0] ;
      n407EmprNom = T01JC7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A12201OrdenCFc)) && ( Gx_BScreen == 0 ) )
      {
         A12201OrdenCFc = GXutil.today( ) ;
         n12201OrdenCFc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
      }
      if ( isIns( )  && (0==A12202OrdenCEst) && ( Gx_BScreen == 0 ) )
      {
         A12202OrdenCEst = (byte)(0) ;
         n12202OrdenCEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
      }
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

   public void load1JC1694( )
   {
      /* Using cursor T01JC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1694 = (short)(1) ;
         A407EmprNom = T01JC9_A407EmprNom[0] ;
         n407EmprNom = T01JC9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12201OrdenCFc = T01JC9_A12201OrdenCFc[0] ;
         n12201OrdenCFc = T01JC9_n12201OrdenCFc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
         A12202OrdenCEst = T01JC9_A12202OrdenCEst[0] ;
         n12202OrdenCEst = T01JC9_n12202OrdenCEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
         A794PrvNom = T01JC9_A794PrvNom[0] ;
         n794PrvNom = T01JC9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A795PrvNum = T01JC9_A795PrvNum[0] ;
         n795PrvNum = T01JC9_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1JC1694( -18) ;
      }
      pr_default.close(7);
      onLoadActions1JC1694( ) ;
   }

   public void onLoadActions1JC1694( )
   {
   }

   public void checkExtendedTable1JC1694( )
   {
      nIsDirty_1694 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01JC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T01JC8_A794PrvNom[0] ;
      n794PrvNom = T01JC8_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(6);
      if ( ( A12202OrdenCEst == 1 ) && ( isDlt( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden de Compra Ingresada en Almacen", ""), 1, "ORDENCEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbOrdenCEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1JC1694( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01JC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T01JC10_A794PrvNom[0] ;
      n794PrvNom = T01JC10_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1JC1694( )
   {
      /* Using cursor T01JC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1694 = (short)(1) ;
      }
      else
      {
         RcdFound1694 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01JC6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JC1694( 18) ;
         RcdFound1694 = (short)(1) ;
         A12205OrdenCID = T01JC6_A12205OrdenCID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
         A12201OrdenCFc = T01JC6_A12201OrdenCFc[0] ;
         n12201OrdenCFc = T01JC6_n12201OrdenCFc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
         A12202OrdenCEst = T01JC6_A12202OrdenCEst[0] ;
         n12202OrdenCEst = T01JC6_n12202OrdenCEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
         A795PrvNum = T01JC6_A795PrvNum[0] ;
         n795PrvNum = T01JC6_n795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z12205OrdenCID = A12205OrdenCID ;
         sMode1694 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JC1694( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1694 = (short)(0) ;
            initializeNonKey1JC1694( ) ;
         }
         Gx_mode = sMode1694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1694 = (short)(0) ;
         initializeNonKey1JC1694( ) ;
         sMode1694 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1694 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1JC1694( ) ;
      if ( RcdFound1694 == 0 )
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
      RcdFound1694 = (short)(0) ;
      /* Using cursor T01JC12 */
      pr_default.execute(10, new Object[] {Long.valueOf(A12205OrdenCID), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01JC12_A12205OrdenCID[0] < A12205OrdenCID ) ) && ( GXutil.strcmp(T01JC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01JC12_A12205OrdenCID[0] > A12205OrdenCID ) ) && ( GXutil.strcmp(T01JC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12205OrdenCID = T01JC12_A12205OrdenCID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
            RcdFound1694 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1694 = (short)(0) ;
      /* Using cursor T01JC13 */
      pr_default.execute(11, new Object[] {Long.valueOf(A12205OrdenCID), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01JC13_A12205OrdenCID[0] > A12205OrdenCID ) ) && ( GXutil.strcmp(T01JC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01JC13_A12205OrdenCID[0] < A12205OrdenCID ) ) && ( GXutil.strcmp(T01JC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12205OrdenCID = T01JC13_A12205OrdenCID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
            RcdFound1694 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JC1694( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOrdenCID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JC1694( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1694 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12205OrdenCID != Z12205OrdenCID ) )
            {
               A12205OrdenCID = Z12205OrdenCID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOrdenCID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1JC1694( ) ;
               GX_FocusControl = edtOrdenCID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12205OrdenCID != Z12205OrdenCID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtOrdenCID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JC1694( ) ;
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
                  GX_FocusControl = edtOrdenCID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JC1694( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12205OrdenCID != Z12205OrdenCID ) )
      {
         A12205OrdenCID = Z12205OrdenCID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOrdenCID_Internalname ;
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
      getKey1JC1694( ) ;
      if ( RcdFound1694 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12205OrdenCID != Z12205OrdenCID ) )
         {
            A12205OrdenCID = Z12205OrdenCID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12205OrdenCID != Z12205OrdenCID ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tingqui");
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JC0( ) ;
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
      if ( RcdFound1694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JC1694( ) ;
      if ( RcdFound1694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JC1694( ) ;
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
      if ( RcdFound1694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
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
      if ( RcdFound1694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
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
      scanStart1JC1694( ) ;
      if ( RcdFound1694 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1694 != 0 )
         {
            scanNext1JC1694( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JC1694( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JC1694( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JC5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPIngQui"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z12201OrdenCFc), GXutil.resetTime(T01JC5_A12201OrdenCFc[0])) ) || ( Z12202OrdenCEst != T01JC5_A12202OrdenCEst[0] ) || ( Z795PrvNum != T01JC5_A795PrvNum[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12201OrdenCFc), GXutil.resetTime(T01JC5_A12201OrdenCFc[0])) ) )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCFc");
               GXutil.writeLogRaw("Old: ",Z12201OrdenCFc);
               GXutil.writeLogRaw("Current: ",T01JC5_A12201OrdenCFc[0]);
            }
            if ( Z12202OrdenCEst != T01JC5_A12202OrdenCEst[0] )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCEst");
               GXutil.writeLogRaw("Old: ",Z12202OrdenCEst);
               GXutil.writeLogRaw("Current: ",T01JC5_A12202OrdenCEst[0]);
            }
            if ( Z795PrvNum != T01JC5_A795PrvNum[0] )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01JC5_A795PrvNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPIngQui"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JC1694( )
   {
      beforeValidate1JC1694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JC1694( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JC1694( 0) ;
         checkOptimisticConcurrency1JC1694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JC1694( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JC1694( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JC14 */
                  pr_default.execute(12, new Object[] {Long.valueOf(A12205OrdenCID), Boolean.valueOf(n12201OrdenCFc), A12201OrdenCFc, Boolean.valueOf(n12202OrdenCEst), Byte.valueOf(A12202OrdenCEst), A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQui");
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
                        processLevel1JC1694( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JC0( ) ;
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
            load1JC1694( ) ;
         }
         endLevel1JC1694( ) ;
      }
      closeExtendedTableCursors1JC1694( ) ;
   }

   public void update1JC1694( )
   {
      beforeValidate1JC1694( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JC1694( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JC1694( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JC1694( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JC1694( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JC15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n12201OrdenCFc), A12201OrdenCFc, Boolean.valueOf(n12202OrdenCEst), Byte.valueOf(A12202OrdenCEst), Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum), A396EmprCod, Long.valueOf(A12205OrdenCID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQui");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPIngQui"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JC1694( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JC1694( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JC0( ) ;
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
         endLevel1JC1694( ) ;
      }
      closeExtendedTableCursors1JC1694( ) ;
   }

   public void deferredUpdate1JC1694( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JC1694( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JC1694( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JC1694( ) ;
         afterConfirm1JC1694( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JC1694( ) ;
            if ( AnyError == 0 )
            {
               scanStart1JC1695( ) ;
               while ( RcdFound1695 != 0 )
               {
                  getByPrimaryKey1JC1695( ) ;
                  delete1JC1695( ) ;
                  scanNext1JC1695( ) ;
               }
               scanEnd1JC1695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JC16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQui");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1694 == 0 )
                        {
                           initAll1JC1694( ) ;
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
                        resetCaption1JC0( ) ;
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
      sMode1694 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JC1694( ) ;
      Gx_mode = sMode1694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JC1694( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A12202OrdenCEst == 1 ) && ( isDlt( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden de Compra Ingresada en Almacen", ""), 1, "ORDENCEST");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbOrdenCEst.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01JC17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01JC17_A794PrvNom[0] ;
         n794PrvNom = T01JC17_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1JC1695( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1JC1695( ) ;
         if ( ( nRcdExists_1695 != 0 ) || ( nIsMod_1695 != 0 ) )
         {
            standaloneNotModal1JC1695( ) ;
            getKey1JC1695( ) ;
            if ( ( nRcdExists_1695 == 0 ) && ( nRcdDeleted_1695 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JC1695( ) ;
            }
            else
            {
               if ( RcdFound1695 != 0 )
               {
                  if ( ( nRcdDeleted_1695 != 0 ) && ( nRcdExists_1695 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JC1695( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1695 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JC1695( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1695 == 0 )
                  {
                     GXCCtl = "ORDENCLNID_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOrdenCLnId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1695_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCLnId_Internalname, GXutil.ltrim( localUtil.ntoc( A12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtOrdenCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCLSt_Internalname, GXutil.ltrim( localUtil.ntoc( A12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCCn2_Internalname, GXutil.ltrim( localUtil.ntoc( A12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCNdc_Internalname, GXutil.ltrim( localUtil.ntoc( A12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOrdenCCnA_Internalname, GXutil.rtrim( A12261OrdenCCnA)) ;
         httpContext.changePostValue( edtOrdenCCPA_Internalname, GXutil.rtrim( A12262OrdenCCPA)) ;
         httpContext.changePostValue( edtOrdenCCPr2_Internalname, GXutil.ltrim( localUtil.ntoc( A12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12206OrdenCLnId_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12258OrdenCLSt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12259OrdenCCn2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12260OrdenCNdc_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12261OrdenCCnA_"+sGXsfl_55_idx, GXutil.rtrim( Z12261OrdenCCnA)) ;
         httpContext.changePostValue( "ZT_"+"Z12262OrdenCCPA_"+sGXsfl_55_idx, GXutil.rtrim( Z12262OrdenCCPA)) ;
         httpContext.changePostValue( "ZT_"+"Z12263OrdenCCPr2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12203OrdenCCnt_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12204OrdenCPre_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_55_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1695_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1695 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1695_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1695_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCLNID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLnId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCLST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCn2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCNDC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCNdc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCNA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORDENCCPR2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPr2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JC1695( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1695 = (short)(0) ;
      nIsMod_1695 = (short)(0) ;
      nRcdDeleted_1695 = (short)(0) ;
   }

   public void processLevel1JC1694( )
   {
      /* Save parent mode. */
      sMode1694 = Gx_mode ;
      processNestedLevel1JC1695( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1694 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1JC1694( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JC1694( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tingqui");
         if ( AnyError == 0 )
         {
            confirmValues1JC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tingqui");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JC1694( )
   {
      /* Scan By routine */
      /* Using cursor T01JC18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1694 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1694 = (short)(1) ;
         A12205OrdenCID = T01JC18_A12205OrdenCID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JC1694( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1694 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1694 = (short)(1) ;
         A12205OrdenCID = T01JC18_A12205OrdenCID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
      }
   }

   public void scanEnd1JC1694( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1JC1694( )
   {
      /* After Confirm Rules */
      if ( (0==A12205OrdenCID) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = (int)(A12205OrdenCID) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INGQUI", ""), GXv_int8) ;
         tingqui_impl.this.A12205OrdenCID = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
      }
   }

   public void beforeInsert1JC1694( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JC1694( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JC1694( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JC1694( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JC1694( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JC1694( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOrdenCID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCID_Enabled), 5, 0), true);
      edtOrdenCFc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCFc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCFc_Enabled), 5, 0), true);
      cmbOrdenCEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrdenCEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOrdenCEst.getEnabled(), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
   }

   public void zm1JC1695( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12258OrdenCLSt = T01JC3_A12258OrdenCLSt[0] ;
            Z12259OrdenCCn2 = T01JC3_A12259OrdenCCn2[0] ;
            Z12260OrdenCNdc = T01JC3_A12260OrdenCNdc[0] ;
            Z12261OrdenCCnA = T01JC3_A12261OrdenCCnA[0] ;
            Z12262OrdenCCPA = T01JC3_A12262OrdenCCPA[0] ;
            Z12263OrdenCCPr2 = T01JC3_A12263OrdenCCPr2[0] ;
            Z12203OrdenCCnt = T01JC3_A12203OrdenCCnt[0] ;
            Z12204OrdenCPre = T01JC3_A12204OrdenCPre[0] ;
            Z719PrdNum = T01JC3_A719PrdNum[0] ;
         }
         else
         {
            Z12258OrdenCLSt = A12258OrdenCLSt ;
            Z12259OrdenCCn2 = A12259OrdenCCn2 ;
            Z12260OrdenCNdc = A12260OrdenCNdc ;
            Z12261OrdenCCnA = A12261OrdenCCnA ;
            Z12262OrdenCCPA = A12262OrdenCCPA ;
            Z12263OrdenCCPr2 = A12263OrdenCCPr2 ;
            Z12203OrdenCCnt = A12203OrdenCCnt ;
            Z12204OrdenCPre = A12204OrdenCPre ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z12205OrdenCID = A12205OrdenCID ;
         Z12206OrdenCLnId = A12206OrdenCLnId ;
         Z12258OrdenCLSt = A12258OrdenCLSt ;
         Z12259OrdenCCn2 = A12259OrdenCCn2 ;
         Z12260OrdenCNdc = A12260OrdenCNdc ;
         Z12261OrdenCCnA = A12261OrdenCCnA ;
         Z12262OrdenCCPA = A12262OrdenCCPA ;
         Z12263OrdenCCPr2 = A12263OrdenCCPr2 ;
         Z12203OrdenCCnt = A12203OrdenCCnt ;
         Z12204OrdenCPre = A12204OrdenCPre ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1JC1695( )
   {
   }

   public void standaloneModal1JC1695( )
   {
      if ( isIns( )  && (0==A12258OrdenCLSt) && ( Gx_BScreen == 0 ) )
      {
         A12258OrdenCLSt = (byte)(0) ;
         n12258OrdenCLSt = false ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12259OrdenCCn2)==0) && ( Gx_BScreen == 0 ) )
      {
         A12259OrdenCCn2 = DecimalUtil.doubleToDec(0) ;
         n12259OrdenCCn2 = false ;
      }
      if ( isIns( )  && (0==A12260OrdenCNdc) && ( Gx_BScreen == 0 ) )
      {
         A12260OrdenCNdc = 0 ;
         n12260OrdenCNdc = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12261OrdenCCnA)==0) && ( Gx_BScreen == 0 ) )
      {
         A12261OrdenCCnA = "*" ;
         n12261OrdenCCnA = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12262OrdenCCPA)==0) && ( Gx_BScreen == 0 ) )
      {
         A12262OrdenCCPA = "*" ;
         n12262OrdenCCPA = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOrdenCLnId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLnId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLnId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtOrdenCLnId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLnId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLnId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1JC1695( )
   {
      /* Using cursor T01JC19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1695 = (short)(1) ;
         A12258OrdenCLSt = T01JC19_A12258OrdenCLSt[0] ;
         n12258OrdenCLSt = T01JC19_n12258OrdenCLSt[0] ;
         A12259OrdenCCn2 = T01JC19_A12259OrdenCCn2[0] ;
         n12259OrdenCCn2 = T01JC19_n12259OrdenCCn2[0] ;
         A12260OrdenCNdc = T01JC19_A12260OrdenCNdc[0] ;
         n12260OrdenCNdc = T01JC19_n12260OrdenCNdc[0] ;
         A12261OrdenCCnA = T01JC19_A12261OrdenCCnA[0] ;
         n12261OrdenCCnA = T01JC19_n12261OrdenCCnA[0] ;
         A12262OrdenCCPA = T01JC19_A12262OrdenCCPA[0] ;
         n12262OrdenCCPA = T01JC19_n12262OrdenCCPA[0] ;
         A12263OrdenCCPr2 = T01JC19_A12263OrdenCCPr2[0] ;
         n12263OrdenCCPr2 = T01JC19_n12263OrdenCCPr2[0] ;
         A718PrdNom = T01JC19_A718PrdNom[0] ;
         A12203OrdenCCnt = T01JC19_A12203OrdenCCnt[0] ;
         n12203OrdenCCnt = T01JC19_n12203OrdenCCnt[0] ;
         A12204OrdenCPre = T01JC19_A12204OrdenCPre[0] ;
         n12204OrdenCPre = T01JC19_n12204OrdenCPre[0] ;
         A719PrdNum = T01JC19_A719PrdNum[0] ;
         n719PrdNum = T01JC19_n719PrdNum[0] ;
         zm1JC1695( -21) ;
      }
      pr_default.close(17);
      onLoadActions1JC1695( ) ;
   }

   public void onLoadActions1JC1695( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12263OrdenCCPr2)==0) && ( Gx_BScreen == 0 ) )
      {
         A12263OrdenCCPr2 = A12204OrdenCPre ;
         n12263OrdenCCPr2 = false ;
      }
   }

   public void checkExtendedTable1JC1695( )
   {
      nIsDirty_1695 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1JC1695( ) ;
      /* Using cursor T01JC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01JC4_A718PrdNom[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12263OrdenCCPr2)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1695 = (short)(1) ;
         A12263OrdenCCPr2 = A12204OrdenCPre ;
         n12263OrdenCCPr2 = false ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12205OrdenCID ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV33Msg_err ;
         new app.pingq00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
         tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
         tingqui_impl.this.A12205OrdenCID = GXv_int7[0] ;
         tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
         tingqui_impl.this.AV33Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", AV33Msg_err);
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV33Msg_err)==0) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(AV33Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int8[0] = A795PrvNum ;
         GXv_decimal9[0] = A12204OrdenCPre ;
         GXv_char2[0] = AV34Msg_err2 ;
         new app.pingqu01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9, GXv_char2) ;
         tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
         tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
         tingqui_impl.this.A795PrvNum = GXv_int8[0] ;
         tingqui_impl.this.A12204OrdenCPre = GXv_decimal9[0] ;
         tingqui_impl.this.AV34Msg_err2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", AV34Msg_err2);
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV34Msg_err2)==0) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(AV34Msg_err2, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A12258OrdenCLSt > 0 ) && ( isDlt( )  || isUpd( )  ) )
      {
         GXCCtl = "ORDENCLST_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Linea Ingresa Almacen", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCLSt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1JC1695( )
   {
      pr_default.close(2);
   }

   public void enableDisable1JC1695( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01JC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01JC20_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1JC1695( )
   {
      /* Using cursor T01JC21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1695 = (short)(1) ;
      }
      else
      {
         RcdFound1695 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1JC1695( )
   {
      /* Using cursor T01JC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01JC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JC1695( 21) ;
         RcdFound1695 = (short)(1) ;
         initializeNonKey1JC1695( ) ;
         A12206OrdenCLnId = T01JC3_A12206OrdenCLnId[0] ;
         A12258OrdenCLSt = T01JC3_A12258OrdenCLSt[0] ;
         n12258OrdenCLSt = T01JC3_n12258OrdenCLSt[0] ;
         A12259OrdenCCn2 = T01JC3_A12259OrdenCCn2[0] ;
         n12259OrdenCCn2 = T01JC3_n12259OrdenCCn2[0] ;
         A12260OrdenCNdc = T01JC3_A12260OrdenCNdc[0] ;
         n12260OrdenCNdc = T01JC3_n12260OrdenCNdc[0] ;
         A12261OrdenCCnA = T01JC3_A12261OrdenCCnA[0] ;
         n12261OrdenCCnA = T01JC3_n12261OrdenCCnA[0] ;
         A12262OrdenCCPA = T01JC3_A12262OrdenCCPA[0] ;
         n12262OrdenCCPA = T01JC3_n12262OrdenCCPA[0] ;
         A12263OrdenCCPr2 = T01JC3_A12263OrdenCCPr2[0] ;
         n12263OrdenCCPr2 = T01JC3_n12263OrdenCCPr2[0] ;
         A12203OrdenCCnt = T01JC3_A12203OrdenCCnt[0] ;
         n12203OrdenCCnt = T01JC3_n12203OrdenCCnt[0] ;
         A12204OrdenCPre = T01JC3_A12204OrdenCPre[0] ;
         n12204OrdenCPre = T01JC3_n12204OrdenCPre[0] ;
         A719PrdNum = T01JC3_A719PrdNum[0] ;
         n719PrdNum = T01JC3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z12205OrdenCID = A12205OrdenCID ;
         Z12206OrdenCLnId = A12206OrdenCLnId ;
         sMode1695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JC1695( ) ;
         load1JC1695( ) ;
         Gx_mode = sMode1695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1695 = (short)(0) ;
         initializeNonKey1JC1695( ) ;
         sMode1695 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JC1695( ) ;
         Gx_mode = sMode1695 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JC1695( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JC1695( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPIngQu1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12258OrdenCLSt != T01JC2_A12258OrdenCLSt[0] ) || ( DecimalUtil.compareTo(Z12259OrdenCCn2, T01JC2_A12259OrdenCCn2[0]) != 0 ) || ( Z12260OrdenCNdc != T01JC2_A12260OrdenCNdc[0] ) || ( GXutil.strcmp(Z12261OrdenCCnA, T01JC2_A12261OrdenCCnA[0]) != 0 ) || ( GXutil.strcmp(Z12262OrdenCCPA, T01JC2_A12262OrdenCCPA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12263OrdenCCPr2, T01JC2_A12263OrdenCCPr2[0]) != 0 ) || ( DecimalUtil.compareTo(Z12203OrdenCCnt, T01JC2_A12203OrdenCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z12204OrdenCPre, T01JC2_A12204OrdenCPre[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01JC2_A719PrdNum[0]) != 0 ) )
         {
            if ( Z12258OrdenCLSt != T01JC2_A12258OrdenCLSt[0] )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCLSt");
               GXutil.writeLogRaw("Old: ",Z12258OrdenCLSt);
               GXutil.writeLogRaw("Current: ",T01JC2_A12258OrdenCLSt[0]);
            }
            if ( DecimalUtil.compareTo(Z12259OrdenCCn2, T01JC2_A12259OrdenCCn2[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCCn2");
               GXutil.writeLogRaw("Old: ",Z12259OrdenCCn2);
               GXutil.writeLogRaw("Current: ",T01JC2_A12259OrdenCCn2[0]);
            }
            if ( Z12260OrdenCNdc != T01JC2_A12260OrdenCNdc[0] )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCNdc");
               GXutil.writeLogRaw("Old: ",Z12260OrdenCNdc);
               GXutil.writeLogRaw("Current: ",T01JC2_A12260OrdenCNdc[0]);
            }
            if ( GXutil.strcmp(Z12261OrdenCCnA, T01JC2_A12261OrdenCCnA[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCCnA");
               GXutil.writeLogRaw("Old: ",Z12261OrdenCCnA);
               GXutil.writeLogRaw("Current: ",T01JC2_A12261OrdenCCnA[0]);
            }
            if ( GXutil.strcmp(Z12262OrdenCCPA, T01JC2_A12262OrdenCCPA[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCCPA");
               GXutil.writeLogRaw("Old: ",Z12262OrdenCCPA);
               GXutil.writeLogRaw("Current: ",T01JC2_A12262OrdenCCPA[0]);
            }
            if ( DecimalUtil.compareTo(Z12263OrdenCCPr2, T01JC2_A12263OrdenCCPr2[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCCPr2");
               GXutil.writeLogRaw("Old: ",Z12263OrdenCCPr2);
               GXutil.writeLogRaw("Current: ",T01JC2_A12263OrdenCCPr2[0]);
            }
            if ( DecimalUtil.compareTo(Z12203OrdenCCnt, T01JC2_A12203OrdenCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCCnt");
               GXutil.writeLogRaw("Old: ",Z12203OrdenCCnt);
               GXutil.writeLogRaw("Current: ",T01JC2_A12203OrdenCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z12204OrdenCPre, T01JC2_A12204OrdenCPre[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"OrdenCPre");
               GXutil.writeLogRaw("Old: ",Z12204OrdenCPre);
               GXutil.writeLogRaw("Current: ",T01JC2_A12204OrdenCPre[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01JC2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tingqui:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01JC2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPIngQu1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JC1695( )
   {
      beforeValidate1JC1695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JC1695( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JC1695( 0) ;
         checkOptimisticConcurrency1JC1695( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JC1695( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JC1695( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JC22 */
                  pr_default.execute(20, new Object[] {Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId), Boolean.valueOf(n12258OrdenCLSt), Byte.valueOf(A12258OrdenCLSt), Boolean.valueOf(n12259OrdenCCn2), A12259OrdenCCn2, Boolean.valueOf(n12260OrdenCNdc), Integer.valueOf(A12260OrdenCNdc), Boolean.valueOf(n12261OrdenCCnA), A12261OrdenCCnA, Boolean.valueOf(n12262OrdenCCPA), A12262OrdenCCPA, Boolean.valueOf(n12263OrdenCCPr2), A12263OrdenCCPr2, Boolean.valueOf(n12203OrdenCCnt), A12203OrdenCCnt, Boolean.valueOf(n12204OrdenCPre), A12204OrdenCPre, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQu1");
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
            load1JC1695( ) ;
         }
         endLevel1JC1695( ) ;
      }
      closeExtendedTableCursors1JC1695( ) ;
   }

   public void update1JC1695( )
   {
      beforeValidate1JC1695( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JC1695( ) ;
      }
      if ( ( nIsMod_1695 != 0 ) || ( nIsDirty_1695 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JC1695( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JC1695( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JC1695( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01JC23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n12258OrdenCLSt), Byte.valueOf(A12258OrdenCLSt), Boolean.valueOf(n12259OrdenCCn2), A12259OrdenCCn2, Boolean.valueOf(n12260OrdenCNdc), Integer.valueOf(A12260OrdenCNdc), Boolean.valueOf(n12261OrdenCCnA), A12261OrdenCCnA, Boolean.valueOf(n12262OrdenCCPA), A12262OrdenCCPA, Boolean.valueOf(n12263OrdenCCPr2), A12263OrdenCCPr2, Boolean.valueOf(n12203OrdenCCnt), A12203OrdenCCnt, Boolean.valueOf(n12204OrdenCPre), A12204OrdenCPre, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQu1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPIngQu1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1JC1695( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JC1695( ) ;
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
            endLevel1JC1695( ) ;
         }
      }
      closeExtendedTableCursors1JC1695( ) ;
   }

   public void deferredUpdate1JC1695( )
   {
   }

   public void delete1JC1695( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JC1695( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JC1695( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JC1695( ) ;
         afterConfirm1JC1695( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JC1695( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JC24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID), Short.valueOf(A12206OrdenCLnId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIngQu1");
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
      sMode1695 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JC1695( ) ;
      Gx_mode = sMode1695 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JC1695( )
   {
      standaloneModal1JC1695( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* Level */ && true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = A12205OrdenCID ;
            GXv_char3[0] = A719PrdNum ;
            GXv_char2[0] = AV33Msg_err ;
            new app.pingq00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
            tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
            tingqui_impl.this.A12205OrdenCID = GXv_int7[0] ;
            tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
            tingqui_impl.this.AV33Msg_err = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", AV33Msg_err);
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV33Msg_err)==0) )
         {
            GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
            httpContext.GX_msglist.addItem(AV33Msg_err, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && true /* Level */ && true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_int8[0] = A795PrvNum ;
            GXv_decimal9[0] = A12204OrdenCPre ;
            GXv_char2[0] = AV34Msg_err2 ;
            new app.pingqu01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9, GXv_char2) ;
            tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
            tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
            tingqui_impl.this.A795PrvNum = GXv_int8[0] ;
            tingqui_impl.this.A12204OrdenCPre = GXv_decimal9[0] ;
            tingqui_impl.this.AV34Msg_err2 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", AV34Msg_err2);
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV34Msg_err2)==0) )
         {
            GXCCtl = "PRDNUM_" + sGXsfl_55_idx ;
            httpContext.GX_msglist.addItem(AV34Msg_err2, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( A12258OrdenCLSt > 0 ) && ( isDlt( )  || isUpd( )  ) )
         {
            GXCCtl = "ORDENCLST_" + sGXsfl_55_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Linea Ingresa Almacen", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtOrdenCLSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01JC25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01JC25_A718PrdNom[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel1JC1695( )
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

   public void scanStart1JC1695( )
   {
      /* Scan By routine */
      /* Using cursor T01JC26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A12205OrdenCID)});
      RcdFound1695 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1695 = (short)(1) ;
         A12206OrdenCLnId = T01JC26_A12206OrdenCLnId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JC1695( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1695 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1695 = (short)(1) ;
         A12206OrdenCLnId = T01JC26_A12206OrdenCLnId[0] ;
      }
   }

   public void scanEnd1JC1695( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1JC1695( )
   {
      /* After Confirm Rules */
      if ( (0==A12206OrdenCLnId) && ( true /* After */ || true /* After */ ) )
      {
         GXCCtl = "ORDENCLNID_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Invalido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCLnId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1JC1695( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JC1695( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JC1695( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JC1695( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JC1695( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JC1695( )
   {
      edtOrdenCLnId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLnId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLnId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCnt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCPre_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCLSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLSt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCCn2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCn2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCn2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCNdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCNdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCNdc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCCnA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCnA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCnA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCCPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCPA_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtOrdenCCPr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCCPr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCCPr2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1JC1695( )
   {
   }

   public void send_integrity_lvl_hashes1JC1694( )
   {
   }

   public void subsflControlProps_551695( )
   {
      edtavnRcdDeleted_1695_Internalname = "vNRCDDELETED_1695_"+sGXsfl_55_idx ;
      edtOrdenCLnId_Internalname = "ORDENCLNID_"+sGXsfl_55_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_55_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_55_idx ;
      edtOrdenCCnt_Internalname = "ORDENCCNT_"+sGXsfl_55_idx ;
      edtOrdenCPre_Internalname = "ORDENCPRE_"+sGXsfl_55_idx ;
      edtOrdenCLSt_Internalname = "ORDENCLST_"+sGXsfl_55_idx ;
      edtOrdenCCn2_Internalname = "ORDENCCN2_"+sGXsfl_55_idx ;
      edtOrdenCNdc_Internalname = "ORDENCNDC_"+sGXsfl_55_idx ;
      edtOrdenCCnA_Internalname = "ORDENCCNA_"+sGXsfl_55_idx ;
      edtOrdenCCPA_Internalname = "ORDENCCPA_"+sGXsfl_55_idx ;
      edtOrdenCCPr2_Internalname = "ORDENCCPR2_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551695( )
   {
      edtavnRcdDeleted_1695_Internalname = "vNRCDDELETED_1695_"+sGXsfl_55_fel_idx ;
      edtOrdenCLnId_Internalname = "ORDENCLNID_"+sGXsfl_55_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_55_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_55_fel_idx ;
      edtOrdenCCnt_Internalname = "ORDENCCNT_"+sGXsfl_55_fel_idx ;
      edtOrdenCPre_Internalname = "ORDENCPRE_"+sGXsfl_55_fel_idx ;
      edtOrdenCLSt_Internalname = "ORDENCLST_"+sGXsfl_55_fel_idx ;
      edtOrdenCCn2_Internalname = "ORDENCCN2_"+sGXsfl_55_fel_idx ;
      edtOrdenCNdc_Internalname = "ORDENCNDC_"+sGXsfl_55_fel_idx ;
      edtOrdenCCnA_Internalname = "ORDENCCNA_"+sGXsfl_55_fel_idx ;
      edtOrdenCCPA_Internalname = "ORDENCCPA_"+sGXsfl_55_fel_idx ;
      edtOrdenCCPr2_Internalname = "ORDENCCPR2_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1JC1695( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551695( ) ;
      sendRow1JC1695( ) ;
   }

   public void sendRow1JC1695( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1695_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1695_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1695), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1695), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1695_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1695_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCLnId_Internalname,GXutil.ltrim( localUtil.ntoc( A12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12206OrdenCLnId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCLnId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCLnId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCCnt_Enabled!=0) ? localUtil.format( A12203OrdenCCnt, "ZZZZZ9.99") : localUtil.format( A12203OrdenCCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCPre_Enabled!=0) ? localUtil.format( A12204OrdenCPre, "ZZZZZZZ9.999") : localUtil.format( A12204OrdenCPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCLSt_Internalname,GXutil.ltrim( localUtil.ntoc( A12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCLSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12258OrdenCLSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A12258OrdenCLSt), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCLSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCLSt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCCn2_Internalname,GXutil.ltrim( localUtil.ntoc( A12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCCn2_Enabled!=0) ? localUtil.format( A12259OrdenCCn2, "ZZZZZ9.99") : localUtil.format( A12259OrdenCCn2, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCCn2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCCn2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCNdc_Internalname,GXutil.ltrim( localUtil.ntoc( A12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCNdc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12260OrdenCNdc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12260OrdenCNdc), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCNdc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCNdc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCCnA_Internalname,GXutil.rtrim( A12261OrdenCCnA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCCnA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCCnA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCCPA_Internalname,GXutil.rtrim( A12262OrdenCCPA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCCPA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCCPA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1695_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdenCCPr2_Internalname,GXutil.ltrim( localUtil.ntoc( A12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOrdenCCPr2_Enabled!=0) ? localUtil.format( A12263OrdenCCPr2, "ZZZZZZZ9.99999") : localUtil.format( A12263OrdenCCPr2, "ZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdenCCPr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOrdenCCPr2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1JC1695( ) ;
      GXCCtl = "Z12206OrdenCLnId_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12206OrdenCLnId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12258OrdenCLSt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12258OrdenCLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12259OrdenCCn2_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12259OrdenCCn2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12260OrdenCNdc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12260OrdenCNdc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12261OrdenCCnA_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12261OrdenCCnA));
      GXCCtl = "Z12262OrdenCCPA_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12262OrdenCCPA));
      GXCCtl = "Z12263OrdenCCPr2_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12263OrdenCCPr2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12203OrdenCCnt_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12203OrdenCCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12204OrdenCPre_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12204OrdenCPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1695_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1695_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1695_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1695, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1695_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1695_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCLNID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLnId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCCNT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCPRE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCLST_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCCN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCn2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCNDC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCNdc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCCNA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCCPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ORDENCCPR2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPr2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1JC1695( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551695( ) ;
      edtavnRcdDeleted_1695_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1695_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCLnId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCLNID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCNT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCPRE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCLSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCLST_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCCn2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCN2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCNdc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCNDC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCCnA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCNA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCCPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCPA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOrdenCCPr2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORDENCCPR2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1695_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1695_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1695");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1695_Internalname ;
         wbErr = true ;
         nRcdDeleted_1695 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1695 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1695_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCLnId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCLnId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ORDENCLNID_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCLnId_Internalname ;
         wbErr = true ;
         A12206OrdenCLnId = (short)(0) ;
      }
      else
      {
         A12206OrdenCLnId = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdenCLnId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOrdenCCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOrdenCCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ORDENCCNT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCCnt_Internalname ;
         wbErr = true ;
         A12203OrdenCCnt = DecimalUtil.ZERO ;
         n12203OrdenCCnt = false ;
      }
      else
      {
         A12203OrdenCCnt = localUtil.ctond( httpContext.cgiGet( edtOrdenCCnt_Internalname)) ;
         n12203OrdenCCnt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOrdenCPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOrdenCPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ORDENCPRE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCPre_Internalname ;
         wbErr = true ;
         A12204OrdenCPre = DecimalUtil.ZERO ;
         n12204OrdenCPre = false ;
      }
      else
      {
         A12204OrdenCPre = localUtil.ctond( httpContext.cgiGet( edtOrdenCPre_Internalname)) ;
         n12204OrdenCPre = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ORDENCLST_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCLSt_Internalname ;
         wbErr = true ;
         A12258OrdenCLSt = (byte)(0) ;
         n12258OrdenCLSt = false ;
      }
      else
      {
         A12258OrdenCLSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtOrdenCLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12258OrdenCLSt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOrdenCCn2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOrdenCCn2_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ORDENCCN2_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCCn2_Internalname ;
         wbErr = true ;
         A12259OrdenCCn2 = DecimalUtil.ZERO ;
         n12259OrdenCCn2 = false ;
      }
      else
      {
         A12259OrdenCCn2 = localUtil.ctond( httpContext.cgiGet( edtOrdenCCn2_Internalname)) ;
         n12259OrdenCCn2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCNdc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrdenCNdc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ORDENCNDC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCNdc_Internalname ;
         wbErr = true ;
         A12260OrdenCNdc = 0 ;
         n12260OrdenCNdc = false ;
      }
      else
      {
         A12260OrdenCNdc = (int)(localUtil.ctol( httpContext.cgiGet( edtOrdenCNdc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12260OrdenCNdc = false ;
      }
      A12261OrdenCCnA = httpContext.cgiGet( edtOrdenCCnA_Internalname) ;
      n12261OrdenCCnA = false ;
      A12262OrdenCCPA = httpContext.cgiGet( edtOrdenCCPA_Internalname) ;
      n12262OrdenCCPA = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOrdenCCPr2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOrdenCCPr2_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ORDENCCPR2_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrdenCCPr2_Internalname ;
         wbErr = true ;
         A12263OrdenCCPr2 = DecimalUtil.ZERO ;
         n12263OrdenCCPr2 = false ;
      }
      else
      {
         A12263OrdenCCPr2 = localUtil.ctond( httpContext.cgiGet( edtOrdenCCPr2_Internalname)) ;
         n12263OrdenCCPr2 = false ;
      }
      GXCCtl = "Z12206OrdenCLnId_" + sGXsfl_55_idx ;
      Z12206OrdenCLnId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12258OrdenCLSt_" + sGXsfl_55_idx ;
      Z12258OrdenCLSt = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12259OrdenCCn2_" + sGXsfl_55_idx ;
      Z12259OrdenCCn2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12260OrdenCNdc_" + sGXsfl_55_idx ;
      Z12260OrdenCNdc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12261OrdenCCnA_" + sGXsfl_55_idx ;
      Z12261OrdenCCnA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12262OrdenCCPA_" + sGXsfl_55_idx ;
      Z12262OrdenCCPA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12263OrdenCCPr2_" + sGXsfl_55_idx ;
      Z12263OrdenCCPr2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12203OrdenCCnt_" + sGXsfl_55_idx ;
      Z12203OrdenCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12204OrdenCPre_" + sGXsfl_55_idx ;
      Z12204OrdenCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_55_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1695_" + sGXsfl_55_idx ;
      nRcdDeleted_1695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1695_" + sGXsfl_55_idx ;
      nRcdExists_1695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1695_" + sGXsfl_55_idx ;
      nIsMod_1695 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOrdenCLnId_Enabled = edtOrdenCLnId_Enabled ;
   }

   public void confirmValues1JC0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551695( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551695( ) ;
         httpContext.changePostValue( "Z12206OrdenCLnId_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12206OrdenCLnId_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12206OrdenCLnId_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12258OrdenCLSt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12258OrdenCLSt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12258OrdenCLSt_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12259OrdenCCn2_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12259OrdenCCn2_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12259OrdenCCn2_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12260OrdenCNdc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12260OrdenCNdc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12260OrdenCNdc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12261OrdenCCnA_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12261OrdenCCnA_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12261OrdenCCnA_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12262OrdenCCPA_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12262OrdenCCPA_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12262OrdenCCPA_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12263OrdenCCPr2_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12263OrdenCCPr2_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12263OrdenCCPr2_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12203OrdenCCnt_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12203OrdenCCnt_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12203OrdenCCnt_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12204OrdenCPre_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12204OrdenCPre_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12204OrdenCPre_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tingqui", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TIngQui");
      forbiddenHiddens.add("OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tingqui:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12205OrdenCID", GXutil.ltrim( localUtil.ntoc( Z12205OrdenCID, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12201OrdenCFc", localUtil.dtoc( Z12201OrdenCFc, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12202OrdenCEst", GXutil.ltrim( localUtil.ntoc( Z12202OrdenCEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV33Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR2", GXutil.rtrim( AV34Msg_err2));
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
      return formatLink("app.tingqui", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TIngQui" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ingresos Quimicos", "") ;
   }

   public void initializeNonKey1JC1694( )
   {
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A12201OrdenCFc = GXutil.today( ) ;
      n12201OrdenCFc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
      A12202OrdenCEst = (byte)(0) ;
      n12202OrdenCEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
      Z12201OrdenCFc = GXutil.nullDate() ;
      Z12202OrdenCEst = (byte)(0) ;
      Z795PrvNum = 0 ;
   }

   public void initAll1JC1694( )
   {
      A12205OrdenCID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
      initializeNonKey1JC1694( ) ;
   }

   public void standaloneModalInsert( )
   {
      A12201OrdenCFc = i12201OrdenCFc ;
      n12201OrdenCFc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
      A12202OrdenCEst = i12202OrdenCEst ;
      n12202OrdenCEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
   }

   public void initializeNonKey1JC1695( )
   {
      AV33Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", AV33Msg_err);
      AV34Msg_err2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", AV34Msg_err2);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A12203OrdenCCnt = DecimalUtil.ZERO ;
      n12203OrdenCCnt = false ;
      A12204OrdenCPre = DecimalUtil.ZERO ;
      n12204OrdenCPre = false ;
      A12258OrdenCLSt = (byte)(0) ;
      n12258OrdenCLSt = false ;
      A12259OrdenCCn2 = DecimalUtil.doubleToDec(0) ;
      n12259OrdenCCn2 = false ;
      A12260OrdenCNdc = 0 ;
      n12260OrdenCNdc = false ;
      A12261OrdenCCnA = "*" ;
      n12261OrdenCCnA = false ;
      A12262OrdenCCPA = "*" ;
      n12262OrdenCCPA = false ;
      A12263OrdenCCPr2 = DecimalUtil.ZERO ;
      n12263OrdenCCPr2 = false ;
      Z12258OrdenCLSt = (byte)(0) ;
      Z12259OrdenCCn2 = DecimalUtil.ZERO ;
      Z12260OrdenCNdc = 0 ;
      Z12261OrdenCCnA = "" ;
      Z12262OrdenCCPA = "" ;
      Z12263OrdenCCPr2 = DecimalUtil.ZERO ;
      Z12203OrdenCCnt = DecimalUtil.ZERO ;
      Z12204OrdenCPre = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1JC1695( )
   {
      A12206OrdenCLnId = (short)(0) ;
      initializeNonKey1JC1695( ) ;
   }

   public void standaloneModalInsert1JC1695( )
   {
      A12258OrdenCLSt = i12258OrdenCLSt ;
      n12258OrdenCLSt = false ;
      A12259OrdenCCn2 = i12259OrdenCCn2 ;
      n12259OrdenCCn2 = false ;
      A12260OrdenCNdc = i12260OrdenCNdc ;
      n12260OrdenCNdc = false ;
      A12261OrdenCCnA = i12261OrdenCCnA ;
      n12261OrdenCCnA = false ;
      A12262OrdenCCPA = i12262OrdenCCPA ;
      n12262OrdenCCPA = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241582972", true, true);
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
      httpContext.AddJavascriptSource("tingqui.js", "?20268241582973", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1695( )
   {
      edtOrdenCLnId_Enabled = defedtOrdenCLnId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrdenCLnId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrdenCLnId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1695, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1695_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12206OrdenCLnId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLnId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12203OrdenCCnt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12258OrdenCLSt, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCLSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12259OrdenCCn2, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCn2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12260OrdenCNdc, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCNdc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12261OrdenCCnA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCnA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12262OrdenCCPA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12263OrdenCCPr2, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrdenCCPr2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtOrdenCID_Internalname = "ORDENCID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOrdenCFc_Internalname = "ORDENCFC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      cmbOrdenCEst.setInternalname( "ORDENCEST" );
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtavnRcdDeleted_1695_Internalname = "vNRCDDELETED_1695" ;
      edtOrdenCLnId_Internalname = "ORDENCLNID" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtOrdenCCnt_Internalname = "ORDENCCNT" ;
      edtOrdenCPre_Internalname = "ORDENCPRE" ;
      edtOrdenCLSt_Internalname = "ORDENCLST" ;
      edtOrdenCCn2_Internalname = "ORDENCCN2" ;
      edtOrdenCNdc_Internalname = "ORDENCNDC" ;
      edtOrdenCCnA_Internalname = "ORDENCCNA" ;
      edtOrdenCCPA_Internalname = "ORDENCCPA" ;
      edtOrdenCCPr2_Internalname = "ORDENCCPR2" ;
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
      Form.setCaption( httpContext.getMessage( "Ingresos Quimicos", "") );
      edtOrdenCCPr2_Jsonclick = "" ;
      edtOrdenCCPA_Jsonclick = "" ;
      edtOrdenCCnA_Jsonclick = "" ;
      edtOrdenCNdc_Jsonclick = "" ;
      edtOrdenCCn2_Jsonclick = "" ;
      edtOrdenCLSt_Jsonclick = "" ;
      edtOrdenCPre_Jsonclick = "" ;
      edtOrdenCCnt_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtOrdenCLnId_Jsonclick = "" ;
      edtavnRcdDeleted_1695_Jsonclick = "" ;
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
      edtOrdenCCPr2_Enabled = 1 ;
      edtOrdenCCPA_Enabled = 1 ;
      edtOrdenCCnA_Enabled = 1 ;
      edtOrdenCNdc_Enabled = 1 ;
      edtOrdenCCn2_Enabled = 1 ;
      edtOrdenCLSt_Enabled = 1 ;
      edtOrdenCPre_Enabled = 1 ;
      edtOrdenCCnt_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtOrdenCLnId_Enabled = 1 ;
      edtavnRcdDeleted_1695_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNum_Enabled = 1 ;
      cmbOrdenCEst.setJsonclick( "" );
      cmbOrdenCEst.setEnabled( 1 );
      cmbOrdenCEst.setIBackground( (int)(0xFFFFFF) );
      edtOrdenCFc_Jsonclick = "" ;
      edtOrdenCFc_Backcolor = (int)(0xFFFFFF) ;
      edtOrdenCFc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOrdenCID_Jsonclick = "" ;
      edtOrdenCID_Backcolor = (int)(0xFFFFFF) ;
      edtOrdenCID_Enabled = 1 ;
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

   public void xc_4_1JC1694( )
   {
      if ( (0==A12205OrdenCID) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = (int)(A12205OrdenCID) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INGQUI", ""), GXv_int8) ;
         A12205OrdenCID = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
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

   public void xc_14_1JC1695( String Gx_mode ,
                              String A396EmprCod ,
                              long A12205OrdenCID ,
                              String A719PrdNum ,
                              String AV33Msg_err )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12205OrdenCID ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV33Msg_err ;
         new app.pingq00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A12205OrdenCID = GXv_int7[0] ;
         A719PrdNum = GXv_char3[0] ;
         AV33Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12205OrdenCID), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", AV33Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12205OrdenCID, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_1JC1695( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              int A795PrvNum ,
                              java.math.BigDecimal A12204OrdenCPre ,
                              String AV34Msg_err2 )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int8[0] = A795PrvNum ;
         GXv_decimal9[0] = A12204OrdenCPre ;
         GXv_char2[0] = AV34Msg_err2 ;
         new app.pingqu01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A795PrvNum = GXv_int8[0] ;
         A12204OrdenCPre = GXv_decimal9[0] ;
         AV34Msg_err2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", AV34Msg_err2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Msg_err2))+"\"") ;
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
      subsflControlProps_551695( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JC1695( ) ;
         standaloneModal1JC1695( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JC1695( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551695( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbOrdenCEst.setName( "ORDENCEST" );
      cmbOrdenCEst.setWebtags( "" );
      cmbOrdenCEst.addItem("0", httpContext.getMessage( "Pendiente Ingreso Almacen", ""), (short)(0));
      cmbOrdenCEst.addItem("1", httpContext.getMessage( "Ingresada Almacen", ""), (short)(0));
      if ( cmbOrdenCEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A12202OrdenCEst) )
         {
            A12202OrdenCEst = (byte)(0) ;
            n12202OrdenCEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.str( A12202OrdenCEst, 1, 0));
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01JC27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JC27_A407EmprNom[0] ;
      n407EmprNom = T01JC27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      GX_FocusControl = cmbOrdenCEst.getInternalname() ;
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

   public void valid_Ordencid( )
   {
      n12201OrdenCFc = false ;
      n12202OrdenCEst = false ;
      A12202OrdenCEst = (byte)(GXutil.lval( cmbOrdenCEst.getValue())) ;
      n12202OrdenCEst = false ;
      cmbOrdenCEst.setValue( GXutil.str( A12202OrdenCEst, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbOrdenCEst.getItemCount() > 0 )
      {
         A12202OrdenCEst = (byte)(GXutil.lval( cmbOrdenCEst.getValidValue(GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0))))) ;
         n12202OrdenCEst = false ;
         cmbOrdenCEst.setValue( GXutil.str( A12202OrdenCEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOrdenCEst.setValue( GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12201OrdenCFc", localUtil.format(A12201OrdenCFc, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12202OrdenCEst", GXutil.ltrim( localUtil.ntoc( A12202OrdenCEst, (byte)(1), (byte)(0), ".", "")));
      cmbOrdenCEst.setValue( GXutil.trim( GXutil.str( A12202OrdenCEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOrdenCEst.getInternalname(), "Values", cmbOrdenCEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12205OrdenCID", GXutil.ltrim( localUtil.ntoc( Z12205OrdenCID, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12201OrdenCFc", localUtil.format(Z12201OrdenCFc, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12202OrdenCEst", GXutil.ltrim( localUtil.ntoc( Z12202OrdenCEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prvnum( )
   {
      n795PrvNum = false ;
      n794PrvNom = false ;
      /* Using cursor T01JC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n795PrvNum), Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvNum_Internalname ;
      }
      A794PrvNom = T01JC17_A794PrvNom[0] ;
      n794PrvNom = T01JC17_n794PrvNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Prdnum( )
   {
      n12204OrdenCPre = false ;
      n795PrvNum = false ;
      n719PrdNum = false ;
      /* Using cursor T01JC25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01JC25_A718PrdNom[0] ;
      pr_default.close(23);
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A12205OrdenCID ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV33Msg_err ;
         new app.pingq00(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
         tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tingqui_impl.this.A12205OrdenCID = GXv_int7[0] ;
         A12205OrdenCID = this.A12205OrdenCID ;
         tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         tingqui_impl.this.AV33Msg_err = GXv_char2[0] ;
         AV33Msg_err = this.AV33Msg_err ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV33Msg_err)==0) )
      {
         httpContext.GX_msglist.addItem(AV33Msg_err, 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int8[0] = A795PrvNum ;
         GXv_decimal9[0] = A12204OrdenCPre ;
         GXv_char2[0] = AV34Msg_err2 ;
         new app.pingqu01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9, GXv_char2) ;
         tingqui_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tingqui_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         tingqui_impl.this.A795PrvNum = GXv_int8[0] ;
         A795PrvNum = this.A795PrvNum ;
         tingqui_impl.this.A12204OrdenCPre = GXv_decimal9[0] ;
         A12204OrdenCPre = this.A12204OrdenCPre ;
         tingqui_impl.this.AV34Msg_err2 = GXv_char2[0] ;
         AV34Msg_err2 = this.AV34Msg_err2 ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", AV34Msg_err2)==0) )
      {
         httpContext.GX_msglist.addItem(AV34Msg_err2, 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12205OrdenCID", GXutil.ltrim( localUtil.ntoc( A12205OrdenCID, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_err", GXutil.rtrim( AV33Msg_err));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12204OrdenCPre", GXutil.ltrim( localUtil.ntoc( A12204OrdenCPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_err2", GXutil.rtrim( AV34Msg_err2));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A12201OrdenCFc',fld:'ORDENCFC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'INFORME ORDEN COMPRA'","{handler:'e121JC2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A12205OrdenCID',fld:'ORDENCID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'INFORME ORDEN COMPRA'",",oparms:[{av:'A12205OrdenCID',fld:'ORDENCID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ORDENCID","{handler:'valid_Ordencid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12205OrdenCID',fld:'ORDENCID',pic:'ZZZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A12201OrdenCFc',fld:'ORDENCFC',pic:''},{av:'cmbOrdenCEst'},{av:'A12202OrdenCEst',fld:'ORDENCEST',pic:'9'}]");
      setEventMetadata("VALID_ORDENCID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12201OrdenCFc',fld:'ORDENCFC',pic:''},{av:'cmbOrdenCEst'},{av:'A12202OrdenCEst',fld:'ORDENCEST',pic:'9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12205OrdenCID'},{av:'Z407EmprNom'},{av:'Z12201OrdenCFc'},{av:'Z12202OrdenCEst'},{av:'Z795PrvNum'},{av:'Z794PrvNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ORDENCEST","{handler:'valid_Ordencest',iparms:[]");
      setEventMetadata("VALID_ORDENCEST",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''}]}");
      setEventMetadata("VALID_ORDENCLNID","{handler:'valid_Ordenclnid',iparms:[]");
      setEventMetadata("VALID_ORDENCLNID",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A12204OrdenCPre',fld:'ORDENCPRE',pic:'ZZZZZZZ9.999'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12205OrdenCID',fld:'ORDENCID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'AV33Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV34Msg_err2',fld:'vMSG_ERR2',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A12205OrdenCID',fld:'ORDENCID',pic:'ZZZZZZZZZ9'},{av:'AV33Msg_err',fld:'vMSG_ERR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A12204OrdenCPre',fld:'ORDENCPRE',pic:'ZZZZZZZ9.999'},{av:'AV34Msg_err2',fld:'vMSG_ERR2',pic:''}]}");
      setEventMetadata("VALID_ORDENCPRE","{handler:'valid_Ordencpre',iparms:[]");
      setEventMetadata("VALID_ORDENCPRE",",oparms:[]}");
      setEventMetadata("VALID_ORDENCLST","{handler:'valid_Ordenclst',iparms:[]");
      setEventMetadata("VALID_ORDENCLST",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ordenccpr2',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(25);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12201OrdenCFc = GXutil.nullDate() ;
      Z12259OrdenCCn2 = DecimalUtil.ZERO ;
      Z12261OrdenCCnA = "" ;
      Z12262OrdenCCPA = "" ;
      Z12263OrdenCCPr2 = DecimalUtil.ZERO ;
      Z12203OrdenCCnt = DecimalUtil.ZERO ;
      Z12204OrdenCPre = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV33Msg_err = "" ;
      A12204OrdenCPre = DecimalUtil.ZERO ;
      AV34Msg_err2 = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A12201OrdenCFc = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A794PrvNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1695 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1694 = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A12203OrdenCCnt = DecimalUtil.ZERO ;
      A12259OrdenCCn2 = DecimalUtil.ZERO ;
      A12261OrdenCCnA = "" ;
      A12262OrdenCCPA = "" ;
      A12263OrdenCCPr2 = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV31Lit1 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV10EmprCod = "" ;
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      T01JC7_A407EmprNom = new String[] {""} ;
      T01JC7_n407EmprNom = new boolean[] {false} ;
      T01JC9_A12205OrdenCID = new long[1] ;
      T01JC9_A407EmprNom = new String[] {""} ;
      T01JC9_n407EmprNom = new boolean[] {false} ;
      T01JC9_A12201OrdenCFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01JC9_n12201OrdenCFc = new boolean[] {false} ;
      T01JC9_A12202OrdenCEst = new byte[1] ;
      T01JC9_n12202OrdenCEst = new boolean[] {false} ;
      T01JC9_A794PrvNom = new String[] {""} ;
      T01JC9_n794PrvNom = new boolean[] {false} ;
      T01JC9_A396EmprCod = new String[] {""} ;
      T01JC9_A795PrvNum = new int[1] ;
      T01JC9_n795PrvNum = new boolean[] {false} ;
      T01JC8_A794PrvNom = new String[] {""} ;
      T01JC8_n794PrvNom = new boolean[] {false} ;
      T01JC10_A794PrvNom = new String[] {""} ;
      T01JC10_n794PrvNom = new boolean[] {false} ;
      T01JC11_A396EmprCod = new String[] {""} ;
      T01JC11_A12205OrdenCID = new long[1] ;
      T01JC6_A12205OrdenCID = new long[1] ;
      T01JC6_A12201OrdenCFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01JC6_n12201OrdenCFc = new boolean[] {false} ;
      T01JC6_A12202OrdenCEst = new byte[1] ;
      T01JC6_n12202OrdenCEst = new boolean[] {false} ;
      T01JC6_A396EmprCod = new String[] {""} ;
      T01JC6_A795PrvNum = new int[1] ;
      T01JC6_n795PrvNum = new boolean[] {false} ;
      T01JC12_A396EmprCod = new String[] {""} ;
      T01JC12_A12205OrdenCID = new long[1] ;
      T01JC13_A396EmprCod = new String[] {""} ;
      T01JC13_A12205OrdenCID = new long[1] ;
      T01JC5_A12205OrdenCID = new long[1] ;
      T01JC5_A12201OrdenCFc = new java.util.Date[] {GXutil.nullDate()} ;
      T01JC5_n12201OrdenCFc = new boolean[] {false} ;
      T01JC5_A12202OrdenCEst = new byte[1] ;
      T01JC5_n12202OrdenCEst = new boolean[] {false} ;
      T01JC5_A396EmprCod = new String[] {""} ;
      T01JC5_A795PrvNum = new int[1] ;
      T01JC5_n795PrvNum = new boolean[] {false} ;
      T01JC17_A794PrvNom = new String[] {""} ;
      T01JC17_n794PrvNom = new boolean[] {false} ;
      T01JC18_A396EmprCod = new String[] {""} ;
      T01JC18_A12205OrdenCID = new long[1] ;
      Z718PrdNom = "" ;
      T01JC19_A12205OrdenCID = new long[1] ;
      T01JC19_A12206OrdenCLnId = new short[1] ;
      T01JC19_A12258OrdenCLSt = new byte[1] ;
      T01JC19_n12258OrdenCLSt = new boolean[] {false} ;
      T01JC19_A12259OrdenCCn2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC19_n12259OrdenCCn2 = new boolean[] {false} ;
      T01JC19_A12260OrdenCNdc = new int[1] ;
      T01JC19_n12260OrdenCNdc = new boolean[] {false} ;
      T01JC19_A12261OrdenCCnA = new String[] {""} ;
      T01JC19_n12261OrdenCCnA = new boolean[] {false} ;
      T01JC19_A12262OrdenCCPA = new String[] {""} ;
      T01JC19_n12262OrdenCCPA = new boolean[] {false} ;
      T01JC19_A12263OrdenCCPr2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC19_n12263OrdenCCPr2 = new boolean[] {false} ;
      T01JC19_A718PrdNom = new String[] {""} ;
      T01JC19_A12203OrdenCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC19_n12203OrdenCCnt = new boolean[] {false} ;
      T01JC19_A12204OrdenCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC19_n12204OrdenCPre = new boolean[] {false} ;
      T01JC19_A396EmprCod = new String[] {""} ;
      T01JC19_A719PrdNum = new String[] {""} ;
      T01JC19_n719PrdNum = new boolean[] {false} ;
      T01JC4_A718PrdNom = new String[] {""} ;
      T01JC20_A718PrdNom = new String[] {""} ;
      T01JC21_A396EmprCod = new String[] {""} ;
      T01JC21_A12205OrdenCID = new long[1] ;
      T01JC21_A12206OrdenCLnId = new short[1] ;
      T01JC3_A12205OrdenCID = new long[1] ;
      T01JC3_A12206OrdenCLnId = new short[1] ;
      T01JC3_A12258OrdenCLSt = new byte[1] ;
      T01JC3_n12258OrdenCLSt = new boolean[] {false} ;
      T01JC3_A12259OrdenCCn2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC3_n12259OrdenCCn2 = new boolean[] {false} ;
      T01JC3_A12260OrdenCNdc = new int[1] ;
      T01JC3_n12260OrdenCNdc = new boolean[] {false} ;
      T01JC3_A12261OrdenCCnA = new String[] {""} ;
      T01JC3_n12261OrdenCCnA = new boolean[] {false} ;
      T01JC3_A12262OrdenCCPA = new String[] {""} ;
      T01JC3_n12262OrdenCCPA = new boolean[] {false} ;
      T01JC3_A12263OrdenCCPr2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC3_n12263OrdenCCPr2 = new boolean[] {false} ;
      T01JC3_A12203OrdenCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC3_n12203OrdenCCnt = new boolean[] {false} ;
      T01JC3_A12204OrdenCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC3_n12204OrdenCPre = new boolean[] {false} ;
      T01JC3_A396EmprCod = new String[] {""} ;
      T01JC3_A719PrdNum = new String[] {""} ;
      T01JC3_n719PrdNum = new boolean[] {false} ;
      T01JC2_A12205OrdenCID = new long[1] ;
      T01JC2_A12206OrdenCLnId = new short[1] ;
      T01JC2_A12258OrdenCLSt = new byte[1] ;
      T01JC2_n12258OrdenCLSt = new boolean[] {false} ;
      T01JC2_A12259OrdenCCn2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC2_n12259OrdenCCn2 = new boolean[] {false} ;
      T01JC2_A12260OrdenCNdc = new int[1] ;
      T01JC2_n12260OrdenCNdc = new boolean[] {false} ;
      T01JC2_A12261OrdenCCnA = new String[] {""} ;
      T01JC2_n12261OrdenCCnA = new boolean[] {false} ;
      T01JC2_A12262OrdenCCPA = new String[] {""} ;
      T01JC2_n12262OrdenCCPA = new boolean[] {false} ;
      T01JC2_A12263OrdenCCPr2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC2_n12263OrdenCCPr2 = new boolean[] {false} ;
      T01JC2_A12203OrdenCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC2_n12203OrdenCCnt = new boolean[] {false} ;
      T01JC2_A12204OrdenCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JC2_n12204OrdenCPre = new boolean[] {false} ;
      T01JC2_A396EmprCod = new String[] {""} ;
      T01JC2_A719PrdNum = new String[] {""} ;
      T01JC2_n719PrdNum = new boolean[] {false} ;
      T01JC25_A718PrdNom = new String[] {""} ;
      T01JC26_A396EmprCod = new String[] {""} ;
      T01JC26_A12205OrdenCID = new long[1] ;
      T01JC26_A12206OrdenCLnId = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i12201OrdenCFc = GXutil.nullDate() ;
      i12259OrdenCCn2 = DecimalUtil.ZERO ;
      i12261OrdenCCnA = "" ;
      i12262OrdenCCPA = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01JC27_A407EmprNom = new String[] {""} ;
      T01JC27_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ12201OrdenCFc = GXutil.nullDate() ;
      ZZ794PrvNom = "" ;
      GXv_int7 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      ZV33Msg_err = "" ;
      ZV34Msg_err2 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tingqui__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tingqui__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tingqui__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tingqui__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tingqui__default(),
         new Object[] {
             new Object[] {
            T01JC2_A12205OrdenCID, T01JC2_A12206OrdenCLnId, T01JC2_A12258OrdenCLSt, T01JC2_n12258OrdenCLSt, T01JC2_A12259OrdenCCn2, T01JC2_n12259OrdenCCn2, T01JC2_A12260OrdenCNdc, T01JC2_n12260OrdenCNdc, T01JC2_A12261OrdenCCnA, T01JC2_n12261OrdenCCnA,
            T01JC2_A12262OrdenCCPA, T01JC2_n12262OrdenCCPA, T01JC2_A12263OrdenCCPr2, T01JC2_n12263OrdenCCPr2, T01JC2_A12203OrdenCCnt, T01JC2_n12203OrdenCCnt, T01JC2_A12204OrdenCPre, T01JC2_n12204OrdenCPre, T01JC2_A396EmprCod, T01JC2_A719PrdNum,
            T01JC2_n719PrdNum
            }
            , new Object[] {
            T01JC3_A12205OrdenCID, T01JC3_A12206OrdenCLnId, T01JC3_A12258OrdenCLSt, T01JC3_n12258OrdenCLSt, T01JC3_A12259OrdenCCn2, T01JC3_n12259OrdenCCn2, T01JC3_A12260OrdenCNdc, T01JC3_n12260OrdenCNdc, T01JC3_A12261OrdenCCnA, T01JC3_n12261OrdenCCnA,
            T01JC3_A12262OrdenCCPA, T01JC3_n12262OrdenCCPA, T01JC3_A12263OrdenCCPr2, T01JC3_n12263OrdenCCPr2, T01JC3_A12203OrdenCCnt, T01JC3_n12203OrdenCCnt, T01JC3_A12204OrdenCPre, T01JC3_n12204OrdenCPre, T01JC3_A396EmprCod, T01JC3_A719PrdNum,
            T01JC3_n719PrdNum
            }
            , new Object[] {
            T01JC4_A718PrdNom
            }
            , new Object[] {
            T01JC5_A12205OrdenCID, T01JC5_A12201OrdenCFc, T01JC5_n12201OrdenCFc, T01JC5_A12202OrdenCEst, T01JC5_n12202OrdenCEst, T01JC5_A396EmprCod, T01JC5_A795PrvNum, T01JC5_n795PrvNum
            }
            , new Object[] {
            T01JC6_A12205OrdenCID, T01JC6_A12201OrdenCFc, T01JC6_n12201OrdenCFc, T01JC6_A12202OrdenCEst, T01JC6_n12202OrdenCEst, T01JC6_A396EmprCod, T01JC6_A795PrvNum, T01JC6_n795PrvNum
            }
            , new Object[] {
            T01JC7_A407EmprNom, T01JC7_n407EmprNom
            }
            , new Object[] {
            T01JC8_A794PrvNom, T01JC8_n794PrvNom
            }
            , new Object[] {
            T01JC9_A12205OrdenCID, T01JC9_A407EmprNom, T01JC9_n407EmprNom, T01JC9_A12201OrdenCFc, T01JC9_n12201OrdenCFc, T01JC9_A12202OrdenCEst, T01JC9_n12202OrdenCEst, T01JC9_A794PrvNom, T01JC9_n794PrvNom, T01JC9_A396EmprCod,
            T01JC9_A795PrvNum, T01JC9_n795PrvNum
            }
            , new Object[] {
            T01JC10_A794PrvNom, T01JC10_n794PrvNom
            }
            , new Object[] {
            T01JC11_A396EmprCod, T01JC11_A12205OrdenCID
            }
            , new Object[] {
            T01JC12_A396EmprCod, T01JC12_A12205OrdenCID
            }
            , new Object[] {
            T01JC13_A396EmprCod, T01JC13_A12205OrdenCID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JC17_A794PrvNom, T01JC17_n794PrvNom
            }
            , new Object[] {
            T01JC18_A396EmprCod, T01JC18_A12205OrdenCID
            }
            , new Object[] {
            T01JC19_A12205OrdenCID, T01JC19_A12206OrdenCLnId, T01JC19_A12258OrdenCLSt, T01JC19_n12258OrdenCLSt, T01JC19_A12259OrdenCCn2, T01JC19_n12259OrdenCCn2, T01JC19_A12260OrdenCNdc, T01JC19_n12260OrdenCNdc, T01JC19_A12261OrdenCCnA, T01JC19_n12261OrdenCCnA,
            T01JC19_A12262OrdenCCPA, T01JC19_n12262OrdenCCPA, T01JC19_A12263OrdenCCPr2, T01JC19_n12263OrdenCCPr2, T01JC19_A718PrdNom, T01JC19_A12203OrdenCCnt, T01JC19_n12203OrdenCCnt, T01JC19_A12204OrdenCPre, T01JC19_n12204OrdenCPre, T01JC19_A396EmprCod,
            T01JC19_A719PrdNum, T01JC19_n719PrdNum
            }
            , new Object[] {
            T01JC20_A718PrdNom
            }
            , new Object[] {
            T01JC21_A396EmprCod, T01JC21_A12205OrdenCID, T01JC21_A12206OrdenCLnId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JC25_A718PrdNom
            }
            , new Object[] {
            T01JC26_A396EmprCod, T01JC26_A12205OrdenCID, T01JC26_A12206OrdenCLnId
            }
            , new Object[] {
            T01JC27_A407EmprNom, T01JC27_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TIngQui" ;
      Z12263OrdenCCPr2 = DecimalUtil.ZERO ;
      n12263OrdenCCPr2 = false ;
      A12263OrdenCCPr2 = DecimalUtil.ZERO ;
      n12263OrdenCCPr2 = false ;
      Z12262OrdenCCPA = "*" ;
      n12262OrdenCCPA = false ;
      A12262OrdenCCPA = "*" ;
      n12262OrdenCCPA = false ;
      i12262OrdenCCPA = "*" ;
      n12262OrdenCCPA = false ;
      Z12261OrdenCCnA = "*" ;
      n12261OrdenCCnA = false ;
      A12261OrdenCCnA = "*" ;
      n12261OrdenCCnA = false ;
      i12261OrdenCCnA = "*" ;
      n12261OrdenCCnA = false ;
      Z12260OrdenCNdc = 0 ;
      n12260OrdenCNdc = false ;
      A12260OrdenCNdc = 0 ;
      n12260OrdenCNdc = false ;
      i12260OrdenCNdc = 0 ;
      n12260OrdenCNdc = false ;
      Z12259OrdenCCn2 = DecimalUtil.doubleToDec(0) ;
      n12259OrdenCCn2 = false ;
      A12259OrdenCCn2 = DecimalUtil.doubleToDec(0) ;
      n12259OrdenCCn2 = false ;
      i12259OrdenCCn2 = DecimalUtil.doubleToDec(0) ;
      n12259OrdenCCn2 = false ;
      Z12258OrdenCLSt = (byte)(0) ;
      n12258OrdenCLSt = false ;
      A12258OrdenCLSt = (byte)(0) ;
      n12258OrdenCLSt = false ;
      i12258OrdenCLSt = (byte)(0) ;
      n12258OrdenCLSt = false ;
      Z12202OrdenCEst = (byte)(0) ;
      n12202OrdenCEst = false ;
      A12202OrdenCEst = (byte)(0) ;
      n12202OrdenCEst = false ;
      i12202OrdenCEst = (byte)(0) ;
      n12202OrdenCEst = false ;
      Z12201OrdenCFc = GXutil.today( ) ;
      n12201OrdenCFc = false ;
      A12201OrdenCFc = GXutil.today( ) ;
      n12201OrdenCFc = false ;
      i12201OrdenCFc = GXutil.today( ) ;
      n12201OrdenCFc = false ;
   }

   private byte Z12202OrdenCEst ;
   private byte Z12258OrdenCLSt ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A12202OrdenCEst ;
   private byte A12258OrdenCLSt ;
   private byte AV32ExisteC ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i12202OrdenCEst ;
   private byte i12258OrdenCLSt ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12202OrdenCEst ;
   private short Z12206OrdenCLnId ;
   private short nRcdDeleted_1695 ;
   private short nRcdExists_1695 ;
   private short nIsMod_1695 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1695 ;
   private short RcdFound1695 ;
   private short nBlankRcdUsr1695 ;
   private short A12206OrdenCLnId ;
   private short RcdFound1694 ;
   private short nIsDirty_1694 ;
   private short nIsDirty_1695 ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z12260OrdenCNdc ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtOrdenCID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtOrdenCFc_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtavnRcdDeleted_1695_Enabled ;
   private int edtOrdenCLnId_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtOrdenCCnt_Enabled ;
   private int edtOrdenCPre_Enabled ;
   private int edtOrdenCLSt_Enabled ;
   private int edtOrdenCCn2_Enabled ;
   private int edtOrdenCNdc_Enabled ;
   private int edtOrdenCCnA_Enabled ;
   private int edtOrdenCCPA_Enabled ;
   private int edtOrdenCCPr2_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A12260OrdenCNdc ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtOrdenCLnId_Enabled ;
   private int i12260OrdenCNdc ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPrvNom_Backcolor ;
   private int edtPrvNum_Backcolor ;
   private int edtOrdenCFc_Backcolor ;
   private int edtOrdenCID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ795PrvNum ;
   private int GXv_int8[] ;
   private long Z12205OrdenCID ;
   private long A12205OrdenCID ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ12205OrdenCID ;
   private long GXv_int7[] ;
   private java.math.BigDecimal Z12259OrdenCCn2 ;
   private java.math.BigDecimal Z12263OrdenCCPr2 ;
   private java.math.BigDecimal Z12203OrdenCCnt ;
   private java.math.BigDecimal Z12204OrdenCPre ;
   private java.math.BigDecimal A12204OrdenCPre ;
   private java.math.BigDecimal A12203OrdenCCnt ;
   private java.math.BigDecimal A12259OrdenCCn2 ;
   private java.math.BigDecimal A12263OrdenCCPr2 ;
   private java.math.BigDecimal i12259OrdenCCn2 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12261OrdenCCnA ;
   private String Z12262OrdenCCPA ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV33Msg_err ;
   private String AV34Msg_err2 ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOrdenCID_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtOrdenCID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOrdenCFc_Internalname ;
   private String edtOrdenCFc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String sMode1695 ;
   private String edtavnRcdDeleted_1695_Internalname ;
   private String edtOrdenCLnId_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtOrdenCCnt_Internalname ;
   private String edtOrdenCPre_Internalname ;
   private String edtOrdenCLSt_Internalname ;
   private String edtOrdenCCn2_Internalname ;
   private String edtOrdenCNdc_Internalname ;
   private String edtOrdenCCnA_Internalname ;
   private String edtOrdenCCPA_Internalname ;
   private String edtOrdenCCPr2_Internalname ;
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
   private String AV36Pgmname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1694 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A12261OrdenCCnA ;
   private String A12262OrdenCCPA ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV31Lit1 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV10EmprCod ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z718PrdNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1695_Jsonclick ;
   private String edtOrdenCLnId_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtOrdenCCnt_Jsonclick ;
   private String edtOrdenCPre_Jsonclick ;
   private String edtOrdenCLSt_Jsonclick ;
   private String edtOrdenCCn2_Jsonclick ;
   private String edtOrdenCNdc_Jsonclick ;
   private String edtOrdenCCnA_Jsonclick ;
   private String edtOrdenCCPA_Jsonclick ;
   private String edtOrdenCCPr2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i12261OrdenCCnA ;
   private String i12262OrdenCCPA ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ794PrvNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV33Msg_err ;
   private String ZV34Msg_err2 ;
   private java.util.Date Z12201OrdenCFc ;
   private java.util.Date A12201OrdenCFc ;
   private java.util.Date i12201OrdenCFc ;
   private java.util.Date ZZ12201OrdenCFc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n795PrvNum ;
   private boolean n12204OrdenCPre ;
   private boolean wbErr ;
   private boolean n12202OrdenCEst ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12201OrdenCFc ;
   private boolean n794PrvNom ;
   private boolean returnInSub ;
   private boolean n12258OrdenCLSt ;
   private boolean n12259OrdenCCn2 ;
   private boolean n12260OrdenCNdc ;
   private boolean n12261OrdenCCnA ;
   private boolean n12262OrdenCCPA ;
   private boolean n12263OrdenCCPr2 ;
   private boolean n12203OrdenCCnt ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOrdenCEst ;
   private IDataStoreProvider pr_default ;
   private String[] T01JC7_A407EmprNom ;
   private boolean[] T01JC7_n407EmprNom ;
   private long[] T01JC9_A12205OrdenCID ;
   private String[] T01JC9_A407EmprNom ;
   private boolean[] T01JC9_n407EmprNom ;
   private java.util.Date[] T01JC9_A12201OrdenCFc ;
   private boolean[] T01JC9_n12201OrdenCFc ;
   private byte[] T01JC9_A12202OrdenCEst ;
   private boolean[] T01JC9_n12202OrdenCEst ;
   private String[] T01JC9_A794PrvNom ;
   private boolean[] T01JC9_n794PrvNom ;
   private String[] T01JC9_A396EmprCod ;
   private int[] T01JC9_A795PrvNum ;
   private boolean[] T01JC9_n795PrvNum ;
   private String[] T01JC8_A794PrvNom ;
   private boolean[] T01JC8_n794PrvNom ;
   private String[] T01JC10_A794PrvNom ;
   private boolean[] T01JC10_n794PrvNom ;
   private String[] T01JC11_A396EmprCod ;
   private long[] T01JC11_A12205OrdenCID ;
   private long[] T01JC6_A12205OrdenCID ;
   private java.util.Date[] T01JC6_A12201OrdenCFc ;
   private boolean[] T01JC6_n12201OrdenCFc ;
   private byte[] T01JC6_A12202OrdenCEst ;
   private boolean[] T01JC6_n12202OrdenCEst ;
   private String[] T01JC6_A396EmprCod ;
   private int[] T01JC6_A795PrvNum ;
   private boolean[] T01JC6_n795PrvNum ;
   private String[] T01JC12_A396EmprCod ;
   private long[] T01JC12_A12205OrdenCID ;
   private String[] T01JC13_A396EmprCod ;
   private long[] T01JC13_A12205OrdenCID ;
   private long[] T01JC5_A12205OrdenCID ;
   private java.util.Date[] T01JC5_A12201OrdenCFc ;
   private boolean[] T01JC5_n12201OrdenCFc ;
   private byte[] T01JC5_A12202OrdenCEst ;
   private boolean[] T01JC5_n12202OrdenCEst ;
   private String[] T01JC5_A396EmprCod ;
   private int[] T01JC5_A795PrvNum ;
   private boolean[] T01JC5_n795PrvNum ;
   private String[] T01JC17_A794PrvNom ;
   private boolean[] T01JC17_n794PrvNom ;
   private String[] T01JC18_A396EmprCod ;
   private long[] T01JC18_A12205OrdenCID ;
   private long[] T01JC19_A12205OrdenCID ;
   private short[] T01JC19_A12206OrdenCLnId ;
   private byte[] T01JC19_A12258OrdenCLSt ;
   private boolean[] T01JC19_n12258OrdenCLSt ;
   private java.math.BigDecimal[] T01JC19_A12259OrdenCCn2 ;
   private boolean[] T01JC19_n12259OrdenCCn2 ;
   private int[] T01JC19_A12260OrdenCNdc ;
   private boolean[] T01JC19_n12260OrdenCNdc ;
   private String[] T01JC19_A12261OrdenCCnA ;
   private boolean[] T01JC19_n12261OrdenCCnA ;
   private String[] T01JC19_A12262OrdenCCPA ;
   private boolean[] T01JC19_n12262OrdenCCPA ;
   private java.math.BigDecimal[] T01JC19_A12263OrdenCCPr2 ;
   private boolean[] T01JC19_n12263OrdenCCPr2 ;
   private String[] T01JC19_A718PrdNom ;
   private java.math.BigDecimal[] T01JC19_A12203OrdenCCnt ;
   private boolean[] T01JC19_n12203OrdenCCnt ;
   private java.math.BigDecimal[] T01JC19_A12204OrdenCPre ;
   private boolean[] T01JC19_n12204OrdenCPre ;
   private String[] T01JC19_A396EmprCod ;
   private String[] T01JC19_A719PrdNum ;
   private boolean[] T01JC19_n719PrdNum ;
   private String[] T01JC4_A718PrdNom ;
   private String[] T01JC20_A718PrdNom ;
   private String[] T01JC21_A396EmprCod ;
   private long[] T01JC21_A12205OrdenCID ;
   private short[] T01JC21_A12206OrdenCLnId ;
   private long[] T01JC3_A12205OrdenCID ;
   private short[] T01JC3_A12206OrdenCLnId ;
   private byte[] T01JC3_A12258OrdenCLSt ;
   private boolean[] T01JC3_n12258OrdenCLSt ;
   private java.math.BigDecimal[] T01JC3_A12259OrdenCCn2 ;
   private boolean[] T01JC3_n12259OrdenCCn2 ;
   private int[] T01JC3_A12260OrdenCNdc ;
   private boolean[] T01JC3_n12260OrdenCNdc ;
   private String[] T01JC3_A12261OrdenCCnA ;
   private boolean[] T01JC3_n12261OrdenCCnA ;
   private String[] T01JC3_A12262OrdenCCPA ;
   private boolean[] T01JC3_n12262OrdenCCPA ;
   private java.math.BigDecimal[] T01JC3_A12263OrdenCCPr2 ;
   private boolean[] T01JC3_n12263OrdenCCPr2 ;
   private java.math.BigDecimal[] T01JC3_A12203OrdenCCnt ;
   private boolean[] T01JC3_n12203OrdenCCnt ;
   private java.math.BigDecimal[] T01JC3_A12204OrdenCPre ;
   private boolean[] T01JC3_n12204OrdenCPre ;
   private String[] T01JC3_A396EmprCod ;
   private String[] T01JC3_A719PrdNum ;
   private boolean[] T01JC3_n719PrdNum ;
   private long[] T01JC2_A12205OrdenCID ;
   private short[] T01JC2_A12206OrdenCLnId ;
   private byte[] T01JC2_A12258OrdenCLSt ;
   private boolean[] T01JC2_n12258OrdenCLSt ;
   private java.math.BigDecimal[] T01JC2_A12259OrdenCCn2 ;
   private boolean[] T01JC2_n12259OrdenCCn2 ;
   private int[] T01JC2_A12260OrdenCNdc ;
   private boolean[] T01JC2_n12260OrdenCNdc ;
   private String[] T01JC2_A12261OrdenCCnA ;
   private boolean[] T01JC2_n12261OrdenCCnA ;
   private String[] T01JC2_A12262OrdenCCPA ;
   private boolean[] T01JC2_n12262OrdenCCPA ;
   private java.math.BigDecimal[] T01JC2_A12263OrdenCCPr2 ;
   private boolean[] T01JC2_n12263OrdenCCPr2 ;
   private java.math.BigDecimal[] T01JC2_A12203OrdenCCnt ;
   private boolean[] T01JC2_n12203OrdenCCnt ;
   private java.math.BigDecimal[] T01JC2_A12204OrdenCPre ;
   private boolean[] T01JC2_n12204OrdenCPre ;
   private String[] T01JC2_A396EmprCod ;
   private String[] T01JC2_A719PrdNum ;
   private boolean[] T01JC2_n719PrdNum ;
   private String[] T01JC25_A718PrdNom ;
   private String[] T01JC26_A396EmprCod ;
   private long[] T01JC26_A12205OrdenCID ;
   private short[] T01JC26_A12206OrdenCLnId ;
   private String[] T01JC27_A407EmprNom ;
   private boolean[] T01JC27_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tingqui__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingqui__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingqui__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingqui__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tingqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JC2", "SELECT OrdenCID, OrdenCLnId, OrdenCLSt, OrdenCCn2, OrdenCNdc, OrdenCCnA, OrdenCCPA, OrdenCCPr2, OrdenCCnt, OrdenCPre, EmprCod, PrdNum FROM TXPIngQu1 WHERE EmprCod = ? AND OrdenCID = ? AND OrdenCLnId = ?  FOR UPDATE OF OrdenCLSt, OrdenCCn2, OrdenCNdc, OrdenCCnA, OrdenCCPA, OrdenCCPr2, OrdenCCnt, OrdenCPre, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC3", "SELECT OrdenCID, OrdenCLnId, OrdenCLSt, OrdenCCn2, OrdenCNdc, OrdenCCnA, OrdenCCPA, OrdenCCPr2, OrdenCCnt, OrdenCPre, EmprCod, PrdNum FROM TXPIngQu1 WHERE EmprCod = ? AND OrdenCID = ? AND OrdenCLnId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC4", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC5", "SELECT OrdenCID, OrdenCFc, OrdenCEst, EmprCod, PrvNum FROM TXPIngQui WHERE EmprCod = ? AND OrdenCID = ?  FOR UPDATE OF OrdenCFc, OrdenCEst, PrvNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC6", "SELECT OrdenCID, OrdenCFc, OrdenCEst, EmprCod, PrvNum FROM TXPIngQui WHERE EmprCod = ? AND OrdenCID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC8", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC9", "SELECT /*+ FIRST_ROWS(100) */ TM1.OrdenCID, T2.EmprNom, TM1.OrdenCFc, TM1.OrdenCEst, T3.PrvNom, TM1.EmprCod, TM1.PrvNum FROM ((TXPIngQui TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) WHERE TM1.EmprCod = ? and TM1.OrdenCID = ? ORDER BY TM1.EmprCod, TM1.OrdenCID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC10", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OrdenCID FROM TXPIngQui WHERE EmprCod = ? AND OrdenCID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OrdenCID FROM TXPIngQui WHERE ( OrdenCID > ?) and EmprCod = ? ORDER BY EmprCod, OrdenCID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JC13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OrdenCID FROM TXPIngQui WHERE ( OrdenCID < ?) and EmprCod = ? ORDER BY EmprCod DESC, OrdenCID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JC14", "INSERT INTO TXPIngQui(OrdenCID, OrdenCFc, OrdenCEst, EmprCod, PrvNum) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPIngQui")
         ,new UpdateCursor("T01JC15", "UPDATE TXPIngQui SET OrdenCFc=?, OrdenCEst=?, PrvNum=?  WHERE EmprCod = ? AND OrdenCID = ?", GX_NOMASK, "TXPIngQui")
         ,new UpdateCursor("T01JC16", "DELETE FROM TXPIngQui  WHERE EmprCod = ? AND OrdenCID = ?", GX_NOMASK, "TXPIngQui")
         ,new ForEachCursor("T01JC17", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OrdenCID FROM TXPIngQui WHERE EmprCod = ? ORDER BY EmprCod, OrdenCID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC19", "SELECT T1.OrdenCID, T1.OrdenCLnId, T1.OrdenCLSt, T1.OrdenCCn2, T1.OrdenCNdc, T1.OrdenCCnA, T1.OrdenCCPA, T1.OrdenCCPr2, T2.PrdNom, T1.OrdenCCnt, T1.OrdenCPre, T1.EmprCod, T1.PrdNum FROM (TXPIngQu1 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.OrdenCID = ? and T1.OrdenCLnId = ? ORDER BY T1.EmprCod, T1.OrdenCID, T1.OrdenCLnId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC20", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC21", "SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND OrdenCID = ? AND OrdenCLnId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JC22", "INSERT INTO TXPIngQu1(OrdenCID, OrdenCLnId, OrdenCLSt, OrdenCCn2, OrdenCNdc, OrdenCCnA, OrdenCCPA, OrdenCCPr2, OrdenCCnt, OrdenCPre, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPIngQu1")
         ,new UpdateCursor("T01JC23", "UPDATE TXPIngQu1 SET OrdenCLSt=?, OrdenCCn2=?, OrdenCNdc=?, OrdenCCnA=?, OrdenCCPA=?, OrdenCCPr2=?, OrdenCCnt=?, OrdenCPre=?, PrdNum=?  WHERE EmprCod = ? AND OrdenCID = ? AND OrdenCLnId = ?", GX_NOMASK, "TXPIngQu1")
         ,new UpdateCursor("T01JC24", "DELETE FROM TXPIngQu1  WHERE EmprCod = ? AND OrdenCID = ? AND OrdenCLnId = ?", GX_NOMASK, "TXPIngQu1")
         ,new ForEachCursor("T01JC25", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC26", "SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? and OrdenCID = ? ORDER BY EmprCod, OrdenCID, OrdenCLnId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JC27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((String[]) buf[19])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((String[]) buf[19])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((String[]) buf[20])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
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
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setLong(5, ((Number) parms[7]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 5);
               }
               stmt.setString(11, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 6);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setInt(3, ((Number) parms[5]).intValue());
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 6);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setLong(11, ((Number) parms[19]).longValue());
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

