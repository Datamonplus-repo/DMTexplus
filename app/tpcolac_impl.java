package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpcolac_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"CLINOM_D") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7272CliCod_d = (int)(GXutil.lval( httpContext.GetPar( "CliCod_d"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7272CliCod_d", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7272CliCod_d), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaclinom_d1G61598( A396EmprCod, A7272CliCod_d) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"PRODSC_C") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7270Procod_c = httpContext.GetPar( "Procod_c") ;
         httpContext.ajax_rsp_assign_attri("", false, "A7270Procod_c", A7270Procod_c);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaprodsc_c1G61598( A396EmprCod, A7270Procod_c) ;
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
            A7270Procod_c = httpContext.GetPar( "Procod_c") ;
            httpContext.ajax_rsp_assign_attri("", false, "A7270Procod_c", A7270Procod_c);
            A7272CliCod_d = (int)(GXutil.lval( httpContext.GetPar( "CliCod_d"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7272CliCod_d", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7272CliCod_d), 6, 0));
            A6559ColAncL = (short)(GXutil.lval( httpContext.GetPar( "ColAncL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6559ColAncL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6559ColAncL), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED-", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      A6560ColAncUlI = (short)(GXutil.lval( httpContext.GetPar( "ColAncUlI"))) ;
      n6560ColAncUlI = false ;
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

   public tpcolac_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpcolac_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpcolac_impl.class ));
   }

   public tpcolac_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPCOLac.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcod_c_Internalname, GXutil.rtrim( A7270Procod_c), GXutil.rtrim( localUtil.format( A7270Procod_c, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcod_c_Jsonclick, 0, "", "", "", "", "", 1, edtProcod_c_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_c_Internalname, GXutil.rtrim( A7271ProDsc_c), GXutil.rtrim( localUtil.format( A7271ProDsc_c, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_c_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_c_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_d_Internalname, GXutil.ltrim( localUtil.ntoc( A7272CliCod_d, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_d_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7272CliCod_d), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7272CliCod_d), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_d_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_d_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "CliNom D", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_D_Internalname, GXutil.rtrim( A7273CliNom_D), GXutil.rtrim( localUtil.format( A7273CliNom_D, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_D_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_D_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Numero de Linea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColAncL_Internalname, GXutil.ltrim( localUtil.ntoc( A6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColAncL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6559ColAncL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6559ColAncL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColAncL_Jsonclick, 0, "", "", "", "", "", 1, edtColAncL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Ultima linea incremento", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLac.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColAncUlI_Internalname, GXutil.ltrim( localUtil.ntoc( A6560ColAncUlI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColAncUlI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6560ColAncUlI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6560ColAncUlI), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColAncUlI_Jsonclick, 0, "", "", "", "", "", 1, edtColAncUlI_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLac.htm");
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
         nBlankRcdCount1599 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1599 = (short)(1) ;
            scanStart1G61599( ) ;
            while ( RcdFound1599 != 0 )
            {
               init_level_properties1599( ) ;
               getByPrimaryKey1G61599( ) ;
               addRow1G61599( ) ;
               scanNext1G61599( ) ;
            }
            scanEnd1G61599( ) ;
            nBlankRcdCount1599 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6560ColAncUlI = A6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         standaloneNotModal1G61599( ) ;
         standaloneModal1G61599( ) ;
         sMode1599 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1G61599( ) ;
            edtavnRcdDeleted_1599_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1599_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1599_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1599_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtColAncLI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCLI_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncLI_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtColAncMmM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMMM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncMmM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMmM_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtColAncMxM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMXM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncMxM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMxM_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtColAncIc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCIC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncIc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncIc_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_1599 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1G61599( ) ;
            }
            sendRow1G61599( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode1599 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6560ColAncUlI = B6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1599 = (short)(5) ;
         nRcdExists_1599 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1G61599( ) ;
            while ( RcdFound1599 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_951599( ) ;
               init_level_properties1599( ) ;
               standaloneNotModal1G61599( ) ;
               getByPrimaryKey1G61599( ) ;
               standaloneModal1G61599( ) ;
               addRow1G61599( ) ;
               scanNext1G61599( ) ;
            }
            scanEnd1G61599( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1599 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_951599( ) ;
      initAll1G61599( ) ;
      init_level_properties1599( ) ;
      B6560ColAncUlI = A6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      nRcdExists_1599 = (short)(0) ;
      nIsMod_1599 = (short)(0) ;
      nRcdDeleted_1599 = (short)(0) ;
      nBlankRcdCount1599 = (short)(nBlankRcdUsr1599+nBlankRcdCount1599) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1599 > 0 )
      {
         standaloneNotModal1G61599( ) ;
         standaloneModal1G61599( ) ;
         addRow1G61599( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtColAncLI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1599 = (short)(nBlankRcdCount1599-1) ;
      }
      Gx_mode = sMode1599 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6560ColAncUlI = B6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLac.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPCOLac.htm");
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
      e111G62 ();
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
            Z7270Procod_c = httpContext.cgiGet( "Z7270Procod_c") ;
            Z7272CliCod_d = (int)(localUtil.ctol( httpContext.cgiGet( "Z7272CliCod_d"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6559ColAncL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6559ColAncL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6560ColAncUlI = (short)(localUtil.ctol( httpContext.cgiGet( "Z6560ColAncUlI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6560ColAncUlI = (short)(localUtil.ctol( httpContext.cgiGet( "O6560ColAncUlI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            A7270Procod_c = httpContext.cgiGet( edtProcod_c_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7270Procod_c", A7270Procod_c);
            A7271ProDsc_c = httpContext.cgiGet( edtProDsc_c_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7271ProDsc_c", A7271ProDsc_c);
            A7272CliCod_d = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_d_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7272CliCod_d", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7272CliCod_d), 6, 0));
            A7273CliNom_D = httpContext.cgiGet( edtCliNom_D_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7273CliNom_D", A7273CliNom_D);
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
            A6559ColAncL = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6559ColAncL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6559ColAncL), 4, 0));
            A6560ColAncUlI = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncUlI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6560ColAncUlI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
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
               A7270Procod_c = httpContext.GetPar( "Procod_c") ;
               httpContext.ajax_rsp_assign_attri("", false, "A7270Procod_c", A7270Procod_c);
               A7272CliCod_d = (int)(GXutil.lval( httpContext.GetPar( "CliCod_d"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7272CliCod_d", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7272CliCod_d), 6, 0));
               A6559ColAncL = (short)(GXutil.lval( httpContext.GetPar( "ColAncL"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6559ColAncL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6559ColAncL), 4, 0));
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
                        e111G62 ();
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
            initAll1G61598( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1599_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1599_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1G61598( ) ;
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

   public void confirm_1G60( )
   {
      beforeValidate1G61598( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G61598( ) ;
         }
         else
         {
            checkExtendedTable1G61598( ) ;
            if ( AnyError == 0 )
            {
               zm1G61598( 9) ;
               zm1G61598( 10) ;
               zm1G61598( 11) ;
               zm1G61598( 12) ;
            }
            closeExtendedTableCursors1G61598( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1598 = Gx_mode ;
         confirm_1G61599( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1598 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1G60( ) ;
      }
   }

   public void confirm_1G61599( )
   {
      s6560ColAncUlI = O6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1G61599( ) ;
         if ( ( nRcdExists_1599 != 0 ) || ( nIsMod_1599 != 0 ) )
         {
            getKey1G61599( ) ;
            if ( ( nRcdExists_1599 == 0 ) && ( nRcdDeleted_1599 == 0 ) )
            {
               if ( RcdFound1599 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1G61599( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1G61599( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1G61599( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6560ColAncUlI = A6560ColAncUlI ;
                     n6560ColAncUlI = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "COLANCLI_" + sGXsfl_95_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtColAncLI_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1599 != 0 )
               {
                  if ( nRcdDeleted_1599 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1G61599( ) ;
                     load1G61599( ) ;
                     beforeValidate1G61599( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1G61599( ) ;
                        O6560ColAncUlI = A6560ColAncUlI ;
                        n6560ColAncUlI = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1599 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1G61599( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1G61599( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1G61599( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6560ColAncUlI = A6560ColAncUlI ;
                           n6560ColAncUlI = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1599 == 0 )
                  {
                     GXCCtl = "COLANCLI_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColAncLI_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1599_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncLI_Internalname, GXutil.ltrim( localUtil.ntoc( A6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMmM_Internalname, GXutil.ltrim( localUtil.ntoc( A6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMxM_Internalname, GXutil.ltrim( localUtil.ntoc( A6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncIc_Internalname, GXutil.ltrim( localUtil.ntoc( A6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6561ColAncLI_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6562ColAncMmM_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6563ColAncMxM_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6564ColAncIc_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1599 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1599_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1599_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCLI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncLI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMMM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMmM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMXM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMxM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCIC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncIc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6560ColAncUlI = s6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1G60( )
   {
   }

   public void e111G62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcolac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 + " " + httpContext.getMessage( "Destino", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpcolac_impl.this.A396EmprCod = GXv_char2[0] ;
      tpcolac_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpcolac_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1G61598( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6560ColAncUlI = T01G65_A6560ColAncUlI[0] ;
         }
         else
         {
            Z6560ColAncUlI = A6560ColAncUlI ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z6559ColAncL = A6559ColAncL ;
         Z6560ColAncUlI = A6560ColAncUlI ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
         Z5742ForSerDsc = A5742ForSerDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtColAncUlI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUlI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUlI_Enabled), 5, 0), true);
      AV33Pgmname = "TPCOLac" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtColAncUlI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUlI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUlI_Enabled), 5, 0), true);
      /* Using cursor T01G66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01G66_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T01G67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01G67_A832TipColDsc[0] ;
      n832TipColDsc = T01G67_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(5);
      /* Using cursor T01G68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T01G68_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T01G68_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      pr_default.close(6);
      GXt_char1 = A7271ProDsc_c ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7270Procod_c, GXv_char4) ;
      tpcolac_impl.this.GXt_char1 = GXv_char4[0] ;
      A7271ProDsc_c = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7271ProDsc_c", A7271ProDsc_c);
      /* Using cursor T01G69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PCOPCD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD_D");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      GXt_char1 = A7273CliNom_D ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7272CliCod_d, GXv_char4) ;
      tpcolac_impl.this.GXt_char1 = GXv_char4[0] ;
      A7273CliNom_D = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7273CliNom_D", A7273CliNom_D);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
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

   public void load1G61598( )
   {
      /* Using cursor T01G610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1598 = (short)(1) ;
         A5742ForSerDsc = T01G610_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01G610_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A279CliNom = T01G610_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A832TipColDsc = T01G610_A832TipColDsc[0] ;
         n832TipColDsc = T01G610_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A6560ColAncUlI = T01G610_A6560ColAncUlI[0] ;
         n6560ColAncUlI = T01G610_n6560ColAncUlI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         zm1G61598( -8) ;
      }
      pr_default.close(8);
      onLoadActions1G61598( ) ;
   }

   public void onLoadActions1G61598( )
   {
   }

   public void checkExtendedTable1G61598( )
   {
      nIsDirty_1598 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1G61598( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1G61598( )
   {
      /* Using cursor T01G611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1598 = (short)(1) ;
      }
      else
      {
         RcdFound1598 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(3) != 101) && ( T01G65_A6559ColAncL[0] == A6559ColAncL ) && ( GXutil.strcmp(T01G65_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G65_A252CliCod[0] == A252CliCod ) && ( T01G65_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G65_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G65_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G65_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01G65_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G65_A7272CliCod_d[0] == A7272CliCod_d ) )
      {
         zm1G61598( 8) ;
         RcdFound1598 = (short)(1) ;
         A6560ColAncUlI = T01G65_A6560ColAncUlI[0] ;
         n6560ColAncUlI = T01G65_n6560ColAncUlI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         O6560ColAncUlI = A6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         Z6559ColAncL = A6559ColAncL ;
         sMode1598 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G61598( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1598 = (short)(0) ;
            initializeNonKey1G61598( ) ;
         }
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1598 = (short)(0) ;
         initializeNonKey1G61598( ) ;
         sMode1598 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1G61598( ) ;
      if ( RcdFound1598 == 0 )
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
      RcdFound1598 = (short)(0) ;
      /* Using cursor T01G612 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01G612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G612_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G612_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G612_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G612_A483ForColNum[0] == A483ForColNum ) && ( T01G612_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G612_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G612_A7272CliCod_d[0] == A7272CliCod_d ) && ( T01G612_A6559ColAncL[0] == A6559ColAncL ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01G612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G612_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G612_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G612_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G612_A483ForColNum[0] == A483ForColNum ) && ( T01G612_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G612_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G612_A7272CliCod_d[0] == A7272CliCod_d ) && ( T01G612_A6559ColAncL[0] == A6559ColAncL ) )
         {
            RcdFound1598 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1598 = (short)(0) ;
      /* Using cursor T01G613 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01G613_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G613_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G613_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G613_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G613_A483ForColNum[0] == A483ForColNum ) && ( T01G613_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G613_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G613_A7272CliCod_d[0] == A7272CliCod_d ) && ( T01G613_A6559ColAncL[0] == A6559ColAncL ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01G613_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G613_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G613_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G613_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G613_A483ForColNum[0] == A483ForColNum ) && ( T01G613_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G613_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G613_A7272CliCod_d[0] == A7272CliCod_d ) && ( T01G613_A6559ColAncL[0] == A6559ColAncL ) )
         {
            RcdFound1598 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G61598( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6560ColAncUlI = O6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         insert1G61598( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1598 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) || ( A6559ColAncL != Z6559ColAncL ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6560ColAncUlI = O6560ColAncUlI ;
               n6560ColAncUlI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6560ColAncUlI = O6560ColAncUlI ;
               n6560ColAncUlI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
               update1G61598( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) || ( A6559ColAncL != Z6559ColAncL ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6560ColAncUlI = O6560ColAncUlI ;
               n6560ColAncUlI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
               insert1G61598( ) ;
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
                  A6560ColAncUlI = O6560ColAncUlI ;
                  n6560ColAncUlI = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
                  insert1G61598( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) || ( A6559ColAncL != Z6559ColAncL ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6560ColAncUlI = O6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKey1G61598( ) ;
      if ( RcdFound1598 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) || ( A6559ColAncL != Z6559ColAncL ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) || ( A6559ColAncL != Z6559ColAncL ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcolac");
   }

   public void insert_check( )
   {
      confirm_1G60( ) ;
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
      if ( RcdFound1598 == 0 )
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
      scanStart1G61598( ) ;
      if ( RcdFound1598 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G61598( ) ;
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
      if ( RcdFound1598 == 0 )
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
      if ( RcdFound1598 == 0 )
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
      scanStart1G61598( ) ;
      if ( RcdFound1598 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1598 != 0 )
         {
            scanNext1G61598( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G61598( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G61598( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G64 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLac"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z6560ColAncUlI != T01G64_A6560ColAncUlI[0] ) )
         {
            if ( Z6560ColAncUlI != T01G64_A6560ColAncUlI[0] )
            {
               GXutil.writeLogln("tpcolac:[seudo value changed for attri]"+"ColAncUlI");
               GXutil.writeLogRaw("Old: ",Z6560ColAncUlI);
               GXutil.writeLogRaw("Current: ",T01G64_A6560ColAncUlI[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCOLac"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G61598( )
   {
      beforeValidate1G61598( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G61598( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G61598( 0) ;
         checkOptimisticConcurrency1G61598( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G61598( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G61598( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G614 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A6559ColAncL), Boolean.valueOf(n6560ColAncUlI), Short.valueOf(A6560ColAncUlI), A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
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
                        processLevel1G61598( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1G60( ) ;
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
            load1G61598( ) ;
         }
         endLevel1G61598( ) ;
      }
      closeExtendedTableCursors1G61598( ) ;
   }

   public void update1G61598( )
   {
      beforeValidate1G61598( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G61598( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G61598( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G61598( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G61598( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G615 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n6560ColAncUlI), Short.valueOf(A6560ColAncUlI), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLac"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G61598( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G61598( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1G60( ) ;
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
         endLevel1G61598( ) ;
      }
      closeExtendedTableCursors1G61598( ) ;
   }

   public void deferredUpdate1G61598( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G61598( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G61598( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G61598( ) ;
         afterConfirm1G61598( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G61598( ) ;
            if ( AnyError == 0 )
            {
               A6560ColAncUlI = O6560ColAncUlI ;
               n6560ColAncUlI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
               scanStart1G61599( ) ;
               while ( RcdFound1599 != 0 )
               {
                  getByPrimaryKey1G61599( ) ;
                  delete1G61599( ) ;
                  scanNext1G61599( ) ;
                  O6560ColAncUlI = A6560ColAncUlI ;
                  n6560ColAncUlI = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
               }
               scanEnd1G61599( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G616 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1598 == 0 )
                        {
                           initAll1G61598( ) ;
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
                        resetCaption1G60( ) ;
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
      sMode1598 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G61598( ) ;
      Gx_mode = sMode1598 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G61598( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1G61599( )
   {
      s6560ColAncUlI = O6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1G61599( ) ;
         if ( ( nRcdExists_1599 != 0 ) || ( nIsMod_1599 != 0 ) )
         {
            standaloneNotModal1G61599( ) ;
            getKey1G61599( ) ;
            if ( ( nRcdExists_1599 == 0 ) && ( nRcdDeleted_1599 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1G61599( ) ;
            }
            else
            {
               if ( RcdFound1599 != 0 )
               {
                  if ( ( nRcdDeleted_1599 != 0 ) && ( nRcdExists_1599 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1G61599( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1599 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1G61599( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1599 == 0 )
                  {
                     GXCCtl = "COLANCLI_" + sGXsfl_95_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColAncLI_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6560ColAncUlI = A6560ColAncUlI ;
            n6560ColAncUlI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1599_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncLI_Internalname, GXutil.ltrim( localUtil.ntoc( A6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMmM_Internalname, GXutil.ltrim( localUtil.ntoc( A6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMxM_Internalname, GXutil.ltrim( localUtil.ntoc( A6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncIc_Internalname, GXutil.ltrim( localUtil.ntoc( A6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6561ColAncLI_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6562ColAncMmM_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6563ColAncMxM_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6564ColAncIc_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1599_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1599 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1599_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1599_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCLI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncLI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMMM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMmM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMXM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMxM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCIC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncIc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1G61599( ) ;
      if ( AnyError != 0 )
      {
         O6560ColAncUlI = s6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      }
      nRcdExists_1599 = (short)(0) ;
      nIsMod_1599 = (short)(0) ;
      nRcdDeleted_1599 = (short)(0) ;
   }

   public void processLevel1G61598( )
   {
      /* Save parent mode. */
      sMode1598 = Gx_mode ;
      processNestedLevel1G61599( ) ;
      if ( AnyError != 0 )
      {
         O6560ColAncUlI = s6560ColAncUlI ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1598 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01G617 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n6560ColAncUlI), Short.valueOf(A6560ColAncUlI), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
   }

   public void endLevel1G61598( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1G61598( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpcolac");
         if ( AnyError == 0 )
         {
            confirmValues1G60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcolac");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G61598( )
   {
      /* Scan By routine */
      /* Using cursor T01G618 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      RcdFound1598 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1598 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G61598( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1598 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1598 = (short)(1) ;
      }
   }

   public void scanEnd1G61598( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1G61598( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G61598( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G61598( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G61598( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G61598( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G61598( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G61598( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
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
      edtProcod_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcod_c_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcod_c_Enabled), 5, 0), true);
      edtProDsc_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_c_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_c_Enabled), 5, 0), true);
      edtCliCod_d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_d_Enabled), 5, 0), true);
      edtCliNom_D_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_D_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_D_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtColAncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), true);
      edtColAncUlI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUlI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUlI_Enabled), 5, 0), true);
   }

   public void zm1G61599( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6562ColAncMmM = T01G63_A6562ColAncMmM[0] ;
            Z6563ColAncMxM = T01G63_A6563ColAncMxM[0] ;
            Z6564ColAncIc = T01G63_A6564ColAncIc[0] ;
         }
         else
         {
            Z6562ColAncMmM = A6562ColAncMmM ;
            Z6563ColAncMxM = A6563ColAncMxM ;
            Z6564ColAncIc = A6564ColAncIc ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         Z6559ColAncL = A6559ColAncL ;
         Z6561ColAncLI = A6561ColAncLI ;
         Z6562ColAncMmM = A6562ColAncMmM ;
         Z6563ColAncMxM = A6563ColAncMxM ;
         Z6564ColAncIc = A6564ColAncIc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1G61599( )
   {
      edtColAncUlI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUlI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUlI_Enabled), 5, 0), true);
      edtColAncUlI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUlI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUlI_Enabled), 5, 0), true);
   }

   public void standaloneModal1G61599( )
   {
      if ( isIns( )  )
      {
         A6560ColAncUlI = (short)(O6560ColAncUlI+1) ;
         n6560ColAncUlI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6561ColAncLI = A6560ColAncUlI ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtColAncLI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColAncLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncLI_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
      else
      {
         edtColAncLI_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColAncLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncLI_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      }
   }

   public void load1G61599( )
   {
      /* Using cursor T01G619 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1599 = (short)(1) ;
         A6562ColAncMmM = T01G619_A6562ColAncMmM[0] ;
         n6562ColAncMmM = T01G619_n6562ColAncMmM[0] ;
         A6563ColAncMxM = T01G619_A6563ColAncMxM[0] ;
         n6563ColAncMxM = T01G619_n6563ColAncMxM[0] ;
         A6564ColAncIc = T01G619_A6564ColAncIc[0] ;
         n6564ColAncIc = T01G619_n6564ColAncIc[0] ;
         zm1G61599( -13) ;
      }
      pr_default.close(17);
      onLoadActions1G61599( ) ;
   }

   public void onLoadActions1G61599( )
   {
   }

   public void checkExtendedTable1G61599( )
   {
      nIsDirty_1599 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1G61599( ) ;
   }

   public void closeExtendedTableCursors1G61599( )
   {
   }

   public void enableDisable1G61599( )
   {
   }

   public void getKey1G61599( )
   {
      /* Using cursor T01G620 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1599 = (short)(1) ;
      }
      else
      {
         RcdFound1599 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1G61599( )
   {
      /* Using cursor T01G63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G63_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G63_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G63_A483ForColNum[0] == A483ForColNum ) && ( T01G63_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G63_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G63_A7272CliCod_d[0] == A7272CliCod_d ) && ( T01G63_A6559ColAncL[0] == A6559ColAncL ) && ( GXutil.strcmp(T01G63_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G63_A252CliCod[0] == A252CliCod ) )
      {
         zm1G61599( 13) ;
         RcdFound1599 = (short)(1) ;
         initializeNonKey1G61599( ) ;
         A6561ColAncLI = T01G63_A6561ColAncLI[0] ;
         A6562ColAncMmM = T01G63_A6562ColAncMmM[0] ;
         n6562ColAncMmM = T01G63_n6562ColAncMmM[0] ;
         A6563ColAncMxM = T01G63_A6563ColAncMxM[0] ;
         n6563ColAncMxM = T01G63_n6563ColAncMxM[0] ;
         A6564ColAncIc = T01G63_A6564ColAncIc[0] ;
         n6564ColAncIc = T01G63_n6564ColAncIc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         Z6559ColAncL = A6559ColAncL ;
         Z6561ColAncLI = A6561ColAncLI ;
         sMode1599 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G61599( ) ;
         load1G61599( ) ;
         Gx_mode = sMode1599 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1599 = (short)(0) ;
         initializeNonKey1G61599( ) ;
         sMode1599 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G61599( ) ;
         Gx_mode = sMode1599 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1G61599( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1G61599( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLa3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6562ColAncMmM, T01G62_A6562ColAncMmM[0]) != 0 ) || ( DecimalUtil.compareTo(Z6563ColAncMxM, T01G62_A6563ColAncMxM[0]) != 0 ) || ( DecimalUtil.compareTo(Z6564ColAncIc, T01G62_A6564ColAncIc[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6562ColAncMmM, T01G62_A6562ColAncMmM[0]) != 0 )
            {
               GXutil.writeLogln("tpcolac:[seudo value changed for attri]"+"ColAncMmM");
               GXutil.writeLogRaw("Old: ",Z6562ColAncMmM);
               GXutil.writeLogRaw("Current: ",T01G62_A6562ColAncMmM[0]);
            }
            if ( DecimalUtil.compareTo(Z6563ColAncMxM, T01G62_A6563ColAncMxM[0]) != 0 )
            {
               GXutil.writeLogln("tpcolac:[seudo value changed for attri]"+"ColAncMxM");
               GXutil.writeLogRaw("Old: ",Z6563ColAncMxM);
               GXutil.writeLogRaw("Current: ",T01G62_A6563ColAncMxM[0]);
            }
            if ( DecimalUtil.compareTo(Z6564ColAncIc, T01G62_A6564ColAncIc[0]) != 0 )
            {
               GXutil.writeLogln("tpcolac:[seudo value changed for attri]"+"ColAncIc");
               GXutil.writeLogRaw("Old: ",Z6564ColAncIc);
               GXutil.writeLogRaw("Current: ",T01G62_A6564ColAncIc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCOLa3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G61599( )
   {
      beforeValidate1G61599( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G61599( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G61599( 0) ;
         checkOptimisticConcurrency1G61599( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G61599( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G61599( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G621 */
                  pr_default.execute(19, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI), Boolean.valueOf(n6562ColAncMmM), A6562ColAncMmM, Boolean.valueOf(n6563ColAncMxM), A6563ColAncMxM, Boolean.valueOf(n6564ColAncIc), A6564ColAncIc, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLa3");
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
            load1G61599( ) ;
         }
         endLevel1G61599( ) ;
      }
      closeExtendedTableCursors1G61599( ) ;
   }

   public void update1G61599( )
   {
      beforeValidate1G61599( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G61599( ) ;
      }
      if ( ( nIsMod_1599 != 0 ) || ( nIsDirty_1599 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1G61599( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1G61599( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1G61599( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01G622 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n6562ColAncMmM), A6562ColAncMmM, Boolean.valueOf(n6563ColAncMxM), A6563ColAncMxM, Boolean.valueOf(n6564ColAncIc), A6564ColAncIc, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLa3");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLa3"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1G61599( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1G61599( ) ;
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
            endLevel1G61599( ) ;
         }
      }
      closeExtendedTableCursors1G61599( ) ;
   }

   public void deferredUpdate1G61599( )
   {
   }

   public void delete1G61599( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G61599( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G61599( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G61599( ) ;
         afterConfirm1G61599( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G61599( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G623 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Short.valueOf(A6561ColAncLI)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLa3");
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
      sMode1599 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G61599( ) ;
      Gx_mode = sMode1599 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G61599( )
   {
      standaloneModal1G61599( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G61599( )
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

   public void scanStart1G61599( )
   {
      /* Scan By routine */
      /* Using cursor T01G624 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      RcdFound1599 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1599 = (short)(1) ;
         A6561ColAncLI = T01G624_A6561ColAncLI[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G61599( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1599 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1599 = (short)(1) ;
         A6561ColAncLI = T01G624_A6561ColAncLI[0] ;
      }
   }

   public void scanEnd1G61599( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1G61599( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G61599( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G61599( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G61599( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G61599( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G61599( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G61599( )
   {
      edtColAncLI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncLI_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtColAncMmM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncMmM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMmM_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtColAncMxM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncMxM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMxM_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtColAncIc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncIc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncIc_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1G61599( )
   {
   }

   public void send_integrity_lvl_hashes1G61598( )
   {
   }

   public void subsflControlProps_951599( )
   {
      edtavnRcdDeleted_1599_Internalname = "vNRCDDELETED_1599_"+sGXsfl_95_idx ;
      edtColAncLI_Internalname = "COLANCLI_"+sGXsfl_95_idx ;
      edtColAncMmM_Internalname = "COLANCMMM_"+sGXsfl_95_idx ;
      edtColAncMxM_Internalname = "COLANCMXM_"+sGXsfl_95_idx ;
      edtColAncIc_Internalname = "COLANCIC_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_951599( )
   {
      edtavnRcdDeleted_1599_Internalname = "vNRCDDELETED_1599_"+sGXsfl_95_fel_idx ;
      edtColAncLI_Internalname = "COLANCLI_"+sGXsfl_95_fel_idx ;
      edtColAncMmM_Internalname = "COLANCMMM_"+sGXsfl_95_fel_idx ;
      edtColAncMxM_Internalname = "COLANCMXM_"+sGXsfl_95_fel_idx ;
      edtColAncIc_Internalname = "COLANCIC_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1G61599( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951599( ) ;
      sendRow1G61599( ) ;
   }

   public void sendRow1G61599( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1599_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1599_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1599_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1599), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1599), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1599_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1599_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1599_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncLI_Internalname,GXutil.ltrim( localUtil.ntoc( A6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6561ColAncLI), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncLI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncLI_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1599_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncMmM_Internalname,GXutil.ltrim( localUtil.ntoc( A6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncMmM_Enabled!=0) ? localUtil.format( A6562ColAncMmM, "ZZZZZ9.99") : localUtil.format( A6562ColAncMmM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncMmM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncMmM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1599_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncMxM_Internalname,GXutil.ltrim( localUtil.ntoc( A6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncMxM_Enabled!=0) ? localUtil.format( A6563ColAncMxM, "ZZZZZ9.99") : localUtil.format( A6563ColAncMxM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncMxM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncMxM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1599_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncIc_Internalname,GXutil.ltrim( localUtil.ntoc( A6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncIc_Enabled!=0) ? localUtil.format( A6564ColAncIc, "ZZ9.99") : localUtil.format( A6564ColAncIc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncIc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncIc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1G61599( ) ;
      GXCCtl = "Z6561ColAncLI_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6561ColAncLI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6562ColAncMmM_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6562ColAncMmM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6563ColAncMxM_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6563ColAncMxM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6564ColAncIc_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6564ColAncIc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1599_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1599_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1599_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1599, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1599_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1599_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCLI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncLI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCMMM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMmM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCMXM_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMxM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCIC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncIc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1G61599( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951599( ) ;
      edtavnRcdDeleted_1599_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1599_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncLI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCLI_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncMmM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMMM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncMxM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMXM_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncIc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCIC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1599_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1599_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1599");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1599_Internalname ;
         wbErr = true ;
         nRcdDeleted_1599 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1599 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1599_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColAncLI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColAncLI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COLANCLI_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncLI_Internalname ;
         wbErr = true ;
         A6561ColAncLI = (short)(0) ;
      }
      else
      {
         A6561ColAncLI = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncLI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColAncMmM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColAncMmM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COLANCMMM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncMmM_Internalname ;
         wbErr = true ;
         A6562ColAncMmM = DecimalUtil.ZERO ;
         n6562ColAncMmM = false ;
      }
      else
      {
         A6562ColAncMmM = localUtil.ctond( httpContext.cgiGet( edtColAncMmM_Internalname)) ;
         n6562ColAncMmM = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColAncMxM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColAncMxM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COLANCMXM_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncMxM_Internalname ;
         wbErr = true ;
         A6563ColAncMxM = DecimalUtil.ZERO ;
         n6563ColAncMxM = false ;
      }
      else
      {
         A6563ColAncMxM = localUtil.ctond( httpContext.cgiGet( edtColAncMxM_Internalname)) ;
         n6563ColAncMxM = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColAncIc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColAncIc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "COLANCIC_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncIc_Internalname ;
         wbErr = true ;
         A6564ColAncIc = DecimalUtil.ZERO ;
         n6564ColAncIc = false ;
      }
      else
      {
         A6564ColAncIc = localUtil.ctond( httpContext.cgiGet( edtColAncIc_Internalname)) ;
         n6564ColAncIc = false ;
      }
      GXCCtl = "Z6561ColAncLI_" + sGXsfl_95_idx ;
      Z6561ColAncLI = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6562ColAncMmM_" + sGXsfl_95_idx ;
      Z6562ColAncMmM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6563ColAncMxM_" + sGXsfl_95_idx ;
      Z6563ColAncMxM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6564ColAncIc_" + sGXsfl_95_idx ;
      Z6564ColAncIc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1599_" + sGXsfl_95_idx ;
      nRcdDeleted_1599 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1599_" + sGXsfl_95_idx ;
      nRcdExists_1599 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1599_" + sGXsfl_95_idx ;
      nIsMod_1599 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtColAncLI_Enabled = edtColAncLI_Enabled ;
   }

   public void confirmValues1G60( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951599( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951599( ) ;
         httpContext.changePostValue( "Z6561ColAncLI_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z6561ColAncLI_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6561ColAncLI_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z6562ColAncMmM_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z6562ColAncMmM_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6562ColAncMmM_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z6563ColAncMxM_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z6563ColAncMxM_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6563ColAncMxM_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z6564ColAncIc_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z6564ColAncIc_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6564ColAncIc_"+sGXsfl_95_idx) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpcolac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6559ColAncL,4,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d","ColAncL"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7270Procod_c", GXutil.rtrim( Z7270Procod_c));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7272CliCod_d", GXutil.ltrim( localUtil.ntoc( Z7272CliCod_d, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6559ColAncL", GXutil.ltrim( localUtil.ntoc( Z6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6560ColAncUlI", GXutil.ltrim( localUtil.ntoc( Z6560ColAncUlI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6560ColAncUlI", GXutil.ltrim( localUtil.ntoc( O6560ColAncUlI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpcolac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6559ColAncL,4,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d","ColAncL"})  ;
   }

   public String getPgmname( )
   {
      return "TPCOLac" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED-", "") ;
   }

   public void initializeNonKey1G61598( )
   {
      A6560ColAncUlI = (short)(0) ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      O6560ColAncUlI = A6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
      Z6560ColAncUlI = (short)(0) ;
   }

   public void initAll1G61598( )
   {
      initializeNonKey1G61598( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1G61599( )
   {
      A6562ColAncMmM = DecimalUtil.ZERO ;
      n6562ColAncMmM = false ;
      A6563ColAncMxM = DecimalUtil.ZERO ;
      n6563ColAncMxM = false ;
      A6564ColAncIc = DecimalUtil.ZERO ;
      n6564ColAncIc = false ;
      Z6562ColAncMmM = DecimalUtil.ZERO ;
      Z6563ColAncMxM = DecimalUtil.ZERO ;
      Z6564ColAncIc = DecimalUtil.ZERO ;
   }

   public void initAll1G61599( )
   {
      A6561ColAncLI = (short)(0) ;
      initializeNonKey1G61599( ) ;
   }

   public void standaloneModalInsert1G61599( )
   {
      A6560ColAncUlI = i6560ColAncUlI ;
      n6560ColAncUlI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6560ColAncUlI), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016322264", true, true);
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
      httpContext.AddJavascriptSource("tpcolac.js", "?202661016322265", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1599( )
   {
      edtColAncLI_Enabled = defedtColAncLI_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncLI_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1599, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1599_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6561ColAncLI, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncLI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6562ColAncMmM, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMmM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6563ColAncMxM, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMxM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6564ColAncIc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncIc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProcod_c_Internalname = "PROCOD_C" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProDsc_c_Internalname = "PRODSC_C" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliCod_d_Internalname = "CLICOD_D" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliNom_D_Internalname = "CLINOM_D" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtColAncL_Internalname = "COLANCL" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtColAncUlI_Internalname = "COLANCULI" ;
      edtavnRcdDeleted_1599_Internalname = "vNRCDDELETED_1599" ;
      edtColAncLI_Internalname = "COLANCLI" ;
      edtColAncMmM_Internalname = "COLANCMMM" ;
      edtColAncMxM_Internalname = "COLANCMXM" ;
      edtColAncIc_Internalname = "COLANCIC" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED-", "") );
      edtColAncIc_Jsonclick = "" ;
      edtColAncMxM_Jsonclick = "" ;
      edtColAncMmM_Jsonclick = "" ;
      edtColAncLI_Jsonclick = "" ;
      edtavnRcdDeleted_1599_Jsonclick = "" ;
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
      edtColAncIc_Enabled = 1 ;
      edtColAncMxM_Enabled = 1 ;
      edtColAncMmM_Enabled = 1 ;
      edtColAncLI_Enabled = 1 ;
      edtavnRcdDeleted_1599_Enabled = 1 ;
      edtColAncUlI_Jsonclick = "" ;
      edtColAncUlI_Backcolor = (int)(0xFFFFFF) ;
      edtColAncUlI_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtColAncL_Jsonclick = "" ;
      edtColAncL_Backcolor = (int)(0xFFFFFF) ;
      edtColAncL_Enabled = 0 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 0 ;
      edtCliNom_D_Jsonclick = "" ;
      edtCliNom_D_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_D_Enabled = 0 ;
      edtCliCod_d_Jsonclick = "" ;
      edtCliCod_d_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_d_Enabled = 0 ;
      edtProDsc_c_Jsonclick = "" ;
      edtProDsc_c_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_c_Enabled = 0 ;
      edtProcod_c_Jsonclick = "" ;
      edtProcod_c_Backcolor = (int)(0xFFFFFF) ;
      edtProcod_c_Enabled = 0 ;
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

   public void gx1asaclinom_d1G61598( String A396EmprCod ,
                                      int A7272CliCod_d )
   {
      GXt_char1 = A7273CliNom_D ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7272CliCod_d, GXv_char4) ;
      tpcolac_impl.this.GXt_char1 = GXv_char4[0] ;
      A7273CliNom_D = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7273CliNom_D", A7273CliNom_D);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7273CliNom_D))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asaprodsc_c1G61598( String A396EmprCod ,
                                      String A7270Procod_c )
   {
      GXt_char1 = A7271ProDsc_c ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7270Procod_c, GXv_char4) ;
      tpcolac_impl.this.GXt_char1 = GXv_char4[0] ;
      A7271ProDsc_c = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7271ProDsc_c", A7271ProDsc_c);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7271ProDsc_c))+"\"") ;
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
      subsflControlProps_951599( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1G61599( ) ;
         standaloneModal1G61599( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1G61599( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951599( ) ;
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
      /* Using cursor T01G625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01G625_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(23);
      /* Using cursor T01G626 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01G626_A832TipColDsc[0] ;
      n832TipColDsc = T01G626_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(24);
      /* Using cursor T01G627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T01G627_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T01G627_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      pr_default.close(25);
      /* Using cursor T01G628 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PCOPCD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD_D");
         AnyError = (short)(1) ;
      }
      pr_default.close(26);
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

   public void valid_Colancl( )
   {
      n6560ColAncUlI = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7271ProDsc_c", GXutil.rtrim( A7271ProDsc_c));
      httpContext.ajax_rsp_assign_attri("", false, "A7273CliNom_D", GXutil.rtrim( A7273CliNom_D));
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6560ColAncUlI", GXutil.ltrim( localUtil.ntoc( A6560ColAncUlI, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7270Procod_c", GXutil.rtrim( Z7270Procod_c));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7272CliCod_d", GXutil.ltrim( localUtil.ntoc( Z7272CliCod_d, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6559ColAncL", GXutil.ltrim( localUtil.ntoc( Z6559ColAncL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7271ProDsc_c", GXutil.rtrim( Z7271ProDsc_c));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7273CliNom_D", GXutil.rtrim( Z7273CliNom_D));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6560ColAncUlI", GXutil.ltrim( localUtil.ntoc( Z6560ColAncUlI, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6560ColAncUlI", GXutil.ltrim( localUtil.ntoc( O6560ColAncUlI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'},{av:'A6559ColAncL',fld:'COLANCL',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      setEventMetadata("VALID_PROCOD_C","{handler:'valid_Procod_c',iparms:[]");
      setEventMetadata("VALID_PROCOD_C",",oparms:[]}");
      setEventMetadata("VALID_CLICOD_D","{handler:'valid_Clicod_d',iparms:[]");
      setEventMetadata("VALID_CLICOD_D",",oparms:[]}");
      setEventMetadata("VALID_COLANCL","{handler:'valid_Colancl',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A6560ColAncUlI',fld:'COLANCULI',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'},{av:'A6559ColAncL',fld:'COLANCL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COLANCL",",oparms:[{av:'A7271ProDsc_c',fld:'PRODSC_C',pic:''},{av:'A7273CliNom_D',fld:'CLINOM_D',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A6560ColAncUlI',fld:'COLANCULI',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z7270Procod_c'},{av:'Z7272CliCod_d'},{av:'Z6559ColAncL'},{av:'Z7271ProDsc_c'},{av:'Z7273CliNom_D'},{av:'Z5742ForSerDsc'},{av:'Z279CliNom'},{av:'Z832TipColDsc'},{av:'Z6560ColAncUlI'},{av:'O6560ColAncUlI'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COLANCULI","{handler:'valid_Colanculi',iparms:[]");
      setEventMetadata("VALID_COLANCULI",",oparms:[]}");
      setEventMetadata("VALID_COLANCLI","{handler:'valid_Colancli',iparms:[]");
      setEventMetadata("VALID_COLANCLI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Colancic',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      wcpOA7270Procod_c = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z7270Procod_c = "" ;
      Z6562ColAncMmM = DecimalUtil.ZERO ;
      Z6563ColAncMxM = DecimalUtil.ZERO ;
      Z6564ColAncIc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7270Procod_c = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A7271ProDsc_c = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A7273CliNom_D = "" ;
      lblTextblock11_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock13_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1599 = "" ;
      GX_FocusControl = "" ;
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
      sMode1598 = "" ;
      GXCCtl = "" ;
      A6562ColAncMmM = DecimalUtil.ZERO ;
      A6563ColAncMxM = DecimalUtil.ZERO ;
      A6564ColAncIc = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      Z5742ForSerDsc = "" ;
      T01G66_A279CliNom = new String[] {""} ;
      T01G67_A832TipColDsc = new String[] {""} ;
      T01G67_n832TipColDsc = new boolean[] {false} ;
      T01G68_A5742ForSerDsc = new String[] {""} ;
      T01G68_n5742ForSerDsc = new boolean[] {false} ;
      T01G69_A396EmprCod = new String[] {""} ;
      T01G610_A6559ColAncL = new short[1] ;
      T01G610_A5742ForSerDsc = new String[] {""} ;
      T01G610_n5742ForSerDsc = new boolean[] {false} ;
      T01G610_A279CliNom = new String[] {""} ;
      T01G610_A832TipColDsc = new String[] {""} ;
      T01G610_n832TipColDsc = new boolean[] {false} ;
      T01G610_A6560ColAncUlI = new short[1] ;
      T01G610_n6560ColAncUlI = new boolean[] {false} ;
      T01G610_A396EmprCod = new String[] {""} ;
      T01G610_A252CliCod = new int[1] ;
      T01G610_A831TipColCod = new byte[1] ;
      T01G610_A494ForSer = new String[] {""} ;
      T01G610_A482ForColNom = new String[] {""} ;
      T01G610_A483ForColNum = new int[1] ;
      T01G610_A7270Procod_c = new String[] {""} ;
      T01G610_A7272CliCod_d = new int[1] ;
      T01G611_A396EmprCod = new String[] {""} ;
      T01G611_A252CliCod = new int[1] ;
      T01G611_A494ForSer = new String[] {""} ;
      T01G611_A482ForColNom = new String[] {""} ;
      T01G611_A483ForColNum = new int[1] ;
      T01G611_A831TipColCod = new byte[1] ;
      T01G611_A7270Procod_c = new String[] {""} ;
      T01G611_A7272CliCod_d = new int[1] ;
      T01G611_A6559ColAncL = new short[1] ;
      T01G65_A6559ColAncL = new short[1] ;
      T01G65_A6560ColAncUlI = new short[1] ;
      T01G65_n6560ColAncUlI = new boolean[] {false} ;
      T01G65_A396EmprCod = new String[] {""} ;
      T01G65_A252CliCod = new int[1] ;
      T01G65_A831TipColCod = new byte[1] ;
      T01G65_A494ForSer = new String[] {""} ;
      T01G65_A482ForColNom = new String[] {""} ;
      T01G65_A483ForColNum = new int[1] ;
      T01G65_A7270Procod_c = new String[] {""} ;
      T01G65_A7272CliCod_d = new int[1] ;
      T01G612_A396EmprCod = new String[] {""} ;
      T01G612_A252CliCod = new int[1] ;
      T01G612_A494ForSer = new String[] {""} ;
      T01G612_A482ForColNom = new String[] {""} ;
      T01G612_A483ForColNum = new int[1] ;
      T01G612_A831TipColCod = new byte[1] ;
      T01G612_A7270Procod_c = new String[] {""} ;
      T01G612_A7272CliCod_d = new int[1] ;
      T01G612_A6559ColAncL = new short[1] ;
      T01G613_A396EmprCod = new String[] {""} ;
      T01G613_A252CliCod = new int[1] ;
      T01G613_A494ForSer = new String[] {""} ;
      T01G613_A482ForColNom = new String[] {""} ;
      T01G613_A483ForColNum = new int[1] ;
      T01G613_A831TipColCod = new byte[1] ;
      T01G613_A7270Procod_c = new String[] {""} ;
      T01G613_A7272CliCod_d = new int[1] ;
      T01G613_A6559ColAncL = new short[1] ;
      T01G64_A6559ColAncL = new short[1] ;
      T01G64_A6560ColAncUlI = new short[1] ;
      T01G64_n6560ColAncUlI = new boolean[] {false} ;
      T01G64_A396EmprCod = new String[] {""} ;
      T01G64_A252CliCod = new int[1] ;
      T01G64_A831TipColCod = new byte[1] ;
      T01G64_A494ForSer = new String[] {""} ;
      T01G64_A482ForColNom = new String[] {""} ;
      T01G64_A483ForColNum = new int[1] ;
      T01G64_A7270Procod_c = new String[] {""} ;
      T01G64_A7272CliCod_d = new int[1] ;
      T01G618_A396EmprCod = new String[] {""} ;
      T01G618_A252CliCod = new int[1] ;
      T01G618_A494ForSer = new String[] {""} ;
      T01G618_A482ForColNom = new String[] {""} ;
      T01G618_A483ForColNum = new int[1] ;
      T01G618_A831TipColCod = new byte[1] ;
      T01G618_A7270Procod_c = new String[] {""} ;
      T01G618_A7272CliCod_d = new int[1] ;
      T01G618_A6559ColAncL = new short[1] ;
      T01G619_A494ForSer = new String[] {""} ;
      T01G619_A482ForColNom = new String[] {""} ;
      T01G619_A483ForColNum = new int[1] ;
      T01G619_A831TipColCod = new byte[1] ;
      T01G619_A7270Procod_c = new String[] {""} ;
      T01G619_A7272CliCod_d = new int[1] ;
      T01G619_A6559ColAncL = new short[1] ;
      T01G619_A6561ColAncLI = new short[1] ;
      T01G619_A6562ColAncMmM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G619_n6562ColAncMmM = new boolean[] {false} ;
      T01G619_A6563ColAncMxM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G619_n6563ColAncMxM = new boolean[] {false} ;
      T01G619_A6564ColAncIc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G619_n6564ColAncIc = new boolean[] {false} ;
      T01G619_A396EmprCod = new String[] {""} ;
      T01G619_A252CliCod = new int[1] ;
      T01G620_A396EmprCod = new String[] {""} ;
      T01G620_A252CliCod = new int[1] ;
      T01G620_A494ForSer = new String[] {""} ;
      T01G620_A482ForColNom = new String[] {""} ;
      T01G620_A483ForColNum = new int[1] ;
      T01G620_A831TipColCod = new byte[1] ;
      T01G620_A7270Procod_c = new String[] {""} ;
      T01G620_A7272CliCod_d = new int[1] ;
      T01G620_A6559ColAncL = new short[1] ;
      T01G620_A6561ColAncLI = new short[1] ;
      T01G63_A494ForSer = new String[] {""} ;
      T01G63_A482ForColNom = new String[] {""} ;
      T01G63_A483ForColNum = new int[1] ;
      T01G63_A831TipColCod = new byte[1] ;
      T01G63_A7270Procod_c = new String[] {""} ;
      T01G63_A7272CliCod_d = new int[1] ;
      T01G63_A6559ColAncL = new short[1] ;
      T01G63_A6561ColAncLI = new short[1] ;
      T01G63_A6562ColAncMmM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G63_n6562ColAncMmM = new boolean[] {false} ;
      T01G63_A6563ColAncMxM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G63_n6563ColAncMxM = new boolean[] {false} ;
      T01G63_A6564ColAncIc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G63_n6564ColAncIc = new boolean[] {false} ;
      T01G63_A396EmprCod = new String[] {""} ;
      T01G63_A252CliCod = new int[1] ;
      T01G62_A494ForSer = new String[] {""} ;
      T01G62_A482ForColNom = new String[] {""} ;
      T01G62_A483ForColNum = new int[1] ;
      T01G62_A831TipColCod = new byte[1] ;
      T01G62_A7270Procod_c = new String[] {""} ;
      T01G62_A7272CliCod_d = new int[1] ;
      T01G62_A6559ColAncL = new short[1] ;
      T01G62_A6561ColAncLI = new short[1] ;
      T01G62_A6562ColAncMmM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G62_n6562ColAncMmM = new boolean[] {false} ;
      T01G62_A6563ColAncMxM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G62_n6563ColAncMxM = new boolean[] {false} ;
      T01G62_A6564ColAncIc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G62_n6564ColAncIc = new boolean[] {false} ;
      T01G62_A396EmprCod = new String[] {""} ;
      T01G62_A252CliCod = new int[1] ;
      T01G624_A396EmprCod = new String[] {""} ;
      T01G624_A252CliCod = new int[1] ;
      T01G624_A494ForSer = new String[] {""} ;
      T01G624_A482ForColNom = new String[] {""} ;
      T01G624_A483ForColNum = new int[1] ;
      T01G624_A831TipColCod = new byte[1] ;
      T01G624_A7270Procod_c = new String[] {""} ;
      T01G624_A7272CliCod_d = new int[1] ;
      T01G624_A6559ColAncL = new short[1] ;
      T01G624_A6561ColAncLI = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T01G625_A279CliNom = new String[] {""} ;
      T01G626_A832TipColDsc = new String[] {""} ;
      T01G626_n832TipColDsc = new boolean[] {false} ;
      T01G627_A5742ForSerDsc = new String[] {""} ;
      T01G627_n5742ForSerDsc = new boolean[] {false} ;
      T01G628_A396EmprCod = new String[] {""} ;
      Z7271ProDsc_c = "" ;
      Z7273CliNom_D = "" ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ7270Procod_c = "" ;
      ZZ7271ProDsc_c = "" ;
      ZZ7273CliNom_D = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ279CliNom = "" ;
      ZZ832TipColDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpcolac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpcolac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpcolac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpcolac__default(),
         new Object[] {
             new Object[] {
            T01G62_A494ForSer, T01G62_A482ForColNom, T01G62_A483ForColNum, T01G62_A831TipColCod, T01G62_A7270Procod_c, T01G62_A7272CliCod_d, T01G62_A6559ColAncL, T01G62_A6561ColAncLI, T01G62_A6562ColAncMmM, T01G62_n6562ColAncMmM,
            T01G62_A6563ColAncMxM, T01G62_n6563ColAncMxM, T01G62_A6564ColAncIc, T01G62_n6564ColAncIc, T01G62_A396EmprCod, T01G62_A252CliCod
            }
            , new Object[] {
            T01G63_A494ForSer, T01G63_A482ForColNom, T01G63_A483ForColNum, T01G63_A831TipColCod, T01G63_A7270Procod_c, T01G63_A7272CliCod_d, T01G63_A6559ColAncL, T01G63_A6561ColAncLI, T01G63_A6562ColAncMmM, T01G63_n6562ColAncMmM,
            T01G63_A6563ColAncMxM, T01G63_n6563ColAncMxM, T01G63_A6564ColAncIc, T01G63_n6564ColAncIc, T01G63_A396EmprCod, T01G63_A252CliCod
            }
            , new Object[] {
            T01G64_A6559ColAncL, T01G64_A6560ColAncUlI, T01G64_n6560ColAncUlI, T01G64_A396EmprCod, T01G64_A252CliCod, T01G64_A831TipColCod, T01G64_A494ForSer, T01G64_A482ForColNom, T01G64_A483ForColNum, T01G64_A7270Procod_c,
            T01G64_A7272CliCod_d
            }
            , new Object[] {
            T01G65_A6559ColAncL, T01G65_A6560ColAncUlI, T01G65_n6560ColAncUlI, T01G65_A396EmprCod, T01G65_A252CliCod, T01G65_A831TipColCod, T01G65_A494ForSer, T01G65_A482ForColNom, T01G65_A483ForColNum, T01G65_A7270Procod_c,
            T01G65_A7272CliCod_d
            }
            , new Object[] {
            T01G66_A279CliNom
            }
            , new Object[] {
            T01G67_A832TipColDsc, T01G67_n832TipColDsc
            }
            , new Object[] {
            T01G68_A5742ForSerDsc, T01G68_n5742ForSerDsc
            }
            , new Object[] {
            T01G69_A396EmprCod
            }
            , new Object[] {
            T01G610_A6559ColAncL, T01G610_A5742ForSerDsc, T01G610_n5742ForSerDsc, T01G610_A279CliNom, T01G610_A832TipColDsc, T01G610_n832TipColDsc, T01G610_A6560ColAncUlI, T01G610_n6560ColAncUlI, T01G610_A396EmprCod, T01G610_A252CliCod,
            T01G610_A831TipColCod, T01G610_A494ForSer, T01G610_A482ForColNom, T01G610_A483ForColNum, T01G610_A7270Procod_c, T01G610_A7272CliCod_d
            }
            , new Object[] {
            T01G611_A396EmprCod, T01G611_A252CliCod, T01G611_A494ForSer, T01G611_A482ForColNom, T01G611_A483ForColNum, T01G611_A831TipColCod, T01G611_A7270Procod_c, T01G611_A7272CliCod_d, T01G611_A6559ColAncL
            }
            , new Object[] {
            T01G612_A396EmprCod, T01G612_A252CliCod, T01G612_A494ForSer, T01G612_A482ForColNom, T01G612_A483ForColNum, T01G612_A831TipColCod, T01G612_A7270Procod_c, T01G612_A7272CliCod_d, T01G612_A6559ColAncL
            }
            , new Object[] {
            T01G613_A396EmprCod, T01G613_A252CliCod, T01G613_A494ForSer, T01G613_A482ForColNom, T01G613_A483ForColNum, T01G613_A831TipColCod, T01G613_A7270Procod_c, T01G613_A7272CliCod_d, T01G613_A6559ColAncL
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
            T01G618_A396EmprCod, T01G618_A252CliCod, T01G618_A494ForSer, T01G618_A482ForColNom, T01G618_A483ForColNum, T01G618_A831TipColCod, T01G618_A7270Procod_c, T01G618_A7272CliCod_d, T01G618_A6559ColAncL
            }
            , new Object[] {
            T01G619_A494ForSer, T01G619_A482ForColNom, T01G619_A483ForColNum, T01G619_A831TipColCod, T01G619_A7270Procod_c, T01G619_A7272CliCod_d, T01G619_A6559ColAncL, T01G619_A6561ColAncLI, T01G619_A6562ColAncMmM, T01G619_n6562ColAncMmM,
            T01G619_A6563ColAncMxM, T01G619_n6563ColAncMxM, T01G619_A6564ColAncIc, T01G619_n6564ColAncIc, T01G619_A396EmprCod, T01G619_A252CliCod
            }
            , new Object[] {
            T01G620_A396EmprCod, T01G620_A252CliCod, T01G620_A494ForSer, T01G620_A482ForColNom, T01G620_A483ForColNum, T01G620_A831TipColCod, T01G620_A7270Procod_c, T01G620_A7272CliCod_d, T01G620_A6559ColAncL, T01G620_A6561ColAncLI
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G624_A396EmprCod, T01G624_A252CliCod, T01G624_A494ForSer, T01G624_A482ForColNom, T01G624_A483ForColNum, T01G624_A831TipColCod, T01G624_A7270Procod_c, T01G624_A7272CliCod_d, T01G624_A6559ColAncL, T01G624_A6561ColAncLI
            }
            , new Object[] {
            T01G625_A279CliNom
            }
            , new Object[] {
            T01G626_A832TipColDsc, T01G626_n832TipColDsc
            }
            , new Object[] {
            T01G627_A5742ForSerDsc, T01G627_n5742ForSerDsc
            }
            , new Object[] {
            T01G628_A396EmprCod
            }
         }
      );
      Z6559ColAncL = (short)(0) ;
      A6559ColAncL = (short)(0) ;
      Z7272CliCod_d = 0 ;
      A7272CliCod_d = 0 ;
      Z7270Procod_c = "" ;
      A7270Procod_c = "" ;
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
      AV33Pgmname = "TPCOLac" ;
   }

   private byte wcpOA831TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private short wcpOA6559ColAncL ;
   private short Z6559ColAncL ;
   private short Z6560ColAncUlI ;
   private short O6560ColAncUlI ;
   private short Z6561ColAncLI ;
   private short nRcdDeleted_1599 ;
   private short nRcdExists_1599 ;
   private short nIsMod_1599 ;
   private short A6559ColAncL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6560ColAncUlI ;
   private short nBlankRcdCount1599 ;
   private short RcdFound1599 ;
   private short B6560ColAncUlI ;
   private short nBlankRcdUsr1599 ;
   private short s6560ColAncUlI ;
   private short A6561ColAncLI ;
   private short RcdFound1598 ;
   private short nIsDirty_1598 ;
   private short nIsDirty_1599 ;
   private short i6560ColAncUlI ;
   private short ZZ6559ColAncL ;
   private short ZZ6560ColAncUlI ;
   private short ZO6560ColAncUlI ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int wcpOA7272CliCod_d ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z7272CliCod_d ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int A7272CliCod_d ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtProcod_c_Enabled ;
   private int edtProDsc_c_Enabled ;
   private int edtCliCod_d_Enabled ;
   private int edtCliNom_D_Enabled ;
   private int edtForSerDsc_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtColAncL_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtColAncUlI_Enabled ;
   private int edtavnRcdDeleted_1599_Enabled ;
   private int edtColAncLI_Enabled ;
   private int edtColAncMmM_Enabled ;
   private int edtColAncMxM_Enabled ;
   private int edtColAncIc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtColAncLI_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtColAncUlI_Backcolor ;
   private int edtColAncL_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtForSerDsc_Backcolor ;
   private int edtCliNom_D_Backcolor ;
   private int edtCliCod_d_Backcolor ;
   private int edtProDsc_c_Backcolor ;
   private int edtProcod_c_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private int ZZ7272CliCod_d ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6562ColAncMmM ;
   private java.math.BigDecimal Z6563ColAncMxM ;
   private java.math.BigDecimal Z6564ColAncIc ;
   private java.math.BigDecimal A6562ColAncMmM ;
   private java.math.BigDecimal A6563ColAncMxM ;
   private java.math.BigDecimal A6564ColAncIc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA7270Procod_c ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z7270Procod_c ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7270Procod_c ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_95_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProcod_c_Internalname ;
   private String edtProcod_c_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProDsc_c_Internalname ;
   private String A7271ProDsc_c ;
   private String edtProDsc_c_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliCod_d_Internalname ;
   private String edtCliCod_d_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCliNom_D_Internalname ;
   private String A7273CliNom_D ;
   private String edtCliNom_D_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtForSerDsc_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtColAncL_Internalname ;
   private String edtColAncL_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtColAncUlI_Internalname ;
   private String edtColAncUlI_Jsonclick ;
   private String sMode1599 ;
   private String edtavnRcdDeleted_1599_Internalname ;
   private String edtColAncLI_Internalname ;
   private String edtColAncMmM_Internalname ;
   private String edtColAncMxM_Internalname ;
   private String edtColAncIc_Internalname ;
   private String GX_FocusControl ;
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
   private String sMode1598 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String Z5742ForSerDsc ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1599_Jsonclick ;
   private String edtColAncLI_Jsonclick ;
   private String edtColAncMmM_Jsonclick ;
   private String edtColAncMxM_Jsonclick ;
   private String edtColAncIc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z7271ProDsc_c ;
   private String Z7273CliNom_D ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ7270Procod_c ;
   private String ZZ7271ProDsc_c ;
   private String ZZ7273CliNom_D ;
   private String ZZ5742ForSerDsc ;
   private String ZZ279CliNom ;
   private String ZZ832TipColDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6560ColAncUlI ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean returnInSub ;
   private boolean n6562ColAncMmM ;
   private boolean n6563ColAncMxM ;
   private boolean n6564ColAncIc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01G66_A279CliNom ;
   private String[] T01G67_A832TipColDsc ;
   private boolean[] T01G67_n832TipColDsc ;
   private String[] T01G68_A5742ForSerDsc ;
   private boolean[] T01G68_n5742ForSerDsc ;
   private String[] T01G69_A396EmprCod ;
   private short[] T01G610_A6559ColAncL ;
   private String[] T01G610_A5742ForSerDsc ;
   private boolean[] T01G610_n5742ForSerDsc ;
   private String[] T01G610_A279CliNom ;
   private String[] T01G610_A832TipColDsc ;
   private boolean[] T01G610_n832TipColDsc ;
   private short[] T01G610_A6560ColAncUlI ;
   private boolean[] T01G610_n6560ColAncUlI ;
   private String[] T01G610_A396EmprCod ;
   private int[] T01G610_A252CliCod ;
   private byte[] T01G610_A831TipColCod ;
   private String[] T01G610_A494ForSer ;
   private String[] T01G610_A482ForColNom ;
   private int[] T01G610_A483ForColNum ;
   private String[] T01G610_A7270Procod_c ;
   private int[] T01G610_A7272CliCod_d ;
   private String[] T01G611_A396EmprCod ;
   private int[] T01G611_A252CliCod ;
   private String[] T01G611_A494ForSer ;
   private String[] T01G611_A482ForColNom ;
   private int[] T01G611_A483ForColNum ;
   private byte[] T01G611_A831TipColCod ;
   private String[] T01G611_A7270Procod_c ;
   private int[] T01G611_A7272CliCod_d ;
   private short[] T01G611_A6559ColAncL ;
   private short[] T01G65_A6559ColAncL ;
   private short[] T01G65_A6560ColAncUlI ;
   private boolean[] T01G65_n6560ColAncUlI ;
   private String[] T01G65_A396EmprCod ;
   private int[] T01G65_A252CliCod ;
   private byte[] T01G65_A831TipColCod ;
   private String[] T01G65_A494ForSer ;
   private String[] T01G65_A482ForColNom ;
   private int[] T01G65_A483ForColNum ;
   private String[] T01G65_A7270Procod_c ;
   private int[] T01G65_A7272CliCod_d ;
   private String[] T01G612_A396EmprCod ;
   private int[] T01G612_A252CliCod ;
   private String[] T01G612_A494ForSer ;
   private String[] T01G612_A482ForColNom ;
   private int[] T01G612_A483ForColNum ;
   private byte[] T01G612_A831TipColCod ;
   private String[] T01G612_A7270Procod_c ;
   private int[] T01G612_A7272CliCod_d ;
   private short[] T01G612_A6559ColAncL ;
   private String[] T01G613_A396EmprCod ;
   private int[] T01G613_A252CliCod ;
   private String[] T01G613_A494ForSer ;
   private String[] T01G613_A482ForColNom ;
   private int[] T01G613_A483ForColNum ;
   private byte[] T01G613_A831TipColCod ;
   private String[] T01G613_A7270Procod_c ;
   private int[] T01G613_A7272CliCod_d ;
   private short[] T01G613_A6559ColAncL ;
   private short[] T01G64_A6559ColAncL ;
   private short[] T01G64_A6560ColAncUlI ;
   private boolean[] T01G64_n6560ColAncUlI ;
   private String[] T01G64_A396EmprCod ;
   private int[] T01G64_A252CliCod ;
   private byte[] T01G64_A831TipColCod ;
   private String[] T01G64_A494ForSer ;
   private String[] T01G64_A482ForColNom ;
   private int[] T01G64_A483ForColNum ;
   private String[] T01G64_A7270Procod_c ;
   private int[] T01G64_A7272CliCod_d ;
   private String[] T01G618_A396EmprCod ;
   private int[] T01G618_A252CliCod ;
   private String[] T01G618_A494ForSer ;
   private String[] T01G618_A482ForColNom ;
   private int[] T01G618_A483ForColNum ;
   private byte[] T01G618_A831TipColCod ;
   private String[] T01G618_A7270Procod_c ;
   private int[] T01G618_A7272CliCod_d ;
   private short[] T01G618_A6559ColAncL ;
   private String[] T01G619_A494ForSer ;
   private String[] T01G619_A482ForColNom ;
   private int[] T01G619_A483ForColNum ;
   private byte[] T01G619_A831TipColCod ;
   private String[] T01G619_A7270Procod_c ;
   private int[] T01G619_A7272CliCod_d ;
   private short[] T01G619_A6559ColAncL ;
   private short[] T01G619_A6561ColAncLI ;
   private java.math.BigDecimal[] T01G619_A6562ColAncMmM ;
   private boolean[] T01G619_n6562ColAncMmM ;
   private java.math.BigDecimal[] T01G619_A6563ColAncMxM ;
   private boolean[] T01G619_n6563ColAncMxM ;
   private java.math.BigDecimal[] T01G619_A6564ColAncIc ;
   private boolean[] T01G619_n6564ColAncIc ;
   private String[] T01G619_A396EmprCod ;
   private int[] T01G619_A252CliCod ;
   private String[] T01G620_A396EmprCod ;
   private int[] T01G620_A252CliCod ;
   private String[] T01G620_A494ForSer ;
   private String[] T01G620_A482ForColNom ;
   private int[] T01G620_A483ForColNum ;
   private byte[] T01G620_A831TipColCod ;
   private String[] T01G620_A7270Procod_c ;
   private int[] T01G620_A7272CliCod_d ;
   private short[] T01G620_A6559ColAncL ;
   private short[] T01G620_A6561ColAncLI ;
   private String[] T01G63_A494ForSer ;
   private String[] T01G63_A482ForColNom ;
   private int[] T01G63_A483ForColNum ;
   private byte[] T01G63_A831TipColCod ;
   private String[] T01G63_A7270Procod_c ;
   private int[] T01G63_A7272CliCod_d ;
   private short[] T01G63_A6559ColAncL ;
   private short[] T01G63_A6561ColAncLI ;
   private java.math.BigDecimal[] T01G63_A6562ColAncMmM ;
   private boolean[] T01G63_n6562ColAncMmM ;
   private java.math.BigDecimal[] T01G63_A6563ColAncMxM ;
   private boolean[] T01G63_n6563ColAncMxM ;
   private java.math.BigDecimal[] T01G63_A6564ColAncIc ;
   private boolean[] T01G63_n6564ColAncIc ;
   private String[] T01G63_A396EmprCod ;
   private int[] T01G63_A252CliCod ;
   private String[] T01G62_A494ForSer ;
   private String[] T01G62_A482ForColNom ;
   private int[] T01G62_A483ForColNum ;
   private byte[] T01G62_A831TipColCod ;
   private String[] T01G62_A7270Procod_c ;
   private int[] T01G62_A7272CliCod_d ;
   private short[] T01G62_A6559ColAncL ;
   private short[] T01G62_A6561ColAncLI ;
   private java.math.BigDecimal[] T01G62_A6562ColAncMmM ;
   private boolean[] T01G62_n6562ColAncMmM ;
   private java.math.BigDecimal[] T01G62_A6563ColAncMxM ;
   private boolean[] T01G62_n6563ColAncMxM ;
   private java.math.BigDecimal[] T01G62_A6564ColAncIc ;
   private boolean[] T01G62_n6564ColAncIc ;
   private String[] T01G62_A396EmprCod ;
   private int[] T01G62_A252CliCod ;
   private String[] T01G624_A396EmprCod ;
   private int[] T01G624_A252CliCod ;
   private String[] T01G624_A494ForSer ;
   private String[] T01G624_A482ForColNom ;
   private int[] T01G624_A483ForColNum ;
   private byte[] T01G624_A831TipColCod ;
   private String[] T01G624_A7270Procod_c ;
   private int[] T01G624_A7272CliCod_d ;
   private short[] T01G624_A6559ColAncL ;
   private short[] T01G624_A6561ColAncLI ;
   private String[] T01G625_A279CliNom ;
   private String[] T01G626_A832TipColDsc ;
   private boolean[] T01G626_n832TipColDsc ;
   private String[] T01G627_A5742ForSerDsc ;
   private boolean[] T01G627_n5742ForSerDsc ;
   private String[] T01G628_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpcolac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G62", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI, ColAncMmM, ColAncMxM, ColAncIc, EmprCod, CliCod FROM TXPPCOLa3 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? AND ColAncLI = ?  FOR UPDATE OF ColAncMmM, ColAncMxM, ColAncIc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G63", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI, ColAncMmM, ColAncMxM, ColAncIc, EmprCod, CliCod FROM TXPPCOLa3 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? AND ColAncLI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G64", "SELECT ColAncL, ColAncUlI, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, Procod_c, CliCod_d FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?  FOR UPDATE OF ColAncUlI NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G65", "SELECT ColAncL, ColAncUlI, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, Procod_c, CliCod_d FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G66", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G67", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G68", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G69", "SELECT EmprCod FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G610", "SELECT /*+ FIRST_ROWS(1) */ TM1.ColAncL, T4.ForSerDsc, T2.CliNom, T3.TipColDsc, TM1.ColAncUlI, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.Procod_c, TM1.CliCod_d FROM (((TXPPCOLac TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipColCod = TM1.TipColCod) INNER JOIN TXPCFORMU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ForSer = TM1.ForSer AND T4.ForColNom = TM1.ForColNom AND T4.ForColNum = TM1.ForColNum AND T4.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.Procod_c = ? and TM1.CliCod_d = ? and TM1.ColAncL = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.Procod_c, TM1.CliCod_d, TM1.ColAncL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G611", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G612", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G613", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, Procod_c DESC, CliCod_d DESC, ColAncL DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G614", "INSERT INTO TXPPCOLac(ColAncL, ColAncUlI, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, Procod_c, CliCod_d, ColAncMn, ColAncMx, ColAncPrK, ColAncPrM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK, "TXPPCOLac")
         ,new UpdateCursor("T01G615", "UPDATE TXPPCOLac SET ColAncUlI=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?", GX_NOMASK, "TXPPCOLac")
         ,new UpdateCursor("T01G616", "DELETE FROM TXPPCOLac  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?", GX_NOMASK, "TXPPCOLac")
         ,new UpdateCursor("T01G617", "UPDATE TXPPCOLac SET ColAncUlI=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?", GX_NOMASK, "TXPPCOLac")
         ,new ForEachCursor("T01G618", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G619", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI, ColAncMmM, ColAncMxM, ColAncIc, EmprCod, CliCod FROM TXPPCOLa3 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? and ColAncLI = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G620", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI FROM TXPPCOLa3 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? AND ColAncLI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01G621", "INSERT INTO TXPPCOLa3(ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI, ColAncMmM, ColAncMxM, ColAncIc, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPCOLa3")
         ,new UpdateCursor("T01G622", "UPDATE TXPPCOLa3 SET ColAncMmM=?, ColAncMxM=?, ColAncIc=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? AND ColAncLI = ?", GX_NOMASK, "TXPPCOLa3")
         ,new UpdateCursor("T01G623", "DELETE FROM TXPPCOLa3  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? AND ColAncLI = ?", GX_NOMASK, "TXPPCOLa3")
         ,new ForEachCursor("T01G624", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI FROM TXPPCOLa3 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G625", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G626", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G627", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G628", "SELECT EmprCod FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 13);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setString(9, (String)parms[9], 8);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setString(12, (String)parms[14], 3);
               stmt.setInt(13, ((Number) parms[15]).intValue());
               return;
            case 20 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 13);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 8);
               stmt.setInt(11, ((Number) parms[13]).intValue());
               stmt.setShort(12, ((Number) parms[14]).shortValue());
               stmt.setShort(13, ((Number) parms[15]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
      }
   }

}

