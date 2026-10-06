package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfpcc_impl extends GXDataArea
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.GetPar( "ForProC") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FASES QUE COMPONEN EL PROCESO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtForProPK_Internalname ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
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

   public tfpcc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfpcc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfpcc_impl.class ));
   }

   public tfpcc_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e1115I2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFPCC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProC_Internalname, GXutil.rtrim( A9766ForProC), GXutil.rtrim( localUtil.format( A9766ForProC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProC_Jsonclick, 0, "", "", "", "", "", 1, edtForProC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Precio Kg", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProPK_Internalname, GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForProPK_Enabled!=0) ? localUtil.format( A9768ForProPK, "ZZZZZ9.99999") : localUtil.format( A9768ForProPK, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProPK_Jsonclick, 0, "", "", "", "", "", 1, edtForProPK_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Precio Mt", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProPM_Internalname, GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForProPM_Enabled!=0) ? localUtil.format( A9769ForProPM, "ZZZZZ9.99999") : localUtil.format( A9769ForProPM, "ZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProPM_Jsonclick, 0, "", "", "", "", "", 1, edtForProPM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "SPK", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSPK_Internalname, GXutil.ltrim( localUtil.ntoc( A9850SPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSPK_Enabled!=0) ? localUtil.format( A9850SPK, "ZZZZZ9.99999") : localUtil.format( A9850SPK, "ZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSPK_Jsonclick, 0, "", "", "", "", "", 1, edtSPK_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "SPM", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSPM_Internalname, GXutil.ltrim( localUtil.ntoc( A9851SPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSPM_Enabled!=0) ? localUtil.format( A9851SPM, "ZZZZZ9.99999") : localUtil.format( A9851SPM, "ZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSPM_Jsonclick, 0, "", "", "", "", "", 1, edtSPM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFPCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1297 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1297 = (short)(1) ;
            scanStart15I1297( ) ;
            while ( RcdFound1297 != 0 )
            {
               init_level_properties1297( ) ;
               getByPrimaryKey15I1297( ) ;
               addRow15I1297( ) ;
               scanNext15I1297( ) ;
            }
            scanEnd15I1297( ) ;
            nBlankRcdCount1297 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9851SPM = A9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         B9850SPK = A9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         standaloneNotModal15I1297( ) ;
         standaloneModal15I1297( ) ;
         sMode1297 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow15I1297( ) ;
            edtavnRcdDeleted_1297_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1297_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1297_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1297_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtForProL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtFasAq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAQ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAq_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtDFsAq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DFSAQ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDFsAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDFsAq_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtForProFK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProFK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFK_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtForProFM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProFM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1297 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal15I1297( ) ;
            }
            sendRow15I1297( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1297 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9851SPM = B9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         A9850SPK = B9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1297 = (short)(5) ;
         nRcdExists_1297 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart15I1297( ) ;
            while ( RcdFound1297 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801297( ) ;
               init_level_properties1297( ) ;
               standaloneNotModal15I1297( ) ;
               getByPrimaryKey15I1297( ) ;
               standaloneModal15I1297( ) ;
               addRow15I1297( ) ;
               scanNext15I1297( ) ;
            }
            scanEnd15I1297( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1297 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801297( ) ;
      initAll15I1297( ) ;
      init_level_properties1297( ) ;
      B9851SPM = A9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      B9850SPK = A9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      nRcdExists_1297 = (short)(0) ;
      nIsMod_1297 = (short)(0) ;
      nRcdDeleted_1297 = (short)(0) ;
      nBlankRcdCount1297 = (short)(nBlankRcdUsr1297+nBlankRcdCount1297) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1297 > 0 )
      {
         standaloneNotModal15I1297( ) ;
         standaloneModal15I1297( ) ;
         addRow15I1297( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtForProL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1297 = (short)(nBlankRcdCount1297-1) ;
      }
      Gx_mode = sMode1297 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9851SPM = B9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      A9850SPK = B9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFPCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFPCC.htm");
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
      e1215I2 ();
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
            Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
            Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
            Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9766ForProC = httpContext.cgiGet( "Z9766ForProC") ;
            Z9768ForProPK = localUtil.ctond( httpContext.cgiGet( "Z9768ForProPK")) ;
            Z9769ForProPM = localUtil.ctond( httpContext.cgiGet( "Z9769ForProPM")) ;
            O9851SPM = localUtil.ctond( httpContext.cgiGet( "O9851SPM")) ;
            O9850SPK = localUtil.ctond( httpContext.cgiGet( "O9850SPK")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPROPK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForProPK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9768ForProPK = DecimalUtil.ZERO ;
               n9768ForProPK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrimstr( A9768ForProPK, 12, 5));
            }
            else
            {
               A9768ForProPK = localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)) ;
               n9768ForProPK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrimstr( A9768ForProPK, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPROPM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForProPM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9769ForProPM = DecimalUtil.ZERO ;
               n9769ForProPM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrimstr( A9769ForProPM, 12, 5));
            }
            else
            {
               A9769ForProPM = localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)) ;
               n9769ForProPM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrimstr( A9769ForProPM, 12, 5));
            }
            A9850SPK = localUtil.ctond( httpContext.cgiGet( edtSPK_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
            A9851SPM = localUtil.ctond( httpContext.cgiGet( edtSPM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
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
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A9766ForProC = httpContext.GetPar( "ForProC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
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
                        e1215I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e1115I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PROCESO QUIMICO?'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Proceso QUimico?' */
                        e1315I2 ();
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
            initAll15I1280( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1297_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1297_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes15I1280( ) ;
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

   public void confirm_15I0( )
   {
      beforeValidate15I1280( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15I1280( ) ;
         }
         else
         {
            checkExtendedTable15I1280( ) ;
            if ( AnyError == 0 )
            {
               zm15I1280( 5) ;
               zm15I1280( 6) ;
               zm15I1280( 7) ;
            }
            closeExtendedTableCursors15I1280( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1280 = Gx_mode ;
         confirm_15I1297( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1280 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues15I0( ) ;
      }
   }

   public void confirm_15I1297( )
   {
      s9851SPM = O9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      s9850SPK = O9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15I1297( ) ;
         if ( ( nRcdExists_1297 != 0 ) || ( nIsMod_1297 != 0 ) )
         {
            getKey15I1297( ) ;
            if ( ( nRcdExists_1297 == 0 ) && ( nRcdDeleted_1297 == 0 ) )
            {
               if ( RcdFound1297 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate15I1297( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable15I1297( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors15I1297( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9851SPM = A9851SPM ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
                     O9850SPK = A9850SPK ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
                  }
               }
               else
               {
                  GXCCtl = "FORPROL_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForProL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1297 != 0 )
               {
                  if ( nRcdDeleted_1297 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey15I1297( ) ;
                     load15I1297( ) ;
                     beforeValidate15I1297( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls15I1297( ) ;
                        O9851SPM = A9851SPM ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
                        O9850SPK = A9850SPK ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1297 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate15I1297( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable15I1297( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors15I1297( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9851SPM = A9851SPM ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
                           O9850SPK = A9850SPK ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1297 == 0 )
                  {
                     GXCCtl = "FORPROL_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1297_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProL_Internalname, GXutil.ltrim( localUtil.ntoc( A9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasAq_Internalname, GXutil.rtrim( A9858FasAq)) ;
         httpContext.changePostValue( edtDFsAq_Internalname, GXutil.rtrim( A9859DFsAq)) ;
         httpContext.changePostValue( edtForProFK_Internalname, GXutil.ltrim( localUtil.ntoc( A9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFM_Internalname, GXutil.ltrim( localUtil.ntoc( A9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9847ForProL_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9858FasAq_"+sGXsfl_80_idx, GXutil.rtrim( Z9858FasAq)) ;
         httpContext.changePostValue( "ZT_"+"Z9859DFsAq_"+sGXsfl_80_idx, GXutil.rtrim( Z9859DFsAq)) ;
         httpContext.changePostValue( "ZT_"+"Z9848ForProFK_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9849ForProFM_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9849ForProFM_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9848ForProFK_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1297 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1297_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1297_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DFSAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDFsAq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9851SPM = s9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      O9850SPK = s9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption15I0( )
   {
   }

   public void e1215I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tfpcc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tfpcc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tfpcc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Articulo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Tc", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfpcc_impl.this.A396EmprCod = GXv_char2[0] ;
      tfpcc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tfpcc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e1115I2 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e1115I2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int6[0] = A483ForColNum ;
      GXv_int7[0] = A831TipColCod ;
      GXv_char8[0] = A9766ForProC ;
      new app.pctrlp(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7, GXv_char8) ;
      tfpcc_impl.this.A396EmprCod = GXv_char4[0] ;
      tfpcc_impl.this.A252CliCod = GXv_int5[0] ;
      tfpcc_impl.this.A494ForSer = GXv_char3[0] ;
      tfpcc_impl.this.A482ForColNom = GXv_char2[0] ;
      tfpcc_impl.this.A483ForColNum = GXv_int6[0] ;
      tfpcc_impl.this.A831TipColCod = GXv_int7[0] ;
      tfpcc_impl.this.A9766ForProC = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
      /*  Sending Event outputs  */
   }

   public void e1315I2( )
   {
      /* 'Proceso QUimico?' Routine */
      returnInSub = false ;
      AV32VarAux = (byte)(0) ;
      /*  Sending Event outputs  */
   }

   public void zm15I1280( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9768ForProPK = T015I5_A9768ForProPK[0] ;
            Z9769ForProPM = T015I5_A9769ForProPM[0] ;
         }
         else
         {
            Z9768ForProPK = A9768ForProPK ;
            Z9769ForProPM = A9769ForProPM ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z9766ForProC = A9766ForProC ;
         Z9768ForProPK = A9768ForProPK ;
         Z9769ForProPM = A9769ForProPM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z407EmprNom = A407EmprNom ;
         Z9850SPK = A9850SPK ;
         Z9851SPM = A9851SPM ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TFPCC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T015I6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015I6_A407EmprNom[0] ;
      n407EmprNom = T015I6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T015I7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor T015I9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A9850SPK = T015I9_A9850SPK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         A9851SPM = T015I9_A9851SPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      else
      {
         A9850SPK = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         A9851SPM = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      O9850SPK = A9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      O9851SPM = A9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  || isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
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

   public void load15I1280( )
   {
      /* Using cursor T015I11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A407EmprNom = T015I11_A407EmprNom[0] ;
         n407EmprNom = T015I11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9768ForProPK = T015I11_A9768ForProPK[0] ;
         n9768ForProPK = T015I11_n9768ForProPK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrimstr( A9768ForProPK, 12, 5));
         A9769ForProPM = T015I11_A9769ForProPM[0] ;
         n9769ForProPM = T015I11_n9769ForProPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrimstr( A9769ForProPM, 12, 5));
         A9850SPK = T015I11_A9850SPK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         A9851SPM = T015I11_A9851SPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         zm15I1280( -4) ;
      }
      pr_default.close(7);
      onLoadActions15I1280( ) ;
   }

   public void onLoadActions15I1280( )
   {
      O9851SPM = A9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      O9850SPK = A9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
   }

   public void checkExtendedTable15I1280( )
   {
      nIsDirty_1280 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15I1280( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15I1280( )
   {
      /* Using cursor T015I12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      else
      {
         RcdFound1280 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015I5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T015I5_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T015I5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I5_A252CliCod[0] == A252CliCod ) && ( T015I5_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I5_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I5_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I5_A483ForColNum[0] == A483ForColNum ) )
      {
         zm15I1280( 4) ;
         RcdFound1280 = (short)(1) ;
         A9768ForProPK = T015I5_A9768ForProPK[0] ;
         n9768ForProPK = T015I5_n9768ForProPK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrimstr( A9768ForProPK, 12, 5));
         A9769ForProPM = T015I5_A9769ForProPM[0] ;
         n9769ForProPM = T015I5_n9769ForProPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrimstr( A9769ForProPM, 12, 5));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15I1280( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1280 = (short)(0) ;
            initializeNonKey15I1280( ) ;
         }
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1280 = (short)(0) ;
         initializeNonKey15I1280( ) ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15I1280( ) ;
      if ( RcdFound1280 == 0 )
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
      RcdFound1280 = (short)(0) ;
      /* Using cursor T015I13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015I13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015I13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I13_A483ForColNum[0] == A483ForColNum ) && ( T015I13_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I13_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015I13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015I13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I13_A483ForColNum[0] == A483ForColNum ) && ( T015I13_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I13_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            RcdFound1280 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1280 = (short)(0) ;
      /* Using cursor T015I14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015I14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015I14_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I14_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I14_A483ForColNum[0] == A483ForColNum ) && ( T015I14_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I14_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015I14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T015I14_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I14_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I14_A483ForColNum[0] == A483ForColNum ) && ( T015I14_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I14_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            RcdFound1280 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15I1280( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9851SPM = O9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         A9850SPK = O9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         GX_FocusControl = edtForProPK_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15I1280( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1280 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9851SPM = O9851SPM ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
               A9850SPK = O9850SPK ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtForProPK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9851SPM = O9851SPM ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
               A9850SPK = O9850SPK ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
               update15I1280( ) ;
               GX_FocusControl = edtForProPK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9851SPM = O9851SPM ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
               A9850SPK = O9850SPK ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
               GX_FocusControl = edtForProPK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15I1280( ) ;
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
                  A9851SPM = O9851SPM ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
                  A9850SPK = O9850SPK ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
                  GX_FocusControl = edtForProPK_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15I1280( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9851SPM = O9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         A9850SPK = O9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtForProPK_Internalname ;
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
      getKey15I1280( ) ;
      if ( RcdFound1280 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfpcc");
      GX_FocusControl = edtForProPK_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15I0( ) ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtForProPK_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15I1280( ) ;
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForProPK_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15I1280( ) ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForProPK_Internalname ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForProPK_Internalname ;
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
      scanStart15I1280( ) ;
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1280 != 0 )
         {
            scanNext15I1280( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForProPK_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15I1280( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15I1280( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015I4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z9768ForProPK, T015I4_A9768ForProPK[0]) != 0 ) || ( DecimalUtil.compareTo(Z9769ForProPM, T015I4_A9769ForProPM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9768ForProPK, T015I4_A9768ForProPK[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"ForProPK");
               GXutil.writeLogRaw("Old: ",Z9768ForProPK);
               GXutil.writeLogRaw("Current: ",T015I4_A9768ForProPK[0]);
            }
            if ( DecimalUtil.compareTo(Z9769ForProPM, T015I4_A9769ForProPM[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"ForProPM");
               GXutil.writeLogRaw("Old: ",Z9769ForProPM);
               GXutil.writeLogRaw("Current: ",T015I4_A9769ForProPM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15I1280( )
   {
      beforeValidate15I1280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15I1280( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15I1280( 0) ;
         checkOptimisticConcurrency15I1280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15I1280( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15I1280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015I15 */
                  pr_default.execute(11, new Object[] {A9766ForProC, Boolean.valueOf(n9768ForProPK), A9768ForProPK, Boolean.valueOf(n9769ForProPM), A9769ForProPM, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
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
                        processLevel15I1280( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption15I0( ) ;
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
            load15I1280( ) ;
         }
         endLevel15I1280( ) ;
      }
      closeExtendedTableCursors15I1280( ) ;
   }

   public void update15I1280( )
   {
      beforeValidate15I1280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15I1280( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15I1280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15I1280( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15I1280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015I16 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n9768ForProPK), A9768ForProPK, Boolean.valueOf(n9769ForProPM), A9769ForProPM, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15I1280( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15I1280( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption15I0( ) ;
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
         endLevel15I1280( ) ;
      }
      closeExtendedTableCursors15I1280( ) ;
   }

   public void deferredUpdate15I1280( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15I1280( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15I1280( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15I1280( ) ;
         afterConfirm15I1280( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15I1280( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015I17 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1280 == 0 )
                     {
                        initAll15I1280( ) ;
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
                     resetCaption15I0( ) ;
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
      sMode1280 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15I1280( ) ;
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15I1280( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel15I1297( )
   {
      s9851SPM = O9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      s9850SPK = O9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow15I1297( ) ;
         if ( ( nRcdExists_1297 != 0 ) || ( nIsMod_1297 != 0 ) )
         {
            standaloneNotModal15I1297( ) ;
            getKey15I1297( ) ;
            if ( ( nRcdExists_1297 == 0 ) && ( nRcdDeleted_1297 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert15I1297( ) ;
            }
            else
            {
               if ( RcdFound1297 != 0 )
               {
                  if ( ( nRcdDeleted_1297 != 0 ) && ( nRcdExists_1297 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete15I1297( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1297 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update15I1297( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1297 == 0 )
                  {
                     GXCCtl = "FORPROL_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9851SPM = A9851SPM ;
            httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
            O9850SPK = A9850SPK ;
            httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1297_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProL_Internalname, GXutil.ltrim( localUtil.ntoc( A9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasAq_Internalname, GXutil.rtrim( A9858FasAq)) ;
         httpContext.changePostValue( edtDFsAq_Internalname, GXutil.rtrim( A9859DFsAq)) ;
         httpContext.changePostValue( edtForProFK_Internalname, GXutil.ltrim( localUtil.ntoc( A9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFM_Internalname, GXutil.ltrim( localUtil.ntoc( A9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9847ForProL_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9858FasAq_"+sGXsfl_80_idx, GXutil.rtrim( Z9858FasAq)) ;
         httpContext.changePostValue( "ZT_"+"Z9859DFsAq_"+sGXsfl_80_idx, GXutil.rtrim( Z9859DFsAq)) ;
         httpContext.changePostValue( "ZT_"+"Z9848ForProFK_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9849ForProFM_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9849ForProFM_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9848ForProFK_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1297_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1297 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1297_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1297_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DFSAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDFsAq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll15I1297( ) ;
      if ( AnyError != 0 )
      {
         O9851SPM = s9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         O9850SPK = s9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      }
      nRcdExists_1297 = (short)(0) ;
      nIsMod_1297 = (short)(0) ;
      nRcdDeleted_1297 = (short)(0) ;
   }

   public void processLevel15I1280( )
   {
      /* Save parent mode. */
      sMode1280 = Gx_mode ;
      processNestedLevel15I1297( ) ;
      if ( AnyError != 0 )
      {
         O9851SPM = s9851SPM ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         O9850SPK = s9850SPK ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15I1280( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15I1280( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfpcc");
         if ( AnyError == 0 )
         {
            confirmValues15I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfpcc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15I1280( )
   {
      /* Scan By routine */
      /* Using cursor T015I18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15I1280( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
   }

   public void scanEnd15I1280( )
   {
      pr_default.close(14);
   }

   public void afterConfirm15I1280( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15I1280( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15I1280( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15I1280( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15I1280( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15I1280( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15I1280( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), true);
      edtForProPK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProPK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPK_Enabled), 5, 0), true);
      edtForProPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPM_Enabled), 5, 0), true);
      edtSPK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSPK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSPK_Enabled), 5, 0), true);
      edtSPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSPM_Enabled), 5, 0), true);
   }

   public void zm15I1297( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9858FasAq = T015I3_A9858FasAq[0] ;
            Z9859DFsAq = T015I3_A9859DFsAq[0] ;
            Z9848ForProFK = T015I3_A9848ForProFK[0] ;
            Z9849ForProFM = T015I3_A9849ForProFM[0] ;
         }
         else
         {
            Z9858FasAq = A9858FasAq ;
            Z9859DFsAq = A9859DFsAq ;
            Z9848ForProFK = A9848ForProFK ;
            Z9849ForProFM = A9849ForProFM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z9847ForProL = A9847ForProL ;
         Z9858FasAq = A9858FasAq ;
         Z9859DFsAq = A9859DFsAq ;
         Z9848ForProFK = A9848ForProFK ;
         Z9849ForProFM = A9849ForProFM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal15I1297( )
   {
   }

   public void standaloneModal15I1297( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtForProL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtForProL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load15I1297( )
   {
      /* Using cursor T015I19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1297 = (short)(1) ;
         A9858FasAq = T015I19_A9858FasAq[0] ;
         n9858FasAq = T015I19_n9858FasAq[0] ;
         A9859DFsAq = T015I19_A9859DFsAq[0] ;
         n9859DFsAq = T015I19_n9859DFsAq[0] ;
         A9848ForProFK = T015I19_A9848ForProFK[0] ;
         n9848ForProFK = T015I19_n9848ForProFK[0] ;
         A9849ForProFM = T015I19_A9849ForProFM[0] ;
         n9849ForProFM = T015I19_n9849ForProFM[0] ;
         zm15I1297( -8) ;
      }
      pr_default.close(15);
      onLoadActions15I1297( ) ;
   }

   public void onLoadActions15I1297( )
   {
      if ( isIns( )  )
      {
         A9850SPK = O9850SPK.add(A9848ForProFK) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9850SPK = O9850SPK.add(A9848ForProFK).subtract(O9848ForProFK) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9850SPK = O9850SPK.subtract(O9848ForProFK) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
            }
         }
      }
      if ( isIns( )  )
      {
         A9851SPM = O9851SPM.add(A9849ForProFM) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9851SPM = O9851SPM.add(A9849ForProFM).subtract(O9849ForProFM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9851SPM = O9851SPM.subtract(O9849ForProFM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
            }
         }
      }
   }

   public void checkExtendedTable15I1297( )
   {
      nIsDirty_1297 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal15I1297( ) ;
      if ( isIns( )  )
      {
         nIsDirty_1297 = (short)(1) ;
         A9850SPK = O9850SPK.add(A9848ForProFK) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1297 = (short)(1) ;
            A9850SPK = O9850SPK.add(A9848ForProFK).subtract(O9848ForProFK) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1297 = (short)(1) ;
               A9850SPK = O9850SPK.subtract(O9848ForProFK) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1297 = (short)(1) ;
         A9851SPM = O9851SPM.add(A9849ForProFM) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1297 = (short)(1) ;
            A9851SPM = O9851SPM.add(A9849ForProFM).subtract(O9849ForProFM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1297 = (short)(1) ;
               A9851SPM = O9851SPM.subtract(O9849ForProFM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors15I1297( )
   {
   }

   public void enableDisable15I1297( )
   {
   }

   public void getKey15I1297( )
   {
      /* Using cursor T015I20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1297 = (short)(1) ;
      }
      else
      {
         RcdFound1297 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey15I1297( )
   {
      /* Using cursor T015I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015I3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T015I3_A482ForColNom[0], A482ForColNom) == 0 ) && ( T015I3_A483ForColNum[0] == A483ForColNum ) && ( T015I3_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T015I3_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T015I3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015I3_A252CliCod[0] == A252CliCod ) )
      {
         zm15I1297( 8) ;
         RcdFound1297 = (short)(1) ;
         initializeNonKey15I1297( ) ;
         A9847ForProL = T015I3_A9847ForProL[0] ;
         A9858FasAq = T015I3_A9858FasAq[0] ;
         n9858FasAq = T015I3_n9858FasAq[0] ;
         A9859DFsAq = T015I3_A9859DFsAq[0] ;
         n9859DFsAq = T015I3_n9859DFsAq[0] ;
         A9848ForProFK = T015I3_A9848ForProFK[0] ;
         n9848ForProFK = T015I3_n9848ForProFK[0] ;
         A9849ForProFM = T015I3_A9849ForProFM[0] ;
         n9849ForProFM = T015I3_n9849ForProFM[0] ;
         O9849ForProFM = A9849ForProFM ;
         n9849ForProFM = false ;
         O9848ForProFK = A9848ForProFK ;
         n9848ForProFK = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z9847ForProL = A9847ForProL ;
         sMode1297 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15I1297( ) ;
         load15I1297( ) ;
         Gx_mode = sMode1297 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1297 = (short)(0) ;
         initializeNonKey15I1297( ) ;
         sMode1297 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal15I1297( ) ;
         Gx_mode = sMode1297 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes15I1297( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency15I1297( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015I2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9858FasAq, T015I2_A9858FasAq[0]) != 0 ) || ( GXutil.strcmp(Z9859DFsAq, T015I2_A9859DFsAq[0]) != 0 ) || ( DecimalUtil.compareTo(Z9848ForProFK, T015I2_A9848ForProFK[0]) != 0 ) || ( DecimalUtil.compareTo(Z9849ForProFM, T015I2_A9849ForProFM[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9858FasAq, T015I2_A9858FasAq[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"FasAq");
               GXutil.writeLogRaw("Old: ",Z9858FasAq);
               GXutil.writeLogRaw("Current: ",T015I2_A9858FasAq[0]);
            }
            if ( GXutil.strcmp(Z9859DFsAq, T015I2_A9859DFsAq[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"DFsAq");
               GXutil.writeLogRaw("Old: ",Z9859DFsAq);
               GXutil.writeLogRaw("Current: ",T015I2_A9859DFsAq[0]);
            }
            if ( DecimalUtil.compareTo(Z9848ForProFK, T015I2_A9848ForProFK[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"ForProFK");
               GXutil.writeLogRaw("Old: ",Z9848ForProFK);
               GXutil.writeLogRaw("Current: ",T015I2_A9848ForProFK[0]);
            }
            if ( DecimalUtil.compareTo(Z9849ForProFM, T015I2_A9849ForProFM[0]) != 0 )
            {
               GXutil.writeLogln("tfpcc:[seudo value changed for attri]"+"ForProFM");
               GXutil.writeLogRaw("Old: ",Z9849ForProFM);
               GXutil.writeLogRaw("Current: ",T015I2_A9849ForProFM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15I1297( )
   {
      beforeValidate15I1297( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15I1297( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15I1297( 0) ;
         checkOptimisticConcurrency15I1297( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15I1297( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15I1297( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015I21 */
                  pr_default.execute(17, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL), Boolean.valueOf(n9858FasAq), A9858FasAq, Boolean.valueOf(n9859DFsAq), A9859DFsAq, Boolean.valueOf(n9848ForProFK), A9848ForProFK, Boolean.valueOf(n9849ForProFM), A9849ForProFM, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFPCC");
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
            load15I1297( ) ;
         }
         endLevel15I1297( ) ;
      }
      closeExtendedTableCursors15I1297( ) ;
   }

   public void update15I1297( )
   {
      beforeValidate15I1297( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15I1297( ) ;
      }
      if ( ( nIsMod_1297 != 0 ) || ( nIsDirty_1297 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency15I1297( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm15I1297( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate15I1297( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015I22 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n9858FasAq), A9858FasAq, Boolean.valueOf(n9859DFsAq), A9859DFsAq, Boolean.valueOf(n9848ForProFK), A9848ForProFK, Boolean.valueOf(n9849ForProFM), A9849ForProFM, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFPCC");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFPCC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate15I1297( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey15I1297( ) ;
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
            endLevel15I1297( ) ;
         }
      }
      closeExtendedTableCursors15I1297( ) ;
   }

   public void deferredUpdate15I1297( )
   {
   }

   public void delete15I1297( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15I1297( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15I1297( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15I1297( ) ;
         afterConfirm15I1297( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15I1297( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015I23 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A9847ForProL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFPCC");
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
      sMode1297 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15I1297( ) ;
      Gx_mode = sMode1297 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15I1297( )
   {
      standaloneModal15I1297( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A9850SPK = O9850SPK.add(A9848ForProFK) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9850SPK = O9850SPK.add(A9848ForProFK).subtract(O9848ForProFK) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9850SPK = O9850SPK.subtract(O9848ForProFK) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
               }
            }
         }
         if ( isIns( )  )
         {
            A9851SPM = O9851SPM.add(A9849ForProFM) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9851SPM = O9851SPM.add(A9849ForProFM).subtract(O9849ForProFM) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9851SPM = O9851SPM.subtract(O9849ForProFM) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
               }
            }
         }
      }
   }

   public void endLevel15I1297( )
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

   public void scanStart15I1297( )
   {
      /* Scan By routine */
      /* Using cursor T015I24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1297 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1297 = (short)(1) ;
         A9847ForProL = T015I24_A9847ForProL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15I1297( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1297 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1297 = (short)(1) ;
         A9847ForProL = T015I24_A9847ForProL[0] ;
      }
   }

   public void scanEnd15I1297( )
   {
      pr_default.close(20);
   }

   public void afterConfirm15I1297( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15I1297( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15I1297( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15I1297( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15I1297( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15I1297( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15I1297( )
   {
      edtForProL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtFasAq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAq_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtDFsAq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDFsAq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDFsAq_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtForProFK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProFK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFK_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtForProFM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProFM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFM_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes15I1297( )
   {
   }

   public void send_integrity_lvl_hashes15I1280( )
   {
   }

   public void subsflControlProps_801297( )
   {
      edtavnRcdDeleted_1297_Internalname = "vNRCDDELETED_1297_"+sGXsfl_80_idx ;
      edtForProL_Internalname = "FORPROL_"+sGXsfl_80_idx ;
      edtFasAq_Internalname = "FASAQ_"+sGXsfl_80_idx ;
      edtDFsAq_Internalname = "DFSAQ_"+sGXsfl_80_idx ;
      edtForProFK_Internalname = "FORPROFK_"+sGXsfl_80_idx ;
      edtForProFM_Internalname = "FORPROFM_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801297( )
   {
      edtavnRcdDeleted_1297_Internalname = "vNRCDDELETED_1297_"+sGXsfl_80_fel_idx ;
      edtForProL_Internalname = "FORPROL_"+sGXsfl_80_fel_idx ;
      edtFasAq_Internalname = "FASAQ_"+sGXsfl_80_fel_idx ;
      edtDFsAq_Internalname = "DFSAQ_"+sGXsfl_80_fel_idx ;
      edtForProFK_Internalname = "FORPROFK_"+sGXsfl_80_fel_idx ;
      edtForProFM_Internalname = "FORPROFM_"+sGXsfl_80_fel_idx ;
   }

   public void addRow15I1297( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801297( ) ;
      sendRow15I1297( ) ;
   }

   public void sendRow15I1297( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1297_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1297_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1297), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1297), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1297_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1297_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProL_Internalname,GXutil.ltrim( localUtil.ntoc( A9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9847ForProL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAq_Internalname,GXutil.rtrim( A9858FasAq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasAq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDFsAq_Internalname,GXutil.rtrim( A9859DFsAq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDFsAq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDFsAq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProFK_Internalname,GXutil.ltrim( localUtil.ntoc( A9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProFK_Enabled!=0) ? localUtil.format( A9848ForProFK, "ZZZZZZ9.99999") : localUtil.format( A9848ForProFK, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProFK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProFK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1297_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProFM_Internalname,GXutil.ltrim( localUtil.ntoc( A9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProFM_Enabled!=0) ? localUtil.format( A9849ForProFM, "ZZZZZZ9.99999") : localUtil.format( A9849ForProFM, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProFM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProFM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes15I1297( ) ;
      GXCCtl = "Z9847ForProL_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9847ForProL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9858FasAq_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9858FasAq));
      GXCCtl = "Z9859DFsAq_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9859DFsAq));
      GXCCtl = "Z9848ForProFK_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9849ForProFM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9849ForProFM_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9849ForProFM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9848ForProFK_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9848ForProFK, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1297_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1297_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1297_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1297, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1297_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1297_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROL_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DFSAQ_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDFsAq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROFK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROFM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow15I1297( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801297( ) ;
      edtavnRcdDeleted_1297_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1297_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROL_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasAq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAQ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDFsAq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DFSAQ_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProFK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProFM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1297_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1297_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1297");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1297_Internalname ;
         wbErr = true ;
         nRcdDeleted_1297 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1297 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1297_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForProL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForProL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FORPROL_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProL_Internalname ;
         wbErr = true ;
         A9847ForProL = (short)(0) ;
      }
      else
      {
         A9847ForProL = (short)(localUtil.ctol( httpContext.cgiGet( edtForProL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9858FasAq = httpContext.cgiGet( edtFasAq_Internalname) ;
      n9858FasAq = false ;
      A9859DFsAq = httpContext.cgiGet( edtDFsAq_Internalname) ;
      n9859DFsAq = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProFK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProFK_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPROFK_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProFK_Internalname ;
         wbErr = true ;
         A9848ForProFK = DecimalUtil.ZERO ;
         n9848ForProFK = false ;
      }
      else
      {
         A9848ForProFK = localUtil.ctond( httpContext.cgiGet( edtForProFK_Internalname)) ;
         n9848ForProFK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProFM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProFM_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPROFM_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProFM_Internalname ;
         wbErr = true ;
         A9849ForProFM = DecimalUtil.ZERO ;
         n9849ForProFM = false ;
      }
      else
      {
         A9849ForProFM = localUtil.ctond( httpContext.cgiGet( edtForProFM_Internalname)) ;
         n9849ForProFM = false ;
      }
      GXCCtl = "Z9847ForProL_" + sGXsfl_80_idx ;
      Z9847ForProL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9858FasAq_" + sGXsfl_80_idx ;
      Z9858FasAq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9859DFsAq_" + sGXsfl_80_idx ;
      Z9859DFsAq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9848ForProFK_" + sGXsfl_80_idx ;
      Z9848ForProFK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9849ForProFM_" + sGXsfl_80_idx ;
      Z9849ForProFM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9849ForProFM_" + sGXsfl_80_idx ;
      O9849ForProFM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9848ForProFK_" + sGXsfl_80_idx ;
      O9848ForProFK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1297_" + sGXsfl_80_idx ;
      nRcdDeleted_1297 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1297_" + sGXsfl_80_idx ;
      nRcdExists_1297 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1297_" + sGXsfl_80_idx ;
      nIsMod_1297 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtForProL_Enabled = edtForProL_Enabled ;
   }

   public void confirmValues15I0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801297( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801297( ) ;
         httpContext.changePostValue( "Z9847ForProL_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9847ForProL_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9847ForProL_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9858FasAq_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9858FasAq_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9858FasAq_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9859DFsAq_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9859DFsAq_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9859DFsAq_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9848ForProFK_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9848ForProFK_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9848ForProFK_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z9849ForProFM_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z9849ForProFM_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9849ForProFM_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O9849ForProFM", httpContext.cgiGet( "T9849ForProFM")) ;
      httpContext.deletePostValue( "T9849ForProFM") ;
      httpContext.changePostValue( "O9848ForProFK", httpContext.cgiGet( "T9848ForProFK")) ;
      httpContext.deletePostValue( "T9848ForProFK") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfpcc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9768ForProPK", GXutil.ltrim( localUtil.ntoc( Z9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9769ForProPM", GXutil.ltrim( localUtil.ntoc( Z9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9851SPM", GXutil.ltrim( localUtil.ntoc( O9851SPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9850SPK", GXutil.ltrim( localUtil.ntoc( O9850SPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tfpcc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"})  ;
   }

   public String getPgmname( )
   {
      return "TFPCC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FASES QUE COMPONEN EL PROCESO", "") ;
   }

   public void initializeNonKey15I1280( )
   {
      A9768ForProPK = DecimalUtil.ZERO ;
      n9768ForProPK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrimstr( A9768ForProPK, 12, 5));
      A9769ForProPM = DecimalUtil.ZERO ;
      n9769ForProPM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrimstr( A9769ForProPM, 12, 5));
      O9851SPM = A9851SPM ;
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      O9850SPK = A9850SPK ;
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
      Z9768ForProPK = DecimalUtil.ZERO ;
      Z9769ForProPM = DecimalUtil.ZERO ;
   }

   public void initAll15I1280( )
   {
      initializeNonKey15I1280( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey15I1297( )
   {
      A9858FasAq = "" ;
      n9858FasAq = false ;
      A9859DFsAq = "" ;
      n9859DFsAq = false ;
      A9848ForProFK = DecimalUtil.ZERO ;
      n9848ForProFK = false ;
      A9849ForProFM = DecimalUtil.ZERO ;
      n9849ForProFM = false ;
      O9849ForProFM = A9849ForProFM ;
      n9849ForProFM = false ;
      O9848ForProFK = A9848ForProFK ;
      n9848ForProFK = false ;
      Z9858FasAq = "" ;
      Z9859DFsAq = "" ;
      Z9848ForProFK = DecimalUtil.ZERO ;
      Z9849ForProFM = DecimalUtil.ZERO ;
   }

   public void initAll15I1297( )
   {
      A9847ForProL = (short)(0) ;
      initializeNonKey15I1297( ) ;
   }

   public void standaloneModalInsert15I1297( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543534", true, true);
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
      httpContext.AddJavascriptSource("tfpcc.js", "?20268241543534", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1297( )
   {
      edtForProL_Enabled = defedtForProL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProL_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1297, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1297_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9847ForProL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9858FasAq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9859DFsAq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDFsAq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9848ForProFK, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9849ForProFM, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForProC_Internalname = "FORPROC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtForProPK_Internalname = "FORPROPK" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtForProPM_Internalname = "FORPROPM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSPK_Internalname = "SPK" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtSPM_Internalname = "SPM" ;
      edtavnRcdDeleted_1297_Internalname = "vNRCDDELETED_1297" ;
      edtForProL_Internalname = "FORPROL" ;
      edtFasAq_Internalname = "FASAQ" ;
      edtDFsAq_Internalname = "DFSAQ" ;
      edtForProFK_Internalname = "FORPROFK" ;
      edtForProFM_Internalname = "FORPROFM" ;
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
      Form.setCaption( httpContext.getMessage( "FASES QUE COMPONEN EL PROCESO", "") );
      edtForProFM_Jsonclick = "" ;
      edtForProFK_Jsonclick = "" ;
      edtDFsAq_Jsonclick = "" ;
      edtFasAq_Jsonclick = "" ;
      edtForProL_Jsonclick = "" ;
      edtavnRcdDeleted_1297_Jsonclick = "" ;
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
      edtForProFM_Enabled = 1 ;
      edtForProFK_Enabled = 1 ;
      edtDFsAq_Enabled = 1 ;
      edtFasAq_Enabled = 1 ;
      edtForProL_Enabled = 1 ;
      edtavnRcdDeleted_1297_Enabled = 1 ;
      edtSPM_Jsonclick = "" ;
      edtSPM_Backcolor = (int)(0xFFFFFF) ;
      edtSPM_Enabled = 0 ;
      edtSPK_Jsonclick = "" ;
      edtSPK_Backcolor = (int)(0xFFFFFF) ;
      edtSPK_Enabled = 0 ;
      edtForProPM_Jsonclick = "" ;
      edtForProPM_Backcolor = (int)(0xFFFFFF) ;
      edtForProPM_Enabled = 1 ;
      edtForProPK_Jsonclick = "" ;
      edtForProPK_Backcolor = (int)(0xFFFFFF) ;
      edtForProPK_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtForProC_Jsonclick = "" ;
      edtForProC_Backcolor = (int)(0xFFFFFF) ;
      edtForProC_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_801297( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal15I1297( ) ;
         standaloneModal15I1297( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow15I1297( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801297( ) ;
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
      /* Using cursor T015I25 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015I25_A407EmprNom[0] ;
      n407EmprNom = T015I25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T015I26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(22);
      /* Using cursor T015I28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A9850SPK = T015I28_A9850SPK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         A9851SPM = T015I28_A9851SPM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      else
      {
         A9850SPK = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrimstr( A9850SPK, 12, 5));
         A9851SPM = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrimstr( A9851SPM, 12, 5));
      }
      pr_default.close(23);
      GX_FocusControl = edtForProPK_Internalname ;
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

   public void valid_Forproc( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9768ForProPK", GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9769ForProPM", GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9850SPK", GXutil.ltrim( localUtil.ntoc( A9850SPK, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9851SPM", GXutil.ltrim( localUtil.ntoc( A9851SPM, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9768ForProPK", GXutil.ltrim( localUtil.ntoc( Z9768ForProPK, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9769ForProPM", GXutil.ltrim( localUtil.ntoc( Z9769ForProPM, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9850SPK", GXutil.ltrim( localUtil.ntoc( Z9850SPK, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9851SPM", GXutil.ltrim( localUtil.ntoc( Z9851SPM, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9851SPM", GXutil.ltrim( localUtil.ntoc( O9851SPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9850SPK", GXutil.ltrim( localUtil.ntoc( O9850SPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e1115I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''}]");
      setEventMetadata("EXIT",",oparms:[{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'PROCESO QUIMICO?'","{handler:'e1315I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A9858FasAq',fld:'FASAQ',pic:''}]");
      setEventMetadata("'PROCESO QUIMICO?'",",oparms:[{av:'A9858FasAq',fld:'FASAQ',pic:''},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FORPROC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9768ForProPK',fld:'FORPROPK',pic:'ZZZZZ9.99999'},{av:'A9769ForProPM',fld:'FORPROPM',pic:'ZZZZZ9.99999'},{av:'A9850SPK',fld:'SPK',pic:'ZZZZZ9.99999'},{av:'A9851SPM',fld:'SPM',pic:'ZZZZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z9766ForProC'},{av:'Z407EmprNom'},{av:'Z9768ForProPK'},{av:'Z9769ForProPM'},{av:'Z9850SPK'},{av:'Z9851SPM'},{av:'O9851SPM'},{av:'O9850SPK'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FORPROL","{handler:'valid_Forprol',iparms:[]");
      setEventMetadata("VALID_FORPROL",",oparms:[]}");
      setEventMetadata("VALID_FORPROFK","{handler:'valid_Forprofk',iparms:[]");
      setEventMetadata("VALID_FORPROFK",",oparms:[]}");
      setEventMetadata("VALID_FORPROFM","{handler:'valid_Forprofm',iparms:[]");
      setEventMetadata("VALID_FORPROFM",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      wcpOA9766ForProC = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z9766ForProC = "" ;
      Z9768ForProPK = DecimalUtil.ZERO ;
      Z9769ForProPM = DecimalUtil.ZERO ;
      O9851SPM = DecimalUtil.ZERO ;
      O9850SPK = DecimalUtil.ZERO ;
      Z9858FasAq = "" ;
      Z9859DFsAq = "" ;
      Z9848ForProFK = DecimalUtil.ZERO ;
      Z9849ForProFM = DecimalUtil.ZERO ;
      O9849ForProFM = DecimalUtil.ZERO ;
      O9848ForProFK = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A9766ForProC = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A9769ForProPM = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A9850SPK = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A9851SPM = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9851SPM = DecimalUtil.ZERO ;
      B9850SPK = DecimalUtil.ZERO ;
      sMode1297 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1280 = "" ;
      s9851SPM = DecimalUtil.ZERO ;
      s9850SPK = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9858FasAq = "" ;
      A9859DFsAq = "" ;
      A9848ForProFK = DecimalUtil.ZERO ;
      A9849ForProFM = DecimalUtil.ZERO ;
      T9849ForProFM = DecimalUtil.ZERO ;
      T9848ForProFK = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      Z407EmprNom = "" ;
      Z9850SPK = DecimalUtil.ZERO ;
      Z9851SPM = DecimalUtil.ZERO ;
      T015I6_A407EmprNom = new String[] {""} ;
      T015I6_n407EmprNom = new boolean[] {false} ;
      T015I7_A396EmprCod = new String[] {""} ;
      T015I9_A9850SPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I9_A9851SPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I11_A9766ForProC = new String[] {""} ;
      T015I11_A407EmprNom = new String[] {""} ;
      T015I11_n407EmprNom = new boolean[] {false} ;
      T015I11_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I11_n9768ForProPK = new boolean[] {false} ;
      T015I11_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I11_n9769ForProPM = new boolean[] {false} ;
      T015I11_A396EmprCod = new String[] {""} ;
      T015I11_A252CliCod = new int[1] ;
      T015I11_A831TipColCod = new byte[1] ;
      T015I11_A494ForSer = new String[] {""} ;
      T015I11_A482ForColNom = new String[] {""} ;
      T015I11_A483ForColNum = new int[1] ;
      T015I11_A9850SPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I11_A9851SPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I12_A396EmprCod = new String[] {""} ;
      T015I12_A252CliCod = new int[1] ;
      T015I12_A494ForSer = new String[] {""} ;
      T015I12_A482ForColNom = new String[] {""} ;
      T015I12_A483ForColNum = new int[1] ;
      T015I12_A831TipColCod = new byte[1] ;
      T015I12_A9766ForProC = new String[] {""} ;
      T015I5_A9766ForProC = new String[] {""} ;
      T015I5_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I5_n9768ForProPK = new boolean[] {false} ;
      T015I5_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I5_n9769ForProPM = new boolean[] {false} ;
      T015I5_A396EmprCod = new String[] {""} ;
      T015I5_A252CliCod = new int[1] ;
      T015I5_A831TipColCod = new byte[1] ;
      T015I5_A494ForSer = new String[] {""} ;
      T015I5_A482ForColNom = new String[] {""} ;
      T015I5_A483ForColNum = new int[1] ;
      T015I13_A396EmprCod = new String[] {""} ;
      T015I13_A252CliCod = new int[1] ;
      T015I13_A494ForSer = new String[] {""} ;
      T015I13_A482ForColNom = new String[] {""} ;
      T015I13_A483ForColNum = new int[1] ;
      T015I13_A831TipColCod = new byte[1] ;
      T015I13_A9766ForProC = new String[] {""} ;
      T015I14_A396EmprCod = new String[] {""} ;
      T015I14_A252CliCod = new int[1] ;
      T015I14_A494ForSer = new String[] {""} ;
      T015I14_A482ForColNom = new String[] {""} ;
      T015I14_A483ForColNum = new int[1] ;
      T015I14_A831TipColCod = new byte[1] ;
      T015I14_A9766ForProC = new String[] {""} ;
      T015I4_A9766ForProC = new String[] {""} ;
      T015I4_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I4_n9768ForProPK = new boolean[] {false} ;
      T015I4_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I4_n9769ForProPM = new boolean[] {false} ;
      T015I4_A396EmprCod = new String[] {""} ;
      T015I4_A252CliCod = new int[1] ;
      T015I4_A831TipColCod = new byte[1] ;
      T015I4_A494ForSer = new String[] {""} ;
      T015I4_A482ForColNom = new String[] {""} ;
      T015I4_A483ForColNum = new int[1] ;
      T015I18_A396EmprCod = new String[] {""} ;
      T015I18_A252CliCod = new int[1] ;
      T015I18_A494ForSer = new String[] {""} ;
      T015I18_A482ForColNom = new String[] {""} ;
      T015I18_A483ForColNum = new int[1] ;
      T015I18_A831TipColCod = new byte[1] ;
      T015I18_A9766ForProC = new String[] {""} ;
      T015I19_A494ForSer = new String[] {""} ;
      T015I19_A482ForColNom = new String[] {""} ;
      T015I19_A483ForColNum = new int[1] ;
      T015I19_A831TipColCod = new byte[1] ;
      T015I19_A9766ForProC = new String[] {""} ;
      T015I19_A9847ForProL = new short[1] ;
      T015I19_A9858FasAq = new String[] {""} ;
      T015I19_n9858FasAq = new boolean[] {false} ;
      T015I19_A9859DFsAq = new String[] {""} ;
      T015I19_n9859DFsAq = new boolean[] {false} ;
      T015I19_A9848ForProFK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I19_n9848ForProFK = new boolean[] {false} ;
      T015I19_A9849ForProFM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I19_n9849ForProFM = new boolean[] {false} ;
      T015I19_A396EmprCod = new String[] {""} ;
      T015I19_A252CliCod = new int[1] ;
      T015I20_A396EmprCod = new String[] {""} ;
      T015I20_A252CliCod = new int[1] ;
      T015I20_A494ForSer = new String[] {""} ;
      T015I20_A482ForColNom = new String[] {""} ;
      T015I20_A483ForColNum = new int[1] ;
      T015I20_A831TipColCod = new byte[1] ;
      T015I20_A9766ForProC = new String[] {""} ;
      T015I20_A9847ForProL = new short[1] ;
      T015I3_A494ForSer = new String[] {""} ;
      T015I3_A482ForColNom = new String[] {""} ;
      T015I3_A483ForColNum = new int[1] ;
      T015I3_A831TipColCod = new byte[1] ;
      T015I3_A9766ForProC = new String[] {""} ;
      T015I3_A9847ForProL = new short[1] ;
      T015I3_A9858FasAq = new String[] {""} ;
      T015I3_n9858FasAq = new boolean[] {false} ;
      T015I3_A9859DFsAq = new String[] {""} ;
      T015I3_n9859DFsAq = new boolean[] {false} ;
      T015I3_A9848ForProFK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I3_n9848ForProFK = new boolean[] {false} ;
      T015I3_A9849ForProFM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I3_n9849ForProFM = new boolean[] {false} ;
      T015I3_A396EmprCod = new String[] {""} ;
      T015I3_A252CliCod = new int[1] ;
      T015I2_A494ForSer = new String[] {""} ;
      T015I2_A482ForColNom = new String[] {""} ;
      T015I2_A483ForColNum = new int[1] ;
      T015I2_A831TipColCod = new byte[1] ;
      T015I2_A9766ForProC = new String[] {""} ;
      T015I2_A9847ForProL = new short[1] ;
      T015I2_A9858FasAq = new String[] {""} ;
      T015I2_n9858FasAq = new boolean[] {false} ;
      T015I2_A9859DFsAq = new String[] {""} ;
      T015I2_n9859DFsAq = new boolean[] {false} ;
      T015I2_A9848ForProFK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I2_n9848ForProFK = new boolean[] {false} ;
      T015I2_A9849ForProFM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I2_n9849ForProFM = new boolean[] {false} ;
      T015I2_A396EmprCod = new String[] {""} ;
      T015I2_A252CliCod = new int[1] ;
      T015I24_A396EmprCod = new String[] {""} ;
      T015I24_A252CliCod = new int[1] ;
      T015I24_A494ForSer = new String[] {""} ;
      T015I24_A482ForColNom = new String[] {""} ;
      T015I24_A483ForColNum = new int[1] ;
      T015I24_A831TipColCod = new byte[1] ;
      T015I24_A9766ForProC = new String[] {""} ;
      T015I24_A9847ForProL = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T015I25_A407EmprNom = new String[] {""} ;
      T015I25_n407EmprNom = new boolean[] {false} ;
      T015I26_A396EmprCod = new String[] {""} ;
      T015I28_A9850SPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015I28_A9851SPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ9766ForProC = "" ;
      ZZ407EmprNom = "" ;
      ZZ9768ForProPK = DecimalUtil.ZERO ;
      ZZ9769ForProPM = DecimalUtil.ZERO ;
      ZZ9850SPK = DecimalUtil.ZERO ;
      ZZ9851SPM = DecimalUtil.ZERO ;
      ZO9851SPM = DecimalUtil.ZERO ;
      ZO9850SPK = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfpcc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfpcc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfpcc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfpcc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfpcc__default(),
         new Object[] {
             new Object[] {
            T015I2_A494ForSer, T015I2_A482ForColNom, T015I2_A483ForColNum, T015I2_A831TipColCod, T015I2_A9766ForProC, T015I2_A9847ForProL, T015I2_A9858FasAq, T015I2_n9858FasAq, T015I2_A9859DFsAq, T015I2_n9859DFsAq,
            T015I2_A9848ForProFK, T015I2_n9848ForProFK, T015I2_A9849ForProFM, T015I2_n9849ForProFM, T015I2_A396EmprCod, T015I2_A252CliCod
            }
            , new Object[] {
            T015I3_A494ForSer, T015I3_A482ForColNom, T015I3_A483ForColNum, T015I3_A831TipColCod, T015I3_A9766ForProC, T015I3_A9847ForProL, T015I3_A9858FasAq, T015I3_n9858FasAq, T015I3_A9859DFsAq, T015I3_n9859DFsAq,
            T015I3_A9848ForProFK, T015I3_n9848ForProFK, T015I3_A9849ForProFM, T015I3_n9849ForProFM, T015I3_A396EmprCod, T015I3_A252CliCod
            }
            , new Object[] {
            T015I4_A9766ForProC, T015I4_A9768ForProPK, T015I4_n9768ForProPK, T015I4_A9769ForProPM, T015I4_n9769ForProPM, T015I4_A396EmprCod, T015I4_A252CliCod, T015I4_A831TipColCod, T015I4_A494ForSer, T015I4_A482ForColNom,
            T015I4_A483ForColNum
            }
            , new Object[] {
            T015I5_A9766ForProC, T015I5_A9768ForProPK, T015I5_n9768ForProPK, T015I5_A9769ForProPM, T015I5_n9769ForProPM, T015I5_A396EmprCod, T015I5_A252CliCod, T015I5_A831TipColCod, T015I5_A494ForSer, T015I5_A482ForColNom,
            T015I5_A483ForColNum
            }
            , new Object[] {
            T015I6_A407EmprNom, T015I6_n407EmprNom
            }
            , new Object[] {
            T015I7_A396EmprCod
            }
            , new Object[] {
            T015I9_A9850SPK, T015I9_A9851SPM
            }
            , new Object[] {
            T015I11_A9766ForProC, T015I11_A407EmprNom, T015I11_n407EmprNom, T015I11_A9768ForProPK, T015I11_n9768ForProPK, T015I11_A9769ForProPM, T015I11_n9769ForProPM, T015I11_A396EmprCod, T015I11_A252CliCod, T015I11_A831TipColCod,
            T015I11_A494ForSer, T015I11_A482ForColNom, T015I11_A483ForColNum, T015I11_A9850SPK, T015I11_A9851SPM
            }
            , new Object[] {
            T015I12_A396EmprCod, T015I12_A252CliCod, T015I12_A494ForSer, T015I12_A482ForColNom, T015I12_A483ForColNum, T015I12_A831TipColCod, T015I12_A9766ForProC
            }
            , new Object[] {
            T015I13_A396EmprCod, T015I13_A252CliCod, T015I13_A494ForSer, T015I13_A482ForColNom, T015I13_A483ForColNum, T015I13_A831TipColCod, T015I13_A9766ForProC
            }
            , new Object[] {
            T015I14_A396EmprCod, T015I14_A252CliCod, T015I14_A494ForSer, T015I14_A482ForColNom, T015I14_A483ForColNum, T015I14_A831TipColCod, T015I14_A9766ForProC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015I18_A396EmprCod, T015I18_A252CliCod, T015I18_A494ForSer, T015I18_A482ForColNom, T015I18_A483ForColNum, T015I18_A831TipColCod, T015I18_A9766ForProC
            }
            , new Object[] {
            T015I19_A494ForSer, T015I19_A482ForColNom, T015I19_A483ForColNum, T015I19_A831TipColCod, T015I19_A9766ForProC, T015I19_A9847ForProL, T015I19_A9858FasAq, T015I19_n9858FasAq, T015I19_A9859DFsAq, T015I19_n9859DFsAq,
            T015I19_A9848ForProFK, T015I19_n9848ForProFK, T015I19_A9849ForProFM, T015I19_n9849ForProFM, T015I19_A396EmprCod, T015I19_A252CliCod
            }
            , new Object[] {
            T015I20_A396EmprCod, T015I20_A252CliCod, T015I20_A494ForSer, T015I20_A482ForColNom, T015I20_A483ForColNum, T015I20_A831TipColCod, T015I20_A9766ForProC, T015I20_A9847ForProL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015I24_A396EmprCod, T015I24_A252CliCod, T015I24_A494ForSer, T015I24_A482ForColNom, T015I24_A483ForColNum, T015I24_A831TipColCod, T015I24_A9766ForProC, T015I24_A9847ForProL
            }
            , new Object[] {
            T015I25_A407EmprNom, T015I25_n407EmprNom
            }
            , new Object[] {
            T015I26_A396EmprCod
            }
            , new Object[] {
            T015I28_A9850SPK, T015I28_A9851SPM
            }
         }
      );
      Z9766ForProC = "" ;
      A9766ForProC = "" ;
      Z831TipColCod = (byte)(0) ;
      A831TipColCod = (byte)(0) ;
      Z483ForColNum = 0 ;
      A483ForColNum = 0 ;
      Z482ForColNom = "" ;
      A482ForColNom = "" ;
      Z494ForSer = "" ;
      A494ForSer = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TFPCC" ;
   }

   private byte wcpOA831TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte GXv_int7[] ;
   private byte AV32VarAux ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private short Z9847ForProL ;
   private short nRcdDeleted_1297 ;
   private short nRcdExists_1297 ;
   private short nIsMod_1297 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1297 ;
   private short RcdFound1297 ;
   private short nBlankRcdUsr1297 ;
   private short A9847ForProL ;
   private short RcdFound1280 ;
   private short nIsDirty_1280 ;
   private short nIsDirty_1297 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtForProC_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtForProPK_Enabled ;
   private int edtForProPM_Enabled ;
   private int edtSPK_Enabled ;
   private int edtSPM_Enabled ;
   private int edtavnRcdDeleted_1297_Enabled ;
   private int edtForProL_Enabled ;
   private int edtFasAq_Enabled ;
   private int edtDFsAq_Enabled ;
   private int edtForProFK_Enabled ;
   private int edtForProFM_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtForProL_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSPM_Backcolor ;
   private int edtSPK_Backcolor ;
   private int edtForProPM_Backcolor ;
   private int edtForProPK_Backcolor ;
   private int edtForProC_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9768ForProPK ;
   private java.math.BigDecimal Z9769ForProPM ;
   private java.math.BigDecimal O9851SPM ;
   private java.math.BigDecimal O9850SPK ;
   private java.math.BigDecimal Z9848ForProFK ;
   private java.math.BigDecimal Z9849ForProFM ;
   private java.math.BigDecimal O9849ForProFM ;
   private java.math.BigDecimal O9848ForProFK ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private java.math.BigDecimal A9850SPK ;
   private java.math.BigDecimal A9851SPM ;
   private java.math.BigDecimal B9851SPM ;
   private java.math.BigDecimal B9850SPK ;
   private java.math.BigDecimal s9851SPM ;
   private java.math.BigDecimal s9850SPK ;
   private java.math.BigDecimal A9848ForProFK ;
   private java.math.BigDecimal A9849ForProFM ;
   private java.math.BigDecimal T9849ForProFM ;
   private java.math.BigDecimal T9848ForProFK ;
   private java.math.BigDecimal Z9850SPK ;
   private java.math.BigDecimal Z9851SPM ;
   private java.math.BigDecimal ZZ9768ForProPK ;
   private java.math.BigDecimal ZZ9769ForProPM ;
   private java.math.BigDecimal ZZ9850SPK ;
   private java.math.BigDecimal ZZ9851SPM ;
   private java.math.BigDecimal ZO9851SPM ;
   private java.math.BigDecimal ZO9850SPK ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA9766ForProC ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z9766ForProC ;
   private String Z9858FasAq ;
   private String Z9859DFsAq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A9766ForProC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtForProPK_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForProC_Internalname ;
   private String edtForProC_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtForProPK_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtForProPM_Internalname ;
   private String edtForProPM_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSPK_Internalname ;
   private String edtSPK_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtSPM_Internalname ;
   private String edtSPM_Jsonclick ;
   private String sMode1297 ;
   private String edtavnRcdDeleted_1297_Internalname ;
   private String edtForProL_Internalname ;
   private String edtFasAq_Internalname ;
   private String edtDFsAq_Internalname ;
   private String edtForProFK_Internalname ;
   private String edtForProFM_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1280 ;
   private String GXCCtl ;
   private String A9858FasAq ;
   private String A9859DFsAq ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String Z407EmprNom ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1297_Jsonclick ;
   private String edtForProL_Jsonclick ;
   private String edtFasAq_Jsonclick ;
   private String edtDFsAq_Jsonclick ;
   private String edtForProFK_Jsonclick ;
   private String edtForProFM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ9766ForProC ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private boolean returnInSub ;
   private boolean n9858FasAq ;
   private boolean n9859DFsAq ;
   private boolean n9848ForProFK ;
   private boolean n9849ForProFM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T015I6_A407EmprNom ;
   private boolean[] T015I6_n407EmprNom ;
   private String[] T015I7_A396EmprCod ;
   private java.math.BigDecimal[] T015I9_A9850SPK ;
   private java.math.BigDecimal[] T015I9_A9851SPM ;
   private String[] T015I11_A9766ForProC ;
   private String[] T015I11_A407EmprNom ;
   private boolean[] T015I11_n407EmprNom ;
   private java.math.BigDecimal[] T015I11_A9768ForProPK ;
   private boolean[] T015I11_n9768ForProPK ;
   private java.math.BigDecimal[] T015I11_A9769ForProPM ;
   private boolean[] T015I11_n9769ForProPM ;
   private String[] T015I11_A396EmprCod ;
   private int[] T015I11_A252CliCod ;
   private byte[] T015I11_A831TipColCod ;
   private String[] T015I11_A494ForSer ;
   private String[] T015I11_A482ForColNom ;
   private int[] T015I11_A483ForColNum ;
   private java.math.BigDecimal[] T015I11_A9850SPK ;
   private java.math.BigDecimal[] T015I11_A9851SPM ;
   private String[] T015I12_A396EmprCod ;
   private int[] T015I12_A252CliCod ;
   private String[] T015I12_A494ForSer ;
   private String[] T015I12_A482ForColNom ;
   private int[] T015I12_A483ForColNum ;
   private byte[] T015I12_A831TipColCod ;
   private String[] T015I12_A9766ForProC ;
   private String[] T015I5_A9766ForProC ;
   private java.math.BigDecimal[] T015I5_A9768ForProPK ;
   private boolean[] T015I5_n9768ForProPK ;
   private java.math.BigDecimal[] T015I5_A9769ForProPM ;
   private boolean[] T015I5_n9769ForProPM ;
   private String[] T015I5_A396EmprCod ;
   private int[] T015I5_A252CliCod ;
   private byte[] T015I5_A831TipColCod ;
   private String[] T015I5_A494ForSer ;
   private String[] T015I5_A482ForColNom ;
   private int[] T015I5_A483ForColNum ;
   private String[] T015I13_A396EmprCod ;
   private int[] T015I13_A252CliCod ;
   private String[] T015I13_A494ForSer ;
   private String[] T015I13_A482ForColNom ;
   private int[] T015I13_A483ForColNum ;
   private byte[] T015I13_A831TipColCod ;
   private String[] T015I13_A9766ForProC ;
   private String[] T015I14_A396EmprCod ;
   private int[] T015I14_A252CliCod ;
   private String[] T015I14_A494ForSer ;
   private String[] T015I14_A482ForColNom ;
   private int[] T015I14_A483ForColNum ;
   private byte[] T015I14_A831TipColCod ;
   private String[] T015I14_A9766ForProC ;
   private String[] T015I4_A9766ForProC ;
   private java.math.BigDecimal[] T015I4_A9768ForProPK ;
   private boolean[] T015I4_n9768ForProPK ;
   private java.math.BigDecimal[] T015I4_A9769ForProPM ;
   private boolean[] T015I4_n9769ForProPM ;
   private String[] T015I4_A396EmprCod ;
   private int[] T015I4_A252CliCod ;
   private byte[] T015I4_A831TipColCod ;
   private String[] T015I4_A494ForSer ;
   private String[] T015I4_A482ForColNom ;
   private int[] T015I4_A483ForColNum ;
   private String[] T015I18_A396EmprCod ;
   private int[] T015I18_A252CliCod ;
   private String[] T015I18_A494ForSer ;
   private String[] T015I18_A482ForColNom ;
   private int[] T015I18_A483ForColNum ;
   private byte[] T015I18_A831TipColCod ;
   private String[] T015I18_A9766ForProC ;
   private String[] T015I19_A494ForSer ;
   private String[] T015I19_A482ForColNom ;
   private int[] T015I19_A483ForColNum ;
   private byte[] T015I19_A831TipColCod ;
   private String[] T015I19_A9766ForProC ;
   private short[] T015I19_A9847ForProL ;
   private String[] T015I19_A9858FasAq ;
   private boolean[] T015I19_n9858FasAq ;
   private String[] T015I19_A9859DFsAq ;
   private boolean[] T015I19_n9859DFsAq ;
   private java.math.BigDecimal[] T015I19_A9848ForProFK ;
   private boolean[] T015I19_n9848ForProFK ;
   private java.math.BigDecimal[] T015I19_A9849ForProFM ;
   private boolean[] T015I19_n9849ForProFM ;
   private String[] T015I19_A396EmprCod ;
   private int[] T015I19_A252CliCod ;
   private String[] T015I20_A396EmprCod ;
   private int[] T015I20_A252CliCod ;
   private String[] T015I20_A494ForSer ;
   private String[] T015I20_A482ForColNom ;
   private int[] T015I20_A483ForColNum ;
   private byte[] T015I20_A831TipColCod ;
   private String[] T015I20_A9766ForProC ;
   private short[] T015I20_A9847ForProL ;
   private String[] T015I3_A494ForSer ;
   private String[] T015I3_A482ForColNom ;
   private int[] T015I3_A483ForColNum ;
   private byte[] T015I3_A831TipColCod ;
   private String[] T015I3_A9766ForProC ;
   private short[] T015I3_A9847ForProL ;
   private String[] T015I3_A9858FasAq ;
   private boolean[] T015I3_n9858FasAq ;
   private String[] T015I3_A9859DFsAq ;
   private boolean[] T015I3_n9859DFsAq ;
   private java.math.BigDecimal[] T015I3_A9848ForProFK ;
   private boolean[] T015I3_n9848ForProFK ;
   private java.math.BigDecimal[] T015I3_A9849ForProFM ;
   private boolean[] T015I3_n9849ForProFM ;
   private String[] T015I3_A396EmprCod ;
   private int[] T015I3_A252CliCod ;
   private String[] T015I2_A494ForSer ;
   private String[] T015I2_A482ForColNom ;
   private int[] T015I2_A483ForColNum ;
   private byte[] T015I2_A831TipColCod ;
   private String[] T015I2_A9766ForProC ;
   private short[] T015I2_A9847ForProL ;
   private String[] T015I2_A9858FasAq ;
   private boolean[] T015I2_n9858FasAq ;
   private String[] T015I2_A9859DFsAq ;
   private boolean[] T015I2_n9859DFsAq ;
   private java.math.BigDecimal[] T015I2_A9848ForProFK ;
   private boolean[] T015I2_n9848ForProFK ;
   private java.math.BigDecimal[] T015I2_A9849ForProFM ;
   private boolean[] T015I2_n9849ForProFM ;
   private String[] T015I2_A396EmprCod ;
   private int[] T015I2_A252CliCod ;
   private String[] T015I24_A396EmprCod ;
   private int[] T015I24_A252CliCod ;
   private String[] T015I24_A494ForSer ;
   private String[] T015I24_A482ForColNom ;
   private int[] T015I24_A483ForColNum ;
   private byte[] T015I24_A831TipColCod ;
   private String[] T015I24_A9766ForProC ;
   private short[] T015I24_A9847ForProL ;
   private String[] T015I25_A407EmprNom ;
   private boolean[] T015I25_n407EmprNom ;
   private String[] T015I26_A396EmprCod ;
   private java.math.BigDecimal[] T015I28_A9850SPK ;
   private java.math.BigDecimal[] T015I28_A9851SPM ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfpcc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfpcc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfpcc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfpcc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfpcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015I2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL, FasAq, DFsAq, ForProFK, ForProFM, EmprCod, CliCod FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProL = ?  FOR UPDATE OF FasAq, DFsAq, ForProFK, ForProFM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015I3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL, FasAq, DFsAq, ForProFK, ForProFM, EmprCod, CliCod FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015I4", "SELECT ForProC, ForProPK, ForProPM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?  FOR UPDATE OF ForProPK, ForProPM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I5", "SELECT ForProC, ForProPK, ForProPM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I7", "SELECT EmprCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I9", "SELECT COALESCE( T1.SPK, 0) AS SPK, COALESCE( T1.SPM, 0) AS SPM FROM (SELECT SUM(ForProFK) AS SPK, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, SUM(ForProFM) AS SPM FROM TXPFPCC GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I11", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForProC, T2.EmprNom, TM1.ForProPK, TM1.ForProPM, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, COALESCE( T3.SPK, 0) AS SPK, COALESCE( T3.SPM, 0) AS SPM FROM ((TXPCLARPD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(ForProFK) AS SPK, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, SUM(ForProFM) AS SPM FROM TXPFPCC GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod AND T3.ForSer = TM1.ForSer AND T3.ForColNom = TM1.ForColNom AND T3.ForColNum = TM1.ForColNum AND T3.TipColCod = TM1.TipColCod AND T3.ForProC = TM1.ForProC) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ForProC = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ForProC ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ForProC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015I15", "INSERT INTO TXPCLARPD(ForProC, ForProPK, ForProPM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProFe, FacLam, ForUltLr, ForKgsMn, ForProMc, ForProUl, ForProKgs, FosCosFbk, ForcosCF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T015I16", "UPDATE TXPCLARPD SET ForProPK=?, ForProPM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T015I17", "DELETE FROM TXPCLARPD  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new ForEachCursor("T015I18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I19", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL, FasAq, DFsAq, ForProFK, ForProFM, EmprCod, CliCod FROM TXPFPCC WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and ForProL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015I20", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015I21", "INSERT INTO TXPFPCC(ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL, FasAq, DFsAq, ForProFK, ForProFM, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFPCC")
         ,new UpdateCursor("T015I22", "UPDATE TXPFPCC SET FasAq=?, DFsAq=?, ForProFK=?, ForProFM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProL = ?", GX_NOMASK, "TXPFPCC")
         ,new UpdateCursor("T015I23", "DELETE FROM TXPFPCC  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProL = ?", GX_NOMASK, "TXPFPCC")
         ,new ForEachCursor("T015I24", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015I25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I26", "SELECT EmprCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015I28", "SELECT COALESCE( T1.SPK, 0) AS SPK, COALESCE( T1.SPM, 0) AS SPM FROM (SELECT SUM(ForProFK) AS SPK, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, SUM(ForProFM) AS SPM FROM TXPFPCC GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 28);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 28);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 28);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 16);
               stmt.setString(8, (String)parms[9], 13);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 13);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 28);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 5);
               }
               stmt.setString(11, (String)parms[14], 3);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 28);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 13);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 8);
               stmt.setShort(12, ((Number) parms[15]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

