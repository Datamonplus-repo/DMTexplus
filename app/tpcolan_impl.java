package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpcolan_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1G71598( ) ;
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
         gx1asaclinom_d1G71600( A396EmprCod, A7272CliCod_d) ;
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
         gx2asaprodsc_c1G71600( A396EmprCod, A7270Procod_c) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED", ""), (short)(0)) ;
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
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
      A6565ColAncUL = (short)(GXutil.lval( httpContext.GetPar( "ColAncUL"))) ;
      n6565ColAncUL = false ;
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

   public tpcolan_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpcolan_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpcolan_impl.class ));
   }

   public tpcolan_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPCOLan.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcod_c_Internalname, GXutil.rtrim( A7270Procod_c), GXutil.rtrim( localUtil.format( A7270Procod_c, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcod_c_Jsonclick, 0, "", "", "", "", "", 1, edtProcod_c_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_c_Internalname, GXutil.rtrim( A7271ProDsc_c), GXutil.rtrim( localUtil.format( A7271ProDsc_c, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_c_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_c_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_d_Internalname, GXutil.ltrim( localUtil.ntoc( A7272CliCod_d, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_d_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7272CliCod_d), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7272CliCod_d), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_d_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_d_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "CliNom D", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_D_Internalname, GXutil.rtrim( A7273CliNom_D), GXutil.rtrim( localUtil.format( A7273CliNom_D, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_D_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_D_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Ultimo Numero Linea", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColAncUL_Internalname, GXutil.ltrim( localUtil.ntoc( A6565ColAncUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColAncUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6565ColAncUL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6565ColAncUL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColAncUL_Jsonclick, 0, "", "", "", "", "", 1, edtColAncUL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCOLan.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol90( ) ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1598 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1598 = (short)(1) ;
            scanStart1G71598( ) ;
            while ( RcdFound1598 != 0 )
            {
               init_level_properties1598( ) ;
               getByPrimaryKey1G71598( ) ;
               addRow1G71598( ) ;
               scanNext1G71598( ) ;
            }
            scanEnd1G71598( ) ;
            nBlankRcdCount1598 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6565ColAncUL = A6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         standaloneNotModal1G71598( ) ;
         standaloneModal1G71598( ) ;
         sMode1598 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRow1G71598( ) ;
            edtavnRcdDeleted_1598_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1598_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1598_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1598_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtColAncL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCL_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtColAncMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMn_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtColAncMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMX_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMx_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtColAncPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCPRK_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncPrK_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtColAncPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCPRM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColAncPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncPrM_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_1598 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1G71598( ) ;
            }
            sendRow1G71598( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6565ColAncUL = B6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1598 = (short)(5) ;
         nRcdExists_1598 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1G71598( ) ;
            while ( RcdFound1598 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_901598( ) ;
               init_level_properties1598( ) ;
               standaloneNotModal1G71598( ) ;
               getByPrimaryKey1G71598( ) ;
               standaloneModal1G71598( ) ;
               addRow1G71598( ) ;
               scanNext1G71598( ) ;
            }
            scanEnd1G71598( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1598 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_901598( ) ;
      initAll1G71598( ) ;
      init_level_properties1598( ) ;
      B6565ColAncUL = A6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      nRcdExists_1598 = (short)(0) ;
      nIsMod_1598 = (short)(0) ;
      nRcdDeleted_1598 = (short)(0) ;
      nBlankRcdCount1598 = (short)(nBlankRcdUsr1598+nBlankRcdCount1598) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1598 > 0 )
      {
         standaloneNotModal1G71598( ) ;
         standaloneModal1G71598( ) ;
         addRow1G71598( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtColAncL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1598 = (short)(nBlankRcdCount1598-1) ;
      }
      Gx_mode = sMode1598 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6565ColAncUL = B6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCOLan.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPCOLan.htm");
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
      e111G72 ();
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
            Z6565ColAncUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z6565ColAncUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6565ColAncUL = (short)(localUtil.ctol( httpContext.cgiGet( "O6565ColAncUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A6565ColAncUL = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6565ColAncUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
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
                     if ( GXutil.strcmp(sEvt, "'INCREMENTOS P/MTS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Incrementos p/Mts' */
                        e121G72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111G72 ();
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
            initAll1G71600( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1598_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1598_Enabled), 5, 0), !bGXsfl_90_Refreshing);
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
      disableAttributes1G71600( ) ;
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

   public void confirm_1G70( )
   {
      beforeValidate1G71600( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G71600( ) ;
         }
         else
         {
            checkExtendedTable1G71600( ) ;
            if ( AnyError == 0 )
            {
               zm1G71600( 10) ;
               zm1G71600( 11) ;
               zm1G71600( 12) ;
            }
            closeExtendedTableCursors1G71600( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1600 = Gx_mode ;
         confirm_1G71598( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1600 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1600 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1G70( ) ;
      }
   }

   public void confirm_1G71598( )
   {
      s6565ColAncUL = O6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1G71598( ) ;
         if ( ( nRcdExists_1598 != 0 ) || ( nIsMod_1598 != 0 ) )
         {
            getKey1G71598( ) ;
            if ( ( nRcdExists_1598 == 0 ) && ( nRcdDeleted_1598 == 0 ) )
            {
               if ( RcdFound1598 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1G71598( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1G71598( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1G71598( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6565ColAncUL = A6565ColAncUL ;
                     n6565ColAncUL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "COLANCL_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtColAncL_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1598 != 0 )
               {
                  if ( nRcdDeleted_1598 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1G71598( ) ;
                     load1G71598( ) ;
                     beforeValidate1G71598( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1G71598( ) ;
                        O6565ColAncUL = A6565ColAncUL ;
                        n6565ColAncUL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1598 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1G71598( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1G71598( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1G71598( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6565ColAncUL = A6565ColAncUL ;
                           n6565ColAncUL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1598 == 0 )
                  {
                     GXCCtl = "COLANCL_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColAncL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1598_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncL_Internalname, GXutil.ltrim( localUtil.ntoc( A6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMn_Internalname, GXutil.ltrim( localUtil.ntoc( A6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMx_Internalname, GXutil.ltrim( localUtil.ntoc( A6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6559ColAncL_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6566ColAncMn_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6567ColAncMx_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6568ColAncPrK_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6569ColAncPrM_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1598 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1598_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1598_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCL_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMX_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCPRK_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCPRM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6565ColAncUL = s6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1G70( )
   {
   }

   public void e111G72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV14Lit2 = httpContext.getMessage( "Processo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcolan_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 + " " + httpContext.getMessage( "Destino", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpcolan_impl.this.A396EmprCod = GXv_char2[0] ;
      tpcolan_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpcolan_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121G72( )
   {
      /* 'Incrementos p/Mts' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tpcolac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6559ColAncL,4,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d","ColAncL"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm1G71600( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6565ColAncUL = T01G75_A6565ColAncUL[0] ;
         }
         else
         {
            Z6565ColAncUL = A6565ColAncUL ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         Z6565ColAncUL = A6565ColAncUL ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
         Z5742ForSerDsc = A5742ForSerDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtColAncUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUL_Enabled), 5, 0), true);
      AV33Pgmname = "TPCOLan" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtColAncUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUL_Enabled), 5, 0), true);
      /* Using cursor T01G76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01G76_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T01G77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01G77_A832TipColDsc[0] ;
      n832TipColDsc = T01G77_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(5);
      /* Using cursor T01G78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T01G78_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T01G78_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      pr_default.close(6);
      GXt_char1 = A7271ProDsc_c ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7270Procod_c, GXv_char4) ;
      tpcolan_impl.this.GXt_char1 = GXv_char4[0] ;
      A7271ProDsc_c = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7271ProDsc_c", A7271ProDsc_c);
      GXt_char1 = A7273CliNom_D ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7272CliCod_d, GXv_char4) ;
      tpcolan_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void load1G71600( )
   {
      /* Using cursor T01G79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1600 = (short)(1) ;
         A5742ForSerDsc = T01G79_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01G79_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A279CliNom = T01G79_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A832TipColDsc = T01G79_A832TipColDsc[0] ;
         n832TipColDsc = T01G79_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A6565ColAncUL = T01G79_A6565ColAncUL[0] ;
         n6565ColAncUL = T01G79_n6565ColAncUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         zm1G71600( -9) ;
      }
      pr_default.close(7);
      onLoadActions1G71600( ) ;
   }

   public void onLoadActions1G71600( )
   {
   }

   public void checkExtendedTable1G71600( )
   {
      nIsDirty_1600 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1G71600( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1G71600( )
   {
      /* Using cursor T01G710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1600 = (short)(1) ;
      }
      else
      {
         RcdFound1600 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01G75_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G75_A7272CliCod_d[0] == A7272CliCod_d ) && ( GXutil.strcmp(T01G75_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G75_A252CliCod[0] == A252CliCod ) && ( T01G75_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G75_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G75_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G75_A483ForColNum[0] == A483ForColNum ) )
      {
         zm1G71600( 9) ;
         RcdFound1600 = (short)(1) ;
         A6565ColAncUL = T01G75_A6565ColAncUL[0] ;
         n6565ColAncUL = T01G75_n6565ColAncUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         O6565ColAncUL = A6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7270Procod_c = A7270Procod_c ;
         Z7272CliCod_d = A7272CliCod_d ;
         sMode1600 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G71600( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1600 = (short)(0) ;
            initializeNonKey1G71600( ) ;
         }
         Gx_mode = sMode1600 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1600 = (short)(0) ;
         initializeNonKey1G71600( ) ;
         sMode1600 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1600 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1G71600( ) ;
      if ( RcdFound1600 == 0 )
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
      RcdFound1600 = (short)(0) ;
      /* Using cursor T01G711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01G711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G711_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G711_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G711_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G711_A483ForColNum[0] == A483ForColNum ) && ( T01G711_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G711_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G711_A7272CliCod_d[0] == A7272CliCod_d ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01G711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G711_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G711_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G711_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G711_A483ForColNum[0] == A483ForColNum ) && ( T01G711_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G711_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G711_A7272CliCod_d[0] == A7272CliCod_d ) )
         {
            RcdFound1600 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1600 = (short)(0) ;
      /* Using cursor T01G712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01G712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G712_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G712_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G712_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G712_A483ForColNum[0] == A483ForColNum ) && ( T01G712_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G712_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G712_A7272CliCod_d[0] == A7272CliCod_d ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01G712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G712_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G712_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G712_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G712_A483ForColNum[0] == A483ForColNum ) && ( T01G712_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G712_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G712_A7272CliCod_d[0] == A7272CliCod_d ) )
         {
            RcdFound1600 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G71600( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6565ColAncUL = O6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         insert1G71600( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1600 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6565ColAncUL = O6565ColAncUL ;
               n6565ColAncUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6565ColAncUL = O6565ColAncUL ;
               n6565ColAncUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
               update1G71600( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6565ColAncUL = O6565ColAncUL ;
               n6565ColAncUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
               insert1G71600( ) ;
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
                  A6565ColAncUL = O6565ColAncUL ;
                  n6565ColAncUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
                  insert1G71600( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6565ColAncUL = O6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
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
      getKey1G71600( ) ;
      if ( RcdFound1600 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A7270Procod_c, Z7270Procod_c) != 0 ) || ( A7272CliCod_d != Z7272CliCod_d ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcolan");
   }

   public void insert_check( )
   {
      confirm_1G70( ) ;
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
      if ( RcdFound1600 == 0 )
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
      scanStart1G71600( ) ;
      if ( RcdFound1600 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G71600( ) ;
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
      if ( RcdFound1600 == 0 )
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
      if ( RcdFound1600 == 0 )
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
      scanStart1G71600( ) ;
      if ( RcdFound1600 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1600 != 0 )
         {
            scanNext1G71600( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1G71600( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G71600( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOPCD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z6565ColAncUL != T01G74_A6565ColAncUL[0] ) )
         {
            if ( Z6565ColAncUL != T01G74_A6565ColAncUL[0] )
            {
               GXutil.writeLogln("tpcolan:[seudo value changed for attri]"+"ColAncUL");
               GXutil.writeLogRaw("Old: ",Z6565ColAncUL);
               GXutil.writeLogRaw("Current: ",T01G74_A6565ColAncUL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCOPCD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G71600( )
   {
      beforeValidate1G71600( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G71600( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G71600( 0) ;
         checkOptimisticConcurrency1G71600( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G71600( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G71600( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G713 */
                  pr_default.execute(11, new Object[] {A7270Procod_c, Integer.valueOf(A7272CliCod_d), Boolean.valueOf(n6565ColAncUL), Short.valueOf(A6565ColAncUL), A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOPCD");
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
                        processLevel1G71600( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1G70( ) ;
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
            load1G71600( ) ;
         }
         endLevel1G71600( ) ;
      }
      closeExtendedTableCursors1G71600( ) ;
   }

   public void update1G71600( )
   {
      beforeValidate1G71600( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G71600( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G71600( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G71600( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G71600( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G714 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n6565ColAncUL), Short.valueOf(A6565ColAncUL), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOPCD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOPCD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G71600( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G71600( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1G70( ) ;
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
         endLevel1G71600( ) ;
      }
      closeExtendedTableCursors1G71600( ) ;
   }

   public void deferredUpdate1G71600( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G71600( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G71600( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G71600( ) ;
         afterConfirm1G71600( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G71600( ) ;
            if ( AnyError == 0 )
            {
               A6565ColAncUL = O6565ColAncUL ;
               n6565ColAncUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
               scanStart1G71598( ) ;
               while ( RcdFound1598 != 0 )
               {
                  getByPrimaryKey1G71598( ) ;
                  delete1G71598( ) ;
                  scanNext1G71598( ) ;
                  O6565ColAncUL = A6565ColAncUL ;
                  n6565ColAncUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
               }
               scanEnd1G71598( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G715 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOPCD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1600 == 0 )
                        {
                           initAll1G71600( ) ;
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
                        resetCaption1G70( ) ;
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
      sMode1600 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G71600( ) ;
      Gx_mode = sMode1600 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G71600( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01G716 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLa3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1G71598( )
   {
      s6565ColAncUL = O6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1G71598( ) ;
         if ( ( nRcdExists_1598 != 0 ) || ( nIsMod_1598 != 0 ) )
         {
            standaloneNotModal1G71598( ) ;
            getKey1G71598( ) ;
            if ( ( nRcdExists_1598 == 0 ) && ( nRcdDeleted_1598 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1G71598( ) ;
            }
            else
            {
               if ( RcdFound1598 != 0 )
               {
                  if ( ( nRcdDeleted_1598 != 0 ) && ( nRcdExists_1598 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1G71598( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1598 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1G71598( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1598 == 0 )
                  {
                     GXCCtl = "COLANCL_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColAncL_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6565ColAncUL = A6565ColAncUL ;
            n6565ColAncUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1598_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncL_Internalname, GXutil.ltrim( localUtil.ntoc( A6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMn_Internalname, GXutil.ltrim( localUtil.ntoc( A6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncMx_Internalname, GXutil.ltrim( localUtil.ntoc( A6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColAncPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6559ColAncL_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6566ColAncMn_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6567ColAncMx_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6568ColAncPrK_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6569ColAncPrM_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1598_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1598 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1598_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1598_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCL_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCMX_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCPRK_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLANCPRM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1G71598( ) ;
      if ( AnyError != 0 )
      {
         O6565ColAncUL = s6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      }
      nRcdExists_1598 = (short)(0) ;
      nIsMod_1598 = (short)(0) ;
      nRcdDeleted_1598 = (short)(0) ;
   }

   public void processLevel1G71600( )
   {
      /* Save parent mode. */
      sMode1600 = Gx_mode ;
      processNestedLevel1G71598( ) ;
      if ( AnyError != 0 )
      {
         O6565ColAncUL = s6565ColAncUL ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1600 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01G717 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n6565ColAncUL), Short.valueOf(A6565ColAncUL), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOPCD");
   }

   public void endLevel1G71600( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1G71600( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpcolan");
         if ( AnyError == 0 )
         {
            confirmValues1G70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcolan");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G71600( )
   {
      /* Scan By routine */
      /* Using cursor T01G718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      RcdFound1600 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1600 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G71600( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1600 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1600 = (short)(1) ;
      }
   }

   public void scanEnd1G71600( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1G71600( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G71600( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G71600( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G71600( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G71600( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G71600( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G71600( )
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
      edtColAncUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUL_Enabled), 5, 0), true);
   }

   public void zm1G71598( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6566ColAncMn = T01G73_A6566ColAncMn[0] ;
            Z6567ColAncMx = T01G73_A6567ColAncMx[0] ;
            Z6568ColAncPrK = T01G73_A6568ColAncPrK[0] ;
            Z6569ColAncPrM = T01G73_A6569ColAncPrM[0] ;
         }
         else
         {
            Z6566ColAncMn = A6566ColAncMn ;
            Z6567ColAncMx = A6567ColAncMx ;
            Z6568ColAncPrK = A6568ColAncPrK ;
            Z6569ColAncPrM = A6569ColAncPrM ;
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
         Z6566ColAncMn = A6566ColAncMn ;
         Z6567ColAncMx = A6567ColAncMx ;
         Z6568ColAncPrK = A6568ColAncPrK ;
         Z6569ColAncPrM = A6569ColAncPrM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1G71598( )
   {
      edtColAncUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUL_Enabled), 5, 0), true);
      edtColAncUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncUL_Enabled), 5, 0), true);
   }

   public void standaloneModal1G71598( )
   {
      if ( isIns( )  )
      {
         A6565ColAncUL = (short)(O6565ColAncUL+1) ;
         n6565ColAncUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6559ColAncL = A6565ColAncUL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtColAncL_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtColAncL_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void load1G71598( )
   {
      /* Using cursor T01G719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1598 = (short)(1) ;
         A6566ColAncMn = T01G719_A6566ColAncMn[0] ;
         n6566ColAncMn = T01G719_n6566ColAncMn[0] ;
         A6567ColAncMx = T01G719_A6567ColAncMx[0] ;
         n6567ColAncMx = T01G719_n6567ColAncMx[0] ;
         A6568ColAncPrK = T01G719_A6568ColAncPrK[0] ;
         n6568ColAncPrK = T01G719_n6568ColAncPrK[0] ;
         A6569ColAncPrM = T01G719_A6569ColAncPrM[0] ;
         n6569ColAncPrM = T01G719_n6569ColAncPrM[0] ;
         zm1G71598( -13) ;
      }
      pr_default.close(17);
      onLoadActions1G71598( ) ;
   }

   public void onLoadActions1G71598( )
   {
   }

   public void checkExtendedTable1G71598( )
   {
      nIsDirty_1598 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1G71598( ) ;
   }

   public void closeExtendedTableCursors1G71598( )
   {
   }

   public void enableDisable1G71598( )
   {
   }

   public void getKey1G71598( )
   {
      /* Using cursor T01G720 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1598 = (short)(1) ;
      }
      else
      {
         RcdFound1598 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1G71598( )
   {
      /* Using cursor T01G73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G73_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01G73_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01G73_A483ForColNum[0] == A483ForColNum ) && ( T01G73_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01G73_A7270Procod_c[0], A7270Procod_c) == 0 ) && ( T01G73_A7272CliCod_d[0] == A7272CliCod_d ) && ( GXutil.strcmp(T01G73_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01G73_A252CliCod[0] == A252CliCod ) )
      {
         zm1G71598( 13) ;
         RcdFound1598 = (short)(1) ;
         initializeNonKey1G71598( ) ;
         A6559ColAncL = T01G73_A6559ColAncL[0] ;
         A6566ColAncMn = T01G73_A6566ColAncMn[0] ;
         n6566ColAncMn = T01G73_n6566ColAncMn[0] ;
         A6567ColAncMx = T01G73_A6567ColAncMx[0] ;
         n6567ColAncMx = T01G73_n6567ColAncMx[0] ;
         A6568ColAncPrK = T01G73_A6568ColAncPrK[0] ;
         n6568ColAncPrK = T01G73_n6568ColAncPrK[0] ;
         A6569ColAncPrM = T01G73_A6569ColAncPrM[0] ;
         n6569ColAncPrM = T01G73_n6569ColAncPrM[0] ;
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
         standaloneModal1G71598( ) ;
         load1G71598( ) ;
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1598 = (short)(0) ;
         initializeNonKey1G71598( ) ;
         sMode1598 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G71598( ) ;
         Gx_mode = sMode1598 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1G71598( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1G71598( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLac"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6566ColAncMn != T01G72_A6566ColAncMn[0] ) || ( Z6567ColAncMx != T01G72_A6567ColAncMx[0] ) || ( DecimalUtil.compareTo(Z6568ColAncPrK, T01G72_A6568ColAncPrK[0]) != 0 ) || ( DecimalUtil.compareTo(Z6569ColAncPrM, T01G72_A6569ColAncPrM[0]) != 0 ) )
         {
            if ( Z6566ColAncMn != T01G72_A6566ColAncMn[0] )
            {
               GXutil.writeLogln("tpcolan:[seudo value changed for attri]"+"ColAncMn");
               GXutil.writeLogRaw("Old: ",Z6566ColAncMn);
               GXutil.writeLogRaw("Current: ",T01G72_A6566ColAncMn[0]);
            }
            if ( Z6567ColAncMx != T01G72_A6567ColAncMx[0] )
            {
               GXutil.writeLogln("tpcolan:[seudo value changed for attri]"+"ColAncMx");
               GXutil.writeLogRaw("Old: ",Z6567ColAncMx);
               GXutil.writeLogRaw("Current: ",T01G72_A6567ColAncMx[0]);
            }
            if ( DecimalUtil.compareTo(Z6568ColAncPrK, T01G72_A6568ColAncPrK[0]) != 0 )
            {
               GXutil.writeLogln("tpcolan:[seudo value changed for attri]"+"ColAncPrK");
               GXutil.writeLogRaw("Old: ",Z6568ColAncPrK);
               GXutil.writeLogRaw("Current: ",T01G72_A6568ColAncPrK[0]);
            }
            if ( DecimalUtil.compareTo(Z6569ColAncPrM, T01G72_A6569ColAncPrM[0]) != 0 )
            {
               GXutil.writeLogln("tpcolan:[seudo value changed for attri]"+"ColAncPrM");
               GXutil.writeLogRaw("Old: ",Z6569ColAncPrM);
               GXutil.writeLogRaw("Current: ",T01G72_A6569ColAncPrM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCOLac"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G71598( )
   {
      beforeValidate1G71598( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G71598( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G71598( 0) ;
         checkOptimisticConcurrency1G71598( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G71598( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G71598( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G721 */
                  pr_default.execute(19, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL), Boolean.valueOf(n6566ColAncMn), Short.valueOf(A6566ColAncMn), Boolean.valueOf(n6567ColAncMx), Short.valueOf(A6567ColAncMx), Boolean.valueOf(n6568ColAncPrK), A6568ColAncPrK, Boolean.valueOf(n6569ColAncPrM), A6569ColAncPrM, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        httpContext.wjLoc = formatLink("app.tpcolac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6559ColAncL,4,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d","ColAncL"})  ;
                     }
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
            load1G71598( ) ;
         }
         endLevel1G71598( ) ;
      }
      closeExtendedTableCursors1G71598( ) ;
   }

   public void update1G71598( )
   {
      beforeValidate1G71598( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G71598( ) ;
      }
      if ( ( nIsMod_1598 != 0 ) || ( nIsDirty_1598 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1G71598( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1G71598( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1G71598( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01G722 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n6566ColAncMn), Short.valueOf(A6566ColAncMn), Boolean.valueOf(n6567ColAncMx), Short.valueOf(A6567ColAncMx), Boolean.valueOf(n6568ColAncPrK), A6568ColAncPrK, Boolean.valueOf(n6569ColAncPrM), A6569ColAncPrM, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCOLac"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1G71598( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1G71598( ) ;
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
            endLevel1G71598( ) ;
         }
      }
      closeExtendedTableCursors1G71598( ) ;
   }

   public void deferredUpdate1G71598( )
   {
   }

   public void delete1G71598( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G71598( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G71598( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G71598( ) ;
         afterConfirm1G71598( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G71598( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G723 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCOLac");
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
      sMode1598 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G71598( ) ;
      Gx_mode = sMode1598 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G71598( )
   {
      standaloneModal1G71598( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01G724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d), Short.valueOf(A6559ColAncL)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLa3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void endLevel1G71598( )
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

   public void scanStart1G71598( )
   {
      /* Scan By routine */
      /* Using cursor T01G725 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A7270Procod_c, Integer.valueOf(A7272CliCod_d)});
      RcdFound1598 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1598 = (short)(1) ;
         A6559ColAncL = T01G725_A6559ColAncL[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G71598( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1598 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1598 = (short)(1) ;
         A6559ColAncL = T01G725_A6559ColAncL[0] ;
      }
   }

   public void scanEnd1G71598( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1G71598( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G71598( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G71598( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G71598( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G71598( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G71598( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G71598( )
   {
      edtColAncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtColAncMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMn_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtColAncMx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncMx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncMx_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtColAncPrK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncPrK_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtColAncPrM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncPrM_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void send_integrity_lvl_hashes1G71598( )
   {
   }

   public void send_integrity_lvl_hashes1G71600( )
   {
   }

   public void subsflControlProps_901598( )
   {
      edtavnRcdDeleted_1598_Internalname = "vNRCDDELETED_1598_"+sGXsfl_90_idx ;
      edtColAncL_Internalname = "COLANCL_"+sGXsfl_90_idx ;
      edtColAncMn_Internalname = "COLANCMN_"+sGXsfl_90_idx ;
      edtColAncMx_Internalname = "COLANCMX_"+sGXsfl_90_idx ;
      edtColAncPrK_Internalname = "COLANCPRK_"+sGXsfl_90_idx ;
      edtColAncPrM_Internalname = "COLANCPRM_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_901598( )
   {
      edtavnRcdDeleted_1598_Internalname = "vNRCDDELETED_1598_"+sGXsfl_90_fel_idx ;
      edtColAncL_Internalname = "COLANCL_"+sGXsfl_90_fel_idx ;
      edtColAncMn_Internalname = "COLANCMN_"+sGXsfl_90_fel_idx ;
      edtColAncMx_Internalname = "COLANCMX_"+sGXsfl_90_fel_idx ;
      edtColAncPrK_Internalname = "COLANCPRK_"+sGXsfl_90_fel_idx ;
      edtColAncPrM_Internalname = "COLANCPRM_"+sGXsfl_90_fel_idx ;
   }

   public void addRow1G71598( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901598( ) ;
      sendRow1G71598( ) ;
   }

   public void sendRow1G71598( )
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
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1598_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1598_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1598), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1598), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1598_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1598_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncL_Internalname,GXutil.ltrim( localUtil.ntoc( A6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6559ColAncL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncL_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncMn_Internalname,GXutil.ltrim( localUtil.ntoc( A6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncMn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6566ColAncMn), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6566ColAncMn), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncMn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncMx_Internalname,GXutil.ltrim( localUtil.ntoc( A6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncMx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6567ColAncMx), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6567ColAncMx), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncMx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncMx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncPrK_Internalname,GXutil.ltrim( localUtil.ntoc( A6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncPrK_Enabled!=0) ? localUtil.format( A6568ColAncPrK, "ZZZZZ9.99999") : localUtil.format( A6568ColAncPrK, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncPrK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncPrK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1598_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColAncPrM_Internalname,GXutil.ltrim( localUtil.ntoc( A6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColAncPrM_Enabled!=0) ? localUtil.format( A6569ColAncPrM, "ZZZZZ9.99999") : localUtil.format( A6569ColAncPrM, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColAncPrM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColAncPrM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1G71598( ) ;
      GXCCtl = "Z6559ColAncL_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6559ColAncL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6566ColAncMn_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6566ColAncMn, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6567ColAncMx_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6567ColAncMx, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6568ColAncPrK_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6568ColAncPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6569ColAncPrM_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6569ColAncPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1598_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1598_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1598_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1598, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1598_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1598_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCL_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCMN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCMX_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCPRK_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLANCPRM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1G71598( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901598( ) ;
      edtavnRcdDeleted_1598_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1598_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCL_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncMn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncMx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCMX_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCPRK_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColAncPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLANCPRM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1598_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1598_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1598");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1598_Internalname ;
         wbErr = true ;
         nRcdDeleted_1598 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1598 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1598_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColAncL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColAncL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COLANCL_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncL_Internalname ;
         wbErr = true ;
         A6559ColAncL = (short)(0) ;
      }
      else
      {
         A6559ColAncL = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColAncMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColAncMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "COLANCMN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncMn_Internalname ;
         wbErr = true ;
         A6566ColAncMn = (short)(0) ;
         n6566ColAncMn = false ;
      }
      else
      {
         A6566ColAncMn = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6566ColAncMn = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColAncMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColAncMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "COLANCMX_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncMx_Internalname ;
         wbErr = true ;
         A6567ColAncMx = (short)(0) ;
         n6567ColAncMx = false ;
      }
      else
      {
         A6567ColAncMx = (short)(localUtil.ctol( httpContext.cgiGet( edtColAncMx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6567ColAncMx = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColAncPrK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColAncPrK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "COLANCPRK_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncPrK_Internalname ;
         wbErr = true ;
         A6568ColAncPrK = DecimalUtil.ZERO ;
         n6568ColAncPrK = false ;
      }
      else
      {
         A6568ColAncPrK = localUtil.ctond( httpContext.cgiGet( edtColAncPrK_Internalname)) ;
         n6568ColAncPrK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColAncPrM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColAncPrM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "COLANCPRM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColAncPrM_Internalname ;
         wbErr = true ;
         A6569ColAncPrM = DecimalUtil.ZERO ;
         n6569ColAncPrM = false ;
      }
      else
      {
         A6569ColAncPrM = localUtil.ctond( httpContext.cgiGet( edtColAncPrM_Internalname)) ;
         n6569ColAncPrM = false ;
      }
      GXCCtl = "Z6559ColAncL_" + sGXsfl_90_idx ;
      Z6559ColAncL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6566ColAncMn_" + sGXsfl_90_idx ;
      Z6566ColAncMn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6567ColAncMx_" + sGXsfl_90_idx ;
      Z6567ColAncMx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6568ColAncPrK_" + sGXsfl_90_idx ;
      Z6568ColAncPrK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6569ColAncPrM_" + sGXsfl_90_idx ;
      Z6569ColAncPrM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1598_" + sGXsfl_90_idx ;
      nRcdDeleted_1598 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1598_" + sGXsfl_90_idx ;
      nRcdExists_1598 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1598_" + sGXsfl_90_idx ;
      nIsMod_1598 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtColAncL_Enabled = edtColAncL_Enabled ;
   }

   public void confirmValues1G70( )
   {
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901598( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901598( ) ;
         httpContext.changePostValue( "Z6559ColAncL_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z6559ColAncL_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6559ColAncL_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z6566ColAncMn_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z6566ColAncMn_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6566ColAncMn_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z6567ColAncMx_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z6567ColAncMx_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6567ColAncMx_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z6568ColAncPrK_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z6568ColAncPrK_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6568ColAncPrK_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z6569ColAncPrM_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z6569ColAncPrM_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6569ColAncPrM_"+sGXsfl_90_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpcolan", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6565ColAncUL", GXutil.ltrim( localUtil.ntoc( Z6565ColAncUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6565ColAncUL", GXutil.ltrim( localUtil.ntoc( O6565ColAncUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
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
      return formatLink("app.tpcolan", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d"})  ;
   }

   public String getPgmname( )
   {
      return "TPCOLan" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED", "") ;
   }

   public void initializeNonKey1G71600( )
   {
      A6565ColAncUL = (short)(0) ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      O6565ColAncUL = A6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
      Z6565ColAncUL = (short)(0) ;
   }

   public void initAll1G71600( )
   {
      initializeNonKey1G71600( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1G71598( )
   {
      A6566ColAncMn = (short)(0) ;
      n6566ColAncMn = false ;
      A6567ColAncMx = (short)(0) ;
      n6567ColAncMx = false ;
      A6568ColAncPrK = DecimalUtil.ZERO ;
      n6568ColAncPrK = false ;
      A6569ColAncPrM = DecimalUtil.ZERO ;
      n6569ColAncPrM = false ;
      Z6566ColAncMn = (short)(0) ;
      Z6567ColAncMx = (short)(0) ;
      Z6568ColAncPrK = DecimalUtil.ZERO ;
      Z6569ColAncPrM = DecimalUtil.ZERO ;
   }

   public void initAll1G71598( )
   {
      A6559ColAncL = (short)(0) ;
      initializeNonKey1G71598( ) ;
   }

   public void standaloneModalInsert1G71598( )
   {
      A6565ColAncUL = i6565ColAncUL ;
      n6565ColAncUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6565ColAncUL), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016322391", true, true);
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
      httpContext.AddJavascriptSource("tpcolan.js", "?202661016322391", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1598( )
   {
      edtColAncL_Enabled = defedtColAncL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColAncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColAncL_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void startgridcontrol90( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1598, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1598_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6559ColAncL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6566ColAncMn, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6567ColAncMx, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncMx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6568ColAncPrK, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6569ColAncPrM, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColAncPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliNom_D_Internalname = "CLINOM_D" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtColAncUL_Internalname = "COLANCUL" ;
      edtavnRcdDeleted_1598_Internalname = "vNRCDDELETED_1598" ;
      edtColAncL_Internalname = "COLANCL" ;
      edtColAncMn_Internalname = "COLANCMN" ;
      edtColAncMx_Internalname = "COLANCMX" ;
      edtColAncPrK_Internalname = "COLANCPRK" ;
      edtColAncPrM_Internalname = "COLANCPRM" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO COLOR-PROCESO-CLIENTED", "") );
      edtColAncPrM_Jsonclick = "" ;
      edtColAncPrK_Jsonclick = "" ;
      edtColAncMx_Jsonclick = "" ;
      edtColAncMn_Jsonclick = "" ;
      edtColAncL_Jsonclick = "" ;
      edtavnRcdDeleted_1598_Jsonclick = "" ;
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
      edtColAncPrM_Enabled = 1 ;
      edtColAncPrK_Enabled = 1 ;
      edtColAncMx_Enabled = 1 ;
      edtColAncMn_Enabled = 1 ;
      edtColAncL_Enabled = 1 ;
      edtavnRcdDeleted_1598_Enabled = 1 ;
      edtColAncUL_Jsonclick = "" ;
      edtColAncUL_Backcolor = (int)(0xFFFFFF) ;
      edtColAncUL_Enabled = 0 ;
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
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx1asaclinom_d1G71600( String A396EmprCod ,
                                      int A7272CliCod_d )
   {
      GXt_char1 = A7273CliNom_D ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( A396EmprCod, A7272CliCod_d, GXv_char4) ;
      tpcolan_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void gx2asaprodsc_c1G71600( String A396EmprCod ,
                                      String A7270Procod_c )
   {
      GXt_char1 = A7271ProDsc_c ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7270Procod_c, GXv_char4) ;
      tpcolan_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void xc_8_1G71598( )
   {
      if ( true /* After */ && true /* Level */ )
      {
         httpContext.wjLoc = formatLink("app.tpcolac", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A7270Procod_c)),GXutil.URLEncode(GXutil.ltrimstr(A7272CliCod_d,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A6559ColAncL,4,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Procod_c","CliCod_d","ColAncL"})  ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_901598( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1G71598( ) ;
         standaloneModal1G71598( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1G71598( ) ;
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901598( ) ;
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
      /* Using cursor T01G726 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01G726_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(24);
      /* Using cursor T01G727 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01G727_A832TipColDsc[0] ;
      n832TipColDsc = T01G727_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(25);
      /* Using cursor T01G728 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T01G728_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T01G728_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
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

   public void valid_Clicod_d( )
   {
      n6565ColAncUL = false ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A6565ColAncUL", GXutil.ltrim( localUtil.ntoc( A6565ColAncUL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7270Procod_c", GXutil.rtrim( Z7270Procod_c));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7272CliCod_d", GXutil.ltrim( localUtil.ntoc( Z7272CliCod_d, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7271ProDsc_c", GXutil.rtrim( Z7271ProDsc_c));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7273CliNom_D", GXutil.rtrim( Z7273CliNom_D));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6565ColAncUL", GXutil.ltrim( localUtil.ntoc( Z6565ColAncUL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6565ColAncUL", GXutil.ltrim( localUtil.ntoc( O6565ColAncUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'INCREMENTOS P/MTS'","{handler:'e121G72',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'},{av:'A6559ColAncL',fld:'COLANCL',pic:'ZZZ9'}]");
      setEventMetadata("'INCREMENTOS P/MTS'",",oparms:[{av:'A6559ColAncL',fld:'COLANCL',pic:'ZZZ9'},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
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
      setEventMetadata("VALID_CLICOD_D","{handler:'valid_Clicod_d',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A6565ColAncUL',fld:'COLANCUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A7270Procod_c',fld:'PROCOD_C',pic:''},{av:'A7272CliCod_d',fld:'CLICOD_D',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD_D",",oparms:[{av:'A7271ProDsc_c',fld:'PRODSC_C',pic:''},{av:'A7273CliNom_D',fld:'CLINOM_D',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A6565ColAncUL',fld:'COLANCUL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z7270Procod_c'},{av:'Z7272CliCod_d'},{av:'Z7271ProDsc_c'},{av:'Z7273CliNom_D'},{av:'Z5742ForSerDsc'},{av:'Z279CliNom'},{av:'Z832TipColDsc'},{av:'Z6565ColAncUL'},{av:'O6565ColAncUL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COLANCUL","{handler:'valid_Colancul',iparms:[]");
      setEventMetadata("VALID_COLANCUL",",oparms:[]}");
      setEventMetadata("VALID_COLANCL","{handler:'valid_Colancl',iparms:[]");
      setEventMetadata("VALID_COLANCL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Colancprm',iparms:[]");
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
      Z6568ColAncPrK = DecimalUtil.ZERO ;
      Z6569ColAncPrM = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A7273CliNom_D = "" ;
      lblTextblock11_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock13_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1598 = "" ;
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
      sMode1600 = "" ;
      GXCCtl = "" ;
      A6568ColAncPrK = DecimalUtil.ZERO ;
      A6569ColAncPrM = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV14Lit2 = "" ;
      AV18Lit6 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      Z5742ForSerDsc = "" ;
      T01G76_A279CliNom = new String[] {""} ;
      T01G77_A832TipColDsc = new String[] {""} ;
      T01G77_n832TipColDsc = new boolean[] {false} ;
      T01G78_A5742ForSerDsc = new String[] {""} ;
      T01G78_n5742ForSerDsc = new boolean[] {false} ;
      T01G79_A7270Procod_c = new String[] {""} ;
      T01G79_A7272CliCod_d = new int[1] ;
      T01G79_A5742ForSerDsc = new String[] {""} ;
      T01G79_n5742ForSerDsc = new boolean[] {false} ;
      T01G79_A279CliNom = new String[] {""} ;
      T01G79_A832TipColDsc = new String[] {""} ;
      T01G79_n832TipColDsc = new boolean[] {false} ;
      T01G79_A6565ColAncUL = new short[1] ;
      T01G79_n6565ColAncUL = new boolean[] {false} ;
      T01G79_A396EmprCod = new String[] {""} ;
      T01G79_A252CliCod = new int[1] ;
      T01G79_A831TipColCod = new byte[1] ;
      T01G79_A494ForSer = new String[] {""} ;
      T01G79_A482ForColNom = new String[] {""} ;
      T01G79_A483ForColNum = new int[1] ;
      T01G710_A396EmprCod = new String[] {""} ;
      T01G710_A252CliCod = new int[1] ;
      T01G710_A494ForSer = new String[] {""} ;
      T01G710_A482ForColNom = new String[] {""} ;
      T01G710_A483ForColNum = new int[1] ;
      T01G710_A831TipColCod = new byte[1] ;
      T01G710_A7270Procod_c = new String[] {""} ;
      T01G710_A7272CliCod_d = new int[1] ;
      T01G75_A7270Procod_c = new String[] {""} ;
      T01G75_A7272CliCod_d = new int[1] ;
      T01G75_A6565ColAncUL = new short[1] ;
      T01G75_n6565ColAncUL = new boolean[] {false} ;
      T01G75_A396EmprCod = new String[] {""} ;
      T01G75_A252CliCod = new int[1] ;
      T01G75_A831TipColCod = new byte[1] ;
      T01G75_A494ForSer = new String[] {""} ;
      T01G75_A482ForColNom = new String[] {""} ;
      T01G75_A483ForColNum = new int[1] ;
      T01G711_A396EmprCod = new String[] {""} ;
      T01G711_A252CliCod = new int[1] ;
      T01G711_A494ForSer = new String[] {""} ;
      T01G711_A482ForColNom = new String[] {""} ;
      T01G711_A483ForColNum = new int[1] ;
      T01G711_A831TipColCod = new byte[1] ;
      T01G711_A7270Procod_c = new String[] {""} ;
      T01G711_A7272CliCod_d = new int[1] ;
      T01G712_A396EmprCod = new String[] {""} ;
      T01G712_A252CliCod = new int[1] ;
      T01G712_A494ForSer = new String[] {""} ;
      T01G712_A482ForColNom = new String[] {""} ;
      T01G712_A483ForColNum = new int[1] ;
      T01G712_A831TipColCod = new byte[1] ;
      T01G712_A7270Procod_c = new String[] {""} ;
      T01G712_A7272CliCod_d = new int[1] ;
      T01G74_A7270Procod_c = new String[] {""} ;
      T01G74_A7272CliCod_d = new int[1] ;
      T01G74_A6565ColAncUL = new short[1] ;
      T01G74_n6565ColAncUL = new boolean[] {false} ;
      T01G74_A396EmprCod = new String[] {""} ;
      T01G74_A252CliCod = new int[1] ;
      T01G74_A831TipColCod = new byte[1] ;
      T01G74_A494ForSer = new String[] {""} ;
      T01G74_A482ForColNom = new String[] {""} ;
      T01G74_A483ForColNum = new int[1] ;
      T01G716_A396EmprCod = new String[] {""} ;
      T01G716_A252CliCod = new int[1] ;
      T01G716_A494ForSer = new String[] {""} ;
      T01G716_A482ForColNom = new String[] {""} ;
      T01G716_A483ForColNum = new int[1] ;
      T01G716_A831TipColCod = new byte[1] ;
      T01G716_A7270Procod_c = new String[] {""} ;
      T01G716_A7272CliCod_d = new int[1] ;
      T01G716_A6559ColAncL = new short[1] ;
      T01G716_A6561ColAncLI = new short[1] ;
      T01G718_A396EmprCod = new String[] {""} ;
      T01G718_A252CliCod = new int[1] ;
      T01G718_A494ForSer = new String[] {""} ;
      T01G718_A482ForColNom = new String[] {""} ;
      T01G718_A483ForColNum = new int[1] ;
      T01G718_A831TipColCod = new byte[1] ;
      T01G718_A7270Procod_c = new String[] {""} ;
      T01G718_A7272CliCod_d = new int[1] ;
      T01G719_A494ForSer = new String[] {""} ;
      T01G719_A482ForColNom = new String[] {""} ;
      T01G719_A483ForColNum = new int[1] ;
      T01G719_A831TipColCod = new byte[1] ;
      T01G719_A7270Procod_c = new String[] {""} ;
      T01G719_A7272CliCod_d = new int[1] ;
      T01G719_A6559ColAncL = new short[1] ;
      T01G719_A6566ColAncMn = new short[1] ;
      T01G719_n6566ColAncMn = new boolean[] {false} ;
      T01G719_A6567ColAncMx = new short[1] ;
      T01G719_n6567ColAncMx = new boolean[] {false} ;
      T01G719_A6568ColAncPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G719_n6568ColAncPrK = new boolean[] {false} ;
      T01G719_A6569ColAncPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G719_n6569ColAncPrM = new boolean[] {false} ;
      T01G719_A396EmprCod = new String[] {""} ;
      T01G719_A252CliCod = new int[1] ;
      T01G720_A396EmprCod = new String[] {""} ;
      T01G720_A252CliCod = new int[1] ;
      T01G720_A494ForSer = new String[] {""} ;
      T01G720_A482ForColNom = new String[] {""} ;
      T01G720_A483ForColNum = new int[1] ;
      T01G720_A831TipColCod = new byte[1] ;
      T01G720_A7270Procod_c = new String[] {""} ;
      T01G720_A7272CliCod_d = new int[1] ;
      T01G720_A6559ColAncL = new short[1] ;
      T01G73_A494ForSer = new String[] {""} ;
      T01G73_A482ForColNom = new String[] {""} ;
      T01G73_A483ForColNum = new int[1] ;
      T01G73_A831TipColCod = new byte[1] ;
      T01G73_A7270Procod_c = new String[] {""} ;
      T01G73_A7272CliCod_d = new int[1] ;
      T01G73_A6559ColAncL = new short[1] ;
      T01G73_A6566ColAncMn = new short[1] ;
      T01G73_n6566ColAncMn = new boolean[] {false} ;
      T01G73_A6567ColAncMx = new short[1] ;
      T01G73_n6567ColAncMx = new boolean[] {false} ;
      T01G73_A6568ColAncPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G73_n6568ColAncPrK = new boolean[] {false} ;
      T01G73_A6569ColAncPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G73_n6569ColAncPrM = new boolean[] {false} ;
      T01G73_A396EmprCod = new String[] {""} ;
      T01G73_A252CliCod = new int[1] ;
      T01G72_A494ForSer = new String[] {""} ;
      T01G72_A482ForColNom = new String[] {""} ;
      T01G72_A483ForColNum = new int[1] ;
      T01G72_A831TipColCod = new byte[1] ;
      T01G72_A7270Procod_c = new String[] {""} ;
      T01G72_A7272CliCod_d = new int[1] ;
      T01G72_A6559ColAncL = new short[1] ;
      T01G72_A6566ColAncMn = new short[1] ;
      T01G72_n6566ColAncMn = new boolean[] {false} ;
      T01G72_A6567ColAncMx = new short[1] ;
      T01G72_n6567ColAncMx = new boolean[] {false} ;
      T01G72_A6568ColAncPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G72_n6568ColAncPrK = new boolean[] {false} ;
      T01G72_A6569ColAncPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01G72_n6569ColAncPrM = new boolean[] {false} ;
      T01G72_A396EmprCod = new String[] {""} ;
      T01G72_A252CliCod = new int[1] ;
      T01G724_A396EmprCod = new String[] {""} ;
      T01G724_A252CliCod = new int[1] ;
      T01G724_A494ForSer = new String[] {""} ;
      T01G724_A482ForColNom = new String[] {""} ;
      T01G724_A483ForColNum = new int[1] ;
      T01G724_A831TipColCod = new byte[1] ;
      T01G724_A7270Procod_c = new String[] {""} ;
      T01G724_A7272CliCod_d = new int[1] ;
      T01G724_A6559ColAncL = new short[1] ;
      T01G724_A6561ColAncLI = new short[1] ;
      T01G725_A396EmprCod = new String[] {""} ;
      T01G725_A252CliCod = new int[1] ;
      T01G725_A494ForSer = new String[] {""} ;
      T01G725_A482ForColNom = new String[] {""} ;
      T01G725_A483ForColNum = new int[1] ;
      T01G725_A831TipColCod = new byte[1] ;
      T01G725_A7270Procod_c = new String[] {""} ;
      T01G725_A7272CliCod_d = new int[1] ;
      T01G725_A6559ColAncL = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T01G726_A279CliNom = new String[] {""} ;
      T01G727_A832TipColDsc = new String[] {""} ;
      T01G727_n832TipColDsc = new boolean[] {false} ;
      T01G728_A5742ForSerDsc = new String[] {""} ;
      T01G728_n5742ForSerDsc = new boolean[] {false} ;
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
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpcolan__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpcolan__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpcolan__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpcolan__default(),
         new Object[] {
             new Object[] {
            T01G72_A494ForSer, T01G72_A482ForColNom, T01G72_A483ForColNum, T01G72_A831TipColCod, T01G72_A7270Procod_c, T01G72_A7272CliCod_d, T01G72_A6559ColAncL, T01G72_A6566ColAncMn, T01G72_n6566ColAncMn, T01G72_A6567ColAncMx,
            T01G72_n6567ColAncMx, T01G72_A6568ColAncPrK, T01G72_n6568ColAncPrK, T01G72_A6569ColAncPrM, T01G72_n6569ColAncPrM, T01G72_A396EmprCod, T01G72_A252CliCod
            }
            , new Object[] {
            T01G73_A494ForSer, T01G73_A482ForColNom, T01G73_A483ForColNum, T01G73_A831TipColCod, T01G73_A7270Procod_c, T01G73_A7272CliCod_d, T01G73_A6559ColAncL, T01G73_A6566ColAncMn, T01G73_n6566ColAncMn, T01G73_A6567ColAncMx,
            T01G73_n6567ColAncMx, T01G73_A6568ColAncPrK, T01G73_n6568ColAncPrK, T01G73_A6569ColAncPrM, T01G73_n6569ColAncPrM, T01G73_A396EmprCod, T01G73_A252CliCod
            }
            , new Object[] {
            T01G74_A7270Procod_c, T01G74_A7272CliCod_d, T01G74_A6565ColAncUL, T01G74_n6565ColAncUL, T01G74_A396EmprCod, T01G74_A252CliCod, T01G74_A831TipColCod, T01G74_A494ForSer, T01G74_A482ForColNom, T01G74_A483ForColNum
            }
            , new Object[] {
            T01G75_A7270Procod_c, T01G75_A7272CliCod_d, T01G75_A6565ColAncUL, T01G75_n6565ColAncUL, T01G75_A396EmprCod, T01G75_A252CliCod, T01G75_A831TipColCod, T01G75_A494ForSer, T01G75_A482ForColNom, T01G75_A483ForColNum
            }
            , new Object[] {
            T01G76_A279CliNom
            }
            , new Object[] {
            T01G77_A832TipColDsc, T01G77_n832TipColDsc
            }
            , new Object[] {
            T01G78_A5742ForSerDsc, T01G78_n5742ForSerDsc
            }
            , new Object[] {
            T01G79_A7270Procod_c, T01G79_A7272CliCod_d, T01G79_A5742ForSerDsc, T01G79_n5742ForSerDsc, T01G79_A279CliNom, T01G79_A832TipColDsc, T01G79_n832TipColDsc, T01G79_A6565ColAncUL, T01G79_n6565ColAncUL, T01G79_A396EmprCod,
            T01G79_A252CliCod, T01G79_A831TipColCod, T01G79_A494ForSer, T01G79_A482ForColNom, T01G79_A483ForColNum
            }
            , new Object[] {
            T01G710_A396EmprCod, T01G710_A252CliCod, T01G710_A494ForSer, T01G710_A482ForColNom, T01G710_A483ForColNum, T01G710_A831TipColCod, T01G710_A7270Procod_c, T01G710_A7272CliCod_d
            }
            , new Object[] {
            T01G711_A396EmprCod, T01G711_A252CliCod, T01G711_A494ForSer, T01G711_A482ForColNom, T01G711_A483ForColNum, T01G711_A831TipColCod, T01G711_A7270Procod_c, T01G711_A7272CliCod_d
            }
            , new Object[] {
            T01G712_A396EmprCod, T01G712_A252CliCod, T01G712_A494ForSer, T01G712_A482ForColNom, T01G712_A483ForColNum, T01G712_A831TipColCod, T01G712_A7270Procod_c, T01G712_A7272CliCod_d
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G716_A396EmprCod, T01G716_A252CliCod, T01G716_A494ForSer, T01G716_A482ForColNom, T01G716_A483ForColNum, T01G716_A831TipColCod, T01G716_A7270Procod_c, T01G716_A7272CliCod_d, T01G716_A6559ColAncL, T01G716_A6561ColAncLI
            }
            , new Object[] {
            }
            , new Object[] {
            T01G718_A396EmprCod, T01G718_A252CliCod, T01G718_A494ForSer, T01G718_A482ForColNom, T01G718_A483ForColNum, T01G718_A831TipColCod, T01G718_A7270Procod_c, T01G718_A7272CliCod_d
            }
            , new Object[] {
            T01G719_A494ForSer, T01G719_A482ForColNom, T01G719_A483ForColNum, T01G719_A831TipColCod, T01G719_A7270Procod_c, T01G719_A7272CliCod_d, T01G719_A6559ColAncL, T01G719_A6566ColAncMn, T01G719_n6566ColAncMn, T01G719_A6567ColAncMx,
            T01G719_n6567ColAncMx, T01G719_A6568ColAncPrK, T01G719_n6568ColAncPrK, T01G719_A6569ColAncPrM, T01G719_n6569ColAncPrM, T01G719_A396EmprCod, T01G719_A252CliCod
            }
            , new Object[] {
            T01G720_A396EmprCod, T01G720_A252CliCod, T01G720_A494ForSer, T01G720_A482ForColNom, T01G720_A483ForColNum, T01G720_A831TipColCod, T01G720_A7270Procod_c, T01G720_A7272CliCod_d, T01G720_A6559ColAncL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G724_A396EmprCod, T01G724_A252CliCod, T01G724_A494ForSer, T01G724_A482ForColNom, T01G724_A483ForColNum, T01G724_A831TipColCod, T01G724_A7270Procod_c, T01G724_A7272CliCod_d, T01G724_A6559ColAncL, T01G724_A6561ColAncLI
            }
            , new Object[] {
            T01G725_A396EmprCod, T01G725_A252CliCod, T01G725_A494ForSer, T01G725_A482ForColNom, T01G725_A483ForColNum, T01G725_A831TipColCod, T01G725_A7270Procod_c, T01G725_A7272CliCod_d, T01G725_A6559ColAncL
            }
            , new Object[] {
            T01G726_A279CliNom
            }
            , new Object[] {
            T01G727_A832TipColDsc, T01G727_n832TipColDsc
            }
            , new Object[] {
            T01G728_A5742ForSerDsc, T01G728_n5742ForSerDsc
            }
         }
      );
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
      AV33Pgmname = "TPCOLan" ;
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
   private short Z6565ColAncUL ;
   private short O6565ColAncUL ;
   private short Z6559ColAncL ;
   private short Z6566ColAncMn ;
   private short Z6567ColAncMx ;
   private short nRcdDeleted_1598 ;
   private short nRcdExists_1598 ;
   private short nIsMod_1598 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6565ColAncUL ;
   private short nBlankRcdCount1598 ;
   private short RcdFound1598 ;
   private short B6565ColAncUL ;
   private short nBlankRcdUsr1598 ;
   private short s6565ColAncUL ;
   private short A6559ColAncL ;
   private short A6566ColAncMn ;
   private short A6567ColAncMx ;
   private short RcdFound1600 ;
   private short nIsDirty_1600 ;
   private short nIsDirty_1598 ;
   private short i6565ColAncUL ;
   private short ZZ6565ColAncUL ;
   private short ZO6565ColAncUL ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int wcpOA7272CliCod_d ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z7272CliCod_d ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_D_Enabled ;
   private int edtForSerDsc_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtColAncUL_Enabled ;
   private int edtavnRcdDeleted_1598_Enabled ;
   private int edtColAncL_Enabled ;
   private int edtColAncMn_Enabled ;
   private int edtColAncMx_Enabled ;
   private int edtColAncPrK_Enabled ;
   private int edtColAncPrM_Enabled ;
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
   private int defedtColAncL_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtColAncUL_Backcolor ;
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
   private java.math.BigDecimal Z6568ColAncPrK ;
   private java.math.BigDecimal Z6569ColAncPrM ;
   private java.math.BigDecimal A6568ColAncPrK ;
   private java.math.BigDecimal A6569ColAncPrM ;
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
   private String sGXsfl_90_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
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
   private String edtColAncUL_Internalname ;
   private String edtColAncUL_Jsonclick ;
   private String sMode1598 ;
   private String edtavnRcdDeleted_1598_Internalname ;
   private String edtColAncL_Internalname ;
   private String edtColAncMn_Internalname ;
   private String edtColAncMx_Internalname ;
   private String edtColAncPrK_Internalname ;
   private String edtColAncPrM_Internalname ;
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
   private String sMode1600 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV14Lit2 ;
   private String AV18Lit6 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String Z5742ForSerDsc ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1598_Jsonclick ;
   private String edtColAncL_Jsonclick ;
   private String edtColAncMn_Jsonclick ;
   private String edtColAncMx_Jsonclick ;
   private String edtColAncPrK_Jsonclick ;
   private String edtColAncPrM_Jsonclick ;
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
   private boolean n6565ColAncUL ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean returnInSub ;
   private boolean n6566ColAncMn ;
   private boolean n6567ColAncMx ;
   private boolean n6568ColAncPrK ;
   private boolean n6569ColAncPrM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01G76_A279CliNom ;
   private String[] T01G77_A832TipColDsc ;
   private boolean[] T01G77_n832TipColDsc ;
   private String[] T01G78_A5742ForSerDsc ;
   private boolean[] T01G78_n5742ForSerDsc ;
   private String[] T01G79_A7270Procod_c ;
   private int[] T01G79_A7272CliCod_d ;
   private String[] T01G79_A5742ForSerDsc ;
   private boolean[] T01G79_n5742ForSerDsc ;
   private String[] T01G79_A279CliNom ;
   private String[] T01G79_A832TipColDsc ;
   private boolean[] T01G79_n832TipColDsc ;
   private short[] T01G79_A6565ColAncUL ;
   private boolean[] T01G79_n6565ColAncUL ;
   private String[] T01G79_A396EmprCod ;
   private int[] T01G79_A252CliCod ;
   private byte[] T01G79_A831TipColCod ;
   private String[] T01G79_A494ForSer ;
   private String[] T01G79_A482ForColNom ;
   private int[] T01G79_A483ForColNum ;
   private String[] T01G710_A396EmprCod ;
   private int[] T01G710_A252CliCod ;
   private String[] T01G710_A494ForSer ;
   private String[] T01G710_A482ForColNom ;
   private int[] T01G710_A483ForColNum ;
   private byte[] T01G710_A831TipColCod ;
   private String[] T01G710_A7270Procod_c ;
   private int[] T01G710_A7272CliCod_d ;
   private String[] T01G75_A7270Procod_c ;
   private int[] T01G75_A7272CliCod_d ;
   private short[] T01G75_A6565ColAncUL ;
   private boolean[] T01G75_n6565ColAncUL ;
   private String[] T01G75_A396EmprCod ;
   private int[] T01G75_A252CliCod ;
   private byte[] T01G75_A831TipColCod ;
   private String[] T01G75_A494ForSer ;
   private String[] T01G75_A482ForColNom ;
   private int[] T01G75_A483ForColNum ;
   private String[] T01G711_A396EmprCod ;
   private int[] T01G711_A252CliCod ;
   private String[] T01G711_A494ForSer ;
   private String[] T01G711_A482ForColNom ;
   private int[] T01G711_A483ForColNum ;
   private byte[] T01G711_A831TipColCod ;
   private String[] T01G711_A7270Procod_c ;
   private int[] T01G711_A7272CliCod_d ;
   private String[] T01G712_A396EmprCod ;
   private int[] T01G712_A252CliCod ;
   private String[] T01G712_A494ForSer ;
   private String[] T01G712_A482ForColNom ;
   private int[] T01G712_A483ForColNum ;
   private byte[] T01G712_A831TipColCod ;
   private String[] T01G712_A7270Procod_c ;
   private int[] T01G712_A7272CliCod_d ;
   private String[] T01G74_A7270Procod_c ;
   private int[] T01G74_A7272CliCod_d ;
   private short[] T01G74_A6565ColAncUL ;
   private boolean[] T01G74_n6565ColAncUL ;
   private String[] T01G74_A396EmprCod ;
   private int[] T01G74_A252CliCod ;
   private byte[] T01G74_A831TipColCod ;
   private String[] T01G74_A494ForSer ;
   private String[] T01G74_A482ForColNom ;
   private int[] T01G74_A483ForColNum ;
   private String[] T01G716_A396EmprCod ;
   private int[] T01G716_A252CliCod ;
   private String[] T01G716_A494ForSer ;
   private String[] T01G716_A482ForColNom ;
   private int[] T01G716_A483ForColNum ;
   private byte[] T01G716_A831TipColCod ;
   private String[] T01G716_A7270Procod_c ;
   private int[] T01G716_A7272CliCod_d ;
   private short[] T01G716_A6559ColAncL ;
   private short[] T01G716_A6561ColAncLI ;
   private String[] T01G718_A396EmprCod ;
   private int[] T01G718_A252CliCod ;
   private String[] T01G718_A494ForSer ;
   private String[] T01G718_A482ForColNom ;
   private int[] T01G718_A483ForColNum ;
   private byte[] T01G718_A831TipColCod ;
   private String[] T01G718_A7270Procod_c ;
   private int[] T01G718_A7272CliCod_d ;
   private String[] T01G719_A494ForSer ;
   private String[] T01G719_A482ForColNom ;
   private int[] T01G719_A483ForColNum ;
   private byte[] T01G719_A831TipColCod ;
   private String[] T01G719_A7270Procod_c ;
   private int[] T01G719_A7272CliCod_d ;
   private short[] T01G719_A6559ColAncL ;
   private short[] T01G719_A6566ColAncMn ;
   private boolean[] T01G719_n6566ColAncMn ;
   private short[] T01G719_A6567ColAncMx ;
   private boolean[] T01G719_n6567ColAncMx ;
   private java.math.BigDecimal[] T01G719_A6568ColAncPrK ;
   private boolean[] T01G719_n6568ColAncPrK ;
   private java.math.BigDecimal[] T01G719_A6569ColAncPrM ;
   private boolean[] T01G719_n6569ColAncPrM ;
   private String[] T01G719_A396EmprCod ;
   private int[] T01G719_A252CliCod ;
   private String[] T01G720_A396EmprCod ;
   private int[] T01G720_A252CliCod ;
   private String[] T01G720_A494ForSer ;
   private String[] T01G720_A482ForColNom ;
   private int[] T01G720_A483ForColNum ;
   private byte[] T01G720_A831TipColCod ;
   private String[] T01G720_A7270Procod_c ;
   private int[] T01G720_A7272CliCod_d ;
   private short[] T01G720_A6559ColAncL ;
   private String[] T01G73_A494ForSer ;
   private String[] T01G73_A482ForColNom ;
   private int[] T01G73_A483ForColNum ;
   private byte[] T01G73_A831TipColCod ;
   private String[] T01G73_A7270Procod_c ;
   private int[] T01G73_A7272CliCod_d ;
   private short[] T01G73_A6559ColAncL ;
   private short[] T01G73_A6566ColAncMn ;
   private boolean[] T01G73_n6566ColAncMn ;
   private short[] T01G73_A6567ColAncMx ;
   private boolean[] T01G73_n6567ColAncMx ;
   private java.math.BigDecimal[] T01G73_A6568ColAncPrK ;
   private boolean[] T01G73_n6568ColAncPrK ;
   private java.math.BigDecimal[] T01G73_A6569ColAncPrM ;
   private boolean[] T01G73_n6569ColAncPrM ;
   private String[] T01G73_A396EmprCod ;
   private int[] T01G73_A252CliCod ;
   private String[] T01G72_A494ForSer ;
   private String[] T01G72_A482ForColNom ;
   private int[] T01G72_A483ForColNum ;
   private byte[] T01G72_A831TipColCod ;
   private String[] T01G72_A7270Procod_c ;
   private int[] T01G72_A7272CliCod_d ;
   private short[] T01G72_A6559ColAncL ;
   private short[] T01G72_A6566ColAncMn ;
   private boolean[] T01G72_n6566ColAncMn ;
   private short[] T01G72_A6567ColAncMx ;
   private boolean[] T01G72_n6567ColAncMx ;
   private java.math.BigDecimal[] T01G72_A6568ColAncPrK ;
   private boolean[] T01G72_n6568ColAncPrK ;
   private java.math.BigDecimal[] T01G72_A6569ColAncPrM ;
   private boolean[] T01G72_n6569ColAncPrM ;
   private String[] T01G72_A396EmprCod ;
   private int[] T01G72_A252CliCod ;
   private String[] T01G724_A396EmprCod ;
   private int[] T01G724_A252CliCod ;
   private String[] T01G724_A494ForSer ;
   private String[] T01G724_A482ForColNom ;
   private int[] T01G724_A483ForColNum ;
   private byte[] T01G724_A831TipColCod ;
   private String[] T01G724_A7270Procod_c ;
   private int[] T01G724_A7272CliCod_d ;
   private short[] T01G724_A6559ColAncL ;
   private short[] T01G724_A6561ColAncLI ;
   private String[] T01G725_A396EmprCod ;
   private int[] T01G725_A252CliCod ;
   private String[] T01G725_A494ForSer ;
   private String[] T01G725_A482ForColNom ;
   private int[] T01G725_A483ForColNum ;
   private byte[] T01G725_A831TipColCod ;
   private String[] T01G725_A7270Procod_c ;
   private int[] T01G725_A7272CliCod_d ;
   private short[] T01G725_A6559ColAncL ;
   private String[] T01G726_A279CliNom ;
   private String[] T01G727_A832TipColDsc ;
   private boolean[] T01G727_n832TipColDsc ;
   private String[] T01G728_A5742ForSerDsc ;
   private boolean[] T01G728_n5742ForSerDsc ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpcolan__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolan__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolan__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcolan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G72", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncMn, ColAncMx, ColAncPrK, ColAncPrM, EmprCod, CliCod FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?  FOR UPDATE OF ColAncMn, ColAncMx, ColAncPrK, ColAncPrM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G73", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncMn, ColAncMx, ColAncPrK, ColAncPrM, EmprCod, CliCod FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G74", "SELECT Procod_c, CliCod_d, ColAncUL, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ?  FOR UPDATE OF ColAncUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G75", "SELECT Procod_c, CliCod_d, ColAncUL, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G76", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G77", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G78", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G79", "SELECT /*+ FIRST_ROWS(1) */ TM1.Procod_c, TM1.CliCod_d, T4.ForSerDsc, T2.CliNom, T3.TipColDsc, TM1.ColAncUL, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum FROM (((TXPPCOPCD TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipColCod = TM1.TipColCod) INNER JOIN TXPCFORMU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ForSer = TM1.ForSer AND T4.ForColNom = TM1.ForColNom AND T4.ForColNum = TM1.ForColNum AND T4.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.Procod_c = ? and TM1.CliCod_d = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.Procod_c, TM1.CliCod_d ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G710", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G711", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, Procod_c DESC, CliCod_d DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G713", "INSERT INTO TXPPCOPCD(Procod_c, CliCod_d, ColAncUL, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPCOPCD")
         ,new UpdateCursor("T01G714", "UPDATE TXPPCOPCD SET ColAncUL=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ?", GX_NOMASK, "TXPPCOPCD")
         ,new UpdateCursor("T01G715", "DELETE FROM TXPPCOPCD  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ?", GX_NOMASK, "TXPPCOPCD")
         ,new ForEachCursor("T01G716", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI FROM TXPPCOLa3 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G717", "UPDATE TXPPCOPCD SET ColAncUL=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ?", GX_NOMASK, "TXPPCOPCD")
         ,new ForEachCursor("T01G718", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G719", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncMn, ColAncMx, ColAncPrK, ColAncPrM, EmprCod, CliCod FROM TXPPCOLac WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? and ColAncL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G720", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01G721", "INSERT INTO TXPPCOLac(ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncMn, ColAncMx, ColAncPrK, ColAncPrM, EmprCod, CliCod, ColAncUlI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPPCOLac")
         ,new UpdateCursor("T01G722", "UPDATE TXPPCOLac SET ColAncMn=?, ColAncMx=?, ColAncPrK=?, ColAncPrM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?", GX_NOMASK, "TXPPCOLac")
         ,new UpdateCursor("T01G723", "DELETE FROM TXPPCOLac  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?", GX_NOMASK, "TXPPCOLac")
         ,new ForEachCursor("T01G724", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL, ColAncLI FROM TXPPCOLa3 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Procod_c = ? AND CliCod_d = ? AND ColAncL = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G725", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL FROM TXPPCOLac WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and Procod_c = ? and CliCod_d = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d, ColAncL ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G726", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G727", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G728", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
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
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               return;
            case 14 :
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
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
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
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 13);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               return;
            case 12 :
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
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
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
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 5);
               }
               stmt.setString(12, (String)parms[15], 3);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setShort(13, ((Number) parms[16]).shortValue());
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

