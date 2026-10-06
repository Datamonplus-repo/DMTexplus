package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrf000_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_1EN1547( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         A11646TransferAO = (byte)(GXutil.lval( httpContext.GetPar( "TransferAO"))) ;
         n11646TransferAO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         AV32Msg_erro = httpContext.GetPar( "Msg_erro") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_erro", AV32Msg_erro);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1EN1548( A396EmprCod, A719PrdNum, A11646TransferAO, AV32Msg_erro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         A11648TransferAD = (byte)(GXutil.lval( httpContext.GetPar( "TransferAD"))) ;
         n11648TransferAD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         AV33Msg_errd = httpContext.GetPar( "Msg_errd") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_errd", AV33Msg_errd);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1EN1548( A396EmprCod, A719PrdNum, A11648TransferAD, AV33Msg_errd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         A11646TransferAO = (byte)(GXutil.lval( httpContext.GetPar( "TransferAO"))) ;
         n11646TransferAO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         AV34ExisCC = CommonUtil.decimalVal( httpContext.GetPar( "ExisCC"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ExisCC", GXutil.ltrimstr( AV34ExisCC, 12, 4));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_1EN1548( A396EmprCod, A719PrdNum, A11646TransferAO, AV34ExisCC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         AV36TxtLineas = httpContext.GetPar( "TxtLineas") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_1EN1548( Gx_mode, A396EmprCod, A719PrdNum, AV36TxtLineas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"TRANSFERDD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11648TransferAD = (byte)(GXutil.lval( httpContext.GetPar( "TransferAD"))) ;
         n11648TransferAD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asatransferdd1EN1547( A396EmprCod, A11648TransferAD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"TRANSFEROD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11646TransferAO = (byte)(GXutil.lval( httpContext.GetPar( "TransferAO"))) ;
         n11646TransferAO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asatransferod1EN1547( A396EmprCod, A11646TransferAO) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A3839CcoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
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
         gxload_27( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TRASLADO DE INSUMOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTransferId_Internalname ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
      A11652TransferUt = (int)(GXutil.lval( httpContext.GetPar( "TransferUt"))) ;
      n11652TransferUt = false ;
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

   public ttrf000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrf000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrf000_impl.class ));
   }

   public ttrf000_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTransferTp = new HTMLChoice();
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
      if ( cmbTransferTp.getItemCount() > 0 )
      {
         A11643TransferTp = cmbTransferTp.getValidValue(A11643TransferTp) ;
         n11643TransferTp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbTransferTp.setValue( GXutil.rtrim( A11643TransferTp) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTransferTp.getInternalname(), "Values", cmbTransferTp.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTRF000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nota N", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferId_Internalname, GXutil.ltrim( localUtil.ntoc( A11644TransferId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTransferId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11644TransferId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11644TransferId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferId_Jsonclick, 0, "", "", "", "", "", 1, edtTransferId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dia-Hora", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTransferDi_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferDi_Internalname, localUtil.ttoc( A11645TransferDi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11645TransferDi, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferDi_Jsonclick, 0, "", "", "", "", "", 1, edtTransferDi_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTransferDi_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTransferDi_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTRF000.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Almacen Origen", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferAO_Internalname, GXutil.ltrim( localUtil.ntoc( A11646TransferAO, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTransferAO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11646TransferAO), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11646TransferAO), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferAO_Jsonclick, 0, "", "", "", "", "", 1, edtTransferAO_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Origen", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferOD_Internalname, GXutil.rtrim( A11647TransferOD), GXutil.rtrim( localUtil.format( A11647TransferOD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferOD_Jsonclick, 0, "", "", "", "", "", 1, edtTransferOD_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Almacen Destino", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferAD_Internalname, GXutil.ltrim( localUtil.ntoc( A11648TransferAD, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTransferAD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11648TransferAD), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11648TransferAD), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferAD_Jsonclick, 0, "", "", "", "", "", 1, edtTransferAD_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion Destino", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferDD_Internalname, GXutil.rtrim( A11649TransferDD), GXutil.rtrim( localUtil.format( A11649TransferDD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferDD_Jsonclick, 0, "", "", "", "", "", 1, edtTransferDD_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Traslado (TI, TE)", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTransferTp, cmbTransferTp.getInternalname(), GXutil.rtrim( A11643TransferTp), 1, cmbTransferTp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTransferTp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, (byte)(0), "HLP_TTRF000.htm");
      cmbTransferTp.setValue( GXutil.rtrim( A11643TransferTp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTransferTp.getInternalname(), "Values", cmbTransferTp.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "CcoCod", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoCod_Jsonclick, 0, "", "", "", "", "", 1, edtCcoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "CcoDsc", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcoDsc_Internalname, GXutil.rtrim( A3840CcoDsc), GXutil.rtrim( localUtil.format( A3840CcoDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCcoDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fabrica", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferFb_Internalname, GXutil.rtrim( A11650TransferFb), GXutil.rtrim( localUtil.format( A11650TransferFb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferFb_Jsonclick, 0, "", "", "", "", "", 1, edtTransferFb_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferUs_Internalname, GXutil.rtrim( A11651TransferUs), GXutil.rtrim( localUtil.format( A11651TransferUs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferUs_Jsonclick, 0, "", "", "", "", "", 1, edtTransferUs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferUt_Internalname, GXutil.ltrim( localUtil.ntoc( A11652TransferUt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTransferUt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11652TransferUt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11652TransferUt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferUt_Jsonclick, 0, "", "", "", "", "", 1, edtTransferUt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Estado (0=pdt transferir, 1=Trasferido)", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTransferSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11655TransferSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTransferSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11655TransferSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11655TransferSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTransferSt_Jsonclick, 0, "", "", "", "", "", 1, edtTransferSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRF000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1548 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1548 = (short)(1) ;
            scanStart1EN1548( ) ;
            while ( RcdFound1548 != 0 )
            {
               init_level_properties1548( ) ;
               getByPrimaryKey1EN1548( ) ;
               addRow1EN1548( ) ;
               scanNext1EN1548( ) ;
            }
            scanEnd1EN1548( ) ;
            nBlankRcdCount1548 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11652TransferUt = A11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         standaloneNotModal1EN1548( ) ;
         standaloneModal1EN1548( ) ;
         sMode1548 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1EN1548( ) ;
            edtavnRcdDeleted_1548_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1548_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1548_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1548_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtTransferLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRANSFERLN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTransferLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferLn_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtTransferCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRANSFERCT_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTransferCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferCt_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_1548 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EN1548( ) ;
            }
            sendRow1EN1548( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode1548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11652TransferUt = B11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1548 = (short)(5) ;
         nRcdExists_1548 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EN1548( ) ;
            while ( RcdFound1548 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_951548( ) ;
               init_level_properties1548( ) ;
               standaloneNotModal1EN1548( ) ;
               getByPrimaryKey1EN1548( ) ;
               standaloneModal1EN1548( ) ;
               addRow1EN1548( ) ;
               scanNext1EN1548( ) ;
            }
            scanEnd1EN1548( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1548 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_951548( ) ;
      initAll1EN1548( ) ;
      init_level_properties1548( ) ;
      B11652TransferUt = A11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      nRcdExists_1548 = (short)(0) ;
      nIsMod_1548 = (short)(0) ;
      nRcdDeleted_1548 = (short)(0) ;
      nBlankRcdCount1548 = (short)(nBlankRcdUsr1548+nBlankRcdCount1548) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1548 > 0 )
      {
         standaloneNotModal1EN1548( ) ;
         standaloneModal1EN1548( ) ;
         addRow1EN1548( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTransferLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1548 = (short)(nBlankRcdCount1548-1) ;
      }
      Gx_mode = sMode1548 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11652TransferUt = B11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRF000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTRF000.htm");
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
      e111EN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11644TransferId = localUtil.ctol( httpContext.cgiGet( "Z11644TransferId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11645TransferDi = localUtil.ctot( httpContext.cgiGet( "Z11645TransferDi"), 0) ;
            Z11646TransferAO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11646TransferAO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11648TransferAD = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11648TransferAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11643TransferTp = httpContext.cgiGet( "Z11643TransferTp") ;
            Z11650TransferFb = httpContext.cgiGet( "Z11650TransferFb") ;
            Z11651TransferUs = httpContext.cgiGet( "Z11651TransferUs") ;
            Z11652TransferUt = (int)(localUtil.ctol( httpContext.cgiGet( "Z11652TransferUt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11655TransferSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11655TransferSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11652TransferUt = (int)(localUtil.ctol( httpContext.cgiGet( "O11652TransferUt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV38EliotLavanderia = (byte)(localUtil.ctol( httpContext.cgiGet( "vELIOTLAVANDERIA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV32Msg_erro = httpContext.cgiGet( "vMSG_ERRO") ;
            AV33Msg_errd = httpContext.cgiGet( "vMSG_ERRD") ;
            AV34ExisCC = localUtil.ctond( httpContext.cgiGet( "vEXISCC")) ;
            AV36TxtLineas = httpContext.cgiGet( "vTXTLINEAS") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTransferId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTransferId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRANSFERID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTransferId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11644TransferId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
            }
            else
            {
               A11644TransferId = localUtil.ctol( httpContext.cgiGet( edtTransferId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTransferDi_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TRANSFERDI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTransferDi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
               n11645TransferDi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11645TransferDi = localUtil.ctot( httpContext.cgiGet( edtTransferDi_Internalname)) ;
               n11645TransferDi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTransferAO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTransferAO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRANSFERAO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTransferAO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11646TransferAO = (byte)(0) ;
               n11646TransferAO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
            }
            else
            {
               A11646TransferAO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTransferAO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11646TransferAO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
            }
            A11647TransferOD = httpContext.cgiGet( edtTransferOD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTransferAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTransferAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRANSFERAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTransferAD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11648TransferAD = (byte)(0) ;
               n11648TransferAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
            }
            else
            {
               A11648TransferAD = (byte)(localUtil.ctol( httpContext.cgiGet( edtTransferAD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11648TransferAD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
            }
            A11649TransferDD = httpContext.cgiGet( edtTransferDD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
            cmbTransferTp.setName( cmbTransferTp.getInternalname() );
            cmbTransferTp.setValue( httpContext.cgiGet( cmbTransferTp.getInternalname()) );
            A11643TransferTp = httpContext.cgiGet( cmbTransferTp.getInternalname()) ;
            n11643TransferTp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCcoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3839CcoCod = (short)(0) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            else
            {
               A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            A3840CcoDsc = httpContext.cgiGet( edtCcoDsc_Internalname) ;
            n3840CcoDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
            A11650TransferFb = httpContext.cgiGet( edtTransferFb_Internalname) ;
            n11650TransferFb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11650TransferFb", A11650TransferFb);
            A11651TransferUs = httpContext.cgiGet( edtTransferUs_Internalname) ;
            n11651TransferUs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
            A11652TransferUt = (int)(localUtil.ctol( httpContext.cgiGet( edtTransferUt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11652TransferUt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTransferSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTransferSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRANSFERST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTransferSt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11655TransferSt = (byte)(0) ;
               n11655TransferSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
            }
            else
            {
               A11655TransferSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtTransferSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11655TransferSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
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
               A11644TransferId = GXutil.lval( httpContext.GetPar( "TransferId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
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
                        e111EN2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'CARGAR VALORES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Cargar Valores' */
                        e121EN2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131EN2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'IMPRIMIR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Imprimir' */
                        e141EN2 ();
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
         e131EN2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1EN1547( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1548_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1548_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1EN1547( ) ;
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

   public void confirm_1EN0( )
   {
      beforeValidate1EN1547( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EN1547( ) ;
         }
         else
         {
            checkExtendedTable1EN1547( ) ;
            if ( AnyError == 0 )
            {
               zm1EN1547( 24) ;
               zm1EN1547( 25) ;
            }
            closeExtendedTableCursors1EN1547( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1547 = Gx_mode ;
         confirm_1EN1548( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1547 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EN0( ) ;
      }
   }

   public void confirm_1EN1548( )
   {
      s11652TransferUt = O11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1EN1548( ) ;
         if ( ( nRcdExists_1548 != 0 ) || ( nIsMod_1548 != 0 ) )
         {
            getKey1EN1548( ) ;
            if ( ( nRcdExists_1548 == 0 ) && ( nRcdDeleted_1548 == 0 ) )
            {
               if ( RcdFound1548 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EN1548( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EN1548( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1EN1548( 27) ;
                     }
                     closeExtendedTableCursors1EN1548( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11652TransferUt = A11652TransferUt ;
                     n11652TransferUt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
                  }
               }
               else
               {
                  GXCCtl = "TRANSFERLN_" + sGXsfl_95_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTransferLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1548 != 0 )
               {
                  if ( nRcdDeleted_1548 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EN1548( ) ;
                     load1EN1548( ) ;
                     beforeValidate1EN1548( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EN1548( ) ;
                        O11652TransferUt = A11652TransferUt ;
                        n11652TransferUt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1548 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EN1548( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EN1548( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1EN1548( 27) ;
                           }
                           closeExtendedTableCursors1EN1548( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11652TransferUt = A11652TransferUt ;
                           n11652TransferUt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1548 == 0 )
                  {
                     GXCCtl = "TRANSFERLN_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTransferLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1548_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTransferLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtTransferCt_Internalname, GXutil.ltrim( localUtil.ntoc( A11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11653TransferLn_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11654TransferCt_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_95_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1548 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1548_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1548_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRANSFERLN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRANSFERCT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11652TransferUt = s11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EN0( )
   {
   }

   public void e111EN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrf000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV40Pgmname, (byte)(99), GXv_char2) ;
      ttrf000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrf000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrf000_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrf000_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrf000_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV35ExisteContador ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TRF000", ""), GXv_int6) ;
      ttrf000_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35ExisteContador = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35ExisteContador", GXutil.str( AV35ExisteContador, 1, 0));
      if ( AV35ExisteContador == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe contador TRF000", ""));
      }
      AV37CabTxt = httpContext.getMessage( "   Descripcion Almacen                      Existencias", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37CabTxt", AV37CabTxt);
      GXt_int5 = AV38EliotLavanderia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LELIOT", ""), GXv_int6) ;
      ttrf000_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38EliotLavanderia = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38EliotLavanderia", GXutil.str( AV38EliotLavanderia, 1, 0));
   }

   public void e121EN2( )
   {
      /* 'Cargar Valores' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV36TxtLineas ;
         new app.ptrf000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         ttrf000_impl.this.AV36TxtLineas = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
      }
      /*  Sending Event outputs  */
   }

   public void e131EN2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( A11655TransferSt == 0 )
      {
      }
      /*  Sending Event outputs  */
   }

   public void e141EN2( )
   {
      /* 'Imprimir' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A11644TransferId ;
         new app.ptrf001(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A11644TransferId = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
      }
      /*  Sending Event outputs  */
   }

   public void zm1EN1547( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11645TransferDi = T01EN6_A11645TransferDi[0] ;
            Z11646TransferAO = T01EN6_A11646TransferAO[0] ;
            Z11648TransferAD = T01EN6_A11648TransferAD[0] ;
            Z11643TransferTp = T01EN6_A11643TransferTp[0] ;
            Z11650TransferFb = T01EN6_A11650TransferFb[0] ;
            Z11651TransferUs = T01EN6_A11651TransferUs[0] ;
            Z11652TransferUt = T01EN6_A11652TransferUt[0] ;
            Z11655TransferSt = T01EN6_A11655TransferSt[0] ;
            Z3839CcoCod = T01EN6_A3839CcoCod[0] ;
         }
         else
         {
            Z11645TransferDi = A11645TransferDi ;
            Z11646TransferAO = A11646TransferAO ;
            Z11648TransferAD = A11648TransferAD ;
            Z11643TransferTp = A11643TransferTp ;
            Z11650TransferFb = A11650TransferFb ;
            Z11651TransferUs = A11651TransferUs ;
            Z11652TransferUt = A11652TransferUt ;
            Z11655TransferSt = A11655TransferSt ;
            Z3839CcoCod = A3839CcoCod ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z11644TransferId = A11644TransferId ;
         Z11645TransferDi = A11645TransferDi ;
         Z11646TransferAO = A11646TransferAO ;
         Z11648TransferAD = A11648TransferAD ;
         Z11643TransferTp = A11643TransferTp ;
         Z11650TransferFb = A11650TransferFb ;
         Z11651TransferUs = A11651TransferUs ;
         Z11652TransferUt = A11652TransferUt ;
         Z11655TransferSt = A11655TransferSt ;
         Z396EmprCod = A396EmprCod ;
         Z3839CcoCod = A3839CcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z3840CcoDsc = A3840CcoDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTransferUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUt_Enabled), 5, 0), true);
      AV40Pgmname = "TTRF000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTransferUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUt_Enabled), 5, 0), true);
      /* Using cursor T01EN7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EN7_A407EmprNom[0] ;
      n407EmprNom = T01EN7_n407EmprNom[0] ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11645TransferDi) && ( Gx_BScreen == 0 ) )
      {
         A11645TransferDi = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n11645TransferDi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11651TransferUs)==0) && ( Gx_BScreen == 0 ) )
      {
         A11651TransferUs = AV8UsurCod ;
         n11651TransferUs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
      }
      if ( isIns( )  && (0==A11655TransferSt) && ( Gx_BScreen == 0 ) )
      {
         A11655TransferSt = (byte)(0) ;
         n11655TransferSt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
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

   public void load1EN1547( )
   {
      /* Using cursor T01EN9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1547 = (short)(1) ;
         A407EmprNom = T01EN9_A407EmprNom[0] ;
         n407EmprNom = T01EN9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11645TransferDi = T01EN9_A11645TransferDi[0] ;
         n11645TransferDi = T01EN9_n11645TransferDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11646TransferAO = T01EN9_A11646TransferAO[0] ;
         n11646TransferAO = T01EN9_n11646TransferAO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         A11648TransferAD = T01EN9_A11648TransferAD[0] ;
         n11648TransferAD = T01EN9_n11648TransferAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         A11643TransferTp = T01EN9_A11643TransferTp[0] ;
         n11643TransferTp = T01EN9_n11643TransferTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
         A3840CcoDsc = T01EN9_A3840CcoDsc[0] ;
         n3840CcoDsc = T01EN9_n3840CcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
         A11650TransferFb = T01EN9_A11650TransferFb[0] ;
         n11650TransferFb = T01EN9_n11650TransferFb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11650TransferFb", A11650TransferFb);
         A11651TransferUs = T01EN9_A11651TransferUs[0] ;
         n11651TransferUs = T01EN9_n11651TransferUs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
         A11652TransferUt = T01EN9_A11652TransferUt[0] ;
         n11652TransferUt = T01EN9_n11652TransferUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         A11655TransferSt = T01EN9_A11655TransferSt[0] ;
         n11655TransferSt = T01EN9_n11655TransferSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
         A3839CcoCod = T01EN9_A3839CcoCod[0] ;
         n3839CcoCod = T01EN9_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         zm1EN1547( -23) ;
      }
      pr_default.close(7);
      onLoadActions1EN1547( ) ;
   }

   public void onLoadActions1EN1547( )
   {
      GXt_char1 = A11649TransferDD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11648TransferAD ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
      A11649TransferDD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
      GXt_char1 = A11647TransferOD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11646TransferAO ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
      A11647TransferOD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
   }

   public void checkExtendedTable1EN1547( )
   {
      nIsDirty_1547 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_1547 = (short)(1) ;
      GXt_char1 = A11649TransferDD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11648TransferAD ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
      A11649TransferDD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
      nIsDirty_1547 = (short)(1) ;
      GXt_char1 = A11647TransferOD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11646TransferAO ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
      A11647TransferOD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
      if ( ( AV38EliotLavanderia == 1 ) && ( A11646TransferAO == 8 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite en Origen UPQ=8.Activo Sincronizacion", ""), 1, "TRANSFERAO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A11644TransferId) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_int8[0] = (int)(A11644TransferId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TRF000", ""), GXv_int8) ;
         ttrf000_impl.this.A11644TransferId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
      }
      if ( ( GXutil.strcmp(A11647TransferOD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Almacen Origen", ""), 1, "TRANSFERAO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A11649TransferDD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Almacen Destino", ""), 1, "TRANSFERAD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01EN8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3840CcoDsc = T01EN8_A3840CcoDsc[0] ;
      n3840CcoDsc = T01EN8_n3840CcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
      pr_default.close(6);
      if ( ( A11655TransferSt == 1 ) && isUpd( )  || isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Nota Nº, ya fue Transferida ¡¡¡", ""), 1, "TRANSFERST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferSt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1EN1547( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_25( short A3839CcoCod )
   {
      /* Using cursor T01EN10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3840CcoDsc = T01EN10_A3840CcoDsc[0] ;
      n3840CcoDsc = T01EN10_n3840CcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3840CcoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1EN1547( )
   {
      /* Using cursor T01EN11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1547 = (short)(1) ;
      }
      else
      {
         RcdFound1547 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EN6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01EN6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EN1547( 23) ;
         RcdFound1547 = (short)(1) ;
         A11644TransferId = T01EN6_A11644TransferId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
         A11645TransferDi = T01EN6_A11645TransferDi[0] ;
         n11645TransferDi = T01EN6_n11645TransferDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11646TransferAO = T01EN6_A11646TransferAO[0] ;
         n11646TransferAO = T01EN6_n11646TransferAO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         A11648TransferAD = T01EN6_A11648TransferAD[0] ;
         n11648TransferAD = T01EN6_n11648TransferAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         A11643TransferTp = T01EN6_A11643TransferTp[0] ;
         n11643TransferTp = T01EN6_n11643TransferTp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
         A11650TransferFb = T01EN6_A11650TransferFb[0] ;
         n11650TransferFb = T01EN6_n11650TransferFb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11650TransferFb", A11650TransferFb);
         A11651TransferUs = T01EN6_A11651TransferUs[0] ;
         n11651TransferUs = T01EN6_n11651TransferUs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
         A11652TransferUt = T01EN6_A11652TransferUt[0] ;
         n11652TransferUt = T01EN6_n11652TransferUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         A11655TransferSt = T01EN6_A11655TransferSt[0] ;
         n11655TransferSt = T01EN6_n11655TransferSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
         A3839CcoCod = T01EN6_A3839CcoCod[0] ;
         n3839CcoCod = T01EN6_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         O11652TransferUt = A11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z11644TransferId = A11644TransferId ;
         sMode1547 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EN1547( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1547 = (short)(0) ;
            initializeNonKey1EN1547( ) ;
         }
         Gx_mode = sMode1547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1547 = (short)(0) ;
         initializeNonKey1EN1547( ) ;
         sMode1547 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1EN1547( ) ;
      if ( RcdFound1547 == 0 )
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
      RcdFound1547 = (short)(0) ;
      /* Using cursor T01EN12 */
      pr_default.execute(10, new Object[] {Long.valueOf(A11644TransferId), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01EN12_A11644TransferId[0] < A11644TransferId ) ) && ( GXutil.strcmp(T01EN12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01EN12_A11644TransferId[0] > A11644TransferId ) ) && ( GXutil.strcmp(T01EN12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11644TransferId = T01EN12_A11644TransferId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
            RcdFound1547 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1547 = (short)(0) ;
      /* Using cursor T01EN13 */
      pr_default.execute(11, new Object[] {Long.valueOf(A11644TransferId), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01EN13_A11644TransferId[0] > A11644TransferId ) ) && ( GXutil.strcmp(T01EN13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01EN13_A11644TransferId[0] < A11644TransferId ) ) && ( GXutil.strcmp(T01EN13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11644TransferId = T01EN13_A11644TransferId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
            RcdFound1547 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EN1547( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11652TransferUt = O11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         GX_FocusControl = edtTransferId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1EN1547( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1547 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11644TransferId != Z11644TransferId ) )
            {
               A11644TransferId = Z11644TransferId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11652TransferUt = O11652TransferUt ;
               n11652TransferUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTransferId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11652TransferUt = O11652TransferUt ;
               n11652TransferUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
               update1EN1547( ) ;
               GX_FocusControl = edtTransferId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11644TransferId != Z11644TransferId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11652TransferUt = O11652TransferUt ;
               n11652TransferUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
               GX_FocusControl = edtTransferId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1EN1547( ) ;
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
                  A11652TransferUt = O11652TransferUt ;
                  n11652TransferUt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
                  GX_FocusControl = edtTransferId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1EN1547( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11644TransferId != Z11644TransferId ) )
      {
         A11644TransferId = Z11644TransferId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11652TransferUt = O11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTransferId_Internalname ;
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
      getKey1EN1547( ) ;
      if ( RcdFound1547 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11644TransferId != Z11644TransferId ) )
         {
            A11644TransferId = Z11644TransferId ;
            httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11644TransferId != Z11644TransferId ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrf000");
      GX_FocusControl = edtTransferDi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1EN0( ) ;
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
      if ( RcdFound1547 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTransferDi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1EN1547( ) ;
      if ( RcdFound1547 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTransferDi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EN1547( ) ;
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
      if ( RcdFound1547 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTransferDi_Internalname ;
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
      if ( RcdFound1547 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTransferDi_Internalname ;
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
      scanStart1EN1547( ) ;
      if ( RcdFound1547 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1547 != 0 )
         {
            scanNext1EN1547( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTransferDi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EN1547( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EN1547( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EN5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRF000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z11645TransferDi, T01EN5_A11645TransferDi[0]) ) || ( Z11646TransferAO != T01EN5_A11646TransferAO[0] ) || ( Z11648TransferAD != T01EN5_A11648TransferAD[0] ) || ( GXutil.strcmp(Z11643TransferTp, T01EN5_A11643TransferTp[0]) != 0 ) || ( GXutil.strcmp(Z11650TransferFb, T01EN5_A11650TransferFb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11651TransferUs, T01EN5_A11651TransferUs[0]) != 0 ) || ( Z11652TransferUt != T01EN5_A11652TransferUt[0] ) || ( Z11655TransferSt != T01EN5_A11655TransferSt[0] ) || ( Z3839CcoCod != T01EN5_A3839CcoCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z11645TransferDi, T01EN5_A11645TransferDi[0]) ) )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferDi");
               GXutil.writeLogRaw("Old: ",Z11645TransferDi);
               GXutil.writeLogRaw("Current: ",T01EN5_A11645TransferDi[0]);
            }
            if ( Z11646TransferAO != T01EN5_A11646TransferAO[0] )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferAO");
               GXutil.writeLogRaw("Old: ",Z11646TransferAO);
               GXutil.writeLogRaw("Current: ",T01EN5_A11646TransferAO[0]);
            }
            if ( Z11648TransferAD != T01EN5_A11648TransferAD[0] )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferAD");
               GXutil.writeLogRaw("Old: ",Z11648TransferAD);
               GXutil.writeLogRaw("Current: ",T01EN5_A11648TransferAD[0]);
            }
            if ( GXutil.strcmp(Z11643TransferTp, T01EN5_A11643TransferTp[0]) != 0 )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferTp");
               GXutil.writeLogRaw("Old: ",Z11643TransferTp);
               GXutil.writeLogRaw("Current: ",T01EN5_A11643TransferTp[0]);
            }
            if ( GXutil.strcmp(Z11650TransferFb, T01EN5_A11650TransferFb[0]) != 0 )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferFb");
               GXutil.writeLogRaw("Old: ",Z11650TransferFb);
               GXutil.writeLogRaw("Current: ",T01EN5_A11650TransferFb[0]);
            }
            if ( GXutil.strcmp(Z11651TransferUs, T01EN5_A11651TransferUs[0]) != 0 )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferUs");
               GXutil.writeLogRaw("Old: ",Z11651TransferUs);
               GXutil.writeLogRaw("Current: ",T01EN5_A11651TransferUs[0]);
            }
            if ( Z11652TransferUt != T01EN5_A11652TransferUt[0] )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferUt");
               GXutil.writeLogRaw("Old: ",Z11652TransferUt);
               GXutil.writeLogRaw("Current: ",T01EN5_A11652TransferUt[0]);
            }
            if ( Z11655TransferSt != T01EN5_A11655TransferSt[0] )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferSt");
               GXutil.writeLogRaw("Old: ",Z11655TransferSt);
               GXutil.writeLogRaw("Current: ",T01EN5_A11655TransferSt[0]);
            }
            if ( Z3839CcoCod != T01EN5_A3839CcoCod[0] )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01EN5_A3839CcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRF000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EN1547( )
   {
      beforeValidate1EN1547( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EN1547( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EN1547( 0) ;
         checkOptimisticConcurrency1EN1547( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EN1547( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EN1547( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EN14 */
                  pr_default.execute(12, new Object[] {Long.valueOf(A11644TransferId), Boolean.valueOf(n11645TransferDi), A11645TransferDi, Boolean.valueOf(n11646TransferAO), Byte.valueOf(A11646TransferAO), Boolean.valueOf(n11648TransferAD), Byte.valueOf(A11648TransferAD), Boolean.valueOf(n11643TransferTp), A11643TransferTp, Boolean.valueOf(n11650TransferFb), A11650TransferFb, Boolean.valueOf(n11651TransferUs), A11651TransferUs, Boolean.valueOf(n11652TransferUt), Integer.valueOf(A11652TransferUt), Boolean.valueOf(n11655TransferSt), Byte.valueOf(A11655TransferSt), A396EmprCod, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF000");
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
                        processLevel1EN1547( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EN0( ) ;
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
            load1EN1547( ) ;
         }
         endLevel1EN1547( ) ;
      }
      closeExtendedTableCursors1EN1547( ) ;
   }

   public void update1EN1547( )
   {
      beforeValidate1EN1547( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EN1547( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EN1547( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EN1547( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EN1547( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EN15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n11645TransferDi), A11645TransferDi, Boolean.valueOf(n11646TransferAO), Byte.valueOf(A11646TransferAO), Boolean.valueOf(n11648TransferAD), Byte.valueOf(A11648TransferAD), Boolean.valueOf(n11643TransferTp), A11643TransferTp, Boolean.valueOf(n11650TransferFb), A11650TransferFb, Boolean.valueOf(n11651TransferUs), A11651TransferUs, Boolean.valueOf(n11652TransferUt), Integer.valueOf(A11652TransferUt), Boolean.valueOf(n11655TransferSt), Byte.valueOf(A11655TransferSt), Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), A396EmprCod, Long.valueOf(A11644TransferId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF000");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRF000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EN1547( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EN1547( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EN0( ) ;
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
         endLevel1EN1547( ) ;
      }
      closeExtendedTableCursors1EN1547( ) ;
   }

   public void deferredUpdate1EN1547( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EN1547( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EN1547( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EN1547( ) ;
         afterConfirm1EN1547( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EN1547( ) ;
            if ( AnyError == 0 )
            {
               A11652TransferUt = O11652TransferUt ;
               n11652TransferUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
               scanStart1EN1548( ) ;
               while ( RcdFound1548 != 0 )
               {
                  getByPrimaryKey1EN1548( ) ;
                  delete1EN1548( ) ;
                  scanNext1EN1548( ) ;
                  O11652TransferUt = A11652TransferUt ;
                  n11652TransferUt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
               }
               scanEnd1EN1548( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EN16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF000");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1547 == 0 )
                        {
                           initAll1EN1547( ) ;
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
                        resetCaption1EN0( ) ;
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
      sMode1547 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EN1547( ) ;
      Gx_mode = sMode1547 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EN1547( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (0==A11644TransferId) && true /* After */ && true /* Level */ && isIns( )  )
         {
            GXv_int8[0] = (int)(A11644TransferId) ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TRF000", ""), GXv_int8) ;
            ttrf000_impl.this.A11644TransferId = GXv_int8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
         }
         if ( ( A11655TransferSt == 1 ) && isUpd( )  || isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta Nota Nº, ya fue Transferida ¡¡¡", ""), 1, "TRANSFERST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTransferSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         GXt_char1 = A11647TransferOD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
         ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         A11647TransferOD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
         GXt_char1 = A11649TransferDD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A11648TransferAD ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
         ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         A11649TransferDD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
         /* Using cursor T01EN17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
         A3840CcoDsc = T01EN17_A3840CcoDsc[0] ;
         n3840CcoDsc = T01EN17_n3840CcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1EN1548( )
   {
      s11652TransferUt = O11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1EN1548( ) ;
         if ( ( nRcdExists_1548 != 0 ) || ( nIsMod_1548 != 0 ) )
         {
            standaloneNotModal1EN1548( ) ;
            getKey1EN1548( ) ;
            if ( ( nRcdExists_1548 == 0 ) && ( nRcdDeleted_1548 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EN1548( ) ;
            }
            else
            {
               if ( RcdFound1548 != 0 )
               {
                  if ( ( nRcdDeleted_1548 != 0 ) && ( nRcdExists_1548 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EN1548( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1548 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EN1548( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1548 == 0 )
                  {
                     GXCCtl = "TRANSFERLN_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTransferLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11652TransferUt = A11652TransferUt ;
            n11652TransferUt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1548_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTransferLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtTransferCt_Internalname, GXutil.ltrim( localUtil.ntoc( A11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11653TransferLn_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11654TransferCt_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_95_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1548_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1548 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1548_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1548_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRANSFERLN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRANSFERCT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EN1548( ) ;
      if ( AnyError != 0 )
      {
         O11652TransferUt = s11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      }
      nRcdExists_1548 = (short)(0) ;
      nIsMod_1548 = (short)(0) ;
      nRcdDeleted_1548 = (short)(0) ;
   }

   public void processLevel1EN1547( )
   {
      /* Save parent mode. */
      sMode1547 = Gx_mode ;
      processNestedLevel1EN1548( ) ;
      if ( AnyError != 0 )
      {
         O11652TransferUt = s11652TransferUt ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1547 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01EN18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n11652TransferUt), Integer.valueOf(A11652TransferUt), A396EmprCod, Long.valueOf(A11644TransferId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF000");
   }

   public void endLevel1EN1547( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1EN1547( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrf000");
         if ( AnyError == 0 )
         {
            confirmValues1EN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrf000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EN1547( )
   {
      /* Scan By routine */
      /* Using cursor T01EN19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound1547 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1547 = (short)(1) ;
         A11644TransferId = T01EN19_A11644TransferId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EN1547( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1547 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1547 = (short)(1) ;
         A11644TransferId = T01EN19_A11644TransferId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
      }
   }

   public void scanEnd1EN1547( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1EN1547( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EN1547( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EN1547( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EN1547( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EN1547( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EN1547( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EN1547( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTransferId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferId_Enabled), 5, 0), true);
      edtTransferDi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferDi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferDi_Enabled), 5, 0), true);
      edtTransferAO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferAO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferAO_Enabled), 5, 0), true);
      edtTransferOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferOD_Enabled), 5, 0), true);
      edtTransferAD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferAD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferAD_Enabled), 5, 0), true);
      edtTransferDD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferDD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferDD_Enabled), 5, 0), true);
      cmbTransferTp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTransferTp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbTransferTp.getEnabled(), 5, 0), true);
      edtCcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
      edtCcoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoDsc_Enabled), 5, 0), true);
      edtTransferFb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferFb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferFb_Enabled), 5, 0), true);
      edtTransferUs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUs_Enabled), 5, 0), true);
      edtTransferUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUt_Enabled), 5, 0), true);
      edtTransferSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferSt_Enabled), 5, 0), true);
   }

   public void zm1EN1548( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11654TransferCt = T01EN3_A11654TransferCt[0] ;
            Z719PrdNum = T01EN3_A719PrdNum[0] ;
         }
         else
         {
            Z11654TransferCt = A11654TransferCt ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z11644TransferId = A11644TransferId ;
         Z11653TransferLn = A11653TransferLn ;
         Z11654TransferCt = A11654TransferCt ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1EN1548( )
   {
      edtTransferUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUt_Enabled), 5, 0), true);
      edtTransferUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferUt_Enabled), 5, 0), true);
   }

   public void standaloneModal1EN1548( )
   {
      if ( isIns( )  )
      {
         A11652TransferUt = (int)(O11652TransferUt+1) ;
         n11652TransferUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11653TransferLn = A11652TransferUt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTransferLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTransferLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferLn_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtTransferLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTransferLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferLn_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
   }

   public void load1EN1548( )
   {
      /* Using cursor T01EN20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1548 = (short)(1) ;
         A718PrdNom = T01EN20_A718PrdNom[0] ;
         A11654TransferCt = T01EN20_A11654TransferCt[0] ;
         n11654TransferCt = T01EN20_n11654TransferCt[0] ;
         A719PrdNum = T01EN20_A719PrdNum[0] ;
         n719PrdNum = T01EN20_n719PrdNum[0] ;
         zm1EN1548( -26) ;
      }
      pr_default.close(18);
      onLoadActions1EN1548( ) ;
   }

   public void onLoadActions1EN1548( )
   {
   }

   public void checkExtendedTable1EN1548( )
   {
      nIsDirty_1548 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1EN1548( ) ;
      /* Using cursor T01EN4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01EN4_A718PrdNom[0] ;
      pr_default.close(2);
      if ( true /* Level */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV36TxtLineas ;
         new app.ptrf000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         ttrf000_impl.this.AV36TxtLineas = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_char2[0] = AV32Msg_erro ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
         ttrf000_impl.this.AV32Msg_erro = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_erro", AV32Msg_erro);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV32Msg_erro, " ") != 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(AV32Msg_erro, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11648TransferAD ;
         GXv_char2[0] = AV33Msg_errd ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
         ttrf000_impl.this.AV33Msg_errd = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_errd", AV33Msg_errd);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV33Msg_errd, " ") != 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(AV33Msg_errd, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1EN1548( )
   {
      pr_default.close(2);
   }

   public void enableDisable1EN1548( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01EN21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01EN21_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1EN1548( )
   {
      /* Using cursor T01EN22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1548 = (short)(1) ;
      }
      else
      {
         RcdFound1548 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1EN1548( )
   {
      /* Using cursor T01EN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EN1548( 26) ;
         RcdFound1548 = (short)(1) ;
         initializeNonKey1EN1548( ) ;
         A11653TransferLn = T01EN3_A11653TransferLn[0] ;
         A11654TransferCt = T01EN3_A11654TransferCt[0] ;
         n11654TransferCt = T01EN3_n11654TransferCt[0] ;
         A719PrdNum = T01EN3_A719PrdNum[0] ;
         n719PrdNum = T01EN3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11644TransferId = A11644TransferId ;
         Z11653TransferLn = A11653TransferLn ;
         sMode1548 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EN1548( ) ;
         load1EN1548( ) ;
         Gx_mode = sMode1548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1548 = (short)(0) ;
         initializeNonKey1EN1548( ) ;
         sMode1548 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EN1548( ) ;
         Gx_mode = sMode1548 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EN1548( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EN1548( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRF001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11654TransferCt, T01EN2_A11654TransferCt[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01EN2_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11654TransferCt, T01EN2_A11654TransferCt[0]) != 0 )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"TransferCt");
               GXutil.writeLogRaw("Old: ",Z11654TransferCt);
               GXutil.writeLogRaw("Current: ",T01EN2_A11654TransferCt[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01EN2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("ttrf000:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01EN2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRF001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EN1548( )
   {
      beforeValidate1EN1548( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EN1548( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EN1548( 0) ;
         checkOptimisticConcurrency1EN1548( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EN1548( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EN1548( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EN23 */
                  pr_default.execute(21, new Object[] {Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn), Boolean.valueOf(n11654TransferCt), A11654TransferCt, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF001");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1EN1548( ) ;
         }
         endLevel1EN1548( ) ;
      }
      closeExtendedTableCursors1EN1548( ) ;
   }

   public void update1EN1548( )
   {
      beforeValidate1EN1548( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EN1548( ) ;
      }
      if ( ( nIsMod_1548 != 0 ) || ( nIsDirty_1548 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EN1548( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EN1548( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EN1548( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EN24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11654TransferCt), A11654TransferCt, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF001");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRF001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EN1548( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EN1548( ) ;
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
            endLevel1EN1548( ) ;
         }
      }
      closeExtendedTableCursors1EN1548( ) ;
   }

   public void deferredUpdate1EN1548( )
   {
   }

   public void delete1EN1548( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EN1548( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EN1548( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EN1548( ) ;
         afterConfirm1EN1548( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EN1548( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EN25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId), Integer.valueOf(A11653TransferLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRF001");
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
      sMode1548 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EN1548( ) ;
      Gx_mode = sMode1548 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EN1548( )
   {
      standaloneModal1EN1548( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_char2[0] = AV36TxtLineas ;
            new app.ptrf000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
            ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
            ttrf000_impl.this.AV36TxtLineas = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
         }
         /* Using cursor T01EN26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01EN26_A718PrdNom[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1EN1548( )
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

   public void scanStart1EN1548( )
   {
      /* Scan By routine */
      /* Using cursor T01EN27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A11644TransferId)});
      RcdFound1548 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1548 = (short)(1) ;
         A11653TransferLn = T01EN27_A11653TransferLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EN1548( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1548 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1548 = (short)(1) ;
         A11653TransferLn = T01EN27_A11653TransferLn[0] ;
      }
   }

   public void scanEnd1EN1548( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1EN1548( )
   {
      /* After Confirm Rules */
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_decimal9[0] = AV34ExisCC ;
         new app.ptrasl0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_decimal9) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
         ttrf000_impl.this.AV34ExisCC = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34ExisCC", GXutil.ltrimstr( AV34ExisCC, 12, 4));
      }
      if ( ( A11654TransferCt.doubleValue() == 0 ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "TRANSFERCT_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad con valor 0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferCt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( DecimalUtil.compareTo(A11654TransferCt, AV34ExisCC) > 0 ) && true /* After */ )
      {
         GXCCtl = "TRANSFERCT_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad superior a Existencias", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferCt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1EN1548( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EN1548( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EN1548( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EN1548( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EN1548( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EN1548( )
   {
      edtTransferLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferLn_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtTransferCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferCt_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1EN1548( )
   {
   }

   public void send_integrity_lvl_hashes1EN1547( )
   {
   }

   public void subsflControlProps_951548( )
   {
      edtavnRcdDeleted_1548_Internalname = "vNRCDDELETED_1548_"+sGXsfl_95_idx ;
      edtTransferLn_Internalname = "TRANSFERLN_"+sGXsfl_95_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_95_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_95_idx ;
      edtTransferCt_Internalname = "TRANSFERCT_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_951548( )
   {
      edtavnRcdDeleted_1548_Internalname = "vNRCDDELETED_1548_"+sGXsfl_95_fel_idx ;
      edtTransferLn_Internalname = "TRANSFERLN_"+sGXsfl_95_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_95_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_95_fel_idx ;
      edtTransferCt_Internalname = "TRANSFERCT_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1EN1548( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951548( ) ;
      sendRow1EN1548( ) ;
   }

   public void sendRow1EN1548( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1548_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1548_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1548_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1548), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1548), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1548_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1548_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1548_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTransferLn_Internalname,GXutil.ltrim( localUtil.ntoc( A11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11653TransferLn), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTransferLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTransferLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1548_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1548_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTransferCt_Internalname,GXutil.ltrim( localUtil.ntoc( A11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTransferCt_Enabled!=0) ? localUtil.format( A11654TransferCt, "ZZZZZZ9.9999") : localUtil.format( A11654TransferCt, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTransferCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTransferCt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EN1548( ) ;
      GXCCtl = "Z11653TransferLn_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11653TransferLn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11654TransferCt_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11654TransferCt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1548_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1548_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1548_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1548, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTXTLINEAS_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV36TxtLineas);
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1548_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1548_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRANSFERLN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRANSFERCT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferCt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EN1548( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951548( ) ;
      edtavnRcdDeleted_1548_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1548_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTransferLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRANSFERLN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTransferCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRANSFERCT_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1548");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1548_Internalname ;
         wbErr = true ;
         nRcdDeleted_1548 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1548 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1548_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTransferLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTransferLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TRANSFERLN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferLn_Internalname ;
         wbErr = true ;
         A11653TransferLn = 0 ;
      }
      else
      {
         A11653TransferLn = (int)(localUtil.ctol( httpContext.cgiGet( edtTransferLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTransferCt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTransferCt_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "TRANSFERCT_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferCt_Internalname ;
         wbErr = true ;
         A11654TransferCt = DecimalUtil.ZERO ;
         n11654TransferCt = false ;
      }
      else
      {
         A11654TransferCt = localUtil.ctond( httpContext.cgiGet( edtTransferCt_Internalname)) ;
         n11654TransferCt = false ;
      }
      GXCCtl = "Z11653TransferLn_" + sGXsfl_95_idx ;
      Z11653TransferLn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11654TransferCt_" + sGXsfl_95_idx ;
      Z11654TransferCt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_95_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1548_" + sGXsfl_95_idx ;
      nRcdDeleted_1548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1548_" + sGXsfl_95_idx ;
      nRcdExists_1548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1548_" + sGXsfl_95_idx ;
      nIsMod_1548 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTransferLn_Enabled = edtTransferLn_Enabled ;
   }

   public void confirmValues1EN0( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951548( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951548( ) ;
         httpContext.changePostValue( "Z11653TransferLn_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z11653TransferLn_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11653TransferLn_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z11654TransferCt_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z11654TransferCt_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11654TransferCt_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_95_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrf000", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11644TransferId", GXutil.ltrim( localUtil.ntoc( Z11644TransferId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11645TransferDi", localUtil.ttoc( Z11645TransferDi, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11646TransferAO", GXutil.ltrim( localUtil.ntoc( Z11646TransferAO, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11648TransferAD", GXutil.ltrim( localUtil.ntoc( Z11648TransferAD, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11643TransferTp", GXutil.rtrim( Z11643TransferTp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11650TransferFb", GXutil.rtrim( Z11650TransferFb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11651TransferUs", GXutil.rtrim( Z11651TransferUs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11652TransferUt", GXutil.ltrim( localUtil.ntoc( Z11652TransferUt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11655TransferSt", GXutil.ltrim( localUtil.ntoc( Z11655TransferSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11652TransferUt", GXutil.ltrim( localUtil.ntoc( O11652TransferUt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vELIOTLAVANDERIA", GXutil.ltrim( localUtil.ntoc( AV38EliotLavanderia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRO", GXutil.rtrim( AV32Msg_erro));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRD", GXutil.rtrim( AV33Msg_errd));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISCC", GXutil.ltrim( localUtil.ntoc( AV34ExisCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTXTLINEAS", AV36TxtLineas);
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
      return formatLink("app.ttrf000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTRF000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRASLADO DE INSUMOS", "") ;
   }

   public void initializeNonKey1EN1547( )
   {
      A11647TransferOD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
      A11649TransferDD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
      A11646TransferAO = (byte)(0) ;
      n11646TransferAO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
      A11648TransferAD = (byte)(0) ;
      n11648TransferAD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
      A11643TransferTp = "" ;
      n11643TransferTp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A3840CcoDsc = "" ;
      n3840CcoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", A3840CcoDsc);
      A11650TransferFb = "" ;
      n11650TransferFb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11650TransferFb", A11650TransferFb);
      A11652TransferUt = 0 ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      A11645TransferDi = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11645TransferDi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11651TransferUs = AV8UsurCod ;
      n11651TransferUs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
      A11655TransferSt = (byte)(0) ;
      n11655TransferSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
      O11652TransferUt = A11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
      Z11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      Z11646TransferAO = (byte)(0) ;
      Z11648TransferAD = (byte)(0) ;
      Z11643TransferTp = "" ;
      Z11650TransferFb = "" ;
      Z11651TransferUs = "" ;
      Z11652TransferUt = 0 ;
      Z11655TransferSt = (byte)(0) ;
      Z3839CcoCod = (short)(0) ;
   }

   public void initAll1EN1547( )
   {
      A11644TransferId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
      initializeNonKey1EN1547( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11645TransferDi = i11645TransferDi ;
      n11645TransferDi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11651TransferUs = i11651TransferUs ;
      n11651TransferUs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", A11651TransferUs);
      A11655TransferSt = i11655TransferSt ;
      n11655TransferSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.str( A11655TransferSt, 1, 0));
   }

   public void initializeNonKey1EN1548( )
   {
      AV32Msg_erro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_erro", AV32Msg_erro);
      AV33Msg_errd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_errd", AV33Msg_errd);
      AV34ExisCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ExisCC", GXutil.ltrimstr( AV34ExisCC, 12, 4));
      AV36TxtLineas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A11654TransferCt = DecimalUtil.ZERO ;
      n11654TransferCt = false ;
      Z11654TransferCt = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1EN1548( )
   {
      A11653TransferLn = 0 ;
      initializeNonKey1EN1548( ) ;
   }

   public void standaloneModalInsert1EN1548( )
   {
      A11652TransferUt = i11652TransferUt ;
      n11652TransferUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11652TransferUt), 8, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565684", true, true);
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
      httpContext.AddJavascriptSource("ttrf000.js", "?20268241565684", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1548( )
   {
      edtTransferLn_Enabled = defedtTransferLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTransferLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTransferLn_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1548, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1548_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11653TransferLn, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferLn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11654TransferCt, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTransferCt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTransferId_Internalname = "TRANSFERID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTransferDi_Internalname = "TRANSFERDI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTransferAO_Internalname = "TRANSFERAO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTransferOD_Internalname = "TRANSFEROD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTransferAD_Internalname = "TRANSFERAD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTransferDD_Internalname = "TRANSFERDD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      cmbTransferTp.setInternalname( "TRANSFERTP" );
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCcoCod_Internalname = "CCOCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCcoDsc_Internalname = "CCODSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTransferFb_Internalname = "TRANSFERFB" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTransferUs_Internalname = "TRANSFERUS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTransferUt_Internalname = "TRANSFERUT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtTransferSt_Internalname = "TRANSFERST" ;
      edtavnRcdDeleted_1548_Internalname = "vNRCDDELETED_1548" ;
      edtTransferLn_Internalname = "TRANSFERLN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtTransferCt_Internalname = "TRANSFERCT" ;
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
      Form.setCaption( httpContext.getMessage( "TRASLADO DE INSUMOS", "") );
      edtTransferCt_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtTransferLn_Jsonclick = "" ;
      edtavnRcdDeleted_1548_Jsonclick = "" ;
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
      edtTransferCt_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtTransferLn_Enabled = 1 ;
      edtavnRcdDeleted_1548_Enabled = 1 ;
      edtTransferSt_Jsonclick = "" ;
      edtTransferSt_Backcolor = (int)(0xFFFFFF) ;
      edtTransferSt_Enabled = 1 ;
      edtTransferUt_Jsonclick = "" ;
      edtTransferUt_Backcolor = (int)(0xFFFFFF) ;
      edtTransferUt_Enabled = 0 ;
      edtTransferUs_Jsonclick = "" ;
      edtTransferUs_Backcolor = (int)(0xFFFFFF) ;
      edtTransferUs_Enabled = 1 ;
      edtTransferFb_Jsonclick = "" ;
      edtTransferFb_Backcolor = (int)(0xFFFFFF) ;
      edtTransferFb_Enabled = 1 ;
      edtCcoDsc_Jsonclick = "" ;
      edtCcoDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCcoDsc_Enabled = 0 ;
      edtCcoCod_Jsonclick = "" ;
      edtCcoCod_Backcolor = (int)(0xFFFFFF) ;
      edtCcoCod_Enabled = 1 ;
      cmbTransferTp.setJsonclick( "" );
      cmbTransferTp.setEnabled( 1 );
      cmbTransferTp.setIBackground( (int)(0xFFFFFF) );
      edtTransferDD_Jsonclick = "" ;
      edtTransferDD_Backcolor = (int)(0xFFFFFF) ;
      edtTransferDD_Enabled = 0 ;
      edtTransferAD_Jsonclick = "" ;
      edtTransferAD_Backcolor = (int)(0xFFFFFF) ;
      edtTransferAD_Enabled = 1 ;
      edtTransferOD_Jsonclick = "" ;
      edtTransferOD_Backcolor = (int)(0xFFFFFF) ;
      edtTransferOD_Enabled = 0 ;
      edtTransferAO_Jsonclick = "" ;
      edtTransferAO_Backcolor = (int)(0xFFFFFF) ;
      edtTransferAO_Enabled = 1 ;
      edtTransferDi_Jsonclick = "" ;
      edtTransferDi_Backcolor = (int)(0xFFFFFF) ;
      edtTransferDi_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTransferId_Jsonclick = "" ;
      edtTransferId_Backcolor = (int)(0xFFFFFF) ;
      edtTransferId_Enabled = 1 ;
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

   public void gx1asatransferdd1EN1547( String A396EmprCod ,
                                        byte A11648TransferAD )
   {
      GXt_char1 = A11649TransferDD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11648TransferAD ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
      A11649TransferDD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", A11649TransferDD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11649TransferDD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asatransferod1EN1547( String A396EmprCod ,
                                        byte A11646TransferAO )
   {
      GXt_char1 = A11647TransferOD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11646TransferAO ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
      A11647TransferOD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", A11647TransferOD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11647TransferOD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_7_1EN1547( )
   {
      if ( (0==A11644TransferId) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_int8[0] = (int)(A11644TransferId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TRF000", ""), GXv_int8) ;
         A11644TransferId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11644TransferId), 10, 0));
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

   public void xc_15_1EN1548( String A396EmprCod ,
                              String A719PrdNum ,
                              byte A11646TransferAO ,
                              String AV32Msg_erro )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_char2[0] = AV32Msg_erro ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A11646TransferAO = GXv_int6[0] ;
         AV32Msg_erro = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_erro", AV32Msg_erro);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11646TransferAO, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV32Msg_erro))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_17_1EN1548( String A396EmprCod ,
                              String A719PrdNum ,
                              byte A11648TransferAD ,
                              String AV33Msg_errd )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11648TransferAD ;
         GXv_char2[0] = AV33Msg_errd ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A11648TransferAD = GXv_int6[0] ;
         AV33Msg_errd = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11648TransferAD), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_errd", AV33Msg_errd);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11648TransferAD, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Msg_errd))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_19_1EN1548( String A396EmprCod ,
                              String A719PrdNum ,
                              byte A11646TransferAO ,
                              java.math.BigDecimal AV34ExisCC )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_decimal9[0] = AV34ExisCC ;
         new app.ptrasl0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_decimal9) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         A11646TransferAO = GXv_int6[0] ;
         AV34ExisCC = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11646TransferAO), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34ExisCC", GXutil.ltrimstr( AV34ExisCC, 12, 4));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11646TransferAO, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34ExisCC, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_22_1EN1548( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              String AV36TxtLineas )
   {
      if ( true /* Level */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV36TxtLineas ;
         new app.ptrf000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A719PrdNum = GXv_char3[0] ;
         AV36TxtLineas = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV36TxtLineas)+"\"") ;
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
      subsflControlProps_951548( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EN1548( ) ;
         standaloneModal1EN1548( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EN1548( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951548( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbTransferTp.setName( "TRANSFERTP" );
      cmbTransferTp.setWebtags( "" );
      cmbTransferTp.addItem("TI", httpContext.getMessage( "Traslado Interno", ""), (short)(0));
      cmbTransferTp.addItem("TE", httpContext.getMessage( "Traslado Externo", ""), (short)(0));
      if ( cmbTransferTp.getItemCount() > 0 )
      {
         A11643TransferTp = cmbTransferTp.getValidValue(A11643TransferTp) ;
         n11643TransferTp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", A11643TransferTp);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01EN28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EN28_A407EmprNom[0] ;
      n407EmprNom = T01EN28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      GX_FocusControl = edtTransferDi_Internalname ;
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

   public void valid_Transferid( )
   {
      n11652TransferUt = false ;
      n11643TransferTp = false ;
      A11643TransferTp = cmbTransferTp.getValue() ;
      n11643TransferTp = false ;
      cmbTransferTp.setValue( A11643TransferTp );
      n11645TransferDi = false ;
      n11651TransferUs = false ;
      n11655TransferSt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( (0==A11644TransferId) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_int8[0] = (int)(A11644TransferId) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TRF000", ""), GXv_int8) ;
         ttrf000_impl.this.A11644TransferId = GXv_int8[0] ;
         A11644TransferId = this.A11644TransferId ;
      }
      dynload_actions( ) ;
      if ( cmbTransferTp.getItemCount() > 0 )
      {
         A11643TransferTp = cmbTransferTp.getValidValue(A11643TransferTp) ;
         n11643TransferTp = false ;
         cmbTransferTp.setValue( A11643TransferTp );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbTransferTp.setValue( GXutil.rtrim( A11643TransferTp) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11645TransferDi", localUtil.ttoc( A11645TransferDi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrim( localUtil.ntoc( A11646TransferAO, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrim( localUtil.ntoc( A11648TransferAD, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11643TransferTp", GXutil.rtrim( A11643TransferTp));
      cmbTransferTp.setValue( GXutil.rtrim( A11643TransferTp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTransferTp.getInternalname(), "Values", cmbTransferTp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11650TransferFb", GXutil.rtrim( A11650TransferFb));
      httpContext.ajax_rsp_assign_attri("", false, "A11651TransferUs", GXutil.rtrim( A11651TransferUs));
      httpContext.ajax_rsp_assign_attri("", false, "A11652TransferUt", GXutil.ltrim( localUtil.ntoc( A11652TransferUt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11655TransferSt", GXutil.ltrim( localUtil.ntoc( A11655TransferSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", GXutil.rtrim( A11649TransferDD));
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", GXutil.rtrim( A11647TransferOD));
      httpContext.ajax_rsp_assign_attri("", false, "A11644TransferId", GXutil.ltrim( localUtil.ntoc( A11644TransferId, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", GXutil.rtrim( A3840CcoDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11645TransferDi", localUtil.ttoc( Z11645TransferDi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11646TransferAO", GXutil.ltrim( localUtil.ntoc( Z11646TransferAO, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11648TransferAD", GXutil.ltrim( localUtil.ntoc( Z11648TransferAD, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11643TransferTp", GXutil.rtrim( Z11643TransferTp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11650TransferFb", GXutil.rtrim( Z11650TransferFb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11651TransferUs", GXutil.rtrim( Z11651TransferUs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11652TransferUt", GXutil.ltrim( localUtil.ntoc( Z11652TransferUt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11655TransferSt", GXutil.ltrim( localUtil.ntoc( Z11655TransferSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11649TransferDD", GXutil.rtrim( Z11649TransferDD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11647TransferOD", GXutil.rtrim( Z11647TransferOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11644TransferId", GXutil.ltrim( localUtil.ntoc( Z11644TransferId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3840CcoDsc", GXutil.rtrim( Z3840CcoDsc));
      httpContext.ajax_rsp_assign_attri("", false, "O11652TransferUt", GXutil.ltrim( localUtil.ntoc( O11652TransferUt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Transferao( )
   {
      n11646TransferAO = false ;
      GXt_char1 = A11647TransferOD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11646TransferAO ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      A11647TransferOD = GXt_char1 ;
      if ( ( GXutil.strcmp(A11647TransferOD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Almacen Origen", ""), 1, "TRANSFERAO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAO_Internalname ;
      }
      if ( ( AV38EliotLavanderia == 1 ) && ( A11646TransferAO == 8 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite en Origen UPQ=8.Activo Sincronizacion", ""), 1, "TRANSFERAO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAO_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11647TransferOD", GXutil.rtrim( A11647TransferOD));
   }

   public void valid_Transferad( )
   {
      n11648TransferAD = false ;
      GXt_char1 = A11649TransferDD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A11648TransferAD ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
      ttrf000_impl.this.GXt_char1 = GXv_char3[0] ;
      A11649TransferDD = GXt_char1 ;
      if ( ( GXutil.strcmp(A11649TransferDD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Almacen Destino", ""), 1, "TRANSFERAD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTransferAD_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11649TransferDD", GXutil.rtrim( A11649TransferDD));
   }

   public void valid_Ccocod( )
   {
      n3839CcoCod = false ;
      n3840CcoDsc = false ;
      /* Using cursor T01EN17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
      }
      A3840CcoDsc = T01EN17_A3840CcoDsc[0] ;
      n3840CcoDsc = T01EN17_n3840CcoDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3840CcoDsc", GXutil.rtrim( A3840CcoDsc));
   }

   public void valid_Prdnum( )
   {
      n11648TransferAD = false ;
      n11646TransferAO = false ;
      n719PrdNum = false ;
      /* Using cursor T01EN26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01EN26_A718PrdNom[0] ;
      pr_default.close(24);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11646TransferAO ;
         GXv_char2[0] = AV32Msg_erro ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         ttrf000_impl.this.A11646TransferAO = GXv_int6[0] ;
         A11646TransferAO = this.A11646TransferAO ;
         ttrf000_impl.this.AV32Msg_erro = GXv_char2[0] ;
         AV32Msg_erro = this.AV32Msg_erro ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV32Msg_erro, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV32Msg_erro, 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int6[0] = A11648TransferAD ;
         GXv_char2[0] = AV33Msg_errd ;
         new app.pccalm4(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         ttrf000_impl.this.A11648TransferAD = GXv_int6[0] ;
         A11648TransferAD = this.A11648TransferAD ;
         ttrf000_impl.this.AV33Msg_errd = GXv_char2[0] ;
         AV33Msg_errd = this.AV33Msg_errd ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV33Msg_errd, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV33Msg_errd, 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( true /* Level */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = AV36TxtLineas ;
         new app.ptrf000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         ttrf000_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrf000_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         ttrf000_impl.this.AV36TxtLineas = GXv_char2[0] ;
         AV36TxtLineas = this.AV36TxtLineas ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11646TransferAO", GXutil.ltrim( localUtil.ntoc( A11646TransferAO, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_erro", GXutil.rtrim( AV32Msg_erro));
      httpContext.ajax_rsp_assign_attri("", false, "A11648TransferAD", GXutil.ltrim( localUtil.ntoc( A11648TransferAD, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Msg_errd", GXutil.rtrim( AV33Msg_errd));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "AV36TxtLineas", AV36TxtLineas);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'CARGAR VALORES'","{handler:'e121EN2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV36TxtLineas',fld:'vTXTLINEAS',pic:''}]");
      setEventMetadata("'CARGAR VALORES'",",oparms:[{av:'AV36TxtLineas',fld:'vTXTLINEAS',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e131EN2',iparms:[{av:'A11655TransferSt',fld:'TRANSFERST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'IMPRIMIR'","{handler:'e141EN2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'IMPRIMIR'",",oparms:[{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TRANSFERID","{handler:'valid_Transferid',iparms:[{av:'A11652TransferUt',fld:'TRANSFERUT',pic:'ZZZZZZZ9'},{av:'AV38EliotLavanderia',fld:'vELIOTLAVANDERIA',pic:'9'},{av:'cmbTransferTp'},{av:'A11643TransferTp',fld:'TRANSFERTP',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A11645TransferDi',fld:'TRANSFERDI',pic:'99/99/99 99:99'},{av:'A11651TransferUs',fld:'TRANSFERUS',pic:''},{av:'A11655TransferSt',fld:'TRANSFERST',pic:'9'}]");
      setEventMetadata("VALID_TRANSFERID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11645TransferDi',fld:'TRANSFERDI',pic:'99/99/99 99:99'},{av:'A11646TransferAO',fld:'TRANSFERAO',pic:'Z9'},{av:'A11648TransferAD',fld:'TRANSFERAD',pic:'Z9'},{av:'cmbTransferTp'},{av:'A11643TransferTp',fld:'TRANSFERTP',pic:''},{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'},{av:'A11650TransferFb',fld:'TRANSFERFB',pic:''},{av:'A11651TransferUs',fld:'TRANSFERUS',pic:''},{av:'A11652TransferUt',fld:'TRANSFERUT',pic:'ZZZZZZZ9'},{av:'A11655TransferSt',fld:'TRANSFERST',pic:'9'},{av:'A11649TransferDD',fld:'TRANSFERDD',pic:''},{av:'A11647TransferOD',fld:'TRANSFEROD',pic:''},{av:'A11644TransferId',fld:'TRANSFERID',pic:'ZZZZZZZZZ9'},{av:'A3840CcoDsc',fld:'CCODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z11645TransferDi'},{av:'Z11646TransferAO'},{av:'Z11648TransferAD'},{av:'Z11643TransferTp'},{av:'Z3839CcoCod'},{av:'Z11650TransferFb'},{av:'Z11651TransferUs'},{av:'Z11652TransferUt'},{av:'Z11655TransferSt'},{av:'Z11649TransferDD'},{av:'Z11647TransferOD'},{av:'Z11644TransferId'},{av:'Z3840CcoDsc'},{av:'O11652TransferUt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TRANSFERAO","{handler:'valid_Transferao',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11646TransferAO',fld:'TRANSFERAO',pic:'Z9'},{av:'AV38EliotLavanderia',fld:'vELIOTLAVANDERIA',pic:'9'},{av:'A11647TransferOD',fld:'TRANSFEROD',pic:''}]");
      setEventMetadata("VALID_TRANSFERAO",",oparms:[{av:'A11647TransferOD',fld:'TRANSFEROD',pic:''}]}");
      setEventMetadata("VALID_TRANSFERAD","{handler:'valid_Transferad',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11648TransferAD',fld:'TRANSFERAD',pic:'Z9'},{av:'A11649TransferDD',fld:'TRANSFERDD',pic:''}]");
      setEventMetadata("VALID_TRANSFERAD",",oparms:[{av:'A11649TransferDD',fld:'TRANSFERDD',pic:''}]}");
      setEventMetadata("VALID_CCOCOD","{handler:'valid_Ccocod',iparms:[{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'},{av:'A3840CcoDsc',fld:'CCODSC',pic:''}]");
      setEventMetadata("VALID_CCOCOD",",oparms:[{av:'A3840CcoDsc',fld:'CCODSC',pic:''}]}");
      setEventMetadata("VALID_TRANSFERUT","{handler:'valid_Transferut',iparms:[]");
      setEventMetadata("VALID_TRANSFERUT",",oparms:[]}");
      setEventMetadata("VALID_TRANSFERST","{handler:'valid_Transferst',iparms:[]");
      setEventMetadata("VALID_TRANSFERST",",oparms:[]}");
      setEventMetadata("VALID_TRANSFERLN","{handler:'valid_Transferln',iparms:[]");
      setEventMetadata("VALID_TRANSFERLN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A11648TransferAD',fld:'TRANSFERAD',pic:'Z9'},{av:'A11646TransferAO',fld:'TRANSFERAO',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'AV32Msg_erro',fld:'vMSG_ERRO',pic:''},{av:'AV33Msg_errd',fld:'vMSG_ERRD',pic:''},{av:'AV36TxtLineas',fld:'vTXTLINEAS',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A11646TransferAO',fld:'TRANSFERAO',pic:'Z9'},{av:'AV32Msg_erro',fld:'vMSG_ERRO',pic:''},{av:'A11648TransferAD',fld:'TRANSFERAD',pic:'Z9'},{av:'AV33Msg_errd',fld:'vMSG_ERRD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV36TxtLineas',fld:'vTXTLINEAS',pic:''}]}");
      setEventMetadata("VALID_TRANSFERCT","{handler:'valid_Transferct',iparms:[]");
      setEventMetadata("VALID_TRANSFERCT",",oparms:[]}");
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
      pr_default.close(26);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      Z11643TransferTp = "" ;
      Z11650TransferFb = "" ;
      Z11651TransferUs = "" ;
      Z11654TransferCt = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV32Msg_erro = "" ;
      AV33Msg_errd = "" ;
      AV34ExisCC = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      AV36TxtLineas = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11643TransferTp = "" ;
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
      A11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11647TransferOD = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11649TransferDD = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A3840CcoDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11650TransferFb = "" ;
      lblTextblock13_Jsonclick = "" ;
      A11651TransferUs = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1548 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV40Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1547 = "" ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A11654TransferCt = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV37CabTxt = "" ;
      GXv_int7 = new long[1] ;
      Z407EmprNom = "" ;
      Z3840CcoDsc = "" ;
      T01EN7_A407EmprNom = new String[] {""} ;
      T01EN7_n407EmprNom = new boolean[] {false} ;
      T01EN9_A11644TransferId = new long[1] ;
      T01EN9_A407EmprNom = new String[] {""} ;
      T01EN9_n407EmprNom = new boolean[] {false} ;
      T01EN9_A11645TransferDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01EN9_n11645TransferDi = new boolean[] {false} ;
      T01EN9_A11646TransferAO = new byte[1] ;
      T01EN9_n11646TransferAO = new boolean[] {false} ;
      T01EN9_A11648TransferAD = new byte[1] ;
      T01EN9_n11648TransferAD = new boolean[] {false} ;
      T01EN9_A11643TransferTp = new String[] {""} ;
      T01EN9_n11643TransferTp = new boolean[] {false} ;
      T01EN9_A3840CcoDsc = new String[] {""} ;
      T01EN9_n3840CcoDsc = new boolean[] {false} ;
      T01EN9_A11650TransferFb = new String[] {""} ;
      T01EN9_n11650TransferFb = new boolean[] {false} ;
      T01EN9_A11651TransferUs = new String[] {""} ;
      T01EN9_n11651TransferUs = new boolean[] {false} ;
      T01EN9_A11652TransferUt = new int[1] ;
      T01EN9_n11652TransferUt = new boolean[] {false} ;
      T01EN9_A11655TransferSt = new byte[1] ;
      T01EN9_n11655TransferSt = new boolean[] {false} ;
      T01EN9_A396EmprCod = new String[] {""} ;
      T01EN9_A3839CcoCod = new short[1] ;
      T01EN9_n3839CcoCod = new boolean[] {false} ;
      T01EN8_A3840CcoDsc = new String[] {""} ;
      T01EN8_n3840CcoDsc = new boolean[] {false} ;
      T01EN10_A3840CcoDsc = new String[] {""} ;
      T01EN10_n3840CcoDsc = new boolean[] {false} ;
      T01EN11_A396EmprCod = new String[] {""} ;
      T01EN11_A11644TransferId = new long[1] ;
      T01EN6_A11644TransferId = new long[1] ;
      T01EN6_A11645TransferDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01EN6_n11645TransferDi = new boolean[] {false} ;
      T01EN6_A11646TransferAO = new byte[1] ;
      T01EN6_n11646TransferAO = new boolean[] {false} ;
      T01EN6_A11648TransferAD = new byte[1] ;
      T01EN6_n11648TransferAD = new boolean[] {false} ;
      T01EN6_A11643TransferTp = new String[] {""} ;
      T01EN6_n11643TransferTp = new boolean[] {false} ;
      T01EN6_A11650TransferFb = new String[] {""} ;
      T01EN6_n11650TransferFb = new boolean[] {false} ;
      T01EN6_A11651TransferUs = new String[] {""} ;
      T01EN6_n11651TransferUs = new boolean[] {false} ;
      T01EN6_A11652TransferUt = new int[1] ;
      T01EN6_n11652TransferUt = new boolean[] {false} ;
      T01EN6_A11655TransferSt = new byte[1] ;
      T01EN6_n11655TransferSt = new boolean[] {false} ;
      T01EN6_A396EmprCod = new String[] {""} ;
      T01EN6_A3839CcoCod = new short[1] ;
      T01EN6_n3839CcoCod = new boolean[] {false} ;
      T01EN12_A396EmprCod = new String[] {""} ;
      T01EN12_A11644TransferId = new long[1] ;
      T01EN13_A396EmprCod = new String[] {""} ;
      T01EN13_A11644TransferId = new long[1] ;
      T01EN5_A11644TransferId = new long[1] ;
      T01EN5_A11645TransferDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01EN5_n11645TransferDi = new boolean[] {false} ;
      T01EN5_A11646TransferAO = new byte[1] ;
      T01EN5_n11646TransferAO = new boolean[] {false} ;
      T01EN5_A11648TransferAD = new byte[1] ;
      T01EN5_n11648TransferAD = new boolean[] {false} ;
      T01EN5_A11643TransferTp = new String[] {""} ;
      T01EN5_n11643TransferTp = new boolean[] {false} ;
      T01EN5_A11650TransferFb = new String[] {""} ;
      T01EN5_n11650TransferFb = new boolean[] {false} ;
      T01EN5_A11651TransferUs = new String[] {""} ;
      T01EN5_n11651TransferUs = new boolean[] {false} ;
      T01EN5_A11652TransferUt = new int[1] ;
      T01EN5_n11652TransferUt = new boolean[] {false} ;
      T01EN5_A11655TransferSt = new byte[1] ;
      T01EN5_n11655TransferSt = new boolean[] {false} ;
      T01EN5_A396EmprCod = new String[] {""} ;
      T01EN5_A3839CcoCod = new short[1] ;
      T01EN5_n3839CcoCod = new boolean[] {false} ;
      T01EN17_A3840CcoDsc = new String[] {""} ;
      T01EN17_n3840CcoDsc = new boolean[] {false} ;
      T01EN19_A396EmprCod = new String[] {""} ;
      T01EN19_A11644TransferId = new long[1] ;
      Z718PrdNom = "" ;
      T01EN20_A11644TransferId = new long[1] ;
      T01EN20_A11653TransferLn = new int[1] ;
      T01EN20_A718PrdNom = new String[] {""} ;
      T01EN20_A11654TransferCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EN20_n11654TransferCt = new boolean[] {false} ;
      T01EN20_A396EmprCod = new String[] {""} ;
      T01EN20_A719PrdNum = new String[] {""} ;
      T01EN20_n719PrdNum = new boolean[] {false} ;
      T01EN4_A718PrdNom = new String[] {""} ;
      T01EN21_A718PrdNom = new String[] {""} ;
      T01EN22_A396EmprCod = new String[] {""} ;
      T01EN22_A11644TransferId = new long[1] ;
      T01EN22_A11653TransferLn = new int[1] ;
      T01EN3_A11644TransferId = new long[1] ;
      T01EN3_A11653TransferLn = new int[1] ;
      T01EN3_A11654TransferCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EN3_n11654TransferCt = new boolean[] {false} ;
      T01EN3_A396EmprCod = new String[] {""} ;
      T01EN3_A719PrdNum = new String[] {""} ;
      T01EN3_n719PrdNum = new boolean[] {false} ;
      T01EN2_A11644TransferId = new long[1] ;
      T01EN2_A11653TransferLn = new int[1] ;
      T01EN2_A11654TransferCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EN2_n11654TransferCt = new boolean[] {false} ;
      T01EN2_A396EmprCod = new String[] {""} ;
      T01EN2_A719PrdNum = new String[] {""} ;
      T01EN2_n719PrdNum = new boolean[] {false} ;
      T01EN26_A718PrdNom = new String[] {""} ;
      T01EN27_A396EmprCod = new String[] {""} ;
      T01EN27_A11644TransferId = new long[1] ;
      T01EN27_A11653TransferLn = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      i11651TransferUs = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      T01EN28_A407EmprNom = new String[] {""} ;
      T01EN28_n407EmprNom = new boolean[] {false} ;
      Z11649TransferDD = "" ;
      Z11647TransferOD = "" ;
      GXv_int8 = new int[1] ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11645TransferDi = GXutil.resetTime( GXutil.nullDate() );
      ZZ11643TransferTp = "" ;
      ZZ11650TransferFb = "" ;
      ZZ11651TransferUs = "" ;
      ZZ11649TransferDD = "" ;
      ZZ11647TransferOD = "" ;
      ZZ3840CcoDsc = "" ;
      GXt_char1 = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV32Msg_erro = "" ;
      ZV33Msg_errd = "" ;
      ZV36TxtLineas = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrf000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrf000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrf000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrf000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrf000__default(),
         new Object[] {
             new Object[] {
            T01EN2_A11644TransferId, T01EN2_A11653TransferLn, T01EN2_A11654TransferCt, T01EN2_n11654TransferCt, T01EN2_A396EmprCod, T01EN2_A719PrdNum, T01EN2_n719PrdNum
            }
            , new Object[] {
            T01EN3_A11644TransferId, T01EN3_A11653TransferLn, T01EN3_A11654TransferCt, T01EN3_n11654TransferCt, T01EN3_A396EmprCod, T01EN3_A719PrdNum, T01EN3_n719PrdNum
            }
            , new Object[] {
            T01EN4_A718PrdNom
            }
            , new Object[] {
            T01EN5_A11644TransferId, T01EN5_A11645TransferDi, T01EN5_n11645TransferDi, T01EN5_A11646TransferAO, T01EN5_n11646TransferAO, T01EN5_A11648TransferAD, T01EN5_n11648TransferAD, T01EN5_A11643TransferTp, T01EN5_n11643TransferTp, T01EN5_A11650TransferFb,
            T01EN5_n11650TransferFb, T01EN5_A11651TransferUs, T01EN5_n11651TransferUs, T01EN5_A11652TransferUt, T01EN5_n11652TransferUt, T01EN5_A11655TransferSt, T01EN5_n11655TransferSt, T01EN5_A396EmprCod, T01EN5_A3839CcoCod, T01EN5_n3839CcoCod
            }
            , new Object[] {
            T01EN6_A11644TransferId, T01EN6_A11645TransferDi, T01EN6_n11645TransferDi, T01EN6_A11646TransferAO, T01EN6_n11646TransferAO, T01EN6_A11648TransferAD, T01EN6_n11648TransferAD, T01EN6_A11643TransferTp, T01EN6_n11643TransferTp, T01EN6_A11650TransferFb,
            T01EN6_n11650TransferFb, T01EN6_A11651TransferUs, T01EN6_n11651TransferUs, T01EN6_A11652TransferUt, T01EN6_n11652TransferUt, T01EN6_A11655TransferSt, T01EN6_n11655TransferSt, T01EN6_A396EmprCod, T01EN6_A3839CcoCod, T01EN6_n3839CcoCod
            }
            , new Object[] {
            T01EN7_A407EmprNom, T01EN7_n407EmprNom
            }
            , new Object[] {
            T01EN8_A3840CcoDsc, T01EN8_n3840CcoDsc
            }
            , new Object[] {
            T01EN9_A11644TransferId, T01EN9_A407EmprNom, T01EN9_n407EmprNom, T01EN9_A11645TransferDi, T01EN9_n11645TransferDi, T01EN9_A11646TransferAO, T01EN9_n11646TransferAO, T01EN9_A11648TransferAD, T01EN9_n11648TransferAD, T01EN9_A11643TransferTp,
            T01EN9_n11643TransferTp, T01EN9_A3840CcoDsc, T01EN9_n3840CcoDsc, T01EN9_A11650TransferFb, T01EN9_n11650TransferFb, T01EN9_A11651TransferUs, T01EN9_n11651TransferUs, T01EN9_A11652TransferUt, T01EN9_n11652TransferUt, T01EN9_A11655TransferSt,
            T01EN9_n11655TransferSt, T01EN9_A396EmprCod, T01EN9_A3839CcoCod, T01EN9_n3839CcoCod
            }
            , new Object[] {
            T01EN10_A3840CcoDsc, T01EN10_n3840CcoDsc
            }
            , new Object[] {
            T01EN11_A396EmprCod, T01EN11_A11644TransferId
            }
            , new Object[] {
            T01EN12_A396EmprCod, T01EN12_A11644TransferId
            }
            , new Object[] {
            T01EN13_A396EmprCod, T01EN13_A11644TransferId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EN17_A3840CcoDsc, T01EN17_n3840CcoDsc
            }
            , new Object[] {
            }
            , new Object[] {
            T01EN19_A396EmprCod, T01EN19_A11644TransferId
            }
            , new Object[] {
            T01EN20_A11644TransferId, T01EN20_A11653TransferLn, T01EN20_A718PrdNom, T01EN20_A11654TransferCt, T01EN20_n11654TransferCt, T01EN20_A396EmprCod, T01EN20_A719PrdNum, T01EN20_n719PrdNum
            }
            , new Object[] {
            T01EN21_A718PrdNom
            }
            , new Object[] {
            T01EN22_A396EmprCod, T01EN22_A11644TransferId, T01EN22_A11653TransferLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EN26_A718PrdNom
            }
            , new Object[] {
            T01EN27_A396EmprCod, T01EN27_A11644TransferId, T01EN27_A11653TransferLn
            }
            , new Object[] {
            T01EN28_A407EmprNom, T01EN28_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV40Pgmname = "TTRF000" ;
      Z11655TransferSt = (byte)(0) ;
      n11655TransferSt = false ;
      A11655TransferSt = (byte)(0) ;
      n11655TransferSt = false ;
      i11655TransferSt = (byte)(0) ;
      n11655TransferSt = false ;
      Z11651TransferUs = "" ;
      n11651TransferUs = false ;
      A11651TransferUs = "" ;
      n11651TransferUs = false ;
      i11651TransferUs = "" ;
      n11651TransferUs = false ;
      Z11645TransferDi = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11645TransferDi = false ;
      A11645TransferDi = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11645TransferDi = false ;
      i11645TransferDi = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11645TransferDi = false ;
   }

   private byte Z11646TransferAO ;
   private byte Z11648TransferAD ;
   private byte Z11655TransferSt ;
   private byte GxWebError ;
   private byte A11646TransferAO ;
   private byte A11648TransferAD ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A11655TransferSt ;
   private byte AV38EliotLavanderia ;
   private byte AV35ExisteContador ;
   private byte GXt_int5 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11655TransferSt ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ11646TransferAO ;
   private byte ZZ11648TransferAD ;
   private byte ZZ11655TransferSt ;
   private byte GXv_int6[] ;
   private short Z3839CcoCod ;
   private short nRcdDeleted_1548 ;
   private short nRcdExists_1548 ;
   private short nIsMod_1548 ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1548 ;
   private short RcdFound1548 ;
   private short nBlankRcdUsr1548 ;
   private short RcdFound1547 ;
   private short nIsDirty_1547 ;
   private short nIsDirty_1548 ;
   private short ZZ3839CcoCod ;
   private int Z11652TransferUt ;
   private int O11652TransferUt ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int Z11653TransferLn ;
   private int trnEnded ;
   private int A11652TransferUt ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTransferId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTransferDi_Enabled ;
   private int edtTransferAO_Enabled ;
   private int edtTransferOD_Enabled ;
   private int edtTransferAD_Enabled ;
   private int edtTransferDD_Enabled ;
   private int edtCcoCod_Enabled ;
   private int edtCcoDsc_Enabled ;
   private int edtTransferFb_Enabled ;
   private int edtTransferUs_Enabled ;
   private int edtTransferUt_Enabled ;
   private int edtTransferSt_Enabled ;
   private int B11652TransferUt ;
   private int edtavnRcdDeleted_1548_Enabled ;
   private int edtTransferLn_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtTransferCt_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s11652TransferUt ;
   private int A11653TransferLn ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtTransferLn_Enabled ;
   private int i11652TransferUt ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTransferSt_Backcolor ;
   private int edtTransferUt_Backcolor ;
   private int edtTransferUs_Backcolor ;
   private int edtTransferFb_Backcolor ;
   private int edtCcoDsc_Backcolor ;
   private int edtCcoCod_Backcolor ;
   private int edtTransferDD_Backcolor ;
   private int edtTransferAD_Backcolor ;
   private int edtTransferOD_Backcolor ;
   private int edtTransferAO_Backcolor ;
   private int edtTransferDi_Backcolor ;
   private int edtTransferId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int8[] ;
   private int ZZ11652TransferUt ;
   private int ZO11652TransferUt ;
   private long Z11644TransferId ;
   private long A11644TransferId ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int7[] ;
   private long ZZ11644TransferId ;
   private java.math.BigDecimal Z11654TransferCt ;
   private java.math.BigDecimal AV34ExisCC ;
   private java.math.BigDecimal A11654TransferCt ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11643TransferTp ;
   private String Z11650TransferFb ;
   private String Z11651TransferUs ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV32Msg_erro ;
   private String AV33Msg_errd ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTransferId_Internalname ;
   private String sGXsfl_95_idx="0001" ;
   private String A11643TransferTp ;
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
   private String edtTransferId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTransferDi_Internalname ;
   private String edtTransferDi_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTransferAO_Internalname ;
   private String edtTransferAO_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTransferOD_Internalname ;
   private String A11647TransferOD ;
   private String edtTransferOD_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTransferAD_Internalname ;
   private String edtTransferAD_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTransferDD_Internalname ;
   private String A11649TransferDD ;
   private String edtTransferDD_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCcoCod_Internalname ;
   private String edtCcoCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCcoDsc_Internalname ;
   private String A3840CcoDsc ;
   private String edtCcoDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTransferFb_Internalname ;
   private String A11650TransferFb ;
   private String edtTransferFb_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTransferUs_Internalname ;
   private String A11651TransferUs ;
   private String edtTransferUs_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTransferUt_Internalname ;
   private String edtTransferUt_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtTransferSt_Internalname ;
   private String edtTransferSt_Jsonclick ;
   private String sMode1548 ;
   private String edtavnRcdDeleted_1548_Internalname ;
   private String edtTransferLn_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtTransferCt_Internalname ;
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
   private String AV8UsurCod ;
   private String AV40Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1547 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV37CabTxt ;
   private String Z407EmprNom ;
   private String Z3840CcoDsc ;
   private String Z718PrdNom ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1548_Jsonclick ;
   private String edtTransferLn_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtTransferCt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11651TransferUs ;
   private String subGrid1_Header ;
   private String Z11649TransferDD ;
   private String Z11647TransferOD ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ11643TransferTp ;
   private String ZZ11650TransferFb ;
   private String ZZ11651TransferUs ;
   private String ZZ11649TransferDD ;
   private String ZZ11647TransferOD ;
   private String ZZ3840CcoDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV32Msg_erro ;
   private String ZV33Msg_errd ;
   private java.util.Date Z11645TransferDi ;
   private java.util.Date A11645TransferDi ;
   private java.util.Date i11645TransferDi ;
   private java.util.Date ZZ11645TransferDi ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n11646TransferAO ;
   private boolean n11648TransferAD ;
   private boolean n3839CcoCod ;
   private boolean wbErr ;
   private boolean n11652TransferUt ;
   private boolean n11643TransferTp ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11645TransferDi ;
   private boolean n3840CcoDsc ;
   private boolean n11650TransferFb ;
   private boolean n11651TransferUs ;
   private boolean n11655TransferSt ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n11654TransferCt ;
   private String AV36TxtLineas ;
   private String ZV36TxtLineas ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbTransferTp ;
   private IDataStoreProvider pr_default ;
   private String[] T01EN7_A407EmprNom ;
   private boolean[] T01EN7_n407EmprNom ;
   private long[] T01EN9_A11644TransferId ;
   private String[] T01EN9_A407EmprNom ;
   private boolean[] T01EN9_n407EmprNom ;
   private java.util.Date[] T01EN9_A11645TransferDi ;
   private boolean[] T01EN9_n11645TransferDi ;
   private byte[] T01EN9_A11646TransferAO ;
   private boolean[] T01EN9_n11646TransferAO ;
   private byte[] T01EN9_A11648TransferAD ;
   private boolean[] T01EN9_n11648TransferAD ;
   private String[] T01EN9_A11643TransferTp ;
   private boolean[] T01EN9_n11643TransferTp ;
   private String[] T01EN9_A3840CcoDsc ;
   private boolean[] T01EN9_n3840CcoDsc ;
   private String[] T01EN9_A11650TransferFb ;
   private boolean[] T01EN9_n11650TransferFb ;
   private String[] T01EN9_A11651TransferUs ;
   private boolean[] T01EN9_n11651TransferUs ;
   private int[] T01EN9_A11652TransferUt ;
   private boolean[] T01EN9_n11652TransferUt ;
   private byte[] T01EN9_A11655TransferSt ;
   private boolean[] T01EN9_n11655TransferSt ;
   private String[] T01EN9_A396EmprCod ;
   private short[] T01EN9_A3839CcoCod ;
   private boolean[] T01EN9_n3839CcoCod ;
   private String[] T01EN8_A3840CcoDsc ;
   private boolean[] T01EN8_n3840CcoDsc ;
   private String[] T01EN10_A3840CcoDsc ;
   private boolean[] T01EN10_n3840CcoDsc ;
   private String[] T01EN11_A396EmprCod ;
   private long[] T01EN11_A11644TransferId ;
   private long[] T01EN6_A11644TransferId ;
   private java.util.Date[] T01EN6_A11645TransferDi ;
   private boolean[] T01EN6_n11645TransferDi ;
   private byte[] T01EN6_A11646TransferAO ;
   private boolean[] T01EN6_n11646TransferAO ;
   private byte[] T01EN6_A11648TransferAD ;
   private boolean[] T01EN6_n11648TransferAD ;
   private String[] T01EN6_A11643TransferTp ;
   private boolean[] T01EN6_n11643TransferTp ;
   private String[] T01EN6_A11650TransferFb ;
   private boolean[] T01EN6_n11650TransferFb ;
   private String[] T01EN6_A11651TransferUs ;
   private boolean[] T01EN6_n11651TransferUs ;
   private int[] T01EN6_A11652TransferUt ;
   private boolean[] T01EN6_n11652TransferUt ;
   private byte[] T01EN6_A11655TransferSt ;
   private boolean[] T01EN6_n11655TransferSt ;
   private String[] T01EN6_A396EmprCod ;
   private short[] T01EN6_A3839CcoCod ;
   private boolean[] T01EN6_n3839CcoCod ;
   private String[] T01EN12_A396EmprCod ;
   private long[] T01EN12_A11644TransferId ;
   private String[] T01EN13_A396EmprCod ;
   private long[] T01EN13_A11644TransferId ;
   private long[] T01EN5_A11644TransferId ;
   private java.util.Date[] T01EN5_A11645TransferDi ;
   private boolean[] T01EN5_n11645TransferDi ;
   private byte[] T01EN5_A11646TransferAO ;
   private boolean[] T01EN5_n11646TransferAO ;
   private byte[] T01EN5_A11648TransferAD ;
   private boolean[] T01EN5_n11648TransferAD ;
   private String[] T01EN5_A11643TransferTp ;
   private boolean[] T01EN5_n11643TransferTp ;
   private String[] T01EN5_A11650TransferFb ;
   private boolean[] T01EN5_n11650TransferFb ;
   private String[] T01EN5_A11651TransferUs ;
   private boolean[] T01EN5_n11651TransferUs ;
   private int[] T01EN5_A11652TransferUt ;
   private boolean[] T01EN5_n11652TransferUt ;
   private byte[] T01EN5_A11655TransferSt ;
   private boolean[] T01EN5_n11655TransferSt ;
   private String[] T01EN5_A396EmprCod ;
   private short[] T01EN5_A3839CcoCod ;
   private boolean[] T01EN5_n3839CcoCod ;
   private String[] T01EN17_A3840CcoDsc ;
   private boolean[] T01EN17_n3840CcoDsc ;
   private String[] T01EN19_A396EmprCod ;
   private long[] T01EN19_A11644TransferId ;
   private long[] T01EN20_A11644TransferId ;
   private int[] T01EN20_A11653TransferLn ;
   private String[] T01EN20_A718PrdNom ;
   private java.math.BigDecimal[] T01EN20_A11654TransferCt ;
   private boolean[] T01EN20_n11654TransferCt ;
   private String[] T01EN20_A396EmprCod ;
   private String[] T01EN20_A719PrdNum ;
   private boolean[] T01EN20_n719PrdNum ;
   private String[] T01EN4_A718PrdNom ;
   private String[] T01EN21_A718PrdNom ;
   private String[] T01EN22_A396EmprCod ;
   private long[] T01EN22_A11644TransferId ;
   private int[] T01EN22_A11653TransferLn ;
   private long[] T01EN3_A11644TransferId ;
   private int[] T01EN3_A11653TransferLn ;
   private java.math.BigDecimal[] T01EN3_A11654TransferCt ;
   private boolean[] T01EN3_n11654TransferCt ;
   private String[] T01EN3_A396EmprCod ;
   private String[] T01EN3_A719PrdNum ;
   private boolean[] T01EN3_n719PrdNum ;
   private long[] T01EN2_A11644TransferId ;
   private int[] T01EN2_A11653TransferLn ;
   private java.math.BigDecimal[] T01EN2_A11654TransferCt ;
   private boolean[] T01EN2_n11654TransferCt ;
   private String[] T01EN2_A396EmprCod ;
   private String[] T01EN2_A719PrdNum ;
   private boolean[] T01EN2_n719PrdNum ;
   private String[] T01EN26_A718PrdNom ;
   private String[] T01EN27_A396EmprCod ;
   private long[] T01EN27_A11644TransferId ;
   private int[] T01EN27_A11653TransferLn ;
   private String[] T01EN28_A407EmprNom ;
   private boolean[] T01EN28_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrf000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrf000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrf000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrf000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrf000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EN2", "SELECT TransferId, TransferLn, TransferCt, EmprCod, PrdNum FROM TXPTRF001 WHERE EmprCod = ? AND TransferId = ? AND TransferLn = ?  FOR UPDATE OF TransferCt, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN3", "SELECT TransferId, TransferLn, TransferCt, EmprCod, PrdNum FROM TXPTRF001 WHERE EmprCod = ? AND TransferId = ? AND TransferLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN4", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN5", "SELECT TransferId, TransferDi, TransferAO, TransferAD, TransferTp, TransferFb, TransferUs, TransferUt, TransferSt, EmprCod, CcoCod FROM TXPTRF000 WHERE EmprCod = ? AND TransferId = ?  FOR UPDATE OF TransferDi, TransferAO, TransferAD, TransferTp, TransferFb, TransferUs, TransferUt, TransferSt, CcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN6", "SELECT TransferId, TransferDi, TransferAO, TransferAD, TransferTp, TransferFb, TransferUs, TransferUt, TransferSt, EmprCod, CcoCod FROM TXPTRF000 WHERE EmprCod = ? AND TransferId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN8", "SELECT CcoDsc FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN9", "SELECT /*+ FIRST_ROWS(100) */ TM1.TransferId, T2.EmprNom, TM1.TransferDi, TM1.TransferAO, TM1.TransferAD, TM1.TransferTp, T3.CcoDsc, TM1.TransferFb, TM1.TransferUs, TM1.TransferUt, TM1.TransferSt, TM1.EmprCod, TM1.CcoCod FROM ((TXPTRF000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCENTCO T3 ON T3.CcoCod = TM1.CcoCod) WHERE TM1.EmprCod = ? and TM1.TransferId = ? ORDER BY TM1.EmprCod, TM1.TransferId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN10", "SELECT CcoDsc FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TransferId FROM TXPTRF000 WHERE EmprCod = ? AND TransferId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TransferId FROM TXPTRF000 WHERE ( TransferId > ?) and EmprCod = ? ORDER BY EmprCod, TransferId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EN13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TransferId FROM TXPTRF000 WHERE ( TransferId < ?) and EmprCod = ? ORDER BY EmprCod DESC, TransferId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EN14", "INSERT INTO TXPTRF000(TransferId, TransferDi, TransferAO, TransferAD, TransferTp, TransferFb, TransferUs, TransferUt, TransferSt, EmprCod, CcoCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRF000")
         ,new UpdateCursor("T01EN15", "UPDATE TXPTRF000 SET TransferDi=?, TransferAO=?, TransferAD=?, TransferTp=?, TransferFb=?, TransferUs=?, TransferUt=?, TransferSt=?, CcoCod=?  WHERE EmprCod = ? AND TransferId = ?", GX_NOMASK, "TXPTRF000")
         ,new UpdateCursor("T01EN16", "DELETE FROM TXPTRF000  WHERE EmprCod = ? AND TransferId = ?", GX_NOMASK, "TXPTRF000")
         ,new ForEachCursor("T01EN17", "SELECT CcoDsc FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EN18", "UPDATE TXPTRF000 SET TransferUt=?  WHERE EmprCod = ? AND TransferId = ?", GX_NOMASK, "TXPTRF000")
         ,new ForEachCursor("T01EN19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TransferId FROM TXPTRF000 WHERE EmprCod = ? ORDER BY EmprCod, TransferId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN20", "SELECT T1.TransferId, T1.TransferLn, T2.PrdNom, T1.TransferCt, T1.EmprCod, T1.PrdNum FROM (TXPTRF001 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.TransferId = ? and T1.TransferLn = ? ORDER BY T1.EmprCod, T1.TransferId, T1.TransferLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN21", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN22", "SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND TransferId = ? AND TransferLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EN23", "INSERT INTO TXPTRF001(TransferId, TransferLn, TransferCt, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRF001")
         ,new UpdateCursor("T01EN24", "UPDATE TXPTRF001 SET TransferCt=?, PrdNum=?  WHERE EmprCod = ? AND TransferId = ? AND TransferLn = ?", GX_NOMASK, "TXPTRF001")
         ,new UpdateCursor("T01EN25", "DELETE FROM TXPTRF001  WHERE EmprCod = ? AND TransferId = ? AND TransferLn = ?", GX_NOMASK, "TXPTRF001")
         ,new ForEachCursor("T01EN26", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN27", "SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? and TransferId = ? ORDER BY EmprCod, TransferId, TransferLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EN28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 60);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 60);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setLong(11, ((Number) parms[19]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               }
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

